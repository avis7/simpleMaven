package com.bionic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "simpleBean")
@SessionScoped
public class SimpleBean {
	private String helloString;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHelloString() {
		return helloString;
	}

	public void setHelloString(String helloString) {
		this.helloString = helloString;
	}
	public String redirectOnNew(){
		return "new.xhtml?faces-redirect=true";
	}
}
