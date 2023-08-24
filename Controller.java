@RestController
public class Controller
{
    @GetMapping("/path")
    public String hello()
    {
        return "Application deployed successfully to azure";
    }
    
}