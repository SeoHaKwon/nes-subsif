/**
 * SubscriberServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

import java.util.ArrayList;
import java.util.Date;

import org.apache.axis.AxisFault;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.samsung.nms.agent.dataType.PbxGrpInfoList;
import com.samsung.nms.agent.dataType.PbxGrpLineInfo;
import com.samsung.nms.agent.dataType.PbxGrpLineResultList;
import com.samsung.nms.agent.dataType.SlnInfo;
import com.samsung.nms.agent.dataType.SsvcInfo;
import com.samsung.nms.agent.dataType.SsvcInfoList;
import com.samsung.nms.agent.dataType.SubsResObj;
import com.samsung.nms.agent.dataType.SubsResultInfo;
import com.ipageon.subsif.rest.vo.*;
import com.ipageon.subsif.utils.ProxyData;
import com.ipageon.subsif.utils.Utils;
import com.ipageon.subsif.utils.OverUtils;

@Service
public class SubscriberServiceSoapBindingImpl implements SubscriberService.OSSSubscriberBean{
	
	@Autowired
	ProxyData pdata;
	
	OverUtils util = new OverUtils();
	
	@Value("${oam.host}")
	private String HOST;
	@Value("${oam.mainPath}")
	private String ADD_URI;
	
	final static Logger logger = LogManager.getLogger(SubscriberServiceSoapBindingImpl.class);
	ObjectMapper mapper = new ObjectMapper();
	
	private Integer getIntegerInString(String data) {
		return Integer.parseInt(data.replaceAll("[^\\d]", ""));
	}
	
//	@SuppressWarnings("unchecked")
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
	
	private JSONObject commonAxios(String fName) {
		try {
//	    	SubsResultInfo re = new SubsResultInfo();
//	    	params.add(new BasicNameValuePair("type", "KRW-USD"));
//			util.setProperties();
	    	util.setType("POST");
	    	util.setFcName(fName);
	    	
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
			if (obj.get("SubsResObj") != null) {
			System.out.printf("%s -> DATA , : %s", new Date() , obj);
			JSONObject robj = (JSONObject) obj.get("SubsResObj");
			SubsResObj t = new SubsResObj();
			if (Category.equals("sln")) {
	    		SlnInfo sInfo = mapper.readValue(robj.get("slnInfo").toString(), SlnInfo.class);
	    		t.setSlnInfo(sInfo);
	    	} else if (Category.equals("ssvc")) {
	    		JSONObject ssvcInfoList = (JSONObject)robj.get("SsvcInfoList");
	    		SsvcInfoList svc = mapper.readValue(robj.get("SsvcInfoList").toString(), SsvcInfoList.class);
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
			re.setResult(obj.get("result").toString());
			re.setFailReason(obj.get("failtReason").toString());
			} else if (obj.get("result").toString().equals("FAIL")) {
				System.out.printf("%s -> FAIL, : %s", new Date(), obj);
				re.setResult(obj.get("result").toString());
				re.setFailReason(obj.get("failtReason").toString());
			} else {
				System.out.printf("%s -> NONE, : %s", new Date(), obj);
				re.setResult("-NONE-");
				re.setFailReason("Unknown");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return re;
	}
	
    public com.samsung.nms.agent.dataType.SubsResultInfo crteSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SlnInfo sln) throws java.rmi.RemoteException {
    	try {
        	RequestVO vo = new RequestVO();
        	CrteSlnVO crt = new CrteSlnVO();
        	crt.setEmsId(emsId);
        	crt.setCol(col);
        	crt.setSlnInfo(sln);
        	vo.setCrteSlnVO(crt);
//        	util.setProperties();
	    	util.setType("PUT");
	    	util.setFcName("crteSln");
	    	util.setVo(vo);
	    	util.setVONAME("CrteSlnVO");
	    	System.out.println("==============================");
	    	System.out.println(pdata.getHOST());
	    	System.out.println("==============================");
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "sln");
        	
		} catch (Exception e) {
			// TODO: handle exception
			new AxisFault("error");
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltSln(int emsId, java.lang.String col, java.lang.String dn, java.lang.String cnt) throws java.rmi.RemoteException {
    	try {
        	RequestVO vo = new RequestVO();
        	DltSlnVO dlt = new DltSlnVO();
        	dlt.setEmsId(emsId);
        	dlt.setCol(col);
        	dlt.setDn(dn);
        	dlt.setCnt(cnt);
        	vo.setDltSlnVO(dlt);
//        	util.setProperties();
	    	util.setType("DELETE");
	    	util.setFcName("dltSln");
	    	util.setVo(vo);
	    	util.setVONAME("DltSlnVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "sln");
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo setSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SetSlnInfo setSln) throws java.rmi.RemoteException {
	   	try {
	    	RequestVO vo = new RequestVO();
	    	SetSlnVO sln = new SetSlnVO();
	    	sln.setEmsId(emsId);
	    	sln.setCol(col);
	    	sln.setSlnInfo(setSln);
	    	vo.setSetSlnVO(sln);
	    	util.setType("POST");
	    	util.setFcName("setSln");
	    	util.setVo(vo);
	    	util.setVONAME("SetSlnVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "sln");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getSlnInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, java.lang.String pln, java.lang.String card, java.lang.String link, java.lang.String lln, java.lang.String cnt, java.lang.String mode) throws java.rmi.RemoteException {
    	try {
    		RequestVO vo = new RequestVO();
	    	GetSlnInfoVO gsln = new GetSlnInfoVO();
	    	gsln.setEmsId(emsId);
	    	gsln.setCol(col);
	    	gsln.setDn(dn);
	    	gsln.setMgId(mgId);
	    	gsln.setPln(pln);
	    	gsln.setCard(card);
	    	gsln.setLink(link);
	    	gsln.setLln(lln);
	    	gsln.setCnt(cnt);
	    	gsln.setMode(mode);
	    	vo.setGetSlnInfoVO(gsln);
//			util.setProperties();
	    	util.setType("POST");
	    	util.setFcName("getSlnInfo");
	    	util.setVo(vo);
	    	util.setVONAME("GetSlnInfoVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "sln");
	    	
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo regSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tdn, java.lang.String odn, java.lang.String mode, java.lang.String ac, java.lang.String time, java.lang.String tmstmr, java.lang.String asgId, java.lang.String sc, java.lang.String ddiCnt) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	RegSsvcVO rsv = new RegSsvcVO();
	    	rsv.setEmsId(emsId);
	    	rsv.setCol(col);
	    	rsv.setDn(dn);
	    	rsv.setSsvcInfo(ssvc);
	    	rsv.setTdn(tdn);
	    	rsv.setOdn(odn);
	    	rsv.setMode(mode);
	    	rsv.setAc(ac);
	    	rsv.setTime(time);
	    	rsv.setTmstmr(tmstmr);
	    	rsv.setAsgId(asgId);
	    	rsv.setSc(sc);
	    	rsv.setDdiCnt(ddiCnt);
	    	vo.setRegSsvcVO(rsv);

	    	util.setType("PUT");
	    	util.setFcName("regSsvc");
	    	util.setVo(vo);
	    	util.setVONAME("RegSsvcVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo cancSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String ac, java.lang.String tdn, java.lang.String time, java.lang.String sc) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	CancSsvcVO csv = new CancSsvcVO();
	    	csv.setEmsId(emsId);
	    	csv.setCol(col);
	    	csv.setDn(dn);
	    	csv.setSsvcInfo(ssvc);
	    	csv.setAc(ac);
	    	csv.setTdn(tdn);
	    	csv.setTime(time);
	    	csv.setSc(sc);
	    	vo.setCancSsvcVO(csv);
	    	util.setType("DELETE");
	    	util.setFcName("cancSsvc");
	    	util.setVo(vo);
	    	util.setVONAME("CancSsvcVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo actSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tmstmr) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	ActSsvcVO asv = new ActSsvcVO();
	    	asv.setEmsId(emsId);
	    	asv.setCol(col);
	    	asv.setDn(dn);
	    	asv.setSsvcInfo(ssvc);
	    	asv.setTmstmr(tmstmr);
	    	vo.setActSsvcVO(asv);
	    	util.setType("POST");
	    	util.setFcName("actSsvc");
	    	util.setVo(vo);
	    	util.setVONAME("ActSsvcVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
	    	
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dactSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	DactSsvcVO dsv = new DactSsvcVO();
	    	dsv.setEmsId(emsId);
	    	dsv.setCol(col);
	    	dsv.setDn(dn);
	    	dsv.setSsvcInfo(ssvc);
	    	vo.setDactSsvcVO(dsv);

	    	util.setType("POST");
	    	util.setFcName("dactSsvc");
	    	util.setVo(vo);
	    	util.setVONAME("DactSsvcVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo regCdnAnm(int emsId, java.lang.String col, java.lang.String dn, java.lang.String nAc, java.lang.String nPfx, java.lang.String nDn, java.lang.String ci) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	RegCdnAnmVO rca = new RegCdnAnmVO();
	    	rca.setEmsId(emsId);
	    	rca.setCol(col);
	    	rca.setDn(dn);
	    	rca.setNAc(nAc);
	    	rca.setNPfx(nPfx);
	    	rca.setNDn(nDn);
	    	rca.setCi(ci);
	    	vo.setRegCdnAnmVO(rca);

	    	util.setType("PUT");
	    	util.setFcName("regCdnAnm");
	    	util.setVo(vo);
	    	util.setVONAME("RegCdnAnmVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo cancCdnAnm(int emsId, java.lang.String col, java.lang.String dn) throws java.rmi.RemoteException {
    	try {

	    	RequestVO vo = new RequestVO();
	    	CancCdnAnmVO ccav = new CancCdnAnmVO();
	    	ccav.setEmsId(emsId);
	    	ccav.setCol(col);
	    	ccav.setDn(dn);
	    	vo.setCancCdnAnmVO(ccav);

	    	util.setType("DELETE");
	    	util.setFcName("cancCdnAnm");
	    	util.setVo(vo);
	    	util.setVONAME("CancCdnAnmVO");
	    	
	    	StringBuilder sb = util.getResult();
	    	JSONObject results = (JSONObject) new JSONParser().parse(sb.toString());
			SubsResultInfo re = new SubsResultInfo();
	    	if (results.get("result").equals("FAIL")) {
	    		re = new SubsResultInfo();
	    		re.setResult(results.get("result").toString());
	    		re.setFailReason(results.get("failtReason").toString());
	    		return re;
	    	} else {
				JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
				JSONObject nsb = (JSONObject) obj.get("cancCdnAnmReturn");
		    	re.setResult(nsb.get("result").toString());
		    	re.setFailReason(nsb.get("failReason").toString());
		    	return re;
	    	}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getSsvcInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String type) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	GetSsvcInfoVO gsv = new GetSsvcInfoVO();
	    	gsv.setEmsId(emsId);
	    	gsv.setCol(col);
	    	gsv.setDn(dn);
	    	gsv.setMgId(mgId);
	    	gsv.setSsvcInfo(ssvc);
	    	gsv.setType(type);
	    	
	    	vo.setGetSsvcInfoVO(gsv);

//			util.setProperties();
	    	util.setType("POST");
	    	util.setFcName("getSsvcInfo");
	    	util.setVo(vo);
	    	util.setVONAME("GetSsvcInfoVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	return mappingVO(obj, "ssvc");
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return null;
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	CrtePbxGrpVO cpv = new CrtePbxGrpVO();
	    	cpv.setEmsId(emsId);
	    	cpv.setCol(col);
	    	cpv.setType(type);
	    	cpv.setGdn(gdn);
	    	cpv.setGln(gln);
	    	cpv.setHunt(hunt);
	    	cpv.setCha(cha);
	    	cpv.setAnsg(ansg);
	    	vo.setCrtePbxGrpVO(cpv);

//			util.setProperties();
	    	util.setType("PUT");
	    	util.setFcName("crtePbxGrp");
	    	util.setVo(vo);
	    	util.setVONAME("CrtePbxGrpVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	
        	obj = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("hunt_tupe", "hunt_type").replaceAll("PbxGrpLineInfo", "arrayOfPbxGrpLineInfo"));
        	SubsResultInfo result = mappingVO(obj, "pbxInfo");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	CrtePbxLineVO cplv = new CrtePbxLineVO();
	    	cplv.setEmsId(emsId);
	    	cplv.setCol(col);
	    	cplv.setType(type);
	    	cplv.setGdn(gdn);
	    	cplv.setGln(gln);
	    	cplv.setIln(iln);
	    	cplv.setIdn(idn);
	    	cplv.setMgId(mgId);
	    	cplv.setPln(pln);
	    	cplv.setCnt(cnt);
	    	cplv.setCard(card);
	    	cplv.setLink(link);
	    	vo.setCrtePbxLineVO(cplv);

	    	util.setType("PUT");
	    	util.setFcName("crtePbxLine");
	    	util.setVo(vo);
	    	util.setVONAME("CrtePbxLineVO");

	    	StringBuilder sb = util.getResult();
	    	JSONObject results = (JSONObject) new JSONParser().parse(sb.toString());
	    	SubsResultInfo result;
	    	if (results.get("result").equals("FAIL")) {
	    		result = new SubsResultInfo();
	    		result.setResult(results.get("result").toString());
	    		result.setFailReason(results.get("failtReason").toString());
	    		return result;
	    	} else {
	    		Integer i = sb.toString().indexOf("\"PbxGrpLineResult\""); // 81
	    		String str = sb.toString().substring(i+1, i+17);
	    		String a = sb.toString().substring(0, i);
	    		String b = sb.toString().substring(i+18);
	    		JSONObject stb = (JSONObject) new JSONParser().parse(a + "\"arrayOfPbxGrpLineResult\"" + b);
//	        	sb = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("PbxGrpLineResult", "arrayOfPbxGrpLineResult"));
	        	result = mappingVO((JSONObject)stb.get("crtePbxLineReturn"), "pbxResult");
	        	return result;
	    	}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	DltPbxGrpVO dpgv = new DltPbxGrpVO();
	    	dpgv.setEmsId(emsId);
	    	dpgv.setCol(col);
	    	dpgv.setType(type);
	    	dpgv.setGdn(gdn);
	    	dpgv.setGln(gln);
	    	vo.setDltPbxGrpVO(dpgv);
	    	
	    	util.setType("DELETE");
	    	util.setFcName("dltPbxGrp");
	    	util.setVo(vo);
	    	util.setVONAME("DltPbxGrpVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	
        	obj = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("hunt_tupe", "hunt_type").replaceAll("PbxGrpLineInfo", "arrayOfPbxGrpLineInfo"));
        	SubsResultInfo result = mappingVO(obj, "pbxInfo");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException {
//    	SubsResultInfo result = mappingVO((JSONObject)sb.get("crtePbxLineReturn"), "pbxResult");
//    	return result;
    	try {
	    	RequestVO vo = new RequestVO();
	    	DltPbxLineVO dplv = new DltPbxLineVO();
	    	dplv.setEmsId(emsId);
	    	dplv.setCol(col);
	    	dplv.setType(type);
	    	dplv.setGdn(gdn);
	    	dplv.setGln(gln);
	    	dplv.setIln(iln);
	    	dplv.setIdn(idn);
	    	dplv.setMgId(mgId);
	    	dplv.setPln(pln);
	    	dplv.setCnt(cnt);
	    	dplv.setCard(card);
	    	dplv.setLink(link);
	    	vo.setDltPbxLineVO(dplv);

	    	util.setType("DELETE");
	    	util.setFcName("dltPbxLine");
	    	util.setVo(vo);
	    	util.setVONAME("DltPbxLineVO");
	    	
	    	StringBuilder sb = util.getResult();
	    	JSONObject results = (JSONObject) new JSONParser().parse(sb.toString());
	    	SubsResultInfo result;
	    	if (results.get("result").equals("FAIL")) {
	    		result = new SubsResultInfo();
	    		result.setResult(results.get("result").toString());
	    		result.setFailReason(results.get("failtReason").toString());
	    		return result;
	    	} else {
	    		Integer i = sb.toString().indexOf("\"PbxGrpLineResult\""); // 81
	    		String str = sb.toString().substring(i+1, i+17);
	    		String a = sb.toString().substring(0, i);
	    		String b = sb.toString().substring(i+18);
	    		JSONObject stb = (JSONObject) new JSONParser().parse(a + "\"arrayOfPbxGrpLineResult\"" + b);
	//        	sb = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("PbxGrpLineResult", "arrayOfPbxGrpLineResult"));
	        	result = mappingVO((JSONObject)stb.get("crtePbxLineReturn"), "pbxResult");
	        	return result;
	    	}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo chgPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	ChgPbxGrpVO cpgv = new ChgPbxGrpVO();
	    	cpgv.setEmsId(emsId);
	    	cpgv.setCol(col);
	    	cpgv.setType(type);
	    	cpgv.setGdn(gdn);
	    	cpgv.setGln(gln);
	    	cpgv.setHunt(hunt);
	    	cpgv.setCha(cha);
	    	cpgv.setAnsg(ansg);
	    	
	    	vo.setChgPbxGrpVO(cpgv);

	    	util.setType("POST");
	    	util.setFcName("chgPbxGrp");
	    	util.setVo(vo);
	    	util.setVONAME("ChgPbxGrpVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	
			obj = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("hunt_tupe", "hunt_type").replaceAll("PbxGrpLineInfo", "arrayOfPbxGrpLineInfo"));
        	SubsResultInfo result = mappingVO(obj, "pbxInfo");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

    public com.samsung.nms.agent.dataType.SubsResultInfo getPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String mode, java.lang.String self) throws java.rmi.RemoteException {
    	try {
	    	RequestVO vo = new RequestVO();
	    	GetPbxGrpVO gpgv = new GetPbxGrpVO();
	    	gpgv.setEmsId(emsId);
	    	gpgv.setCol(col);
	    	gpgv.setType(type);
	    	gpgv.setGdn(gdn);
	    	gpgv.setGln(gln);
	    	gpgv.setMode(mode);
	    	gpgv.setSelf(self);
	    	vo.setGetPbxGrpVO(gpgv);

	    	util.setType("POST");
	    	util.setFcName("getPbxGrp");
	    	util.setVo(vo);
	    	util.setVONAME("GetPbxGrpVO");
	    	
	    	StringBuilder sb = util.getResult();
			JSONObject obj = (JSONObject) new JSONParser().parse(sb.toString());
	    	
			obj = (JSONObject) new JSONParser().parse(sb.toString().replaceAll("hunt_tupe", "hunt_type").replaceAll("PbxGrpLineInfo", "arrayOfPbxGrpLineInfo"));
        	SubsResultInfo result = mappingVO(obj, "pbxInfo");
        	return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	return new SubsResultInfo();
    }

}
