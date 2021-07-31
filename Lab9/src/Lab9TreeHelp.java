import java.util.Stack;

public class Lab9TreeHelp {



	public static void print(Lab9Tree a) {

		Stack<Datum> stack = new Stack<Datum>();

		stack.push(new Datum(a,"",false));

		while (!stack.empty()) {
			Datum top = stack.pop();
			if (top.getPrint())
				System.out.println(top);
			else {
				if (top.getTree().getMother()!=null) {
					stack.push(new Datum(top.getTree().getMother(),top.getLabel()+"-M-",false));
				}
				
				top.setPrint(true);
				stack.push(top);
				if (top.getTree().getFather()!=null) {
					stack.push(new Datum(top.getTree().getFather(),top.getLabel()+"-F-",false));
				}

			}
		}




	}

	
	
}

class Datum {

	private Lab9Tree tree;
	private String label;
	private boolean print;

	Datum(Lab9Tree where, String l, boolean p) {
		tree = where;
		label = l;
		print = p;

	}

	public void setPrint(boolean b) {
		print = b;

	}

	public Lab9Tree getTree() {
		return tree;
	}

	public String getLabel() {
		return label;
	}

	public boolean getPrint() {
		return print;
	}

	@Override
	public String toString() {
		return label + tree.getName();
	}

}


