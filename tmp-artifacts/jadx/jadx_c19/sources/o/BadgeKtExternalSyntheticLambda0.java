package o;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class BadgeKtExternalSyntheticLambda0 {
    private static final AtomicLong asInterface = new AtomicLong();
    public final long IAuthTabCallback;
    public final Uri IAuthTabCallbackDefault;
    public final long onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final long onNavigationEvent;
    public final Map<String, List<String>> onTransact;
    public final TextFieldSelectionStateExternalSyntheticLambda12 onWarmupCompleted;

    public static long onExtraCallback() {
        return asInterface.getAndIncrement();
    }

    public BadgeKtExternalSyntheticLambda0(long j, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, long j2) {
        this(j, textFieldSelectionStateExternalSyntheticLambda12, textFieldSelectionStateExternalSyntheticLambda12.asInterface, Collections.EMPTY_MAP, j2, 0L, 0L);
    }

    public BadgeKtExternalSyntheticLambda0(long j, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.onNavigationEvent = j;
        this.onWarmupCompleted = textFieldSelectionStateExternalSyntheticLambda12;
        this.IAuthTabCallbackDefault = uri;
        this.onTransact = map;
        this.onExtraCallback = j2;
        this.IAuthTabCallback = j3;
        this.onExtraCallbackWithResult = j4;
    }
}
