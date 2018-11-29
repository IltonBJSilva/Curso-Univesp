class AreaCasa {

    static  double valorM2 = 1500;
    static  double lateral = 10;
    static  double cquarto = 10;

    AreaCasa(){}

    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }

    AreaCasa(double lateral, double cquarto){
        this.lateral = lateral;
        this.cquarto = cquarto;
    }

    AreaCasa(double lateral, double cquarto, double valorM2){
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    } 
    

    // Calcula a área da cas a
    double area(){
        double areat = -1; // Area Total

        if (this.lateral >= 0 && this.cquarto >= 0) {
            areat = this.lateral * this.lateral;
            areat += this.cquarto * this.lateral;
        }

        return (areat); 
    }

    // Calcula o valor total da casa
    double valor(double area){
        return (area >= 0 ? this.valorM2 * area : -1);
    } 

    public static void main(String[] args){

    }
}