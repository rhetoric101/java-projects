package org.otelservicetwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Random;

@Service
public class ProverbService {

    private JdbcTemplate jdbcTemplate;

    private ProverbRepository proverbRepository;
    private final Random random = new Random();

    // I added this after getting a suggestion from AI, but it didn't make a difference.
    @Autowired
    public ProverbService(ProverbRepository proverbRepository) {
        this.proverbRepository = proverbRepository;
    }

    @Retryable(value = { SQLException.class }, maxAttempts = 10, backoff = @Backoff(delay = 2000))
    public void fetchData() {
        // Your database interaction logic here
    }

    public Proverb getRandomProverb() {
        if (proverbRepository.count() == 0) {
            throw new IllegalStateException("No proverbs found in the database.");
        }
        long count = proverbRepository.count();
        int index = random.nextInt((int) count);
        return proverbRepository.findAll().get(index);
    }
}


