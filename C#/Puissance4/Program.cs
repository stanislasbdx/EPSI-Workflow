using System;

namespace Puissance4
{
    class Program
    {
        static void Main(string[] args)
        {
            var game = new Connect4();

           do
            {
                Display(game);
                for (; ; )
                {
                    Console.WriteLine($"Player {game.activePlayer} : Which column 1-{game.ColCount} ?");

                    var turn = Console.ReadLine();
                    int column;

                    if (int.TryParse(turn, out column))
					{
                        if(column > game.ColCount || column < 1)
                        {
							Console.Error.WriteLine("Number out of bounds.");
                        }
                        else
						{
							game.Play(column - 1);
							break;
                        }
					}
                    else
					{
						Console.Error.WriteLine("Invalid column number.");
                    }
                }
            }
            while (!game.ended);
            
            Display(game);

            if(game.winner == 0)
            {
                Console.WriteLine("Draw");
            }
            else
            {
                Console.WriteLine($"Player {game.winner} wins.");
            }
        }
        private static void Display(Connect4 game)
        {
			for (int y = game.LineCount; y >= 0; y--)
            {
                for (int x = 0; x < game.ColCount; x++)
                {
					Console.Write($"| {game.GetPawn(x, y)} ");
                }
                Console.WriteLine("|");
                for (int x = 0; x < game.ColCount; x++)
                {
                    Console.Write($"+---");
                }
                Console.WriteLine("+");
            }
            for (int x = 0; x < game.ColCount; x++)
            {
                Console.Write($"  {x + 1} ");
            }
            Console.WriteLine();
        }
    }
}