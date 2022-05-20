package com.casflawed.flameking.weather;

public enum WeatherIconEnum {
    SUNNY("晴", R.drawable.weather_100),
    CLOUDY("多云", R.drawable.weather_101),
    OVERCAST("阴", R.drawable.weather_104),
    SHOWER_RAIN("阵雨", R.drawable.weather_300),
    THUNDERSHOWER("雷阵雨", R.drawable.weather_302),
    LIGHT_RAIN("小雨", R.drawable.weather_305),
    MODERATE_RAIN("中雨", R.drawable.weather_306),
    HEAVY_RAIN("大雨", R.drawable.weather_307);

    WeatherIconEnum(String weatherIconName, Integer weatherIconCode) {
        this.weatherIconName = weatherIconName;
        this.weatherIconCode = weatherIconCode;
    }

    private String weatherIconName;
    private Integer weatherIconCode;

    public String getWeatherIconName() {
        return weatherIconName;
    }

    public Integer getWeatherIconCode() {
        return weatherIconCode;
    }

    public static Integer getIconCodeByIconName(String name){
        for (WeatherIconEnum value : WeatherIconEnum.values()) {
            if (value.getWeatherIconName().equals(name)) {
                return value.weatherIconCode;
            }
        }
        throw new RuntimeException("当前天气的图标还未收录！");
    }
}
