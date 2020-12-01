package case2.step1;

public class MyClassB implements Observer {

    private boolean bPlay;	// 실행 여부

	@Override
	public void update(boolean play) {
        this.bPlay = play;
        myActControl();
	}

	public void myActControl() {
    	if (bPlay) {
            System.out.println("MyClassB : 동작을 시작합니다.");
    	} else {
            System.out.println("MyClassB : 동작을 정지합니다.");
    	}
    }
}
