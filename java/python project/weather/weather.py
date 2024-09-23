import requests

API_key="f7d0b8237e465929bcd5215ac0acd32c"
BASE_URL="https://api.openweathermap.org/data/2.5/weather?q=${*cityName*}&appid=${*API_key*}&units=metric"

city=input("Enter a city name: ")
request_url= f"{BASE_URL}?appid={API_key}&q={city}"
response= requests.get(request_url)

if response.status_code==200:
    data=response.json
    print(data)
else:
    print("An error occurred")    