package admin;

import database.DBConnection;
import database.Hash;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeachersTable {

	private String teacherID;
	private String teacherName;
	private String teacherSurname;
	private String phoneNumber;
	private String email;
	private String password;
	private String addressID;
	private String subjectID;

	public TeachersTable(String teacherID, String teacherName, String teacherSurname, String phoneNumber, String email, String password,
			String addressID, String subjectID) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.teacherSurname = teacherSurname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.addressID = addressID;
		this.subjectID = subjectID;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherSurname() {
		return teacherSurname;
	}

	public void setTeacherSurname(String teacherSurname) {
		this.teacherSurname = teacherSurname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

