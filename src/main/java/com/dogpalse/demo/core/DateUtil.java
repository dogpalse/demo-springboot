package com.dogpalse.demo.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateUtil {
    
    /**
     * 엔터티의 LocalDateTime 타입을 Date 타입으로 변환
     * @param localDateTime
     * @return
     */
    public static Date convertLocalDateTimeToDate(LocalDateTime localDateTime) {
        return localDateTime != null ? Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()) : null;
    }

    /**
     * Date 타입을 LocalDateTime 타입으로 변환
     * @param date
     * @return
     */
    public static LocalDateTime convertDateToLocalDateTime(Date date) {
        return date !=null ? date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime() : null;
    }
}
