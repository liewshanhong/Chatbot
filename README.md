# COSC-310-Team-14
This project is a communicative agent that responds to user input in an interactive manner. It's a companion chatbot. It can answer basic information about itself and pretends itself as a real human.

### AI(.java)
This class has the code for all the functionality of the chatbot.  

### GUI(.java)
This class has the code for the Interface of the chatbot. 

### Profile(.java)

This class groups all nouns, interjections and adjectives together.

### Process(.java)

This class contains functions used from CoreNLP.

### What we have done :
For  assignment 3, 
######
We have made an GUI so the user can interact with the chatbot in a nice interface and see the history.
######
We added more possible responses for the chatbot.
######
We added  a  feature  that  enables  our  agent  to  give  different  reasonable responses when the user enters something outside the topics.
######
We used Stanford's CoreNlp to ascertain the crux of the question so as to find a suitable response.
- Lemmetization, Coreference resolution, Part-of-speech tagging and Named entity recognition
  - Lemmitization was used to remove words such as is,am,are .... etc
  - Coreference resolution was used to detect entities which are usually the main subject of the question
  - Part-of-speech tagging was used to remove words that are not nouns, nouns are usually the subject of the question
  - Named entity recognition was also used as a fail safe incase the keyword in the question is not caught
<img width="1055" alt="Screen Shot 2022-03-19 at 20 29 50" src="https://user-images.githubusercontent.com/72040706/159146810-a0a80b48-7e15-479e-818c-a85f4d653a41.png">

------Individual------
For this individual project, I have decided to use the Google Translate API and Wolfram Alpha API.

Google Translate API
- This allowed the chatbot to translate to only one language. (Simplified Chinese)

Wolfram Alpha API
- This API carries most of the question asked to the chatbot as it holds the most information.
