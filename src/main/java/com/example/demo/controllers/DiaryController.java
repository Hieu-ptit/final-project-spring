package com.example.demo.controllers;

import com.example.demo.models.ins.DiaryRequest;
import com.example.demo.models.outs.DiaryDto;
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
        return diaryService.createDiary(diaryRequest);
    }

}
