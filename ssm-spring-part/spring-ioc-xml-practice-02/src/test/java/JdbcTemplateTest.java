import com.atguigu.controller.StudentController;
import com.atguigu.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcTemplateTest {
    @Test
    public void testForIoC(){
        // 1.创建IoC
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        JdbcTemplate bean = classPathXmlApplicationContext.getBean(JdbcTemplate.class);
        String sql = "insert into students (id, name, gender, age, class) values(?,?,?,?,?)";
//        int update = bean.update(sql, 9,"二狗子","男",18,"三年二班");
//        System.out.println("rows = "+update);

        sql = "select * from students where id = ?";
        Student student = bean.queryForObject(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(rs.getString("gender"));
                student.setClasses(rs.getString("class"));

                return student;
            }
        }, 1);
        System.out.println("student1 = "+student);

        sql = "select id, name, gender, age, class as classes from students;";
        List<Student> query = bean.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
        System.out.println("student2 = "+student);
    }

    @Test
    public void testQueryAll(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-02.xml");
        StudentController controller = classPathXmlApplicationContext.getBean(StudentController.class);
        controller.findAll();
        classPathXmlApplicationContext.close();
    }
}
