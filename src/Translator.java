


public class Translator {
	
	
	public static String translate(Function f) {
		String ret = "";
		ret += f.name;
		ret += "(";
		for(String p : f.parametersTypes) {
			switch (p) {
			case "string":
				ret += "Ljava/lang/String;";
				break;
			case "int":
				ret += "I";
				break;
			case "float":
				ret += "F";
				break;
			default:
				break;
			}
		}
		ret += ")V";
		return ret;
		
	}

}
