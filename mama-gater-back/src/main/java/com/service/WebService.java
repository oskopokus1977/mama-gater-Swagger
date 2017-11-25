package com.service;

import com.model.WebAppEntity;
import io.swagger.annotations.Api;

import java.util.List;

public interface WebService {
    List<WebAppEntity> getAllEntities();
}
