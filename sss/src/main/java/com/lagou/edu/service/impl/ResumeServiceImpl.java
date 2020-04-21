package com.lagou.edu.service.impl;

import com.lagou.edu.dao.ResumeDao;
import com.lagou.edu.pojo.Resume;
import com.lagou.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeDao resumeDao;



    @Override
    public List<Resume> queryAll() throws Exception {
        return resumeDao.findAll();
    }

    @Override
    public void add(Resume resume) {
        System.out.println("save====="+resume.toString());
        resumeDao.save(resume);
    }

    @Override
    public void edit(Resume resume) {
        resumeDao.save(resume);
    }

    @Override
    public void deleteById(Long id) {
        resumeDao.deleteById(id);
    }
}
