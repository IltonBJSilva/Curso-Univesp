class AreaCasa {
    static double valorM2 = 1500;

    //Area da casa
    static void areaCasa(double lateral, double comp_Quarto){
        //Verifica se os valores são positivos
        if(lateral >= 0 && comp_Quarto >= 0){
            double areaQuarto; // Area do quarto
            double areaSala; // Area da sala
            double areaTotal; // Area total
            areaTotal = lateral*lateral;
            areaTotal += comp_Quarto*lateral;
            // System.out.println("Programa para cálculo da área da casa");
            // areaSala = lateral * lateral;
            // System.out.println("A área da sala é " + areaSala);
            // areaQuarto = comp_Quarto * (lateral / 2);
            // System.out.println("A área do quarto é " + areaQuarto);
            // System.out.println("A área do banheiro é " + areaQuarto);
            // areaTotal = areaSala + 2 * areaQuarto;
            // System.out.println("A área total é " + areaTotal);
        }
        else
            System.out.println("erro: parametro <0");
    }

  static void area(double lateral, double comp_Quarto){
        double areaTotal = -1; //Area Total
       if(lateral >= 0 && comp_Quarto >= 0){
            areaTotal = lateral*lateral;
            areaTotal += comp_Quarto*lateral;
        }
        return (areaTotal);
    }


    //Valor do metrol quadrado de acordo com a area calculada
    static double valor(double area){
       if(area >= 0 ) return(valorM2*area);
       return (-1);
    }

    //Calculo da media do programa
    static double media(double[] arrays){
        double resp = 0;
        // for (double valor : arrays) {
        //     resp += valor;
        // }
        return(resp/arrays.length);
    }
    public static void main(String[] args){
        System.out.println(media(precos));
        int[] a1 = {0, 1, 2, 3};
        int[] a2 = new int[4];
       
        //Matrizes dos descontos e valores
        double[][] valores = new double[4][4];
        double[][] descontos = {{0,0,0.2,0.2}, {0.05,0.05,0.1,0.15}, {0.02,0.04,0.08,0.16}, {0,0,0,0.05}};
        double [][] pFinal;
        carregaVal(valores);
        pFinal = calculaFinal(valores, descontos);

        //fala que a2 e igual a1
        a2 = a1;
        //Modifca o numero na posição [3] que no caso e o 3 pra 9 entao fica {0,1,2,9} 
        a1[3] = 9;
       
        //for com arranjo que vai modifica com os ponto
        for(int val : a1){
        System.out.print(val + ", ");
        System.out.println();
        }
        for(int val : a2){   
        System.out.print(val + ", ");
        System.out.println();
        }

        System.out.println("Piscina de ");
        System.out.println(nFibra);
        System.out.println(": "+ valorPiscina (100,FIBRA));

        //PARA ACESSAR UM ELEMENTO NO ARRAY E PRINTAR NA TELA
         System.out.println(nVinil[1]);
        //PARA MODIFICAR
        nVinil[1]= 'c';
        System.out.println(nVinil[1]);
        System.out.println(nomes[1]);
        //nomes[linha][coluna]
        System.out.println(nomes[1][2]);

        //Pegar pelo tamanho no array
        System.out.println("Quantidade de linhas do array");        
        System.out.println(nomes.length);

        //Pega a quantidade de caracter
        System.out.println("Quantidade de caracter que tem no array");
        System.out.println(nomes[0].length);
        System.out.println("------------------------");
        
        //Mostra pro usuario a quantidade de caracter em cada linha na matriz
        for(int i=0; i<4; i++){
            System.out.println(nomes[i].length);
            System.out.println(" ");
        }
        System.out.println();
        for(char[] nome : nomes){
            //o nome vai ser colado no arranjo
            //[0] ALVENARIA-1
            //[1] VINIL-----2
            //[2] FIBRA-----3
            //[3] PLASTICO--4
            System.out.print(nome[2]);
            System.out.print(nome.length);
            System.out.print(" ");
        }
        System.out.println();
  }
  //Metodo para imprimir a matriz tabulada com \t
    static void imprimeMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("---------AQUI---------");
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    //Matriz tranposta que inves de 3x4 vira 4x3
    static double[][] tranporMatriz(double[][] m){
        double[][]trans = new double[m[0].length][m.length];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                trans[j][i] = m[i][j];
            }
        }
        return trans;
    }
}
