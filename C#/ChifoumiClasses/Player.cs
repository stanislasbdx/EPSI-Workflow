using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChifoumiClasses
{
    public class Player
    {
		private int score;

		public Player()
        {
            score = 0;
        }
        
        public int getScore
        {
            get => score;
        }
		public void setScore(int newScore)
        {
            score = newScore;
        }
	}
}
