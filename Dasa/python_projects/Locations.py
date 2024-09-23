import phonenumbers
from phonenumbers import geocoder


phone_number1=phonenumbers.parse("+918340467028")
phone_number2=phonenumbers.parse("+917061764814")
phone_number3=phonenumbers.parse("+917061996305")
phone_number4=phonenumbers.parse("+919431770680")

print("\nPhone Numbers Locations\n")
print(geocoder.description_for_number(phone_number1,"en"));
print(geocoder.description_for_number(phone_number2,"en"));
print(geocoder.description_for_number(phone_number3,"en"));
print(geocoder.description_for_number(phone_number4,"en"));

# Lets Track Phone Numbers
