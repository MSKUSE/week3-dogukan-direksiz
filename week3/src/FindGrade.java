public class FindGrade{

    public static void main(String[] args){

        int length_of_args = args.length;

        if (length_of_args == 0){
            System.out.println("You should give a score !!!");
        }else{
            int grade = Integer.parseInt(args[0]);
            if (90 <= grade && grade <= 100){
                System.out.println("Grade : A");
            }
            else if (80 <= grade && grade <= 89){
                System.out.println("Grade : B");
            }
            else if (70 <= grade && grade <= 79){
                System.out.println("Grade : C");
            }
            else if (60 <= grade && grade <= 69){
                System.out.println("Grade : D");
            }else if (0 <= grade && grade <= 59){
                System.out.println("Grade : F");
            }else {
                System.out.println("Invalid grade");
            }

        }


        //Get the score from the user as a file parameter
        //Calculate the grade based on the score
        //Print the grade to the console
        // 90 - 100 -> A
        // 80 - 89 -> B
        // 70 - 79 -> C
        // 60 - 69 -> D
        // 0 - 59 -> F





    }



}