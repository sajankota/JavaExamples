package com.roundcodebox.quizapp;

import java.util.Scanner;

public class Quiz {
	void begin() {
		Question question1 = new Question("Which is a valid keyword in java?", "interface", "inherit", "unsigned",
				"derive", new Answer("interface"));
		Question question2 = new Question("Where does an object  gets created in memory?", "Stack", "Queue", "Heap",
				"None of the above", new Answer("Heap"));
		Question question3 = new Question("Which keyword is used to prevent a method from overridden?", "extends",
				"final", "static", "implements", new Answer("final"));
		Question question4 = new Question("For what purpose is the this() constructor call used?",
				"To invoke a parent class constructor", "To invoke a child class constructor",
				"To invoke another constructor of the same class",
				"To invoke another constructor of the different class",
				new Answer("To invoke a parent class constructor"));
		Question question5 = new Question("When does an object become unreachable?",
				"When it's reference is pointing to null", "When it's reference is pointing to another object",
				"When a method in which it is defined ends", "All of the above", new Answer("All of the above"));

		Question questionsArr[] = { question1, question2, question3, question4, question5 };
		int countTotal = 0;
		int countCorrect = 0;
		int countWrong = 0;

		for (Question question : questionsArr) {
			System.out.println(question.getQuestion());
			System.out.println("A, " + question.getOption1());
			System.out.println("B, " + question.getOption2());
			System.out.println("C, " + question.getOption3());
			System.out.println("D, " + question.getOption4());
			System.out.println("\nEnter an option");

			Scanner scanner = new Scanner(System.in);
			char option = scanner.next().charAt(0);
			String answer = "";

			switch (option) {
			case 'A':
				answer = question.getOption1();
				break;
			case 'B':
				answer = question.getOption2();
				break;
			case 'C':
				answer = question.getOption3();
				break;
			case 'D':
				answer = question.getOption4();

				break;

			default:
				break;
			}

			if (answer.equals(question.answer.getAnswer())) {
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("Correct Answer");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				countCorrect++;
			} else {
				System.out.println(
						"---------------------------------------------------------------------------------------");
				System.out.println("Wrong Answer");
				System.out.println(
						"---------------------------------------------------------------------------------------");
				countWrong++;
			}
			System.out.println(
					"\n---------------------------------------------------------------------------------------\n");

			countTotal++;
		}
		IResult result = new Result(countTotal, countCorrect, countWrong);
		result.showResult();
	}
}
