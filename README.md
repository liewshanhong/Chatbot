
### AI(.java)
This class has the code for all the functionality of the chatbot.  

### GUI(.java)
This class has the code for the Interface of the chatbot. 

### Profile(.java)

This class groups all nouns, interjections and adjectives together.

### Process(.java)

This class contains functions used from CoreNLP.

I used Stanford's CoreNlp to ascertain the crux of the question so as to find a suitable response.
- Lemmetization, Coreference resolution, Part-of-speech tagging and Named entity recognition
  - Lemmitization was used to remove words such as is,am,are .... etc
  - Coreference resolution was used to detect entities which are usually the main subject of the question
  - Part-of-speech tagging was used to remove words that are not nouns, nouns are usually the subject of the question
  - Named entity recognition was also used as a fail safe incase the keyword in the question is not caught
<img width="1055" alt="Screen Shot 2022-03-19 at 20 29 50" src="https://user-images.githubusercontent.com/72040706/159146810-a0a80b48-7e15-479e-818c-a85f4d653a41.png">


Google Translate API
- This allows the chatbot to translate to only one language (Simplified Chinese). 

Wolfram Alpha API
- This API carries most of the questions asked to the chatbot as it holds the most information.

![Screen Shot 2022-04-04 at 00 05 46](https://user-images.githubusercontent.com/72040706/161490890-abf9389c-befd-4ea1-b451-5148e64b8a2b.png)
