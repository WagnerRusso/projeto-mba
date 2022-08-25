package br.com.solutionsprint.solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solutionsprint.solution.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
