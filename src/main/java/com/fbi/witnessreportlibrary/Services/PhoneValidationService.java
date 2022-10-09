package com.fbi.witnessreportlibrary.Services;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.springframework.stereotype.Service;

@Service
public class PhoneValidationService {
    public boolean phoneValidation(String phoneNum){
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        Phonenumber.PhoneNumber phoneNumber = null;
        try{
            phoneNumber = phoneUtil.parse(phoneNum, "IN");
        }catch (NumberParseException e){
            e.printStackTrace();
        }
        return (phoneUtil.isValidNumber(phoneNumber));
    }
//    public int getCountyCodeFromString(String phone){
//        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
//        Phonenumber.PhoneNumber phoneNumber = null;
//        int countryCode = 0;
//        try{
//            phoneNumber = phoneUtil.parse(phone, "SRB");
//            countryCode = phoneNumber.getCountryCode();
//
//        }catch (NumberParseException e){
//            e.printStackTrace();
//        }
//        return countryCode;
//    }

}
