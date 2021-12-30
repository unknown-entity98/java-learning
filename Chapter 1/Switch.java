/*

The expression is evaluated first, then its compared against all the cases
Unlike true or false, this can have any output in the expression block


Switch (expression) {
    case a:
        //code here
        break;
    case b:
        //code here
        break;
    case c;
        //code here
        break;
}



*/

public class Switch {
    public static void main(String[] args) {
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
        case 2:
                System.out.println("Tue");
                break;
            }
    }
    

}
