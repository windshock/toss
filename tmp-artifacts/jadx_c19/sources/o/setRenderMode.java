package o;

import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class setRenderMode extends SupportedOutputSizesSorterLegacy<setRepeatMode> {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private final hostOnly onNavigationEvent;

    public setRenderMode(@NotNull hostOnly hostonly) {
        Intrinsics.checkNotNullParameter(hostonly, "");
        this.onNavigationEvent = hostonly;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setRepeatMode setrepeatmodeIAuthTabCallback = IAuthTabCallback();
        int i5 = IAuthTabCallback + 67;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 != 0) {
            return setrepeatmodeIAuthTabCallback;
        }
        throw null;
    }

    public /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult((setRepeatMode) onwarmupcompleted);
        int i5 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public setRepeatMode IAuthTabCallback() {
        int i2 = 2 % 2;
        setRepeatMode setrepeatmode = new setRepeatMode(this.onNavigationEvent);
        int i3 = IAuthTabCallback + 93;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return setrepeatmode;
    }

    public void onExtraCallbackWithResult(@NotNull setRepeatMode setrepeatmode) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 101;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setrepeatmode, "");
        setrepeatmode.onWarmupCompleted(this.onNavigationEvent);
        int i5 = IAuthTabCallback + 69;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        if (r6 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r1 = r1 + 1;
        o.setRenderMode.IAuthTabCallback = r1 % 128;
        r1 = r1 % 2;
        r0 = r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(o.setRenderMode.class, r0) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNull(r6, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        return kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, ((o.setRenderMode) r6).onNavigationEvent);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 23;
        o.setRenderMode.IAuthTabCallback = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 27;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            this.onNavigationEvent.hashCode();
            throw null;
        }
        int iHashCode = this.onNavigationEvent.hashCode();
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }
}
