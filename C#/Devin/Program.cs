using System;

namespace Devin
{
    class Program
    {
        static void Main(string[] args)
        {
            var maxGuess = 100;
			var guess = 50;
			
			var reponse = "";
			var game = true;

			Console.WriteLine("Pensez à un nombre entre 1 et 100");

			while (game)
			{
				Console.WriteLine($"Est-ce {guess} (=), moins que {guess} (< ou -) ou plus que {guess} (> ou +) ?");
				reponse = Console.ReadLine();
				
				switch (reponse)
				{
					case ">":
					case "+":
						guess = (guess + maxGuess) / 2;
						break;

					case "<":
					case "-":
						maxGuess = guess;
						guess = guess / 2;
						break;

					case "=":
						game = false;
						Console.WriteLine("J'ai trouvé !");
						break;
				}
			}
        }
    }
}
