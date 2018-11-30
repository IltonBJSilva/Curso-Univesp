
class projeto {
    Residencia[] condominio;
    int ultimo = -1; //ultimo alocado

    boolean adicionaRes(Residencia r){ // abre
        if(this.ultimo < this.condominio.length-1){
            ultimo++;
            this.condominio[ultimo] = r;
            return(true);            
        }
        return (false);
    }
    projeto(int tam){
        condominio = new Residencia[tam];
    }

    /*Calcular a Area de uma casa com piscina*/
    static double area(AreaCasa casa, AreaPiscina piscina){
        return(casa.area() + piscina.area());
    }
    public static void main(String[] args){
        projeto pr = new projeto(5);
        for(int i=0; i<pr.condominio.length; i++){
        
        AreaCasa c = new AreaCasa();
        AreaPiscina p = new AreaPiscina (i+2);
        Residencia r = new Residencia(c,p);
        pr.adicionaRes(r);
        }
        System.out.println(pr.buscaPiscSeq(3));
        System.out.println(pr.buscaPiscSeq(15));
        System.out.println(Residencia.buscaBin(r, 10));
    }
            

        int buscaPiscSeq(double raio) {
            for (int i = 0; i < this.condominio.length; i++)
                if (this.condominio[i].piscina.raio == raio)
                    return (i);
            return (-1);

        }
      
    static int buscaBin(Residencia[] arr, double area) {
        int fim = arr.length - 1;
        int ini = 0;
        while (ini <= fim) {
            int meio = (fim + ini) / 2;
            if (arr[meio].area() < area)
                ini = meio + 1;
            else if (arr[meio].areac() > area)
                fim = meio - 1;
            else
                return (meio);
        }
        return (-1);
    }


}
    

 

