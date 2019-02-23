class Computer implements Comparable<Computer>{

    String name;
    double processorSpeed;
    double capacityRam;

    public Computer(String name, double processorSpeed, double capacityRam) {
        this.name = name;
        this.processorSpeed = processorSpeed;
        this.capacityRam = capacityRam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public double getCapacityRam() {
        return capacityRam;
    }

    public void setCapacityRam(double capacityRam) {
        this.capacityRam = capacityRam;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processorSpeed=" + processorSpeed +
                ", capacityRam=" + capacityRam +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return 0;
    }
}
