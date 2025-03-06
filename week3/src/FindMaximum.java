public class FindMaximum {

    public static void main(String[] args) {
        int length_of_args = args.length;

        if (length_of_args != 2) {
            System.out.println("Invalid number of arguments");
        }
        else{
            int score1 = Integer.parseInt(args[0]);
            int score2 = Integer.parseInt(args[1]);

            boolean condition = score1 > score2;
            int greatest = condition ? score1 : score2;
            System.out.println(greatest);



        }


    }
}
