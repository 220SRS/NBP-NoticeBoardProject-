package com.toyProject.NBP.postApiController;

import com.toyProject.NBP.postRepository.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;

public class PostController {
    private final PostService postService;
    private final PostRepository postRepository;

    @GetMapping
}
