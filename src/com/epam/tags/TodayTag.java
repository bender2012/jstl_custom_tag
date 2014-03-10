package com.epam.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TodayTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private String format;

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		Date today = new Date();
		SimpleDateFormat dateFormater = new SimpleDateFormat(getFormat());
		try {
			out.print(dateFormater.format(today));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
