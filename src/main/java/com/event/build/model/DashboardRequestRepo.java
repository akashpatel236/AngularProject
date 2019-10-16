package com.event.build.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

@Repository
public class DashboardRequestRepo {

	
	private static ArrayList<DashboardRequest> data = new ArrayList<DashboardRequest>();


	public static ArrayList<DashboardRequest> getData() {
		return data;
	}

	public static void setData(ArrayList<DashboardRequest> data) {
		DashboardRequestRepo.data = data;
	}

	static{
		
		ArrayList<Answer> answerData=new ArrayList<Answer>();
		
		//data - 1
		String[] strArray2 = {"JAVA","JSP","J2EE"}; 
		Answer answerList=new Answer(18,"13/10/2019","Yash Shah","You can put in your web.xml, mappedfile set to"
				+ " false like so to get rid of many static lines that aren't necessarily good blocks to put into an include, "
				+ "but they add up to save space:"
				+ "<servlet>\r\n" + 
				"    <servlet-name>jsp</servlet-name>\r\n" + 
				"    <servlet-class>org.apache.jasper.servlet.JspServlet</servlet-class>\r\n" + 
				"    ...\r\n" + 
				"    <init-param>\r\n" + 
				"        <param-name>mappedfile</param-name>\r\n" + 
				"        <param-value>false</param-value>\r\n" + 
				"    </init-param>\r\n" + 
				"    ...\r\n" + 
				"</servlet>");
		answerData.add(answerList);
		answerList=new Answer(12,"13/10/2019","Ibrahim Jamadar","sounds like you're hitting a 64k method limit, probably due to how Tomcat builds a class out of your JSP. "
				+ "This page suggests changing your static includes like this:"
				+ "<%@ include file=\"test.jsp\" %>"
				+ "");
		answerData.add(answerList);
		data.add(new DashboardRequest("1","_jspService is exceeding the 65535 bytes limit", "Akashkumar Patel", answerData, "13/10/2019", strArray2));
		
		//Data -2 
		ArrayList<Answer> answerData2=new ArrayList<Answer>();
		String[] strArray = {"Python","Django","Virtual environments"}; 
		Answer answerList2=new Answer(22,"01/09/2019","Rushabh Shah","I also faced this issue on windows and here is what helped me. Before executing these commands please make sure that "
				+ "your system environment variable has"
				+ " C:\\Python34\\ and C:\\Python34\\Scripts\\. Also my Python version was 2.7.12 and I was using windows 8");
		answerData2.add(answerList2);
		answerList2=new Answer(12,"13/10/2019","Ibrahim Jamadar","sounds like you're hitting a 64k method limit, probably due to how Tomcat builds a class out of your JSP. "
				+ "This page suggests changing your static includes like this:"
				+ "<%@ include file=\"test.jsp\" %>"
				+ "    1)  python -m pip install virtualenv 2) virtualenv venv 3) venv\\Scripts\\activate.bat 4) pip install django");
		//answerData.add(answerList);
		data.add(new DashboardRequest("2","Can't install Django (or set up a virtual environment. I have Python 3.4 and I am using Windows 10.", "Shruti Singh", answerData2, "22/08/2019", strArray));
	
	}
	
	public DashboardRequest setNewAnswerforId(AnswerDTO ansData) {
		
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");  
        String strDate = dateFormat.format(date);
        
        int index=Integer.parseInt(ansData.getId());
        
		DashboardRequest modifyData=data.get(index-1);
		modifyData.getAnswerList().add(new Answer(0,strDate, ansData.getAnswerBy(),ansData.getAnswer()));
	
		return modifyData;
	}

	public DashboardRequest getDataByid(String id) {
		
		int index=Integer.parseInt(id);
		
		return data.get(index-1);
		
	}
	
	
}
