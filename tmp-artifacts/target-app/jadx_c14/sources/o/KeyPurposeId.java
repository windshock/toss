package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import im.toss.define.RegionScope;
import im.toss.network.throwable.TossApiCallException;
import java.lang.reflect.Field;
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
import o.KeyPurposeId;
import o.UST_CERT_GetPublicKeyInfo;
import o.onOutOfMemory;
import o.turnOnDebugger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.FetchAuthTokenHandler$;
import viva.republica.toss.util.RetryWithDelay;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class KeyPurposeId implements ALCFaceQuality {
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.FetchAuthTokenHandler$$ExternalSyntheticLambda6
        public final Object invoke() {
            return KeyPurposeId.onWarmupCompleted();
        }
    });
    private static final byte[] $$a = {35, -11, -97, -73};
    private static final int $$b = 152;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int IAuthTabCallbackDefault = 1;
    private static char onExtraCallback = 58390;
    private static char onExtraCallbackWithResult = 34534;
    private static char onNavigationEvent = 63196;
    private static char IAuthTabCallback = 30156;
    private static long IAuthTabCallbackStub = 8059898501341488679L;
    private static int asInterface = -1776194565;
    private static char asBinder = 27643;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r6 = r6 + 109
            byte[] r0 = o.KeyPurposeId.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KeyPurposeId.$$c(byte, int, int):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[0];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = onTransact + 123;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, th);
        int i3 = onTransact + 101;
        IAuthTabCallbackDefault = i3 % 128;
        if (i3 % 2 != 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        onTransact(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = onTransact + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing = (JsonReaderUnknownNumberParsing) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 115;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback = onExtraCallback(jsonReaderUnknownNumberParsing);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallback;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i6 | i5));
        int i11 = ~(i7 | i9);
        int i12 = (~i5) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i6);
        int i15 = i6 + i4 + i3 + ((-1261570137) * i2) + (2040842291 * i);
        int i16 = i15 * i15;
        int i17 = ((i6 * (-750812765)) - 1471086592) + ((-750812765) * i4) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i3) + ((-1928462336) * i2) + (1629880320 * i) + (2096168960 * i16);
        int i18 = ((i6 * 1408203179) - 1033136887) + (i4 * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i3 * 1408202841) + (i2 * (-1046847217)) + (i * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? IAuthTabCallback(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 81;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(th);
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult = onExtraCallbackWithResult(th);
        int i3 = IAuthTabCallbackDefault + 81;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallbackStub = IAuthTabCallbackStub(function1, obj);
        int i4 = IAuthTabCallbackDefault + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskIAuthTabCallbackStub;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = onTransact + 119;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, turnOnDebugger.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onTransact + 97;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, onnavigationevent);
        if (i3 == 0) {
            int i4 = 76 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ getBillingPeriod onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        getBillingPeriod getbillingperiodOnTransact = onTransact();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        return getbillingperiodOnTransact;
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallbackWithResult(function1, obj);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult = onExtraCallbackWithResult(function1, obj);
        int i3 = IAuthTabCallbackDefault + 121;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdskOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onWarmupCompleted(KeyPurposeId keyPurposeId, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 37;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(keyPurposeId, str, str2);
        int i4 = IAuthTabCallbackDefault + 115;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 113;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 == 0) {
            throw null;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i4 = onTransact + 65;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onTransact + 63;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 17;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        int i6 = onTransact + 117;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 87 / 0;
        }
    }

    private final getBillingPeriod IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getBillingPeriod getbillingperiod = (getBillingPeriod) this.onWarmupCompleted.getValue();
        if (i3 == 0) {
            return getbillingperiod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getBillingPeriod onTransact() {
        int i = 2 % 2;
        int i2 = onTransact + 53;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            getBillingPeriod supportProgressBarVisibility = ((UST_CERT_GetPublicKeyInfo.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_GetPublicKeyInfo.IAuthTabCallback.class)).setSupportProgressBarVisibility();
            int i3 = IAuthTabCallbackDefault + 81;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                return supportProgressBarVisibility;
            }
            obj.hashCode();
            throw null;
        }
        Response response2 = Response.onNavigationEvent;
        ((UST_CERT_GetPublicKeyInfo.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_GetPublicKeyInfo.IAuthTabCallback.class)).setSupportProgressBarVisibility();
        obj.hashCode();
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new FetchAuthTokenHandler$.ExternalSyntheticLambda7(this));
        int i2 = onTransact + 21;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean IAuthTabCallback(KeyPurposeId keyPurposeId, String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 55;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            keyPurposeId.IAuthTabCallback().onExtraCallbackWithResult();
            getPricingPhaseList getpricingphaselist = getPricingPhaseList.KR;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = keyPurposeId.IAuthTabCallback().onExtraCallbackWithResult();
        if (getpricingphaselistOnExtraCallbackWithResult == getPricingPhaseList.KR) {
            addOnSession addonsession = addOnSession.onExtraCallback;
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1906579071);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ImageFormat.getBitsPerPixel(0) + 1), 34 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0) + 7094, -1088743663, false, "Companion", (Class[]) null);
            }
            Object obj2 = ((Field) objOnExtraCallback).get(null);
            try {
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-663027100);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (63468 - KeyEvent.getDeadChar(0, 0)), 51 - TextUtils.indexOf((CharSequence) "", '0', 0), KeyEvent.normalizeMetaState(0) + 7128, -381944588, false, "onWarmupCompleted", new Class[0]);
                }
                boolean zIAuthTabCallback$7144b1a0 = addonsession.IAuthTabCallback$7144b1a0(str, (Enum[]) ((Method) objOnExtraCallback2).invoke(obj2, null), RegionScope.Companion.onExtraCallbackWithResult());
                int i3 = IAuthTabCallbackDefault + 93;
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return zIAuthTabCallback$7144b1a0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{52327, 23810, 3249, 14203, 64224, 38447, 1912, 55357}, ((byte) KeyEvent.getModifierMetaStateMask()) + 8, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(TextUtils.indexOf("", ""), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23479), new char[]{9978, 61477, 37528, 2071, 49027, 49157, 11062, 21604, 3186, 60562, 33802, 13956, 11139, 21211}, new char[]{43121, 34208, 47137, 10331}, new char[]{52700, 19464, 36557, 992}, objArr2);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(strIntern, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        b(View.getDefaultSize(0, 0) + 1443442764, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40379), new char[]{29253, 26608, 12391, 10295, 8214, 251, 41569, 50337, 36194, 38029, 53840, 57561, 2336}, new char[]{19667, 2352, 48214, 58013}, new char[]{52700, 19464, 36557, 992}, objArr3);
        Pair pairIAuthTabCallback2 = getWrite.IAuthTabCallback(((String) objArr3[0]).intern(), getpricingphaselistOnExtraCallbackWithResult.name());
        Object[] objArr4 = new Object[1];
        b(Color.argb(0, 0, 0, 0) + 1356711684, (char) (16144 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), new char[]{61519, 14585, 15299}, new char[]{1253, 56775, 4176, 44863}, new char[]{52700, 19464, 36557, 992}, objArr4);
        Map mapOnWarmupCompleted = access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, pairIAuthTabCallback2, getWrite.IAuthTabCallback(((String) objArr4[0]).intern(), str)});
        Object[] objArr5 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (23480 - View.resolveSizeAndState(0, 0, 0)), new char[]{9978, 61477, 37528, 2071, 49027, 49157, 11062, 21604, 3186, 60562, 33802, 13956, 11139, 21211}, new char[]{43121, 34208, 47137, 10331}, new char[]{52700, 19464, 36557, 992}, objArr5);
        String strIntern2 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a(new char[]{56739, 21607, 57018, 11843, 3249, 14203, 51088, 46414, 37052, 14762, 3680, 58423, 51372, 62516, 45057, 50618, 6634, 29033, 8276, 52020, 8074, 22540, 53439, 6509, 24920, 54702, 1739, 48199, 4483, 9695, 3746, 28854, 46014, 6990, 5366, 15352}, (Process.myPid() >> 22) + 36, objArr6);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern2, ((String) objArr6[0]).intern(), (Throwable) null, mapOnWarmupCompleted, 4, (Object) null);
        return false;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 105;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        RetryWithDelay retryWithDelayOnNavigationEvent = RetryWithDelay.Companion.onNavigationEvent();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingIAuthTabCallback = jsonReaderUnknownNumberParsing.IAuthTabCallback(new FetchAuthTokenHandler$.ExternalSyntheticLambda9(new FetchAuthTokenHandler$.ExternalSyntheticLambda8()));
        Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingIAuthTabCallback, "");
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnNavigationEvent = retryWithDelayOnNavigationEvent.onNavigationEvent(jsonReaderUnknownNumberParsingIAuthTabCallback);
        int i2 = onTransact + 49;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        return jsonReaderUnknownNumberParsingOnNavigationEvent;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 125;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk = (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 119;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return r8lambdaarg5h4l5ymqb18lwxbfykjvhdsk;
    }

    private static final r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallbackWithResult(Throwable th) throws Throwable {
        TossApiCallException.ApiError apiError;
        int i = 2 % 2;
        int i2 = onTransact + 99;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Object obj = null;
        if (th instanceof TossApiCallException.ApiError) {
            int i4 = IAuthTabCallbackDefault + 99;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            apiError = (TossApiCallException.ApiError) th;
        } else {
            apiError = null;
        }
        String strAsBinder = apiError != null ? apiError.asBinder() : null;
        b(1221501156 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (Color.red(0) + 13074), new char[]{10439, 54259, 4766, 50049, 59648, 33308, 7095, 11668, 28227, 26504, 39801, 29096, 17980, 19960, 47596, 58545, 51161, 3708, 34706, 61942, 65494, 65206, 32299, 41455, 29960, 38499, 60977}, new char[]{58188, 52896, 4680, 9523}, new char[]{52700, 19464, 36557, 992}, new Object[1]);
        if (!(!Intrinsics.areEqual(strAsBinder, ((String) r11[0]).intern()))) {
            return JsonReaderUnknownNumberParsing.IAuthTabCallback(th);
        }
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = JsonReaderUnknownNumberParsing.onExtraCallback(th);
        int i5 = onTransact + 87;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            return jsonReaderUnknownNumberParsingOnExtraCallback;
        }
        throw null;
    }

    private static final void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 75;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 86 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 125;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionType(0L) + 29426), (ViewConfiguration.getTouchSlop() >> 8) + 22, TextUtils.getCapsMode("", 0, 0) + 24734, -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1971988338);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - Drawable.resolveOpacity(0, 0)), 21 - ((byte) KeyEvent.getModifierMetaStateMask()), 24734 - Color.alpha(0), -1154144738, false, "access000", new Class[0]);
            }
            JsonReaderUnknownNumberParsing<turnOnDebugger> jsonReaderUnknownNumberParsingOnExtraCallbackWithResult = ((getMediaViewVideoRendererApi) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallbackWithResult();
            MapConverter mapConverterOnExtraCallback = clearTid.onExtraCallback();
            Intrinsics.checkNotNullExpressionValue(mapConverterOnExtraCallback, "");
            JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnWarmupCompleted = jsonReaderUnknownNumberParsingOnExtraCallbackWithResult.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onExtraCallbackWithResult(mapConverterOnExtraCallback, NetConverter3.onExtraCallback()));
            Intrinsics.checkNotNullExpressionValue(jsonReaderUnknownNumberParsingOnWarmupCompleted, "");
            jsonReaderUnknownNumberParsingOnWarmupCompleted.IAuthTabCallbackStub(new FetchAuthTokenHandler$.ExternalSyntheticLambda1(new FetchAuthTokenHandler$.ExternalSyntheticLambda0())).onWarmupCompleted(new FetchAuthTokenHandler$.ExternalSyntheticLambda3(new FetchAuthTokenHandler$.ExternalSyntheticLambda2(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback)), new FetchAuthTokenHandler$.ExternalSyntheticLambda5(new FetchAuthTokenHandler$.ExternalSyntheticLambda4(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback)));
            int i2 = onTransact + 75;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 71;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = IAuthTabCallbackDefault + 91;
        onTransact = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final Unit onExtraCallbackWithResult(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, turnOnDebugger.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (setBaseDeeplink.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq)) {
            int i4 = onTransact + 89;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 != 0) {
                ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, onnavigationevent.onExtraCallbackWithResult());
            } else {
                ALCFaceBox.onExtraCallback(setonoutofmemeryerrorcallback, onnavigationevent.onExtraCallbackWithResult());
                throw null;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        TossApiCallException.ApiError apiError;
        int i = 2 % 2;
        if (setBaseDeeplink.IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq)) {
            int i2 = onTransact + 57;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            Object obj = null;
            if (th instanceof TossApiCallException.ApiError) {
                apiError = (TossApiCallException.ApiError) th;
            } else {
                int i5 = i3 + 29;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                apiError = null;
            }
            if (apiError == null) {
                Intrinsics.checkNotNull(th);
                ALCFaceBox.onExtraCallbackWithResult(setonoutofmemeryerrorcallback, th, (String) null, (Map) null, 6, (Object) null);
            } else {
                String message = apiError.getMessage();
                if (message == null) {
                    int i7 = onTransact + 91;
                    IAuthTabCallbackDefault = i7 % 128;
                    int i8 = i7 % 2;
                    message = ((TossApiCallException.ApiError) th).getMessage();
                    if (message == null) {
                        int i9 = IAuthTabCallbackDefault + 89;
                        onTransact = i9 % 128;
                        if (i9 % 2 != 0) {
                            obj.hashCode();
                            throw null;
                        }
                        message = "";
                    }
                }
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, message, apiError.asBinder(), (Map) null, 4, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i5 = $11 + 61;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i7 = $10 + 111;
            $11 = i7 % 128;
            int i8 = 58224;
            if (i7 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent / i4];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i9 = $11 + 35;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i11 = (c2 + i8) ^ ((c2 << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 10;
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, windowTouchSlop, keyRepeatTimeout, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onExtraCallbackWithResult)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 10 - TextUtils.indexOf("", "", 0), 12434 - Drawable.resolveOpacity(0, 0), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 16015), Process.getGidForName("") + 15, 19901 - TextUtils.getOffsetAfter("", 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, char c, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
        int i3 = $11 + 53;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
            int i5 = $11 + 21;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                if (objOnExtraCallback == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 43 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1451 - (ViewConfiguration.getPressedStateDuration() >> 16), 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                    if (objOnExtraCallback2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 49124), TextUtils.indexOf("", "") + 44, 1494 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1533236389, false, $$c(b3, b4, b4), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (24020 - AndroidCharacter.getMirror('0')), 49 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 22939, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45849 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 29 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 12578, 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((int) (asInterface ^ 7798559133331975163L)) ^ ((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (IAuthTabCallbackStub ^ 7798559133331975163L))) ^ ((char) (asBinder ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            cArr5 = cArr5;
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
        objArr[0] = new String(cArr6);
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onExtraCallback(Throwable th) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1726678375, iOnExtraCallbackWithResult, new Object[]{th}, 1726678378);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 567992257, iOnExtraCallbackWithResult, new Object[]{function1, obj}, -567992256);
    }

    public static /* synthetic */ Unit IAuthTabCallback(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (Unit) onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, 724605627, iOnExtraCallbackWithResult, new Object[]{r8lambdakrhaimf1bm5cgjbilhp45vln_xq, setonoutofmemeryerrorcallback, th}, -724605627);
    }

    public static /* synthetic */ r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk onNavigationEvent(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing) {
        int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
        return (r8lambdaaRg5h4L5YMqb18LWxBfYKJvhDSk) onNavigationEvent(setVisitUrl.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, -1616122493, iOnExtraCallbackWithResult, new Object[]{jsonReaderUnknownNumberParsing}, 1616122495);
    }
}
