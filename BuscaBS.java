public class BuscaBS{
    
    static int buscaSeq(int[] arr, int el) {
        for (int i = 0; i < arr.length; i++){ 
            if (arr[i] == el) return (i);
            if (arr[i] > el ) break;
        }
        return (-1);
    }
    public static void main(String args[]) {
        int[] v = {-78,-4,0,32,52,55,63,69,125,200};
        System.out.println(buscaSeq(v, 63));
        System.out.println(buscaSeq(v, 68));
        
    }

    
}