package com.mealManage.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
  
public class DateUtility {
 
	
	 static SimpleDateFormat yyyyMMddFormat =new SimpleDateFormat("yyyyMMdd");
	 static SimpleDateFormat utcTimeFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 static DateFormat commonDateformatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
	
	/**
	 * Utility function to convert local time to specific TimeZone time
	 * @param locatime
	 * @param timeZone
	 * @return
	 */
	public static Long getCurrentTimeInMillisByTimezone(String timeZone) {
		Calendar localTime = Calendar.getInstance();
		Calendar targetTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
		targetTime.setTimeInMillis(localTime.getTimeInMillis());
		return targetTime.getTimeInMillis();
	}
	

	/**
	 * Utility function to convert local time to specific TimeZone time
	 * @param timeZone
	 * @param format
	 * @return
	 */
	public static String getCurrentTimeByTimezone(String timeZone, String format) {
		Calendar localTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
		
		localTime.setTime(new Date(getCurrentTimeInMillisByTimezone(timeZone)));
		DateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
	//	Calendar targetTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
	
		return sdf.format(localTime.getTime());
	}
	public static String getCurrentDate(String format)
	{

		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		java.util.Date dt=new java.util.Date();
		dateFormat.setTimeZone(TimeZone.getTimeZone("US/Arizona"));
		return dateFormat.format(dt);
	}	
	
	/**
	 * Utility function to convert UTC time to specific company TimeZone 
	 * @param dateString this parameter refers savedutcdate
	 * @param dateFormat this parameter refers dateFormat
	 * @timezone this parameter refers saved timezone and it splits the timezone and assign the timeZoneDate
	 * @return
	 */
	public static String getDateTimeWithTimezone(String dateString , String dateFormat , String timezone){
		String timezoneDate = null;
		//System.out.println("DAteString:"+dateString);
		
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			Date date = sdf.parse(dateString);
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			String time[] = timezone.split("\\.");
			int hour = 0;
			int minute = 0;
			if(time.length == 2){
				
				hour = Integer.parseInt(time[0]);
				minute = Integer.parseInt(time[1]);
			}
			
			cal.add(Calendar.HOUR_OF_DAY, hour);
			cal.add(Calendar.MINUTE, minute);
			timezoneDate = sdf.format(cal.getTime());
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return timezoneDate;
	}
	public static String convertLocalToUTC(String dateString , String timezone)
	{
		Date date=new Date();
		String convertedDate=null;
		//String currentFormat="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String currentFormat="yyyy-MM-dd HH:mm:ss";
		//String requiredFormat="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String requiredFormat="yyyy-MM-dd HH:mm:ss";
		DateFormat locFormat = new SimpleDateFormat(currentFormat);
		locFormat.setTimeZone(TimeZone.getTimeZone(timezone));
		try {
			date = locFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat pstFormat = new SimpleDateFormat(requiredFormat);
		pstFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
			convertedDate=pstFormat.format(date);
		return convertedDate;
	}
	public static String convertUTCtoLocal(String dateString , String timezone)
	{
		Date date=new Date();
		String convertedDate=null;
		String currentFormat="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		String requiredFormat="yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		DateFormat utcFormat = new SimpleDateFormat(currentFormat);
		utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			date = utcFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat pstFormat = new SimpleDateFormat(requiredFormat);
		/*int dayLightSavings=TimeZone.getTimeZone(timezone).getDSTSavings();
		Date date2=new Date(date.getTime()-dayLightSavings);*/
			pstFormat.setTimeZone(TimeZone.getTimeZone(timezone));
			convertedDate=pstFormat.format(date);
		return convertedDate;
	}
	
	public static String getCurrentDateInYYYYMMDDFormat()
	{
		Date date=new Date();
		return yyyyMMddFormat.format(date);
		
	}
	
	public static String getCurrentDateInUTC()
	{
		Date date=new Date();
		return utcTimeFormat.format(date);
		
	}


	
	public static String convertUTCtoLocal(Date utcDate, String timezone) {

		Calendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(utcDate.getTime());

		commonDateformatter.setCalendar(calendar);

		commonDateformatter.setTimeZone(TimeZone.getTimeZone(timezone));

		return commonDateformatter.format(calendar.getTime());
	}
	public static String addYearsToDate(String timeZone, String format,int years) {
		Calendar localTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
		
		localTime.setTime(new Date(getCurrentTimeInMillisByTimezone(timeZone)));
		localTime.add(Calendar.YEAR, years);
		DateFormat sdf = new SimpleDateFormat(format);
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
	//	Calendar targetTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
	
		return sdf.format(localTime.getTime());
	}
}
