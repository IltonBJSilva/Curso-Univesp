public class AreaCasa {
  static double ValorM2 = 1500;

//Inicio no metodo Inicial
public static void main(String[] args){
	double preco;
	preco = valor(-20);
	System.out.println("O valor da construção è"+ preco);
    double areap;

  areaCasa(11,7);
  areap=areaPiscina(2);
  System.out.println("..."+areap);

  }
//fim



//Inicio no metodo areaPiscina
static double areaPiscina(double raio) {
    return(Math.PI*
	Math.pow(raio,2));
  }
//fim




//Inicio no metodo AreaCasa
  static void areaCasa(float lateral,float cquarto) {

  float areaq;
  float areas;
  float areat;
	System.out.println("****INICIO AREA CASA****");
    System.out.println("PROGRAMA PARA CALCULO DE AREA DA CASA");
    areas = lateral*lateral;
    System.out.println("A area da sala é "+areas);
    areaq= cquarto*(lateral/2);
    System.out.println("A area do quarto é "+areaq);
    System.out.println("A area do banheiro é "+areaq);
    areat = areas+2*areaq;
    System.out.println("A area total é "+areat);
    System.out.println("Area e igual a"+ areat);
	System.out.println("****FIM****");
	
  }
  //fim nesse metodo
  
  
  
  
  //inicio  
  static double valor(double area){
	  
	  if(area >=0){
	  return(ValorM2*area);
	  }
	  else{
		  return(-1);
	  }
	
	
  }
  //fim
  
}
