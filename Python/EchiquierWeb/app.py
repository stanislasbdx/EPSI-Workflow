from chessboard import ChessBoard
from flask import Flask, request

THEME_CLAIR = 0

server = Flask(__name__)
@server.route("/")

def index():
	#arg = request.args.get("param")
	return '''
		<html>
			<head>
				<title>Chess</title>
				<style>
					* { font-family: Arial, Helvetica, sans-serif; color: black; box-sizing: border-box; }
					ul.x { list-style-type:none; padding: 0 25px; }
					.x li { width: 50px; padding:5px 15px; }
					.x li, .y { font-size: 20px; display:block; float: left; }
					.y { padding: 15px 5px 0; height: 50px; clear: left; }
					a { width: 50px; height: 50px; font-size: 38px; padding:0 6px; text-decoration:none; float:left; dislay:block }
					.b { background: silver; }
					a:hover { background: IndianRed; cursor: not-allowed; }
					.sel, a[href]:hover { background: YellowGreen; cursor: pointer }
				</style>
			</head>
			<body>
				<ul class='x'>
					<li>A <li>B <li>C <li>D <li>E <li>F <li>G <li>H
				</ul>
				<span class='y'>8</span>
					<a class='w'>♜</a>
					<a class='b'>♞</a>
					<a class='w'>♝</a>
					<a class='b'>♛</a>
					<a class='w'>♚</a>
					<a class='b'>♝</a>
					<a class='w'>♞</a>
					<a class='b'>♜</a>            
				<span class='y'>7</span>
					<a class='b'>♟</a>
					<a class='w'>♟</a>
					<a class='b'>♟</a>
					<a class='w'>♟</a>
					<a class='b'>♟</a>
					<a class='w'>♟</a>
					<a class='b'>♟</a>
					<a class='w'>♟</a>
				<span class='y'>6</span>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>            
				<span class='y'>5</span>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
				<span class='y'>4</span>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w' href='?to=e4'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>            
				<span class='y'>3</span>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
					<a class='b' href='?to=e3'></a>
					<a class='w'></a>
					<a class='b'></a>
					<a class='w'></a>
				<span class='y'>2</span>
					<a class='w'>♙</a>
					<a class='b'>♙</a>
					<a class='w'>♙</a>
					<a class='b'>♙</a>
					<a class='w sel' href='?undo=e2'>♙</a>
					<a class='b'>♙</a>
					<a class='w'>♙</a>
					<a class='b'>♙</a>            
				<span class='y'>1</span>
					<a class='b'>♖</a>
					<a class='w'>♘</a>
					<a class='b'>♗</a>
					<a class='w'>♕</a>
					<a class='b'>♔</a>
					<a class='w'>♗</a>
					<a class='b'>♘</a>
					<a class='w'>♖</a>        
			</body>
		</html>
	'''

board = ChessBoard()

board.draw(THEME_CLAIR)
