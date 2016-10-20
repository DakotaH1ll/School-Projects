public class GenericStackExample {
	public static <T> void main(String[] args) {
		System.out.println("Generic Stack Example.");

		GStack<T> stackString = new GStack<T>();
		stackString.push((T) "Hello");
		stackString.push((T) "World");
		
		System.out.println(stackString.pop());
		System.out.println(stackString.pop());
	}
}