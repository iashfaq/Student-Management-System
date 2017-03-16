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
@Table(name = "lecturer", catalog = "metroparkuniversity", schema = "")
@NamedQueries({
    @NamedQuery(name = "Lecturer.findAll", query = "SELECT l FROM Lecturer l"),
    @NamedQuery(name = "Lecturer.findByLecturerId", query = "SELECT l FROM Lecturer l WHERE l.lecturerId = :lecturerId"),
    @NamedQuery(name = "Lecturer.findByFirstName", query = "SELECT l FROM Lecturer l WHERE l.firstName = :firstName"),
    @NamedQuery(name = "Lecturer.findByLastName", query = "SELECT l FROM Lecturer l WHERE l.lastName = :lastName"),
    @NamedQuery(name = "Lecturer.findByPosition", query = "SELECT l FROM Lecturer l WHERE l.position = :position"),
    @NamedQuery(name = "Lecturer.findByMobileNo", query = "SELECT l FROM Lecturer l WHERE l.mobileNo = :mobileNo"),
    @NamedQuery(name = "Lecturer.findBySex", query = "SELECT l FROM Lecturer l WHERE l.sex = :sex"),
    @NamedQuery(name = "Lecturer.findByAddress", query = "SELECT l FROM Lecturer l WHERE l.address = :address"),
    @NamedQuery(name = "Lecturer.findByCourse", query = "SELECT l FROM Lecturer l WHERE l.course = :course"),
    @NamedQuery(name = "Lecturer.findByModule", query = "SELECT l FROM Lecturer l WHERE l.module = :module")})
public class Lecturer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "lecturerId")
    private String lecturerId;
    @Basic(optional = false)
    @Column(name = "FirstName")
    private String firstName;
    @Basic(optional = false)
    @Column(name = "LastName")
    private String lastName;
    @Basic(optional = false)
    @Column(name = "Position")
    private String position;
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
    @Basic(optional = false)
    @Column(name = "Module")
    private String module;

    public Lecturer() {
    }

    public Lecturer(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Lecturer(String lecturerId, String firstName, String lastName, String position, String mobileNo, String sex, String address, String course, String module) {
        this.lecturerId = lecturerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.mobileNo = mobileNo;
        this.sex = sex;
        this.address = address;
        this.course = course;
        this.module = module;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        String oldLecturerId = this.lecturerId;
        this.lecturerId = lecturerId;
        changeSupport.firePropertyChange("lecturerId", oldLecturerId, lecturerId);
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
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

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        String oldModule = this.module;
        this.module = module;
        changeSupport.firePropertyChange("module", oldModule, module);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lecturerId != null ? lecturerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturer)) {
            return false;
        }
        Lecturer other = (Lecturer) object;
        if ((this.lecturerId == null && other.lecturerId != null) || (this.lecturerId != null && !this.lecturerId.equals(other.lecturerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metropark.university.Lecturer[ lecturerId=" + lecturerId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
