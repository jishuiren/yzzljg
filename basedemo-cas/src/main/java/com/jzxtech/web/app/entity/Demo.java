package com.jzxtech.web.app.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_demo")
public class Demo {

	@Id
	private Integer id;

	@Column
	private String name;

	@Column
	// @QueryColumn("select mingc from t_bmb where bh={xingb} and type={leix}")
	private Integer[] intarray;

	@Column
	// @CodeColumn(column="asdf", name="vvvv", table="xxx", title="nnnn")
	private String[] txtarray;

	@Column
	private Date createdate;

	@Column
	private Timestamp createtime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer[] getIntarray() {
		return intarray;
	}

	public void setIntarray(Integer[] intarray) {
		this.intarray = intarray;
	}

	public String[] getTxtarray() {
		return txtarray;
	}

	public void setTxtarray(String[] txtarray) {
		this.txtarray = txtarray;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

}
