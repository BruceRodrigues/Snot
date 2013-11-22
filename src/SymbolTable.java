import java.util.ArrayList;


public class SymbolTable {
	
	
	public ArrayList<Variavel> vars;
	public ArrayList<String> types;
	public ArrayList<Function> functions;
	public ArrayList<String> classes;
	
	
	public SymbolTable() {
		this.vars = new ArrayList<Variavel>();
		this.types = new ArrayList<String>();
		this.functions = new ArrayList<Function>();
		this.classes = new ArrayList<String>();
	}
	
	public boolean contains(String name) {
		return this.get(name) != null;
	}
	
	public boolean contains(Variavel var) {
		return this.get(var) != null;
	}
	
	public boolean containsType(String type) {
		for (Variavel v : this.vars) {
			String t = v.type;
			if(t.equals(type))
				return true;
		}
		return this.types.contains(type);
	}
	
	public void addFunction(String function) {
		this.functions.add(new Function(function));
	}
	
	public void addFunction(Function function) {
		this.functions.add(function);
	}
	
	public Function getFunction(String name) {
		for (Function f : this.functions) {
			if(f.name.equals(name))
				return f;
		}
		return null;
	}
	
	public boolean containsFunction(String function) {
		return this.functions.contains(function);
	}
	
	public boolean containsClass(String clazz) {
		return this.functions.contains(clazz);
	}
	
	public void addClass(String clazz) {
		this.classes.add(clazz);
	}
	
	public void add(Variavel var) {
		this.vars.add(var);
	}
	
	public void remove(int index) {
		this.vars.remove(index);
	}
	
	public void remove(Variavel var) {
		this.vars.remove(var);
	}
	
	public void remove(String id) {
		Variavel var = this.get(id);
		if(var != null) 
			this.vars.remove(var);
	}
	
	public Variavel get(Variavel var) {
		for (Variavel v : this.vars) {
			if(v.id.equals(var.id))
				return v;
		}
		return null;
	}
	
	public Variavel get(String id) {
		for (Variavel v : this.vars) {
			if(v.id.equals(id))
				return v;
		}
		return null;
	}
}
