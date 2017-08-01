package com.liliangliang.envicloud.entry;

/**
 * 结果码，结果描述
 * 
 * @author Administrator
 * 
 */
public class EnvicloudResultInfo {

	// 结果码
	private int rcode;
	// 结果描述
	private String rdesc;

	public int getRcode() {
		return rcode;
	}

	public void setRcode(int rcode) {
		this.rcode = rcode;
	}

	public String getRdesc() {
		return rdesc;
	}

	public void setRdesc(String rdesc) {
		this.rdesc = rdesc;
	}

	@Override
	public String toString() {
		return "相应状态码=" + rcode + ", 相应状态码解释=" + rdesc;
	}

}
