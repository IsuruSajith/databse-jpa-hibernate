package lk.isuru.self.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "order")
@Entity
public class Order {
    @Id
    int id;
    @Column(nullable = false)
    Date orderDate;
    @Column(nullable = false)
    Time time;
}
