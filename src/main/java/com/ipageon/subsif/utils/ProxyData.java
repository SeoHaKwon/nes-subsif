package com.ipageon.subsif.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ProxyData {

	@Value("${oam.host}")
	private String HOST;
	@Value("${oam.mainPath}")
	private String ADD_URI;
}
