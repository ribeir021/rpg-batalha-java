public class Monstro extends Personagem {

    // Eu herdo a estrutura completa de Personagem sem precisar de atributos novos
    public Monstro(String nome, int vida, int forca, int defesa){
        super(nome, vida, forca, defesa);
    }
    
    // Eu crio um ataque especial escalado em que a força do monstro é duplicada
    public void ataquePesado(Personagem alvo){
        int ataque = this.forca * 2 - alvo.defesa;
        alvo.receberDano(ataque);
    }
}