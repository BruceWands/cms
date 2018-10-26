package com.orange.service.impl;

import com.orange.dao.InviteDao;
import com.orange.model.Invite;
import com.orange.service.InviteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
@Service
public class InviteServiceImpl implements InviteService{
    @Resource
    private InviteDao inviteDao;
    @Override
    public boolean addInvite(Invite invite) {
        if(invite==null){
            return false;
        }
        inviteDao.addInvite(invite);
        return true;
    }

    @Override
    public boolean deleteInvite(Invite invite) {
        if(invite==null){
            return false;
        }
        inviteDao.deleteInvite(invite);
        return true;
    }

    @Override
    public boolean updateInvite(Invite invite) {
        if(invite==null){
            return false;
        }
        inviteDao.updateInvite(invite);
        return true;
    }

    @Override
    public Invite getInviteById(Invite invite) {
        if(invite==null){
            return null;
        }
        return inviteDao.getInviteById(invite);
    }

    @Override
    public Invite getInviteByResumeId(Integer resume_id) {
        if(resume_id==null){
            return null;
        }
        return inviteDao.getInviteByResumeId(resume_id);
    }

    @Override
    public List<Invite> getInviteOnlyAccept() {
        return inviteDao.getInviteOnlyAccept();
    }

    @Override
    public List<Invite> getAllInvite() {
        return inviteDao.getAllInvite();
    }
}
