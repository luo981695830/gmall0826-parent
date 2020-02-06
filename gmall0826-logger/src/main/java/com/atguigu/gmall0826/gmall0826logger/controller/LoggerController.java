package com.atguigu.gmall0826.gmall0826logger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassNameLoggerController
 * @Author Jayce· Luo
 * @Date2020/2/6 14:59
 */
@RestController  //等于 Controller + ResponseBody 将函数的返回值看作是响应体的内容
public class LoggerController {
    //@RequestMapping(value="log",method=RequestMethod.POST)
    @PostMapping("log")
    public String doLog(@RequestParam("logString") String logString){
        System.out.println(logString);
        return "success";
    }
}
