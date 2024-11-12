import java.util.Random;
public abstract class Player {


    protected int coin;
    protected int posicao;

    Player(){
        coin=300;
        posicao=0;
    }

    public void Andar(){
         Random random = new Random();
         int passos = random.nextInt(1, 6);
        posicao += passos;

        if(posicao>20){
            posicao -= 20;
        }
    }
    public void PagarAluguel(Propriedade propriedade){
        Player proprietario=propriedade.getproprietario();    
        if(coin>=propriedade.getAluguel()){
                coin -= propriedade.getAluguel();
                proprietario.setcoin(propriedade.getAluguel()+proprietario.getcoin());
            } else {
                proprietario.setcoin(getcoin());
                setcoin(0);
                System.out.println("Jogador "+ proprietario.getClass().getName()+" está fora do jogo devido à falência");
            }
    }

    public void setcoin(int coin){
            this.coin=coin;
    }

    public int getcoin(){
        return this.coin;
    }

    public void setposicao(int posicao){
        this.posicao=posicao;
    }

    public int getposicao(){
        return posicao;
    }

    public abstract void comprarpropriedade(Propriedade propriedade);

}
