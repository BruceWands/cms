package com.orange.dao;

import com.orange.model.Invite;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface InviteDao {
    void addInvite(Invite invite);
    void deleteInvite(Invite invite);
    void updateInvite(Invite invite);
    Invite getInviteById(Invite invite);
    Invite getInviteByResumeId(Integer resume_id);
    List<Invite> getInviteOnlyAccept();
    List<Invite> getAllInvite();
}
