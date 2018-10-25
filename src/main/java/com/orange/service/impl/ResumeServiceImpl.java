package com.orange.service.impl;

import com.orange.dao.ResumeDao;
import com.orange.model.Resume;
import com.orange.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/22.
 */
@Service
public class ResumeServiceImpl implements ResumeService{
    @Resource
    private ResumeDao resumeDao;
    @Override
    public boolean addResume(Resume resume) {
        if(resume==null){
            return false;
        }
        resumeDao.addResume(resume);
        return true;
    }

    @Override
    public boolean deleteResume(Resume resume) {
        if(resume==null){
            return false;
        }
        resumeDao.deleteResume(resume);
        return true;
    }

    @Override
    public boolean updateResume(Resume resume) {
        if(resume==null){
            return false;
        }
        resumeDao.updateResume(resume);
        return true;
    }

    @Override
    public Resume getResumeById(Integer id) {
        if(id==null){
            return null;
        }
        return resumeDao.getResumeById(id);
    }

    @Override
    public List<Resume> getResumeByUserId(Integer uid) {
        if(uid==null){
            return null;
        }
        return resumeDao.getResumeByUserId(uid);
    }

    @Override
    public List<Resume> getAllResume() {
        return resumeDao.getAllResume();
    }
}
