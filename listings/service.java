public List<Produkt> findAll(){
  return produktRepository.findAll();
}

public Produkt findById(String produktId){
  return produktRepository.findById(produktId);
}

public Produkt createProdukt(Produkt produkt){
  return produktRepository.save(produkt);
}

public void deleteProdukt(String produktId){
  produktRepository.deleteById(produktId);
}
