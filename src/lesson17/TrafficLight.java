package lesson17;

// TrafficLight.java
public enum TrafficLight {
    RED(30, "Stop"),
    GREEN(60, "Go"),
    YELLOW(10, "Get Ready");

    private int duration;
    private String message;

    TrafficLight(int duration, String message) {
        this.duration = duration;
        this.message = message;
    }

    public int getDuration() {
        return duration;
    }

    public String getMessage() {
        return message;
    }

    public TrafficLight next() {
        switch (this) {
            case RED: return GREEN;
            case GREEN: return YELLOW;
            case YELLOW: return RED;
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}

// TrafficLightSimulator.java
 class TrafficLightSimulator {
    public static void main(String[] args) {
        TrafficLight currentLight = TrafficLight.RED;

        for (int i = 0; i < 10; i++) { // Loop to simulate 10 cycles
            System.out.println("Current Light: " + currentLight +
                    ", Duration: " + currentLight.getDuration() + " seconds" +
                    ", Message: " + currentLight.getMessage());
            currentLight = currentLight.next();
            try {
                Thread.sleep(currentLight.getDuration() * 1000); // Sleep for the duration of the light
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
