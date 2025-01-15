export class ApiService {
  public readonly basePath: string = "http://localhost";
  public productService: ProduktControllerService;
  constructor(private http: HttpClient) {
    const configuration = new Configuration();
    this.productService = new ProduktControllerService(
      this.http, this.basePath, configuration);
  }
}