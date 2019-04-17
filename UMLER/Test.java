package UMLER;

public class Test{
    public static void main(String[] args){
	Class muffin = new Class("public",
				 false,
				 "Muffin",
				 new String[]{"Pastery"},
				 new String[]{"Edible","Bakeable"},
				 new Variable[]{new Variable("private", "double", "flour"),
						new Variable("private", "double", "sugar"),
						new Variable("double", "water")},
				 new Method[]{new Method("public","","Muffin", new Variable[]{new Variable("double", "flr"),
											    new Variable("double", "sgr"),
											    new Variable("double", "wtr")}),
					      new Method("public", "Pastery", "bake", new Variable[]{}),
					      new Method("public", "void", "multiply",new Variable[]{new Variable("double", "multiplier")})});
	System.out.println(muffin.java());
    }
}
