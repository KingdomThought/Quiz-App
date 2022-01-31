package quizApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMaker {

	public String question;
	public String answer;
	public String alt1;
	public String alt2;
	public String alt3;
	public int qCount = 1;
	int c = 1;
	public String quizName;
	
	ArrayList<String> qArray = new ArrayList<String>();
	ArrayList<String> aArray = new ArrayList<String>();
	ArrayList<String> alt1Array = new ArrayList<String>();
	ArrayList<String> alt2Array = new ArrayList<String>();
	ArrayList<String> alt3Array = new ArrayList<String>();
	ArrayList<String> possibleAnswers = new ArrayList<String>();

	public void questionInput() {
		System.out.println("***Welcome to The TRINITY GROUP QuizMakerPRO***");
		System.out.println("*** This Software Was Designed to Build Quizzes for Students***");
		System.out.println("*** Please Follow These Instructions:***");
		System.out.println(" 1) You will be prompted to enter quiz Question");
		System.out.println(" 2) You will be prompted to enter the correct  answer for question");
		System.out.println(" 3) You will be prompted to enter 3 alternate incorrect answers to quiz question");
		System.out.println(" 4) This software will randomly shuffle the order of quiz questions ");
		System.out.println("");
		int i = 1;
		while (i <= 1) {

			Scanner in = new Scanner(System.in);
			System.out.print("Enter Quiz Question # " + i);
			question = in.nextLine();
			System.out.println("Question # " + i + ": Has been added Susscefully");
			System.out.println("");
			System.out.println("Please provide the correct answer to question # " + i);
			Scanner inAnswer = new Scanner(System.in);
			answer = inAnswer.nextLine();
			System.out.println("Answer Key to question # " + i + ": Has been added");
			System.out.println();
			qArray.add(question);
			aArray.add(answer);
			i++;
			// int c = 1;
			while (c <= 3) {
				System.out.println("Please enter alternate incorrect multiple choice option # " + c);
				if (c == 1) {
					alt1 = inAnswer.nextLine();
					alt1Array.add(alt1);
				} else if (c == 2) {
					alt2 = inAnswer.nextLine();
					alt2Array.add(alt2);
				} else if (c == 3) {
					alt3 = inAnswer.nextLine();
					alt3Array.add(alt3);
				}

				c++;
			}

		}

		possibleAnswers.add(0, alt1);
		possibleAnswers.add(0, alt2);
		possibleAnswers.add(0, alt3);
		possibleAnswers.add(0, answer);

		createQuestion();
	}

	public void createQuestion() {
		String correctAnswer=possibleAnswers.get(0);
		shuffleQuestions(possibleAnswers);
		System.out.println("Question " + qCount );
		System.out.println();
		System.out.println(qArray.get(0));
		System.out.println();
		System.out.println("A: " +possibleAnswers.get(0));
		System.out.println();
		System.out.println("B: " +possibleAnswers.get(1));
		System.out.println();
		System.out.println("C: " +possibleAnswers.get(2));
		System.out.println();
		System.out.println("D: " +possibleAnswers.get(3));
		System.out.println();
		System.out.println("The Correct Answer is: " + correctAnswer);
		
	}

	public ArrayList<String> shuffleQuestions(ArrayList<String> possibleAnswers2) {
		Collections.shuffle(possibleAnswers);
		return possibleAnswers2;

	}

}
