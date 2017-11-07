package com.in28minutes.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.in28minutes.springboot.service.SurveyService;
import com.in28minutes.springboot.model.*;;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	//GET "/surveys/{surveyId}/questions"
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retrieveQuestionsForSurvey(@PathVariable String surveyId) {
		return surveyService.retrieveQuestions(surveyId);
	}
	
	//GET "/surveys/{surveyId}/questions"
	@PostMapping("/surveys/{surveyId}/questions")
	public List<Question> addQuestionsToSurvey(@PathVariable String surveyId,@RequestBody Question newQuestion) {
		return surveyService.retrieveQuestions(surveyId);
	}
	
	/*
	 * 
	 *	{
			id: "Question100",
			description: "Largest Country in the World",
			correctAnswer: "Russia",
			options: [
			"India",
			"Russia",
			"United States",
			"China"
			]
		}
	 */
	
	//GET "/surveys/{surveyId}/questions"
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retrieveDetailsForQuestion(@PathVariable String surveyId, @PathVariable String questionId) {
		return surveyService.retrieveQuestion(surveyId, questionId);
	}
}
