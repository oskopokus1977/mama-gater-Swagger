package com.controller;

import com.model.WebAppEntity;
import com.service.WebService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/test")
@Api(value = "Web Controller Resource")
public class WebController {
    @Autowired
    WebService webService;

    @ApiOperation(value = "Returns Hello")
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "100 is the message"),
            @ApiResponse(code = 200, message = "Successful Hello")})
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/get")
    public   String getHello() {
        return "index";
    }

    @ApiOperation(value = "Return list of users")
    @ApiResponses(value = {
            @ApiResponse(code = 100, message = "100 is the message"),
            @ApiResponse(code = 200, message = "Successful userList")})
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @GetMapping("/get")
    public @ResponseBody
    List<WebAppEntity> getAllEntities() {
        return webService.getAllEntities();
    }
}
