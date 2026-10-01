package o;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RadioButtonDefaults {
    public final long IAuthTabCallback;
    public final long onExtraCallback;
    public final long onExtraCallbackWithResult;
    public final ImmutableList<ImeEditCommand_androidKtExternalSyntheticLambda1> onNavigationEvent;

    public RadioButtonDefaults(List<ImeEditCommand_androidKtExternalSyntheticLambda1> list, long j, long j2) {
        this.onNavigationEvent = ImmutableList.copyOf(list);
        this.onExtraCallback = j;
        this.onExtraCallbackWithResult = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.IAuthTabCallback = j3;
    }
}
