package br.com.plmszo.todolist;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plmszo.todolist.user.UserModel;


public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}