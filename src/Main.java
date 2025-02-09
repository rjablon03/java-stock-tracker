public class Main {
    public static void main(String[] args) {
        StockList stocks = new StockList();

        stocks.appendStock(new Stock("AAPL", 203.89f));
        stocks.appendStock(new Stock("NVDA", 134.44f));
        stocks.appendStock(new Stock("META", 198.02f));

        for (Stock stock : stocks.getStocksList()) {
            System.out.printf("%s, %f\n", stock.getTickerSymbol(), stock.getCloseValue());
        }
    }
}
