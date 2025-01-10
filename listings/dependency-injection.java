@RestController
@RequestMapping("/api/ueberschuesse")
public class UeberschussController{
    private final UeberschussService ueberschussService;

    public UeberschussController(UeberschussService 
    ueberschussService) {
        this.ueberschussService = ueberschussService;
    }
}