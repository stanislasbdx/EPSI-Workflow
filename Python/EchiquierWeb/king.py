from piece import Piece

class King:
    def __init__(self, x, y, color):
        self._p = Piece(x, y, color, 'K', '♚♔')

    def get_piece(self):
        return self._p
