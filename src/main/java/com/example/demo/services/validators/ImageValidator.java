package com.example.demo.services.validators;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.in.ImageRequest;
import com.example.demo.utils.StringResponses;
import org.springframework.http.ResponseEntity;

public class ImageValidator {
    public static<T> ResponseEntity<ResponseDetail<T>> validateImage(ImageRequest imageRequest){
        if(imageRequest.getName() == null)
            return Response.badRequest(StringResponses.NAME_IS_NULL);

        String nameRegex = "^[a-zA-Z]{0,30}$";
        if(!imageRequest.getName().matches(nameRegex))
            return Response.badRequest(StringResponses.NAME_NOT_VALID);

        if(imageRequest.getDescription() == null)
            return Response.badRequest(StringResponses.DESCRIPTION_IS_NULL);

        return Response.ok();
    }
}
