package o;

import androidx.annotation.NonNull;
import com.xwray.groupie.Item;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class CircleImageView {
    CircleImageView() {
    }

    public static Item onExtraCallbackWithResult(Collection<? extends SwipeRefreshLayout> collection, int i2) {
        int i3 = 0;
        for (SwipeRefreshLayout swipeRefreshLayout : collection) {
            int itemCount = swipeRefreshLayout.getItemCount() + i3;
            if (itemCount > i2) {
                return swipeRefreshLayout.getItem(i2 - i3);
            }
            i3 = itemCount;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i2 + " but there are only " + i3 + " items");
    }

    public static int onExtraCallbackWithResult(@NonNull Collection<? extends SwipeRefreshLayout> collection) {
        Iterator<? extends SwipeRefreshLayout> it = collection.iterator();
        int itemCount = 0;
        while (it.hasNext()) {
            itemCount += it.next().getItemCount();
        }
        return itemCount;
    }
}
