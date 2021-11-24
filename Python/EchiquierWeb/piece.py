class Piece:
    def __init__(self, x, y, color, letter, symbols):
        self._x = x
        self._y = y
        self._letter = letter
        self._symbols = symbols
        self._color = color

    def get_x(self):
        return self._x

    def get_y(self):
        return self._y

    def get_color(self):
        return self._color

    def get_letter(self):
        return self.letter

    def get_symbol(self, theme):
        return self._symbols[(self._color + theme) % 2]
