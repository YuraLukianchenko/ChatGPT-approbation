package orange.book;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;

@Controller
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }

    @Get("hello/{name}")
    public String hello(String name)  {
        return "Hello " + name;
    }
}