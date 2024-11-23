package com.example.demo;

import java.time.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        String randoUUID = UUID.randomUUID().toString();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("UUID : "+randoUUID+" , date : "+localDate);
    }
}
