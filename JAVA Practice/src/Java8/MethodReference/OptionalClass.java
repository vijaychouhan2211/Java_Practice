package Java8.MethodReference;

import java.util.Optional;

public class OptionalClass {

    public static Optional<String> getName(){
        String name = "David";
        return Optional.ofNullable(name);
    }

    public static void main(String[] args) {

//        String str = "hello";
        String str = null;

        Optional<String> optional = Optional.ofNullable(str);
        System.out.println(optional.isPresent());
//        System.out.println(optional.get());

        System.out.println(optional.orElse("No value in this object"));

        Optional<String> nameOptional = getName();
        System.out.println(nameOptional.orElse("null return "));
    }
}
