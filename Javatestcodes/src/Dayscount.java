import java.util.Scanner;

//Find out the number of days in between two  given dates 
public class Dayscount {
	static int daycount;

	public static int monthdays(int a,int b)
	{
		 if(a==01 || a==03|| a==05 || a==07 || a==8 || a==10 || a==12)
		 {
		 daycount =31;
		 }
		 else{daycount=30;}
			 
		 if(a==02){
			 if(b%4==0){daycount=29;}
	        else{daycount=28;}
		          }
	return daycount;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter start date: MMDDYY");
		int MM1= s.nextInt();
		int DD1= s.nextInt();
		int YY1= s.nextInt();
		
		System.out.println("Enter last date:MMDDYY");
		int MM2= s.nextInt();
		int DD2= s.nextInt();
		int YY2= s.nextInt();
	    				
		if((YY1==YY2)&&(MM1==MM2))//same month
		{	
			int numberofDays= (DD2-DD1)-1;
			System.out.println("Number of days in between dates " +MM1+"-"+DD1+"-"+YY1 +" & " +MM2+"-"+DD2+"-"+YY2 +" are: " +numberofDays);
			}
		if((YY1==YY2)&&(MM1!=MM2)){//same year but different month
			
			int Mon_days1= monthdays(MM1,YY1)-DD1;
			int sum=0;
			 for(int m=MM1+1;m<MM2;m++){
				 sum=sum+monthdays(m,YY1);
			 }
			 sum=sum+DD2+Mon_days1;
			 System.out.println("Total days between:" + MM1+"-"+DD1+"-"+YY1+ " & " + MM2+"-"+DD2+"-"+YY2+ " are:" +sum);
			}
		if(YY1!=YY2){
			
			int Mon_days1= monthdays(MM1,YY1)-DD1;
			int sum=0,sum1=0,sum2=0;
			 for(int m1=MM1+1;m1<=12;m1++){
				 sum1=sum1+monthdays(m1,YY1);
			 }
			 sum1=sum1+Mon_days1;
			 
			 for(int m2=1;m2<MM2;m2++){
				 sum2=sum2+monthdays(m2,YY2);
			 }
			 sum2=sum2+DD2;
			 
			 sum=sum1+sum2;
			 System.out.println("Total days between:" + MM1+"-"+DD1+"-"+YY1+ " & " + MM2+"-"+DD2+"-"+YY2+ " are:" +sum);
		}

}
}