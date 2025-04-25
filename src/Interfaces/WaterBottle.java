// Interfaces Homweork 4/23/25
package Interfaces;

public class WaterBottle implements Comparable<WaterBottle>  {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int compareTo(WaterBottle waterBottle) {
        return this.volume - waterBottle.volume;
    }

    public int getVolume() {
        return volume;
    }
    
}
