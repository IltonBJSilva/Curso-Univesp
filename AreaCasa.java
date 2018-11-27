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

        System.out.println("Programa para cálculo da área da casa");
        areaSala = lateral * lateral;
        System.out.println("A área da sala é " + areaSala);
        areaQuarto = cquarto * (lateral / 2);
        System.out.println("A área do quarto é " + areaQuarto);
        System.out.println("A área do banheiro é " + areaQuarto);
        areat = areaSala + 2 * areaQuarto;
        System.out.println("A área total é " + areat);
    }
    else
        System.out.println("Erro: parâmetro < 0");
    }

    static void area(double lateral, double cquarto) {
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