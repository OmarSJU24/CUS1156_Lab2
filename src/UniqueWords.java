import java.util.ArrayList;

public class UniqueWords
{
   /**
    * Counts the number of unique strings in a list
    * @param list ArrayList of strings to be examined
    * @return number of unique strings in the list
    */
   public static int countUnique(ArrayList<String> list)
   {
      ArrayList<String> seen = new ArrayList<>();

      for (int i = 0; i < list.size(); i++)
      {
         String current = list.get(i);

         if (!seen.contains(current))
         {
            seen.add(current);
         }
      }

      return seen.size();
   }

   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();

      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);

      System.out.println(words + " has " + unique + " unique words");
   }
}
