package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.state.spec.SessionState;
import im.toss.tosssecurities.network.data.SecuritiesApiErrorResponse;
import im.toss.tosssecurities.network.data.SecuritiesBaseApiResponse;
import im.toss.tosssecurities.network.domain.SecuritiesApiError;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import o.AFe1hSDK;
import o.decodeIpv6;
import o.deprecated_address;
import o.getIconImageResource;
import o.onAdViewAdDisplayFailed;
import o.ycxExternalSyntheticLambda1;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFe1hSDK {
    public static final AFe1hSDK IAuthTabCallback;
    private static final Lazy IAuthTabCallbackDefault;
    private static final Set<String> IAuthTabCallbackStub;
    private static byte[] IAuthTabCallbackStubProxy;
    private static int IAuthTabCallback_Parcel;
    private static int ICustomTabsCallback;
    private static int access000;
    private static final Lazy access100;
    private static final Lazy asBinder;
    private static final Lazy asInterface;
    private static int getInterfaceDescriptor;
    private static final setRubIn<Map<String, Boolean>> onExtraCallback;
    private static final getCornerRadius<Map<String, Boolean>> onExtraCallbackWithResult;
    private static final ConcurrentHashMap<String, Boolean> onNavigationEvent;
    private static final Lazy onTransact;
    private static final ConcurrentHashMap<String, getIconImageResource<Boolean>> onWarmupCompleted;
    private static short[] writeTypedObject;
    private static final byte[] $$a = {93, -40, 95, -94};
    private static final int $$b = 143;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int readTypedObject = 1;
    private static int extraCallbackWithResult = 0;
    private static int extraCallback = 1;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 51;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnNavigationEvent = AFe1hSDK.this.onNavigationEvent((AFe1jSDKAFa1tSDK) null, this);
            if (i3 != 0) {
                int i4 = 27 / 0;
            }
            return objOnNavigationEvent;
        }
    }

    static final class onExtraCallback extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 39;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AFe1hSDK.this.onWarmupCompleted((AFe1jSDKAFa1tSDK) null, false, (access13800<? super Boolean>) this);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = AFe1hSDK.IAuthTabCallback(AFe1hSDK.this, null, false, this);
            int i4 = onExtraCallbackWithResult + 29;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[AFe1jSDK3.values().length];
            try {
                iArr[AFe1jSDK3.DeviceIdAndGa.ordinal()] = 1;
                int i = IAuthTabCallback + 5;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1jSDK3.DeviceIdOnly.ordinal()] = 2;
                int i4 = IAuthTabCallback + 51;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            onWarmupCompleted = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, byte b) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 1 - (i2 * 2);
        int i6 = (b * 2) + 115;
        int i7 = 4 - (i * 4);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i6 = i5;
            i6 += i8;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i7];
            i6 += i8;
            i7++;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    public static /* synthetic */ SessionState IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[0];
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SessionState sessionState = (SessionState) IAuthTabCallback(iOnExtraCallbackWithResult4, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, objArr, 249014936, iOnExtraCallbackWithResult, -249014936);
        int i4 = extraCallbackWithResult + 53;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return sessionState;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i4);
        int i9 = (~(i6 | i5)) | i8;
        int i10 = (~(i5 | (~i4))) | (~((~i6) | i7)) | i8;
        int i11 = i7 | i6 | i4;
        int i12 = i6 + i4 + i3 + (1050315579 * i2) + (2086215248 * i);
        int i13 = i12 * i12;
        int i14 = (i6 * (-1156115713)) + 1671168000 + ((-1156115713) * i4) + ((-1856302338) * i9) + (i10 * 1856302338) + (1856302338 * i11) + (700186624 * i3) + ((-1303117824) * i2) + (314572800 * i) + (431423488 * i13);
        int i15 = ((i6 * (-961373039)) - 1316831794) + (i4 * (-961373039)) + (i9 * (-990)) + (i10 * 990) + (i11 * 990) + (i3 * (-961372049)) + (i2 * 755842709) + (i * (-1858722640)) + (i13 * (-2040987648));
        switch (i14 + (i15 * i15 * 1361641472)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onExtraCallback(objArr);
            case 4:
                return IAuthTabCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asBinder(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(SessionState.State state) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        Unit unit = (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{state}, 1937302400, iOnExtraCallbackWithResult, -1937302399);
        int i4 = extraCallbackWithResult + 49;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getIconImageResource IAuthTabCallback(boolean z, String str, String str2) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 11;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onWarmupCompleted(z, str, str2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getIconImageResource geticonimageresourceOnWarmupCompleted = onWarmupCompleted(z, str, str2);
        int i3 = extraCallbackWithResult + 21;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return geticonimageresourceOnWarmupCompleted;
    }

    public static /* synthetic */ AFe1gSDK onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 61;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFe1gSDK aFe1gSDKExtraCallback = extraCallback();
        int i4 = extraCallback + 111;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return aFe1gSDKExtraCallback;
    }

    public static /* synthetic */ void onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 17;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(function1, obj);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ SharedPreferences onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCallback + 1;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return ICustomTabsCallback();
        }
        ICustomTabsCallback();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        deprecated_address deprecated_addressVar = (deprecated_address) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[0], 1678424630, iOnExtraCallbackWithResult4, -1678424625);
        int i3 = extraCallbackWithResult + 33;
        extraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return deprecated_addressVar;
    }

    public static /* synthetic */ getIconImageResource onNavigationEvent(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 13;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return asInterface(function1, obj);
        }
        asInterface(function1, obj);
        throw null;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 81;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        onExtraCallbackWithResult(function1, obj);
        if (i3 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallback + 39;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 59;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(ycxexternalsyntheticlambda1);
        }
        onExtraCallbackWithResult(ycxexternalsyntheticlambda1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ decodeIpv6 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        decodeIpv6 decodeipv6WriteTypedObject = writeTypedObject();
        int i4 = extraCallbackWithResult + 73;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return decodeipv6WriteTypedObject;
    }

    private AFe1hSDK() {
    }

    public static final /* synthetic */ Object IAuthTabCallback(AFe1hSDK aFe1hSDK, AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, boolean z, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 51;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return aFe1hSDK.onExtraCallbackWithResult(aFe1jSDKAFa1tSDK, z, access13800Var);
        }
        aFe1hSDK.onExtraCallbackWithResult(aFe1jSDKAFa1tSDK, z, access13800Var);
        throw null;
    }

    public static final /* synthetic */ AFe1gSDK onNavigationEvent(AFe1hSDK aFe1hSDK) {
        int i = 2 % 2;
        int i2 = extraCallback + 23;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnExtraCallbackWithResult4 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult5 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult6 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        AFe1gSDK aFe1gSDK = (AFe1gSDK) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult6, iOnExtraCallbackWithResult5, new Object[]{aFe1hSDK}, -544012975, iOnExtraCallbackWithResult4, 544012978);
        int i3 = extraCallback + 5;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 48 / 0;
        }
        return aFe1gSDK;
    }

    static {
        ICustomTabsCallback = 0;
        IAuthTabCallbackDefault();
        AFe1hSDK aFe1hSDK = new AFe1hSDK();
        IAuthTabCallback = aFe1hSDK;
        asBinder = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                SessionState sessionStateIAuthTabCallback = AFe1hSDK.IAuthTabCallback();
                int i4 = onNavigationEvent + 35;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 98 / 0;
                }
                return sessionStateIAuthTabCallback;
            }
        });
        asInterface = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda1
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 77;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return AFe1hSDK.onExtraCallback();
                }
                AFe1hSDK.onExtraCallback();
                throw null;
            }
        });
        onTransact = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                decodeIpv6 decodeipv6OnWarmupCompleted;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    decodeipv6OnWarmupCompleted = AFe1hSDK.onWarmupCompleted();
                    int i3 = 96 / 0;
                } else {
                    decodeipv6OnWarmupCompleted = AFe1hSDK.onWarmupCompleted();
                }
                int i4 = onExtraCallbackWithResult + 35;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return decodeipv6OnWarmupCompleted;
            }
        });
        access100 = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 43;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                deprecated_address deprecated_addressVar = (deprecated_address) AFe1hSDK.IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[0], -978545946, iOnExtraCallbackWithResult, 978545948);
                int i4 = onWarmupCompleted + 111;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return deprecated_addressVar;
            }
        });
        onWarmupCompleted = new ConcurrentHashMap<>();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.checkNotNullExpressionValue(keySetViewNewKeySet, "");
        IAuthTabCallbackStub = keySetViewNewKeySet;
        IAuthTabCallbackDefault = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                SharedPreferences sharedPreferencesOnExtraCallbackWithResult = AFe1hSDK.onExtraCallbackWithResult();
                int i4 = onNavigationEvent + 103;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return sharedPreferencesOnExtraCallbackWithResult;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        onNavigationEvent = new ConcurrentHashMap<>();
        getCornerRadius<Map<String, Boolean>> getcornerradiusOnNavigationEvent = setShine.onNavigationEvent(access8000.IAuthTabCallback());
        onExtraCallbackWithResult = getcornerradiusOnNavigationEvent;
        onExtraCallback = ycxycx.onExtraCallback((getCornerRadius) getcornerradiusOnNavigationEvent);
        aFe1hSDK.readTypedObject();
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingAsInterface = aFe1hSDK.IAuthTabCallbackStubProxy().onExtraCallbackWithResult(true).onWarmupCompleted(NetConverter3.onExtraCallback()).asInterface();
        final Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 67;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Unit unitOnWarmupCompleted = AFe1hSDK.onWarmupCompleted((ycxExternalSyntheticLambda1) obj);
                int i4 = onWarmupCompleted + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitOnWarmupCompleted;
            }
        };
        JsonReaderUnknownNumberParsing jsonReaderUnknownNumberParsingOnExtraCallback = jsonReaderUnknownNumberParsingAsInterface.onExtraCallback(new deserializeFloat() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 51;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {function1, obj};
                int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
                AFe1hSDK.IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, 226272535, iOnExtraCallbackWithResult, -226272528);
                int i4 = onExtraCallback + 17;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        final Function1 function12 = new Function1() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Unit unitIAuthTabCallback = AFe1hSDK.IAuthTabCallback((SessionState.State) obj);
                int i4 = onWarmupCompleted + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return unitIAuthTabCallback;
            }
        };
        jsonReaderUnknownNumberParsingOnExtraCallback.IAuthTabCallback(new deserializeFloat() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda8
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // o.deserializeFloat
            public final void accept(Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 53;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                AFe1hSDK.onExtraCallback(function12, obj);
                if (i3 == 0) {
                    int i4 = 76 / 0;
                }
            }
        });
        int i = readTypedObject + 29;
        ICustomTabsCallback = i % 128;
        int i2 = i % 2;
    }

    private final SessionState IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 79;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionState = (SessionState) asBinder.getValue();
        int i4 = extraCallback + 35;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return sessionState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 63;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        SessionState sessionStateOnExtraCallback = SessionState.Companion.onExtraCallback();
        int i4 = extraCallback + 73;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return sessionStateOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        AFe1gSDK aFe1gSDK = (AFe1gSDK) asInterface.getValue();
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return aFe1gSDK;
    }

    private static final AFe1gSDK extraCallback() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Response response = Response.onNavigationEvent;
            return ((AFe1jSDK2) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), AFe1jSDK2.class)).PredictiveBackHandlerKtExternalSyntheticLambda3();
        }
        Response response2 = Response.onNavigationEvent;
        ((AFe1jSDK2) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), AFe1jSDK2.class)).PredictiveBackHandlerKtExternalSyntheticLambda3();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final decodeIpv6 IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCallback + 53;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        decodeIpv6 decodeipv6 = (decodeIpv6) onTransact.getValue();
        if (i3 == 0) {
            return decodeipv6;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final decodeIpv6 writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 89;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        decodeIpv6 title = ((requiresTunnel) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.requiresTunnel"))).setTitle();
        int i4 = extraCallback + 105;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return title;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        deprecated_address deprecated_addressVar;
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            deprecated_addressVar = (deprecated_address) access100.getValue();
            int i3 = 16 / 0;
        } else {
            deprecated_addressVar = (deprecated_address) access100.getValue();
        }
        int i4 = extraCallbackWithResult + 1;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return deprecated_addressVar;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallback + 95;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Response response = Response.onNavigationEvent;
        deprecated_address deprecated_addressVarShow = ((deprecated_address.onWarmupCompleted) Response.onExtraCallback(UserChoiceBillingListener.onExtraCallback.onExtraCallback(), Class.forName("o.deprecated_address$onWarmupCompleted"))).show();
        int i4 = extraCallback + 81;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_addressVarShow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function1<access13800<? super Boolean>, Object> {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ String $distributionId;
        final /* synthetic */ boolean $isMemberTarget;
        int I$0;
        int I$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallbackWithResult(boolean z, String str, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(1, access13800Var);
            this.$isMemberTarget = z;
            this.$distributionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final access13800<Unit> create(access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$isMemberTarget, this.$distributionId, access13800Var);
            int i2 = onNavigationEvent + 45;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return onextracallbackwithresult;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 91;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback(access13800Var);
            int i4 = onNavigationEvent + 113;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 119;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((onExtraCallbackWithResult) create(access13800Var)).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 125;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* renamed from: o.AFe1hSDK$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final class C0013onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Boolean>>, Object> {
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ String $distributionId$inlined;
            final /* synthetic */ boolean $isMemberTarget$inlined;
            final /* synthetic */ int $retryCount;
            int I$0;
            int I$1;
            int I$10;
            int I$2;
            int I$3;
            int I$4;
            int I$5;
            int I$6;
            int I$7;
            int I$8;
            int I$9;
            long J$0;
            long J$1;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0013onExtraCallbackWithResult(int i, access13800 access13800Var, boolean z, String str) {
                super(2, access13800Var);
                this.$retryCount = i;
                this.$isMemberTarget$inlined = z;
                this.$distributionId$inlined = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                C0013onExtraCallbackWithResult c0013onExtraCallbackWithResult = new C0013onExtraCallbackWithResult(this.$retryCount, access13800Var, this.$isMemberTarget$inlined, this.$distributionId$inlined);
                int i2 = onWarmupCompleted + Imgproc.COLOR_YUV2RGBA_YVYU;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return c0013onExtraCallbackWithResult;
                }
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 57;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
                int i4 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((C0013onExtraCallbackWithResult) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 93;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 33 / 0;
                }
                return objInvokeSuspend;
            }

            /* renamed from: o.AFe1hSDK$onExtraCallbackWithResult$onExtraCallbackWithResult$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Boolean>>, Object> {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ String $distributionId$inlined;
                final /* synthetic */ boolean $isMemberTarget$inlined;
                int I$0;
                int I$1;
                int I$2;
                Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(access13800 access13800Var, boolean z, String str) {
                    super(2, access13800Var);
                    this.$isMemberTarget$inlined = z;
                    this.$distributionId$inlined = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(access13800Var, this.$isMemberTarget$inlined, this.$distributionId$inlined);
                    int i2 = onNavigationEvent + 1;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 65;
                    onNavigationEvent = i2 % 128;
                    findResAndMsg findresandmsg2 = findresandmsg;
                    access13800<? super Result<? extends Boolean>> access13800Var2 = access13800Var;
                    if (i2 % 2 != 0) {
                        return onWarmupCompleted(findresandmsg2, access13800Var2);
                    }
                    onWarmupCompleted(findresandmsg2, access13800Var2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass3) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 23;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:69)|(1:(2:9|10)(2:7|8))(7:12|13|(2:15|(2:17|21))(2:18|(2:20|21))|48|(5:50|68|(3:52|53|(1:63))(3:56|57|(1:72))|59|(2:61|62)(1:71))|66|67)|22|70|23|(7:25|40|41|48|(0)|66|67)(2:26|27)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
                
                    r7 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
                
                    throw r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
                
                    r7 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
                
                    if ((!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, java.lang.Object.class)) != false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
                
                    r1 = o.AFe1hSDK.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.AnonymousClass3.onExtraCallbackWithResult + 67;
                    o.AFe1hSDK.onExtraCallbackWithResult.C0013onExtraCallbackWithResult.AnonymousClass3.onNavigationEvent = r1 % 128;
                    r1 = r1 % 2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
                
                    if (kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, kotlin.Unit.class) != false) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
                
                    throw r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
                
                    r7 = (java.lang.Boolean) kotlin.Unit.INSTANCE;
                 */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objM31constructorimpl;
                    Throwable thM32exceptionOrNullimpl;
                    int i = 2 % 2;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i2 = this.label;
                    try {
                    } catch (WebResourceResponseModel e) {
                        Result.Companion companion = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        Result.Companion companion2 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
                    }
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion3 = Result.Companion;
                        if (!this.$isMemberTarget$inlined) {
                            AFe1gSDK aFe1gSDKOnNavigationEvent = AFe1hSDK.onNavigationEvent(AFe1hSDK.IAuthTabCallback);
                            String str = this.$distributionId$inlined;
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 2;
                            obj = aFe1gSDKOnNavigationEvent.IAuthTabCallback(str, this);
                            if (obj == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        } else {
                            AFe1gSDK aFe1gSDKOnNavigationEvent2 = AFe1hSDK.onNavigationEvent(AFe1hSDK.IAuthTabCallback);
                            String str2 = this.$distributionId$inlined;
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = aFe1gSDKOnNavigationEvent2.onExtraCallback(str2, this);
                            if (obj == objOnExtraCallback) {
                                int i3 = onNavigationEvent + 5;
                                onExtraCallbackWithResult = i3 % 128;
                                int i4 = i3 % 2;
                                return objOnExtraCallback;
                            }
                        }
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                            int i5 = onNavigationEvent + 105;
                            onExtraCallbackWithResult = i5 % 128;
                            try {
                                if (i5 % 2 != 0) {
                                    Result.Companion companion4 = Result.Companion;
                                    int i6 = 8 / 0;
                                    if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException)) {
                                        throw thM32exceptionOrNullimpl;
                                    }
                                } else {
                                    Result.Companion companion5 = Result.Companion;
                                    if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException)) {
                                        throw thM32exceptionOrNullimpl;
                                    }
                                }
                                SecuritiesApiError securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted((retrofit2.HttpException) thM32exceptionOrNullimpl);
                                if (securitiesApiErrorOnWarmupCompleted != null) {
                                    throw securitiesApiErrorOnWarmupCompleted;
                                }
                                throw thM32exceptionOrNullimpl;
                            } catch (Throwable th) {
                                Result.Companion companion6 = Result.Companion;
                                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                            }
                        }
                        return Result.IAuthTabCallback(objM31constructorimpl);
                    }
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                    if (objOnExtraCallbackWithResult == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    Boolean bool = (Boolean) objOnExtraCallbackWithResult;
                    objM31constructorimpl = Result.m31constructorimpl(bool);
                    int i7 = onExtraCallbackWithResult + 81;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                    }
                    return Result.IAuthTabCallback(objM31constructorimpl);
                }
            }

            /* renamed from: o.AFe1hSDK$onExtraCallbackWithResult$onExtraCallbackWithResult$4, reason: invalid class name */
            public static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Result<? extends Boolean>>, Object> {
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;
                final /* synthetic */ String $distributionId$inlined;
                final /* synthetic */ boolean $isMemberTarget$inlined;
                int I$0;
                int I$1;
                int I$2;
                Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass4(access13800 access13800Var, boolean z, String str) {
                    super(2, access13800Var);
                    this.$isMemberTarget$inlined = z;
                    this.$distributionId$inlined = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(access13800Var, this.$isMemberTarget$inlined, this.$distributionId$inlined);
                    int i2 = onWarmupCompleted + 25;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass4;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 31;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i4 = onNavigationEvent + 1;
                    onWarmupCompleted = i4 % 128;
                    int i5 = i4 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Result<? extends Boolean>> access13800Var) throws Exception {
                    int i = 2 % 2;
                    int i2 = onNavigationEvent + 35;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass4) create(findresandmsg, access13800Var)).invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 83;
                    onWarmupCompleted = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:67)|(2:4|(2:10|11)(2:8|9))(7:13|14|(2:16|(2:18|21))(1:19)|46|(4:65|48|49|(1:68)(2:53|(1:55)(2:56|57)))|61|(1:63)(1:64))|22|66|23|(7:25|37|38|46|(0)|61|(0)(0))(2:26|27)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
                
                    if (r7 == r1) goto L21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
                
                    r7 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
                
                    throw r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
                
                    r7 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
                
                    if ((!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.class, java.lang.Object.class)) == true) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
                
                    r7 = (java.lang.Boolean) kotlin.Unit.INSTANCE;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
                
                    throw r7;
                 */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0120 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Object objM31constructorimpl;
                    Throwable thM32exceptionOrNullimpl;
                    SecuritiesApiError securitiesApiErrorOnWarmupCompleted;
                    int i;
                    int i2 = 2 % 2;
                    int i3 = onNavigationEvent + 41;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    Object objOnExtraCallback = access14100.onExtraCallback();
                    int i5 = this.label;
                    try {
                    } catch (WebResourceResponseModel e) {
                        Result.Companion companion = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        Result.Companion companion2 = Result.Companion;
                        objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
                    }
                    if (i5 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        Result.Companion companion3 = Result.Companion;
                        if (this.$isMemberTarget$inlined) {
                            AFe1gSDK aFe1gSDKOnNavigationEvent = AFe1hSDK.onNavigationEvent(AFe1hSDK.IAuthTabCallback);
                            String str = this.$distributionId$inlined;
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 1;
                            obj = aFe1gSDKOnNavigationEvent.onExtraCallback(str, this);
                            if (obj == objOnExtraCallback) {
                                return objOnExtraCallback;
                            }
                        } else {
                            AFe1gSDK aFe1gSDKOnNavigationEvent2 = AFe1hSDK.onNavigationEvent(AFe1hSDK.IAuthTabCallback);
                            String str2 = this.$distributionId$inlined;
                            this.L$0 = access15400.onNavigationEvent(this);
                            this.L$1 = access15400.onNavigationEvent(this);
                            this.I$0 = 0;
                            this.I$1 = 0;
                            this.I$2 = 0;
                            this.label = 2;
                            obj = aFe1gSDKOnNavigationEvent2.IAuthTabCallback(str2, this);
                        }
                        thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                        if (thM32exceptionOrNullimpl != null) {
                            try {
                                Result.Companion companion4 = Result.Companion;
                                if (!(thM32exceptionOrNullimpl instanceof retrofit2.HttpException) || (securitiesApiErrorOnWarmupCompleted = SecuritiesApiErrorResponse.Companion.onWarmupCompleted((retrofit2.HttpException) thM32exceptionOrNullimpl)) == null) {
                                    throw thM32exceptionOrNullimpl;
                                }
                                int i6 = onNavigationEvent + 31;
                                onWarmupCompleted = i6 % 128;
                                if (i6 % 2 != 0) {
                                    throw null;
                                }
                                throw securitiesApiErrorOnWarmupCompleted;
                            } catch (Throwable th) {
                                Result.Companion companion5 = Result.Companion;
                                objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(th));
                            }
                        }
                        Result resultIAuthTabCallback = Result.IAuthTabCallback(objM31constructorimpl);
                        i = onWarmupCompleted + 3;
                        onNavigationEvent = i % 128;
                        if (i % 2 == 0) {
                            return resultIAuthTabCallback;
                        }
                        throw null;
                    }
                    int i7 = onWarmupCompleted + 125;
                    onNavigationEvent = i7 % 128;
                    int i8 = i7 % 2;
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                    Object objOnExtraCallbackWithResult = ((SecuritiesBaseApiResponse) obj).onExtraCallbackWithResult();
                    if (objOnExtraCallbackWithResult == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    Boolean bool = (Boolean) objOnExtraCallbackWithResult;
                    objM31constructorimpl = Result.m31constructorimpl(bool);
                    int i9 = onWarmupCompleted + 111;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    thM32exceptionOrNullimpl = Result.m32exceptionOrNullimpl(objM31constructorimpl);
                    if (thM32exceptionOrNullimpl != null) {
                    }
                    Result resultIAuthTabCallback2 = Result.IAuthTabCallback(objM31constructorimpl);
                    i = onWarmupCompleted + 3;
                    onNavigationEvent = i % 128;
                    if (i % 2 == 0) {
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:71:0x0209, code lost:
            
                if (r0 == r2) goto L72;
             */
            /* JADX WARN: Path cross not found for [B:4:0x0014, B:7:0x0020], limit reached: 94 */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e2 A[PHI: r0
              0x00e2: PHI (r0v63 java.lang.Object) = (r0v13 java.lang.Object), (r0v64 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0176 A[Catch: Exception -> 0x021b, CancellationException -> 0x0227, WebResourceResponseModel -> 0x0229, TRY_ENTER, TryCatch #7 {WebResourceResponseModel -> 0x0229, CancellationException -> 0x0227, Exception -> 0x021b, blocks: (B:40:0x00e7, B:75:0x0216, B:64:0x0176, B:67:0x01b4, B:69:0x01cd, B:70:0x01ce, B:74:0x020d, B:32:0x0093, B:21:0x0057, B:24:0x006a, B:25:0x006d), top: B:95:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01cd A[Catch: Exception -> 0x021b, CancellationException -> 0x0227, WebResourceResponseModel -> 0x0229, TryCatch #7 {WebResourceResponseModel -> 0x0229, CancellationException -> 0x0227, Exception -> 0x021b, blocks: (B:40:0x00e7, B:75:0x0216, B:64:0x0176, B:67:0x01b4, B:69:0x01cd, B:70:0x01ce, B:74:0x020d, B:32:0x0093, B:21:0x0057, B:24:0x006a, B:25:0x006d), top: B:95:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x01ce A[Catch: Exception -> 0x021b, CancellationException -> 0x0227, WebResourceResponseModel -> 0x0229, TryCatch #7 {WebResourceResponseModel -> 0x0229, CancellationException -> 0x0227, Exception -> 0x021b, blocks: (B:40:0x00e7, B:75:0x0216, B:64:0x0176, B:67:0x01b4, B:69:0x01cd, B:70:0x01ce, B:74:0x020d, B:32:0x0093, B:21:0x0057, B:24:0x006a, B:25:0x006d), top: B:95:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:93:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r0 r7
              0x0028: PHI (r0v14 java.lang.Object) = (r0v13 java.lang.Object), (r0v64 java.lang.Object) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
              0x0028: PHI (r7v1 int) = (r7v0 int), (r7v16 int) binds: [B:8:0x0026, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Exception {
                Object objM31constructorimpl;
                Object objOnExtraCallback;
                int i;
                Object obj2;
                int i2;
                int i3;
                int i4;
                int i5;
                long j;
                int i6;
                int i7;
                long j2;
                int i8;
                int i9;
                int i10;
                C0013onExtraCallbackWithResult c0013onExtraCallbackWithResult;
                access13800 access13800Var;
                Object objOnExtraCallback2;
                Object objOnExtraCallback3;
                int i11;
                int i12;
                Object obj3;
                long j3;
                int i13;
                int i14;
                long j4;
                int i15;
                int i16;
                access13800 access13800Var2;
                int i17;
                int i18;
                Exception e;
                Object objOnNavigationEvent;
                Object obj4;
                Object obj5;
                int i19 = 2 % 2;
                int i20 = onWarmupCompleted + 109;
                onExtraCallbackWithResult = i20 % 128;
                try {
                } catch (WebResourceResponseModel e2) {
                    Result.Companion companion = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e2));
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    Result.Companion companion2 = Result.Companion;
                    objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e4));
                }
                if (i20 % 2 != 0) {
                    objOnExtraCallback = access14100.onExtraCallback();
                    i = this.label;
                    if (i != 0) {
                    }
                    if (i11 < i5) {
                    }
                    return obj5;
                }
                objOnExtraCallback = access14100.onExtraCallback();
                i = this.label;
                int i21 = 61 / 0;
                if (i != 0) {
                    int i22 = i;
                    obj2 = objOnExtraCallback;
                    if (i22 == 1) {
                        i2 = this.I$8;
                        i3 = this.I$7;
                        i4 = this.I$6;
                        i5 = this.I$5;
                        j = this.J$1;
                        i6 = this.I$4;
                        i7 = this.I$3;
                        j2 = this.J$0;
                        i8 = this.I$2;
                        i9 = this.I$1;
                        i10 = this.I$0;
                        c0013onExtraCallbackWithResult = (C0013onExtraCallbackWithResult) this.L$1;
                        access13800Var = (access13800) this.L$0;
                        try {
                            ResultKt.onNavigationEvent(obj);
                            objOnExtraCallback2 = obj;
                        } catch (Exception e5) {
                            e = e5;
                            i12 = i2;
                            i18 = i10;
                            i17 = i3;
                            long j5 = j;
                            i15 = i5;
                            access13800Var2 = access13800Var;
                            obj3 = obj2;
                            i16 = i8;
                            j3 = j2;
                            i13 = i7;
                            i14 = i6;
                            j4 = j5;
                            if (!(e instanceof b4)) {
                                throw e;
                            }
                            this.L$0 = access15400.onNavigationEvent(access13800Var2);
                            this.L$1 = access15400.onNavigationEvent(c0013onExtraCallbackWithResult);
                            this.L$2 = null;
                            this.I$0 = i18;
                            this.I$1 = i9;
                            this.I$2 = i16;
                            this.J$0 = j3;
                            this.I$3 = i13;
                            this.I$4 = i14;
                            this.J$1 = j4;
                            this.I$5 = i15;
                            this.I$6 = i4;
                            this.I$7 = i17;
                            this.I$8 = i12;
                            this.label = 2;
                            Object obj6 = obj3;
                            if (formatMsgs.onWarmupCompleted(j4, this) == obj6) {
                                return obj6;
                            }
                            access13800Var = access13800Var2;
                            i5 = i15;
                            int i23 = i18;
                            int i24 = i9;
                            int i25 = i16;
                            obj2 = obj6;
                            i6 = i14 + 1;
                            i7 = i13;
                            j2 = j3;
                            i8 = i25;
                            i9 = i24;
                            j = (long) (j4 * r8 * 1.5d);
                            i10 = i23;
                            i11 = i4 + 1;
                            if (i11 < i5) {
                            }
                            return obj5;
                        }
                        objOnNavigationEvent = ((Result) objOnExtraCallback2).onNavigationEvent();
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                        objM31constructorimpl = Result.m31constructorimpl(objOnNavigationEvent);
                        return Result.IAuthTabCallback(objM31constructorimpl);
                    }
                    int i26 = onExtraCallbackWithResult;
                    int i27 = i26 + 97;
                    onWarmupCompleted = i27 % 128;
                    if (i27 % 2 == 0 ? i22 != 2 : i22 != 4) {
                        if (i22 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i28 = i26 + 73;
                        onWarmupCompleted = i28 % 128;
                        if (i28 % 2 != 0) {
                            ResultKt.onNavigationEvent(obj);
                            throw null;
                        }
                        ResultKt.onNavigationEvent(obj);
                        objOnExtraCallback3 = obj;
                        objOnNavigationEvent = ((Result) objOnExtraCallback3).onNavigationEvent();
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                        objM31constructorimpl = Result.m31constructorimpl(objOnNavigationEvent);
                        return Result.IAuthTabCallback(objM31constructorimpl);
                    }
                    int i29 = this.I$6;
                    int i30 = this.I$5;
                    long j6 = this.J$1;
                    int i31 = this.I$4;
                    int i32 = this.I$3;
                    long j7 = this.J$0;
                    int i33 = this.I$2;
                    int i34 = this.I$1;
                    int i35 = this.I$0;
                    C0013onExtraCallbackWithResult c0013onExtraCallbackWithResult2 = (C0013onExtraCallbackWithResult) this.L$1;
                    access13800 access13800Var3 = (access13800) this.L$0;
                    ResultKt.onNavigationEvent(obj);
                    c0013onExtraCallbackWithResult = c0013onExtraCallbackWithResult2;
                    access13800Var = access13800Var3;
                    i5 = i30;
                    i6 = i31 + 1;
                    i7 = i32;
                    j2 = j7;
                    i8 = i33;
                    i9 = i34;
                    j = (long) (j6 * r8 * 1.5d);
                    i10 = i35;
                    i11 = i29 + 1;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    int i36 = this.$retryCount;
                    Result.Companion companion3 = Result.Companion;
                    obj2 = objOnExtraCallback;
                    c0013onExtraCallbackWithResult = this;
                    access13800Var = c0013onExtraCallbackWithResult;
                    i8 = i36;
                    i5 = i36 - 1;
                    j = 500;
                    j2 = 500;
                    i11 = 0;
                    i10 = 0;
                    i6 = 0;
                    i7 = 0;
                    i9 = 0;
                }
                if (i11 < i5) {
                    try {
                    } catch (Exception e6) {
                        e = e6;
                        obj4 = obj2;
                    }
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    Object obj7 = obj2;
                    try {
                    } catch (Exception e7) {
                        e = e7;
                        obj4 = obj7;
                    }
                    int i37 = i11;
                    try {
                    } catch (Exception e8) {
                        e = e8;
                        obj4 = obj7;
                        i11 = i37;
                        i4 = i11;
                        i16 = i8;
                        i12 = 0;
                        j3 = j2;
                        i13 = i7;
                        i14 = i6;
                        j4 = j;
                        i15 = i5;
                        access13800Var2 = access13800Var;
                        obj3 = obj4;
                        i18 = i10;
                        i17 = i4;
                        if (!(e instanceof b4)) {
                        }
                    }
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(null, this.$isMemberTarget$inlined, this.$distributionId$inlined);
                    this.L$0 = access15400.onNavigationEvent(access13800Var);
                    this.L$1 = access15400.onNavigationEvent(c0013onExtraCallbackWithResult);
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.I$0 = i10;
                    this.I$1 = i9;
                    this.I$2 = i8;
                    this.J$0 = j2;
                    this.I$3 = i7;
                    this.I$4 = i6;
                    this.J$1 = j;
                    this.I$5 = i5;
                    i3 = i37;
                    this.I$6 = i3;
                    this.I$7 = i3;
                    this.I$8 = 0;
                    this.I$9 = 0;
                    this.I$10 = 0;
                    this.label = 1;
                    objOnExtraCallback2 = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, anonymousClass3, this);
                    obj5 = obj7;
                    if (objOnExtraCallback2 != obj5) {
                        obj2 = obj5;
                        i4 = i3;
                        i2 = 0;
                        objOnNavigationEvent = ((Result) objOnExtraCallback2).onNavigationEvent();
                        ResultKt.onNavigationEvent(objOnNavigationEvent);
                        objM31constructorimpl = Result.m31constructorimpl(objOnNavigationEvent);
                        return Result.IAuthTabCallback(objM31constructorimpl);
                    }
                } else {
                    obj5 = obj2;
                    GeckoHubImp geckoHubImpIAuthTabCallback2 = putChannelInfo.IAuthTabCallback();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(null, this.$isMemberTarget$inlined, this.$distributionId$inlined);
                    this.L$0 = access15400.onNavigationEvent(access13800Var);
                    this.L$1 = access15400.onNavigationEvent(c0013onExtraCallbackWithResult);
                    this.L$2 = access15400.onNavigationEvent(this);
                    this.I$0 = i10;
                    this.I$1 = i9;
                    this.I$2 = i8;
                    this.J$0 = j2;
                    this.I$3 = i7;
                    this.I$4 = i6;
                    this.J$1 = j;
                    this.I$5 = 0;
                    this.I$6 = 0;
                    this.label = 3;
                    objOnExtraCallback3 = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback2, anonymousClass4, this);
                }
                return obj5;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[PHI: r1
          0x0032: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v3 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objOnExtraCallback;
            int i;
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 97;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                objOnExtraCallback = access14100.onExtraCallback();
                i = this.label;
                int i4 = 28 / 0;
                if (i == 0) {
                    ResultKt.onNavigationEvent(obj);
                    boolean z = this.$isMemberTarget;
                    String str = this.$distributionId;
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    C0013onExtraCallbackWithResult c0013onExtraCallbackWithResult = new C0013onExtraCallbackWithResult(2, null, z, str);
                    this.I$0 = 2;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, c0013onExtraCallbackWithResult, this);
                    if (obj == objOnExtraCallback) {
                        return objOnExtraCallback;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.onNavigationEvent(obj);
                }
            } else {
                objOnExtraCallback = access14100.onExtraCallback();
                i = this.label;
                if (i != 0) {
                }
            }
            Object objOnNavigationEvent = ((Result) obj).onNavigationEvent();
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            int i5 = onNavigationEvent + 9;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnNavigationEvent;
        }
    }

    private final SharedPreferences IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 9;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Object value = IAuthTabCallbackDefault.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            return (SharedPreferences) value;
        }
        Object value2 = IAuthTabCallbackDefault.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        int i3 = 28 / 0;
        return (SharedPreferences) value2;
    }

    private static final SharedPreferences ICustomTabsCallback() {
        Context contextOnExtraCallback;
        int i;
        int i2 = 2 % 2;
        int i3 = extraCallback + 37;
        extraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            i = 1;
        } else {
            contextOnExtraCallback = UserChoiceBillingListener.onExtraCallback.onExtraCallback();
            i = 0;
        }
        SharedPreferences sharedPreferences = contextOnExtraCallback.getSharedPreferences("toss_sec_tuba_distribution_devtool", i);
        int i4 = extraCallbackWithResult + 37;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferences;
    }

    public final setRubIn<Map<String, Boolean>> asBinder() {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 17;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        setRubIn<Map<String, Boolean>> setrubin = onExtraCallback;
        int i5 = i2 + 101;
        extraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return setrubin;
    }

    private static final Unit onExtraCallbackWithResult(ycxExternalSyntheticLambda1 ycxexternalsyntheticlambda1) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 77;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {IAuthTabCallback};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr, -82513672, iOnExtraCallbackWithResult, 82513678);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallback + 29;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 95;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i4 = extraCallbackWithResult + 17;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 25;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = {IAuthTabCallback};
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, objArr2, -82513672, iOnExtraCallbackWithResult, 82513678);
        Unit unit = Unit.INSTANCE;
        int i4 = extraCallbackWithResult + 63;
        extraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static final void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void readTypedObject() {
        int i = 2 % 2;
        int i2 = extraCallback + 85;
        extraCallbackWithResult = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Map<String, ?> all = IAuthTabCallbackStub().getAll();
            Intrinsics.checkNotNull(all);
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Intrinsics.checkNotNull(key);
                if (StringsKt__StringsJVMKt.startsWith$default(key, "override_", false, 2, null) && (value instanceof Boolean)) {
                    onNavigationEvent.put(StringsKt__StringsKt.removePrefix(key, (CharSequence) "override_"), value);
                    int i3 = extraCallback + 67;
                    extraCallbackWithResult = i3 % 128;
                    int i4 = i3 % 2;
                }
            }
            asInterface();
            return;
        }
        Map<String, ?> all2 = IAuthTabCallbackStub().getAll();
        Intrinsics.checkNotNull(all2);
        all2.entrySet().iterator();
        obj.hashCode();
        throw null;
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = extraCallback + 41;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult.onWarmupCompleted(access8000.getInterfaceDescriptor(onNavigationEvent));
        int i4 = extraCallback + 97;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCallback + 69;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            onWarmupCompleted.clear();
            IAuthTabCallbackStub.clear();
            int i3 = 22 / 0;
        } else {
            onWarmupCompleted.clear();
            IAuthTabCallbackStub.clear();
        }
        int i4 = extraCallbackWithResult + 59;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 97 / 0;
        }
        return null;
    }

    public final void onExtraCallbackWithResult(@NotNull AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, boolean z) {
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 53;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFe1jSDKAFa1tSDK, "");
        onExtraCallbackWithResult(aFe1jSDKAFa1tSDK.getDistributionId(), z);
        int i4 = extraCallbackWithResult + 115;
        extraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull String str, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent.put(str, Boolean.valueOf(z));
        IAuthTabCallbackStub().edit().putBoolean("override_" + str, z).commit();
        onWarmupCompleted.remove(str);
        asInterface();
        int i2 = extraCallback + 59;
        extraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 77 / 0;
        }
    }

    static /* synthetic */ Object onWarmupCompleted(AFe1hSDK aFe1hSDK, AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, boolean z, access13800 access13800Var, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallback + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 2) != 0) {
            z = false;
        }
        Object objOnExtraCallbackWithResult = aFe1hSDK.onExtraCallbackWithResult(aFe1jSDKAFa1tSDK, z, access13800Var);
        int i5 = extraCallbackWithResult + 79;
        extraCallback = i5 % 128;
        int i6 = i5 % 2;
        return objOnExtraCallbackWithResult;
    }

    private static final getIconImageResource asInterface(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = extraCallback + 35;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        getIconImageResource geticonimageresource = (getIconImageResource) function1.invoke(obj);
        int i4 = extraCallback + 91;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return geticonimageresource;
    }

    private static final getIconImageResource onWarmupCompleted(boolean z, String str, String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        getIconImageResource geticonimageresourceIAuthTabCallback = getIconImageResource.onExtraCallback.IAuthTabCallback(getIconImageResource.Companion, "securitiesTubaApi", new onExtraCallbackWithResult(z, str, null), (Object) null, (setLogBuffers) null, 12, (Object) null);
        int i2 = extraCallbackWithResult + 125;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        return geticonimageresourceIAuthTabCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[PHI: r4 r7
      0x003a: PHI (r4v8 o.AFe1hSDK$onNavigationEvent) = (r4v7 o.AFe1hSDK$onNavigationEvent), (r4v10 o.AFe1hSDK$onNavigationEvent) binds: [B:12:0x0038, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r7v21 int) = (r7v20 int), (r7v23 int) binds: [B:12:0x0038, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0174  */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onExtraCallbackWithResult(AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, boolean z, access13800<? super Boolean> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        final String distributionId;
        AFe1jSDK3 target;
        AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK2;
        String str;
        AFe1jSDK3 aFe1jSDK3;
        String str2;
        Object objOnExtraCallback;
        int i;
        boolean z2 = z;
        int i2 = 2 % 2;
        int i3 = extraCallback;
        int i4 = i3 + 75;
        extraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z3 = access13800Var instanceof onNavigationEvent;
            throw null;
        }
        final ?? IsMember = 0;
        if (access13800Var instanceof onNavigationEvent) {
            int i5 = i3 + 29;
            extraCallbackWithResult = i5 % 128;
            if (i5 % 2 != 0) {
                onnavigationevent = (onNavigationEvent) access13800Var;
                i = onnavigationevent.label;
                int i6 = 52 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    onnavigationevent.label = i - 2147483648;
                    int i7 = extraCallbackWithResult + 13;
                    extraCallback = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    onnavigationevent = new onNavigationEvent(access13800Var);
                }
            } else {
                onnavigationevent = (onNavigationEvent) access13800Var;
                i = onnavigationevent.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object obj = onnavigationevent.result;
        Object objOnExtraCallback2 = access14100.onExtraCallback();
        int i9 = onnavigationevent.label;
        try {
            if (i9 == 0) {
                ResultKt.onNavigationEvent(obj);
                distributionId = aFe1jSDKAFa1tSDK.getDistributionId();
                Boolean bool = onNavigationEvent.get(distributionId);
                if (bool != null) {
                    return access14000.onNavigationEvent(bool.booleanValue());
                }
                if (!z2) {
                    int i10 = extraCallback + 41;
                    extraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    if (access000() && IAuthTabCallbackStub.contains(distributionId)) {
                        return access14000.onNavigationEvent(false);
                    }
                }
                target = aFe1jSDKAFa1tSDK.getTarget();
                int i12 = onWarmupCompleted.onWarmupCompleted[target.ordinal()];
                if (i12 == 1) {
                    decodeIpv6 decodeipv6IAuthTabCallback_Parcel = IAuthTabCallback_Parcel();
                    String str3 = "TubaDistribution/" + distributionId;
                    onnavigationevent.L$0 = access15400.onNavigationEvent(aFe1jSDKAFa1tSDK);
                    onnavigationevent.L$1 = distributionId;
                    onnavigationevent.L$2 = access15400.onNavigationEvent(target);
                    onnavigationevent.Z$0 = z2;
                    onnavigationevent.label = 1;
                    if (decodeIpv6.onExtraCallbackWithResult(decodeipv6IAuthTabCallback_Parcel, false, str3, onnavigationevent, 1, (Object) null) != objOnExtraCallback2) {
                        aFe1jSDKAFa1tSDK2 = aFe1jSDKAFa1tSDK;
                        str = distributionId;
                        aFe1jSDK3 = target;
                    }
                    return objOnExtraCallback2;
                }
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                aFe1jSDKAFa1tSDK2 = aFe1jSDKAFa1tSDK;
                ConcurrentHashMap<String, getIconImageResource<Boolean>> concurrentHashMap = onWarmupCompleted;
                final Function1 function1 = new Function1() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda9
                    private static int onExtraCallbackWithResult = 1;
                    private static int onWarmupCompleted;

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallbackWithResult + 111;
                        onWarmupCompleted = i14 % 128;
                        if (i14 % 2 != 0) {
                            AFe1hSDK.IAuthTabCallback(IsMember, distributionId, (String) obj2);
                            throw null;
                        }
                        getIconImageResource geticonimageresourceIAuthTabCallback = AFe1hSDK.IAuthTabCallback(IsMember, distributionId, (String) obj2);
                        int i15 = onExtraCallbackWithResult + 101;
                        onWarmupCompleted = i15 % 128;
                        int i16 = i15 % 2;
                        return geticonimageresourceIAuthTabCallback;
                    }
                };
                getIconImageResource<Boolean> geticonimageresourceComputeIfAbsent = concurrentHashMap.computeIfAbsent(distributionId, new Function() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda10
                    private static int onExtraCallback = 0;
                    private static int onWarmupCompleted = 1;

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        int i13 = 2 % 2;
                        int i14 = onExtraCallback + 1;
                        onWarmupCompleted = i14 % 128;
                        int i15 = i14 % 2;
                        Function1 function12 = function1;
                        if (i15 != 0) {
                            return AFe1hSDK.onNavigationEvent(function12, obj2);
                        }
                        AFe1hSDK.onNavigationEvent(function12, obj2);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                onnavigationevent.L$0 = access15400.onNavigationEvent(aFe1jSDKAFa1tSDK2);
                onnavigationevent.L$1 = distributionId;
                onnavigationevent.L$2 = access15400.onNavigationEvent(target);
                onnavigationevent.Z$0 = z2;
                onnavigationevent.I$0 = IsMember;
                onnavigationevent.label = 2;
                objOnExtraCallback = geticonimageresourceComputeIfAbsent.onExtraCallback(z2, onnavigationevent);
                if (objOnExtraCallback != objOnExtraCallback2) {
                    str2 = distributionId;
                    obj = objOnExtraCallback;
                    return access14000.onNavigationEvent(((Boolean) obj).booleanValue());
                }
                return objOnExtraCallback2;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) onnavigationevent.L$1;
                try {
                    ResultKt.onNavigationEvent(obj);
                    return access14000.onNavigationEvent(((Boolean) obj).booleanValue());
                } catch (Throwable th) {
                    th = th;
                    if (access000()) {
                        onExtraCallbackWithResult(str2);
                        onWarmupCompleted.remove(str2);
                    }
                    throw th;
                }
            }
            z2 = onnavigationevent.Z$0;
            aFe1jSDK3 = (AFe1jSDK3) onnavigationevent.L$2;
            str = (String) onnavigationevent.L$1;
            aFe1jSDKAFa1tSDK2 = (AFe1jSDKAFa1tSDK) onnavigationevent.L$0;
            ResultKt.onNavigationEvent(obj);
            ConcurrentHashMap<String, getIconImageResource<Boolean>> concurrentHashMap2 = onWarmupCompleted;
            final Function1 function12 = new Function1() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda9
                private static int onExtraCallbackWithResult = 1;
                private static int onWarmupCompleted;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallbackWithResult + 111;
                    onWarmupCompleted = i14 % 128;
                    if (i14 % 2 != 0) {
                        AFe1hSDK.IAuthTabCallback(IsMember, distributionId, (String) obj2);
                        throw null;
                    }
                    getIconImageResource geticonimageresourceIAuthTabCallback = AFe1hSDK.IAuthTabCallback(IsMember, distributionId, (String) obj2);
                    int i15 = onExtraCallbackWithResult + 101;
                    onWarmupCompleted = i15 % 128;
                    int i16 = i15 % 2;
                    return geticonimageresourceIAuthTabCallback;
                }
            };
            getIconImageResource<Boolean> geticonimageresourceComputeIfAbsent2 = concurrentHashMap2.computeIfAbsent(distributionId, new Function() { // from class: im.toss.tosssecurities.tuba.distribution.TossSecTubaDistribution$$ExternalSyntheticLambda10
                private static int onExtraCallback = 0;
                private static int onWarmupCompleted = 1;

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    int i13 = 2 % 2;
                    int i14 = onExtraCallback + 1;
                    onWarmupCompleted = i14 % 128;
                    int i15 = i14 % 2;
                    Function1 function122 = function12;
                    if (i15 != 0) {
                        return AFe1hSDK.onNavigationEvent(function122, obj2);
                    }
                    AFe1hSDK.onNavigationEvent(function122, obj2);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            });
            onnavigationevent.L$0 = access15400.onNavigationEvent(aFe1jSDKAFa1tSDK2);
            onnavigationevent.L$1 = distributionId;
            onnavigationevent.L$2 = access15400.onNavigationEvent(target);
            onnavigationevent.Z$0 = z2;
            onnavigationevent.I$0 = IsMember;
            onnavigationevent.label = 2;
            objOnExtraCallback = geticonimageresourceComputeIfAbsent2.onExtraCallback(z2, onnavigationevent);
            if (objOnExtraCallback != objOnExtraCallback2) {
            }
            return objOnExtraCallback2;
        } catch (Throwable th2) {
            th = th2;
            str2 = distributionId;
            if (access000() && !(!AFe1jSDKAFa1vSDK.IAuthTabCallback(th))) {
                onExtraCallbackWithResult(str2);
                onWarmupCompleted.remove(str2);
            }
            throw th;
        }
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        target = aFe1jSDK3;
        IsMember = ((TlsVersion) ((deprecated_address) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, new Object[]{this}, 1422882921, iOnExtraCallbackWithResult, -1422882917)).getInterfaceDescriptor().IAuthTabCallback()).onExtraCallback().isMember();
        distributionId = str;
    }

    private final void onExtraCallbackWithResult(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 57;
        extraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!IAuthTabCallbackStub.add(str)) {
            int i4 = extraCallbackWithResult + 113;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        AFd1iSDKAFa1zSDK aFd1iSDKAFa1zSDK = AFd1iSDKAFa1zSDK.onNavigationEvent;
        Object[] objArr = new Object[1];
        a((short) Color.alpha(0), (byte) TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET), (-814863302) - TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0), (-1459635372) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) - 78, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), "distribution");
        Object[] objArr2 = new Object[1];
        a((short) KeyEvent.keyCodeFromString(_UrlKt.FRAGMENT_ENCODE_SET), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 814863289, (-1459635383) - View.MeasureSpec.makeMeasureSpec(0, 0), (-88) - Color.blue(0), objArr2);
        Map mapIAuthTabCallbackStub = access8000.IAuthTabCallbackStub(pairIAuthTabCallback, getWrite.IAuthTabCallback(((String) objArr2[0]).intern(), str));
        Object[] objArr3 = new Object[1];
        a((short) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-814863288) - ImageFormat.getBitsPerPixel(0), (-1459635374) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-73) - TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0), objArr3);
        AFd1iSDKAFa1zSDK.onExtraCallback(aFd1iSDKAFa1zSDK, ((String) objArr3[0]).intern(), (String) null, mapIAuthTabCallbackStub, false, (String) null, 26, (Object) null);
    }

    private final boolean access000() {
        boolean zOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            zOnWarmupCompleted = newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4261);
            int i3 = 55 / 0;
        } else {
            zOnWarmupCompleted = newKnownLengthSink.Companion.onWarmupCompleted(Http1ExchangeCodecAbstractSource.SEAND_4261);
        }
        int i4 = extraCallback + 55;
        extraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4;
        boolean z;
        char c;
        int length;
        byte[] bArr;
        int i5 = 2;
        int i6 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getInterfaceDescriptor)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43423), (ViewConfiguration.getTapTimeout() >> 16) + 42, 22439 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                byte[] bArr2 = IAuthTabCallbackStubProxy;
                if (bArr2 != null) {
                    int i7 = $11 + 1;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i8 = 0;
                    while (i8 < length) {
                        int i9 = $11 + 17;
                        $10 = i9 % 128;
                        if (i9 % i5 != 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 12843), 55 - View.resolveSize(0, 0), Color.red(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i8])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                            if (objOnExtraCallback3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12843), 55 - (Process.myTid() >> 22), 2166 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET), -299036574, false, $$c(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr[i8] = ((Byte) ((Method) objOnExtraCallback3).invoke(null, objArr4)).byteValue();
                            i8++;
                        }
                        i5 = 2;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = IAuthTabCallbackStubProxy;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(access000)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - Color.red(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, 22439 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                    j = -4629411779493505016L;
                } else {
                    j = -4629411779493505016L;
                    iIntValue = (short) (((short) (writeTypedObject[i + ((int) (access000 ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (getInterfaceDescriptor ^ (-4629411779493505016L))));
                }
            } else {
                j = -4629411779493505016L;
            }
            if (iIntValue > 0) {
                int i10 = ((i + iIntValue) - 2) + ((int) (access000 ^ j));
                if (z2) {
                    int i11 = $10 + 99;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i10 + i4;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback_Parcel), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.getDefaultSize(0, 0) + 86, (ViewConfiguration.getJumpTapTimeout() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = IAuthTabCallbackStubProxy;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $11 + 63;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            bArr5[i13] = (byte) (bArr4[i13] - 4629411779493505016L);
                            i13 >>>= 1;
                        } else {
                            bArr5[i13] = (byte) (bArr4[i13] ^ (-4629411779493505016L));
                            i13++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $10 + 93;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (z) {
                        int i17 = $11 + 15;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            byte[] bArr6 = IAuthTabCallbackStubProxy;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback << (((byte) (((byte) (bArr6[r8] & (-4629411779493505016L))) >>> s)) ^ b));
                        } else {
                            byte[] bArr7 = IAuthTabCallbackStubProxy;
                            trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                            c = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                        }
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = c;
                    } else {
                        short[] sArr = writeTypedObject;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNavigationEvent(@NotNull AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, @NotNull access13800<? super Boolean> access13800Var) throws Throwable {
        IAuthTabCallback iAuthTabCallback;
        Object objM31constructorimpl;
        int i = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            iAuthTabCallback = (IAuthTabCallback) access13800Var;
            int i2 = iAuthTabCallback.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = extraCallback + 33;
                extraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                iAuthTabCallback.label = i2 - 2147483648;
            } else {
                iAuthTabCallback = new IAuthTabCallback(access13800Var);
                int i5 = extraCallback + 41;
                extraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
        Object objOnWarmupCompleted = iAuthTabCallback2.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i7 = iAuthTabCallback2.label;
        try {
            if (i7 == 0) {
                ResultKt.onNavigationEvent(objOnWarmupCompleted);
                Result.Companion companion = Result.Companion;
                AFe1hSDK aFe1hSDK = IAuthTabCallback;
                iAuthTabCallback2.L$0 = access15400.onNavigationEvent(aFe1jSDKAFa1tSDK);
                iAuthTabCallback2.L$1 = access15400.onNavigationEvent(iAuthTabCallback2);
                iAuthTabCallback2.I$0 = 0;
                iAuthTabCallback2.I$1 = 0;
                iAuthTabCallback2.label = 1;
                objOnWarmupCompleted = onWarmupCompleted(aFe1hSDK, aFe1jSDKAFa1tSDK, false, iAuthTabCallback2, 2, null);
                if (objOnWarmupCompleted == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = extraCallbackWithResult + 19;
                extraCallback = i8 % 128;
                if (i8 % 2 == 0) {
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                    int i9 = 74 / 0;
                } else {
                    ResultKt.onNavigationEvent(objOnWarmupCompleted);
                }
            }
            objM31constructorimpl = Result.m31constructorimpl(objOnWarmupCompleted);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
            int i10 = extraCallback + 113;
            extraCallbackWithResult = i10 % 128;
            int i11 = i10 % 2;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        return Result.onExtraCallback(objM31constructorimpl) ? access14000.onNavigationEvent(false) : objM31constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull AFe1jSDKAFa1tSDK aFe1jSDKAFa1tSDK, boolean z, @NotNull access13800<? super Boolean> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        Object objM31constructorimpl;
        int i = 2 % 2;
        int i2 = extraCallbackWithResult + 51;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            boolean z2 = access13800Var instanceof onExtraCallback;
            throw null;
        }
        if (access13800Var instanceof onExtraCallback) {
            onextracallback = (onExtraCallback) access13800Var;
            int i3 = onextracallback.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onextracallback.label = i3 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objIAuthTabCallback = onextracallback.result;
        Object objOnExtraCallback = access14100.onExtraCallback();
        int i4 = onextracallback.label;
        try {
            if (i4 != 0) {
                int i5 = extraCallbackWithResult + 51;
                extraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                int i6 = extraCallback + 47;
                extraCallbackWithResult = i6 % 128;
                int i7 = i6 % 2;
            } else {
                ResultKt.onNavigationEvent(objIAuthTabCallback);
                Result.Companion companion = Result.Companion;
                AFe1hSDK aFe1hSDK = IAuthTabCallback;
                onextracallback.L$0 = access15400.onNavigationEvent(aFe1jSDKAFa1tSDK);
                onextracallback.L$1 = access15400.onNavigationEvent(onextracallback);
                onextracallback.Z$0 = z;
                onextracallback.I$0 = 0;
                onextracallback.I$1 = 0;
                onextracallback.label = 1;
                objIAuthTabCallback = IAuthTabCallback(aFe1hSDK, aFe1jSDKAFa1tSDK, z, onextracallback);
                if (objIAuthTabCallback == objOnExtraCallback) {
                    return objOnExtraCallback;
                }
            }
            objM31constructorimpl = Result.m31constructorimpl(objIAuthTabCallback);
        } catch (WebResourceResponseModel e) {
            Result.Companion companion2 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e));
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Result.Companion companion3 = Result.Companion;
            objM31constructorimpl = Result.m31constructorimpl(ResultKt.createFailure(e3));
        }
        if (Result.onExtraCallback(objM31constructorimpl)) {
            objM31constructorimpl = null;
        }
        int i8 = extraCallbackWithResult + 73;
        extraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            return objM31constructorimpl;
        }
        throw null;
    }

    public static /* synthetic */ deprecated_address onNavigationEvent() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (deprecated_address) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[0], -978545946, iOnExtraCallbackWithResult, 978545948);
    }

    public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{function1, obj}, 226272535, iOnExtraCallbackWithResult, -226272528);
    }

    private static final Unit onExtraCallback(SessionState.State state) {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (Unit) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{state}, 1937302400, iOnExtraCallbackWithResult, -1937302399);
    }

    private final AFe1gSDK access100() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (AFe1gSDK) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, -544012975, iOnExtraCallbackWithResult, 544012978);
    }

    private final deprecated_address getInterfaceDescriptor() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (deprecated_address) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, 1422882921, iOnExtraCallbackWithResult, -1422882917);
    }

    private static final SessionState extraCallbackWithResult() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (SessionState) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[0], 249014936, iOnExtraCallbackWithResult, -249014936);
    }

    private static final deprecated_address onActivityResized() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        return (deprecated_address) IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[0], 1678424630, iOnExtraCallbackWithResult, -1678424625);
    }

    public final void onTransact() {
        int iOnExtraCallbackWithResult = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = onAdViewAdDisplayFailed.onExtraCallbackWithResult();
        IAuthTabCallback(onAdViewAdDisplayFailed.onExtraCallbackWithResult(), iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult2, new Object[]{this}, -82513672, iOnExtraCallbackWithResult, 82513678);
    }

    static void IAuthTabCallbackDefault() {
        access000 = -1797911603;
        getInterfaceDescriptor = -1538795437;
        IAuthTabCallback_Parcel = -213410518;
        IAuthTabCallbackStubProxy = new byte[]{-3, -1, 13, 29, -14, -15, 2, 9, -16, -1, 25, -29, 28, -14, -2, -15, 14, 1, 15, -29, 13, 9, 7, -18, 28, -14, 4, -10, -9, -27, 9, 8, 8, 8};
    }
}
