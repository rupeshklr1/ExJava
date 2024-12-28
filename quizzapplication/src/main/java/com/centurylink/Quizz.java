package com.centurylink;
import java.util.*;

public class Quizz {
	static final int totalOptions = 4;
	static final int MAX_QUESTION = 5;
	static final int LineLimit = 2;
	static final int LineOption = 3;
	// static final Scanner sc = new Scanner(System.in);
	
	public int SelectLifeLine(int lifeLine, Question q, Scanner sc) {
		int flag = 0;
		String ans = null;
		switch (lifeLine) {
			// 50-50
			case 1:
				System.out.println("50-50 LifeLine");
				int count = 0;
				Random rand = new Random();
				Set<String> newKeyList = new HashSet<>(q.options.keySet());
				newKeyList.remove(q.answer);
				int rand_int = rand.nextInt(newKeyList.size());
				String optionToRemove = (String) newKeyList.toArray()[rand_int];
				List<String> AnswerList = new ArrayList<String>();
				AnswerList.add(q.answer);
				AnswerList.add(optionToRemove);
				System.out.print("NEWList: ");
				for (String i : AnswerList) {
					System.out.print(i + ")" + q.options.get(i));
				}
				System.out.println("\nEnter your answer: 50-50-");
				// Scanner sc = new Scanner(System.in);
				ans = sc.nextLine();
				if (ans.equals(q.answer)) {
					flag = 1;
					System.out.println("Correct Answer");
				}
				break;
			case 2: // Audience Poll
				System.out.println("Audience Poll LifeLine");
				int[] audiencePoll = new int[totalOptions];
				int total = 100;
				Random rand1 = new Random();
				for (int i = 0; i < totalOptions; i++) {
					if (q.answer.equals(String.valueOf(i))) {
						audiencePoll[i] = rand1.nextInt(total);
						total -= audiencePoll[i];
					} else {
						audiencePoll[i] = rand1.nextInt(total);
						total -= audiencePoll[i];
					}
				}
				for (int i = 0; i < totalOptions; i++) {
					System.out.println(
							(i + 1) + " ) " + audiencePoll[i] + "% (" + q.options.get(String.valueOf(i + 1)) + ")");
				}
				System.out.println("Enter your answer: Audience Poll ");
				// Scanner sc1 = new Scanner(System.in);
				ans = sc.nextLine();
				if (ans.equals(q.answer)) {
					flag = 1;
					System.out.println("Correct Answer");
				}
				break;
			case 3: // Double Dip
				System.out.println("Double Dip LifeLine");
				int count1 = 0;
				// Scanner sc2 = new Scanner(System.in);
				while (count1 < 2) {
					System.out.println("Enter your answer: DD");
					ans = sc.nextLine();
					if (ans.equals(q.answer)) {
						flag = 1;
						System.out.println("Correct Answer");
						break;
					}
					count1++;
				}
				break;
			default:
				System.out.println("Quitting LifeLine");
				break;
		}
		if (flag == 0) {
			System.out.println("User answer is wrong with life line");
			return 0;
		} else {
			System.out.println("User answer is correct with life line");
			return 1;
		}
	}
	
	// static final int MAX_QUESTION = 4;
	class Question {
		private final String optionPer = " ) ";
		private final String optionpost = " \t";
		
		private int queIndex;
		private String question;
		private HashMap<String, String> options;
		private String answer;
		
		public int getQueIndex() {
			return queIndex;
		}
		
		public void setQueIndex(int queIndex) {
			this.queIndex = queIndex;
		}
		
		public void setQuestion(String question) {
			this.question = question;
		}
		
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		
		public void setOptions(HashMap<String, String> options) {
			this.options = options;
		}
		
		Question(int queIndex, String question, HashMap<String, String> options, String answer) {
			this.queIndex = queIndex;
			this.question = question;
			this.options = options;
			this.answer = answer;
		}
		
		Question() {
			this.queIndex = 0;
			this.question = "";
			this.options = new HashMap<String, String>();
			this.answer = "";
		}
		
		Question(String question, String answer) {
			this.question = question;
			this.answer = answer;
		}
		
		public String getQuestion() {
			return question;
		}
		
		public String getAnswer() {
			return answer;
		}
		
		public String getOptions() {
			String temOption = "";
			// temOption = "1 " + optionPer + options.get(String.valueOf(answer)) +
			// optionpost;
			for (int j = 0; j < totalOptions; j++) {
				temOption += j + 1 + optionPer + options.get(String.valueOf(j + 1)) + optionpost;
			}
			return temOption;
		}
		
		@Override
		public String toString() {
			return "\n" + getQuestion() + "\n" + getOptions() + "\n";
		}
	}
	
	class QuestionSet {
		private ArrayList<Question> questionSet;
		private ArrayList<Question> userQuestionSet;
		
		QuestionSet() {
			questionSet = new ArrayList<Question>();
			init();
			setUserQuestionSet();
		}
		
		private void init() {
			questionSet.add(new Question(1, "What is the capital of India?", new HashMap<String, String>() {
				{
					put("1", "Mumbai");
					put("2", "Delhi");
					put("3", "Kolkata");
					put("4", "Chennai");
				}
			}, "1"));// 2
			questionSet.add(new Question(2, "What is the capital of Australia?", new HashMap<String, String>() {
				{
					put("1", "Sydney");
					put("2", "Melbourne");
					put("3", "Canberra");
					put("4", "Perth");
				}
			}, "1"));// 3
			questionSet.add(new Question(3, "What is the capital of USA?", new HashMap<String, String>() {
				{
					put("1", "New York");
					put("2", "Washington DC");
					put("3", "Los Angeles");
					put("4", "Chicago");
				}
			}, "1"));// 2
			questionSet.add(new Question(4, "What is the capital of UK?", new HashMap<String, String>() {
				{
					put("1", "Manchester");
					put("2", "London");
					put("3", "Birmingham");
					put("4", "Liverpool");
				}
			}, "1"));// 2
			questionSet.add(new Question(5, "What is the capital of France?", new HashMap<String, String>() {
				{
					put("1", "Paris");
					put("2", "Lyon");
					put("3", "Marseille");
					put("4", "Toulouse");
				}
			}, "1"));// 1
			questionSet.add(new Question(6, "What is the capital of Germany?", new HashMap<String, String>() {
				{
					put("1", "Berlin");
					put("2", "Hamburg");
					put("3", "Munich");
					put("4", "Cologne");
				}
			}, "1"));// 1
			questionSet.add(new Question(7, "What is the capital of Japan?", new HashMap<String, String>() {
				{
					put("1", "Tokyo");
					put("2", "Osaka");
					put("3", "Kyoto");
					put("4", "Yokohama");
				}
			}, "1"));// 1
		}
		
		private void setUserQuestionSet() {
			userQuestionSet = new ArrayList<Question>();
			Random rand = new Random();
			int i = 0;
			while (i < MAX_QUESTION) {
				int rand_int = rand.nextInt(questionSet.size());
				if (!userQuestionSet.contains(questionSet.get(rand_int))) {
					userQuestionSet.add(questionSet.get(rand_int));
					i++;
				}
			}
		}
		
		public ArrayList<Question> getUserQuestionSet() {
			return userQuestionSet;
		}
		
		public void setUserQuestionSet(ArrayList<Question> userQuestionSet) {
			this.userQuestionSet = userQuestionSet;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
	}
	
	enum LastQuestion {
		CORRECT,
		INCORRECT,
		QUIT,
		NONSELETED
	}
	
	public static void main(String[] args) {
		System.out.println("Start!!!");
		Quizz q = new Quizz();
		QuestionSet qs = q.new QuestionSet();
		ArrayList<Question> userQuestionSet = qs.getUserQuestionSet();
		// System.out.println("Question Set: " + userQuestionSet);
		int userScore = 0;
		Scanner sc = new Scanner(System.in);
		int userLifeLine = 0;
		int currentQuestion = 1;
		System.out.println("\n\n\n*******************************\n\n\nWelcome to the Quiz Game");
		LastQuestion lastQuestion = LastQuestion.NONSELETED;
		for (Question q1 : userQuestionSet) {
			currentQuestion += 1;
			System.out.println(q1);
			System.out.println("Select option 1)LifeLine 2)Submitter Answer 3)Quit");
			String seOP = sc.nextLine();
			System.out.println("++++++++seOP: " + seOP);
			if (seOP.equals("1") && userLifeLine < LineLimit) {
				userLifeLine += 1;
				System.out.println("Select LifeLine 1)50-50 2)Audience Poll 3)Double Dip");
				int lifeLine = sc.nextInt();
				int valueSel = q.SelectLifeLine(lifeLine, q1, sc);
				if (valueSel == 1) {
					userScore++;
				} else {
					break;
				}
			} else if (seOP.equals("2") || userLifeLine == LineLimit) {
				if (userLifeLine == LineLimit) {
					System.out.println("You have used all the lifelines");
				}
				System.out.println("Enter your answer: ");
				String ans = sc.nextLine();
				System.out.println("Your Answer: " + ans + q1.answer);
				if (ans.equals(q1.answer)) {
					System.out.println("Correct Answer");
					userScore++;
					lastQuestion = LastQuestion.CORRECT;
				} else {
					System.out.println("Incorrect Answer");
					lastQuestion = LastQuestion.INCORRECT;
					break;
				}
			} else {
				System.out.println("Quitting the game");
				lastQuestion = LastQuestion.QUIT;
				break;
			}
		}
		if (lastQuestion == LastQuestion.CORRECT) {
			System.out.println("You have won the game");
			System.out.println("Your Score: " + userScore);
		} else if (lastQuestion == LastQuestion.INCORRECT) {
			System.out.println("You have lost the game");
			System.out.println("Your Score: will be lost" + (currentQuestion - 1));
		} else {
			System.out.println("You have quit the game");
			System.out.println("Your Score: will be lost" + (currentQuestion - 1));
		}
	}
	
}