package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.gson.JsonObject;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.core.webkit.TossCoreWebView;
import im.toss.core.webkit.WebViewContentOwner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.onOutOfMemory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.common.web.message.handlers.SetPrimaryAccountHandler$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getTBSCertificate implements ALCFaceResult {
    private static short[] onNavigationEvent;
    private static final byte[] $$a = {9, 8, 112, 107};
    private static final int $$b = 229;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int IAuthTabCallback = -1321752601;
    private static int onExtraCallbackWithResult = -1538795427;
    private static int onWarmupCompleted = 1020629340;
    private static byte[] onExtraCallback = {-3, -1, 45, -24, 14, -15, 14, 4, 8, 10, 19, -35, 14, -15, 14, 4, 8, 10, -18, -34, 19, -35, 14, -15, 14, 4, 8, 10, 73, -4, -3, -1, 13, 29, -29, 14, -15, 14, 4, 8, 10, -14, -11, 8, 8, 8, 8, 8};
    private static long IAuthTabCallbackStub = 5721520049716199110L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r7, int r8, short r9) {
        /*
            byte[] r0 = o.getTBSCertificate.$$a
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 + 4
            int r9 = r9 * 3
            int r9 = r9 + 115
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTBSCertificate.$$c(int, int, short):java.lang.String");
    }

    public static /* synthetic */ Pair IAuthTabCallback(String str, String str2, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnExtraCallbackWithResult = onExtraCallbackWithResult(str, str2, pair);
        if (i3 == 0) {
            int i4 = 10 / 0;
        }
        int i5 = onTransact + 27;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return pairOnExtraCallbackWithResult;
    }

    public static /* synthetic */ deserializeIp IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(function1, obj);
        }
        access000(function1, obj);
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str, String str2) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(str, str2);
        }
        onExtraCallbackWithResult(str, str2);
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 115;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -821198358, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 821198358, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult);
        int i4 = asInterface + 31;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 59 / 0;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStubProxy(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = asInterface + 75;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, WebViewContentOwner webViewContentOwner, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 7;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(str, str2, webViewContentOwner, setDetectableSize);
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {pair};
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        if (i3 == 0) {
            throw null;
        }
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1665532269, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1665532274, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), objArr, iOnExtraCallbackWithResult);
        int i4 = asInterface + 111;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    public static /* synthetic */ deserializeIp onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 105;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        deserializeIp deserializeip = (deserializeIp) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -815767355, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 815767359, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult);
        int i4 = asInterface + 33;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(String str, String str2, AdOptionsViewApi adOptionsViewApi) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnWarmupCompleted = onWarmupCompleted(str, str2, adOptionsViewApi);
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        int i5 = onTransact + 83;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return pairOnWarmupCompleted;
    }

    public static /* synthetic */ Pair onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 3;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onTransact(function1, obj);
        }
        onTransact(function1, obj);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int i = 2 % 2;
        int i2 = onTransact + 125;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 756390275, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -756390272, iOnExtraCallbackWithResult2, new Object[]{settopguidebackgroundcolor, th}, iOnExtraCallbackWithResult);
        int i4 = onTransact + 91;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        setText settext = (setText) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Pair pairOnNavigationEvent = onNavigationEvent(settext);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = onTransact + 71;
        asInterface = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
        return pairOnNavigationEvent;
    }

    public static /* synthetic */ Pair onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 35;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(function1, obj);
        }
        IAuthTabCallback_Parcel(function1, obj);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(WebViewContentOwner webViewContentOwner, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        Unit unit = (Unit) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -554444200, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 554444201, iOnExtraCallbackWithResult2, new Object[]{webViewContentOwner, pair}, iOnExtraCallbackWithResult);
        int i4 = asInterface + 37;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    public static /* synthetic */ deserializeIp onNavigationEvent(Pair pair) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        deserializeIp deserializeipOnWarmupCompleted = onWarmupCompleted(pair);
        int i4 = asInterface + 35;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return deserializeipOnWarmupCompleted;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = i7 | i2;
        int i9 = ~(i8 | i6);
        int i10 = (~i6) | (~((~i2) | i4));
        int i11 = (~(i6 | i2)) | (~(i7 | i6)) | (~i8);
        int i12 = i4 + i2 + i5 + ((-953487067) * i) + ((-1992133889) * i3);
        int i13 = i12 * i12;
        int i14 = (1737059190 * i4) + 1765277696 + (1051104396 * i2) + (i9 * (-342977397)) + (342977397 * i10) + ((-342977397) * i11) + (1394081792 * i5) + ((-1703411712) * i) + (1961361408 * i3) + (907935744 * i13);
        int i15 = ((i4 * 272661978) - 2115615402) + (i2 * 272662804) + (i9 * 413) + (i10 * (-413)) + (i11 * 413) + (i5 * 272662391) + (i * 2077717299) + (i3 * 1957688713) + (i13 * 166854656);
        int i16 = i14 + (i15 * i15 * (-213778432));
        if (i16 == 1) {
            WebViewContentOwner webViewContentOwner = (WebViewContentOwner) objArr[0];
            Pair pair = (Pair) objArr[1];
            int i17 = 2 % 2;
            ConvertByteArrayToFloatArray.onExtraCallback(1214389L, false, (String) null, (Map) null, new SetPrimaryAccountHandler$.ExternalSyntheticLambda0((String) pair.IAuthTabCallback(), (String) pair.onExtraCallbackWithResult(), webViewContentOwner), 14, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i18 = asInterface + 75;
            onTransact = i18 % 128;
            int i19 = i18 % 2;
            return unit;
        }
        if (i16 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 3) {
            return onWarmupCompleted(objArr);
        }
        if (i16 == 4) {
            return onExtraCallback(objArr);
        }
        if (i16 != 5) {
            return IAuthTabCallback(objArr);
        }
        Pair pair2 = (Pair) objArr[0];
        int i20 = 2 % 2;
        Intrinsics.checkNotNullParameter(pair2, "");
        String str = (String) pair2.onExtraCallbackWithResult();
        String str2 = (String) pair2.IAuthTabCallback();
        writeRaw writerawWriteTypedObject = ((JsonReaderUnknownNumberParsing) disableOldAndroidAttachmentMetricsWorkarounds.onExtraCallback(554839421, new Object[]{disableOldAndroidAttachmentMetricsWorkarounds.IAuthTabCallback, false, 1, null}, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -554839418, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback())).writeTypedObject();
        Intrinsics.checkNotNullExpressionValue(writerawWriteTypedObject, "");
        writeRaw writerawOnNavigationEvent = writerawWriteTypedObject.onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        writeRaw writerawOnWarmupCompleted = writerawOnNavigationEvent.onWarmupCompleted(new SetPrimaryAccountHandler$.ExternalSyntheticLambda14(new SetPrimaryAccountHandler$.ExternalSyntheticLambda13(str, str2)));
        int i21 = onTransact + 21;
        asInterface = i21 % 128;
        int i22 = i21 % 2;
        return writerawOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onWarmupCompleted(setTopGuideBackgroundColor settopguidebackgroundcolor, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(settopguidebackgroundcolor, pair);
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        access100(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = asInterface + 51;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Deprecated
    public /* bridge */ void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = onTransact + 31;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallbackWithResult(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, bundle, uri);
        int i6 = asInterface + 25;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 82 / 0;
        }
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onTransact + 45;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onExtraCallbackWithResult();
        }
        super/*o.drawTextBox*/.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ void onNavigationEvent(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = onTransact + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onNavigationEvent(webViewContentOwner, str, jsonObject, settopguidebackgroundcolor, i, i2, intent);
        if (i5 == 0) {
            throw null;
        }
        int i6 = asInterface + 113;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public /* bridge */ boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onTransact + 119;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        int i4 = onTransact + 21;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        onOutOfMemory.IAuthTabCallback iAuthTabCallback = new onOutOfMemory.IAuthTabCallback(new SetPrimaryAccountHandler$.ExternalSyntheticLambda12());
        int i2 = asInterface + 113;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        return iAuthTabCallback;
    }

    private static final boolean onExtraCallbackWithResult(String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Uri uri = Uri.parse(str);
        if (filterCreatePageParams.IAuthTabCallback(uri)) {
            return true;
        }
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        if (filterCreatePageParams.IAuthTabCallbackStub(uri)) {
            return true;
        }
        int i4 = asInterface + 101;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        boolean zOnWarmupCompleted = filterCreatePageParams.onWarmupCompleted(uri);
        if (i5 != 0) {
            int i6 = 52 / 0;
            if (zOnWarmupCompleted) {
                return true;
            }
        } else if (zOnWarmupCompleted) {
            return true;
        }
        return false;
    }

    private static final Pair onNavigationEvent(setText settext) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-359694319) + (ViewConfiguration.getEdgeSlop() >> 16), 1735243533 - View.combineMeasuredStates(0, 0), (-74) - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a((short) ('0' - AndroidCharacter.getMirror('0')), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) - 359694308, 1735243534 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 76, objArr2);
        String strOnNavigationEvent2 = settext.onNavigationEvent(((String) objArr2[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0 || strOnNavigationEvent2.length() == 0) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr3 = new Object[1];
            b(new char[]{49951, 50006, 32958, 1306, 20638, 64166, 23420, 27545, 54363, 7205, 29254, 20992, 60718, 13511, 26905, 17767, 34322, 19346, 486, 11300, 40902, 25252, 14543, 5986, 45303}, KeyEvent.normalizeMetaState(0), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb.append(strOnNavigationEvent);
            Object[] objArr4 = new Object[1];
            a((short) View.getDefaultSize(0, 0), (byte) View.MeasureSpec.getMode(0), (-359694301) - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getOffsetBefore("", 0) + 1735243480, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 72, objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb.append(strOnNavigationEvent2);
            throw new Error(sb.toString());
        }
        int i4 = onTransact + 67;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return getWrite.IAuthTabCallback(strOnNavigationEvent, strOnNavigationEvent2);
        }
        getWrite.IAuthTabCallback(strOnNavigationEvent, strOnNavigationEvent2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 31;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i3 = asInterface + 105;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return deserializeip;
    }

    private static final Pair onTransact(Function1 function1, Object obj) {
        Pair pair;
        int i = 2 % 2;
        int i2 = asInterface + 117;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            pair = (Pair) function1.invoke(obj);
            int i3 = 33 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            pair = (Pair) function1.invoke(obj);
        }
        int i4 = asInterface + 45;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return pair;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Pair onWarmupCompleted(String str, String str2, AdOptionsViewApi adOptionsViewApi) {
        int i = 2 % 2;
        int i2 = onTransact + 61;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(adOptionsViewApi, "");
            return getWrite.IAuthTabCallback(str, str2);
        }
        Intrinsics.checkNotNullParameter(adOptionsViewApi, "");
        getWrite.IAuthTabCallback(str, str2);
        throw null;
    }

    private static final deserializeIp access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 101;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        deserializeIp deserializeip = (deserializeIp) function1.invoke(obj);
        int i4 = asInterface + 9;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return deserializeip;
        }
        throw null;
    }

    private static void b(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallbackStub ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        int i3 = $11 + 35;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i5 = $10 + 57;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            int i7 = timelineExternalSyntheticLambda0.onNavigationEvent;
            try {
                Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallbackStub)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.blue(0) + 45812), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 84, 21233 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrOnWarmupCompleted[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14184), 19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.blue(0) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
    }

    private static final Pair IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 65;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        Pair pair = (Pair) function1.invoke(obj);
        int i4 = asInterface + 85;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return pair;
    }

    private static final Pair onExtraCallbackWithResult(String str, String str2, Pair pair) {
        int i = 2 % 2;
        int i2 = onTransact + 63;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(str, str2);
        int i4 = onTransact + 25;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return pairIAuthTabCallback;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onTransact + 87;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(String str, String str2, WebViewContentOwner webViewContentOwner, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        b(new char[]{9724, 9629, 39145, 7488, 6568, 53324, 4703, 16765, 12961, 1141, 15200, 30869, 3013, 11415}, Process.myPid() >> 22, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Object[] objArr2 = new Object[1];
        a((short) (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) - 359694289, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1735243532, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 73, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), str2);
        TossCoreWebView webView = webViewContentOwner.getWebView();
        String url = null;
        if (webView != null) {
            int i4 = asInterface + 125;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                webView.getUrl();
                throw null;
            }
            url = webView.getUrl();
        }
        Object[] objArr3 = new Object[1];
        a((short) (ViewConfiguration.getScrollBarSize() >> 8), (byte) View.getDefaultSize(0, 0), Color.green(0) - 359694278, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1735243554, (-83) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr3);
        setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), url);
        return Unit.INSTANCE;
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 63;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asInterface + 69;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 115;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = onTransact + 55;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final Unit onExtraCallbackWithResult(setTopGuideBackgroundColor settopguidebackgroundcolor, Pair pair) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        onTransact = i2 % 128;
        setOnOutOfMemeryErrorCallback.onExtraCallback(settopguidebackgroundcolor, (Function1) null, i2 % 2 != 0 ? 0 : 1, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i3 = asInterface + 105;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        setTopGuideBackgroundColor settopguidebackgroundcolor = (setTopGuideBackgroundColor) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        setOnOutOfMemeryErrorCallback.onNavigationEvent(settopguidebackgroundcolor, th.getLocalizedMessage(), (String) null, (Map) null, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 61;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public void onExtraCallbackWithResult(@NotNull WebViewContentOwner webViewContentOwner, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setTopGuideBackgroundColor settopguidebackgroundcolor) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(webViewContentOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(settopguidebackgroundcolor, "");
        writeRaw writerawOnNavigationEvent = writeRaw.onNavigationEvent(new SetPrimaryAccountHandler$.ExternalSyntheticLambda1(new setText(jsonObject)));
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
        writeRaw writerawOnNavigationEvent2 = writerawOnNavigationEvent.onNavigationEvent(clearTid.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent2, "");
        writeRaw writerawOnExtraCallbackWithResult = writerawOnNavigationEvent2.onExtraCallbackWithResult(new SetPrimaryAccountHandler$.ExternalSyntheticLambda4(new SetPrimaryAccountHandler$.ExternalSyntheticLambda3())).onExtraCallbackWithResult(new SetPrimaryAccountHandler$.ExternalSyntheticLambda6(new SetPrimaryAccountHandler$.ExternalSyntheticLambda5()));
        Intrinsics.checkNotNullExpressionValue(writerawOnExtraCallbackWithResult, "");
        writeRaw writerawIAuthTabCallback = writerawOnExtraCallbackWithResult.IAuthTabCallback(NetConverter3.onExtraCallback());
        Intrinsics.checkNotNullExpressionValue(writerawIAuthTabCallback, "");
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writerawIAuthTabCallback.onNavigationEvent(new SetPrimaryAccountHandler$.ExternalSyntheticLambda8(new SetPrimaryAccountHandler$.ExternalSyntheticLambda7(webViewContentOwner))).onNavigationEvent(new SetPrimaryAccountHandler$.ExternalSyntheticLambda10(new SetPrimaryAccountHandler$.ExternalSyntheticLambda9(settopguidebackgroundcolor)), new SetPrimaryAccountHandler$.ExternalSyntheticLambda2(new SetPrimaryAccountHandler$.ExternalSyntheticLambda11(settopguidebackgroundcolor)));
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, webViewContentOwner);
        int i2 = onTransact + 91;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final deserializeIp onWarmupCompleted(Pair pair) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        String str = (String) pair.onExtraCallbackWithResult();
        String str2 = (String) pair.IAuthTabCallback();
        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-57713709);
        if (objOnExtraCallback == null) {
            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", "") + 29426), 21 - ImageFormat.getBitsPerPixel(0), 24733 - TextUtils.lastIndexOf("", '0'), -842029757, false, "onWarmupCompleted", (Class[]) null);
        }
        Object obj = ((Field) objOnExtraCallback).get(null);
        try {
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-32901893);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (29426 - (Process.myTid() >> 22)), 22 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 24735, -817296789, false, "onExtraCallbackWithResult", new Class[0]);
            }
            writeRaw writerawOnWarmupCompleted = ((getBidderToken) ((Method) objOnExtraCallback2).invoke(obj, null)).onExtraCallback(new AdComponentViewApiProvider(str, str2)).onWarmupCompleted(new SetPrimaryAccountHandler$.ExternalSyntheticLambda16(new SetPrimaryAccountHandler$.ExternalSyntheticLambda15(str, str2)));
            Intrinsics.checkNotNullExpressionValue(writerawOnWarmupCompleted, "");
            writeRaw writerawOnNavigationEvent = writerawOnWarmupCompleted.onNavigationEvent(clearTid.onExtraCallback());
            Intrinsics.checkNotNullExpressionValue(writerawOnNavigationEvent, "");
            int i2 = asInterface + 45;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            return writerawOnNavigationEvent;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01b3 A[PHI: r0
      0x01b3: PHI (r0v9 int) = (r0v8 int), (r0v39 int) binds: [B:39:0x01b1, B:36:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5 A[PHI: r0
      0x01b5: PHI (r0v36 int) = (r0v8 int), (r0v39 int) binds: [B:39:0x01b1, B:36:0x019f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(short r28, byte r29, int r30, int r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTBSCertificate.a(short, byte, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Pair IAuthTabCallback(setText settext) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Pair) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1989332731, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1989332733, iOnExtraCallbackWithResult2, new Object[]{settext}, iOnExtraCallbackWithResult);
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -821198358, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 821198358, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult);
    }

    private static final deserializeIp asInterface(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (deserializeIp) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -815767355, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 815767359, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, iOnExtraCallbackWithResult);
    }

    private static final deserializeIp onExtraCallbackWithResult(Pair pair) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (deserializeIp) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -1665532269, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 1665532274, iOnExtraCallbackWithResult2, new Object[]{pair}, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallback(WebViewContentOwner webViewContentOwner, Pair pair) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -554444200, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 554444201, iOnExtraCallbackWithResult2, new Object[]{webViewContentOwner, pair}, iOnExtraCallbackWithResult);
    }

    private static final Unit onExtraCallback(setTopGuideBackgroundColor settopguidebackgroundcolor, Throwable th) {
        int iOnExtraCallbackWithResult = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 756390275, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), -756390272, iOnExtraCallbackWithResult2, new Object[]{settopguidebackgroundcolor, th}, iOnExtraCallbackWithResult);
    }
}
