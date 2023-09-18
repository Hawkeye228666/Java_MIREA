public class MatchModel {
        private int milanScore;
        private int madridScore;

        public void milanScores() {
            milanScore++;
        }

        public void madridScores() {
            madridScore++;
        }

        public int getMilanScore() {
            return milanScore;
        }

        public int getMadridScore() {
            return madridScore;
        }

        public String getWinner() {
            if (milanScore > madridScore) {
                return "AC Milan";
            } else if (madridScore > milanScore) {
                return "Real Madrid";
            } else {
                return "DRAW";
            }
        }
}
