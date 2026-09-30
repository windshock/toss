package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.ViewPager2OnPageChangeCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onPageSelected {
    private static int IAuthTabCallback = 1;
    private static int onNavigationEvent;

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull String str, @NotNull String str2, @NotNull Function0<String> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        ViewPager2OnPageChangeCallback.IAuthTabCallback iAuthTabCallbackOnExtraCallback = ViewPager2OnPageChangeCallback.onExtraCallbackWithResult.onExtraCallback();
        if (iAuthTabCallbackOnExtraCallback == null) {
            int i2 = IAuthTabCallback + 47;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return QuirksExternalSyntheticBackport0.Companion;
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = iAuthTabCallbackOnExtraCallback.IAuthTabCallback(str, str2, (String) function0.invoke());
        int i4 = IAuthTabCallback + 41;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return quirksExternalSyntheticBackport0IAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return o.QuirksExternalSyntheticBackport0.Companion;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r4 = o.QuirksExternalSyntheticBackport0.Companion;
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        r2 = o.onPageSelected.IAuthTabCallback + 9;
        o.onPageSelected.onNavigationEvent = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if ((r2 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        r7 = o.getOrCreateProfile.onWarmupCompleted(r4, r7);
        r0 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        r7 = o.getOrCreateProfile.onWarmupCompleted(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r7 = o.ViewPager2RecyclerViewImpl.TURNKEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        return r1.onExtraCallbackWithResult(r7, r5, r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r4 = o.onPageSelected.onNavigationEvent + 75;
        o.onPageSelected.IAuthTabCallback = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@Nullable String str, @NotNull String str2, @NotNull String str3, @Nullable ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl) {
        ViewPager2OnPageChangeCallback.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            iAuthTabCallbackOnExtraCallback = ViewPager2OnPageChangeCallback.onExtraCallbackWithResult.onExtraCallback();
            int i3 = 52 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            iAuthTabCallbackOnExtraCallback = ViewPager2OnPageChangeCallback.onExtraCallbackWithResult.onExtraCallback();
        }
    }
}
