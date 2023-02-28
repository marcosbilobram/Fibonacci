import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int nmbr = sc.nextInt();

        int nmbr1 = 1;
        int nmbr2 = 0;
        int count = 0;
        boolean isEqual = false;

        List<Integer> list = new ArrayList<>();

        while (isEqual != true){

            nmbr1 = nmbr1 + nmbr2;
            nmbr2 = nmbr1 - nmbr2;
            System.out.println(nmbr1);

            list.add(nmbr1);

            if(nmbr == list.get(count)){
                System.out.println("O número " + nmbr + " pertence a sequência :)");
                break;
            } else if (nmbr < list.get(count)){
                System.out.println("Opa, acho que esse número não pertence a sequência :(");
                break;
            }

            count += 1;

        }
    }
}