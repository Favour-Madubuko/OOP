
public class Player {
    private int totalStones;
    private String name;
    private int pickedStones;

    public Player(String name) {
        this.name = name;
    }

    public void pickedStones(int pickedStones) {
        this.pickedStones = pickedStones;
        this.totalStones = totalStones + pickedStones;
    }

    public void letters(String alphabet) {
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
