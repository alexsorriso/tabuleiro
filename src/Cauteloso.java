public class Cauteloso extends Player{


    public void comprarpropriedade(Propriedade propriedade){
        if(coin>=propriedade.getvalorvenda()+80){
            coin-=propriedade.getvalorvenda();
            propriedade.setproprietario(this);
    }
}
}
