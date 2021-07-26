package com.project.courses;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Course implements Serializable
{
	private static final long serialVersionUID = 6321436223736954919L;
	
	@Id
	@GeneratedValue
	@ApiModelProperty(value = "Autogenerated Id")
	private int courseId;
	
	@ApiModelProperty(value = "Course Name")
	private String courseName;
	
	@ApiModelProperty(value = "Course Description")
	private String courseDescription;
	
	@ApiModelProperty(value = "Course Price")
	private double coursePrice;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}