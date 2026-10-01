package im.toss.uikit.widget.bridge;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.payment.ui.online.activity.OnlinePayTossOneUserCompleteActivity$;
import im.toss.features.tosscert.ui.R;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography5;
import im.toss.uikit.widget.bridge.BridgeRowV2$1$5$;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AppLovinSdkSettings;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.ConvertByteArrayToFloatArray;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.M_;
import o.SetDetectableSize;
import o.TimelineExternalSyntheticLambda1;
import o.TossModule_isAllowedByPolicy;
import o.deprecated_certificatePinner;
import o.emitEventForModule;
import o.generateLink;
import o.getAdService;
import o.getDEFAULT_CONNECTION_SPECSokhttp;
import o.getRegisteredModules;
import o.getSpecialFeatureOptInStatus;
import o.getUrlokhttp;
import o.isFireOS;
import o.isMuted;
import o.readIntokhttp;
import o.response;
import o.setProxySelectorokhttp;
import o.setVisitUrl;
import o.varyMatches;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BridgeRowV2 extends FrameLayout implements TossModule_isAllowedByPolicy {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onWarmupCompleted Companion;
    public static final int IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallbackStubProxy = 1;
    private static char IAuthTabCallback_Parcel = 0;
    private static int access000 = 0;
    private static int access100 = 0;
    private static char getInterfaceDescriptor = 0;
    private static char onTransact = 0;
    private static int readTypedObject = 1;
    private BaseTextView IAuthTabCallbackStub;
    private LinearLayout asBinder;
    private TdsImageView asInterface;
    private CharSequence onExtraCallback;
    private CardView onExtraCallbackWithResult;
    private getRegisteredModules onNavigationEvent;
    private Rally onWarmupCompleted;

    static {
        onNavigationEvent();
        Companion = new onWarmupCompleted(null);
        IAuthTabCallback = 8;
        int i = readTypedObject + 25;
        access100 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BridgeRowV2(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BridgeRowV2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ Unit IAuthTabCallback(getRegisteredModules getregisteredmodules, BridgeRowV2 bridgeRowV2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = access000 + 115;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(getregisteredmodules, bridgeRowV2, setDetectableSize);
        }
        onWarmupCompleted(getregisteredmodules, bridgeRowV2, setDetectableSize);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i)) | i8 | (~(i2 | i));
        int i10 = (~((~i2) | i6)) | (~(i6 | i));
        int i11 = (~((~i) | i7)) | i8;
        int i12 = i6 + i2 + i4 + (1821889583 * i5) + ((-349070011) * i3);
        int i13 = i12 * i12;
        int i14 = (575745661 * i6) + 325058560 + (1920428227 * i2) + (i9 * 448227522) + ((-448227522) * i10) + (448227522 * i11) + (1472200704 * i4) + (473956352 * i5) + (1723858944 * i3) + ((-1436549120) * i13);
        int i15 = (i6 * 921699331) + 387174459 + (i2 * 921699517) + (i9 * 62) + (i10 * (-62)) + (i11 * 62) + (i4 * 921699455) + (i5 * 347275089) + (i3 * 1925323067) + (i13 * 94371840);
        return i14 + ((i15 * i15) * (-174063616)) != 1 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(Function0 function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function0);
        int i4 = access000 + 49;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    public BridgeRowV2 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BridgeRowV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 73;
            access000 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 % 2;
            }
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i5 = access000 + 21;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ Rally IAuthTabCallback(BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 87;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Rally rally = bridgeRowV2.onWarmupCompleted;
        int i5 = i2 + 113;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return rally;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        BridgeRowV2 bridgeRowV2 = (BridgeRowV2) objArr[0];
        int i = 2 % 2;
        int i2 = access000 + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackStubProxy = i3;
        int i4 = i2 % 2;
        LinearLayout linearLayout = bridgeRowV2.asBinder;
        int i5 = i3 + 85;
        access000 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 80 / 0;
        }
        return linearLayout;
    }

    public static final /* synthetic */ getRegisteredModules onExtraCallback(BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = access000 + 29;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        getRegisteredModules getregisteredmodules = bridgeRowV2.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return getregisteredmodules;
    }

    public static final /* synthetic */ CardView onExtraCallbackWithResult(BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 125;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        CardView cardView = bridgeRowV2.onExtraCallbackWithResult;
        int i5 = i3 + 87;
        IAuthTabCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return cardView;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ TdsImageView onNavigationEvent(BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = access000;
        int i3 = i2 + 53;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        TdsImageView tdsImageView = bridgeRowV2.asInterface;
        int i5 = i2 + 19;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return tdsImageView;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        BridgeRowV2 bridgeRowV2 = (BridgeRowV2) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy;
        int i3 = i2 + 69;
        access000 = i3 % 128;
        int i4 = i3 % 2;
        BaseTextView baseTextView = bridgeRowV2.IAuthTabCallbackStub;
        int i5 = i2 + 119;
        access000 = i5 % 128;
        int i6 = i5 % 2;
        return baseTextView;
    }

    public static final /* synthetic */ void onNavigationEvent(BridgeRowV2 bridgeRowV2, Rally rally) {
        int i = 2 % 2;
        int i2 = access000 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        bridgeRowV2.onWarmupCompleted = rally;
        if (i3 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ CharSequence onWarmupCompleted(BridgeRowV2 bridgeRowV2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + Imgproc.COLOR_YUV2RGBA_YVYU;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CharSequence charSequence = bridgeRowV2.onExtraCallback;
        if (i3 == 0) {
            return charSequence;
        }
        throw null;
    }

    @Override // o.TossModule_isAllowedByPolicy
    public /* synthetic */ View IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 75;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            return onExtraCallbackWithResult();
        }
        onExtraCallbackWithResult();
        throw null;
    }

    public static final class IAuthTabCallbackDefault implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallbackDefault(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                    return getSpecialFeatureOptInStatus.Light;
                }
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = onWarmupCompleted + 55;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return getspecialfeatureoptinstatus;
            }
            readIntokhttp.onExtraCallback(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static final class asInterface implements getAdService {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onExtraCallback;

        public asInterface(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus;
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onExtraCallback)) {
                return getSpecialFeatureOptInStatus.Light;
            }
            int i2 = onWarmupCompleted + 125;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
                int i3 = 24 / 0;
            } else {
                getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Dark;
            }
            int i4 = onWarmupCompleted + 69;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onTransact implements getAdService {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ Configuration onNavigationEvent;

        public onTransact(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            if (readIntokhttp.onExtraCallback(this.onNavigationEvent)) {
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onWarmupCompleted + 11;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return getspecialfeatureoptinstatus;
        }
    }

    public static final class onExtraCallbackWithResult implements View.OnAttachStateChangeListener {
        private static int onExtraCallback = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onExtraCallback IAuthTabCallback;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ CardView onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
        }

        public onExtraCallbackWithResult(View view, CardView cardView, onExtraCallback onextracallback) {
            this.onExtraCallbackWithResult = view;
            this.onNavigationEvent = cardView;
            this.IAuthTabCallback = onextracallback;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 123;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
                this.onNavigationEvent.addOnLayoutChangeListener(this.IAuthTabCallback);
                int i3 = 93 / 0;
            } else {
                this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
                this.onNavigationEvent.addOnLayoutChangeListener(this.IAuthTabCallback);
            }
            int i4 = onWarmupCompleted + 87;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 90 / 0;
            }
        }
    }

    public static final class IAuthTabCallback implements View.OnTouchListener {
        final /* synthetic */ Context onExtraCallback;
        private float onExtraCallbackWithResult = -1.0f;
        private static final byte[] $$a = {93, -40, 95, -94};
        private static final int $$b = 42;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static char[] onWarmupCompleted = {60832, 12395, 22056, 29923, 60832, 12411, 22060, 29930, 39593};
        private static long onNavigationEvent = 655563527389851666L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(int i, short s, int i2) {
            int i3;
            int i4 = 97 - (i2 * 2);
            int i5 = i * 4;
            int i6 = s + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            if (bArr == null) {
                int i8 = i7;
                int i9 = i6;
                i3 = 0;
                int i10 = i9;
                i4 = i6 + i8;
                i6 = i10;
                bArr2[i3] = (byte) i4;
                if (i3 == i7) {
                    return new String(bArr2, 0);
                }
                int i11 = i6 + 1;
                i8 = bArr[i11];
                i3++;
                int i12 = i4;
                i9 = i11;
                i6 = i12;
                int i102 = i9;
                i4 = i6 + i8;
                i6 = i102;
                bArr2[i3] = (byte) i4;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                if (i3 == i7) {
                }
            }
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 111;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback();
            int i4 = IAuthTabCallbackDefault + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onExtraCallbackWithResult(BridgeRowV2 bridgeRowV2, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 15;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                onExtraCallback(bridgeRowV2, setDetectableSize);
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(bridgeRowV2, setDetectableSize);
            int i3 = IAuthTabCallbackDefault + 75;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
            return unitOnExtraCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x0311  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0312  */
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
                int i4 = $10 + 87;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(onWarmupCompleted[i / i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - Color.green(0)), 'A' - AndroidCharacter.getMirror('0'), 10972 - ExpandableListView.getPackedPositionChild(0L), 919452672, false, "c", new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 46134), 31 - (Process.myTid() >> 22), Color.argb(0, 0, 0, 0) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                        if (objOnExtraCallback3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b - 1);
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 44 - View.resolveSize(0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1494, -1657859959, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } else {
                    int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                    Object[] objArr5 = {Integer.valueOf(onWarmupCompleted[i + i6])};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.resolveSizeAndState(0, 0, 0)), 17 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.getOffsetAfter(_UrlKt.FRAGMENT_ENCODE_SET, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(onNavigationEvent), Integer.valueOf(c)};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46134 - (Process.myTid() >> 22)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 31, 20220 - View.MeasureSpec.getMode(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback6 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 49123), KeyEvent.normalizeMetaState(0) + 44, 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1657859959, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
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
                int i7 = $11 + 73;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                    Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback7 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 - 1);
                        objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionChild(j) + 49124), 44 - TextUtils.getCapsMode(_UrlKt.FRAGMENT_ENCODE_SET, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1494, -1657859959, false, $$c(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback7).invoke(null, objArr8);
                    throw null;
                }
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback8 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0) + 49123), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43, 1494 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), -1657859959, false, $$c(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback8).invoke(null, objArr9);
                j = 0;
            }
            objArr[0] = new String(cArr);
        }

        IAuthTabCallback(Context context) {
            this.onExtraCallback = context;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int iOnNavigationEvent;
            CardView cardView;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                Rally rallyIAuthTabCallback = BridgeRowV2.IAuthTabCallback(BridgeRowV2.this);
                if (rallyIAuthTabCallback != null) {
                    rallyIAuthTabCallback.ICustomTabsServiceStub();
                }
                this.onExtraCallbackWithResult = motionEvent.getRawY();
                return true;
            }
            View view2 = null;
            if (action != 1) {
                if (action == 2) {
                    float fMin = Math.min(0.0f, motionEvent.getRawY() - this.onExtraCallbackWithResult);
                    View viewOnExtraCallbackWithResult = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                    if (viewOnExtraCallbackWithResult == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                        viewOnExtraCallbackWithResult = null;
                    }
                    float bottom = viewOnExtraCallbackWithResult.getBottom();
                    float f = (fMin + bottom) / bottom;
                    View viewOnExtraCallbackWithResult2 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                    if (viewOnExtraCallbackWithResult2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                        viewOnExtraCallbackWithResult2 = null;
                    }
                    viewOnExtraCallbackWithResult2.setTranslationY((-r3) * (1.0f - f));
                    View viewOnExtraCallbackWithResult3 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                    if (viewOnExtraCallbackWithResult3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    } else {
                        view2 = viewOnExtraCallbackWithResult3;
                    }
                    view2.setAlpha(f);
                    return true;
                }
                int i2 = IAuthTabCallbackStub + 65;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                if (action != 3 && action != 4) {
                    int i5 = i3 + 89;
                    IAuthTabCallbackStub = i5 % 128;
                    return i5 % 2 == 0;
                }
            }
            if (((LinearLayout) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 850557442, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -850557441)).getOrientation() == 0) {
                View viewOnExtraCallbackWithResult4 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                if (viewOnExtraCallbackWithResult4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    viewOnExtraCallbackWithResult4 = null;
                }
                iOnNavigationEvent = viewOnExtraCallbackWithResult4.getMeasuredHeight() / 2;
            } else {
                DisplayMetrics displayMetrics = this.onExtraCallback.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
                iOnNavigationEvent = varyMatches.onNavigationEvent(54, displayMetrics);
            }
            int i6 = -iOnNavigationEvent;
            View viewOnExtraCallbackWithResult5 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
            if (viewOnExtraCallbackWithResult5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                viewOnExtraCallbackWithResult5 = null;
            }
            if (viewOnExtraCallbackWithResult5.getTranslationY() < i6) {
                BridgeRowV2.this.IAuthTabCallback((Function0<Unit>) new BridgeRowV2$1$5$.ExternalSyntheticLambda0());
                ConvertByteArrayToFloatArray.onExtraCallback(1230627L, false, (String) null, (Map) null, new BridgeRowV2$1$5$.ExternalSyntheticLambda1(BridgeRowV2.this), 14, (Object) null);
            } else {
                BridgeRowV2 bridgeRowV2 = BridgeRowV2.this;
                CardView cardViewOnExtraCallbackWithResult = BridgeRowV2.onExtraCallbackWithResult(bridgeRowV2);
                if (cardViewOnExtraCallbackWithResult == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    cardView = null;
                } else {
                    cardView = cardViewOnExtraCallbackWithResult;
                }
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                View viewOnExtraCallbackWithResult6 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                if (viewOnExtraCallbackWithResult6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    viewOnExtraCallbackWithResult6 = null;
                }
                AppLovinSdkSettings interfaceDescriptor = isMuted.getInterfaceDescriptor(appLovinSdkSettings, Float.valueOf(viewOnExtraCallbackWithResult6.getTranslationY()), Float.valueOf(0.0f), (Function1) null, 4, (Object) null);
                View viewOnExtraCallbackWithResult7 = BridgeRowV2.onExtraCallbackWithResult(BridgeRowV2.this);
                if (viewOnExtraCallbackWithResult7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                    viewOnExtraCallbackWithResult7 = null;
                }
                Rally rally = (Rally) RallysKt.onWarmupCompleted(new Object[]{cardView, isMuted.onNavigationEvent(interfaceDescriptor, Float.valueOf(viewOnExtraCallbackWithResult7.getAlpha()), Float.valueOf(1.0f), (Function1) null, 4, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
                isFireOS.onExtraCallbackWithResult(rally, false, 1, (Object) null);
                BridgeRowV2.onNavigationEvent(bridgeRowV2, rally);
            }
            int i7 = IAuthTabCallbackDefault + 47;
            IAuthTabCallbackStub = i7 % 128;
            if (i7 % 2 != 0) {
                return true;
            }
            throw null;
        }

        private static final Unit onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 71;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final Unit onExtraCallback(BridgeRowV2 bridgeRowV2, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 19;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(setDetectableSize, "");
            Object[] objArr = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0), 4 - ((Process.getThreadPriority(0) + 20) >> 6), (char) View.MeasureSpec.getMode(0), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), BridgeRowV2.onExtraCallback(bridgeRowV2).getType());
            Object[] objArr2 = new Object[1];
            a(4 - (Process.myTid() >> 22), 5 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getScrollBarSize() >> 8), objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{bridgeRowV2}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).getText());
            Unit unit = Unit.INSTANCE;
            int i4 = IAuthTabCallbackDefault + 55;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i4 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i5 = $10 + 17;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % 2 == 0) {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % 1];
                i2 = 1;
            } else {
                cArr3[i4] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i2 = i4;
            }
            while (i2 < 16) {
                int i7 = $11 + 75;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i4];
                int i9 = (c2 + i6) ^ ((c2 << 4) + ((char) (getInterfaceDescriptor ^ 1094535280733222934L)));
                int i10 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallback_Parcel);
                    objArr2[2] = Integer.valueOf(i10);
                    objArr2[1] = Integer.valueOf(i9);
                    objArr2[i4] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 10;
                        int i11 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i4] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, touchSlop, i11, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i4]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (onTransact ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackDefault)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 1), 9 - Process.getGidForName(_UrlKt.FRAGMENT_ENCODE_SET), 12434 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i2++;
                    cArr3 = cArr4;
                    i4 = 0;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16013 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 13, 19900 - TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0', 0), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i4 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final class onExtraCallback implements View.OnLayoutChangeListener {
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface;
        final /* synthetic */ Context IAuthTabCallback;
        final /* synthetic */ int IAuthTabCallbackDefault;
        final /* synthetic */ CardView onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ int onNavigationEvent;
        final /* synthetic */ int onWarmupCompleted;

        onExtraCallback(int i, int i2, Context context, CardView cardView, int i3, int i4) {
            this.onExtraCallbackWithResult = i;
            this.onWarmupCompleted = i2;
            this.IAuthTabCallback = context;
            this.onExtraCallback = cardView;
            this.IAuthTabCallbackDefault = i3;
            this.onNavigationEvent = i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x01f5  */
        @Override // android.view.View.OnLayoutChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            CharSequence charSequenceOnWarmupCompleted;
            int i9;
            int i10 = 2 % 2;
            int i11 = IAuthTabCallbackStub + 93;
            asInterface = i11 % 128;
            int i12 = i11 % 2;
            int measuredWidth = BridgeRowV2.onNavigationEvent(BridgeRowV2.this).getMeasuredWidth();
            CharSequence text = ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).getText();
            float fMeasureText = ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).getPaint().measureText(text.toString());
            float f = this.onExtraCallbackWithResult + this.onWarmupCompleted + measuredWidth;
            int iIntValue = ((Integer) M_.onNavigationEvent(-2118175014, new Object[]{M_.onExtraCallback, this.IAuthTabCallback}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 2118175019, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent())).intValue();
            DisplayMetrics displayMetrics = this.IAuthTabCallback.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
            int iOnNavigationEvent = varyMatches.onNavigationEvent(48, displayMetrics);
            Intrinsics.checkNotNull(text);
            if (StringsKt__StringsKt.contains$default(text, (CharSequence) "\n", false, 2, (Object) null) || f + fMeasureText >= iIntValue - (iOnNavigationEvent << 1) || !((charSequenceOnWarmupCompleted = BridgeRowV2.onWarmupCompleted(BridgeRowV2.this)) == null || charSequenceOnWarmupCompleted.length() == 0)) {
                if (emitEventForModule.onExtraCallback(BridgeRowV2.onExtraCallback(BridgeRowV2.this))) {
                    BridgeRowV2.onNavigationEvent(BridgeRowV2.this).setVisibility(0);
                    BridgeRowV2.onNavigationEvent(BridgeRowV2.this).setImageResource(emitEventForModule.onExtraCallback(this.onExtraCallback, BridgeRowV2.onExtraCallback(BridgeRowV2.this)));
                    TdsImageView tdsImageViewOnNavigationEvent = BridgeRowV2.onNavigationEvent(BridgeRowV2.this);
                    CardView cardView = this.onExtraCallback;
                    Context context = this.IAuthTabCallback;
                    ViewGroup.LayoutParams layoutParams = tdsImageViewOnNavigationEvent.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    int iOnTransact = varyMatches.onTransact(cardView, 18);
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
                    layoutParams.height = Math.min(iOnTransact, varyMatches.onNavigationEvent(18, displayMetrics2));
                    tdsImageViewOnNavigationEvent.setLayoutParams(layoutParams);
                } else {
                    BridgeRowV2.onNavigationEvent(BridgeRowV2.this).setVisibility(8);
                }
                BaseTextView baseTextView = (BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498);
                Context context2 = this.IAuthTabCallback;
                ViewGroup.LayoutParams layoutParams2 = baseTextView.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                DisplayMetrics displayMetrics3 = context2.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
                marginLayoutParams.topMargin = varyMatches.onNavigationEvent(6, displayMetrics3);
                baseTextView.setLayoutParams(marginLayoutParams);
                ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).setGravity(1);
                CardView cardView2 = this.onExtraCallback;
                Context context3 = this.IAuthTabCallback;
                ViewGroup.LayoutParams layoutParams3 = cardView2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                DisplayMetrics displayMetrics4 = context3.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
                marginLayoutParams2.leftMargin = varyMatches.onNavigationEvent(54, displayMetrics4);
                DisplayMetrics displayMetrics5 = context3.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
                marginLayoutParams2.rightMargin = varyMatches.onNavigationEvent(54, displayMetrics5);
                cardView2.setLayoutParams(marginLayoutParams2);
                CardView cardView3 = this.onExtraCallback;
                int i13 = this.onNavigationEvent;
                DisplayMetrics displayMetrics6 = this.IAuthTabCallback.getResources().getDisplayMetrics();
                Intrinsics.checkNotNullExpressionValue(displayMetrics6, "");
                cardView3.setContentPadding(i13, varyMatches.onNavigationEvent(16, displayMetrics6), this.onNavigationEvent, this.IAuthTabCallbackDefault);
                ((LinearLayout) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 850557442, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -850557441)).setOrientation(1);
                CardView cardView4 = this.onExtraCallback;
                Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.getResources().getDisplayMetrics(), "");
                cardView4.setRadius(varyMatches.onNavigationEvent(16, r4));
                int i14 = IAuthTabCallbackStub + 7;
                asInterface = i14 % 128;
                int i15 = i14 % 2;
            } else {
                BaseTextView baseTextView2 = (BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498);
                ViewGroup.LayoutParams layoutParams4 = baseTextView2.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams3.topMargin = 0;
                baseTextView2.setLayoutParams(marginLayoutParams3);
                ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).setGravity(8388611);
                CardView cardView5 = this.onExtraCallback;
                ViewGroup.LayoutParams layoutParams5 = cardView5.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                int i16 = asInterface + 29;
                IAuthTabCallbackStub = i16 % 128;
                int i17 = i16 % 2;
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                marginLayoutParams4.leftMargin = 0;
                marginLayoutParams4.rightMargin = 0;
                cardView5.setLayoutParams(marginLayoutParams4);
                CardView cardView6 = this.onExtraCallback;
                int i18 = this.onExtraCallbackWithResult;
                int i19 = this.IAuthTabCallbackDefault;
                cardView6.setContentPadding(i18, i19, this.onWarmupCompleted, i19);
                ((LinearLayout) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 850557442, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -850557441)).setOrientation(0);
                CardView cardView7 = this.onExtraCallback;
                if (Build.VERSION.SDK_INT >= 28) {
                    int i20 = IAuthTabCallbackStub;
                    int i21 = i20 + 73;
                    asInterface = i21 % 128;
                    if (i21 % 2 != 0) {
                        int i22 = asInterface + 93;
                        IAuthTabCallbackStub = i22 % 128;
                        int i23 = i22 % 2;
                        i9 = 24;
                    } else {
                        int i24 = i20 + 5;
                        asInterface = i24 % 128;
                        i9 = i24 % 2 != 0 ? 30917 : 500;
                    }
                    Intrinsics.checkNotNullExpressionValue(this.IAuthTabCallback.getResources().getDisplayMetrics(), "");
                    cardView7.setRadius(varyMatches.onNavigationEvent(Integer.valueOf(i9), r4));
                }
            }
            if (measuredWidth > 0) {
                CharSequence text2 = ((BaseTextView) BridgeRowV2.onExtraCallback(new Object[]{BridgeRowV2.this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498)).getText();
                Intrinsics.checkNotNullExpressionValue(text2, "");
                if (text2.length() > 0) {
                    int i25 = IAuthTabCallbackStub + 25;
                    asInterface = i25 % 128;
                    if (i25 % 2 != 0) {
                        this.onExtraCallback.removeOnLayoutChangeListener(this);
                        int i26 = 57 / 0;
                    } else {
                        this.onExtraCallback.removeOnLayoutChangeListener(this);
                    }
                    int i27 = asInterface + 17;
                    IAuthTabCallbackStub = i27 % 128;
                    int i28 = i27 % 2;
                }
            }
        }
    }

    public static final class onNavigationEvent implements View.OnAttachStateChangeListener {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ onExtraCallback IAuthTabCallback;
        final /* synthetic */ CardView onExtraCallback;
        final /* synthetic */ View onNavigationEvent;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 77;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent(View view, CardView cardView, onExtraCallback onextracallback) {
            this.onNavigationEvent = view;
            this.onExtraCallback = cardView;
            this.IAuthTabCallback = onextracallback;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 39;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                this.onNavigationEvent.removeOnAttachStateChangeListener(this);
                this.onExtraCallback.removeOnLayoutChangeListener(this.IAuthTabCallback);
                int i3 = 82 / 0;
            } else {
                this.onNavigationEvent.removeOnAttachStateChangeListener(this);
                this.onExtraCallback.removeOnLayoutChangeListener(this.IAuthTabCallback);
            }
        }
    }

    public static final class IAuthTabCallbackStub implements getAdService {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ Configuration onWarmupCompleted;

        public IAuthTabCallbackStub(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (!readIntokhttp.onExtraCallback(this.onWarmupCompleted)) {
                getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
                int i2 = onNavigationEvent + 45;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getspecialfeatureoptinstatus;
            }
            int i4 = onExtraCallback + 27;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus2 = getSpecialFeatureOptInStatus.Dark;
            if (i5 == 0) {
                return getspecialfeatureoptinstatus2;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTossCommunityBridge(@NotNull final getRegisteredModules getregisteredmodules, @Nullable CharSequence charSequence) {
        int iRgb;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getregisteredmodules, "");
        this.onNavigationEvent = getregisteredmodules;
        this.onExtraCallback = charSequence;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence == null || charSequence.length() == 0) {
            Integer numValueOf = Integer.valueOf(getregisteredmodules.getLabel());
            Integer num = null;
            if (numValueOf.intValue() == 0) {
                int i2 = access000 + 11;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                numValueOf = null;
            }
            if (numValueOf != null) {
                int i4 = access000 + 59;
                IAuthTabCallbackStubProxy = i4 % 128;
                if (i4 % 2 == 0) {
                    getContext().getString(numValueOf.intValue());
                    num.hashCode();
                    throw null;
                }
                String string = getContext().getString(numValueOf.intValue());
                if (string == null) {
                    string = _UrlKt.FRAGMENT_ENCODE_SET;
                }
                Integer numValueOf2 = Integer.valueOf(getregisteredmodules.getDefaultMessage());
                if (numValueOf2.intValue() != 0) {
                    int i5 = IAuthTabCallbackStubProxy + 25;
                    access000 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    num = numValueOf2;
                }
                if (num != null) {
                    spannableStringBuilder.append((CharSequence) getContext().getString(num.intValue(), string));
                }
                int iIndexOf$default = string.length() == 0 ? -1 : StringsKt__StringsKt.indexOf$default((CharSequence) spannableStringBuilder, string, 0, false, 6, (Object) null);
                if (iIndexOf$default >= 0) {
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        Configuration configuration = context2.getResources().getConfiguration();
                        Intrinsics.checkNotNullExpressionValue(configuration, "");
                        iRgb = new getUrlokhttp(new onTransact(configuration)).asBinder();
                    } else {
                        iRgb = Color.rgb(0, 100, 255);
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(iRgb), iIndexOf$default, string.length() + iIndexOf$default, 33);
                }
            }
        } else {
            int i6 = access000 + 27;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                spannableStringBuilder.append(charSequence);
                int i7 = 52 / 0;
            } else {
                spannableStringBuilder.append(charSequence);
            }
        }
        if (emitEventForModule.onExtraCallback(getregisteredmodules)) {
            int i8 = access000 + 91;
            IAuthTabCallbackStubProxy = i8 % 128;
            if (i8 % 2 == 0) {
                this.asInterface.setVisibility(1);
            } else {
                this.asInterface.setVisibility(0);
            }
            this.asInterface.setImageResource(im.toss.uikit.R.drawable.logo_only_icon_small);
        } else {
            this.asInterface.setVisibility(8);
        }
        this.IAuthTabCallbackStub.setText(spannableStringBuilder);
        ConvertByteArrayToFloatArray.onExtraCallback(1230625L, false, (String) null, (Map) null, new Function1() { // from class: im.toss.uikit.widget.bridge.BridgeRowV2$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                int i9 = 2 % 2;
                int i10 = onWarmupCompleted + 77;
                onExtraCallbackWithResult = i10 % 128;
                int i11 = i10 % 2;
                getRegisteredModules getregisteredmodules2 = getregisteredmodules;
                if (i11 != 0) {
                    return BridgeRowV2.IAuthTabCallback(getregisteredmodules2, this, (SetDetectableSize) obj);
                }
                BridgeRowV2.IAuthTabCallback(getregisteredmodules2, this, (SetDetectableSize) obj);
                throw null;
            }
        }, 14, (Object) null);
    }

    private static final Unit onWarmupCompleted(getRegisteredModules getregisteredmodules, BridgeRowV2 bridgeRowV2, SetDetectableSize setDetectableSize) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(setDetectableSize, "");
        Object[] objArr = new Object[1];
        a(new char[]{41657, 64210, 45968, 35902}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr);
        setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), getregisteredmodules.getType());
        Object[] objArr2 = new Object[1];
        a(new char[]{24425, 38186, 16069, 62911, 50937, 33129}, TextUtils.indexOf(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, 0, 0) + 5, objArr2);
        setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), bridgeRowV2.IAuthTabCallbackStub.getText());
        Unit unit = Unit.INSTANCE;
        int i4 = IAuthTabCallbackStubProxy + 113;
        access000 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return unit;
    }

    private static final Unit onNavigationEvent(Function0 function0) {
        Unit unit;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            function0.invoke();
            unit = Unit.INSTANCE;
            int i3 = 3 / 0;
        } else {
            function0.invoke();
            unit = Unit.INSTANCE;
        }
        int i4 = access000 + 17;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.TossModule_isAllowedByPolicy
    public void IAuthTabCallback(@NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        Rally rally = this.onWarmupCompleted;
        Object obj = null;
        if (rally != null) {
            int i2 = IAuthTabCallbackStubProxy + 103;
            access000 = i2 % 128;
            if (i2 % 2 != 0) {
                rally.ICustomTabsServiceStub();
                obj.hashCode();
                throw null;
            }
            rally.ICustomTabsServiceStub();
        }
        CardView cardView = this.onExtraCallbackWithResult;
        if (cardView == null) {
            int i3 = IAuthTabCallbackStubProxy + 95;
            access000 = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i4 != 0) {
                throw null;
            }
            cardView = null;
        }
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asBinder()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        View view = this.onExtraCallbackWithResult;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            view = null;
        }
        isFireOS.onExtraCallbackWithResult((Rally) Rally.onWarmupCompleted(OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), -2128644225, OnlinePayTossOneUserCompleteActivity$.ExternalSyntheticLambda0.onExtraCallback(), new Object[]{(Rally) RallysKt.onWarmupCompleted(new Object[]{cardView, isMuted.onNavigationEvent(isMuted.getInterfaceDescriptor(appLovinSdkSettings, (Float) null, Float.valueOf(-view.getBottom()), (Function1) null, 5, (Object) null), (Float) null, Float.valueOf(0.0f), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025), null, new Function0() { // from class: im.toss.uikit.widget.bridge.BridgeRowV2$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 109;
                onNavigationEvent = i6 % 128;
                if (i6 % 2 == 0) {
                    BridgeRowV2.onWarmupCompleted(function0);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                Unit unitOnWarmupCompleted = BridgeRowV2.onWarmupCompleted(function0);
                int i7 = onNavigationEvent + 81;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 19 / 0;
                }
                return unitOnWarmupCompleted;
            }
        }, 1, null}, 2128644226), false, 1, (Object) null);
        int i5 = IAuthTabCallbackStubProxy + 3;
        access000 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BridgeRowV2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        int iOnPostMessage;
        int iOnWarmupCompleted;
        int i2;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = getRegisteredModules.None;
        if (getLayoutParams() == null) {
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        CardView cardView = new CardView(context);
        Class cls = Integer.TYPE;
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) FrameLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.gravity = 1;
        int iIAuthTabCallbackStub = M_.onExtraCallback.IAuthTabCallbackStub(context);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        layoutParams2.topMargin = iIAuthTabCallbackStub + varyMatches.onNavigationEvent(2, displayMetrics);
        cardView.setLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        cardView.setCardElevation(varyMatches.onNavigationEvent(30, r5));
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            int i3 = access000 + 99;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            iOnPostMessage = 0;
        } else {
            Context context2 = cardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            iOnPostMessage = new getUrlokhttp(new IAuthTabCallbackDefault(configuration)).onPostMessage();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            cardView.setOutlineAmbientShadowColor(iOnPostMessage);
            cardView.setOutlineSpotShadowColor(iOnPostMessage);
        }
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(20, displayMetrics2);
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "");
        int iOnNavigationEvent2 = varyMatches.onNavigationEvent(16, displayMetrics3);
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "");
        int iOnNavigationEvent3 = varyMatches.onNavigationEvent(35, displayMetrics4);
        DisplayMetrics displayMetrics5 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics5, "");
        int iOnNavigationEvent4 = varyMatches.onNavigationEvent(12, displayMetrics5);
        cardView.setContentPadding(iOnNavigationEvent2, iOnNavigationEvent4, iOnNavigationEvent, iOnNavigationEvent4);
        if (((Boolean) generateLink.onExtraCallbackWithResult(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), -194147640, new Object[]{context}, 194147643, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback())).booleanValue()) {
            Context context3 = cardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            Configuration configuration2 = context3.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration2, "");
            iOnWarmupCompleted = ((Integer) getUrlokhttp.onNavigationEvent(new Object[]{new getUrlokhttp(new asInterface(configuration2))}, -880609169, 880609173, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue();
        } else {
            Context context4 = cardView.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            Resources resources = context4.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            Configuration configuration3 = resources.getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration3, "");
            iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new IAuthTabCallbackStub(configuration3)).onWarmupCompleted();
        }
        cardView.setCardBackgroundColor(iOnWarmupCompleted);
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) ViewGroup.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams3);
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        Context context5 = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        TdsImageView tdsImageView = new TdsImageView(context5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        ViewGroup.LayoutParams layoutParams4 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
        layoutParams5.width = -2;
        layoutParams5.height = varyMatches.onTransact(tdsImageView, 24);
        tdsImageView.setLayoutParams(layoutParams4);
        tdsImageView.setAdjustViewBounds(true);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, tdsImageView);
        this.asInterface = tdsImageView;
        BaseTextView baseTextView = (BaseTextView) Typography5.class.getDeclaredConstructor(Context.class).newInstance(linearLayout.getContext());
        Intrinsics.checkNotNull(baseTextView);
        ViewGroup.LayoutParams layoutParams6 = (ViewGroup.LayoutParams) LinearLayout.LayoutParams.class.getDeclaredConstructor(cls, cls).newInstance(-1, -2);
        Intrinsics.checkNotNull(layoutParams6);
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
        layoutParams7.width = -2;
        layoutParams7.height = -2;
        baseTextView.setLayoutParams(layoutParams6);
        baseTextView.onNavigationEvent(response.Bold);
        Intrinsics.checkNotNull(baseTextView);
        setProxySelectorokhttp.onExtraCallbackWithResult(linearLayout, baseTextView);
        this.IAuthTabCallbackStub = baseTextView;
        this.asBinder = linearLayout;
        cardView.addView(linearLayout);
        onExtraCallback onextracallback = new onExtraCallback(iOnNavigationEvent2, iOnNavigationEvent, context, cardView, iOnNavigationEvent4, iOnNavigationEvent3);
        if (cardView.isAttachedToWindow()) {
            int i6 = access000 + 49;
            IAuthTabCallbackStubProxy = i6 % 128;
            if (i6 % 2 == 0) {
                cardView.addOnLayoutChangeListener(onextracallback);
                throw null;
            }
            cardView.addOnLayoutChangeListener(onextracallback);
            i2 = 2;
        } else {
            cardView.addOnAttachStateChangeListener(new onExtraCallbackWithResult(cardView, cardView, onextracallback));
            int i7 = IAuthTabCallbackStubProxy + 65;
            access000 = i7 % 128;
            i2 = 2;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
        }
        if (cardView.isAttachedToWindow()) {
            cardView.addOnAttachStateChangeListener(new onNavigationEvent(cardView, cardView, onextracallback));
        } else {
            cardView.removeOnLayoutChangeListener(onextracallback);
            int i9 = i2 % i2;
        }
        cardView.setOnTouchListener(new IAuthTabCallback(context));
        this.onExtraCallbackWithResult = cardView;
        addView(cardView);
        int i10 = access000 + 55;
        IAuthTabCallbackStubProxy = i10 % 128;
        int i11 = i10 % 2;
    }

    public static final /* synthetic */ BaseTextView IAuthTabCallbackStub(BridgeRowV2 bridgeRowV2) {
        return (BaseTextView) onExtraCallback(new Object[]{bridgeRowV2}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -280191498, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 280191498);
    }

    public static final /* synthetic */ LinearLayout onTransact(BridgeRowV2 bridgeRowV2) {
        return (LinearLayout) onExtraCallback(new Object[]{bridgeRowV2}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 850557442, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -850557441);
    }

    static void onNavigationEvent() {
        onTransact = (char) 22383;
        IAuthTabCallbackDefault = (char) 20998;
        getInterfaceDescriptor = (char) 43798;
        IAuthTabCallback_Parcel = (char) 29240;
    }
}
