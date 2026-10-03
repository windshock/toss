package o;

import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.google.gson.JsonObject;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentInquireQuoteRequest;
import im.toss.base.BaseActivity;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.shortValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.common.web.message.handlers.ElectronicDocumentHandler$;
import viva.republica.toss.network.model.SignatureRequest;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class onlyContainsUserCerts implements ALCFaceQuality {
    private static short[] onTransact;
    private static final byte[] $$a = {57, 22, -21, -92};
    private static final int $$b = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent = 478308999;
    private static int IAuthTabCallback = 481553626;
    private static int onExtraCallbackWithResult = -1538795457;
    private static int onWarmupCompleted = 831724161;
    private static byte[] onExtraCallback = {-87, 23, -84, -89, 121, 104, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r5, byte r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r0 = 1 - r5
            byte[] r1 = o.onlyContainsUserCerts.$$a
            int r7 = r7 * 10
            int r7 = 115 - r7
            int r6 = r6 * 4
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L18
            r3 = r5
            r4 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L26:
            r3 = r1[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onlyContainsUserCerts.$$c(int, byte, byte):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onNavigationEvent(setonoutofmemeryerrorcallback, th);
        }
        onNavigationEvent(setonoutofmemeryerrorcallback, th);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, NativeBlobModuleSpec nativeBlobModuleSpec) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
            return (Unit) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{setonoutofmemeryerrorcallback, nativeBlobModuleSpec}, -1628650440, iOnExtraCallbackWithResult2, 1628650440, iOnExtraCallbackWithResult);
        }
        int iOnExtraCallbackWithResult3 = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = MaxNativeAdListener.onExtraCallbackWithResult();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ NativeBlobModuleSpec onExtraCallbackWithResult(String str, TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        NativeBlobModuleSpec nativeBlobModuleSpecOnWarmupCompleted = onWarmupCompleted(str, typeUtils2);
        int i4 = IAuthTabCallbackDefault + 75;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return nativeBlobModuleSpecOnWarmupCompleted;
    }

    public static /* synthetic */ NativeBlobModuleSpec onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 1;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        NativeBlobModuleSpec nativeBlobModuleSpecOnExtraCallback = onExtraCallback(function1, obj);
        int i4 = IAuthTabCallbackStub + 35;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return nativeBlobModuleSpecOnExtraCallback;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i8 | i6)) | i7;
        int i10 = (~(i7 | (~i6) | i3)) | (~(i8 | i7 | i6));
        int i11 = (~(i6 | i3)) | (~(i5 | i3));
        int i12 = i5 + i3 + i4 + ((-1520811122) * i) + (1880343047 * i2);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i5) - 1254686720) + (875799021 * i3) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i4) + ((-206831616) * i) + (408289280 * i2) + ((-683737088) * i13);
        int i15 = ((i5 * (-660833811)) - 1995073173) + (i3 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i4 * (-660833671)) + (i * 644061726) + (i2 * (-2012083377)) + (i13 * (-1027145728));
        if (i14 + (i15 * i15 * 814809088) == 1) {
            return IAuthTabCallback(objArr);
        }
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[0];
        NativeBlobModuleSpec nativeBlobModuleSpec = (NativeBlobModuleSpec) objArr[1];
        int i16 = 2 % 2;
        JsonObject jsonObject = new JsonObject();
        Object[] objArr2 = new Object[1];
        b((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 9, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2, new char[]{'\t', 6, 65529, 7, 65533, 65531, 2, 65525, '\b'}, false, 330 - AndroidCharacter.getMirror('0'), objArr2);
        jsonObject.addProperty(((String) objArr2[0]).intern(), (String) SignatureRequest.IAuthTabCallback(MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), 840573528, new Object[]{nativeBlobModuleSpec}, -840573527, MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult(), MobilePaymentInquireQuoteRequest.onExtraCallbackWithResult()));
        ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
        Unit unit = Unit.INSTANCE;
        int i17 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i17 % 128;
        int i18 = i17 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted(BaseActivity baseActivity, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 23;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult(baseActivity, typeUtils7);
        }
        onExtraCallbackWithResult(baseActivity, typeUtils7);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 61;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        int i4 = IAuthTabCallbackDefault + 19;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 51;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = IAuthTabCallbackStub + 3;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return onoutofmemoryOnExtraCallback;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackDefault + 59;
        IAuthTabCallbackStub = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 87;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 71 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 5;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 9 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = IAuthTabCallbackStub + 13;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onWarmupCompleted(str);
            throw null;
        }
        ALCFaceValidation aLCFaceValidationOnWarmupCompleted = super/*o.drawTextBox*/.onWarmupCompleted(str);
        int i3 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 6 / 0;
        }
        return aLCFaceValidationOnWarmupCompleted;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallbackDefault + 37;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 == 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = IAuthTabCallbackDefault + 47;
        IAuthTabCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final NativeBlobModuleSpec onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 121;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(obj, "");
        NativeBlobModuleSpec nativeBlobModuleSpec = (NativeBlobModuleSpec) function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 73;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return nativeBlobModuleSpec;
    }

    private static final Unit onExtraCallbackWithResult(BaseActivity baseActivity, TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 85;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils7, "");
        typeUtils7.onNavigationEvent(baseActivity.getString(R.string.app_common_web_message_handlers___d61ae4cae6));
        typeUtils7.IAuthTabCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStub + 71;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
        return unit;
    }

    private static final NativeBlobModuleSpec onWarmupCompleted(String str, TypeUtils2 typeUtils2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(typeUtils2, "");
        NativeBlobModuleSpec nativeBlobModuleSpec = new NativeBlobModuleSpec(str);
        nativeBlobModuleSpec.onExtraCallbackWithResult(typeUtils2);
        int i2 = IAuthTabCallbackDefault + 109;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return nativeBlobModuleSpec;
        }
        throw null;
    }

    private static final void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 35;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackStub + 69;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 17 / 0;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 23;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallbackDefault + 101;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage == null) {
            int i2 = IAuthTabCallbackStub + 53;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i4 = i3 + 101;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            localizedMessage = "";
        }
        Object[] objArr = new Object[1];
        a((byte) ((-61) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31), 1191955246 - (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') - 49, 1781218748 - View.MeasureSpec.getSize(0), objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, localizedMessage, ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        return Unit.INSTANCE;
    }

    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        BaseActivity baseActivity;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        setText settext = new setText(jsonObject);
        BaseActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
        if (!(!(activity instanceof BaseActivity))) {
            int i2 = IAuthTabCallbackDefault + 111;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                baseActivity = activity;
                int i3 = 41 / 0;
            } else {
                baseActivity = activity;
            }
        } else {
            baseActivity = null;
        }
        BaseActivity baseActivity2 = baseActivity;
        if (baseActivity2 == null) {
            return;
        }
        Object[] objArr = new Object[1];
        a((byte) ((-4) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 106), 1191955250 - View.MeasureSpec.getMode(0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 53, 1781218779 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            int i4 = IAuthTabCallbackDefault + 17;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
        } else {
            deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = shortValue.IAuthTabCallback(shortValue.Companion, baseActivity2, UTF8Decoder.TOSS_CERT_SIGN_DOC, 78L, baseActivity2, false, false, (shortValue.onNavigationEvent) null, false, false, (String) null, new ElectronicDocumentHandler$.ExternalSyntheticLambda0(baseActivity2), 1008, (Object) null).onWarmupCompleted(new ElectronicDocumentHandler$.ExternalSyntheticLambda2(new ElectronicDocumentHandler$.ExternalSyntheticLambda1(strOnNavigationEvent))).onNavigationEvent(new ElectronicDocumentHandler$.ExternalSyntheticLambda4(new ElectronicDocumentHandler$.ExternalSyntheticLambda3(setonoutofmemeryerrorcallback)), new ElectronicDocumentHandler$.ExternalSyntheticLambda6(new ElectronicDocumentHandler$.ExternalSyntheticLambda5(setonoutofmemeryerrorcallback)));
            Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
            IconRoundCornerProgressBarSavedState.IAuthTabCallback(deserializeurinullablecollectionOnNavigationEvent, r8lambdakrhaimf1bm5cgjbilhp45vln_xq);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(int r21, int r22, char[] r23, boolean r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onlyContainsUserCerts.b(int, int, char[], boolean, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0202 A[PHI: r0
      0x0202: PHI (r0v9 int) = (r0v8 int), (r0v37 int) binds: [B:53:0x0200, B:50:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020c A[PHI: r0
      0x020c: PHI (r0v34 int) = (r0v8 int), (r0v37 int) binds: [B:53:0x0200, B:50:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r28, short r29, int r30, int r31, int r32, java.lang.Object[] r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onlyContainsUserCerts.a(byte, short, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Unit onWarmupCompleted(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{setonoutofmemeryerrorcallback, th}, -608726820, iOnExtraCallbackWithResult2, 608726821, iOnExtraCallbackWithResult);
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, NativeBlobModuleSpec nativeBlobModuleSpec) {
        int iOnExtraCallbackWithResult = MaxNativeAdListener.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = MaxNativeAdListener.onExtraCallbackWithResult();
        return (Unit) onWarmupCompleted(MaxNativeAdListener.onExtraCallbackWithResult(), MaxNativeAdListener.onExtraCallbackWithResult(), new Object[]{setonoutofmemeryerrorcallback, nativeBlobModuleSpec}, -1628650440, iOnExtraCallbackWithResult2, 1628650440, iOnExtraCallbackWithResult);
    }
}
