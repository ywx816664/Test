package org.students.server.impl;

import org.students.server.StudentServer;

import com.alibaba.dubbo.config.annotation.Service;

@Service//����Ͱ��ṩ��@Serviceע��
public class StudentServerImpl  implements StudentServer{

	public String server(String name) {
		return "server:" +name;
	}

}
