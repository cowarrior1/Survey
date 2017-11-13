import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question {
	
	
	String storeMultipleChoiceQuestion;
	String Option;
	ArrayList<String> multiplechoicequestion = new ArrayList<String>();
	ArrayList<String> multiplechoiceanswers = new ArrayList<String>();
	public int correctAnswer;
	
	public String StoreMultipleChoiceQuestion() {
		System.out.println("Enter the Multiple question: ");
		String MultipleChoiceQuestion = scan.nextLine();
		while(MultipleChoiceQuestion.isEmpty()) {
			System.out.println("Null in invalid");
			MultipleChoiceQuestion = scan.nextLine();
		}
		return MultipleChoiceQuestion;
	}
	
	
	public void create() {
		String value = StoreMultipleChoiceQuestion();
		multiplechoicequestion.add(value);
		try {
			System.out.println("Enter the number of choices for your multiple choice question:");
			int NumberOfChoices = scan.nextInt();				
				for(int i=1; i <= NumberOfChoices; i++){
					System.out.println("Enter prompt " + i);
					scan.nextLine();
					Option = scan.nextLine();
					multiplechoiceanswers.add(Option);
					System.out.println(multiplechoiceanswers);
				}
			}catch (Exception e) {
			System.out.println("Use integer greater than 0.");
			}
	}
}
