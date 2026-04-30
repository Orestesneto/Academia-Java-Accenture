package Atividade7;

public class Casa {
    
    private boolean haGente;

    public boolean isHaGente() {
        if(this.haGente == true){
            System.out.println("João esta em casa ele não esta dirigindo.");
        } else {
            System.out.println("João esta Dirigindo ou fora de casa.");
        }
        return haGente;
    }
    


    
}
