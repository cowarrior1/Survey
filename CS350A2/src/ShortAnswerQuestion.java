import java.util.ArrayList;

public class ShortAnswerQuestion extends Question{
	
	ArrayList<String> shortanswerquestion = new ArrayList<String>();
	public String correctStringAnswer;
	
	public String create() {
		String value = getShortAnswerQuestion();
		//StoreTFQuestion = value;
		shortanswerquestion.add(value);
		return value;
	}
	
	public String getShortAnswerQuestion() {
		System.out.println("Enter the Short Answer question: ");
		String ShortAnswerQuestion = scan.nextLine();
		while(ShortAnswerQuestion.isEmpty()) {
			System.out.println("Null in invalid");
			ShortAnswerQuestion = scan.nextLine();
		}
		return ShortAnswerQuestion;
	}

}
