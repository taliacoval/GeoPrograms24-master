public class GradedPicture extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        //making the road
        plane.isTrail = true;
        plane.trailWidth = 200;
        plane.pausetime = 1;
        plane.setColor(115, 115, 115);
        plane.teleport(0, 600);
        plane.turn(90);
        plane.move(1500);
        plane.teleport(0, 700);
        plane.setColor(252, 216, 13);
        for (int x = 0; x < 15; x = x + 1) {
            plane.isTrail = true;
            plane.trailWidth = 10;
            plane.move(100);
            plane.isTrail = false;
            plane.move(100);
        }
        //making the grass
        plane.teleport(0, 450);
        plane.isTrail = true;
        plane.trailWidth = 150;
        plane.setColor(20, 145, 25);
        plane.move(1500);

        //making the sky
        plane.teleport(0, 250);
        plane.setColor(40, 165, 255);
        plane.trailWidth = 200;
        plane.move(1500);
        plane.teleport(0, 100);
        plane.move(1500);
        plane.teleport(0, 20);
        plane.move(1500);

//making the car
        car();
        mountion();
        sun();
    }

    public void car() {
        plane.teleport(1000, 650);
        plane.setColor(200, 0, 0);
        plane.isTrail = true;
        plane.trailWidth = 50;
        plane.turn(90);
        plane.move(150);
        plane.turn(270);
        plane.move(150);
        plane.turn(270);
        plane.move(50);
        plane.turn(90);
        plane.move(100);
        plane.turn(270);
        plane.move(100);
        plane.turn(270);
        plane.move(250);
        //filling the car
        plane.teleport(1000, 600);
        plane.trailWidth = 100;
        plane.turn(180);
        plane.move(155);
        plane.teleport(1040, 540);
        plane.trailWidth = 150;
        plane.move(10);
        plane.setColor(15, 15, 15);
        plane.trailWidth = 10;
        plane.teleport(1050, 750);
        for (int x = 0; x < 360; x = x + 1) {
            plane.move(1 / 2);
            plane.turn(1);
        }
        plane.teleport(1250, 750);
        for (int x = 0; x < 360; x = x + 1) {
            plane.move(1 / 2);
            plane.turn(1);
        }
        plane.teleport((int) (Math.random() * 1400), (int) (Math.random() * 450));
        plane.setColor(245, 218, 66);
        for (int x = 0; x < 360; x = x + 1) {
            plane.move(1 / 2);
            plane.turn(1);
        }
    }

    //drawing the mountains
    public void mountion() {
        plane.teleport(5, 450);
        plane.setColor(100, 100, 100);
        plane.trailWidth = 50;
        plane.turn(45);
        plane.move(300);
        plane.turn(270);
        plane.move(300);
        plane.teleport(50, 488);
        plane.turn(90);
        plane.move(250);
        plane.turn(270);
        plane.move(250);
        plane.teleport(130, 485);
        plane.turn(90);
        plane.move(150);
        plane.turn(270);
        plane.move(150);
        plane.turn(225);
        plane.trailWidth = 70;
        plane.move(250);
        plane.teleport(110, 450);
        plane.turn(180);
        plane.move(150);
    }

    public void sun() {
        for (int y = 0; y < 800; y = y + 1) {
            for (int x = 0; x < 1400; x = x + 1) {
                plane.teleport(x, y);
                int randx = (int) (Math.random() * 500);
                int randy = (int) (Math.random() * 400) + 200;

//filtering snoopy
                //  plane.teleport((int) (Math.random() * 500),(int) (Math.random() * 400)+200);
                green = plane.howMuchGreen();
                red = plane.howMuchRed();
                blue = plane.howMuchBlue();
                if (red > 150 && green > 180 && blue > 240) {
                    plane.setPixelColor(255, 255, 255);
                }
                }

            }
//woodstock face
        plane.teleport(1000,120);
        plane.trailWidth = 5;
        plane.setColor(0,0,0);
        for (int v = 0; v < 360; v = v + 1) {
            plane.move(1 / 4);
            plane.turn(10);
        }
plane.teleport(1176,158);
        plane.setColor(252,32,3);
        plane.turn(180);
        plane.move(100);
        for (int v = 0; v < 100; v = v + 2) {
            plane.move(1 / 6);
            plane.turn(-1);
        }
        //woodstock teeth
        plane.teleport(1176,161);
        plane.setColor(255,255,255);
        plane.trailWidth = 2;
        plane.move(10);
        plane.turn(100);
        plane.move(10);
        plane.turn(270);
        plane.move(10);
        plane.turn(100);
        plane.move(10);
        plane.turn(250);
        plane.move(10);
        plane.turn(100);
        plane.move(10);
        plane.turn(260);
        plane.move(10);
        plane.turn(100);
        plane.move(10);
        plane.turn(250);
        plane.move(10);
        plane.turn(100);
        plane.move(10);
        plane.turn(260);
        plane.move(10);
        plane.turn(100);
        plane.move(10);

    }
    }










