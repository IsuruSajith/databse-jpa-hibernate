package lk.isuru.self.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "item")
public class Item {
    @Id
    private
    int id;
    @Column(nullable = false)
    private
    int qty;
    @Column(nullable = false)
    private
    String description;
    @Column(nullable = false)
    private
    String brand;
}
