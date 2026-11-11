import java.util.*;

public class latihanoperation1{
    public static void main(String[]args){

        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        System.out.print("Enter Penggunaan: ");
        String guna = scan.nextLine();

        System.out.print("Enter How many Units : ");
        int unit = scan.nextInt();


        double total = calculateBill(guna, unit);

        System.out.printf("NAME : %-10s\n", name);
        System.out.printf("Month : %d\n", unit);
        System.out.printf("Total : %.2f\n", total);


        scan.close();


    }

    public static double calculateBill(String penggunaan, int unit){

        double jumlah;
        if (penggunaan.equals("100")){
            jumlah = 0.30 * unit;
        } else if (penggunaan.equals("101-200")){
            jumlah = 0.40 * unit;
        } else if (penggunaan.equals(">200")){
            jumlah = 0.50 * unit;
        } else {
            jumlah = 0;
        }

        return jumlah;
    }
}
