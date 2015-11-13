package zx.soft.video.model;

import com.google.common.base.MoreObjects;

public class Details {

	private int did;
	private String image;
	private String describe;
	private int times;
	private String uname;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("did", this.did).add("image", this.image)
				.add("describe", this.describe).add("times", this.times).add("uname", this.uname).toString();
	}

}
