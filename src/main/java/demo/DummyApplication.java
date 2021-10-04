package demo;

//We don't have another application, so just pretend here.
public class DummyApplication {


    public static void main(String[] args) {
        System.out.println("Third party app started.");
        String result = new ApiClient().apiInterface("This is an API call from a 3rd party.");
        System.out.println("returned:"+result);
    }
}