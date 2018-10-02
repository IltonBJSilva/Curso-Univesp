public class AreaCasa {

//Inicio no metodo Inicial
  public static void main(String[] args){

    double areap;

AreaCasa(11,7);
areap=areaPiscina(2);
System.out.println("..."+areap);

  }
//fim

//Inicio no metodo areaPiscina
static double areaPiscina(double raio){
  double raio = 2;

return(Math.PI * Math.pow(raio,2));
  }
//fim

//Inicio no metodo AreaCasa
  static void AreaCasa(float lateral,float cquarto){

    float areaq;
    float areas;
    float areat;

    System.out.println("PROGRAMA PARA CALCULO DE AREA DA CASA");
    areas = lateral*lateral;
    System.out.println("A area da sala é "+areas);
    areaq= cquarto*(lateral/2);
    System.out.println("A area do quarto é "+areaq);
    System.out.println("A area do banheiro é "+areaq);
    areat = areas+2*areaq;
    System.out.println("A area total é "+areat);
    areap = Math.pow(raio,2);
    System.out.println("..."+ areap);

  }
  //fim nesse metodo



}
