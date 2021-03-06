package helpers;

import java.util.ArrayList;

public class Product {
    private String id;
    private String model;
    private String brand;
    private String screensize;
    private String resolution;
    private String processor;
    private String memory;
    private String storage;
    private Double price;
    private String battery;
    private String touch;
    private String finger;
    private String face;
    private String label;
    private ArrayList<Review> reviews;



    public Product(){
        this.id = null;
        this.model = null;
        this.brand = null;
        this.screensize = null;
        this.resolution = null;
        this.processor = null;
        this.memory = null;
        this.storage = null;
        this.price = null;
        this.battery = null;
        this.face = null;
        this.finger = null;
        this.touch = null;
        this.label = null;
        this.reviews = new ArrayList<Review>();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreensize() {
        return screensize;
    }

    public void setScreensize(String screensize) {
        this.screensize = screensize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public ArrayList<Review> getReviews() {
        return reviews;
    }
    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getTouch() {
        return touch;
    }

    public void setTouch(String touch) {
        this.touch = touch;
    }

    public String getFinger() {
        return finger;
    }

    public void setFinger(String finger) {
        this.finger = finger;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
