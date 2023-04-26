package com.ipageon.subsif;

import java.rmi.RemoteException;

import javax.xml.namespace.QName;

import org.apache.axis.encoding.Serializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.ipageon.subsif.utils.ProxyData;
import com.samsung.nms.agent.dataFnc.*;
import com.samsung.nms.agent.resp.*;
import com.samsung.nms.agent.dataType.SubsResultInfo;

import SubscriberService.OSSSubscriberBean;
import SubscriberService.SubscriberServiceSoapBindingImpl;
import lombok.RequiredArgsConstructor;



@Endpoint
public class WebServiceEndpoint {
	private final SubscriberServiceSoapBindingImpl serve;
	private static final String NAMESPACE_URI = "SubscriberService";
	
	@Autowired
	public WebServiceEndpoint() {
		this.serve = new SubscriberServiceSoapBindingImpl();
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "crteSln")
	public @ResponsePayload CrteSlnResponse crteSln(@RequestPayload CrteSln payload) throws RemoteException {
		SubsResultInfo obj = serve.crteSln(payload.getEmsId(), payload.getCol(), payload.getSln());
		CrteSlnResponse res = new CrteSlnResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "dltSln")
	public @ResponsePayload DltSlnResponse dltSln(@RequestPayload DltSln payload) throws RemoteException {
		SubsResultInfo obj = serve.dltSln(payload.getEmsId(), payload.getCol(), payload.getDn(), payload.getCnt());
		DltSlnResponse res = new DltSlnResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "setSln")
	public @ResponsePayload SetSlnResponse setSln(@RequestPayload SetSln payload) throws RemoteException {
		SubsResultInfo obj = serve.setSln(payload.getEmsId(), payload.getCol(), payload.getSetSln());
		SetSlnResponse res = new SetSlnResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSlnInfo")
	public @ResponsePayload GetSlnInfoResponse getSlnInfo(@RequestPayload GetSlnInfo sln) throws RemoteException {
		SubsResultInfo obj = serve.getSlnInfo(sln.getEmsId(), sln.getCol(), sln.getDn(), sln.getMgId(), sln.getPln(), sln.getCard(), sln.getLink(), sln.getLln(), sln.getCnt(), sln.getMode());
		GetSlnInfoResponse res = new GetSlnInfoResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "regSsvc")
	public @ResponsePayload RegSsvcResponse regSsvc(@RequestPayload RegSsvc ssvc) throws RemoteException {
		SubsResultInfo obj = serve.regSsvc(ssvc.getEmsId(), ssvc.getCol(), ssvc.getDn(), ssvc.getSsvc(), ssvc.getTdn(), ssvc.getOdn(), ssvc.getMode(), ssvc.getAc(), ssvc.getTime(), ssvc.getTmstmr(), ssvc.getAsgId(), ssvc.getSc(), ssvc.getDdiCnt());
		RegSsvcResponse res = new RegSsvcResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cancSsvc")
	public @ResponsePayload CancSsvcResponse cancSsvc(@RequestPayload CancSsvc payload) throws RemoteException {
		SubsResultInfo obj = serve.cancSsvc(payload.getEmsId(), payload.getCol(), payload.getDn(), payload.getSsvc(), payload.getAc(), payload.getTdn(), payload.getTime(), payload.getSc());
		CancSsvcResponse res = new CancSsvcResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "actSsvc")
	public @ResponsePayload ActSsvcResponse actSsvc(@RequestPayload ActSsvc payload) throws RemoteException {
		SubsResultInfo obj = serve.actSsvc(payload.getEmsId(), payload.getCol(), payload.getDn(), payload.getSsvc(), payload.getTmstmr());
		ActSsvcResponse res = new ActSsvcResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "dactSsvc")
	public @ResponsePayload DactSsvcResponse dactSsvc(@RequestPayload DactSsvc payload) throws RemoteException {
		SubsResultInfo obj = serve.dactSsvc(payload.getEmsId(), payload.getCol(), payload.getDn(), payload.getSsvc());
		DactSsvcResponse res = new DactSsvcResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "regCdnAnm")
	public @ResponsePayload RegCdnAnmResponse regCdnAnm(@RequestPayload RegCdnAnm payload) throws RemoteException {
		SubsResultInfo obj = serve.regCdnAnm(payload.getEmsId(), payload.getCol(), payload.getDn(), payload.getnAc(), payload.getnPfx(), payload.getnDn(), payload.getCi());
		RegCdnAnmResponse res = new RegCdnAnmResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "cancCdnAnm")
	public @ResponsePayload CancCdnAnmResponse cancCdnAnm(@RequestPayload CancCdnAnm payload) throws RemoteException {
		SubsResultInfo obj = serve.cancCdnAnm(payload.getEmsId(), payload.getCol(), payload.getDn());
		CancCdnAnmResponse res = new CancCdnAnmResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSsvcInfo")
	public @ResponsePayload GetSsvcInfoResponse getSsvcInfo(@RequestPayload GetSsvcInfo ssvc) throws RemoteException {
		SubsResultInfo obj = serve.getSsvcInfo(ssvc.getEmsId(), ssvc.getCol(), ssvc.getDn(), ssvc.getMgId(), ssvc.getSsvc(), ssvc.getType());
		GetSsvcInfoResponse res = new GetSsvcInfoResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "crtePbxGrp")
	public @ResponsePayload CrtePbxGrpResponse crtePbxGrp(@RequestPayload CrtePbxGrp pbx) throws RemoteException {
		SubsResultInfo obj = serve.crtePbxGrp(pbx.getEmsId(), pbx.getCol(), pbx.getType(), pbx.getGdn(), pbx.getGln(), pbx.getHunt(), pbx.getCha(), pbx.getAnsg());
		CrtePbxGrpResponse res = new CrtePbxGrpResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "crtePbxLine")
	public @ResponsePayload CrtePbxLineResponse crtePbxLine(@RequestPayload CrtePbxLine pbxresult) throws RemoteException {
		SubsResultInfo obj = serve.crtePbxLine(pbxresult.getEmsId(), pbxresult.getCol(), pbxresult.getType(), pbxresult.getGdn(), pbxresult.getGln(), pbxresult.getIln(), pbxresult.getIdn(), pbxresult.getMgId(), pbxresult.getPln(), pbxresult.getCnt(), pbxresult.getCard(), pbxresult.getLink());
		CrtePbxLineResponse res = new CrtePbxLineResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "dltPbxGrp")
	public @ResponsePayload DltPbxGrpResponse dltPbxGrp(@RequestPayload DltPbxGrp pInfo) throws RemoteException {
		SubsResultInfo obj = serve.dltPbxGrp(pInfo.getEmsId(), pInfo.getCol(), pInfo.getType(), pInfo.getGdn(), pInfo.getGln());
		DltPbxGrpResponse res = new DltPbxGrpResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "dltPbxLine")
	public @ResponsePayload DltPbxLineResponse dltPbxLine(@RequestPayload DltPbxLine pInfo) throws RemoteException {
		SubsResultInfo obj = serve.dltPbxLine(pInfo.getEmsId(), pInfo.getCol(), pInfo.getType(), pInfo.getGdn(), pInfo.getGln(), pInfo.getIln(), pInfo.getIdn(), pInfo.getMgId(), pInfo.getPln(), pInfo.getCnt(), pInfo.getCard(), pInfo.getLink());
		DltPbxLineResponse res = new DltPbxLineResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "chgPbxGrp")
	public @ResponsePayload ChgPbxGrpResponse chgPbxGrp(@RequestPayload ChgPbxGrp pInfo) throws RemoteException {
		SubsResultInfo obj = serve.chgPbxGrp(pInfo.getEmsId(), pInfo.getCol(), pInfo.getType(), pInfo.getGdn(), pInfo.getGln(), pInfo.getHunt(), pInfo.getCha(), pInfo.getAnsg());
		ChgPbxGrpResponse res = new ChgPbxGrpResponse();
		res.setSubsResultInfo(obj);
		return res;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPbxGrp")
	public @ResponsePayload GetPbxGrpResponse getPbxGrp(@RequestPayload GetPbxGrp pInfo) throws RemoteException {
		SubsResultInfo obj = serve.getPbxGrp(pInfo.getEmsId(), pInfo.getCol(), pInfo.getType(), pInfo.getGdn(), pInfo.getGln(), pInfo.getMode(), pInfo.getSelf());
		GetPbxGrpResponse res = new GetPbxGrpResponse();
		res.setSubsResultInfo(obj);
		return res;
	}

}
