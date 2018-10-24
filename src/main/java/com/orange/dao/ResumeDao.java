package com.orange.dao;

import com.orange.model.Resume;

import java.util.List;

/**
 * dao
 * Created by 14037 on 2018/10/22.
 */
public interface ResumeDao {
    void addResume(Resume resume);
    void deleteResume(Resume resume);
    void updateResume(Resume resume);
    Resume getResumeById(Integer id);
    List<Resume> getResumeByUserId(Integer uid);
}
