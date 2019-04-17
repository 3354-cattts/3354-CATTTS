package UMLER;

public class Method extends Attribute{
    // Members
    public String return_type;
    public Variable[] parameters;
    // Constructors
    public Method(String typ, String nm, Variable[] params){
	super("", nm);
	return_type = typ;
	parameters = new Variable[params.length];
	for(int i=0; i< params.length; ++i)
	    parameters[i] = params[i];
    }
    public Method(String scp, String typ, String nm, Variable[] params){
	super(scp, nm);
	return_type = typ;
	parameters = new Variable[params.length];
	for(int i=0; i< params.length; ++i)
	    parameters[i] = params[i];
    }
    public String java(){
	String meth = "";
	if(!scope.equals(""))
	    meth = scope+" ";
	if(!return_type.equals(""))
	    meth += return_type+" ";
	meth += super.name+"(";
	if(parameters.length > 0){
	    for(int i=0; i< parameters.length - 1; ++i)
		meth += parameters[i].data_type + " "+parameters[i].name+", ";
	    meth += parameters[parameters.length -1].data_type + " "+parameters[parameters.length -1].name;
	}
	return meth+")";
    }
}
