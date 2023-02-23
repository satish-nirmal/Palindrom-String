import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(12);
		a.add(25);
		a.add(17);
		List<Integer> newList = a.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(newList);
}
}
