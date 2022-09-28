package 협력하는객체들의공동체.객체들은_역할과_책임을_통해_협력한다;

public class Actor {
    String name;
    String plot;

    Actor(String name,String plot){
        this.name = name;
        this.plot = plot;
    }

    public String getName() {
        return name;
    }

    public void performancePlay(){
        System.out.println(this.plot);
    }
}
