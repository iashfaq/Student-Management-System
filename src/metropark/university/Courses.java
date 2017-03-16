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
@Table(name = "courses", catalog = "metroparkuniversity", schema = "")
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c"),
    @NamedQuery(name = "Courses.findByCourseName", query = "SELECT c FROM Courses c WHERE c.courseName = :courseName")})
public class Courses implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "courseName")
    private String courseName;

    public Courses() {
    }

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        String oldCourseName = this.courseName;
        this.courseName = courseName;
        changeSupport.firePropertyChange("courseName", oldCourseName, courseName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseName != null ? courseName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.courseName == null && other.courseName != null) || (this.courseName != null && !this.courseName.equals(other.courseName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metropark.university.Courses[ courseName=" + courseName + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
