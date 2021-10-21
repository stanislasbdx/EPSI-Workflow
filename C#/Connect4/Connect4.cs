using System;
using System.Collections.Generic;
using System.Text;

namespace Connect4
{
    class Connect4
    {
        // TODO : Compléter cette classe pour implémenter les règles du puissance 4
        // Etape 1
        public int LineCount
        {
            get { return 2; }
        }
        public int ColCount => 3;

        // Etape 2
        // TODO : Utiliser un tableau à deux dimensions
        public char GetPawn(int col, int line) => ' ';

        // Etape 3
        // Remplir la colonne jouée et changer de joueur
        public int PlayerNumber => 1;

        public void Play(int column)
        {

        }

        // Etape 4 
        // Améliorer le Play pour qu'il détecte la victoire/nul et implémenter Winner et Ended
        public int Winner => 0;

        public bool Ended => false;
    }
}
