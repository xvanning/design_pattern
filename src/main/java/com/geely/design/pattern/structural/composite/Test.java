package com.geely.design.pattern.structural.composite;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent designPattenCourseCatalog = new CourseCatalog("Java设计模式",3);
        CatalogComponent singletonCourse = new Course("单例模式",555);
        CatalogComponent factoryCourse = new Course("工厂模式",666);
        designPattenCourseCatalog.add(singletonCourse);
        designPattenCourseCatalog.add(factoryCourse);

        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent windowsCourse = new Course("Windows课程",11);

        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);

        CatalogComponent mmallCourse1 = new Course("Java电商一期",55);
        CatalogComponent mmallCourse2 = new Course("Java电商二期",66);
//        CatalogComponent designPattern = new Course("Java设计模式",77);

        javaCourseCatalog.add(mmallCourse1);
        javaCourseCatalog.add(mmallCourse2);
        javaCourseCatalog.add(designPattenCourseCatalog);

        CourseCatalog imoocMainCourseCatalog = new CourseCatalog("慕课网课程主目录",1);
        imoocMainCourseCatalog.add(linuxCourse);
        imoocMainCourseCatalog.add(windowsCourse);
        imoocMainCourseCatalog.add(javaCourseCatalog);

//        imoocMainCourseCatalog.print();
        String s = JSON.toJSONString(imoocMainCourseCatalog);
        System.out.println(s);
    }
}
