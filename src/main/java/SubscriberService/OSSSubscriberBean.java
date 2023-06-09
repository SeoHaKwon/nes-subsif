/**
 * OSSSubscriberBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package SubscriberService;

public interface OSSSubscriberBean extends java.rmi.Remote {
    public com.samsung.nms.agent.dataType.SubsResultInfo crteSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SlnInfo sln) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo dltSln(int emsId, java.lang.String col, java.lang.String dn, java.lang.String cnt) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo setSln(int emsId, java.lang.String col, com.samsung.nms.agent.dataType.SetSlnInfo setSln) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo getSlnInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, java.lang.String pln, java.lang.String card, java.lang.String link, java.lang.String lln, java.lang.String cnt, java.lang.String mode) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo regSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tdn, java.lang.String odn, java.lang.String mode, java.lang.String ac, java.lang.String time, java.lang.String tmstmr, java.lang.String asgId, java.lang.String sc, java.lang.String ddiCnt) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo cancSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String ac, java.lang.String tdn, java.lang.String time, java.lang.String sc) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo actSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String tmstmr) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo dactSsvc(int emsId, java.lang.String col, java.lang.String dn, com.samsung.nms.agent.dataType.SsvcInfo ssvc) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo regCdnAnm(int emsId, java.lang.String col, java.lang.String dn, java.lang.String nAc, java.lang.String nPfx, java.lang.String nDn, java.lang.String ci) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo cancCdnAnm(int emsId, java.lang.String col, java.lang.String dn) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo getSsvcInfo(int emsId, java.lang.String col, java.lang.String dn, java.lang.String mgId, com.samsung.nms.agent.dataType.SsvcInfo ssvc, java.lang.String type) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo crtePbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo dltPbxLine(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String iln, java.lang.String idn, java.lang.String mgId, java.lang.String pln, java.lang.String cnt, java.lang.String card, java.lang.String link) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo chgPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String hunt, java.lang.String cha, java.lang.String ansg) throws java.rmi.RemoteException;
    public com.samsung.nms.agent.dataType.SubsResultInfo getPbxGrp(int emsId, java.lang.String col, java.lang.String type, java.lang.String gdn, java.lang.String gln, java.lang.String mode, java.lang.String self) throws java.rmi.RemoteException;
}
