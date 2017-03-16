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
@Table(name = "modules", catalog = "metroparkuniversity", schema = "")
@NamedQueries({
    @NamedQuery(name = "Modules.findAll", query = "SELECT m FROM Modules m"),
    @NamedQuery(name = "Modules.findByModuleCode", query = "SELECT m FROM Modules m WHERE m.moduleCode = :moduleCode"),
    @NamedQuery(name = "Modules.findByModuleName", query = "SELECT m FROM Modules m WHERE m.moduleName = :moduleName")})
public class Modules implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "moduleCode")
    private String moduleCode;
    @Basic(optional = false)
    @Column(name = "moduleName")
    private String moduleName;

    public Modules() {
    }

    public Modules(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public Modules(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        String oldModuleCode = this.moduleCode;
        this.moduleCode = moduleCode;
        changeSupport.firePropertyChange("moduleCode", oldModuleCode, moduleCode);
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        String oldModuleName = this.moduleName;
        this.moduleName = moduleName;
        changeSupport.firePropertyChange("moduleName", oldModuleName, moduleName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleCode != null ? moduleCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modules)) {
            return false;
        }
        Modules other = (Modules) object;
        if ((this.moduleCode == null && other.moduleCode != null) || (this.moduleCode != null && !this.moduleCode.equals(other.moduleCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metropark.university.Modules[ moduleCode=" + moduleCode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
