package org.mysql2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ProverbService {

    @Autowired
    private ProverbRepository proverbRepository;

    private final Random random = new Random();

    public Proverb getRandomProverb() {
        if (proverbRepository.count() == 0) {
            throw new IllegalStateException("No proverbs found in the database.");
        }
        long count = proverbRepository.count();
        int index = random.nextInt((int) count);
        return proverbRepository.findAll().get(index);
    }
}



