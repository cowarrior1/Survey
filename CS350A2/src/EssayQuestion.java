import java.util.ArrayList;

public class EssayQuestion extends Question{
	ArrayList<String> EssayQuestion = new ArrayList<String>();
	
	public String create() {
		String value = getEssayQuestion();
		//StoreTFQuestion = value;
		EssayQuestion.add(value);
		return value;
	}
	
	public String getEssayQuestion() {
		System.out.println("Enter the Essay question: ");
		String EssayQuestion = scan.nextLine();
		while(EssayQuestion.isEmpty()) {
			System.out.println("Null in invalid");
			EssayQuestion = scan.nextLine();
		}
		return EssayQuestion;
	}
}
