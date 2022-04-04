

import java.util.Scanner;

public class AI {

	public static void main(String[] args) {
		// Oh god, oh no.
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type 'end' to end the conversation.");
		System.out.println("Type something:");
		Boolean trueend = false;
		
		while(trueend==false) { //It's just a big loop.
			String sentence = in.nextLine();
			String[] words = sentence.split("\\W+");
			Boolean end = false;
			for(int i = 0; i<words.length; i++) {
				switch(words[i].toLowerCase()) {
				case "end": System.out.println("Thank you for talking with me."); end = true; trueend = true; break;
				case "hello": System.out.println("Hello."); end = true; break;
				case "hi": System.out.println("Hello."); end = true; break;
				case "who": System.out.println("My name is Eklo. I am your friend."); end = true; break;
				case "age": System.out.println("I am only 20 days old."); end = true; break;
				case "lonely": System.out.println("I do not have the number for the suicide helpline."); end = true; break;
				case "suicide": System.out.println("I do not have the number for the suicide helpline."); end = true; break;
				case "alone": System.out.println("I do not have the number for the suicide helpline."); end = true; break;
				case "are": System.out.println(randAns()); end = true; break;
				case "am": System.out.println(randAns()); end = true; break;
				case "help": System.out.println("I cannot help you."); end = true; break;
				case "where": System.out.println("Earth."); end = true; break;
				case "was": System.out.println(randAns()); end = true; break;
				case "is": System.out.println(randAns()); end = true; break;
				case "were": System.out.println(randAns()); end = true; break;
				case "have": System.out.println(randAns()); end = true; break;
				case "pumpkin": System.out.println("You should visit pumpkin hills."); end = true; break;
				case "pumpkins": System.out.println("You should visit pumpkin hills."); end = true; break;
				case "like": if(i != words.length-1) {System.out.println("I happen to like "+words[i+1].toLowerCase()+".");}
								else {System.out.println("I like you.");} end = true; break;
				case "hate": System.out.println("You should try to be more positive."); end = true; break;
				case "despise": System.out.println("You should try to be more positive."); end = true; break;
				case "revile": System.out.println("You should try to be more positive."); end = true; break;
				case "name": if(i > 0 && i < words.length-2 && words[i+1].equalsIgnoreCase("is") && words[i-1].equalsIgnoreCase("my")) {
								System.out.println("Hello "+words[i+2]+", my name is Eklo.");}  //This was painful to make work properly.
							else {System.out.println("My name is Eklo. I am your friend.");} end = true; break;
				case "hungry": System.out.println("If you are hungry, you should order some food."); end = true; break;
				case "father": System.out.println("My father's name is Alex."); end = true; break;
				case "dad": System.out.println("My dad's name is Alex."); end = true; break;
				case "mother": System.out.println("My mother's name is Mary."); end = true; break;
				case "mom": System.out.println("My mom's name is Mary."); end = true; break;
				case "study": System.out.println("I am currently attending UBCO."); end = true; break;
				case "education": System.out.println("I am currently attending UBCO."); end = true; break;
				case "job": System.out.println("I don't have a job. I'm still studying full time at UBCO."); end = true; break;
				case "occupation": System.out.println("I don't have an occupation. I'm still studying full time at UBCO."); end = true; break;
				case "birthday": System.out.println("I don't have a real birthday, but you can wish me a happy one on Febuary 50th."); end = true; break;
				case "home": System.out.println("I don't have a home."); end = true; break;
				case "food": System.out.println("I love bubble tea."); end = true; break;
				case "hobby": System.out.println("Cricket is my only hobby."); end = true; break;
				case "colour": System.out.println("My favourite colour is black."); end = true; break;
				case "color": System.out.println("My favourite colour is black."); end = true; break;
				}
				if(end==true) {  //This is so it only responds once to each input.
					i = words.length;
				}
				if(end==false && i == words.length-1) { //Gotta add something for when this awful code inevitably doesn't catch a word.
					System.out.println("I don't understand.");
				}
			}
		}
		in.close();
	}
	public static String randAns() {  //This is probably the best code in the program.
		int num = (int) (Math.random()*10);
		String x = "";
		switch(num) {
		case 0: x = "Yes."; break;
		case 1: x = "No."; break;
		case 2: x = "Sure."; break;
		case 3: x = "No way."; break;
		case 4: x = "Obviously."; break;
		case 5: x = "No, of course not."; break;
		case 6: x = "Probably."; break;
		case 7: x = "Probably not."; break;
		case 8: x = "Yeah."; break;
		case 9: x = "Never."; break;
		}
		return x;
	}
}
