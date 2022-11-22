package com.example.firstrealjod.adaptor;

import com.example.firstrealjod.application.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/com/networth")///api/cus/information
@RestController
@RequiredArgsConstructor
public class Controller {
    final TestService testService;

//    @GetMapping("/query")

}
