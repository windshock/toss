package o;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.tosssecurities.webview.TossSecuritiesWebView;
import im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFi1pSDKAFa1ySDK;
import o.q4ExternalSyntheticLambda3;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFi1pSDKAFa1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    private static char[] IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static char asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    public static final int onExtraCallbackWithResult;
    private static int onTransact;
    private final Function0<Boolean> IAuthTabCallback;
    private final q5b IAuthTabCallbackDefault;
    private final r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI asBinder;
    private final AppSetIdAndScope1 onExtraCallback;
    private final Function0<Long> onNavigationEvent;
    private final accessgetStatep onWarmupCompleted;

    static {
        onExtraCallbackWithResult();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onWarmupCompleted(defaultConstructorMarker);
        onExtraCallbackWithResult = 8;
        int i = getInterfaceDescriptor + 43;
        IAuthTabCallbackStubProxy = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted();
        }
        int i3 = 48 / 0;
        return onWarmupCompleted();
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        long jLongValue = ((Number) objArr[3]).longValue();
        long jLongValue2 = ((Number) objArr[4]).longValue();
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = onExtraCallback(aFi1pSDKAFa1ySDK, str, str2, jLongValue, jLongValue2);
        int i4 = IAuthTabCallback_Parcel + 59;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return q4externalsyntheticlambda3OnExtraCallback;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 IAuthTabCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, z);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = onExtraCallback(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, z);
        int i3 = onTransact + 31;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 65 / 0;
        }
        return q4externalsyntheticlambda3OnExtraCallback;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2, Boolean bool, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback_Parcel = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            onNavigationEvent(aFi1pSDKAFa1ySDK, str, str2, j, j2, bool, i);
            obj.hashCode();
            throw null;
        }
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnNavigationEvent = onNavigationEvent(aFi1pSDKAFa1ySDK, str, str2, j, j2, bool, i);
        int i4 = IAuthTabCallback_Parcel + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return q4externalsyntheticlambda3OnNavigationEvent;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3IAuthTabCallback = IAuthTabCallback(aFi1pSDKAFa1ySDK, r8lambdalzlost8ymkygg6aehcg97m8xisw);
        int i4 = onTransact + 79;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return q4externalsyntheticlambda3IAuthTabCallback;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8 | i2);
        int i10 = ~i2;
        int i11 = i9 | (~(i7 | i10 | i4));
        int i12 = (~(i2 | i8)) | i7 | (~(i10 | i4));
        int i13 = i3 + i4 + i6 + (1112421973 * i) + ((-1897213938) * i5);
        int i14 = i13 * i13;
        int i15 = ((1216318437 * i3) - 781189120) + ((-1395624931) * i4) + (i11 * (-1305971684)) + ((-1305971684) * i8) + (1305971684 * i12) + ((-89653248) * i6) + ((-1446510592) * i) + (892338176 * i5) + ((-1657864192) * i14);
        int i16 = (i3 * 2010092721) + 1217064380 + (i4 * 2010090761) + (i11 * (-980)) + (i8 * (-980)) + (i12 * 980) + (i6 * 2010091741) + (i * (-1378896031)) + (i5 * 856652822) + (i14 * 563281920);
        switch (i15 + (i16 * i16 * (-1077346304))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                String str = (String) objArr[1];
                int i17 = 2 % 2;
                int i18 = onTransact + 85;
                IAuthTabCallback_Parcel = i18 % 128;
                return i18 % 2 == 0 ? q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 1, 4, (Object) null) : q4ExternalSyntheticLambda9.onNavigationEvent(q4ExternalSyntheticLambda9.onExtraCallbackWithResult, str, 0, 2, (Object) null);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallbackWithResult(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3IAuthTabCallback = IAuthTabCallback(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, str2);
        int i3 = IAuthTabCallback_Parcel + 65;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return q4externalsyntheticlambda3IAuthTabCallback;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallbackWithResult(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnWarmupCompleted = onWarmupCompleted(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, str2, str3);
        int i4 = onTransact + 39;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return q4externalsyntheticlambda3OnWarmupCompleted;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallbackWithResult(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnWarmupCompleted = onWarmupCompleted(aFi1pSDKAFa1ySDK, onwarmupcompleted, str, j, j2, z);
        if (i3 != 0) {
            int i4 = 64 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 53;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda3OnWarmupCompleted;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallbackWithResult(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2, int i, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = onExtraCallback(aFi1pSDKAFa1ySDK, str, str2, j, j2, i, bool);
        int i5 = IAuthTabCallback_Parcel + 101;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda3OnExtraCallback;
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 onExtraCallbackWithResult(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnWarmupCompleted = onWarmupCompleted(aFi1pSDKAFa1ySDK, r8lambdalzlost8ymkygg6aehcg97m8xisw);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = IAuthTabCallback_Parcel + 63;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda3OnWarmupCompleted;
    }

    public AFi1pSDKAFa1ySDK(@NotNull r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, @NotNull accessgetStatep accessgetstatep, @NotNull Function0<Long> function0, @NotNull Function0<Boolean> function02, @NotNull q5b q5bVar) {
        Intrinsics.checkNotNullParameter(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, "");
        Intrinsics.checkNotNullParameter(accessgetstatep, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(q5bVar, "");
        this.asBinder = r8lambdavvxsp2uzrjb9nt4ewemuyygvi;
        this.onWarmupCompleted = accessgetstatep;
        this.onNavigationEvent = function0;
        this.IAuthTabCallback = function02;
        this.IAuthTabCallbackDefault = q5bVar;
        this.onExtraCallback = ea10.onExtraCallbackWithResult("WebViewMonitoringTracker");
    }

    public static final /* synthetic */ void IAuthTabCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, q4ExternalSyntheticLambda10 q4externalsyntheticlambda10) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 17;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        aFi1pSDKAFa1ySDK.IAuthTabCallback(q4externalsyntheticlambda10);
        int i4 = IAuthTabCallback_Parcel + 45;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    /* renamed from: o.AFi1pSDKAFa1ySDK$4, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Boolean> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        AnonymousClass4(Object obj) {
            super(0, obj, responseBodyComplete.class, "isRealtimeAndWebViewEnabled", "isRealtimeAndWebViewEnabled()Z", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Boolean invoke() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolOnWarmupCompleted = onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 53;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return boolOnWarmupCompleted;
        }

        public final Boolean onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(((responseBodyComplete) this.receiver).onExtraCallback());
            int i4 = onExtraCallbackWithResult + 115;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    }

    public /* synthetic */ AFi1pSDKAFa1ySDK(r8lambdaVVxSP2UZRJb9NT4EwemUyyGVI r8lambdavvxsp2uzrjb9nt4ewemuyygvi, accessgetStatep accessgetstatep, Function0 function0, Function0 function02, q5b q5bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        function0 = (i & 4) != 0 ? new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda7
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 13;
                onNavigationEvent = i3 % 128;
                Object obj = null;
                if (i3 % 2 != 0) {
                    Long.valueOf(AFi1pSDKAFa1ySDK.IAuthTabCallback());
                    throw null;
                }
                Long lValueOf = Long.valueOf(AFi1pSDKAFa1ySDK.IAuthTabCallback());
                int i4 = IAuthTabCallback + 103;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return lValueOf;
                }
                obj.hashCode();
                throw null;
            }
        } : function0;
        if ((i & 8) != 0) {
            function02 = new AnonymousClass4(responseBodyComplete.onExtraCallback);
            int i2 = IAuthTabCallback_Parcel + 61;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        if ((i & 16) != 0) {
            q5bVar = new q5b(0L, 0, function0, 3, (DefaultConstructorMarker) null);
            int i5 = onTransact + 79;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
        }
        this(r8lambdavvxsp2uzrjb9nt4ewemuyygvi, accessgetstatep, function0, function02, q5bVar);
    }

    private static final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 91;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return SystemClock.elapsedRealtime();
        }
        int i3 = 49 / 0;
        return SystemClock.elapsedRealtime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if ((r2 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        r0 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        r1 = o.AFi1pSDKAFa1ySDK.IAuthTabCallback_Parcel + 93;
        o.AFi1pSDKAFa1ySDK.onTransact = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if ((r1 % 2) != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r4.IAuthTabCallback.invoke().booleanValue() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if ((!r4.IAuthTabCallback.invoke().booleanValue()) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        r1 = r4.onNavigationEvent.invoke();
        r2 = o.AFi1pSDKAFa1ySDK.onTransact + 93;
        o.AFi1pSDKAFa1ySDK.IAuthTabCallback_Parcel = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onTransact + 13;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 60 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        final AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) objArr[0];
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = (TossSecuritiesWebView.onWarmupCompleted) objArr[1];
        final String str = (String) objArr[2];
        Long l = (Long) objArr[3];
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (!aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue()) {
            aFi1pSDKAFa1ySDK.IAuthTabCallbackDefault.onNavigationEvent();
            return null;
        }
        if (l != null) {
            final long jLongValue = l.longValue();
            final long jLongValue2 = aFi1pSDKAFa1ySDK.onNavigationEvent.invoke().longValue();
            long jLongValue3 = ((Long) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 240920100, -240920097, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).longValue();
            final String strOnExtraCallback = aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted);
            aFi1pSDKAFa1ySDK.onExtraCallback(strOnExtraCallback, str, true, jLongValue3);
            if (jLongValue3 >= 3000) {
                aFi1pSDKAFa1ySDK.onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda6
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3;
                        int i3 = 2 % 2;
                        int i4 = onNavigationEvent + 75;
                        onExtraCallbackWithResult = i4 % 128;
                        if (i4 % 2 == 0) {
                            q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this.f$0, strOnExtraCallback, str, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1060112976, -1060112976, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
                            int i5 = 63 / 0;
                        } else {
                            q4externalsyntheticlambda3 = (q4ExternalSyntheticLambda3) AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this.f$0, strOnExtraCallback, str, Long.valueOf(jLongValue), Long.valueOf(jLongValue2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1060112976, -1060112976, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
                        }
                        int i6 = onNavigationEvent + 57;
                        onExtraCallbackWithResult = i6 % 128;
                        if (i6 % 2 != 0) {
                            return q4externalsyntheticlambda3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
            }
        }
        int i3 = IAuthTabCallback_Parcel + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static final q4ExternalSyntheticLambda3 onExtraCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2) {
        int i = 2 % 2;
        int i2 = onTransact + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3IAuthTabCallback = AFi1lSDK.onExtraCallback.IAuthTabCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, str, str2, j, j2);
        int i4 = IAuthTabCallback_Parcel + 99;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return q4externalsyntheticlambda3IAuthTabCallback;
    }

    public final void onWarmupCompleted(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable Long l, @Nullable Boolean bool, int i, boolean z) {
        long j;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (!this.IAuthTabCallback.invoke().booleanValue()) {
            int i3 = onTransact + 49;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            this.IAuthTabCallbackDefault.onNavigationEvent();
            return;
        }
        long jLongValue = this.onNavigationEvent.invoke().longValue();
        if (l != null) {
            long jLongValue2 = l.longValue();
            int i5 = IAuthTabCallback_Parcel + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            j = jLongValue2;
        } else {
            j = jLongValue;
        }
        String strOnExtraCallback = onExtraCallback(onwarmupcompleted);
        if (z) {
            onExtraCallback(strOnExtraCallback, str, false, ((Long) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, Long.valueOf(j), Long.valueOf(jLongValue)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 240920100, -240920097, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).longValue());
            onNavigationEvent((Function0<q4ExternalSyntheticLambda3>) new WebViewMonitoringTracker$.ExternalSyntheticLambda8(this, strOnExtraCallback, str, j, jLongValue, bool, i));
            int i7 = onTransact + 17;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final q4ExternalSyntheticLambda3 onNavigationEvent(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2, Boolean bool, int i) {
        int i2 = 2 % 2;
        int i3 = onTransact + Imgproc.COLOR_YUV2RGB_YVYU;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnWarmupCompleted = AFi1lSDK.onExtraCallback.onWarmupCompleted(aFi1pSDKAFa1ySDK.onWarmupCompleted, str, str2, j, j2, bool, i);
        int i5 = onTransact + 57;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return q4externalsyntheticlambda3OnWarmupCompleted;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        final AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) objArr[0];
        TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = (TossSecuritiesWebView.onWarmupCompleted) objArr[1];
        final String str = (String) objArr[2];
        Long l = (Long) objArr[3];
        final int iIntValue = ((Number) objArr[4]).intValue();
        final Boolean bool = (Boolean) objArr[5];
        boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 59;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Object obj = null;
        if (!aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue()) {
            aFi1pSDKAFa1ySDK.IAuthTabCallbackDefault.onNavigationEvent();
            return null;
        }
        final long jLongValue = aFi1pSDKAFa1ySDK.onNavigationEvent.invoke().longValue();
        long jLongValue2 = l != null ? l.longValue() : jLongValue;
        final String strOnExtraCallback = aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted);
        if (zBooleanValue) {
            aFi1pSDKAFa1ySDK.onExtraCallback(strOnExtraCallback, str, false, ((Long) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK, Long.valueOf(jLongValue2), Long.valueOf(jLongValue)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 240920100, -240920097, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).longValue());
            final long j = jLongValue2;
            aFi1pSDKAFa1ySDK.onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 39;
                    onExtraCallback = i5 % 128;
                    int i6 = i5 % 2;
                    q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallbackWithResult = AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.f$0, strOnExtraCallback, str, j, jLongValue, iIntValue, bool);
                    int i7 = onExtraCallback + 51;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    return q4externalsyntheticlambda3OnExtraCallbackWithResult;
                }
            });
        }
        int i4 = onTransact + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final q4ExternalSyntheticLambda3 onExtraCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2, int i, Boolean bool) {
        int i2 = 2 % 2;
        int i3 = onTransact + 9;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3IAuthTabCallback = AFi1lSDK.onExtraCallback.IAuthTabCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, str, str2, j, j2, i, bool);
        int i5 = IAuthTabCallback_Parcel + 125;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
        return q4externalsyntheticlambda3IAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        final long jLongValue;
        final AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) objArr[0];
        final TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = (TossSecuritiesWebView.onWarmupCompleted) objArr[1];
        final String str = (String) objArr[2];
        final boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        Long l = (Long) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
            aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue();
            throw null;
        }
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (!aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue()) {
            return null;
        }
        final long jLongValue2 = aFi1pSDKAFa1ySDK.onNavigationEvent.invoke().longValue();
        if (l != null) {
            int i3 = IAuthTabCallback_Parcel + 125;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            jLongValue = l.longValue();
        } else {
            jLongValue = jLongValue2;
        }
        aFi1pSDKAFa1ySDK.onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onWarmupCompleted + 107;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallbackWithResult = AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.f$0, onwarmupcompleted, str, jLongValue, jLongValue2, zBooleanValue);
                int i8 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                onWarmupCompleted = i8 % 128;
                int i9 = i8 % 2;
                return q4externalsyntheticlambda3OnExtraCallbackWithResult;
            }
        });
        return null;
    }

    private static final q4ExternalSyntheticLambda3 onWarmupCompleted(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 51;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return AFi1lSDK.onExtraCallback.onWarmupCompleted(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, z);
        }
        AFi1lSDK.onExtraCallback.onWarmupCompleted(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, boolean z, @Nullable Long l) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        if (this.IAuthTabCallback.invoke().booleanValue()) {
            long jLongValue = this.onNavigationEvent.invoke().longValue();
            onNavigationEvent((Function0<q4ExternalSyntheticLambda3>) new WebViewMonitoringTracker$.ExternalSyntheticLambda5(this, onwarmupcompleted, str, l != null ? l.longValue() : jLongValue, jLongValue, z));
            int i4 = onTransact + 89;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
        }
    }

    private static final q4ExternalSyntheticLambda3 onExtraCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 25;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnNavigationEvent = AFi1lSDK.onExtraCallback.onNavigationEvent(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, z);
            int i3 = onTransact + 43;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 27 / 0;
            }
            return q4externalsyntheticlambda3OnNavigationEvent;
        }
        AFi1lSDK.onExtraCallback.onNavigationEvent(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        final long jLongValue;
        final AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = (AFi1pSDKAFa1ySDK) objArr[0];
        final TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted = (TossSecuritiesWebView.onWarmupCompleted) objArr[1];
        final String str = (String) objArr[2];
        final String str2 = (String) objArr[3];
        Long l = (Long) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (!aFi1pSDKAFa1ySDK.IAuthTabCallback.invoke().booleanValue()) {
            return null;
        }
        final long jLongValue2 = aFi1pSDKAFa1ySDK.onNavigationEvent.invoke().longValue();
        if (l != null) {
            int i4 = IAuthTabCallback_Parcel + 55;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                long jLongValue3 = l.longValue();
                int i5 = 47 / 0;
                jLongValue = jLongValue3;
            } else {
                jLongValue = l.longValue();
            }
        } else {
            jLongValue = jLongValue2;
        }
        aFi1pSDKAFa1ySDK.onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i6 = 2 % 2;
                int i7 = onExtraCallback + 97;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallbackWithResult = AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.f$0, onwarmupcompleted, str, jLongValue, jLongValue2, str2);
                int i9 = onWarmupCompleted + 69;
                onExtraCallback = i9 % 128;
                int i10 = i9 % 2;
                return q4externalsyntheticlambda3OnExtraCallbackWithResult;
            }
        });
        return null;
    }

    private static final q4ExternalSyntheticLambda3 IAuthTabCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, String str2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 57;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return AFi1lSDK.onExtraCallback.onExtraCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, str2);
        }
        AFi1lSDK.onExtraCallback.onExtraCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, str2);
        throw null;
    }

    public final void onExtraCallbackWithResult(@NotNull final TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable final String str, @NotNull final String str2, @NotNull final String str3, @Nullable Long l) {
        final long jLongValue;
        int i = 2 % 2;
        int i2 = onTransact + 59;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (this.IAuthTabCallback.invoke().booleanValue()) {
            final long jLongValue2 = this.onNavigationEvent.invoke().longValue();
            if (l != null) {
                int i4 = IAuthTabCallback_Parcel + 103;
                onTransact = i4 % 128;
                if (i4 % 2 != 0) {
                    l.longValue();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                jLongValue = l.longValue();
            } else {
                jLongValue = jLongValue2;
            }
            onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallback = 1;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallback + Imgproc.COLOR_YUV2RGB_YVYU;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.f$0, onwarmupcompleted, str, jLongValue, jLongValue2, str2, str3);
                    }
                    AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(this.f$0, onwarmupcompleted, str, jLongValue, jLongValue2, str2, str3);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
        }
    }

    private static final q4ExternalSyntheticLambda3 onWarmupCompleted(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, String str, long j, long j2, String str2, String str3) {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3IAuthTabCallback = AFi1lSDK.onExtraCallback.IAuthTabCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, aFi1pSDKAFa1ySDK.onExtraCallback(onwarmupcompleted), str, j, j2, str2, str3);
        int i4 = onTransact + 91;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
        }
        return q4externalsyntheticlambda3IAuthTabCallback;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 49;
        onTransact = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallback.invoke().booleanValue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        if (this.IAuthTabCallback.invoke().booleanValue()) {
            int i3 = IAuthTabCallback_Parcel + 101;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            for (final r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw : this.IAuthTabCallbackDefault.onExtraCallback(str)) {
                onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda4
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = 2 % 2;
                        int i6 = onNavigationEvent + 83;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = this.f$0;
                        if (i7 != 0) {
                            return AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(aFi1pSDKAFa1ySDK, r8lambdalzlost8ymkygg6aehcg97m8xisw);
                        }
                        AFi1pSDKAFa1ySDK.onExtraCallbackWithResult(aFi1pSDKAFa1ySDK, r8lambdalzlost8ymkygg6aehcg97m8xisw);
                        throw null;
                    }
                });
            }
            return;
        }
        int i5 = onTransact + 39;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        this.IAuthTabCallbackDefault.onNavigationEvent();
        int i7 = onTransact + 37;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final q4ExternalSyntheticLambda3 onWarmupCompleted(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 47;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = AFi1lSDK.onExtraCallback.onExtraCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, r8lambdalzlost8ymkygg6aehcg97m8xisw);
            int i3 = IAuthTabCallback_Parcel + 75;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return q4externalsyntheticlambda3OnExtraCallback;
        }
        AFi1lSDK.onExtraCallback.onExtraCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, r8lambdalzlost8ymkygg6aehcg97m8xisw);
        throw null;
    }

    private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr2 = IAuthTabCallbackStub;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $10;
            int i5 = i4 + 25;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = i4 + 87;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            for (int i9 = 0; i9 < length; i9++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 26 - (KeyEvent.getMaxKeyCode() >> 16), Color.red(0) + 23139, -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr3[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(asInterface)};
        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
        if (objOnExtraCallback2 == null) {
            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.combineMeasuredStates(0, 0), TextUtils.getOffsetBefore(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 26, (-16754077) - Color.rgb(0, 0, 0), -2137011959, false, "z", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            int i10 = $11 + 5;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i12 = $11 + 55;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 24823), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 74, 8088 - View.getDefaultSize(0, 0), -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), 19488 - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0), 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                        int i14 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[iIntValue];
                        cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i14];
                    } else {
                        obj = null;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i15 = $10 + 111;
                            $11 = i15 % 128;
                            int i16 = i15 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                            int i17 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i18 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i17];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i18];
                        } else {
                            int i19 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i20 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i19];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i20];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                obj2 = obj;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private final void onExtraCallback(String str, String str2, boolean z, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 107;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            q5b q5bVar = this.IAuthTabCallbackDefault;
            AFi1lSDK aFi1lSDK = AFi1lSDK.onExtraCallback;
            q5bVar.onExtraCallback(aFi1lSDK.onNavigationEvent(str, str2), aFi1lSDK.onExtraCallbackWithResult(str), z, j, 3000L).iterator();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        q5b q5bVar2 = this.IAuthTabCallbackDefault;
        AFi1lSDK aFi1lSDK2 = AFi1lSDK.onExtraCallback;
        for (final r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw : q5bVar2.onExtraCallback(aFi1lSDK2.onNavigationEvent(str, str2), aFi1lSDK2.onExtraCallbackWithResult(str), z, j, 3000L)) {
            onNavigationEvent(new Function0() { // from class: im.toss.tosssecurities.webview.monitoring.WebViewMonitoringTracker$$ExternalSyntheticLambda9
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = 2 % 2;
                    int i4 = IAuthTabCallback + 17;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = AFi1pSDKAFa1ySDK.onExtraCallback(this.f$0, r8lambdalzlost8ymkygg6aehcg97m8xisw);
                    int i6 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 != 0) {
                        return q4externalsyntheticlambda3OnExtraCallback;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            });
            int i3 = IAuthTabCallback_Parcel + 71;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private static final q4ExternalSyntheticLambda3 IAuthTabCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, r8lambdalzLoST8ymKYgG6aEHcG97m8xISw r8lambdalzlost8ymkygg6aehcg97m8xisw) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 81;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        q4ExternalSyntheticLambda3 q4externalsyntheticlambda3OnExtraCallback = AFi1lSDK.onExtraCallback.onExtraCallback(aFi1pSDKAFa1ySDK.onWarmupCompleted, r8lambdalzlost8ymkygg6aehcg97m8xisw);
        int i4 = onTransact + 51;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return q4externalsyntheticlambda3OnExtraCallback;
    }

    private final void onNavigationEvent(Function0<q4ExternalSyntheticLambda3> function0) {
        int i = 2 % 2;
        q4ExternalSyntheticLambda8.onWarmupCompleted(this.asBinder, true, function0, new onExtraCallbackWithResult(this));
        int i2 = onTransact + 65;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<q4ExternalSyntheticLambda10, Unit> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;

        onExtraCallbackWithResult(Object obj) {
            super(1, obj, AFi1pSDKAFa1ySDK.class, "logFailure", "logFailure(Lim/toss/securities/libs/performance/tracker/domain/monitoring/MonitoringEventDispatchFailure;)V", 0);
        }

        public final void IAuthTabCallback(q4ExternalSyntheticLambda10 q4externalsyntheticlambda10) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 55;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
                AFi1pSDKAFa1ySDK.IAuthTabCallback((AFi1pSDKAFa1ySDK) this.receiver, q4externalsyntheticlambda10);
            } else {
                Intrinsics.checkNotNullParameter(q4externalsyntheticlambda10, "");
                AFi1pSDKAFa1ySDK.IAuthTabCallback((AFi1pSDKAFa1ySDK) this.receiver, q4externalsyntheticlambda10);
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(q4ExternalSyntheticLambda10 q4externalsyntheticlambda10) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 69;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(q4externalsyntheticlambda10);
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    private final void IAuthTabCallback(q4ExternalSyntheticLambda10 q4externalsyntheticlambda10) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 77;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{6, 4, 3, 1, 0, 6, 13873}, (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 68), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 8, objArr);
        q4ExternalSyntheticLambda1 q4externalsyntheticlambda1IAuthTabCallback = q4ExternalSyntheticLambda0.IAuthTabCallback(q4externalsyntheticlambda10, ((String) objArr[0]).intern());
        q4externalsyntheticlambda1IAuthTabCallback.onWarmupCompleted();
        Object[] array = q4externalsyntheticlambda1IAuthTabCallback.IAuthTabCallback().toArray(new Object[0]);
        Arrays.copyOf(array, array.length);
        int i4 = onTransact + 43;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private final String onExtraCallback(TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {this, onwarmupcompleted.name()};
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = (String) onExtraCallbackWithResult(iOnWarmupCompleted3, objArr, iOnWarmupCompleted, 605234089, -605234083, iOnWarmupCompleted4, iOnWarmupCompleted2);
        int i4 = onTransact + 29;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(jLongValue2 - jLongValue, 0L);
        int i4 = IAuthTabCallback_Parcel + 93;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(jCoerceAtLeast);
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final AFi1pSDKAFa1ySDK onWarmupCompleted(@NotNull Context context) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Response response = Response.onNavigationEvent;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            AFi1nSDK aFi1nSDK = (AFi1nSDK) Response.onExtraCallback(applicationContext, AFi1nSDK.class);
            AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK = new AFi1pSDKAFa1ySDK(aFi1nSDK.ExpandedMenuView(), aFi1nSDK.findGroupIndex(), null, null, null, 28, null);
            int i2 = IAuthTabCallback + 65;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
            }
            return aFi1pSDKAFa1ySDK;
        }
    }

    public static /* synthetic */ q4ExternalSyntheticLambda3 IAuthTabCallback(AFi1pSDKAFa1ySDK aFi1pSDKAFa1ySDK, String str, String str2, long j, long j2) {
        return (q4ExternalSyntheticLambda3) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{aFi1pSDKAFa1ySDK, str, str2, Long.valueOf(j), Long.valueOf(j2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 1060112976, -1060112976, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    private final String onExtraCallbackWithResult(String str) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (String) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, str}, iOnWarmupCompleted, 605234089, -605234083, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    private final long onWarmupCompleted(long j, long j2) {
        return ((Long) onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, Long.valueOf(j), Long.valueOf(j2)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), 240920100, -240920097, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted())).longValue();
    }

    public final void onExtraCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, @NotNull String str2, @Nullable Long l) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, onwarmupcompleted, str, str2, l}, iOnWarmupCompleted, -154486527, 154486531, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public final void onExtraCallback(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable Long l) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, onwarmupcompleted, str, l}, iOnWarmupCompleted, 197011124, -197011122, GriverCommonAbilityProxyImpl.onWarmupCompleted(), iOnWarmupCompleted2);
    }

    public final void onWarmupCompleted(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable Long l, int i, @Nullable Boolean bool, boolean z) {
        onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, onwarmupcompleted, str, l, Integer.valueOf(i), bool, Boolean.valueOf(z)}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -363287833, 363287838, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    public final void onWarmupCompleted(@NotNull TossSecuritiesWebView.onWarmupCompleted onwarmupcompleted, @Nullable String str, boolean z, @Nullable Long l) {
        onExtraCallbackWithResult(GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[]{this, onwarmupcompleted, str, Boolean.valueOf(z), l}, GriverCommonAbilityProxyImpl.onWarmupCompleted(), -136385164, 136385165, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted());
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = new char[]{64965, 64985, 64967, 64982, 64977, 64966, 64986, 64964, 64984};
        asInterface = (char) 51242;
    }
}
