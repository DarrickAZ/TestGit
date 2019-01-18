package cn.collabtech.ssm.mapper;

import cn.collabtech.ssm.bean.Student;
import cn.collabtech.ssm.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: Darrick
 * @Date: 2018/10/9 16:43
 * @Description:
 */
@Mapper
@Repository
public interface TeacherMapper {
    public List<Teacher> findAll();
}
