package com.inkglobal.techtest;

import java.util.ArrayList;
import java.util.List;

/**
 * This class converts the time to Berlin time
 * 
 */
public class BerlinClock {
	
	/**
	 * This method accepts the time in hh:mm:ss format
	 * and returns a string array containing the time
	 * in Berlin format
	 *  
	 * @param time String time in hh:mm:ss format
	 * @return String[] in Berlin time
	 */
	public String[] convertToBerlinTime(String time) {
        
		// TODO Validate input time
		
        List<Integer> parts = new ArrayList<>();

        // Split the input time
        for (String part : time.split(":")) {
            parts.add(Integer.parseInt(part));
        }
        
        // Calculate Berlin time
        return new String[] {
                getSeconds(parts.get(2)),
                getTopHours(parts.get(0)),
                getBottomHours(parts.get(0)),
                getTopMinutes(parts.get(1)),
                getBottomMinutes(parts.get(1))
        };
    }

	/**
	 * Get the value for the lamp in the top of the clock
	 * depending on the value(seconds) passed to the method
	 * 
	 * This is a yellow lamp that blinks on/off every two seconds
	 *  
	 * @param number Seconds value
	 * @return Value of the yellow lamp on top of the clock
	 */
    protected String getSeconds(int number) {
    	// Checks if the seconds is multiple of 2
    	// If yes, return Y else O
        if (number % 2 == 0) {
        	return "Y";
        } else {
        	return "O";
        }
    }

    /**
     * Gets the value for the top row hours of the clock
     * 
     * @param number
     * @return
     */
    protected String getTopHours(int number) {
    	// This method invokes the getNumberOfSignsInTopRow method
    	// to get number of active lamps in the top row of hours.
    	// Then pass the value to getOnOff method along with number of
    	// lamps and colour of lamp (R) which will return the lamps in order
        return getOnOff(4, getNumberOfOnSignsInTopRow(number), "R");
    }

    protected String getBottomHours(int number) {
        return getOnOff(4, number % 5, "R");
    }

    protected String getTopMinutes(int number) {
        return getOnOff(11, getNumberOfOnSignsInTopRow(number), "Y").replaceAll("YYY", "YYR");
    }

    protected String getBottomMinutes(int number) {
        return getOnOff(4, number % 5, "Y");
    }
    
    private String getOnOff(int lamps, int onSigns, String onSign) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < onSigns; i++) {
            out.append(onSign);
        }
        for (int i = 0; i < (lamps - onSigns); i++) {
            out.append("O");
        }
        return out.toString();
    }
 
    private int getNumberOfOnSignsInTopRow(int number) {
//        return (number - (number % 5)) / 5;
    	return (number / 5);
    }
	
}
