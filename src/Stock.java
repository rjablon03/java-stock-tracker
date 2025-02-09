public class Stock {
    private String tickerSymbol;
    private float closeValue;

    public Stock(String tickerSymbol, float closeValue) {
        this.tickerSymbol = tickerSymbol;
        this.closeValue = closeValue;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerStmbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public float getCloseValue() {
        return closeValue;
    }

    public void setCloseValue(float closeValue) {
        this.closeValue = closeValue;
    }
}