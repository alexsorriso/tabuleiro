public class Exigente extends Player{

    public void comprarpropriedade(Propriedade propriedade){
        if(coin>=propriedade.getvalorvenda()&&propriedade.getAluguel()>50){
            coin-=propriedade.getvalorvenda();
            propriedade.setproprietario(this);
        }
    }
}
