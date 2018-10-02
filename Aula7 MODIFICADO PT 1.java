public class Aula7 MODIFICADO PT 1{


//Inicio no metodo Inicial
  public static void main(String[] args){

double areap;
double raio =2; //

AreaCasa();

areaPiscina(raio);
System.out.println(" A area da piscina e de"+ areap);



  }
//fim

//Inicio no metodo areaPiscina
  static double areaPiscina(double raio){
  double raio = 2;

  return(Math.PI * Math.pow(raio,2))
  }
//fim

//Inicio no metodo AreaCasa
  static double AreaCasa(){

    float lateral = 11;
    float cquarto = 7
    float areaq;
    float areas;
    float areat;
    double raio = 2;
    double areap;

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
