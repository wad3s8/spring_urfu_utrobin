package com.example.spring_urfu_utrobin.controllers;

import com.example.spring_urfu_utrobin.exception.BadGatewayException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.example.spring_urfu_utrobin.service.HeadersService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@RequiredArgsConstructor
@Controller
public class HeadersController {

    private final HeadersService headersService;

    @GetMapping("/headers")
    public String getHeaders(@RequestHeader MultiValueMap<String, String> headers, Model model){
        headersService.getHeaders(headers, model);
        return "headers";
    };

    @GetMapping("/502")
    public String testEndpoint() {
        throw new BadGatewayException("Произошла ошибка шлюза.");
    }
}
