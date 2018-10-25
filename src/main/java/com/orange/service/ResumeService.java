package com.orange.service;

import com.orange.model.Resume;

import java.util.List;

/**
 * Created by 14037 on 2018/10/22.
 */
public interface ResumeService {
    boolean addResume(Resume resume);
    boolean deleteResume(Resume resume);
    boolean updateResume(Resume resume);
    Resume getResumeById(Integer id);
    List<Resume> getResumeByUserId(Integer uid);
    List<Resume> getAllResume();
}
