package com.example.demo.services.validators;

import com.example.demo.exceptions.Response;
import com.example.demo.exceptions.ResponseDetail;
import com.example.demo.models.in.DiaryRequest;
import com.example.demo.utils.StringResponses;
import org.springframework.http.ResponseEntity;

public class DiaryValidator {
    public static<T> ResponseEntity<ResponseDetail<T>> validateDiary(DiaryRequest diaryRequest){
        if(diaryRequest.getTitle() == null)
            return Response.badRequest(StringResponses.TITLE_IS_NULL);

        String titleRegex = "^[a-zA-Z0-9]{0,50}$";
        if(!diaryRequest.getTitle().matches(titleRegex))
            return Response.badRequest(StringResponses.TITLE_NOT_VALID);

        if(diaryRequest.getContent() == null)
            return Response.badRequest(StringResponses.CONTENT_IS_NULL);

        if(!diaryRequest.isStatus() && diaryRequest.isStatus()){
            return Response.badRequest(StringResponses.STATUS_NOT_VALID);
        }
        if(!diaryRequest.isStatusFavorite() && diaryRequest.isStatusFavorite()){
            return Response.badRequest(StringResponses.STATUS_FAVORITE_NOT_VALID);
        }
        if(diaryRequest.getCreateAt() == null)
            return Response.badRequest(StringResponses.CREATE_AT_IS_NULL);

        if(diaryRequest.getModifiedAt() == null)
            return Response.badRequest(StringResponses.MODIFIED_AT_IS_NULL);

        return Response.ok();
    }
}
