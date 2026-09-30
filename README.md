# ⚔️ RPG de Batalha no Terminal (Java)

Um sistema de combate RPG baseado em turnos executado diretamente no terminal. Desenvolvi este projeto para consolidar os pilares da Programação Orientada a Objetos (POO) em Java, focando em arquitetura limpa, manutenção de código e proteção contra falhas de execução.

## ⚙️ Como funciona
O jogador controla o herói Arthur contra uma Múmia. A cada turno, é possível escolher estrategicamente entre ataque físico ou mágico, gerenciando a vida e as ações até que um dos personagens seja derrotado.

## 🧠 Arquitetura e Conceitos Aplicados

* **Herança:** Implementação da superclasse `Personagem` para centralizar os atributos base (nome, vida, força, defesa). As classes `Heroi` e `Monstro` herdam essa estrutura, otimizando o reaproveitamento de código.
* **Encapsulamento:** Restrição do acesso direto à variável `vida`. As alterações de estado passam obrigatoriamente pelo método `receberDano()`, que contém a regra de negócio para impedir que os pontos de vida fiquem negativos.
* **Tratamento de Exceções:** Implementação de blocos `try/catch` para capturar `InputMismatchException`. O loop do jogo está protegido contra entradas inválidas (como letras ou símbolos), limpando o buffer e reiniciando o turno sem causar a quebra (_crash_) da aplicação.


