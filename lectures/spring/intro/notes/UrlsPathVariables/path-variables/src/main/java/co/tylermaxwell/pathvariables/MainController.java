package co.tylermaxwell.pathvariables;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class MainController {
    
    @GetMapping("/m/{courseId}/{moduleId}")
    public String showLesson(@PathVariable("courseId") String courseId, @PathVariable("moduleId") String moduleId) {

        return "Course: " + courseId + ", Module: " + moduleId;
    }
    
}
