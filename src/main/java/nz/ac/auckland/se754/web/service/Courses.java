package nz.ac.auckland.se754.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nz.ac.auckland.se754.web.model.Course;
import org.springframework.stereotype.Service;

@Service
public class Courses {
    private static List<Course> courses = new ArrayList<Course>();
    private static Map<Course,List<String>> course2students;
    static {
        courses = new ArrayList<Course>();
        course2students = new HashMap<>();
        courses.add(new Course(1, "se754"));
        courses.add(new Course(2, "se100"));
        courses.add(new Course(3, "se101"));
        course2students.put(courses.get(0), Arrays.asList("test"));
    }

    public List<Course> retrieveCourses(String user) {
        List<Course> filteredCourses= new ArrayList<Course>();
        for (Course c : courses) {
            if (course2students.containsKey(c)) {
                if(course2students.get(c).contains(user))
                filteredCourses.add(c);
            }
        }
        return filteredCourses;
    }



}