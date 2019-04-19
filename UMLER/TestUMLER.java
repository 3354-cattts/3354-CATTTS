package UMLER;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUMLER{
    
    @Test
    public void testVar(){
	Variable var1 = new Variable("double", "num");
	Variable var2 = new Variable("public","Integer","time");
	Variable var3 = new Variable("public static final", "double", "PI","3.1495");
	assertEquals(var1.java(),"double num;");
	assertEquals(var2.java(),"public Integer time;");
	assertEquals(var3.java(),"public static final double PI = 3.1495;");	    
    }
    @Test
    public void testMeth(){
	Method meth1 = new Method("int[]", "sort", new Variable[]{new Variable("int[]","array"),
								  new Variable("int", "length")});
	Method meth2 = new Method("private", "String", "toString", new Variable[]{});
	Method meth3 = new Method("public", "", "Constructor", new Variable[]{new Variable("Object","clone")});
	assertEquals(meth1.java(), "int[] sort(int[] array, int length)");
	assertEquals(meth2.java(), "private String toString()");
	assertEquals(meth3.java(), "public Constructor(Object clone)");
    }
    @Test
    public void testClass(){
	Class muffin = new Class("public",
				 false,
				 "Muffin",
				 new String[]{"Pastry"},
				 new String[]{"Edible","Bakeable"},
				 new Variable[]{new Variable("private", "double", "flour"),
						new Variable("private", "double", "sugar"),
						new Variable("double", "water")},
				 new Method[]{new Method("public","","Muffin", new Variable[]{new Variable("double", "flr"),
											      new Variable("double", "sgr"),
											      new Variable("double", "wtr")}),
					      new Method("public", "Pastery", "bake", new Variable[]{}),
					      new Method("public", "void", "multiply",new Variable[]{new Variable("double", "multiplier")})});
    
    assertEquals(muffin.java(),"public class Muffin extends Pastry implements Edible, Bakeable{\n\tprivate double flour;\n\tprivate double sugar;\n\tdouble water;\n\n\tpublic Muffin(double flr, double sgr, double wtr){\n\t\n\t}\n\n\tpublic Pastery bake(){\n\t\n\t}\n\n\tpublic void multiply(double multiplier){\n\t\n\t}\n\n}");
    }
}
    
