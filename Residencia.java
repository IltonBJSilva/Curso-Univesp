import com.sun.javafx.geom.Area;

class Residencia {
    
    //comparando os objetos no qual desejo ordenar
    //por assim conseguirei usar o bubble sort
    int comparaRes(Residencia outras){
        if(outras == null) return (1); //esta e maior
        return ((int)(this.area() - outras.area()));
    }
    
    //ordenando pelo metodo bolha
    static void bolha (Residencia[] v) {
        for(int ult = v.length-1; ult>0; ult--){
            for(int i-0; i<ult; i++){
                if(v[i].comparaRes(v[i+1]) > 0 ){
                    Residencia aux = v[i];
                    v[i] - v [i+1];
                    v[i+1] = aux;
                }
            }
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
            Residencia r = new AreaPiscina(c,p);


    
  
    }
    
 
}