package cn.wolfcode.ssm.mapper;

import cn.wolfcode.ssm.domain.Facebook;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FacebookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Facebook record);

    Facebook selectByPrimaryKey(Long id);

    List<Facebook> selectAll();

    int updateByPrimaryKey(Facebook record);
}