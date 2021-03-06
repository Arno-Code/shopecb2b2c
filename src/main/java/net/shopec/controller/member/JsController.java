package net.shopec.controller.member;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller - Js
 * 
 */
@Controller("memberJsController")
@RequestMapping({ "/resources/member/js", "/resources/mobile/member/js" })
public class JsController {

	@Value("${javascript_content_type}")
	private String javascriptContentType;

	/**
	 * 共用
	 */
	@GetMapping("/common.js")
	public String common(HttpServletResponse response) {
		response.setContentType(javascriptContentType);
		return "member/js/common";
	}

}