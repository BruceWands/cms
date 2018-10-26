package com.orange.service;

import com.orange.model.Post;

import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
public interface PostService {
    boolean addPost(Post post);
    boolean deletePost(Post post);
    boolean updatePost(Post post);
    Post getPostById(Post post);
    Post getPostByName(Post post);
    List<Post> getAllPost();
}
