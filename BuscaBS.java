public class BuscaBS{
    
    static int buscaSeq(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] == el)
            return (i);
            return (-1);
    
    }
    public static void main(String args[]) {
        int[] v = {9,8,4,6,3,4};

        //Vai mandar v pro metodo de busca como paramentro
        //v = arr e 4 = el
        System.out.println(buscaSeq(v, 4));
        System.out.println(buscaSeq(v, 12));
        
    }

    
}