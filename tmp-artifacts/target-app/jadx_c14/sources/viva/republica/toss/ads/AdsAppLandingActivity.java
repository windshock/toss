package viva.republica.toss.ads;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.a;
import im.toss.devtool.domain.ads.applanding.RouteStatus;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CommonModule_closeView;
import o.ConvertFloatArrayToByteArray;
import o.DERIA5String;
import o.DEROctetStringParser;
import o.PlayerErrorCode;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda0;
import o.access8100;
import o.clearFaultAdjacentMetadata;
import o.getStrokeWidth;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.ads.AdsAppLandingActivity$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class AdsAppLandingActivity extends Hilt_AdsAppLandingActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onNavigationEvent Companion;
    private static final Set<String> IAuthTabCallbackStub;
    private static int IAuthTabCallbackStubProxy = 1;
    private static int ICustomTabsCallback = 1;
    private static long access000;
    private static int access100;
    private static int extraCallbackWithResult;
    public static final int onTransact;
    private String IAuthTabCallbackDefault;
    private long IAuthTabCallback_Parcel;

    @Inject
    public Object appLandingSink;
    private String asBinder = "";
    private String asInterface;
    private long getInterfaceDescriptor;

    @Inject
    public RedirectionEventLogger redirectionEventLogger;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~(i7 | i3)) | (~(i | i3));
        int i9 = i | i6;
        int i10 = (~(i6 | (~i3))) | (~(i7 | (~i))) | (~i9);
        int i11 = i + i3 + i4 + (1350191703 * i2) + ((-44904237) * i5);
        int i12 = i11 * i11;
        int i13 = ((i * (-560584373)) - 948043776) + ((-560584373) * i3) + ((-826660534) * i8) + (i9 * 826660534) + (826660534 * i10) + (266076160 * i4) + ((-71041024) * i2) + ((-766246912) * i5) + (1339949056 * i12);
        int i14 = (i * 1657715387) + 2046152777 + (i3 * 1657715387) + (i8 * (-918)) + (i9 * 918) + (i10 * 918) + (i4 * 1657716305) + (i2 * 1507858311) + (i5 * 1845144771) + (i12 * 155058176);
        int i15 = i13 + (i14 * i14 * 417464320);
        if (i15 == 1) {
            return IAuthTabCallback(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        AdsAppLandingActivity adsAppLandingActivity = (AdsAppLandingActivity) objArr[0];
        int i16 = 2 % 2;
        int i17 = IAuthTabCallbackStubProxy + 31;
        access100 = i17 % 128;
        int i18 = i17 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - adsAppLandingActivity.getInterfaceDescriptor;
        int i19 = access100 + 69;
        IAuthTabCallbackStubProxy = i19 % 128;
        int i20 = i19 % 2;
        return Long.valueOf(jElapsedRealtime);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, String str3, DEROctetStringParser dEROctetStringParser, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(str, str2, str3, dEROctetStringParser, setDetectableSize);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, str3, dEROctetStringParser, setDetectableSize);
        int i3 = access100 + 21;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 51 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = access100;
        int i3 = i2 + 23;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 119;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return -1L;
    }

    public final RedirectionEventLogger IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RedirectionEventLogger redirectionEventLogger = this.redirectionEventLogger;
        if (redirectionEventLogger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i3 + 33;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return redirectionEventLogger;
    }

    public final Object onNavigationEvent$6fd6c57d() {
        int i = 2 % 2;
        Object obj = this.appLandingSink;
        if (obj != null) {
            int i2 = access100 + 123;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
            }
            return obj;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = access100 + 115;
        IAuthTabCallbackStubProxy = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.ads.Hilt_AdsAppLandingActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            super.onCreate(bundle);
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            onWarmupCompleted(-1633345305, a.3.onWarmupCompleted(), new Object[]{this}, 1633345307, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted);
            finish();
            return;
        }
        super.onCreate(bundle);
        int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
        int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
        onWarmupCompleted(-1633345305, a.3.onWarmupCompleted(), new Object[]{this}, 1633345307, iOnWarmupCompleted4, a.3.onWarmupCompleted(), iOnWarmupCompleted3);
        finish();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(access000 ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i3 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(access000)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45812 - (ViewConfiguration.getTouchSlop() >> 8)), 84 - Gravity.getAbsoluteGravity(0, 0), 21233 - View.combineMeasuredStates(0, 0), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i3] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 14185), 19 - Gravity.getAbsoluteGravity(0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8807, 64918803, false, "d", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    int i4 = $10 + 57;
                    $11 = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i6 = $10 + 45;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[PHI: r2
      0x00e0: PHI (r2v17 java.lang.String) = (r2v16 java.lang.String), (r2v155 java.lang.String), (r2v157 java.lang.String), (r2v162 java.lang.String) binds: [B:23:0x00a1, B:27:0x00ab, B:31:0x00b5, B:40:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, java.lang.Object, viva.republica.toss.ads.AdsAppLandingActivity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onWarmupCompleted(java.lang.Object[] r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.ads.AdsAppLandingActivity.onWarmupCompleted(java.lang.Object[]):java.lang.Object");
    }

    static /* synthetic */ void onNavigationEvent$79f208eb(AdsAppLandingActivity adsAppLandingActivity, Enum r18, RouteStatus routeStatus, String str, Long l, Uri uri, Uri uri2, Enum r24, Enum r25, String str2, String str3, String str4, Boolean bool, int i, Object obj) throws Throwable {
        String str5;
        String str6;
        String str7;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 71;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 74 / 0;
            }
            str5 = null;
        } else {
            str5 = str;
        }
        Long l2 = (i & 8) != 0 ? null : l;
        Uri uri3 = (i & 16) != 0 ? null : uri;
        Uri uri4 = (i & 32) != 0 ? null : uri2;
        Enum r11 = (i & 64) != 0 ? null : r24;
        Enum r12 = (i & 128) != 0 ? null : r25;
        if ((i & 256) != 0) {
            int i5 = IAuthTabCallbackStubProxy + 69;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            str6 = null;
        } else {
            str6 = str2;
        }
        if ((i & 512) != 0) {
            int i7 = access100 + 121;
            IAuthTabCallbackStubProxy = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            str7 = null;
        } else {
            str7 = str3;
        }
        adsAppLandingActivity.onExtraCallbackWithResult$3485d690(r18, routeStatus, str5, l2, uri3, uri4, r11, r12, str6, str7, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : bool);
    }

    private final void onExtraCallbackWithResult$3485d690(Enum r30, RouteStatus routeStatus, String str, Long l, Uri uri, Uri uri2, Enum r36, Enum r37, String str2, String str3, String str4, Boolean bool) throws Throwable {
        String string;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 37;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent$6fd6c57d();
            SystemClock.elapsedRealtime();
            throw null;
        }
        Object objOnNavigationEvent$6fd6c57d = onNavigationEvent$6fd6c57d();
        String str5 = this.asBinder;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.IAuthTabCallback_Parcel;
        String str6 = this.IAuthTabCallbackDefault;
        if (uri != null) {
            string = uri.toString();
        } else {
            int i3 = access100 + 11;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            string = null;
        }
        try {
            Object[] objArr = {str5, r30, routeStatus, l, Long.valueOf(jElapsedRealtime - j), str6, string, uri2 != null ? uri2.toString() : null, str3, str4, bool, r37, r36, str2, null, null, str, 49152, null};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2090434334);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 10660 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1306100110, false, (String) null, new Class[]{String.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (Color.blue(0) + 20779), 16 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 10745 - ImageFormat.getBitsPerPixel(0)), RouteStatus.class, Long.class, Long.TYPE, String.class, String.class, String.class, String.class, String.class, Boolean.class, (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (57796 - (ViewConfiguration.getEdgeSlop() >> 16)), 19 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getSize(0) + 10727), (Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) (Color.alpha(0) + 34466), 6 - Color.green(0), Color.argb(0, 0, 0, 0) + 10761), String.class, Boolean.class, Long.class, String.class, Integer.TYPE, DefaultConstructorMarker.class});
            }
            Object[] objArr2 = {((Constructor) objOnExtraCallback).newInstance(objArr)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-812540146);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 2548), 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 10683, -19832418, false, "onWarmupCompleted", new Class[]{(Class) BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted((char) View.MeasureSpec.getSize(0), 22 - ImageFormat.getBitsPerPixel(0), 10660 - View.combineMeasuredStates(0, 0))});
            }
            ((Method) objOnExtraCallback2).invoke(objOnNavigationEvent$6fd6c57d, objArr2);
            int i5 = access100 + 117;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private final void updateVisuals() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            this.getInterfaceDescriptor = SystemClock.elapsedRealtime();
        } else {
            this.getInterfaceDescriptor = SystemClock.elapsedRealtime();
            int i3 = 94 / 0;
        }
    }

    private final boolean onNavigationEvent(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        if (DERIA5String.onExtraCallback(uri)) {
            String strIAuthTabCallback = IAuthTabCallback(uri);
            if (strIAuthTabCallback == null) {
                return false;
            }
            this.asInterface = strIAuthTabCallback;
            return onWarmupCompleted(uri, strIAuthTabCallback);
        }
        int i4 = IAuthTabCallbackStubProxy;
        int i5 = i4 + 57;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 103;
        access100 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    static /* synthetic */ boolean onExtraCallback(AdsAppLandingActivity adsAppLandingActivity, Uri uri, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = access100;
        int i4 = i3 + 37;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 117;
            IAuthTabCallbackStubProxy = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        return adsAppLandingActivity.onWarmupCompleted(uri, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onWarmupCompleted(Uri uri, String str) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (str != null) {
                int i2 = IAuthTabCallbackStubProxy + 81;
                access100 = i2 % 128;
                if (i2 % 2 != 0) {
                    intent.setPackage(str);
                    throw null;
                }
                intent.setPackage(str);
            }
            intent.addFlags(268435456);
            startActivity(intent);
            obj = Result.constructor-impl(Boolean.TRUE);
            int i3 = IAuthTabCallbackStubProxy + 55;
            access100 = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            obj = bool;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = access100 + 75;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private final boolean onWarmupCompleted(Uri uri, boolean z, boolean z2) throws Throwable {
        boolean z3;
        RouteStatus routeStatus;
        String str;
        Long lValueOf;
        Uri uri2;
        Uri uri3;
        Enum r7;
        Enum r8;
        String str2;
        String str3;
        String str4;
        Boolean bool;
        int i;
        Object obj;
        AdsAppLandingActivity adsAppLandingActivity;
        Enum r1;
        int i2 = 2 % 2;
        if (z) {
            int i3 = IAuthTabCallbackStubProxy + 55;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1432178961);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (20779 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, MotionEvent.axisFromString("") + 10747, 1679667073, false, "HIDDEN_LAB", (Class[]) null);
            }
            onNavigationEvent$79f208eb(this, (Enum) ((Field) objOnExtraCallback).get(null), RouteStatus.PASS, null, null, null, null, null, null, null, null, null, null, 4092, null);
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1894963480);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (20778 - Process.getGidForName("")), 15 - Color.red(0), 10746 - KeyEvent.normalizeMetaState(0), -1102194568, false, "VISIBLE_FALLBACK", (Class[]) null);
            }
            Enum r19 = (Enum) ((Field) objOnExtraCallback2).get(null);
            onNavigationEvent$79f208eb(this, r19, RouteStatus.RUNNING, "visible web", null, uri, null, null, null, null, null, null, null, 4072, null);
            boolean zOnExtraCallback = onExtraCallback(this, uri, null, 2, null);
            if (!zOnExtraCallback) {
                RouteStatus routeStatus2 = RouteStatus.FAIL;
                int iOnWarmupCompleted = a.3.onWarmupCompleted();
                onNavigationEvent$79f208eb(this, r19, routeStatus2, null, Long.valueOf(((Long) onWarmupCompleted(-1377227389, a.3.onWarmupCompleted(), new Object[]{this}, 1377227389, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted)).longValue()), null, null, null, null, null, null, null, null, 4084, null);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1374093875);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (20779 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 15 - TextUtils.getOffsetBefore("", 0), 10746 - View.MeasureSpec.getSize(0), -1621621923, false, "TARGET_OPEN", (Class[]) null);
                }
                onNavigationEvent$79f208eb(this, (Enum) ((Field) objOnExtraCallback3).get(null), routeStatus2, null, null, null, null, null, null, null, null, null, null, 4092, null);
                return zOnExtraCallback;
            }
            RouteStatus routeStatus3 = RouteStatus.SUCCESS;
            int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
            onNavigationEvent$79f208eb(this, r19, routeStatus3, null, Long.valueOf(((Long) onWarmupCompleted(-1377227389, a.3.onWarmupCompleted(), new Object[]{this}, 1377227389, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted2)).longValue()), null, null, null, null, null, null, null, null, 4084, null);
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1374093875);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 20779), KeyEvent.keyCodeFromString("") + 15, Drawable.resolveOpacity(0, 0) + 10746, -1621621923, false, "TARGET_OPEN", (Class[]) null);
            }
            Enum r12 = (Enum) ((Field) objOnExtraCallback4).get(null);
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1342669449);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (34467 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 10761, -1632074777, false, "VISIBLE_WEB", (Class[]) null);
            }
            onNavigationEvent$79f208eb(this, r12, routeStatus3, "intent accepted", null, null, uri, (Enum) ((Field) objOnExtraCallback5).get(null), null, null, null, null, null, 3992, null);
            return zOnExtraCallback;
        }
        Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1432178961);
        if (objOnExtraCallback6 == null) {
            objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (20779 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 15 - Gravity.getAbsoluteGravity(0, 0), Process.getGidForName("") + 10747, 1679667073, false, "HIDDEN_LAB", (Class[]) null);
        }
        Enum r18 = (Enum) ((Field) objOnExtraCallback6).get(null);
        RouteStatus routeStatus4 = RouteStatus.RUNNING;
        Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1948609307);
        if (objOnExtraCallback7 == null) {
            objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 57795), 19 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 10727, -1164285323, false, "HIDDEN", (Class[]) null);
        }
        onNavigationEvent$79f208eb(this, r18, routeStatus4, "activity handoff", null, null, null, null, (Enum) ((Field) objOnExtraCallback7).get(null), null, null, null, null, 3960, null);
        boolean zOnNavigationEvent = onNavigationEvent(uri, z2);
        if (zOnNavigationEvent) {
            return zOnNavigationEvent;
        }
        int i5 = access100 + 15;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 == 0) {
            routeStatus = RouteStatus.FAIL;
            str = null;
            int iOnWarmupCompleted3 = a.3.onWarmupCompleted();
            lValueOf = Long.valueOf(((Long) onWarmupCompleted(-1377227389, a.3.onWarmupCompleted(), new Object[]{this}, 1377227389, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted3)).longValue());
            uri2 = null;
            uri3 = null;
            r7 = null;
            r8 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            bool = null;
            i = 12354;
            adsAppLandingActivity = this;
            r1 = r18;
            z3 = zOnNavigationEvent;
            obj = null;
        } else {
            z3 = zOnNavigationEvent;
            routeStatus = RouteStatus.FAIL;
            str = null;
            int iOnWarmupCompleted4 = a.3.onWarmupCompleted();
            lValueOf = Long.valueOf(((Long) onWarmupCompleted(-1377227389, a.3.onWarmupCompleted(), new Object[]{this}, 1377227389, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted4)).longValue());
            uri2 = null;
            uri3 = null;
            r7 = null;
            r8 = null;
            str2 = null;
            str3 = null;
            str4 = null;
            bool = null;
            i = 4084;
            obj = null;
            adsAppLandingActivity = this;
            r1 = r18;
        }
        onNavigationEvent$79f208eb(adsAppLandingActivity, r1, routeStatus, str, lValueOf, uri2, uri3, r7, r8, str2, str3, str4, bool, i, obj);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean onNavigationEvent(Uri uri, boolean z) {
        Object obj;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 113;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            startActivity(AdsHiddenLabActivity.Companion.onWarmupCompleted(this, uri, z, this.asBinder, this.IAuthTabCallback_Parcel));
            obj = Result.constructor-impl(Boolean.TRUE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.onExtraCallback(obj)) {
            obj = bool;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i4 = IAuthTabCallbackStubProxy + 25;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return zBooleanValue;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String IAuthTabCallback(Uri uri) {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = getStrokeWidth.onExtraCallback.IAuthTabCallback(this, uri);
        int i4 = IAuthTabCallbackStubProxy + 15;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    private final Uri onExtraCallbackWithResult(String str) {
        Object obj;
        int i = 2 % 2;
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Uri.parse(str));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            int i4 = IAuthTabCallbackStubProxy + 53;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            obj = null;
        }
        Uri uri = (Uri) obj;
        int i6 = access100 + 15;
        IAuthTabCallbackStubProxy = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 76 / 0;
        }
        return uri;
    }

    private static final Unit onExtraCallbackWithResult(String str, String str2, String str3, DEROctetStringParser dEROctetStringParser, SetDetectableSize setDetectableSize) throws Throwable {
        String str4;
        int i = 2 % 2;
        int i2 = access100 + 111;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{53203, 4239, 23773, 53153, 36389, 48290, 1067, 35480, 32385, 19861, 21768, 15279}, ViewConfiguration.getScrollDefaultDelay() >> 16, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        setDetectableSize.onExtraCallback("service_referrer", str2);
        Object[] objArr2 = new Object[1];
        a(new char[]{18243, 63824, 41981, 18230, 32796, 21866, 64257}, (-16777216) - Color.rgb(0, 0, 0), objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str3);
        setDetectableSize.onExtraCallback("ul_status", dEROctetStringParser.onWarmupCompleted());
        setDetectableSize.onExtraCallback("scheme_status", dEROctetStringParser.onExtraCallbackWithResult());
        if (!(!dEROctetStringParser.IAuthTabCallback())) {
            int i4 = IAuthTabCallbackStubProxy + 75;
            access100 = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str4 = "Y";
        } else {
            int i5 = IAuthTabCallbackStubProxy + 55;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            str4 = "N";
        }
        setDetectableSize.onExtraCallback("fallback_yn", str4);
        return Unit.INSTANCE;
    }

    private final void onExtraCallback(String str, String str2, String str3, DEROctetStringParser dEROctetStringParser) throws Throwable {
        int i = 2 % 2;
        ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, 5185358L, false, (String) null, (Map) null, new AdsAppLandingActivity$.ExternalSyntheticLambda0(str, str2, str3, dEROctetStringParser), 14, (Object) null);
        onExtraCallback(str3, dEROctetStringParser);
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1296288596);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 20779), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, 10745 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -2080585156, false, "ROUTE_RESULT", (Class[]) null);
        }
        onNavigationEvent$79f208eb(this, (Enum) ((Field) objOnExtraCallback).get(null), DERIA5String.onNavigationEvent(dEROctetStringParser), null, null, null, null, null, null, null, dEROctetStringParser.onWarmupCompleted(), dEROctetStringParser.onExtraCallbackWithResult(), Boolean.valueOf(dEROctetStringParser.IAuthTabCallback()), 508, null);
        int i2 = access100 + 109;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(String str, DEROctetStringParser dEROctetStringParser) throws Throwable {
        String str2;
        int i = 2 % 2;
        Map mapOnExtraCallback = access8100.onExtraCallback();
        long jLongValue = 0;
        Object[] objArr = new Object[1];
        a(new char[]{18243, 63824, 41981, 18230, 32796, 21866, 64257}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), str);
        mapOnExtraCallback.put("os_name", "ANDROID");
        mapOnExtraCallback.put("ul_status", dEROctetStringParser.onWarmupCompleted());
        mapOnExtraCallback.put("scheme_status", dEROctetStringParser.onExtraCallbackWithResult());
        if (!(!dEROctetStringParser.IAuthTabCallback())) {
            int i2 = access100 + 51;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            str2 = "Y";
        } else {
            str2 = "N";
        }
        mapOnExtraCallback.put("fallback_yn", str2);
        String str3 = CommonModule_closeView.onWarmupCompleted.getInterfaceDescriptor().format(new Date());
        Intrinsics.checkNotNullExpressionValue(str3, "");
        mapOnExtraCallback.put("eventTs", str3);
        Uri data = getIntent().getData();
        if (data != null) {
            int iOnWarmupCompleted = a.3.onWarmupCompleted();
            onWarmupCompleted(-1876169339, a.3.onWarmupCompleted(), new Object[]{this, mapOnExtraCallback, data}, 1876169340, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), iOnWarmupCompleted);
        }
        Map<String, String> mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(mapOnExtraCallback);
        RedirectionEventLogger redirectionEventLoggerIAuthTabCallback = IAuthTabCallback();
        Long longOrNull = StringsKt.toLongOrNull(PlayerErrorCode.onMinimized());
        if (longOrNull != null) {
            int i4 = access100 + 51;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 == 0) {
                longOrNull.longValue();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            jLongValue = longOrNull.longValue();
        } else {
            int i5 = access100 + 87;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        redirectionEventLoggerIAuthTabCallback.onWarmupCompleted(jLongValue, mapOnExtraCallbackWithResult);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Object obj;
        Iterator it;
        Object obj2;
        Map map = (Map) objArr[1];
        Uri uri = (Uri) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 11;
        access100 = i2 % 128;
        Object obj3 = null;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (i2 % 2 != 0) {
            Result.Companion companion2 = Result.Companion;
            Result.constructor-impl(uri.getQueryParameterNames());
            throw null;
        }
        Result.Companion companion3 = Result.Companion;
        obj = Result.constructor-impl(uri.getQueryParameterNames());
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        Set set = (Set) obj;
        if (set != null) {
            int i3 = IAuthTabCallbackStubProxy + 113;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                it = set.iterator();
                int i4 = 73 / 0;
            } else {
                it = set.iterator();
            }
            while (it.hasNext()) {
                int i5 = access100 + 63;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                String str = (String) it.next();
                if (!IAuthTabCallbackStub.contains(str)) {
                    int i7 = access100 + 19;
                    IAuthTabCallbackStubProxy = i7 % 128;
                    int i8 = i7 % 2;
                    if (map.containsKey(str)) {
                        continue;
                    } else {
                        int i9 = access100 + 105;
                        IAuthTabCallbackStubProxy = i9 % 128;
                        int i10 = i9 % 2;
                        try {
                            Result.Companion companion4 = Result.Companion;
                            obj2 = Result.constructor-impl(uri.getQueryParameter(str));
                        } catch (Throwable th2) {
                            Result.Companion companion5 = Result.Companion;
                            obj2 = Result.constructor-impl(ResultKt.createFailure(th2));
                        }
                        if (Result.onExtraCallback(obj2)) {
                            obj2 = null;
                        }
                        String str2 = (String) obj2;
                        if (str2 != null) {
                            int i11 = IAuthTabCallbackStubProxy + 17;
                            access100 = i11 % 128;
                            int i12 = i11 % 2;
                            Intrinsics.checkNotNull(str);
                            map.put(str, str2);
                            if (i12 != 0) {
                                obj3.hashCode();
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        setEngagementSignalsCallback();
        Companion = new onNavigationEvent(null);
        onTransact = 8;
        Object[] objArr = new Object[1];
        a(new char[]{18243, 63824, 41981, 18230, 32796, 21866, 64257}, ViewConfiguration.getScrollBarSize() >> 8, objArr);
        IAuthTabCallbackStub = clearFaultAdjacentMetadata.onExtraCallback(new String[]{((String) objArr[0]).intern(), "os_name", "ul_status", "scheme_status", "fallback_yn"});
        int i = extraCallbackWithResult + 121;
        ICustomTabsCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 44 / 0;
        }
    }

    private final void onNavigationEvent(Map<String, String> map, Uri uri) {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onWarmupCompleted(-1876169339, a.3.onWarmupCompleted(), new Object[]{this, map, uri}, 1876169340, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final void ICustomTabsServiceStub() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        onWarmupCompleted(-1633345305, a.3.onWarmupCompleted(), new Object[]{this}, 1633345307, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted);
    }

    private final long ICustomTabsServiceDefault() {
        int iOnWarmupCompleted = a.3.onWarmupCompleted();
        int iOnWarmupCompleted2 = a.3.onWarmupCompleted();
        return ((Long) onWarmupCompleted(-1377227389, a.3.onWarmupCompleted(), new Object[]{this}, 1377227389, iOnWarmupCompleted2, a.3.onWarmupCompleted(), iOnWarmupCompleted)).longValue();
    }

    @Override // viva.republica.toss.ads.Hilt_AdsAppLandingActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = IAuthTabCallbackStubProxy + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // viva.republica.toss.ads.Hilt_AdsAppLandingActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = access100 + 59;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.ads.Hilt_AdsAppLandingActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = access100 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onPause();
        if (i3 == 0) {
            throw null;
        }
        int i4 = access100 + 117;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.ads.Hilt_AdsAppLandingActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = access100 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallbackStubProxy + 1;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void setEngagementSignalsCallback() {
        access000 = 8548700204222699332L;
    }
}
