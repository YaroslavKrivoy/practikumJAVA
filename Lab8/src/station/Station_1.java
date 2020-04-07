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
@Table(name = "STATION", catalog = "", schema = "ADMIN235")
@NamedQueries({
    @NamedQuery(name = "Station_1.findAll", query = "SELECT s FROM Station_1 s")
    , @NamedQuery(name = "Station_1.findByNumberstation", query = "SELECT s FROM Station_1 s WHERE s.numberstation = :numberstation")
    , @NamedQuery(name = "Station_1.findByDistrict", query = "SELECT s FROM Station_1 s WHERE s.district = :district")
    , @NamedQuery(name = "Station_1.findByRegion", query = "SELECT s FROM Station_1 s WHERE s.region = :region")
    , @NamedQuery(name = "Station_1.findByCity", query = "SELECT s FROM Station_1 s WHERE s.city = :city")
    , @NamedQuery(name = "Station_1.findByAdress", query = "SELECT s FROM Station_1 s WHERE s.adress = :adress")
    , @NamedQuery(name = "Station_1.findByNumberosvoters", query = "SELECT s FROM Station_1 s WHERE s.numberosvoters = :numberosvoters")
    , @NamedQuery(name = "Station_1.findByPhone", query = "SELECT s FROM Station_1 s WHERE s.phone = :phone")})
public class Station_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUMBERSTATION")
    private String numberstation;
    @Column(name = "DISTRICT")
    private String district;
    @Column(name = "REGION")
    private String region;
    @Column(name = "CITY")
    private String city;
    @Column(name = "ADRESS")
    private String adress;
    @Column(name = "NUMBEROSVOTERS")
    private Integer numberosvoters;
    @Column(name = "PHONE")
    private String phone;

    public Station_1() {
    }

    public Station_1(String numberstation) {
        this.numberstation = numberstation;
    }

    public String getNumberstation() {
        return numberstation;
    }

    public void setNumberstation(String numberstation) {
        String oldNumberstation = this.numberstation;
        this.numberstation = numberstation;
        changeSupport.firePropertyChange("numberstation", oldNumberstation, numberstation);
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        String oldDistrict = this.district;
        this.district = district;
        changeSupport.firePropertyChange("district", oldDistrict, district);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        String oldRegion = this.region;
        this.region = region;
        changeSupport.firePropertyChange("region", oldRegion, region);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        String oldAdress = this.adress;
        this.adress = adress;
        changeSupport.firePropertyChange("adress", oldAdress, adress);
    }

    public Integer getNumberosvoters() {
        return numberosvoters;
    }

    public void setNumberosvoters(Integer numberosvoters) {
        Integer oldNumberosvoters = this.numberosvoters;
        this.numberosvoters = numberosvoters;
        changeSupport.firePropertyChange("numberosvoters", oldNumberosvoters, numberosvoters);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numberstation != null ? numberstation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Station_1)) {
            return false;
        }
        Station_1 other = (Station_1) object;
        if ((this.numberstation == null && other.numberstation != null) || (this.numberstation != null && !this.numberstation.equals(other.numberstation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "station.Station_1[ numberstation=" + numberstation + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
