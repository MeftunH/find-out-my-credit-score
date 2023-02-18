package com.findoutmyloan.application.person.enums;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.findoutmyloan.application.general.errorMessage.BaseErrorMessage;

public enum PersonErrorMessage implements BaseErrorMessage {

    FIELD_CANNOT_BE_NULL("Field Cannot Be Null!","Please check the field.");


    private  final String message;
    private  final String detailMessage;
    PersonErrorMessage(String message, String detailMessage){
        this.message = message;
        this.detailMessage = detailMessage;
    }
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getDetailMessage() {
        return detailMessage;
    }
}
