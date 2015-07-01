package android.caren.quo.booklist;

import java.util.List;

import android.caren.quo.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookModelViewHolder> {

    private List<BookModel> bookModels;

    public BookListAdapter(List<BookModel> bookModels) {
        this.bookModels = bookModels;
    }

    @Override
    public int getItemCount() {
        return this.bookModels.size();
    }

    @Override
    public BookModelViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView =
                LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.book_list_item_view,
                        viewGroup, false);
        return new BookModelViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BookModelViewHolder viewHolder, int position) {
        BookModel bookModel = bookModels.get(position);
        viewHolder.bookTitle.setText(bookModel.bookTitle);
    }

    public class BookModelViewHolder extends RecyclerView.ViewHolder {

        private TextView bookTitle;

        public BookModelViewHolder(View v) {
            super(v);
            bookTitle = (TextView) v.findViewById(R.id.book_title_text);
        }

    }

}
