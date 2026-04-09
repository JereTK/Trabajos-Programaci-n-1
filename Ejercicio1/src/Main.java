//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
int variableVale3=3,variableVale7=7,variableVale10=10,variableVale20=20;

int mayor,menor;
mayor=variableVale3;
menor=variableVale3;

mayor=variableVale7>mayor?variableVale7:mayor;
mayor=variableVale10>mayor?variableVale10:mayor;
mayor=variableVale20>mayor?variableVale20:mayor;

menor=variableVale7<menor?variableVale7:menor;
menor=variableVale10<menor?variableVale10:menor;
menor=variableVale20<menor?variableVale20:menor;

    System.out.println("La variable con mayor valor es: "+mayor);
    System.out.println("La variable con menor valor es: "+menor);

}
