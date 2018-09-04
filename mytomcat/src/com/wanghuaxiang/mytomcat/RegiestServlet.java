package com.wanghuaxiang.mytomcat;

import java.io.IOException;

/**
 * RegiestServlet:注册处理类
 * 
 * @author wanghauxiang
 *
 */
public class RegiestServlet implements HttpServlet {

	@Override
	public void server(HttpRequest request, HttpResponse response) throws IOException {
		response.writerFile("htmlfile/registerSuccess.html");

	}

}
