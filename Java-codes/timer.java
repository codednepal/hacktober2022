import java.util.Calendar;  
import java.util.Timer;  
import java.util.TimerTask;  
public class ScheduleTimer  
{  
public static void main(String args[])   
{  
//instance of the Timer class  
Timer timer = new Timer();  
TimerTask task = new TimerTask()  
{  
//represent the time after which the task will begin to execute  
int i = 5;  
@Override  
public void run()  
{  
if(i>0)  
{  
System.out.println(i);  
i--;  
}  
else  
{  
System.out.println("Wish You Very Happy Birthday!!");  
//cancel the task once it is completed  
timer.cancel();  
}  
}  
};  
//creating an instance of the Calendar class  
Calendar date = Calendar.getInstance();  
//setting the date and time on which timer will begin   
date.set(2022, Calendar.MARCH, 30,23, 59, 54);  
//enables the counter to count at a rate of 1 second  
timer.scheduleAtFixedRate(task, date.getTime(), 1000);  
}  
}  
