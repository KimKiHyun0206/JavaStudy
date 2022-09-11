package object;

import role.Intermediary;
import role.Witness;

public class Rabbit extends Status implements Intermediary {

    public Rabbit(){
        this.name = "Rabbit";
        this.status ="Intermediary";
    }
    @Override
    public void intermediaryWitness(Witness witness) {
        System.out.println(this.name+ " : witness, do testimony");
        witness.testify();
    }
}
