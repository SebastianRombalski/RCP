package com.example.RCP.RepoClass;

import com.example.RCP.ModelClass.EventInProgress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventInProgressRepo extends JpaRepository<EventInProgress, Long> {
}
