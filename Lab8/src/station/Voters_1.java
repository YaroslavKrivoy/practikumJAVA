/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package station;

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
 * @author krivo
 */
@Entity
@Table(name = "VOTERS", catalog = "", schema = "ADMIN235")
@NamedQueries({
    @NamedQuery(name = "Voters_1.findAll", query = "SELECT v FROM Voters_1 v")
    , @NamedQuery(name = "Voters_1.findByTaxnumber", query = "SELECT v FROM Voters_1 v WHERE v.taxnumber = :taxnumber")
    , @NamedQuery(name = "Voters_1.findByFirstname", query = "SELECT v FROM Voters_1 v WHERE v.firstname = :firstname")
    , @NamedQuery(name = "Voters_1.findByMiddlename", query = "SELECT v FROM Voters_1 v WHERE v.middlename = :middlename")
    , @NamedQuery(name = "Voters_1.findByLastname", query = "SELECT v FROM Voters_1 v WHERE v.lastname = :lastname")
    , @NamedQuery(name = "Voters_1.findByAdress", query = "SELECT v FROM Voters_1 v WHERE v.adress = :adress")
    , @NamedQuery(name = "Voters_1.findByNumberpassport", query = "SELECT v FROM Voters_1 v WHERE v.numberpassport = :numberpassport")
    , @NamedQuery(name = "Voters_1.findBySeriespassport", query = "SELECT v FROM Voters_1 v WHERE v.seriespassport = :seriespassport")
    , @NamedQuery(name = "Voters_1.findByVoted", query = "SELECT v FROM Voters_1 v WHERE v.voted = :voted")
    , @NamedQuery(name = "Voters_1.findByNumberstation", query = "SELECT v FROM Voters_1 v WHERE v.numberstation = :numberstation")})
public class Voters_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAXNUMBER")
    private Integer taxnumber;
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Column(name = "MIDDLENAME")
    private String middlename;
    @Column(name = "LASTNAME")
    private String lastname;
    @Column(name = "ADRESS")
    private String adress;
    @Column(name = "NUMBERPASSPORT")
    private Integer numberpassport;
    @Column(name = "SERIESPASSPORT")
    private String seriespassport;
    @Column(name = "VOTED")
    private Integer voted;
    @Column(name = "NUMBERSTATION")
    private String numberstation;

    public Voters_1() {
    }

    public Voters_1(Integer taxnumber) {
        this.taxnumber = taxnumber;
    }

    public Integer getTaxnumber() {
        return taxnumber;
    }

    public void setTaxnumber(Integer taxnumber) {
        Integer oldTaxnumber = this.taxnumber;
        this.taxnumber = taxnumber;
        changeSupport.firePropertyChange("taxnumber", oldTaxnumber, taxnumber);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        String oldFirstname = this.firstname;
        this.firstname = firstname;
        changeSupport.firePropertyChange("firstname", oldFirstname, firstname);
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        String oldMiddlename = this.middlename;
        this.middlename = middlename;
        changeSupport.firePropertyChange("middlename", oldMiddlename, middlename);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        String oldLastname = this.lastname;
        this.lastname = lastname;
        changeSupport.firePropertyChange("lastname", oldLastname, lastname);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        String oldAdress = this.adress;
        this.adress = adress;
        changeSupport.firePropertyChange("adress", oldAdress, adress);
    }

    public Integer getNumberpassport() {
        return numberpassport;
    }

    public void setNumberpassport(Integer numberpassport) {
        Integer oldNumberpassport = this.numberpassport;
        this.numberpassport = numberpassport;
        changeSupport.firePropertyChange("numberpassport", oldNumberpassport, numberpassport);
    }

    public String getSeriespassport() {
        return seriespassport;
    }

    public void setSeriespassport(String seriespassport) {
        String oldSeriespassport = this.seriespassport;
        this.seriespassport = seriespassport;
        changeSupport.firePropertyChange("seriespassport", oldSeriespassport, seriespassport);
    }

    public Integer getVoted() {
        return voted;
    }

    public void setVoted(Integer voted) {
        Integer oldVoted = this.voted;
        this.voted = voted;
        changeSupport.firePropertyChange("voted", oldVoted, voted);
    }

    public String getNumberstation() {
        return numberstation;
    }

    public void setNumberstation(String numberstation) {
        String oldNumberstation = this.numberstation;
        this.numberstation = numberstation;
        changeSupport.firePropertyChange("numberstation", oldNumberstation, numberstation);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxnumber != null ? taxnumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voters_1)) {
            return false;
        }
        Voters_1 other = (Voters_1) object;
        if ((this.taxnumber == null && other.taxnumber != null) || (this.taxnumber != null && !this.taxnumber.equals(other.taxnumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "station.Voters_1[ taxnumber=" + taxnumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
