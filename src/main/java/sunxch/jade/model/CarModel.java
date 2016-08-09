package sunxch.jade.model;

/**
 * CarModel
 *
 * @author xiaochen.sun
 * @since 2016-08-09 15:51
 */
public class CarModel {
    private int id;
    private String name;
    private String brandName;
    private String serialName;
    private int version;// 版本号，
    private int levelNew;

    public int getId() {
        return id;
    }

    public CarModel setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CarModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrandName() {
        return brandName;
    }

    public CarModel setBrandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    public String getSerialName() {
        return serialName;
    }

    public CarModel setSerialName(String serialName) {
        this.serialName = serialName;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public CarModel setVersion(int version) {
        this.version = version;
        return this;
    }

    public int getLevelNew() {
        return levelNew;
    }

    public CarModel setLevelNew(int levelNew) {
        this.levelNew = levelNew;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CarModel{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", brandName='").append(brandName).append('\'');
        sb.append(", serialName='").append(serialName).append('\'');
        sb.append(", version=").append(version);
        sb.append(", levelNew=").append(levelNew);
        sb.append('}');
        return sb.toString();
    }
}
