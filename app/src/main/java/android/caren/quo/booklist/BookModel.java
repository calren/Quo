package android.caren.quo.booklist;

import java.util.List;

public class BookModel {

    String bookTitle;
    List<String> quotes;

    public BookModel(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void addQuote(String quote) {
        quotes.add(quote);
    }

    public int getNumberOfQuotes() {
        return quotes.size();
    }

    public String getBookTitle() {
        return bookTitle;
    }

}
