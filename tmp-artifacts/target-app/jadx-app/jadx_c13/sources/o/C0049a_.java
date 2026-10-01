package o;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tosssecurities.tracker.v2.SecuritiesLogV2;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AppSetIdAndScope1;
import o.C0049a_;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.a_, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class C0049a_ {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final AtomicBoolean IAuthTabCallback;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int asBinder = 0;
    private static char[] onExtraCallback = null;
    public static final C0049a_ onExtraCallbackWithResult;
    public static final int onNavigationEvent;
    private static int onTransact = 1;
    private static final Lazy onWarmupCompleted;

    public static /* synthetic */ AppSetIdAndScope1 IAuthTabCallback() {
        AppSetIdAndScope1 appSetIdAndScope1OnNavigationEvent;
        int i = 2 % 2;
        int i2 = asBinder + 85;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            appSetIdAndScope1OnNavigationEvent = onNavigationEvent();
            int i3 = 83 / 0;
        } else {
            appSetIdAndScope1OnNavigationEvent = onNavigationEvent();
        }
        int i4 = asBinder + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1OnNavigationEvent;
    }

    private C0049a_() {
    }

    static {
        onWarmupCompleted();
        onExtraCallbackWithResult = new C0049a_();
        onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tracker.v2.SecuritiesTrackerV2$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 55;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AppSetIdAndScope1 appSetIdAndScope1IAuthTabCallback = C0049a_.IAuthTabCallback();
                int i4 = onNavigationEvent + 71;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return appSetIdAndScope1IAuthTabCallback;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        IAuthTabCallback = new AtomicBoolean(false);
        onNavigationEvent = 8;
        int i = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    private final AppSetIdAndScope1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 23;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = (AppSetIdAndScope1) onWarmupCompleted.getValue();
        int i4 = onTransact + 69;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return appSetIdAndScope1;
        }
        throw null;
    }

    private static final AppSetIdAndScope1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        AppSetIdAndScope1 appSetIdAndScope1OnExtraCallbackWithResult = ea10.onExtraCallbackWithResult("SecuritiesTrackerV2");
        int i4 = onTransact + 113;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return appSetIdAndScope1OnExtraCallbackWithResult;
    }

    private final void onExtraCallbackWithResult() throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        asBinder = i2 % 128;
        if (i2 % 2 == 0 ? !IAuthTabCallback.compareAndSet(false, true) : !IAuthTabCallback.compareAndSet(false, true)) {
            int i3 = asBinder + 17;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        GetDetectingInterval getDetectingIntervalAccess100 = GetFeatureExtension.onWarmupCompleted.access100();
        Object[] objArr = new Object[1];
        a(new int[]{0, 2, 0, 0}, true, new byte[]{0, 0}, objArr);
        onExtraCallback();
    }

    public final void IAuthTabCallback(@NotNull SecuritiesLogV2 securitiesLogV2, boolean z) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(securitiesLogV2, "");
        onExtraCallbackWithResult();
        onExtraCallback();
        securitiesLogV2.IAuthTabCallbackStubProxy();
        GetFeatureExtension.onWarmupCompleted.onWarmupCompleted(securitiesLogV2, z);
        int i2 = asBinder + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallback;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, c, 0) + 35284), TextUtils.getTrimmedLength(_UrlKt.FRAGMENT_ENCODE_SET) + 35, KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c2 = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 93;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0)), Color.green(0) + 65, Gravity.getAbsoluteGravity(0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), ExpandableListView.getPackedPositionType(0L) + 29, 17657 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - Color.alpha(0)), 70 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12487, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            int i12 = $10 + 1;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 5 / 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            int i15 = $10 + 119;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            int i17 = $10 + 101;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i19 = $11 + 85;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i21 = $10 + 21;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] + iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void onWarmupCompleted() {
        onExtraCallback = new char[]{27223, 27162};
    }
}
