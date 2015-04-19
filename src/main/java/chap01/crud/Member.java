package chap01.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
// javax.persistence 에서 import 합니다. 테이블로 매핑되는
// 하겠다는 뜻!
public class Member {

	@Id
	// 주키 설정
	@GeneratedValue
	// 자동 숫자 증가
	private int id;
	private String message;
	private String name;

	// 파라미터가 없는 생성자 필요
	public Member() {
	}

	// 그외 생략

	public Member(String name, String message) {
		super();
		this.name = name;
		this.message = message;

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getMessage() {

		return message;

	}

	public void setMessage(String message) {
		this.message = message;

	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", message=" + message + ", name=" + name
				+ "]";
	}

}
