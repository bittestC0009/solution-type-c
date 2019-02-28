package problem02;

public class MyService extends BaseService {

	public String afternoon() {
		return "오후서비스시작";
	}

	@Override
	public String day() {
		return "낮서비스시작";
	}

	@Override
	public String night() {
		return "밤서비스시작";
	}

	@Override
	public void service(String state) {
		
		if (state.equals("낮")) {
			
		}
		
		String result = state.equals("낮") ? day() : night() ;
		System.out.println(result);
		
	}
	
}
