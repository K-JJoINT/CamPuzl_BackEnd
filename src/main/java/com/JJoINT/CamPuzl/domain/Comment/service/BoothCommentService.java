package com.JJoINT.CamPuzl.domain.Comment.service;

import com.JJoINT.CamPuzl.domain.Comment.domain.BoothComment;
import com.JJoINT.CamPuzl.domain.Comment.dto.BoothCommentDTO;

import java.util.ArrayList;

public interface BoothCommentService {
    //커밋용 주석

    BoothComment save(BoothCommentDTO boothComment);

    ArrayList<BoothCommentDTO> findByIdAll(Long id);

    void deleteById(Long id);

    BoothComment update(BoothCommentDTO boothCommentDTO);
}