package cn.niit.domain;
/**
    * 证件持久化类
 */
public class IdCard {
    private Integer id;
    private String code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
    public IdCard() {
    	
    }
    public IdCard(Integer id, String code) {
    	this.id = id;
    	this.code = code;
    }
    public String toString() {
    	return "IdCard [id=" + id + ", code=" + code + "]";
    }
}
