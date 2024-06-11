import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Nextcar extends Vehicle implements KeyListener{
	
	
	public Nextcar(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x+20,y,40,20);
		frame.fillRect(x,y+20,80,20);
		frame.fillOval(x+10,y+40,20,20);
		frame.fillOval(x+50,y+40,20,20);
	}
//キーから文字が入力されたとき
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("キーが押されました");
	}
//キーが押されたとき
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			vx=-5;	
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			vx=5;	
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			vx=5;	
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			vx=5;	
		}
	}
	//キーが離されたとき
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		vx=0;
	}
	
	
	
	
	
	
}
