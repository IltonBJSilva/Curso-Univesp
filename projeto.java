
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

        
        System.out.println(proj.condominio[1].casa.area());


        double valorM2_ant = AreaCasa.valorM2;


        //Novo valor do m2
        AreaCasa.valorM2 = 1270;


        //resturar o valor anterior
        AreaCasa.valorM2 = valorM2_ant;
        
    
    }

    private static Projeto extracted2() {
        Projeto proj = extracted();
        return proj;
    }

    private static Projeto extracted() {
        Projeto proj = new projeto(3);
        return proj;
            }
        }
    

 

