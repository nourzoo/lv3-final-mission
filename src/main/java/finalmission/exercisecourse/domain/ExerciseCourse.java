package finalmission.exercisecourse.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ExerciseCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    public ExerciseCourse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ExerciseCourse() {
    }

    public static ExerciseCourse createWithoutId(String name, String description) {
        return new ExerciseCourse(null, name, description);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
