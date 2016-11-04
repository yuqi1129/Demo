package com.yuqi.pojo;

/**
 * Created with Demo.
 * User: hzyuqi1
 * Date: 2016/10/25
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */

public class Course {
    private Integer courseId;
    private String courseName;

    private Integer courseHotValue;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseHotValue() {
        return courseHotValue;
    }

    public void setCourseHotValue(Integer courseHotValue) {
        this.courseHotValue = courseHotValue;
    }
}
