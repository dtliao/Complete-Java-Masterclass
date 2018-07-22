package com.company;

public class Main {

    public static void main(String[] args) {
        getDurationString();
        getDurationString();
    }
    public static int getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {
            return "Invalid value";
        }
        ZZ = seconds;
        YY = minutes % 60;
        XX = minutes / 60 + minutes / 3600;
        return XX + "h " + YY + "m " + ZZ + 's';

    }
        public static int getDurationString(int seconds){
            if (seconds < 0 ) {
                return (string)("invalid value");
            }else {
                ZZ = seconds;
                YY = 60 % minutes;
                System.out.println(YY + 'm ' + ZZ + 's');
                return ()
            }





}
