package CSCI2010;

public class City implements Comparable<City> {
	private static String[] PROVINCE_CODE = { "BC", "AB", "SK", "MB", "ON",
			"QC", "NB", "NS", "PE", "NL", "YT", "NT", "NU" };
	private String name;
	private int population;
	private String province;

	public City(String name, String province, int population) {
		setName(name);
		setProvince(province);
		setPopulation(population);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		if (population < 0) {
			this.population = 0;
		} else {
			this.population = population;
		}
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String toString() {
		return (this.population + ", " + this.name + ", " + this.province);
	}

	@Override
	public int compareTo(City otherCity) {		
		String pop1 = this.toString().split(",")[0];
		String pop2 = otherCity.toString().split(",")[0];
		
		int ipop1 = Integer.parseInt(pop1);
		int ipop2 = Integer.parseInt(pop2);
		
		int comp = Integer.compare(ipop1, ipop2);
		
		return comp;	
	}

}