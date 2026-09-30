package o;

import androidx.annotation.NonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface setAnimationListener {
    void onChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout);

    void onDataSetInvalidated();

    void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2);

    void onItemChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, Object obj);

    void onItemInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2);

    void onItemMoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3);

    void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3);

    void onItemRangeChanged(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3, Object obj);

    void onItemRangeInserted(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3);

    void onItemRangeRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2, int i3);

    void onItemRemoved(@NonNull SwipeRefreshLayout swipeRefreshLayout, int i2);
}
