package o;

import android.content.Context;
import im.toss.core.webkit.CustomTabsSessionManager$;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ALCCamera;
import o.UtilsKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ALCCamera {
    private static final setTid<Pair<Boolean, String>> IAuthTabCallback;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private static IAuthTabCallback onExtraCallback;
    private static removeOnNewIntentListener onExtraCallbackWithResult;
    private static final AppSetIdAndScope1 onNavigationEvent;
    private static int onTransact;
    public static final ALCCamera onWarmupCompleted = new ALCCamera();

    public static /* synthetic */ Boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 57;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(function1, obj);
        }
        IAuthTabCallback(function1, obj);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) throws Throwable {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i3)) | i8 | (~(i5 | i3));
        int i10 = (~(i7 | (~i3))) | i8;
        int i11 = (~(i3 | i)) | (~((~i5) | i));
        int i12 = i + i5 + i2 + (929125522 * i4) + (1849324972 * i6);
        int i13 = i12 * i12;
        int i14 = (1419820811 * i) + 1146290176 + ((-1462591364) * i5) + (i9 * 470851707) + (470851707 * i10) + ((-470851707) * i11) + ((-1933443072) * i2) + ((-291241984) * i4) + (1012400128 * i6) + ((-1810169856) * i13);
        int i15 = ((i * (-2058557531)) - 518432259) + (i5 * (-2058559676)) + (i9 * (-715)) + (i10 * (-715)) + (i11 * 715) + (i2 * (-2058558961)) + (i4 * 548722830) + (i6 * 1549712660) + (i13 * (-2087387136));
        int i16 = i14 + (i15 * i15 * (-343605248));
        if (i16 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i16 == 2) {
            return onExtraCallback(objArr);
        }
        Pair pair = (Pair) objArr[0];
        int i17 = 2 % 2;
        Object first = pair.getFirst();
        Object second = pair.getSecond();
        Objects.toString(first);
        Objects.toString(second);
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "CustomTabsSession", "visibilityChanged: " + pair.getFirst() + " (" + pair.getSecond() + ")", (Map) null, (String) null, false, (String) null, 60, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i18 = asBinder + 43;
        asInterface = i18 % 128;
        int i19 = i18 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Pair pair = (Pair) objArr[0];
        int i = 2 % 2;
        int i2 = asInterface + 21;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolIAuthTabCallback = IAuthTabCallback(pair);
        int i4 = asBinder + 93;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return boolIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Pair pair) {
        Unit unit;
        int i = 2 % 2;
        int i2 = asBinder + 75;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {pair};
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        if (i3 == 0) {
            unit = (Unit) onExtraCallback(678092621, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -678092621, iOnExtraCallbackWithResult4, objArr);
            int i4 = 35 / 0;
        } else {
            unit = (Unit) onExtraCallback(678092621, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, -678092621, iOnExtraCallbackWithResult4, objArr);
        }
        int i5 = asInterface + 61;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private ALCCamera() {
    }

    public static final /* synthetic */ setTid IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asInterface + 107;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback = iAuthTabCallback;
        if (i3 == 0) {
            int i4 = 72 / 0;
        }
    }

    public static final /* synthetic */ AppSetIdAndScope1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        AppSetIdAndScope1 appSetIdAndScope1 = onNavigationEvent;
        int i5 = i2 + 79;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return appSetIdAndScope1;
    }

    public static final /* synthetic */ IAuthTabCallback onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 19;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(removeOnNewIntentListener removeonnewintentlistener) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 31;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult = removeonnewintentlistener;
        int i5 = i2 + 125;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final removeOnNewIntentListener onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 107;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        removeOnNewIntentListener removeonnewintentlistener = onExtraCallbackWithResult;
        int i5 = i2 + 115;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return removeonnewintentlistener;
    }

    static {
        setTid<Pair<Boolean, String>> settidIAuthTabCallbackDefault = setTid.IAuthTabCallbackDefault(getWrite.IAuthTabCallback(Boolean.FALSE, "initialize"));
        Intrinsics.checkNotNullExpressionValue(settidIAuthTabCallbackDefault, "");
        IAuthTabCallback = settidIAuthTabCallbackDefault;
        onNavigationEvent = ea10.onExtraCallbackWithResult("CustomTabsSession");
        getByteBuffer getbytebufferIAuthTabCallback = settidIAuthTabCallbackDefault.IAuthTabCallback(1L);
        Intrinsics.checkNotNullExpressionValue(getbytebufferIAuthTabCallback, "");
        setMessageBytes.onExtraCallbackWithResult(getbytebufferIAuthTabCallback, (Function1) null, (Function0) null, new Function1() { // from class: im.toss.core.webkit.CustomTabsSessionManager$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnExtraCallbackWithResult = ALCCamera.onExtraCallbackWithResult((Pair) obj);
                int i4 = IAuthTabCallback + 103;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return unitOnExtraCallbackWithResult;
            }
        }, 3, (Object) null);
        int i = onTransact + 21;
        IAuthTabCallbackStub = i % 128;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Pair pair = (Pair) IAuthTabCallback.onWarmupCompleted();
        if (pair != null) {
            return Boolean.valueOf(((Boolean) pair.getFirst()).booleanValue());
        }
        int i3 = asBinder + 9;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    private static final Boolean IAuthTabCallback(Pair pair) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Boolean bool = (Boolean) pair.getFirst();
        int i4 = asInterface + 3;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    private static final Boolean IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 65;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (Boolean) function1.invoke(obj);
        }
        Intrinsics.checkNotNullParameter(obj, "");
        throw null;
    }

    public final getByteBuffer<Boolean> asBinder() {
        int i = 2 % 2;
        getByteBuffer<Boolean> getbytebufferAsBinder = IAuthTabCallback.getInterfaceDescriptor().asInterface(new CustomTabsSessionManager$.ExternalSyntheticLambda1(new CustomTabsSessionManager$.ExternalSyntheticLambda0())).asBinder();
        Intrinsics.checkNotNullExpressionValue(getbytebufferAsBinder, "");
        int i2 = asInterface + 113;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return getbytebufferAsBinder;
        }
        throw null;
    }

    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull Context context, @Nullable Function1<? super Boolean, Unit> function1) throws Throwable {
        int i = 2 % 2;
        int i2 = asInterface + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        if (onExtraCallbackWithResult != null) {
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
                int i4 = asInterface + 27;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            return;
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(function1);
        onExtraCallback = iAuthTabCallback;
        try {
            Intrinsics.checkNotNull(iAuthTabCallback);
            if (!removeMenuProvider.onExtraCallbackWithResult(context, "com.android.chrome", iAuthTabCallback) && function1 != null) {
                int i6 = asInterface + 87;
                asBinder = i6 % 128;
                int i7 = i6 % 2;
                function1.invoke(Boolean.FALSE);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CustomTabsSession", th);
            IAuthTabCallback iAuthTabCallback2 = onExtraCallback;
            if (iAuthTabCallback2 != null) {
                iAuthTabCallback2.IAuthTabCallback((Function1) null);
            }
            if (function1 != null) {
                int i8 = asBinder + 43;
                asInterface = i8 % 128;
                int i9 = i8 % 2;
                function1.invoke(Boolean.FALSE);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    @JvmStatic
    public static final void onExtraCallbackWithResult(@NotNull Context context) {
        IAuthTabCallback iAuthTabCallback;
        int i = 2 % 2;
        int i2 = asInterface + 45;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        IAuthTabCallback iAuthTabCallback2 = onExtraCallback;
        if (iAuthTabCallback2 != null) {
            try {
                Intrinsics.checkNotNull(iAuthTabCallback2);
                context.unbindService(iAuthTabCallback2);
                IAuthTabCallback.onExtraCallback(getWrite.IAuthTabCallback(Boolean.FALSE, "disconnect"));
                iAuthTabCallback = onExtraCallback;
            } catch (Throwable th) {
                try {
                    ConvertFloatArrayToByteArray.onExtraCallbackWithResult.IAuthTabCallback("CustomTabsSession", th);
                    IAuthTabCallback.onExtraCallback(getWrite.IAuthTabCallback(Boolean.FALSE, "disconnect"));
                    iAuthTabCallback = onExtraCallback;
                    if (iAuthTabCallback != null) {
                    }
                } catch (Throwable th2) {
                    IAuthTabCallback.onExtraCallback(getWrite.IAuthTabCallback(Boolean.FALSE, "disconnect"));
                    IAuthTabCallback iAuthTabCallback3 = onExtraCallback;
                    if (iAuthTabCallback3 != null) {
                        iAuthTabCallback3.IAuthTabCallback((Function1) null);
                    }
                    onExtraCallbackWithResult = null;
                    onExtraCallback = null;
                    throw th2;
                }
            }
            if (iAuthTabCallback != null) {
                iAuthTabCallback.IAuthTabCallback((Function1) null);
                int i3 = asInterface + 25;
                asBinder = i3 % 128;
                int i4 = i3 % 2;
            }
            onExtraCallbackWithResult = null;
            onExtraCallback = null;
        }
    }

    public static /* synthetic */ Boolean onExtraCallback(Pair pair) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Boolean) onExtraCallback(819567453, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -819567451, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{pair});
    }

    private static final Unit onWarmupCompleted(Pair pair) {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return (Unit) onExtraCallback(678092621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -678092621, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{pair});
    }

    public final boolean onWarmupCompleted() {
        int iOnExtraCallbackWithResult = UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult();
        return ((Boolean) onExtraCallback(-1366034302, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), 1366034303, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), new Object[]{this})).booleanValue();
    }
}
