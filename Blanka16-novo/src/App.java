class Frog {
    private String name;
    private int age;
    private String color; 
    
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public void setColor(String color) {
        this.color = color;
    }
 
    
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    
    public void setInfo(String name, int age, String color) {
        setName(name);
        setAge(age);
        setColor(color);
        
    }
	public void makeSound(){
		System.out.println("Ja sam "+ this.name+". Kre, kre");
	}
}
 
public class App {
 
    public static void main(String[] args) {
     
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
         
        frog1.setName("Zabac A");
        frog1.setAge(1);
        frog1.setColor("zeleni");
        frog1.makeSound();
        
        frog2.setName("Zabac B");
        frog2.setAge(3);
        frog2.setColor("zuti");
        frog2.makeSound();
        
        
        
        System.out.println(frog1.getName() + " " + frog2.getAge() + " " + frog2.getColor());
        System.out.println(frog1.getName() + " " + frog1.getAge() + " " + frog1.getColor());
    }
    
}