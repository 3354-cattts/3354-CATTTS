package UMLER;

public class Variable extends Attribute{
    // Members
    public String data_type;
    public String initial_value;
    // Constructorsnn
    public Variable(String typ, String nm){
	super("", nm);
	data_type = typ;
	initial_value = "";
    }
    public Variable(String scp,String typ, String nm){
	super(scp, nm);
	data_type = typ;
	initial_value = "";
    }
    public Variable(String scp, String typ, String nm, String value){
	super(scp, nm);
	data_type = typ;
	initial_value = value;
    }
    public String java(){
	if(scope.equals("")){//there is no specified scope
	    if(initial_value.equals(""))
		return data_type+" "+name+";";
	    else
		return data_type+" "+name+" = "+initial_value+";";
	}else{			
	    if(initial_value.equals("")) // there is no specified value
		return scope+" "+data_type+" "+name+";";
	    else
		return scope+" "+data_type+" "+name+" = "+initial_value+";";
 	}
    }
}
