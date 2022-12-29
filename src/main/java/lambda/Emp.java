package lambda;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Emp implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Double sal;
    private Double comm;
    private Integer deptno;

    public Emp() {
    }

    public Emp(Integer empno, String ename, String job, Integer mgr, Double sal, Double comm, Integer deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    public static List<Emp> generate() {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(7369, "SMITH", "CLERK", 7902, 800.00, null, 20));
        empList.add(new Emp(7499, "ALLEN", "SALESMAN", 7698, 1600.00, 300.00, 30));
        empList.add(new Emp(7521, "WARD", "SALESMAN", 7698, 1250.00, 500.00, 30));
        empList.add(new Emp(7566, "JONES", "MANAGER", 7839, 2975.00, null, 20));
        empList.add(new Emp(7654, "MARTIN", "SALESMAN", 7698, 1250.00, 1400.00, 30));
        empList.add(new Emp(7698, "BLAKE", "MANAGER", 7839, 2850.00, null, 30));
        empList.add(new Emp(7782, "CLARK", "MANAGER", 7839, 2450.00, null, 10));
        empList.add(new Emp(7788, "SCOTT", "ANALYST", 7566, 3000.00, null, 20));
        empList.add(new Emp(7839, "KING", "PRESIDENT", null, 5000.00, null, 10));
        empList.add(new Emp(7844, "TURNER", "SALESMAN", 7698, 1500.00, 0.00, 30));
        empList.add(new Emp(7876, "ADAMS", "CLERK", 7788, 1100.00, null, 20));
        empList.add(new Emp(7900, "JAMES", "CLERK", 7698, 950.00, null, 30));
        empList.add(new Emp(7902, "FORD", "ANALYST", 7566, 3000.00, null, 20));
        empList.add(new Emp(7934, "MILLER", "CLERK", 7782, 1300.00, null, 10));
        return empList;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
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

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(empno, emp.empno) &&
                Objects.equals(ename, emp.ename) &&
                Objects.equals(job, emp.job) &&
                Objects.equals(mgr, emp.mgr) &&
                Objects.equals(sal, emp.sal) &&
                Objects.equals(comm, emp.comm) &&
                Objects.equals(deptno, emp.deptno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, mgr, sal, comm, deptno);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}