public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 1;
        plane.pausetime = 0;
for(int y = 0; y<700; y=y+1) {
    for (int x = 0; x < 800; x = x + 1) {
        plane.teleport(x, y);
        System.out.println("x: " + x);
        plane.setColor(100, y/5, x/5);
        plane.square(1);
    }
}
    }


    public void rowOfSquares(int y) {


        for (int x = 0; x < 1000; x = x + 1) {
            plane.teleport(x, y);
            System.out.println("x: " + x);
            plane.setColor(200,y/5,x/5);
            plane.square(1);
        }

    }
}



