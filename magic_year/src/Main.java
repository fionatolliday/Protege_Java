import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = false;
        boolean againFlag;
        Utility myUtility =new Utility();
        int mySalary = 0;
        int myYear = 0;
        boolean isNum;
        do{
            System.out.println("Welcome to the magic year calculator!");
            Scanner myObj = new Scanner(System.in);
            System.out.print("Please enter your name:");
            String name = myObj.nextLine();
            System.out.print("Please enter your surname:");
            String surname = myObj.nextLine();
            do{
                System.out.print("Please enter your annual salary:");
                String salary = myObj.nextLine();
                isNum = myUtility.isNum(salary);
                if(isNum){
                    mySalary = myUtility.monthSalary(Integer.parseInt(salary));
                }
            }while (!isNum);

            do{
                System.out.print("Please enter your work start year:");
                String year = myObj.nextLine();
                isNum = myUtility.isNum(year);
                if(isNum){
                    myYear =myUtility.magicYear(Integer.parseInt(year));
                }
            }while (!isNum);



            System.out.println("Your magic age details are:");
            System.out.println(
                    String.format("Name: %s %s", name, surname ));
            System.out.println(
                    String.format("Monthly Salary: %d", mySalary ));
            System.out.println(
                    String.format("Magic Year: %d", myYear ));

            System.out.print("Do you want to calculate again?(Y/N): ");

            do{

                String input = myObj.next();
                String inputUpper = String.format(input.toUpperCase());

                switch (inputUpper){
                    case "Y":
                        flag = true;
                        againFlag = false;
                        break;
                    case "N":
                        flag = false;
                        againFlag = false;
                        System.out.println("See you later!");
                        break;
                    default:
                        System.out.print("Sorry, I don't understand, please type Y or N");
                        againFlag = true;
                }

            } while (againFlag);





        }
        while(flag);



    }
}


