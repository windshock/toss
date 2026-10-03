package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.credit.detail.loan.ComparisonTrackLog$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_PKCS12_GetCertWithPFX_ENCPKCS8 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean IAuthTabCallback = false;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static int onExtraCallback;
    private static boolean onExtraCallbackWithResult;
    private static char[] onNavigationEvent;
    private static int onTransact;
    public static final UST_PKCS12_GetCertWithPFX_ENCPKCS8 onWarmupCompleted;

    static {
        onWarmupCompleted();
        onWarmupCompleted = new UST_PKCS12_GetCertWithPFX_ENCPKCS8();
        int i = onTransact + 89;
        IAuthTabCallbackStub = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, Map map, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        asInterface = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onExtraCallback(str, str2, map, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(str, str2, map, setDetectableSize);
        int i3 = asInterface + 19;
        asBinder = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnExtraCallback;
        }
        obj.hashCode();
        throw null;
    }

    private UST_PKCS12_GetCertWithPFX_ENCPKCS8() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(UST_PKCS12_GetCertWithPFX_ENCPKCS8 uST_PKCS12_GetCertWithPFX_ENCPKCS8, String str, String str2, String str3, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 8) != 0) {
            int i3 = asInterface;
            int i4 = i3 + 61;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 69;
            asBinder = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 5 / 3;
            }
            map = null;
        }
        uST_PKCS12_GetCertWithPFX_ENCPKCS8.onWarmupCompleted(str, str2, str3, map);
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Map<String, Object> map) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ConvertByteArrayToFloatArray.onWarmupCompleted(str, false, (String) null, (List) null, (Map) null, new ComparisonTrackLog$.ExternalSyntheticLambda0(str2, str3, map), 30, (Object) null);
        int i2 = asBinder + 7;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onExtraCallback(String str, String str2, Map map, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback().put("view", str);
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        sendBroadcastWithAdObject sendbroadcastwithadobject = sendBroadcastWithAdObject.LOAN_COMPARISON;
        mapOnExtraCallback.put("category", sendbroadcastwithadobject);
        setDetectableSize.onExtraCallback().put("service", sendbroadcastwithadobject);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        List listEmptyList = null;
        a(null, null, new byte[]{-124, -125, -126, -127}, 127 - View.MeasureSpec.getSize(0), objArr);
        mapOnExtraCallback2.put(((String) objArr[0]).intern(), "cs");
        Map mapOnExtraCallback3 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        a(null, null, new byte[]{-124, -120, -121, -122, -122, -124, -123}, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr2);
        mapOnExtraCallback3.put(((String) objArr2[0]).intern(), str2);
        if (map != null) {
            int i2 = asInterface + 21;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            listEmptyList = access8100.onExtraCallback(map);
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Iterator it = listEmptyList.iterator();
        while (!(!it.hasNext())) {
            int i4 = asInterface + 115;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            Pair pair = (Pair) it.next();
            setDetectableSize.onExtraCallback((String) pair.getFirst(), pair.getSecond());
            int i6 = asInterface + 1;
            asBinder = i6 % 128;
            int i7 = i6 % 2;
        }
        Unit unit = Unit.INSTANCE;
        int i8 = asInterface + 9;
        asBinder = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    public static /* synthetic */ void IAuthTabCallback(UST_PKCS12_GetCertWithPFX_ENCPKCS8 uST_PKCS12_GetCertWithPFX_ENCPKCS8, String str, String str2, String str3, Throwable th, Map map, int i, Object obj) throws Throwable {
        Throwable th2;
        Map map2;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = asInterface + 79;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            str3 = "";
        }
        String str4 = str3;
        if ((i & 8) != 0) {
            int i5 = asInterface + 23;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            th2 = null;
        } else {
            th2 = th;
        }
        if ((i & 16) != 0) {
            int i7 = asInterface + 5;
            asBinder = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 91 / 0;
            }
            map2 = null;
        } else {
            map2 = map;
        }
        uST_PKCS12_GetCertWithPFX_ENCPKCS8.onNavigationEvent(str, str2, str4, th2, map2);
    }

    public final void onNavigationEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Throwable th, @Nullable Map<String, Object> map) throws Throwable {
        int i = 2 % 2;
        int i2 = asBinder + 11;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object obj = null;
        if (map != null) {
            int i4 = asInterface + 47;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            map.put("view", str2);
            sendBroadcastWithAdObject sendbroadcastwithadobject = sendBroadcastWithAdObject.LOAN_COMPARISON;
            map.put("category", sendbroadcastwithadobject.getValue());
            map.put("service", sendbroadcastwithadobject.getValue());
            Object[] objArr = new Object[1];
            a(null, null, new byte[]{-124, -125, -126, -127}, (ViewConfiguration.getScrollBarSize() >> 8) + 127, objArr);
            map.put(((String) objArr[0]).intern(), "cs");
            Unit unit = Unit.INSTANCE;
        } else {
            map = null;
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult(str, str3, th, map);
        int i6 = asInterface + 71;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
        char[] cArr3 = onNavigationEvent;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $11 + 15;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i5 = $11 + 17;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i2])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 76 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)), 20951 - ((byte) KeyEvent.getModifierMetaStateMask()), 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr2[i2] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i2 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i2])};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 78 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 20951 - TextUtils.lastIndexOf("", '0', 0, 0), 1064889259, false, "x", new Class[]{Integer.TYPE});
                    }
                    cArr2[i2] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i2++;
                }
                j = 0;
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onExtraCallback)};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 75 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
            if (onExtraCallbackWithResult) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                    Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - MotionEvent.axisFromString("")), Color.alpha(0) + 63, Color.argb(0, 0, 0, 0) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!IAuthTabCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $10 + 79;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            int i8 = $11 + 57;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr3[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 64 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr6);
            int i10 = $11 + 33;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    static void onWarmupCompleted() {
        onNavigationEvent = new char[]{32283, 32286, 32487, 32490, 32482, 32484, 32502, 32488};
        onExtraCallback = -1184334185;
        IAuthTabCallback = true;
        onExtraCallbackWithResult = true;
    }
}
