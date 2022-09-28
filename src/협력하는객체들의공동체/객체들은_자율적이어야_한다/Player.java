package 협력하는객체들의공동체.객체들은_자율적이어야_한다;

public class Player implements FootballPlayer{
    String shootStyle;

    Player(String shootStyle){
        this.shootStyle = shootStyle;
    }

    @Override
    public void shoot() {
        System.out.println(this.shootStyle);
    }

}
