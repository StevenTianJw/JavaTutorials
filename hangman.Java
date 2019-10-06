import java.util.Random;

public class Main
{
  public static void main (String[]args)
  {
    String words[] =
      new String[]{ "dilate", "indict", "sacrilegious", "ingenious", "kleptomania", "kwanzza", "parmesan", "presbyterian", "teutonic", "tuesday", "abyss", "abbreviate", "abscond", 
      "minuscule",
      "velociraptor", "onamatopoeia", "accommodate", "caribbean", "abysmal", "czechslovakia", "connecticut", "euclidean","february", "absorbent", "camouflage", "cannaibalize", "cartilage"
    };
    int score = 0;
    int mistake = 0;
    int global_char_counter=0;
    Random rand = new Random ();
    int wordnumber = rand.nextInt (9);
    int size_temp = words[wordnumber].length ();
    char word[] = new char[size_temp];
    char chars [] = new char[26];
    for (int x = 0; x < words[wordnumber].length (); x++)
      {
	word[x] = '_';
      }
    System.out.print
      ("Welcome to HangMan, you have been assigned a word that you have to guess. You have 5 chances to get it wrong.");
    System.out.println ();
    System.out.print
      ("Type in one Character at a time and if you think you know the word, type in the word.If you typed in all the correct characters, you win, or if you typed in the word correctly, you win.");
    System.out.println ();
    System.out.print ("Word Length:" + words[wordnumber].length ());
    System.out.println ();
    for (int x = 0; x < words[wordnumber].length (); x++)
      {
	System.out.print (word[x]);
      };

    while (true)
      {
	String x = System.console ().readLine ();

	char input = x.charAt (0);
	if (score >= words[wordnumber].length ()-1)
	  {
	    System.out.print ("Congratulations!You've won the game!");
	    break;
	  }
	if (x.equals (words[wordnumber]))
	  {
	    System.out.print
	      ("Congratulations!You've won the game!The word is correct!");
	    break;
	  }
	boolean check_input = false;
	boolean check_previous = false;
	for(int i = 0;i<global_char_counter;i++){
	    if(chars[i] == input){
	        System.out.println("you've already inputted this character, please try again");
	        check_previous=true;
	        break;
	        
	    }
	}
	if(check_previous){
	    continue;
	}
	else{
	    chars[global_char_counter] = input;
	    global_char_counter++;
	}
	for (int j = 0; j < words[wordnumber].length (); j++)
	  {
	    if (input == words[wordnumber].charAt (j))
	      {

		score += 1;
		int m = j + 1;
		check_input = true;
		System.out.print ("The character you typed is at :" + m);
		System.out.println ();
		word[j] = input;
		for (int y = 0; y < words[wordnumber].length (); y++)
		  {
		    	System.out.print (word[y]);
		  }
	    System.out.println();
	      }
	  }

	if (!check_input)
	  {
	    mistake++;
	    int chancesleft = 5 - mistake;
	    System.out.print ("Not Correct, Try again! You have :" +
			      chancesleft + "Chances left.");
	    System.out.println ();
	  }


	if (mistake == 5)
	  {
	    System.out.print ("You've lost the game! The hang man died!");
	    break;
	  }
      }


  }




}
