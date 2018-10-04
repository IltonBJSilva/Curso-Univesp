  public class AreaCasa {
    static double ValorM2 = 1500;

  //Inicio no metodo Inicial
  public static void main(String[] args){
  System.out.print("*Oi a todos os seres humanos*");
    double preco;
    boolean valorDK = false;

    preco = valor(-20);
    if(preco >= 0){	valorDK = true; System.out.print("O valor da construção è:"+ preco);}
      else{
      valorDK = false;
    }


    double areap;
    areaCasa(11,7);
    areap=areaPiscina(2);
    System.out.println("Piscina valor:"+areap);
    }
  //fim


  //Inicio no metodo areaPiscina
  static double areaPiscina(double raio) {
      if(raio >= 0) return Math.PI*Math.pow(raio,2);
        else return(-1);
    }
  //fim




  //Inicio no metodo AreaCasa
    static void areaCasa(float lateral,float cquarto) {
    float areaq , areas ,areat;
    if(lateral<0 && cquarto >=0) System.out.println("Erro: Latareal da sala < 0");
      System.out.println("Erro: lateral do quarto < 0");
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
      /*
      else if
        System.out.println("Erro: paramentro <0");
      */
    
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

    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;

    static double valorPiscina(double area, int material){

      double valor;
      if(material == ALVENARIA) valor = 1500;
      else 
          if (material == VINIL)valor = 1100;
      else 
            if (material == FIBRA)valor = 750;
      else 
              if(material == PLASTICO) valor = 500;
                else valor = -1;
           return(area*valor);
    
  }


}
