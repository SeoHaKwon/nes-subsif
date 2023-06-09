package com.ipageon.subsif.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.*;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipageon.subsif.rest.vo.RequestVO;

import java.util.Properties;

public class Utils {
	private static String HOST;
	private static String ADD_URI;
	private static String TYPE;
	private static String FC_NAME;
	private static String POST_PARAM;
	
	static Utils instance;
	ObjectMapper mapper = new ObjectMapper();
	
	public Utils() {
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
	
	public static String getPOST_PARAM() {
		return POST_PARAM;
	}

	public static void setPOST_PARAM(String pOST_PARAM) {
		POST_PARAM = pOST_PARAM;
	}

	public void setProperties() throws Exception {
		if (this.HOST == null || this.ADD_URI == null) {
			InputStream iss = this.getClass().getClassLoader().getResourceAsStream("application.properties");
//			File propFile = new File("/etc/nems/conf.d/nes-subif.properties");
//			BufferedInputStream iss = new BufferedInputStream(new FileInputStream(propFile));
	    	Properties env = new Properties();
	    	env.load(iss);
	    	this.HOST = env.getProperty("oam.host");
	    	this.ADD_URI = env.getProperty("oam.mainPath");
		}
	}
	
	public StringBuilder getResult(RequestVO vo, String VONAME) {
		try {
        	HttpClient httpc = HttpClients.createDefault();
        	String getString = HOST + ADD_URI + this.FC_NAME;
        	System.out.println(getString);
    		Object data = new Object();
        	if (VONAME == "SetSlnVO") {
        		data = vo.getSetSlnVO();
        	} else if (VONAME == "DltSlnVO") {
        		data = vo.getDltSlnVO();
        	} else if (VONAME == "CrteSlnVO") {
        		data = vo.getCrteSlnVO();
        	} else if (VONAME == "GetSlnInfoVO") {
        		data = vo.getGetSlnInfoVO();
        	} else if (VONAME == "RegSsvcVO") {
        		data = vo.getRegSsvcVO();
        	} else if (VONAME == "CancSsvcVO") {
        		data = vo.getCancSsvcVO();
        	} else if (VONAME == "ActSsvcVO") {
        		data = vo.getActSsvcVO();
        	} else if (VONAME == "DactSsvcVO") {
        		data = vo.getDactSsvcVO();
        	} else if (VONAME == "RegCdnAnmVO") {
        		data = vo.getRegCdnAnmVO();
        	} else if (VONAME == "GetSsvcInfoVO") {
        		data = vo.getGetSsvcInfoVO();
        	} else if (VONAME == "CrtePbxGrpVO") {
        		data = vo.getCrtePbxGrpVO();
        	} else if (VONAME == "CrtePbxLineVO") {
        		data = vo.getCrtePbxLineVO();
        	} else if (VONAME == "DltPbxGrpVO") {
        		data = vo.getDltPbxGrpVO();
        	} else if (VONAME == "DltPbxLineVO") {
        		data = vo.getDltPbxLineVO();
        	} else if (VONAME == "ChgPbxGrpVO") {
        		data = vo.getChgPbxGrpVO();
        	} else if (VONAME == "GetPbxGrpVO") {
        		data = vo.getGetPbxGrpVO();
        	} else if (VONAME == "CancCdnAnmVO") {
        		data = vo.getCancCdnAnmVO();
        	}
    		String json= mapper.writeValueAsString(data);
    		System.out.println(json);
    		this.setPOST_PARAM(json);
        	HttpPost post = new HttpPost(HOST + ADD_URI + this.FC_NAME);
        	HttpPut put = new HttpPut(HOST + ADD_URI + FC_NAME);
        	HttpDelete del = new HttpDelete(HOST + ADD_URI + FC_NAME);
//        	List<NameValuePair> params = this.PARAM;
        	post.setEntity(new StringEntity(this.getPOST_PARAM(), ContentType.APPLICATION_JSON));
        	// this.getPOST_PARAM 넣어야됨
        	HttpResponse response = TYPE == "POST" ? httpc.execute(post) : (TYPE == "PUT") ? httpc.execute(put) : httpc.execute(del);
//        	System.out.println(response.getParams());
        	HttpEntity entity = response.getEntity();
        	
    		InputStream is = entity.getContent();
        	BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line;
			
			while((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
    		return sb;
			
		} catch (Exception e) {
			System.out.println("ERROR");
			e.printStackTrace();
			return null;
		}
	}
	
	public String SetProperties(String sb) throws Exception {
		JSONObject jo = (JSONObject) new JSONParser().parse(sb);
		return "";
	}
}
