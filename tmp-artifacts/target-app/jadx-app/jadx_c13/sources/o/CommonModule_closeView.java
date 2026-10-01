package o;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import o.IdGeneratorExternalSyntheticLambda1;
import o._string;
import okhttp3.internal.url._UrlKt;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_closeView {
    private static final IdGeneratorExternalSyntheticLambda1 IAuthTabCallback;
    private static final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackDefault;
    private static final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackStub;
    private static final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackStubProxy;
    private static final IdGeneratorExternalSyntheticLambda1 IAuthTabCallback_Parcel;
    private static final IdGeneratorExternalSyntheticLambda1 ICustomTabsCallback;
    private static int ICustomTabsCallbackStub;
    private static final IdGeneratorExternalSyntheticLambda1 access000;
    private static final IdGeneratorExternalSyntheticLambda1 access100;
    private static final IdGeneratorExternalSyntheticLambda1 asBinder;
    private static final IdGeneratorExternalSyntheticLambda1 asInterface;
    private static final IdGeneratorExternalSyntheticLambda1 extraCallback;
    private static final IdGeneratorExternalSyntheticLambda1 extraCallbackWithResult;
    private static final IdGeneratorExternalSyntheticLambda1 getInterfaceDescriptor;
    private static final IdGeneratorExternalSyntheticLambda1 onActivityLayout;
    private static final IdGeneratorExternalSyntheticLambda1 onActivityResized;
    private static final IdGeneratorExternalSyntheticLambda1 onExtraCallback;
    public static final IdGeneratorExternalSyntheticLambda1 onExtraCallbackWithResult;
    private static final IdGeneratorExternalSyntheticLambda1 onMessageChannelReady;
    private static int onMinimized;
    public static final IdGeneratorExternalSyntheticLambda1 onNavigationEvent;
    private static final IdGeneratorExternalSyntheticLambda1 onTransact;
    public static final CommonModule_closeView onWarmupCompleted;
    private static final IdGeneratorExternalSyntheticLambda1 readTypedObject;
    private static final IdGeneratorExternalSyntheticLambda1 writeTypedObject;
    private static final byte[] $$a = {64, -61, 76, -90};
    private static final int $$b = Imgproc.COLOR_RGBA2YUV_YV12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackDefault = 0;
    private static int onUnminimized = 1;
    private static int onPostMessage = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3 = (s * 2) + 4;
        int i4 = s2 * 3;
        int i5 = 105 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            int i7 = 0;
            i5 = i4;
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            i2 = i7;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            i7 = i2 + 1;
            if (i2 == i4) {
            }
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i)) | i4;
        int i9 = ~i4;
        int i10 = ~(i9 | i | i3);
        int i11 = (~(i3 | i9)) | i | (~(i7 | i4));
        int i12 = i + i4 + i2 + ((-381402339) * i6) + ((-2062754392) * i5);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i) + 1063714816 + (1288888451 * i4) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i2) + (1454768128 * i6) + (808452096 * i5) + ((-1790509056) * i13);
        int i15 = ((i * (-1355236691)) - 921838429) + (i4 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i2 * (-1355236397)) + (i6 * (-1583251481)) + (i5 * 1682205048) + (i13 * (-427491328));
        int i16 = i14 + (i15 * i15 * 844169216);
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private CommonModule_closeView() {
    }

    static {
        ICustomTabsCallbackStub = 1;
        readTypedObject();
        onWarmupCompleted = new CommonModule_closeView();
        IdGeneratorExternalSyntheticLambda1.onExtraCallback onextracallback = IdGeneratorExternalSyntheticLambda1.Companion;
        onExtraCallbackWithResult = onextracallback.onExtraCallback("yy/MM/dd HH:mm:ss");
        onExtraCallback = onextracallback.onExtraCallback("yyyy. MM. dd");
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        IAuthTabCallback = onextracallback.onNavigationEvent("d MMMM yyyy", locale);
        asBinder = onextracallback.onExtraCallback("yyyy-MM-dd");
        IAuthTabCallbackDefault = onextracallback.onExtraCallback("HH:mm");
        IAuthTabCallbackStub = onextracallback.onExtraCallback("yy. MM. dd HH:mm");
        onTransact = onextracallback.onExtraCallback("yyyy.MM.dd | HH:mm");
        Intrinsics.checkNotNullExpressionValue(locale, "");
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1OnNavigationEvent = onextracallback.onNavigationEvent("yyyyMMdd", locale);
        onNavigationEvent = idGeneratorExternalSyntheticLambda1OnNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        onActivityResized = onextracallback.onNavigationEvent("yyyyMM", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        onMessageChannelReady = onextracallback.onNavigationEvent("yyyy-MM", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        onActivityLayout = onextracallback.onNavigationEvent("yyyy-M", locale);
        readTypedObject = idGeneratorExternalSyntheticLambda1OnNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        ICustomTabsCallback = onextracallback.onNavigationEvent("yyyy-MM-dd", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        Object[] objArr = new Object[1];
        a(View.resolveSize(0, 0) + 19, Drawable.resolveOpacity(0, 0) + 18, new char[]{'\"', '\"', '\"', 65494, 65526, 65526, 65494, '\r', '\r', 65481, 65521, 65521, 65507, 22, 22, 65507, 28, 28, '\"'}, false, 245 - Drawable.resolveOpacity(0, 0), objArr);
        IAuthTabCallback_Parcel = onextracallback.onNavigationEvent(((String) objArr[0]).intern(), locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        access100 = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ssZ", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        access000 = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        writeTypedObject = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", locale);
        IAuthTabCallbackStubProxy = onextracallback.onExtraCallback("yyyy년 M월 d일 HH:mm");
        Intrinsics.checkNotNullExpressionValue(locale, "");
        extraCallback = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        extraCallbackWithResult = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss.SSS", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        getInterfaceDescriptor = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ssX", locale);
        Intrinsics.checkNotNullExpressionValue(locale, "");
        asInterface = onextracallback.onNavigationEvent("yyyy-MM-dd'T'HH:mm:ss.SSSX", locale);
        int i = onPostMessage + 21;
        ICustomTabsCallbackStub = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 85;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = onExtraCallback;
        int i5 = i3 + 1;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 113;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = asBinder;
        int i5 = i2 + 83;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onUnminimized + 113;
        ICustomTabsCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = IAuthTabCallbackDefault;
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 103;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = onTransact;
        int i5 = i2 + 17;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 writeTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 47;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return onActivityResized;
        }
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 101;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = onMessageChannelReady;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 39;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = readTypedObject;
        int i5 = i2 + 59;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 25;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            return ICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 95;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = IAuthTabCallback_Parcel;
        int i5 = i2 + 95;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault + 21;
        onUnminimized = i2 % 128;
        int i3 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = access100;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 onTransact() {
        int i = 2 % 2;
        int i2 = onUnminimized + 115;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = access000;
        int i5 = i3 + 89;
        onUnminimized = i5 % 128;
        int i6 = i5 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallbackDefault;
        int i3 = i2 + 33;
        onUnminimized = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = writeTypedObject;
        int i5 = i2 + 3;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onUnminimized + 125;
        ICustomTabsCallbackDefault = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStubProxy;
        }
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 access100() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 29;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = extraCallback;
        int i5 = i2 + 101;
        ICustomTabsCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onUnminimized + 51;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = extraCallbackWithResult;
        int i5 = i3 + 69;
        onUnminimized = i5 % 128;
        if (i5 % 2 != 0) {
            return idGeneratorExternalSyntheticLambda1;
        }
        throw null;
    }

    public final IdGeneratorExternalSyntheticLambda1 asInterface() {
        int i = 2 % 2;
        int i2 = onUnminimized + 55;
        int i3 = i2 % 128;
        ICustomTabsCallbackDefault = i3;
        int i4 = i2 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = getInterfaceDescriptor;
        int i5 = i3 + 75;
        onUnminimized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return idGeneratorExternalSyntheticLambda1;
    }

    public final IdGeneratorExternalSyntheticLambda1 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 23;
        ICustomTabsCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        IdGeneratorExternalSyntheticLambda1 idGeneratorExternalSyntheticLambda1 = asInterface;
        int i5 = i2 + 13;
        ICustomTabsCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return idGeneratorExternalSyntheticLambda1;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c  */
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
            int i6 = $10 + 87;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onMinimized)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35125 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 23 - (Process.myPid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10278, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 55 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2167 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i9 = $10 + 97;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 5 % 5;
                }
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
            int i11 = $10 + 73;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 12844), (ViewConfiguration.getFadingEdgeLength() >> 16) + 55, 2168 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i13 = $10 + 1;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                i4 = 2083011369;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final IdGeneratorExternalSyntheticLambda1 onExtraCallback() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (IdGeneratorExternalSyntheticLambda1) onExtraCallbackWithResult(1542281737, iIAuthTabCallback2, iIAuthTabCallback, -1542281737, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3);
    }

    public final IdGeneratorExternalSyntheticLambda1 asBinder() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (IdGeneratorExternalSyntheticLambda1) onExtraCallbackWithResult(1967451170, iIAuthTabCallback2, iIAuthTabCallback, -1967451168, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3);
    }

    public final IdGeneratorExternalSyntheticLambda1 IAuthTabCallback_Parcel() {
        int iIAuthTabCallback = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback2 = _string.onNavigationEvent.IAuthTabCallback();
        int iIAuthTabCallback3 = _string.onNavigationEvent.IAuthTabCallback();
        return (IdGeneratorExternalSyntheticLambda1) onExtraCallbackWithResult(1000211423, iIAuthTabCallback2, iIAuthTabCallback, -1000211422, _string.onNavigationEvent.IAuthTabCallback(), new Object[]{this}, iIAuthTabCallback3);
    }

    static void readTypedObject() {
        onMinimized = 478309047;
    }
}
