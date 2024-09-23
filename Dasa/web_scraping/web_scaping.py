# historical_stock_prices.py

import requests
import pandas as pd
from datetime import datetime
import matplotlib.pyplot as plt

def scrape_historical_stock_prices(ticker, start_date, end_date):
    url = f'https://finance.yahoo.com/quote/{ticker}/history?p={ticker}'
    response = requests.get(url)

    # Extracting data using Pandas
    data = pd.read_html(response.text)[0]
    
    # Cleaning and filtering the data
    data = data[['Date', 'Close']]
    data['Date'] = pd.to_datetime(data['Date'])
    data = data[(data['Date'] >= start_date) & (data['Date'] <= end_date)]

    # Plotting historical stock prices
    plt.figure(figsize=(10, 6))
    plt.plot(data['Date'], data['Close'], label=f'{ticker} Stock Prices')
    plt.title(f'Historical Stock Prices for {ticker}')
    plt.xlabel('Date')
    plt.ylabel('Close Price')
    plt.legend()
    plt.show()

# Example usage
ticker_symbol = 'AAPL'
start_date = datetime(2021, 1, 1)
end_date = datetime(2022, 1, 1)
scrape_historical_stock_prices(ticker_symbol, start_date, end_date)
