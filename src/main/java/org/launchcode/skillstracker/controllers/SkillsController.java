package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

  @GetMapping
  @ResponseBody
  public String getHomePage() {
    return "<html>" +
            "<body>" +
              "<h1>Skills Tracker</h1>" +
              "<h2>Here are the skills we'd like to learn:</h2>" +
              "<ol>" +
                "<li>Typescript</li>" +
                "<li>Java</li>" +
                "<li>Bash</li>" +
                "<li>Groovy</li>" +
              "</ol>" +
            "</body>" +
          "</html>";
  }

  @GetMapping("form")
  @ResponseBody
  public String getSkillsForm() {
    return "<html>" +
          "<body>" +
            "<form action='form-complete' method='post'>" +
              "<label for='name'>Name:</label>" +
              "<input type='text' id='name' name='name'><br>" +
              "<label for='first'>My first favorite</label><br>" +
              "<select id='first' name='first'><br>" +
                "<option value='Typescript'>Typescript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Bash'>Bash</option>" +
                "<option value='Groovy'>Groovy</option>" +
              "</select><br>" +
              "<input type='submit' value='Submit Form'>" +
            "</form>" +
          "</body>" +
        "</html>";
  }

  @PostMapping("form-complete")
  @ResponseBody
  public String getCompletedForm() {
    return "Completed Form";
  }
}
