package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.zzgc;
import im.toss.features.home.feature.asset_home.AssetHomeEditLoggerKt$;
import im.toss.features.teens.henembox.transaction.HenemSavingBoxTransationDetailActivity$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class RVRpcProxy {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback = 57881;
    private static int onExtraCallback = 0;
    private static char onExtraCallbackWithResult = 8314;
    private static char onNavigationEvent = 39969;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 44597;

    public static /* synthetic */ Unit IAuthTabCallback(toJSONObject tojsonobject, int i, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 43;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tojsonobject, i, str, setDetectableSize);
        int i5 = onExtraCallback + 27;
        onTransact = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(str, setDetectableSize);
        int i4 = onExtraCallback + 121;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(String str, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 29;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1471279497, -1471279489, iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, setDetectableSize}, iOnExtraCallback);
            int i3 = 17 / 0;
        } else {
            int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback5 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            int iOnExtraCallback6 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
            unit = (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1471279497, -1471279489, iOnExtraCallback5, iOnExtraCallback6, new Object[]{str, setDetectableSize}, iOnExtraCallback4);
        }
        int i4 = onExtraCallback + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        toJSONObject tojsonobject = (toJSONObject) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(tojsonobject, zBooleanValue, str, setDetectableSize);
        int i4 = onExtraCallback + 111;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onTransact + 35;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getInterfaceDescriptor(str, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit interfaceDescriptor = getInterfaceDescriptor(str, setDetectableSize);
        int i3 = onTransact + 117;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return interfaceDescriptor;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object access100(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback_Parcel(str, setDetectableSize);
        }
        IAuthTabCallback_Parcel(str, setDetectableSize);
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        toJSONObject tojsonobject = (toJSONObject) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(tojsonobject, zBooleanValue, str, str2, setDetectableSize);
        int i4 = onExtraCallback + 85;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 5;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitWriteTypedObject = writeTypedObject(str, setDetectableSize);
        int i4 = onTransact + 29;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitWriteTypedObject;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asInterface(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallbackWithResult = extraCallbackWithResult(str, setDetectableSize);
        int i4 = onTransact + 27;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitExtraCallbackWithResult;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i3 | i6);
        int i12 = (~(i6 | i3)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i2 + i4 + ((-1422066268) * i5) + ((-2108786386) * i);
        int i14 = i13 * i13;
        int i15 = (i3 * 793895740) + 1353643607 + (i2 * 793896262) + (i10 * (-261)) + (i11 * (-261)) + (i12 * 261) + (793896001 * i4) + (692483748 * i5) + ((-1016611666) * i) + (i14 * 166461440);
        switch (((-1583913924) * i3) + 967573504 + (322476998 * i2) + (i10 * 1194288187) + (1194288187 * i11) + ((-1194288187) * i12) + (1516765184 * i4) + ((-1298137088) * i5) + (1722810368 * i) + (518782976 * i14) + (i15 * i15 * 1997799424)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
                String str = (String) objArr[1];
                String str2 = (String) objArr[2];
                int i16 = 2 % 2;
                Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
                Intrinsics.checkNotNullParameter(str2, "");
                ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, 1749672L, false, null, null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda2(str, str2), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
                int i17 = onTransact + 87;
                onExtraCallback = i17 % 128;
                int i18 = i17 % 2;
                return null;
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return IAuthTabCallback(objArr);
            case 6:
                return IAuthTabCallbackStub(objArr);
            case 7:
                return IAuthTabCallbackDefault(objArr);
            case 8:
                return onTransact(objArr);
            case 9:
                return asBinder(objArr);
            case 10:
                return asInterface(objArr);
            case 11:
                return IAuthTabCallbackStubProxy(objArr);
            case 12:
                return access100(objArr);
            case 13:
                return getInterfaceDescriptor(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            case 15:
                return access000(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, str2, setDetectableSize);
        int i4 = onTransact + 63;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, String str2, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, z, setDetectableSize);
        int i4 = onExtraCallback + 61;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject tojsonobject, int i, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 103;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            onExtraCallbackWithResult(tojsonobject, i, str, setDetectableSize);
            throw null;
        }
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(tojsonobject, i, str, setDetectableSize);
        int i4 = onTransact + 101;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject tojsonobject, int i, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 105;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(tojsonobject, i, z, str, str2, setDetectableSize);
        int i5 = onTransact + 85;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject tojsonobject, int i, boolean z, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {tojsonobject, Integer.valueOf(i), Boolean.valueOf(z), str, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1332537140, 1332537144, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        int i5 = onTransact + 49;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(toJSONObject tojsonobject, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tojsonobject, z, str, str2, setDetectableSize);
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        int i5 = onTransact + 67;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 93;
        onExtraCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            asBinder(str, str2, setDetectableSize);
            obj.hashCode();
            throw null;
        }
        Unit unitAsBinder = asBinder(str, str2, setDetectableSize);
        int i3 = onTransact + 119;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return unitAsBinder;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 91;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitExtraCallback = extraCallback(str, setDetectableSize);
        int i4 = onExtraCallback + 57;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return unitExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, boolean z, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {str, Boolean.valueOf(z), str2, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        Unit unit = (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1599124805, -1599124795, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
        int i4 = onExtraCallback + 41;
        onTransact = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(toJSONObject tojsonobject, int i, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 45;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tojsonobject, i, z, str, str2, setDetectableSize);
        if (i4 != 0) {
            int i5 = 5 / 0;
        }
        int i6 = onExtraCallback + 29;
        onTransact = i6 % 128;
        if (i6 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 109;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(str, setDetectableSize);
        int i4 = onExtraCallback + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallback + 63;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            onTransact(str, str2, setDetectableSize);
            throw null;
        }
        Unit unitOnTransact = onTransact(str, str2, setDetectableSize);
        int i3 = onExtraCallback + 45;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitICustomTabsCallback = ICustomTabsCallback(str, setDetectableSize);
        int i4 = onTransact + 125;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unitICustomTabsCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(toJSONObject tojsonobject, boolean z, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {tojsonobject, Boolean.valueOf(z), str, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback4 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        if (i3 == 0) {
            return (Unit) onExtraCallback(iOnExtraCallback4, -1988146933, 1988146936, iOnExtraCallback2, iOnExtraCallback3, objArr, iOnExtraCallback);
        }
        int i4 = 0 / 0;
        return (Unit) onExtraCallback(iOnExtraCallback4, -1988146933, 1988146936, iOnExtraCallback2, iOnExtraCallback3, objArr, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(str, str2, setDetectableSize);
        int i4 = onTransact + 7;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 105;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(str, setDetectableSize);
        int i4 = onTransact + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess000;
    }

    public static /* synthetic */ Unit onWarmupCompleted(toJSONObject tojsonobject, int i, boolean z, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onTransact + 81;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(tojsonobject, i, z, str, setDetectableSize);
        if (i4 != 0) {
            int i5 = 56 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static final getRpcProxy onNavigationEvent(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 67;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i5 = onTransact + 1;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2065340720, i, -1, "im.toss.features.home.feature.asset_home.rememberItemImpressionLogger (AssetHomeEditLogger.kt:108)");
            int i7 = onExtraCallback + 99;
            onTransact = i7 % 128;
            int i8 = i7 % 2;
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized = new getRpcProxy();
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        getRpcProxy getrpcproxy = (getRpcProxy) objOnMinimized;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return getrpcproxy;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        CharSequence charSequence;
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i4 = $10 + 97;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i6 = $10 + 39;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            char c = 1;
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i8 = 58224;
            int i9 = i3;
            while (i9 < 16) {
                char c2 = cArr3[c];
                char c3 = cArr3[i3];
                int i10 = (c3 + i8) ^ ((c3 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onNavigationEvent);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[c] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        charSequence = "";
                        int iIndexOf = TextUtils.indexOf(charSequence, charSequence) + 10;
                        int scrollBarSize = 12434 - (ViewConfiguration.getScrollBarSize() >> 8);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[c] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(maximumDrawingCacheSize, iIndexOf, scrollBarSize, -787580090, false, "C", clsArr);
                    } else {
                        charSequence = "";
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[c] = cCharValue;
                    int i12 = i9;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onWarmupCompleted)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore(charSequence, 0), 10 - Color.green(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9 = i12 + 1;
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
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - KeyEvent.keyCodeFromString("")), 14 - (Process.myTid() >> 22), 19901 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final void onWarmupCompleted(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @NotNull String str, @Nullable String str2, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749674L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda17(tojsonobject, i, z, str, str2), 14, (Object) null);
        int i3 = onExtraCallback + 123;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onNavigationEvent(toJSONObject tojsonobject, int i, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("category", str);
        if (str2 != null) {
            int i3 = onExtraCallback + 31;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!StringsKt.isBlank(str2)) {
                int i5 = onExtraCallback + 125;
                onTransact = i5 % 128;
                int i6 = i5 % 2;
                setDetectableSize.onExtraCallback("section_type", str2);
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onWarmupCompleted(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, toJSONObject tojsonobject, int i, String str, String str2, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = onExtraCallback + 79;
        onTransact = i4 % 128;
        onExtraCallbackWithResult(convertFloatArrayToByteArray, tojsonobject, i, str, (i4 % 2 != 0 ? (i2 & 8) == 0 : (i2 & 124) == 0) ? str2 : null, z);
        int i5 = onTransact + 77;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void onExtraCallbackWithResult(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @NotNull String str, @Nullable String str2, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749676L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda23(tojsonobject, i, z, str, str2), 14, (Object) null);
        int i3 = onExtraCallback + 97;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onWarmupCompleted(toJSONObject tojsonobject, int i, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("category", str);
        if (str2 != null) {
            int i3 = onExtraCallback + 73;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            if (!StringsKt.isBlank(str2)) {
                setDetectableSize.onExtraCallback("section_type", str2);
                int i5 = onTransact + 33;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static final void asBinder(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766436L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda19(str), 14, (Object) null);
        int i2 = onExtraCallback + 121;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit extraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 107;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onTransact + 63;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final void asInterface(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766438L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda24(str), 14, (Object) null);
        int i2 = onTransact + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
    }

    private static final Unit writeTypedObject(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 123;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", str);
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", str);
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 57;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public static final void onExtraCallbackWithResult(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749678L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda13(str), 14, (Object) null);
        int i2 = onTransact + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit access000(String str, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onTransact + 49;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", str);
            unit = Unit.INSTANCE;
            int i3 = 11 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("category", str);
            unit = Unit.INSTANCE;
        }
        int i4 = onTransact + 59;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onTransact(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766440L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda6(str), 14, (Object) null);
        int i2 = onExtraCallback + 65;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit extraCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("category", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 1;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 96 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackDefault(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onTransact + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, 103 >>> ExpandableListView.getPackedPositionGroup(1L), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, 8 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str);
        setDetectableSize.onExtraCallback("category", str2);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 39;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, 1749680L, false, null, null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda20(str, str2), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
        int i2 = onExtraCallback + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit onTransact(String str, String str2, SetDetectableSize setDetectableSize) throws Throwable {
        Object obj;
        int i = 2 % 2;
        int i2 = onExtraCallback + 49;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, 57 / View.MeasureSpec.getSize(0), objArr);
            obj = objArr[0];
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, 8 - View.MeasureSpec.getSize(0), objArr2);
            obj = objArr2[0];
        }
        setDetectableSize.onExtraCallback(((String) obj).intern(), str);
        setDetectableSize.onExtraCallback("category", str2);
        Unit unit = Unit.INSTANCE;
        int i3 = onTransact + 5;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, @NotNull String str, @Nullable String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749682L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda22(tojsonobject, z, str, str2), 14, (Object) null);
        int i2 = onExtraCallback + 57;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallback(toJSONObject tojsonobject, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("category", str);
        if (str2 != null) {
            int i2 = onExtraCallback + 67;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.isBlank(str2)) {
                setDetectableSize.onExtraCallback("section_type", str2);
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 43;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        toJSONObject tojsonobject = (toJSONObject) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int iIntValue = ((Number) objArr[5]).intValue();
        Object obj = objArr[6];
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 89;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        if ((4 & iIntValue) != 0) {
            int i5 = i2 + 125;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        onWarmupCompleted(convertFloatArrayToByteArray, tojsonobject, str, str2, zBooleanValue);
        int i7 = onExtraCallback + 65;
        onTransact = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final void onWarmupCompleted(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, @NotNull String str, @Nullable String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749684L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda10(tojsonobject, z, str, str2), 14, (Object) null);
        int i2 = onTransact + 101;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onNavigationEvent(toJSONObject tojsonobject, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
        setDetectableSize.onExtraCallback("category", str);
        if (str2 != null) {
            int i2 = onExtraCallback + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.isBlank(str2)) {
                int i4 = onExtraCallback + 73;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    setDetectableSize.onExtraCallback("section_type", str2);
                    int i5 = 86 / 0;
                } else {
                    setDetectableSize.onExtraCallback("section_type", str2);
                }
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static final void onExtraCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str, @NotNull String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749686L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda4(str, str2), 14, (Object) null);
        int i2 = onExtraCallback + 69;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit asBinder(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 83;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", str);
        setDetectableSize.onExtraCallback("category", str2);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 63;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onExtraCallbackWithResult(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str, @NotNull String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1749688L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda16(str, str2, z), 14, (Object) null);
        int i2 = onTransact + 15;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(String str, String str2, boolean z, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 103;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", str);
        setDetectableSize.onExtraCallback("category", str2);
        setDetectableSize.onExtraCallback("delete_yn", zzaz.onExtraCallbackWithResult(z));
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 105;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unit;
    }

    public static final void onNavigationEvent(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, 1748072L, false, null, null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda21(str), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
        int i2 = onExtraCallback + 85;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback_Parcel(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, 8 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 63;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void onWarmupCompleted(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766138L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda0(str), 14, (Object) null);
        int i2 = onExtraCallback + 1;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit IAuthTabCallbackStubProxy(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 69;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tab_type", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 55;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        toJSONObject tojsonobject = (toJSONObject) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748074L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda15(tojsonobject, iIntValue, zBooleanValue, str), 14, (Object) null);
        int i2 = onExtraCallback + 121;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 73 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(toJSONObject tojsonobject, int i, boolean z, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(i));
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
        if (str != null) {
            int i3 = onExtraCallback + 125;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 84 / 0;
                if (!StringsKt.isBlank(str)) {
                    setDetectableSize.onExtraCallback("section_type", str);
                }
            } else if (!StringsKt.isBlank(str)) {
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        Unit unit = Unit.INSTANCE;
        int i5 = onTransact + 9;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    public static final void onNavigationEvent(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @Nullable String str, boolean z) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748076L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda12(tojsonobject, i, z, str), 14, (Object) null);
        int i3 = onTransact + 35;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        toJSONObject tojsonobject = (toJSONObject) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[4];
        int i = 2 % 2;
        int i2 = onTransact + 53;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(iIntValue));
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
        if (str != null) {
            int i4 = onTransact + 33;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(str)) {
                setDetectableSize.onExtraCallback("section_type", str);
                int i6 = onExtraCallback + 67;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static final void onNavigationEvent(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @Nullable String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748078L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda8(tojsonobject, i, str), 14, (Object) null);
        int i3 = onExtraCallback + 73;
        onTransact = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit onWarmupCompleted(toJSONObject tojsonobject, int i, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(i));
        if (str != null) {
            int i3 = onTransact + 113;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (!StringsKt.isBlank(str)) {
                int i5 = onTransact + 19;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    setDetectableSize.onExtraCallback("section_type", str);
                    int i6 = 80 / 0;
                } else {
                    setDetectableSize.onExtraCallback("section_type", str);
                }
                int i7 = onExtraCallback + 63;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = onExtraCallback + 91;
        onTransact = i9 % 128;
        if (i9 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        toJSONObject tojsonobject = (toJSONObject) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str = (String) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748080L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda25(tojsonobject, iIntValue, str), 14, (Object) null);
        int i2 = onExtraCallback + 117;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 44 / 0;
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult(toJSONObject tojsonobject, int i, String str, SetDetectableSize setDetectableSize) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 109;
        onTransact = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("display_order", Integer.valueOf(i));
        if (str != null) {
            int i5 = onExtraCallback + 101;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            if (!StringsKt.isBlank(str)) {
                int i7 = onExtraCallback + 103;
                onTransact = i7 % 128;
                int i8 = i7 % 2;
                setDetectableSize.onExtraCallback("section_type", str);
                int i9 = onExtraCallback + 119;
                onTransact = i9 % 128;
                int i10 = i9 % 2;
            }
        }
        return Unit.INSTANCE;
    }

    public static final void IAuthTabCallbackDefault(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766258L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda14(str), 14, (Object) null);
        int i2 = onTransact + 39;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        String str = (String) objArr[0];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 23;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tab_type", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 15;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        int i = 2 % 2;
        int i2 = onTransact + 51;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748084L, false, (String) null, (Map) null, (Function1) null, 30, (Object) null);
        int i4 = onExtraCallback + 73;
        onTransact = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static final void onExtraCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748082L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda1(str), 14, (Object) null);
        int i2 = onExtraCallback + 37;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit access100(String str, SetDetectableSize setDetectableSize) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallback + 41;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("tab_type", str);
            unit = Unit.INSTANCE;
            int i3 = 19 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("tab_type", str);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 61;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1766260L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda3(str), 14, (Object) null);
        int i2 = onExtraCallback + 15;
        onTransact = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return null;
    }

    private static final Unit ICustomTabsCallback(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 79;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("tab_type", str);
        Unit unit = Unit.INSTANCE;
        int i4 = onTransact + 67;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        ((Boolean) ConvertFloatArrayToByteArray.IAuthTabCallback(-102207491, zzgc.onExtraCallbackWithResult(), 102207492, new Object[]{convertFloatArrayToByteArray, 1748086L, false, null, null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda9(str), 14, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
        int i2 = onExtraCallback + 5;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit getInterfaceDescriptor(String str, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = onTransact + 1;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{55757, 65377, 62070, 42432, 64878, 13366, 12800, 3239}, AndroidCharacter.getMirror('0') - '(', objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 5;
        onTransact = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, @Nullable String str, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748090L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda5(tojsonobject, z, str), 14, (Object) null);
        int i2 = onTransact + 19;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        toJSONObject tojsonobject = (toJSONObject) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
        setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
        if (str != null) {
            int i2 = onExtraCallback + 39;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 78 / 0;
                if (!StringsKt.isBlank(str)) {
                    int i4 = onExtraCallback + 77;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                    setDetectableSize.onExtraCallback("section_type", str);
                }
            } else if (!StringsKt.isBlank(str)) {
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        toJSONObject tojsonobject = (toJSONObject) objArr[1];
        String str = (String) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(tojsonobject, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748092L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda18(tojsonobject, zBooleanValue, str), 14, (Object) null);
        int i2 = onExtraCallback + 3;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(toJSONObject tojsonobject, boolean z, String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onTransact + 29;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
            int i3 = 10 / 0;
            if (str != null) {
                if (!StringsKt.isBlank(str)) {
                    setDetectableSize.onExtraCallback("section_type", str);
                    int i4 = onExtraCallback + 69;
                    onTransact = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            setDetectableSize.onExtraCallback("reference_id", tojsonobject.IAuthTabCallbackStub());
            setDetectableSize.onExtraCallback("hidden_yn", zzaz.onExtraCallbackWithResult(z));
            if (str != null) {
            }
        }
        setDetectableSize.onExtraCallback(tojsonobject.IAuthTabCallbackDefault().onNavigationEvent());
        return Unit.INSTANCE;
    }

    public static final void onExtraCallbackWithResult(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str, @Nullable String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748088L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda7(str, str2), 14, (Object) null);
        int i2 = onTransact + 91;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit IAuthTabCallback(String str, String str2, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onTransact = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", str);
        if (str2 != null) {
            int i4 = onExtraCallback + 41;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            if (!StringsKt.isBlank(str2)) {
                setDetectableSize.onExtraCallback("section_type", str2);
                int i6 = onExtraCallback + 51;
                onTransact = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallback + 47;
        onTransact = i8 % 128;
        if (i8 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str, @Nullable String str2, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(convertFloatArrayToByteArray, "");
        ConvertFloatArrayToByteArray.onWarmupCompleted(convertFloatArrayToByteArray, 1748094L, false, (String) null, (Map) null, new AssetHomeEditLoggerKt$.ExternalSyntheticLambda11(str, z, str2), 14, (Object) null);
        int i2 = onExtraCallback + 41;
        onTransact = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str2 = (String) objArr[2];
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[3];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        setDetectableSize.onExtraCallback("reference_id", str);
        setDetectableSize.onExtraCallback("delete_yn", zzaz.onExtraCallbackWithResult(zBooleanValue));
        if (str2 != null) {
            int i2 = onTransact + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!StringsKt.isBlank(str2)) {
                int i4 = onExtraCallback + 1;
                onTransact = i4 % 128;
                if (i4 % 2 == 0) {
                    setDetectableSize.onExtraCallback("section_type", str2);
                    int i5 = 76 / 0;
                } else {
                    setDetectableSize.onExtraCallback("section_type", str2);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(toJSONObject tojsonobject, boolean z, String str, SetDetectableSize setDetectableSize) {
        Object[] objArr = {tojsonobject, Boolean.valueOf(z), str, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1937207163, -1937207152, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onExtraCallback(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1177691403, 1177691417, iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, setDetectableSize}, iOnExtraCallback);
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1615506069, 1615506069, iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, setDetectableSize}, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onWarmupCompleted(toJSONObject tojsonobject, boolean z, String str, String str2, SetDetectableSize setDetectableSize) {
        Object[] objArr = {tojsonobject, Boolean.valueOf(z), str, str2, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -461007214, 461007223, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static /* synthetic */ Unit onTransact(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1172973266, 1172973278, iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, setDetectableSize}, iOnExtraCallback);
    }

    public static final void onWarmupCompleted(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @Nullable String str, boolean z) {
        Object[] objArr = {convertFloatArrayToByteArray, tojsonobject, Integer.valueOf(i), str, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -129124746, 129124752, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    private static final Unit IAuthTabCallback(toJSONObject tojsonobject, int i, boolean z, String str, SetDetectableSize setDetectableSize) {
        Object[] objArr = {tojsonobject, Integer.valueOf(i), Boolean.valueOf(z), str, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1332537140, 1332537144, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static final void IAuthTabCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, int i, @Nullable String str) {
        Object[] objArr = {convertFloatArrayToByteArray, tojsonobject, Integer.valueOf(i), str};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1892811179, -1892811178, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static final void onWarmupCompleted(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 814133770, -814133765, iOnExtraCallback2, iOnExtraCallback3, new Object[]{convertFloatArrayToByteArray}, iOnExtraCallback);
    }

    private static final Unit IAuthTabCallback(toJSONObject tojsonobject, boolean z, String str, SetDetectableSize setDetectableSize) {
        Object[] objArr = {tojsonobject, Boolean.valueOf(z), str, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1988146933, 1988146936, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static final void onExtraCallback(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull toJSONObject tojsonobject, @Nullable String str, boolean z) {
        Object[] objArr = {convertFloatArrayToByteArray, tojsonobject, str, Boolean.valueOf(z)};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1167719291, 1167719298, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    private static final Unit onWarmupCompleted(String str, boolean z, String str2, SetDetectableSize setDetectableSize) {
        Object[] objArr = {str, Boolean.valueOf(z), str2, setDetectableSize};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1599124805, -1599124795, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    public static final void onNavigationEvent(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @Nullable String str, @NotNull String str2) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1622020521, 1622020523, iOnExtraCallback2, iOnExtraCallback3, new Object[]{convertFloatArrayToByteArray, str, str2}, iOnExtraCallback);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, toJSONObject tojsonobject, String str, String str2, boolean z, int i, Object obj) {
        Object[] objArr = {convertFloatArrayToByteArray, tojsonobject, str, str2, Boolean.valueOf(z), Integer.valueOf(i), obj};
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), -1140895382, 1140895395, HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), objArr, iOnExtraCallback);
    }

    private static final Unit readTypedObject(String str, SetDetectableSize setDetectableSize) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        return (Unit) onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 1471279497, -1471279489, iOnExtraCallback2, iOnExtraCallback3, new Object[]{str, setDetectableSize}, iOnExtraCallback);
    }

    public static final void IAuthTabCallbackStub(@NotNull ConvertFloatArrayToByteArray convertFloatArrayToByteArray, @NotNull String str) {
        int iOnExtraCallback = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback2 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        int iOnExtraCallback3 = HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback();
        onExtraCallback(HenemSavingBoxTransationDetailActivity$.ExternalSyntheticLambda3.onExtraCallback(), 912747994, -912747979, iOnExtraCallback2, iOnExtraCallback3, new Object[]{convertFloatArrayToByteArray, str}, iOnExtraCallback);
    }
}
