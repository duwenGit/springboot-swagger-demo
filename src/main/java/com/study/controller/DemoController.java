package com.study.controller;

import com.study.entity.Demo;
import com.study.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created on 2019/10/9.
 */
@Controller
@RequestMapping("/springbootDemo")
@Api(value = "springboot demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ResponseBody
    @RequestMapping(value ="/getDemo", method= RequestMethod.GET)
    @ApiOperation(value="测试springboot", notes="测试springboot")
    public List<Demo> getDemo(){
        List<Demo> demos = demoService.getDemo();
        return demos;
    }
}
