package pages.events;

import core.AppiumBase;
import io.cucumber.java.bs.A;
import io.cucumber.java.sl.In;
import org.testng.Assert;
import pages.elements.ScheduleElement;

public class SchedulePage extends AppiumBase {
    ScheduleElement scheduleElement = new ScheduleElement();
    int startDay;
    int startMonth;
    int endDay;
    int endMonth;
    int actualStartDay;
    int actualStartMonth;
    int actualEndDay;
    int actualEndMonth;
    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(scheduleElement.interval));
        Assert.assertTrue(verifyElementDisplayed(scheduleElement.subjectTimeline));
    }
    public void getDataOfInterval(){
        String interval = getContentDesc(scheduleElement.interval);
        interval = interval.replaceAll("[^0-9]", ",");
        System.out.println(interval);
        interval = interval.replaceAll(",", " ");
        interval = interval.replaceAll("\\s+"," ");
        interval = interval.trim();
        String[] date = interval.split(" ");
        for(int i =0 ; i<date.length; i++){
            if(i == 0){
                startDay = Integer.parseInt(date[i]);
                System.out.println("startDay: " + startDay);
            }
            else if(i == 1){
                startMonth = Integer.parseInt(date[i]);
                System.out.println("startMonth: " + startMonth);
            }else if( i == 2){
                endDay = Integer.parseInt(date[i]);
                System.out.println("endDay: " + endDay);
            }else {
                endMonth = Integer.parseInt(date[i]);
                System.out.println("endMonth: " + endMonth);
            }
        }
    }

    public void getDataOfActualDateDisplays(){
        String actualStart = getContentDesc(scheduleElement.startDate);
        String[] start = actualStart.split("/");
        for(int i = 0; i<start.length; i++){
            if(i == 0 ){
                actualStartDay = Integer.parseInt(start[i]);
                System.out.println("actualStartDay: " + actualStartDay);
            }
            else {
                actualStartMonth = Integer.parseInt(start[i]);
                System.out.println("actualEndMonth: " + actualStartMonth);
            }
        }

        String actualEnd = getContentDesc(scheduleElement.endDate);
        String[] end = actualEnd.split("/");
        for(int i = 0; i<end.length; i++){
            if(i == 0){
                actualEndDay = Integer.parseInt(end[i]);
                System.out.println("actualEndDay: " + actualEndDay);
            }
            else {
                actualEndMonth = Integer.parseInt(end[i]);
                System.out.println("actualEndMonth: "+ actualEndMonth);
            }
        }
    }

    public boolean compareDate(){
        getDataOfInterval();
        getDataOfActualDateDisplays();
        if(startMonth == actualStartMonth && startDay == actualStartDay && endMonth == actualEndMonth && actualEndDay < endDay){
            return true;
        }
        return false;
    }
}
