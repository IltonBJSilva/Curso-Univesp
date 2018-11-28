class AreaCasa {    
    // Valor do metro quadrado da casa
    double valorM2 = 1500;

    // comprimento da lateral da sala
    double lateral = 10;

    // comprimento da lateral maior do quarto
    double cquarto = 10;
    
    AreaCasa(){}
    
    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }
    AreaCasa(double lateral, double cquarto) {
        this.lateral = lateral;
        this.cquarto = cquarto;
    }
    AreaCasa(double lateral, double cquarto, double valorM2){
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    }
    // Calcula a area da casa
    static void areaCasal(double lateral, double cquarto){

    // Verifica se os valores são positivos
    if (lateral >= 0 && cquarto >= 0){
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

    static double area() {
        double areat =-1;  //Area total

        // Verifica se os valores são positivos
        if (this.lateral >= 0 && this.cquarto >= 0) {
            areat = this.lateral*this.lateral;
            areat += this.cquarto*this.lateral;

        } 
        return (areat);
    }
    // Calcula o valor total da casa
    static double valor(double area){
        if(area >= 0) return (this.valorM2*area);
        return(-1);
    }

    public static void main(String[] args){

    }
}