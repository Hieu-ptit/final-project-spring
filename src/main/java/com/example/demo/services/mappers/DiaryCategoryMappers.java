package com.example.demo.services.mappers;

import com.example.demo.models.entities.DiaryCategoryEntity;
import com.example.demo.models.in.DiaryCategoryRequest;
import com.example.demo.models.in.DiaryRequest;
import com.example.demo.models.out.DiaryCategoryDto;

import java.util.List;
import java.util.stream.Collectors;

public class DiaryCategoryMappers {
    public List<DiaryCategoryDto> mapDiaryCategoryDto(List<DiaryCategoryEntity> diaryCategoryEntity){
        return  diaryCategoryEntity.stream().map(this::mapDiaryCategoryDto).collect(Collectors.toList());
    }

    public DiaryCategoryDto mapDiaryCategoryDto(DiaryCategoryEntity diaryCategoryEntity){
        DiaryCategoryDto diaryCategoryDto = new DiaryCategoryDto();
        diaryCategoryDto.setId(diaryCategoryEntity.getId());
        diaryCategoryDto.setIdCategory(diaryCategoryEntity.getIdCategory());
        diaryCategoryDto.setIdDiary(diaryCategoryEntity.getIdDiary());
        return diaryCategoryDto;
    }

    public void mapDiaryCategoryEntity(DiaryCategoryEntity diaryCategoryEntity,DiaryCategoryRequest diaryCategoryRequest){
        diaryCategoryEntity.setIdDiary(diaryCategoryRequest.getIdDiary());
        diaryCategoryEntity.setIdCategory(diaryCategoryRequest.getIdCategory());
    }

    public DiaryCategoryEntity mapDiaryCategoryEntity(DiaryCategoryRequest diaryCategoryRequest){
        DiaryCategoryEntity diaryCategoryEntity = new DiaryCategoryEntity();
        mapDiaryCategoryEntity(diaryCategoryEntity,diaryCategoryRequest);
        return diaryCategoryEntity;
    }
    public DiaryCategoryEntity mapCategoryEntityById(DiaryCategoryRequest diaryCategoryRequest,int id){
        DiaryCategoryEntity diaryCategoryEntity = new DiaryCategoryEntity();
        diaryCategoryEntity.setId(id);
        mapDiaryCategoryEntity(diaryCategoryEntity,diaryCategoryRequest);
        return diaryCategoryEntity;
    }
}
