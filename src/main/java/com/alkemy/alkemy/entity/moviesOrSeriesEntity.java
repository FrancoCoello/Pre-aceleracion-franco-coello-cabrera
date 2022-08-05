package com.alkemy.alkemy.entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="movies_or_series")
@Getter
@Setter

public class moviesOrSeriesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String image;

    private String title;

    @DateTimeFormat(pattern = "yyy/MM/dd")
    @Column(name="creation_date")
    private Date creationDate;

    private String rating;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="genre_id", insertable = false, updatable = false)
    private genreEntity genre;

    @Column(name="genre_id")
    private Long genreId;

    @ManyToMany(
            cascade = {
                    CascadeType.MERGE,
                    CascadeType.PERSIST
            })
    @JoinTable(
            name= "",
            joinColumns = @JoinColumn(name=""),
            inverseJoinColumns = @JoinColumn(name=""))
    private Set<characterEntity> characters = new HashSet<>();


}
