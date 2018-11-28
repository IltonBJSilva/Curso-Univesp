class projeto {
    /*Calcular a Area de uma casa com piscina*/
    static double area(AreaCasa casa, AreaPiscina piscina){
        return(AreaCasa.area() + piscina.area());
    }
    public static void main(String[] args){
        // AreaCasa e visivel para todos mas casa1 não
        AreaCasa casa1 = new AreaCasa(1500);
        AreaCasa casa2 = new AreaCasa(1270);
        AreaCasa casaPrinc1 = new AreaCasa(10,5);
        AreaCasa casaPrinc2 = new AreaCasa(20, 5);
        AreaPiscina piscina1 = new AreaPiscina(10);
        
        System.out.println(casa1.valor(casa1.area(15, 10)));
        System.out.println(casa1.valor(casa2.area(18,8)));
        System.out.println(area(casaPrinc1, piscina1));

        double valorM2_ant = AreaCasa.valorM2;


        //Novo valor do m2
        AreaCasa.valorM2 = 1270;


        //resturar o valor anterior
        AreaCasa.valorM2 = valorM2_ant;
        
    
    }
}

 

 
