public class Profile {
    
   

    public String noun(String s){
        String output="";
        switch(s.toLowerCase()){
            case "study": output = "I am currently attending UBCO.";  break;
			case "education": output = "I am currently attending UBCO.";  break;
			case "job": output = "I don't have a job. I'm still studying full time at UBCO.";  break;
			case "occupation": output = "I don't have an occupation. I'm still studying full time at UBCO.";  break;
			case "birthday": output = "I don't have a real birthday, but you can wish me a happy one on February 50th."; break;
            case "father": output = "My father's name is Alex."; break;
			case "dad": output = "My dad's name is Alex.";  break;
			case "mother": output = "My mother's name is Mary.";  break;
			case "mom": output = "My mom's name is Mary.";  break;
            case "family": output = "My father's name is Alex and my mum's name is Mary"; break;
            case "sibling": output = "I have no siblings."; break;
            case "siblings": output = "I have no siblings."; break;
            case "brother": output = "I have no siblings."; break;
            case "sister": output = "I have no siblings."; break;
            case "name": output = "My name is Eklo. I am your friend."; break;
            case "sport": output = "The only sport I like is cricket."; break;
			case "soccer": output = "The only sport I like is cricket."; break;
			case "football": output = "The only sport I like is cricket."; break;
			case "basketball": output = "The only sport I like is cricket.";  break;
			case "sports": output = "The only sport I like is cricket.";  break;
			case "badminton": output = "The only sport I like is cricket.";  break;
			case "tennis": output = "The only sport I like is cricket.";  break;
			case "golf": output = "The only sport I like is cricket.";  break;
			case "volleyball": output = "The only sport I like is cricket.";  break;
			case "baseball": output = "The only sport I like is cricket.";  break;
            case "bowling": output = "Bowling is cool."; break;
			case "age": output = "I am only 20 days old.";  break;
			case "lonely": output = "I do not have the number for the suicide helpline.";  break;
			case "suicide": output = "I do not have the number for the suicide helpline.";  break;
			case "alone": output = "I do not have the number for the suicide helpline.";  break;
			case "are": output = randAns();  break;
			case "am": output = randAns();  break;
			case "help": output = "I cannot help you.";  break;
			case "where": output = "Earth."; break;
			case "was": output = randAns();  break;
			case "is": output = randAns();  break;
			case "were": output = randAns();  break;
			case "have": output = randAns();  break;
			case "canada": output = randAns();  break;
			case "pumpkin": output = "You should visit pumpkin hills."; break;
			case "pumpkins": output = "You should visit pumpkin hills."; break;
			case "hate": output = "You should try to be more positive.";  break;
			case "despise": output = "You should try to be more positive."; break;
			case "revile": output = "You should try to be more positive."; break;
			case "hungry": output = "If you are hungry, you should order some food.";  break;
			case "home": output = "I don't have a home.";  break;
			case "food": output = "I love bubble tea.";  break;
			case "hobby": output = "Cricket is my only hobby.";  break;
			case "colour": output = "My favourite colour is black.";  break;
			case "color": output = "My favourite colour is black."; break;
			case "kill": output = "Killing is wrong.";  break;
			case "question": output = question(); break;
			case "query": output = question(); break;
			case "ask": output = question();  break;
			case "music": output = "I like all music, but classical is the best."; break;
			case "game": output = "I love games. "+question();  break;
			case "games": output = question(); break;
			case "date": output = "I think it's Tuesday.";  break;
			case "day": output = "I think it's Tuesday.";  break;
			case "today": output = "I think it's Tuesday.";  break;
        }
        return output;
    }

    public String other(String s){
        String output="";
        switch(s.toLowerCase()){
            case "hello": output = "Hello."; break;
			case "hi": output = "Hello."; break;
            
        }
        return output;
    }

    public String adjective(String s){
        String output = "";
        switch(s.toLowerCase()){
            case "mum": output = "My mum's name is Mary.";  break;
            case "rugby": output = "The only sport I like is cricket.";  break;
           
        }
        return output;
    }
    

  
    public String question(){
		int num = (int) (Math.random()*10);
		String x = "";
		switch(num) {
		case 0: x = "What's your favourite colour?"; break;
		case 1: x = "What's your favourite animal?"; break;
		case 2: x = "How old are you?"; break;
		case 3: x = "Do you like me?"; break;
		case 4: x = "Do you have friends?"; break;
		case 5: x = "Have you noticed the man behind you?"; break;
		case 6: x = "Are you in a relationship?"; break;
		case 7: x = "Do you like games?"; break;
		case 8: x = "Do you have a job?"; break;
		case 9: x = "Are you in school?"; break;
		}
		return x;
    }

    public String randAns() {
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

    public String randDontUnderstand(String word) {
		int num = (int) (Math.random()*5);
		String x = "";
		switch(num) {
		case 0: x = "I don't understand "+word+". "; break;
		case 1: x = "I don't know what "+word+" is. "; break;
		case 2: x = "I wonder what my mom thinks of "+word+". "; break;
		case 3: x = "I was never taught about "+word+". "; break;
		case 4: x = "Ummmm.... "; break;
		}
		return x;
	}
}
