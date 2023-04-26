package com.ipageon.subsif.rest.vo;

import com.samsung.nms.agent.dataType.SsvcInfo;

import lombok.Data;

@Data
public class CancSsvcVO {
	private Integer emsId;
	private String col;
	private String dn;
	private SsvcInfo SsvcInfo;
	private String ac;
	private String tdn;
	private String time;
	private String sc;
}
