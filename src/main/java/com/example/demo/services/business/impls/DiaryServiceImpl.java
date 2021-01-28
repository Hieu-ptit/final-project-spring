package com.example.demo.services.business.impls;

import com.example.demo.models.entities.DiaryEntity;
import com.example.demo.models.in.DiaryRequest;
import com.example.demo.models.out.DiaryDto;
import com.example.demo.repositories.DiaryRepository;
import com.example.demo.services.business.DiaryService;
import com.example.demo.services.mappers.DiaryMappers;
import org.springframework.stereotype.Service;

@Service
public class DiaryServiceImpl implements DiaryService {

    private final DiaryMappers diaryMappers;

    private final DiaryRepository diaryRepository;

    public DiaryServiceImpl(DiaryMappers diaryMappers, DiaryRepository diaryRepository) {
        this.diaryMappers = diaryMappers;
        this.diaryRepository = diaryRepository;
    }

    @Override
    public DiaryDto createDiary(DiaryRequest diaryRequest) {
        DiaryEntity diaryEntity = diaryMappers.mapDiaryEntity(diaryRequest);
        diaryEntity = diaryRepository.save(diaryEntity);
        DiaryDto diaryDto = diaryMappers.mapDiaryDto(diaryEntity);
        return diaryDto;
    }

}
