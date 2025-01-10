@Query("SELECT t FROM Tafelsystem t WHERE 
t.tarifbausteine IS EMPTY")
List<Tafelsystem> findEmptyTafelsysteme();