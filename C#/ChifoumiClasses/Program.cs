using System;

namespace ChifoumiClasses
{
	internal class Program
	{
		static void Main(string[] args)
		{
			var Game = new Game(3);

			var Player = new Player();
			var Computer = new Player();

			Game.startGame();

			while(Game.isOver(Player.score, Computer.score))
			{
				Console.WriteLine("Faites votre choix (pierre, papier, ciseaux) :");

				var userChoice = Console.ReadLine().ToUpper();
				string winner = Game.fight(userChoice);

				switch (winner)
				{
					case "computer":
						Computer.addScore(1);
						break;

					case "player":
						Player.addScore(1);
						break;
				}

				Console.WriteLine($"Vous avez {Player.score} points, j'ai {Computer.score} points.");
			}

			Game.endGame(Player.score, Computer.score);

		}
	}
}
