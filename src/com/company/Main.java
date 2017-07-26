package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        ArrayList<Student> studentsList = new ArrayList<>();

        Student tom = new Student("Tom", "Johnston", 123, 1);
        Student john = new Student("John", "Smith", 122, 1);
        Student harry = new Student("Harry", "Black", 112, 1);
        Student mark = new Student("Mark", "Jefferson", 132, 1);
        Student sally = new Student("Sally", "Jefferson", 321, 1);

        Student mary = new Student("Mary", "Thompson", 421, 1);
        Student clark = new Student("Clark", "Smiths", 232, 1);
        Student merl = new Student("Merl", "Green", 562, 1);
        Student cheryl = new Student("Cheryl", "Jeffersons", 867, 1);
        Student  clair = new Student("Clair", "Cline", 385, 1);

        Student  git = new Student("Git", "Push", 785, 1);
        Student glit = new Student("Glit", "Pull", 754, 1);
        Student  ash = new Student("Ash", "Slip", 896, 1);
        Student get = new Student("Get", "Sum", 754, 1);
        Student  cat = new Student("Cat", "Onfire", 896, 1);
        studentsList.add(tom);
        studentsList.add(john);
        studentsList.add(harry);
        studentsList.add(mark);
        studentsList.add(sally);

        studentsList.add(mary);
        studentsList.add(clark);
        studentsList.add(merl);
        studentsList.add(cheryl);
        studentsList.add(clair);

        studentsList.add(git);
        studentsList.add(glit);
        studentsList.add(ash);
        studentsList.add(get);
        studentsList.add(cat);

        ArrayList<Teacher> teachersList = new ArrayList<>();

        Teacher gerald = new Teacher("Gerald", "Ihatechurns", 8823, 1);
        Teacher marline = new Teacher("Marline", "Smush", 9832, 1);
        Teacher smeh = new Teacher("Smeh", "Shmuh", 9272, 1);

        teachersList.add(gerald);
        teachersList.add(marline);
        teachersList.add(smeh);

        Set<Student> set1 = new HashSet<>();
        set1.add(tom);
        set1.add(john);
        set1.add(harry);
        set1.add(mark);
        set1.add(sally);

        Set<Student> set2 = new HashSet<>();
        set2.add(mary);
        set2.add(clark);
        set2.add(merl);
        set2.add(cheryl);
        set2.add(clair);

        Set<Student> set3 = new HashSet<>();
        set3.add(git);
        set3.add(glit);
        set3.add(ash);
        set3.add(get);
        set3.add(cat);



        Map<Teacher, Set> classes = new HashMap<>();
        classes.put(gerald, set1);
        classes.put(marline, set2);
        classes.put(smeh, set3);

        System.out.println(classes);


        for(Teacher key: classes.keySet()){
            System.out.println(key);

        }

        for(Set value: classes.values()){
            System.out.println(value);
        }

        classes.forEach((teacher,set)->System.out.println("Key : " + teacher + " Value : " + set));






























    }
}
