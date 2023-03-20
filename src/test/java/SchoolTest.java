import org.apache.ibatis.session.SqlSession;
import org.example.pojo.Course;
import org.example.pojo.School;
import org.example.utils.MybatisUtils;
import org.junit.Test;

public class SchoolTest {

    public void findByIdTest(){
        SqlSession sqlSession= MybatisUtils.getSession();

        //查询id=2的课程信息
        School school =sqlSession.selectOne("org.example.pojo.School.findById",2);
        System.out.println(school);

        sqlSession.commit();
        sqlSession.close();
    }


    public void save(){
        School school=new School();
        school.setId(3);
        school.setSchool_name("湖南科技大学");


        SqlSession sqlSession= MybatisUtils.getSession();

        sqlSession.selectOne("org.example.pojo.School.save",school);

        sqlSession.commit();
        sqlSession.close();
    }


    public void updateByIdTest(){
        School school=new School();
        school.setId(3);
        school.setSchool_name("湖南科技大学2");


        SqlSession sqlSession= MybatisUtils.getSession();

        sqlSession.selectOne("org.example.pojo.School.updateById",school);

        sqlSession.commit();
        sqlSession.close();
    }


    public void deleteByIdTest(){
        SqlSession sqlSession= MybatisUtils.getSession();

        School school =sqlSession.selectOne("org.example.pojo.School.deleteById",3);

        sqlSession.commit();
        sqlSession.close();
    }

}
