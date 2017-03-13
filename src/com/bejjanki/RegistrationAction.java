/**
 * 
 */
package com.bejjanki;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Satheesh
 *
 */
public class RegistrationAction extends ActionSupport {
	private String eid;
	private String ename;
	private String eemail;
	private String emobile;
	/**
	 * @return the eid
	 */
	public String getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return the eemail
	 */
	public String getEemail() {
		return eemail;
	}
	/**
	 * @param eemail the eemail to set
	 */
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	/**
	 * @return the emobile
	 */
	public String getEmobile() {
		return emobile;
	}
	/**
	 * @param emobile the emobile to set
	 */
	public void setEmobile(String emobile) {
		this.emobile = emobile;
	}
	
	public String execute() throws Exception{
		String status="";
		
		EmployeeService es= new EmployeeService();
		status=es.registration(eid,ename,eemail,emobile);
		return status;
	}
	
}
