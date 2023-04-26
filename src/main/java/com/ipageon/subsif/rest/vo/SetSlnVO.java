package com.ipageon.subsif.rest.vo;


import com.samsung.nms.agent.dataType.SetSlnInfo;

import lombok.Data;

@Data
public class SetSlnVO {
	private Integer emsId;
	private String col;
	private SetSlnInfo slnInfo;
}
