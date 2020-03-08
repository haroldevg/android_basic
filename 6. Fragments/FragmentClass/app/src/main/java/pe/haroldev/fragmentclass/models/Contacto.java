package pe.haroldev.fragmentclass.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Contacto implements Parcelable {

    String name;
    String telephone;
    String email;
    String address;

    public Contacto(String name, String telephone, String email, String address) {
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public static final Contacto[] LISTA ={
      new Contacto("NAME 1","TELEPHONE 1","EMAIL","ADDRESS"),
      new Contacto("NAME 2","TELEPHONE 2","EMAIL","ADDRESS"),
      new Contacto("NAME 3","TELEPHONE 3","EMAIL","ADDRESS"),
      new Contacto("NAME 4","TELEPHONE 4","EMAIL","ADDRESS"),
      new Contacto("NAME 5","TELEPHONE 5","EMAIL","ADDRESS"),
      new Contacto("NAME 6","TELEPHONE 6","EMAIL","ADDRESS"),
      new Contacto("NAME 7","TELEPHONE 7","EMAIL","ADDRESS"),
      new Contacto("NAME 8","TELEPHONE 8","EMAIL","ADDRESS"),
      new Contacto("NAME 9","TELEPHONE 9","EMAIL","ADDRESS"),
      new Contacto("NAME 10","TELEPHONE 10","EMAIL","ADDRESS"),
      new Contacto("NAME 11","TELEPHONE 11","EMAIL","ADDRESS"),
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.email);
        dest.writeString(this.telephone);
    }


    public Contacto(Parcel source){
        name = source.readString();
        address = source.readString();
        email = source.readString();
        telephone = source.readString();
    }


    public static final Creator<Contacto> CREATOR = new Creator<Contacto>() {
        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }

        @Override
        public Contacto createFromParcel(Parcel source) {
            return new Contacto(source);
        }
    };
}
