package Run;

import object.Alice;
import object.Queen;
import object.Rabbit;
import role.Intermediary;
import role.Trial;
import role.Witness;

public class ThePresidingJudge {
    public static void main(String[] args) {
        //judge : King , Queen
        Trial judge = new Queen();
        //witness Alice , Solider
        Witness witness = new Alice();
        //intermediary Rabbit
        Intermediary intermediary = new Rabbit();

        judge.requestForTestimony(intermediary,witness);
    }
}
