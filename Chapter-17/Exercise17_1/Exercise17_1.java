import java.io.*;
import java.io.DataOutput;
import java.io.DataInput;
import java.util.Scanner;
import java.util.List;

class Exercise17_1 {
	public static void main(String[] args) throws IOException {
		
		//Create file
		File file = new File("Exercise17_01.txt");
		
		//Output Stream
		if (file.exists() == false) {
			try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
			) {
				for (int i = 0; i < 100; i++) {
					output.writeUTF((int)(Math.random() * 9) + "");
					output.writeChar(' ');
				}
			}
		}
		else {
			try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream(file, true));
			) {
				output.writeUTF(187 + "");
				output.writeChar('H');
			}
		}
		
		//Input stream
		try (
			DataInputStream input = new DataInputStream(new FileInputStream(file));
		) {
			try {
				while (true) {
					String i = input.readUTF();
					char c = input.readChar();
					System.out.print(i);
					System.out.print(c);
				}
			}
			catch (EOFException ex) {
			}
		}
	}
}
	