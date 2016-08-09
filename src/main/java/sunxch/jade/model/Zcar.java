package sunxch.jade.model;

/**
 * Zcar
 *
 * @author xiaochen.sun
 * @since 2016-08-09 16:07
 */
public class Zcar {
    private int id;
    private String brand;
    private String serial;
    private String output;
    private String outputUnit;
    private int year;

    public int getId() {
        return id;
    }

    public Zcar setId(int id) {
        this.id = id;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Zcar setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public String getSerial() {
        return serial;
    }

    public Zcar setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public String getOutput() {
        return output;
    }

    public Zcar setOutput(String output) {
        this.output = output;
        return this;
    }

    public String getOutputUnit() {
        return outputUnit;
    }

    public Zcar setOutputUnit(String outputUnit) {
        this.outputUnit = outputUnit;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Zcar setYear(int year) {
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zcar{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", serial='").append(serial).append('\'');
        sb.append(", output='").append(output).append('\'');
        sb.append(", outputUnit='").append(outputUnit).append('\'');
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
