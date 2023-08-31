package lk.isuru.self.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString(exclude = "bag")
@Table(name = "student")
public class Student {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;
    @OneToOne(mappedBy = "student")
    private Bag bag;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setBag(Bag bag) {
        System.out.println("======================================set bag method in student class is invoked===================================");
        bag.setStudent(this);
        this.bag = bag;
    }
}
