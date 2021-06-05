package pl.pjatk.MovieService.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   private String name;

    @Enumerated(EnumType.STRING)
   private MovieCategory category;


    @Column(nullable = false, columnDefinition = "TINYINT(1)")
   private Boolean isAvailable = false;

    public Movie(){};

    public Movie(Long id, String name, MovieCategory category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Movie(String name, MovieCategory category, Boolean isAvailable) {
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Movie(String name, MovieCategory category) {
        this.name = name;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
