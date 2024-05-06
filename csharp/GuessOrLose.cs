// @AsherLucRen
// Jogo em que o usuário deve tentar acertar o número sorteado
// -----------------------------------------------------------

using System;

class GuessOrLose 
{
    static void Main() 
    {
        int numeroJogador, numeroSorteado;
    	    
	      numeroSorteado = new Random().Next(0, 100);
	    
    		while(true)
    		{
            Console.Write("Digite um número: ");
            numeroJogador = Convert.ToInt32(Console.ReadLine());
          
            if(numeroJogador == numeroSorteado)
            {
                Console.Write("= = = = = = = = = = = = = \n");
                Console.Write("= Parabéns, você ganhou! = \n");
                Console.Write(" = = = = = = = = = = = = =\n");
                Console.Write("--> Número secreto: " + numeroSorteado);
                Console.Write("\n = = = = = = = = = = = = =\n\n");
                
                break;
            }
            else
            {
                if(numeroJogador > numeroSorteado)
                    Console.Write("O número secreto é >> menor <<!\n\n");
                else
                    Console.Write("O número secreto é >> maior <<!\n\n");
            }
        }
  		
    		Console.Write("Jogar novamente? \n (1) - Sim \n (0) - Não\n");
    		numeroJogador = Convert.ToInt32(Console.ReadLine());
    		
    		if(numeroJogador != 0)
    		    Main();
    		else
    		    Console.Write("Obrigado por jogar!");
    }
}
