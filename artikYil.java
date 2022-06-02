import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {

        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yil Gir: ");
        yil = inp.nextInt();

        double kalan;
        kalan= yil%4;

        if(kalan==0){
            System.out.print("Artik Yil ");

        }
        else {
            System.out.print("Artik Yil Degildir ");
        }

    }
}
