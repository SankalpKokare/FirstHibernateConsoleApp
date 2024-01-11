package entites;
import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table (name="emp")
public class Emp {
	
	@Id
	int empno;
	@Column
	String ename;
	@Column
	String job;
	@Column
	int mgr;
	@Column
	Date hiredate;
	@Column
	double sal;
	@Column
	Double comm;
	
	public Emp() {
		super();
	}

	public Emp(int empno, String ename, String job, int mgr, Date hiredate, double sal , double comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}
	
	
	
	
	
}
