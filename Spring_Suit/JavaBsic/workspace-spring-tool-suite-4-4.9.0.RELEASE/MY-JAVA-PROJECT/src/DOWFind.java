
public class DOWFind {
	 public String Find(int day,int month, int year) {
		 int numDay=(year-1900)*365;
		 numDay=numDay+(year-1900)/4;
		
		 
		 switch(month) {
		 case 12:
			 numDay+=30;
			 
		 case 11:
			 numDay+=31;
		 case 10:
			 numDay+=30;
			 
		 case 9:
			 numDay+=31;
			 
		 case 8:
			 numDay+=31;
		 case 7:
			 numDay+=30;
		 case 6:
			 numDay+=31;
			 
		 case 5:
			 numDay+=30;
			 
		 case 4:
			 numDay+=31;
		 case 3:
			 numDay+=28;
		 case 2:
			 numDay+=31;
		 
		  
		 }
			if(year % 4 == 0 && month <= 2) {
				numDay--;
			}
		 numDay+=day;
		 int dow=numDay%7;
		 
		 
		 
		 String days[]= {"mon","tue","wed","thur","fri","sat","sun"};
		 return days[dow];
		 
		 
	  
	 
	 
	 
	 
	 
	 
	 
}
	 public static void main(String[] args) {
		DOWFind x=new DOWFind();
		String d=x.Find(15, 2, 2021);
		System.out.println(d);
		
	}
}
