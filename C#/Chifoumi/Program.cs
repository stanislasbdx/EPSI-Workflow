using System;

namespace Chifoumi
{
	class Program
	{
		static void Main()
		{
			int[] score = new int[] { 0, 0 };
			string[] options = new string[] { "PIERRE", "PAPIER", "CISEAUX" };

			/**
                Pierre = 0 | Papier = 1 | Ciseaux = 2

                USER initiate fight

                Pierre  =  Pierre > draw  | Papier > ia   | Ciseaux > user
                Papier  =  Pierre > user  | Papier > draw | Ciseaux > ia
                Ciseaux =  Pierre > ia    | Papier > user | Ciseaux > draw
            **/

			string[][] fight = new string[][]{
				new string[]{ "Égalité", "Je gagne", "Vous gagnez" },
				new string[]{ "Vous gagnez", "Égalité", "Je gagne" },
				new string[]{ "Je gagne", "Vous gagnez", "Égalité" }
			};

			Console.WriteLine("Jouons au Chifoumi, le premier à trois points gagne !");

			while (score[0] < 3 && score[1] < 3)
			{
				var hasard = new Random();
				var n = hasard.Next(3);

				Console.WriteLine("Faites votre choix (pierre, papier, ciseaux) :");
				
				var userChoice = Console.ReadLine().ToUpper();
				int userIndex = Array.IndexOf(options, userChoice);
				int computerIndex = n;

				Console.WriteLine($"Vous avez choisi {options[userIndex].ToLower()}, j'ai choisi {options[computerIndex].ToLower()}.");

				Console.WriteLine(fight[userIndex][computerIndex]);

				if (fight[userIndex][computerIndex] == "Je gagne")
				{
					score[1]++;
				}
				else if (fight[userIndex][computerIndex] == "Vous gagnez")
				{
					score[0]++;
				}

				Console.WriteLine($"Vous avez {score[0]} points, j'ai {score[1]} points.");
			}

            if(score[0] == 3)
            {
				Console.WriteLine($"Vous avez gagné ! Il me manquait {3 - score[1]} point(s) pour gagner.");
			}
			else if (score[1] == 3)
			{
				Console.WriteLine($"J'ai gagné ! Il vous manquait {3 - score[0]} point(s) pour gagner.");
			}
		}
	}
}
