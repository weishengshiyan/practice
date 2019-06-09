package extends_ex;

public class Gongren extends Yuangong {

	public Gongren() {};
	public Gongren(int jingligongzi, String jingli, String gongren, int gongrengongzi) {
		super(jingligongzi, jingli, gongren, gongrengongzi);
		// TODO Auto-generated constructor stub
	}



	@Override
	void dagong() {
		// TODO Auto-generated method s
		System.out.print("\n我是工人，我在打工");
		
	}

}
