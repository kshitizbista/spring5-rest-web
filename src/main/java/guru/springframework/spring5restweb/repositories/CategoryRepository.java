package guru.springframework.spring5restweb.repositories;

import guru.springframework.spring5restweb.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
