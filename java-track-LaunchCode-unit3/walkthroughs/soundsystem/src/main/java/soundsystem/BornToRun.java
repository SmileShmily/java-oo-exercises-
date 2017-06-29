package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class BornToRun implements CompactDisc{
     private String title="Born to Run";
     private String artist="Bruce Springsteen";
     
     public void play(){
    	 System.out.println("Playing"+title+"by"+artist);
     }
}
