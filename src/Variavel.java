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
	
	public String id;
	public Type type;
	
	public Variavel(String id,Type type) {
		this.id = id;
		this.type = type;
	}
}
