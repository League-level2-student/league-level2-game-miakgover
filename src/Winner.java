
public class Winner {
	public String checkWinner(String[]squares) {
		//check for X winner
		for(int i=0; i<7; i+=3) {
			if (squares[i] == "x" && squares[i+1] == "x" && squares[i+2] == "x") {
				return "Player One";
			}
		}
		for(int i=0; i<3; i++) {
			if(squares[i] == "x" && squares[i+3] == "x" && squares[i+6] == "x") {
				return "Player One";
			}
		}
		if (squares[0] == "x" && squares[4] == "x" && squares[8] == "x" || 
				squares[2] == "x" && squares[4] == "x" && squares[6] == "x") {
			return "Player One";
		}
		//check for O winner
		for(int i=0; i<7; i+=3) {
			if (squares[i] == "o" && squares[i+1] == "o" && squares[i+2] == "o") {
				return "Player Two";
			}
		}
		for(int i=0; i<3; i++) {
			if(squares[i] == "o" && squares[i+3] == "o" && squares[i+6] == "o") {
				return "Player Two";
			}
		}
		if (squares[0] == "o" && squares[4] == "o" && squares[8] == "o" || 
				squares[2] == "o" && squares[4] == "o" && squares[6] == "o") {
			return "Player Two";
		}
		//
		return "no winner";
	}
}
