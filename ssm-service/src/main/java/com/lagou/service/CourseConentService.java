package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseConentService {
    List<CourseSection> findSectionAndLessonByCourseId(Integer courseId);

    Course findCourseByCourseId(int courseId);

    void saveSection(CourseSection courseSection);

    void saveLesson(CourseLesson courseLesson);

    void updateSection(CourseSection courseSection);

    void updateSectionStatus(int id, int status);

    void updateLession(CourseLesson courseLession);

    void updateLessionStatus(int id, int status);

}
