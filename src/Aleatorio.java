import java.util.Random;

public class Aleatorio extends Player{
    
    public void comprarpropriedade(Propriedade propriedade){
        Random random = new Random();
        if (random.nextBoolean()){       
            if(coin>=propriedade.getvalorvenda()){
                coin-=propriedade.getvalorvenda();
                propriedade.setproprietario(this);
            }



        }
    
    }
}
