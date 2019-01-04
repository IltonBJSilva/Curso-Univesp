import com.sun.javafx.geom.Area;

class Residencia {
    
    //comparando os objetos no qual desejo ordenar
    //por assim conseguirei usar o bubble sort
    
    // int comparaRes(Residencia outras){
    //     if(outras == null) return (1); //esta e maior
    //     return ((int)(this.area() - outras.area()));
    // }
    
    static void insercao(Residencia[] v) {
        for (int i = 1; i < v.length; i++) {
            Residencia aux = v[i];
            int j = i;
            while((j > 0) && (aux.comparaRes(v[j-1]) < 0 )) {
                v[j] = v[j-1];
                j--;

            }
            v[j] = aux;
        }
    }

    AreaCasa casa;
    AreaPiscina piscina;
    Residencia(AreaCasa casa, AreaPiscina piscina) {
        this.casa = casa;
        this.piscina = piscina;
    }
        public static void main(String[] args) {
            
            //criando as variaveis nos respectivos tipos
            AreaCasa c = new AreaCasa();
            AreaPiscina p = new AreaPiscina();
            // Residencia r = new AreaPiscina(c,p);

    
  
    }
    
 
}