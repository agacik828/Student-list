package agata.twardowska.Student.list.apis;

import agata.twardowska.Student.list.object.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentApi {
    private List<Student> studentList;
    public StudentApi(){
        this.studentList = new ArrayList<>();
    }

    @PostMapping("/addStudent")
    public boolean addStudent(@RequestBody Student student){
        return studentList.add(student);
    }

    @GetMapping("/getList")
    public List<Student> getStudentList(){
        return studentList;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentList.stream().filter(student -> student.getId() == id).findFirst().get();
    }
}
