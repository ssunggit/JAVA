package kr.ac.kopo.day12;

import java.util.Objects;

// 해시코드의 값이 같고 equals()가 true여야 객체가 같다고 생각한다.
// 하지만 문자열의 경우는 해시코드값이 같다.
public class Member {
	private String name;
	private String phone;

	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

/*
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		// 명시적 형변환
		Member m = (Member)obj;
		
		if(this.name != null && !this.name.equals(m.name)) {
			return false;
		}
		if(this.phone != null && !this.phone.equals(m.phone)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
*/
}
