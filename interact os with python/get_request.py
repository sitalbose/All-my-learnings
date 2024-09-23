import http.client
conn = http.client.HTTPConnection('www.google.com')

conn.request('GET', '/')

response = conn.getresponse()

print(response.read())