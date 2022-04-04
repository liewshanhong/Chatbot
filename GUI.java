
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultStyledDocument.ElementSpec;
import static org.junit.Assert.*;				
import org.junit.Test;	

public class GUI {

	public GUI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Enter");
		JTextField tf = new JTextField(30);
		JTextArea jArea = new JTextArea();
		button.setBounds(200,50,100,20);
		panel.add(jArea);
		panel.add(tf);
		panel.add(button);
		
		frame.setSize(300, 300);
		frame.add(new JScrollPane(jArea),BorderLayout.CENTER);
		frame.add(panel,BorderLayout.PAGE_END);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chat");
		frame.pack();
		frame.setVisible(true);

		jArea.append("Type 'end' to end the conversation.\nType something:\n");
		
	
	button.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String content=tf.getText();
			jArea.append("User: "+content+"\n");
		    jArea.append("AI: "+words(content)+"\n");
		}
	});
	}

	public static String words(String sentence) {
		String x = sentence.toLowerCase();
		boolean b = false;
		x = x.replaceAll("\\p{Punct}", "");
		if(x.contains("translate")){
			b = true;
		}
		API api = new API();
		String wolfram ="";
		wolfram = api.Wolfram(sentence);
		if(wolfram.length() != 0){
			return wolfram;
		}
		Process p = new Process();
		Process p1 = new Process();
		Process p2 = new Process();
		Process p3 = new Process();
		
		Scanner in  = new Scanner(x);
		ArrayList<String> a = new ArrayList<String>();
		
		while(in.hasNext()){
			String z = in.next();
			a.add(z);
		}
		in.close();
		
		String[] str = p.LEMMA(x);
		String[] str1 = p1.POS(x);
		String[] str2= p2.NER(x);
		ArrayList<String> str3= p3.CoreRes(x);

		
		
		
		String y="";
		for(int i = 0; i< a.size();i++){
			System.out.println(str1[i]);
			if(str[i].contains("be")){
				a.set(i,"");
			}

			if(str1[i].contains("NN") ||str1[i].contains("JJ")||str1[i].contains("UH")||str1[i].contains("NNP")){
				y = a.get(i);
				
			}else{
				a.set(i,"");
			}

			if(str2[i].contains("LOCATION")|| str2[i].contains("ORGANISATION")){
				y = a.get(i);
				break;
			}
			
			//Cores focuses on entity reference and entity appears first in the ArrayList which is most likely the subject of question
			// if variable y does not contain entity set it to entity
			String[] str4 = p1.POS(str3.get(0));
			if(str4[0].contains("NN")){
				y = str3.get(0);
				break;
			}
		}
		String output="";
		if(b == true){
			output = api.translate(y);
		}else{
				//initialize Profile object
			Profile pro = new Profile();
			
			String set1 = pro.noun(y);
			String set2 = pro.other(y);
			String set3 = pro.adjective(y);

			//loop through each method incase of mislabelling by Part-of-speech tagging
			if(set1 != ""){
				output = set1;
			}else if(set2 != ""){
				output = set2;
			}else if( set3 != ""){
				output=set3;
			}else{
				output = randDontUnderstand(y);
			}
		}
		
		

		return output;
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
	public static String question() {  //Asks a question.
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
	public static String randDontUnderstand(String word) {  //This works. I hope.
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
	public static void main(String[] args) {
		new GUI();
	}
	
   @Test
	public void testGUI()
	{
		assertEquals("My name is Eklo. I am your friend.",words("Hi my name is Jafar"));
		assertEquals("The only sport I like is cricket.",words("Do you like sports?"));
		assertEquals("The only sport I like is cricket.",words("soccer?"));
	}

    @Test
    public void testRandom(){
       String[] arr =new String[] {"Yes.","No.","Sure.","No way.","Obviously.","No, of course not.","Probably.","Probably not.","Yeah.","Never."}; 
       String test = words("Canada");
         assertEquals(true, search(arr, test));
         
    }

    @Test
    public void testQuestion(){
       String[] arr =new String[] {"Are you in school?","Do you have a job?","Do you like games?","Are you in a relationship?","Have you noticed the man behind you?", "Do you have friends?", "Do you like me?", "How old are you?", "What's your favourite animal?", "What's your favourite colour?"}; 
       String test = words("games");
         assertEquals(true, search(arr, test));
         
    }






    private static boolean search(String[] arr, String st)
    {
       
        boolean flag = false;
        for (String str : arr) {
            if (str == st) {
                flag = true;
                break;
            }

        }
 
       return flag;
    }



 



	
}



