import java.io.*;
import java.util.ArrayList;

class Exercise17_7 {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ArrayList<Loan> list = new ArrayList<Loan>();
		
		//Create Loan Objects
		Loan l1 = new Loan(1, 5, 1000);
		Loan l2 = new Loan(1, 1, 1000);
		
		//Create File and ObjectOutputStream
		File file = new File("Loan.dat");
		
		//Output Objects
		if (!file.exists()) {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
			output.writeObject(l1);
			output.writeObject(l2);
			System.out.println("TEST1");
		}
		
		//Create ObjectInputStream
		ObjectInputStream input = new ObjectInputStream(new FileInputStream(file));
		
		try {
			while (true) {
				list.add((Loan)(input.readObject()));
			}
		}
		catch (EOFException ex) {
		}
		
		//Dispaly Input Objects
		//double temp = list.get(0).getTotalPayment();
		System.out.println(list.get(0).getTotalPayment() + "\n" + list.get(1).getTotalPayment());
	}
}