package com.example.demo.services.business;

import com.example.demo.models.in.DiaryRequest;
import com.example.demo.models.out.DiaryDto;

public interface DiaryService {

    DiaryDto createDiary(DiaryRequest diaryRequest);

}
