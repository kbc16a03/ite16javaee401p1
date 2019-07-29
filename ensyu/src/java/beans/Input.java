package beans;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Input {
    private Integer high;
    private Integer low;
    private Integer heart;
    private String tm;
    private String status;
    private static Map<String, String> items;
    static {
        items = new LinkedHashMap<>();
        items.put("なし", "なし");
        items.put("起床後", "起床後");
        items.put("朝食後", "朝食後");
        items.put("昼食後", "昼食後");
        items.put("入浴後", "入浴後");
        items.put("夜食後", "夜食後");
    }
    
    public Map<String, String> getItems() {
        return items;
    }
    
    @EJB
    MeasurementDb db;
    
   public String next() {
        create();
        return "output.xhtml";
    }
    
    public String create() {
        Measurement measurement = new Measurement(high, low, heart, tm, status);// 新規登録
        try {
            db.create(measurement);
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public List<Measurement> getAll() {
        return db.getAll();
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHeart() {
        return heart;
    }

    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MeasurementDb getDb() {
        return db;
    }

    public void setDb(MeasurementDb db) {
        this.db = db;
    }
    
    
    
    
}