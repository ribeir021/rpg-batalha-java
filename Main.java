import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Eu inicio o Scanner para capturar as decisões do jogador no terminal
        Scanner leitor = new Scanner(System.in);
        
        // Eu crio os objetos que vão batalhar, passando os seus atributos base
        Heroi meuHeroi = new Heroi("Arthur", 100, 20, 10, 30);
        Monstro meuMonstro = new Monstro("Múmia", 100, 10, 5 );

        // Eu mantenho o ciclo da batalha enquanto ambos os personagens estiverem vivos
        while(meuHeroi.vida > 0 && meuMonstro.vida > 0){
            // Eu abro um bloco try para proteger o jogo contra letras e símbolos
            try{
                System.out.println("Escolha a sua ação: 1 para Magia ou 2 para Físico ");
                int escolha = leitor.nextInt();

                // Eu utilizo o switch para direcionar a execução com base na escolha
                switch(escolha){
                    case 1:
                        System.out.println("Arthur usou ataque mágico!");
                        meuHeroi.ataqueMagico(meuMonstro);
                        break;
                
                    case 2:
                        System.out.println("Arthur usou ataque físico!");
                        meuHeroi.atacar(meuMonstro);
                        break;

                    default: 
                        // Eu capturo números inesperados para evitar perdas de turno
                        System.out.println("Opção inválida! Digite de novo");
                        continue;
                }
            }
            catch(Exception e){
                // Eu limpo o buffer do scanner se a entrada causar erro e reinicio o loop
                System.out.println("Por favor, digite apenas números!");
                leitor.next();
                continue;
            }
            
            // Eu garanto que o monstro só tem direito de resposta se sobreviver ao ataque
            if(meuMonstro.vida > 0){
                meuMonstro.ataquePesado(meuHeroi);
            }
        }
        
        // Eu verifico a condição de vitória e imprimo o resultado
        if(meuHeroi.vida > 0){
            System.out.println(meuHeroi.nome + " venceu. Parabéns!");
        }
        else{
            System.out.println(meuMonstro.nome + " venceu. Parabéns");
        }

        // Eu fecho o scanner aqui para libertar recursos de memória
        leitor.close();
    }   
}