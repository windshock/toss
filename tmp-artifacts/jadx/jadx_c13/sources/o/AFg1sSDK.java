package o;

import androidx.compose.ui.geometry.Rect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AFg1sSDK;
import o.AppSetIdAndScope1;
import o.getPreRenderJob;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFg1sSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted;
    private static final Lazy IAuthTabCallback = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.uikit.dnd.DragAndDropModifiersKt$$ExternalSyntheticLambda0
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                AFg1sSDK.onExtraCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AppSetIdAndScope1 appSetIdAndScope1OnExtraCallback = AFg1sSDK.onExtraCallback();
            int i3 = onNavigationEvent + 109;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return appSetIdAndScope1OnExtraCallback;
        }
    });
    private static final float onExtraCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);

    public static final /* synthetic */ Rect IAuthTabCallback(Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(futures3);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Rect rectOnExtraCallbackWithResult = onExtraCallbackWithResult(futures3);
        int i3 = onNavigationEvent + 43;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 96 / 0;
        }
        return rectOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i5)) | (~(i2 | i5));
        int i9 = i2 | i6;
        int i10 = (~(i6 | (~i5))) | (~(i7 | (~i2))) | (~i9);
        int i11 = i2 + i5 + i3 + (1350191703 * i4) + ((-44904237) * i);
        int i12 = i11 * i11;
        int i13 = ((i2 * (-560584373)) - 948043776) + ((-560584373) * i5) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i3) + ((-71041024) * i4) + ((-766246912) * i) + (1339949056 * i12);
        int i14 = (i2 * 1657715387) + 2046152777 + (i5 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i3 * 1657716305) + (i4 * 1507858311) + (i * 1845144771) + (i12 * 155058176);
        if (i13 + (i14 * i14 * 417464320) != 1) {
            return IAuthTabCallback(objArr);
        }
        int i15 = 2 % 2;
        int i16 = onNavigationEvent + 103;
        onWarmupCompleted = i16 % 128;
        int i17 = i16 % 2;
        Object value = IAuthTabCallback.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) value;
        int i18 = onNavigationEvent + 95;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        return appSetIdAndScope1;
    }

    public static /* synthetic */ AppSetIdAndScope1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    static {
        int i = onExtraCallbackWithResult + 33;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private static final AppSetIdAndScope1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("DragAndDrop");
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        return appSetIdAndScope1OnExtraCallbackWithResult;
    }

    public static final float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 43;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        float f = onExtraCallback;
        int i5 = i2 + 1;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return f;
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Function0<Boolean> function0, @NotNull Function2<Object, ? super setUseCaseAttached, Unit> function2, @NotNull Function1<Object, Unit> function1, @NotNull Function1<Object, Unit> function12, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDKAFa1ySDK(aFg1qSDK, f, function0, function2, function1, function12, null));
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallbackWithResult(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDK(aFg1qSDK, obj, AFg1oSDK.Item));
        int i2 = onWarmupCompleted + 97;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    public static final QuirksExternalSyntheticBackport0 onExtraCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDK(aFg1qSDK, obj, AFg1oSDK.Handle));
        int i2 = onNavigationEvent + 85;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static final QuirksExternalSyntheticBackport0 IAuthTabCallback(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDK(aFg1qSDK, obj, AFg1oSDK.Region));
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return quirksExternalSyntheticBackport0OnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        AFg1qSDK aFg1qSDK = (AFg1qSDK) objArr[1];
        Object obj = objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDK(aFg1qSDK, obj, AFg1oSDK.DropTarget));
        int i2 = onWarmupCompleted + 67;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    public static final QuirksExternalSyntheticBackport0 onNavigationEvent(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(obj, "");
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = quirksExternalSyntheticBackport0.onExtraCallback(new AFg1kSDK(aFg1qSDK, obj, AFg1oSDK.Exclusion));
        int i2 = onNavigationEvent + 67;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return quirksExternalSyntheticBackport0OnExtraCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        return o.FuturesCallbackListener.IAuthTabCallback(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        o.FuturesCallbackListener.IAuthTabCallback(r4);
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        r4 = o.AFg1sSDK.onWarmupCompleted + 21;
        o.AFg1sSDK.onNavigationEvent = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4.IAuthTabCallbackStub() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r4.IAuthTabCallbackStub() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r1 = o.AFg1sSDK.onWarmupCompleted + 113;
        o.AFg1sSDK.onNavigationEvent = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Rect onExtraCallbackWithResult(Futures3 futures3) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
        }
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @NotNull AFg1qSDK aFg1qSDK, @NotNull Object obj) {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (QuirksExternalSyntheticBackport0) IAuthTabCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1691985168, iIAuthTabCallback2, iIAuthTabCallback3, 1691985168, new Object[]{quirksExternalSyntheticBackport0, aFg1qSDK, obj}, iIAuthTabCallback);
    }

    public static final AppSetIdAndScope1 onNavigationEvent() {
        int iIAuthTabCallback = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = getPreRenderJob.onNavigationEvent.IAuthTabCallback();
        return (AppSetIdAndScope1) IAuthTabCallback(getPreRenderJob.onNavigationEvent.IAuthTabCallback(), -1691471431, iIAuthTabCallback2, iIAuthTabCallback3, 1691471432, new Object[0], iIAuthTabCallback);
    }
}
