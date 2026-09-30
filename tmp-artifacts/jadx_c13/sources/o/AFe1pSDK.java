package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.components.tuba.variable.v2.spec.DefaultVar;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt___RangesKt;
import o.AFe1pSDK;
import o.AUTextView;
import o.adInfo;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1pSDK implements fromRawRes {
    public static final onNavigationEvent Companion;
    private static final wie2 onExtraCallback;
    private static int onNavigationEvent;
    private static int onTransact;
    private final TextRoundCornerProgressBarSavedState1 IAuthTabCallback;
    private static final byte[] $$a = {15, -112, -70, -94};
    private static final int $$b = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackStub = 0;
    private static int onWarmupCompleted = 0;
    private static int onExtraCallbackWithResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, short s2) {
        int i2;
        int i3 = 105 - (s2 * 4);
        int i4 = 4 - (i * 3);
        int i5 = s * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i7 + 1;
            i3 = i4 + i6;
            i4 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
                return new String(bArr2, 0);
            }
            i2++;
            i6 = bArr[i4];
            int i9 = i3;
            i7 = i4;
            i4 = i9;
            int i82 = i7 + 1;
            i3 = i4 + i6;
            i4 = i82;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    public static /* synthetic */ Unit onExtraCallback(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(adinfo);
        int i4 = onExtraCallbackWithResult + 123;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public AFe1pSDK(@NotNull TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1) {
        Intrinsics.checkNotNullParameter(textRoundCornerProgressBarSavedState1, "");
        this.IAuthTabCallback = textRoundCornerProgressBarSavedState1;
    }

    public List<DefaultVar> IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.IAuthTabCallback;
        Object[] objArr = new Object[1];
        a((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 21, Drawable.resolveOpacity(0, 0) + 1, new char[]{65525, '\n', 65526, 65532, 16, 65535, 0, 4, 65531, 16, 4, 3, 65522, 7, 16, 5, 65533, 6, 65522, 65527, 65526}, true, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 269, objArr);
        if (textRoundCornerProgressBarSavedState1.onNavigationEvent(((String) objArr[0]).intern())) {
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = this.IAuthTabCallback;
            Object[] objArr2 = new Object[1];
            a(21 - View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 1, new char[]{65525, '\n', 65526, 65532, 16, 65535, 0, 4, 65531, 16, 4, 3, 65522, 7, 16, 5, 65533, 6, 65522, 65527, 65526}, true, 269 - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0), objArr2);
            String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState12.onExtraCallbackWithResult(((String) objArr2[0]).intern(), _UrlKt.FRAGMENT_ENCODE_SET);
            try {
                wie2 wie2Var = onExtraCallback;
                wie2Var.onExtraCallback();
                List<DefaultVar> list = (List) wie2Var.onExtraCallback(new checkCanOpenLandingPage(DefaultVar.Companion.serializer()), strOnExtraCallbackWithResult);
                int i4 = onWarmupCompleted + 99;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return list;
            } catch (Exception e) {
                AFd1iSDKAFa1zSDK aFd1iSDKAFa1zSDK = AFd1iSDKAFa1zSDK.onNavigationEvent;
                String message = e.getMessage();
                Object[] objArr3 = new Object[1];
                a(TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 22, 21 - (Process.myPid() >> 22), new char[]{18, 65535, 65534, 65523, 65534, 15, 65513, '\f', 0, 65534, '\t', 65505, 65534, 17, 65534, 65520, '\f', 18, 15, 0, 2, 65521}, false, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 291, objArr3);
                AFd1iSDKAFa1zSDK.IAuthTabCallback(aFd1iSDKAFa1zSDK, ((String) objArr3[0]).intern(), message, e, (Map) null, (String) null, false, (String) null, 120, (Object) null);
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState13 = this.IAuthTabCallback;
                Object[] objArr4 = new Object[1];
                a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{65525, '\n', 65526, 65532, 16, 65535, 0, 4, 65531, 16, 4, 3, 65522, 7, 16, 5, 65533, 6, 65522, 65527, 65526}, true, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 270, objArr4);
                textRoundCornerProgressBarSavedState13.onTransact(((String) objArr4[0]).intern());
            }
        }
        int i6 = onWarmupCompleted + 33;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public void IAuthTabCallback(@NotNull List<DefaultVar> list) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = this.IAuthTabCallback;
        wie2 wie2Var = onExtraCallback;
        wie2Var.onExtraCallback();
        String strOnWarmupCompleted = wie2Var.onWarmupCompleted(new checkCanOpenLandingPage(DefaultVar.Companion.serializer()), list);
        Object[] objArr = new Object[1];
        a(22 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{65525, '\n', 65526, 65532, 16, 65535, 0, 4, 65531, 16, 4, 3, 65522, 7, 16, 5, 65533, 6, 65522, 65527, 65526}, true, Gravity.getAbsoluteGravity(0, 0) + 270, objArr);
        textRoundCornerProgressBarSavedState1.onNavigationEvent(((String) objArr[0]).intern(), strOnWarmupCompleted);
        int i2 = onWarmupCompleted + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public String onNavigationEvent(@NotNull String str) {
        String strIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 97;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(str);
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            strIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(str);
        }
        int i4 = onExtraCallbackWithResult + 63;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    public void onExtraCallback(@NotNull String str, @NotNull String str2) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 101;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.IAuthTabCallback.onNavigationEvent(str, str2);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.IAuthTabCallback.onNavigationEvent(str, str2);
        int i3 = onExtraCallbackWithResult + 29;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallback.onTransact(str);
        int i4 = onExtraCallbackWithResult + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public Map<String, String> onNavigationEvent(@NotNull String... strArr) {
        Pair pairIAuthTabCallback;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(access8200.onNavigationEvent(strArr.length), 16));
        int i2 = onExtraCallbackWithResult + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        for (String str : strArr) {
            linkedHashMap.put(str, onNavigationEvent(str));
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                pairIAuthTabCallback = getWrite.IAuthTabCallback(str2, str3);
                int i4 = onExtraCallbackWithResult + 23;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
            } else {
                pairIAuthTabCallback = null;
            }
            if (pairIAuthTabCallback != null) {
                arrayList.add(pairIAuthTabCallback);
                int i6 = onWarmupCompleted + 43;
                onExtraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        return access8000.onWarmupCompleted(arrayList);
    }

    public void onExtraCallbackWithResult(@NotNull Map<String, String> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        int i2 = onWarmupCompleted + 111;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int i4 = onExtraCallbackWithResult + 53;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            onExtraCallback(entry.getKey(), entry.getValue());
        }
    }

    public static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    static {
        onTransact = 1;
        onNavigationEvent();
        Companion = new onNavigationEvent(null);
        onExtraCallback = videoFrameChanged.onWarmupCompleted(null, new Function1() { // from class: im.toss.tosssecurities.tuba.variable.v2.impl.TubaVariableLocalDataSourceImpl$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallback = AFe1pSDK.onExtraCallback((adInfo) obj);
                if (i3 == 0) {
                    int i4 = 63 / 0;
                }
                return unitOnExtraCallback;
            }
        }, 1, null);
        int i = IAuthTabCallbackStub + 51;
        onTransact = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(adInfo adinfo) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 49;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(adinfo, "");
        adinfo.IAuthTabCallbackDefault(true);
        adinfo.IAuthTabCallback(true);
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        adInfo.onExtraCallbackWithResult(-186882588, AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback3, 186882589, new Object[]{adinfo, true}, iOnExtraCallback2, iOnExtraCallback);
        adinfo.onExtraCallbackWithResult(true);
        adinfo.onNavigationEvent(false);
        adinfo.onNavigationEvent(tnycx.onWarmupCompleted(Reflection.getOrCreateKotlinClass(Object.class), GetMotionInteractionState.onExtraCallback));
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 87;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 37;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onNavigationEvent)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getTapTimeout() >> 16)), 24 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET) + 10279, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 12843), ImageFormat.getBitsPerPixel(0) + 56, (ViewConfiguration.getLongPressTimeout() >> 16) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 13;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i11 = $10 + 49;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0)), ((Process.getThreadPriority(0) + 20) >> 6) + 55, View.MeasureSpec.makeMeasureSpec(0, 0) + 2167, 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static void onNavigationEvent() {
        onNavigationEvent = 478309014;
    }
}
