package com.controller;

import com.service.WebService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(MockitoJUnitRunner.class)
public class WebControllerTest {
    private RestTemplate restTemplate;

    @Test
    public void getHelloTest() {
        restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://localhost:9999/webapptest-1.0/test/hello",
                String.class);
        Assert.assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }
}
