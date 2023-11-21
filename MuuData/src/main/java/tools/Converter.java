/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 0068943
 */
public class Converter {
    
    public static Calendar convertToCalendar(String date) throws ParseException {
        return convertToCalendar(date, "dd/MM/yyyy");
    }
    
    public static Calendar convertToCalendar(String date, String pattern) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        dateFormat.setLenient(false);
        Date dataNascimento = dateFormat.parse(date);
        Calendar c = Calendar.getInstance();
        c.setTime(dataNascimento);
        
        return c;
    }
}
