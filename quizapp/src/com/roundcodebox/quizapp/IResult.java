package com.roundcodebox.quizapp;

public interface IResult {
void showResult();
double showPercentage(int correctAnswers, int totalQuestions);
String showPerformance(double percentage);

}


