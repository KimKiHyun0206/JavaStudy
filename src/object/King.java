package object;

import role.Intermediary;
import role.Politics;
import role.Trial;
import role.Witness;

public class King extends Trump implements Politics, Trial {

    public King(){
        this.name = "King";
    }

    //Politics interface
    @Override
    public void politics() {
        System.out.println(this.name +" do politics");
    }


    //Trial interface
    @Override
    public void trial(Status status) {
        System.out.println(this.name +"trial "+status.name);
    }

    @Override
    public void requestForTestimony(Intermediary intermediary,Witness witness) {
        System.out.println("[ "+this.name + " request for testimony ]");
        intermediary.intermediaryWitness(witness);
    }
}
