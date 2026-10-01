package o;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$asInterface;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import im.toss.uikit.base.UIKitBaseActivity;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.PKCS58;
import o.getMediationProvider;
import o.s3;
import o.s3c;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.password.LockScreenManager$;

/* loaded from: classes.dex */
public final class nativeInvoke {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final int IAuthTabCallback;
    private static EventServiceImpl IAuthTabCallbackDefault = null;
    private static char IAuthTabCallbackStub = 0;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static char access000 = 0;
    private static char[] access100 = null;
    private static WeakReference<deserializeUriNullableCollection> asBinder = null;
    private static final Lazy asInterface;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static char getInterfaceDescriptor = 0;
    public static final nativeInvoke onExtraCallback;
    private static final boolean onExtraCallbackWithResult = false;
    private static final String onNavigationEvent;
    private static final setTid<Boolean> onTransact;
    private static final String onWarmupCompleted;
    private static int readTypedObject = 1;

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function1, obj);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = i8 | (~(i9 | i6 | i5));
        int i11 = ~(i7 | i9);
        int i12 = (~i5) | i9;
        int i13 = i11 | (~i12);
        int i14 = ~(i12 | i6);
        int i15 = i6 + i + i3 + ((-1261570137) * i4) + (2040842291 * i2);
        int i16 = i15 * i15;
        int i17 = ((i6 * (-750812765)) - 1471086592) + ((-750812765) * i) + (1493335646 * i10) + ((-1308296004) * i13) + ((-1493335646) * i14) + (742522880 * i3) + ((-1928462336) * i4) + (1629880320 * i2) + (2096168960 * i16);
        int i18 = ((i6 * 1408203179) - 1033136887) + (i * 1408203179) + (i10 * (-338)) + (i13 * (-676)) + (i14 * 338) + (i3 * 1408202841) + (i4 * (-1046847217)) + (i2 * (-121732677)) + (i16 * 1741225984);
        int i19 = i17 + (i18 * i18 * 838795264);
        if (i19 == 1) {
            return onExtraCallback(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? i19 != 5 ? IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i20 = 2 % 2;
        int i21 = readTypedObject + 87;
        extraCallbackWithResult = i21 % 128;
        int i22 = i21 % 2;
        function1.invoke(obj);
        int i23 = readTypedObject + 23;
        extraCallbackWithResult = i23 % 128;
        int i24 = i23 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        DimensionPropConverterCompanion dimensionPropConverterCompanion = (DimensionPropConverterCompanion) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(uIKitBaseActivity, dimensionPropConverterCompanion, th);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(uIKitBaseActivity, dimensionPropConverterCompanion, th);
        int i3 = readTypedObject + 29;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(uIKitBaseActivity, dimensionPropConverterCompanion, th);
        int i4 = readTypedObject + 75;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(DimensionPropConverterCompanion dimensionPropConverterCompanion) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(dimensionPropConverterCompanion);
        int i4 = extraCallbackWithResult + 45;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = readTypedObject + 119;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, setDetectableSize);
        int i4 = extraCallbackWithResult + 43;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(TypeUtils7 typeUtils7) {
        int i = 2 % 2;
        int i2 = readTypedObject + 33;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(typeUtils7);
        int i4 = extraCallbackWithResult + 35;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ isWifiEnabled onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = readTypedObject + 73;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabledIAuthTabCallbackStub = IAuthTabCallbackStub();
        int i4 = extraCallbackWithResult + 97;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return iswifienabledIAuthTabCallbackStub;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = readTypedObject + 69;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        asBinder(function1, obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        isJSONTypeIgnore isjsontypeignore = (isJSONTypeIgnore) objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 31;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(uIKitBaseActivity, isjsontypeignore);
        }
        IAuthTabCallback(uIKitBaseActivity, isjsontypeignore);
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault(function1, obj);
        int i4 = extraCallbackWithResult + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 19;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(uIKitBaseActivity, isjsontypeignore);
        int i4 = readTypedObject + 101;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 1;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        int i4 = readTypedObject + 29;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    private nativeInvoke() {
    }

    static {
        IAuthTabCallbackDefault();
        Object[] objArr = new Object[1];
        a(new char[]{31270, 43933, 14448, 27531, 52036, 14027, 40989, 65487, 7380, 27050, 55213, 7546, 50155, 38001, 8183, 40961, 51559, 29142}, (ViewConfiguration.getTapTimeout() >> 16) + 17, objArr);
        onNavigationEvent = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{45682, 1674, 26944, 57361, 13486, 26216, 39061, 1671, 49030, 19540, 56604, 31198, 48279, 44845}, AndroidCharacter.getMirror('0') - '#', objArr2);
        onWarmupCompleted = ((String) objArr2[0]).intern();
        onExtraCallback = new nativeInvoke();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub = addPolicy.ITrustedWebActivityServiceStub();
        Object[] objArr3 = new Object[1];
        a(new char[]{45682, 1674, 26944, 57361, 13486, 26216, 39061, 1671, 49030, 19540, 56604, 31198, 48279, 44845}, 13 - Color.blue(0), objArr3);
        setTid<Boolean> settidIAuthTabCallbackDefault = setTid.IAuthTabCallbackDefault(Boolean.valueOf(textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStub.onExtraCallback(((String) objArr3[0]).intern(), false)));
        Intrinsics.checkNotNullExpressionValue(settidIAuthTabCallbackDefault, "");
        onTransact = settidIAuthTabCallbackDefault;
        asBinder = new WeakReference<>(null);
        asInterface = LazyKt.onExtraCallbackWithResult(new LockScreenManager$.ExternalSyntheticLambda11());
        IAuthTabCallback = 8;
        int i = extraCallback + 55;
        ICustomTabsCallback = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private final isWifiEnabled asInterface() {
        int i = 2 % 2;
        int i2 = readTypedObject + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabled = (isWifiEnabled) asInterface.getValue();
        int i4 = extraCallbackWithResult + 47;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return iswifienabled;
        }
        throw null;
    }

    private static final isWifiEnabled IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        isWifiEnabled iswifienabledPrefetch = ((RVTabbarLayout1) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), RVTabbarLayout1.class)).prefetch();
        int i4 = extraCallbackWithResult + 41;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return iswifienabledPrefetch;
    }

    public final void onNavigationEvent(@Nullable EventServiceImpl eventServiceImpl) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 101;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        IAuthTabCallbackDefault = eventServiceImpl;
        int i5 = i3 + 51;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(nativeInvoke nativeinvoke, UIKitBaseActivity uIKitBaseActivity, boolean z, DimensionPropConverterCompanion dimensionPropConverterCompanion, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = readTypedObject + 27;
        int i4 = i3 % 128;
        extraCallbackWithResult = i4;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 2) != 0) {
            int i5 = i4 + 23;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        nativeinvoke.onWarmupCompleted(uIKitBaseActivity, z, dimensionPropConverterCompanion);
    }

    private static final Unit IAuthTabCallback(TypeUtils7 typeUtils7) {
        boolean z;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 123;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            z = false;
        } else {
            Intrinsics.checkNotNullParameter(typeUtils7, "");
            z = true;
        }
        typeUtils7.onWarmupCompleted(z);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = readTypedObject + 7;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = readTypedObject + 95;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        DimensionPropConverterCompanion dimensionPropConverterCompanion = (DimensionPropConverterCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 45;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            dimensionPropConverterCompanion.onExtraCallback();
            Unit unit = Unit.INSTANCE;
            int i3 = extraCallbackWithResult + 109;
            readTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        dimensionPropConverterCompanion.onExtraCallback();
        Unit unit2 = Unit.INSTANCE;
        throw null;
    }

    private static final Unit IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 21;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult) {
            Object[] objArr = new Object[1];
            a(new char[]{40989, 65487, 13802, 12088, 416, 59740, 649, 59142, 13486, 26216, 39061, 1671, 49030, 19540, 56604, 31198, 3625, 44471}, 18 - Color.blue(0), objArr);
            ((String) objArr[0]).intern();
            Objects.toString(isjsontypeignore);
            ViewConfiguration.getZoomControlsTimeout();
        }
        EventServiceImpl eventServiceImpl = IAuthTabCallbackDefault;
        if (eventServiceImpl != null) {
            int i4 = extraCallbackWithResult + 103;
            readTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                AppLovinSdkInitializationConfigurationImpla.onNavigationEvent(eventServiceImpl, uIKitBaseActivity);
                throw null;
            }
            AppLovinSdkInitializationConfigurationImpla.onNavigationEvent(eventServiceImpl, uIKitBaseActivity);
        }
        IAuthTabCallbackDefault = null;
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        UIKitBaseActivity uIKitBaseActivity = (UIKitBaseActivity) objArr[0];
        DimensionPropConverterCompanion dimensionPropConverterCompanion = (DimensionPropConverterCompanion) objArr[1];
        Throwable th = (Throwable) objArr[2];
        int i = 2 % 2;
        int i2 = readTypedObject + 79;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (onExtraCallbackWithResult) {
            Object[] objArr2 = new Object[1];
            a(new char[]{40989, 65487, 13802, 12088, 416, 59740, 649, 59142, 13486, 26216, 39061, 1671, 49030, 19540, 56604, 31198, 3625, 44471}, Color.alpha(0) + 18, objArr2);
            ((String) objArr2[0]).intern();
            Objects.toString(th);
            Process.myTid();
        }
        nativeInvoke nativeinvoke = onExtraCallback;
        Intrinsics.checkNotNull(th);
        nativeinvoke.onNavigationEvent(uIKitBaseActivity, dimensionPropConverterCompanion, th);
        Unit unit = Unit.INSTANCE;
        int i3 = extraCallbackWithResult + 47;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = readTypedObject + 113;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final void IAuthTabCallbackDefault(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        function1.invoke(obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = readTypedObject + 5;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(UIKitBaseActivity uIKitBaseActivity, isJSONTypeIgnore isjsontypeignore) {
        int i = 2 % 2;
        int i2 = readTypedObject + 91;
        int i3 = i2 % 128;
        extraCallbackWithResult = i3;
        int i4 = i2 % 2;
        EventServiceImpl eventServiceImpl = IAuthTabCallbackDefault;
        if (eventServiceImpl != null) {
            int i5 = i3 + 19;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            AppLovinSdkInitializationConfigurationImpla.onNavigationEvent(eventServiceImpl, uIKitBaseActivity);
        }
        IAuthTabCallbackDefault = null;
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion, Throwable th) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 27;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (onExtraCallbackWithResult) {
            Object[] objArr = new Object[1];
            a(new char[]{40989, 65487, 13802, 12088, 416, 59740, 649, 59142, 13486, 26216, 39061, 1671, 49030, 19540, 56604, 31198, 3625, 44471}, 18 - (Process.myTid() >> 22), objArr);
            ((String) objArr[0]).intern();
            Objects.toString(th);
            TextUtils.lastIndexOf("", '0');
        }
        nativeInvoke nativeinvoke = onExtraCallback;
        Intrinsics.checkNotNull(th);
        nativeinvoke.onNavigationEvent(uIKitBaseActivity, dimensionPropConverterCompanion, th);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 61;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWarmupCompleted(@org.jetbrains.annotations.NotNull im.toss.uikit.base.UIKitBaseActivity r22, boolean r23, @org.jetbrains.annotations.NotNull o.DimensionPropConverterCompanion r24) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nativeInvoke.onWarmupCompleted(im.toss.uikit.base.UIKitBaseActivity, boolean, o.DimensionPropConverterCompanion):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r6.onExtraCallbackWithResult();
        r5 = 33 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r6.onExtraCallbackWithResult();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if ((r7 instanceof o.unwrapOptional) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        im.toss.state.spec.SessionState.Companion.onExtraCallback().onExtraCallbackWithResult(r7);
        r5.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        r5 = o.nativeInvoke.readTypedObject + 103;
        o.nativeInvoke.extraCallbackWithResult = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if ((r7 instanceof o.num) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if ((!(r7 instanceof o.num)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        r1 = r1 + 65;
        o.nativeInvoke.readTypedObject = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void onNavigationEvent(im.toss.uikit.base.UIKitBaseActivity r5, o.DimensionPropConverterCompanion r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = o.nativeInvoke.extraCallbackWithResult
            int r2 = r1 + 47
            int r3 = r2 % 128
            o.nativeInvoke.readTypedObject = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L17
            boolean r2 = r7 instanceof o.num
            r3 = 39
            int r3 = r3 / 0
            if (r2 == 0) goto L32
            goto L1d
        L17:
            boolean r2 = r7 instanceof o.num
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == r3) goto L32
        L1d:
            int r1 = r1 + 65
            int r5 = r1 % 128
            o.nativeInvoke.readTypedObject = r5
            int r1 = r1 % r0
            if (r1 != 0) goto L2e
            r6.onExtraCallbackWithResult()
            r5 = 33
            int r5 = r5 / 0
            return
        L2e:
            r6.onExtraCallbackWithResult()
            return
        L32:
            boolean r6 = r7 instanceof o.unwrapOptional
            if (r6 != 0) goto L42
            im.toss.state.spec.SessionState$onExtraCallbackWithResult r6 = im.toss.state.spec.SessionState.Companion
            im.toss.state.spec.SessionState r6 = r6.onExtraCallback()
            r6.onExtraCallbackWithResult(r7)
            r5.finish()
        L42:
            int r5 = o.nativeInvoke.readTypedObject
            int r5 = r5 + 103
            int r6 = r5 % 128
            o.nativeInvoke.extraCallbackWithResult = r6
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.nativeInvoke.onNavigationEvent(im.toss.uikit.base.UIKitBaseActivity, o.DimensionPropConverterCompanion, java.lang.Throwable):void");
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (!asInterface().onTransact()) {
            int i4 = extraCallbackWithResult + 91;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            isWifiEnabled iswifienabledAsInterface = asInterface();
            if (i5 == 0) {
                iswifienabledAsInterface.IAuthTabCallback();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!iswifienabledAsInterface.IAuthTabCallback()) {
                return false;
            }
        }
        return true;
    }

    @Deprecated
    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 29;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        setTid<Boolean> settid = onTransact;
        Object obj = Boolean.FALSE;
        Object objOnWarmupCompleted = settid.onWarmupCompleted();
        if (objOnWarmupCompleted != null) {
            obj = objOnWarmupCompleted;
        }
        Intrinsics.checkNotNullExpressionValue(obj, "");
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i4 = extraCallbackWithResult + 15;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return zBooleanValue;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                i2 = 1;
            } else {
                cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                int i6 = $11 + 45;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (IAuthTabCallbackStubProxy ^ 1094535280733222934L))), c2 >>> 5, getInterfaceDescriptor);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L))), C >>> 5, access000);
                i5 -= 40503;
                i2++;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
            int i8 = $10 + 7;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 97;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 35 / 0;
            objArr[0] = str;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 25;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getMediationProvider.Companion.onNavigationEvent().onExtraCallback(getMediationProvider.onNavigationEvent.onNavigationEvent.onNavigationEvent);
        Object[] objArr = new Object[1];
        a(new char[]{48492, 28120}, KeyEvent.normalizeMetaState(0) + 2, objArr);
        onExtraCallback(((String) objArr[0]).intern());
        int i4 = readTypedObject + 51;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        getMediationProvider.Companion.onNavigationEvent().onExtraCallback(getMediationProvider.onNavigationEvent.onExtraCallback.onWarmupCompleted);
        Object[] objArr = new Object[1];
        b((byte) ((Process.myPid() >> 22) + 75), TextUtils.getOffsetBefore("", 0) + 3, new char[]{2, 5, 13895}, objArr);
        onExtraCallback(((String) objArr[0]).intern());
        int i4 = extraCallbackWithResult + 1;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallback(String str) {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{12472, 38465, 40989, 65487, 7380, 27050, 18833, 34359, 13486, 26216, 31110, 26826}, 10 - TextUtils.lastIndexOf("", '0'), objArr);
        ConvertByteArrayToFloatArray.onWarmupCompleted(((String) objArr[0]).intern(), false, (String) null, (List) null, (Map) null, new LockScreenManager$.ExternalSyntheticLambda0(str), 30, (Object) null);
        int i2 = readTypedObject + 37;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit onNavigationEvent(String str, SetDetectableSize setDetectableSize) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 67;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Map mapOnExtraCallback = setDetectableSize.onExtraCallback();
        Object[] objArr = new Object[1];
        a(new char[]{11805, 58950, 44249, 55534, 56563, 13816, 9439, 25437}, 8 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        mapOnExtraCallback.put(((String) objArr[0]).intern(), sendBroadcastWithAdObject.COMMON);
        Map mapOnExtraCallback2 = setDetectableSize.onExtraCallback();
        Object[] objArr2 = new Object[1];
        b((byte) (View.MeasureSpec.getSize(0) + 107), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 5, new char[]{3, 6, 13913, 13913, 7, 2}, objArr2);
        mapOnExtraCallback2.put(((String) objArr2[0]).intern(), str);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 69;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
        return unit;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) {
        char[] cArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr3;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr4 = access100;
        int i7 = 0;
        if (cArr4 != null) {
            int length = cArr4.length;
            char[] cArr5 = new char[length];
            for (int i8 = 0; i8 < length; i8++) {
                cArr5[i8] = PKCS58.onNavigationEvent.z(cArr4[i8]);
            }
            cArr2 = cArr5;
        } else {
            cArr2 = cArr4;
        }
        char cZ = PKCS58.onNavigationEvent.z(IAuthTabCallback_Parcel);
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            int i9 = i - 1;
            cArr6[i9] = (char) (cArr[i9] - b);
            int i10 = $11 + 57;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            i2 = i9;
        } else {
            i2 = i;
        }
        int i12 = 1;
        if (i2 > 1) {
            int i13 = $11 + 59;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
            while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                int i15 = $11 + 31;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12];
                if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                    cArr6[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + i12] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                    i3 = i12;
                    i4 = i2;
                    cArr3 = cArr6;
                    i5 = i7;
                } else {
                    i3 = i12;
                    i4 = i2;
                    char[] cArr7 = cArr6;
                    i5 = i7;
                    if (DevToolActionListViewModel$asInterface.A(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0) == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                        int i17 = $10 + 35;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        int I = s3.onExtraCallbackWithResult.I(defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, cZ, cZ, defaultGainProviderExternalSyntheticLambda0, cZ, defaultGainProviderExternalSyntheticLambda0);
                        int i19 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                        cArr3 = cArr7;
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[I];
                        cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i19];
                    } else {
                        cArr3 = cArr7;
                        if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                            int i20 = $11 + 95;
                            $10 = i20 % 128;
                            int i21 = i20 % 2;
                            defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cZ) - 1) % cZ;
                            defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cZ) - 1) % cZ;
                            int i22 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            int i23 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i22];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i23];
                        } else {
                            int i24 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cZ) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            int i25 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cZ) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr2[i24];
                            cArr3[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr2[i25];
                        }
                    }
                }
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                cArr6 = cArr3;
                i12 = i3;
                i2 = i4;
                i7 = i5;
            }
        }
        char[] cArr8 = cArr6;
        int i26 = i7;
        for (int i27 = i26; i27 < i; i27++) {
            cArr8[i27] = (char) (cArr8[i27] ^ 13722);
        }
        objArr[i26] = new String(cArr8);
    }

    public static /* synthetic */ Unit onNavigationEvent(UIKitBaseActivity uIKitBaseActivity, isJSONTypeIgnore isjsontypeignore) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onExtraCallback(362920505, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{uIKitBaseActivity, isjsontypeignore}, iOnNavigationEvent3, iOnNavigationEvent, -362920502);
    }

    public static /* synthetic */ Unit onWarmupCompleted(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion, Throwable th) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onExtraCallback(-990567189, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{uIKitBaseActivity, dimensionPropConverterCompanion, th}, iOnNavigationEvent3, iOnNavigationEvent, 990567190);
    }

    private static final Unit IAuthTabCallback(DimensionPropConverterCompanion dimensionPropConverterCompanion) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onExtraCallback(-1779995551, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{dimensionPropConverterCompanion}, iOnNavigationEvent3, iOnNavigationEvent, 1779995556);
    }

    private static final void onExtraCallback(Function1 function1, Object obj) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onExtraCallback(805287032, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, iOnNavigationEvent3, iOnNavigationEvent, -805287032);
    }

    private static final Unit onExtraCallbackWithResult(UIKitBaseActivity uIKitBaseActivity, DimensionPropConverterCompanion dimensionPropConverterCompanion, Throwable th) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return (Unit) onExtraCallback(-196279356, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{uIKitBaseActivity, dimensionPropConverterCompanion, th}, iOnNavigationEvent3, iOnNavigationEvent, 196279360);
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        onExtraCallback(-1983311788, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), iOnNavigationEvent2, new Object[]{function1, obj}, iOnNavigationEvent3, iOnNavigationEvent, 1983311790);
    }

    static void IAuthTabCallbackDefault() {
        IAuthTabCallbackStub = (char) 8387;
        access000 = (char) 5593;
        IAuthTabCallbackStubProxy = (char) 62584;
        getInterfaceDescriptor = (char) 18078;
        access100 = new char[]{64977, 64989, 64981, 64966, 64967, 64978, 64979, 64976, 64988};
        IAuthTabCallback_Parcel = (char) 51242;
    }
}
