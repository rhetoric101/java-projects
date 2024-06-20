package org.nrservicetwo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProverbRepository extends JpaRepository<Proverb, Long> {
    // Use the count method to check if the repository is empty
    long count();
}


