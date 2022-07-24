package pbarang.model.client;

public class DataClient {
    
    private int id_client;
    private String nama_client;
    private String address;
    private int phone;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getNama_client() {
        return nama_client;
    }

    public void setNama_client(String nama_client) {
        this.nama_client = nama_client;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" + "id_client=" + id_client + ", nama_client=" + nama_client + ", address=" + address + ", phone=" + phone + '}';
    }
    
}
