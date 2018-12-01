package cn.e3mall.common.pojo;

import java.io.Serializable;
import java.util.List;

/**  

* <p>Title: SearchResult</p>  

* <p>Description: </p>  

* @author 赵天宇

* @date 2018年11月28日  

*/
public class SearchResult implements Serializable {
	
	private long recordCount;//总记录数；
	private int tatalPages;//总页数
	private List<SearchItem> itemList;
	
	
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	public int getTatalPages() {
		return tatalPages;
	}
	public void setTatalPages(int tatalPages) {
		this.tatalPages = tatalPages;
	}
	public List<SearchItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<SearchItem> itemList) {
		this.itemList = itemList;
	}
	
	
	

}
