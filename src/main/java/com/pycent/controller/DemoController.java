package com.pycent.controller;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * @author wxd
 *
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
	
  @RequestMapping("/{id}")
  @ResponseBody
  public Object view(@PathVariable("id") String id, HttpServletRequest req) {
	  DemoBean d = new DemoBean();
	  d.setContext("input txt -> "+id);
      return d;
  }
  
  
  public class DemoBean implements Serializable {
		private static final long serialVersionUID = 1413338512701758864L;
	    private String context;
		public String getContext() {
			return context;
		}
		public void setContext(String context) {
			this.context = context;
		}

	}
}