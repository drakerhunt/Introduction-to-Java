import java.util.*;
import java.io.*;

class Exercise17_15 {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter file name for decrypted file: ");
		File outputS = new File(input.nextLine() + ".txt");
		System.out.println("Enter file name for file to dycrypt: ");
		File inputS = new File(input.nextLine() + ".txt");
		
		RandomAccessFile raf = new RandomAccessFile(inputS, "r");
		RandomAccessFile wRaf = new RandomAccessFile(outputS, "rw");
		
		
		for (int i = 0; i < (int)raf.length(); i++) {
			
			int temp = raf.readByte() - 5;
			wRaf.write((byte)temp);
			
		}
	}
}