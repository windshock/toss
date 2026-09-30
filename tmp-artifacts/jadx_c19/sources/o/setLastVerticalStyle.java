package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import o.setLastHorizontalStyle;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setLastVerticalStyle implements setMaxElementsWrap {
    @Override // o.setMaxElementsWrap
    public setLastHorizontalStyle IAuthTabCallback(@NonNull Context context, @NonNull setLastHorizontalStyle.onExtraCallback onextracallback) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new setLastVerticalBias(context, onextracallback);
        }
        return new setVerticalBias();
    }
}
