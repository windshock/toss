package o;

import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.unregisterDataSetObserver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class getFillAlpha {
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;

    public static final /* synthetic */ String onExtraCallback(unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onNavigationEvent(unregisterdatasetobserver);
            obj.hashCode();
            throw null;
        }
        String strOnNavigationEvent = onNavigationEvent(unregisterdatasetobserver);
        int i3 = onExtraCallback + 27;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final String onNavigationEvent(unregisterDataSetObserver unregisterdatasetobserver) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        if (Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onWarmupCompleted.IAuthTabCallback)) {
            int i2 = onExtraCallback + 119;
            int i3 = i2 % 128;
            onExtraCallbackWithResult = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 81;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return "NetworkFailed";
        }
        if (!(!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.IAuthTabCallback.onNavigationEvent))) {
            return "ServerFailed";
        }
        if (!(unregisterdatasetobserver instanceof unregisterDataSetObserver.onExtraCallback)) {
            if (!Intrinsics.areEqual(unregisterdatasetobserver, unregisterDataSetObserver.onExtraCallbackWithResult.onExtraCallback)) {
                throw new NoWhenBranchMatchedException();
            }
            int i7 = onExtraCallbackWithResult + 13;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            return "";
        }
        String str = "TerminalFailed(" + ((unregisterDataSetObserver.onExtraCallback) unregisterdatasetobserver).onWarmupCompleted() + ")";
        int i9 = onExtraCallback + 97;
        onExtraCallbackWithResult = i9 % 128;
        int i10 = i9 % 2;
        return str;
    }

    public static /* synthetic */ void onWarmupCompleted(NativeAdsManager nativeAdsManager, String str, NativeAdsDto.AdAsset adAsset, NativeAdsEventLogType nativeAdsEventLogType, dispatchOnPageScrolled dispatchonpagescrolled, String str2, Function1 function1, Function0 function0, int i, Object obj) throws Throwable {
        NativeAdsEventLogType nativeAdsEventLogType2;
        dispatchOnPageScrolled dispatchonpagescrolled2;
        String str3;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 33;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        if (i3 % 2 != 0 ? (i & 4) == 0 : (i & 4) == 0) {
            nativeAdsEventLogType2 = nativeAdsEventLogType;
        } else {
            int i5 = i4 + 79;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            nativeAdsEventLogType2 = null;
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 87;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            dispatchonpagescrolled2 = null;
        } else {
            dispatchonpagescrolled2 = dispatchonpagescrolled;
        }
        if ((i & 16) != 0) {
            int i9 = onExtraCallbackWithResult + 51;
            onExtraCallback = i9 % 128;
            int i10 = i9 % 2;
            str3 = null;
        } else {
            str3 = str2;
        }
        onExtraCallbackWithResult(nativeAdsManager, str, adAsset, nativeAdsEventLogType2, dispatchonpagescrolled2, str3, (i & 32) != 0 ? null : function1, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r12 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r3 = o.dispatchOnPageScrolled.onWarmupCompleted.onWarmupCompleted(o.dispatchOnPageScrolled.onWarmupCompleted.onNavigationEvent(r10));
        r4 = o.getFillAlpha.onExtraCallbackWithResult + 103;
        o.getFillAlpha.onExtraCallback = r4 % 128;
        r4 = r4 % 2;
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        im.toss.ads_sdk.NativeAdsManager.IAuthTabCallback(o.nSetPosition.onExtraCallbackWithResult(), 461439007, o.nSetPosition.onExtraCallbackWithResult(), o.nSetPosition.onExtraCallbackWithResult(), -461438985, new java.lang.Object[]{r8, r9, r10, r11, r4, r13, r14, r15}, o.nSetPosition.onExtraCallbackWithResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r8 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r15.invoke();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallbackWithResult(@Nullable NativeAdsManager nativeAdsManager, @NotNull String str, @NotNull NativeAdsDto.AdAsset adAsset, @Nullable NativeAdsEventLogType nativeAdsEventLogType, @Nullable dispatchOnPageScrolled dispatchonpagescrolled, @Nullable String str2, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull Function0<Unit> function0) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adAsset, "");
            Intrinsics.checkNotNullParameter(function0, "");
            int i3 = 39 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(adAsset, "");
            Intrinsics.checkNotNullParameter(function0, "");
        }
    }
}
