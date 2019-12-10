package com.xxl.conf.sample.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xxl.conf.core.XxlConfClient;

/**
 * @author zhangzhewei
 * Created on 2019-11-16
 */
@CrossOrigin
@RestController
public class TiewuController {

    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    private static final ObjectMapper MAPPER = new ObjectMapper();

    @RequestMapping("{path}")
    @ResponseBody
    public Map path(@PathVariable(value = "path") String path) throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        String data = XxlConfClient.get("default." + path, null);
        System.out.println(path);
        map.put("conf", MAPPER.readTree(data));
        return map;
    }

}
