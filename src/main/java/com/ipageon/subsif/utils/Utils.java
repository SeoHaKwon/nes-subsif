package com.ipageon.subsif.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utils {

	private static final String HOST = "http://172.16.76.22:9999";
	private static final String ADD_URI = "/api/v1/subscription/";
	private static String TYPE;
	private static String FC_NAME;
	private static ArrayList<NameValuePair> PARAM;
	
	static Utils instance;
	
	private Utils() {
	}
	
	public static Utils getInstance() {
		if (instance == null) {
			instance = new Utils();
		}
		return instance;
	}
	
	public void setType(String Type) {
		this.TYPE = Type;
	}
	
	public void setFcName(String fcName) {
		this.FC_NAME = fcName;
	}
	
	public void setParam(ArrayList<NameValuePair> param) {
		this.PARAM = param;
	}
	
	public StringBuilder getResult() {
		try {
        	HttpClient httpc = HttpClients.createDefault();
        	String getString = HOST + ADD_URI + this.FC_NAME + "?1=1";
        	if (this.TYPE.equals("GET")) {
	        	for(int i = 0; i < this.PARAM.size(); i++) {
	        		getString += "&" + this.PARAM.get(i).getName() + "=" + this.PARAM.get(i).getValue();
	        	}
        	}
        	HttpGet get = new HttpGet(getString);
        	HttpPost post = new HttpPost(HOST + ADD_URI + this.FC_NAME);
        	List<NameValuePair> params = this.PARAM;
        	post.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        	
        	HttpResponse response = this.TYPE == "POST" ? httpc.execute(post) : httpc.execute(get);
        	HttpEntity entity = response.getEntity();
        	
        	if (response.getStatusLine().getStatusCode() == 200) {
        		InputStream is = entity.getContent();
	        	BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				StringBuilder sb = new StringBuilder();
				String line;
				
				while((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
        		return sb;
        	} else {
        		return null;
        	}
			
		} catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		return null;
	}
	
	public String SetProperties(String sb) throws Exception {
		JSONObject jo = (JSONObject) new JSONParser().parse(sb);
		return "";
	}
}
