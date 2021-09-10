package lesson7.entity;

public class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private Integer resource;

    public Computer() {

    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRam() {
        return ram;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getHdd() {
        return hdd;
    }

    public void setResource(Integer resource) {
        this.resource = resource;
    }

    public Integer getResource() {
        return resource;
    }

    public void printInfo() {
        System.out.println("System information: ");
        System.out.println("CPU - " + cpu);
        System.out.println("RAM - " + ram);
        System.out.println("HDD - " + hdd);
    }

    public void start() {
        System.out.println("Computer started.");

    }

    public void shutDown() {
        System.out.println("Computer shut down");
    }

    public void crash() {
        System.out.println("Computer crashed");
    }
}
