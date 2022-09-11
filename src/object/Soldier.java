package object;

import role.Witness;

public class Soldier extends Trump implements Witness {

    Soldier(String name){
        this.name = name;
    }

    @Override
    public void testify() {
        System.out.println(this.name+" : I SEE ALICE DO IT!!");
    }
}
