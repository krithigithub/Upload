package samplepoc;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
		Screen s = new Screen();
		
		Pattern p=new Pattern("E:\\Krithivasan\\Desktop\\krithi\\Notepad.PNG");
		
		Thread.sleep(5000);
		s.click(p);
	}

}
