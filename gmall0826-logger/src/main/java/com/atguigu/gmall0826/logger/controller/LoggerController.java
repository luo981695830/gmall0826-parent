package com.atguigu.gmall0826.logger.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassNameLoggerController
 * @Author Jayce· Luo
 * @Date2020/2/6 14:59
 */

@Slf4j
@RestController  //等于 Controller + ResponseBody 将函数的返回值看作是响应体的内容
public class LoggerController {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    //@RequestMapping(value="log",method=RequestMethod.POST)
    @PostMapping("log")
    public String doLog(@RequestParam("logString") String logString){
        //加时间戳
        JSONObject jsonObject = JSON.parseObject(logString);
        jsonObject.put("ts",System.currentTimeMillis());

        //本地落盘 日志文件
        String jsonString = jsonObject.toJSONString();
        log.info(jsonObject.toJSONString());

        //发送kafka
        if("startup".equals(jsonObject.getString("type"))){
//            kafkaTemplate.send(GmallConstants)
        }

        System.out.println(logString);
        return "success";
    }
}
