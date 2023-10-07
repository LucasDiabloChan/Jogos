// @AsherLucRen
// Jogo da forca
// = = = = = = = = = = = = = = = = = = = = 

using System;
using System.Text;

enum Temas
{
    OBJETOS = 1,
    ANIMAIS = 2,
    JOGOS = 3
}

static class GameControl
{
    // Vetor com palavras a serem sorteadas
    static string[] palavrasObjetos = {
        "bola", "copo", "celular", "prateleira",
        "prato", "lousa", "computador"
    };
        
    static string[] palavrasAnimais = {
        "gato", "cachorro", "gaivota", "donossauro",
        "fagira", "rocineronte", "urubu"
    }; 
    
    static string[] palavrasJogos = {
        "uno", "minecraft", "terraria", "dead cells",
        "brotato", "dark souls", "warcraft"
    }; 
    
    // ==========================================
    
    public static int GetEnumSize()
    {
        return Enum.GetNames(typeof(Temas)).Length;
    }
    
    public static int SortearTema()
    {
        return new Random().Next(0, GetEnumSize());
    }
    
    public static string SortearPalavra(int temaSorteado)
    {
        int index;
        
        switch(temaSorteado)
        {
            case 0: // OBJETOS
                index = new Random().Next(0, palavrasObjetos.Length);
                return palavrasObjetos[index];

            case 1: // ANIMAIS
                index = new Random().Next(0, palavrasAnimais.Length);
                return palavrasAnimais[index];
                
            case 2: // JOGOS
                index = new Random().Next(0, palavrasJogos.Length);
                return palavrasJogos[index];
                
            default: return string.Empty;
        }
    }
    
    public static void ExibirCabecalho(int temaSorteado)
    {
        Console.WriteLine("= = = = = = = = =");
        Console.WriteLine("> JOGO DA FORCA <");
        Console.WriteLine("= = = = = = = = =");
        
        ExibirTema(temaSorteado);
        
        Console.WriteLine("= = = = = = = = =");
    }
    
    public static void ExibirTema(int tema)
    {
        switch(tema)
        {
            case 0: Console.WriteLine("--> Tema: OBJETOS"); break;
            case 1: Console.WriteLine("--> Tema: ANIMAIS"); break;
            case 2: Console.WriteLine("--> Tema: JOGOS"); break;
            default: break;
        }
    }
    
    public static char[] GerarMoldeResposta(string palavra)
    {
        StringBuilder textModel = new StringBuilder(string.Empty);
        
        for(int i = 0; i < palavra.Length; i++)
        {
            textModel.Append("_");
        }
        
        return textModel.ToString().ToCharArray();
    }
}

class JogoForca {
  
    static void Main() {
        
        /* Configurações - JOGO */
        int temaSorteado = GameControl.SortearTema(); // Index do vetor de palavras
        string palavraSorteada = GameControl.SortearPalavra(temaSorteado);    // Palavra sorteada, baseado no tema
        
        var textoCortado = palavraSorteada.ToCharArray(); // Texto referência p/ correção
        var outputWord = GameControl.GerarMoldeResposta(palavraSorteada); // Texto de correção
        
        /* Configurações - JOGADOR */
        StringBuilder letrasInseridas = new StringBuilder(string.Empty); // Texto inserido pelo jogador
        
        int qtdErrosUsuario = 0;
        
        // -----------------------------------------
        
        GameControl.ExibirCabecalho(temaSorteado);
        
        while(true)
        {
            Console.WriteLine($"Palavra: {new string(outputWord)}");
            Console.WriteLine($"Tentativas: {letrasInseridas.ToString().ToCharArray().ToString()}");
            Console.WriteLine($"Erros: {qtdErrosUsuario}/5\n");
            
            try
            {
                Console.WriteLine("Digite uma letra ou a palavra: ");
                string textoUsuario = Console.ReadLine().ToLower();
                
                if(textoUsuario.Equals(palavraSorteada))
                {
                    Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                    Console.WriteLine($"Acertou! A palavra é '{palavraSorteada}'!");
                    Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                    break;
                }
                else
                {
                    bool temEssaLetraNaPalavra = false;
                    
                    for(int i = 0; i < textoCortado.Length; i++)
                    {
                        if(textoUsuario[0] == textoCortado[i])
                        {
                            outputWord[i] = textoUsuario[0]; 
                            temEssaLetraNaPalavra = true;
                        }
                    }
                    
                    if(!temEssaLetraNaPalavra)
                    {
                        qtdErrosUsuario++;
                        
                        letrasInseridas.Append(textoUsuario[0]);
                        
                        if(qtdErrosUsuario == 5)
                        {
                            Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                            Console.WriteLine($"Perdeu! A palavra era '{palavraSorteada}'!");
                            Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                            break;
                        }
                    }
                    
                    if(palavraSorteada.Equals(new string(outputWord)))
                    {
                        Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                        Console.WriteLine($"Acertou! A palavra é '{palavraSorteada}'!");
                        Console.WriteLine("= = = = = = = = = = = = = = = = = = = = =");
                        break;
                    }
                }
            }
            catch(Exception ex)
            {
                Console.WriteLine(">> ALERTA << " 
                    + "Digite uma letra por vez ou a palavra inteira; \n" 
                    + "Não há caracteres especiais no jogo. \n"
                    );
            }
        }
    }
}
