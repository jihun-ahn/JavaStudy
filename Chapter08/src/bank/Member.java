package bank;

public class Member {
	private String id;
	private String passsword;
	private String name;
	private String address;
	private String phone;
	
	public String getId() {  //필드를 인스턴스 밖에서 조회할 수있도록 해주는 메서드(get메서드)
		return this.id;
	}
	public void setId(String id) {//인스턴스 외부로 부터 데이터를 받아오는 메서드(set메서드)
		this.id = id;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
