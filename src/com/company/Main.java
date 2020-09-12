package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

/*
        int size;

        while(true){
            System.out.println("Enter number of strings: ");
            Scanner input = new Scanner(System.in);
            try{
                 size = input.nextInt();
              break;
            }catch(InputMismatchException fg){
                System.out.println("You don't entered the number");
            }
        }

        String[] strs = new String[size];
        int []counters=new int[size];
*/

//Task1

        /*
        for (int i = 0; i < strs.length; i++)
        {
            for (int j = i+1; j < strs.length; j++)
            {
                if (strs[i].length()<strs[j].length())
                {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }


        for(String temp : strs){
            System.out.println(temp);
        }
String maxLength=strs[0];
        System.out.println(strs[0]);
*/

//Task 2

/*
        System.out.println("Enter your strokes:");

        Scanner input2 = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            strs[i] = input2.nextLine();
            System.out.println();
        }

        for(int i=0;i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()< strs[j].length()){
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[i] = temp;
                }
            }
        }


            for (int i = 0; i < strs.length; i++) {
                int counter=0;
                for (int j = 0; j < strs[i].length(); j++) {
                    counter++;
                }
                counters[i] = counter;
            }


for(int i=0;i<counters.length;i++){
    System.out.println("String:"+strs[i]+" Has this number of characters: "+" "+counters[i]);
}
*/

//Task 5

//Declaring and hashmap and filling it with pairs

        HashMap<Integer,Character> alphabet=new HashMap<Integer,Character>();
        alphabet.put(1,'а');
        alphabet.put(2,'б');
        alphabet.put(3,'в');
        alphabet.put(4,'г');
        alphabet.put(5,'д');
        alphabet.put(6,'е');
        alphabet.put(7,'ё');
        alphabet.put(8,'ж');
        alphabet.put(9,'з');
        alphabet.put(10,'и');
        alphabet.put(11,'й');
        alphabet.put(12,'к');
        alphabet.put(13,'л');
        alphabet.put(14,'м');
        alphabet.put(15,'н');
        alphabet.put(16,'о');
        alphabet.put(17,'п');
        alphabet.put(18,'р');
        alphabet.put(19,'с');
        alphabet.put(20,'т');
        alphabet.put(21,'у');
        alphabet.put(22,'ф');
        alphabet.put(23,'х');
        alphabet.put(24,'ц');
        alphabet.put(25,'ч');
        alphabet.put(26,'ш');
        alphabet.put(27,'щ');
        alphabet.put(28,'ъ');
        alphabet.put(29,'ы');
        alphabet.put(30,'ь');
        alphabet.put(31,'э');
        alphabet.put(32,'ю');
        alphabet.put(33,'я');
        //Declaring string for user input
        String str;

//Check for incorrect user input
        while(true){
            System.out.println("Введите строку : ");
            Scanner input = new Scanner(System.in);
            try{
                str = input.nextLine();
                break;
            }catch(Exception error){
                System.out.println("Вы ввели число или букву из другого алфавита,повторите ввод ещё раз");
            }
        }

        char[]array=str.toCharArray();
        char[]firstStr = new char[str.length()];
        int[]secondStr=new int[str.length()];
//Declaring collections for separating values and keys of hashmap
        Collection<Integer> keys = alphabet.keySet();
        Collection<Character> values = alphabet.values();

//Creating an ArrayLists of values and keys
        ArrayList<Integer>listOfKeys= new ArrayList<Integer>(keys);
        ArrayList<Character> listOfValues = new ArrayList<Character>(values);
//Loops to check if characters of different arrays are match
        for(int i=0;i<array.length;i++){
            for(int j=0;j<listOfValues.size();j++) {
                if (array[i] == listOfValues.get(j)) {
                    firstStr[i] = listOfValues.get(j);
                    secondStr[i] = listOfKeys.get(j);
                }
            }
        }
        //Output of sentence in russian separated by two spaces
        for(int i=0;i<firstStr.length;i++){
            System.out.print(firstStr[i]+"  ");
        }
        System.out.println();
        //Output of sentence,where letters are changed to indexes
        for(int i=0;i<secondStr.length;i++){
            System.out.print(secondStr[i]+"  ");
        }

        //Other solution
       /* System.out.print("Введите строку: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int number = 0;
        for(int i=0;i<str.length();i++){
            number=str.codePointAt(i);
            if (number>=1072&number<=1103){
                System.out.print(number-1071);
                System.out.print("  ");
            }else if (number>=1040&number<=1071){
                System.out.print(number-1039);
                System.out.print("  ");
            } if (number==32){
                System.out.print("  ");
            }
        }
        System.out.println();
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            System.out.print("  ");
        }

        */
/*
        System.out.println("Enter your strokes:");

        Scanner input2 = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            strs[i] = input2.nextLine();
            System.out.println();
        }

        for(int i=0;i<strs.length;i++){
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()< strs[j].length()){
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[i] = temp;
                }
            }
        }


        for (int i = 0; i < strs.length; i++) {
            int counter=0;
            for (int j = 0; j < strs[i].length(); j++) {
                counter++;
            }
            counters[i] = counter;
        }


        for(int i=0;i<counters.length;i++){
            System.out.println("String:"+strs[i]+" Has this number of characters: "+" "+counters[i]);
        }

 */
    }
}
