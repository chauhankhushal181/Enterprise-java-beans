public class Demo {
    public static void main(String[] args) {
      Human obj = new Human();
      obj.setAge(22);
      obj.setName("khushal");
      System.out.print(obj.getName() + " is " + obj.getAge() + " years old" );

      Person obj1 = new Person();
      obj1.setFirstName(" and his friend name is ");
      obj1.setLastName("Anuradha ");
      System.out.print(obj1.getFirstName() + obj1.getLastName());
    }
}