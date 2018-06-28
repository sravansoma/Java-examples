public class DrumKitTest{
    public static void main(String[] args){

        DrumKitDrive d = new DrumKitDrive();
        if (d.snare) {
            d.playSnare();
        }
        if (d.topHat) {
            d.playTopHat();
        }
    }
}