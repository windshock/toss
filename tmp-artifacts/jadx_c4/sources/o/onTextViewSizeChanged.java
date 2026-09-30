package o;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.ads.zzgc;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.compose.v0.ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0;
import im.toss.core.network.NetworkMonitor$observeNetworkStatus$1$;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.onTextViewSizeChanged;
import o.setLogBuffers;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class onTextViewSizeChanged {
    private static int $10 = 0;
    private static int $11 = 1;
    private static ConnectivityManager IAuthTabCallback = null;
    private static alignTextProgressInsideProgress IAuthTabCallbackDefault = null;
    private static Throwable IAuthTabCallbackStub = null;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 1;
    private static char access000 = 0;
    private static int access100 = 1;
    private static TelephonyManager asBinder;
    private static char asInterface;
    private static int extraCallback;
    private static char getInterfaceDescriptor;
    private static final setTid<Boolean> onExtraCallback;
    public static final onTextViewSizeChanged onExtraCallbackWithResult;
    private static boolean onNavigationEvent;
    private static final setTid<TextRoundCornerProgressBar> onTransact;
    private static Boolean onWarmupCompleted;

    static final class IAuthTabCallback extends ContinuationImpl {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        IAuthTabCallback(access13800<? super IAuthTabCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 99;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objOnWarmupCompleted = onTextViewSizeChanged.this.onWarmupCompleted((String) null, (access13800<? super Boolean>) this);
            if (i3 == 0) {
                int i4 = 79 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public static final /* synthetic */ class onWarmupCompleted {
        private static int IAuthTabCallback = 1;
        public static final /* synthetic */ int[] onExtraCallback;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[alignTextProgressOutsideProgress.values().length];
            try {
                iArr[alignTextProgressOutsideProgress.TYPE_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[alignTextProgressOutsideProgress.TYPE_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[alignTextProgressOutsideProgress.LTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[alignTextProgressOutsideProgress.TYPE_5G.ordinal()] = 4;
                int i = onWarmupCompleted + 117;
                IAuthTabCallback = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused4) {
            }
            onNavigationEvent = iArr;
            int[] iArr2 = new int[alignTextProgressInsideProgress.values().length];
            try {
                iArr2[alignTextProgressInsideProgress.WIFI.ordinal()] = 1;
                int i3 = onWarmupCompleted + 93;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[alignTextProgressInsideProgress.MOBILE.ordinal()] = 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[alignTextProgressInsideProgress.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            onExtraCallback = iArr2;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        long j;
        int i7 = i6 | i;
        int i8 = ~((~i) | i6);
        int i9 = ~i6;
        int i10 = i8 | (~(i9 | i2 | i));
        int i11 = (~(i | i9)) | i2;
        int i12 = i6 + i2 + i4 + (2127773517 * i3) + (1026174006 * i5);
        int i13 = i12 * i12;
        int i14 = (i6 * (-484454144)) + 743702528 + ((-484454144) * i2) + (i7 * (-1605095679)) + (1605095679 * i10) + ((-1605095679) * i11) + ((-2089549824) * i4) + (367263744 * i3) + ((-1434976256) * i5) + (1105526784 * i13);
        int i15 = (i6 * 21308160) + 1622758390 + (i2 * 21308160) + (i7 * 947) + (i10 * (-947)) + (i11 * 947) + (i4 * 21309107) + (i3 * 1708896471) + (i5 * 664464834) + (i13 * 287244288);
        int i16 = i14 + (i15 * i15 * 966983680);
        if (i16 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i16 == 2) {
            NetworkCapabilities networkCapabilities = (NetworkCapabilities) objArr[1];
            int i17 = 2 % 2;
            if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                int i18 = extraCallback + 73;
                ICustomTabsCallback = i18 % 128;
                int i19 = i18 % 2;
                return false;
            }
            int i20 = ICustomTabsCallback + 37;
            extraCallback = i20 % 128;
            int i21 = i20 % 2;
            return true;
        }
        if (i16 == 3) {
            return IAuthTabCallback(objArr);
        }
        if (i16 == 4) {
            return onExtraCallback(objArr);
        }
        if (i16 != 5) {
            return onWarmupCompleted(objArr);
        }
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i22 = 2 % 2;
        getByteBuffer interfaceDescriptor = onExtraCallback.asBinder().getInterfaceDescriptor();
        if (zBooleanValue) {
            int i23 = extraCallback + 81;
            ICustomTabsCallback = i23 % 128;
            int i24 = i23 % 2;
            j = 1;
        } else {
            int i25 = extraCallback + 49;
            ICustomTabsCallback = i25 % 128;
            int i26 = i25 % 2;
            j = 0;
        }
        getByteBuffer getbytebufferIAuthTabCallback = interfaceDescriptor.IAuthTabCallback(j);
        Intrinsics.checkNotNullExpressionValue(getbytebufferIAuthTabCallback, "");
        return getbytebufferIAuthTabCallback;
    }

    private onTextViewSizeChanged() {
    }

    public static final /* synthetic */ boolean IAuthTabCallback(onTextViewSizeChanged ontextviewsizechanged, NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        int i2 = extraCallback + 111;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(iOnExtraCallback, 1580864040, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{ontextviewsizechanged, networkCapabilities}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1580864038)).booleanValue();
        int i4 = extraCallback + 81;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static final /* synthetic */ void onNavigationEvent(Boolean bool) {
        int i = 2 % 2;
        int i2 = extraCallback;
        int i3 = i2 + 101;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        onWarmupCompleted = bool;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 17;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ alignTextProgressInsideProgress onWarmupCompleted(onTextViewSizeChanged ontextviewsizechanged, NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 67;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            ontextviewsizechanged.IAuthTabCallback(networkCapabilities);
            throw null;
        }
        alignTextProgressInsideProgress aligntextprogressinsideprogressIAuthTabCallback = ontextviewsizechanged.IAuthTabCallback(networkCapabilities);
        int i3 = extraCallback + 121;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 19 / 0;
        }
        return aligntextprogressinsideprogressIAuthTabCallback;
    }

    public static final /* synthetic */ setTid onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        int i3 = i2 % 128;
        extraCallback = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        setTid<TextRoundCornerProgressBar> settid = onTransact;
        int i4 = i3 + 35;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return settid;
    }

    public static final /* synthetic */ void onWarmupCompleted(alignTextProgressInsideProgress aligntextprogressinsideprogress) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        int i3 = i2 % 128;
        extraCallback = i3;
        int i4 = i2 % 2;
        IAuthTabCallbackDefault = aligntextprogressinsideprogress;
        int i5 = i3 + 39;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void onWarmupCompleted(onTextViewSizeChanged ontextviewsizechanged, boolean z, String str, Network network) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 3;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        ontextviewsizechanged.onExtraCallbackWithResult(z, str, network);
        if (i3 != 0) {
            throw null;
        }
        int i4 = extraCallback + 87;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        onExtraCallbackWithResult();
        onExtraCallbackWithResult = new onTextViewSizeChanged();
        setTid<Boolean> settidOnNavigationEvent = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent, "");
        onExtraCallback = settidOnNavigationEvent;
        setTid<TextRoundCornerProgressBar> settidOnNavigationEvent2 = setTid.onNavigationEvent();
        Intrinsics.checkNotNullExpressionValue(settidOnNavigationEvent2, "");
        onTransact = settidOnNavigationEvent2;
        int i = access100 + 83;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 117;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) onExtraCallback.onWarmupCompleted();
        if (bool == null) {
            return true;
        }
        int i4 = extraCallback + 9;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        throw null;
    }

    private final void onNavigationEvent(boolean z) {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 19;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback.onExtraCallback(Boolean.valueOf(z));
        int i4 = extraCallback + 35;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final String onWarmupCompleted(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int i2 = onWarmupCompleted.onExtraCallback[((alignTextProgressInsideProgress) IAuthTabCallback(iOnExtraCallback, 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596)).ordinal()];
        if (i2 == 1) {
            return "WIFI";
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return "OFFLINE";
            }
            throw new NoWhenBranchMatchedException();
        }
        int iOnExtraCallback3 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback4 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int i3 = onWarmupCompleted.onNavigationEvent[((alignTextProgressOutsideProgress) IAuthTabCallback(iOnExtraCallback3, 1903528041, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4, new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1903528040)).ordinal()];
        if (i3 == 1) {
            int i4 = ICustomTabsCallback + 31;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return "2G";
        }
        if (i3 == 2) {
            return "3G";
        }
        if (i3 == 3) {
            return "4G";
        }
        if (i3 != 4) {
            Object[] objArr = new Object[1];
            a(new char[]{13834, 16429, 29376, 41446, 61196, 65084, 48496, 28354}, TextUtils.indexOf("", "", 0) + 7, objArr);
            return ((String) objArr[0]).intern();
        }
        int i6 = ICustomTabsCallback + 17;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return "5G";
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i4 = 58224;
            int i5 = i3;
            while (i5 < 16) {
                int i6 = $11 + 17;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (access000 ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback_Parcel);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                        int iResolveSize = View.resolveSize(i3, i3) + 10;
                        int iBlue = Color.blue(i3) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iResolveSize, iBlue, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (asInterface ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(getInterfaceDescriptor)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), View.getDefaultSize(0, 0) + 10, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12433, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 39;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - (ViewConfiguration.getTouchSlop() >> 8)), TextUtils.indexOf("", "") + 14, 19901 - KeyEvent.keyCodeFromString(""), -1250968944, false, LiveCheckConstants.LOAD_PHONE_LOST_ACK, new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws Throwable {
        onTextViewSizeChanged ontextviewsizechanged = (onTextViewSizeChanged) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        alignTextProgressInsideProgress aligntextprogressinsideprogress = IAuthTabCallbackDefault;
        if (aligntextprogressinsideprogress != null) {
            return aligntextprogressinsideprogress;
        }
        int i2 = extraCallback + 123;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            return ontextviewsizechanged.IAuthTabCallback(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (Throwable th) {
            if (!Intrinsics.areEqual(th, IAuthTabCallbackStub)) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NetworkMonitor", "getNetworkType error", th, (Map) null, 8, (Object) null);
                IAuthTabCallbackStub = th;
            }
            alignTextProgressInsideProgress aligntextprogressinsideprogress2 = alignTextProgressInsideProgress.UNKNOWN;
            int i4 = ICustomTabsCallback + 9;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            return aligntextprogressinsideprogress2;
        }
    }

    public final boolean onExtraCallbackWithResult(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 61;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Boolean bool = onWarmupCompleted;
        if (bool != null) {
            int i4 = extraCallback + 39;
            ICustomTabsCallback = i4 % 128;
            int i5 = i4 % 2;
            return bool.booleanValue();
        }
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Object[] objArr = {this, connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())};
            return ((Boolean) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1580864040, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1580864038)).booleanValue();
        } catch (Throwable th) {
            if (!Intrinsics.areEqual(th, IAuthTabCallbackStub)) {
                ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NetworkMonitor", "isUsingVpn error", th, (Map) null, 8, (Object) null);
                IAuthTabCallbackStub = th;
            }
            return false;
        }
    }

    public final void IAuthTabCallbackStub(@NotNull Context context) throws Throwable {
        ConnectivityManager connectivityManager;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 7;
        extraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (!onNavigationEvent && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class)) != null) {
            IAuthTabCallback = connectivityManager;
            TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
            if (telephonyManager != null) {
                asBinder = telephonyManager;
                try {
                    onExtraCallbackWithResult(this, onExtraCallback(), "initial", null, 4, null);
                    asBinder();
                    onNavigationEvent = true;
                    return;
                } catch (Throwable th) {
                    if (!Intrinsics.areEqual(th, IAuthTabCallbackStub)) {
                        ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NetworkMonitor", "failed on startListening", th, (Map) null, 8, (Object) null);
                        IAuthTabCallbackStub = th;
                    }
                }
            }
        }
        int i3 = extraCallback + 121;
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        onTextViewSizeChanged ontextviewsizechanged = (onTextViewSizeChanged) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        Object obj = objArr[3];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 33;
        extraCallback = i2 % 128;
        if (i2 % 2 == 0 ? (iIntValue & 1) != 0 : (iIntValue & 1) != 0) {
            zBooleanValue = false;
        }
        getByteBuffer getbytebuffer = (getByteBuffer) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 362397789, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{ontextviewsizechanged, Boolean.valueOf(zBooleanValue)}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -362397784);
        int i3 = ICustomTabsCallback + 59;
        extraCallback = i3 % 128;
        int i4 = i3 % 2;
        return getbytebuffer;
    }

    public final getByteBuffer<TextRoundCornerProgressBar> onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCallback + 33;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(onTransact.getInterfaceDescriptor(), "");
            throw null;
        }
        getByteBuffer<TextRoundCornerProgressBar> interfaceDescriptor = onTransact.getInterfaceDescriptor();
        Intrinsics.checkNotNullExpressionValue(interfaceDescriptor, "");
        int i3 = ICustomTabsCallback + 25;
        extraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 88 / 0;
        }
        return interfaceDescriptor;
    }

    public static final class onTransact extends SuspendLambda implements Function2<ok<? super String>, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onTransact(Context context, access13800<? super onTransact> access13800Var) {
            super(2, access13800Var);
            this.$context = context;
        }

        public static /* synthetic */ void IAuthTabCallback(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 87;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult(function1, obj);
            if (i3 != 0) {
                throw null;
            }
        }

        public static /* synthetic */ Unit onExtraCallback(deserializeUriNullableCollection deserializeurinullablecollection) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallbackWithResult(deserializeurinullablecollection);
                throw null;
            }
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(deserializeurinullablecollection);
            int i3 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Unit onExtraCallback(ok okVar, Context context, TextRoundCornerProgressBar textRoundCornerProgressBar) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                onWarmupCompleted(okVar, context, textRoundCornerProgressBar);
                obj.hashCode();
                throw null;
            }
            Unit unitOnWarmupCompleted = onWarmupCompleted(okVar, context, textRoundCornerProgressBar);
            int i3 = IAuthTabCallback + 115;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                return unitOnWarmupCompleted;
            }
            throw null;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onTransact ontransact = new onTransact(this.$context, access13800Var);
            ontransact.L$0 = obj;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return ontransact;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 125;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((ok) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 79;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(ok<? super String> okVar, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(okVar, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        private static final void onExtraCallbackWithResult(Function1 function1, Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj2 = null;
            function1.invoke(obj);
            if (i3 == 0) {
                throw null;
            }
            int i4 = onExtraCallbackWithResult + 97;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }

        private static final Unit onWarmupCompleted(ok okVar, Context context, TextRoundCornerProgressBar textRoundCornerProgressBar) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 73;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            okVar.IAuthTabCallback(onTextViewSizeChanged.onExtraCallbackWithResult.onWarmupCompleted(context));
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                int i4 = 60 / 0;
            }
            return unit;
        }

        private static final Unit onExtraCallbackWithResult(deserializeUriNullableCollection deserializeurinullablecollection) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            deserializeurinullablecollection.dispose();
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = IAuthTabCallback + 25;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
            return unit;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            ok okVar = (ok) this.L$0;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                deserializeUriNullableCollection deserializeurinullablecollectionIAuthTabCallback = onTextViewSizeChanged.onWarmupCompleted().IAuthTabCallback(new NetworkMonitor$observeNetworkStatus$1$.ExternalSyntheticLambda1(new NetworkMonitor$observeNetworkStatus$1$.ExternalSyntheticLambda0(okVar, this.$context)));
                NetworkMonitor$observeNetworkStatus$1$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new NetworkMonitor$observeNetworkStatus$1$.ExternalSyntheticLambda2(deserializeurinullablecollectionIAuthTabCallback);
                this.L$0 = access15400.onNavigationEvent(okVar);
                this.L$1 = access15400.onNavigationEvent(deserializeurinullablecollectionIAuthTabCallback);
                this.label = 1;
                if (jw.onWarmupCompleted(okVar, externalSyntheticLambda2, this) == objOnWarmupCompleted) {
                    int i3 = IAuthTabCallback + 23;
                    onExtraCallbackWithResult = i3 % 128;
                    if (i3 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallbackWithResult + 105;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    public final IAnimation<String> IAuthTabCallbackDefault(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        IAnimation<String> iAnimationOnNavigationEvent = ycxycx.onNavigationEvent(ycxycx.onNavigationEvent(new onTransact(context, null)));
        int i2 = extraCallback + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return iAnimationOnNavigationEvent;
    }

    static final class asInterface extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        int label;

        asInterface(access13800<? super asInterface> access13800Var) {
            super(2, access13800Var);
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            asInterface asinterfaceCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = asinterfaceCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onExtraCallback + 11;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asInterface asinterface = new asInterface(access13800Var);
            int i2 = onExtraCallback + 117;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return asinterface;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 36 / 0;
            }
            return objIAuthTabCallback;
        }

        public final Object invokeSuspend(Object obj) {
            boolean z;
            int i = 2 % 2;
            int i2 = onExtraCallback + 101;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            Socket socket = new Socket();
            try {
                socket.connect(new InetSocketAddress("8.8.8.8", 53), 1000);
                _UtilCommonKt.closeQuietly(socket);
                z = true;
            } catch (Exception unused) {
                _UtilCommonKt.closeQuietly(socket);
                z = false;
            } catch (Throwable th) {
                _UtilCommonKt.closeQuietly(socket);
                throw th;
            }
            Boolean boolOnNavigationEvent = access14000.onNavigationEvent(z);
            int i4 = onNavigationEvent + 3;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return boolOnNavigationEvent;
            }
            throw null;
        }
    }

    public final Object onNavigationEvent(@NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new asInterface(null), access13800Var);
        int i2 = extraCallback + 67;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        return objOnExtraCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class asBinder extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ String $host;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        asBinder(String str, access13800<? super asBinder> access13800Var) {
            super(2, access13800Var);
            this.$host = str;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            asBinder asbinder = new asBinder(this.$host, access13800Var);
            int i2 = onExtraCallbackWithResult + 47;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return asbinder;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            Object objOnNavigationEvent;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 123;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Boolean> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = 78 / 0;
            } else {
                objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            }
            int i4 = onExtraCallbackWithResult + 91;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 11;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 22 / 0;
            }
            int i5 = onExtraCallbackWithResult + 117;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 33 / 0;
            }
            return objInvokeSuspend;
        }

        /* renamed from: o.onTextViewSizeChanged$asBinder$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Boolean>, Object> {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;
            final /* synthetic */ String $host;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, access13800<? super AnonymousClass1> access13800Var) {
                super(2, access13800Var);
                this.$host = str;
            }

            public static /* synthetic */ boolean IAuthTabCallback(findResAndMsg findresandmsg, String str) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(findresandmsg, str);
                int i4 = IAuthTabCallback + 91;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    return zOnExtraCallbackWithResult;
                }
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, access13800Var);
                anonymousClass1.L$0 = obj;
                int i2 = IAuthTabCallback + 79;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass1;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = IAuthTabCallback + 87;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallback;
            }

            public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Boolean> access13800Var) {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 45;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallbackWithResult + 77;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                final findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = onExtraCallbackWithResult + 33;
                    IAuthTabCallback = i3 % 128;
                    if (i3 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        return obj;
                    }
                    ResultKt.onNavigationEvent(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
                final String str = this.$host;
                Function0 function0 = new Function0() { // from class: im.toss.core.network.NetworkMonitor$canResolveViaSystemDns$2$1$$ExternalSyntheticLambda0
                    private static int onExtraCallback = 1;
                    private static int onNavigationEvent;

                    public final Object invoke() {
                        int i4 = 2 % 2;
                        int i5 = onNavigationEvent + 65;
                        onExtraCallback = i5 % 128;
                        int i6 = i5 % 2;
                        Boolean boolValueOf = Boolean.valueOf(onTextViewSizeChanged.asBinder.AnonymousClass1.IAuthTabCallback(findresandmsg, str));
                        int i7 = onNavigationEvent + 101;
                        onExtraCallback = i7 % 128;
                        int i8 = i7 % 2;
                        return boolValueOf;
                    }
                };
                this.L$0 = access15400.onNavigationEvent(findresandmsg);
                this.label = 1;
                Object objOnWarmupCompleted2 = getChannelIndex.onWarmupCompleted((CoroutineContext) null, function0, this, 1, (Object) null);
                if (objOnWarmupCompleted2 != objOnWarmupCompleted) {
                    return objOnWarmupCompleted2;
                }
                int i4 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 30 / 0;
                }
                return objOnWarmupCompleted;
            }

            private static final boolean onExtraCallbackWithResult(findResAndMsg findresandmsg, String str) {
                Object obj;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 123;
                onExtraCallbackWithResult = i2 % 128;
                try {
                } catch (Throwable th) {
                    Result.Companion companion = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
                }
                if (i2 % 2 != 0) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    Intrinsics.checkNotNullExpressionValue(allByName, "");
                    int length = allByName.length;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Result.Companion companion3 = kotlin.Result.Companion;
                InetAddress[] allByName2 = InetAddress.getAllByName(str);
                Intrinsics.checkNotNullExpressionValue(allByName2, "");
                obj = kotlin.Result.constructor-impl(Boolean.valueOf(allByName2.length != 0));
                Boolean bool = Boolean.FALSE;
                if (!(!kotlin.Result.onExtraCallback(obj))) {
                    int i3 = IAuthTabCallback + 7;
                    int i4 = i3 % 128;
                    onExtraCallbackWithResult = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 51;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    obj = bool;
                }
                return ((Boolean) obj).booleanValue();
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 49;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                access14300.onWarmupCompleted();
                throw null;
            }
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.onNavigationEvent(obj);
                setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
                long jIAuthTabCallback = setCommandLine.IAuthTabCallback(1000L, setRevision.MILLISECONDS);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$host, null);
                this.label = 1;
                obj = doGet.IAuthTabCallback(jIAuthTabCallback, anonymousClass1, this);
                if (obj == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = IAuthTabCallback + 113;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    throw null;
                }
                ResultKt.onNavigationEvent(obj);
            }
            Boolean bool = (Boolean) obj;
            return access14000.onNavigationEvent(bool != null ? bool.booleanValue() : false);
        }
    }

    public final Object IAuthTabCallback(@NotNull String str, @NotNull access13800<? super Boolean> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new asBinder(str, null), access13800Var);
        int i2 = extraCallback + 89;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return objOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[PHI: r1 r3
      0x002b: PHI (r1v9 o.onTextViewSizeChanged$IAuthTabCallback) = (r1v8 o.onTextViewSizeChanged$IAuthTabCallback), (r1v11 o.onTextViewSizeChanged$IAuthTabCallback) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]
      0x002b: PHI (r3v5 int) = (r3v4 int), (r3v7 int) binds: [B:10:0x0029, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onWarmupCompleted(@NotNull String str, @NotNull access13800<? super Boolean> access13800Var) {
        IAuthTabCallback iAuthTabCallback;
        int i;
        int i2 = 2 % 2;
        if (access13800Var instanceof IAuthTabCallback) {
            int i3 = ICustomTabsCallback + 63;
            extraCallback = i3 % 128;
            if (i3 % 2 != 0) {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                int i4 = 25 / 0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    iAuthTabCallback.label = i - 2147483648;
                } else {
                    iAuthTabCallback = new IAuthTabCallback(access13800Var);
                }
            } else {
                iAuthTabCallback = (IAuthTabCallback) access13800Var;
                i = iAuthTabCallback.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                }
            }
        }
        Object objOnNavigationEvent = iAuthTabCallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i5 = iAuthTabCallback.label;
        if (i5 != 0) {
            int i6 = ICustomTabsCallback + 43;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        } else {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            drawTextProgressPosition drawtextprogressposition = drawTextProgressPosition.onExtraCallbackWithResult;
            setLogBuffers.IAuthTabCallback iAuthTabCallback2 = setLogBuffers.Companion;
            long jIAuthTabCallback = setCommandLine.IAuthTabCallback(1000L, setRevision.MILLISECONDS);
            iAuthTabCallback.L$0 = access15400.onNavigationEvent(str);
            iAuthTabCallback.label = 1;
            objOnNavigationEvent = drawtextprogressposition.onNavigationEvent(str, jIAuthTabCallback, (access13800<? super List<? extends InetAddress>>) iAuthTabCallback);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i8 = extraCallback + 37;
                ICustomTabsCallback = i8 % 128;
                if (i8 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }
        }
        return access14000.onNavigationEvent(!((Collection) objOnNavigationEvent).isEmpty());
    }

    public final Map<String, Object> IAuthTabCallback(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 65;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        ContentResolver contentResolver = context.getContentResolver();
        String string = Settings.Global.getString(contentResolver, "private_dns_mode");
        boolean zIsPrivateDnsActive = false;
        if (string == null) {
            Object[] objArr = new Object[1];
            a(new char[]{35216, 1238, 17669, 55859, 51204, 55377, 26805, 31736}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6, objArr);
            string = ((String) objArr[0]).intern();
        }
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback("privateDnsMode", string);
        String string2 = Settings.Global.getString(contentResolver, "private_dns_specifier");
        Object[] objArr2 = new Object[1];
        a(new char[]{45144, 64936, 22383, 56922}, TextUtils.getCapsMode("", 0, 0) + 4, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        if (string2 == null) {
            Object[] objArr3 = new Object[1];
            a(new char[]{45144, 64936, 22383, 56922}, '4' - AndroidCharacter.getMirror('0'), objArr3);
            string2 = ((String) objArr3[0]).intern();
        }
        Map<String, Object> mapIAuthTabCallback = access8100.IAuthTabCallback(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("privateDnsSpecifier", string2)});
        if (Build.VERSION.SDK_INT >= 28) {
            ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, ConnectivityManager.class);
            LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()) : null;
            if (linkProperties != null) {
                int i4 = extraCallback + 109;
                ICustomTabsCallback = i4 % 128;
                int i5 = i4 % 2;
                zIsPrivateDnsActive = linkProperties.isPrivateDnsActive();
            }
            mapIAuthTabCallback.put("privateDnsActive", Boolean.valueOf(zIsPrivateDnsActive));
            if (linkProperties != null) {
                int i6 = ICustomTabsCallback + 113;
                extraCallback = i6 % 128;
                int i7 = i6 % 2;
                String privateDnsServerName = linkProperties.getPrivateDnsServerName();
                if (privateDnsServerName == null) {
                    int i8 = ICustomTabsCallback;
                    int i9 = i8 + 113;
                    extraCallback = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = i8 + 77;
                    extraCallback = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    strIntern = privateDnsServerName;
                }
            }
            mapIAuthTabCallback.put("privateDnsServer", strIntern);
        }
        return mapIAuthTabCallback;
    }

    static final class IAuthTabCallbackStub extends SuspendLambda implements Function2<findResAndMsg, access13800<? super onExtraCallback>, Object> {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        int label;

        IAuthTabCallbackStub(access13800<? super IAuthTabCallbackStub> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStub = new IAuthTabCallbackStub(access13800Var);
            int i2 = onWarmupCompleted + 55;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallbackStub;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws UnknownHostException {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 79;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super onExtraCallback> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onExtraCallback(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnExtraCallback = onExtraCallback(findresandmsg, access13800Var);
            int i3 = onNavigationEvent + 123;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super onExtraCallback> access13800Var) throws UnknownHostException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallbackStub iAuthTabCallbackStubCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackStubCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 35;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws UnknownHostException {
            Object next;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 33;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            try {
                Iterator it = CollectionsKt.listOf(new String[]{"api-gateway.toss.im", "app.toss.im"}).iterator();
                while (it.hasNext()) {
                    InetAddress[] allByName = InetAddress.getAllByName((String) it.next());
                    Intrinsics.checkNotNullExpressionValue(allByName, "");
                    ArrayList arrayList = new ArrayList(allByName.length);
                    for (InetAddress inetAddress : allByName) {
                        int i3 = onWarmupCompleted + 45;
                        onNavigationEvent = i3 % 128;
                        int i4 = i3 % 2;
                        arrayList.add(inetAddress.getHostAddress());
                    }
                    Iterator it2 = onExtraCallback.getEntries().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        onExtraCallback onextracallback = (onExtraCallback) next;
                        if (!arrayList.isEmpty()) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                int i5 = onNavigationEvent + 113;
                                onWarmupCompleted = i5 % 128;
                                int i6 = i5 % 2;
                                if (ArraysKt.contains(onextracallback.getIpAddresses(), (String) it3.next())) {
                                    break;
                                }
                            }
                        }
                    }
                    onExtraCallback onextracallback2 = (onExtraCallback) next;
                    if (onextracallback2 != null) {
                        int i7 = onWarmupCompleted + 71;
                        onNavigationEvent = i7 % 128;
                        if (i7 % 2 != 0) {
                            return onextracallback2;
                        }
                        throw null;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }
    }

    public final Object onExtraCallbackWithResult(@NotNull access13800<? super onExtraCallback> access13800Var) {
        int i = 2 % 2;
        Object objOnExtraCallback = maybeUpdateAnimatable.onExtraCallback(putChannelInfo.IAuthTabCallback(), new IAuthTabCallbackStub(null), access13800Var);
        int i2 = extraCallback + 9;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    private final String IAuthTabCallbackDefault() throws Throwable {
        HttpURLConnection httpURLConnection;
        int i = 2 % 2;
        int i2 = extraCallback + 75;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{43109, 21071, 63923, 2776, 30660, 40967, 56410, 54774, 53086, 60073, 8717, 30562, 17488, 8719, 25783, 36963, 17656, 42001, 47779, 48395, 12552, 52775}, (Process.myPid() >> 22) + 21, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(new char[]{43109, 21071, 63923, 2776, 30660, 40967, 56410, 54774, 17488, 8719, 17643, 23946, 47081, 45149, 48472, 45697, 17488, 8719, 51189, 59661, 3336, 35998, 13688, 54747}, Drawable.resolveOpacity(0, 0) + 23, objArr2);
        Iterator it = CollectionsKt.listOf(new String[]{strIntern, ((String) objArr2[0]).intern()}).iterator();
        while (it.hasNext()) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL((String) it.next()).openConnection();
                Intrinsics.checkNotNull(uRLConnectionOpenConnection, "");
                httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            } catch (Throwable unused) {
                httpURLConnection = null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                int i4 = ICustomTabsCallback + 71;
                extraCallback = i4 % 128;
                int i5 = i4 % 2;
                while (true) {
                    String line = bufferedReader.readLine();
                    objectRef.element = line;
                    if (line == null) {
                        bufferedReader.close();
                        String string = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        httpURLConnection.disconnect();
                        return string;
                    }
                    int i6 = ICustomTabsCallback + 65;
                    extraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    sb.append(line);
                }
            } catch (Throwable unused2) {
                if (httpURLConnection != null) {
                    int i8 = extraCallback + 25;
                    ICustomTabsCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        httpURLConnection.disconnect();
                        int i9 = 97 / 0;
                    } else {
                        httpURLConnection.disconnect();
                    }
                }
            }
        }
        Object[] objArr3 = new Object[1];
        a(new char[]{13834, 16429, 29376, 41446, 61196, 65084, 48496, 28354}, MotionEvent.axisFromString("") + 8, objArr3);
        return ((String) objArr3[0]).intern();
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        onTextViewSizeChanged ontextviewsizechanged = (onTextViewSizeChanged) objArr[0];
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int i2 = onWarmupCompleted.onExtraCallback[((alignTextProgressInsideProgress) IAuthTabCallback(iOnExtraCallback, 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{ontextviewsizechanged, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596)).ordinal()];
        Object obj = null;
        if (i2 == 1 || i2 == 2) {
            String strIAuthTabCallbackDefault = ontextviewsizechanged.IAuthTabCallbackDefault();
            int i3 = extraCallback + 93;
            ICustomTabsCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return strIAuthTabCallbackDefault;
            }
            obj.hashCode();
            throw null;
        }
        int i4 = extraCallback + 107;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        Object[] objArr2 = new Object[1];
        a(new char[]{13834, 16429, 29376, 41446, 61196, 65084, 48496, 28354}, MotionEvent.axisFromString("") + 8, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i6 = ICustomTabsCallback + 31;
        extraCallback = i6 % 128;
        if (i6 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    public final void onTransact(@NotNull Context context) throws Throwable {
        int i = 2 % 2;
        int i2 = extraCallback + 5;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            IAuthTabCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        if (IAuthTabCallback()) {
            int i3 = extraCallback + 53;
            ICustomTabsCallback = i3 % 128;
            int i4 = i3 % 2;
            long millis = TimeUnit.MINUTES.toMillis(10L);
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = setDetectCallBack.IAuthTabCallback(applicationContext, "PREF_NETWORK_MONITOR", null, null, 12, null);
            String strOnExtraCallbackWithResult = textRoundCornerProgressBarSavedState1IAuthTabCallback.onExtraCallbackWithResult("PREF_NETWORK_TYPE", "");
            long jOnExtraCallback = textRoundCornerProgressBarSavedState1IAuthTabCallback.onExtraCallback("PREF_NETWORK_IP_REPORTED_AT", 0L);
            alignTextProgressInsideProgress aligntextprogressinsideprogress = (alignTextProgressInsideProgress) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596);
            if (!Intrinsics.areEqual(aligntextprogressinsideprogress.name(), strOnExtraCallbackWithResult) || System.currentTimeMillis() - (jOnExtraCallback + millis) > 0) {
                String str = (String) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1864000005, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1864000009);
                textRoundCornerProgressBarSavedState1IAuthTabCallback.onNavigationEvent("PREF_NETWORK_TYPE", aligntextprogressinsideprogress.name());
                textRoundCornerProgressBarSavedState1IAuthTabCallback.onNavigationEvent("PREF_NETWORK_IP_REPORTED_AT", System.currentTimeMillis());
                ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "NetworkMonitor", null, access8100.onWarmupCompleted(new Pair[]{getWrite.IAuthTabCallback("network_type", aligntextprogressinsideprogress), getWrite.IAuthTabCallback("network_public_ip_address", str)}), null, false, null, 58, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
                return;
            }
        }
        int i5 = extraCallback + 13;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void onExtraCallbackWithResult(onTextViewSizeChanged ontextviewsizechanged, boolean z, String str, Network network, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = extraCallback;
        int i4 = i3 + 105;
        ICustomTabsCallback = i4 % 128;
        if (i4 % 2 != 0 ? (i & 4) != 0 : (i & 5) != 0) {
            int i5 = i3 + 99;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            network = null;
        }
        ontextviewsizechanged.onExtraCallbackWithResult(z, str, network);
    }

    private final void onExtraCallbackWithResult(boolean z, String str, Network network) throws Throwable {
        String str2;
        int iHashCode;
        int i = 2 % 2;
        if (!(!z)) {
            str2 = "NetworkMonitorConnected";
        } else {
            str2 = "NetworkMonitorDisconnected";
        }
        String str3 = str2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr = new Object[1];
        a(new char[]{13616, 6279, 63454, 62555}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4, objArr);
        Pair pairIAuthTabCallback = getWrite.IAuthTabCallback(((String) objArr[0]).intern(), str);
        if (network != null) {
            iHashCode = network.hashCode();
        } else {
            int i2 = extraCallback + 69;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        }
        ConvertFloatArrayToByteArray.IAuthTabCallback(154777398, zzgc.onExtraCallbackWithResult(), -154777398, new Object[]{convertFloatArrayToByteArray, str3, null, access8100.onWarmupCompleted(new Pair[]{pairIAuthTabCallback, getWrite.IAuthTabCallback("network", Integer.valueOf(iHashCode))}), null, false, null, 58, null}, zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult(), zzgc.onExtraCallbackWithResult());
        onNavigationEvent(z);
        int i4 = ICustomTabsCallback + 29;
        extraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = extraCallback + 15;
        ICustomTabsCallback = i2 % 128;
        int i3 = i2 % 2;
        ConnectivityManager connectivityManager = IAuthTabCallback;
        if (connectivityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            connectivityManager = null;
        }
        if (connectivityManager.getActiveNetwork() == null) {
            return false;
        }
        int i4 = ICustomTabsCallback + 49;
        extraCallback = i4 % 128;
        return i4 % 2 == 0;
    }

    private final void asBinder() {
        int i = 2 % 2;
        Handler handler = new Handler(Looper.getMainLooper());
        ConnectivityManager connectivityManager = null;
        if (Build.VERSION.SDK_INT < 26) {
            ConnectivityManager connectivityManager2 = IAuthTabCallback;
            if (connectivityManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i2 = extraCallback + 11;
                ICustomTabsCallback = i2 % 128;
                int i3 = i2 % 2;
            } else {
                connectivityManager = connectivityManager2;
            }
            connectivityManager.registerDefaultNetworkCallback(new onNavigationEvent(handler, new onExtraCallbackWithResult()));
            return;
        }
        ConnectivityManager connectivityManager3 = IAuthTabCallback;
        if (connectivityManager3 == null) {
            int i4 = ICustomTabsCallback + 41;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = ICustomTabsCallback + 69;
            extraCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            connectivityManager = connectivityManager3;
        }
        connectivityManager.registerDefaultNetworkCallback(new onExtraCallbackWithResult(), handler);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int networkType;
        Context context = (Context) objArr[1];
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 111;
        extraCallback = i2 % 128;
        int i3 = i2 % 2;
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return alignTextProgressOutsideProgress.UNKNOWN;
        }
        if (asBinder == null) {
            int i4 = ICustomTabsCallback + 45;
            extraCallback = i4 % 128;
            int i5 = i4 % 2;
            TelephonyManager telephonyManager = (TelephonyManager) ContextCompat.getSystemService(context, TelephonyManager.class);
            if (telephonyManager == null) {
                return alignTextProgressOutsideProgress.UNKNOWN;
            }
            asBinder = telephonyManager;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            TelephonyManager telephonyManager2 = asBinder;
            if (telephonyManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                telephonyManager2 = null;
            }
            networkType = telephonyManager2.getDataNetworkType();
            int i6 = extraCallback + 1;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
        } else {
            TelephonyManager telephonyManager3 = asBinder;
            if (telephonyManager3 == null) {
                int i8 = extraCallback + 125;
                ICustomTabsCallback = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                telephonyManager3 = null;
            }
            networkType = telephonyManager3.getNetworkType();
        }
        if (networkType == 20) {
            return alignTextProgressOutsideProgress.TYPE_5G;
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                alignTextProgressOutsideProgress aligntextprogressoutsideprogress = alignTextProgressOutsideProgress.TYPE_2G;
                int i10 = extraCallback + 11;
                ICustomTabsCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    return aligntextprogressoutsideprogress;
                }
                throw null;
            case 3:
            case 5:
            case 6:
            case 8:
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
            case 10:
            case LiveCheckConstants.SVC_U1 /* 12 */:
            case 14:
            case 15:
                return alignTextProgressOutsideProgress.TYPE_3G;
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                alignTextProgressOutsideProgress aligntextprogressoutsideprogress2 = alignTextProgressOutsideProgress.LTE;
                int i11 = extraCallback + 59;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % 2;
                return aligntextprogressoutsideprogress2;
            default:
                return alignTextProgressOutsideProgress.UNKNOWN;
        }
    }

    private final alignTextProgressInsideProgress IAuthTabCallback(NetworkCapabilities networkCapabilities) {
        int i = 2 % 2;
        if (networkCapabilities != null) {
            int i2 = extraCallback + 43;
            ICustomTabsCallback = i2 % 128;
            if (i2 % 2 != 0 ? networkCapabilities.hasTransport(1) : networkCapabilities.hasTransport(1)) {
                return alignTextProgressInsideProgress.WIFI;
            }
        }
        if (networkCapabilities != null) {
            int i3 = ICustomTabsCallback + 89;
            extraCallback = i3 % 128;
            int i4 = i3 % 2;
            if (networkCapabilities.hasTransport(0)) {
                alignTextProgressInsideProgress aligntextprogressinsideprogress = alignTextProgressInsideProgress.MOBILE;
                int i5 = extraCallback + 61;
                ICustomTabsCallback = i5 % 128;
                int i6 = i5 % 2;
                return aligntextprogressinsideprogress;
            }
        }
        return alignTextProgressInsideProgress.UNKNOWN;
    }

    private final alignTextProgressOutsideProgress asInterface(Context context) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (alignTextProgressOutsideProgress) IAuthTabCallback(iOnExtraCallback, 1903528041, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1903528040);
    }

    public static /* synthetic */ getByteBuffer onNavigationEvent(onTextViewSizeChanged ontextviewsizechanged, boolean z, int i, Object obj) {
        Object[] objArr = {ontextviewsizechanged, Boolean.valueOf(z), Integer.valueOf(i), obj};
        return (getByteBuffer) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 773290631, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -773290631);
    }

    private final boolean onExtraCallbackWithResult(NetworkCapabilities networkCapabilities) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return ((Boolean) IAuthTabCallback(iOnExtraCallback, 1580864040, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{this, networkCapabilities}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1580864038)).booleanValue();
    }

    public final String onExtraCallback(@NotNull Context context) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (String) IAuthTabCallback(iOnExtraCallback, -1864000005, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 1864000009);
    }

    public final alignTextProgressInsideProgress onNavigationEvent(@NotNull Context context) {
        int iOnExtraCallback = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        int iOnExtraCallback2 = ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback();
        return (alignTextProgressInsideProgress) IAuthTabCallback(iOnExtraCallback, 1136607599, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{this, context}, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -1136607596);
    }

    public final getByteBuffer<Boolean> onWarmupCompleted(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        return (getByteBuffer) IAuthTabCallback(ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), 362397789, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), objArr, ComposableSingletons$TdsTopV1Kt$$ExternalSyntheticLambda0.onExtraCallback(), -362397784);
    }

    static void onExtraCallbackWithResult() {
        asInterface = (char) 41875;
        getInterfaceDescriptor = (char) 54465;
        access000 = (char) 44577;
        IAuthTabCallback_Parcel = (char) 55519;
    }
}
