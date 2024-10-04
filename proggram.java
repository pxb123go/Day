import java.util.Scanner;

class proggram {
    public static void main(String[] args) {
       System.out.println("Pick a number from 1-7");
       Scanner sc=new Scanner(System.in);
       int i1=sc.nextInt();
       switch (i1) {
        case 1:
        System.out.println("Monday");
            break;
       
            case 2:
        System.out.println("Tuesday");
            break;
    
            case 3:
        System.out.println("Wednesday");
            break;
       
            case 4:
        System.out.println("Thursday");
            break;
       
            case 5:
        System.out.println("Friday");
            break;
       
            case 6:
        System.out.println("Saturday");
            break;
       
            case 7:
            System.out.println("Sunday");
                break;
       }
    }
}