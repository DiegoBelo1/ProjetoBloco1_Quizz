package Quizz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		
		public static void main(String [] args) {
		
			
		int cont=0;
		Scanner ler = new Scanner(System.in);
		
			System.out.println("SEJA BEM-VINDE AO DESAFIANDERSON\n");
			
			ConstrutorPerguntas pergunta1 = new ModeloPergunta1(
					"1. Qual � o pa�s de origem do Soti� ?",
					"A) Benin", 
					"B) Gana ",
					"C) Angola", 
					'A');
			
			ConstrutorPerguntas pergunta2 = new ModeloPergunta1(
					"2. Quem canta a vers�o da m�sica �Vamos pular�"
					+ "como �Vamo c�da, vamo c�da  vamo c�da  vamo c�-da!�",
					"A) Apenas o Junior", 
					"B) Anita",
					"C) Anderson Uzumaki",
					'C');
			
			ConstrutorPerguntas pergunta3 = new ModeloPergunta2(
					"3. Qual foi o Jogo que fez a turma chorar na apresenta��o da Luciana�?",
					"A) Asssassins creed Black Flag ", 
					"B) Sekiro ",
					"C) Griss",
					"D) Veloses e Furiosos",
					'C');
			
			ConstrutorPerguntas pergunta4 = new ModeloPergunta2(
					"4. O que acontece se voc� n�o entregar o projeto do Bloco 1?",
					"A) Seu nome vai para a lista do Sabato", 
					"B) Leva esporro da Fernanda Miss Bloquinho",
					"C) Envergonha sua fam�lia",
					"D) Todas as anteriores",
					'D');
			
			ConstrutorPerguntas pergunta5 = new ModeloPergunta1(
					"5. Qual o Vulgo do Samuel Mathias e por que? ",
					"A) Marte, porqu� ele gosta de astrologia", 
					"B) Plut�o, porque ele gosta de uma musica com esse nome",
					"C) Saturno, por qu� � o eu lirico dele em seus livros.",
					'C');
			
			ConstrutorPerguntas pergunta6 = new ModeloPergunta2(
					"6. Qual o nome da musica que apareceu na apresenta��o da Anita??",
					"A) Vinte e oito", 
					"B) Tudo azul ",
					"C) Marte",
					"D) 21 Quesions",
					'A');
			
			ConstrutorPerguntas pergunta7 = new ModeloPergunta2(
					"7. Qual � habilidades/hobby da Nalu�?",
					"A) Praticar Yoga e Jogar Basquete ", 
					"B) Fazer bolo e Praticar ginastica ",
					"C) Praticar Yoga e fazer Tatuagem",
					"D) Fazer tatuagem, Praticar yoga e Fazer bolos.",
					'D');
			
			ConstrutorPerguntas pergunta8 = new ModeloPergunta2(
					"8. Que habilidades a Ingrid tem�?",
					"A) Fazer torta de ma�a", 
					"B) Desenhar e fazer maquiagem ",
					"C) Fazer maquiagem",
					"D) Fazer desenhos",
					'B');
			
			ConstrutorPerguntas pergunta9 = new ModeloPergunta2(
					"9. Qual � o nome do Namorado da Tamara�?",
					"A) Rogerio", 
					"B) Paulo ",
					"C) Douglas",
					"D) Fernando",
					'C');
			
			ConstrutorPerguntas pergunta10 = new ModeloPergunta2(
					"10. Em que lugar Marcelo morou por 7 meses�?",
					"A) Minas Gerais", 
					"B) Parana ",
					"C) S�o Paulo ",
					"D) Sergipe ",
					'A');
			
			
			ArrayList<ConstrutorPerguntas> perguntas = new ArrayList<>();
			
			perguntas.add(pergunta1);
			perguntas.add(pergunta2);
			perguntas.add(pergunta3);
			perguntas.add(pergunta4);
			perguntas.add(pergunta5);
			perguntas.add(pergunta6);
			perguntas.add(pergunta7);
			perguntas.add(pergunta8);
			perguntas.add(pergunta9);
			perguntas.add(pergunta10);
			
			
			char teste;
			
			for(ConstrutorPerguntas x: perguntas) {
				x.listarAlternativas();
				teste=ler.next().charAt(0);
				cont=cont+x.verificarResp(teste);
				
			}
			System.out.println("Pontuac�o total: "+cont);
			if(cont<3) {
				System.out.println();
				System.out.println("Voc� n�o estudou a rapaziada >: ");
				System.out.println();
			} else {
			System.out.println("PARAB�NS! Voc� chegou ao Bloco 2.\n" + "VAMO C�D���");
			System.out.println();
			}
			

			
			try {
				System.out.println("Avalia��o do Desafianderson: ");
				System.out.println("Avalie de 1 a 5 estrelas!");
				System.out.println("Digite quantas estrelinhas voc� daria para o nosso programa: ");
				System.out.println();
				int y=ler.nextInt();
					if(y==1) {
						System.out.println("Caraca, mo vacilo ai :( ");
					}else if(y==2) {
						System.out.println("Grrrrrrr voc� � ruim ");
					} else if(y==3) {
						System.out.println(".............");
					} else if(y==4) {
						System.out.println("Ai sim meu bacano ");
					}else if(y==5) {
						System.out.println("Muito obrigado por reconhecer nosso trabalho, seu lindo :) ");
					}else {
						System.out.println("Digita um numero valido ai na moral >: ");
					}
					
			}catch(Exception erro) {
				System.out.println("Voc� digitou algo fora do pedido de avalia��o >: "+erro);
			}
			ler.close();
			}
}