package com.tmoney.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class DateTimeHelper {
    public static String date(String str) {
        try {
            return new SimpleDateFormat(str).format(new Date());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String date(String str, String str2) {
        if (str == null || str.length() != 8) {
            return "";
        }
        return str.substring(0, 4) + str2 + str.substring(4, 6) + str2 + str.substring(6, 8);
    }

    public static String date(Date date, String str) {
        return date == null ? "" : new SimpleDateFormat(str).format(date);
    }

    public static int getLastDay(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(i, i2 - 1, 1);
        return calendar.getActualMaximum(5);
    }

    public static String getLastDayString(String str, String str2) {
        return (str == null || str.length() < 4 || str2 == null || "".equals(str2)) ? "" : String.valueOf(getLastDay(Integer.parseInt(str), Integer.parseInt(str2)));
    }
}
