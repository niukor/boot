import com.cn.boot.BootApp;
import com.cn.boot.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = BootApp.class)
class BootBuildTest {

    @Autowired
    private Person person;

    @Test
    void contextLoad(){
        System.out.println("Hello Test");
        System.out.println(person);

    }
}
