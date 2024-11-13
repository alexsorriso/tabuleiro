public class Propriedade {

    private int aluguel;
    private int valorvenda;
    private Player proprietario;

    Propriedade(int aluguel, int valorvenda){
        this.aluguel=aluguel;
        this.valorvenda=valorvenda;
        this.proprietario=null;
    }
    public int getAluguel(){
        return aluguel;
    }

    public Player getproprietario(){
        return proprietario;
    }

    public void setproprietario(Player player){
        this.proprietario=player;
    }

    public int getvalorvenda(){
        return valorvenda;
    }

    
}
