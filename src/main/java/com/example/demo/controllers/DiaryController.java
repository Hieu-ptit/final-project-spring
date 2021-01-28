package com.example.demo.controllers;

import com.example.demo.models.in.DiaryRequest;
import com.example.demo.models.out.DiaryDto;
import com.example.demo.services.business.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/diary")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @PostMapping
    public DiaryDto postClass(@Valid @RequestBody DiaryRequest diaryRequest) {
        System.out.println("AAAAAAAAAAAA");
        System.out.println("CCCCCCCCCC");
        System.out.println("EEEEEEEEEEEE");
        System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFF");
        System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOooooo");
        System.out.println("DDDDDDDDDDDD");
        System.out.println("BBBBBBBBBBBBBBB");
        return diaryService.createDiary(diaryRequest);
    }

}
