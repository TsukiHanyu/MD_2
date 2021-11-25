package DeretKelipatan407341;
//mengkomplikasi kelas-kelas sesuai dengan packagenya masing-masing
import java.util.Scanner;
//mengimportkan atau mengelompokkan scanner ke program
public class DeretKelipatan407341 {
    public static void main(String[] args){ //class utama program
        Scanner scan = new Scanner(System.in);  //membuat scanner baru
        int banyak07341;    //variable yang digunakan dalam program
        
        System.out.println("Banyak Deret :");
        banyak07341 = scan.nextInt(); //masukkan banyak07341 deret yang diperlukan
        
        int[] deret07341 = new int[banyak07341];
        for(int i07341 = 0 ; i07341 < banyak07341 ; i07341++){
            deret07341[i07341] = i07341*4+2;
        }
        for (int i07341:deret07341){
            System.out.print(i07341); //mencetak i07341
            System.out.print(" ");
        }
        System.out.println();
    }
}