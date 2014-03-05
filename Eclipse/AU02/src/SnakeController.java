import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;


public class SnakeController implements ActionListener, KeyListener {
	SnakeModel m;
	SnakeView v;
	Timer t;
	SnakeRun sr;
	public SnakeController(){
		this.m = new SnakeModel();
		this.v = new SnakeView(this.m, this);
		this.t = new Timer();
		this.sr = new SnakeRun(m);
		m.init(sr, t);
	}
	public void actionPerformed(ActionEvent e){
		if(v.isButtonRechts(e)){
			m.rechts();
		}
		if(v.isButtonLinks(e)){
			m.links();
		}
		if(v.isButtonRauf(e)){
			m.rauf();
		}
		if(v.isButtonRunter(e)){
			m.runter();
		}
		
		
		v.refresh();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			this.sr.dir = 1;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN){
			this.sr.dir = 2;
			
		}
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_LEFT){
			this.sr.dir = 4;
			
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			this.sr.dir = 3;
			
			
		}
		
		if(e.getKeyCode()== KeyEvent.VK_SPACE)
			sr.dir = 0;
		
		v.refresh();
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
