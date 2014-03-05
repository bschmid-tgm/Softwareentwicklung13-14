import java.awt.Point;
import java.util.Timer;
import java.util.TimerTask;

public class SnakeRun extends TimerTask {
	public SnakeModel m;
	public int dir;
	
	public SnakeRun(SnakeModel m){
		this.m = m;
	}
	public void startRun(TimerTask task){
		
	}
	
	public void run() {
		
		switch(dir)
		{
		case 1:
			m.rauf();
			break;
		case 2:
			m.runter();
			break;

		case 3:
			m.rechts();
			break;
		case 4:
			m.links();
			break;
		}
		for(int i=0;i<m.schlange.size(); i++){
			if(m.schlange.getLast().x == m.schlange.get(i).x&&m.schlange.getLast().y == m.schlange.get(i).y){
				m.verloren=true;
			if(m.schlange.getLast().x < 0){
				m.schlange.set(i, new Point(m.schlange.get(i).x+600,m.schlange.get(i).y));
			}
			if(m.schlange.getLast().y < -10){
				m.schlange.set(i,new Point(m.schlange.get(i).x,m.schlange.get(i).y+400));
			}
			if(m.schlange.getLast().x > 600){
				m.schlange.set(i,new Point(m.schlange.get(i).x-600,m.schlange.get(i).y));
			}
			if(m.schlange.getLast().y > 400){
				m.schlange.set(i,new Point(m.schlange.get(i).x,m.schlange.get(i).y-400));
			}
			}
	}
}
}
