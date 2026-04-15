import java.util.Scanner;

public class Ejercicio3Rep {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int CodigoAleatorio=(int)(Math.random() * 900 + 100), ContraseñaCorrecta=1234,EnteroLeido=0,Contador=0,MaxIntentos=3;
        String UsuarioCorrecto="admin",CadenaLeida="";



        while (( !UsuarioCorrecto.equals(CadenaLeida) || ContraseñaCorrecta != EnteroLeido ) && Contador < MaxIntentos){
            System.out.println("Ingrese su usuario: ");
            CadenaLeida=sc.nextLine();
            System.out.println("Ingrese la contraseña: ");
            EnteroLeido= sc.nextInt();
            sc.nextLine();
            Contador++;
            if (!UsuarioCorrecto.equals(CadenaLeida) || ContraseñaCorrecta != EnteroLeido){
                System.out.println("Usuario o contraseña incorrectas");
            }
        }
        if (UsuarioCorrecto.equals(CadenaLeida)&&ContraseñaCorrecta==EnteroLeido && Contador<MaxIntentos){
            Contador=0;
            MaxIntentos=2;
            do {
                System.out.println("SMS: "+CodigoAleatorio);
                System.out.println("Ahora verifique el sms que se le envio: ");
                EnteroLeido= sc.nextInt();
                Contador++;
            }
            while (EnteroLeido != CodigoAleatorio && Contador < MaxIntentos);
            if (EnteroLeido == CodigoAleatorio && Contador < MaxIntentos){
                System.out.println("Inicio de sesion exitoso :)");
            } else if (Contador>=MaxIntentos) {
                System.out.println("Su cuenta fue bloqueada");
            }

        } else if (Contador>=MaxIntentos) {
            System.out.println("Su cuenta fue bloqueada");
        }

    }
}
