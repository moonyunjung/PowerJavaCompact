
public class Television {
	private int channel; //채널번호
	private int volume; //볼륨
	private boolean onOff; //전원상태
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.print("채널은 " + channel + "이고 ");
		System.out.println("볼륨은 " + volume + "입니다.");
	}
}
