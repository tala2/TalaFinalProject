package mub.tala.talafinalproject.data;

import com.google.android.gms.maps.internal.ILocationSourceDelegate;

public class Shop {
    private String name;
    private String adress;
    private String type;
    private double rate;
    private String phone;
    private ILocationSourceDelegate locationSourceDelegate;

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ILocationSourceDelegate getLocationSourceDelegate() {
        return locationSourceDelegate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setLocationSourceDelegate(ILocationSourceDelegate locationSourceDelegate) {
        this.locationSourceDelegate = locationSourceDelegate;
    }
}
