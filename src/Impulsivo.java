public class Impulsivo extends Player{

    public void comprarpropriedade(Propriedade propriedade){
        if(coin>=propriedade.getvalorvenda()){
            coin-=propriedade.getvalorvenda();
            propriedade.setproprietario(this);
        }
    }
}
