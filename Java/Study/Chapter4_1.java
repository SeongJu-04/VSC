

import java.util.*;

public class Chapter4_1 {
    private boolean isOn;
    
    public void turnOn() {  isOn = true;    }
    public void turnOff() {     isOn = false;   }
    public String toString() {
        return ("현재상태는 " + (isOn == true ? "켜짐" : "꺼짐"));
    }
}
