class AreaCasa {    
    // Valor do metro quadrado da casa
    static double valorM2 = 1500;

    // Calcula a area da casa
    static void areaCasal(double lateral, double cquarto){

    // Verifica se os valores são positivos
    if (lateral >= 0 && cquarto >= 0){
        double areaQuarto; // Area do quarto
        double areaSala; // Area da sala
        double areat; // Area total

        System.out.println("Programa para calculo da area da casa");
        areaSala = lateral * lateral;
        System.out.println("A area da sala e " + areaSala);
        areaQuarto = cquarto * (lateral / 2);
        System.out.println("A area do quarto e " + areaQuarto);
        System.out.println("A area do banheiro e " + areaQuarto);
        areat = areaSala + 2 * areaQuarto;
        System.out.println("A area total e " + areat);
    }
    else
        System.out.println("Erro: parametro < 0");
    }

    static double area(double lateral, double cquarto) {
        double areat =-1;  //Area total

        // Verifica se os valores são positivos
        if (lateral >= 0 && cquarto >= 0) {
            areat = lateral*lateral;
            areat += cquarto*lateral;

        } 
        return (areat);
    }
    // Calcula o valor total da casa
    static double valor(double area){
        if(area >= 0) return (valorM2*area);
        return(-1);
    }

    public static void main(String[] args){

    }
}