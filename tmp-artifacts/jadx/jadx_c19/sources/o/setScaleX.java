package o;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setScaleX {
    private final List<ImageHeaderParser> onNavigationEvent = new ArrayList();

    public List<ImageHeaderParser> onExtraCallbackWithResult() {
        List<ImageHeaderParser> list;
        synchronized (this) {
            list = this.onNavigationEvent;
        }
        return list;
    }

    public void onExtraCallbackWithResult(@NonNull ImageHeaderParser imageHeaderParser) {
        synchronized (this) {
            this.onNavigationEvent.add(imageHeaderParser);
        }
    }
}
