package com.seppo;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class Car {

	private static Car instance;
	private GpioController gpio;
	private GpioPinDigitalOutput forwardPin;
	
	private Car(){
		System.out.println("Car initialising");
        
        // create gpio controller
       /* gpio = GpioFactory.getInstance();
        
        // provision gpio pin #01 as an output pin and turn on
        forwardPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED");
       
        // set shutdown state for this pin
        forwardPin.setShutdownOptions(new Boolean(true), PinState.LOW);
*/
        /*
        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);
        
        // turn off gpio pin #01
        pin.low();
        System.out.println("--> GPIO state should be: OFF");

        Thread.sleep(5000);

        // toggle the current state of gpio pin #01 (should turn on)
        pin.toggle();
        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // toggle the current state of gpio pin #01  (should turn off)
        pin.toggle();
        System.out.println("--> GPIO state should be: OFF");
        
        Thread.sleep(5000);

        // turn on gpio pin #01 for 1 second and then off
        System.out.println("--> GPIO state should be: ON for only 1 second");
        pin.pulse(1000, true); // set second argument to 'true' use a blocking call
        */
        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)
        
	}
	
	static Car getInstance(){
		
		if (instance==null){
			instance=new Car();
		}

		return instance;
	}
	
	public void scrap(){
		System.out.println("Scrapping Car");
		//gpio.shutdown();
	}
	
	public void forward(){
		System.out.println("Going Forward");
		//forwardPin.high();
	}
}
