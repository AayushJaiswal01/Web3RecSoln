public class Car {
    String make;
    String model;
    int year;
    int speed;
    int x;
    int y;
    int z;
    public Car(String make,String model,int year,int speed,int x,int y,int z){
        this.make=make;
        this.model=model;
        this.year=year;
        this.speed=speed;
        this.x=x;
        this.y=y;
        this.z=z;

    }
    public void accelerate(int speed_increment) {
        speed =speed+speed_increment;
    }
    public void brake(int speed_decrement) {
        speed =speed- speed_decrement;
    }
    public void move() {
        x =x+ speed;
        y=y+ speed;
        z=z+ speed;

    }
    public boolean detect_collision(Car new_car){
        if (new_car.x==this.x && new_car.y==this.y && new_car.z==this.z ) {
            return true;
        }
        else{
            return false;
        }


    } double time_to_collision(Car new_car){
        double distance = Math.sqrt(Math.pow(this.x - new_car.x, 2) + Math.pow(this.y - new_car.y, 2) + Math.pow(this.z - new_car.z, 2));
        double time = distance/(Math.abs(this.speed-new_car.speed));
        return time;
    }

    public static void main(String[] args)
    {
        //Sample values

        Car car1 = new Car("Maruti", "Breeza", 2015, 30, 20, 0,0);
        Car car2 = new Car("Maruti", "alto", 2015, 10, 40, 0,0);
        car1.accelerate(20);
        car2.brake(30);
        car1.move();
        car2.move();
        System.out.println("Car 1 position: "+car1.x +" "+car1.y +" "+car1.z);
        System.out.println("Car 2 position: "+car2.x +" "+car2.y+" "+car2.z);
        System.out.println("Collision: " + car1.detect_collision(car2));
        System.out.println("Time left before collision: " +car1.time_to_collision(car2));



    }
}
