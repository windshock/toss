package o;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonObject;
import im.toss.featurescommon.address.overseas.presentation.screen.InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$;
import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.TBSCertList;
import o.UST_CERT_GetPublicKeyInfo;
import o.onTooManyRedirects;
import o.postHandle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class TBSCertList implements ALCFaceQuality {
    private final Lazy IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.KycMessageHandler$$ExternalSyntheticLambda0
        public final Object invoke() {
            return TBSCertList.IAuthTabCallback();
        }
    });
    private final Lazy onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.KycMessageHandler$$ExternalSyntheticLambda1
        public final Object invoke() {
            return TBSCertList.onWarmupCompleted();
        }
    });
    private final Lazy onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.web.message.handlers.KycMessageHandler$$ExternalSyntheticLambda2
        public final Object invoke() {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            return (postHandle) TBSCertList.onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1399963858, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1399963860);
        }
    });
    private static final byte[] $$a = {4, 8, -22, -73};
    private static final int $$b = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onTransact = 0;
    private static int asInterface = 1;
    private static int onExtraCallback = 478308923;
    private static char[] onExtraCallbackWithResult = {27333, 27483, 27482, 27481, 27483, 27313, 27470, 27486, 27456, 27153, 27379, 27277, 27268, 27277, 27277, 27268, 27277, 27189, 27315, 27467, 27468, 27314, 27321, 27323, 27466, 27461, 27467, 27317, 27314, 27467, 27260, 27160, 27156, 27174, 27175, 27168, 27199, 27171, 27157, 27383, 27377, 27279, 27376, 27361, 27386, 27276, 27382, 27184, 27347, 27347, 27329, 27331, 27331, 27345, 27347, 27329, 27352, 27344, 27357, 27146, 27332, 27358, 27356, 27329, 27189, 27188, 27336, 27341, 27339, 27195, 27195, 27336, 27337, 27336, 27331, 27238, 27142, 27146, 27144};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r7, int r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = 105 - r9
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = o.TBSCertList.$$a
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TBSCertList.$$c(short, int, short):java.lang.String");
    }

    public static /* synthetic */ Unit IAuthTabCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 39;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(setonoutofmemeryerrorcallback, th);
        int i4 = asInterface + 47;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ getEnableJsT2 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 103;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getEnableJsT2 getenablejst2IAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return getenablejst2IAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        String str;
        Object next;
        int i7 = ~i4;
        int i8 = ~(i7 | i6);
        int i9 = (~(i7 | i2)) | i8 | (~(i6 | i2));
        int i10 = (~(i7 | (~i2))) | i8;
        int i11 = (~(i2 | i4)) | (~((~i6) | i4));
        int i12 = i4 + i6 + i + (929125522 * i3) + (1849324972 * i5);
        int i13 = i12 * i12;
        int i14 = ((i4 * (-2058557531)) - 518432259) + (i6 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + ((-2058558961) * i) + (548722830 * i3) + (1549712660 * i5) + (i13 * (-2087387136));
        int i15 = (1419820811 * i4) + 1146290176 + ((-1462591364) * i6) + (470851707 * i9) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i) + ((-291241984) * i3) + (1012400128 * i5) + ((-1810169856) * i13) + (i14 * i14 * (-343605248));
        if (i15 != 1) {
            return i15 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr);
        }
        TBSCertList tBSCertList = (TBSCertList) objArr[0];
        r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq = (r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ) objArr[1];
        JsonObject jsonObject = (JsonObject) objArr[2];
        setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback = (setOnOutOfMemeryErrorCallback) objArr[3];
        int i16 = 2 % 2;
        setText settext = new setText(jsonObject);
        Object[] objArr2 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 10, 6 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{65531, 2, 65514, 15, 6, 65531, 65532, 11, 4, 4}, false, 124 - Color.argb(0, 0, 0, 0), objArr2);
        String upperCase = settext.onNavigationEvent(((String) objArr2[0]).intern(), "").toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        Object[] objArr3 = new Object[1];
        a(true, new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{0, 9, 164, 1}, objArr3);
        boolean zBooleanValue = ((Boolean) setText.onWarmupCompleted(InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), -577792816, InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), InternalOverseasAddressSearchScreenKt$InternalOverseasAddressSearchScreen$3$1$5$1$.ExternalSyntheticLambda1.onWarmupCompleted(), 577792817, new Object[]{settext, ((String) objArr3[0]).intern(), false})).booleanValue();
        Object[] objArr4 = new Object[1];
        a(false, new byte[]{0, 1, 1, 0, 1, 1, 0, 1}, new int[]{9, 8, 88, 6}, objArr4);
        String strOnNavigationEvent = settext.onNavigationEvent(((String) objArr4[0]).intern(), "");
        if (strOnNavigationEvent.length() == 0) {
            int i17 = asInterface + 91;
            onTransact = i17 % 128;
            int i18 = i17 % 2;
            str = null;
        } else {
            str = strOnNavigationEvent;
        }
        Iterator it = getInterceptor.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((getInterceptor) next).name(), upperCase)) {
                break;
            }
        }
        getInterceptor getinterceptor = (getInterceptor) next;
        if (getinterceptor == null) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr5 = new Object[1];
            b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, 8 - TextUtils.getOffsetAfter("", 0), new char[]{6, 15, '\n', 7, 6, 5, 15, 65526, 65473, 65499, 6, 17, 26, 65525, '\r', 6, 15, 15, 22, 7, 65473, 5}, true, 113 - Color.green(0), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb.append(upperCase);
            String string = sb.toString();
            Object[] objArr6 = new Object[1];
            b((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 19, 20 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{65527, 2, 11, 6, 17, 65534, 65527, 0, 0, 7, 65528, 17, 65526, 65531, 65534, 65523, '\b', 0, 65531}, true, TextUtils.getOffsetBefore("", 0) + 96, objArr6);
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, string, ((String) objArr6[0]).intern(), (Map) null, 4, (Object) null);
            int i19 = onTransact + 103;
            asInterface = i19 % 128;
            int i20 = i19 % 2;
        } else {
            FragmentActivity activity = r8lambdakrhaimf1bm5cgjbilhp45vln_xq.getActivity();
            if (activity == null) {
                int i21 = asInterface + 65;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                Object[] objArr7 = new Object[1];
                b(25 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{4, 11, 1, 0, 11, '\b', 0, 21, 0, 65471, 19, 14, '\r', 65471, 18, '\b', 65471, 24, 19, '\b', 21, '\b', 19, 2, 65504}, true, 114 - TextUtils.indexOf((CharSequence) "", '0'), objArr7);
                String strIntern = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                a(true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{17, 13, 178, 0}, objArr8);
                setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, strIntern, ((String) objArr8[0]).intern(), (Map) null, 4, (Object) null);
            } else {
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(r8lambdakrhaimf1bm5cgjbilhp45vln_xq), (CoroutineContext) null, (setRandomHost) null, tBSCertList.new onNavigationEvent(activity, getinterceptor, str, zBooleanValue, setonoutofmemeryerrorcallback, null), 3, (Object) null);
            }
        }
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, setExtraJsT2MapStr setextrajst2mapstr) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 109;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(setonoutofmemeryerrorcallback, setextrajst2mapstr);
        int i4 = asInterface + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 59;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        postHandle posthandleIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        int i4 = onTransact + 57;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return posthandleIAuthTabCallbackDefault;
    }

    public static /* synthetic */ getBillingPeriod onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = asInterface + 21;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        getBillingPeriod getbillingperiod = (getBillingPeriod) onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -921010855, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 921010855);
        int i4 = onTransact + 33;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return getbillingperiod;
        }
        throw null;
    }

    public static final /* synthetic */ postHandle onNavigationEvent(TBSCertList tBSCertList) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        postHandle posthandleOnTransact = tBSCertList.onTransact();
        int i4 = onTransact + 101;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return posthandleOnTransact;
    }

    public /* bridge */ onOutOfMemory onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 121;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        onOutOfMemory onoutofmemoryOnExtraCallback = super/*o.drawTextBox*/.onExtraCallback();
        int i4 = onTransact + 15;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return onoutofmemoryOnExtraCallback;
        }
        throw null;
    }

    @Deprecated
    public /* bridge */ void onExtraCallback(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Bundle bundle, @Nullable Uri uri) {
        int i3 = 2 % 2;
        int i4 = asInterface + 45;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        super.onExtraCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, bundle, uri);
        int i6 = asInterface + 59;
        onTransact = i6 % 128;
        int i7 = i6 % 2;
    }

    public /* bridge */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            super/*o.drawTextBox*/.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zOnExtraCallbackWithResult = super/*o.drawTextBox*/.onExtraCallbackWithResult();
        int i3 = asInterface + 75;
        onTransact = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 10 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public /* bridge */ boolean onNavigationEvent() {
        boolean zOnNavigationEvent;
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
            int i3 = 22 / 0;
        } else {
            zOnNavigationEvent = super/*o.drawTextBox*/.onNavigationEvent();
        }
        int i4 = asInterface + 13;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* bridge */ ALCFaceValidation onWarmupCompleted(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return super/*o.drawTextBox*/.onWarmupCompleted(str);
        }
        super/*o.drawTextBox*/.onWarmupCompleted(str);
        throw null;
    }

    public /* bridge */ void onWarmupCompleted(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, int i, int i2, @Nullable Intent intent) {
        int i3 = 2 % 2;
        int i4 = asInterface + 27;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        super.onWarmupCompleted(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, str, jsonObject, setonoutofmemeryerrorcallback, i, i2, intent);
        if (i5 != 0) {
            obj.hashCode();
            throw null;
        }
        int i6 = asInterface + 3;
        onTransact = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final getEnableJsT2 asBinder() {
        int i = 2 % 2;
        int i2 = onTransact + 107;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        getEnableJsT2 getenablejst2 = (getEnableJsT2) this.IAuthTabCallback.getValue();
        int i4 = asInterface + 11;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return getenablejst2;
    }

    private static final getEnableJsT2 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = asInterface + 83;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getEnableJsT2 getenablejst2ITrustedWebActivityCallback_Parcel = ((getUcJsT2) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getUcJsT2.class)).ITrustedWebActivityCallback_Parcel();
        int i4 = onTransact + 105;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getenablejst2ITrustedWebActivityCallback_Parcel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onNavigationEvent;
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ setOnOutOfMemeryErrorCallback $callbackProxy;
        final /* synthetic */ getInterceptor $funnel;
        final /* synthetic */ String $referrer;
        final /* synthetic */ boolean $skipIntro;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        private static final byte[] $$a = {106, 40, -98, -117};
        private static final int $$b = 134;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackStub = 0;
        private static int asInterface = 1;
        private static int onExtraCallback = -199768658;
        private static int onWarmupCompleted = -1538795404;
        private static int IAuthTabCallback = -67475316;
        private static byte[] onExtraCallbackWithResult = {-69, -45, 33, -47, -37, 34, -39, 39, 40, 103, -100, -48, 47, -42, 115, -35, -26, -34, -40, -35, 44, 33, 102, 35, -97, -41, 39, 45, 37, 39, 102, -35, -26, -36, -36, 38, 42, -41, 111, 35, -107, -33, 112, -112, 36, 47, -38, -126, -59, -58, 40, -58, -55, -103, -95, -81, 91, 81, 90, -87, -75, 89, 80, 67, -65, 83};

        private static String $$c(int i, int i2, int i3) {
            int i4 = 4 - (i * 2);
            byte[] bArr = $$a;
            int i5 = (i3 * 4) + 115;
            int i6 = i2 * 2;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            int i8 = -1;
            if (bArr == null) {
                i5 += -i7;
                i4++;
            }
            while (true) {
                i8++;
                bArr2[i8] = (byte) i5;
                if (i8 == i7) {
                    return new String(bArr2, 0);
                }
                i5 += -bArr[i4];
                i4++;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(FragmentActivity fragmentActivity, getInterceptor getinterceptor, String str, boolean z, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$activity = fragmentActivity;
            this.$funnel = getinterceptor;
            this.$referrer = str;
            this.$skipIntro = z;
            this.$callbackProxy = setonoutofmemeryerrorcallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = TBSCertList.this.new onNavigationEvent(this.$activity, this.$funnel, this.$referrer, this.$skipIntro, this.$callbackProxy, access13800Var);
            int i2 = asInterface + 29;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 51;
            asInterface = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = IAuthTabCallbackStub + 35;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 101;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            onNavigationEvent onnavigationeventCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return onnavigationeventCreate.invokeSuspend(unit);
            }
            onnavigationeventCreate.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onWarmupCompleted implements Function1<onTooManyRedirects.onWarmupCompleted.onNavigationEvent, String> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static long IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;
            private static int onNavigationEvent;
            public static final onWarmupCompleted onWarmupCompleted;

            static {
                onWarmupCompleted();
                onWarmupCompleted = new onWarmupCompleted();
                int i = onExtraCallback + 77;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            onWarmupCompleted() {
            }

            private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
                char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(IAuthTabCallback ^ (-7907085296252847348L), cArr, i);
                timelineExternalSyntheticLambda0.onNavigationEvent = 4;
                while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
                    int i3 = $11 + 73;
                    $10 = i3 % 128;
                    int i4 = i3 % 2;
                    timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
                    int i5 = timelineExternalSyntheticLambda0.onNavigationEvent;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4]), Long.valueOf(timelineExternalSyntheticLambda0.onExtraCallbackWithResult), Long.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-729133501);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45811 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 84, 21233 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -439701293, false, "e", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrOnWarmupCompleted[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(849243011);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (14186 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 19 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 8808, 64918803, false, "d", new Class[]{Object.class, Object.class});
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
                String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
                int i6 = $11 + 79;
                $10 = i6 % 128;
                if (i6 % 2 == 0) {
                    objArr[0] = str;
                } else {
                    int i7 = 75 / 0;
                    objArr[0] = str;
                }
            }

            public /* synthetic */ Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                IAuthTabCallbackDefault = i2 % 128;
                onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent = (onTooManyRedirects.onWarmupCompleted.onNavigationEvent) obj;
                if (i2 % 2 != 0) {
                    return onExtraCallback(onnavigationevent);
                }
                onExtraCallback(onnavigationevent);
                throw null;
            }

            public final String onExtraCallback(onTooManyRedirects.onWarmupCompleted.onNavigationEvent onnavigationevent) throws Throwable {
                Object obj;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                if (onnavigationevent != onTooManyRedirects.onWarmupCompleted.onNavigationEvent.RECOMMENDED_EXIT) {
                    Object[] objArr = new Object[1];
                    a(new char[]{12964, 13027, 32605, 46489, 19278, 56867, 33562, 56470, 6312, 16690, 25059}, View.resolveSizeAndState(0, 0, 0), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    int i2 = onNavigationEvent + 95;
                    IAuthTabCallbackDefault = i2 % 128;
                    int i3 = i2 % 2;
                    return strIntern;
                }
                int i4 = IAuthTabCallbackDefault + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr2 = new Object[1];
                    a(new char[]{48310, 48357, 31598, 45491, 37670, 1603, 9695, 31309, 38590, 17688, 47491}, View.resolveSize(0, 1), objArr2);
                    obj = objArr2[0];
                } else {
                    Object[] objArr3 = new Object[1];
                    a(new char[]{48310, 48357, 31598, 45491, 37670, 1603, 9695, 31309, 38590, 17688, 47491}, View.resolveSize(0, 0), objArr3);
                    obj = objArr3[0];
                }
                return ((String) obj).intern();
            }

            static void onWarmupCompleted() {
                IAuthTabCallback = -1792575349821165158L;
            }
        }

        static final class onExtraCallback implements Function1<onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent, String> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 0;
            private static int asBinder = 0;
            private static int asInterface = 1;
            public static final onExtraCallback onExtraCallback;
            private static int onExtraCallbackWithResult = 1;
            private static char[] onNavigationEvent;
            private static char onWarmupCompleted;

            static {
                onExtraCallback();
                onExtraCallback = new onExtraCallback();
                int i = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i % 128;
                int i2 = i % 2;
            }

            onExtraCallback() {
            }

            public /* synthetic */ Object invoke(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 85;
                asInterface = i2 % 128;
                onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent = (onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent) obj;
                if (i2 % 2 == 0) {
                    onExtraCallbackWithResult(onnavigationevent);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                String strOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent);
                int i3 = asBinder + 121;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return strOnExtraCallbackWithResult;
            }

            public final String onExtraCallbackWithResult(onTooManyRedirects.onExtraCallbackWithResult.onNavigationEvent onnavigationevent) throws Throwable {
                int i = 2 % 2;
                int i2 = asBinder + 17;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(onnavigationevent, "");
                Object[] objArr = new Object[1];
                a(new char[]{6, 2, 0, 6, 0, 7, 13826}, (byte) (37 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, objArr);
                String strIntern = ((String) objArr[0]).intern();
                int i4 = asInterface + 27;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return strIntern;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0160  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void a(char[] r31, byte r32, int r33, java.lang.Object[] r34) throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 882
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: o.TBSCertList.onNavigationEvent.onExtraCallback.a(char[], byte, int, java.lang.Object[]):void");
            }

            static void onExtraCallback() {
                onNavigationEvent = new char[]{65014, 65018, 64968, 65015, 64971, 65012, 65021, 64969, 64995};
                onWarmupCompleted = (char) 51242;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[PHI: r1
          0x007c: PHI (r1v26 java.lang.Object) = (r1v20 java.lang.Object), (r1v27 java.lang.Object) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026 A[PHI: r6
          0x0026: PHI (r6v2 int) = (r6v1 int), (r6v7 int) binds: [B:8:0x0024, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 407
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.TBSCertList.onNavigationEvent.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            int i4;
            long j;
            int length;
            byte[] bArr;
            int i5;
            int length2;
            byte[] bArr2;
            int i6;
            int i7 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43424), 42 - KeyEvent.getDeadChar(0, 0), 22439 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i8 = $10 + 107;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    int i10 = $11;
                    int i11 = i10 + 7;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    byte[] bArr3 = onExtraCallbackWithResult;
                    if (bArr3 != null) {
                        int i13 = i10 + 103;
                        int i14 = i13 % 128;
                        $10 = i14;
                        if (i13 % 2 != 0) {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                            i6 = 1;
                        } else {
                            length2 = bArr3.length;
                            bArr2 = new byte[length2];
                            i6 = 0;
                        }
                        int i15 = i14 + 23;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        while (i6 < length2) {
                            Object[] objArr3 = {Integer.valueOf(bArr3[i6])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.combineMeasuredStates(0, 0) + 12843), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 54, 2167 - (ViewConfiguration.getScrollBarSize() >> 8), -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            i6++;
                        }
                        bArr3 = bArr2;
                    }
                    if (bArr3 != null) {
                        int i17 = $11 + 121;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        byte[] bArr4 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43424), View.combineMeasuredStates(0, 0) + 42, 22439 - (ViewConfiguration.getLongPressTimeout() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr4[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                        j = -4629411779493505016L;
                    } else {
                        j = -4629411779493505016L;
                        iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (onExtraCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                } else {
                    j = -4629411779493505016L;
                }
                if (iIntValue > 0) {
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (onExtraCallback ^ j)) + i4;
                    try {
                        Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback), sb};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), 86 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 9567 - Color.argb(0, 0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        }
                        ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        byte[] bArr5 = onExtraCallbackWithResult;
                        if (bArr5 != null) {
                            int i19 = $11 + 13;
                            $10 = i19 % 128;
                            if (i19 % 2 != 0) {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i5 = 1;
                            } else {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i5 = 0;
                            }
                            while (i5 < length) {
                                bArr[i5] = (byte) (bArr5[i5] ^ (-4629411779493505016L));
                                i5++;
                            }
                            bArr5 = bArr;
                        }
                        boolean z = bArr5 != null;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                        while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                            int i20 = $11 + 95;
                            $10 = i20 % 128;
                            int i21 = i20 % 2;
                            if (z) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                            sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                            trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                            trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    private final getBillingPeriod asInterface() {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        getBillingPeriod getbillingperiod = (getBillingPeriod) this.onNavigationEvent.getValue();
        int i4 = onTransact + 53;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return getbillingperiod;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            return ((UST_CERT_GetPublicKeyInfo.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_GetPublicKeyInfo.IAuthTabCallback.class)).setSupportProgressBarVisibility();
        }
        Response response2 = Response.onNavigationEvent;
        ((UST_CERT_GetPublicKeyInfo.IAuthTabCallback) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), UST_CERT_GetPublicKeyInfo.IAuthTabCallback.class)).setSupportProgressBarVisibility();
        throw null;
    }

    private final postHandle onTransact() {
        int i = 2 % 2;
        int i2 = asInterface + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        postHandle posthandle = (postHandle) this.onWarmupCompleted.getValue();
        int i4 = onTransact + 11;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 80 / 0;
        }
        return posthandle;
    }

    private static final postHandle IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        postHandle posthandleAddOnNewIntentListener = ((getController) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), getController.class)).addOnNewIntentListener();
        int i4 = onTransact + 27;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            return posthandleAddOnNewIntentListener;
        }
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: o.getInstallmentPlanDetails */
    public void onExtraCallbackWithResult(@NotNull r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, @NotNull String str, @NotNull JsonObject jsonObject, @NotNull setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(setonoutofmemeryerrorcallback, "");
        getPricingPhaseList getpricingphaselistOnExtraCallbackWithResult = asInterface().onExtraCallbackWithResult();
        int i2 = onExtraCallbackWithResult.IAuthTabCallback[getpricingphaselistOnExtraCallbackWithResult.ordinal()];
        if (i2 == 1) {
            IAuthTabCallback(r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback);
            return;
        }
        int i3 = asInterface;
        int i4 = i3 + 1;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        if (i2 != 2) {
            int i6 = i3 + 95;
            onTransact = i6 % 128;
            int i7 = i6 % 2;
            if (i2 != 3) {
                if (i2 == 4) {
                    throw new getInstallmentPlanDetails(getpricingphaselistOnExtraCallbackWithResult);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback}, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -785969860, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 785969861);
    }

    private static void b(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        int i6 = $11 + 39;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') + 35077), Process.getGidForName("") + 24, (ViewConfiguration.getTapTimeout() >> 16) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf("", '0', 0)), 55 - (Process.myPid() >> 22), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback2).invoke(null, objArr3);
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
        if (i2 > 0) {
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $10 + 23;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                try {
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12843), 55 - View.MeasureSpec.getSize(0), 2168 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    i4 = 2083011369;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr2;
        }
        String str = new String(cArr3);
        int i10 = $11 + 81;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 71 / 0;
            objArr[0] = str;
        }
    }

    private static final Unit onExtraCallback(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, setExtraJsT2MapStr setextrajst2mapstr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setextrajst2mapstr, "");
        if (setextrajst2mapstr.isSuccess() || setextrajst2mapstr == setExtraJsT2MapStr.NOT_KYC_TARGET) {
            JsonObject jsonObject = new JsonObject();
            Object[] objArr = new Object[1];
            b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 6, 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{7, 65525, 65529, 6, 2, 3}, true, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 126, objArr);
            jsonObject.addProperty(((String) objArr[0]).intern(), setextrajst2mapstr.name());
            ALCFaceBox.onWarmupCompleted(setonoutofmemeryerrorcallback, jsonObject);
            i = asInterface + 39;
            onTransact = i % 128;
        } else {
            setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, "", setextrajst2mapstr.name(), (Map) null, 4, (Object) null);
            i = onTransact + 99;
            asInterface = i % 128;
        }
        int i3 = i % 2;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void IAuthTabCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r30, com.google.gson.JsonObject r31, o.setOnOutOfMemeryErrorCallback r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TBSCertList.IAuthTabCallback(o.r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ, com.google.gson.JsonObject, o.setOnOutOfMemeryErrorCallback):void");
    }

    private static final Unit onNavigationEvent(setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback, Throwable th) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = asInterface + 17;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        String message = th.getMessage();
        if (message == null) {
            int i4 = asInterface + 99;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = message;
        }
        Object[] objArr = new Object[1];
        a(true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, new int[]{17, 13, 178, 0}, objArr);
        setOnOutOfMemeryErrorCallback.onNavigationEvent(setonoutofmemeryerrorcallback, str, ((String) objArr[0]).intern(), (Map) null, 4, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i6 = onTransact + 1;
        asInterface = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private static void a(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = onExtraCallbackWithResult;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = $11 + 9;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 41;
                $10 = i10 % 128;
                if (i10 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.lastIndexOf("", c, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35, ExpandableListView.getPackedPositionGroup(0L) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((Process.myTid() >> 22) + 35283), 35 - View.resolveSizeAndState(0, 0, 0), TextUtils.getTrimmedLength("") + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9++;
                }
                i = 2;
                c = '0';
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
                    int i11 = $10 + 69;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 66, 16718 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                        throw null;
                    }
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 10935), 65 - (ViewConfiguration.getPressedStateDuration() >> 16), Color.red(0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr6 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.alpha(0), 29 - KeyEvent.normalizeMetaState(0), 17658 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback5).invoke(null, objArr6)).charValue();
                }
                c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr7 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49466), ExpandableListView.getPackedPositionType(0L) + 70, (ViewConfiguration.getTapTimeout() >> 16) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            int i16 = $10 + 107;
            $11 = i16 % 128;
            while (true) {
                int i17 = i16 % 2;
                if (trackGroupExternalSyntheticLambda0.onNavigationEvent >= i4) {
                    break;
                }
                int i18 = $11 + 101;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                i16 = $11 + 121;
                $10 = i16 % 128;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static /* synthetic */ postHandle IAuthTabCallbackStub() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (postHandle) onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1399963858, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1399963860);
    }

    private final void onNavigationEvent(r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq, JsonObject jsonObject, setOnOutOfMemeryErrorCallback setonoutofmemeryerrorcallback) throws Throwable {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[]{this, r8lambdakrhaimf1bm5cgjbilhp45vln_xq, jsonObject, setonoutofmemeryerrorcallback}, iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -785969860, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 785969861);
    }

    private static final getBillingPeriod access000() {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (getBillingPeriod) onExtraCallback(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), new Object[0], iOnWarmupCompleted, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -921010855, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 921010855);
    }
}
