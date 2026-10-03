package o;

import android.content.Intent;
import android.graphics.Color;
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
import im.toss.core.webkit.WebViewContentOwner;
import im.toss.features.payment.library.web.TossPayWebContentOwner;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.rn.spec.base.ReactNativeContentOwner;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.SessionTrackerb;
import o.UST_CERT_GetCertPolicy;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.shared.CloseHandler$;
import viva.republica.toss.home.SchemeTransparentWebActivity;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetCertPolicy implements ALCFaceResult, r8lambda_TGyvW_ZWE2FNGas5LTboepDiQ {
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 91;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static long onNavigationEvent = 7798559133331975163L;
    private static int onExtraCallbackWithResult = -1776194565;
    private static char IAuthTabCallback = 13219;
    private static char onTransact = 53283;
    private static char asInterface = 18534;
    private static char asBinder = 30156;
    private static char IAuthTabCallbackStub = 58576;
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.shared.CloseHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return UST_CERT_GetCertPolicy.onWarmupCompleted();
        }
    });
    private final Lazy onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.shared.CloseHandler$$ExternalSyntheticLambda1
        public final Object invoke() {
            return UST_CERT_GetCertPolicy.IAuthTabCallback();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, int r8) {
        /*
            int r8 = r8 + 109
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = o.UST_CERT_GetCertPolicy.$$a
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetCertPolicy.$$c(int, int, int):java.lang.String");
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = (~(i7 | i3)) | (~(i7 | i4));
        int i9 = (~i3) | i;
        int i10 = ~(i9 | i4);
        int i11 = (~(i3 | (~i4))) | (~i9);
        int i12 = i + i4 + i6 + (243328196 * i5) + (549715570 * i2);
        int i13 = i12 * i12;
        int i14 = ((-90835549) * i) + 1264254976 + ((-1099560353) * i4) + (i8 * 1643121246) + (1643121246 * i10) + ((-1643121246) * i11) + (1552285696 * i6) + (781713408 * i5) + (665583616 * i2) + (1005256704 * i13);
        int i15 = (i * 1467389705) + 421362043 + (i4 * 1467387837) + (i8 * (-934)) + (i10 * (-934)) + (i11 * 934) + (i6 * 1467388771) + (i5 * (-1383267380)) + (i2 * 1030937622) + (i13 * 484507648);
        return i14 + ((i15 * i15) * 1164771328) != 1 ? onExtraCallbackWithResult(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit IAuthTabCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor, th);
        int i4 = IAuthTabCallbackDefault + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ SessionTrackerb IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        SessionTrackerb sessionTrackerbAsBinder = asBinder();
        int i4 = IAuthTabCallback_Parcel + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return sessionTrackerbAsBinder;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(settopguidebackgroundcolor);
        int i4 = IAuthTabCallbackDefault + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ GriverActionSheetResultCallback onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 23;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        GriverActionSheetResultCallback griverActionSheetResultCallbackAsInterface = asInterface();
        int i4 = IAuthTabCallbackDefault + 101;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return griverActionSheetResultCallbackAsInterface;
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 101;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public /* bridge */ void onNavigationEvent(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 33;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        super.onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = IAuthTabCallbackDefault + 109;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = IAuthTabCallback_Parcel + 117;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 113;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory.onNavigationEvent onnavigationevent = onOutOfMemory.onNavigationEvent.onExtraCallbackWithResult;
        if (i3 == 0) {
            return onnavigationevent;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        UST_CERT_GetCertPolicy uST_CERT_GetCertPolicy = (UST_CERT_GetCertPolicy) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        GriverActionSheetResultCallback griverActionSheetResultCallback = (GriverActionSheetResultCallback) uST_CERT_GetCertPolicy.onWarmupCompleted.getValue();
        int i4 = IAuthTabCallback_Parcel + 35;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return griverActionSheetResultCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final GriverActionSheetResultCallback asInterface() {
        GriverActionSheetResultCallback griverActionSheetResultCallbackAudioAttributesImplBaseParcelizer;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            griverActionSheetResultCallbackAudioAttributesImplBaseParcelizer = ((GriverActionSheetParam) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GriverActionSheetParam.class)).AudioAttributesImplBaseParcelizer();
            int i3 = 5 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            griverActionSheetResultCallbackAudioAttributesImplBaseParcelizer = ((GriverActionSheetParam) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), GriverActionSheetParam.class)).AudioAttributesImplBaseParcelizer();
        }
        int i4 = IAuthTabCallback_Parcel + 7;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 46 / 0;
        }
        return griverActionSheetResultCallbackAudioAttributesImplBaseParcelizer;
    }

    private final SessionTrackerb IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 53;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SessionTrackerb sessionTrackerb = (SessionTrackerb) this.onExtraCallback.getValue();
        int i3 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        return sessionTrackerb;
    }

    private static final SessionTrackerb asBinder() {
        SessionTrackerb smallIconId;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Response response = Response.onNavigationEvent;
            smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
            int i3 = 84 / 0;
        } else {
            Response response2 = Response.onNavigationEvent;
            smallIconId = ((SessionTrackerb.onExtraCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), SessionTrackerb.onExtraCallback.class)).getSmallIconId();
        }
        int i4 = IAuthTabCallback_Parcel + 89;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, (Function1) null, 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackDefault + 123;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        ALCFaceBox.onExtraCallbackWithResult(settopguidebackgroundcolor, th, (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return unit;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = $10 + 15;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $10 + 107;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                char[] cArr4 = cArr3;
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                        int iIndexOf = 10 - TextUtils.indexOf("", "", 0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 12435;
                        Class[] clsArr = new Class[4];
                        clsArr[0] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, iIndexOf, iLastIndexOf, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr4[c] = cCharValue;
                    int i12 = i7;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(asInterface)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.getThreadPriority(0) + 20) >> 6), 10 - View.resolveSize(0, 0), (Process.myPid() >> 22) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7 = i12 + 1;
                    cArr3 = cArr4;
                    i3 = 0;
                    c = 1;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19901 - (Process.myPid() >> 22), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) throws Throwable {
        String strIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        setText settext = new setText(jsonObject);
        Object[] objArr = new Object[1];
        a((char) (KeyEvent.normalizeMetaState(0) + 22054), 1010682496 + (ViewConfiguration.getScrollBarSize() >> 8), new char[]{39104, 13889, 24234}, new char[]{0, 0, 0, 0}, new char[]{33015, 15818, 9788, 49750}, objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        b(new char[]{3129, 60022, 25130, 14491, 10574, 46532, 57443, 31506, 17046, 33851, 37189, 48652}, View.MeasureSpec.getMode(0) + 11, objArr2);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr2[0]).intern(), false})).booleanValue();
        Object[] objArr3 = new Object[1];
        a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 1, new char[]{64689, 49358, 28211, 16033, 54764, 47258, 11921, 30231}, new char[]{0, 0, 0, 0}, new char[]{44825, 28203, 17384, 52493}, objArr3);
        boolean zBooleanValue2 = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr3[0]).intern(), true})).booleanValue();
        if (webViewContentOwner.closeWebView(strOnNavigationEvent, zBooleanValue)) {
            return;
        }
        if (zBooleanValue) {
            if (!(webViewContentOwner instanceof TossPayWebContentOwner)) {
                FragmentActivity activity = webViewContentOwner.getActivity();
                if (activity != null) {
                    IAuthTabCallback(activity, strOnNavigationEvent, zBooleanValue2);
                    return;
                }
                return;
            }
            FragmentActivity activity2 = ((TossPayWebContentOwner) webViewContentOwner).getActivity();
            if (activity2 != null) {
                GriverActionSheetResultCallback griverActionSheetResultCallback = (GriverActionSheetResultCallback) IAuthTabCallback(-2009865336, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), 2009865336, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback());
                Uri uri = (Uri) mergeParams.onWarmupCompleted(nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), nSetPosition.onExtraCallbackWithResult(), -846257502, nSetPosition.onExtraCallbackWithResult(), 846257509, new Object[]{strOnNavigationEvent});
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                Intrinsics.checkNotNull(uri);
                griverActionSheetResultCallback.onExtraCallbackWithResult(activity2, uri, new CloseHandler$.ExternalSyntheticLambda2(settopguidebackgroundcolor), new CloseHandler$.ExternalSyntheticLambda3(settopguidebackgroundcolor));
                int i2 = IAuthTabCallback_Parcel + 15;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 97 / 0;
                    return;
                }
                return;
            }
            return;
        }
        SchemeTransparentWebActivity activity3 = webViewContentOwner.getActivity();
        if ((activity3 instanceof SchemeTransparentWebActivity) && (strIAuthTabCallback = activity3.IAuthTabCallback()) != null) {
            int i4 = IAuthTabCallbackDefault + 71;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (Boolean.parseBoolean(strIAuthTabCallback)) {
                Uri uri2 = Uri.parse(strOnNavigationEvent);
                Intrinsics.checkNotNullExpressionValue(uri2, "");
                Object[] objArr4 = new Object[1];
                a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") - 253463378, new char[]{4709, 22782, 32852, 19189, 40759, 6085, 2042, 46041, 52448}, new char[]{0, 0, 0, 0}, new char[]{44571, 58484, 57584, 23297}, objArr4);
                String strIntern = ((String) objArr4[0]).intern();
                Object[] objArr5 = new Object[1];
                b(new char[]{12610, 27930, 45200, 42826}, View.resolveSize(0, 0) + 4, objArr5);
                Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr5[0]).intern());
                Object[] objArr6 = new Object[1];
                b(new char[]{54492, 24284, 19347, 19018, 11819, 15051, 21495, 60402, 61583, 19092, 3039, 27687, 44195, 38106, 6449, 33278, 23847, 19132, 19596, 15039, 2890, 24695}, ExpandableListView.getPackedPositionChild(0L) + 22, objArr6);
                String strIntern2 = ((String) objArr6[0]).intern();
                Object[] objArr7 = new Object[1];
                b(new char[]{12610, 27930, 45200, 42826}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 4, objArr7);
                String strOnNavigationEvent2 = filterCreatePageParams.onNavigationEvent(uri2, new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback(strIntern2, ((String) objArr7[0]).intern())});
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
                StringBuilder sb = new StringBuilder();
                Object[] objArr8 = new Object[1];
                a((char) (Color.rgb(0, 0, 0) + 16777216), ViewConfiguration.getScrollBarFadeDuration() >> 16, new char[]{36461, 39832, 22169, 28135, 50788, 52332, 41404, 47649, 13188, 54794, 19763, 32583, 11099, 18140, 64905, 24783, 49390, 60129, 55095, 7332, 56930, 30816}, new char[]{0, 0, 0, 0}, new char[]{11469, 20015, 60279, 50173}, objArr8);
                sb.append(((String) objArr8[0]).intern());
                sb.append(strIAuthTabCallback);
                Object[] objArr9 = new Object[1];
                b(new char[]{41140, 19483, 3568, 3406, 29570, 41348, 16012, 48022, 2050, 9081, 30460, 43746}, 12 - TextUtils.getOffsetBefore("", 0), objArr9);
                ConvertFloatArrayToByteArray.onExtraCallback(convertFloatArrayToByteArray, ((String) objArr9[0]).intern(), sb.toString(), (Map) null, (String) null, false, (String) null, 60, (Object) null);
                onNavigationEvent(this, activity3, strOnNavigationEvent2, false, 4, null);
                return;
            }
        }
        FragmentActivity activity4 = webViewContentOwner.getActivity();
        if (activity4 != null) {
            IAuthTabCallback(activity4, strOnNavigationEvent, zBooleanValue2);
        }
    }

    private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i4 = $10 + 63;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 43 - (ViewConfiguration.getEdgeSlop() >> 16), 1451 - TextUtils.indexOf("", "", 0), 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getOffsetBefore("", 0)), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1495 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (23972 - Color.green(0)), 51 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 22939 - (ViewConfiguration.getLongPressTimeout() >> 16), 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45847), View.MeasureSpec.getMode(0) + 29, 12578 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] ^ cArr4[iIntValue2]) ^ (onNavigationEvent ^ 7798559133331975163L)) ^ ((int) (onExtraCallbackWithResult ^ 7798559133331975163L))) ^ ((char) (IAuthTabCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 83;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    public void IAuthTabCallback(@NotNull ReactNativeContentOwner reactNativeContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 11;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(reactNativeContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        r8lambdaM3DeYFFiQUGzHsjrfaArqWkL6N0.Companion.IAuthTabCallback().onNavigationEvent(reactNativeContentOwner, str, jsonObject, setonoutofmemeryerrorcallback);
        int i4 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ void onNavigationEvent(UST_CERT_GetCertPolicy uST_CERT_GetCertPolicy, FragmentActivity fragmentActivity, String str, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackDefault;
        int i4 = i3 + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 5) != 0) {
            int i5 = i3 + 71;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        uST_CERT_GetCertPolicy.IAuthTabCallback(fragmentActivity, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(androidx.fragment.app.FragmentActivity r14, java.lang.String r15, boolean r16) {
        /*
            r13 = this;
            r9 = r14
            r10 = 2
            int r0 = r10 % r10
            int r0 = o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault
            int r0 = r0 + 21
            int r1 = r0 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel = r1
            int r0 = r0 % r10
            r11 = 0
            r12 = 1
            if (r0 != 0) goto L1c
            boolean r0 = o.GraniteModule_onEventListenerRemoved.onExtraCallback(r15)
            r1 = 27
            int r1 = r1 / r11
            r0 = r0 ^ r12
            if (r0 == r12) goto L44
            goto L22
        L1c:
            boolean r0 = o.GraniteModule_onEventListenerRemoved.onExtraCallback(r15)
            if (r0 == 0) goto L44
        L22:
            o.enableModuleArgumentNSNullConversionIOS r0 = o.enableModuleArgumentNSNullConversionIOS.asInterface
            r2 = r15
            boolean r0 = r0.IAuthTabCallbackDefault(r15)
            if (r0 == 0) goto L44
            int r0 = o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel
            int r0 = r0 + 15
            int r1 = r0 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault = r1
            int r0 = r0 % r10
            o.SessionTrackerb r0 = r13.IAuthTabCallbackStub()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 60
            r8 = 0
            r1 = r14
            r2 = r15
            o.SessionTrackerb.IAuthTabCallback(r0, r1, r2, r3, r4, r5, r6, r7, r8)
        L44:
            boolean r0 = r9 instanceof im.toss.base.BaseActivity
            r0 = r0 ^ r12
            r1 = 0
            if (r0 == r12) goto L5b
            r0 = r9
            im.toss.base.BaseActivity r0 = (im.toss.base.BaseActivity) r0
            int r2 = o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel
            int r2 = r2 + 65
            int r3 = r2 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault = r3
            int r2 = r2 % r10
            if (r2 == 0) goto L5c
            int r2 = r10 / 4
            goto L5c
        L5b:
            r0 = r1
        L5c:
            if (r0 == 0) goto L9c
            int r2 = o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault
            int r2 = r2 + 97
            int r3 = r2 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel = r3
            int r2 = r2 % r10
            if (r2 == 0) goto L98
            boolean r0 = r0.onRelationshipValidationResult()
            if (r0 != 0) goto L9c
            int r0 = o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault
            int r0 = r0 + 117
            int r1 = r0 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel = r1
            int r0 = r0 % r10
            boolean r0 = r14.isFinishing()
            if (r0 != 0) goto L9c
            r14.finish()
            r0 = r16
            if (r0 == r12) goto L9c
            int r0 = o.UST_CERT_GetCertPolicy.IAuthTabCallbackDefault
            int r0 = r0 + 109
            int r1 = r0 % 128
            o.UST_CERT_GetCertPolicy.IAuthTabCallback_Parcel = r1
            int r0 = r0 % r10
            if (r0 != 0) goto L94
            r14.overridePendingTransition(r11, r12)
            goto L9c
        L94:
            r14.overridePendingTransition(r11, r11)
            goto L9c
        L98:
            r0.onRelationshipValidationResult()
            throw r1
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.UST_CERT_GetCertPolicy.IAuthTabCallback(androidx.fragment.app.FragmentActivity, java.lang.String, boolean):void");
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (Unit) IAuthTabCallback(1111573355, new Object[]{settopguidebackgroundcolor}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, -1111573354, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
    }

    private final GriverActionSheetResultCallback IAuthTabCallbackDefault() {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
        return (GriverActionSheetResultCallback) IAuthTabCallback(-2009865336, new Object[]{this}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback, 2009865336, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2);
    }
}
