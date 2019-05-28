package cn.wolfcode.ssm.service;

import cn.wolfcode.ssm.domain.Facebook;

import java.util.List;

public interface FaceBookService {
    int delete(Long id);

    int insert(Facebook record);

    Facebook get(Long id);

    List<Facebook> listAll();

    int update(Facebook record);
}
