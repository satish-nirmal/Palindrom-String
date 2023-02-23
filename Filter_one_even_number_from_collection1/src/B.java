import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(17);
		List<Integer> NewList = a.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(NewList);

	}
}
