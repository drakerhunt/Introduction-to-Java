import java.io.*;

class Exercise17_3 {
	public static void main(String[] args) throws IOException {
		
		//Create Variables
		int temp = 0;
		int i = (int)(Math.random() * 100);
		
		//Create output stream
		DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
		
		//Output random numbers a random number of times
		for (int s = 0; s < i; s++) {
			int i2 = (int)(Math.random() * 9);
			output.writeInt(i2);
		}
		
		//Input and add
		try {
			DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"));
			while (true) {
				temp += input.readInt();
			}
		}
		catch (EOFException ex) {
		}
		
		//Dispaly Number
		System.out.println(temp);
	}
}