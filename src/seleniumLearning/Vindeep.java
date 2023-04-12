package seleniumLearning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws 
	InterruptedException {
		ArrayList<String> exp_data=new ArrayList <String>();
		exp_data.add("Days");
		exp_data.add("months");
		exp_data.add("Years");
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			System.out.println("Title matched...");
			driver.findElement(By.id ("ContentPlaceHolder1_cphCentre_Fdamount")).clear();
			driver.findElement(By.id ("ContentPlaceHolder1_cphCentre_Fdamount")).sendKeys
			 ("2000000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("50");
			                         //code for FD Period Listbox
			                         Select opts  = new
			Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
			                         opts.selectByVisibleText("Days");
			                         List<WebElement> allItems=opts.getOptions();
			                         System.out.println("Total items="+allItems.size());
			                         for (int i=0; i<allItems.size();i++)
			                         {
			                        	 System.out.println(allItems.get (i). getText());
			                        	 if (allItems.get(i) .getText ().equals (exp_data.get (i)))
			                        	 {
			                        		 System.out.println("item Matched ...");
			                        	 }
			                         else
			                         {
			                        	 System.out.println("Item not matched ...");
			                         }
		}
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();
		driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys ("5.40");
		                           //code for Interest Compounding Frequency
		                           Select opts1=new
		 Select (driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FrequencyDropDown")));                       		   
		                        		   opts1.selectByVisibleText("Annual");
		                        		   List<WebElement> allItems1=opts1.getOptions();
		                        		   System.out.println("total items="+allItems1.size());
		                        		   for(int i=0; i <allItems1.size(); i++)
		                        		   {
		                        			   System.out.println(allItems1.get (i).getText());
		                        		   }
		 driver.findElement(By.name("ct100$ContentPlaceHolder1$cphCentre$btnFDMamount")).click();
		 Thread .sleep(5000);     //5 seconds
		  String            
		  fdAmount=driver.findElement (By.id ("ContentPlaceHolder1_cphCentre_MaturityAmontTextBox")).getAttribute("value");
		  System.out.println("FD Amount="+fdAmount);
	}
	else
	{
		System.out.println("Title not matched...");	                        	 
	}
	driver. quit();			                        	 
	  	 
			                        	 
			                        	}
	}


