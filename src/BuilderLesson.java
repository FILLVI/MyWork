public class BuilderLesson {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Audi").setColor("green").setMaxSpeed(200).build();
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
        System.out.println(sportCar.getName());
    }
}
class SportCar {
    private String name;
    private int maxSpeed;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;


        public Builder(String name) {
            this.name = name;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public SportCar build(){
            return new SportCar(this);
        }
    }
}