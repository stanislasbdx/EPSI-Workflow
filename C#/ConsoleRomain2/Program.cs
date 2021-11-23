using System;

namespace ConsoleRomain2
{
	public class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Hello World!");
		}

		private record RomanNumbers(char letter, int value, bool unique, char? lastLetter = null)
		{

		}

		private static readonly RomanNumbers[] _numbers =
		{
			new RomanNumbers('V', 5, true, 'I'),
            new RomanNumbers('I', 1, false)
	    };

		public static int ParseRomanNumber(string roman)
		{
			var res = 0;
			var iNumber = 0;
			var predAct = false;

			foreach (var c in roman)
			{
				if (_numbers[iNumber].letter == c)
                {
                    if(predAct)
                    {
						res -= 1;
						predAct = false;
					}
					res += _numbers[iNumber].value;

                    if(_numbers[iNumber].unique) iNumber++;
				}
                else if (_numbers[iNumber].lastLetter == c)
				{
                    if(predAct)
                    {
						predAct = false;
						iNumber++;
					    res += _numbers[iNumber].value;
					}
                    else {
					    res += _numbers[iNumber+1].value;
						predAct = true;
					}
				}
                else
                {
					throw new FormatException($"Caractère {c} non attendu");
				}
			}
			return roman.Length;
		}
	}
}
