
package cn.e3mall.common.pojo;

import java.io.Serializable;

/**  

* <p>Title: EasyUITreeNode</p>  

* <p>Description: </p>  

* @author zty  

* @date 2018年9月29日  

*/
public class EasyUITreeNode  implements Serializable{
	
	private long id;
	private String text;
	private String state;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
