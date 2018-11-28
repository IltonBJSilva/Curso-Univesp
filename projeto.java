class projeto {
    /*Calcular a Area de uma casa com piscina*/
    static double area(double lateral, double cquarto, double raio){
        return(AreaCasa.area(lateral,cquarto)+ AreaPiscina.area(raio));
    }
    public static void main(String[] args){
        // AreaCasa e visivel para todos mas casa1 não
        AreaCasa casa1 = new AreaCasa(1500);
        AreaCasa casa2 = new AreaCasa(1270);
        System.out.println(casa1.valor(casa1.area(15, 10)));
        System.out.println(casa1.valor(casa2.area(18,8)));

        double valorM2_ant = AreaCasa.valorM2;


        //Novo valor do m2
        AreaCasa.valorM2 = 1270;


        //resturar o valor anterior
        AreaCasa.valorM2 = valorM2_ant;
        
    }



}

 

 
