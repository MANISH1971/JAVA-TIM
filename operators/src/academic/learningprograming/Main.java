package academic.learningprograming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = "+result);
        int previousResult = result;
        System.out.println("previousResut = "+previousResult);
        result = result - 1; // 3 - 1 =2
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResut = "+previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = "+result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = "+result);

        result = result % 3; // the reminder of (4% 3) = 1
        System.out.println("4 % 3 = "+result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = "+result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = "+result);

        // result = result + 2
        result+=2; // 1 + 2 = 3
        System.out.println("1 + 2 = "+result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = "+result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = "+result);
        // result = result -2
        result -=2;
        System.out.println("10 - 2 = "+result);
        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not Alien!=True");
            System.out.println("And I am scared of aliens");
        }
        if (isAlien == false) {
            System.out.println("It is not Alien!=false");
            System.out.println("And I am scared of aliens");
        } // THIS IS KNOW AS CODE BLOCK
        int topScore  = 80;
        if (topScore <= 100){
            System.out.println("You got the higher score!");
        }
        int secondTopScore = 95;
        // test whether both && operands must be TRUE
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.printf("Greater then second top score and less than 100");
        }
         if ((topScore > 90) || (secondTopScore <= 90)){
             System.out.println("Either or both of the conditions are true");
         }
        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error");
        }
        boolean iscar = false;
        // ABOVE VALUE IS FALSE BUT IN IF CONDTION WE MAKE THE VALUE TRUE & BELOW LINE EXECUTE
        if (iscar==false){
            System.out.println("This is supposed to be happen");
        }
        boolean wasCar = iscar ? true : false;
        wasCar = true;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;

//         double var1 = 20.00d;
//         double var2 = 80.00d;
//         double var3 = (var1 + var2) * (100) / 40d;
//         boolean rslt = (int)var3==0 ? true :false;
//         if (rslt==false){
 //            System.out.println("reminder"+var3);
 //        }
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) *100.00d;
        System.out.println("MytotalValue = "+myValuesTotal);
        double theReminder = myValuesTotal % 40.00d;
        System.out.println("theReminder = "+theReminder);
        boolean isNoReminder = (theReminder==0) ? true : false;
        System.out.println("isNoReminder = "+isNoReminder);
        if (!isNoReminder){
            System.out.println("Got Some Reminder");
        }
    }
}
