package com.Javaguide.springbootrestapi.controller;

import com.Javaguide.springbootrestapi.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class StudentController {
    @GetMapping("/student")
    public Student getStudents()
    {
        return new Student(12,"Syed", "Mobrur");
    }

    //http://localhost:8080/getAll
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudents()
    {
        List<Student> studentsList= new ArrayList<>();
        studentsList.add(new Student(1,"Syed", "Mobrur"));
        studentsList.add(new Student(2,"Syed", "Ahmed"));
        studentsList.add(new Student(3,"Syed", "Mamon"));
        //return new ResponseEntity<>(studentsList , HttpStatus.OK);
        return ResponseEntity.ok(studentsList);
    }

    //http://localhost:8080/student/1/Syed/Ahmed
    @GetMapping("/student/{id}/{firstName}/{lastName}")
    public Student getStudentById
            (
            @PathVariable("id") int studentId,
            @PathVariable("firstName") String first_Name,
            @PathVariable("lastName") String last_Name
            )
    {
        return new Student(studentId, first_Name,last_Name);
    }
    //http://localhost:8080/student/1
    @GetMapping("/student/{id}")
    public Student getStudentById
            (
                    @PathVariable("id") int studentId

            )
    {
        return new Student(studentId, "first_Name","last_Name");
    }
  //http://localhost:8080/studentQue?id=1

    @GetMapping("/studentQue")
    public Student studentReqVar(@RequestParam int id)
    {
        return new Student(id, "Mahesh", "Dalle");
    }

//http://localhost:8080/students/query?id=100&firstName=Mrur&lastName=Ahmed
    @GetMapping("/students/query")
    public Student studentReqVariables(@RequestParam("id") int id,
                                 @RequestParam("firstName") String first_Name,
                                 @RequestParam("lastName") String last_Name)
    {
        return new Student(id, first_Name, last_Name);
    }


    //Spring Bott REST API that handles HTTP POST request.
    //http://localhost:8080/students/create  , input in POST MAN
//    {
//        "id":12,
//            "firstName":"Syed",
//            "lastName":"Ahmed"
//    }
    @PostMapping("students/create")

    public Student createStudent(@RequestBody Student student)
    {
         return student;
    }

    //HTTP PUT request for updating the resurce details
    @PutMapping("students/{id}/update")
    public Student studentUpdate(@RequestBody Student student, @PathVariable("id") int StudentId)
    {
        return student;
    }

}
