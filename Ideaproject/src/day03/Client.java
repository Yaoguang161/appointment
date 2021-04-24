class Address {
    private String country;
    private String province;
    private String city;
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getProvince() {
        return province;
    }
    public void setProvince(String province) {
        this.province = province;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Address(String country, String province, String city) {
        super();
        this.country = country;
        this.province = province;
        this.city = city;
    }
    public String toString() {
        return "Address [city=" + city + ", country=" + country + ", province="
                + province + "]";
    }

}


class Customer implements Cloneable{
    private String name;
    private Address address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Customer(String name, Address address) {
        super();
        this.name = name;
        this.address = address;
    }
    public String toString() {
        return "Customer [address=" + address + ", name=" + name + "]";
    }
    public Customer clone(){
        Customer clone=null;
        try {
            clone=(Customer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}


class Example {
    public static void main(String[] args) {
        Address address=new Address("SC","CD","WHQ");
        Customer c1=new Customer("sqq", address);
        Customer c2=c1.clone();
        c2.getAddress().setCity("MY");
        System.out.println("c1"+c1.toString());
        System.out.println("c2"+c2.toString());
    }
}
