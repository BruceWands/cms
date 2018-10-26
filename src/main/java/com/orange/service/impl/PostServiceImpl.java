package com.orange.service.impl;

import com.orange.dao.PostDao;
import com.orange.model.Post;
import com.orange.service.PostService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/25.
 */
@Service
public class PostServiceImpl implements PostService {
    @Resource
    private PostDao postDao;
    @Override
    public boolean addPost(Post post) {
        if(post==null){
            return false;
        }
        postDao.addPost(post);
        return true;
    }

    @Override
    public boolean deletePost(Post post) {
        if(post==null){
            return false;
        }
        postDao.deletePost(post);
        return true;
    }

    @Override
    public boolean updatePost(Post post) {
        if(post==null){
            return false;
        }
        postDao.updatePost(post);
        return true;
    }

    @Override
    public Post getPostById(Post post) {
        if(post==null){
            return null;
        }
        return postDao.getPostById(post);
    }

    @Override
    public Post getPostByName(Post post) {
        if(post==null){
            return null;
        }
        return postDao.getPostByName(post);
    }

    @Override
    public List<Post> getAllPost() {
        return postDao.getAllPost();
    }
}
