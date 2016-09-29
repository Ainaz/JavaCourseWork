package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Auto auto = new Auto(4, 95);
        SportAuto sportAuto = new SportAuto(10, 96);
        Bike bike = new Bike(10);

        Transport transports[] = {auto, sportAuto, bike};

        for (int i = 0; i < transports.length; i++) {
            Transport currentTransport = transports[i];
            currentTransport.go();
        }

        for (Transport currentTransport : transports) {
            currentTransport.go();
        }

        System.out.print("Transport: " + countWheelMin(transports) + " Count of wheels: "  + countWheelMin(transports).getWheelCount());
    }

    public static Transport countWheelMin(Transport[] transports){
        int minCountWheels = transports[0].getWheelCount();
        Transport trans = transports[0];
        for (int i = 0; i < transports.length; i++) {
            if (transports[i].getWheelCount() < minCountWheels){
                minCountWheels = transports[i].getWheelCount();
            }
        }
        for (Transport currentTransport : transports) {
            if(currentTransport.getWheelCount() == minCountWheels){
                trans = currentTransport;
            }
        }
        return trans;
    }

}
