package pages.events;

import core.AppiumBase;
import io.cucumber.java.sl.In;
import org.testng.Assert;
import pages.elements.TransactionHistoryElement;

import java.beans.IntrospectionException;

public class TransactionHistoryEvents extends AppiumBase {
    TransactionHistoryElement element = new TransactionHistoryElement();
    int startDay;
    int startMonth;
    int startYear;
    int endDay;
    int endMonth;
    int endYear;
    public void verifyTransactionHistoryDisplays(){
        Assert.assertTrue(verifyElementDisplayed(element.startDay));
        Assert.assertTrue(verifyElementDisplayed(element.endDay));
        Assert.assertTrue(verifyElementDisplayed(element.filterData));
        Assert.assertTrue(verifyElementDisplayed(element.detailInformation));
    }

    public void getDataStartAndEndDate(){
        String startDate = getText(element.startDay);
        String endDate = getText(element.endDay);
        String[] start = startDate.split("/");
        for(int i = 0; i<start.length; i++){
            if(i==0){
                startMonth = Integer.parseInt(start[i]);
                System.out.println("startMonth: " + startMonth);
            }else if(i == 1){
                startDay = Integer.parseInt(start[i]);
                System.out.println("startDay: "+ startDay);
            }else{

                startYear = Integer.parseInt(start[i]);
                System.out.println("startYear: " + startYear);
            }
        }
        String[] end = endDate.split("/");
        for(int j = 0; j<end.length; j++){
            if(j == 0){
                endMonth = Integer.parseInt(end[j]);
                System.out.println("endMonth: " + endMonth);
            }else if(j == 1){
                endDay = Integer.parseInt(end[j]);
                System.out.println("endDay: " + endDay);
            }else{
                endYear = Integer.parseInt(end[j]);
                System.out.println("endYear: " + endYear);
            }
        }
    }

    public void getDataInformationDisplay(){
        String contentOfFirstItem = getContentDesc(element.firstItem);
        System.out.println(contentOfFirstItem);
        contentOfFirstItem = contentOfFirstItem.replaceAll("[^0-9,\\.]", ",");
        System.out.println(contentOfFirstItem);
        contentOfFirstItem = contentOfFirstItem.replaceAll(",", " ");
        contentOfFirstItem = contentOfFirstItem.replaceAll("\\s+"," ");
        contentOfFirstItem = contentOfFirstItem.trim();
        String[] str = contentOfFirstItem.split(" ");
        for(int i = 0; i< str.length; i++){
            str[i] = str[i].replace(".", "");
            System.out.println(str[i]);
        }
        
    }
}
