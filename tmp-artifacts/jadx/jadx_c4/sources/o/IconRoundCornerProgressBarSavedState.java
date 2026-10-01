package o;

import im.toss.tosssecurities.core.watchlistv2.ui.component.WatchListImageButtonKt$;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IconRoundCornerProgressBarSavedState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class IconRoundCornerProgressBarSavedState {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallbackWithResult;

    public static /* synthetic */ Unit IAuthTabCallback(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(obj);
        }
        onWarmupCompleted(obj);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, Throwable th) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr = {str, th};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted2, 20092228, iOnWarmupCompleted3, -20092222, iOnWarmupCompleted4, iOnWarmupCompleted, objArr);
        int i4 = IAuthTabCallback + 75;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 83;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        access100(function1, obj);
        int i4 = onExtraCallbackWithResult + 119;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        access000(function1, obj);
        int i4 = IAuthTabCallback + 33;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr2 = {function1, obj};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 == 0) {
            onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1146149881, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1146149880, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr2);
            obj2.hashCode();
            throw null;
        }
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1146149881, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1146149880, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, objArr2);
        int i4 = onExtraCallbackWithResult + 115;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback_Parcel(function1, obj);
        if (i3 != 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = onExtraCallbackWithResult + 95;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onExtraCallback(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsInterface = asInterface(obj);
        int i4 = onExtraCallbackWithResult + 81;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitAsInterface;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 43;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitAsBinder = asBinder(str, th);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return unitAsBinder;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 105;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        extraCallback(function1, obj);
        int i4 = IAuthTabCallback + 51;
        onExtraCallbackWithResult = i4 % 128;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(obj);
        int i4 = onExtraCallbackWithResult + 99;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 77 / 0;
        }
        return unitIAuthTabCallbackStub;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 29;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            onTransact(str, th);
            obj.hashCode();
            throw null;
        }
        Unit unitOnTransact = onTransact(str, th);
        int i3 = IAuthTabCallback + 119;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 == 0) {
            return unitOnTransact;
        }
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 7;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        writeTypedObject(function1, obj);
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = (~(i7 | i2)) | (~(i7 | i6)) | (~(i2 | i6));
        int i9 = (~(i4 | i6)) | i2;
        int i10 = (~(i6 | i4 | i2)) | (~(i7 | (~i2) | (~i6)));
        int i11 = i4 + i2 + i + (862446602 * i3) + (395103901 * i5);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i4) - 438566912) + ((-683246085) * i2) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i) + ((-128450560) * i3) + ((-674496512) * i5) + ((-1108934656) * i12);
        int i14 = (i4 * 1384179468) + 550727958 + (i2 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i * 1384179971) + (i3 * 1640285726) + (i5 * 120803543) + (i12 * 2025127936);
        switch (i13 + (i14 * i14 * (-275709952))) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return asBinder(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return IAuthTabCallbackStub(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit onNavigationEvent(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        Object[] objArr = {obj};
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted3 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        int iOnWarmupCompleted4 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        if (i3 != 0) {
            throw null;
        }
        Unit unit = (Unit) onNavigationEvent(iOnWarmupCompleted2, 1604511288, iOnWarmupCompleted3, -1604511281, iOnWarmupCompleted4, iOnWarmupCompleted, objArr);
        int i4 = IAuthTabCallback + 63;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallbackDefault(str, th);
            throw null;
        }
        Unit unitIAuthTabCallbackDefault = IAuthTabCallbackDefault(str, th);
        int i3 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallbackDefault;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getInterfaceDescriptor(function1, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1859731051, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1859731054, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
            int i3 = 58 / 0;
        } else {
            int iOnWarmupCompleted2 = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
            onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1859731051, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1859731054, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted2, new Object[]{function1, obj});
        }
        int i4 = onExtraCallbackWithResult + 113;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallbackStub = IAuthTabCallbackStub(str, th);
        int i4 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallbackStub;
    }

    public static final deserializeUriNullableCollection IAuthTabCallback(@NotNull deserializeUriNullableCollection deserializeurinullablecollection, @Nullable r8lambdakRhAimf1bm5CgjbILhP45VLN_xQ r8lambdakrhaimf1bm5cgjbilhp45vln_xq) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(deserializeurinullablecollection, "");
        if (r8lambdakrhaimf1bm5cgjbilhp45vln_xq != null) {
            r8lambdakrhaimf1bm5cgjbilhp45vln_xq.addSubscription(deserializeurinullablecollection);
            int i3 = onExtraCallbackWithResult + 121;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        return deserializeurinullablecollection;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
    }

    private static final void access000(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 39;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onWarmupCompleted(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit asBinder(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 55;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        Object obj = objArr[0];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static final deserializeUriNullableCollection onExtraCallbackWithResult(@NotNull writeRaw<? extends Object> writeraw, @NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(writeraw, "");
        Intrinsics.checkNotNullParameter(str, "");
        final Function1 function1 = new Function1() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 53;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return IconRoundCornerProgressBarSavedState.onNavigationEvent(obj);
                }
                IconRoundCornerProgressBarSavedState.onNavigationEvent(obj);
                throw null;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    Object[] objArr = {function1, obj};
                    IconRoundCornerProgressBarSavedState.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 458287620, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -458287615, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), objArr);
                    int i4 = 87 / 0;
                } else {
                    Object[] objArr2 = {function1, obj};
                    IconRoundCornerProgressBarSavedState.onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 458287620, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -458287615, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), objArr2);
                }
                int i5 = onExtraCallbackWithResult + 89;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }
        };
        final Function1 function12 = new Function1() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 101;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                String str2 = str;
                Throwable th = (Throwable) obj;
                if (i4 == 0) {
                    return IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(str2, th);
                }
                Unit unitOnExtraCallbackWithResult = IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(str2, th);
                int i5 = 36 / 0;
                return unitOnExtraCallbackWithResult;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnNavigationEvent = writeraw.onNavigationEvent(deserializefloat, new deserializeFloat() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda3
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 99;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(function12, obj);
                int i5 = onExtraCallback + 19;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnNavigationEvent, "");
        int i2 = IAuthTabCallback + 113;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        return deserializeurinullablecollectionOnNavigationEvent;
    }

    public static /* synthetic */ deserializeUriNullableCollection onExtraCallbackWithResult(writeRaw writeraw, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 47;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 67 / 0;
            }
            int i6 = i3 + 63;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            str = "safeSubscribe";
        }
        return onExtraCallbackWithResult((writeRaw<? extends Object>) writeraw, str);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        int i4 = 3 / 0;
        return null;
    }

    private static final void writeTypedObject(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 103;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 107;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onTransact(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void IAuthTabCallback_Parcel(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 3;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
    }

    private static final Unit asInterface(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 29;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallback + 85;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 11 / 0;
        }
        return unit;
    }

    private static final void extraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
            int i3 = 60 / 0;
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 != 0) {
            return null;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit IAuthTabCallbackStub(String str, Throwable th) throws Throwable {
        Unit unit;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
            unit = Unit.INSTANCE;
            int i3 = 88 / 0;
        } else {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
            unit = Unit.INSTANCE;
        }
        int i4 = onExtraCallbackWithResult + 35;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 55 / 0;
        }
        return unit;
    }

    private static final Unit IAuthTabCallbackStub(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 15;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void access100(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 57;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void getInterfaceDescriptor(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = IAuthTabCallback + 97;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing = (JsonReaderUnknownNumberParsing) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 49;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        if ((iIntValue & 1) != 0) {
            int i5 = i3 + 45;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            str = "safeSubscribe";
        }
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = onWarmupCompleted((JsonReaderUnknownNumberParsing<? extends Object>) jsonReaderUnknownNumberParsing, str);
        int i7 = onExtraCallbackWithResult + 51;
        IAuthTabCallback = i7 % 128;
        if (i7 % 2 != 0) {
            return deserializeurinullablecollectionOnWarmupCompleted;
        }
        throw null;
    }

    public static final deserializeUriNullableCollection onWarmupCompleted(@NotNull JsonReaderUnknownNumberParsing<? extends Object> jsonReaderUnknownNumberParsing, @NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(jsonReaderUnknownNumberParsing, "");
        Intrinsics.checkNotNullParameter(str, "");
        final Function1 function1 = new Function1() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 39;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(obj);
                    throw null;
                }
                Unit unitOnExtraCallbackWithResult = IconRoundCornerProgressBarSavedState.onExtraCallbackWithResult(obj);
                int i4 = IAuthTabCallback + 21;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitOnExtraCallbackWithResult;
                }
                throw null;
            }
        };
        deserializeFloat deserializefloat = new deserializeFloat() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 121;
                onExtraCallbackWithResult = i3 % 128;
                Object obj2 = null;
                if (i3 % 2 != 0) {
                    IconRoundCornerProgressBarSavedState.onNavigationEvent(function1, obj);
                    obj2.hashCode();
                    throw null;
                }
                IconRoundCornerProgressBarSavedState.onNavigationEvent(function1, obj);
                int i4 = onExtraCallbackWithResult + 115;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        };
        final Function1 function12 = new Function1() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 21;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = IconRoundCornerProgressBarSavedState.onNavigationEvent(str, (Throwable) obj);
                int i5 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnNavigationEvent;
            }
        };
        deserializeUriNullableCollection deserializeurinullablecollectionOnWarmupCompleted = jsonReaderUnknownNumberParsing.onWarmupCompleted(deserializefloat, new deserializeFloat() { // from class: im.toss.core.extensions.DisposablesKt$$ExternalSyntheticLambda7
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final void accept(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 37;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                IconRoundCornerProgressBarSavedState.IAuthTabCallback(function12, obj);
                int i5 = onExtraCallback + 105;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(deserializeurinullablecollectionOnWarmupCompleted, "");
        int i2 = onExtraCallbackWithResult + 97;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return deserializeurinullablecollectionOnWarmupCompleted;
    }

    private static final Unit IAuthTabCallbackDefault(String str, Throwable th) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
            return Unit.INSTANCE;
        }
        ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback(str, th);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 458287620, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -458287615, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1163896519, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1163896521, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
    }

    public static /* synthetic */ void asInterface(Function1 function1, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 964340815, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -964340815, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
    }

    public static /* synthetic */ deserializeUriNullableCollection IAuthTabCallback(JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsing, String str, int i, Object obj) {
        Object[] objArr = {jsonReaderUnknownNumberParsing, str, Integer.valueOf(i), obj};
        return (deserializeUriNullableCollection) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -243760193, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 243760197, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), objArr);
    }

    private static final Unit asInterface(String str, Throwable th) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 20092228, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -20092222, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{str, th});
    }

    private static final void IAuthTabCallbackStubProxy(Function1 function1, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1859731051, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1859731054, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
    }

    private static final Unit onTransact(Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        return (Unit) onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1604511288, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1604511281, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{obj});
    }

    private static final void ICustomTabsCallback(Function1 function1, Object obj) {
        int iOnWarmupCompleted = WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted();
        onNavigationEvent(WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), 1146149881, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), -1146149880, WatchListImageButtonKt$.ExternalSyntheticLambda3.onWarmupCompleted(), iOnWarmupCompleted, new Object[]{function1, obj});
    }
}
