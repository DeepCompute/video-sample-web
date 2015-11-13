package zx.soft.video.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Users {

	// 用户ID
	private int uid;
	// 用户名
	private String uname;
	// 用户密码
	private String upass;
	// 用户状态，1-管理员，0-普通用户
	private int state;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(uid, uname, upass, state);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("uid", this.uid).add("uname", this.uname).add("upass", this.upass)
				.add("state", this.state).toString();
	}

}
