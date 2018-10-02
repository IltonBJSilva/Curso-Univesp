
public class Aula6 {

    public static void main(String[] args) {
    //variaveis do programa
    int lateral= 10; //comprimento de cada lateral da cabana
    int cquarto= 7; //comprimento da lateral do quarto
    int areaq,areat,areas; // Area do quarto,total,sala nessa ordem

    System.out.println("PROGRAMA PARA CALCULO DE AREA DA CASA");
    areas = lateral*lateral;
    System.out.println("A area da sala é "+areas);
    areaq= cquarto*(lateral/2);
    System.out.println("A area do quarto é "+areaq);
    System.out.println("A area do banheiro é "+areaq);
    areat = areas+2*areaq;
    System.out.println("A area total é "+areat);
    //fim

    //resto da divisão
    System.out.println("Parte inteira:"+ 11/2);
    System.out.println("Resto: "+ 11%2);
    //fim

    //Tipos numericos
    float X = 1.8F;
    double x = 4;
    double y = 4;
    System.out.println(x/y);
    //fim

    //começo PRIMEIRO
    //Declarando variaveis da area
    double areap;

    //Raio da piscina
    double raio=2;

    //area da piscina

    final double pi=3.14159;
    areap = pi*raio*raio;
    System.out.println("Area: " +areap);
    //fim Primeiro

    //começo SEGUNDO
    //Declarando variaveis da area
    double areap2;

    //Raio da piscina
    double raio2=2;

    //area da piscina
    final double PI=3.14159;
    areap2 = Math.PI*Math.pow(raio2,2);
    System.out.println("Area: " +areap2);
    //fim SEGUNDO
  }
}
