package com.techtrilha.quintoendpoint.control;

import com.techtrilha.quintoendpoint.model.Remedy;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemedyController {

  @PatchMapping("/remedies/{id}")
  public Remedy updateRemedy(@PathVariable("id") Long id, @RequestBody Remedy updatedRemedy) {
    if (id == 1) {
      final var remedy = new Remedy();
      remedy.setId(1L);
      remedy.setName(updatedRemedy.getName());
      remedy.setDescription(updatedRemedy.getDescription());
      return remedy;
    }
    return null;
  }

}
