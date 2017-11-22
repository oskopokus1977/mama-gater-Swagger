package com.controller;

import com.model.WebAppEntity;
import com.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class WebController {
    @Autowired
    WebService webService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "index";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<WebAppEntity> getAllEntities() {
        return webService.getAllEntities();
    }
}
