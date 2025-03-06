public class FindMinimum {

    public static void main(String[] args) {

        int length_of_args = args.length;

        if (length_of_args == 3) {
            int score1 = Integer.parseInt(args[0]);
            int score2 = Integer.parseInt(args[1]);
            int score3 = Integer.parseInt(args[2]);

            boolean min_score1 = score1 < score2 && score1 < score3;
            boolean min_score2 = score2 < score1 && score2 < score3;
            int minimum = min_score1 ? score1:
                    min_score2 ? score2 : score3;
            System.out.println(minimum);

        }else{
            System.out.println("Invalid number of arguments");
        }
    }
}
