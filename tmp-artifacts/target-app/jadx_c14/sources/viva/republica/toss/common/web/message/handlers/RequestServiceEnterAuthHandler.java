package viva.republica.toss.common.web.message.handlers;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import im.toss.base.BaseActivity;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ALCFaceBox;
import o.ALCFaceQuality;
import o.ALCFaceValidation;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CatalystInstanceImplIA;
import o.ConvertFloatArrayToByteArray;
import o.IconRoundCornerProgressBarSavedState;
import o.NetConverter3;
import o.RememberLottieCompositionKtlottieComposition1;
import o.TrackGroupExternalSyntheticLambda0;
import o.TypeUtils1;
import o.TypeUtils7;
import o.UST_CERT_GetSubjectAltName_RealName;
import o.UST_CERT_SetCertVerifyEnv;
import o.UTF8Decoder;
import o.deserializeUriNullableCollection;
import o.getSegmentCollection;
import o.isJSONTypeIgnore;
import o.onOutOfMemory;
import o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ;
import o.setBaseDeeplink;
import o.setOnOutOfMemeryErrorCallback;
import o.setText;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler$;
import viva.republica.toss.core.AppStateManager;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class RequestServiceEnterAuthHandler implements ALCFaceQuality {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static int IAuthTabCallback = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static int asBinder = 1;
    private static char[] onExtraCallback;
    private static long onExtraCallbackWithResult;
    public static final String onNavigationEvent;
    private static int onTransact;
    public static final String onWarmupCompleted;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{37842, 23306, 591, 51640, 45305, 32728, 9998, 61018, 54717, 40085, 19392, 13100, 64119, 41286, 26807, 22511, 7972, 50810, 36188, 29884, 9209, 60207, 53762}, 51407 - TextUtils.indexOf("", "", 0, 0), objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{37842, 18556, 9379, 254, 64801, 55630, 46466, 37347, 19975, 10818, 1787, 58175, 57165, 48048, 38858, 19487, 10325, 1159, 57558, 56690, 47543, 38380, 29234, 11862, 2711, 59103}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 56248, objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        Companion = new Companion(null);
        int i = onTransact + 69;
        IAuthTabCallbackDefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
    }

    public static /* synthetic */ String IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strAsBinder = asBinder(function1, obj);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return strAsBinder;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            int iOnExtraCallback3 = C40Encoder.onExtraCallback();
            return (Unit) onExtraCallback(-69780587, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{setonoutofmemeryerrorcallback, str}, 69780591, iOnExtraCallback2);
        }
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        int iOnExtraCallback5 = C40Encoder.onExtraCallback();
        int iOnExtraCallback6 = C40Encoder.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) throws Throwable {
        String strIntern;
        int i7;
        int i8 = ~i5;
        int i9 = ~i;
        int i10 = (~((~i3) | i9)) | i8;
        int i11 = i5 | i9;
        int i12 = (~(i3 | i8 | i9)) | (~(i | i5));
        int i13 = i + i5 + i6 + (2049387148 * i4) + ((-609071723) * i2);
        int i14 = i13 * i13;
        int i15 = ((1483459036 * i) - 1284505600) + (2005429323 * i5) + (i10 * 1605645861) + (1083675574 * i11) + (1605645861 * i12) + ((-1205862400) * i6) + ((-243269632) * i4) + ((-895483904) * i2) + ((-1334837248) * i14);
        int i16 = ((i * 335895516) - 1139737737) + (i5 * 335898315) + (i10 * 933) + (i11 * (-1866)) + (i12 * 933) + (i6 * 335896449) + (i4 * (-616405876)) + (i2 * 126640917) + (i14 * 2020605952);
        int i17 = i15 + (i16 * i16 * (-544210944));
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i17 != 4) {
            getSegmentCollection.IAuthTabCallback iAuthTabCallback = (getSegmentCollection.IAuthTabCallback) objArr[0];
            int i18 = 2 % 2;
            Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
            UST_CERT_SetCertVerifyEnv uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult = UST_CERT_GetSubjectAltName_RealName.onExtraCallbackWithResult(iAuthTabCallback);
            if (uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult == null || (strIntern = uST_CERT_SetCertVerifyEnvOnExtraCallbackWithResult.name()) == null) {
                Object[] objArr2 = new Object[1];
                a(new char[]{37845, 27385, 24997, 30827, 30483, 19908, 17540}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 63799, objArr2);
                strIntern = ((String) objArr2[0]).intern();
                i7 = asBinder + 3;
            } else {
                i7 = asBinder + 29;
            }
            IAuthTabCallback = i7 % 128;
            int i19 = i7 % 2;
            return strIntern;
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        String str = (String) objArr[1];
        int i20 = 2 % 2;
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0}, new int[]{8, 33, 46, 0}, objArr3);
        if (Intrinsics.areEqual(str, ((String) objArr3[0]).intern())) {
            IAuthTabCallback(setonoutofmemeryerrorcallback);
            int i21 = asBinder + 111;
            IAuthTabCallback = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 4 % 5;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i23 = asBinder + 27;
        IAuthTabCallback = i23 % 128;
        int i24 = i23 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setonoutofmemeryerrorcallback, isjsontypeignore);
        int i4 = asBinder + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(getSegmentCollection.IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        String str = (String) onExtraCallback(46551160, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{iAuthTabCallback}, -46551160, iOnExtraCallback2);
        int i4 = asBinder + 83;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        asInterface(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = IAuthTabCallback + 97;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 17;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            int iOnExtraCallback3 = C40Encoder.onExtraCallback();
            return (Unit) onExtraCallback(1561003276, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{str, str2, typeUtils7}, -1561003273, iOnExtraCallback2);
        }
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        int iOnExtraCallback5 = C40Encoder.onExtraCallback();
        int iOnExtraCallback6 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(1561003276, C40Encoder.onExtraCallback(), iOnExtraCallback4, iOnExtraCallback6, new Object[]{str, str2, typeUtils7}, -1561003273, iOnExtraCallback5);
        int i3 = 67 / 0;
        return unit;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str);
        int i4 = asBinder + 97;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 80 / 0;
        }
        return strOnNavigationEvent;
    }

    private static final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i4 = asBinder + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return str;
    }

    public static /* synthetic */ String onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = IAuthTabCallbackDefault(function1, obj);
        int i4 = IAuthTabCallback + 67;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return strIAuthTabCallbackDefault;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(setonoutofmemeryerrorcallback, th);
        int i4 = IAuthTabCallback + 37;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, long j, boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, j, z, setonoutofmemeryerrorcallback, str, str2);
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        int i4 = asBinder + 71;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 16 / 0;
        }
    }

    public static /* synthetic */ boolean onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallback = onExtraCallback(z);
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return zOnExtraCallback;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallback + 107;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asBinder + 1;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback + 13;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallback + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i4 = asBinder + 31;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return aLCFaceValidationOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asBinder + 17;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallback + 39;
        asBinder = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean onExtraCallback(boolean r3) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.asBinder
            int r1 = r1 + 93
            int r2 = r1 % 128
            viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.IAuthTabCallback = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 10
            int r1 = r1 / r2
            if (r3 != 0) goto L2e
            goto L17
        L15:
            if (r3 != 0) goto L2e
        L17:
            im.toss.state.spec.SessionState$onExtraCallbackWithResult r3 = im.toss.state.spec.SessionState.Companion
            im.toss.state.spec.SessionState r3 = r3.onExtraCallback()
            boolean r3 = r3.onTransact()
            if (r3 == 0) goto L2e
            int r3 = viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.asBinder
            int r3 = r3 + 89
            int r1 = r3 % 128
            viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.IAuthTabCallback = r1
            int r3 = r3 % r0
            r3 = 1
            return r3
        L2e:
            int r3 = viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.asBinder
            int r3 = r3 + 27
            int r1 = r3 % 128
            viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.IAuthTabCallback = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L3a
            return r2
        L3a:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.common.web.message.handlers.RequestServiceEnterAuthHandler.onExtraCallback(boolean):boolean");
    }

    private static final void onExtraCallbackWithResult(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, new JsonPrimitive(Boolean.TRUE));
        int i2 = asBinder + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        Object obj;
        int i = 2 % 2;
        int i2 = asBinder + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 0, 1, 1, 0, 1, 1, 1}, new int[]{0, 8, 76, 0}, objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{1, 0, 1, 1, 0, 1, 1, 1}, new int[]{0, 8, 76, 0}, objArr2);
            obj = objArr2[0];
        } else {
            Object[] objArr3 = new Object[1];
            b(false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1}, new int[]{0, 8, 76, 0}, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b(false, new byte[]{1, 0, 1, 1, 0, 1, 1, 1}, new int[]{0, 8, 76, 0}, objArr4);
            obj = objArr4[0];
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) obj).intern(), (Map) null, 4, (Object) null);
    }

    private static final void IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        String strIntern;
        String strIntern2;
        Map map;
        int i;
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new char[]{37862, 53422, 5495, 23041, 40665, 50031}, (ExpandableListView.getPackedPositionForChild(0, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 1L ? 0 : -1)) + 19711, objArr);
            strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new char[]{37862, 53422, 5495, 23041, 40665, 50031}, 22358 >>> (Process.myTid() << 79), objArr2);
            strIntern2 = ((String) objArr2[0]).intern();
            map = null;
            i = 2;
        } else {
            Object[] objArr3 = new Object[1];
            a(new char[]{37862, 53422, 5495, 23041, 40665, 50031}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 17232, objArr3);
            strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new char[]{37862, 53422, 5495, 23041, 40665, 50031}, (Process.myTid() >> 22) + 17231, objArr4);
            strIntern2 = ((String) objArr4[0]).intern();
            map = null;
            i = 4;
        }
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, strIntern2, map, i, (Object) null);
        int i4 = asBinder + 61;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.resolveSizeAndState(0, 0, 0), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6384 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i4 = $11 + 95;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.green(0), 58 - TextUtils.lastIndexOf("", '0', 0, 0), KeyEvent.getDeadChar(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            int i6 = $10 + 57;
            $11 = i6 % 128;
            int i7 = i6 % 2;
        }
        String str = new String(cArr2);
        int i8 = $10 + 29;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static final String IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i4 = asBinder + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (String) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        String str = (String) function1.invoke(obj);
        int i3 = 66 / 0;
        return str;
    }

    private static final void asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 65;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        TypeUtils7 typeUtils7 = (TypeUtils7) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        typeUtils7.onNavigationEvent(str);
        typeUtils7.IAuthTabCallback(str2);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 103;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return unit;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 60 / 0;
        }
    }

    private static final Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 75;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 23;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted(setonoutofmemeryerrorcallback);
            return Unit.INSTANCE;
        }
        onWarmupCompleted(setonoutofmemeryerrorcallback);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, long j, boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str, String str2) throws Throwable {
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition1;
        int i = 2 % 2;
        BaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        RememberLottieCompositionKtlottieComposition1 rememberLottieCompositionKtlottieComposition12 = null;
        BaseActivity baseActivity = activity instanceof BaseActivity ? activity : null;
        if (baseActivity == null) {
            int i2 = asBinder + 59;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted(setonoutofmemeryerrorcallback);
            return;
        }
        UTF8Decoder uTF8Decoder = UTF8Decoder.SERVICE_ENTER;
        String screenName = baseActivity.getScreenName();
        Object[] objArr = new Object[1];
        b(true, new byte[]{1, 1, 0, 1}, new int[]{41, 4, 0, 1}, objArr);
        if (Intrinsics.areEqual(screenName, ((String) objArr[0]).intern())) {
            uTF8Decoder = UTF8Decoder.CARD_FIND_OWNED;
        }
        UTF8Decoder uTF8Decoder2 = uTF8Decoder;
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq instanceof RememberLottieCompositionKtlottieComposition1) {
            rememberLottieCompositionKtlottieComposition1 = (RememberLottieCompositionKtlottieComposition1) r8lambdakrhaimf1bm5cgjbilhp45vln_xq;
        } else {
            FragmentActivity activity2 = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity2 instanceof RememberLottieCompositionKtlottieComposition1) {
                int i4 = asBinder + 115;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                rememberLottieCompositionKtlottieComposition12 = (RememberLottieCompositionKtlottieComposition1) activity2;
            }
            rememberLottieCompositionKtlottieComposition1 = rememberLottieCompositionKtlottieComposition12;
        }
        if (rememberLottieCompositionKtlottieComposition1 != null) {
            deserializeUriNullableCollection deserializeurinullablecollectionOnExtraCallbackWithResult = shortValue.IAuthTabCallback(shortValue.Companion, rememberLottieCompositionKtlottieComposition1, uTF8Decoder2, j, false, z, false, false, (shortValue.onNavigationEvent) null, false, (Function0) null, false, (TypeUtils1) null, false, (String) null, new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda8(str, str2), 16360, (Object) null).onExtraCallbackWithResult(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda10(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda9(setonoutofmemeryerrorcallback)), new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda12(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda11(setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnExtraCallbackWithResult, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnExtraCallbackWithResult, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
            int i6 = IAuthTabCallback + 93;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 96 / 0;
                return;
            }
            return;
        }
        int i8 = asBinder + 47;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a(new char[]{37874, 13974, 55671, 31788, 1673, 43340, 19494, 5814, 47453, 23609, 59112, 35160, 11303, 63218, 39279, 15379, 50916, 26950, 3076, 54984, 31145, 7195, 42730, 18845, 60425, 46805, 22954, 64525, 34513, 10677}, TextUtils.indexOf((CharSequence) "", '0', 0) + 42324, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(false, new byte[]{0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1}, new int[]{45, 16, 0, 13}, objArr3);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), (Throwable) null, (Map) null, 12, (Object) null);
        IAuthTabCallback(setonoutofmemeryerrorcallback);
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        b(true, new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 0}, new int[]{61, 9, 0, 4}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a(new char[]{37844, 23134, 250, 53001, 46489}, TextUtils.getOffsetAfter("", 0) + 51607, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        Object[] objArr3 = new Object[1];
        a(new char[]{37825, 54467, 7625, 18156, 36837, 61592, 14779, 25276, 43948, 60495, 21843, 40555, 51040, 2058, 28945, 47648, 58148, 9274}, 18190 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        Object[] objArr4 = {settext, ((String) objArr3[0]).intern(), false};
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr4)).booleanValue();
        Object[] objArr5 = new Object[1];
        b(false, new byte[]{0, 1, 0, 1, 1, 1, 1, 0}, new int[]{70, 8, 0, 5}, objArr5);
        Object[] objArr6 = {settext, ((String) objArr5[0]).intern(), false};
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, objArr6)).booleanValue();
        RequestServiceEnterAuthHandler$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda0(zBooleanValue);
        Object[] objArr7 = new Object[1];
        a(new char[]{37830, 27762, 27776, 27963, 27993, 28047, 28163, 28245}, View.MeasureSpec.getSize(0) + 65447, objArr7);
        Object[] objArr8 = {settext, ((String) objArr7[0]).intern(), 0L};
        long jLongValue = ((Long) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -616100104, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 616100108, objArr8)).longValue();
        deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = AppStateManager.onExtraCallbackWithResult.onActivityLayout().IAuthTabCallback(true).onExtraCallback(getSegmentCollection.IAuthTabCallback.class).onWarmupCompleted(NetConverter3.onExtraCallback()).onNavigationEvent(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda2(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda1())).onExtraCallback(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda4(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda3())).IAuthTabCallback(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda6(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda5(setonoutofmemeryerrorcallback)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionIAuthTabCallback, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionIAuthTabCallback, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        Object obj = null;
        if (((Boolean) externalSyntheticLambda0.invoke()).booleanValue()) {
            int i2 = IAuthTabCallback + 51;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
                return;
            } else {
                onExtraCallbackWithResult(setonoutofmemeryerrorcallback);
                obj.hashCode();
                throw null;
            }
        }
        if (!setBaseDeeplink.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq)) {
            int i3 = asBinder + 61;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted(setonoutofmemeryerrorcallback);
            int i5 = asBinder + 99;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        if (CatalystInstanceImplIA.onNavigationEvent.IAuthTabCallback() != null) {
            onWarmupCompleted(setonoutofmemeryerrorcallback);
            return;
        }
        int i6 = asBinder + 17;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 != 0) {
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getView();
            obj.hashCode();
            throw null;
        }
        View view = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getView();
        if (view != null) {
            view.post(new RequestServiceEnterAuthHandler$.ExternalSyntheticLambda7(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jLongValue, zBooleanValue2, setonoutofmemeryerrorcallback, strOnNavigationEvent2, strOnNavigationEvent));
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = onExtraCallback;
        float f = 0.0f;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 35283), 35 - (ViewConfiguration.getWindowTouchSlop() >> 8), 14239 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    f = 0.0f;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64, 16719 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.keyCodeFromString(""), 30 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 17657 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getOffsetAfter("", 0) + 70, KeyEvent.getDeadChar(0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i12, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i12);
        }
        if (z) {
            int i13 = $11 + 3;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr = new char[i4];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i14 = $10 + 89;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    cArr[i15] = cArr4[0];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent % 1;
                } else {
                    cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                int i17 = $10 + 33;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr4);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (String) onExtraCallback(1243651079, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{str}, -1243651077, iOnExtraCallback2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, isJSONTypeIgnore isjsontypeignore) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallback(-1532507765, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{setonoutofmemeryerrorcallback, isjsontypeignore}, 1532507766, iOnExtraCallback2);
    }

    private static final String onWarmupCompleted(getSegmentCollection.IAuthTabCallback iAuthTabCallback) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (String) onExtraCallback(46551160, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{iAuthTabCallback}, -46551160, iOnExtraCallback2);
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, String str) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallback(-69780587, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{setonoutofmemeryerrorcallback, str}, 69780591, iOnExtraCallback2);
    }

    private static final Unit IAuthTabCallback(String str, String str2, TypeUtils7 typeUtils7) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        return (Unit) onExtraCallback(1561003276, C40Encoder.onExtraCallback(), iOnExtraCallback, iOnExtraCallback3, new Object[]{str, str2, typeUtils7}, -1561003273, iOnExtraCallback2);
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = -4890540546571037033L;
        onExtraCallback = new char[]{27145, 27328, 27357, 27354, 27358, 27354, 27354, 27358, 27151, 27342, 27186, 27193, 27188, 27340, 27190, 27184, 27185, 27191, 27184, 27343, 27341, 27343, 27190, 27192, 27339, 27343, 27190, 27186, 27184, 27340, 27335, 27332, 27189, 27184, 27185, 27196, 27192, 27195, 27193, 27189, 27195, 27263, 27181, 27173, 27175, 27258, 27153, 27153, 27177, 27168, 27141, 27146, 27168, 27143, 27145, 27199, 27198, 27170, 27176, 27173, 27194, 27253, 27194, 27173, 27170, 27173, 27160, 27161, 27178, 27176, 27256, 27154, 27152, 27175, 27178, 27178, 27170, 27173};
    }
}
