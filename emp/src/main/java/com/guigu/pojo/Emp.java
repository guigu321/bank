package com.guigu.pojo;

public class Emp {
    private Integer id;

    private String empname;

    private String gender;

    private String birthday;

    private String phone;

    private String address;

    private String duty;

    private Integer deptid;
    
    private Dept dept;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Emp(Integer id, String empname, String gender, String birthday, String phone, String address, String duty,
			Integer deptid, Dept dept) {
		super();
		this.id = id;
		this.empname = empname;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.duty = duty;
		this.deptid = deptid;
		this.dept = dept;
	}
	

	public Emp(Integer id, String empname, String gender, String birthday, String phone, String address, String duty,
			Integer deptid) {
		super();
		this.id = id;
		this.empname = empname;
		this.gender = gender;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.duty = duty;
		this.deptid = deptid;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
    
}