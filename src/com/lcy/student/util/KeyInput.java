package com.lcy.student.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyInput {
    private static BufferedReader buf;
    static {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }

    public static int getInt(){
        try{
            return Integer.parseInt(buf.readLine());
        }catch (NumberFormatException| IOException e){
            return 0;
        }
    }

    public static String getString(){
        try{
            return buf.readLine();
        }catch (StringIndexOutOfBoundsException|IOException e){
            return null;
        }
    }

}
