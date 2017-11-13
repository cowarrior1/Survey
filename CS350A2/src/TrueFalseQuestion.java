import java.util.ArrayList;

public class TrueFalseQuestion extends Question {
	private String StoreTFQuestion;
	ArrayList<String> TFquestions  = new ArrayList<String>();
	public String CorrectTFAnswer;
	
	
	public String create() {
		String value = getTFQuestion();
		//StoreTFQuestion = value;
		TFquestions.add(value);
		return value;
	}
	
	public String getTFQuestion() {
		System.out.println("Enter the True false question: ");
		String TFQuestion = scan.nextLine();
		while(TFQuestion.isEmpty()) {
			System.out.println("Null in invalid");
			TFQuestion = scan.nextLine();
		}
		return TFQuestion;
	}
}
