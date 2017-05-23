package guava;

/**
 * Guava集合测试用户
 */
public class Person {
	
	/**
	 * 用户ID
	 */
	private Long id;

	/**
	 * 用户名
	 */
	private String name;

	/**
	 * 性别 0:男;1:女
	 */
	private Integer gender;
	
	/**
	 * 年龄
	 */
	private Integer age;

	public Person(Long id, String name, Integer gender, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
