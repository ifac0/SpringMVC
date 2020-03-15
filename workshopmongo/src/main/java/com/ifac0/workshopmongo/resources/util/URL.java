package com.ifac0.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    public static String dedoceParam(String text) {
        try{
            return URLDecoder.decode(text, "UTF-8");
        }catch (UnsupportedEncodingException e){
            return "";
        }
    }
}
