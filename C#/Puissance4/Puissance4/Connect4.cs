using System;
using System.Collections.Generic;
using System.Text;

namespace Puissance4
{
    class Connect4
    {
		public int LineCount => 6;
		public int ColCount => 7;
		private Dictionary<int, List<char>> _board;

		public int activePlayer;

		public int winner;
		public bool ended;

		public Connect4()
		{
			_board = new Dictionary<int, List<char>>();

			for (int i = 0; i < ColCount; i++)
            {
				_board[i] = new List<char>();
			}

			activePlayer = 1;
			winner = 0;
		}

        public char GetPawn(int col, int line)
		{
			if(line >= _board[col].Count)
            {
				return ' ';
			}
            else
            {
				return _board[col][line];
			}
		}

        public void Play(int column)
        {
			string pawn = activePlayer == 1 ? "o" : "x";
			_board[column].Add(char.Parse(pawn));

			activePlayer = activePlayer == 1 ? 2 : 1;

			_checkVert(column);
			_checkHor();
		}

        // Etape 4 
        // Améliorer le Play pour qu'il détecte la victoire/nul et implémenter Winner et Ended
        private void _endGame(int wnr)
		{
			winner = wnr;
			ended = true;
        }

		private void _checkVert(int col)
		{
			int consecutiveO = 0;
			int consecutiveX = 0;

			for (var i = 0; i <= LineCount; i++)
			{
				if(i >= _board[col].Count) break;

				if (_board[col][i] == char.Parse("x"))
				{
					consecutiveO = 0;
					consecutiveX++;
				}
				if (_board[col][i] == char.Parse("o"))
				{
					consecutiveX = 0;
					consecutiveO++;
				}

                if(consecutiveO == 4) _endGame(1);
                else if(consecutiveX == 4) _endGame(2);
			}
		}

		private void _checkHor()
		{
			int consecutiveO = 0;
			int consecutiveX = 0;

			for (var line = 0; line <= LineCount; line++)
			{
				for (var col = 0; col < ColCount; col++)
				{
					if(_board[col].Count <= line) continue;
					else
					{
						if (_board[col][line] == char.Parse("x"))
						{
							consecutiveO = 0;
							consecutiveX++;
						}
						if (_board[col][line] == char.Parse("o"))
						{
							consecutiveX = 0;
							consecutiveO++;
						}
					}

					if (consecutiveO == 4) _endGame(1);
					else if (consecutiveX == 4) _endGame(2);
				}
			}
		}
    }
}
