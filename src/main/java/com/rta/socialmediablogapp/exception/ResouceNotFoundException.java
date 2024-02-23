package com.rta.socialmediablogapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResouceNotFoundException extends RuntimeException{
    private String resouceName;
    private String fieldName;
    private String fieldValue;

    public String getResouceName() {
        return resouceName;
    }

    public void setResouceName(String resouceName) {
        this.resouceName = resouceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public ResouceNotFoundException(String resouceName, String fieldName, String fieldValue){
       // Post not found with id :: 1
        super(String.format("%s is not found with %s :: %s", resouceName,fieldName,fieldValue));
        this.resouceName=resouceName;
        this.fieldName=fieldName;
        this.fieldValue=fieldValue;
    }

}
