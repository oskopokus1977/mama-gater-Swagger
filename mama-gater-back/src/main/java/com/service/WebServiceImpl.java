package com.service;

import com.dao.WebDAO;
import com.model.WebAppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebServiceImpl implements WebService {
    @Autowired
    WebDAO webDAO;

    public List<WebAppEntity> getAllEntities() {
        return webDAO.getAllEntities();
    }
}
