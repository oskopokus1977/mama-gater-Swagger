package com.service;

import com.dao.WebDAO;
import com.model.WebAppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
@RequestMapping("/service")
@Api(value = "Web Service Resource")
public class WebServiceImpl implements WebService {
    @Autowired
    WebDAO webDAO;

    @ApiOperation(value = "Return list of users")
    @GetMapping
    public @ResponseBody
    List<WebAppEntity> getAllEntities() {
        return webDAO.getAllEntities();
    }
}
