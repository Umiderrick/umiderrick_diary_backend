/**
 * 
 */
package single.entity;

import java.util.Date;

/**
 * @author pengbo
 *
 */
public class Poem {

	String head;
	
	String img;
	
	Date date;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Poem(){
		this.head ="1";
		this.date =new Date();
	}
	
}
