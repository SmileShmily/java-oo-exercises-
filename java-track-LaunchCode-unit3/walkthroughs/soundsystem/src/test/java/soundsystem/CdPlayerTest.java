package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CdPlayerConfig.class)
public class CdPlayerTest extends TestCase {
	@Rule
	public final SystemOutRule log = new SystemOutRule().enableLog();
	@Autowired
	private MediaPlayer cdPlayer;
    @Test
    public void testCdPlayer(){
	  // MediaPlayer cdPlayer=new CdPlayer();
	   cdPlayer.play();
	   assertEquals(log.getLog(), "Playing Born to Run by Bruce Springsteen\n");
	}
	
}

