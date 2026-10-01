package o;

import com.google.android.gms.internal.ads.zzgc;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertFloatArrayToByteArray;
import o.SetDetectableSize;
import o.UtilsKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConvertFloatArrayToByteArray {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    public static final ConvertFloatArrayToByteArray onExtraCallbackWithResult = new ConvertFloatArrayToByteArray();
    private static int onNavigationEvent;
    private static int onWarmupCompleted;

    static {
        int i = onNavigationEvent + 31;
        onExtraCallback = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~(i7 | i6);
        int i9 = ~i;
        int i10 = (~(i9 | i3)) | i8;
        int i11 = ~i6;
        int i12 = i11 | i3;
        int i13 = i10 | (~i12);
        int i14 = i7 | i;
        int i15 = i8 | (~i14);
        int i16 = (~(i6 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i));
        int i17 = i3 + i + i2 + ((-1254723898) * i4) + ((-1667789834) * i5);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i3) + 1379663872 + ((-481802647) * i) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i2) + ((-1033371648) * i4) + ((-106430464) * i5) + (1552875520 * i18);
        int i20 = ((i3 * (-402395399)) - 1316031342) + (i * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i2 * (-402393527)) + (i4 * (-1219896714)) + (i5 * (-610841306)) + (i18 * (-825819136));
        switch (i19 + (i20 * i20 * (-1063190528))) {
            case 1:
                return onExtraCallback(objArr);
            case 2:
                return IAuthTabCallback(objArr);
            case 3:
                return onNavigationEvent(objArr);
            case 4:
                return onExtraCallbackWithResult(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            case 8:
                return asInterface(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(setDetectableSize);
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(setDetectableSize);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStubProxy;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(setDetectableSize);
        int i4 = onWarmupCompleted + 123;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsBinder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Pair[] pairArr, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 17;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnWarmupCompleted = onWarmupCompleted(pairArr, setDetectableSize);
        int i4 = IAuthTabCallback + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return unitOnWarmupCompleted;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(setDetectableSize);
        int i4 = IAuthTabCallback + 7;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return access000(setDetectableSize);
        }
        access000(setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 89;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(-304249881, zzgc.onExtraCallbackWithResult(), 304249888, new Object[]{setDetectableSize}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
        int i4 = IAuthTabCallback + 91;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private ConvertFloatArrayToByteArray() {
    }

    public static /* synthetic */ void onExtraCallback(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, String str2, Map map, String str3, boolean z, String str4, int i, Object obj) throws Throwable {
        Map map2;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 27;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        String str5 = null;
        String str6 = (i3 % 2 != 0 ? (i & 2) == 0 : (i & 2) == 0) ? str2 : null;
        if ((i & 4) != 0) {
            int i5 = i4 + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i & 8) != 0) {
            int i7 = i4 + 113;
            onWarmupCompleted = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } else {
            str5 = str3;
        }
        convertFloatArrayToByteArray.onWarmupCompleted(str, str6, (Map<String, ? extends Object>) map2, str5, (i & 16) != 0 ? false : z, (i & 32) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str4);
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable String str3, boolean z, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (map == null) {
            int i2 = IAuthTabCallback + 41;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                access8100.onNavigationEvent();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            map = access8100.onNavigationEvent();
        }
        new n(str, str2, str3, map, str4).onWarmupCompleted(z);
        int i3 = onWarmupCompleted + 125;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Map<String, ? extends Object> map = (Map) objArr[3];
        String str3 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        String strAsBinder = (String) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        Object obj = objArr[8];
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 91;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0 ? (iIntValue & 2) != 0 : (iIntValue & 4) != 0) {
            int i4 = i2 + 53;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 0 / 0;
            }
            str2 = null;
        }
        if ((iIntValue & 4) != 0) {
            int i6 = i2 + 33;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            map = null;
        }
        if ((iIntValue & 8) != 0) {
            str3 = null;
        }
        if ((iIntValue & 16) != 0) {
            int i8 = i2 + 63;
            int i9 = i8 % 128;
            onWarmupCompleted = i9;
            int i10 = i8 % 2;
            int i11 = i9 + 17;
            IAuthTabCallback = i11 % 128;
            int i12 = i11 % 2;
            zBooleanValue = false;
        }
        if ((iIntValue & 32) != 0) {
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        convertFloatArrayToByteArray.onExtraCallback(str, str2, map, str3, zBooleanValue, strAsBinder);
        return null;
    }

    public final void onExtraCallback(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable String str3, boolean z, @NotNull String str4) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (map == null) {
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                access8100.onNavigationEvent();
                throw null;
            }
            map = access8100.onNavigationEvent();
        }
        new q(str, str2, str3, map, str4).onWarmupCompleted(z);
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) throws Throwable {
        String strAsBinder;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        Map<String, ? extends Object> map = (Map) objArr[3];
        String str3 = (String) objArr[4];
        boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        String str4 = (String) objArr[6];
        int iIntValue = ((Number) objArr[7]).intValue();
        Object obj = objArr[8];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int i3 = i2 + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if ((iIntValue & 2) != 0) {
            str2 = null;
        }
        if ((iIntValue & 4) != 0) {
            map = null;
        }
        if ((iIntValue & 8) != 0) {
            str3 = null;
        }
        if ((iIntValue & 16) != 0) {
            zBooleanValue = false;
        }
        if ((iIntValue & 32) != 0) {
            int i5 = i2 + 75;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
                int i6 = 94 / 0;
            } else {
                strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            }
            str4 = strAsBinder;
        }
        convertFloatArrayToByteArray.IAuthTabCallback(str, str2, map, str3, zBooleanValue, str4);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[PHI: r2
      0x0032: PHI (r2v24 o.GetFeatureExtension) = (r2v4 o.GetFeatureExtension), (r2v25 o.GetFeatureExtension) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[PHI: r2
      0x002d: PHI (r2v5 o.GetFeatureExtension) = (r2v4 o.GetFeatureExtension), (r2v25 o.GetFeatureExtension) binds: [B:8:0x002b, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, @Nullable String str3, boolean z, @NotNull String str4) throws Throwable {
        GetFeatureExtension getFeatureExtension;
        Map<String, ? extends Object> mapOnNavigationEvent;
        Map<String, ? extends Object> map2;
        Map<String, ? extends Object> mapOnNavigationEvent2;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            int i3 = 41 / 0;
            mapOnNavigationEvent = map == null ? access8100.onNavigationEvent() : map;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            if (map == null) {
            }
        }
        if (((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1792942755, new Object[]{getFeatureExtension, "warning", str, str2, null, mapOnNavigationEvent, str3, str4, Boolean.valueOf(z)}, 1792942763, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
            int i4 = IAuthTabCallback + 67;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        if (map == null) {
            int i6 = onWarmupCompleted + 9;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                mapOnNavigationEvent2 = access8100.onNavigationEvent();
                int i7 = 29 / 0;
            } else {
                mapOnNavigationEvent2 = access8100.onNavigationEvent();
            }
            map2 = mapOnNavigationEvent2;
        } else {
            map2 = map;
        }
        new Result(str, str2, str3, map2, str4).onWarmupCompleted(z);
    }

    public static /* synthetic */ void onWarmupCompleted(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, String str2, Throwable th, Map map, String str3, String str4, boolean z, int i, Object obj) throws Throwable {
        Throwable th2;
        String str5;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            th2 = null;
        } else {
            th2 = th;
        }
        Map map2 = (i & 8) != 0 ? null : map;
        if ((i & 16) != 0) {
            int i4 = onWarmupCompleted + 117;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult(str, str2, th2, map2, str5, (i & 32) != 0 ? GetFeatureExtension.onWarmupCompleted.asBinder() : str4, (i & 64) != 0 ? false : z);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable Map<String, ? extends Object> map, @Nullable String str3, @NotNull String str4, boolean z) throws Throwable {
        String str5;
        String str6;
        String message;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str4, "");
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        GetFeatureExtension getFeatureExtension2 = GetFeatureExtension.onWarmupCompleted;
        if (str2 != null) {
            str5 = str2;
        } else if (th != null) {
            String message2 = th.getMessage();
            int i3 = IAuthTabCallback + 95;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            str5 = message2;
        } else {
            str5 = null;
        }
        if (((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1792942755, new Object[]{getFeatureExtension2, "error", str, str5, th, map == null ? access8100.onNavigationEvent() : map, str3, str4, Boolean.valueOf(z)}, 1792942763, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
            return;
        }
        if (str2 == null) {
            if (th != null) {
                message = th.getMessage();
                int i5 = IAuthTabCallback + 17;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                message = null;
            }
            str6 = message == null ? "" : message;
        } else {
            str6 = str2;
        }
        new l(str, str6, th, str3, map == null ? access8100.onNavigationEvent() : map, str4).onWarmupCompleted(z);
        int i7 = IAuthTabCallback + 99;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, String str2, Throwable th, Map map, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 99;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 4) != 0) {
            int i6 = i4 + 107;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 60 / 0;
            }
            th = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult(str, str2, th, (Map<String, ? extends Object>) map);
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable Throwable th, @Nullable Map<String, ? extends Object> map) throws Throwable {
        String str3;
        String strAsBinder;
        boolean z;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 51;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str3 = null;
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            z = true;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            str3 = null;
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
            z = false;
        }
        onExtraCallbackWithResult(str, str2, th, map, str3, strAsBinder, z);
        int i3 = onWarmupCompleted + 105;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, String str2, Map map, boolean z, String str3, int i, Object obj) throws Throwable {
        Map map2;
        boolean z2;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 25;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 0;
            }
            map2 = null;
        } else {
            map2 = map;
        }
        if ((i & 8) != 0) {
            int i5 = IAuthTabCallback + 99;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 16) != 0) {
            int i7 = IAuthTabCallback + 119;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            str3 = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        convertFloatArrayToByteArray.onWarmupCompleted(str, str2, (Map<String, ? extends Object>) map2, z2, str3);
    }

    public final void onWarmupCompleted(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map, boolean z, @NotNull String str3) throws Throwable {
        String str4;
        String str5;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 121;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str3, "");
            GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str3, "");
        GetFeatureExtension getFeatureExtension2 = GetFeatureExtension.onWarmupCompleted;
        if (str == null) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 27;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 89;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            str4 = "";
        } else {
            str4 = str;
        }
        if (((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1792942755, new Object[]{getFeatureExtension2, "error", str4, str2, null, map == null ? access8100.onNavigationEvent() : map, null, str3, Boolean.valueOf(z)}, 1792942763, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
            return;
        }
        String str6 = str == null ? "" : str;
        if (str2 == null) {
            int i8 = IAuthTabCallback + 119;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 / 5;
            }
            str5 = "";
        } else {
            str5 = str2;
        }
        new l(str6, str5, null, null, map == null ? access8100.onNavigationEvent() : map, str3).onWarmupCompleted(z);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 2) != 0) {
            int i5 = i3 + 33;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            th = null;
        }
        convertFloatArrayToByteArray.IAuthTabCallback(str, th);
        return null;
    }

    public final void IAuthTabCallback(@NotNull String str, @Nullable Throwable th) throws Throwable {
        String str2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        GetFeatureExtension getFeatureExtension = GetFeatureExtension.onWarmupCompleted;
        if (th != null) {
            int i2 = onWarmupCompleted + 75;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            String message = th.getMessage();
            int i4 = onWarmupCompleted + 7;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            str2 = message;
        } else {
            str2 = null;
        }
        if (!((Boolean) GetFeatureExtension.onWarmupCompleted(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), -1792942755, new Object[]{getFeatureExtension, "error", str, str2, th, access8100.onNavigationEvent(), null, getFeatureExtension.asBinder(), false}, 1792942763, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted())).booleanValue()) {
            new l(str, th != null ? th.getMessage() : null, th, null, null, null, 56, null).onWarmupCompleted(false);
            return;
        }
        int i6 = onWarmupCompleted + 9;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, String str2, String str3, Map map, boolean z, int i, Object obj) throws Throwable {
        String str4;
        String str5;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 7;
        int i4 = i3 % 128;
        IAuthTabCallback = i4;
        int i5 = i3 % 2;
        Map map2 = null;
        if ((i & 2) != 0) {
            int i6 = i4 + 39;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 % 4;
            }
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i8 = onWarmupCompleted + 43;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i10 = IAuthTabCallback + 39;
            onWarmupCompleted = i10 % 128;
            int i11 = i10 % 2;
        } else {
            map2 = map;
        }
        convertFloatArrayToByteArray.onWarmupCompleted(str, str4, str5, (Map<String, ? extends Object>) map2, (i & 16) != 0 ? false : z);
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, ? extends Object> map, boolean z) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (map == null) {
            int i2 = onWarmupCompleted + 23;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            map = access8100.onNavigationEvent();
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
        new BaseContent(str, str2, str3, map).onWarmupCompleted(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onWarmupCompleted(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, Throwable th, String str, Map map, boolean z, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 13;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            map = null;
        }
        if ((i & 8) != 0) {
            int i4 = IAuthTabCallback + 73;
            onWarmupCompleted = i4 % 128;
            z = i4 % 2 != 0;
        }
        convertFloatArrayToByteArray.onExtraCallbackWithResult(th, str, (Map<String, ? extends Object>) map, z);
    }

    public final void onExtraCallbackWithResult(@NotNull Throwable th, @Nullable String str, @Nullable Map<String, ? extends Object> map, boolean z) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        if (map == null) {
            map = access8100.onNavigationEvent();
            int i2 = onWarmupCompleted + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
        }
        new getResult(th, str, map).onWarmupCompleted(z);
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean onWarmupCompleted(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, long j, boolean z, String str, Map map, Function1 function1, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i3 = IAuthTabCallback + 49;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 2;
            }
        }
        String str2 = str;
        if ((i & 8) != 0) {
            map = null;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda3
                private static int IAuthTabCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i5 = 2 % 2;
                    int i6 = onNavigationEvent + 19;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    Object[] objArr = {(SetDetectableSize) obj2};
                    int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                    if (i7 == 0) {
                        return (Unit) ConvertFloatArrayToByteArray.IAuthTabCallback(40384396, zzgc.onExtraCallbackWithResult(), -40384390, objArr, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                    }
                    int i8 = 8 / 0;
                    return (Unit) ConvertFloatArrayToByteArray.IAuthTabCallback(40384396, zzgc.onExtraCallbackWithResult(), -40384390, objArr, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                }
            };
        }
        boolean zIAuthTabCallback = convertFloatArrayToByteArray.IAuthTabCallback(j, z2, str2, (Map<String, ?>) map2, (Function1<? super SetDetectableSize, Unit>) function1);
        int i5 = onWarmupCompleted + 77;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        return zIAuthTabCallback;
    }

    private static final Unit asBinder(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 115;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onWarmupCompleted + 49;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    public final boolean IAuthTabCallback(long j, boolean z, @NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zOnNavigationEvent = ConvertByteArrayToFloatArray.onNavigationEvent(j, z, str, map, function1);
        int i4 = IAuthTabCallback + 55;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String strAsBinder = (String) objArr[3];
        Map<String, ?> map = (Map) objArr[4];
        Function1<? super SetDetectableSize, Unit> function1 = (Function1) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        if ((iIntValue & 2) != 0) {
            int i2 = onWarmupCompleted + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            zBooleanValue = false;
        }
        if ((iIntValue & 4) != 0) {
            int i4 = onWarmupCompleted + 23;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        if ((iIntValue & 8) != 0) {
            int i6 = IAuthTabCallback + 63;
            onWarmupCompleted = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 41 / 0;
            }
            map = null;
        }
        if ((iIntValue & 16) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i8 = 2 % 2;
                    int i9 = onExtraCallbackWithResult + 73;
                    IAuthTabCallback = i9 % 128;
                    int i10 = i9 % 2;
                    Unit unitIAuthTabCallback = ConvertFloatArrayToByteArray.IAuthTabCallback((SetDetectableSize) obj2);
                    int i11 = onExtraCallbackWithResult + 83;
                    IAuthTabCallback = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 10 / 0;
                    }
                    return unitIAuthTabCallback;
                }
            };
        }
        return Boolean.valueOf(convertFloatArrayToByteArray.onWarmupCompleted(jLongValue, zBooleanValue, strAsBinder, map, function1));
    }

    private static final Unit IAuthTabCallbackStubProxy(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        int i3 = 44 / 0;
        return Unit.INSTANCE;
    }

    public final boolean onWarmupCompleted(long j, boolean z, @NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            ((Boolean) ConvertByteArrayToFloatArray.onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{Long.valueOf(j), Boolean.valueOf(z), str, map, function1}, 1229930114, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1229930114)).booleanValue();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zBooleanValue = ((Boolean) ConvertByteArrayToFloatArray.onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{Long.valueOf(j), Boolean.valueOf(z), str, map, function1}, 1229930114, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1229930114)).booleanValue();
        int i3 = IAuthTabCallback + 25;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            return zBooleanValue;
        }
        throw null;
    }

    public static /* synthetic */ boolean IAuthTabCallback(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, boolean z, String str2, List list, Map map, Function1 function1, int i, Object obj) throws Throwable {
        boolean z2;
        String strAsBinder;
        List listOnNavigationEvent;
        Map map2;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 11;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback + 59;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            strAsBinder = str2;
        }
        if ((i & 8) != 0) {
            int i7 = onWarmupCompleted + 1;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 59 / 0;
                listOnNavigationEvent = ConvertByteArrayToFloatArray.onNavigationEvent();
            } else {
                listOnNavigationEvent = ConvertByteArrayToFloatArray.onNavigationEvent();
            }
        } else {
            listOnNavigationEvent = list;
        }
        if ((i & 16) != 0) {
            int i9 = onWarmupCompleted + 13;
            IAuthTabCallback = i9 % 128;
            int i10 = i9 % 2;
            map2 = null;
        } else {
            map2 = map;
        }
        return convertFloatArrayToByteArray.onExtraCallbackWithResult(str, z2, strAsBinder, (List<String>) listOnNavigationEvent, (Map<String, ?>) map2, (Function1<? super SetDetectableSize, Unit>) ((i & 32) != 0 ? new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda5
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke(Object obj2) {
                int i11 = 2 % 2;
                int i12 = onExtraCallback + 5;
                onExtraCallbackWithResult = i12 % 128;
                int i13 = i12 % 2;
                Unit unitOnWarmupCompleted = ConvertFloatArrayToByteArray.onWarmupCompleted((SetDetectableSize) obj2);
                if (i13 == 0) {
                    int i14 = 74 / 0;
                }
                return unitOnWarmupCompleted;
            }
        } : function1));
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 79;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onExtraCallbackWithResult(@NotNull String str, boolean z, @NotNull String str2, @Nullable List<String> list, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 57;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return ConvertByteArrayToFloatArray.onNavigationEvent(str, z, str2, list, map, function1);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean zOnNavigationEvent = ConvertByteArrayToFloatArray.onNavigationEvent(str, z, str2, list, map, function1);
        int i3 = 65 / 0;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ boolean onWarmupCompleted(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc, boolean z, String str2, Map map, Function1 function1, int i, Object obj) {
        boolean z2;
        String strAsBinder;
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = IAuthTabCallback + 15;
            int i4 = i3 % 128;
            onWarmupCompleted = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 29;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i8 = IAuthTabCallback + 45;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asBinder();
                obj2.hashCode();
                throw null;
            }
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            strAsBinder = str2;
        }
        return ((Boolean) IAuthTabCallback(-241539831, zzgc.onExtraCallbackWithResult(), 241539835, new Object[]{convertFloatArrayToByteArray, str, r8lambdaqfjxzpq89uignp4inuj4r5tibc, Boolean.valueOf(z2), strAsBinder, (i & 16) != 0 ? null : map, (i & 32) != 0 ? new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke(Object obj3) {
                int i9 = 2 % 2;
                int i10 = IAuthTabCallback + 111;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
                Unit unit = (Unit) ConvertFloatArrayToByteArray.IAuthTabCallback(1263159512, zzgc.onExtraCallbackWithResult(), -1263159510, new Object[]{(SetDetectableSize) obj3}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
                int i12 = onWarmupCompleted + 97;
                IAuthTabCallback = i12 % 128;
                int i13 = i12 % 2;
                return unit;
            }
        } : function1}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
    }

    private static final Unit IAuthTabCallbackStub(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 31;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc = (r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) objArr[2];
        boolean zBooleanValue = ((Boolean) objArr[3]).booleanValue();
        String str2 = (String) objArr[4];
        Map<String, ?> map = (Map) objArr[5];
        Function1<? super SetDetectableSize, Unit> function1 = (Function1) objArr[6];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 69;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return Boolean.valueOf(convertFloatArrayToByteArray.onWarmupCompleted(str, clearFaultAdjacentMetadata.onExtraCallback(r8lambdaqfjxzpq89uignp4inuj4r5tibc), zBooleanValue, str2, map, function1));
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(r8lambdaqfjxzpq89uignp4inuj4r5tibc, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        convertFloatArrayToByteArray.onWarmupCompleted(str, clearFaultAdjacentMetadata.onExtraCallback(r8lambdaqfjxzpq89uignp4inuj4r5tibc), zBooleanValue, str2, map, function1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, Set set, boolean z, String str2, Map map, Function1 function1, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        if ((i & 4) != 0) {
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            int i5 = onWarmupCompleted + 53;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str2 = GetFeatureExtension.onWarmupCompleted.asBinder();
            int i7 = onWarmupCompleted + 77;
            IAuthTabCallback = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 4 / 2;
            }
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            map = null;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onNavigationEvent + 57;
                    onWarmupCompleted = i10 % 128;
                    SetDetectableSize setDetectableSize = (SetDetectableSize) obj2;
                    if (i10 % 2 != 0) {
                        return ConvertFloatArrayToByteArray.onExtraCallbackWithResult(setDetectableSize);
                    }
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult(setDetectableSize);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
        boolean zOnWarmupCompleted = convertFloatArrayToByteArray.onWarmupCompleted(str, (Set<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc>) set, z2, str3, (Map<String, ?>) map2, (Function1<? super SetDetectableSize, Unit>) function1);
        int i9 = IAuthTabCallback + 99;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
        return zOnWarmupCompleted;
    }

    private static final Unit onTransact(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 113;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final boolean onWarmupCompleted(@NotNull String str, @NotNull Set<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> set, boolean z, @NotNull String str2, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (set.isEmpty()) {
            return false;
        }
        Set<? extends r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc> set2 = set;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            int i2 = onWarmupCompleted + 99;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(((r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc) it.next()).getId());
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(str, z, str2, arrayList, map, function1);
        int i4 = onWarmupCompleted + 23;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return zOnExtraCallbackWithResult;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = (ConvertFloatArrayToByteArray) objArr[0];
        String str = (String) objArr[1];
        final Pair[] pairArr = (Pair[]) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(pairArr, "");
        IAuthTabCallback(convertFloatArrayToByteArray, str, false, null, null, null, new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnExtraCallback = ConvertFloatArrayToByteArray.onExtraCallback(pairArr, (SetDetectableSize) obj);
                int i5 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnExtraCallback;
                }
                throw null;
            }
        }, 30, null);
        int i2 = IAuthTabCallback + 23;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final Unit onWarmupCompleted(Pair[] pairArr, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 53;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        access8100.onNavigationEvent(setDetectableSize.onExtraCallback(), pairArr);
        Unit unit = Unit.INSTANCE;
        int i4 = onWarmupCompleted + 33;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean onExtraCallbackWithResult(ConvertFloatArrayToByteArray convertFloatArrayToByteArray, String str, Map map, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = onWarmupCompleted + 91;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            map = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLogger$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = IAuthTabCallback + 65;
                    onExtraCallbackWithResult = i5 % 128;
                    Object obj3 = null;
                    SetDetectableSize setDetectableSize = (SetDetectableSize) obj2;
                    if (i5 % 2 != 0) {
                        ConvertFloatArrayToByteArray.onNavigationEvent(setDetectableSize);
                        obj3.hashCode();
                        throw null;
                    }
                    Unit unitOnNavigationEvent = ConvertFloatArrayToByteArray.onNavigationEvent(setDetectableSize);
                    int i6 = IAuthTabCallback + 53;
                    onExtraCallbackWithResult = i6 % 128;
                    if (i6 % 2 == 0) {
                        return unitOnNavigationEvent;
                    }
                    throw null;
                }
            };
        }
        boolean zOnNavigationEvent = convertFloatArrayToByteArray.onNavigationEvent(str, map, function1);
        int i4 = onWarmupCompleted + 61;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit access000(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean onNavigationEvent(@NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return ConvertByteArrayToFloatArray.onNavigationEvent(str, map, function1);
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ConvertByteArrayToFloatArray.onNavigationEvent(str, map, function1);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(40384396, zzgc.onExtraCallbackWithResult(), -40384390, new Object[]{setDetectableSize}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public static /* synthetic */ Unit IAuthTabCallbackDefault(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(1263159512, zzgc.onExtraCallbackWithResult(), -1263159510, new Object[]{setDetectableSize}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(-304249881, zzgc.onExtraCallbackWithResult(), 304249888, new Object[]{setDetectableSize}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public final void onExtraCallback(@NotNull String str, @NotNull Pair<String, ?>... pairArr) throws Throwable {
        int iOnExtraCallbackWithResult = zzgc.onExtraCallbackWithResult();
        IAuthTabCallback(1167879055, zzgc.onExtraCallbackWithResult(), -1167879050, new Object[]{this, str, pairArr}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), iOnExtraCallbackWithResult);
    }

    public final boolean onWarmupCompleted(@NotNull String str, @NotNull r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc r8lambdaqfjxzpq89uignp4inuj4r5tibc, boolean z, @NotNull String str2, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        return ((Boolean) IAuthTabCallback(-241539831, zzgc.onExtraCallbackWithResult(), 241539835, new Object[]{this, str, r8lambdaqfjxzpq89uignp4inuj4r5tibc, Boolean.valueOf(z), str2, map, function1}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult())).booleanValue();
    }
}
