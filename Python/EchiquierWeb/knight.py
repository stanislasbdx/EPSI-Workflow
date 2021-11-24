from piece import Piece

class Knight:
    def __init__(self, x, y, color):
        self._p = Piece(x, y, color, 'N', '♞♘')

    def get_piece(self):
        return self._p
