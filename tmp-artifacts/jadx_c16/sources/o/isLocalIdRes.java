package o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import androidx.compose.foundation.layout.RowScope;
import im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt$;
import im.toss.features.payment.ui.offline.compose.screen.TossPlaceTableOrderScreenKt$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.wa;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class isLocalIdRes {
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault;
    private static getBacktraceNote<RowScope, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel;
    private static long ICustomTabsCallback;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access000;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> extraCallback;
    private static char[] extraCallbackWithResult;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor;
    private static int onActivityLayout;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback;
    private static getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult;
    private static short[] onMessageChannelReady;
    private static int onMinimized;
    private static getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent;
    private static byte[] onPostMessage;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact;
    private static int onUnminimized;
    public static final isLocalIdRes onWarmupCompleted;
    private static int readTypedObject;
    private static getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> writeTypedObject;
    private static final byte[] $$a = {25, 43, 92, -56};
    private static final int $$b = 207;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ICustomTabsCallbackStub = 1;
    private static int onActivityResized = 0;
    private static int onRelationshipValidationResult = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = 4 - (i2 * 2);
        byte[] bArr = $$a;
        int i7 = 1 - (i * 2);
        int i8 = (b * 18) + 97;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i9 = i7;
            i4 = i6;
            i5 = 0;
            i6 += -i9;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
                return new String(bArr2, 0);
            }
            i9 = bArr[i4];
            i6 += -i9;
            i4++;
            i3 = i5;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        } else {
            i3 = 0;
            i6 = i8;
            i4 = i6;
            i5 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i5 == i7) {
            }
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws Throwable {
        int i7 = ~i2;
        int i8 = ~((~i) | i7);
        int i9 = i4 | i8 | (~(i2 | i));
        int i10 = (~(i | i4)) | (~(i7 | i)) | (~(i7 | i4));
        int i11 = i4 + i2 + i6 + (1351532378 * i5) + (1237199896 * i3);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i4) + 1314914304 + ((-491389116) * i2) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i6) + ((-1818230784) * i5) + ((-914358272) * i3) + ((-2051670016) * i12);
        int i14 = ((i4 * 406040238) - 634933780) + (i2 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i6 * 406039561) + (i5 * 1283666474) + (i3 * 1712827608) + (i12 * (-77201408));
        switch (i13 + (i14 * i14 * 1831469056)) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return onWarmupCompleted(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            default:
                w5a w5aVar = (w5a) objArr[0];
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i15 = 2 % 2;
                int i16 = onActivityResized + 1;
                onRelationshipValidationResult = i16 % 128;
                int i17 = i16 % 2;
                Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
                int i18 = onRelationshipValidationResult + 99;
                onActivityResized = i18 % 128;
                int i19 = i18 % 2;
                return unitIAuthTabCallbackStubProxy;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 1;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = extraCallback;
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
        return getbacktracenote;
    }

    public static /* synthetic */ Unit IAuthTabCallback(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 3;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onNavigationEvent(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 1;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(iOnWarmupCompleted, -1382869752, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1382869757, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
        int i5 = onRelationshipValidationResult + 23;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 23;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(iIntValue)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(iOnWarmupCompleted, 1519560014, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1519560013, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr2, iOnWarmupCompleted2);
        int i4 = onActivityResized + 41;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 7 / 0;
        }
        return unit;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 55;
        onActivityResized = i2 % 128;
        if (i2 % 2 != 0) {
            ICustomTabsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
            throw null;
        }
        Unit unitICustomTabsCallback = ICustomTabsCallback(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i3 = onRelationshipValidationResult + 35;
        onActivityResized = i3 % 128;
        if (i3 % 2 == 0) {
            return unitICustomTabsCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit asBinder(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 69;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onActivityResized + 73;
        onRelationshipValidationResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback_Parcel;
    }

    public static /* synthetic */ Unit asInterface(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Unit unit;
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 125;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        if (i4 != 0) {
            int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            unit = (Unit) IAuthTabCallback(iOnWarmupCompleted, -1443275404, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1443275411, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
            int i5 = 53 / 0;
        } else {
            int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            int iOnWarmupCompleted4 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
            unit = (Unit) IAuthTabCallback(iOnWarmupCompleted3, -1443275404, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1443275411, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted4);
        }
        int i6 = onActivityResized + 45;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 93;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            access000(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitAccess000 = access000(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onRelationshipValidationResult + 65;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return unitAccess000;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 77;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        }
        getInterfaceDescriptor(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 41;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 57 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 45;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(w3bVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onActivityResized + 23;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return unitOnWarmupCompleted;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 3;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i4 = onRelationshipValidationResult + 79;
        onActivityResized = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ Unit onNavigationEvent(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 109;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 != 0) {
            int i5 = 1 / 0;
        }
        int i6 = onRelationshipValidationResult + 13;
        onActivityResized = i6 % 128;
        int i7 = i6 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onWarmupCompleted(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onRelationshipValidationResult + 87;
        onActivityResized = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onActivityResized + 47;
        onRelationshipValidationResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onWarmupCompleted(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 83;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        Unit unitAccess100 = access100(w5aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        if (i4 == 0) {
            int i5 = 85 / 0;
        }
        int i6 = onRelationshipValidationResult + 7;
        onActivityResized = i6 % 128;
        if (i6 % 2 == 0) {
            return unitAccess100;
        }
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 33;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 != 0) {
            return IAuthTabCallbackDefault(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        IAuthTabCallbackDefault(y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 83;
        onActivityResized = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onNavigationEvent;
        int i4 = i2 + 25;
        onActivityResized = i4 % 128;
        if (i4 % 2 == 0) {
            return getbacktracenote;
        }
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = onActivityResized + 21;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = asBinder;
        if (i3 == 0) {
            int i4 = 18 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 111;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onTransact;
        int i5 = i2 + 71;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 93;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = writeTypedObject;
        int i5 = i2 + 29;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> access100() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 55;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback_Parcel;
        }
        throw null;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asBinder() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 77;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            return getInterfaceDescriptor;
        }
        throw null;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> asInterface() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 73;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = access100;
        int i5 = i3 + 125;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getInterfaceDescriptor() {
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 29;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            getbacktracenote = access000;
            int i4 = 14 / 0;
        } else {
            getbacktracenote = access000;
        }
        int i5 = i2 + 5;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallback() {
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote;
        int i = 2 % 2;
        int i2 = onActivityResized + 71;
        int i3 = i2 % 128;
        onRelationshipValidationResult = i3;
        if (i2 % 2 == 0) {
            getbacktracenote = asInterface;
            int i4 = 47 / 0;
        } else {
            getbacktracenote = asInterface;
        }
        int i5 = i3 + 93;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 65;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = IAuthTabCallback;
        int i5 = i2 + 125;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return getbacktracenote;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 39;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<w3b, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return getbacktracenote;
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onTransact() {
        int i = 2 % 2;
        int i2 = onActivityResized + 5;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 49;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        getBacktraceNote<y1a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> getbacktracenote = onExtraCallback;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return getbacktracenote;
    }

    static {
        onUnminimized = 0;
        access000();
        onWarmupCompleted = new isLocalIdRes();
        getInterfaceDescriptor = ForwardingCameraControl.onExtraCallbackWithResult(1651363674, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda0());
        IAuthTabCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1201669221, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda7());
        asInterface = ForwardingCameraControl.onExtraCallbackWithResult(-319859580, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda8());
        IAuthTabCallbackStubProxy = ForwardingCameraControl.onExtraCallbackWithResult(1488414179, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda9());
        onTransact = ForwardingCameraControl.onExtraCallbackWithResult(1255617667, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda10());
        extraCallback = ForwardingCameraControl.onExtraCallbackWithResult(809994401, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda11());
        onNavigationEvent = ForwardingCameraControl.onExtraCallbackWithResult(-1676699136, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda12());
        access100 = ForwardingCameraControl.onExtraCallbackWithResult(131574623, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda13());
        onExtraCallback = ForwardingCameraControl.onExtraCallbackWithResult(-1231075870, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda14());
        writeTypedObject = ForwardingCameraControl.onExtraCallbackWithResult(577197889, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda15());
        IAuthTabCallbackStub = ForwardingCameraControl.onExtraCallbackWithResult(-1685255051, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda1());
        IAuthTabCallback_Parcel = ForwardingCameraControl.onExtraCallbackWithResult(1939848382, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda2());
        onExtraCallbackWithResult = ForwardingCameraControl.onExtraCallbackWithResult(-1331277174, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda3());
        IAuthTabCallbackDefault = ForwardingCameraControl.onExtraCallbackWithResult(123018708, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda4());
        asBinder = ForwardingCameraControl.onExtraCallbackWithResult(-546845155, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda5());
        access000 = ForwardingCameraControl.onExtraCallbackWithResult(476996585, false, new ComposableSingletons$FaceAuthTestActivityKt$.ExternalSyntheticLambda6());
        int i = ICustomTabsCallbackStub + 63;
        onUnminimized = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        boolean z;
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((iIntValue & 17) != 16) {
            int i2 = onActivityResized + 13;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1651363674, iIntValue, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$1651363674.<anonymous> (FaceAuthTestActivity.kt:68)");
            }
            r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent;
            Object[] objArr2 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 49, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
            r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onActivityResized + 119;
                onRelationshipValidationResult = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i5 == 0) {
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackStubProxy(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i4 = onActivityResized + 15;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onActivityResized + 33;
                onRelationshipValidationResult = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1201669221, i2, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1201669221.<anonymous> (FaceAuthTestActivity.kt:72)");
            }
            Object[] objArr = new Object[1];
            b((byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (short) ((-102) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 1096737391 - Color.rgb(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) - 24545, Color.green(0) - 1833023, objArr);
            w5aVar.onExtraCallback("핀 설정", "1. `4+1PIN <-> 6PIN` 클릭", ((String) objArr[0]).intern(), (getHumanReadableName) null, (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 438, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback_Parcel(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = onRelationshipValidationResult + 27;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i7 = onActivityResized + 19;
            onRelationshipValidationResult = i7 % 128;
            if (i7 % 2 == 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i8 = onActivityResized + 93;
                onRelationshipValidationResult = i8 % 128;
                int i9 = i8 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i10 = onRelationshipValidationResult + 17;
            onActivityResized = i10 % 128;
            int i11 = i10 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-319859580, i2, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-319859580.<anonymous> (FaceAuthTestActivity.kt:85)");
            }
            w5aVar.onExtraCallback("네오 <-> 구핀 변경", "네오핀 : auth.neopin.android.uiType 을 con/var 로 입력(구형 기기는 이렇게 해도 구형핀으로 동작함)", "구핀 : auth.neopin.android.uiType 을 빈값 으로 입력 후, 앱 껏켰 해줘야 동기화됨", (getHumanReadableName) null, (getHumanReadableName) null, (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 18) & 3670016) | 438, 56);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i12 = onActivityResized + 95;
            onRelationshipValidationResult = i12 % 128;
            int i13 = i12 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onRelationshipValidationResult + 39;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i6 = onRelationshipValidationResult + 41;
            onActivityResized = i6 % 128;
            if (i6 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1488414179, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$1488414179.<anonymous> (FaceAuthTestActivity.kt:98)");
            }
            Object[] objArr = new Object[1];
            a(20 - ((byte) KeyEvent.getModifierMetaStateMask()), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 39644), objArr);
            w5aVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
        long j;
        Throwable cause;
        int i3 = 2 % 2;
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (true) {
            j = 0;
            if (timelineExternalSyntheticLambda1.IAuthTabCallback >= i2) {
                break;
            }
            int i4 = $10 + 57;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(extraCallbackWithResult[i - i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 17, 10973 - ((Process.getThreadPriority(0) + 20) >> 6), 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(ICustomTabsCallback), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSize(0, 0) + 46134), 31 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 20220 - ((Process.getThreadPriority(0) + 20) >> 6), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback3 == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 43 - Process.getGidForName(""), 1494 - (ViewConfiguration.getTouchSlop() >> 8), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        } catch (Throwable th) {
                            cause = th.getCause();
                            if (cause != null) {
                            }
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
            } else {
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                Object[] objArr5 = {Integer.valueOf(extraCallbackWithResult[i + i6])};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 59697), 18 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10973 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 919452672, false, "c", new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(ICustomTabsCallback), Integer.valueOf(c)};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 31 - Color.blue(0), 20221 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback6 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 49124), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44, (Process.myTid() >> 22) + 1494, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
            int i7 = $11 + 111;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback7 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)) + 49124), 44 - Color.red(0), 1494 - TextUtils.getCapsMode("", 0, 0), -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback7).invoke(null, objArr8);
                throw null;
            }
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
            if (objOnExtraCallback8 == null) {
                byte b7 = (byte) 0;
                byte b8 = b7;
                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), 44 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1494, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback8).invoke(null, objArr9);
            j = 0;
        }
        objArr[0] = new String(cArr);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        y1a y1aVar = (y1a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 17) != 16, iIntValue & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i2 = onRelationshipValidationResult + 41;
                onActivityResized = i2 % 128;
                if (i2 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1255617667, iIntValue, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$1255617667.<anonymous> (FaceAuthTestActivity.kt:140)");
                    int i3 = 48 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1255617667, iIntValue, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$1255617667.<anonymous> (FaceAuthTestActivity.kt:140)");
                }
            }
            r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent;
            Object[] objArr2 = new Object[1];
            b((byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (short) ((-58) - Color.green(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1113514495, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 24545, (-1782453) - ExpandableListView.getPackedPositionType(0L), objArr2);
            r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onRelationshipValidationResult + 41;
                onActivityResized = i4 % 128;
                int i5 = i4 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i5 != 0) {
                    throw null;
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final Unit access100(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            int i4 = onActivityResized + 71;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i6 = onRelationshipValidationResult + 27;
                onActivityResized = i6 % 128;
                int i7 = i6 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            int i8 = onRelationshipValidationResult + 3;
            onActivityResized = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onRelationshipValidationResult + 45;
                onActivityResized = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(809994401, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$809994401.<anonymous> (FaceAuthTestActivity.kt:142)");
            }
            Object[] objArr = new Object[1];
            b((byte) TextUtils.getOffsetBefore("", 0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 73), ExpandableListView.getPackedPositionChild(0L) + 1113514569, (-24546) - TextUtils.lastIndexOf("", '0', 0), (-1782454) - ImageFormat.getBitsPerPixel(0), objArr);
            w5aVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i12 = onActivityResized + 55;
                onRelationshipValidationResult = i12 % 128;
                int i13 = i12 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit access000(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 11;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 46) == 0) {
                i |= !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 2 : 4;
            }
        } else {
            Intrinsics.checkNotNullParameter(w5aVar, "");
            if ((i & 6) == 0) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            int i4 = onActivityResized + 101;
            onRelationshipValidationResult = i4 % 128;
            if (i4 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1676699136, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1676699136.<anonymous> (FaceAuthTestActivity.kt:149)");
                int i5 = onRelationshipValidationResult + 83;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
            }
            Object[] objArr = new Object[1];
            a(164 - TextUtils.lastIndexOf("", '0', 0), KeyEvent.getDeadChar(0, 0) + 38, (char) (19787 - TextUtils.indexOf("", "", 0, 0)), objArr);
            w5aVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((i << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws Throwable {
        boolean z;
        w5a w5aVar = (w5a) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((iIntValue & 6) == 0) {
            iIntValue |= cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar) ? 4 : 2;
        }
        if ((iIntValue & 19) != 18) {
            int i2 = onRelationshipValidationResult + 19;
            onActivityResized = i2 % 128;
            z = i2 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, iIntValue & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i3 = onRelationshipValidationResult + 55;
                onActivityResized = i3 % 128;
                if (i3 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(131574623, iIntValue, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$131574623.<anonymous> (FaceAuthTestActivity.kt:156)");
                    int i4 = 63 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(131574623, iIntValue, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$131574623.<anonymous> (FaceAuthTestActivity.kt:156)");
                }
            }
            Object[] objArr2 = new Object[1];
            b((byte) Color.green(0), (short) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 122), 1113514516 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-24545) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (-1783185) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            w5aVar.onExtraCallbackWithResult(((String) objArr2[0]).intern(), (getHumanReadableName) null, cameraCaptureResultEmptyCameraCaptureResult, ((iIntValue << 6) & 896) | 6, 2);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onActivityResized + 103;
                onRelationshipValidationResult = i5 % 128;
                int i6 = i5 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i7 = onRelationshipValidationResult + 63;
        onActivityResized = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallbackStub(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onActivityResized + 45;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!(!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1))) {
            int i5 = onRelationshipValidationResult + 77;
            onActivityResized = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1231075870, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1231075870.<anonymous> (FaceAuthTestActivity.kt:163)");
                }
                r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent.onExtraCallback("넛지 설정값 (클릭 시 변수명 복사)", (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent.onExtraCallback("넛지 설정값 (클릭 시 변수명 복사)", (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i7 = onRelationshipValidationResult + 19;
            onActivityResized = i7 % 128;
            int i8 = i7 % 2;
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallbackDefault(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(y1aVar, "");
        if ((i & 17) != 16) {
            int i3 = onActivityResized + 63;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            z = true;
        } else {
            int i5 = onRelationshipValidationResult + 73;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(577197889, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$577197889.<anonymous> (FaceAuthTestActivity.kt:173)");
            }
            r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto r8lambda_moq0nysrol1o0qmavnpwgoovto = r8lambda_mOq0nYsrOl1o0qmAVNPwGooVto.onNavigationEvent;
            Object[] objArr = new Object[1];
            b((byte) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (KeyEvent.keyCodeFromString("") - 25), 1113514561 - (Process.myTid() >> 22), (ViewConfiguration.getTapTimeout() >> 16) - 24545, TextUtils.lastIndexOf("", '0', 0) - 1782452, objArr);
            r8lambda_moq0nysrol1o0qmavnpwgoovto.onExtraCallback(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, (wa.IAuthTabCallback) null, (String) null, (wa.onNavigationEvent) null, cameraCaptureResultEmptyCameraCaptureResult, 196614, 30);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i7 = onRelationshipValidationResult + 111;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        int i3;
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
                i3 = 4;
            } else {
                int i5 = onRelationshipValidationResult + 117;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i | i3;
            int i7 = onActivityResized + 29;
            onRelationshipValidationResult = i7 % 128;
            int i8 = i7 % 2;
        } else {
            i2 = i;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i2 & 19) != 18, i2 & 1)) {
            int i9 = onActivityResized + 11;
            onRelationshipValidationResult = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 9 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    int i11 = onRelationshipValidationResult + 71;
                    onActivityResized = i11 % 128;
                    if (i11 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1331277174, i2, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1331277174.<anonymous> (FaceAuthTestActivity.kt:175)");
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1331277174, i2, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1331277174.<anonymous> (FaceAuthTestActivity.kt:175)");
                    int i12 = onRelationshipValidationResult + 5;
                    onActivityResized = i12 % 128;
                    int i13 = i12 % 2;
                }
                Object[] objArr = new Object[1];
                a(109 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35240), objArr);
                w3bVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 6, 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                Object[] objArr2 = new Object[1];
                a(109 - Process.getGidForName(""), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 54, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 35240), objArr2);
                w3bVar.onExtraCallbackWithResult(((String) objArr2[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 6, 126);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            int i14 = onActivityResized + 85;
            onRelationshipValidationResult = i14 % 128;
            int i15 = i14 % 2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 41;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 16) != 63) {
                int i4 = onRelationshipValidationResult + 109;
                int i5 = i4 % 128;
                onActivityResized = i5;
                z = i4 % 2 == 0;
                int i6 = i5 + 61;
                onRelationshipValidationResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                z = false;
            }
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            int i8 = onActivityResized + 65;
            onRelationshipValidationResult = i8 % 128;
            if (i8 % 2 == 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-1685255051, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-1685255051.<anonymous> (FaceAuthTestActivity.kt:176)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{"얼굴등록 관련 약관 철회", null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit getInterfaceDescriptor(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        Object obj = null;
        if ((i & 6) == 0) {
            int i4 = onRelationshipValidationResult + 93;
            onActivityResized = i4 % 128;
            if (i4 % 2 != 0) {
                cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar);
                throw null;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i5 = onActivityResized + 101;
                onRelationshipValidationResult = i5 % 128;
                int i6 = i5 % 2;
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 19) != 18, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1939848382, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$1939848382.<anonymous> (FaceAuthTestActivity.kt:176)");
            }
            w5aVar.IAuthTabCallback(IAuthTabCallbackStub, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i7 = onRelationshipValidationResult + 69;
                onActivityResized = i7 % 128;
                int i8 = i7 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i8 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onWarmupCompleted(w3b w3bVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = onActivityResized + 103;
        onRelationshipValidationResult = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(w3bVar, "");
        if ((i & 6) == 0) {
            int i7 = onRelationshipValidationResult + 45;
            onActivityResized = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 26 / 0;
                i3 = cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar) ? 4 : 2;
            } else if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w3bVar)) {
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i2 & 19) != 18) {
            int i9 = onRelationshipValidationResult + 111;
            onActivityResized = i9 % 128;
            z = i9 % 2 == 0;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
            int i10 = onRelationshipValidationResult + 57;
            onActivityResized = i10 % 128;
            if (i10 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.asBinder();
                throw null;
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(476996585, i2, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$476996585.<anonymous> (FaceAuthTestActivity.kt:183)");
            }
            Object[] objArr = new Object[1];
            a(63 - ImageFormat.getBitsPerPixel(0), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 45, (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr);
            w3bVar.onExtraCallbackWithResult(((String) objArr[0]).intern(), (QuirksExternalSyntheticBackport0) null, 0.0f, (immediateFailedFuture) null, 0L, 0L, (toMetersPerSecond) null, cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 21) & 29360128) | 6, 126);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = onActivityResized + 61;
                onRelationshipValidationResult = i11 % 128;
                int i12 = i11 % 2;
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit ICustomTabsCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(w5aVar, "");
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(w5aVar)) {
                int i4 = onActivityResized + 83;
                onRelationshipValidationResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 3;
                }
                i2 = 4;
            } else {
                i2 = 2;
            }
            i |= i2;
        }
        if ((i & 19) != 18) {
            z = true;
        } else {
            int i6 = onRelationshipValidationResult + 27;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-546845155, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$-546845155.<anonymous> (FaceAuthTestActivity.kt:184)");
                int i8 = onActivityResized + 91;
                onRelationshipValidationResult = i8 % 128;
                int i9 = i8 % 2;
            }
            w5aVar.IAuthTabCallback(IAuthTabCallbackDefault, cameraCaptureResultEmptyCameraCaptureResult, ((i << 3) & 112) | 6);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i10 = onActivityResized + 69;
                onRelationshipValidationResult = i10 % 128;
                int i11 = i10 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i11 == 0) {
                    int i12 = 51 / 0;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallback(RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        boolean z;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 45;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(rowScope, "");
            z = (i & 59) != 33;
        } else {
            Intrinsics.checkNotNullParameter(rowScope, "");
            if ((i & 17) != 16) {
            }
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i4 = onActivityResized + 73;
                onRelationshipValidationResult = i4 % 128;
                if (i4 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(123018708, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$123018708.<anonymous> (FaceAuthTestActivity.kt:184)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(123018708, i, -1, "im.toss.features.faceauth.impl.test.ComposableSingletons$FaceAuthTestActivityKt.lambda$123018708.<anonymous> (FaceAuthTestActivity.kt:184)");
            }
            Object[] objArr = new Object[1];
            a(TextUtils.getOffsetAfter("", 0), ExpandableListView.getPackedPositionChild(0L) + 22, (char) (39908 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr);
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{((String) objArr[0]).intern(), null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 6, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onRelationshipValidationResult + 93;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static void b(byte b, short s, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(onActivityLayout)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, TextUtils.getCapsMode("", 0, 0) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            float f = 0.0f;
            if (i6 != 0) {
                int i7 = $10 + 13;
                int i8 = i7 % 128;
                $11 = i8;
                int i9 = i7 % 2;
                byte[] bArr2 = onPostMessage;
                char c = '0';
                if (bArr2 != null) {
                    int i10 = i8 + 27;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i4])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char cLastIndexOf = (char) (12842 - TextUtils.lastIndexOf("", c, 0));
                            int i11 = (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 55;
                            int mirror = AndroidCharacter.getMirror(c) + 2119;
                            byte b2 = (byte) ($$b & 1);
                            byte b3 = (byte) (b2 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cLastIndexOf, i11, mirror, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i4] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i4++;
                        f = 0.0f;
                        c = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = onPostMessage;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(readTypedObject)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 43424), 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22438 - TextUtils.lastIndexOf("", '0', 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onActivityLayout ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (onMessageChannelReady[i + ((int) (readTypedObject ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onActivityLayout ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (readTypedObject ^ j)) + i6;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onMinimized), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 85, (-16767649) - Color.rgb(0, 0, 0), -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onPostMessage;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i12 = $11 + 3;
                    $10 = i12 % 128;
                    int i13 = 2;
                    int i14 = i12 % 2;
                    int i15 = 0;
                    while (i15 < length2) {
                        int i16 = $11 + 91;
                        int i17 = i16 % 128;
                        $10 = i17;
                        if (i16 % i13 != 0) {
                            bArr5[i15] = (byte) (bArr4[i15] - 4629411779493505016L);
                        } else {
                            bArr5[i15] = (byte) (bArr4[i15] ^ (-4629411779493505016L));
                            i15++;
                        }
                        int i18 = i17 + 69;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                        i13 = 2;
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                int i20 = $11 + 103;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!z) {
                        short[] sArr = onMessageChannelReady;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        byte[] bArr6 = onPostMessage;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, -450104112, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 450104115, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onNavigationEvent(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, 1135809074, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1135809068, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit IAuthTabCallback(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, 1952935016, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1952935012, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit IAuthTabCallbackStub(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, -322057999, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 322057999, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, 1445118531, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1445118523, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    private static final Unit onExtraCallback(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, 1519560014, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), -1519560013, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    private static final Unit onTransact(w5a w5aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {w5aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, -1443275404, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1443275411, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    private static final Unit asBinder(y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {y1aVar, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (Unit) IAuthTabCallback(iOnWarmupCompleted, -1382869752, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 1382869757, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), objArr, iOnWarmupCompleted2);
    }

    public final getBacktraceNote<w5a, CameraCaptureResultEmptyCameraCaptureResult, Integer, Unit> IAuthTabCallbackStubProxy() {
        int iOnWarmupCompleted = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted2 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        int iOnWarmupCompleted3 = TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted();
        return (getBacktraceNote) IAuthTabCallback(iOnWarmupCompleted, -911702626, TossPlaceTableOrderScreenKt$.ExternalSyntheticLambda71.onWarmupCompleted(), 911702628, iOnWarmupCompleted3, new Object[]{this}, iOnWarmupCompleted2);
    }

    static void access000() {
        extraCallbackWithResult = new char[]{52843, 24990, 50333, 14404, 48727, 18510, 42705, 20297, 48191, 54569, 2784, 9123, 22905, 32467, 38789, 52599, 57858, 7131, 12493, 40500, 8995, 45168, 26576, 31147, 16466, 4668, 34929, 45131, 20927, 1876, 54341, 51870, 60138, 62502, 32681, 9838, 30127, 19816, 6845, 12794, 38582, 8292, 42262, 7686, 13458, 10576, 34993, 43710, 40294, 24368, 62429, 58078, 46891, 35040, 5681, 22334, 55887, 61025, 20121, 21910, 5651, 49864, 18517, 46138, 60860, 13541, 24362, 26219, 34995, 54199, 64101, 7448, 10127, 20173, 37127, 47191, 49793, 58678, 3132, 22187, 31211, 32818, 43901, 52709, 5337, 16144, 17941, 26836, 46024, 55878, 64693, 2043, 11821, 29046, 39847, 41696, 50463, 60444, 13981, 23002, 24596, 35584, 44428, 62518, 8063, 8636, 18600, 37683, 47718, 56466, 25620, 48461, 54914, 61379, 283, 23071, 29645, 38064, 44583, 51045, 6319, 12799, 19241, 27806, 34196, 57091, 61507, 2458, 8917, 17485, 40305, 46776, 53181, 57638, 14951, 21422, 29968, 36424, 42975, 63709, 4612, 11072, 19699, 26029, 48942, 53308, 59809, 742, 9261, 32145, 38553, 43017, 49411, 6809, 13253, 21817, 28215, 34737, 55525, 61989, 2922, 11501, 17928, 40795, 45205, 24894, 55250, 4661, 61164, 26879, 40678, 28793, 39393, 27287, 54702, 7452, 9020, 36739, 43044, 16761, 7154, 13486, 52585, 58912, 33008, 22938, 29263, 2911, 9674, 65158, 38721, 45560, 19129, 25446, 15418, 55009, 61418, 34906, 41236, 31700, 5266, 11591, 50691};
        ICustomTabsCallback = -7752182527879334767L;
        readTypedObject = 434554377;
        onActivityLayout = -1538816024;
        onMinimized = -1537466247;
        onMessageChannelReady = new short[]{30781, -6209, -9223, 25863, -25123, 8367, -8806, 25810, -6794, 6910, -24923, 12667, 2190, -10166, -2970, -12290, 25666, -4427, -9641, -15818, 16378, 30789, -10117, -10100, -10125, -10139, -10101, -10055, -10180, -10099, -10121, -10127, -10139, -10111, -10073, -10168, -10138, -10127, -10106, -10114, -10124, -10124, -10115, -10054, -10201, -10086, -10141, -10099, -10124, -10124, -10115, -10040, -10136, -10084, -3506, -12907, 13127, 3774, -4363, -9577, 8154, -29906, 12346, 7710, -7687, -9141, 30767, -11447, 29937, -4460, -9674, -15851, 16345, 30799, 10168, 10185, 10160, 10146, 10184, 10214, 10101, 10147, 10174, 10179, 10171, 10161, 10161, 10170, 10215, 10084, 10183, 10144, 10186, 10161, 10161, 10170, 10229, 10133, 10201, 10150, -2525, -897, 29836, 10167, -3701, -13102, 12932, 3579, -4558, -9772, -15949, 16231, 30759, 12695, 2226, -10194, -29695, 10347, 25870, -3514, -15842, -10010, 9770, 26178, -10066, -10160, -10134};
    }
}
