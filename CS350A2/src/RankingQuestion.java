import java.util.ArrayList;

public class RankingQuestion extends Question {
	String storeMultipleChoiceQuestion;
	String Option;
	
	ArrayList<String> rankingchoices = new ArrayList<String>();
	
	public String StoreRankingQuestion() {
		System.out.println("Enter the Ranking question: ");
		String RankingQuestion = scan.nextLine();
		while(RankingQuestion.isEmpty()) {
			System.out.println("Null in invalid");
			RankingQuestion = scan.nextLine();
		}
		return RankingQuestion;
	}
	
	public void create() {
		String value = StoreRankingQuestion();
		rankingquestion.add(value);
		try {
			System.out.println("Enter the number of choices for your ranking question:");
			int NumberOfChoices = scan.nextInt();
			for(int i=1; i <= NumberOfChoices; i++){
				System.out.println("Enter prompt " + i);
				scan.nextLine();
				Option = scan.nextLine();
				rankingchoices.add(Option);
				System.out.println(rankingchoices);
			}
		} catch (Exception e) {
			System.out.println("Use integer greater than 0.");
		}
	}
}
