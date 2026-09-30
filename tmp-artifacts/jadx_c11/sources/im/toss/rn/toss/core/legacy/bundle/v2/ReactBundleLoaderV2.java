package im.toss.rn.toss.core.legacy.bundle.v2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.common.JavascriptException;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.rn.spec.bundle.TossReactBundleMeta;
import im.toss.rn.toss.core.common.wrapper.TossReactContentOwner;
import im.toss.securities.core.router.spec.TossSecRoute;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.GeckoHubImp;
import o.IdGeneratorExternalSyntheticLambda1;
import o.MaxFullscreenAdImpl;
import o.MaxFullscreenAdImplExternalSyntheticLambda1;
import o.WebSocketFactory;
import o.access13800;
import o.access14000;
import o.access14300;
import o.access15400;
import o.access8100;
import o.addPolicy;
import o.ebExternalSyntheticLambda0;
import o.getWrite;
import o.hExternalSyntheticLambda15;
import o.hExternalSyntheticLambda3;
import o.hExternalSyntheticLambda5;
import o.hExternalSyntheticLambda8;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos;
import o.r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I;
import o.setCampaign;
import o.setCommandLine;
import o.setLogBuffers;
import o.setRevision;
import o.zzad;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class ReactBundleLoaderV2 {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final Companion Companion;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static char access000 = 0;
    private static int access100 = 1;
    private static int extraCallbackWithResult = 1;
    private static char getInterfaceDescriptor;
    private final String IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final ebExternalSyntheticLambda0 asBinder;
    private final String asInterface;
    private final Context onExtraCallback;
    private final ReactPackage onExtraCallbackWithResult;
    private final zzad onNavigationEvent;
    private final ReactBundleRepository onTransact;
    private final Lazy onWarmupCompleted;

    @Deprecated
    public interface Factory {
        ReactBundleLoaderV2 onExtraCallback(@NotNull ReactPackage reactPackage, @NotNull String str, @NotNull String str2);
    }

    static {
        onExtraCallbackWithResult();
        Companion = new Companion(null);
        int i = ICustomTabsCallback + 19;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        ReactBundleLoaderV2 reactBundleLoaderV2 = (ReactBundleLoaderV2) objArr[0];
        r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos = (r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos) objArr[1];
        Exception exc = (Exception) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(reactBundleLoaderV2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, exc);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 45;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(ReactBundleLoaderV2 reactBundleLoaderV2, Function1 function1, Exception exc) {
        int i = 2 % 2;
        int i2 = access100 + 89;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(reactBundleLoaderV2, function1, exc);
        if (i3 != 0) {
            int i4 = 9 / 0;
        }
    }

    public static /* synthetic */ OkHttpClient onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 13;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
            return (OkHttpClient) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback, -1448879403, 1448879406);
        }
        int iOnExtraCallback2 = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = (~i4) | i7;
        int i9 = ~i8;
        int i10 = (~(i7 | i5)) | i9;
        int i11 = (~(i7 | (~i5) | i4)) | (~(i8 | i5)) | (~(i6 | i5 | i4));
        int i12 = (~(i4 | i6)) | i5 | i9;
        int i13 = i6 + i5 + i + (5090439 * i2) + ((-1076018391) * i3);
        int i14 = i13 * i13;
        int i15 = ((1425068070 * i6) - 1475346432) + (1088368604 * i5) + (i10 * (-168349733)) + ((-168349733) * i11) + (168349733 * i12) + (1256718336 * i) + (1616379904 * i2) + ((-1222115328) * i3) + (1028194304 * i14);
        int i16 = (i6 * (-1092730454)) + 799718796 + (i5 * (-1092731068)) + (i10 * (-307)) + (i11 * (-307)) + (i12 * 307) + (i * (-1092730761)) + (i2 * 1582232257) + (i3 * 741505039) + (i14 * (-1125187584));
        int i17 = i15 + (i16 * i16 * (-410583040));
        if (i17 == 1) {
            return onExtraCallback(objArr);
        }
        if (i17 == 2) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 3) {
            return IAuthTabCallback(objArr);
        }
        int i18 = 2 % 2;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        setLogBuffers.IAuthTabCallback iAuthTabCallback = setLogBuffers.Companion;
        OkHttpClient okHttpClientBuild = builder.readTimeout-LRDsOJo(setCommandLine.onWarmupCompleted(30, setRevision.SECONDS)).build();
        int i19 = access100 + 9;
        IAuthTabCallbackStubProxy = i19 % 128;
        int i20 = i19 % 2;
        return okHttpClientBuild;
    }

    public static /* synthetic */ void onNavigationEvent(ReactBundleLoaderV2 reactBundleLoaderV2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, Function1 function1, MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2, Function1 function12, Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 39;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(reactBundleLoaderV2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, function1, onextracallbackwithresult, onextracallbackwithresult2, function12, exc);
        int i4 = access100 + 91;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(exc);
        int i4 = IAuthTabCallbackStubProxy + 37;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ hExternalSyntheticLambda3 onWarmupCompleted(hExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, ReactBundleLoaderV2 reactBundleLoaderV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 63;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        hExternalSyntheticLambda3 hexternalsyntheticlambda3OnExtraCallbackWithResult = onExtraCallbackWithResult(onwarmupcompleted, reactBundleLoaderV2);
        int i4 = access100 + 19;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return hexternalsyntheticlambda3OnExtraCallbackWithResult;
        }
        throw null;
    }

    public ReactBundleLoaderV2(@NotNull Context context, @NotNull ReactBundleRepository reactBundleRepository, @NotNull zzad zzadVar, @NotNull final hExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, @NotNull ReactPackage reactPackage, @NotNull String str, @NotNull String str2, @NotNull ebExternalSyntheticLambda0 ebexternalsyntheticlambda0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(reactBundleRepository, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        Intrinsics.checkNotNullParameter(reactPackage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(ebexternalsyntheticlambda0, "");
        this.onExtraCallback = context;
        this.onTransact = reactBundleRepository;
        this.onNavigationEvent = zzadVar;
        this.onExtraCallbackWithResult = reactPackage;
        this.asInterface = str;
        this.IAuthTabCallback = str2;
        this.asBinder = ebexternalsyntheticlambda0;
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 5;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    ReactBundleLoaderV2.onExtraCallback();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                OkHttpClient okHttpClientOnExtraCallback = ReactBundleLoaderV2.onExtraCallback();
                int i3 = onNavigationEvent + 9;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                return okHttpClientOnExtraCallback;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 99;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                hExternalSyntheticLambda3 hexternalsyntheticlambda3OnWarmupCompleted = ReactBundleLoaderV2.onWarmupCompleted(onwarmupcompleted, this);
                int i4 = onNavigationEvent + 1;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return hexternalsyntheticlambda3OnWarmupCompleted;
            }
        });
    }

    public static final /* synthetic */ OkHttpClient onExtraCallbackWithResult(ReactBundleLoaderV2 reactBundleLoaderV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 111;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClientIAuthTabCallback = reactBundleLoaderV2.IAuthTabCallback();
        int i4 = access100 + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 58 / 0;
        }
        return okHttpClientIAuthTabCallback;
    }

    private final OkHttpClient IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 61;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        OkHttpClient okHttpClient = (OkHttpClient) this.onWarmupCompleted.getValue();
        int i4 = access100 + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return okHttpClient;
    }

    private static final hExternalSyntheticLambda3 onExtraCallbackWithResult(hExternalSyntheticLambda3.onWarmupCompleted onwarmupcompleted, ReactBundleLoaderV2 reactBundleLoaderV2) {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        hExternalSyntheticLambda3 hexternalsyntheticlambda3IAuthTabCallback = onwarmupcompleted.IAuthTabCallback(reactBundleLoaderV2.onExtraCallbackWithResult);
        int i4 = IAuthTabCallbackStubProxy + 97;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return hexternalsyntheticlambda3IAuthTabCallback;
        }
        throw null;
    }

    private final hExternalSyntheticLambda3 onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        hExternalSyntheticLambda3 hexternalsyntheticlambda3 = (hExternalSyntheticLambda3) this.IAuthTabCallbackDefault.getValue();
        int i4 = access100 + 67;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return hexternalsyntheticlambda3;
    }

    public static final class Companion {
        private static int $10 = 0;
        private static int $11 = 1;
        private static long IAuthTabCallback = -6782421930512729522L;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $10 + 121;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, Color.red(0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() & (IAuthTabCallback - 5407414049857832247L);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 59 - (ViewConfiguration.getDoubleTapTimeout() >> 16), KeyEvent.keyCodeFromString("") + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    Object[] objArr4 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 23 - ImageFormat.getBitsPerPixel(0), KeyEvent.keyCodeFromString("") + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (IAuthTabCallback ^ 5407414049857832247L);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 59 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6382, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 97;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                    Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), AndroidCharacter.getMirror('0') + 11, 6383 - View.MeasureSpec.getMode(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    throw null;
                }
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr7 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback6 == null) {
                    objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), 59 - (ViewConfiguration.getTapTimeout() >> 16), 6383 - ExpandableListView.getPackedPositionType(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback6).invoke(null, objArr7);
            }
            objArr[0] = new String(cArr2);
        }

        private Companion() {
        }

        public static final /* synthetic */ Date onExtraCallbackWithResult(Companion companion, String str) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            Date dateOnWarmupCompleted = companion.onWarmupCompleted(str);
            int i4 = onNavigationEvent + 23;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                return dateOnWarmupCompleted;
            }
            throw null;
        }

        private final Date onWarmupCompleted(String str) throws Throwable {
            int i = 2 % 2;
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object[] objArr = new Object[1];
            a(new char[]{48896, 2965, 54826, 41663, 28000, 14813, 33891, 20238, 7065, 58892, 45766, 32115, 51702, 38043}, 46229 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            Date dateOnWarmupCompleted = setCampaign.onWarmupCompleted(new IdGeneratorExternalSyntheticLambda1(((String) objArr[0]).intern(), locale), str);
            if (dateOnWarmupCompleted == null) {
                dateOnWarmupCompleted = new Date(0L);
                int i2 = onExtraCallbackWithResult + 43;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = onNavigationEvent + 33;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return dateOnWarmupCompleted;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Date] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws Throwable {
        ReactBundleLoaderV2$load$1 reactBundleLoaderV2$load$1;
        LoadParams loadParams;
        int i;
        Exception e;
        Throwable th;
        Object obj;
        LoadParams loadParams2;
        Function1<? super String, Unit> function1;
        Function1<? super String, Unit> function12;
        hExternalSyntheticLambda8 hexternalsyntheticlambda8;
        ?? OnExtraCallbackWithResult;
        LoadParams loadParams3;
        ReactBundle reactBundle;
        Function1<? super String, Unit> function13;
        hExternalSyntheticLambda8 hexternalsyntheticlambda82;
        ReactBundleLoaderV2 reactBundleLoaderV2 = (ReactBundleLoaderV2) objArr[0];
        LoadParams loadParams4 = (LoadParams) objArr[1];
        Function1<? super String, Unit> function14 = (Function1) objArr[2];
        Function1<? super String, Unit> function15 = (Function1) objArr[3];
        ReactBundleLoaderV2$load$1 reactBundleLoaderV2$load$12 = (access13800) objArr[4];
        int i2 = 2 % 2;
        if (!(reactBundleLoaderV2$load$12 instanceof ReactBundleLoaderV2$load$1)) {
            reactBundleLoaderV2$load$1 = new ReactBundleLoaderV2$load$1(reactBundleLoaderV2, reactBundleLoaderV2$load$12);
        } else {
            reactBundleLoaderV2$load$1 = reactBundleLoaderV2$load$12;
            int i3 = reactBundleLoaderV2$load$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                reactBundleLoaderV2$load$1.label = i3 - 2147483648;
            }
        }
        Object objOnNavigationEvent = reactBundleLoaderV2$load$1.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i4 = reactBundleLoaderV2$load$1.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            if (MaxFullscreenAdImplExternalSyntheticLambda1.onNavigationEvent(reactBundleLoaderV2.onNavigationEvent)) {
                try {
                    Request requestBuild = new Request.Builder().url("http://localhost:8081/status").build();
                    GeckoHubImp geckoHubImpIAuthTabCallback = putChannelInfo.IAuthTabCallback();
                    ReactBundleLoaderV2$load$isMetroConnected$1 reactBundleLoaderV2$load$isMetroConnected$1 = new ReactBundleLoaderV2$load$isMetroConnected$1(reactBundleLoaderV2, requestBuild, null);
                    reactBundleLoaderV2$load$1.L$0 = loadParams4;
                    reactBundleLoaderV2$load$1.L$1 = function14;
                    reactBundleLoaderV2$load$1.L$2 = function15;
                    reactBundleLoaderV2$load$1.L$3 = access15400.onNavigationEvent(requestBuild);
                    reactBundleLoaderV2$load$1.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(geckoHubImpIAuthTabCallback, reactBundleLoaderV2$load$isMetroConnected$1, reactBundleLoaderV2$load$1) == objOnWarmupCompleted) {
                        return objOnWarmupCompleted;
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.toString();
                    addPolicy.ITrustedWebActivityCallback().onNavigationEvent("RN_DEV_SUPPORT_ENABLED", false);
                    loadParams = loadParams4;
                    i = 0;
                    if (i == 0) {
                    }
                }
            }
            loadParams = loadParams4;
            i = 0;
            if (i == 0) {
                return new hExternalSyntheticLambda15.onNavigationEvent(reactBundleLoaderV2.onExtraCallback(loadParams.onWarmupCompleted(), function14, function15), r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.Companion.onExtraCallback(loadParams.onExtraCallbackWithResult(), loadParams.onTransact().onWarmupCompleted(), reactBundleLoaderV2.IAuthTabCallback, loadParams.onExtraCallback()));
            }
            ReactBundleRepository reactBundleRepository = reactBundleLoaderV2.onTransact;
            String strOnExtraCallbackWithResult = loadParams.onExtraCallbackWithResult();
            boolean zIAuthTabCallbackStub = loadParams.IAuthTabCallbackStub();
            Long lOnExtraCallback = access14000.onExtraCallback(loadParams.onNavigationEvent());
            Date dateIAuthTabCallback = loadParams.IAuthTabCallback();
            String str = reactBundleLoaderV2.asInterface;
            String str2 = reactBundleLoaderV2.IAuthTabCallback;
            reactBundleLoaderV2$load$1.L$0 = loadParams;
            reactBundleLoaderV2$load$1.L$1 = function14;
            reactBundleLoaderV2$load$1.L$2 = function15;
            reactBundleLoaderV2$load$1.L$3 = null;
            reactBundleLoaderV2$load$1.I$0 = i;
            reactBundleLoaderV2$load$1.label = 2;
            th = null;
            obj = objOnWarmupCompleted;
            Object objOnNavigationEvent2 = reactBundleRepository.onNavigationEvent(strOnExtraCallbackWithResult, zIAuthTabCallbackStub, lOnExtraCallback, dateIAuthTabCallback, str, str2, reactBundleLoaderV2$load$1);
            if (objOnNavigationEvent2 == obj) {
                return obj;
            }
            loadParams2 = loadParams;
            objOnNavigationEvent = objOnNavigationEvent2;
            Function1<? super String, Unit> function16 = function15;
            function1 = function14;
            function12 = function16;
            hexternalsyntheticlambda8 = (hExternalSyntheticLambda8) objOnNavigationEvent;
            if (hexternalsyntheticlambda8 instanceof hExternalSyntheticLambda8.onExtraCallback) {
            }
        } else if (i4 != 1) {
            int i5 = access100 + 27;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 2) {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                reactBundle = (ReactBundle) reactBundleLoaderV2$load$1.L$4;
                Function1<? super String, Unit> function17 = (Function1) reactBundleLoaderV2$load$1.L$2;
                Function1<? super String, Unit> function18 = (Function1) reactBundleLoaderV2$load$1.L$1;
                LoadParams loadParams5 = (LoadParams) reactBundleLoaderV2$load$1.L$0;
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                function13 = function17;
                function1 = function18;
                loadParams3 = loadParams5;
                hexternalsyntheticlambda82 = (hExternalSyntheticLambda8) objOnNavigationEvent;
                if (hexternalsyntheticlambda82 instanceof hExternalSyntheticLambda8.onExtraCallback) {
                    if (hexternalsyntheticlambda82 instanceof hExternalSyntheticLambda8.IAuthTabCallback) {
                        return new hExternalSyntheticLambda15.onExtraCallback(((hExternalSyntheticLambda8.IAuthTabCallback) hexternalsyntheticlambda82).onExtraCallback());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ReactBundle reactBundleOnExtraCallback = ((hExternalSyntheticLambda8.onExtraCallback) hexternalsyntheticlambda82).onExtraCallback();
                String strOnNavigationEvent = reactBundleOnExtraCallback.onNavigationEvent();
                String strOnExtraCallback = reactBundleOnExtraCallback.onExtraCallback();
                if (strOnExtraCallback == null) {
                    strOnExtraCallback = "";
                }
                String strOnExtraCallbackWithResult2 = reactBundleOnExtraCallback.onExtraCallbackWithResult();
                String strIAuthTabCallback = reactBundleOnExtraCallback.IAuthTabCallback();
                String strOnWarmupCompleted = reactBundleOnExtraCallback.onWarmupCompleted();
                MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult = new MaxFullscreenAdImpl.onExtraCallbackWithResult(strOnNavigationEvent, strOnExtraCallback, new TossReactBundleMeta((String) null, strOnExtraCallbackWithResult2, strIAuthTabCallback, strOnWarmupCompleted == null ? "" : strOnWarmupCompleted, 0L, 0L, (String) null, 113, (DefaultConstructorMarker) null), reactBundleOnExtraCallback.asBinder());
                String strOnNavigationEvent2 = reactBundle.onNavigationEvent();
                String strOnExtraCallback2 = reactBundle.onExtraCallback();
                if (strOnExtraCallback2 == null) {
                    strOnExtraCallback2 = "";
                }
                String strOnExtraCallbackWithResult3 = reactBundle.onExtraCallbackWithResult();
                String strIAuthTabCallback2 = reactBundle.IAuthTabCallback();
                String strOnWarmupCompleted2 = reactBundle.onWarmupCompleted();
                MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2 = new MaxFullscreenAdImpl.onExtraCallbackWithResult(strOnNavigationEvent2, strOnExtraCallback2, new TossReactBundleMeta((String) null, strOnExtraCallbackWithResult3, strIAuthTabCallback2, strOnWarmupCompleted2 == null ? "" : strOnWarmupCompleted2, 0L, 0L, (String) null, 113, (DefaultConstructorMarker) null), reactBundle.asBinder());
                r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback = r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos.Companion.onExtraCallback(reactBundle.onNavigationEvent(), (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{reactBundleLoaderV2, loadParams3.onTransact().onWarmupCompleted()}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 770409512, -770409511), reactBundleLoaderV2.IAuthTabCallback, loadParams3.onExtraCallback());
                return new hExternalSyntheticLambda15.onExtraCallbackWithResult(reactBundleLoaderV2.IAuthTabCallback(loadParams3.onWarmupCompleted(), onextracallbackwithresult, onextracallbackwithresult2, loadParams3.onTransact(), r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback, function1, function13), onextracallbackwithresult, loadParams3.onTransact(), onextracallbackwithresult2, r8lambdadtqrzfihm2ghoddvkfg5vm2yosOnExtraCallback);
            }
            i = reactBundleLoaderV2$load$1.I$0;
            function12 = (Function1) reactBundleLoaderV2$load$1.L$2;
            function1 = (Function1) reactBundleLoaderV2$load$1.L$1;
            LoadParams loadParams6 = (LoadParams) reactBundleLoaderV2$load$1.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            loadParams2 = loadParams6;
            th = null;
            obj = objOnWarmupCompleted;
            hexternalsyntheticlambda8 = (hExternalSyntheticLambda8) objOnNavigationEvent;
            if (hexternalsyntheticlambda8 instanceof hExternalSyntheticLambda8.onExtraCallback) {
                if (!(hexternalsyntheticlambda8 instanceof hExternalSyntheticLambda8.IAuthTabCallback)) {
                    throw new NoWhenBranchMatchedException();
                }
                hExternalSyntheticLambda15.onExtraCallback onextracallback = new hExternalSyntheticLambda15.onExtraCallback(((hExternalSyntheticLambda8.IAuthTabCallback) hexternalsyntheticlambda8).onExtraCallback());
                int i7 = access100 + 43;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return onextracallback;
            }
            int i9 = IAuthTabCallbackStubProxy + 61;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            ReactBundle reactBundleOnExtraCallback2 = ((hExternalSyntheticLambda8.onExtraCallback) hexternalsyntheticlambda8).onExtraCallback();
            ReactBundleRepository reactBundleRepository2 = reactBundleLoaderV2.onTransact;
            String strOnWarmupCompleted3 = reactBundleOnExtraCallback2.onWarmupCompleted();
            if (strOnWarmupCompleted3 != null) {
                int i11 = access100 + 119;
                IAuthTabCallbackStubProxy = i11 % 128;
                if (i11 % 2 != 0) {
                    Companion.onExtraCallbackWithResult(Companion, strOnWarmupCompleted3);
                    throw th;
                }
                OnExtraCallbackWithResult = Companion.onExtraCallbackWithResult(Companion, strOnWarmupCompleted3);
            } else {
                OnExtraCallbackWithResult = th;
            }
            String str3 = reactBundleLoaderV2.asInterface;
            String str4 = reactBundleLoaderV2.IAuthTabCallback;
            reactBundleLoaderV2$load$1.L$0 = loadParams2;
            reactBundleLoaderV2$load$1.L$1 = function1;
            reactBundleLoaderV2$load$1.L$2 = function12;
            reactBundleLoaderV2$load$1.L$3 = access15400.onNavigationEvent(hexternalsyntheticlambda8);
            reactBundleLoaderV2$load$1.L$4 = reactBundleOnExtraCallback2;
            reactBundleLoaderV2$load$1.I$0 = i;
            reactBundleLoaderV2$load$1.label = 3;
            Object[] objArr2 = new Object[1];
            a(new char[]{45457, 23460, 45884, 57994, 30781, 58708}, 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr2);
            objOnNavigationEvent = ReactBundleRepository.onNavigationEvent(reactBundleRepository2, ((String) objArr2[0]).intern(), false, null, OnExtraCallbackWithResult, str3, str4, reactBundleLoaderV2$load$1, 4, null);
            if (objOnNavigationEvent == obj) {
                return obj;
            }
            loadParams3 = loadParams2;
            reactBundle = reactBundleOnExtraCallback2;
            function13 = function12;
            hexternalsyntheticlambda82 = (hExternalSyntheticLambda8) objOnNavigationEvent;
            if (hexternalsyntheticlambda82 instanceof hExternalSyntheticLambda8.onExtraCallback) {
            }
        } else {
            Function1<? super String, Unit> function19 = (Function1) reactBundleLoaderV2$load$1.L$2;
            function14 = (Function1) reactBundleLoaderV2$load$1.L$1;
            LoadParams loadParams7 = (LoadParams) reactBundleLoaderV2$load$1.L$0;
            try {
                ResultKt.onNavigationEvent(objOnNavigationEvent);
                int i12 = IAuthTabCallbackStubProxy + 43;
                access100 = i12 % 128;
                int i13 = i12 % 2;
                function15 = function19;
                loadParams4 = loadParams7;
            } catch (Exception e3) {
                e = e3;
                function15 = function19;
                loadParams4 = loadParams7;
                e.toString();
                addPolicy.ITrustedWebActivityCallback().onNavigationEvent("RN_DEV_SUPPORT_ENABLED", false);
                loadParams = loadParams4;
                i = 0;
                if (i == 0) {
                }
            }
        }
        addPolicy.ITrustedWebActivityCallback().onNavigationEvent("RN_DEV_SUPPORT_ENABLED", true);
        loadParams = loadParams4;
        i = 1;
        if (i == 0) {
        }
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
                int i6 = $10 + 15;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i4) ^ ((c2 << 4) + ((char) (access000 ^ 1094535280733222934L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getInterfaceDescriptor);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char cGreen = (char) Color.green(i3);
                        int iRed = Color.red(i3) + 10;
                        int iRgb = (-16764782) - Color.rgb(i3, i3, i3);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(cGreen, iRed, iRgb, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackStub ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallback_Parcel)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 1), 10 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    int i10 = $10 + 103;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getEdgeSlop() >> 16) + 14, 19901 - View.resolveSize(0, 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private final ReactInstanceManager IAuthTabCallback(TossReactContentOwner tossReactContentOwner, final MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, final MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2, final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12) {
        int i = 2 % 2;
        hExternalSyntheticLambda3 hexternalsyntheticlambda3OnNavigationEvent = onNavigationEvent();
        Context context = this.onExtraCallback;
        String strOnWarmupCompleted = onextracallbackwithresult.onWarmupCompleted();
        String strIAuthTabCallback = onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback();
        Object[] objArr = {onextracallbackwithresult.onExtraCallbackWithResult()};
        int iIAuthTabCallback = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        String str = (String) TossReactBundleMeta.onWarmupCompleted(objArr, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, iIAuthTabCallback, WebSocketFactory.onExtraCallback.IAuthTabCallback());
        String strOnExtraCallbackWithResult = r8lambdadtqrzfihm2ghoddvkfg5vm2yos2.onExtraCallbackWithResult();
        String strIAuthTabCallback2 = onextracallbackwithresult2.onExtraCallbackWithResult().IAuthTabCallback();
        Object[] objArr2 = {onextracallbackwithresult2.onExtraCallbackWithResult()};
        int iIAuthTabCallback2 = WebSocketFactory.onExtraCallback.IAuthTabCallback();
        ReactInstanceManager reactInstanceManagerOnExtraCallbackWithResult = hexternalsyntheticlambda3OnNavigationEvent.onExtraCallbackWithResult(tossReactContentOwner, new hExternalSyntheticLambda5(context, strOnWarmupCompleted, strIAuthTabCallback, str, strOnExtraCallbackWithResult, strIAuthTabCallback2, (String) TossReactBundleMeta.onWarmupCompleted(objArr2, WebSocketFactory.onExtraCallback.IAuthTabCallback(), WebSocketFactory.onExtraCallback.IAuthTabCallback(), -1379106844, 1379106845, iIAuthTabCallback2, WebSocketFactory.onExtraCallback.IAuthTabCallback()), new Function1() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 105;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unit = (Unit) ReactBundleLoaderV2.onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this.f$0, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, (Exception) obj}, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), 731378743, -731378743);
                int i5 = onExtraCallback + 23;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }
        }), new JSExceptionHandler() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda5
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final void handleException(Exception exc) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ReactBundleLoaderV2.onNavigationEvent(this.f$0, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, function12, onextracallbackwithresult, onextracallbackwithresult2, function1, exc);
                int i5 = IAuthTabCallback + 77;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }, false);
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return reactInstanceManagerOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit onExtraCallback(ReactBundleLoaderV2 reactBundleLoaderV2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, Exception exc) {
        int i = 2 % 2;
        int i2 = access100 + 97;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            reactBundleLoaderV2.onTransact.onExtraCallback(r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onExtraCallbackWithResult(), reactBundleLoaderV2.asInterface, r8lambdadtqrzfihm2ghoddvkfg5vm2yos.IAuthTabCallback());
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Intrinsics.checkNotNullParameter(exc, "");
        reactBundleLoaderV2.onTransact.onExtraCallback(r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onExtraCallbackWithResult(), reactBundleLoaderV2.asInterface, r8lambdadtqrzfihm2ghoddvkfg5vm2yos.IAuthTabCallback());
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallbackStubProxy + 53;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return unit2;
    }

    private static final void onExtraCallback(ReactBundleLoaderV2 reactBundleLoaderV2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos2, Function1 function1, MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult, MaxFullscreenAdImpl.onExtraCallbackWithResult onextracallbackwithresult2, Function1 function12, Exception exc) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(exc, "");
        reactBundleLoaderV2.onTransact.onExtraCallback(r8lambdadtqrzfihm2ghoddvkfg5vm2yos.onExtraCallbackWithResult(), reactBundleLoaderV2.asInterface, r8lambdadtqrzfihm2ghoddvkfg5vm2yos.IAuthTabCallback());
        reactBundleLoaderV2.onTransact.onExtraCallback(r8lambdadtqrzfihm2ghoddvkfg5vm2yos2.onExtraCallbackWithResult(), reactBundleLoaderV2.asInterface, r8lambdadtqrzfihm2ghoddvkfg5vm2yos2.IAuthTabCallback());
        if (reactBundleLoaderV2.asBinder.asBinder()) {
            function1.invoke("NativeModuleLoad Error sharedBundle: " + StringsKt.take(onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback(), 7) + "serviceBundle: " + StringsKt.take(onextracallbackwithresult2.onExtraCallbackWithResult().IAuthTabCallback(), 7));
        }
        HashMap mapOnExtraCallbackWithResult = access8100.onExtraCallbackWithResult(new Pair[]{getWrite.IAuthTabCallback("serviceModuleName", r8lambdadtqrzfihm2ghoddvkfg5vm2yos2.onExtraCallbackWithResult()), getWrite.IAuthTabCallback("serviceDeploymentId", onextracallbackwithresult2.onExtraCallbackWithResult().IAuthTabCallback()), getWrite.IAuthTabCallback("sharedDeploymentId", onextracallbackwithresult.onExtraCallbackWithResult().IAuthTabCallback())});
        boolean z = exc instanceof JavascriptException;
        if (z) {
            String strIAuthTabCallback = ((JavascriptException) exc).IAuthTabCallback();
            if (strIAuthTabCallback == null) {
                int i2 = access100 + 13;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
            } else {
                str = strIAuthTabCallback;
            }
            mapOnExtraCallbackWithResult.put("javascriptException", str);
        }
        if (reactBundleLoaderV2.asBinder.onExtraCallbackWithResult()) {
            int i4 = access100 + 119;
            IAuthTabCallbackStubProxy = i4 % 128;
            int i5 = i4 % 2;
            if (!(!z)) {
                function12.invoke(r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I.IAuthTabCallback((JavascriptException) exc));
            } else {
                function12.invoke(exc.getMessage());
            }
        }
    }

    private final ReactInstanceManager onExtraCallback(TossReactContentOwner tossReactContentOwner, final Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        int i = 2 % 2;
        ReactInstanceManager reactInstanceManagerOnExtraCallbackWithResult = onNavigationEvent().onExtraCallbackWithResult(tossReactContentOwner, new hExternalSyntheticLambda5(this.onExtraCallback, "", "metro-dev", "", "metro", "metro-dev", "", new Function1() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 89;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnWarmupCompleted = ReactBundleLoaderV2.onWarmupCompleted((Exception) obj);
                int i5 = onExtraCallbackWithResult + 69;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
                return unitOnWarmupCompleted;
            }
        }), new JSExceptionHandler() { // from class: im.toss.rn.toss.core.legacy.bundle.v2.ReactBundleLoaderV2$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final void handleException(Exception exc) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 59;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                ReactBundleLoaderV2 reactBundleLoaderV2 = this.f$0;
                if (i4 != 0) {
                    ReactBundleLoaderV2.IAuthTabCallback(reactBundleLoaderV2, function1, exc);
                } else {
                    ReactBundleLoaderV2.IAuthTabCallback(reactBundleLoaderV2, function1, exc);
                    int i5 = 22 / 0;
                }
            }
        }, true);
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            return reactInstanceManagerOnExtraCallbackWithResult;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Exception exc) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 53;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(exc, "");
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onNavigationEvent(ReactBundleLoaderV2 reactBundleLoaderV2, Function1 function1, Exception exc) {
        int i = 2 % 2;
        int i2 = access100 + 75;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            int i3 = 52 / 0;
            if (!reactBundleLoaderV2.asBinder.onExtraCallbackWithResult()) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(exc, "");
            if (!reactBundleLoaderV2.asBinder.onExtraCallbackWithResult()) {
                return;
            }
        }
        int i4 = access100;
        int i5 = i4 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        if (!(exc instanceof JavascriptException)) {
            function1.invoke(exc.getMessage());
            return;
        }
        int i7 = i4 + 17;
        IAuthTabCallbackStubProxy = i7 % 128;
        int i8 = i7 % 2;
        function1.invoke(r8lambdaFyzE0yKmm35fa3xWdPZj6qRV0I.IAuthTabCallback((JavascriptException) exc));
        int i9 = IAuthTabCallbackStubProxy + 27;
        access100 = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ReactBundleLoaderV2 reactBundleLoaderV2 = (ReactBundleLoaderV2) objArr[0];
        int i = 2 % 2;
        String strOnExtraCallback = reactBundleLoaderV2.onExtraCallback((String) objArr[1]);
        String lowerCase = reactBundleLoaderV2.asInterface.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (!StringsKt.endsWith$default(strOnExtraCallback, lowerCase + TossSecRoute.Main.PATH, false, 2, (Object) null)) {
            return strOnExtraCallback + lowerCase + TossSecRoute.Main.PATH;
        }
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 35;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 7 / 0;
        }
        return strOnExtraCallback;
    }

    private final String onExtraCallback(String str) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 123;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!StringsKt.endsWith$default(str, '/', false, 2, (Object) null)) {
            return str + TossSecRoute.Main.PATH;
        }
        int i4 = access100 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static final class LoadParams {
        private static int IAuthTabCallbackStub = 0;
        private static int onTransact = 1;
        private final TossReactContentOwner IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos asInterface;
        private final boolean onExtraCallback;
        private final Date onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final long onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 37;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadParams)) {
                return false;
            }
            LoadParams loadParams = (LoadParams) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallback, loadParams.IAuthTabCallback) || !Intrinsics.areEqual(this.asInterface, loadParams.asInterface)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, loadParams.IAuthTabCallbackDefault)) {
                int i4 = onTransact + 125;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, loadParams.onExtraCallbackWithResult)) {
                int i6 = onTransact + 63;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, loadParams.onNavigationEvent) || this.onWarmupCompleted != loadParams.onWarmupCompleted) {
                return false;
            }
            if (this.onExtraCallback == loadParams.onExtraCallback) {
                return true;
            }
            int i8 = IAuthTabCallbackStub + 29;
            onTransact = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 47;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                this.IAuthTabCallback.hashCode();
                this.asInterface.hashCode();
                this.IAuthTabCallbackDefault.hashCode();
                this.onExtraCallbackWithResult.hashCode();
                throw null;
            }
            int iHashCode2 = this.IAuthTabCallback.hashCode();
            int iHashCode3 = this.asInterface.hashCode();
            int iHashCode4 = this.IAuthTabCallbackDefault.hashCode();
            int iHashCode5 = this.onExtraCallbackWithResult.hashCode();
            String str = this.onNavigationEvent;
            if (str == null) {
                int i3 = IAuthTabCallbackStub + 103;
                onTransact = i3 % 128;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
            } else {
                iHashCode = str.hashCode();
            }
            return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + Long.hashCode(this.onWarmupCompleted)) * 31) + Boolean.hashCode(this.onExtraCallback);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "LoadParams(reactContentOwner=" + this.IAuthTabCallback + ", sharedBundleInfo=" + this.asInterface + ", serviceModuleName=" + this.IAuthTabCallbackDefault + ", serviceMinDeployedAt=" + this.onExtraCallbackWithResult + ", distributionGroup=" + this.onNavigationEvent + ", maxAge=" + this.onWarmupCompleted + ", isRetry=" + this.onExtraCallback + ")";
            int i2 = onTransact + 105;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public LoadParams(@NotNull TossReactContentOwner tossReactContentOwner, @NotNull r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, @NotNull String str, @NotNull Date date, @Nullable String str2, long j, boolean z) {
            Intrinsics.checkNotNullParameter(tossReactContentOwner, "");
            Intrinsics.checkNotNullParameter(r8lambdadtqrzfihm2ghoddvkfg5vm2yos, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(date, "");
            this.IAuthTabCallback = tossReactContentOwner;
            this.asInterface = r8lambdadtqrzfihm2ghoddvkfg5vm2yos;
            this.IAuthTabCallbackDefault = str;
            this.onExtraCallbackWithResult = date;
            this.onNavigationEvent = str2;
            this.onWarmupCompleted = j;
            this.onExtraCallback = z;
        }

        public final TossReactContentOwner onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 41;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 101;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 55;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallbackDefault;
            int i4 = i2 + 49;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final Date IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 115;
            int i3 = i2 % 128;
            IAuthTabCallbackStub = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Date date = this.onExtraCallbackWithResult;
            int i4 = i3 + 43;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 81 / 0;
            }
            return date;
        }

        public final String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 71;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final long onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 1;
            IAuthTabCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            long j = this.onWarmupCompleted;
            int i4 = i2 + 1;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 73 / 0;
            }
            return j;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub;
            int i3 = i2 + 71;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z = this.onExtraCallback;
            int i4 = i2 + 75;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted(ReactBundleLoaderV2 reactBundleLoaderV2, r8lambdaDTQRzfihM2ghODdVKFg5vm2Yos r8lambdadtqrzfihm2ghoddvkfg5vm2yos, Exception exc) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (Unit) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{reactBundleLoaderV2, r8lambdadtqrzfihm2ghoddvkfg5vm2yos, exc}, iOnExtraCallback, 731378743, -731378743);
    }

    private static final OkHttpClient onWarmupCompleted() {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (OkHttpClient) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[0], iOnExtraCallback, -1448879403, 1448879406);
    }

    private final String onNavigationEvent(String str) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return (String) onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, str}, iOnExtraCallback, 770409512, -770409511);
    }

    public final Object onExtraCallback(@NotNull LoadParams loadParams, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super String, Unit> function12, @NotNull access13800<? super hExternalSyntheticLambda15> access13800Var) {
        int iOnExtraCallback = OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback();
        return onNavigationEvent(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{this, loadParams, function1, function12, access13800Var}, iOnExtraCallback, -554203850, 554203852);
    }

    static void onExtraCallbackWithResult() {
        IAuthTabCallbackStub = (char) 58669;
        IAuthTabCallback_Parcel = (char) 34767;
        access000 = (char) 57876;
        getInterfaceDescriptor = (char) 46420;
    }
}
