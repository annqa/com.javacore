package lesson13;

public class Computer {
    private SystemBlock systemBlock;
    private Monitor monitor;

    public Computer(SystemBlock systemBlock, Monitor monitor) {
        this.systemBlock=systemBlock;
        this.monitor=monitor;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
