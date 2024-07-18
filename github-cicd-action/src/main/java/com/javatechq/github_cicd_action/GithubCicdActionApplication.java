package com.javatechq.github_cicd_action;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to GitHub Cicd-Actions";
	}
//	echo "# github-repo" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/suniljsk/github-repo.git
//	git push -u origin main

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionApplication.class, args);
	}

}
