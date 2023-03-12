
public class A {
public static void main(String[] args) {
	String str="@#afza*&l";
	String planestr = str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(planestr);
}
}
