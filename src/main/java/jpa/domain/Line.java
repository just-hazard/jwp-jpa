package jpa.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Line extends Base {

    @Column(unique = true)
    private String name;

    private String color;

    @OneToMany(mappedBy = "line", cascade = CascadeType.PERSIST)
    private List<LineStation> lineStations = new ArrayList<>();

    public void addLineStation(LineStation lineStation) {
        lineStations.add(lineStation);
    }

    public Line(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public static Line of(String name, String color) {
        return new Line(name, color);
    }
}
