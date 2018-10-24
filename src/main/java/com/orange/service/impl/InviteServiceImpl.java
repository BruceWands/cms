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
    public List<Invite> getInviteByUserId(Integer user_id) {
        if(user_id==null){
            return null;
        }
        return inviteDao.getInviteByUserId(user_id);
    }
}
