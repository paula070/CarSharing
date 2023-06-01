package pl.sda.orange.java2.carsharing.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RentalRepository extends JpaRepository <Rental, Integer> {
    @Query ("select sum(cost) from Rental")
    Double calculateTotalRevenue ();

}
