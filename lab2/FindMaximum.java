public class FindMaximum {
    public static void main(String[] args) {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        int result;
        //determines bigger one
        boolean theCondition = value1 > value2;
        // if true result = value1 if false result = value2
        result = theCondition ? value1 : value2;
        System.out.println(result);//prints bigger number

    }
}
