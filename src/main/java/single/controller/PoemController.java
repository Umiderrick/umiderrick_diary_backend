/**
 * 
 */
package single.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import single.entity.Poem;

/**
 * @author pengbo
 *
 */
@RequestMapping("/poem")
@Controller
public class PoemController {

	
	@RequestMapping("/daily")
	@ResponseBody
	public Poem daily(){
		return new Poem();
	}
}
