package beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class Measurement implements Serializable {

    @Id
    @NotNull
    private Integer high;
    private Integer low;
    private Integer heart;
    private String tm;
    private String status;

    public Measurement() {
    }

    public Measurement(Integer high, Integer low, Integer heart, String tm, String status) {
        this.high = high;
        this.low = low;
        this.heart = heart;
        this.tm = tm;
        this.status = status;
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

    
    
}