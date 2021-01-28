package com.example.demo.services.validators;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.in.CategoryRequest;
import com.example.demo.utils.StringResponses;
import org.springframework.http.ResponseEntity;

public class CategoryValidator {
    public static<T> ResponseEntity<ResponseDetail<T>> validateCategory(CategoryRequest categoryRequest){
        if(categoryRequest.getName() == null)
            return Response.badRequest(StringResponses.NAME_IS_NULL);

        String nameRegex = "^[a-zA-Z]{0,20}$";
        if(!categoryRequest.getName().matches(nameRegex))
            return Response.badRequest(StringResponses.NAME_NOT_VALID);

        if(categoryRequest.getDescription() == null)
            return Response.badRequest(StringResponses.DESCRIPTION_IS_NULL);

        return Response.ok();
    }
}
