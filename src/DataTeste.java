import java.util.Scanner;

public class DataTeste {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(" Digite o dia: ");
        int dia = s.nextInt();

        System.out.println(" Digite o mês: ");
        int mes = s.nextInt();

        System.out.println(" Digite o ano: ");
        int ano = s.nextInt();

        Data d = new Data(dia, mes, ano);
        System.out.println("A data informada é: " + d.displayData());
    }
}
