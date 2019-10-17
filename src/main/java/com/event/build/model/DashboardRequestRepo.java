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
		Answer answerList=new Answer(18,"13/10/2019","Akash Patel","You can put in your web.xml, mappedfile set to"
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
		answerList=new Answer(12,"13/10/2019","Riyam","sounds like you're hitting a 64k method limit, probably due to how Tomcat builds a class out of your JSP. "
				+ "This page suggests changing your static includes like this:"
				+ "<%@ include file=\"test.jsp\" %>"
				+ "");
		answerData.add(answerList);
		answerList=new Answer(10,"16/10/2019","Sajal Garg","Split the JSP if possible for your application. It will 100% work."
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
		answerData2.add(answerList2);
		data.add(new DashboardRequest("2","Can't install Django (or set up a virtual environment. I have Python 3.4 and I am using Windows 10.", "Shruti Singh", answerData2, "22/08/2019", strArray));
	
		//Data -3 
		ArrayList<Answer> answerData3=new ArrayList<Answer>();
		String[] strArray3 = {"Angular","front-end","models-package"}; 
		
		Answer answerList3=new Answer(12,"13/10/2019","Shakti Vishal","The instances in the public subnet can send outbound traffic directly to the Internet,"
				+ " whereas the instances in the private subnet can't. Instead, the instances in the private subnet can access the Internet by using a network address translation (NAT) gateway that resides in the public subnet. The database servers can connect to the Internet for software updates using the NAT gateway, "
				+ "but the Internet cannot establish connections to the database servers.");
		answerData3.add(answerList3);
		 answerList3=new Answer(6,"01/09/2019","Sagar Shinde","Thanks but I'm not 100% sure to understand. If the instance has a private and a public IP addresses, doesn't it mean that it has 2 interfaces? If there are 2 interfaces, then why would the public IP need to be more public than it already is? After all \"Public IP\" means it has access to the internet and the internet has access to it. "
		 		+ "What does a Virtual Private Cloud has to do with a Public IP");
		answerData3.add(answerList3);
		answerList3=new Answer(5,"01/09/2019","Rushabh Shah","while the instance might have public IP it doesn't mean the subnet that the instance associated with is Public. therefore, you need to make sure the subnet is accessible. Basically the flow is like that : 1. Subnet 2. Security group 3. Public IP");
		answerData3.add(answerList3);
		data.add(new DashboardRequest("3","Cannot connect to AWS E2 instance (but security group allows inbound) The instance shows Online and reachabiliy check shows ok. "
				+ "The route table of the subnet directs 0.0.0.0/0 to the igw.", "Sagar Shinde", answerData3, "08/09/2019", strArray3));
	
		
		//Data -4
				ArrayList<Answer> answerData4=new ArrayList<Answer>();
				String[] strArray4 = {"Angular","front-end","models-package"}; 
				Answer answerList4=new Answer(21,"01/09/2019","Rushabh Shah","Run below commands, it will work."
						+ "npm install --save @angular/material @angular/cdk @angular/animations hammerjs \r\n" +
						"+ @angular/animations@6.1.10\r\n" + 
						"+ @angular/cdk@7.0.3\r\n" + 
						"+ @angular/material@7.0.3\r\n" + 
						"+ hammerjs@2.0.8");
				answerData4.add(answerList4);
				answerList4=new Answer(12,"13/10/2019","Shakti Vishal","try to update Angular core & CLI to latest version by"
						+ " ng update @angular/cli @angular/core \r \n"
						+ " then try to install material command - ng add @angular/material ");
				answerData4.add(answerList4);
				data.add(new DashboardRequest("4","Can't install Angular Material.. npm WARN @angular/animations@5.2.8 requires a peer of @angular/core@5.2.8 but none was installed. \r\n" + 
						"npm WARN @angular/cdk@5.2.4 requires a peer of @angular/core@^5.0.0 but none was installed. \r\n" + 
						"npm WARN @angular/cdk@5.2.4 requires a peer of @angular/common@^5.0.0 but none was installed. \r\n", "Shruti Singh", answerData4, "22/09/2019", strArray4));
			
	}
	
	public DashboardRequest setNewAnswerforId(AnswerDTO ansData) {
		
		Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
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
