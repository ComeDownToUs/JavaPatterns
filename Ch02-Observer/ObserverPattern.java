public class ObserverPattern {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        //extra lines here in online code, made up statistics display as proof of concept

        weatherData.setMeasurements(22, 21, 21.3f);
        weatherData.setMeasurements(32, 31, 31.3f);

    }
}