package com.matias.msauthservice.model;

import com.matias.msauthservice.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Table("users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
public class User {

    @Id
    private UUID id;

    private String username;
    private String password_hash; // BCrypt hashed

    private Boolean isActive;

    @Email
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;




}
