package matemagica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


// Define e pega a questão e sua respectiva resposta de cada Arraylist, ou seja, pareia a pergunta com a questão correta.
public class MateMagica<T, U> {

    static int pontuacao;
    static int quantidadeAjuda;
    static int terra;

    private final T first;
    private final U second;

    public MateMagica(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean escolha = false;
        int opcao;

        System.out.println("""
                                          _______         __           _______                __
                                         |   |   |.---.-.|  |_ .-----.|   |   |.---.-..-----.|__|.----..---.-.
                                         |       ||  _  ||   _||  -__||       ||  _  ||  _  ||  ||  __||  _  |
                                         |__|_|__||___._||____||_____||__|_|__||___._||___  ||__||____||___._|
                                                                                      |_____|
					""");

        do {      	
            System.out.println("""
					 _______
					|   |   |.-----..-----..--.--.
					|       ||  -__||     ||  |  |
					|__|_|__||_____||__|__||_____|
					""");
            System.out.println("1 - Jogar");
            System.out.println("2 - Regras");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            switch (opcao) {
                case 1 -> {
                    jogar();
                    escolha = true;

                }
                case 2 -> {
                    exibirRegras();
                    escolha = false;
                }
                case 3 -> {
                    exibirCreditos();
                    escolha = false;
                }
                case 4 -> {
                    System.out.println("Você escolheu a opção Sair");
                    return;
                }
                default ->
                    System.out.println("Opção inválida!");
            }
        } while (escolha == false);

        input.close();
    }

    static void exibirRegras() {
        System.out.println(
                """
						 ______
						|   __ .-----..-----..----..---.-..-----.
						|      <|  -__||  _  ||   _||  _  ||__ --|
						|___|__||_____||__|__||__|  |___._||_____|
 
						1- Objetivo: O objetivo principal do jogo é ajudar Numeria, a aprendiz de Matemágica, a recuperar os Cristais Numéricos roubados por Ignorantus, restaurando assim a ordem e a harmonia em Matemágica.\\n
						2- Pontuação e Progressão: O jogador avança pelo jogo completando desafios matemáticos em cada fase para ganhar pontos. Os mesmos são essenciais para progredir e desbloquear novas áreas do reino de Matemágica. \\n   O jogador precisa acumular uma pontuação mínima em cada fase para avançar para a próxima.\\n
						3- Desafios Matemáticos: Cada fase apresenta uma série de desafios matemáticos que o jogador deve resolver para ganhar pontos.\\n   Os desafios podem variar em dificuldade e tipo, incluindo Padrões, Equações de primeiro grau e segundo grau.\\n
						4- Aliados e Poderes Especiais: Durante a jornada, Numeria encontra aliados mágicos, como o sábio calculador e a fada dos números. \\n   Esses aliados oferecem dicas e poderes especiais que podem ajudar o jogador a resolver desafios mais difíceis ou superar obstáculos.\\n
						5- Perda e Recomeço: Se o jogador não conseguir alcançar a pontuação mínima em uma fase, ele perde e deve recomeçar a fase desde o início. \\n   No entanto, o jogador pode usar as experiências passadas para melhorar seu desempenho e resolver os desafios com mais eficiência.\\n
						6- Confronto Final: Após completar todas as fases e recuperar todos os Cristais Numéricos, o jogador enfrenta Ignorantus no confronto final. \\n   Neste momento, Numeria usa todo o conhecimento matemático adquirido ao longo da jornada para derrotar o vilão e restaurar os Cristais às Torres da Sabedoria.\\n""");
    }

    static void exibirCreditos() {
        System.out.println("""
				 ______                  __  __  __
				|      |.----..-----..--|  ||__||  |_ .-----..-----.
				|   ---||   _||  -__||  _  ||  ||   _||  _  ||__ --|
				|______||__|  |_____||_____||__||____||_____||_____|
 
				Criadores:
				Ana Beatriz
				Igor Pureza
				João Assis
				""");

    }

    static void jogar() {
        System.out.println("Iniciando em 3 segundos...");
    	 delay(3);
         System.out.println("\nBem-vindo(a) ao Reino de Matemágica!\n");
         delay(2);
         System.out.println(
                 "No silêncio da noite, Numeria dormia tranquilamente em seu pequeno chalé na Vila dos Números.\nSubitamente, um estranho breu tomou conta do lugar, perturbando seu sono sereno. Ela acorda sobressaltada, o coração disparado diante da escuridão que agora envolvia sua cidade.\n");
         delay(2);
         System.out.println(
                 "Mãe de Numeria: —Numeria, acorde!!");
         delay(2);
         System.out.println(
                 "Numeria: —Mãe? O que está acontecendo? Por que está tudo tão escuro?\n");
         delay(2);
         System.out.println(
                 "Mãe de Numeria: —Não sei, minha filha. Parece que algo terrível aconteceu.\nEscute, os magos e sábios matemágicos estão convocando uma reunião na praça central.\n");
         delay(2);
         System.out.println(
                 "Intrigada e determinada a descobrir a causa da escuridão, Numeria se levanta rapidamente.\n\nGuiada pela preocupação e coragem, ela se dirige à praça, onde os magos e sábios estão reunidos, discutindo em murmúrios preocupados.\n");
         delay(2);

         System.out.println(
                 "\nGrande Mago: O reino de Matemágica está em perigo, meus amigos. Ignorantus, o vilão das sombras, invadiu nossas terras e roubou os preciosos cristais matemágicos!\n"
         );
         delay(2);

         System.out.println(
                 "A multidão começa a se questionar e querer saber oque será de Matemágica daqui para frente.\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: O que podemos fazer? Como podemos detê-lo?\n"
         );
         delay(2);

         System.out.println(
                 "Grande Sábio: \"Numeria, você é nossa única esperança. Você tem o poder e a coragem necessários para enfrentar Ignorantus e recuperar os cristais. Você é a escolhida.\"\n"
         );
         delay(2);

         System.out.println(
                 "Determinada a cumprir sua missão e salvar Matemágica, Numeria aceita o desafio com determinação.\n"
         );

         delay(2);
         System.out.println(
                 "Numeria: \"Eu irei! Não permitirei que a escuridão reine sobre nosso reino. Irei trazer de volta a luz e os cristais matemágicos!\"\n"
         );

         delay(4);
         System.out.println(
                 "Ao sair da praça central, Numeria sente o peso da responsabilidade sobre seus ombros, mas também uma determinação inabalável em seu coração\nEla sabe que o caminho à frente será árduo, mas está determinada a enfrentar todos os desafios.\n"
         );

         delay(2);
         System.out.println(
                 "Antes de partir Númeria tem uma conversa com o Sábio calculador.."
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Numeria, antes de embarcar nesta jornada, é crucial compreender a importância dos padrões em nossa busca pelos cristais matemágicos. Os padrões são como trilhas deixadas pelas estrelas no céu noturno, revelando segredos ocultos e guias para nosso entendimento.\"\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"Padrões? Como assim, sábio Calculador?\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Os padrões são como as melodias que tecem a sinfonia da matemática. Eles podem ser encontrados nas mais simples tabuadas de multiplicação até nas complexas sequências numéricas que permeiam nosso universo. Permita-me mostrar.\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Observe, Numeria. Veja como os números se alinham, criando padrões sutis e fascinantes.\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Veja aqui, o padrão I. Cada linha é formada somando o número da linha anterior com o mesmo valor. Um padrão simples, mas fundamental.\"\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"Incrível! Nunca tinha percebido isso antes.\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"E isso é apenas o começo. Veja o padrão II. Aqui, a soma das células em cada coluna sempre resulta no mesmo valor, revelando uma harmonia matemática oculta.\"\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"É como se os números dançassem em um padrão.\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Precisamente, Numeria. E há mais. Os padrões III e IV revelam relações entre as células e até mesmo propriedades dos números. Os padrões estão em toda parte, esperando para serem descobertos.\"\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"Eu entendo. Os padrões são como chaves que abrem portas para o entendimento matemático.\"\n"
         );
         delay(2);

         System.out.println(
                 "Sábio Calculador: \"Exatamente, Numeria. E ao compreender esses padrões, você estará armada com uma ferramenta poderosa em sua busca pelos cristais matemágicos. Que esta breve lição sobre padrões ilumine seu caminho, minha jovem.\"\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"Obrigada, sábio Calculador. Com este conhecimento, estou pronta para enfrentar qualquer desafio que surgir em meu caminho.\"\n"
         );
         delay(2);

         System.out.println(
                 "Após receber a preciosa lição sobre padrões do sábio Calculador, Numeria parte rumo à Terra dos Padrões, determinada a recuperar os cristais matemágicos e restaurar a harmonia em Matemágica.\n"
         );
         delay(2);

         System.out.println(
                 "Enquanto se aproxima da Terra dos Padrões, Numeria sente uma energia peculiar no ar, uma aura de desafio e mistério.\n"
         );
         delay(2);

         System.out.println(
                 "Numeria: \"Cheguei à Terra dos Padrões. Aqui é onde devo provar minha habilidade e conhecimento para recarregar a energia de minha varinha mágica.\"\n"
         );
         delay(2);

         System.out.println(
                 "Mas a tarefa não será fácil. Para recarregar sua varinha mágica, Numeria terá que resolver uma série de desafios matemáticos, cada um revelando um padrão único e desafiador.\n"
         );
         delay(2);

         System.out.println(
                 "Numeria:Estou pronta para enfrentar qualquer desafio que a Terra dos Padrões possa oferecer. Meu conhecimento será minha arma e minha varinha mágica, minha aliada.\n"
         );
         delay(2);

         System.out.println(
                 "E assim, com determinação em seu coração e a luz da matemática como sua guia, Numeria se prepara para entrar na Terra dos Padrões e enfrentar os desafios que a aguardam.\n"
         );
         delay(2);
         
        terraPadroes();
    }

    
    static void terraPadroes() {
        Scanner input = new Scanner(System.in);

        ArrayList<String> questoesPadroes = new ArrayList<>();
        
        terra = 1;
        quantidadeAjuda = 2;

        questoesPadroes.add("""
				Determine o pr\u00f3ximo n\u00famero na sequ\u00eancia:
 
				2, 4, 8, 16, 32, ?
 
				a) 48
				b) 64
				c) 56
				d) 40
				e) 62
				""");

        questoesPadroes.add("""
				Determine a regra geral da sequ\u00eancia a seguir e indique quantos quadradinhos ter\u00e1 a
				posi\u00e7\u00e3o 25.
 
				  #       ##       ###
				 ###     ####     #####
				  #       ##       ###
 
 
				a) 3.p+1 & 49
				b) 1.p+4 & 57
				c) 3.p+2 & 75
				d) 3.p+2 & 77
				e) 2.p+2 & 42""");

        questoesPadroes.add("""
				Determine o pr\u00f3ximo n\u00famero na sequ\u00eancia:
 
				3, 9, 27, 81, 243, ?
 
				a) 729
				b) 486
				c) 365
				d) 324
				e) 728""");

        questoesPadroes.add("""
				Determine a regra geral da sequ\u00eancia a seguir e indique quantos quadradinhos ter\u00e1 a
				posi\u00e7\u00e3o 7.
 
				             o              o
				  o         o o           o  o
				 o o       o   o        o  o  o
				o o o     o  o  o     o  o  o  o
 
 
				a) 2.p+4 & 18
				b) 5.p+1 & 23
				c) 3.p+1 & 14
				d) 2.p+3 & 21
				e) 5.p+4 & 16""");

        questoesPadroes.add("""
				Determine o pr\u00f3ximo n\u00famero na sequ\u00eancia:
 
				2, 5, 11, 23, 47, ?
 
				a) 94
				b) 88
				c) 77
				d) 88
				e) 95""");

        ArrayList<String> respostasPadroes = new ArrayList<>();
        respostasPadroes.add("b) 64");
        respostasPadroes.add("d) 3.p+2 & 77");
        respostasPadroes.add("a) 729");
        respostasPadroes.add("a) 2.p+4 & 18");
        respostasPadroes.add("e) 95");

        List<MateMagica<String, String>> questoesRespostas = new ArrayList<>();
        for (int i = 0; i < questoesPadroes.size(); i++) {
            questoesRespostas.add(new MateMagica<>(questoesPadroes.get(i), respostasPadroes.get(i)));
        }

        Collections.shuffle(questoesRespostas);

        for (int i = 0; i <= 2; i++) {
            MateMagica<String, String> questaoResposta = questoesRespostas.get(i);
            String questao = questaoResposta.getFirst();
            String respostaCorreta = questaoResposta.getSecond();

            System.out.println(questao);

            ajuda();

            System.out.println("Digite a alternativa:");
            char resp = input.next().charAt(0);

            char alternativaCorreta = respostaCorreta.charAt(0);
            if (resp == alternativaCorreta) {
                System.out.println("\n\n\n\nResposta correta!!!\n\n\n\n");
                delay(2);
                pontuacao = 200 + pontuacao;
                System.out.println("Parabéns sua varinha mágica está com: " + pontuacao + " pontos de energia!\n\n\n\n");
                delay(2);

            } else {
                System.out.println("Resposta incorreta!! Tente novamente :( \n\n");
                delay(1);
                System.out.println("Sua varinha mágica está com: " + pontuacao + " pontos de energia\n\n");
            }
        }


        if (pontuacao < 400) {
            System.out.println("\n\n Infelizmente você não atingiu a pontuação mínima para seguir caminho para a proxima terra./n Você atingiu " + pontuacao
                    + " pontos de energia. Que tal reiniciar o percuso e tentar novamente?! \n\n\n");
                    delay(4);
            terraPadroes();
        } else {
            System.out.println(
                    "\n\n\n WOW! Você foi incrível, se prepare a proxima fase é terra da equacao de primeiro grau, e dizem que as coisas por lá são ainda mais sombrias..\n");
                    delay(2);
            terraEquacaoPrimeiroGrau();
        }
        input.close();
    }
     // Introdução a Terra de Equações do Primeiro Grau
    static void terraEquacaoPrimeiroGrau() {     
        System.out.println("Enquanto Númeria avança em direção à próxima terra, ela se depara com uma pequena vila, mas algo parece estranho...\n");
        delay(1);

        System.out.println("Númeria: Hmm, essa vila está um tanto sombria. Será que alguém pode me ajudar aqui?\n");
        delay(1);

        System.out.println("** Barulho de algo se mexendo **\n");

        System.out.println("Elfo Númerix: Quem está aí?! O que você quer aqui na minha vila?\n");
        
        System.out.println("Númeria, cautelosa, responde:\n");
        
        System.out.println("Númeria: Desculpe-me incomodá-lo, senhor Elfo. Sou Númeria, uma aprendiz de Matemágica. Estou em uma missão para recuperar os cristais matemágicos roubados por Ignorantus.\n");
        delay(3);

        System.out.println("Elfo Númerix, desconfiado, cruza os braços e olha fixamente para Númeria.\n");
        delay(2);

        System.out.println("Elfo Númerix: Hmpf, Matemágica, hein? Como posso ter certeza de que você não é uma espiã de Ignorantus?\n");
        
        System.out.println("Elfo Númerix: Responda-me uma coisa, então. O que é mais importante para você?\n");
        delay(2);

        System.out.println("Númeria: (Pensativa) Bem, deixe-me ver... (1) Restaurar a harmonia em Matemágica. (2) Derrotar Ignorantus. (3) Aprender mais sobre os mistérios da matemática.");
        // delay(3);

        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();

        switch (resposta) {
            case 1 -> System.out.println("Númeria: O que mais importa para mim é restaurar a harmonia em Matemágica.\n");
            case 2 -> System.out.println("Númeria: O mais importante para mim é derrotar Ignorantus e salvar Matemágica.\n");
            case 3 -> System.out.println("Númeria: Eu desejo aprender mais sobre os mistérios da matemática.\n");
            default -> System.out.println("Númeria: Desculpe, eu não entendi sua pergunta. Posso tentar responder novamente?\n");
        }
        delay(2);

        System.out.println("Elfo Númerix: Hm, parece que você não é uma espiã de Ignorantus afinal.\n");
        delay(1);
        
        System.out.println("Elfo Númerix: Bem, seja como for, a próxima terra que você está prestes a enfrentar é a Terra das Equações do Primeiro Grau.\n");
        delay(3);

        System.out.println("Elfo Númerix: Antes de partir, deixe-me adiantar oque vem a seguir.. equações de primeiro grau.\n");
        delay(1);
        
        System.out.println("Elfo Númerix: As equações de primeiro grau são expressões matemáticas que envolvem uma incógnita (geralmente representada por 'x') e podem ser resolvidas para encontrar o valor dessa incógnita.\n");
        delay(3);

        System.out.println("Elfo Númerix: Por exemplo, uma equação simples de primeiro grau seria '2x + 3 = 9'. Aqui, o objetivo é encontrar o valor de 'x' que torna a equação verdadeira.\n");
        delay(2);
        
        System.out.println("Elfo Númerix: Isso significa que 2 vezes um número desconhecido somado a 3 será igual a nove.\n");
        delay(1);
        
        System.out.println("Númeria: Como assim? Número desconhecido?\n");
        delay(1);
        
        System.out.println("Elfo Númerix: Isso! Pense comigo. Vamos inverter a equação. 2x é igual a 9 menos 3 (2x = 9 - 3).\n");
        delay(1);
        
        System.out.println("Elfo Númerix: O resultado será 6! E agora para desvendarmos a Icognita, basta dividirmos pelo nosso resultado. Dessa forma:");
        
        System.out.println("""
                           x = 6
                               -
                               2
                           
                           6 / 2 = 3
                           \n""");
        
        System.out.println("Elfo Númerix: 2 vezes (2x) o número 3, somado a 3 será igual a 9!");
        
        System.out.println("""
                           
                           2.3 + 3 = 9
                           
                           6 + 3 = 9
                           
                           9 = 9
                           
                           """);
        
        System.out.println("Elfo Númerix: Viu só! Mágico e fácil.\n");
        
        System.out.println("Númeria: WoWWWW! que interessante! Acho que estou preparada para seguir!\n");
        delay(2);

        System.out.println("Elfo Númerix: Durante sua jornada na Terra das Equações do Primeiro Grau, você encontrará diversos desafios desse tipo. Lembre-se de usar seu conhecimento matemático para resolvê-los.\n");
        delay(2);
        
        System.out.println("Elfo Númerix: Ah e não esqueça. A qualquer momento você poderá invocar um elfo ajudante meu para te dar ajuda!\n");
        delay(3);

        System.out.println("Númeria: Muito obrigada, Elfo Númerix! Estou ansiosa para enfrantar os desafios que virão!.\n");
        delay(2);

        System.out.println("Ao chegar na terra de Equações do primerio grau Númeria se depara com o primeiro desafio.");
        // delay(2);

        //inicia array que contem questões da terra de quações do primeiro grau.
        ArrayList<String> questoesEquacaoPrimeiroGrau = new ArrayList<>();
        
        terra = 2;
        quantidadeAjuda = 2;
        
        //adiciona questões ao array de questões.
        questoesEquacaoPrimeiroGrau.add("""
				Determine a resposta da equação x + 30 = 40:
  
				a) 13,8
				b) 10
				c) 15
				d) 23
				e) 12
				""");

        questoesEquacaoPrimeiroGrau.add("""
				Determine a a resposta da equação 30 - 20 + 2x = 10: 
 
				a) 3
				b) 4
				c) 8
				d) 0
				e) 1""");

        questoesEquacaoPrimeiroGrau.add("""
				Determine o resultado da equação 3x - 10 + 13 = -2x + 28:
 
				a) 1
				b) 4
				c) 6
				d) 7
				e) 5""");

        questoesEquacaoPrimeiroGrau.add("""
				Determinea resposta da equação -5x + 45 - 89 = -90 + 41:
 
				a) 3
				b) 2
				c) 6
				d) 1
				e) 8""");

        questoesEquacaoPrimeiroGrau.add("""
				Determine a resposta da equação 13x - 23 - 45 = -7x + 12:
 
				a) 2
				b) 5
				c) 4
				d) 1
				e) 8""");
        
        //inicia array que contém respostas corretas.
        ArrayList<String> respostasEquacaoPrimeiroGrau = new ArrayList<>();
        respostasEquacaoPrimeiroGrau.add("b) 10");
        respostasEquacaoPrimeiroGrau.add("d) 0");
        respostasEquacaoPrimeiroGrau.add("e) 5");
        respostasEquacaoPrimeiroGrau.add("d) 1");
        respostasEquacaoPrimeiroGrau.add("c) 4");
        
        List<MateMagica<String, String>> arrayRespostasEquacaoPrimeiroGrau = new ArrayList<>();
        for (int i = 0; i < questoesEquacaoPrimeiroGrau.size(); i++) {
            arrayRespostasEquacaoPrimeiroGrau.add(new MateMagica<>(questoesEquacaoPrimeiroGrau.get(i), respostasEquacaoPrimeiroGrau.get(i)));
        }

        Collections.shuffle(arrayRespostasEquacaoPrimeiroGrau);
        
        for (int i = 0; i <= 2; i++) {
            MateMagica<String, String> arrayRespostaEquacaoPrimeiroGrau = arrayRespostasEquacaoPrimeiroGrau.get(i);
            String questao = arrayRespostaEquacaoPrimeiroGrau.getFirst();
            String respostaCorreta = arrayRespostaEquacaoPrimeiroGrau.getSecond();

            System.out.println(questao);

            ajuda();

            System.out.println("Digite a alternativa:");
            char resp = input.next().charAt(0);

            char alternativaCorreta = respostaCorreta.charAt(0);
            if (resp == alternativaCorreta) {
                System.out.println("\n\n\nResposta correta!!!\n\n\n");
                pontuacao = 200 + pontuacao;
                delay(2);

                System.out.println("Parabéns sua varinha mágica está com: " + pontuacao + " pontos de energia!\n\n\n\n");

            } else {
                System.out.println("Resposta incorreta!! Vamos ao proxímo desafio. \n\n");
                System.out.println("Sua varinha mágica está com: " + pontuacao + " pontos de energia\n\n");
                delay(2);
            }
        }
        
        if (pontuacao < 800) {
            System.out.println("\n\n Infelizmente você não atingiu a pontuação mínima para seguir caminho para a proxima terra.\n Você atingiu " + pontuacao
                    + " pontos de energia. Que tal reiniciar o percuso e tentar novamente?! \n\n\n");
            terraEquacaoPrimeiroGrau();
        } else {
            System.out.println(
                    "\n\n\n WOW! Você foi incrível, se prepare a proxima fase é terra da equacao de segundo grau.. e dizem que as coisas por lá são ainda mais sombrias..\n");
            terraEquacaoSegundoGrau();
        }
        input.close();
    }
    
    // Introdução a Terra de Equações do Segundo Grau
    static void terraEquacaoSegundoGrau(){
    	terra = 3;
    	quantidadeAjuda = 2;
    	
    	Scanner input = new Scanner(System.in);

        // incia array que contém as perguntas para terra de equações do segundo grau.
        ArrayList<String> questoesEquacaoSegundoGrau = new ArrayList<>();

        questoesEquacaoSegundoGrau.add("""
				Determine quais são as raízes da equação  x² -x -20 = 0:
 
				a) S={-4 e 5}
				b) S={7 e 9}
				c) S={-25 e 75)
				d) S={-7 e 4}
				e) S={6 e 8}
				""");

        questoesEquacaoSegundoGrau.add("""
				Determine quais são as raízes da equação x² - 3x - 4 = 0:
 
				a) S={1 e 7}
				b) S={9 e 14}
				c) S={2 e 8}
				d) S={-1 e 4}
				e) S={3 e 4}
				""");

        questoesEquacaoSegundoGrau.add("""
				Determine quais são as raízes da equação x² - 14x + 48 = 0:

				a) S={9 e 10}
				b) S={4 e 8}
				c) S={6 e 8}
				d) S={1 e 5}
				e) S={-6 e -4}
				""");

        questoesEquacaoSegundoGrau.add("""
				Escolha qual das alternativas correspondem as letras a, b e c, da equação x² + 9x + 8 = 0:		
 
				a) a=1, b=2 e c=7
				b) a=1, b=5 e c=-8
				c) a=-1, b=-9 e c=4
				d) a=2, b=18 e c=16
				e)a=1, b=9 e c=8
				""");

        questoesEquacaoSegundoGrau.add("""
				Escolha qual das alternativas correspondem as letras a, b e c, da equação x² - 7x + 5 = 0:
 
				a) a=-1, b=7 e c=-8
				b) a=1, b=-7 e c=5
				c) a=1, b=-2 e c=12
				d) a=1, b=-3 e c=1
				e) a=4, b=-8 e c=9
				""");

        ArrayList<String> respostasEquacaoSegundoGrau = new ArrayList<>();
        respostasEquacaoSegundoGrau.add("a) S={-4 e 5}");
        respostasEquacaoSegundoGrau.add("d) S={-1 e 4}");
        respostasEquacaoSegundoGrau.add("c) S={6 e 8}");
        respostasEquacaoSegundoGrau.add("e) a=1, b=9 e c=8");
        respostasEquacaoSegundoGrau.add("c) a=1, b=-7 e c=5");
        
        List<MateMagica<String, String>> arrayRespostasEquacaoSegundoGrau = new ArrayList<>();
        for (int i = 0; i < questoesEquacaoSegundoGrau.size(); i++) {
            arrayRespostasEquacaoSegundoGrau.add(new MateMagica<>(questoesEquacaoSegundoGrau.get(i), respostasEquacaoSegundoGrau.get(i)));
        }

        Collections.shuffle(arrayRespostasEquacaoSegundoGrau);

        for (int i = 0; i <= 2; i++) {
            MateMagica<String, String> arrayRespostaEquacaoSegundoGrau = arrayRespostasEquacaoSegundoGrau.get(i);
            String questao = arrayRespostaEquacaoSegundoGrau.getFirst();
            String respostaCorreta = arrayRespostaEquacaoSegundoGrau.getSecond();

            System.out.println(questao);

            ajuda();

            System.out.println("Digite a alternativa:");
            char resp = input.next().charAt(0);

            char alternativaCorreta = respostaCorreta.charAt(0);
            if (resp == alternativaCorreta) {
                System.out.println("\n\n\n\nResposta correta!!!\n\n\n\n");
                pontuacao = 200 + pontuacao;
                System.out.println("Parabéns sua varinha mágica está com: " + pontuacao + " pontos de energia!\n\n\n\n");

            } else {
                System.out.println("Resposta incorreta!! Tente novamente :( \n\n");
                System.out.println("Sua varinha mágica está com: " + pontuacao + " pontos de energia\n\n");
            }
        }

        if (pontuacao < 1000) {
            System.out.println("\n\n Infelizmente você não atingiu a pontuação mínima para seguir caminho para a proxima terra./n Você atingiu " + pontuacao
                    + " pontos de energia. Que tal reiniciar o percuso e tentar novamente?! \n\n\n");
            terraEquacaoSegundoGrau();
        } else {
            System.out.println(
                    "\n\n\n  =============================== ");
            Boss();
        }
        input.close();
    }

    static void Boss(){
    	
    	Scanner input = new Scanner(System.in);

        // incia array que contém as perguntas para terra de equações do segundo grau.
        ArrayList<String> questoesFinais = new ArrayList<>();

        questoesFinais.add("""
            X                    X
            X X              X X X
            X X X          X X X X
            X X X X      X X X X X
            
            a) 2.p+4 & 18
            b) 5.p+1 & 23
            c) 3.p+1 & 14
            d) 2.p+3 & 21
            e) 5.p+4 & 16

				""");

        questoesFinais.add("""
            Qual é o próximo número na sequência:

            7, 13, 19, 25, 31, ?
            
            a) 37
            b) 41
            c) 43
            d) 47
            e) 49
            
				""");

        questoesFinais.add("""
            Determine o valor de 𝑥 na equação 2𝑥 + 5 = 17:

            a) 6
            b) 7
            c) 8
            d) 9
            e) 10
            
				""");

        questoesFinais.add("""
            Resolva a equação 3(x − 4) = 21:

            a) 5
            b) 7
            c) 9
            d) 11
            e) 13
            
				""");

        questoesFinais.add("""
            Determine quais são as raízes da equação x2 - 5x + 6 = 0:

            a)𝑆={2,3}S={2,3}
            b)𝑆={−2,3}S={−2,3}
            c)𝑆={1,6}S={1,6}
            d)𝑆={−1,6}S={−1,6}
            e)𝑆={1,5}S={1,5}

				""");

        questoesFinais.add("""
            Escolha qual das alternativas correspondem aos coeficientes 𝑎 a, 𝑏 b e 𝑐 c da equação 2 𝑥2  −  4𝑥 − 6 = 0

            a)𝑎=1,𝑏=2,𝑐=−3a=1,b=2,c=−3
            b)𝑎=2,𝑏=−4,𝑐=−6a=2,b=−4,c=−6
            c)𝑎=3,𝑏=−4,𝑐=−2a=3,b=−4,c=−2
            d)𝑎=2,𝑏=4,𝑐=6a=2,b=4,c=6
            e)𝑎=1,𝑏=4,𝑐=−6a=1,b=4,c=−6:


				""");
        ArrayList<String> respostasFinal = new ArrayList<>();
        respostasFinal.add("c) 3.p+1 & 14");
        respostasFinal.add("a) 37");
        respostasFinal.add("a) 6");
        respostasFinal.add("e) 13");
        respostasFinal.add("a) 𝑆 = { 2 , 3 } S={2,3}");
        respostasFinal.add("b) 𝑎 = 2 , 𝑏 = − 4 , 𝑐 = − 6 a=2,b=−4,c=−6");
        
        List<MateMagica<String, String>> arrayRespostasFinal = new ArrayList<>();
        for (int i = 0; i < questoesFinais.size(); i++) {
            arrayRespostasFinal.add(new MateMagica<>(questoesFinais.get(i), respostasFinal.get(i)));
        }

        Collections.shuffle(arrayRespostasFinal);

        for (int i = 0; i <= 5; i++) {
            MateMagica<String, String> arrayRespostaFinal = arrayRespostasFinal.get(i);
            String questao = arrayRespostaFinal.getFirst();
            String respostaCorreta = arrayRespostaFinal.getSecond();

            System.out.println(questao);

            System.out.println("Digite a alternativa:");
            char resp = input.next().charAt(0);

            char alternativaCorreta = respostaCorreta.charAt(0);
            if (resp == alternativaCorreta) {
                System.out.println("\n\n\n\nResposta correta!!!\n\n\n\n");
                pontuacao = 200 + pontuacao;
                System.out.println("Parabéns sua varinha mágica está com: " + pontuacao + " pontos de energia!\n\n\n\n");

            } else {
                System.out.println("Resposta incorreta!! Tente novamente :( \n\n");
                System.out.println("Sua varinha mágica está com: " + pontuacao + " pontos de energia\n\n");
            }
        }
        
        if (pontuacao < 2200) {
            System.out.println("\n\n Infelizmente você não atingiu a pontuação mínima para seguir caminho para a proxima terra./n Você atingiu " + pontuacao
                    + " pontos de energia. Que tal reiniciar o percuso e tentar novamente?! \n\n\n");
            terraEquacaoSegundoGrau();
        } else {
            System.out.println(
                    "\n\n\n WOW! Você foi incrível, se prepare a proxima fase é terra da equacao de primeiro grau, e dizem que as coisas por lá são ainda mais sombrias..\n");
        }
        input.close();

    }

    /* Função delay é utilizada para dar um tempo entre cada coisa, pode ser aplicada a tudo.
       Para facilitar existe uma conversao de valores para nao precisarmos passar o tempo em milissegundos via argumento. assim evitando erros. */
    static void delay(int time) {
        time = time * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }

    }

    // Função ajuda é passada a cada pergunta. Serve para dar ajudas ao jogador. Será apenas para cada questao até que esgote (2 vezes por terra)
    static int ajuda() {
        Scanner input = new Scanner(System.in);
        if (quantidadeAjuda >= 1 && quantidadeAjuda <= 2) {
            int resposta;
            do {
                System.out.println("\nAntes de responder, você deseja ajuda? Você tem direito a " + quantidadeAjuda + " ajudas!\n");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
    
                while (true) { // Loop para garantir entrada válida
                    if (input.hasNextInt()) {
                        resposta = input.nextInt();
                        break;
                    } else {
                        System.out.println("Entrada inválida, digite 1 para Sim ou 2 para Não.");
                        input.next(); // Descarta a entrada inválida
                    }
                }
    
                if (resposta == 1) {
                    switch (terra) {
                        case 1 -> {
                            System.out.println("Com os poderes de sua varinha mágica, você invoca a Fada dos números!");
                            explicacaoaFada(quantidadeAjuda);
                            quantidadeAjuda--;
                        }
                        case 2 -> {
                            System.out.println("Com os poderes de sua varinha mágica, você invoca o Elfo Númerix!");
                            explicacaoaElfo(quantidadeAjuda);
                            quantidadeAjuda--;
                        }
                        case 3 -> {
                            System.out.println("Com os poderes de sua varinha mágica, você invoca o MateMago!");
                            explicacaoaMago(quantidadeAjuda);
                            quantidadeAjuda--;
                            
                        }
                        default -> System.out.println("Terra desconhecida.");
                    }
                    
                } else if (resposta == 2) {
                    break; // Sai do loop se a resposta for 2
                } else {
                    System.out.println("Opção inválida, digite 1 se deseja ajuda, ou 2 caso não seja necessário.");
                }
                
            } while (resposta != 1 && resposta != 2);
        }
        // input.close(); // Fechar o Scanner após o loop
        return quantidadeAjuda;
    }
    
    
    static void explicacaoaFada(int quantidadeAjuda) {
        if (quantidadeAjuda == 2) {
            System.out.println("""
    
            Fada: "Númeria! Vi que você precisa da minha ajuda! Aqui estão algumas dicas!
    
                - Examine se há um padrão consistente de adição ou multiplicação entre os números.
    
                - Tente determinar se os números estão aumentando ou diminuindo em incrementos fixos ou se estão seguindo uma progressão geométrica.
    
                - Procure por relações simples entre os números que possam indicar uma operação matemática subjacente."
    
            E se lembre, você só poderá me chamar mais uma vez nessa terra!
    
            """);
        } else if (quantidadeAjuda == 1) {
            System.out.println("""
    
            Fada: "Aqui estou eu novamente! Vamos a sua ultima ajuda.
    
                - Calcule as diferenças entre cada par de números consecutivos para identificar uma sequência numérica subjacente.
    
                - Observe se as diferenças entre os números seguem uma progressão constante ou se há um padrão reconhecível.
    
                - Considere também calcular as razões entre os números consecutivos para verificar se há uma progressão geométrica."
                    
        """);
        }
    }
    
    static void explicacaoaElfo(int quantidadeAjuda) {
        if (quantidadeAjuda == 2) {
            System.out.println("""
    
            Elfo: "Ha! Númeria! Vi que você precisa da minha ajuda! Aqui estão algumas dicas!
    
                - Comece simplificando a equação, movendo os termos para um lado da equação e resolvendo as operações.
    
                - Use a propriedade da igualdade para isolar o termo desconhecido (x) em um lado da equação.
    
                - Lembre-se de que as operações feitas em um lado da equação devem ser feitas no outro lado também para manter a igualdade."
    
            E se lembre, você só poderá me chamar mais uma vez nessa terra!
    
            """);
        } else if (quantidadeAjuda == 1) {
            System.out.println("""
    
            Elfo: "Ha! Númeria! Vi que você precisa da minha ajuda! Aqui estão algumas dicas!
    
                - Uma vez que a equação esteja simplificada e o termo desconhecido isolado, aplique as operações necessárias para resolver a equação.
    
                - Realize as operações de adição, subtração, multiplicação e divisão conforme necessário para encontrar o valor de x.
                
                - Verifique a solução substituindo o valor encontrado de x na equação original e garantindo que ambos os lados da equação sejam iguais."
    
    
            """);
        }
    }

    static void explicacaoaMago(int quantidadeAjuda) {
        if (quantidadeAjuda == 2) {
            System.out.println("Primeira Ajuda Mago");
        } else if (quantidadeAjuda == 1) {
            System.out.println("Segunda Ajuda Mago");
        }
    }


}
