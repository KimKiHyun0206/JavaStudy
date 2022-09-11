package object;

import role.Intermediary;
import role.Politics;
import role.Trial;
import role.Witness;

public class Queen extends Trump implements Trial, Politics {

    public Queen(){
        this.name="Queen";
    }

    //Politics interface
    @Override
    public void politics() {
        System.out.println(this.name +" do politics");
    }


    //Trial interface
    @Override
    public void trial(Status status) {
        System.out.println("[ "+this.name +"trial "+status.name+" ]");
    }

    @Override
    public void requestForTestimony(Intermediary intermediary, Witness witness) {
        System.out.println(this.name + ": do it");
        intermediary.intermediaryWitness(witness);
    }
}
