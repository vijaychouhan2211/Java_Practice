package Oops.Encapsulation;

public class Encapsulation {
     static class  Human{
        private String name = "vijay";
        private int age = 19;
        public String getName() {
            return name;
        }
         public void setName(String name) {
             this.name = name;
         }
         public int getAge() {
            return age;
        }
         public void setAge(int age) {
             this.age = age;
         }
     }

    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}