public class Personagem {
    // Eu defino os atributos como protected para partilhá-los com as classes filhas
    protected String nome;
    protected int vida;
    protected int forca;
    protected int defesa;
    protected int qtdPocoes;

    // Eu crio o construtor principal para inicializar os atributos da classe molde
    public Personagem (String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
        this.qtdPocoes = 3;
    }
    
    // Eu defino a mecânica de ataque base transferindo o cálculo de dano para o alvo
    public void atacar(Personagem alvo){
        int dano = this.forca - alvo.defesa;
        System.out.println(this.nome + " atacou " + alvo.nome + " e causou " + dano +" de dano! ");
        alvo.receberDano(dano);
    }

    // Eu encapsulo a perda de vida para impedir que este atributo fique menor que zero
    public void receberDano(int dano){
        if(dano > this.vida){
            dano = this.vida;
        }
        this.vida -= dano;
        System.out.println(this.nome + " recebeu " + dano + " de dano! Vida restante: " + this.vida);
    }

    public void receberCura(int cura){
        this.qtdPocoes -= 1;
        this.vida += cura;
        System.out.println(this.nome + " recuperou " + cura + " pontos de vida! Vida restante:" + this.vida);
    }
}