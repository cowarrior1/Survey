import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Survey implements Serializable {
	public String SurveyName;
	ArrayList<String> TFQuestions = new ArrayList<String>();
	ArrayList<String> MCQQuestions = new ArrayList<String>();
	ArrayList<String> ShortAnswerQuestions = new ArrayList<String>();
	ArrayList<String> Essayquestions = new ArrayList<String>();
	ArrayList<String> MatchingQuestions = new ArrayList<String>();
	ArrayList<String> RankingQuestions = new ArrayList<String>();
	ArrayList<String> mcqoptions = new ArrayList<String>();
	ArrayList<String> rankingoptions = new ArrayList<String>();
	ArrayList<String> matchingoptions = new ArrayList<String>();
	
//	public Survey(ArrayList<String> tfQuestions, ArrayList<String> mcqQuestions, ArrayList<String> shortQuestions, ArrayList<String> essayQuestions,
//			ArrayList<String> matchingQuestions, ArrayList<String> rankingQuestions) {
//		this.TFQuestions = tfQuestions;
//		this.MCQQuestions = mcqQuestions;
//		this.ShortAnswerQuestions = shortQuestions;
//		this.Essayquestions = essayQuestions;
//		this.MatchingQuestions = matchingQuestions;
//		this.RankingQuestions = rankingQuestions;
//	}
//	
	
		
	public void DisplaySurvey() {
		System.out.println("True/False Questions");
		for (int i = 0; i < TFQuestions.size(); i++) {
            System.out.println(TFQuestions.get(i));
            }
		
		System.out.println("Multiple Choice Question");
		for (int i = 0; i < MCQQuestions.size(); i++) {
            System.out.println(MCQQuestions.get(i));
            }
		System.out.println("Multiple Choice Options");
		for (int i = 0; i < mcqoptions.size(); i++) {
            System.out.println(mcqoptions.get(i));
            }
		System.out.println("Short Answer Question");
		for (int i = 0; i < ShortAnswerQuestions.size(); i++) {
            System.out.println(ShortAnswerQuestions.get(i));
            }
		System.out.println("Essay Question");
		for (int i = 0; i < Essayquestions.size(); i++) {
            System.out.println(Essayquestions.get(i));
            }
		System.out.println("Ranking Question");
		for (int i = 0; i < RankingQuestions.size(); i++) {
            System.out.println(RankingQuestions.get(i));
            }
		System.out.println("Ranking Options");
		for (int i = 0; i < rankingoptions.size(); i++) {
            System.out.println(rankingoptions.get(i));
            }
		System.out.println("Matching Question");
		for (int i = 0; i < MatchingQuestions.size(); i++) {
            System.out.println(MatchingQuestions.get(i));
            }
		System.out.println("Matching Options");
		for (int i = 0; i < matchingoptions.size(); i++) {
            System.out.println(matchingoptions.get(i));
            }
		}
	}
