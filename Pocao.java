public class Pocao {
    // crio o atributo como privado
    private int poderDeCura;
    // Eu crio o construtor principal para inicializar os atributos
    public Pocao(int poderDeCura){
        this.poderDeCura = poderDeCura;
    }

    public void usar(Personagem alvo){
        alvo.receberCura(this.poderDeCura);


    }


    
}
