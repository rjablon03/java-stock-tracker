import java.util.ArrayList;

public class StockList {
    private ArrayList<Stock> stocks;

    public StockList() {
        this.stocks = new ArrayList<Stock>();
    }

    public void buildStockList() {
        int x = 9; //Build this out next
        System.out.println(x);
    }

    public void appendStock(Stock stock) {
        stocks.add(stock);
    }

    public ArrayList<Stock> getStocksList() {
        return stocks;
    }
}
