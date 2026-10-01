package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class callMode {
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;

    public static final boolean onWarmupCompleted(@NotNull PlayerErrorCode playerErrorCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(playerErrorCode, "");
        if (addExtra.onExtraCallback(playerErrorCode) || zzaj.onNavigationEvent().AudioAttributesCompatParcelizer()) {
            int i2 = onNavigationEvent + 89;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onNavigationEvent + 75;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public static final boolean onExtraCallbackWithResult(@NotNull PlayerErrorCode playerErrorCode) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(playerErrorCode, "");
            addExtra.onExtraCallback(playerErrorCode);
            throw null;
        }
        Intrinsics.checkNotNullParameter(playerErrorCode, "");
        if (addExtra.onExtraCallback(playerErrorCode)) {
            return addPolicy.IPostMessageServiceStubProxy().onExtraCallback("USER_SELECTED_FOREIGNER_HOME", true);
        }
        if (!zzaj.onNavigationEvent().AudioAttributesCompatParcelizer()) {
            return false;
        }
        int i3 = onNavigationEvent + 9;
        onWarmupCompleted = i3 % 128;
        return i3 % 2 != 0 ? addPolicy.ITrustedWebActivityCallback().onExtraCallback("DEBUG_FOREIGNER_HOME_ENABLED", true) : addPolicy.ITrustedWebActivityCallback().onExtraCallback("DEBUG_FOREIGNER_HOME_ENABLED", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (o.zzaj.onNavigationEvent().AudioAttributesCompatParcelizer() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        o.addPolicy.ITrustedWebActivityCallback().onNavigationEvent("DEBUG_FOREIGNER_HOME_ENABLED", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        r3 = o.callMode.onNavigationEvent + 111;
        o.callMode.onWarmupCompleted = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r3 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (o.addExtra.onExtraCallback(o.PlayerErrorCode.onWarmupCompleted) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (o.addExtra.onExtraCallback(o.PlayerErrorCode.onWarmupCompleted) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        o.addPolicy.IPostMessageServiceStubProxy().onNavigationEvent("USER_SELECTED_FOREIGNER_HOME", r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
    }
}
