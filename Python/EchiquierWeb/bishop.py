from piece import Piece

class Bishop:
    def __init__(self, x, y, color):
        self._p = Piece(x, y, color, 'B', '♝♗')

    def get_piece(self):
        return self._p
