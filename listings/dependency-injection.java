@Service
public class ProduktService{
  private final ProduktRepository produktRepository;

  public ProduktService(ProduktRepository 
  produktRepository){
    this.produktRepository = produktRepository;
  }
}