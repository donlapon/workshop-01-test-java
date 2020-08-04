public class TennisGame2{

    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    private String getPoint(int point){
        switch(point){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
        }
        return "Forty";
    }

    public String getScore(){
        String player1Result;
        String player2Result;

        // Winner
        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2) {
            return "Win for " + player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2) {
            return "Win for " + player2Name;
        }

        // Advantage
        if (player1Point > player2Point && player2Point >= 3) {
            return "Advantage " + player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3) {
            return "Advantage " + player2Name;
        }

        // เสมอ
        if (player1Point == player2Point && player1Point < 3) {
            return getPoint(player1Point) + "-All";
        }
        if (player1Point == player2Point) {
            return "Deuce";
        }

        // normal
        player1Result = getPoint(player1Point);
        player2Result = getPoint(player2Point);
        return player1Result + "-" + player2Result;
    }

    public void p1Score(){
        player1Point++;
    }

    public void p2Score(){
        player2Point++;
    }

    public void wonPoint(String player) {
        // if (player.equals("player1"))  1 => NullPointerException (NPE)
        if ("player1".equals(player)) { // 2
            p1Score();
        }
        else {
            p2Score();
        }
    }

}
