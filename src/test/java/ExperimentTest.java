import org.junit.Test;

public class ExperimentTest {

    @Test
    public void exam() {
        //1. 查询id=2的课程信息
        CourseTest courseTest=new CourseTest();
        courseTest.findByIdTest(2);
        System.out.println("查询完毕");

        //2. 查询出所有计算机学院开设的课程信息
        courseTest.findBySchoolsTest(1);
        System.out.println("查询完毕");


        //3. 将 id=4 这⻔课程的课时数修改为 32+8=40
        courseTest.updateByIdTest(4,40);
        System.out.println("已经修改");

        //4. 插⼊⼀条新的课程记录： names=”⼤数据存储“，hours=32，schools =1
        courseTest.save("⼤数据存储",32,1);
        System.out.println("已经插入");

        //5. 输出所有的学院开设的课程信息
        courseTest.findBySchoolsTest(1);
        courseTest.findBySchoolsTest(2);
        System.out.println("查询完毕");

        System.out.println("有多个大数据存储信息是因为保留了实验经过");

    }
}
