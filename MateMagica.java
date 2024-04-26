package matemagica;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MateMagica<T, U> {

    static int pontuacao = 0;
    static int ajudaFada;

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
						|   __ \\\\.-----..-----..----..---.-..-----.
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
        delay(5);
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

        ajudaFada = 2;

        System.out.println("Hora de encarar o primeiro desafio!\n");

        for (int i = 0; i <= 2; i++) {
            MateMagica<String, String> questaoResposta = questoesRespostas.get(i);
            String questao = questaoResposta.getFirst();
            String respostaCorreta = questaoResposta.getSecond();

            System.out.println(questao);

            fada(ajudaFada);

            System.out.println("Digite a alternativa:");
            char resp = input.next().charAt(0);

            char alternativaCorreta = respostaCorreta.charAt(0);
            if (resp == alternativaCorreta) {
                System.out.println("\n\n\n\nResposta correta!!!\n\n\n\n");
                pontuacao = 200 + pontuacao;
                System.out.println("Parabéns sua varinha mágica está com: " + pontuacao + " pontos\n\n\n\n");

            } else {
                System.out.println("Resposta incorreta!! Tente novamente :( \n\n");
                System.out.println("Sua varinha mágica está com: " + pontuacao + " pontos\n\n");
            }
        }

        if (pontuacao < 600) {
            System.out.println("\n\n Infelizmente você não atingiu a pontuação mínima./n Você atingiu " + pontuacao
                    + " pontos, vamos reiniciar a fase! \n\n\n");
            terraPadroes();
        } else {
            System.out.println(
                    "\n\n\nParabéns você consegui finalizar a terra dos padrões, se prepare a proxima fase terra da equacao de primeiro grau");
            terraEquacaoPrimeiroGrau();
        }

    }

    static void terraEquacaoPrimeiroGrau() {
        System.out.println("Terra primeiro grau!!!!");
    }

    static void delay(int time) {
        time = time * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }

    }

    static void fada(int ajudaFada) {
        Scanner input = new Scanner(System.in);
        if (ajudaFada > 1) {
            System.out.println("\nAntes de responder, você deseja ajuda da Fada dos Números? Você tem direito a uma ajuda!\n");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            int respostaFada;
            do {
                respostaFada = input.nextInt();
                switch (respostaFada) {
                    case 1 -> {
                        System.out.println("explicação do tema");
                        ajudaFada--;
                    }
                    case 2 -> {
                    }
                    default -> {
                        System.out.println("Opção inválida, Digite 1 se deseja ajuda, ou 2 caso não seja necessário.");
                    }
                }
            } while (respostaFada != 1 && respostaFada != 2);
        }
    }

}
