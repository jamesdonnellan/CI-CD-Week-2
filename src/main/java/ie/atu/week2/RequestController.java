package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController
{
    @GetMapping("/Hello")
    public String hello()
    {
         return "Hello";
    }

    //Using a new method to create end point to greet user by their name
    @GetMapping("/greet/{name}")
    public String greetbyName(@PathVariable String name)
    {
        return "Hello " + name + "!";
    }
}
