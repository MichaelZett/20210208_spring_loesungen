package de.zettsystems;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringInitService implements InitializingBean, DisposableBean {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	// der Hook der InitializingBean
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Message is '" + message + "' afterPropertiesSet.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Going down");
	}

}