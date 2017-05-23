/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Sean
 */
public class CarportOrder {
    private int CarportID;
    private String Title;
    private String UUID;
    private int Height;
    private int Width;
    private int Length;
    private String CarportType;
    private String RoofType;
    private int Orderid;
    private int Price;
    
    
     public CarportOrder(int CarportID, String Title, String UUID, int Height, int Width, int Length, String CPType, String RoofType, int Oid, int price)
    {
        this.CarportID = CarportID;
        this.Title = Title;
        this.UUID = UUID;
        this.Height = Height;
        this.Width = Width;
        this.Length = Length;
        this.CarportType = CPType;
        this.RoofType = RoofType;
        this.Orderid = Oid;
        this.Price = price;
    }
     
     public CarportOrder(int CarportID, String Title, String UUID, int Height, int Width, int Length, String CPType, String RoofType, int Oid)
    {
        this.CarportID = CarportID;
        this.Title = Title;
        this.UUID = UUID;
        this.Height = Height;
        this.Width = Width;
        this.Length = Length;
        this.CarportType = CPType;
        this.RoofType = RoofType;
        this.Orderid = Oid;
    }

    /**
     * @return the CarportID
     */
    public int getCarportID() {
        return CarportID;
    }

    /**
     * @param CarportID the CarportID to set
     */
    public void setCarportID(int CarportID) {
        this.CarportID = CarportID;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the UUID
     */
    public String getUUID() {
        return UUID;
    }

    /**
     * @param UUID the UUID to set
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * @return the Height
     */
    public int getHeight() {
        return Height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(int Height) {
        this.Height = Height;
    }

    /**
     * @return the Width
     */
    public int getWidth() {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(int Width) {
        this.Width = Width;
    }

    /**
     * @return the Length
     */
    public int getLength() {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(int Length) {
        this.Length = Length;
    }

    /**
     * @return the CarportType
     */
    public String getCarportType() {
        return CarportType;
    }

    /**
     * @param CarportType the CarportType to set
     */
    public void setCarportType(String CarportType) {
        this.CarportType = CarportType;
    }

    /**
     * @return the RoofType
     */
    public String getRoofType() {
        return RoofType;
    }

    /**
     * @param RoofType the RoofType to set
     */
    public void setRoofType(String RoofType) {
        this.RoofType = RoofType;
    }

    /**
     * @return the Orderid
     */
    public int getOrderid() {
        return Orderid;
    }

    /**
     * @param Orderid the Orderid to set
     */
    public void setOrderid(int Orderid) {
        this.Orderid = Orderid;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }
}
