import com.sun.javafx.geom.Area;

class Residencia { 

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