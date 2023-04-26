package com.ipageon.subsif.rest.vo;

import com.samsung.nms.agent.dataType.SsvcInfo;

import lombok.Data;

@Data
public class RegSsvcVO {
	private Integer emsId;
	private String col;
	private String dn;
	private SsvcInfo SsvcInfo;
	private String tdn;
	private String odn;
	private String mode;
	private String ac;
	private String time;
	private String tmstmr;
	private String asgId;
	private String sc;
	private String ddiCnt;
}
