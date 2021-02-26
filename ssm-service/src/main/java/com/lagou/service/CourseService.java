package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CourseService {

    /*
        多条件课程列表查询
     */

    public List<Course> findCourseByCondition(CourseVO courseVO);

    void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    CourseVO findCourseById(Integer id);

    void updateCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    void updateCourseStatus(int courseid, int status);


    /*
        添加课程及讲师信息
     */
//    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;
//
//    /*
//        根据ID查询课程信息
//     */
//    public CourseVO findCourseById(Integer id);
//
//    /*
//       更新课程及讲师信息
//     */
//    public void updateCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;
//
//    /*
//        课程状态变更
//     */
//    public void updateCourseStatus(int courseid, int status);


}
