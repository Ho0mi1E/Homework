package OOP.task1;

public class PC {
    private String mouse;
    private String keyboard;
    private String screen;
    private String soundProducer;
    private String memory;
    private String cpu;
    private String ram;
    private String videoAdapter;

    public PC(String mouse, String keyboard, String screen, String soundProducer, String memory, String cpu, String ram, String videoAdapter) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.screen = screen;
        this.soundProducer = soundProducer;
        this.memory = memory;
        this.cpu = cpu;
        this.ram = ram;
        this.videoAdapter = videoAdapter;
    }

    public PC(String mouse, String keyboard, String screen, String memory, String cpu, String ram) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.screen = screen;
        this.memory = memory;
        this.cpu = cpu;
        this.ram = ram;
    }

    public PC(String mouse, String memory, String cpu, String ram, String videoAdapter) {
        this.mouse = mouse;
        this.memory = memory;
        this.cpu = cpu;
        this.ram = ram;
        this.videoAdapter = videoAdapter;
    }

    public String getMouse() {
        return mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getScreen() {
        return screen;
    }

    public String getSoundProducer() {
        return soundProducer;
    }

    public String getMemory() {
        return memory;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getVideoAdapter() {
        return videoAdapter;
    }
}
