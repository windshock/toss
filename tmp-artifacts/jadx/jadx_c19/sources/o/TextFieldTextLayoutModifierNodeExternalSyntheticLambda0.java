package o;

import androidx.annotation.Nullable;
import com.google.common.primitives.Longs;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldTextLayoutModifierNodeExternalSyntheticLambda0 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final long IAuthTabCallback;
    public final long onNavigationEvent;
    public final long onWarmupCompleted;

    public TextFieldTextLayoutModifierNodeExternalSyntheticLambda0(long j, long j2, long j3) {
        this.onNavigationEvent = j;
        this.IAuthTabCallback = j2;
        this.onWarmupCompleted = j3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifierNodeExternalSyntheticLambda0)) {
            return false;
        }
        TextFieldTextLayoutModifierNodeExternalSyntheticLambda0 textFieldTextLayoutModifierNodeExternalSyntheticLambda0 = (TextFieldTextLayoutModifierNodeExternalSyntheticLambda0) obj;
        return this.onNavigationEvent == textFieldTextLayoutModifierNodeExternalSyntheticLambda0.onNavigationEvent && this.IAuthTabCallback == textFieldTextLayoutModifierNodeExternalSyntheticLambda0.IAuthTabCallback && this.onWarmupCompleted == textFieldTextLayoutModifierNodeExternalSyntheticLambda0.onWarmupCompleted;
    }

    public int hashCode() {
        return ((((Longs.hashCode(this.onNavigationEvent) + 527) * 31) + Longs.hashCode(this.IAuthTabCallback)) * 31) + Longs.hashCode(this.onWarmupCompleted);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.onNavigationEvent + ", modification time=" + this.IAuthTabCallback + ", timescale=" + this.onWarmupCompleted;
    }
}
