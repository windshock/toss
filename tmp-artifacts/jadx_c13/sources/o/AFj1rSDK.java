package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tmoney.a;
import im.toss.uikit.R;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import o.AFj1rSDK;
import o.initSDK;
import o.onInstallReferrerServiceDisconnected;
import o.setCurrentIndex;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class AFj1rSDK {
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asBinder;
    private static boolean onNavigationEvent;
    private static int onTransact;
    public static final AFj1rSDK onExtraCallback = new AFj1rSDK();
    private static Function0<Boolean> asInterface = new Function0() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda7
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 23;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Boolean.valueOf(AFj1rSDK.onWarmupCompleted());
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(AFj1rSDK.onWarmupCompleted());
            int i3 = onNavigationEvent + 17;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                return boolValueOf;
            }
            obj.hashCode();
            throw null;
        }
    };
    private static Function0<Boolean> IAuthTabCallback = new Function0() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda8
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 3;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Boolean boolValueOf = Boolean.valueOf(AFj1rSDK.onExtraCallbackWithResult());
            int i4 = onExtraCallbackWithResult + 111;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return boolValueOf;
        }
    };
    private static AFj1qSDKExternalSyntheticLambda0 onExtraCallbackWithResult = AFj1qSDKExternalSyntheticLambda0.Companion.onNavigationEvent();
    public static final int onWarmupCompleted = 8;

    static final /* synthetic */ class IAuthTabCallback implements CacheControl, FunctionAdapter {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        private final /* synthetic */ Function0 onExtraCallbackWithResult;

        IAuthTabCallback(Function0 function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.onExtraCallbackWithResult = function0;
        }

        public final /* synthetic */ boolean check() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 97;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            boolean zBooleanValue = ((Boolean) this.onExtraCallbackWithResult.invoke()).booleanValue();
            int i4 = IAuthTabCallback + 67;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return zBooleanValue;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 101;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                boolean z = obj instanceof CacheControl;
                obj2.hashCode();
                throw null;
            }
            if (!(obj instanceof CacheControl) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i4 = i3 + 37;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            clearWrite<?> functionDelegate = getFunctionDelegate();
            FunctionAdapter functionAdapter = (FunctionAdapter) obj;
            if (i5 == 0) {
                return Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            }
            Intrinsics.areEqual(functionDelegate, functionAdapter.getFunctionDelegate());
            throw null;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final clearWrite<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Function0 function0 = this.onExtraCallbackWithResult;
            int i5 = i3 + 55;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return function0;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = onWarmupCompleted + 75;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 98 / 0;
            }
            return iHashCode;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String strOnNavigationEvent = onNavigationEvent(str);
        int i4 = IAuthTabCallbackStub + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
        return strOnNavigationEvent;
    }

    private static final boolean asInterface() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 11;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    private static final HttpUrl onExtraCallback(HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        int i4 = asBinder + 59;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return httpUrl;
    }

    public static /* synthetic */ OkHttpClient onExtraCallback(getPins getpins) {
        int i = 2 % 2;
        int i2 = asBinder + 35;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return onExtraCallbackWithResult(getpins);
        }
        onExtraCallbackWithResult(getpins);
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i2 | i7;
        int i9 = ~i;
        int i10 = ~((~i2) | i7);
        int i11 = i5 + i + i3 + (1977613057 * i6) + (454551927 * i4);
        int i12 = i11 * i11;
        int i13 = (1378041352 * i5) + 473956352 + (953991674 * i) + (212024839 * i8) + (i9 * (-212024839)) + ((-212024839) * i10) + (1166016512 * i3) + ((-981467136) * i6) + ((-830472192) * i4) + ((-499122176) * i12);
        int i14 = (i5 * (-1131120504)) + 246467939 + (i * (-1131119078)) + (i8 * (-713)) + (i9 * 713) + (i10 * 713) + (i3 * (-1131119791)) + (i6 * (-1039407535)) + (i4 * 1820920743) + (i12 * 1447034880);
        int i15 = i13 + (i14 * i14 * 1170210816);
        if (i15 == 1) {
            return onExtraCallback(objArr);
        }
        if (i15 == 2) {
            return onWarmupCompleted(objArr);
        }
        if (i15 == 3) {
            int i16 = 2 % 2;
            int i17 = asBinder + 113;
            IAuthTabCallbackStub = i17 % 128;
            return Boolean.valueOf(i17 % 2 == 0);
        }
        if (i15 != 4) {
            return IAuthTabCallback(objArr);
        }
        initSDK initsdk = (initSDK) objArr[0];
        int i18 = 2 % 2;
        int i19 = asBinder + 73;
        IAuthTabCallbackStub = i19 % 128;
        int i20 = i19 % 2;
        onExtraCallbackWithResult(new Object[]{initsdk}, -493472904, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 493472905, setCurrentIndex.onNavigationEvent());
        int i21 = IAuthTabCallbackStub + 103;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        return null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Ref.ObjectRef objectRef, TdsToastV1 tdsToastV1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(objectRef, tdsToastV1);
        }
        IAuthTabCallback(objectRef, tdsToastV1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ HttpUrl onExtraCallbackWithResult(HttpUrl httpUrl) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(httpUrl);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        HttpUrl httpUrlOnExtraCallback = onExtraCallback(httpUrl);
        int i3 = IAuthTabCallbackStub + 13;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return httpUrlOnExtraCallback;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            return ((Boolean) onExtraCallbackWithResult(new Object[0], -7050611, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 7050614, setCurrentIndex.onNavigationEvent())).booleanValue();
        }
        ((Boolean) onExtraCallbackWithResult(new Object[0], -7050611, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 7050614, setCurrentIndex.onNavigationEvent())).booleanValue();
        throw null;
    }

    private static final String onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        int i5 = IAuthTabCallbackStub + 1;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CharSequence onWarmupCompleted(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequenceOnExtraCallback = onExtraCallback(matchResult);
        int i4 = IAuthTabCallbackStub + 51;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return charSequenceOnExtraCallback;
    }

    public static /* synthetic */ String onWarmupCompleted(CharSequence charSequence) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGB_YVYU;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallback(charSequence);
        }
        onExtraCallback(charSequence);
        throw null;
    }

    public static /* synthetic */ boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zAsInterface = asInterface();
        if (i3 != 0) {
            int i4 = 47 / 0;
        }
        return zAsInterface;
    }

    private AFj1rSDK() {
    }

    public final Context onNavigationEvent() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Context contextIAuthTabCallbackStubProxy = getTcfVendorConsentStatus.Companion.IAuthTabCallbackStubProxy();
        int i4 = asBinder + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return contextIAuthTabCallbackStubProxy;
    }

    static {
        int i = onTransact + 9;
        IAuthTabCallbackDefault = i % 128;
        int i2 = i % 2;
    }

    public final Function0<Boolean> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 53;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        Function0<Boolean> function0 = asInterface;
        int i5 = i3 + 27;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return function0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AFj1qSDKExternalSyntheticLambda0 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        AFj1qSDKExternalSyntheticLambda0 aFj1qSDKExternalSyntheticLambda0 = onExtraCallbackWithResult;
        int i5 = i3 + 65;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return aFj1qSDKExternalSyntheticLambda0;
    }

    public static /* synthetic */ void onNavigationEvent(AFj1rSDK aFj1rSDK, Context context, Locale locale, Function1 function1, Function1 function12, Function0 function0, Function0 function02, AFj1qSDKExternalSyntheticLambda0 aFj1qSDKExternalSyntheticLambda0, getWriteSuccessCountokhttp getwritesuccesscountokhttp, newCall newcall, int i, Object obj) {
        Locale locale2;
        Function0 function03;
        AFj1qSDKExternalSyntheticLambda0 aFj1qSDKExternalSyntheticLambda02;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            locale2 = Locale.KOREA;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
        } else {
            locale2 = locale;
        }
        Function1 function13 = (i & 4) != 0 ? new Function1() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 93;
                onWarmupCompleted = i4 % 128;
                HttpUrl httpUrl = (HttpUrl) obj2;
                if (i4 % 2 != 0) {
                    return AFj1rSDK.onExtraCallbackWithResult(httpUrl);
                }
                AFj1rSDK.onExtraCallbackWithResult(httpUrl);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
        } : function1;
        Function1 function14 = (i & 8) != 0 ? new Function1() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = 2 % 2;
                int i4 = onExtraCallback + 65;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                String str = (String) AFj1rSDK.onExtraCallbackWithResult(new Object[]{(String) obj2}, -783860836, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 783860836, setCurrentIndex.onNavigationEvent());
                int i6 = onExtraCallback + 91;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 4 / 0;
                }
                return str;
            }
        } : function12;
        if ((i & 16) != 0) {
            int i3 = IAuthTabCallbackStub + 119;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            function03 = asInterface;
        } else {
            function03 = function0;
        }
        Function0 function04 = (i & 32) != 0 ? IAuthTabCallback : function02;
        if ((i & 64) != 0) {
            aFj1qSDKExternalSyntheticLambda02 = onExtraCallbackWithResult;
            int i5 = asBinder + 105;
            IAuthTabCallbackStub = i5 % 128;
            int i6 = i5 % 2;
        } else {
            aFj1qSDKExternalSyntheticLambda02 = aFj1qSDKExternalSyntheticLambda0;
        }
        aFj1rSDK.onExtraCallbackWithResult(context, locale2, function13, function14, function03, function04, aFj1qSDKExternalSyntheticLambda02, (i & 128) != 0 ? new getWriteSuccessCountokhttp((Function1) null, 1, (DefaultConstructorMarker) null) : getwritesuccesscountokhttp, (i & 256) != 0 ? new newCall((Integer) null, (Function1) null, 3, (DefaultConstructorMarker) null) : newcall);
    }

    public final void onExtraCallbackWithResult(@NotNull Context context, @NotNull Locale locale, @NotNull Function1<? super HttpUrl, HttpUrl> function1, @NotNull Function1<? super String, String> function12, @NotNull Function0<Boolean> function0, @NotNull Function0<Boolean> function02, @NotNull AFj1qSDKExternalSyntheticLambda0 aFj1qSDKExternalSyntheticLambda0, @NotNull getWriteSuccessCountokhttp getwritesuccesscountokhttp, @NotNull newCall newcall) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(locale, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(aFj1qSDKExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(getwritesuccesscountokhttp, "");
        Intrinsics.checkNotNullParameter(newcall, "");
        onNavigationEvent = true;
        asInterface = function0;
        onExtraCallbackWithResult = aFj1qSDKExternalSyntheticLambda0;
        IAuthTabCallback = function02;
        onExtraCallbackWithResult(new Object[]{this, context, locale, new getPins(function1, function12), getwritesuccesscountokhttp, newcall}, -1626375990, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1626375992, setCurrentIndex.onNavigationEvent());
        IAuthTabCallbackDefault();
        int i2 = asBinder + 123;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final OkHttpClient onExtraCallbackWithResult(getPins getpins) {
        int i = 2 % 2;
        int i2 = asBinder + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClientBuild = getpins.IAuthTabCallback().build();
        int i4 = IAuthTabCallbackStub + 11;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return okHttpClientBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onExtraCallbackWithResult implements isUserConsentSet {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static char[] onExtraCallbackWithResult = {27260, 27173, 27198, 27175};
        private static int onWarmupCompleted;
        private final String onExtraCallback;

        onExtraCallbackWithResult() throws Throwable {
            Object[] objArr = new Object[1];
            a(new int[]{0, 4, 0, 4}, true, new byte[]{1, 1, 1, 0}, objArr);
            this.onExtraCallback = ((String) objArr[0]).intern();
        }

        public void onNavigationEvent(String str, String str2, Map<String, ? extends Object> map, String str3, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 21;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onWarmupCompleted(str, str2, map, str3, z, this.onExtraCallback);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                ConvertFloatArrayToByteArray.onExtraCallbackWithResult.onWarmupCompleted(str, str2, map, str3, z, this.onExtraCallback);
                throw null;
            }
        }

        public void onNavigationEvent(String str, String str2, Throwable th, Map<String, ? extends Object> map, String str3, boolean z) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 115;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            ConvertFloatArrayToByteArray.onWarmupCompleted(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, str, str2, (Throwable) null, map, str3, this.onExtraCallback, z, 4, (Object) null);
            int i4 = IAuthTabCallback + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = onExtraCallbackWithResult;
            long j = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.resolveSizeAndState(0, 0, 0) + 35, (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 14238, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                int i7 = $11 + 109;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    } else {
                        int i10 = $10 + 9;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - MotionEvent.axisFromString(_UrlKt.FRAGMENT_ENCODE_SET)), ((byte) KeyEvent.getModifierMetaStateMask()) + 66, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr4[i11] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i12 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 66, 16718 - Color.alpha(0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i12] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 49467), TextUtils.indexOf((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET, '0', 0, 0) + 71, 12486 - (KeyEvent.getMaxKeyCode() >> 16), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i13, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i13);
            }
            if (!(!z)) {
                int i14 = $10 + 13;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                int i16 = $10 + 93;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        Context context = (Context) objArr[1];
        Locale locale = (Locale) objArr[2];
        final getPins getpins = (getPins) objArr[3];
        getWriteSuccessCountokhttp getwritesuccesscountokhttp = (getWriteSuccessCountokhttp) objArr[4];
        newCall newcall = (newCall) objArr[5];
        int i = 2 % 2;
        AppLovinPostbackListener appLovinPostbackListener = new AppLovinPostbackListener(context, locale, new writeCertList(new IAuthTabCallback(asInterface), IAuthTabCallback, new Function0() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 125;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                OkHttpClient okHttpClientOnExtraCallback = AFj1rSDK.onExtraCallback(getpins);
                int i5 = IAuthTabCallback + 39;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 49 / 0;
                }
                return okHttpClientOnExtraCallback;
            }
        }), AppLovinBidTokenCollectionListener.onWarmupCompleted(accessinit.Companion), new r8lambda8ktL7VgKDquhCIJdgkcD1wC4ukI(context), new onExtraCallbackWithResult(), onExtraCallbackWithResult.onExtraCallback(), getpins, getwritesuccesscountokhttp, newcall);
        dispatcher.onExtraCallbackWithResult.onExtraCallback(appLovinPostbackListener);
        r8lambdaXwd13T63EBu9OBtTqaV7FJQdJMw.onNavigationEvent.onExtraCallbackWithResult(appLovinPostbackListener);
        int i2 = IAuthTabCallbackStub + 25;
        asBinder = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final String onExtraCallback(CharSequence charSequence) {
        Object next;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(charSequence, "");
        String strOnNavigationEvent = ICommonParams.onNavigationEvent(charSequence);
        List listExtraCallbackWithResult = GetFeatureExtension.onWarmupCompleted.extraCallbackWithResult();
        ArrayList arrayList = new ArrayList();
        Iterator it = listExtraCallbackWithResult.iterator();
        int i2 = IAuthTabCallbackStub + 29;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = asBinder + 27;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                next = it.next();
                int i5 = 19 / 0;
                if (((Regex) next).onExtraCallback(charSequence)) {
                    arrayList.add(next);
                }
            } else {
                next = it.next();
                if (((Regex) next).onExtraCallback(charSequence)) {
                    arrayList.add(next);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            strOnNavigationEvent = ((Regex) it2.next()).onNavigationEvent(strOnNavigationEvent, new Function1() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda6
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i6 = 2 % 2;
                    int i7 = onNavigationEvent + 85;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                    CharSequence charSequenceOnWarmupCompleted = AFj1rSDK.onWarmupCompleted((MatchResult) obj);
                    int i9 = onExtraCallbackWithResult + 111;
                    onNavigationEvent = i9 % 128;
                    int i10 = i9 % 2;
                    return charSequenceOnWarmupCompleted;
                }
            });
        }
        return strOnNavigationEvent;
    }

    private static final CharSequence onExtraCallback(MatchResult matchResult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(matchResult, "");
            StringsKt__StringsJVMKt.repeat("*", matchResult.onExtraCallbackWithResult().length());
            throw null;
        }
        Intrinsics.checkNotNullParameter(matchResult, "");
        String strRepeat = StringsKt__StringsJVMKt.repeat("*", matchResult.onExtraCallbackWithResult().length());
        int i3 = IAuthTabCallbackStub + 79;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 98 / 0;
        }
        return strRepeat;
    }

    private final void IAuthTabCallbackDefault() {
        int i = 2 % 2;
        onInstallReferrerSetupFinished oninstallreferrersetupfinished = onInstallReferrerSetupFinished.onWarmupCompleted;
        oninstallreferrersetupfinished.onWarmupCompleted(GetAntispoofingExtension.onExtraCallback);
        Object[] objArr = {oninstallreferrersetupfinished, new Function1() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda0
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 125;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                String strOnWarmupCompleted = AFj1rSDK.onWarmupCompleted((CharSequence) obj);
                int i5 = onNavigationEvent + 109;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return strOnWarmupCompleted;
            }
        }};
        onInstallReferrerSetupFinished.onExtraCallback(-909280442, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 909280443, objArr, matches.onExtraCallback());
        onInstallReferrerServiceDisconnected oninstallreferrerservicedisconnected = onInstallReferrerServiceDisconnected.onExtraCallback;
        oninstallreferrerservicedisconnected.onNavigationEvent(onExtraCallbackWithResult.onExtraCallbackWithResult());
        oninstallreferrerservicedisconnected.onNavigationEvent(new onInstallReferrerServiceDisconnected.onExtraCallback() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda1
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final void inspect(initSDK initsdk) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 87;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                Object[] objArr2 = {initsdk};
                int iOnNavigationEvent = setCurrentIndex.onNavigationEvent();
                int iOnNavigationEvent2 = setCurrentIndex.onNavigationEvent();
                int iOnNavigationEvent3 = setCurrentIndex.onNavigationEvent();
                int iOnNavigationEvent4 = setCurrentIndex.onNavigationEvent();
                if (i4 != 0) {
                    AFj1rSDK.onExtraCallbackWithResult(objArr2, -816404564, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent4, 816404568, iOnNavigationEvent3);
                    obj.hashCode();
                    throw null;
                }
                AFj1rSDK.onExtraCallbackWithResult(objArr2, -816404564, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent4, 816404568, iOnNavigationEvent3);
                int i5 = onNavigationEvent + 33;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = IAuthTabCallbackStub + 105;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Type inference failed for: r12v12, types: [T, im.toss.uikit.widget.snackbar.TdsToastV1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        View viewIAuthTabCallback;
        int i;
        Pair pairIAuthTabCallback;
        initSDK initsdk = (initSDK) objArr[0];
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(initsdk, "");
        initMiniApp initminiappOnExtraCallbackWithResult = initsdk.onExtraCallbackWithResult();
        Object obj = null;
        if (initminiappOnExtraCallbackWithResult instanceof hasCrashWhenJavaCrash) {
            hasCrashWhenJavaCrash hascrashwhenjavacrashOnExtraCallbackWithResult = initsdk.onExtraCallbackWithResult();
            Intrinsics.checkNotNull(hascrashwhenjavacrashOnExtraCallbackWithResult, "");
            viewIAuthTabCallback = hascrashwhenjavacrashOnExtraCallbackWithResult.aq_();
            i = asBinder + 25;
        } else {
            if (!(initminiappOnExtraCallbackWithResult instanceof enableLoopMonitor)) {
                viewIAuthTabCallback = null;
                if (viewIAuthTabCallback != null) {
                    Context contextOnWarmupCompleted = getTcfVendorConsentStatus.Companion.onWarmupCompleted();
                    if (contextOnWarmupCompleted != null) {
                        int i3 = IAuthTabCallbackStub + 43;
                        asBinder = i3 % 128;
                        if (i3 % 2 != 0) {
                            hasVaryAll.IAuthTabCallback(contextOnWarmupCompleted);
                            obj.hashCode();
                            throw null;
                        }
                        Activity activityIAuthTabCallback = hasVaryAll.IAuthTabCallback(contextOnWarmupCompleted);
                        if (activityIAuthTabCallback != null) {
                            pairIAuthTabCallback = getWrite.IAuthTabCallback(activityIAuthTabCallback, new TdsToastV1.onNavigationEvent(activityIAuthTabCallback, "Params\n" + initsdk.onWarmupCompleted()));
                        } else {
                            pairIAuthTabCallback = null;
                        }
                    }
                } else {
                    pairIAuthTabCallback = getWrite.IAuthTabCallback(viewIAuthTabCallback.getContext(), new TdsToastV1.onNavigationEvent(viewIAuthTabCallback, "Params\n" + initsdk.onWarmupCompleted()));
                }
                if (pairIAuthTabCallback != null) {
                    Context context = (Context) pairIAuthTabCallback.onExtraCallbackWithResult();
                    TdsToastV1.onNavigationEvent onnavigationevent = (TdsToastV1.onNavigationEvent) pairIAuthTabCallback.IAuthTabCallback();
                    final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    String string = context.getString(R.string.uikit_content_desc_close);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    Object[] objArr2 = {onnavigationevent, string, new Function1() { // from class: im.toss.uikit.UIKit$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onWarmupCompleted;

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onWarmupCompleted + 27;
                            IAuthTabCallback = i5 % 128;
                            int i6 = i5 % 2;
                            Unit unitOnExtraCallbackWithResult = AFj1rSDK.onExtraCallbackWithResult(objectRef, (TdsToastV1) obj2);
                            int i7 = IAuthTabCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
                            onWarmupCompleted = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 43 / 0;
                            }
                            return unitOnExtraCallbackWithResult;
                        }
                    }};
                    int iOnWarmupCompleted = a.3.onWarmupCompleted();
                    objectRef.element = ((TdsToastV1.onNavigationEvent) TdsToastV1.onNavigationEvent.onWarmupCompleted(a.3.onWarmupCompleted(), 289755328, a.3.onWarmupCompleted(), a.3.onWarmupCompleted(), objArr2, -289755323, iOnWarmupCompleted)).IAuthTabCallback(setTagsokhttp.onExtraCallback(context, 12)).IAuthTabCallback();
                }
                return null;
            }
            enableLoopMonitor enableloopmonitorOnExtraCallbackWithResult = initsdk.onExtraCallbackWithResult();
            Intrinsics.checkNotNull(enableloopmonitorOnExtraCallbackWithResult, "");
            viewIAuthTabCallback = enableloopmonitorOnExtraCallbackWithResult.IAuthTabCallback();
            i = asBinder + Imgproc.COLOR_YUV2RGB_YVYU;
        }
        IAuthTabCallbackStub = i % 128;
        int i4 = i % 2;
        if (viewIAuthTabCallback != null) {
        }
        if (pairIAuthTabCallback != null) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[PHI: r3
      0x0027: PHI (r3v3 im.toss.uikit.widget.snackbar.TdsToastV1) = (r3v2 im.toss.uikit.widget.snackbar.TdsToastV1), (r3v9 im.toss.uikit.widget.snackbar.TdsToastV1) binds: [B:8:0x0025, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(Ref.ObjectRef objectRef, TdsToastV1 tdsToastV1) {
        TdsToastV1 tdsToastV12;
        int i = 2 % 2;
        int i2 = asBinder + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(tdsToastV1, "");
            tdsToastV12 = (TdsToastV1) objectRef.element;
            int i3 = 24 / 0;
            if (tdsToastV12 != null) {
                tdsToastV12.onExtraCallback();
                int i4 = IAuthTabCallbackStub + Imgproc.COLOR_YUV2RGBA_YVYU;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(tdsToastV1, "");
            tdsToastV12 = (TdsToastV1) objectRef.element;
            if (tdsToastV12 != null) {
            }
        }
        return Unit.INSTANCE;
    }

    public final String onExtraCallbackWithResult(int i) {
        String string;
        int i2 = 2 % 2;
        int i3 = asBinder + 31;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Resources resourcesIAuthTabCallbackDefault = getTcfVendorConsentStatus.Companion.IAuthTabCallbackDefault();
        if (resourcesIAuthTabCallbackDefault == null || (string = resourcesIAuthTabCallbackDefault.getString(i)) == null) {
            throw new IllegalStateException("resource is null");
        }
        int i5 = asBinder + 49;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final String onExtraCallback(int i, @NotNull Object... objArr) {
        String string;
        int i2 = 2 % 2;
        int i3 = asBinder + 65;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(objArr, "");
        Resources resourcesIAuthTabCallbackDefault = getTcfVendorConsentStatus.Companion.IAuthTabCallbackDefault();
        if (resourcesIAuthTabCallbackDefault == null || (string = resourcesIAuthTabCallbackDefault.getString(i, Arrays.copyOf(objArr, objArr.length))) == null) {
            throw new IllegalStateException("resource is null");
        }
        int i5 = asBinder + 115;
        IAuthTabCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public static /* synthetic */ String onExtraCallbackWithResult(String str) {
        return (String) onExtraCallbackWithResult(new Object[]{str}, -783860836, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 783860836, setCurrentIndex.onNavigationEvent());
    }

    private static final void onWarmupCompleted(initSDK initsdk) {
        onExtraCallbackWithResult(new Object[]{initsdk}, -493472904, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 493472905, setCurrentIndex.onNavigationEvent());
    }

    private final void onNavigationEvent(Context context, Locale locale, getPins getpins, getWriteSuccessCountokhttp getwritesuccesscountokhttp, newCall newcall) {
        onExtraCallbackWithResult(new Object[]{this, context, locale, getpins, getwritesuccesscountokhttp, newcall}, -1626375990, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 1626375992, setCurrentIndex.onNavigationEvent());
    }

    private static final boolean IAuthTabCallbackStub() {
        return ((Boolean) onExtraCallbackWithResult(new Object[0], -7050611, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), 7050614, setCurrentIndex.onNavigationEvent())).booleanValue();
    }
}
