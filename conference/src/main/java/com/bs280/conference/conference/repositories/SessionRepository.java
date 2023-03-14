package com.bs280.conference.conference.repositories;

import com.bs280.conference.conference.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
