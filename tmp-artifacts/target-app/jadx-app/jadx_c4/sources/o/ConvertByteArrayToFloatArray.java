package o;

import im.toss.core.tracker.entry.TrackEvent;
import im.toss.core.tracker.entry.TrackLog;
import im.toss.core.tracker.entry.TrackState;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertByteArrayToFloatArray;
import o.SetDetectableSize;
import o.UtilsKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ConvertByteArrayToFloatArray {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult;
    private static final List<String> onNavigationEvent = CollectionsKt.listOf(r8lambdaQfjxzPQ89UIGNP4Inuj4r5TIbc.TOSS.getId());
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit onExtraCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(setDetectableSize);
        int i4 = onExtraCallbackWithResult + 99;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitAsInterface;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = i7 | i8;
        int i10 = ~(i9 | i2);
        int i11 = (~i2) | i7;
        int i12 = i10 | (~(i11 | i6));
        int i13 = (~(i2 | i7)) | (~i9);
        int i14 = (~i11) | (~(i8 | i3));
        int i15 = i3 + i6 + i5 + (783392123 * i) + ((-786872706) * i4);
        int i16 = i15 * i15;
        int i17 = ((-1525980173) * i3) + 1729888256 + (218870266 * i6) + (i12 * 1744850439) + ((-805266418) * i13) + (1744850439 * i14) + (1963720704 * i5) + ((-1731985408) * i) + ((-471334912) * i4) + ((-600899584) * i16);
        int i18 = (i3 * 375823119) + 1642083618 + (i6 * 375823682) + (i12 * 563) + (i13 * 1126) + (i14 * 563) + (i5 * 375824245) + (i * (-117547465)) + (i4 * 763984278) + (i16 * (-763691008));
        int i19 = i17 + (i18 * i18 * 1830354944);
        if (i19 == 1) {
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
            int i20 = 2 % 2;
            int i21 = onExtraCallback + 87;
            onExtraCallbackWithResult = i21 % 128;
            int i22 = i21 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(setDetectableSize);
            int i23 = onExtraCallback + 125;
            onExtraCallbackWithResult = i23 % 128;
            int i24 = i23 % 2;
            return unitIAuthTabCallback;
        }
        if (i19 == 2) {
            return onWarmupCompleted(objArr);
        }
        long jLongValue = ((Number) objArr[0]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        String str = (String) objArr[2];
        Map<String, ? extends Object> map = (Map) objArr[3];
        Function1 function1 = (Function1) objArr[4];
        int i25 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SetDetectableSize setDetectableSize2 = new SetDetectableSize();
        setDetectableSize2.onExtraCallback("action_type", "screen");
        setDetectableSize2.onExtraCallback(map);
        function1.invoke(setDetectableSize2);
        Unit unit = Unit.INSTANCE;
        boolean zOnWarmupCompleted = new TrackLog(jLongValue, setDetectableSize2.IAuthTabCallback(), str, (String) null, 8, (DefaultConstructorMarker) null).onWarmupCompleted(zBooleanValue);
        int i26 = onExtraCallback + 31;
        onExtraCallbackWithResult = i26 % 128;
        int i27 = i26 % 2;
        return Boolean.valueOf(zOnWarmupCompleted);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 113;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnTransact = onTransact(setDetectableSize);
        int i4 = onExtraCallback + 3;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnTransact;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ List onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        List<String> list = onNavigationEvent;
        int i5 = i3 + 121;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static /* synthetic */ Unit onWarmupCompleted(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
            return (Unit) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{setDetectableSize}, 275109808, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -275109806);
        }
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int i3 = 14 / 0;
        return (Unit) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, new Object[]{setDetectableSize}, 275109808, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult4, -275109806);
    }

    static {
        int i = IAuthTabCallback + 73;
        onWarmupCompleted = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean onExtraCallback(long j, boolean z, String str, Map map, Function1 function1, int i, Object obj) {
        boolean z2;
        String strAsBinder;
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 37;
        int i4 = i3 % 128;
        onExtraCallback = i4;
        int i5 = i3 % 2;
        if ((i & 2) != 0) {
            int i6 = i4 + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        Map map2 = null;
        if ((i & 4) != 0) {
            int i8 = i4 + 53;
            onExtraCallbackWithResult = i8 % 128;
            if (i8 % 2 != 0) {
                GetFeatureExtension.onWarmupCompleted.asBinder();
                map2.hashCode();
                throw null;
            }
            strAsBinder = GetFeatureExtension.onWarmupCompleted.asBinder();
        } else {
            strAsBinder = str;
        }
        if ((i & 8) != 0) {
            int i9 = onExtraCallback + 57;
            onExtraCallbackWithResult = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 41 / 0;
            }
        } else {
            map2 = map;
        }
        return onNavigationEvent(j, z2, strAsBinder, map2, (i & 16) != 0 ? new Function1() { // from class: im.toss.core.tracker.AppLoggerKt$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj2) {
                int i11 = 2 % 2;
                int i12 = onNavigationEvent + 61;
                onWarmupCompleted = i12 % 128;
                SetDetectableSize setDetectableSize = (SetDetectableSize) obj2;
                if (i12 % 2 == 0) {
                    return ConvertByteArrayToFloatArray.onWarmupCompleted(setDetectableSize);
                }
                ConvertByteArrayToFloatArray.onWarmupCompleted(setDetectableSize);
                throw null;
            }
        } : function1);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Unit unit;
        SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            unit = Unit.INSTANCE;
            int i3 = 53 / 0;
        } else {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallback + 109;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static final boolean onNavigationEvent(long j, boolean z, @NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        setDetectableSize.onExtraCallback(map);
        function1.invoke(setDetectableSize);
        Unit unit = Unit.INSTANCE;
        boolean zOnWarmupCompleted = new TrackLog(j, setDetectableSize.IAuthTabCallback(), str, (String) null, 8, (DefaultConstructorMarker) null).onWarmupCompleted(z);
        int i2 = onExtraCallback + 83;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 95 / 0;
        }
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onNavigationEvent(long j, boolean z, String str, Map map, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            int i3 = onExtraCallbackWithResult + 5;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            str = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        if ((i & 8) != 0) {
            int i5 = onExtraCallbackWithResult + 37;
            int i6 = i5 % 128;
            onExtraCallback = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 87;
            onExtraCallbackWithResult = i8 % 128;
            int i9 = i8 % 2;
            map = null;
        }
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLoggerKt$$ExternalSyntheticLambda1
                private static int IAuthTabCallback = 1;
                private static int onNavigationEvent;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = IAuthTabCallback + 107;
                    onNavigationEvent = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallbackWithResult = ConvertByteArrayToFloatArray.onExtraCallbackWithResult((SetDetectableSize) obj2);
                    int i13 = IAuthTabCallback + 31;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            };
        }
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), str, map, function1};
        return ((Boolean) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, 1229930114, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1229930114)).booleanValue();
    }

    private static final Unit onTransact(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 25;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallback + 29;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, boolean z, String str2, List list, Map map, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback;
        int i4 = i3 + 31;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 4) != 0) {
            int i5 = i3 + 83;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            int i7 = i3 + 9;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            str2 = GetFeatureExtension.onWarmupCompleted.asBinder();
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            list = onNavigationEvent;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            map = null;
        }
        Map map2 = map;
        if ((i & 32) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLoggerKt$$ExternalSyntheticLambda2
                private static int onExtraCallback = 0;
                private static int onNavigationEvent = 1;

                public final Object invoke(Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = onExtraCallback + 1;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
                    Unit unit = (Unit) ConvertByteArrayToFloatArray.onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{(SetDetectableSize) obj2}, 1739719988, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1739719987);
                    int i12 = onExtraCallback + 115;
                    onNavigationEvent = i12 % 128;
                    int i13 = i12 % 2;
                    return unit;
                }
            };
        }
        return onNavigationEvent(str, z2, str3, list2, map2, function1);
    }

    private static final Unit IAuthTabCallback(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit2 = Unit.INSTANCE;
        int i3 = onExtraCallbackWithResult + 45;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static final boolean onNavigationEvent(@NotNull String str, boolean z, @NotNull String str2, @Nullable List<String> list, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        setDetectableSize.onExtraCallback(map);
        function1.invoke(setDetectableSize);
        boolean zOnWarmupCompleted = new TrackEvent(str, setDetectableSize.IAuthTabCallback(), list, str2).onWarmupCompleted(z);
        int i2 = onExtraCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted(String str, Map map, Function1 function1, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 57;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 2) != 0) {
            int i6 = i3 + 33;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i3 + 31;
            onExtraCallback = i8 % 128;
            int i9 = i8 % 2;
            map = null;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: im.toss.core.tracker.AppLoggerKt$$ExternalSyntheticLambda0
                private static int onNavigationEvent = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 125;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    Unit unitOnExtraCallback = ConvertByteArrayToFloatArray.onExtraCallback((SetDetectableSize) obj2);
                    int i13 = onWarmupCompleted + 113;
                    onNavigationEvent = i13 % 128;
                    int i14 = i13 % 2;
                    return unitOnExtraCallback;
                }
            };
        }
        return onNavigationEvent(str, map, function1);
    }

    private static final Unit asInterface(SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 87;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 99;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Deprecated
    public static final boolean onNavigationEvent(@NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        SetDetectableSize setDetectableSize = new SetDetectableSize();
        setDetectableSize.onExtraCallback(map);
        function1.invoke(setDetectableSize);
        Object[] objArr = {new TrackState(str, setDetectableSize.IAuthTabCallback(), (List) null, 4, (DefaultConstructorMarker) null)};
        int iOnNavigationEvent = OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) downloadZip.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 870178991, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), iOnNavigationEvent, -870178991, objArr, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).booleanValue();
        int i2 = onExtraCallback + 63;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return zBooleanValue;
    }

    public static /* synthetic */ Unit onNavigationEvent(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{setDetectableSize}, 1739719988, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -1739719987);
    }

    private static final Unit asBinder(SetDetectableSize setDetectableSize) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, new Object[]{setDetectableSize}, 275109808, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -275109806);
    }

    @Deprecated
    public static final boolean IAuthTabCallback(long j, boolean z, @NotNull String str, @Nullable Map<String, ?> map, @NotNull Function1<? super SetDetectableSize, Unit> function1) {
        Object[] objArr = {Long.valueOf(j), Boolean.valueOf(z), str, map, function1};
        return ((Boolean) onExtraCallbackWithResult(UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), objArr, 1229930114, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -1229930114)).booleanValue();
    }
}
