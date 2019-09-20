package bth;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionManager {
    private static volatile SqlSessionFactory sqlSessionFactory;
    private SqlSessionManager(){}
    public  static SqlSession getSqlSession(){
        if(sqlSessionFactory == null){
            synchronized (SqlSessionManager.class){
                if(sqlSessionFactory == null){
                    try {
                        sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("Mybatis-config.xml"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return sqlSessionFactory.openSession();
    }



}
