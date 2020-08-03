public class hello_world {

    public String sayHi() {
        return "Hello World";
    }

    public String sayHi(String name) {
        return "Hello " + name.substring(0,1).toUpperCase()+ name.substring(1, name.length());
    }

}
