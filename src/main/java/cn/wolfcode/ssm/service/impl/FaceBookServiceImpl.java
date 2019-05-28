package cn.wolfcode.ssm.service.impl;

import cn.wolfcode.ssm.domain.Facebook;
import cn.wolfcode.ssm.mapper.FacebookMapper;
import cn.wolfcode.ssm.service.FaceBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FaceBookServiceImpl implements FaceBookService {
    @Autowired
    private FacebookMapper mapper;

    @Override
    public int delete(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Facebook record) {
        return mapper.insert(record);
    }

    @Override
    public Facebook get(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Facebook> listAll() {
        return mapper.selectAll();
    }

    @Override
    public int update(Facebook record) {
        return mapper.updateByPrimaryKey(record);
    }
}
