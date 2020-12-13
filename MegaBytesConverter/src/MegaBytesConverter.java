public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.print(kiloBytes + " KB = " + (kiloBytes / 1024));
            System.out.print(" MB and " + (kiloBytes % 1024) + " KB");
        }
    }
}
