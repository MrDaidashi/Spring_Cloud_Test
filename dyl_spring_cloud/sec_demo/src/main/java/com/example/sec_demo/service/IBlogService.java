package com.example.sec_demo.service;

import com.example.sec_demo.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();

    void deleteBlog(long id);
}
