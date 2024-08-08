package org.itstep.many_to_many_uni;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends JpaRepository<Book, Long> {
}
