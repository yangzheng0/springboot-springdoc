package com.example.springdoc.controller;

import com.example.springdoc.dto.RequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试controller
 *
 * @author xiaoyang
 * @date 2023-11-20
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    /**
     * 获取时间戳
     */
    @PostMapping(value = "/getTimeLong")
    public Object getTimeLong(@RequestBody RequestDto requestOrderDto){
        System.out.println("--------------------------------------------");
        long time = requestOrderDto.getStartTime().getTime();
        return time;
    }
}
