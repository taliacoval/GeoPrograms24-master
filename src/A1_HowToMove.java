public class A1_HowToMove extends World {

    public void go() {

        System.out.println("tacos");
        plane.teleport(100, 200);
        plane.startingAngle(0);
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
        plane.isTrail = true;

//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(80);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.teleport(800, 200);
//        plane.startingAngle(0);
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(80);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.teleport(800, 751);
//        plane.startingAngle(0);
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(80);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.teleport(100, 751);
//        plane.startingAngle(0);
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(80);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.isTrail = false;
//        plane.setColor(132, 70, 240);
//        plane.trailWidth = 15;
//        plane.move(0);
//        plane.turn(100);
//        plane.isTrail = true;
//        plane.move(150);
//        plane.turn(350);
//        plane.teleport(300, 300);
//
//
//        square();
        plane.teleport(285,500);
        house();
        plane.teleport(385,500);
        house();
        plane.teleport(485,500);
        house();
        plane.teleport(585,500);
        house();
        plane.teleport(685,500);
        house();
        plane.teleport(785,500);
        house();

    }

    public void square(int size) {
        plane.startingAngle(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);
        plane.move(size);
        plane.turn(90);


      //  house();
    }
    public void house() {
        plane.setColor((int) (Math.random() * 256),(int) (Math.random() * 256), (int) (Math.random() * 256));
        plane.trailWidth = ((int) (Math.random()* 20));
        square(100);
        plane.turn(90);
        plane.move(100);

        //making the roof
        plane.turn(-45);
        plane.move(70);
        plane.turn(-90);
        plane.move(70);
    }


}



