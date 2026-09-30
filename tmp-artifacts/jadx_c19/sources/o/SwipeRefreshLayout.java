package o;

import androidx.annotation.NonNull;
import com.xwray.groupie.Item;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface SwipeRefreshLayout {
    Item getItem(int i2);

    int getItemCount();

    int getPosition(@NonNull Item item);

    void registerGroupDataObserver(@NonNull setAnimationListener setanimationlistener);

    void unregisterGroupDataObserver(@NonNull setAnimationListener setanimationlistener);
}
