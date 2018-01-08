/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Comparator;

/**
 *
 * @author alistan
 */
public class Checker implements Comparator<Student> {

    private Student[] studentArray;

    @Override
    public int compare(Student s1, Student s2) {
        if (Integer.compare(s1.getScore(), s2.getScore()) == 0) {
            return s1.getName().compareTo(s2.getName());
        } else {
            return Integer.compare(s1.getScore(), s2.getScore());
        }
    }

    public static void swap(StudentWrapper st1, StudentWrapper st2) {
        Student temp = st1.s;
        st1.s = st2.s;
        st2.s = temp;
    }

    public void sort(Student[] studentArray) {
        for (int i = 0; i < studentArray.length - 1; i++) {
            for (int j = 0; j < studentArray.length - 1 - i; j++) {

                if (this.compare(studentArray[j], studentArray[j + 1]) < 0) {
                    /* StudentWrapper st1 = new StudentWrapper(studentArray[j]);
                    StudentWrapper st2 = new StudentWrapper(studentArray[j + 1]);
                    swap(st1, st2); */

                    String tempName = studentArray[j].getName();
                    studentArray[j].setName(studentArray[j + 1].getName());
                    studentArray[j + 1].setName(tempName);

                    int tempScore = studentArray[j].getScore();
                    studentArray[j].setScore(studentArray[j + 1].getScore());
                    studentArray[j + 1].setScore(tempScore);
                }

            }

        }
    }

    /**
     * @return the studentArray
     */
    public Student[] getStudentArray() {
        return studentArray;
    }

    /**
     * @param studentArray the studentArray to set
     */
    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }
}
