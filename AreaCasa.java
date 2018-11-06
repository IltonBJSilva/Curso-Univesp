class AreaCasa {
    //Materias da piscina
    static final int alvenaria = 0;
    static final int vinil = 1;
    static final int fibra = 2;
    static final int plastico = 3;

    //Preço dos materiais
    static double precos[] = {1500, 1100, 750, 500};

    static double valorM2 = 1500; //Valor do metro quadrado

    //Area da casa
    static void areaCasa(float lateral, float comp_Quarto){

    //Verifica se os valores são positivos
    if(lateral >= 0 && comp_Quarto >= 0){
        float areaQuarto; // Area do quarto
        float areaSala; // Area da sala
        float areaTotal; // Area total
        System.out.println("Programa para cálculo da área da casa");
        areaSala = lateral * lateral;
        System.out.println("A área da sala é " + areaSala);
        areaQuarto = comp_Quarto * (lateral / 2);
        System.out.println("A área do quarto é " + areaQuarto);
        System.out.println("A área do banheiro é " + areaQuarto);
        areaTotal = areaSala + 2 * areaQuarto;
        System.out.println("A área total é " + areaTotal);
    }
    else
        System.out.println("Erro: parâmetro < 0");
    }
    //Valor do metrol quadrado de acordo com a area calculada
    static double valor(double area){
        return(area>=0 ? valorM2 * area : -1);
    }
    //Valor metro quadrado para piscina
    static double valorPiscina(double area, int Material){
        if(Material < alvenaria || Material > plastico || area < 0)
            return(-1);
        return(area * precos[Material]);
    }
    //A area da piscina calculada
    static double areaPiscina(double raio){
        return(raio >= 0 ? (Math.PI * Math.pow(raio, 2)) : -1);
    }
    //Calculo da media do programa
    static double media(double[] arrays){
        double resp = 0;
        for (double valor : arrays) {
            resp += valor;
        }
        return(resp/arrays.length);
    }
    public static void main(String[] args){
        System.out.println(media(precos));
        int[] a1 = {0, 1, 2, 3};
        int[] a2 = new int[4];
        for (int i = 0; i < a1.length ; i++) {
            a2[i] = a1[i];
        }
        a1[3] = 9;
        for(int val : a1)
            System.out.print(val + ", ");
        System.out.println();
        for(int val : a2)
            System.out.print(val + ", ");
        System.out.println();
    }
}