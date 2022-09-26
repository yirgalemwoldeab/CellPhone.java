package day21NestedLoop;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (checked.contains("" + str.charAt(i))) { // if the character was already checked and counted it should skip the rest of the code because it doesn't need to count those characters again
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
                System.out.print(str.charAt(i));
            }

            checked += str.charAt(i); // after counting the character once we don't need to check it again
        }

    }
}


// alternative without continue:
   //  public static void main(String[] args) {
       //  String str = "AAABCCDEEF";
        // String checked = "";

        // for (int i = 0; i < str.length(); i++) {
           //  int count = 0;

            // if (!checked.contains("" + str.charAt(i))) {

            //     for (int j = 0; j < str.length(); j++) {

            //         if (str.charAt(i) == str.charAt(j)) {
               //          count++;
                //     }
              //   }

              //   if (count > 1) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
               //      System.out.print(str.charAt(i));
             //    }

             //    checked += str.charAt(i); // after counting the character once we don't need to check it again
          //   }



  //  }
//}
