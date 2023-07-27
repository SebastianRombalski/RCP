package com.example.RCP.RepoClass;

import com.example.RCP.ModelClass.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

        @Repository
        public interface UserRepo extends JpaRepository<User,Long> {
        }


