package com.bs280.conference.conference.repositories;

import com.bs280.conference.conference.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}

