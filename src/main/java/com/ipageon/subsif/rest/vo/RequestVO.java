package com.ipageon.subsif.rest.vo;

import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class RequestVO {
	private SetSlnVO SetSlnVO;
	private DltSlnVO DltSlnVO;
	private DltPbxLineVO DltPbxLineVO;
	private CrteSlnVO CrteSlnVO;
	private GetSlnInfoVO GetSlnInfoVO;
	private RegSsvcVO RegSsvcVO;
	private CancSsvcVO CancSsvcVO;
	private ActSsvcVO ActSsvcVO;
	private DactSsvcVO DactSsvcVO;
	private RegCdnAnmVO RegCdnAnmVO;
	private GetSsvcInfoVO GetSsvcInfoVO;
	private CrtePbxGrpVO CrtePbxGrpVO;
	private CrtePbxLineVO CrtePbxLineVO;
	private DltPbxGrpVO DltPbxGrpVO;
	private ChgPbxGrpVO ChgPbxGrpVO;
	private GetPbxGrpVO GetPbxGrpVO;
	private CancCdnAnmVO CancCdnAnmVO;
}
