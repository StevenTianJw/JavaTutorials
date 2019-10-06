public class Main
{
  public static void main (String[]args)
  {
    String words[] =
      new String[]{ "Hello", "World", "in   ", "a  ", "frame",
"velociraptor", "fusion360", "eeeeeeeeeeeeeeee"};
    char star = '*';
    char space = ' ';

    int size = biggest (words);

    for (int j = 0; j < size + 4; j++)
      {
	System.out.print (star);
      }
    System.out.println ();
    for (int i = 0; i < words.length; i++)
      {
	System.out.print ("* " + words[i]);
	for (int a = 0; a < size-words[i].length()+1;a++){
	    System.out.print(space);
	}
	System.out.print(star);
	System.out.println ();
	
      }
    for (int j = 0; j < size + 4; j++)
      {
	System.out.print (star);
      }
  }

  
  static int biggest (String[]words)
  {
    int max = words[0].length ();
    for (int i = 1; i < words.length; i++)
      {
	int t = words[i].length ();

	if (t > max)
	  {
	    max = t;
	  }

      }
    return max;
  }



}
