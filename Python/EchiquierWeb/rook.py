from piece import Piece

class Rook:
    def __init__(self, x, y, color):
        self._p = Piece(x, y, color, 'R', '♜♖')

    def get_piece(self):
        return self._p
