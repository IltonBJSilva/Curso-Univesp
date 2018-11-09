//ARRANJOS NA MEMORIA EXEMPLO
// for(int i=0; i<4; i++){
//     System.out.println(preco[i]);
// }
// Exemplo com coisa no codigo  
// for(int i = ALVENARIA; i<PLASTICO; i++){
//     System.out.println(preco[i]);
// int[] }



/*AULAS 01 AS AULAS 13*/
// public class AreaCasa {
//     static double ValorM2 = 1500;
//     // Inicio no metodo Inicial
//     public static void main(String[] args) {
//         System.out.print("*Oi a todos os seres humanos*");
//         double preco;
//         boolean valorDK = false;

//         preco = valor(-20);
//         if (preco >= 0) {
//             valorDK = true;
//             System.out.print("O valor da construção è:" + preco);
//         } else {
//             valorDK = false;
//         }

//         double areap;
//         areaCasa(11, 7);
//         areap = areaPiscina(2);
//         System.out.println("Piscina valor:" + areap);
//         System.out.println(valorPiscina(100, ALVENARIA));
//         int tipo = 0;
//         while (tipo <= PLASTICO) {
//             System.out.println(tipo + "\t\t" + valorPiscina(areap, tipo));
//         }

//     }
//     // fim

//     // Inicio no metodo areaPiscina
//     static double areaPiscina(double raio) {
//         if (raio >= 0)
//             return Math.PI * Math.pow(raio, 2);
//         else
//             return (-1);
//     }
//     // fim

//     // Inicio no metodo AreaCasa
//     static void areaCasa(float lateral, float cquarto) {
//         float areaq, areas, areat;
//         if (lateral < 0 && cquarto >= 0)
//             System.out.println("Erro: Latareal da sala < 0");
//         System.out.println("Erro: lateral do quarto < 0");
//         System.out.println("****INICIO AREA CASA****");
//         System.out.println("PROGRAMA PARA CALCULO DE AREA DA CASA");
//         areas = lateral * lateral;
//         System.out.println("A area da sala é " + areas);
//         areaq = cquarto * (lateral / 2);
//         System.out.println("A area do quarto é " + areaq);
//         System.out.println("A area do banheiro é " + areaq);
//         areat = areas + 2 * areaq;
//         System.out.println("A area total é " + areat);
//         System.out.println("Area e igual a" + areat);
//         System.out.println("****FIM****");
//     }
//     /*
//      * else if System.out.println("Erro: paramentro <0");
//      */

//     // fim nesse metodo

//     // inicio
//     static double valor(double area) {

//         if (area >= 0) {
//             return (ValorM2 * area);
//         } else {
//             return (-1);
//         }

//     }
//     // fim

//     static final int ALVENARIA = 0;
//     static final int VINIL = 1;
//     static final int FIBRA = 2;
//     static final int PLASTICO = 3;

//     static double valorPiscina(double area, int material) {

//         double valor;
//         // caso em if e else

//         /*
//          * if(material == ALVENARIA) valor = 1500; else if (material == VINIL)valor =
//          * 1100; else if (material == FIBRA)valor = 750; else if(material == PLASTICO)
//          * valor = 500; else valor = -1; return(area*valor);
//          */
//          //caso em switch case
//         //  switch (material) {
//         //  case ALVENARIA:
//         //      return (area * 1500);
//         //  case VINIL:
//         //      return (area * 1100);
//         //  case FIBRA:
//         //      return (area * 750);
//         //  case PLASTICO:
//         //      return (area * 500);
//         //  default:
//         //      valor = -1;
//         // }
//         //CASO COM ARRAYS
//          double[] preco = {1500, 1100, 750, 500};    
//     }
// }

// AULA DE ARRAYS E SEUS EXEMPLOS DE ARRAYS E ANTIGA TAMBEM

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
        System.out.println(media(precos));
        int[] a1 = {0, 1, 2, 3};
        int[] a2 = new int[4];
        

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

       char c = 'o';
       char x = '\u00F6';
       int y = 246;
       int yy = 3;
       char cc = (char) yy;
       System.out.println(yy+'3');
       System.out.println(c);
       System.out.println(x);
       System.out.println((char)y);
       //fim

    //    PERCORRER A TABELA ASCI
       for(int i = 32; i <= 126; i++){
        System.out.println(i+" : "+(char)i  );
       }

       for(int ii= 32; ii <= 126; ii++){
         System.out.println((int)ii+" : "+ii );
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
        
        //ja criar um arranjo com os valores definidado de tamanho
        
        // de linha e coluna
        // static char[][] nomeli = new char[4][9];
        
        //quando se tem a quantidade de arranjo mas nao o tamanho dele
        // static char[4][] nomeis = new char;
        // char[] aux1 = {'A', 'l', 'v', 'e', 'n', 'a', 'r', 'i', 'a' }, 
        // char[] aux2 = { 'V', 'i', 'n', 'i', 'l' };    
        // nomeis[0] = aux1;
        // nomeis[1] = aux2;
        // System.out.print(nomeis[0]);
        double[][] valores = new double[4][4];
        carregaVal(valores);
        //PRIMEIRA FORMA DE FAZER ISSO DE PERCORRER A MATRIZ
        for(int i=0; i<valores.length; i++){
            for(int j=0; j<valores[i].length; j++){
                System.out.print(valores[i][j]+" ");
                System.out.println();

                }
            }
        //SEGUNDA FORMA DE FAZER ISSO DE PERCORRER A MATRIZ
        System.out.println("-------------------------------------");
        for(double[] linha : valores){
            for(double valor : linha ){
                System.out.print(valores+"  ");
                System.out.println();
            }
        }
        System.out.println("-------------------------------------");
        System.out.println("Piscina de plastico de 150m2: "+valores[PLASTICO][2]);
        double media = 0;
        for(double valor : valores[PLASTICO]){
            media += valor;

        }
        media /= valores[PLASTICO].length;
        System.out.println("Média:  "+media);

        

    }

        /*Carrega os valores das piscinas na matriz de area X material */
    public static void carregaVal(double[][] m){
        for(int i=0; i<m.length; i++){//linhas (material)
    
            for(int j=50; j<=200; j+=50){ //coluna (material)
                m[i][j / 50 - 1] = precos[i] * j;

            }

        }
    
    }

}