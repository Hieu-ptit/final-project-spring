package com.example.demo.services.mappers;

import com.example.demo.models.entities.CategoryEntity;
import com.example.demo.models.in.CategoryRequest;
import com.example.demo.models.out.CategoryDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategoryMappers {
    public List<CategoryDto> mapCategoryDto(List<CategoryEntity> categoryEntities){
//         return categoryEntities.stream()
//                 .map(c -> {
//                     CategoryDto categoryDto = new CategoryDto();
//                     categoryDto.setId(c.getId());
//                     categoryDto.setName(c.getName());
//                     categoryDto.setDescription(c.getDescription());
//                     return categoryDto;
//                 })
//                 .collect(Collectors.toList());
        return  categoryEntities.stream().map(this::mapCategoryDto).collect(Collectors.toList());
    }

    public CategoryDto mapCategoryDto(CategoryEntity categoryEntity){
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName(categoryEntity.getName());
        categoryDto.setDescription(categoryEntity.getDescription());
        return categoryDto;
    }

    public CategoryEntity mapCategoryEntity(CategoryRequest categoryRequest){
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(categoryRequest.getName());
        categoryEntity.setDescription(categoryRequest.getDescription());
        return categoryEntity;
    }

    public CategoryEntity mapCategoryEntity(CategoryRequest categoryRequest,int id){
        CategoryEntity categoryEntity =new CategoryEntity();
        categoryEntity.setId(id);
        categoryEntity.setName(categoryRequest.getName());
        categoryEntity.setDescription(categoryRequest.getDescription());
        return categoryEntity;
    }
}
