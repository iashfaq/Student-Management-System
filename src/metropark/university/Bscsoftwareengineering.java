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
@Table(name = "bscsoftwareengineering", catalog = "metroparkuniversity", schema = "")
@NamedQueries({
    @NamedQuery(name = "Bscsoftwareengineering.findAll", query = "SELECT b FROM Bscsoftwareengineering b"),
    @NamedQuery(name = "Bscsoftwareengineering.findByStudentNo", query = "SELECT b FROM Bscsoftwareengineering b WHERE b.studentNo = :studentNo"),
    @NamedQuery(name = "Bscsoftwareengineering.findBySoftwareDevelopmentPrinciples", query = "SELECT b FROM Bscsoftwareengineering b WHERE b.softwareDevelopmentPrinciples = :softwareDevelopmentPrinciples"),
    @NamedQuery(name = "Bscsoftwareengineering.findByInformationSystems", query = "SELECT b FROM Bscsoftwareengineering b WHERE b.informationSystems = :informationSystems")})
public class Bscsoftwareengineering implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "studentNo")
    private String studentNo;
    @Basic(optional = false)
    @Column(name = "Software Development Principles")
    private String softwareDevelopmentPrinciples;
    @Basic(optional = false)
    @Column(name = "Information Systems")
    private String informationSystems;

    public Bscsoftwareengineering() {
    }

    public Bscsoftwareengineering(String studentNo) {
        this.studentNo = studentNo;
    }

    public Bscsoftwareengineering(String studentNo, String softwareDevelopmentPrinciples, String informationSystems) {
        this.studentNo = studentNo;
        this.softwareDevelopmentPrinciples = softwareDevelopmentPrinciples;
        this.informationSystems = informationSystems;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        String oldStudentNo = this.studentNo;
        this.studentNo = studentNo;
        changeSupport.firePropertyChange("studentNo", oldStudentNo, studentNo);
    }

    public String getSoftwareDevelopmentPrinciples() {
        return softwareDevelopmentPrinciples;
    }

    public void setSoftwareDevelopmentPrinciples(String softwareDevelopmentPrinciples) {
        String oldSoftwareDevelopmentPrinciples = this.softwareDevelopmentPrinciples;
        this.softwareDevelopmentPrinciples = softwareDevelopmentPrinciples;
        changeSupport.firePropertyChange("softwareDevelopmentPrinciples", oldSoftwareDevelopmentPrinciples, softwareDevelopmentPrinciples);
    }

    public String getInformationSystems() {
        return informationSystems;
    }

    public void setInformationSystems(String informationSystems) {
        String oldInformationSystems = this.informationSystems;
        this.informationSystems = informationSystems;
        changeSupport.firePropertyChange("informationSystems", oldInformationSystems, informationSystems);
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
        if (!(object instanceof Bscsoftwareengineering)) {
            return false;
        }
        Bscsoftwareengineering other = (Bscsoftwareengineering) object;
        if ((this.studentNo == null && other.studentNo != null) || (this.studentNo != null && !this.studentNo.equals(other.studentNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metropark.university.Bscsoftwareengineering[ studentNo=" + studentNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
