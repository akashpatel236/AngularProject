package com.event.build.controller;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.build.model.Answer;
import com.event.build.model.AnswerDTO;
import com.event.build.model.DashboardRequest;
import com.event.build.model.DashboardRequestRepo;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DashboardController {

	@Autowired
	DashboardRequestRepo repository;
	
	@GetMapping(path="/fetchQuestionsList",produces="application/json")
	public ArrayList<DashboardRequest> getQueAnsDetails() {
		
		/*
		 * ArrayList<DashboardRequest> sendData = new ArrayList<DashboardRequest>();
		 * 
		 * System.out.println(repository.getData().getQuestion());
		 * sendData.add(repository.getData()); sendData.add(reterieveData());
		 */
		System.out.println("Returning objects of data");
		return repository.getData();
		
	}
	
	@GetMapping(path="/fetchQuestion/{id}",produces="application/json")
	@ResponseBody
	public DashboardRequest getQuestionDetails(@PathVariable("id") String id) {
		
		System.out.println("Request received to get question:"+id);
		
		DashboardRequest sendData = new DashboardRequest();
		
		sendData=repository.getDataByid(id);
		
		return sendData;
		
	}
	
	@PostMapping(path="/submitAnswer",produces="application/json")
	@ResponseBody
	public DashboardRequest addDataToQuestion(@RequestBody AnswerDTO answer) {
		
		System.out.println("Request received to get question:"+answer);
	
		return repository.setNewAnswerforId(answer);
	}
	
	
	/*
	 * private DashboardRequest reterieveData() {
	 * 
	 * DashboardRequest data=new DashboardRequest();
	 * 
	 * ArrayList<Answer> answerData=new ArrayList<Answer>();
	 * 
	 * String[] strArray2 = {"Python","Django","Virtual environments"}; Answer
	 * answerList=new Answer(22,"01/09/2019","Rushabh Shah"
	 * ,"I also faced this issue on windows and here is what helped me. Before executing these commands please make sure that "
	 * + "your system environment variable has" +
	 * " C:\\Python34\\ and C:\\Python34\\Scripts\\. Also my Python version was 2.7.12 and I was using windows 8"
	 * ); answerData.add(answerList); answerList=new
	 * Answer(12,"13/10/2019","Ibrahim Jamadar"
	 * ,"sounds like you're hitting a 64k method limit, probably due to how Tomcat builds a class out of your JSP. "
	 * + "This page suggests changing your static includes like this:" +
	 * "<%@ include file=\"test.jsp\" %>" +
	 * "    1)  python -m pip install virtualenv 2) virtualenv venv 3) venv\\Scripts\\activate.bat 4) pip install django"
	 * ); //answerData.add(answerList); data=new DashboardRequest(
	 * "2","Can't install Django (or set up a virtual environment. I have Python 3.4 and I am using Windows 10."
	 * , "Shruti Singh", answerData, "22/08/2019", strArray2);
	 * 
	 * return data; }
	 */
	
}
