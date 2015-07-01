package android.caren.quo.booklist;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.caren.quo.R;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

public class BookListActivity extends Activity {

    RecyclerView bookListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        bookListView = (RecyclerView) findViewById(R.id.book_list_view);
        initializeRecyclerView();
    }

    private void initializeRecyclerView() {

        // Setup layout manager for items
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // Control orientation of the items
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // Customize the position you want to default scroll to
        layoutManager.scrollToPosition(0);

        // Attach layout manager to the RecyclerView
        bookListView.setLayoutManager(layoutManager);

        // allows for optimizations if all item views are of the same size:
        bookListView.setHasFixedSize(true);

        List<BookModel> bookModels = new ArrayList<>();
        bookModels.add(new BookModel("The Giver"));
        bookModels.add(new BookModel("Harry Potter"));
        bookModels.add(new BookModel("East of Eden"));

        bookListView.setAdapter(new BookListAdapter(bookModels));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        // noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
