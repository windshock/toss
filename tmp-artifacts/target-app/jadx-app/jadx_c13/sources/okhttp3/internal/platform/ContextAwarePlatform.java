package okhttp3.internal.platform;

import android.content.Context;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface ContextAwarePlatform {
    Context getApplicationContext();

    void setApplicationContext(@Nullable Context context);
}
