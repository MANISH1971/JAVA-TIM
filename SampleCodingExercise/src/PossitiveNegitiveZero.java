public class PossitiveNegitiveZero {
    //psvm TO CALL public static void main(String[] args) {} TO RUN THE PROGRAM
    public static void main(String[] args) {
        checkNumber(1);
        checkNumber(-1);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        if (number>0){
            System.out.println("possitive");
        }else if (number<0){
            System.out.println("negetive");
        }else if (number==0){
            System.out.println("zero");
        }
    }
}
