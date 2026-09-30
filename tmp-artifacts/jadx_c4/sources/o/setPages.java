package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
import im.toss.facepay.validation.model.init.config.QualityModelConfig;
import im.toss.facepay.validation.model.init.config.ServiceConfig;
import im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SendMtopParams;
import o.addDatas2Performance;
import o.isTiny;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.core.Mat;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class setPages {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 0;
    private static int asBinder = 1;
    private static char[] asInterface = {27176, 27295, 27293, 27288, 27282, 27284, 27286, 27286, 27295, 27367, 27362, 27288, 27288, 27286, 27389, 27333, 27360, 27294, 27291, 27284, 27284, 27293, 27390, 27333, 27364, 27293, 27286, 27292, 27267, 27269, 27367, 27333, 27360, 27295, 27287, 27282, 27290, 27293, 27386, 27333, 27361, 27287, 27388, 27360, 27290, 27264, 27268};
    private final requestInnerSync IAuthTabCallback;
    private final addData IAuthTabCallbackStub;
    private final AtomicBoolean onExtraCallback;
    private final AtomicBoolean onExtraCallbackWithResult;
    private final SendMtopParams onNavigationEvent;
    private volatile setUseDynamicPlugins onTransact;
    private final IMtopProxy onWarmupCompleted;

    public final /* synthetic */ class IAuthTabCallback {
        private static int onExtraCallbackWithResult = 1;
        public static final /* synthetic */ int[] onNavigationEvent;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[RVPub.values().length];
            try {
                iArr[RVPub.IMAGE_BRIGHTNESS_TOO_HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RVPub.IMAGE_BRIGHTNESS_TOO_LOW.ordinal()] = 2;
                int i = onExtraCallbackWithResult + 75;
                onWarmupCompleted = i % 128;
                if (i % 2 == 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused2) {
            }
            onNavigationEvent = iArr;
            int i3 = onWarmupCompleted + 15;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    static final class onExtraCallbackWithResult extends ContinuationImpl {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallbackWithResult(access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallback + 111;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object obj2 = null;
            Object objOnExtraCallbackWithResult = setPages.this.onExtraCallbackWithResult(null, this);
            int i4 = onExtraCallback + 83;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallbackWithResult;
            }
            obj2.hashCode();
            throw null;
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        private static int onNavigationEvent = 1;
        private static int onWarmupCompleted;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 17;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object[] objArr = {setPages.this, null, null, this};
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
            if (i3 != 0) {
                setPages.onExtraCallbackWithResult(iIAuthTabCallback2, objArr, iIAuthTabCallback4, -1793306367, iIAuthTabCallback, 1793306367, iIAuthTabCallback3);
                throw null;
            }
            Object objOnExtraCallbackWithResult = setPages.onExtraCallbackWithResult(iIAuthTabCallback2, objArr, iIAuthTabCallback4, -1793306367, iIAuthTabCallback, 1793306367, iIAuthTabCallback3);
            int i4 = onWarmupCompleted + 63;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) throws Throwable {
        int i7 = ~i4;
        int i8 = (~(i7 | i5)) | i3;
        int i9 = ~i3;
        int i10 = ~(i9 | i5 | i4);
        int i11 = (~(i4 | i9)) | i5 | (~(i7 | i3));
        int i12 = i5 + i3 + i + ((-381402339) * i6) + ((-2062754392) * i2);
        int i13 = i12 * i12;
        int i14 = (1317609343 * i5) + 1063714816 + (1288888451 * i3) + (i8 * 14360446) + (14360446 * i10) + ((-14360446) * i11) + (1303248896 * i) + (1454768128 * i6) + (808452096 * i2) + ((-1790509056) * i13);
        int i15 = ((i5 * (-1355236691)) - 921838429) + (i3 * (-1355236103)) + (i8 * (-294)) + (i10 * (-294)) + (i11 * 294) + (i * (-1355236397)) + (i6 * (-1583251481)) + (i2 * 1682205048) + (i13 * (-427491328));
        if (i14 + (i15 * i15 * 844169216) == 1) {
            setPages setpages = (setPages) objArr[0];
            setUseDynamicPlugins setusedynamicplugins = (setUseDynamicPlugins) objArr[1];
            int i16 = 2 % 2;
            int i17 = asBinder + 61;
            IAuthTabCallbackDefault = i17 % 128;
            int i18 = i17 % 2;
            setpages.onTransact = setusedynamicplugins;
            int i19 = IAuthTabCallbackDefault + 81;
            asBinder = i19 % 128;
            int i20 = i19 % 2;
            return null;
        }
        setPages setpages2 = (setPages) objArr[0];
        Mat mat = (Mat) objArr[1];
        requestInnerAsync requestinnerasync = (requestInnerAsync) objArr[2];
        access13800<? super addDatas2Performance> access13800Var = (access13800) objArr[3];
        int i21 = 2 % 2;
        int i22 = asBinder + 37;
        IAuthTabCallbackDefault = i22 % 128;
        int i23 = i22 % 2;
        Object objOnNavigationEvent = setpages2.onNavigationEvent(mat, requestinnerasync, access13800Var);
        int i24 = asBinder + 31;
        IAuthTabCallbackDefault = i24 % 128;
        int i25 = i24 % 2;
        return objOnNavigationEvent;
    }

    public setPages(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallback = new AtomicBoolean(false);
        this.onExtraCallbackWithResult = new AtomicBoolean(false);
        IMtopProxy iMtopProxy = new IMtopProxy(context);
        this.onWarmupCompleted = iMtopProxy;
        requestInnerSync requestinnersync = new requestInnerSync(context);
        this.IAuthTabCallback = requestinnersync;
        this.onNavigationEvent = new SendMtopParams();
        this.IAuthTabCallbackStub = new addData(context, iMtopProxy, requestinnersync, null, 8, null);
    }

    public static final /* synthetic */ IMtopProxy onExtraCallback(setPages setpages) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        IMtopProxy iMtopProxy = setpages.onWarmupCompleted;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 81;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return iMtopProxy;
    }

    public static final /* synthetic */ requestInnerSync onNavigationEvent(setPages setpages) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 95;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        requestInnerSync requestinnersync = setpages.IAuthTabCallback;
        int i5 = i3 + 73;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return requestinnersync;
    }

    public final Object onExtraCallback(@NotNull access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        Object obj = null;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onExtraCallback(null), access13800Var);
        if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
            Unit unit = Unit.INSTANCE;
            int i2 = IAuthTabCallbackDefault + 91;
            asBinder = i2 % 128;
            if (i2 % 2 != 0) {
                return unit;
            }
            throw null;
        }
        int i3 = IAuthTabCallbackDefault + 55;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 49;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0) {
            return objOnExtraCallbackWithResult;
        }
        obj.hashCode();
        throw null;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static long onNavigationEvent = -1127094921301464589L;
        Object L$0;
        int label;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = setPages.this.new onExtraCallback(access13800Var);
            int i2 = IAuthTabCallback + 113;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 75 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 81;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return objOnNavigationEvent;
            }
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 89;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback onextracallbackCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                return onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        
            if (r7.IAuthTabCallback(r2, r6) == r1) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterpreterConfig interpreterConfigIAuthTabCallback;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 == 0) {
                ResultKt.onNavigationEvent(obj);
                interpreterConfigIAuthTabCallback = isH5.IAuthTabCallback.onNavigationEvent().IAuthTabCallback();
                IMtopProxy iMtopProxyOnExtraCallback = setPages.onExtraCallback(setPages.this);
                this.L$0 = interpreterConfigIAuthTabCallback;
                this.label = 1;
                if (iMtopProxyOnExtraCallback.onExtraCallbackWithResult(interpreterConfigIAuthTabCallback, this) != objOnWarmupCompleted) {
                }
                return objOnWarmupCompleted;
            }
            int i5 = onExtraCallbackWithResult + 71;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.onNavigationEvent(obj);
                    return Unit.INSTANCE;
                }
                Object[] objArr = new Object[1];
                a(new char[]{27815, 46260, 56458, 58523, 3232, 21733, 31949, 33939, 44139, 62511, 7179, 9228, 19581, 38004, 48207, 50204, 60916, 13703, 23955, 26081, 36351, 54739, 64983, 1379, 11643, 29956, 40208, 42361, 52599, 5442, 15711, 18156, 28356, 46722, 57071, 59107, 3784, 22161, 32289, 34364, 44574, 62994, 7803, 9835, 20033, 38487, 49071}, 55314 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            interpreterConfigIAuthTabCallback = (InterpreterConfig) this.L$0;
            ResultKt.onNavigationEvent(obj);
            requestInnerSync requestinnersyncOnNavigationEvent = setPages.onNavigationEvent(setPages.this);
            this.L$0 = null;
            this.label = 2;
        }

        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i3 = $11 + 79;
                $10 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.indexOf("", "", 0), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 24, 19627 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() - (5407414049857832247L ^ onNavigationEvent);
                        Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 58 - Process.getGidForName(""), Color.rgb(0, 0, 0) + 16783599, -1230372444, false, "D", new Class[]{Object.class, Object.class});
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
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.blue(0), TextUtils.indexOf("", "", 0) + 24, TextUtils.getCapsMode("", 0, 0) + 19627, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objOnExtraCallback3).invoke(null, objArr4)).longValue() ^ (5407414049857832247L ^ onNavigationEvent);
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 59 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6383 - View.resolveSizeAndState(0, 0, 0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
            while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
                int i6 = $11 + 57;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr6 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getEdgeSlop() >> 16), 59 - View.MeasureSpec.getSize(0), 6382 - ExpandableListView.getPackedPositionChild(0L), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            String str = new String(cArr2);
            int i8 = $10 + 71;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            objArr[0] = str;
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackStub.onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackDefault + 37;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onNavigationEvent() {
        AtomicBoolean atomicBoolean;
        int i = 2 % 2;
        int i2 = asBinder + 57;
        IAuthTabCallbackDefault = i2 % 128;
        boolean z = false;
        if (i2 % 2 != 0) {
            this.IAuthTabCallback.IAuthTabCallback();
            this.onExtraCallback.set(false);
            atomicBoolean = this.onExtraCallbackWithResult;
            z = true;
        } else {
            this.IAuthTabCallback.IAuthTabCallback();
            this.onExtraCallback.set(false);
            atomicBoolean = this.onExtraCallbackWithResult;
        }
        atomicBoolean.set(z);
        int i3 = asBinder + 37;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[PHI: r3
      0x00a5: PHI (r3v9 o.setUseDynamicPlugins) = (r3v8 o.setUseDynamicPlugins), (r3v10 o.setUseDynamicPlugins) binds: [B:29:0x00a3, B:26:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onExtraCallbackWithResult(@NotNull Mat mat, @NotNull access13800<? super addDatas2Performance> access13800Var) throws Throwable {
        onExtraCallbackWithResult onextracallbackwithresult;
        setPages setpages;
        setUseDynamicPlugins setusedynamicplugins;
        int i = 2 % 2;
        if (Class.forName("o.setPages$onExtraCallbackWithResult").isInstance(access13800Var)) {
            onextracallbackwithresult = (onExtraCallbackWithResult) access13800Var;
            int i2 = onextracallbackwithresult.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                onextracallbackwithresult.label = i2 - 2147483648;
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(access13800Var);
            }
        }
        Object objOnNavigationEvent = onextracallbackwithresult.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = onextracallbackwithresult.label;
        if (i3 != 0) {
            int i4 = IAuthTabCallbackDefault + 47;
            asBinder = i4 % 128;
            if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 47, 104, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            setpages = (setPages) onextracallbackwithresult.L$0;
            ResultKt.onNavigationEvent(objOnNavigationEvent);
        } else {
            ResultKt.onNavigationEvent(objOnNavigationEvent);
            requestInnerAsync requestinnerasyncOnNavigationEvent = isH5.IAuthTabCallback.onNavigationEvent();
            if (this.IAuthTabCallbackStub.onExtraCallback()) {
                int i5 = IAuthTabCallbackDefault + 25;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                this.IAuthTabCallbackStub.onExtraCallbackWithResult();
            }
            if (this.onExtraCallback.compareAndSet(false, true)) {
                int i7 = asBinder + 45;
                IAuthTabCallbackDefault = i7 % 128;
                if (i7 % 2 != 0) {
                    setusedynamicplugins = this.onTransact;
                    int i8 = 30 / 0;
                    if (setusedynamicplugins != null) {
                        setusedynamicplugins.onExtraCallbackWithResult();
                    }
                } else {
                    setusedynamicplugins = this.onTransact;
                    if (setusedynamicplugins != null) {
                    }
                }
            }
            onextracallbackwithresult.L$0 = this;
            onextracallbackwithresult.label = 1;
            objOnNavigationEvent = onNavigationEvent(mat, requestinnerasyncOnNavigationEvent, onextracallbackwithresult);
            if (objOnNavigationEvent == objOnWarmupCompleted) {
                int i9 = IAuthTabCallbackDefault + 103;
                asBinder = i9 % 128;
                if (i9 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            setpages = this;
        }
        addDatas2Performance adddatas2performance = (addDatas2Performance) objOnNavigationEvent;
        setUseDynamicPlugins setusedynamicplugins2 = setpages.onTransact;
        if (setusedynamicplugins2 != null) {
            setusedynamicplugins2.onExtraCallback(adddatas2performance);
        }
        return adddatas2performance;
    }

    private final addData2Performance onWarmupCompleted(uploadPerfLog uploadperflog) {
        StartAction startAction;
        double dDoubleValue;
        StartAction startActionOnWarmupCompleted;
        int i = 2 % 2;
        isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback = uploadperflog.IAuthTabCallback();
        int iAsBinder = 0;
        if (onwarmupcompletedIAuthTabCallback == null || (startAction = onwarmupcompletedIAuthTabCallback.onWarmupCompleted()) == null) {
            startAction = new StartAction(0, 0, 0, 0);
        }
        Object obj = null;
        getCausesCount getcausescount = new getCausesCount(startAction, uploadperflog.onWarmupCompleted(), (DefaultConstructorMarker) null);
        Double dOnTransact = uploadperflog.onTransact();
        if (dOnTransact != null) {
            dDoubleValue = dOnTransact.doubleValue();
        } else {
            int i2 = IAuthTabCallbackDefault + 19;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            dDoubleValue = 0.0d;
        }
        getCausesCount getcausescount2 = new getCausesCount(Double.valueOf(dDoubleValue), uploadperflog.onWarmupCompleted(), (DefaultConstructorMarker) null);
        isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = uploadperflog.IAuthTabCallback();
        if (onwarmupcompletedIAuthTabCallback2 != null && (startActionOnWarmupCompleted = onwarmupcompletedIAuthTabCallback2.onWarmupCompleted()) != null) {
            iAsBinder = startActionOnWarmupCompleted.asBinder();
        }
        addData2Performance adddata2performance = new addData2Performance(getcausescount, getcausescount2, new getCausesCount(Integer.valueOf(iAsBinder), uploadperflog.onWarmupCompleted(), (DefaultConstructorMarker) null), new getCausesCount(Integer.valueOf(uploadperflog.onExtraCallback().size()), uploadperflog.onExtraCallbackWithResult(), (DefaultConstructorMarker) null));
        int i4 = IAuthTabCallbackDefault + 105;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return adddata2performance;
        }
        obj.hashCode();
        throw null;
    }

    private final forceInnerWebViewCheck onExtraCallback(uploadPerfLog uploadperflog) {
        int i = 2 % 2;
        isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback = uploadperflog.IAuthTabCallback();
        if (onwarmupcompletedIAuthTabCallback != null) {
            int i2 = IAuthTabCallbackDefault + 115;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            StartAction startActionOnWarmupCompleted = onwarmupcompletedIAuthTabCallback.onWarmupCompleted();
            if (startActionOnWarmupCompleted != null) {
                return new forceInnerWebViewCheck(startActionOnWarmupCompleted, new ActivityAnimBean1(new getAnimResId(uploadperflog.IAuthTabCallback().IAuthTabCallback().onExtraCallbackWithResult().onExtraCallbackWithResult(), uploadperflog.IAuthTabCallback().IAuthTabCallback().onExtraCallbackWithResult().onWarmupCompleted()), new getAnimResId(uploadperflog.IAuthTabCallback().IAuthTabCallback().onNavigationEvent().onExtraCallbackWithResult(), uploadperflog.IAuthTabCallback().IAuthTabCallback().onNavigationEvent().onWarmupCompleted()), new getAnimResId(uploadperflog.IAuthTabCallback().IAuthTabCallback().IAuthTabCallback().onExtraCallbackWithResult(), uploadperflog.IAuthTabCallback().IAuthTabCallback().IAuthTabCallback().onWarmupCompleted()), new getAnimResId(uploadperflog.IAuthTabCallback().IAuthTabCallback().onExtraCallback().onExtraCallbackWithResult(), uploadperflog.IAuthTabCallback().IAuthTabCallback().onExtraCallback().onWarmupCompleted()), new getAnimResId(uploadperflog.IAuthTabCallback().IAuthTabCallback().onWarmupCompleted().onExtraCallbackWithResult(), uploadperflog.IAuthTabCallback().IAuthTabCallback().onWarmupCompleted().onWarmupCompleted())));
            }
        }
        int i4 = asBinder + 59;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final track IAuthTabCallback(setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist) {
        int i = 2 % 2;
        getCausesCount<AnimUtils> getcausescountIAuthTabCallbackDefault = setperformancestagereentrantwhitelist.IAuthTabCallbackDefault();
        getCausesCount<Pair<Float, Float>> getcausescountIAuthTabCallback = setperformancestagereentrantwhitelist.IAuthTabCallback();
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        getCausesCount getcausescount = (getCausesCount) setPerformanceStageReentrantWhiteList.onNavigationEvent(new Object[]{setperformancestagereentrantwhitelist}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1655117077, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -1655117076, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult());
        getCausesCount<Double> getcausescountOnExtraCallbackWithResult = setperformancestagereentrantwhitelist.onExtraCallbackWithResult();
        getCausesCount<Float> getcausescountIAuthTabCallbackStubProxy = setperformancestagereentrantwhitelist.IAuthTabCallbackStubProxy();
        getCausesCount<Float> getcausescountAccess100 = setperformancestagereentrantwhitelist.access100();
        getCausesCount<Float> getcausescountAsBinder = setperformancestagereentrantwhitelist.asBinder();
        getCausesCount<Float> getcausescountAccess000 = setperformancestagereentrantwhitelist.access000();
        getCausesCount<Float> interfaceDescriptor = setperformancestagereentrantwhitelist.getInterfaceDescriptor();
        getCausesCount<Float> getcausescountIAuthTabCallbackStub = setperformancestagereentrantwhitelist.IAuthTabCallbackStub();
        getCausesCount<Float> getcausescountAsInterface = setperformancestagereentrantwhitelist.asInterface();
        getCausesCount<Float> getcausescountOnTransact = setperformancestagereentrantwhitelist.onTransact();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
        track trackVar = new track(getcausescountIAuthTabCallbackDefault, getcausescountIAuthTabCallback, getcausescount, getcausescountOnExtraCallbackWithResult, getcausescountIAuthTabCallbackStubProxy, getcausescountAccess100, getcausescountAsBinder, getcausescountAccess000, interfaceDescriptor, getcausescountIAuthTabCallbackStub, getcausescountAsInterface, getcausescountOnTransact, (getCausesCount) setPerformanceStageReentrantWhiteList.onNavigationEvent(new Object[]{setperformancestagereentrantwhitelist}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 2086492308, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -2086492308, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult()));
        int i2 = IAuthTabCallbackDefault + 1;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return trackVar;
        }
        throw null;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = asInterface;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 49;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - Process.getGidForName("")), Process.getGidForName("") + 36, 14240 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i12 = $10 + 57;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 1 : bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] != 0) {
                    int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17657 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 10935), 66 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 16718 - View.getDefaultSize(0, 0), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    int i15 = $10 + 55;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0')), 70 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 12486 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i6];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i18 = $10 + 41;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[i6 >>> trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i6 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
                int i19 = $10 + 99;
                $11 = i19 % 128;
                int i20 = i19 % 2;
            }
            cArr3 = cArr6;
        }
        if (i7 > 0) {
            int i21 = $11 + 117;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i6) {
                int i23 = $11 + 117;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] << iArr[3]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                } else {
                    cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                }
                trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object onNavigationEvent(Mat mat, requestInnerAsync requestinnerasync, access13800<? super addDatas2Performance> access13800Var) throws Throwable {
        onNavigationEvent onnavigationevent;
        setPages setpages;
        Mat mat2;
        requestInnerAsync requestinnerasync2;
        requestInnerAsync requestinnerasync3;
        uploadPerfLog uploadperflog;
        SendMtopParams.onWarmupCompleted onwarmupcompleted;
        SendMtopParams.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback;
        int i = 2 % 2;
        int i2 = asBinder + 9;
        IAuthTabCallbackDefault = i2 % 128;
        RVPub rVPub = null;
        if (i2 % 2 != 0) {
            Class.forName("o.setPages$onNavigationEvent").isInstance(access13800Var);
            throw null;
        }
        if (Class.forName("o.setPages$onNavigationEvent").isInstance(access13800Var)) {
            onnavigationevent = (onNavigationEvent) access13800Var;
            int i3 = onnavigationevent.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                onnavigationevent.label = i3 - 2147483648;
            } else {
                onnavigationevent = new onNavigationEvent(access13800Var);
            }
        }
        onNavigationEvent onnavigationevent2 = onnavigationevent;
        Object objOnWarmupCompleted = onnavigationevent2.result;
        Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
        int i4 = onnavigationevent2.label;
        if (i4 == 0) {
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            IMtopProxy iMtopProxy = this.onWarmupCompleted;
            QualityModelConfig qualityModelConfigOnNavigationEvent = requestinnerasync.onNavigationEvent();
            onnavigationevent2.L$0 = this;
            onnavigationevent2.L$1 = mat;
            onnavigationevent2.L$2 = requestinnerasync;
            onnavigationevent2.label = 1;
            objOnWarmupCompleted = iMtopProxy.onWarmupCompleted(mat, qualityModelConfigOnNavigationEvent, (access13800<? super uploadPerfLog>) onnavigationevent2);
            if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                setpages = this;
                mat2 = mat;
                requestinnerasync2 = requestinnerasync;
            }
            return objOnWarmupCompleted2;
        }
        int i5 = asBinder;
        int i6 = i5 + 63;
        IAuthTabCallbackDefault = i6 % 128;
        if (i6 % 2 == 0 ? i4 != 1 : i4 != 1) {
            if (i4 != 2) {
                Object[] objArr = new Object[1];
                a(new int[]{0, 47, 104, 0}, true, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0}, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i7 = i5 + 73;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            onwarmupcompleted = (SendMtopParams.onWarmupCompleted) onnavigationevent2.L$3;
            uploadperflog = (uploadPerfLog) onnavigationevent2.L$2;
            requestinnerasync3 = (requestInnerAsync) onnavigationevent2.L$1;
            setpages = (setPages) onnavigationevent2.L$0;
            ResultKt.onNavigationEvent(objOnWarmupCompleted);
            setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist = (setPerformanceStageReentrantWhiteList) objOnWarmupCompleted;
            onextracallbackwithresultIAuthTabCallback = setpages.onNavigationEvent.IAuthTabCallback(setperformancestagereentrantwhitelist, requestinnerasync3.onNavigationEvent().onTransact());
            if (onextracallbackwithresultIAuthTabCallback.onNavigationEvent() == null) {
                return addDatas2Performance.Companion.onExtraCallback(onextracallbackwithresultIAuthTabCallback.onNavigationEvent(), false, setpages.onWarmupCompleted(uploadperflog), setpages.onExtraCallback(uploadperflog), new addStage2Performance(onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallback(), onextracallbackwithresultIAuthTabCallback.onExtraCallbackWithResult()));
            }
            return new addDatas2Performance(setperformancestagereentrantwhitelist.onExtraCallback(), ((Boolean) setPerformanceStageReentrantWhiteList.onNavigationEvent(new Object[]{setperformancestagereentrantwhitelist}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 42619498, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -42619496, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).booleanValue(), new addEvent2Performance(null, setpages.onWarmupCompleted(uploadperflog), setpages.IAuthTabCallback(setperformancestagereentrantwhitelist), new addStage2Performance(onwarmupcompleted.onWarmupCompleted(), onwarmupcompleted.IAuthTabCallback(), onextracallbackwithresultIAuthTabCallback.onExtraCallbackWithResult()), 1, null), setpages.onExtraCallback(uploadperflog));
        }
        requestinnerasync2 = (requestInnerAsync) onnavigationevent2.L$2;
        Mat mat3 = (Mat) onnavigationevent2.L$1;
        setPages setpages2 = (setPages) onnavigationevent2.L$0;
        ResultKt.onNavigationEvent(objOnWarmupCompleted);
        mat2 = mat3;
        setpages = setpages2;
        uploadPerfLog uploadperflog2 = (uploadPerfLog) objOnWarmupCompleted;
        isTiny.onWarmupCompleted onwarmupcompletedIAuthTabCallback = uploadperflog2.IAuthTabCallback();
        if (onwarmupcompletedIAuthTabCallback != null) {
            if (!uploadperflog2.asBinder()) {
                addDatas2Performance.onExtraCallback onextracallback = addDatas2Performance.Companion;
                RVPub rVPubOnNavigationEvent = uploadperflog2.onNavigationEvent();
                if (rVPubOnNavigationEvent == null) {
                    rVPubOnNavigationEvent = RVPub.UNKNOWN;
                }
                return addDatas2Performance.onExtraCallback.onExtraCallback(onextracallback, rVPubOnNavigationEvent, false, setpages.onWarmupCompleted(uploadperflog2), setpages.onExtraCallback(uploadperflog2), null, 16, null);
            }
            SendMtopParams.onWarmupCompleted onwarmupcompletedIAuthTabCallback2 = setpages.onNavigationEvent.IAuthTabCallback(uploadperflog2, requestinnerasync2.onNavigationEvent().onTransact());
            if (onwarmupcompletedIAuthTabCallback2.onNavigationEvent() != null) {
                return addDatas2Performance.Companion.onExtraCallback(onwarmupcompletedIAuthTabCallback2.onNavigationEvent(), false, setpages.onWarmupCompleted(uploadperflog2), setpages.onExtraCallback(uploadperflog2), new addStage2Performance(onwarmupcompletedIAuthTabCallback2.onWarmupCompleted(), onwarmupcompletedIAuthTabCallback2.IAuthTabCallback(), null));
            }
            requestInnerSync requestinnersync = setpages.IAuthTabCallback;
            QualityModelConfig qualityModelConfigOnNavigationEvent2 = requestinnerasync2.onNavigationEvent();
            ServiceConfig serviceConfigOnExtraCallbackWithResult = requestinnerasync2.onExtraCallbackWithResult();
            onnavigationevent2.L$0 = setpages;
            onnavigationevent2.L$1 = requestinnerasync2;
            onnavigationevent2.L$2 = uploadperflog2;
            onnavigationevent2.L$3 = onwarmupcompletedIAuthTabCallback2;
            onnavigationevent2.label = 2;
            Object objOnNavigationEvent = requestInnerSync.onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 318221546, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -318221545, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{requestinnersync, mat2, onwarmupcompletedIAuthTabCallback, qualityModelConfigOnNavigationEvent2, serviceConfigOnExtraCallbackWithResult, onnavigationevent2}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
            if (objOnNavigationEvent != objOnWarmupCompleted2) {
                requestinnerasync3 = requestinnerasync2;
                onwarmupcompleted = onwarmupcompletedIAuthTabCallback2;
                uploadperflog = uploadperflog2;
                objOnWarmupCompleted = objOnNavigationEvent;
                setPerformanceStageReentrantWhiteList setperformancestagereentrantwhitelist2 = (setPerformanceStageReentrantWhiteList) objOnWarmupCompleted;
                onextracallbackwithresultIAuthTabCallback = setpages.onNavigationEvent.IAuthTabCallback(setperformancestagereentrantwhitelist2, requestinnerasync3.onNavigationEvent().onTransact());
                if (onextracallbackwithresultIAuthTabCallback.onNavigationEvent() == null) {
                }
            }
            return objOnWarmupCompleted2;
        }
        int i9 = asBinder + 55;
        IAuthTabCallbackDefault = i9 % 128;
        if (i9 % 2 != 0) {
            requestinnerasync2.onNavigationEvent().onExtraCallback().onExtraCallback();
            throw null;
        }
        PreBrightnessConfig preBrightnessConfigOnExtraCallback = requestinnerasync2.onNavigationEvent().onExtraCallback();
        if (preBrightnessConfigOnExtraCallback.onExtraCallback()) {
            RVPub rVPubOnExtraCallback = setpages.IAuthTabCallback.onExtraCallback(mat2, preBrightnessConfigOnExtraCallback);
            int i10 = rVPubOnExtraCallback == null ? -1 : IAuthTabCallback.onNavigationEvent[rVPubOnExtraCallback.ordinal()];
            if (i10 != 1) {
                int i11 = asBinder + 115;
                IAuthTabCallbackDefault = i11 % 128;
                int i12 = i11 % 2;
                if (i10 == 2) {
                    rVPub = RVPub.PRE_BRIGHTNESS_TOO_LOW;
                    int i13 = asBinder + 107;
                    IAuthTabCallbackDefault = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                rVPub = RVPub.PRE_BRIGHTNESS_TOO_HIGH;
            }
            RVPub rVPub2 = rVPub;
            if (rVPub2 != null) {
                int i15 = IAuthTabCallbackDefault + 83;
                asBinder = i15 % 128;
                int i16 = i15 % 2;
                return addDatas2Performance.onExtraCallback.onExtraCallback(addDatas2Performance.Companion, rVPub2, false, null, null, null, 28, null);
            }
        }
        addDatas2Performance.onExtraCallback onextracallback2 = addDatas2Performance.Companion;
        RVPub rVPubOnNavigationEvent2 = uploadperflog2.onNavigationEvent();
        if (rVPubOnNavigationEvent2 == null) {
            rVPubOnNavigationEvent2 = RVPub.UNKNOWN;
        }
        return addDatas2Performance.onExtraCallback.onExtraCallback(onextracallback2, rVPubOnNavigationEvent2, false, setpages.onWarmupCompleted(uploadperflog2), setpages.onExtraCallback(uploadperflog2), null, 16, null);
    }

    public final void onNavigationEvent(@NotNull getMtopInstance getmtopinstance) {
        setUseDynamicPlugins setusedynamicplugins;
        int i = 2 % 2;
        int i2 = asBinder + 43;
        IAuthTabCallbackDefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(getmtopinstance, "");
            this.onExtraCallback.get();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(getmtopinstance, "");
        if (!(!this.onExtraCallback.get()) && (setusedynamicplugins = this.onTransact) != null) {
            int i3 = asBinder + 69;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                setusedynamicplugins.onExtraCallback(getmtopinstance);
                throw null;
            }
            setusedynamicplugins.onExtraCallback(getmtopinstance);
        }
        this.IAuthTabCallback.IAuthTabCallback();
        this.onNavigationEvent.onWarmupCompleted();
        onExtraCallback();
        this.onExtraCallback.set(false);
        int i4 = asBinder + 25;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Object IAuthTabCallback(setPages setpages, Mat mat, requestInnerAsync requestinnerasync, access13800 access13800Var) {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        return onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{setpages, mat, requestinnerasync, access13800Var}, forceDomainCheck.IAuthTabCallback(), -1793306367, iIAuthTabCallback, 1793306367, forceDomainCheck.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@Nullable setUseDynamicPlugins setusedynamicplugins) throws Throwable {
        int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
        onExtraCallbackWithResult(forceDomainCheck.IAuthTabCallback(), new Object[]{this, setusedynamicplugins}, forceDomainCheck.IAuthTabCallback(), -1699245126, iIAuthTabCallback, 1699245127, forceDomainCheck.IAuthTabCallback());
    }
}
