import java.util.Scanner;

public class TercerEjercicio {
    static void main() {
        double Total;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el primer valor: ");
        int primerValor=sc.nextInt();
        System.out.println("ingrese el segundo valor: ");
        int segundoValor= sc.nextInt();
        System.out.println("Ingrese una operacion a realizar +,-,*,/");
        char simbolo=sc.next().charAt(0);




        switch (simbolo){
            case '+':
                System.out.println("Eligio Suma");
                Total=primerValor+segundoValor;
                System.out.println("Resultado es: "+Total);
                break;
            case '-':
                System.out.println("Eligio Resta");
                Total=primerValor-segundoValor;
                System.out.println("Resultado es: "+Total);
                break;
            case '*':
                System.out.println("Eligio Multiplicacion");
                Total=primerValor*segundoValor;
                System.out.println("Resultado es: "+Total);
                break;
            case '/':
                if (segundoValor==0){
                    System.out.println("No se puede dividir por 0");
                }else {
                    System.out.println("Eligio Division");
                    Total = primerValor / segundoValor;
                    System.out.println("Resultado es: " + Total);

                }
                break;
        }
    }
}
