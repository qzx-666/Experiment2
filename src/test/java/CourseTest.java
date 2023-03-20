import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Course;
import org.example.utils.MybatisUtils;

import java.util.List;

public class CourseTest {

    public  void findByIdTest(int id){
        SqlSession sqlSession= MybatisUtils.getSession();

        Course course=sqlSession.selectOne("org.example.pojo.Course.findById",id);
        System.out.println(course);

        sqlSession.commit();
        sqlSession.close();
    }

    public void findBySchoolsTest(int schools){
        SqlSession sqlSession= MybatisUtils.getSession();

        List<Course> courseList=sqlSession.selectList("org.example.pojo.Course.findBySchools",schools);
        for (int i=0;i<courseList.size();i++){
            System.out.println(courseList.get(i));
        }

        sqlSession.commit();
        sqlSession.close();
    }

    public void save(String names,int hours,int schools){
        Course course=new Course();
        course.setName(names);
        course.setHours(hours);
        course.setSchools(schools);

        SqlSession sqlSession= MybatisUtils.getSession();

        sqlSession.selectOne("org.example.pojo.Course.save",course);

        sqlSession.commit();
        sqlSession.close();
    }

    public void updateByIdTest(int id,int hours){
        Course course=new Course();
        course.setId(id);
        course.setName("⾼级 Web 技术");
        course.setHours(hours);
        course.setSchools(1);

        SqlSession sqlSession= MybatisUtils.getSession();

        sqlSession.selectOne("org.example.pojo.Course.updateById",course);

        sqlSession.commit();
        sqlSession.close();
    }

    public void deleteById(){
        SqlSession sqlSession= MybatisUtils.getSession();

        Course course=sqlSession.selectOne("org.example.pojo.Course.deleteById",1);

        sqlSession.commit();
        sqlSession.close();
    }
}
