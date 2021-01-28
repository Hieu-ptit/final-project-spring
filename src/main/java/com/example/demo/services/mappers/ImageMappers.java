package com.example.demo.services.mappers;

import com.example.demo.models.entities.ImageEntity;
import com.example.demo.models.in.ImageRequest;
import com.example.demo.models.out.ImageDto;

import java.util.List;
import java.util.stream.Collectors;

public class ImageMappers {
    public List<ImageDto> mapImageDto(List<ImageEntity> imageEntity){
        return  imageEntity.stream().map(this::mapImageDto).collect(Collectors.toList());
    }

    public ImageDto mapImageDto(ImageEntity imageEntity){
        ImageDto imageDto = new ImageDto();
        imageDto.setId(imageEntity.getId());
        imageDto.setName(imageEntity.getName());
        imageDto.setDescription(imageEntity.getDescription());
        imageDto.setLink(imageEntity.getLink());
        imageDto.setIdDiary(imageEntity.getIdDiary());
        return imageDto;
    }

    public void mapImageEntity(ImageEntity imageEntity, ImageRequest imageRequest){
        imageEntity.setName(imageRequest.getName());
        imageEntity.setDescription(imageRequest.getDescription());
        imageEntity.setLink(imageRequest.getLink());
        imageEntity.setIdDiary(imageRequest.getIdDiary());
    }

    public ImageEntity mapImageEntity(ImageRequest imageRequest){
        ImageEntity imageEntity = new ImageEntity();
        mapImageEntity(imageEntity,imageRequest);
        return imageEntity;
    }

    public ImageEntity mapImageEntityById(ImageRequest imageRequest,int id){
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setId(id);
        mapImageEntity(imageEntity,imageRequest);
        return imageEntity;
    }
}
