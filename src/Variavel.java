enum Type{
	FLOAT("float"),
	BYTE("byte"),
	INT("int"),
	DYNAMIC("dynamic"),
	BOOLEAN("boolean"),
	VOID("void"),
	STRING("string");
	
	private String name;
	
	Type(String name){
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}


public class Variavel {
	
	
	Type type;
	
	public Variavel(Type type) {
		this.type = type;
	}
	
	Type getValue() {
		return this.type;
	}

}
