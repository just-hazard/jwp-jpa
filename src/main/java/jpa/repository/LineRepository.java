package jpa.repository;

import jpa.domain.Line;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineRepository extends JpaRepository<Line, Long> {

    void deleteAllByColor(String color);
}
