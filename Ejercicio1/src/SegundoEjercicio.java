import java.util.Scanner;

public class SegundoEjercicio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int variableVale2=2,variableVale4=4, Total;

        System.out.println("ingrese un numero: 1[Suma] 2[Resta] 3[Multiplica] 4[Divide]");
        int numero;
        numero=sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Eligio Suma");
                Total=variableVale2+variableVale4;
                System.out.println("Resultado es: "+Total);
            break;
            case 2:
                System.out.println("Eligio Resta");
                Total=variableVale2-variableVale4;
                System.out.println("Resultado es: "+Total);
                break;
            case 3:
                System.out.println("Eligio Multiplicacion");
                Total=variableVale2*variableVale4;
                System.out.println("Resultado es: "+Total);
                break;
            case 4:
                System.out.println("Eligio Division");
                Total=variableVale2/variableVale4;
                System.out.println("Resultado es: "+Total);
                break;
        }
    }

}
