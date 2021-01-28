package com.example.demo.services.mappers;

import com.example.demo.models.entities.DiaryEntity;
import com.example.demo.models.in.DiaryRequest;
import com.example.demo.models.out.DiaryDto;

import java.util.List;
import java.util.stream.Collectors;

public class DiaryMappers {
    public List<DiaryDto> mapDiaryDto(List<DiaryEntity> diaryEntity){
        return  diaryEntity.stream().map(this::mapDiaryDto).collect(Collectors.toList());
    }

    public DiaryDto mapDiaryDto(DiaryEntity diaryEntity){
        DiaryDto diaryDto = new DiaryDto();
        diaryDto.setId(diaryEntity.getId());
        diaryDto.setTitle(diaryEntity.getTitle());
        diaryDto.setContent(diaryEntity.getContent());
        diaryDto.setStatus(diaryEntity.isStatus());
        diaryDto.setStatusFavorite(diaryEntity.isStatusFavorite());
        diaryDto.setModifiedAt(diaryEntity.getModifiedAt());
        diaryDto.setCreateAt(diaryEntity.getCreateAt());
        diaryDto.setIdUser(diaryEntity.getIdUser());
        return diaryDto;
    }

    public DiaryEntity mapDiaryEntity(DiaryRequest diaryRequest){
        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setTitle(diaryRequest.getTitle());
        diaryEntity.setContent(diaryRequest.getContent());
        diaryEntity.setCreateAt(diaryRequest.getCreateAt());
        diaryEntity.setIdUser(diaryRequest.getIdUser());
        diaryEntity.setStatus(diaryRequest.isStatus());
        diaryEntity.setStatusFavorite(diaryRequest.isStatusFavorite());
        diaryEntity.setModifiedAt(diaryRequest.getModifiedAt());
        return diaryEntity;
    }

    public DiaryEntity mapDiaryEntity(DiaryRequest diaryRequest,int id){
        DiaryEntity diaryEntity = new DiaryEntity();
        diaryEntity.setId(id);
        diaryEntity.setTitle(diaryRequest.getTitle());
        diaryEntity.setContent(diaryRequest.getContent());
        diaryEntity.setModifiedAt(diaryRequest.getModifiedAt());
        diaryEntity.setStatus(diaryRequest.isStatus());
        diaryEntity.setStatusFavorite(diaryRequest.isStatusFavorite());
        diaryEntity.setCreateAt(diaryRequest.getCreateAt());
        diaryEntity.setIdUser(diaryRequest.getIdUser());
        return diaryEntity;
    }
}
