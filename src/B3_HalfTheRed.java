public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("snoopy cartoon.jpeg");
        plane.showBackGround();

        for (int y = 0; y < 1000; y = y + 1) {
            for (int x = 0; x < 1500; x = x + 1) {
                plane.teleport(x, y);
                green = plane.howMuchGreen();
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                if (red>250 && blue>250 && green>250) {
                    plane.setPixelColor(200, 200, 200);
                }
                    if (red>210 && green<5 && blue<65){
                        plane.setPixelColor(235,52,180);
                    }
                }
                }
                }
            }





