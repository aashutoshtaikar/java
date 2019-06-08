/*
 * A class cannot inherit multiple other classes or abstract classes
 * But, A class can inherit multiple other Interfaces
 * */

package abstractclass.problem;

abstract class Writer{
	public abstract void write();
}

class Pen extends Writer{
	public void write(){
		System.out.println("Pen is writing");
	}
}

class Pencil extends Writer{
	public void write() {
		System.out.println("Pencil is writing");
	}
}

class Kit{
	public void drawLine(Writer w) {
		w.write();
	}
}


public class AbstractProblem {

	public static void main(String[] args) {
		Writer pn = new Pen();
		Writer pc = new Pencil();
		
		Kit k = new Kit();
		k.drawLine(pn);
		k.drawLine(pc);
	}

}
