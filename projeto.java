class projeto {
    /*Calcular a Area de uma casa com piscina*/
    static double area(double lateral, double cquarto, double raio){
        return(AreaCasa.area(lateral,cquarto)+ AreaPiscina.area(raio));
    }
    public static void main(String[] args){
        double valorM2_ant = AreaCasa.valorM2;
        
        //preço da casa 1 (sem piscina)
        System.out.println(AreaCasa.valor(AreaCasa.area(15,10) ) );


        //Novo valor do m2
        AreaCasa.valorM2 = 1270;

        //pre�o da casa 2(sem piscina)
        System.out.println(AreaCasa.valor(AreaCasa.area(18,8) ) );

        //resturar o valor anterior
        AreaCasa.valorM2 = valorM2_ant;
        
    }



}

 

 
