package agata.twardowska.Student.list.object;

public class Car {
    private int productionYear;
    private String mark;
    private int model;

    public int getProductionYear() {
        return productionYear;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionYear=" + productionYear +
                ", mark='" + mark + '\'' +
                ", model=" + model +
                '}';
    }
}
