import java.util.Scanner;

public class Ejercicio2Rep {
    static void main() {

        Scanner sc=new Scanner(System.in);
        int Contador=3,NumeroLeido=0,ContraseñaCorrecta=1234;


        while (Contador>0 && ContraseñaCorrecta!=NumeroLeido){
            System.out.println("Intentos restantes: "+Contador);
            System.out.println("Ingrese su contraseña: ");
            NumeroLeido= sc.nextInt();
            Contador--;
        }
        if (ContraseñaCorrecta==NumeroLeido){
            System.out.println("Ingreso exitoso");
        } else if (Contador==0) {
            System.out.println("Su cuenta fue bloqueada exedio el limite de intentos");
        }
    }
}
