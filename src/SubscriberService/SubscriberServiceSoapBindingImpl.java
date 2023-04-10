/**
 * SubscriberServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.samsung.nms.agent.dataType.OneOfSsvcInfo;
import com.samsung.nms.agent.dataType.PbxGrpInfo;
import com.samsung.nms.agent.dataType.PbxGrpInfoList;
import com.samsung.nms.agent.dataType.PbxGrpLineInfo;
import com.samsung.nms.agent.dataType.PbxGrpLineResultList;
import com.samsung.nms.agent.dataType.SlnInfo;
import com.samsung.nms.agent.dataType.SsvcInfo;
import com.samsung.nms.agent.dataType.SsvcInfoList;
import com.samsung.nms.agent.dataType.SubsResObj;
import com.samsung.nms.agent.dataType.SubsResultInfo;

import common.utils.Utils;


public class SubscriberServiceSoapBindingImpl implements SubscriberService.OSSSubscriberBean{

	Utils util = Utils.getInstance();
	final static Logger logger = LogManager.getLogger(SubscriberServiceSoapBindingImpl.class);
	ObjectMapper mapper = new ObjectMapper();
	
	private Integer getIntegerInString(String data) {
		return Integer.parseInt(data.replaceAll("[^\\d]", ""));
	}
	
	@SuppressWarnings("unchecked")
	private JSONObject changeType(JSONObject obj, String colName, String cType) {
		if (cType == "Integer") {
			//String to Integer
			obj.replace(colName, getIntegerInString((String) obj.get(colName)));
		} else {
			// Integer to String
			obj.replace(colName, obj.get(colName).toString());
		}
		return obj;
	}
	
	private JSONObject commonAxios(String fName, ArrayList<NameValuePair> params) {
		try {
//	    	SubsResultInfo re = new SubsResultInfo();
//	    	params.add(new BasicNameValuePair("type", "KRW-USD"));
	    	util.setType("GET");
	    	util.setFcName(fName);
	    	util.setParam(params);
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return obj;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JSONObject();
	}
	
	private SubsResultInfo mappingVO(JSONObject obj, String Category) {
		SubsResultInfo re = new SubsResultInfo();
		mapper.setSerializationInclusion(Include.NON_NULL);
		try {
//			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
			JSONObject robj = (JSONObject) obj.get("SubsResObj");
			SubsResObj t = new SubsResObj();
			if (Category.equals("sln")) {
	    		SlnInfo sInfo = mapper.readValue(robj.get("slnInfo").toString(), SlnInfo.class);
	    		t.setSlnInfo(sInfo);
	    	} else if (Category.equals("ssvc")) {
	    		JSONObject ssvcInfoList = (JSONObject)robj.get("SsvcInfoList");
	    		SsvcInfoList svc = mapper.readValue(robj.get("SsvcInfoList").toString(), SsvcInfoList.class);
	    		svc.setArrayOfSsvcInfo(new SsvcInfo[1]);
	    		t.setSsvcInfoList(svc);
	    	} else if (Category.equals("pbxInfo")) {
	    		JSONObject nobj= changeType((JSONObject)robj.get("PbxGrpInfoList"), "emsId", "Integer");
	    		PbxGrpInfoList pbxInfo = mapper.readValue(nobj.toString(), PbxGrpInfoList.class);
	    		t.setPbxGrpInfoList(pbxInfo);
	    	} else if (Category.equals("pbxLine")) {
	    		PbxGrpLineInfo pbxLine = mapper.readValue(robj.get("PbxGrpLineInfo").toString(), PbxGrpLineInfo.class);
	    		t.setPbxGrpLineInfo(pbxLine);
	    	} else if (Category.equals("pbxResult")) {
	    		JSONObject nobj= changeType((JSONObject)robj.get("PbxGrpLineResultList"), "emsId", "Integer");
	    		PbxGrpLineResultList pbxResult = mapper.readValue(nobj.toString(), PbxGrpLineResultList.class);
	    		t.setPbxGrpLineResultList(pbxResult);
	    	}
			re.setSubsResObj(t);
			}
		catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	
    public SubsResultInfo crteSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SlnInfo sln) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	return mappingVO(commonAxios("crteSln", params), "sln");
    }

    public SubsResultInfo dltSln(int emsId, java.lang.String col, java.lang.String dn, java.lang.String cnt) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	return mappingVO(commonAxios("dltSln", params), "sln");
    }

    public SubsResultInfo setSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SetSlnInfo setSln) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	return mappingVO(commonAxios("setSln", params), "sln");
    }

    public SubsResultInfo getSlnInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, java.lang.String pln, java.lang.String card, java.lang.String link, java.lang.String lln, java.lang.String cnt, java.lang.String mode) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	return mappingVO(commonAxios("getSlnInfo", params), "sln");
    }

    public SubsResultInfo regSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tdn, java.lang.String odn, java.lang.String mode, java.lang.String ac, java.lang.String time, java.lang.String tmstmr, java.lang.String asgId, java.lang.String sc, java.lang.String ddiCnt) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("regSsvc", params);
    	// OneOfSsvcInfo -> arrayOfSsvcInfo 이름 변환
    	// 작업
    	
    	// OneOfSsvcInfo -> arrayOfSsvcInfo 이름 변환 완료
    	SubsResultInfo result = mappingVO(sb, "ssvc");
    	return result;
    }

    public SubsResultInfo cancSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String ac, java.lang.String tdn, java.lang.String time, java.lang.String sc) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("cancSsvc", params);
    	SubsResultInfo result = mappingVO(sb, "ssvc");
    	return result;
    }

    public SubsResultInfo actSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tmstmr) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("actSsvc", params);
    	SubsResultInfo result = mappingVO(sb, "ssvc");
    	return result;
    }

    public SubsResultInfo dactSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("dactSsvc", params);
    	SubsResultInfo result = mappingVO(sb, "ssvc");
    	return result;
    }

    public SubsResultInfo regCdnAnm(int emsId, java.lang.String col, java.lang.String dn, java.lang.String nAc, java.lang.String nPfx, java.lang.String nDn, java.lang.String ci) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("regCdnAnm", params);
    	JSONObject nsb = (JSONObject)sb.get("regCdnAnmReturn");
    	SubsResultInfo re = new SubsResultInfo();
    	re.setResult(nsb.get("result").toString());
    	re.setFailReason(nsb.get("failReason").toString());
    	return re;
    }

    public SubsResultInfo cancCdnAnm(int emsId, java.lang.String col, java.lang.String dn) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("cancCdnAnm", params);
    	JSONObject nsb = (JSONObject)sb.get("cancCdnAnmReturn");
    	SubsResultInfo re = new SubsResultInfo();
    	re.setResult(nsb.get("result").toString());
    	re.setFailReason(nsb.get("failReason").toString());
    	return re;
    }

    public SubsResultInfo getSsvcInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String type) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("getSsvcInfo", params);
    	SubsResultInfo result = mappingVO(sb, "ssvc");
    	return result;
    }

    public SubsResultInfo crtePbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("crtePbxGrp", params);
    	try {
        	sb = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("hunt_tupe", "hunt_type").replaceAll("PbxGrpLineInfo", "arrayOfPbxGrpLineInfo"));
        	SubsResultInfo result = mappingVO(sb, "pbxInfo");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public SubsResultInfo crtePbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("crtePbxLine", params);
    	try {
    		Integer i = sb.toString().indexOf("\"PbxGrpLineResult\""); // 81
    		String str = sb.toString().substring(i+1, i+17);
    		String a = sb.toString().substring(0, i);
    		String b = sb.toString().substring(i+18);
    		JSONObject stb = (JSONObject) new JSONParser().parse(a + "\"arrayOfPbxGrpLineResult\"" + b);
//        	sb = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("PbxGrpLineResult", "arrayOfPbxGrpLineResult"));
        	SubsResultInfo result = mappingVO((JSONObject)stb.get("crtePbxLineReturn"), "pbxResult");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public SubsResultInfo dltPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("dltPbxGrp", params);
    	SubsResultInfo result = mappingVO(sb, "pbxInfo");
    	return result;
    }

    public SubsResultInfo dltPbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("dltPbxLine", params);
    	SubsResultInfo result = mappingVO(sb, "pbxInfo");
    	return result;
    }

    public SubsResultInfo chgPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("chgPbxGrp", params);
    	SubsResultInfo result = mappingVO(sb, "pbxInfo");
    	return result;
    }

    public SubsResultInfo getPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String mode, java.lang.String self) throws java.rmi.RemoteException {
    	ArrayList<NameValuePair> params = new ArrayList<NameValuePair>(1);
    	JSONObject sb = commonAxios("getPbxGrp", params);
    	SubsResultInfo result = mappingVO(sb, "pbxInfo");
    	return result;
    }

}
