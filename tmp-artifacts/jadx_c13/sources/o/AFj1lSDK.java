package o;

import android.app.Application;
import im.toss.TossApplication;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1lSDK implements getIconPaddingBottom {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private final onViewDraw onExtraCallback = onViewDraw.Analytics;

    static {
        int i = onNavigationEvent + 39;
        onExtraCallbackWithResult = i % 128;
        if (i % 2 != 0) {
            int i2 = 41 / 0;
        }
    }

    @Inject
    public AFj1lSDK() {
    }

    public onViewDraw onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 7;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        onViewDraw onviewdraw = this.onExtraCallback;
        int i5 = i2 + 85;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return onviewdraw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r9 != 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if ((r8 instanceof im.toss.TossApplication) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        r9 = o.AFj1lSDK.onWarmupCompleted + 29;
        o.AFj1lSDK.IAuthTabCallback = r9 % 128;
        r9 = r9 % 2;
        r3 = (im.toss.TossApplication) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r3.IEngagementSignalsCallbackStubProxy();
        r8 = o.AFj1lSDK.onWarmupCompleted + 69;
        o.AFj1lSDK.IAuthTabCallback = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if ((r8 instanceof im.toss.TossApplication) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r3 = (im.toss.TossApplication) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        r3.IEngagementSignalsCallbackStubProxy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (o.auth.onNavigationEvent.onNavigationEvent(r8) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        o.ConvertFloatArrayToByteArray.IAuthTabCallback(o.ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "BugsnagConsentAdapter", "Bugsnag persisted payload cleanup failed", (java.lang.Throwable) null, (java.util.Map) null, 12, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if ((r8 instanceof im.toss.TossApplication) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        r3 = (im.toss.TossApplication) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r3.IPostMessageServiceDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001f, code lost:
    
        if (r9 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r9 != 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
    
        if (r9 == 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NotNull Application application, @NotNull getIconPaddingTop geticonpaddingtop) {
        int i;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 1;
        onWarmupCompleted = i3 % 128;
        TossApplication tossApplication = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(geticonpaddingtop, "");
            i = onNavigationEvent.IAuthTabCallback[geticonpaddingtop.ordinal()];
        } else {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(geticonpaddingtop, "");
            i = onNavigationEvent.IAuthTabCallback[geticonpaddingtop.ordinal()];
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
