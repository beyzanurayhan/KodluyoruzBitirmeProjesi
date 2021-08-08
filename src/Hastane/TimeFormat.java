package Hastane;

import java.text.SimpleDateFormat;

public class TimeFormat {
	public static SimpleDateFormat LongTimeFormat() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public static SimpleDateFormat ShortTimeFormat() {
		return new SimpleDateFormat("yyyy-MM-dd");
	}
}
