package ie.atu.week2;

import org.springframework.web.bind.annotation.*;

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

    //Using a new method to create an end point to display the users name and age
    @GetMapping("/details/James/20")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return "Name: " + name + ", Age: " + age;
    }
}
