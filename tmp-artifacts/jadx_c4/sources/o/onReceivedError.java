package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.zxing.datamatrix.encoder.C40Encoder;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.ads_sdk.R;
import im.toss.ads_sdk.model.NativeAdsDto;
import im.toss.ads_sdk.model.NativeAdsEventLogType;
import im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1;
import im.toss.features.mydata.ui.consent.MydataManageConsentsNavHostKt$;
import im.toss.uikit.widget.SafePlayerView;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.GraphicDeviceInfo;
import o.MeteringRepeatingSessionExternalSyntheticLambda0;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.decrementVideoUsage;
import o.getSupportedHighSpeedResolutionsFor;
import o.immediateFailedFuture;
import o.isInVideoUsage;
import o.onReceivedError;
import o.onReceivedHttpError;
import o.toPreviewOnlyRange;
import o.useAndConfigureProgramWithTexture;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onReceivedError {
    private static final byte[] $$a = {34, -66, 77, 18};
    private static final int $$b = 38;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static char[] onWarmupCompleted = {54803, 38330, 20837, 7444, 55516, 33992, 16490, 4007, 52128, 46930, 29448, 16072, 64110, 42537, 26035, 8596, 60740, 43277, 5298, 53306, 39990, 23503, 2010, 50001, 36576, 19129, 13943, 61983, 45464, 32138, 14627, 58615, 41204, 27674, 10249, 38891, 21350, 7985, 56010, 34438, 16926, 501, 52646, 35177, 29961, 12494, 64720, 47151, 26605, 9144, 61196, 43801, 5840, 53868, 40506, 23989, 6609, 50459, 33038, 19620, 2174, 62510, 46024, 32734, 15179, 59104, 41654, 60860, 44565, 27338, 9915, 58227, 48999, 31685, 13320, 61455, 36093, 18599, 1383, 49601, 40326, 24092, 6715, 55019, 37538, 12061, 60309, 42905, 24672, 15477, 63742, 46415, 28950, 3544, 51632, 35383, 17957, 652, 57176, 39771, 22453, 5030, 44100, 26825, 9374, 57701, 48425, 31153, 14938, 62985, 45766, 20134, 2913, 51071, 33664, 23626, 6236, 54499, 37044, 11646, 59842, 42455, 26117, 8801, 65262, 47806, 30474, 13260, 53136, 34860, 17455, 250, 56646, 60860, 44565, 27338, 9915, 58227, 48999, 31685, 13320, 61455, 36093, 18599, 1383, 49601, 40326, 24092, 6715, 55019, 37538, 12061, 60309, 42905, 24672, 15477, 63742, 46415, 28950, 3544, 51632, 35383, 17957, 652, 57176, 39771, 22453, 5030, 44100, 26825, 9374, 57701, 48425, 31153, 14920, 62996, 45761, 20135, 2930, 51071, 33693, 23629, 6166, 54502, 37039, 11581, 59865, 42399, 26191, 8760, 65275, 47779, 30487, 13260, 53146, 34924, 17522, 249, 56654, 39184, 21988, 4590, 53869, 28356, 10880, 37920};
    private static long onNavigationEvent = -4908647726540083615L;

    public static final class onExtraCallbackWithResult implements decrementVideoUsage {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;

        public void dispose() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 103;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        byte[] bArr = $$a;
        int i4 = (i2 * 3) + 4;
        int i5 = 97 - (i * 3);
        int i6 = s * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i4;
            int i9 = 0;
            i4++;
            i5 += i8;
            i3 = i9;
            int i10 = i4;
            int i11 = i5;
            bArr2[i3] = (byte) i11;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i4 = i10;
            i5 = bArr[i10];
            i9 = i3 + 1;
            i8 = i11;
            i4++;
            i5 += i8;
            i3 = i9;
            int i102 = i4;
            int i112 = i5;
            bArr2[i3] = (byte) i112;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i4;
            int i1122 = i5;
            bArr2[i3] = (byte) i1122;
            if (i3 == i7) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = (~((~i) | i5)) | i6;
        int i8 = ~i6;
        int i9 = (~(i8 | i5)) | (~(i8 | i)) | (~(i5 | i));
        int i10 = (~(i | (~i5))) | i8;
        int i11 = i6 + i5 + i4 + ((-2137991558) * i2) + (111092868 * i3);
        int i12 = i11 * i11;
        int i13 = (((-431794203) * i6) - 566755328) + (427185167 * i5) + (i7 * 1717982222) + (1717982222 * i9) + ((-1717982222) * i10) + ((-1290797056) * i4) + ((-1247805440) * i2) + ((-1807745024) * i3) + ((-591921152) * i12);
        int i14 = (i6 * (-1469267343)) + 1003592187 + (i5 * (-1469268429)) + (i7 * (-362)) + (i9 * (-362)) + (i10 * 362) + (i4 * (-1469268067)) + (i2 * 1951436498) + (i3 * (-746069772)) + (i12 * (-1529348096));
        switch (i13 + (i14 * i14 * 1762131968)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return IAuthTabCallbackDefault(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return asInterface(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return onTransact(objArr);
            case 10:
                return getInterfaceDescriptor(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access000(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return IAuthTabCallback_Parcel(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(NativeAdsEventLogType nativeAdsEventLogType) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{nativeAdsEventLogType}, -1453525115, 1453525118);
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{function1}, -1552937084, 1552937085);
        int i4 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.FeedVideo feedVideo, List list, boolean z2, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, feedVideo, list, Boolean.valueOf(z2), iAuthTabCallback, function1, function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        Unit unit = (Unit) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1606993312, 1606993325);
        int i7 = onExtraCallbackWithResult + 53;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 31;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(useandconfigureprogramwithtexture);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
        return unitAsBinder;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(ExoPlayer exoPlayer, Function1 function1, boolean z, onTransact ontransact, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(exoPlayer, function1, z, ontransact, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6, isinvideousage);
        int i4 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage IAuthTabCallback(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
            throw null;
        }
        decrementVideoUsage decrementvideousageOnNavigationEvent = onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i3 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return decrementvideousageOnNavigationEvent;
        }
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback((getSupportedHighSpeedResolutionsFor<String>) getsupportedhighspeedresolutionsfor, str);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1172121619, 1172121633);
        int i4 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final /* synthetic */ boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i3 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return zIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        if (i3 != 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            throw null;
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        Unit unit = (Unit) IAuthTabCallback(iOnExtraCallback3, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback4, new Object[]{getsupportedhighspeedresolutionsfor, boolValueOf}, 467381087, -467381075);
        int i4 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final /* synthetic */ boolean IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zAccess000 = access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        int i5 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zAccess000;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        deleteProfile deleteprofile = (deleteProfile) objArr[2];
        NativeAdsDto.Creative.FeedVideo feedVideo = (NativeAdsDto.Creative.FeedVideo) objArr[3];
        List list = (List) objArr[4];
        boolean zBooleanValue2 = ((Boolean) objArr[5]).booleanValue();
        onReceivedHttpError.IAuthTabCallback iAuthTabCallback = (onReceivedHttpError.IAuthTabCallback) objArr[6];
        Function1 function1 = (Function1) objArr[7];
        Function1 function12 = (Function1) objArr[8];
        int iIntValue = ((Number) objArr[9]).intValue();
        int iIntValue2 = ((Number) objArr[10]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        ((Number) objArr[12]).intValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        IAuthTabCallback(quirksExternalSyntheticBackport0, zBooleanValue, deleteprofile, feedVideo, list, zBooleanValue2, iAuthTabCallback, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, i2 % 2 != 0 ? RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1) : RecomposeScopeImplKt.onExtraCallbackWithResult(iIntValue | 1), iIntValue2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = C40Encoder.onExtraCallback();
            int iOnExtraCallback2 = C40Encoder.onExtraCallback();
            return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{useandconfigureprogramwithtexture}, 1637653744, -1637653740);
        }
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit asBinder(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(function1);
        int i4 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static final /* synthetic */ void asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 27;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(getsupportedhighspeedresolutionsfor, z);
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit asInterface(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess100 = access100(function1);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAccess100;
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(zBooleanValue)};
        IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr2, 126209390, -126209385);
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return null;
    }

    public static final /* synthetic */ String onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        String str = (String) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, -1369502711, 1369502722);
        int i4 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static /* synthetic */ Unit onExtraCallback(isQueryRefinementEnabled isqueryrefinementenabled, Function1 function1, long j, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExoPlayer exoPlayer, NativeAdsDto.Creative.FeedVideo feedVideo, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(isqueryrefinementenabled, function1, j, getsupportedhighspeedresolutionsfor, exoPlayer, feedVideo, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str, j2, meteringRepeatingSessionExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 13;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallback(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(exoPlayer, getsupportedhighspeedresolutionsfor, isinvideousage);
        int i3 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return decrementvideousageOnWarmupCompleted;
    }

    public static final /* synthetic */ void onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        onTransact(getsupportedhighspeedresolutionsfor, z);
        int i4 = IAuthTabCallback + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {function1};
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        int iOnExtraCallback3 = C40Encoder.onExtraCallback();
        int iOnExtraCallback4 = C40Encoder.onExtraCallback();
        if (i3 != 0) {
            unit = (Unit) IAuthTabCallback(iOnExtraCallback, iOnExtraCallback3, iOnExtraCallback4, iOnExtraCallback2, objArr, 442251636, -442251628);
            int i4 = 93 / 0;
        } else {
            unit = (Unit) IAuthTabCallback(iOnExtraCallback, iOnExtraCallback3, iOnExtraCallback4, iOnExtraCallback2, objArr, 442251636, -442251628);
        }
        int i5 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, getsupportedhighspeedresolutionsfor);
        int i4 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onTransact(useandconfigureprogramwithtexture);
            throw null;
        }
        Unit unitOnTransact = onTransact(useandconfigureprogramwithtexture);
        int i3 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 76 / 0;
        }
        return unitOnTransact;
    }

    public static /* synthetic */ decrementVideoUsage onExtraCallbackWithResult(onTransact ontransact, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 19;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        decrementVideoUsage decrementvideousageOnWarmupCompleted = onWarmupCompleted(ontransact, isinvideousage);
        int i4 = IAuthTabCallback + 37;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return decrementvideousageOnWarmupCompleted;
    }

    public static final /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 61;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        }
        asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 3;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(str, useandconfigureprogramwithtexture);
        int i4 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 14 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(function1);
        int i4 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnTransact;
    }

    public static /* synthetic */ Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, String str, long j, boolean z2, NativeAdsDto.Creative.FeedVideo feedVideo, boolean z3, long j2, long j3, long j4, boolean z4, long j5, long j6, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str2, long j7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            onWarmupCompleted(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, z, str, j, z2, feedVideo, z3, j2, j3, j4, z4, j5, j6, getsupportedhighspeedresolutionsfor, exoPlayer, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str2, j7, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitOnWarmupCompleted = onWarmupCompleted(quirksExternalSyntheticBackport0, iAuthTabCallback, function1, onwarmupcompleted, z, str, j, z2, feedVideo, z3, j2, j3, j4, z4, j5, j6, getsupportedhighspeedresolutionsfor, exoPlayer, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str2, j7, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onExtraCallbackWithResult + 67;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onNavigationEvent(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        }
        IAuthTabCallbackStub(useandconfigureprogramwithtexture);
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(getsupportedhighspeedresolutionsfor, z);
        if (i3 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, -1660708681, 1660708683)).booleanValue();
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 41 / 0;
        }
        return zBooleanValue;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        ExoPlayer exoPlayer = (ExoPlayer) objArr[0];
        SafePlayerView safePlayerView = (SafePlayerView) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(exoPlayer, safePlayerView);
        if (i3 == 0) {
            int i4 = 38 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ SafePlayerView onWarmupCompleted(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        SafePlayerView safePlayerViewOnExtraCallbackWithResult = onExtraCallbackWithResult(exoPlayer, context);
        int i4 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 51 / 0;
        }
        return safePlayerViewOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAccess000 = access000(function1);
        int i4 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function1 function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 71;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel(function1);
        }
        IAuthTabCallback_Parcel(function1);
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(useandconfigureprogramwithtexture);
        int i4 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static final /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zAsBinder = asBinder((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        int i3 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 67 / 0;
        }
        return zAsBinder;
    }

    public static final class asBinder implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ onTransact onWarmupCompleted;

        public asBinder(onTransact ontransact) {
            this.onWarmupCompleted = ontransact;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 23;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted);
                obj.hashCode();
                throw null;
            }
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.IAuthTabCallback(this.onWarmupCompleted);
            int i3 = IAuthTabCallback + 43;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements decrementVideoUsage {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 onExtraCallback;
        final /* synthetic */ NativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1 onWarmupCompleted;

        public asInterface(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, NativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1 nativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1) {
            this.onExtraCallback = textFieldScrollKtExternalSyntheticLambda0;
            this.onWarmupCompleted = nativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallback.getLifecycle().onExtraCallbackWithResult(this.onWarmupCompleted);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            this.onExtraCallback.getLifecycle().onExtraCallbackWithResult(this.onWarmupCompleted);
            int i3 = IAuthTabCallback + 41;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 79 / 0;
            }
        }
    }

    public static final class onExtraCallback implements decrementVideoUsage {
        private static int IAuthTabCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ ExoPlayer onExtraCallback;
        final /* synthetic */ onWarmupCompleted onExtraCallbackWithResult;

        public onExtraCallback(ExoPlayer exoPlayer, onWarmupCompleted onwarmupcompleted) {
            this.onExtraCallback = exoPlayer;
            this.onExtraCallbackWithResult = onwarmupcompleted;
        }

        public void dispose() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 39;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            ExoPlayer exoPlayer = this.onExtraCallback;
            if (i3 == 0) {
                exoPlayer.removeListener(this.onExtraCallbackWithResult);
                return;
            }
            exoPlayer.removeListener(this.onExtraCallbackWithResult);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(nativeAdsEventLogType, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i4 = $11 + 25;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i + i8])};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0') + 59698), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17, (ViewConfiguration.getJumpTapTimeout() >> 16) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.lastIndexOf("", '0')), 31 - TextUtils.indexOf("", ""), 20220 - KeyEvent.getDeadChar(0, 0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0)), 44 - (ViewConfiguration.getLongPressTimeout() >> 16), 1494 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        int i9 = $10 + 69;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback4 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.getMode(0) + 49123), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 1493 - ((byte) KeyEvent.getModifierMetaStateMask()), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public static final class onTransact implements endRearDisplaySession {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ ExoPlayer onExtraCallback;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> onExtraCallbackWithResult;

        onTransact(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
            this.onExtraCallback = exoPlayer;
            this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsfor;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 35;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                if (!StringsKt.isBlank(onReceivedError.onExtraCallback(this.onExtraCallbackWithResult))) {
                    if (this.onExtraCallback.getPlaybackState() == 1) {
                        this.onExtraCallback.prepare();
                    }
                    this.onExtraCallback.setPlayWhenReady(true);
                    this.onExtraCallback.play();
                    return;
                }
                int i3 = onNavigationEvent + 117;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            StringsKt.isBlank(onReceivedError.onExtraCallback(this.onExtraCallbackWithResult));
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.endRearDisplaySession
        public void onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.pause();
            this.onExtraCallback.setPlayWhenReady(false);
            int i4 = onNavigationEvent + 117;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // o.endRearDisplaySession
        public void onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.stop();
            this.onExtraCallback.setPlayWhenReady(false);
            int i4 = onWarmupCompleted + 83;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        @Override // o.endRearDisplaySession
        public void IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            this.onExtraCallback.release();
            int i4 = onWarmupCompleted + 47;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class onWarmupCompleted implements Player.Listener {
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> IAuthTabCallback;
        final /* synthetic */ ExoPlayer IAuthTabCallbackDefault;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<String> IAuthTabCallbackStub;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> asBinder;
        final /* synthetic */ onTransact asInterface;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallback;
        final /* synthetic */ boolean onExtraCallbackWithResult;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> onNavigationEvent;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onTransact;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onWarmupCompleted;

        /* JADX WARN: Multi-variable type inference failed */
        onWarmupCompleted(Function1<? super NativeAdsEventLogType, Unit> function1, boolean z, onTransact ontransact, ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor6) {
            this.onNavigationEvent = function1;
            this.onExtraCallbackWithResult = z;
            this.asInterface = ontransact;
            this.IAuthTabCallbackDefault = exoPlayer;
            this.asBinder = getsupportedhighspeedresolutionsfor;
            this.onWarmupCompleted = getsupportedhighspeedresolutionsfor2;
            this.onExtraCallback = getsupportedhighspeedresolutionsfor3;
            this.IAuthTabCallbackStub = getsupportedhighspeedresolutionsfor4;
            this.onTransact = getsupportedhighspeedresolutionsfor5;
            this.IAuthTabCallback = getsupportedhighspeedresolutionsfor6;
        }

        public void onPlaybackStateChanged(int i) {
            int i2 = 2 % 2;
            if (i == 4) {
                if (!onReceivedError.IAuthTabCallback(this.asBinder)) {
                    int i3 = access000 + 13;
                    IAuthTabCallback_Parcel = i3 % 128;
                    int i4 = i3 % 2;
                    onReceivedError.IAuthTabCallback((getSupportedHighSpeedResolutionsFor) this.asBinder, true);
                    this.onNavigationEvent.invoke(NativeAdsEventLogType.IAuthTabCallbackStubProxy.onWarmupCompleted);
                }
                if (this.onExtraCallbackWithResult && onReceivedError.onNavigationEvent(this.onWarmupCompleted) && !onReceivedError.onExtraCallbackWithResult(this.onExtraCallback) && removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallback(this.asInterface)) {
                    this.IAuthTabCallbackDefault.seekTo(0L);
                    this.IAuthTabCallbackDefault.setPlayWhenReady(true);
                    this.IAuthTabCallbackDefault.play();
                    int i5 = IAuthTabCallback_Parcel + 31;
                    access000 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }
            int i7 = IAuthTabCallback_Parcel + 1;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        }

        public void onPlayerError(PlaybackException playbackException) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 45;
            access000 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(playbackException, "");
                endRearDisplayPresentationSession.onExtraCallbackWithResult(onReceivedError.onExtraCallback(this.IAuthTabCallbackStub));
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(playbackException, "");
            String strOnExtraCallbackWithResult = endRearDisplayPresentationSession.onExtraCallbackWithResult(onReceivedError.onExtraCallback(this.IAuthTabCallbackStub));
            if (strOnExtraCallbackWithResult != null) {
                int i3 = access000 + 25;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.areEqual(onReceivedError.onExtraCallback(this.IAuthTabCallbackStub), strOnExtraCallbackWithResult);
                    throw null;
                }
                if (!Intrinsics.areEqual(onReceivedError.onExtraCallback(this.IAuthTabCallbackStub), strOnExtraCallbackWithResult)) {
                    onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this.onTransact, true}, 437874171, -437874161);
                    onReceivedError.IAuthTabCallback(this.IAuthTabCallbackStub, strOnExtraCallbackWithResult);
                    int i4 = IAuthTabCallback_Parcel + 63;
                    access000 = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
            }
            onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this.onTransact, true}, 437874171, -437874161);
            onReceivedError.IAuthTabCallback(this.IAuthTabCallbackStub, "");
            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this.asInterface);
        }

        public void onIsPlayingChanged(boolean z) {
            int i = 2 % 2;
            onReceivedError.asBinder(this.IAuthTabCallback, z);
            if (z) {
                int i2 = IAuthTabCallback_Parcel + 59;
                access000 = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.onTransact, false};
                onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 437874171, -437874161);
                this.onNavigationEvent.invoke(NativeAdsEventLogType.ICustomTabsCallback.IAuthTabCallback);
            }
            int i4 = IAuthTabCallback_Parcel + 55;
            access000 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 40 / 0;
            }
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isPausedByLifecycle$delegate;
        final /* synthetic */ boolean $isScrollStopped;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isVisibleForPlayback$delegate;
        final /* synthetic */ onTransact $playable;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $shouldShowThumbnail$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(onTransact ontransact, boolean z, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor3, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$playable = ontransact;
            this.$isScrollStopped = z;
            this.$isVisibleForPlayback$delegate = getsupportedhighspeedresolutionsfor;
            this.$isPausedByLifecycle$delegate = getsupportedhighspeedresolutionsfor2;
            this.$shouldShowThumbnail$delegate = getsupportedhighspeedresolutionsfor3;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$playable, this.$isScrollStopped, this.$isVisibleForPlayback$delegate, this.$isPausedByLifecycle$delegate, this.$shouldShowThumbnail$delegate, access13800Var);
            int i2 = onWarmupCompleted + 43;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 15;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 93;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 93;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            if (onReceivedError.onNavigationEvent(this.$isVisibleForPlayback$delegate)) {
                int i4 = onWarmupCompleted + 119;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                if (onReceivedError.onExtraCallbackWithResult(this.$isPausedByLifecycle$delegate)) {
                    if (!onReceivedError.onNavigationEvent(this.$isVisibleForPlayback$delegate)) {
                        onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{this.$shouldShowThumbnail$delegate, true}, 437874171, -437874161);
                    }
                    removeRearDisplayPresentationStatusListener.IAuthTabCallback.onWarmupCompleted(this.$playable);
                } else {
                    int i6 = onWarmupCompleted + 59;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 / 0;
                        if (this.$isScrollStopped) {
                            removeRearDisplayPresentationStatusListener.IAuthTabCallback.onExtraCallbackWithResult(this.$playable);
                        }
                    } else if (!(!this.$isScrollStopped)) {
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallback + 77;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Set<Float> $firedPercent;
        final /* synthetic */ Set<Long> $firedSeconds;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $firedView$delegate;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $isPlaying$delegate;
        final /* synthetic */ Function1<NativeAdsEventLogType, Unit> $onEvent;
        final /* synthetic */ boolean $shouldTrackView;
        final /* synthetic */ List<Float> $trackingPositions;
        final /* synthetic */ List<Long> $trackingTimes;
        final /* synthetic */ ExoPlayer $videoPlayer;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onNavigationEvent(ExoPlayer exoPlayer, boolean z, Function1<? super NativeAdsEventLogType, Unit> function1, List<Float> list, List<Long> list2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, Set<Float> set, Set<Long> set2, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$videoPlayer = exoPlayer;
            this.$shouldTrackView = z;
            this.$onEvent = function1;
            this.$trackingPositions = list;
            this.$trackingTimes = list2;
            this.$isPlaying$delegate = getsupportedhighspeedresolutionsfor;
            this.$firedView$delegate = getsupportedhighspeedresolutionsfor2;
            this.$firedPercent = set;
            this.$firedSeconds = set2;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$videoPlayer, this.$shouldTrackView, this.$onEvent, this.$trackingPositions, this.$trackingTimes, this.$isPlaying$delegate, this.$firedView$delegate, this.$firedPercent, this.$firedSeconds, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onExtraCallback + 125;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 75;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 59;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                if (!onReceivedError.IAuthTabCallbackDefault(this.$isPlaying$delegate)) {
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            while (findRes.onWarmupCompleted(findresandmsg)) {
                long duration = this.$videoPlayer.getDuration();
                long jCoerceAtLeast = RangesKt.coerceAtLeast(this.$videoPlayer.getCurrentPosition(), 0L);
                if (duration > 0) {
                    int i3 = onExtraCallback + 91;
                    onWarmupCompleted = i3 % 128;
                    if (i3 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (this.$shouldTrackView && !onReceivedError.onWarmupCompleted(this.$firedView$delegate) && jCoerceAtLeast >= 2000) {
                        int i4 = onWarmupCompleted + 65;
                        onExtraCallback = i4 % 128;
                        int i5 = i4 % 2;
                        onReceivedError.onExtraCallback((getSupportedHighSpeedResolutionsFor) this.$firedView$delegate, true);
                        this.$onEvent.invoke(NativeAdsEventLogType.access100.onExtraCallbackWithResult);
                    }
                    List<Float> list = this.$trackingPositions;
                    Set<Float> set = this.$firedPercent;
                    Function1<NativeAdsEventLogType, Unit> function1 = this.$onEvent;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        int i6 = onExtraCallback + 15;
                        onWarmupCompleted = i6 % 128;
                        int i7 = i6 % 2;
                        float fFloatValue = ((Number) it.next()).floatValue();
                        if (!set.contains(access14000.onExtraCallbackWithResult(fFloatValue))) {
                            int i8 = onWarmupCompleted + 43;
                            onExtraCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                if (jCoerceAtLeast >= ((long) (duration - fFloatValue))) {
                                    set.add(access14000.onExtraCallbackWithResult(fFloatValue));
                                    function1.invoke(new NativeAdsEventLogType.extraCallback((long) (fFloatValue * 100.0f)));
                                }
                            } else if (jCoerceAtLeast >= ((long) (duration * fFloatValue))) {
                                set.add(access14000.onExtraCallbackWithResult(fFloatValue));
                                function1.invoke(new NativeAdsEventLogType.extraCallback((long) (fFloatValue * 100.0f)));
                            }
                        }
                    }
                    List<Long> list2 = this.$trackingTimes;
                    Set<Long> set2 = this.$firedSeconds;
                    Function1<NativeAdsEventLogType, Unit> function12 = this.$onEvent;
                    Iterator<T> it2 = list2.iterator();
                    while (!(!it2.hasNext())) {
                        long jLongValue = ((Number) it2.next()).longValue();
                        if (!set2.contains(access14000.onExtraCallback(jLongValue))) {
                            int i9 = onExtraCallback + 35;
                            onWarmupCompleted = i9 % 128;
                            int i10 = i9 % 2;
                            if (jCoerceAtLeast >= 1000 * jLongValue) {
                                set2.add(access14000.onExtraCallback(jLongValue));
                                function12.invoke(new NativeAdsEventLogType.extraCallbackWithResult(jLongValue));
                            }
                        }
                    }
                }
                this.L$0 = findresandmsg;
                this.J$0 = duration;
                this.J$1 = jCoerceAtLeast;
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(50L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        function1.invoke((Object) null);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 85;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return unit;
    }

    private static final Unit onTransact(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("202");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 43;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit onTransact(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 47;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("103");
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 49;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(String str, useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        if (!StringsKt.isBlank(str)) {
            int i2 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            unregisterOutputSurface.onExtraCallback(useandconfigureprogramwithtexture, str);
            int i3 = IAuthTabCallback + 17;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 3;
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(Function1 function1) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 125;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke("101");
            Unit unit = Unit.INSTANCE;
            int i3 = IAuthTabCallback + 33;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        function1.invoke("101");
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit access100(Function1 function1) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke("102");
            unit = Unit.INSTANCE;
            int i3 = 61 / 0;
        } else {
            function1.invoke("102");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor, zBooleanValue);
            return Unit.INSTANCE;
        }
        IAuthTabCallback_Parcel(getsupportedhighspeedresolutionsfor, zBooleanValue);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke("301");
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final SafePlayerView onExtraCallbackWithResult(ExoPlayer exoPlayer, Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        SafePlayerView safePlayerView = new SafePlayerView(context);
        safePlayerView.setPlayer(exoPlayer);
        safePlayerView.setUseController(false);
        safePlayerView.setKeepContentOnPlayerReset(true);
        int i2 = IAuthTabCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return safePlayerView;
    }

    private static final Unit onWarmupCompleted(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(safePlayerView, "");
            safePlayerView.getPlayer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(safePlayerView, "");
        if (safePlayerView.getPlayer() != exoPlayer) {
            safePlayerView.setPlayer(exoPlayer);
        }
        Unit unit = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 23;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            Unit unit = Unit.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(Function1 function1, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, !IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor));
            if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
                function1.invoke(NativeAdsEventLogType.writeTypedObject.onExtraCallback);
            } else {
                function1.invoke(NativeAdsEventLogType.onPostMessage.IAuthTabCallback);
                int i3 = onExtraCallbackWithResult + 33;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            IAuthTabCallbackDefault(getsupportedhighspeedresolutionsfor, !IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor));
            if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    private static final Unit access000(Function1 function1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(View.getDefaultSize(0, 0) + 205, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 31172), objArr);
        function1.invoke(((String) objArr[0]).intern());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final Unit asBinder(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(useandconfigureprogramwithtexture, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(isQueryRefinementEnabled isqueryrefinementenabled, final Function1 function1, long j, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final ExoPlayer exoPlayer, NativeAdsDto.Creative.FeedVideo feedVideo, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final Function1 function12, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, String str, long j2, MeteringRepeatingSessionExternalSyntheticLambda0 meteringRepeatingSessionExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        boolean z2;
        HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z3;
        int i2;
        CharSequence charSequence;
        String strIntern;
        boolean z4;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            z = (i & 26) != 46;
        } else {
            Intrinsics.checkNotNullParameter(meteringRepeatingSessionExternalSyntheticLambda0, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1716196600, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeedVideo.<anonymous>.<anonymous>.<anonymous> (NativeAdsFeedVideo.kt:426)");
            }
            QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult = FocusMeteringControlExternalSyntheticLambda2.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, 1, (Object) null), 1.7777778f, false, 2, (Object) null);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
            if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda16
                    private static int onExtraCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj) {
                        int i5 = 2 % 2;
                        int i6 = onWarmupCompleted + 71;
                        onExtraCallback = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(((Boolean) obj).booleanValue())};
                        Unit unit = (Unit) onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1666102640, 1666102646);
                        int i8 = onWarmupCompleted + 123;
                        onExtraCallback = i8 % 128;
                        if (i8 % 2 != 0) {
                            return unit;
                        }
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = onPageCommitVisible.onNavigationEvent(quirksExternalSyntheticBackport0OnExtraCallbackWithResult, 0.5f, (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResult, 438);
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i5 = onExtraCallbackWithResult + 65;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda17
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke() {
                            int i7 = 2 % 2;
                            int i8 = onWarmupCompleted + 55;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                            Unit unitIAuthTabCallback = onReceivedError.IAuthTabCallback(function1);
                            if (i9 == 0) {
                                int i10 = 12 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent, isqueryrefinementenabled, (Function0) objOnMinimized2);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i7 = onExtraCallbackWithResult + 87;
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        throw null;
                    }
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i8 = IAuthTabCallback + 37;
                    onExtraCallbackWithResult = i8 % 128;
                    if (i8 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        z2 = false;
                        int i9 = 16 / 0;
                    } else {
                        z2 = false;
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    }
                } else {
                    z2 = false;
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda2 highSpeedResolverExternalSyntheticLambda22 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent2 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exoPlayer);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if (!zOnExtraCallback) {
                    Object obj = objOnMinimized3;
                    if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                        Function1 function13 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda18
                            private static int IAuthTabCallback = 1;
                            private static int onExtraCallbackWithResult;

                            public final Object invoke(Object obj2) {
                                int i10 = 2 % 2;
                                int i11 = IAuthTabCallback + 55;
                                onExtraCallbackWithResult = i11 % 128;
                                int i12 = i11 % 2;
                                SafePlayerView safePlayerViewOnWarmupCompleted = onReceivedError.onWarmupCompleted(exoPlayer, (Context) obj2);
                                int i13 = onExtraCallbackWithResult + 87;
                                IAuthTabCallback = i13 % 128;
                                if (i13 % 2 != 0) {
                                    return safePlayerViewOnWarmupCompleted;
                                }
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function13);
                        obj = function13;
                    }
                    Function1 function14 = (Function1) obj;
                    boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult.onExtraCallback(exoPlayer);
                    Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(!zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                        objOnMinimized4 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda19
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj2) {
                                int i10 = 2 % 2;
                                int i11 = IAuthTabCallback + 31;
                                onWarmupCompleted = i11 % 128;
                                int i12 = i11 % 2;
                                Object[] objArr = {exoPlayer, (SafePlayerView) obj2};
                                Unit unit = (Unit) onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -184523739, 184523748);
                                int i13 = IAuthTabCallback + 115;
                                onWarmupCompleted = i13 % 128;
                                int i14 = i13 % 2;
                                return unit;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                    }
                    CaptureOutputSurfaceForCaptureProcessorExternalSyntheticLambda0.onExtraCallback(function14, quirksExternalSyntheticBackport0OnNavigationEvent2, (Function1) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResult, 48, 0);
                    if (access100((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor3)) {
                        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1896392709);
                        String strAccess000 = feedVideo.access000();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent3 = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                        Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda20
                                private static int IAuthTabCallback = 0;
                                private static int onExtraCallback = 1;

                                public final Object invoke(Object obj2) {
                                    int i10 = 2 % 2;
                                    int i11 = onExtraCallback + 71;
                                    IAuthTabCallback = i11 % 128;
                                    int i12 = i11 % 2;
                                    int iOnExtraCallback = C40Encoder.onExtraCallback();
                                    int iOnExtraCallback2 = C40Encoder.onExtraCallback();
                                    Unit unit = (Unit) onReceivedError.IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{(useAndConfigureProgramWithTexture) obj2}, -199570347, 199570354);
                                    int i13 = IAuthTabCallback + 85;
                                    onExtraCallback = i13 % 128;
                                    if (i13 % 2 != 0) {
                                        return unit;
                                    }
                                    Object obj3 = null;
                                    obj3.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                        }
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strAccess000, getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnNavigationEvent3, (Function1) objOnMinimized5), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    } else {
                        highSpeedResolverExternalSyntheticLambda2 = highSpeedResolverExternalSyntheticLambda22;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                        cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(1896767220);
                        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    }
                    if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor2)) {
                        int i10 = IAuthTabCallback + 73;
                        onExtraCallbackWithResult = i10 % 128;
                        int i11 = i10 % 2;
                        z3 = false;
                        i2 = 1;
                        Object[] objArr = new Object[1];
                        a(ViewConfiguration.getKeyRepeatTimeout() >> 16, 67 - Color.blue(0), (char) (15279 - (ViewConfiguration.getTapTimeout() >> 16)), objArr);
                        strIntern = ((String) objArr[0]).intern();
                        charSequence = "";
                    } else {
                        z3 = false;
                        i2 = 1;
                        charSequence = "";
                        Object[] objArr2 = new Object[1];
                        a(67 - Drawable.resolveOpacity(0, 0), KeyEvent.keyCodeFromString("") + 66, (char) (TextUtils.lastIndexOf(charSequence, '0', 0) + 1), objArr2);
                        strIntern = ((String) objArr2[0]).intern();
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallbackWithResult(highSpeedResolverExternalSyntheticLambda2.onWarmupCompleted(onextracallback, onextracallbackwithresult.onNavigationEvent()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(58.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f)), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f));
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                    boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(function12);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!(zOnNavigationEvent2 | zOnNavigationEvent3)) {
                        Object obj2 = objOnMinimized6;
                        if (objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                            Function0 function0 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda21
                                private static int IAuthTabCallback = 1;
                                private static int onExtraCallbackWithResult;

                                public final Object invoke() {
                                    int i12 = 2 % 2;
                                    int i13 = IAuthTabCallback + 23;
                                    onExtraCallbackWithResult = i13 % 128;
                                    int i14 = i13 % 2;
                                    Unit unitOnExtraCallbackWithResult = onReceivedError.onExtraCallbackWithResult(function12, getsupportedhighspeedresolutionsfor2);
                                    int i15 = onExtraCallbackWithResult + 45;
                                    IAuthTabCallback = i15 % 128;
                                    int i16 = i15 % 2;
                                    return unitOnExtraCallbackWithResult;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(function0);
                            obj2 = function0;
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent4, false, (setByteOrder) null, 0.0f, 0.99f, (deprecated_url) null, (List) null, false, (noStore) null, false, 0L, (String) null, (Function0) obj2, (Function1) null, (Camera2CapturePipelineTorchTaskExternalSyntheticLambda2) null, 14326, (Object) null);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (objOnMinimized7 == onwarmupcompleted.onExtraCallback()) {
                            objOnMinimized7 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda22
                                private static int IAuthTabCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj3) {
                                    int i12 = 2 % 2;
                                    int i13 = IAuthTabCallback + 29;
                                    onWarmupCompleted = i13 % 128;
                                    int i14 = i13 % 2;
                                    Unit unitOnWarmupCompleted = onReceivedError.onWarmupCompleted((useAndConfigureProgramWithTexture) obj3);
                                    if (i14 == 0) {
                                        int i15 = 9 / 0;
                                    }
                                    int i16 = onWarmupCompleted + 111;
                                    IAuthTabCallback = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        int i17 = 69 / 0;
                                    }
                                    return unitOnWarmupCompleted;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized7);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback, (Function1) objOnMinimized7);
                        immediateFailedFuture.IAuthTabCallback iAuthTabCallback = immediateFailedFuture.Companion;
                        CharSequence charSequence2 = charSequence;
                        int i12 = i2;
                        AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{strIntern, quirksExternalSyntheticBackport0OnWarmupCompleted2, null, null, null, null, null, null, iAuthTabCallback.IAuthTabCallback(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663680, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, i12, (Object) null), j, (toMetersPerSecond) null, 2, (Object) null);
                        component5 component5VarOnWarmupCompleted2 = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback2);
                        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (((cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout() ? 1 : 0) ^ i12) != i12) {
                            int i13 = onExtraCallbackWithResult + 107;
                            IAuthTabCallback = i13 % 128;
                            if (i13 % 2 == 0) {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                                int i14 = 90 / 0;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                            }
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnWarmupCompleted2, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(onextracallback, 0.0f, i12, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(14.0f));
                        boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent4) {
                            int i15 = onExtraCallbackWithResult + 103;
                            IAuthTabCallback = i15 % 128;
                            int i16 = i15 % 2;
                            if (objOnMinimized8 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda23
                                    private static int onExtraCallbackWithResult = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke() {
                                        int i17 = 2 % 2;
                                        int i18 = onExtraCallbackWithResult + 5;
                                        onNavigationEvent = i18 % 128;
                                        int i19 = i18 % 2;
                                        Object[] objArr3 = {function1};
                                        if (i19 == 0) {
                                            return (Unit) onReceivedError.IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr3, 98475371, -98475371);
                                        }
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnNavigationEvent5, isqueryrefinementenabled, (Function0) objOnMinimized8);
                            component5 component5VarOnExtraCallback = RowKt.onExtraCallback(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.asInterface(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult, 48);
                            int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback2);
                            Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                                getAwbState.onExtraCallback();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                                int i17 = IAuthTabCallback + 15;
                                onExtraCallbackWithResult = i17 % 128;
                                if (i17 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                                    z4 = false;
                                    int i18 = 98 / 0;
                                } else {
                                    z4 = false;
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                                }
                            } else {
                                z4 = false;
                                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                            }
                            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted4, onextracallbackwithresult2.onTransact());
                            boolean z5 = z4;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, RowScope.onNavigationEvent(RowScopeInstance.onNavigationEvent, onextracallback, 1.0f, false, 2, (Object) null), null, Long.valueOf(j2), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, Integer.valueOf(z5 ? 1 : 0), Boolean.valueOf(z5), GraphicDeviceInfo.Companion.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f));
                            Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                            if (objOnMinimized9 == onwarmupcompleted.onExtraCallback()) {
                                objOnMinimized9 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda24
                                    private static int IAuthTabCallback = 1;
                                    private static int onNavigationEvent;

                                    public final Object invoke(Object obj3) {
                                        int i19 = 2 % 2;
                                        int i20 = IAuthTabCallback + 41;
                                        onNavigationEvent = i20 % 128;
                                        int i21 = i20 % 2;
                                        Unit unitIAuthTabCallback = onReceivedError.IAuthTabCallback((useAndConfigureProgramWithTexture) obj3);
                                        if (i21 != 0) {
                                            int i22 = 44 / 0;
                                        }
                                        int i23 = onNavigationEvent + 67;
                                        IAuthTabCallback = i23 % 128;
                                        int i24 = i23 % 2;
                                        return unitIAuthTabCallback;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized9);
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallbackDefault, (Function1) objOnMinimized9);
                            immediateFailedFuture immediatefailedfutureIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                            Object[] objArr3 = new Object[1];
                            a(133 - TextUtils.getCapsMode(charSequence2, z5 ? 1 : 0, z5 ? 1 : 0), 71 - TextUtils.lastIndexOf(charSequence2, '0', z5 ? 1 : 0, z5 ? 1 : 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr3);
                            AppLovinNativeAdImplc.onExtraCallback(((String) objArr3[z5 ? 1 : 0]).intern(), j2, quirksExternalSyntheticBackport0OnWarmupCompleted5, (String) null, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, immediatefailedfutureIAuthTabCallback, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 100666374, 752);
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0569  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, final Function1 function1, QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted, boolean z, final String str, long j, boolean z2, final NativeAdsDto.Creative.FeedVideo feedVideo, boolean z3, long j2, long j3, long j4, boolean z4, long j5, final long j6, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final ExoPlayer exoPlayer, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, final Function1 function12, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, final String str2, final long j7, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        float f;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        Object obj;
        float f2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        boolean z5;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent;
        isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled2;
        float f3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        int i2;
        Object obj2;
        char c;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05;
        char c2;
        int i3 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-683224288, i, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeedVideo.<anonymous> (NativeAdsFeedVideo.kt:298)");
            }
            isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabledOnNavigationEvent = WebViewClientCompat.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(WebViewClientCompat.onNavigationEvent(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null), (QuirkSettingsLoader.onWarmupCompleted) null, false, 3, (Object) null), isqueryrefinementenabledOnNavigationEvent), iAuthTabCallback.onWarmupCompleted(), iAuthTabCallback.onExtraCallbackWithResult(), iAuthTabCallback.IAuthTabCallback(), iAuthTabCallback.onNavigationEvent());
            boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (!zOnNavigationEvent) {
                int i4 = IAuthTabCallback + 75;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i6 = 2 % 2;
                            int i7 = onExtraCallbackWithResult + 53;
                            onNavigationEvent = i7 % 128;
                            int i8 = i7 % 2;
                            Unit unitOnExtraCallbackWithResult = onReceivedError.onExtraCallbackWithResult(function1);
                            int i9 = onExtraCallbackWithResult + 49;
                            onNavigationEvent = i9 % 128;
                            int i10 = i9 % 2;
                            return unitOnExtraCallbackWithResult;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnWarmupCompleted, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.IAuthTabCallback_Parcel iAuthTabCallback_ParcelIAuthTabCallbackStub = focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(iAuthTabCallback_ParcelIAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.asInterface(), onwarmupcompleted, cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback);
                Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
                RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                if (z2) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1370470119);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = ensureNavButtonView.onExtraCallback(setExtensionStrength.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(quirksExternalSyntheticBackport06, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f)), RoundedCornerShapeKt.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(1.0f), j, RoundedCornerShapeKt.onWarmupCompleted());
                    boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if ((!zOnNavigationEvent2) && objOnMinimized2 != CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        c2 = 2;
                    } else {
                        objOnMinimized2 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda1
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke() {
                                int i6 = 2 % 2;
                                int i7 = onExtraCallback + 69;
                                onNavigationEvent = i7 % 128;
                                int i8 = i7 % 2;
                                Unit unitOnNavigationEvent = onReceivedError.onNavigationEvent(function1);
                                int i9 = onNavigationEvent + 71;
                                onExtraCallback = i9 % 128;
                                int i10 = i9 % 2;
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
                        int i6 = IAuthTabCallback + 75;
                        onExtraCallbackWithResult = i6 % 128;
                        c2 = 2;
                        int i7 = i6 % 2;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback2 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback2, isqueryrefinementenabledOnNavigationEvent, (Function0) objOnMinimized2);
                    Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized3 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized3 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda2
                            private static int onExtraCallbackWithResult = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) {
                                int i8 = 2 % 2;
                                int i9 = onExtraCallbackWithResult + 47;
                                onWarmupCompleted = i9 % 128;
                                Object obj4 = null;
                                useAndConfigureProgramWithTexture useandconfigureprogramwithtexture = (useAndConfigureProgramWithTexture) obj3;
                                if (i9 % 2 != 0) {
                                    onReceivedError.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                                    throw null;
                                }
                                Unit unitOnExtraCallbackWithResult = onReceivedError.onExtraCallbackWithResult(useandconfigureprogramwithtexture);
                                int i10 = onExtraCallbackWithResult + 21;
                                onWarmupCompleted = i10 % 128;
                                if (i10 % 2 == 0) {
                                    return unitOnExtraCallbackWithResult;
                                }
                                obj4.hashCode();
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted4 = getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0IAuthTabCallback2, (Function1) objOnMinimized3);
                    component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                    int iHashCode3 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted5 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted4);
                    Function0 function0IAuthTabCallback3 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                        getAwbState.onExtraCallback();
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback3);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject3, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, Integer.valueOf(iHashCode3), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult3, quirksExternalSyntheticBackport0OnWarmupCompleted5, onextracallbackwithresult2.onTransact());
                    HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                    f = 0.0f;
                    isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                    AppLovinNativeAdImplc.onNavigationEvent(ACPayResult.onWarmupCompleted(), 1164123659, ACPayResult.onWarmupCompleted(), new Object[]{(String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport06, 0.0f, 1, (Object) null), null, null, null, null, null, null, immediateFailedFuture.Companion.onWarmupCompleted(), null, cameraCaptureResultEmptyCameraCaptureResult, 100663728, 760}, ACPayResult.onWarmupCompleted(), -1164123658, ACPayResult.onWarmupCompleted());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    f = 0.0f;
                    isqueryrefinementenabled = isqueryrefinementenabledOnNavigationEvent;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport06;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1371332136);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(RowScope.onNavigationEvent(rowScopeInstance, quirksExternalSyntheticBackport02, 1.0f, false, 2, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                component5 component5VarOnNavigationEvent2 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                int iHashCode4 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted6 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallback3);
                Function0 function0IAuthTabCallback4 = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    int i8 = IAuthTabCallback + 125;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i10 = IAuthTabCallback + 85;
                    onExtraCallbackWithResult = i10 % 128;
                    if (i10 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback4);
                    obj = null;
                } else {
                    obj = null;
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, component5VarOnNavigationEvent2, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject4, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, Integer.valueOf(iHashCode4), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult4, quirksExternalSyntheticBackport0OnWarmupCompleted6, onextracallbackwithresult2.onTransact());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport02, z2 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                if (z3) {
                    f2 = f;
                    quirksExternalSyntheticBackport0OnNavigationEvent = quirksExternalSyntheticBackport02;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport0OnNavigationEvent;
                    z5 = true;
                } else {
                    f2 = f;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                    z5 = true;
                    quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(quirksExternalSyntheticBackport03, f2, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(36.0f), 1, obj);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = quirksExternalSyntheticBackport0OnExtraCallback4.onExtraCallback(quirksExternalSyntheticBackport0OnNavigationEvent);
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                if ((zOnNavigationEvent3 ^ z5) != z5 || objOnMinimized4 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized4 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda3
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = onExtraCallback + 63;
                            onExtraCallbackWithResult = i12 % 128;
                            int i13 = i12 % 2;
                            Unit unitAsBinder = onReceivedError.asBinder(function1);
                            int i14 = onExtraCallback + 63;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            return unitAsBinder;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized4);
                }
                isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled3 = isqueryrefinementenabled;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback3 = WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback5, isqueryrefinementenabled3, (Function0) objOnMinimized4);
                String strAsBinder = feedVideo.asBinder();
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(16);
                int iOnTransact = createCameraCaptureCallback.Companion.onTransact();
                GraphicDeviceInfo.IAuthTabCallback iAuthTabCallback2 = GraphicDeviceInfo.Companion;
                float f4 = f2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport07 = quirksExternalSyntheticBackport03;
                int i11 = 0;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsBinder, quirksExternalSyntheticBackport0IAuthTabCallback3, null, Long.valueOf(j2), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iOnTransact), Float.valueOf(f4), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (!z3) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-284207790);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-284612092);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback6 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport07, z2 ? VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f) : VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f4), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (objOnMinimized5 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda4
                            private static int onExtraCallback = 0;
                            private static int onExtraCallbackWithResult = 1;

                            public final Object invoke(Object obj3) {
                                int i12 = 2 % 2;
                                int i13 = onExtraCallback + 5;
                                onExtraCallbackWithResult = i13 % 128;
                                int i14 = i13 % 2;
                                Unit unitOnNavigationEvent = onReceivedError.onNavigationEvent((useAndConfigureProgramWithTexture) obj3);
                                int i15 = onExtraCallbackWithResult + 55;
                                onExtraCallback = i15 % 128;
                                if (i15 % 2 != 0) {
                                    int i16 = 35 / 0;
                                }
                                return unitOnNavigationEvent;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized5);
                    }
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_ad, cameraCaptureResultEmptyCameraCaptureResult, 0), getExtensionsBeforeInitialized.onWarmupCompleted(quirksExternalSyntheticBackport0OnExtraCallback6, (Function1) objOnMinimized5), null, Long.valueOf(j3), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(13)), 0L, null, null, null, Float.valueOf(f4), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (z) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(262815895);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback7 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport07, f4, 1, (Object) null), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f), 0.0f, 0.0f, 13, (Object) null), 0.0f, 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), 0.0f, 11, (Object) null);
                    boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(str);
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                    if (!zOnNavigationEvent4) {
                        int i12 = IAuthTabCallback + 103;
                        onExtraCallbackWithResult = i12 % 128;
                        int i13 = i12 % 2;
                        if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                            objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda5
                                private static int onExtraCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj3) {
                                    int i14 = 2 % 2;
                                    int i15 = onExtraCallback + 95;
                                    onNavigationEvent = i15 % 128;
                                    int i16 = i15 % 2;
                                    Unit unitOnNavigationEvent = onReceivedError.onNavigationEvent(str, (useAndConfigureProgramWithTexture) obj3);
                                    int i17 = onNavigationEvent + 37;
                                    onExtraCallback = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        return unitOnNavigationEvent;
                                    }
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized6);
                        }
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback4 = getExtensionsBeforeInitialized.IAuthTabCallback(quirksExternalSyntheticBackport0OnExtraCallback7, true, (Function1) objOnMinimized6);
                        component5 component5VarOnNavigationEvent3 = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(focusMeteringControlExternalSyntheticLambda12.IAuthTabCallbackStub(), onextracallbackwithresult.IAuthTabCallbackStubProxy(), cameraCaptureResultEmptyCameraCaptureResult, 0);
                        int iHashCode5 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted7 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0IAuthTabCallback4);
                        Function0 function0IAuthTabCallback5 = onextracallbackwithresult2.IAuthTabCallback();
                        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                            int i14 = IAuthTabCallback + 41;
                            onExtraCallbackWithResult = i14 % 128;
                            int i15 = i14 % 2;
                            getAwbState.onExtraCallback();
                        }
                        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback5);
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                        }
                        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, component5VarOnNavigationEvent3, onextracallbackwithresult2.asBinder());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject5, onextracallbackwithresult2.asInterface());
                        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, Integer.valueOf(iHashCode5), onextracallbackwithresult2.onWarmupCompleted());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, onextracallbackwithresult2.onNavigationEvent());
                        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult5, quirksExternalSyntheticBackport0OnWarmupCompleted7, onextracallbackwithresult2.onTransact());
                        boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                        Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                        if (!zOnNavigationEvent5) {
                            int i16 = onExtraCallbackWithResult + 125;
                            IAuthTabCallback = i16 % 128;
                            int i17 = i16 % 2;
                            if (objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                objOnMinimized7 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda6
                                    private static int onNavigationEvent = 1;
                                    private static int onWarmupCompleted;

                                    public final Object invoke() {
                                        int i18 = 2 % 2;
                                        int i19 = onNavigationEvent + 87;
                                        onWarmupCompleted = i19 % 128;
                                        int i20 = i19 % 2;
                                        Function1 function13 = function1;
                                        if (i20 == 0) {
                                            return onReceivedError.onWarmupCompleted(function13);
                                        }
                                        onReceivedError.onWarmupCompleted(function13);
                                        Object obj3 = null;
                                        obj3.hashCode();
                                        throw null;
                                    }
                                };
                                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized7);
                            }
                            isqueryrefinementenabled2 = isqueryrefinementenabled3;
                            i11 = 0;
                            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feedVideo.asInterface(), WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport07, isqueryrefinementenabled2, (Function0) objOnMinimized7), null, Long.valueOf(j4), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, iAuthTabCallback2.asBinder(), null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 196608, 98276}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                            if (z4) {
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-670715254);
                                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1);
                                Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
                                if (zOnNavigationEvent6 || objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                    objOnMinimized8 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda7
                                        private static int onExtraCallback = 1;
                                        private static int onNavigationEvent;

                                        public final Object invoke() {
                                            int i18 = 2 % 2;
                                            int i19 = onNavigationEvent + 83;
                                            onExtraCallback = i19 % 128;
                                            int i20 = i19 % 2;
                                            Unit unitAsInterface = onReceivedError.asInterface(function1);
                                            int i21 = onNavigationEvent + 67;
                                            onExtraCallback = i21 % 128;
                                            if (i21 % 2 == 0) {
                                                int i22 = 2 / 0;
                                            }
                                            return unitAsInterface;
                                        }
                                    };
                                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized8);
                                }
                                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport07;
                                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{feedVideo.IAuthTabCallbackStub(), WebViewClientCompat.IAuthTabCallback(quirksExternalSyntheticBackport07, isqueryrefinementenabled2, (Function0) objOnMinimized8), null, Long.valueOf(j5), Long.valueOf(RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(15)), 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 24576, 0, 131044}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            } else {
                                quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport07;
                                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-670338821);
                                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            }
                            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                            f3 = 0.0f;
                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                            c = 6;
                            i2 = 1;
                            obj2 = null;
                        }
                    }
                } else {
                    isqueryrefinementenabled2 = isqueryrefinementenabled3;
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(264139037);
                    f3 = f4;
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport07;
                    i2 = 1;
                    obj2 = null;
                    c = 6;
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, f3, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f)), cameraCaptureResultEmptyCameraCaptureResult, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback8 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport04, f3, i2, obj2), 0.0f, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f), 0.0f, 0.0f, 13, (Object) null);
                RoundedCornerShape roundedCornerShapeOnNavigationEvent = RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(12.0f));
                setFeatureSelectionListener setfeatureselectionlistener = setFeatureSelectionListener.onNavigationEvent;
                long jIAuthTabCallbackDefault = setByteOrder.Companion.IAuthTabCallbackDefault();
                int i18 = setFeatureSelectionListener.onExtraCallbackWithResult;
                Object obj3 = null;
                final isQueryRefinementEnabled<Float, onSuggestionsKey> isqueryrefinementenabled4 = isqueryrefinementenabled2;
                SessionConfigBuilder.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnExtraCallback8, roundedCornerShapeOnNavigationEvent, setfeatureselectionlistener.onNavigationEvent(jIAuthTabCallbackDefault, 0L, 0L, 0L, cameraCaptureResultEmptyCameraCaptureResult, (i18 << 12) | 6, 14), (SessionConfigExternalSyntheticLambda0) null, setfeatureselectionlistener.IAuthTabCallback(true, cameraCaptureResultEmptyCameraCaptureResult, (i18 << 3) | 6, i11).onExtraCallbackWithResult(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(2.0f), new createString(j, (DefaultConstructorMarker) null)), ForwardingCameraControl.onExtraCallback(-1716196600, true, new getBacktraceNote() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda8
                    private static int IAuthTabCallback = 1;
                    private static int onWarmupCompleted;

                    public final Object invoke(Object obj4, Object obj5, Object obj6) throws Throwable {
                        int i19 = 2 % 2;
                        int i20 = onWarmupCompleted + 95;
                        IAuthTabCallback = i20 % 128;
                        int i21 = i20 % 2;
                        Unit unitOnExtraCallback = onReceivedError.onExtraCallback(isqueryrefinementenabled4, function1, j6, getsupportedhighspeedresolutionsfor, exoPlayer, feedVideo, getsupportedhighspeedresolutionsfor2, function12, getsupportedhighspeedresolutionsfor3, str2, j7, (MeteringRepeatingSessionExternalSyntheticLambda0) obj4, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                        int i22 = onWarmupCompleted + 77;
                        IAuthTabCallback = i22 % 128;
                        int i23 = i22 % 2;
                        return unitOnExtraCallback;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 8);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i19 = onExtraCallbackWithResult + 31;
                    IAuthTabCallback = i19 % 128;
                    if (i19 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        obj3.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0914  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IAuthTabCallback(@Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, final boolean z, @NotNull final deleteProfile deleteprofile, @NotNull final NativeAdsDto.Creative.FeedVideo feedVideo, @NotNull final List<? extends NativeAdsEventLogType> list, final boolean z2, @Nullable onReceivedHttpError.IAuthTabCallback iAuthTabCallback, @Nullable Function1<? super NativeAdsEventLogType, Unit> function1, @NotNull final Function1<? super String, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i3;
        onReceivedHttpError.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult;
        Function1<? super NativeAdsEventLogType, Unit> function13;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final Function1<? super NativeAdsEventLogType, Unit> function14;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final onReceivedHttpError.IAuthTabCallback iAuthTabCallback2;
        String strOnExtraCallback;
        int i4;
        String strAsInterface;
        long j;
        String str;
        QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z3;
        boolean z4;
        boolean z5;
        float f;
        float f2;
        NativeAdsEventLogType.extraCallbackWithResult extracallbackwithresult;
        List list2;
        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        Object obj;
        boolean z6;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor;
        boolean zOnExtraCallback;
        boolean zOnNavigationEvent;
        Object objOnMinimized;
        boolean zOnNavigationEvent2;
        boolean zOnExtraCallback2;
        boolean zOnExtraCallback3;
        Object objOnMinimized2;
        boolean zOnNavigationEvent3;
        boolean zOnNavigationEvent4;
        boolean zOnNavigationEvent5;
        boolean z7;
        Object objOnMinimized3;
        List list3;
        boolean zOnExtraCallback4;
        boolean zOnExtraCallback5;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2;
        boolean zOnNavigationEvent6;
        boolean z8;
        boolean zOnNavigationEvent7;
        boolean zOnNavigationEvent8;
        boolean zOnNavigationEvent9;
        boolean zOnNavigationEvent10;
        Object objOnMinimized4;
        boolean zOnNavigationEvent11;
        Object objOnMinimized5;
        Configuration configuration;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(deleteprofile, "");
        Intrinsics.checkNotNullParameter(feedVideo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(496299616);
        int i7 = i2 & 1;
        if (i7 != 0) {
            int i8 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            i3 = i | 6;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        } else if ((i & 6) == 0) {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 4 : 2) | i;
        } else {
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z) ? 32 : 16;
        }
        Object obj2 = null;
        if ((i & 384) == 0) {
            int i10 = IAuthTabCallback + 53;
            onExtraCallbackWithResult = i10 % 128;
            if (i10 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal());
                obj2.hashCode();
                throw null;
            }
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(deleteprofile.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo)) {
                int i11 = IAuthTabCallback + 119;
                onExtraCallbackWithResult = i11 % 128;
                int i12 = i11 % 2;
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i & 24576) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
            i3 |= ((i2 & 64) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(iAuthTabCallbackOnExtraCallbackWithResult)) ? 1048576 : 524288;
        } else {
            iAuthTabCallbackOnExtraCallbackWithResult = iAuthTabCallback;
        }
        int i13 = i2 & 128;
        if (i13 != 0) {
            i3 |= 12582912;
            function13 = function1;
        } else {
            function13 = function1;
            if ((i & 12582912) == 0) {
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function13) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function12) ? 67108864 : 33554432;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 38347923) != 38347922, i3 & 1)) {
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
            if ((i & 1) == 0 || cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                if (i7 != 0) {
                    quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    iAuthTabCallbackOnExtraCallbackWithResult = onReceivedHttpError.onNavigationEvent.onExtraCallbackWithResult(false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663296, 255);
                }
                if (i13 != 0) {
                    Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (objOnMinimized6 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda9
                            private static int IAuthTabCallback = 1;
                            private static int onWarmupCompleted;

                            public final Object invoke(Object obj3) {
                                int i14 = 2 % 2;
                                int i15 = IAuthTabCallback + 9;
                                onWarmupCompleted = i15 % 128;
                                NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) obj3;
                                if (i15 % 2 == 0) {
                                    return onReceivedError.IAuthTabCallback(nativeAdsEventLogType);
                                }
                                onReceivedError.IAuthTabCallback(nativeAdsEventLogType);
                                throw null;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                    }
                    int i14 = onExtraCallbackWithResult + 125;
                    IAuthTabCallback = i14 % 128;
                    int i15 = i14 % 2;
                    function13 = (Function1) objOnMinimized6;
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
            }
            final Function1<? super NativeAdsEventLogType, Unit> function15 = function13;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = quirksExternalSyntheticBackport02;
            final onReceivedHttpError.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallbackOnExtraCallbackWithResult;
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(496299616, i3, -1, "im.toss.ads_sdk.ui.compose.NativeAdsFeedVideo (NativeAdsFeedVideo.kt:83)");
            }
            Context context = (Context) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidCompositionLocals_androidKt.IAuthTabCallback());
            r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky42 = (r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted());
            final TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = (TextFieldScrollKtExternalSyntheticLambda0) cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback(AndroidTextContextMenuToolbarProvider_androidKtExternalSyntheticLambda1.IAuthTabCallback());
            boolean zIsBlank = StringsKt.isBlank(feedVideo.asInterface());
            boolean zIsBlank2 = StringsKt.isBlank(feedVideo.IAuthTabCallbackStub());
            boolean zIsBlank3 = StringsKt.isBlank((String) NativeAdsDto.Creative.FeedVideo.onNavigationEvent(598113625, new Object[]{feedVideo}, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback(), -598113624, MydataManageConsentsNavHostKt$.ExternalSyntheticLambda10.onExtraCallback()));
            if (StringsKt.isBlank(feedVideo.IAuthTabCallbackStubProxy())) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1985217027);
                strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.ads_sdk_text_more, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(1985180292);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                strOnExtraCallback = feedVideo.IAuthTabCallbackStubProxy();
            }
            final String str2 = strOnExtraCallback;
            getStrokeWidth getstrokewidth = getStrokeWidth.onExtraCallback;
            boolean zOnExtraCallbackWithResult = getstrokewidth.onExtraCallbackWithResult(deleteprofile, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | 48);
            if (zOnExtraCallbackWithResult) {
                int i16 = IAuthTabCallback + 105;
                onExtraCallbackWithResult = i16 % 128;
                if (i16 % 2 != 0) {
                    throw null;
                }
                i4 = 484039167;
            } else {
                i4 = 218243143;
            }
            final long jOnExtraCallback = ByteOrderedDataOutputStream.onExtraCallback(i4);
            final long jAsBinder = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
            final long jAsBinder2 = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4287337889L);
            final long jAsBinder3 = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4281548107L);
            long jAsBinder4 = zOnExtraCallbackWithResult ? setByteOrder.Companion.asBinder() : ByteOrderedDataOutputStream.onExtraCallbackWithResult(4283324776L);
            final long jOnExtraCallback2 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feedVideo.access100(), -1));
            final long jOnExtraCallback3 = ByteOrderedDataOutputStream.onExtraCallback(getstrokewidth.IAuthTabCallback(context, feedVideo.onTransact(), Color.parseColor("#262459")));
            if (zIsBlank || zIsBlank2) {
                strAsInterface = feedVideo.asInterface();
            } else {
                strAsInterface = feedVideo.asInterface() + ", " + feedVideo.IAuthTabCallbackStub();
            }
            String str3 = strAsInterface;
            float fMin = Math.min(context.getApplicationContext().getResources().getConfiguration().fontScale, 1.6f);
            Resources resources = context.getResources();
            QuirkSettingsLoader.onWarmupCompleted onwarmupcompletedAccess000 = ((resources == null || (configuration = resources.getConfiguration()) == null) ? 1.0f : configuration.fontScale) > 1.1f ? QuirkSettingsLoader.Companion.access000() : QuirkSettingsLoader.Companion.IAuthTabCallbackDefault();
            boolean zOnNavigationEvent12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.getInterfaceDescriptor());
            Object objOnMinimized7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (zOnNavigationEvent12 || objOnMinimized7 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                j = jAsBinder4;
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(feedVideo.getInterfaceDescriptor(), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted);
                objOnMinimized7 = getsupportedhighspeedresolutionsforOnWarmupCompleted;
            } else {
                j = jAsBinder4;
            }
            final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3 = (getSupportedHighSpeedResolutionsFor) objOnMinimized7;
            boolean zOnNavigationEvent13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent((String) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor3}, -1369502711, 1369502722));
            Object objOnMinimized8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!zOnNavigationEvent13) {
                Object obj3 = objOnMinimized8;
                if (objOnMinimized8 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    CommonModule_setSecureScreen commonModule_setSecureScreen = CommonModule_setSecureScreen.onWarmupCompleted;
                    ExoPlayer exoPlayerIAuthTabCallback = CommonModule_setSecureScreen.IAuthTabCallback(commonModule_setSecureScreen, context, (String) null, (LoadControl) null, (Function1) null, (Function1) null, 30, (Object) null);
                    if (!StringsKt.isBlank((String) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor3}, -1369502711, 1369502722))) {
                        CommonModule_setSecureScreen.onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{commonModule_setSecureScreen, exoPlayerIAuthTabCallback, context, (String) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor3}, -1369502711, 1369502722), false, null, 12, null}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
                    }
                    exoPlayerIAuthTabCallback.setPlayWhenReady(false);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(exoPlayerIAuthTabCallback);
                    obj3 = exoPlayerIAuthTabCallback;
                }
                final ExoPlayer exoPlayer = (ExoPlayer) obj3;
                Object objOnMinimized9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted2 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized9 == onwarmupcompleted2.onExtraCallback()) {
                    str = str3;
                    objOnMinimized9 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized9);
                } else {
                    str = str3;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4 = (getSupportedHighSpeedResolutionsFor) objOnMinimized9;
                boolean zOnNavigationEvent14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                Object objOnMinimized10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent14 || objOnMinimized10 == onwarmupcompleted2.onExtraCallback()) {
                    onwarmupcompleted = onwarmupcompletedAccess000;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted2);
                    objOnMinimized10 = getsupportedhighspeedresolutionsforOnWarmupCompleted2;
                } else {
                    onwarmupcompleted = onwarmupcompletedAccess000;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5 = (getSupportedHighSpeedResolutionsFor) objOnMinimized10;
                boolean zOnNavigationEvent15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                Object objOnMinimized11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent15 || objOnMinimized11 == onwarmupcompleted2.onExtraCallback()) {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted3 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.TRUE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted3);
                    objOnMinimized11 = getsupportedhighspeedresolutionsforOnWarmupCompleted3;
                } else {
                    quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6 = (getSupportedHighSpeedResolutionsFor) objOnMinimized11;
                boolean zOnNavigationEvent16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(feedVideo.IAuthTabCallback());
                Object objOnMinimized12 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent16 || objOnMinimized12 == onwarmupcompleted2.onExtraCallback()) {
                    z3 = zIsBlank3;
                    getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsforOnWarmupCompleted4 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(getsupportedhighspeedresolutionsforOnWarmupCompleted4);
                    objOnMinimized12 = getsupportedhighspeedresolutionsforOnWarmupCompleted4;
                } else {
                    z3 = zIsBlank3;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor7 = (getSupportedHighSpeedResolutionsFor) objOnMinimized12;
                int i17 = 57344 & i3;
                if (i17 == 16384) {
                    z4 = zIsBlank;
                    z5 = true;
                } else {
                    z4 = zIsBlank;
                    z5 = false;
                }
                Object objOnMinimized13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z5 || objOnMinimized13 == onwarmupcompleted2.onExtraCallback()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        NativeAdsEventLogType nativeAdsEventLogType = (NativeAdsEventLogType) it.next();
                        Iterator it2 = it;
                        if (nativeAdsEventLogType instanceof NativeAdsEventLogType.extraCallbackWithResult) {
                            int i18 = onExtraCallbackWithResult + 63;
                            f2 = fMin;
                            IAuthTabCallback = i18 % 128;
                            if (i18 % 2 == 0) {
                                Object obj4 = null;
                                obj4.hashCode();
                                throw null;
                            }
                            extracallbackwithresult = (NativeAdsEventLogType.extraCallbackWithResult) nativeAdsEventLogType;
                        } else {
                            f2 = fMin;
                            extracallbackwithresult = null;
                        }
                        Long lValueOf = extracallbackwithresult != null ? Long.valueOf(extracallbackwithresult.onExtraCallbackWithResult()) : null;
                        if (lValueOf != null) {
                            arrayList.add(lValueOf);
                        }
                        it = it2;
                        fMin = f2;
                    }
                    f = fMin;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList);
                    objOnMinimized13 = arrayList;
                } else {
                    f = fMin;
                }
                List list4 = (List) objOnMinimized13;
                boolean z9 = i17 == 16384;
                Object objOnMinimized14 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z9 || objOnMinimized14 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        NativeAdsEventLogType nativeAdsEventLogType2 = (NativeAdsEventLogType) it3.next();
                        Iterator it4 = it3;
                        NativeAdsEventLogType.extraCallback extracallback = nativeAdsEventLogType2 instanceof NativeAdsEventLogType.extraCallback ? (NativeAdsEventLogType.extraCallback) nativeAdsEventLogType2 : null;
                        List list5 = list4;
                        r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky43 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                        Float fValueOf = extracallback != null ? Float.valueOf(extracallback.IAuthTabCallback() / 100.0f) : null;
                        if (fValueOf != null) {
                            arrayList2.add(fValueOf);
                        }
                        r8lambdanm9dm2eewl4vrptnjmesfjqky42 = r8lambdanm9dm2eewl4vrptnjmesfjqky43;
                        it3 = it4;
                        list4 = list5;
                    }
                    list2 = list4;
                    r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(arrayList2);
                    obj = arrayList2;
                } else {
                    list2 = list4;
                    r8lambdanm9dm2eewl4vrptnjmesfjqky4 = r8lambdanm9dm2eewl4vrptnjmesfjqky42;
                    obj = objOnMinimized14;
                }
                List list6 = (List) obj;
                boolean z10 = i17 == 16384;
                Object objOnMinimized15 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (z10 || objOnMinimized15 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    List<? extends NativeAdsEventLogType> list7 = list;
                    if (list7 instanceof Collection) {
                        int i19 = IAuthTabCallback + 119;
                        onExtraCallbackWithResult = i19 % 128;
                        int i20 = i19 % 2;
                        if (list7.isEmpty()) {
                            z6 = false;
                            objOnMinimized15 = Boolean.valueOf(z6);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                        } else {
                            Iterator<T> it5 = list7.iterator();
                            while (it5.hasNext()) {
                                if (((NativeAdsEventLogType) it5.next()) instanceof NativeAdsEventLogType.access100) {
                                    z6 = true;
                                    break;
                                }
                            }
                            z6 = false;
                            objOnMinimized15 = Boolean.valueOf(z6);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized15);
                        }
                    }
                }
                Boolean bool = (Boolean) objOnMinimized15;
                boolean zBooleanValue = bool.booleanValue();
                String strIAuthTabCallback = feedVideo.IAuthTabCallback();
                String interfaceDescriptor = feedVideo.getInterfaceDescriptor();
                boolean zOnNavigationEvent17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback);
                boolean zOnNavigationEvent18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor);
                Object objOnMinimized16 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent17 | zOnNavigationEvent18) || objOnMinimized16 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized16 = new LinkedHashSet();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized16);
                }
                Set set = (Set) objOnMinimized16;
                String strIAuthTabCallback2 = feedVideo.IAuthTabCallback();
                String interfaceDescriptor2 = feedVideo.getInterfaceDescriptor();
                boolean zOnNavigationEvent19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback2);
                boolean zOnNavigationEvent20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor2);
                r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky44 = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
                Object objOnMinimized17 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent19 | zOnNavigationEvent20) || objOnMinimized17 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized17 = new LinkedHashSet();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized17);
                }
                Set set2 = (Set) objOnMinimized17;
                String strIAuthTabCallback3 = feedVideo.IAuthTabCallback();
                String interfaceDescriptor3 = feedVideo.getInterfaceDescriptor();
                boolean zOnNavigationEvent21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback3);
                boolean zOnNavigationEvent22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor3);
                Object objOnMinimized18 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent21 | zOnNavigationEvent22) || objOnMinimized18 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized18 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized18);
                }
                getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor8 = (getSupportedHighSpeedResolutionsFor) objOnMinimized18;
                String strIAuthTabCallback4 = feedVideo.IAuthTabCallback();
                String interfaceDescriptor4 = feedVideo.getInterfaceDescriptor();
                boolean zOnNavigationEvent23 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(strIAuthTabCallback4);
                boolean zOnNavigationEvent24 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(interfaceDescriptor4);
                Object objOnMinimized19 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent23 | zOnNavigationEvent24) || objOnMinimized19 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized19 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized19);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor9 = (getSupportedHighSpeedResolutionsFor) objOnMinimized19;
                Object objOnMinimized20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted3 = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized20 == onwarmupcompleted3.onExtraCallback()) {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
                    objOnMinimized20 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized20);
                } else {
                    getsupportedhighspeedresolutionsfor = getsupportedhighspeedresolutionsfor8;
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor10 = (getSupportedHighSpeedResolutionsFor) objOnMinimized20;
                boolean zOnNavigationEvent25 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(exoPlayer);
                Object objOnMinimized21 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (!zOnNavigationEvent25) {
                    int i21 = IAuthTabCallback + 51;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    if (objOnMinimized21 == onwarmupcompleted3.onExtraCallback()) {
                        objOnMinimized21 = new onTransact(exoPlayer, getsupportedhighspeedresolutionsfor3);
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized21);
                    }
                    final onTransact ontransact = (onTransact) objOnMinimized21;
                    boolean zOnNavigationEvent26 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor9);
                    int i23 = 29360128 & i3;
                    boolean z11 = i23 == 8388608;
                    int i24 = i3 & 458752;
                    boolean z12 = i24 == 131072;
                    boolean zOnNavigationEvent27 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                    boolean zOnNavigationEvent28 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact);
                    boolean zOnExtraCallback6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                    boolean zOnNavigationEvent29 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor3);
                    boolean zOnNavigationEvent30 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                    Object objOnMinimized22 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(z11 | zOnNavigationEvent26 | z12 | zOnNavigationEvent27 | zOnNavigationEvent28 | zOnExtraCallback6 | zOnNavigationEvent29 | zOnNavigationEvent30)) {
                        int i25 = IAuthTabCallback + 33;
                        onExtraCallbackWithResult = i25 % 128;
                        if (i25 % 2 != 0) {
                            onwarmupcompleted3.onExtraCallback();
                            throw null;
                        }
                        if (objOnMinimized22 == onwarmupcompleted3.onExtraCallback()) {
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, ontransact, (Function1) objOnMinimized22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor6);
                        zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor6);
                        objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback | zOnNavigationEvent) || objOnMinimized == onwarmupcompleted3.onExtraCallback()) {
                            objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda11
                                private static int IAuthTabCallback = 1;
                                private static int onNavigationEvent;

                                public final Object invoke(Object obj5) {
                                    int i26 = 2 % 2;
                                    int i27 = IAuthTabCallback + 61;
                                    onNavigationEvent = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        onReceivedError.onExtraCallback(exoPlayer, getsupportedhighspeedresolutionsfor6, (isInVideoUsage) obj5);
                                        Object obj6 = null;
                                        obj6.hashCode();
                                        throw null;
                                    }
                                    decrementVideoUsage decrementvideousageOnExtraCallback = onReceivedError.onExtraCallback(exoPlayer, getsupportedhighspeedresolutionsfor6, (isInVideoUsage) obj5);
                                    int i28 = onNavigationEvent + 61;
                                    IAuthTabCallback = i28 % 128;
                                    int i29 = i28 % 2;
                                    return decrementvideousageOnExtraCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, Boolean.valueOf(zIAuthTabCallbackStub), (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent2 | zOnExtraCallback2 | zOnExtraCallback3) || objOnMinimized2 == onwarmupcompleted3.onExtraCallback()) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda12
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj5) {
                                    int i26 = 2 % 2;
                                    int i27 = onExtraCallbackWithResult + 89;
                                    onNavigationEvent = i27 % 128;
                                    int i28 = i27 % 2;
                                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0;
                                    if (i28 != 0) {
                                        return onReceivedError.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda02, exoPlayer, getsupportedhighspeedresolutionsfor7, (isInVideoUsage) obj5);
                                    }
                                    decrementVideoUsage decrementvideousageIAuthTabCallback = onReceivedError.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda02, exoPlayer, getsupportedhighspeedresolutionsfor7, (isInVideoUsage) obj5);
                                    int i29 = 1 / 0;
                                    return decrementvideousageIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                        }
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        Object[] objArr = {Boolean.valueOf(((Boolean) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor10}, -1660708681, 1660708683)).booleanValue()), Boolean.valueOf(z2), Boolean.valueOf(asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor7)), ontransact};
                        zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                        zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                        zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact);
                        z7 = i24 != 131072;
                        objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | z7) || objOnMinimized3 == onwarmupcompleted3.onExtraCallback()) {
                            objOnMinimized3 = new IAuthTabCallback(ontransact, z2, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor5, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        list3 = list2;
                        Object[] objArr2 = {Boolean.valueOf(access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4)), list3, list6, bool};
                        zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                        getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                        zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                        z8 = i23 != 8388608;
                        zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list6);
                        zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set);
                        zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list3);
                        zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set2);
                        objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnExtraCallback4 | zOnExtraCallback5 | zOnNavigationEvent6 | z8 | zOnNavigationEvent7 | zOnNavigationEvent8 | zOnNavigationEvent9 | zOnNavigationEvent10) || objOnMinimized4 == onwarmupcompleted3.onExtraCallback()) {
                            objOnMinimized4 = new onNavigationEvent(exoPlayer, zBooleanValue, function15, list6, list3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor2, set, set2, null);
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                        }
                        isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr2, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact);
                        objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!zOnNavigationEvent11 || objOnMinimized5 == onwarmupcompleted3.onExtraCallback()) {
                            objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda13
                                private static int onExtraCallback = 0;
                                private static int onExtraCallbackWithResult = 1;

                                public final Object invoke(Object obj5) {
                                    int i26 = 2 % 2;
                                    int i27 = onExtraCallbackWithResult + 85;
                                    onExtraCallback = i27 % 128;
                                    int i28 = i27 % 2;
                                    decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onReceivedError.onExtraCallbackWithResult(ontransact, (isInVideoUsage) obj5);
                                    int i29 = onExtraCallbackWithResult + 105;
                                    onExtraCallback = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        return decrementvideousageOnExtraCallbackWithResult;
                                    }
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                        }
                        isZslDisabledByByUserCaseConfig.onExtraCallback(ontransact, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        final boolean z13 = !z4;
                        final boolean z14 = !z3;
                        final boolean z15 = !zIsBlank2;
                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted4 = onwarmupcompleted;
                        final String str4 = str;
                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                        final long j2 = j;
                        setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky44.IAuthTabCallback(), f)), ForwardingCameraControl.onExtraCallback(-683224288, true, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda14
                            private static int onExtraCallback = 0;
                            private static int onNavigationEvent = 1;

                            public final Object invoke(Object obj5, Object obj6) {
                                int i26 = 2 % 2;
                                int i27 = onExtraCallback + 89;
                                onNavigationEvent = i27 % 128;
                                int i28 = i27 % 2;
                                Unit unitOnNavigationEvent = onReceivedError.onNavigationEvent(quirksExternalSyntheticBackport06, iAuthTabCallback3, function12, onwarmupcompleted4, z13, str4, jOnExtraCallback, z14, feedVideo, z, jAsBinder, jAsBinder2, jAsBinder3, z15, j2, jOnExtraCallback3, getsupportedhighspeedresolutionsfor10, exoPlayer, getsupportedhighspeedresolutionsfor6, function15, getsupportedhighspeedresolutionsfor5, str2, jOnExtraCallback2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                int i29 = onExtraCallback + 47;
                                onNavigationEvent = i29 % 128;
                                if (i29 % 2 != 0) {
                                    return unitOnNavigationEvent;
                                }
                                throw null;
                            }
                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                            int i26 = onExtraCallbackWithResult + 89;
                            IAuthTabCallback = i26 % 128;
                            int i27 = i26 % 2;
                            CameraConfigExternalSyntheticLambda0.onTransact();
                        }
                        iAuthTabCallback2 = iAuthTabCallback3;
                        function14 = function15;
                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                    }
                    objOnMinimized22 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda10
                        private static int onExtraCallbackWithResult = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj5) {
                            int i28 = 2 % 2;
                            int i29 = onWarmupCompleted + 41;
                            onExtraCallbackWithResult = i29 % 128;
                            int i30 = i29 % 2;
                            decrementVideoUsage decrementvideousageIAuthTabCallback = onReceivedError.IAuthTabCallback(exoPlayer, function15, z2, ontransact, getsupportedhighspeedresolutionsfor9, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor4, (isInVideoUsage) obj5);
                            int i31 = onWarmupCompleted + 77;
                            onExtraCallbackWithResult = i31 % 128;
                            int i32 = i31 % 2;
                            return decrementvideousageIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized22);
                    isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, ontransact, (Function1) objOnMinimized22, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                    boolean zIAuthTabCallbackStub2 = IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor6);
                    zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                    zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor6);
                    objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                    if (!(zOnExtraCallback | zOnNavigationEvent)) {
                        objOnMinimized = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda11
                            private static int IAuthTabCallback = 1;
                            private static int onNavigationEvent;

                            public final Object invoke(Object obj5) {
                                int i262 = 2 % 2;
                                int i272 = IAuthTabCallback + 61;
                                onNavigationEvent = i272 % 128;
                                if (i272 % 2 != 0) {
                                    onReceivedError.onExtraCallback(exoPlayer, getsupportedhighspeedresolutionsfor6, (isInVideoUsage) obj5);
                                    Object obj6 = null;
                                    obj6.hashCode();
                                    throw null;
                                }
                                decrementVideoUsage decrementvideousageOnExtraCallback = onReceivedError.onExtraCallback(exoPlayer, getsupportedhighspeedresolutionsfor6, (isInVideoUsage) obj5);
                                int i28 = onNavigationEvent + 61;
                                IAuthTabCallback = i28 % 128;
                                int i29 = i28 % 2;
                                return decrementvideousageOnExtraCallback;
                            }
                        };
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                        isZslDisabledByByUserCaseConfig.onWarmupCompleted(exoPlayer, Boolean.valueOf(zIAuthTabCallbackStub2), (Function1) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                        zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                        zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                        zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0);
                        objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                        if (!(zOnNavigationEvent2 | zOnExtraCallback2 | zOnExtraCallback3)) {
                            objOnMinimized2 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda12
                                private static int onExtraCallbackWithResult = 0;
                                private static int onNavigationEvent = 1;

                                public final Object invoke(Object obj5) {
                                    int i262 = 2 % 2;
                                    int i272 = onExtraCallbackWithResult + 89;
                                    onNavigationEvent = i272 % 128;
                                    int i28 = i272 % 2;
                                    TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02 = textFieldScrollKtExternalSyntheticLambda0;
                                    if (i28 != 0) {
                                        return onReceivedError.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda02, exoPlayer, getsupportedhighspeedresolutionsfor7, (isInVideoUsage) obj5);
                                    }
                                    decrementVideoUsage decrementvideousageIAuthTabCallback = onReceivedError.IAuthTabCallback(textFieldScrollKtExternalSyntheticLambda02, exoPlayer, getsupportedhighspeedresolutionsfor7, (isInVideoUsage) obj5);
                                    int i29 = 1 / 0;
                                    return decrementvideousageIAuthTabCallback;
                                }
                            };
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                            isZslDisabledByByUserCaseConfig.onWarmupCompleted(textFieldScrollKtExternalSyntheticLambda0, exoPlayer, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                            Object[] objArr3 = {Boolean.valueOf(((Boolean) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), new Object[]{getsupportedhighspeedresolutionsfor10}, -1660708681, 1660708683)).booleanValue()), Boolean.valueOf(z2), Boolean.valueOf(asInterface((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor7)), ontransact};
                            zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor7);
                            zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor5);
                            zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact);
                            if (i24 != 131072) {
                            }
                            objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                            if (!(zOnNavigationEvent3 | zOnNavigationEvent4 | zOnNavigationEvent5 | z7)) {
                                objOnMinimized3 = new IAuthTabCallback(ontransact, z2, getsupportedhighspeedresolutionsfor10, getsupportedhighspeedresolutionsfor7, getsupportedhighspeedresolutionsfor5, null);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                                isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr3, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                list3 = list2;
                                Object[] objArr22 = {Boolean.valueOf(access000((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor4)), list3, list6, bool};
                                zOnExtraCallback4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(exoPlayer);
                                zOnExtraCallback5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(zBooleanValue);
                                getsupportedhighspeedresolutionsfor2 = getsupportedhighspeedresolutionsfor;
                                zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor2);
                                if (i23 != 8388608) {
                                }
                                zOnNavigationEvent7 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list6);
                                zOnNavigationEvent8 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set);
                                zOnNavigationEvent9 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(list3);
                                zOnNavigationEvent10 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(set2);
                                objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                if (!(zOnExtraCallback4 | zOnExtraCallback5 | zOnNavigationEvent6 | z8 | zOnNavigationEvent7 | zOnNavigationEvent8 | zOnNavigationEvent9 | zOnNavigationEvent10)) {
                                    objOnMinimized4 = new onNavigationEvent(exoPlayer, zBooleanValue, function15, list6, list3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor2, set, set2, null);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                                    isZslDisabledByByUserCaseConfig.onNavigationEvent(objArr22, (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                    zOnNavigationEvent11 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(ontransact);
                                    objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                    if (!zOnNavigationEvent11) {
                                        objOnMinimized5 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda13
                                            private static int onExtraCallback = 0;
                                            private static int onExtraCallbackWithResult = 1;

                                            public final Object invoke(Object obj5) {
                                                int i262 = 2 % 2;
                                                int i272 = onExtraCallbackWithResult + 85;
                                                onExtraCallback = i272 % 128;
                                                int i28 = i272 % 2;
                                                decrementVideoUsage decrementvideousageOnExtraCallbackWithResult = onReceivedError.onExtraCallbackWithResult(ontransact, (isInVideoUsage) obj5);
                                                int i29 = onExtraCallbackWithResult + 105;
                                                onExtraCallback = i29 % 128;
                                                if (i29 % 2 == 0) {
                                                    return decrementvideousageOnExtraCallbackWithResult;
                                                }
                                                Object obj6 = null;
                                                obj6.hashCode();
                                                throw null;
                                            }
                                        };
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                                        isZslDisabledByByUserCaseConfig.onExtraCallback(ontransact, (Function1) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0);
                                        final boolean z132 = !z4;
                                        final boolean z142 = !z3;
                                        final boolean z152 = !zIsBlank2;
                                        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport062 = quirksExternalSyntheticBackport04;
                                        final QuirkSettingsLoader.onWarmupCompleted onwarmupcompleted42 = onwarmupcompleted;
                                        final String str42 = str;
                                        cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        final long j22 = j;
                                        setPostviewFormatSelector.onNavigationEvent(needCorrectJpegMetadata.onWarmupCompleted().onExtraCallback(VirtualCameraAdapterVirtualCameraCaptureCallback.onExtraCallbackWithResult(r8lambdanm9dm2eewl4vrptnjmesfjqky44.IAuthTabCallback(), f)), ForwardingCameraControl.onExtraCallback(-683224288, true, new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda14
                                            private static int onExtraCallback = 0;
                                            private static int onNavigationEvent = 1;

                                            public final Object invoke(Object obj5, Object obj6) {
                                                int i262 = 2 % 2;
                                                int i272 = onExtraCallback + 89;
                                                onNavigationEvent = i272 % 128;
                                                int i28 = i272 % 2;
                                                Unit unitOnNavigationEvent = onReceivedError.onNavigationEvent(quirksExternalSyntheticBackport062, iAuthTabCallback3, function12, onwarmupcompleted42, z132, str42, jOnExtraCallback, z142, feedVideo, z, jAsBinder, jAsBinder2, jAsBinder3, z152, j22, jOnExtraCallback3, getsupportedhighspeedresolutionsfor10, exoPlayer, getsupportedhighspeedresolutionsfor6, function15, getsupportedhighspeedresolutionsfor5, str2, jOnExtraCallback2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                                                int i29 = onExtraCallback + 47;
                                                onNavigationEvent = i29 % 128;
                                                if (i29 % 2 != 0) {
                                                    return unitOnNavigationEvent;
                                                }
                                                throw null;
                                            }
                                        }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                        }
                                        iAuthTabCallback2 = iAuthTabCallback3;
                                        function14 = function15;
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
            function14 = function13;
            quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
            iAuthTabCallback2 = iAuthTabCallbackOnExtraCallbackWithResult;
        }
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$$ExternalSyntheticLambda15
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj5, Object obj6) {
                    int i28 = 2 % 2;
                    int i29 = onNavigationEvent + 47;
                    IAuthTabCallback = i29 % 128;
                    int i30 = i29 % 2;
                    Unit unitIAuthTabCallback = onReceivedError.IAuthTabCallback(quirksExternalSyntheticBackport03, z, deleteprofile, feedVideo, list, z2, iAuthTabCallback2, function14, function12, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj5, ((Integer) obj6).intValue());
                    int i31 = IAuthTabCallback + 37;
                    onNavigationEvent = i31 % 128;
                    if (i31 % 2 != 0) {
                        int i32 = 39 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            });
        }
    }

    private static final decrementVideoUsage onWarmupCompleted(ExoPlayer exoPlayer, Function1 function1, boolean z, onTransact ontransact, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor3, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor4, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor5, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor6, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(function1, z, ontransact, exoPlayer, getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2, getsupportedhighspeedresolutionsfor3, getsupportedhighspeedresolutionsfor4, getsupportedhighspeedresolutionsfor5, getsupportedhighspeedresolutionsfor6);
        exoPlayer.addListener(onwarmupcompleted);
        onExtraCallback onextracallback = new onExtraCallback(exoPlayer, onwarmupcompleted);
        int i2 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return onextracallback;
    }

    private static final decrementVideoUsage onWarmupCompleted(ExoPlayer exoPlayer, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        float f;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(isinvideousage, "");
            IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        if (IAuthTabCallbackStub((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            int i3 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        exoPlayer.setVolume(f);
        return new onExtraCallbackWithResult();
    }

    private static final decrementVideoUsage onNavigationEvent(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, final ExoPlayer exoPlayer, final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0 = new DefaultLifecycleObserver() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsFeedVideoKt$NativeAdsFeedVideo$4$1$observer$1
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public /* bridge */ void onCreate(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 5;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                super.onCreate(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onWarmupCompleted + 95;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
            }

            public /* bridge */ void onDestroy(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 115;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onDestroy(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onExtraCallback + 73;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public /* bridge */ void onStart(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                super.onStart(textFieldScrollKtExternalSyntheticLambda02);
                int i5 = onExtraCallback + 75;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            }

            public void onPause(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 113;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                    onReceivedError.onNavigationEvent((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                    exoPlayer.pause();
                    exoPlayer.setPlayWhenReady(true);
                    return;
                }
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                onReceivedError.onNavigationEvent((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                exoPlayer.pause();
                exoPlayer.setPlayWhenReady(false);
            }

            public void onStop(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 39;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                onReceivedError.onNavigationEvent((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, true);
                exoPlayer.pause();
                exoPlayer.setPlayWhenReady(false);
                int i5 = onWarmupCompleted + 27;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onResume(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda02) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 41;
                onWarmupCompleted = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                } else {
                    Intrinsics.checkNotNullParameter(textFieldScrollKtExternalSyntheticLambda02, "");
                }
                onReceivedError.onNavigationEvent((getSupportedHighSpeedResolutionsFor) getsupportedhighspeedresolutionsfor, false);
            }
        };
        textFieldScrollKtExternalSyntheticLambda0.getLifecycle().IAuthTabCallback(textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        asInterface asinterface = new asInterface(textFieldScrollKtExternalSyntheticLambda0, textFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda0);
        int i2 = IAuthTabCallback + 11;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return asinterface;
    }

    private static final decrementVideoUsage onWarmupCompleted(onTransact ontransact, isInVideoUsage isinvideousage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(isinvideousage, "");
        asBinder asbinder = new asBinder(ontransact);
        int i2 = IAuthTabCallback + 61;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return asbinder;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor, String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 75;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(str);
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean access000(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 35;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return zBooleanValue;
    }

    private static final void getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            throw null;
        }
    }

    private static final boolean access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 5;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 83 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 19;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return null;
    }

    private static final boolean IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 23;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void IAuthTabCallbackDefault(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
    }

    private static final boolean asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            return bool.booleanValue();
        }
        int i4 = 27 / 0;
        return bool.booleanValue();
    }

    private static final void IAuthTabCallbackStub(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 117;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            bool.booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zBooleanValue = bool.booleanValue();
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static final void onTransact(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(zBooleanValue));
        if (i3 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean zBooleanValue;
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 1;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 83 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    private static final void IAuthTabCallback_Parcel(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 7;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = IAuthTabCallback + 83;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(ExoPlayer exoPlayer, SafePlayerView safePlayerView) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{exoPlayer, safePlayerView}, -184523739, 184523748);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1666102640, 1666102646);
    }

    public static /* synthetic */ Unit onExtraCallback(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{useandconfigureprogramwithtexture}, -199570347, 199570354);
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{function1}, 98475371, -98475371);
    }

    private static final Unit onNavigationEvent(NativeAdsEventLogType nativeAdsEventLogType) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{nativeAdsEventLogType}, -1453525115, 1453525118);
    }

    private static final void asInterface(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 126209390, -126209385);
    }

    private static final String onTransact(getSupportedHighSpeedResolutionsFor<String> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (String) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, -1369502711, 1369502722);
    }

    private static final void access100(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1172121619, 1172121633);
    }

    private static final boolean getInterfaceDescriptor(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{getsupportedhighspeedresolutionsfor}, -1660708681, 1660708683)).booleanValue();
    }

    private static final Unit IAuthTabCallbackDefault(Function1 function1) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{function1}, 442251636, -442251628);
    }

    private static final Unit IAuthTabCallbackStubProxy(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        return (Unit) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 467381087, -467381075);
    }

    private static final Unit IAuthTabCallbackStubProxy(Function1 function1) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{function1}, -1552937084, 1552937085);
    }

    private static final Unit asInterface(useAndConfigureProgramWithTexture useandconfigureprogramwithtexture) {
        int iOnExtraCallback = C40Encoder.onExtraCallback();
        int iOnExtraCallback2 = C40Encoder.onExtraCallback();
        return (Unit) IAuthTabCallback(iOnExtraCallback, C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), iOnExtraCallback2, new Object[]{useandconfigureprogramwithtexture}, 1637653744, -1637653740);
    }

    private static final Unit onNavigationEvent(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, deleteProfile deleteprofile, NativeAdsDto.Creative.FeedVideo feedVideo, List list, boolean z2, onReceivedHttpError.IAuthTabCallback iAuthTabCallback, Function1 function1, Function1 function12, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        Object[] objArr = {quirksExternalSyntheticBackport0, Boolean.valueOf(z), deleteprofile, feedVideo, list, Boolean.valueOf(z2), iAuthTabCallback, function1, function12, Integer.valueOf(i), Integer.valueOf(i2), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i3)};
        return (Unit) IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, -1606993312, 1606993325);
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        Object[] objArr = {getsupportedhighspeedresolutionsfor, Boolean.valueOf(z)};
        IAuthTabCallback(C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), C40Encoder.onExtraCallback(), objArr, 437874171, -437874161);
    }
}
