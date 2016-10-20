package lab3;

public class Yorkshire extends Dog {
	public Yorkshire(String name) {
		super(name);
		this.name = name;
	}

	// Small bark -- override speak method in Dog
	public String speak() {
		return "woof";
	}

	public int avgBreedWeight() {
		return 20;

	}
}