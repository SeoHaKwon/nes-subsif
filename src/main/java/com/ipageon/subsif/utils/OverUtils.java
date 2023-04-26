package com.ipageon.subsif.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipageon.subsif.rest.vo.RequestVO;

import lombok.Data;

@Data
@Repository
public class OverUtils {

	@Value("${oam.host}")
	private String HOST;
	@Value("${oam.mainPath}")
	private String ADD_URI;
	
//	private String HOST;
//	private String ADD_URI;
	private String Type;
	private String FcName;
	private String POST_PARAM;
	private String VONAME;
	private RequestVO vo;
	
	@Autowired
	ObjectMapper mapper;
	
	public StringBuilder getResult() {
		try {
			System.out.println(HOST);
        	HttpClient httpc = HttpClients.createDefault();
        	String getString = HOST + ADD_URI + this.getFcName();
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
        	HttpPost post = new HttpPost(HOST + ADD_URI + this.getFcName());
        	HttpPut put = new HttpPut(HOST + ADD_URI + this.getFcName());
        	HttpDelete del = new HttpDelete(HOST + ADD_URI + this.getFcName());
        	post.setEntity(new StringEntity(this.getPOST_PARAM(), ContentType.APPLICATION_JSON));
        	HttpResponse response = this.getType() == "POST" ? httpc.execute(post) : (this.getType() == "PUT") ? httpc.execute(put) : httpc.execute(del);
        	HttpEntity entity = response.getEntity();
        	
        	if (response.getStatusLine().getStatusCode() == 200) {
        		System.out.println("Success");
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
	
}
