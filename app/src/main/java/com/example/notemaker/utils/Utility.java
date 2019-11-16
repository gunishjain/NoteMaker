package com.example.notemaker.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getCurrentTimestamp() {

        try{
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-yyyy");

            String currentDate = simpleDateFormat.format(new Date());

            return currentDate;


        } catch (Exception e) {
            return null;
        }


    }



    public static String MonthfromNumber(String monthNumber) {

        switch (monthNumber) {

            case "01": {
                return "Jan";
            }
            case "02": {
                return "Feb";
            }
            case "03": {
                return "March";
            }
            case "04": {
                return "Apr";
            }
            case "05": {
                return "May";
            }
            case "06": {
                return "June";
            }
            case "07": {
                return "Jul";
            }
            case "08": {
                return "Aug";
            }
            case "09": {
                return "Sep";
            }
            case "10": {
                return "Oct";
            }
            case "11": {
                return "Nov";
            }

            case "12": {
                return "Dec";
            }

            default: {
                return "Error";
            }

        }



    }



}
