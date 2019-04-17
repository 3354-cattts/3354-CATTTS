package UMLER;

public class Class{
    // Members
    public String scope;
    public boolean abstr;
    public String name;
    public String[] parents;
    public String[] interfaces;
    public Method[] methods;
    public Variable[] variables;
    // Constructors
    public Class(String scp, boolean abs, String nm, String[] daddies, String[] rules, Variable[] vars, Method[] meths){
	scope = scp;
	abstr = abs;
	name = nm;
	parents = new String[daddies.length];
	for(int i=0; i < parents.length; ++i)
	    parents[i] = daddies[i];
	interfaces = new String[rules.length];
	for(int i=0; i < rules.length; ++i)
	    interfaces[i] = rules[i];
	variables = new Variable[vars.length];
	for(int i=0; i <vars.length; ++i)
	    variables[i] = vars[i];
	methods = new Method[meths.length];
	for(int i=0; i < meths.length; ++i)
	    methods[i] = meths[i];
    }
    public String java(){
	String clas = "";
	if(!scope.equals(""))
	    clas += scope+" ";
	if(abstr)
	    clas += "abstract ";
	clas += "class "+name;
	if(parents.length > 0)
	    clas +=" extends "+parents[0];
	if(interfaces.length > 0){
	    clas +=" implements ";
	    for(int i=0; i < interfaces.length -1; ++i)
		clas += interfaces[i]+", ";
	    clas += interfaces[interfaces.length-1];
	}
	clas += "{\n";
	for(Variable v: variables)
	    clas += "\t"+v.java()+"\n";
	clas += "\n";
	for(Method m: methods)
	    clas += "\t"+m.java()+"{\n\t\n\t}\n\n";
	clas +="}";
	return clas;
    }
}
