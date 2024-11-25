package egovframework.example.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 날짜 처리를 위한 유틸리티 클래스
 * Spring Boot 변환 버전
 * 
 * @since 2009.02.01
 * @version 1.2
 */
public class EgovDateUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(EgovDateUtil.class);

    /**
     * 날짜 문자열을 입력받아 연, 월, 일을 증감.
     *
     * @param dateStr 날짜 문자열(yyyyMMdd 또는 yyyy-MM-dd 형식)
     * @param year    증감할 연
     * @param month   증감할 월
     * @param day     증감할 일
     * @return 증감된 yyyyMMdd 형식의 날짜 문자열
     */
    public static String addYearMonthDay(String dateStr, int year, int month, int day) {
        String validDate = validateDateFormat(dateStr);

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        try {
            cal.setTime(sdf.parse(validDate));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + validDate);
        }

        cal.add(Calendar.YEAR, year);
        cal.add(Calendar.MONTH, month);
        cal.add(Calendar.DAY_OF_MONTH, day);

        return sdf.format(cal.getTime());
    }

    /**
     * 두 날짜 사이의 차이를 계산.
     *
     * @param startDate 시작 날짜(yyyyMMdd 또는 yyyy-MM-dd 형식)
     * @param endDate   종료 날짜(yyyyMMdd 또는 yyyy-MM-dd 형식)
     * @return 두 날짜 사이의 일 수 차이
     */
    public static int getDaysDiff(String startDate, String endDate) {
        String validStartDate = validateDateFormat(startDate);
        String validEndDate = validateDateFormat(endDate);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        try {
            Date start = sdf.parse(validStartDate);
            Date end = sdf.parse(validEndDate);
            long diff = end.getTime() - start.getTime();
            return (int) (diff / (1000 * 60 * 60 * 24));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + startDate + " or " + endDate);
        }
    }

    /**
     * 현재 날짜 반환 (yyyyMMdd 형식).
     *
     * @return 현재 날짜 문자열
     */
    public static String getToday() {
        return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
    }

    /**
     * 날짜 형식의 유효성을 확인.
     *
     * @param date 날짜 문자열
     * @return 유효한 날짜 포맷인지 여부
     */
    public static boolean isValidDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            sdf.setLenient(false);
            sdf.parse(validateDateFormat(date));
            return true;
        } catch (ParseException | IllegalArgumentException e) {
            return false;
        }
    }

    /**
     * 날짜 포맷 검증 및 표준화.
     *
     * @param date 날짜 문자열
     * @return 표준화된 yyyyMMdd 날짜 문자열
     */
    private static String validateDateFormat(String date) {
        if (date == null || !(date.length() == 8 || date.length() == 10)) {
            throw new IllegalArgumentException("Invalid date format: " + date);
        }
        return date.replace("-", "");
    }

    /**
     * 두 날짜 사이의 랜덤 날짜 생성.
     *
     * @param startDate 시작 날짜(yyyyMMdd)
     * @param endDate   종료 날짜(yyyyMMdd)
     * @return 랜덤 날짜(yyyyMMdd)
     */
    public static String getRandomDate(String startDate, String endDate) {
        String validStart = validateDateFormat(startDate);
        String validEnd = validateDateFormat(endDate);

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
            Date start = sdf.parse(validStart);
            Date end = sdf.parse(validEnd);

            if (start.after(end)) {
                throw new IllegalArgumentException("Start date cannot be after end date");
            }

            long randomMillis = start.getTime() + (long) (Math.random() * (end.getTime() - start.getTime()));
            return sdf.format(new Date(randomMillis));
        } catch (ParseException e) {
            throw new IllegalArgumentException("Invalid date format: " + startDate + " or " + endDate);
        }
    }

    /**
     * 윤년 여부를 확인.
     *
     * @param year 연도
     * @return 윤년 여부
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * 날짜 문자열을 지정된 구분자로 변환.
     *
     * @param date 날짜 문자열(yyyyMMdd)
     * @param delimiter 구분자
     * @return 변환된 문자열
     */
    public static String formatDate(String date, String delimiter) {
        String validDate = validateDateFormat(date);
        if (validDate.length() == 8) {
            return validDate.substring(0, 4) + delimiter + validDate.substring(4, 6) + delimiter + validDate.substring(6);
        }
        return validDate;
    }
}
