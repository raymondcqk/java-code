package test11;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final String GPRMC = "GPRMC";
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String data = in.nextLine();
		ArrayList<String> list = new ArrayList<>();
		while (!data.equals("END")) {
			list.add(data);
			data = in.nextLine();
		}
		for (String s : list) {
			String protocol = s.substring(1, s.indexOf(","));
			if (protocol.equals(GPRMC)) {
				// checksum
				char[] contents = s.substring(1, s.indexOf("*")).toCharArray();
				int checksum = contents[0];
				for (int i = 1; i < contents.length; i++) {
					checksum ^= contents[i];
				}
				if (checksum == Integer.parseInt(s.substring(s.indexOf("*") + 1, s.length()), 16)) {
					String[] arr = s.split(",");
					if(arr[2].equals("A")){
						String hh = arr[1].substring(0, 2);
						String mm = arr[1].substring(2, 4);
						String ss = arr[1].substring(4, 6);
						int h = Integer.parseInt(hh)+8;
						if(h<10){
							hh = "0"+h;
						}else{
							hh = h+"";
						}
						System.out.println(hh+":"+mm+":"+ss);
					}
				}
			}
		}
	}

}
