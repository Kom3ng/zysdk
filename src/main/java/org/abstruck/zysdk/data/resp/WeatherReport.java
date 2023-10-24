package org.abstruck.zysdk.data.resp;

public record WeatherReport(
        String code,
        String updateTime,
        String fxLink,
        DailyReport[] daily
) {
    public record DailyReport(
      String fxDate,
      String tempMax,
      String tempMin,
      String iconDay,
      String textDay,
      String iconNight,
      String textNight,
      String windDirDay,
      String windScaleDay,
      String windDirNight,
      String windScaleNight
    ){
    }
}
