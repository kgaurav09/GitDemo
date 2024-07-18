package pojo;

import java.util.List;

public class Cources {

	private List<WebAutomation> webAutomation;
	private List<Api> api;
	private List<Mobile> mobile;
	List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	List<Api> getApi() {
		return api;
	}
	void setApi(List<Api> api) {
		this.api = api;
	}
	List<Mobile> getMobile() {
		return mobile;
	}
	void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
}
