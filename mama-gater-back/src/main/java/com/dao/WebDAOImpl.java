package com.dao;

import com.model.WebAppEntity;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class WebDAOImpl implements WebDAO {
    private List<WebAppEntity> entities = Arrays.asList(
            new WebAppEntity(1, "name1"),
            new WebAppEntity(2, "name2"),
            new WebAppEntity(3, "name3"));


    public List<WebAppEntity> getAllEntities() {
        return entities;
    }
}
