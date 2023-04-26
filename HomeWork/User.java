public class User implements Persisterable{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	@Override
	public void save() {
		System.out.println("Save user: " + name);
	}
	@Override
	public void report(){
		System.out.println("Report for user: " + name);
	}
}