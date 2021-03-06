
import java.util.ArrayList;


public class Function {
	
	public ArrayList<String> parametersTypes;
	public String name;
	
	public Function(String name) {
		this.parametersTypes = new ArrayList<String>();
		this.name = name;
	}
	
	public void addParameterType(String type) {
		this.parametersTypes.add(type);
	}
	
	public boolean checkParameters(ArrayList<String> parameters) {
		for (int i =0; i < this.parametersTypes.size(); i++) {
			String t1 = this.parametersTypes.get(i);
			String t2 = parameters.get(i);
			if(!t1.equals(t2)) {
				return false;
			}
		}
		return true;
	}

}
