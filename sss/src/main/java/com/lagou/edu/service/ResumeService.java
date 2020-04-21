package com.lagou.edu.service;

import com.lagou.edu.pojo.Resume;

import java.util.List;

public interface ResumeService {
    List<Resume> queryAll() throws Exception;
    void add (Resume resume);
    void edit (Resume resume);
    void deleteById(Long id);
}
