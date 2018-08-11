package date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Date(int cday, int cmonth, int cyear) {
		this.day = cday;
		this.month = cmonth;
		this.year = cyear;
	} 
	
	public int getYear() {
		if(year <= 0) {
			return 0;
		}
		else {
			return year;
		}		 
	}
	
	public int getMonth() {
		if(month >= 13 || month <= 0) {
			return 0;
		}
		else {
			return month;
		}
	}
	
	public int getDay() {
		if(day >= 31 || day <=0) {
			return 0;
		}
		else if(month == 2) {
			if(leap(year)==0) {
				if(day >= 29) {
					return 0;
				}else {
					return day;
				}
			}
			else if(leap(year)!=0) {
				if(day >= 30) {
					return 0;
				}else {
					return day;
				}
			}
		}else {
			if(month <=7) {
				if(month%2==0 || day <=30) {
					return day;
				}
				else if(month%2!=0 || day <=31){
					return day;
				}
				else {
					return 0;
				}
			}else if(month >= 8 || month <=12){
				if(month%2==0 || day <= 31) {
					return day;
				}
				else if(month%2!=0 || day <=30) {
					return day;
				}
				else {
					return 0;
				}
			}			
		}
		return 0; //Why it necessary 
	}
	
	public static int leap(int x) {
		int y = x;
		if(x%4==0) {
			if(x%100==0) {
				if(x%400==0) {
					return y;
				}else {
					return 0;
				}
			}else {
				return y;
			}
		}else {
			return 0;
		}
	}
}
