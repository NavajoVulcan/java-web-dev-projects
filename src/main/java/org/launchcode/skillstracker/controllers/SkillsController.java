package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

@GetMapping
@ResponseBody
public String createHomepage() {
    return "<html><body>" +
            "<h1>Skills Tracker</h1>" +
            "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>Javascript</li>" +
            "<li>Python</li>" +
            "<ol>" +
            "</body></html/>";
}

@GetMapping("/form")
@ResponseBody
public String createForm() {
    return "<html><body>" +
            "<form>" +
            "<label>Name<br /><input type='text' name='name'/></label><br />" +
            "<label>My first language of choice<br />" +
            "<select name=\"firstlang\" id=\"firstlang\">" +
            "<option value=\"java\">Java</option>" +
            "<option value=\"javascript\">Javascript</option>" +
            "<option value=\"python\">Python</option>" +
            "</select></label><br />" +
            "<label>My second language of choice<br />" +
            "<select name=\"secondlang\" id=\"secondlang\">" +
            "<option value=\"java\">Java</option>" +
            "<option value=\"javascript\">Javascript</option>" +
            "<option value=\"python\">Python</option>" +
            "</select></label><br />" +
            "<label>My third language of choice<br />" +
            "<select name=\"thirdlang\" id=\"thirdlang\">" +
            "<option value=\"java\">Java</option>" +
            "<option value=\"javascript\">Javascript</option>" +
            "<option value=\"python\">Python</option>" +
            "</select></label><br />" +
             "<input type=\"submit\" value=\"Submit\" />" +
             "</body></html>";
}

}
//test commits