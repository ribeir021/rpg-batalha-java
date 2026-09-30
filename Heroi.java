public class Heroi extends Personagem {
    // Eu adiciono a variável mana como atributo exclusivo do Herói
    private int mana;

    public Heroi(String nome, int vida, int forca, int defesa, int mana){
        // Eu chamo a superclasse para reaproveitar o comportamento dos atributos base
        super(nome, vida, forca, defesa); 
        this.mana = mana;
    }

    // Eu crio uma habilidade especial que consome mana para potenciar o ataque
    public void ataqueMagico(Personagem alvo){
        if(this.mana >= 10){
            this.mana -= 10;
            int ataque = this.forca + this.mana - alvo.defesa;
            alvo.receberDano(ataque);
        }
        else {
            // Eu garanto a execução de um ataque simples caso a mana seja insuficiente
            int ataque = this.forca - alvo.defesa;
            alvo.receberDano(ataque);
        }
    }

    // Eu aplico Override para sobrescrever a forma como o herói calcula o dano sofrido
    @Override
    public void receberDano(int dano){
        int bloqueio = 5;
        int danoReal = dano - bloqueio;
        
        // Eu aplico as validações para evitar dano e vida negativos
        if (danoReal >= 0) {
            if (danoReal > this.vida){
                danoReal = this.vida;
            }
            this.vida -= danoReal;
            System.out.println(this.nome + " recebeu " + danoReal + " de dano! Vida restante: " + this.vida);
        }
    }
}