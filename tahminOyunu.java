import java.util.Scanner;

public class tahminOyunu {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        boolean isRun = true;
        int rights = 5;

        Scanner sc = new Scanner(System.in);
        int guess;
        System.out.println(number);
        do{
            if(rights <=0){
                isRun = false;
                System.out.println("\n Kaybettiniz. Sayı " + number + " idi.");
            }
            else{
                System.out.print("Tahmininiz: ");
                guess = sc.nextInt();
                if(guess == number){
                    System.out.println("\nKazandınız! Sayı " + number  + " idi.");
                    isRun = false;
                }
                else{
                    rights--;
                    System.out.println("\n Yanlış tahmin. Kalan hak: " + rights);
                }
            }
        }
        while(isRun);
    }
}
