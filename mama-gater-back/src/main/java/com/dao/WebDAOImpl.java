package com.dao;

import com.model.WebAppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Repository
@RequestMapping("/repository")
@Api("Web Repository Resource")
public class WebDAOImpl implements WebDAO {


    private List<WebAppEntity> entities = Arrays.asList(
            new WebAppEntity(1, "name1"),
            new WebAppEntity(2, "name2"),
            new WebAppEntity(3, "name3"));

    @GetMapping()
    @ApiOperation(value = "Return list of users",notes = "Return list of users from Repository")
    public @ResponseBody
    List<WebAppEntity> getAllEntities() {
        return entities;
    }
}
