
class Projeto {
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
    Projeto(int tam){
        condominio = new Residencia[tam];
    }

    /*Calcular a Area de uma casa com piscina*/
    static double area(AreaCasa casa, AreaPiscina piscina){
        return(casa.area() + piscina.area());
    }
    public static void main(String[] args){
        Projeto pr = new Projeto(5);
        for(int i=0; i<pr.condominio.length; i++){
        
        AreaCasa c = new AreaCasa(
            Math.random()*100,Math.random()*30);
        AreaPiscina p = new AreaPiscina ( Math.random()*10);
        Residencia r = new Residencia(c,p);
        pr.adicionaRes(r);
        }
        for(Residencia r : pr.condominio)
            System.out.println(r.area());
        System.out.println();
        insercao(pr.condominio);
        for(Residencia r : pr.condominio)
            System.out.println(r.area());
    }
    
            

        int buscaPiscSeq(double raio) {
            for (int i = 0; i < this.condominio.length; i++)
                if (this.condominio[i].piscina.raio == raio)
                    return (i);
            return (-1);

        }
      



}
    

 

