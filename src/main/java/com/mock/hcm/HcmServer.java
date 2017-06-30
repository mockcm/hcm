package com.mock.hcm;

import com.mock.simplemvc.http.ServerConfig;
import com.mock.simplemvc.http.core.HttpServer;

public class HcmServer {
	
	public static void main(String[] args) {
		
		ServerConfig config = new ServerConfig();
		config.host("0.0.0.0").port(9900).scan("com.mock.hcm");
		HttpServer.startup(config);
	}
}
