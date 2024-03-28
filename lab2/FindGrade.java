public class FindGrade{
    public static void main(String[] args){
        if(args.length > 0){
            int score = Integer.parseInt(args[0]);

            if(score > 100 || score < 0){
                System.out.println("its not a valid grade");
            }
            else if(score >= 90) {
                System.out.println("Your Grade is A");
            }
            else if(score >= 80) {
                System.out.println("Your Grade is B");
            }
            else if(score >= 70) {
                System.out.println("Your Grade is C");
            }
            else if(score >= 60) {
                System.out.println("Your Grade is D");
            }
            else{
                System.out.println("Your Grade is F");
            }
        }
    }
}