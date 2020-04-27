package com.toback.webdemo;

import org.json.JSONException;
import org.json.JSONObject;

public class School {
    public static JSONObject getSchoolInfo(String schoolName) throws JSONException {
        JSONObject schoolData;
        if (schoolName.equals("rpi")) {
            schoolData = new JSONObject("{\"name\": \"Rensselaer Polytechnic Institute\"," +
                    "\"date\": \"1973-1976\"," +
                    "\"location\": \"Troy, NY\"," +
                    "\"degree\": \"BS BiomedEng\"," +
                    "\"description\": \"Project was an ultrasonic flow measurement device\"}"
            );
        } else if (schoolName.equals("cmu")) {
            schoolData = new JSONObject("{\"name\": \"Carnegie-Mellon University\"," +
                    "\"date\": \"1976-1978\"," +
                    "\"location\": \"Pittsburgh, PA\"," +
                    "\"degree\": \"MSEE & MSBioEng\"," +
                    "\"description\": \"Masters project was a device to convert eye movements to pulses for communication\"}");
        } else {
            schoolData = new JSONObject("{\"name\":" + schoolName + "," +
                    "\"date\": \"not found\"," +
                    "\"location\": \"not found\"," +
                    "\"degree\": \"not found\"," +
                    "\"description\": \"not found\"}");
        }
        return schoolData;
    }
}
