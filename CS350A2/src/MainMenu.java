import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {


	public static Survey survey;
	public static Test test;

	public MainMenu() {
	}
	
	public void Menu() {
		int intChoice;
		boolean Exit = false;
		while (Exit == false) {
			String MainMenu = "-----Menu1-------\n" + "Enter the option you want to use\n" + "1) Create a new Survey\n"
					+ "2) Create a new Test \n" + "3) Display a Survey\n" + "4) Display a Test \n"
					+ "5) Load a Survey\n" + "6) Load a Test \n" + "7) Save a Survey\n" + "8) Save a Test \n"
					+ "9) Quit";
			System.out.println(MainMenu);
			Scanner scan = new Scanner(System.in);
			String choice = scan.nextLine();
			FileSerialHandler fsh = new FileSerialHandler();

			if (isInt(choice)) {
				intChoice = Integer.parseInt(choice);
			} else {
				System.out.println("Enter choice as integer");
				intChoice = -9999;
			}
			switch (intChoice) {
			case 1: {
				Survey createdsurvey = new Survey();
				survey = createdsurvey;
				System.out.println("Enter the survey name: ");
				survey.SurveyName = scan.nextLine();
				while (survey.SurveyName.isEmpty()) {
					System.out.println("Null is not valid");
					survey.SurveyName = scan.nextLine();
				}
				System.out.println("Your file: " + survey.SurveyName + " is ready to use.");

				boolean create = true;

				while (create) {
					String Menu2 = "Menu 2\n" + "		1) Add a new T/F question\n"
							+ "		2) Add a new multiple choice question\n"
							+ "		3) Add a new short answer question\n" + "		4) Add a new essay question\n"
							+ "		5) Add a new ranking question\n" + "		6) Add a new matching question\n"
							+ "		7) Go to MainMenu\n";

					System.out.println(Menu2);
					choice = scan.nextLine();
					while (choice.isEmpty()) {
						System.out.println("Null is not valid");
						choice = scan.nextLine();
					}
					if (isInt(choice)) {
						intChoice = Integer.parseInt(choice);
					} else {
						System.out.println("Enter choice as integer");
						intChoice = -9999;
					}
					switch (intChoice) {
					case 1: {
						TrueFalseQuestion truefalsequestion = new TrueFalseQuestion();
						String test1 = truefalsequestion.create();
						survey.TFQuestions.add(test1);
						break;
					}
					case 2: {
						MultipleChoiceQuestion mcqquestion = new MultipleChoiceQuestion();
						mcqquestion.create();
						ArrayList<String> new1 = mcqquestion.multiplechoicequestion;
						ArrayList<String> mcqanswer = mcqquestion.multiplechoiceanswers;
						survey.MCQQuestions.addAll(new1);
						survey.mcqoptions.addAll(mcqanswer);

						break;
					}
					case 3: {
						ShortAnswerQuestion shortanswerquestion = new ShortAnswerQuestion();

						String shortanswer = shortanswerquestion.create();
						survey.ShortAnswerQuestions.add(shortanswer);
						break;
					}
					case 4: {
						EssayQuestion essayquestion = new EssayQuestion();
						String essay = essayquestion.create();
						survey.Essayquestions.add(essay);
						break;
					}
					case 5: {
						RankingQuestion ranking = new RankingQuestion();
						ranking.create();
						ArrayList<String> new1 = ranking.rankingquestion;
						ArrayList<String> choices = ranking.rankingchoices;
						survey.RankingQuestions.addAll(new1);
						survey.rankingoptions.addAll(choices);
						break;
					}
					case 6: {
						MatchingQuestion matchingquestion = new MatchingQuestion();
						matchingquestion.create();
						ArrayList<String> new1 = matchingquestion.matchingquestion;
						ArrayList<String> choices = matchingquestion.matchinganswers;
						survey.MatchingQuestions.addAll(new1);
						survey.matchingoptions.addAll(choices);
						break;
					}
					case 7: {
						create = false;
					}
					}
				}
				break;
			}
			case 2: {
				Test createtest = new Test();
				test = createtest;
				System.out.println("Enter the test name: ");
				test.SurveyName = scan.nextLine();
				while (test.SurveyName.isEmpty()) {
					System.out.println("Null is not valid");
					test.SurveyName = scan.nextLine();
				}
				System.out.println("Your file: " + test.SurveyName + " is ready to use.");

				boolean create = true;

				while (create) {
					String Menu2 = "Menu 2\n" + "		1) Add a new T/F question\n"
							+ "		2) Add a new multiple choice question\n"
							+ "		3) Add a new short answer question\n" + "		4) Add a new essay question\n"
							+ "		5) Add a new ranking question\n" + "		6) Add a new matching question\n"
							+ "		7) Go to MainMenu\n";

					System.out.println(Menu2);
					choice = scan.nextLine();
					while (choice.isEmpty()) {
						System.out.println("Null is not valid");
						choice = scan.nextLine();
					}
					if (isInt(choice)) {
						intChoice = Integer.parseInt(choice);
					} else {
						System.out.println("Enter choice as integer");
						intChoice = -9999;
					}
					switch (intChoice) {
					case 1: {
						TrueFalseQuestion truefalsequestion = new TrueFalseQuestion();
						String test1 = truefalsequestion.create();
						System.out.println("Enter correct answer (type \"true\" or \"false\"): ");
						String tOrF = scan.nextLine();
						if (!(tOrF.equals("true") || (tOrF.equals("false")))) {
							System.out.println("invalid answer, retry...");
							break;
						}
						truefalsequestion.CorrectTFAnswer = tOrF;
						test.TFCorrect.add(tOrF);
						test.TFQuestions.add(test1);
						break;

					}
					case 2: {

						MultipleChoiceQuestion mcq = new MultipleChoiceQuestion();
						mcq.create();
						ArrayList<String> new1 = mcq.multiplechoicequestion;
						ArrayList<String> mcqanswer = mcq.multiplechoiceanswers;
						test.MCQQuestions.addAll(new1);
						test.mcqoptions.addAll(mcqanswer);
						System.out.println("Enter correct answer (indicate which number it is): ");
						String answer = scan.nextLine();
						if (isInt(answer)) {
							int i = mcq.correctAnswer;
							i = Integer.parseInt(answer);
							test.MCQCorrect.add(i);
						} else {
							System.out.println("Invalid answer, try again...");
							break;
						}
						break;
					}
					case 3: {
						ShortAnswerQuestion shortanswequestion = new ShortAnswerQuestion();
						String shortanswer = shortanswequestion.create();
						System.out.println("Enter answer: ");
						String answer = scan.nextLine();
						shortanswequestion.correctStringAnswer = answer;
						test.ShortAnswerQuestions.add(shortanswer);
						test.SACorrect.add(answer);
						break;
					}
					case 4: {
						EssayQuestion essayquestion = new EssayQuestion();
						String essay = essayquestion.create();
						test.Essayquestions.add(essay);
						break;
					}
					case 5: {
						RankingQuestion ranking = new RankingQuestion();
						ranking.create();
						ArrayList<String> new1 = ranking.rankingquestion;
						ArrayList<String> choices = ranking.rankingchoices;
						test.RankingQuestions.addAll(new1);
						test.rankingoptions.addAll(choices);
						break;
					}
					case 6: {
						MatchingQuestion matchingquestion = new MatchingQuestion();
						matchingquestion.create();
						ArrayList<String> new1 = matchingquestion.matchingquestion;
						ArrayList<String> choices = matchingquestion.matchinganswers;
						test.MatchingQuestions.addAll(new1);
						test.matchingoptions.addAll(choices);
						break;
					}
					case 7: {
						create = false;
					}
					}
				}
				break;

			}
			case 3: {
				survey.DisplaySurvey();
				break;
			}

			case 4: {
				test.DisplaySurvey();
				System.out.println("The correct answers are: ");
				System.out.println(test.TFCorrect);
				System.out.println(test.MCQCorrect);
				System.out.println(test.SACorrect);
				break;
			}

			case 5: {
				System.out.println("Enter survey name to load: ");
				choice = scan.nextLine();
				fsh.load(choice);
				System.out.println(survey.SurveyName + " loaded.");
				break;
			}
			
			
			case 7: {
				if (survey == null) {
					System.out.println("No survey to save.");
				} else {
					fsh.save(survey);
					System.out.println(survey.SurveyName + " saved.");
				}
				break;
				}
			
			case 9: {
				Exit = true;
				break;
			}
			default: {
				System.out.println("Invalid Choice. Please start over.");
				break;
			}
			}
		}
	}

	private boolean isInt(String choice) {
		try {
			Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("Illegal Argument");
			Menu();
		}
		return true;
	}

}