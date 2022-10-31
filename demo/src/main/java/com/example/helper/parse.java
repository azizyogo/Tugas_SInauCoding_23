package com.example.helper;

import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class parse {
    
    public static Date stringToDate(String date){

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(date);
        } catch (ParseException e) {

            return null;
        }
    }
}
