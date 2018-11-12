package com.ectrip.sys.employee.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.ectrip.base.dao.idao.IGenericDao;
import com.ectrip.sys.model.employee.Employee;
import com.ectrip.sys.model.employee.Esfemployeetab;
import com.ectrip.sys.model.syspar.Syslog;

public interface IEmployeeDAO extends IGenericDao {

	/**
	 * 根据用户名查询用户信息
	 * Describe:
	 * @auth:huangyuqi
	 * @param empid
	 * @return
	 * return:Employee
	 * Date:2011-11-10
	 */
	public Employee retrieve(String empid);
	/**
	 * 修改用户信息
	 * Describe:
	 * @auth:huangyuqi
	 * @param e
	 * @param syslog
	 * return:void
	 * Date:2011-11-10
	 */
	public void updateEmployeeInfo(Employee e,Syslog syslog);
	/**
	 * 修改后台用户认证码
	 * Describe:
	 * @auth:huangyuqi
	 * @param e
	 * @param syslog
	 * return:void
	 * Date:2011-11-10
	 */
	public void updateEmployeeRzPwd(Employee e,Syslog syslog);
	/**
	 * 修改后台用户密码
	 * Describe:
	 * @auth:huangyuqi
	 * @param e
	 * @param syslog
	 * return:void
	 * Date:2011-11-10
	 */
	public void updateEmployeePassword(Employee e,Syslog syslog);
	
	public List<Esfemployeetab> getEsfemployeeByGalcompanyScenicid( Long scenicId);
	
	public List<Esfemployeetab> getEsfemployeeByGalcompanyScenicids(Long iscenicid,String keys);
}