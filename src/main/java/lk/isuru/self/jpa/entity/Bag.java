package lk.isuru.self.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "bag")
public class Bag {
    @Id
    private int id;
    @Column(nullable = false)
    private String brand;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(nullable = false, name = "student_id", referencedColumnName = "id",unique = true)
    private Student student;


}
