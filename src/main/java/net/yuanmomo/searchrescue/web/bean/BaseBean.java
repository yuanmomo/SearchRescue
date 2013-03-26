package net.yuanmomo.searchrescue.web.bean;

import com.spagettikod.optimist.Identity;
import com.spagettikod.optimist.Version;


public class BaseBean {

	@Identity("id")
	protected Long id=0l;

	@Version("version")
	protected Long version=0l;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}