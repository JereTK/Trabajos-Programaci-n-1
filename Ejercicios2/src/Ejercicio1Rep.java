void main() {
Scanner sc=new Scanner(System.in);
int NumeroCorrecto = (int)(Math.random() * 10 + 1),MaxIntentos=5,Contador=0,NumeroLeido=0;
    System.out.println(NumeroCorrecto);

while (Contador<MaxIntentos&&NumeroCorrecto!=NumeroLeido){
    System.out.println("Ingrese un numero: ");
    NumeroLeido= sc.nextInt();
    Contador++;
}

if (NumeroCorrecto==NumeroLeido){
    System.out.println("Felicidades acertaste el numero era: "+NumeroCorrecto);
} else if (Contador>=MaxIntentos) {
    System.out.println("Se terminaron los intentos el numero era: "+NumeroCorrecto);
}


}