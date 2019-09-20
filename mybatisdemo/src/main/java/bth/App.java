package bth;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SqlSession sqlSession = SqlSessionManager.getSqlSession();
      // sqlSession.insert("addOne",new Student("sun",3));
      // sqlSession.commit();

        //Student stu = sqlSession.selectOne("selectOne",1);
        //System.out.println(stu);

        //Student stu = sqlSession.selectOne("selectOne_",1);
        //System.out.println(stu);

        //sqlSession.delete("deleteOne",5);
        //sqlSession.commit();

        //sqlSession.update("updateOne",new Student(4,"li",20));
        //sqlSession.commit();

        //Map<String, Integer> paraMap = new HashMap<>();
        //paraMap.put("start",1);
        //paraMap.put("end",2);
        //List<Student> stuList = sqlSession.selectList("selectBatch",paraMap);
        //System.out.println(stuList);

       //List<Student> stuList =  sqlSession.selectList("getAllStudent");
       //System.out.println(stuList);

        //Map<String,Object> paraMap = new HashMap<>();
        //paraMap.put("name","zhao");
        //List<Student> stuList = sqlSession.selectList("findByCondition",paraMap);
        //System.out.println(stuList);

        //Map<String,Object> paraMap = new HashMap<>();
        //paraMap.put("age",1);
        //paraMap.put("id",4);
        //sqlSession.update("updateByCondition",paraMap);
        //sqlSession.commit();

        //int[] paraArr = {1,2,4};
        //List<Student> stuList = sqlSession.selectList("selectSome",paraArr);
        //System.out.println(stuList);

        //Map<String,Object> paraMap = new HashMap<>();
        //paraMap.put("id",5);
       // paraMap.put("name","wang");
       // paraMap.put("age",50);
       // sqlSession.insert("insertOne_",paraMap);
       // sqlSession.commit();

        //List<Student> stuList = sqlSession.selectList("selectStudents",1);
        //System.out.println(stuList);

        Group group = sqlSession.selectOne("selectStudentsByGroup",1);
        group.printGroup();

    }
}
