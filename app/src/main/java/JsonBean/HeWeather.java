/**
  * Copyright 2018 bejson.com 
  */
package JsonBean;
import java.util.List;

/**
 * Auto-generated: 2018-01-02 10:19:20
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class HeWeather {

    private Aqi aqi;
    private Basic basic;
    private List<Daily_forecast> daily_forecast;
    private JsonBean.Now now;
    private String status;
    private JsonBean.Suggestion suggestion;
    public void setAqi(Aqi aqi) {
         this.aqi = aqi;
     }
     public Aqi getAqi() {
         return aqi;
     }

    public void setBasic(Basic basic) {
         this.basic = basic;
     }
     public Basic getBasic() {
         return basic;
     }

    public void setDaily_forecast(List<Daily_forecast> daily_forecast) {
         this.daily_forecast = daily_forecast;
     }
     public List<Daily_forecast> getDaily_forecast() {
         return daily_forecast;
     }

    public void setNow(JsonBean.Now now) {
         this.now = now;
     }
     public JsonBean.Now getNow() {
         return now;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setSuggestion(JsonBean.Suggestion suggestion) {
         this.suggestion = suggestion;
     }
     public JsonBean.Suggestion getSuggestion() {
         return suggestion;
     }

}