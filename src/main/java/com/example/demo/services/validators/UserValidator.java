package com.example.demo.services.validators;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.in.UserRequest;
import com.example.demo.utils.StringResponses;
import org.springframework.http.ResponseEntity;

public class UserValidator {
    public static<T> ResponseEntity<ResponseDetail<T>> validateUser(UserRequest userRequest){
        if(userRequest.getFirstName() == null)
            return Response.badRequest(StringResponses.FIRST_NAME_IS_NULL);

        String firstNameRegex = "^[a-zA-Z]{0,20}$";
        if(!userRequest.getFirstName().matches(firstNameRegex))
            return Response.badRequest(StringResponses.FIRSTNAME_NOT_VALID);

        if(userRequest.getLastName() == null)
            return Response.badRequest(StringResponses.LAST_NAME_IS_NULL);

        String lastNameRegex = "^[a-zA-Z]{0,10}$";
        if(!userRequest.getLastName().matches(lastNameRegex))
            return Response.badRequest(StringResponses.LAST_NAME_NOT_VALID);

        if(userRequest.getEmail() == null)
            return Response.badRequest(StringResponses.EMAIL_IS_NULL);

        if(userRequest.getCreatedAt() == null)
            return Response.badRequest(StringResponses.CREATE_AT_IS_NULL);

        return Response.ok();
    }
}
