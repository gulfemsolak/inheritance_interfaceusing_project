package Inheritance_electronicDevices;

public class Test {
    public static void main(String[] args) {
        Computer myComputer = new Computer(
            512,          
            16,           
            "Windows 10", 
            3.6,          
            true,         
            6.0,          
            "Gaming PC",  
            40.0,        
            20.0,         
            8.5,          
            230.0,        
            true          
        );

        SmartPhone mySmartPhone = new SmartPhone(
            "Android",        
            128,               
            8,                 
            12,               
            "Samsung",         
            4000,              
            "Galaxy A52",      
            7.6,              
            15.1,              
            0.169,             
            5.0,               
            true               
        );

        

        mySmartPhone.turnOn();;
        mySmartPhone.turnOff();;

        myComputer.turnOn();
        myComputer.turnOff();;

}
}