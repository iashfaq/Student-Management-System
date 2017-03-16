/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metropark.university;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author laksh
 */
@Entity
@Table(name = "student", catalog = "metroparkuniversity", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentNo", query = "SELECT s FROM Student s WHERE s.studentNo = :studentNo"),
    @NamedQuery(name = "Student.findByFirstName", query = "SELECT s FROM Student s WHERE s.firstName = :firstName"),
    @NamedQuery(name = "Student.findByLastName", query = "SELECT s FROM Student s WHERE s.lastName = :lastName"),
    @NamedQuery(name = "Student.findByBirthday", query = "SELECT s FROM Student s WHERE s.birthday = :birthday"),
    @NamedQuery(name = "Student.findByMobileNo", query = "SELECT s FROM Student s WHERE s.mobileNo = :mobileNo"),
    @NamedQuery(name = "Student.findBySex", query = "SELECT s FROM Student s WHERE s.sex = :sex"),
    @NamedQuery(name = "Student.findByAddress", query = "SELECT s FROM Student s WHERE s.address = :address"),
    @NamedQuery(name = "Student.findByCourse", query = "SELECT s FROM Student s WHERE s.course = :course")})
public class Student implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "studentNo")
    private String studentNo;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Birthday")
    private String birthday;
    @Basic(optional = false)
    @Column(name = "MobileNo")
    private String mobileNo;
    @Basic(optional = false)
    @Column(name = "Sex")
    private String sex;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Course")
    private String course;

    public Student() {
    }

    public Student(String studentNo) {
        this.studentNo = studentNo;
    }

    public Student(String studentNo, String firstName, String lastName, String birthday, String mobileNo, String sex, String address, String course) {
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.mobileNo = mobileNo;
        this.sex = sex;
        this.address = address;
        this.course = course;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        String oldStudentNo = this.studentNo;
        this.studentNo = studentNo;
        changeSupport.firePropertyChange("studentNo", oldStudentNo, studentNo);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        String oldLastName = this.lastName;
        this.lastName = lastName;
        changeSupport.firePropertyChange("lastName", oldLastName, lastName);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        String oldBirthday = this.birthday;
        this.birthday = birthday;
        changeSupport.firePropertyChange("birthday", oldBirthday, birthday);
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        String oldMobileNo = this.mobileNo;
        this.mobileNo = mobileNo;
        changeSupport.firePropertyChange("mobileNo", oldMobileNo, mobileNo);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        String oldSex = this.sex;
        this.sex = sex;
        changeSupport.firePropertyChange("sex", oldSex, sex);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentNo != null ? studentNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metropark.university.Student[ studentNo=" + studentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
