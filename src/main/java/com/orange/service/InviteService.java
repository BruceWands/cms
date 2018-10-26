package com.orange.service;

import com.orange.model.Invite;

import java.util.List;

/**
 * Created by 14037 on 2018/10/24.
 */
public interface InviteService {
    boolean addInvite(Invite invite);
    boolean deleteInvite(Invite invite);
    boolean updateInvite(Invite invite);
    Invite getInviteById(Invite invite);
    Invite getInviteByResumeId(Integer resume_id);
    List<Invite> getInviteOnlyAccept();
    List<Invite> getAllInvite();
}
