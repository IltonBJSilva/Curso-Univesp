class AreaCasa {
    // Um Arranjo de caracteres
    /* NOMES DOS MATERIAIS */
    static char[] nAlvenaria = { 'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a' };
    static char[] nVinil = { 'V', 'i', 'n', 'i', 'l' };
    static char[] nFibra = { 'F', 'i', 'b', 'r', 'a' };
    static char[] nPlastico = { 'P', 'l', 'a', 's', 't', 'i', 'c', 'o' };
    
    // Como se inicializa uma matriz
    static char[][] nomes = {
            {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a' }, 
            { 'V', 'i', 'n', 'i', 'l' },
            { 'F', 'i', 'b', 'r', 'a' }, 
            { 'P', 'l', 'a', 's', 't', 'i', 'c', 'o'}
        };

    //Materias da piscina
    static final int ALVENARIA = 0;
    static final int VINIL = 1;
    static final int FIBRA = 2;
    static final int PLASTICO = 3;

    //Preço dos materiais
    static double precos[] = {1500, 1100, 750, 500};
    //OU
    //static double precos[] = {1500, 1100, 750, 500};   
    
    static double valorM2 = 1500;

    //Area da casa
    static void areaCasa(float lateral, float comp_Quarto){

    //Verifica se os valores são positivos
    if(lateral >= 0 && comp_Quarto >= 0){
        float areaQuarto; // Area do quarto
        float areaSala; // Area da sala
        float areaTotal; // Area total
        // System.out.println("Programa para cálculo da área da casa");
        areaSala = lateral * lateral;
        // System.out.println("A área da sala é " + areaSala);
        areaQuarto = comp_Quarto * (lateral / 2);
        // System.out.println("A área do quarto é " + areaQuarto);
        // System.out.println("A área do banheiro é " + areaQuarto);
        areaTotal = areaSala + 2 * areaQuarto;
        // System.out.println("A área total é " + areaTotal);
    }
    else
          System.out.println("erro: parametro <0");
    }

    //Valor do metrol quadrado de acordo com a area calculada
    static double valor(double area){
        return(area>=0 ? valorM2 * area : -1);
    }

    //Valor metro quadrado para piscina
    static double valorPiscina(double area, int Material){
        if(Material < ALVENARIA || Material > PLASTICO || area < 0)
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
        // for (double valor : arrays) {
        //     resp += valor;
        // }
        return(resp/arrays.length);
    }
    public static void main(String[] args){
        // System.out.println(media(precos));
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
        // System.out.print(val + ", ");
        // System.out.println();
        }
        for(int val : a2){   
        // System.out.print(val + ", ");
        // System.out.println();
        }

       char c = 'o';
       char x = '\u00F6';
       int y = 246;
       int yy = 3;
       char cc = (char) yy;
    //    System.out.println(yy+'3');
    //    System.out.println(c);
    //    System.out.println(x);
    //    System.out.println((char)y);
       //fim

    //    PERCORRER A TABELA ASCI
       for(int i = 32; i <= 126; i++){
        // System.out.println(i+" : "+(char)i  );
       }

       for(int ii= 32; ii <= 126; ii++){
        //  System.out.println((int)ii+" : "+ii );
       }

        // System.out.println("Piscina de ");
        // System.out.println(nFibra);
        // System.out.println(": "+ valorPiscina (100,FIBRA));

        //PARA ACESSAR UM ELEMENTO NO ARRAY E PRINTAR NA TELA
        //  System.out.println(nVinil[1]);
        //PARA MODIFICAR
        nVinil[1]= 'c';
        // System.out.println(nVinil[1]);
        // System.out.println(nomes[1]);
        //nomes[linha][coluna]
        // System.out.println(nomes[1][2]);

        //Pegar pelo tamanho no array
        // System.out.println("Quantidade de linhas do array");        
        // System.out.println(nomes.length);

        //Pega a quantidade de caracter
        // System.out.println("Quantidade de caracter que tem no array");
        // System.out.println(nomes[0].length);
        // System.out.println("------------------------");
        
        //Mostra pro usuario a quantidade de caracter em cada linha na matriz
        for(int i=0; i<4; i++){
            // System.out.println(nomes[i].length);
            // System.out.println(" ");
        }
        
        // System.out.println();
        
        for(char[] nome : nomes){
            
            //o nome vai ser colado no arranjo
            //[0] ALVENARIA-1
            //[1] VINIL-----2
            //[2] FIBRA-----3
            //[3] PLASTICO--4
            // System.out.print(nome[2]);
            // System.out.print(nome.length);
            // System.out.print(" ");
        }
        // System.out.println();
        
     
        carregaVal(valores);
        //PRIMEIRA FORMA DE FAZER ISSO DE PERCORRER A MATRIZ
        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                // System.out.print(valores[i][j]+" ");
                // System.out.println();

                }
            }
        //SEGUNDA FORMA DE FAZER ISSO DE PERCORRER A MATRIZ
        System.out.println("-------------------------------------");
        for(double[] linha : valores){
            for(double valor : linha ){
                // System.out.print(valores+"  ");
                // System.out.println();
            }
        }
        // System.out.println("-------------------------------------");
        // System.out.println("Piscina de plastico de 150m2: "+valores[PLASTICO][2]);
        double media = 0;
        for(double valor : valores[PLASTICO]){
            media += valor;

        }
        media /= valores[PLASTICO].length;
        // System.out.println("Média:  "+media);

        

    }

        /*Carrega os valores das piscinas na matriz de area X material */
    public static void carregaVal(double[][] m){
        for(int i=0; i<m.length; i++){//linhas (material)
    
            for(int j=50; j<=200; j+=50){ //coluna (material)
                m[i][j / 50 - 1] = precos[i] * j;

            }

        }
    
    }
    public static double[][] calculaFinal(double [][] val,double [][] desc){
        double[][] saida = new double [val.length][val[0].length];
        for (int i=0; i < saida.length; i++){
            for (int j=0; j<saida[0].length; j++){
                saida[i][j] = val[i][j]*(1-desc[i][j]);
            }
        }
    return(saida);
    }
    
    //Somando as matrizes
        static double[][] somaMatrizes(double[][] a, double[][] b){
        if(a.length != b.length || a[0].length != b[0].length){
            return null;
        }else{
            double [][]res = new double[a.length][a[0].length];
            for(int i=0; i<res.length; i++){    
                for(int j = 0; j<res[0].length; j++){
                    res[i][j] = a[i][j]  + b[i][j];
                   
                }
            }
            
        return res; 
    }
  }
  


  //Metodo para imprimir a matriz tabulada com \t
    static void imprimeMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                // System.out.print("---------AQUI---------");
                // System.out.print(matriz[i][j]+"\t");
            }
            // System.out.println();
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
class Rede_soma{
    static int x = 2;
    
    static void faz(int y){
        System.out.println(y);
    }
}