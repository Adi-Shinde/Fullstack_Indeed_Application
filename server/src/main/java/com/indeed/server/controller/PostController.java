package com.indeed.server.controller;

import com.indeed.server.constants.APIConstants;
import com.indeed.server.dto.PostDTO;
import com.indeed.server.model.PostModel;
import com.indeed.server.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {

    final PostService postService;
    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest){
        log.info("Saving Post ######");

        return this.postService.savePost(postDTORequest);
    }
    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts(){
        log.info("Getting all posts ########");
        return this.postService.getAllPosts();
    }
}
