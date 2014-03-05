import java.awt.List;
import java.awt.Point;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;


public class SnakeModel {
	LinkedList<Point> schlange;
	int schrittweite;
	public Timer t;
	int x1;
	int y1;
	boolean isPause;
	public boolean verloren=false;
	public SnakeModel(){
		Point a = new Point(20,20);
		schlange = new LinkedList<Point>();
		schlange.add(a);
		schrittweite = 20;
		t = new Timer();
		isPause = false;
	}
	public Point futter(){
		/*x1 = (int)(Math.random()*1000);
		y1 = (int)(Math.random()*1000);
		if(x1%20 != 0 || x1 <= 400){
			while(x1%20 != 0 || x1 <= 400){
				x1 = (int)(Math.random()*1000);
			}
		}
		if(y1%20 != 0 || y1 > 600){
			while(y1%20 != 0 || y1 > 600){
				y1 = (int)(Math.random()*1000);
			}
		}
		Point a = new Point (x1, y1);
		return a;
		*/
		return new Point((int)(Math.random()*10)*60,(int)(Math.random()*10)*40);
		
	}
		
	public void rauf(){
		Point kopf = new Point(schlange.getLast().x, schlange.getLast().y - schrittweite);
		if(schlange.size() <= 10){
			schlange.add(kopf);
			
		}else{
			schlange.add(kopf);
			schlange.removeFirst();
		}
	}
	public void runter(){
		Point kopf = new Point(schlange.getLast().x, schlange.getLast().y + schrittweite);
		if(schlange.size() <= 10){
			schlange.add(kopf);
		}else{
			schlange.add(kopf);
			schlange.removeFirst();
			}
	}
	public void links(){
		Point kopf = new Point(schlange.getLast().x - schrittweite, schlange.getLast().y);
		if(schlange.size() <= 10){
			schlange.add(kopf);
		}else{
			schlange.add(kopf);
			schlange.removeFirst();
			}
	}
	public void rechts(){
		Point kopf = new Point(schlange.getLast().x + schrittweite, schlange.getLast().y);
		if(schlange.size() <= 10){
			schlange.add(kopf);
		}else{
			schlange.add(kopf);
			schlange.removeFirst();
			}
	}
	public void startMove(TimerTask task){
		
	}
	
	public void init(SnakeRun sr, Timer t)
	{
		this.t = t;
		this.t.schedule(sr, 60, 60);
		
	}
	public void stop(SnakeRun sr) throws Exception
	{
		if(!isPause){
		t.schedule(sr, 1000,1000);
		isPause = true;
		}
		else
		{
			t.schedule(sr,60,60);
			isPause = false;
		}
	}
}
