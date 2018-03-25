  var showMap = $('#map-canvas');

//var url = 'http://api.apixu.com/v1/current.json?key=0c4d4e086108490d8b733747180603&q='+ String(latitude) + ',' + String(longitude);

function initialize() {
$('#goButton').hide()
downloadMap();
downloadWeather();
downloadForecast();

  }

function downloadMap(){
  var mapOptions = {
    center: { lat: parseFloat($('#lat').val()), lng: parseFloat($('#lon').val()) },
    zoom: 8
};
var map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

}

function downloadWeather(){
  var latitude = $('#lat').val();
  var longitude = $('#lon').val();


  var url = 'http://api.apixu.com/v1/forecast.json?key=0c4d4e086108490d8b733747180603&q='+latitude+','+longitude+'&days=7'

      $.getJSON(url, function(data) {
        var current = data.current.temp_c;
        var high = data.forecast.forecastday[0].day.maxtemp_c;
        var low = data.forecast.forecastday[0].day.mintemp_c;
        var feelsLike = data.current.feelslike_c;
        var condition = data.current.condition.text;
        var cloudCover = data.current.cloud;
        var humidity = data.current.humidity;
        var pressure = data.current.pressure_mb;
        var direction = data.current.wind_dir;
        var speed = data.current.wind_kph;



        $('#weather').css("background-color", "lightBlue");
        $('#weather').css("border-color", "black");
        $('#weather').css("border-width", "2px");
        $('#weather').css("border-style", "solid");
        $('#weather').css("list-style-type", "none");

        $('#weather').append('<p><b>Temperature</b></p>')
        $('#weather').append('<li>Current: ' + current + '&deg;C</li>')
        $('#weather').append('<li>High: ' + high + '&deg;C</li>')
        $('#weather').append('<li>Low: ' + low + '&deg;C</li>')

        $('#weather').append('<li>Feels Like: ' + feelsLike + '&deg;C</li>')
        $('#weather').append('<p></p>')
        $('#weather').append('<p><b>Condition</b></p>')
        $('#weather').append('<li>' + condition + '</li>')
        $('#weather').append('<li>Cloud Cover: ' + cloudCover + '%</li>')
        $('#weather').append('<li>Humidity: ' + humidity + '%</li>')
        $('#weather').append('<li>Pressure: ' + pressure + ' mB</li>')
        $('#weather').append('<p></p>')
        $('#weather').append('<p><b>Wind</b></p>')
        $('#weather').append('<li>Direction: ' + direction + '</li>')
        $('#weather').append('<li>Speed: ' + speed + ' km/h</li>')

      });

}

function downloadForecast(){
  var latitude = $('#lat').val();
  var longitude = $('#lon').val();

  var url = 'http://api.apixu.com/v1/forecast.json?key=0c4d4e086108490d8b733747180603&q='+latitude+','+longitude+'&days=7'


  $('#forecast').append("<table class='table' id = 'tbl'>");
  $('#tbl').append("<thead><tr><th scope='col'>Date</th>" +
  "<th scope='col'>Condition</th><th scope='col'>High</th>"+
  "<th scope='col'>Low</th><th scope='col'>Wind</th><th scope='col'>Outlook</th></tr></thead>");
  $('#tbl').append("<tbody>");


  $('#forecast').css("padding-top", "2em");
  $('#forecast').css("list-style", "none");
    $.getJSON(url, function(data) {

      for (i = 0; i < 7; i++) {
    date = data.forecast.forecastday[i].date;
    condition = data.forecast.forecastday[i].day.condition.icon.substr(34,3);
    high = data.forecast.forecastday[i].day.maxtemp_c;
    low = data.forecast.forecastday[i].day.mintemp_c;
    wind = data.forecast.forecastday[i].day.maxwind_kph;
    outlook = data.forecast.forecastday[i].day.condition.text;


$('#tbl').append("<tr><td>"+date+"</td><td>"+ "<img src='./images/"+condition+".png' width='64' height='64'></td><td>"+high+"&deg;C</td>" +
"<td>"+low+"&deg;C</td><td>"+wind+" km/h</td><td>"+outlook+"</td></tr>");

}
    });
    $('#forecast').append("</tbody></table></div>");

}

  $(document).ready(function(){
      $('#goButton').on('click',initialize)

  });
