using System;

namespace ChifoumiClasses
{
    public class Game
    {
		public int totalRounds;
		private string[][] _fight;
		private string[] _options;

		public Game(int rounds = 3)
        {
			totalRounds = rounds;

			/**
                Pierre = 0 | Papier = 1 | Ciseaux = 2

                USER initiate fight

                Pierre  =  Pierre > draw  | Papier > ia   | Ciseaux > user
                Papier  =  Pierre > user  | Papier > draw | Ciseaux > ia
                Ciseaux =  Pierre > ia    | Papier > user | Ciseaux > draw
            **/
			_options = new string[] { "PIERRE", "PAPIER", "CISEAUX" };

			_fight = new string[][]{
				new string[]{ "Égalité", "Je gagne", "Vous gagnez" },
				new string[]{ "Vous gagnez", "Égalité", "Je gagne" },
				new string[]{ "Je gagne", "Vous gagnez", "Égalité" }
			};
        }

        public string fight(string userChoice)
        {
			int computerIndex = new Random().Next(3);
			int userIndex = Array.IndexOf(_options, userChoice);

			Console.WriteLine($"Vous avez choisi {_options[userIndex].ToLower()}, j'ai choisi {_options[computerIndex].ToLower()}.");

			Console.WriteLine($"=> {_fight[userIndex][computerIndex]}");

			if (_fight[userIndex][computerIndex] == "Je gagne")
			{
				return "computer";
			}
			else if (_fight[userIndex][computerIndex] == "Vous gagnez")
			{
				return "player";
			}
            else {
				return "null";
			}
        }

        public bool isOver(int userScore, int computerScore)
        {
            if(userScore == totalRounds || computerScore == totalRounds) {
				return false;
			}

			return true;
		}

        public void startGame()
        {
			Console.WriteLine($"Jouons au Chifoumi, le premier à {totalRounds} points gagne !");
        }
        
        public void endGame(int userScore, int computerScore)
        {
			if (userScore == totalRounds)
			{
				Console.WriteLine($"Vous avez gagné ! Il me manquait {3 - computerScore} point(s) pour gagner.");
			}
			else if (computerScore == totalRounds)
			{
				Console.WriteLine($"J'ai gagné ! Il vous manquait {3 - userScore} point(s) pour gagner.");
			}
        }
	}
}
