using System;

namespace ChifoumiClasses
{
    public class Player
    {
		private int _score;

		public Player()
        {
            _score = 0;
        }
        
        public int score
        {
            get => _score;
        }
		public void addScore(int newScore)
        {
            _score = _score + newScore;
        }
	}
}
