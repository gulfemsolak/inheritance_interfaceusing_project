package Inheritance_electronicDevices;

public class Computer extends ElectronicDevice {
        private int hddCapacity;
        private int memory;
        private String operatingSystem;
        private double cpuFrequency;
        private boolean hasExternalGpu;
        private double gpuMemory;
    
    
        public Computer(int hddCapacity, int memory, String operatingSystem, double cpuFrequency,
         boolean hasExternalGpu, double gpuMemory, String name, double width, double height, double mass, double voltage, boolean isActive){ 
            super(name, width, height, mass, voltage, isActive);
            this.hddCapacity = hddCapacity;
            this.memory = memory;
            this.operatingSystem = operatingSystem;
            this.cpuFrequency = cpuFrequency;
            this.hasExternalGpu = hasExternalGpu;
            this.gpuMemory = gpuMemory;
        }
    
        public int getHddCapacity() {
            return hddCapacity;
        }
    
        public void setHddCapacity(int hddCapacity) {
            this.hddCapacity = hddCapacity;
        }
    
        public int getMemory() {
            return memory;
        }
    
        public void setMemory(int memory) {
            this.memory = memory;
        }
    
        public String getOperatingSystem() {
            return operatingSystem;
        }
    
        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }
    
        public double getCpuFrequency() {
            return cpuFrequency;
        }
    
        public void setCpuFrequency(double cpuFrequency) {
            this.cpuFrequency = cpuFrequency;
        }
    
        public boolean isHasExternalGpu() {
            return hasExternalGpu;
        }
    
        public void setHasExternalGpu(boolean hasExternalGpu) {
            this.hasExternalGpu = hasExternalGpu;
        }
    
        public double getGpuMemory() {
            return gpuMemory;
        }
    
        public void setGpuMemory(double gpuMemory) {
            this.gpuMemory = gpuMemory;
        }
         
        @Override
        public void turnOn(){
            System.out.println("Computer is turning on.");
        }

        @Override
        public void turnOff(){
            System.out.println("Computer is turning off.");
        }
        
}
