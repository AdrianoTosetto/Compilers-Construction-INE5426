package erros_semanticos;

import java.util.ArrayList;

public class Testzera {

	public static void main(String[] args) {
		String str = "teste";
		ArrayList<String> array = new ArrayList<>();
		array.add(str);
		array.set(0, "lsks");
		System.out.println(str);
	}

}
