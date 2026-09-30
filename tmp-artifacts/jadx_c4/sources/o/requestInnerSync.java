package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.image.process.RgbMatWithDetection;
import im.toss.facepay.validation.model.init.config.InterpreterConfig;
import im.toss.facepay.validation.model.init.config.QualityModelConfig;
import im.toss.facepay.validation.model.init.config.ServiceConfig;
import im.toss.facepay.validation.model.init.config.quality.PreBrightnessConfig;
import im.toss.facepay.validation.model.init.config.quality.QcV2Config;
import im.toss.facepay.validation.model.init.config.service.CandidateFrameConfig;
import im.toss.features.home.ui.dst.view.cardbill.detail.HomeDstCardBillDetailFilterActivity$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import o.AnimUtils;
import o.PluginParamModel;
import o.getBuildFingerprint;
import o.isTiny;
import o.isTinyGame;
import o.requestInnerSync;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.core.Rect;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class requestInnerSync {
    public static final onWarmupCompleted Companion;
    private static int IAuthTabCallbackStubProxy;
    private static int access000;
    private static final String onExtraCallbackWithResult;
    private final StartClientBundle IAuthTabCallback;
    private final requestAsync IAuthTabCallbackDefault;
    private float IAuthTabCallbackStub;
    private final logNebulaTech asBinder;
    private final markSpmExpose asInterface;
    private final markSpmExpose onExtraCallback;
    private final behavior onNavigationEvent;
    private final isWeb onTransact;
    private final isTinyGame onWarmupCompleted;
    private static final byte[] $$a = {4, -80, 45, 109};
    private static final int $$b = 217;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback_Parcel = 0;
    private static int access100 = 1;
    private static int getInterfaceDescriptor = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = (s * 4) + 4;
        byte[] bArr = $$a;
        int i6 = (i * 4) + 105;
        int i7 = i2 * 3;
        byte[] bArr2 = new byte[i7 + 1];
        if (bArr == null) {
            int i8 = i5;
            i3 = 0;
            int i9 = i5;
            i6 += i8;
            i4 = i9 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            i3++;
            i8 = bArr[i4];
            i9 = i4;
            i6 += i8;
            i4 = i9 + 1;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i5;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    static {
        access000 = 1;
        onExtraCallback();
        Object[] objArr = new Object[1];
        a(22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 19, new char[]{65534, 0, 3, 65502, 65534, 4, '\r', 15, 0, '\b', '\n', 15, '\n', 3, 65515, 0, 65534, 65532, 65505, '\r', 0, 6}, true, 260 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
        onExtraCallbackWithResult = ((String) objArr[0]).intern();
        Companion = new onWarmupCompleted(null);
        int i = getInterfaceDescriptor + 1;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = (~(i7 | i8)) | (~(i8 | i3));
        int i10 = ~((~i3) | i4 | i2);
        int i11 = i9 | i10;
        int i12 = (~(i3 | i8 | i4)) | i10;
        int i13 = i4 | i2;
        int i14 = i4 + i2 + i5 + ((-1865910757) * i) + ((-1665280692) * i6);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-906343980)) - 215482368) + ((-906343980) * i2) + (i11 * (-2063747539)) + (2063747539 * i12) + ((-2063747539) * i13) + (1324875776 * i5) + ((-1540882432) * i) + ((-912261120) * i6) + (1566179328 * i15);
        int i17 = (i4 * (-52584228)) + 761582770 + (i2 * (-52584228)) + (i11 * 415) + (i12 * (-415)) + (i13 * 415) + (i5 * (-52583813)) + (i * (-195242759)) + (i6 * 1657508740) + (i15 * (-834797568));
        int i18 = i16 + (i17 * i17 * 1251344384);
        if (i18 != 1) {
            return i18 != 2 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
        }
        requestInnerSync requestinnersync = (requestInnerSync) objArr[0];
        int i19 = 2 % 2;
        Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new onNavigationEvent((Mat) objArr[1], (isTiny.onWarmupCompleted) objArr[2], (ServiceConfig) objArr[4], requestinnersync, (QualityModelConfig) objArr[3], null), (access13800) objArr[5]);
        int i20 = IAuthTabCallback_Parcel + 19;
        access100 = i20 % 128;
        int i21 = i20 % 2;
        return objOnExtraCallbackWithResult;
    }

    public requestInnerSync(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = new isTinyGame();
        this.onNavigationEvent = new behavior();
        this.asInterface = new markSpmExpose();
        this.onExtraCallback = new markSpmExpose();
        this.asBinder = new logNebulaTech();
        this.onTransact = new isWeb(context);
        this.IAuthTabCallbackDefault = new requestAsync();
        this.IAuthTabCallback = new StartClientBundle(56, 56);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        requestInnerSync requestinnersync = (requestInnerSync) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 9;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        isTinyGame istinygame = requestinnersync.onWarmupCompleted;
        if (i3 == 0) {
            return istinygame;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ behavior IAuthTabCallback(requestInnerSync requestinnersync) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 5;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        behavior behaviorVar = requestinnersync.onNavigationEvent;
        int i5 = i2 + 9;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return behaviorVar;
    }

    public static final /* synthetic */ isWeb IAuthTabCallbackDefault(requestInnerSync requestinnersync) {
        int i = 2 % 2;
        int i2 = access100 + 5;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        Object obj = null;
        isWeb isweb = requestinnersync.onTransact;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 87;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return isweb;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ float asInterface(requestInnerSync requestinnersync) {
        int i = 2 % 2;
        int i2 = access100 + 27;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        float f = requestinnersync.IAuthTabCallbackStub;
        if (i3 == 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ markSpmExpose onExtraCallback(requestInnerSync requestinnersync) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 13;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        markSpmExpose markspmexpose = requestinnersync.onExtraCallback;
        int i5 = i3 + 65;
        IAuthTabCallback_Parcel = i5 % 128;
        int i6 = i5 % 2;
        return markspmexpose;
    }

    public static final /* synthetic */ void onExtraCallbackWithResult(requestInnerSync requestinnersync, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel;
        int i3 = i2 + 121;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        requestinnersync.IAuthTabCallbackStub = f;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 77;
        access100 = i5 % 128;
        int i6 = i5 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        requestInnerSync requestinnersync = (requestInnerSync) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 19;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        StartClientBundle startClientBundle = requestinnersync.IAuthTabCallback;
        if (i3 == 0) {
            return startClientBundle;
        }
        throw null;
    }

    public static final /* synthetic */ void onNavigationEvent(requestInnerSync requestinnersync, RVPub rVPub, RVPub... rVPubArr) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        requestinnersync.onExtraCallbackWithResult(rVPub, rVPubArr);
        int i4 = access100 + 105;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ requestAsync onWarmupCompleted(requestInnerSync requestinnersync) {
        int i = 2 % 2;
        int i2 = access100 + 67;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        requestAsync requestasync = requestinnersync.IAuthTabCallbackDefault;
        int i5 = i3 + 57;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return requestasync;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (r4 == o.access14300.onWarmupCompleted()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r5 = o.requestInnerSync.access100 + 103;
        o.requestInnerSync.IAuthTabCallback_Parcel = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object IAuthTabCallback(@NotNull InterpreterConfig interpreterConfig, @NotNull access13800<? super Unit> access13800Var) {
        Object objOnExtraCallbackWithResult;
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 != 0) {
            InterpreterConfig.ModelConfig modelConfigOnNavigationEvent = interpreterConfig.onNavigationEvent();
            objOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(modelConfigOnNavigationEvent.IAuthTabCallback(), modelConfigOnNavigationEvent.onWarmupCompleted(), access13800Var);
            int i3 = 21 / 0;
        } else {
            InterpreterConfig.ModelConfig modelConfigOnNavigationEvent2 = interpreterConfig.onNavigationEvent();
            objOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(modelConfigOnNavigationEvent2.IAuthTabCallback(), modelConfigOnNavigationEvent2.onWarmupCompleted(), access13800Var);
        }
    }

    private final Rect IAuthTabCallback(int i, int i2, double d) {
        int i3 = 2 % 2;
        double d2 = i * d;
        int i4 = (int) (d2 * 2.0d);
        Rect rect = new Rect((int) ((i / 2) - d2), (int) ((i2 / 2) - d2), i4, i4);
        int i5 = IAuthTabCallback_Parcel + 107;
        access100 = i5 % 128;
        if (i5 % 2 != 0) {
            return rect;
        }
        throw null;
    }

    public final RVPub onExtraCallback(@NotNull Mat mat, @NotNull PreBrightnessConfig preBrightnessConfig) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mat, "");
        Intrinsics.checkNotNullParameter(preBrightnessConfig, "");
        Rect rectIAuthTabCallback = IAuthTabCallback(mat.width(), mat.height(), preBrightnessConfig.IAuthTabCallback());
        Mat matOnExtraCallback = this.onWarmupCompleted.onExtraCallback(mat, new StartAction(rectIAuthTabCallback.x, rectIAuthTabCallback.y, rectIAuthTabCallback.width, rectIAuthTabCallback.height), this.IAuthTabCallback);
        Object[] objArr = {this.asInterface, matOnExtraCallback, RangesKt.rangeTo(preBrightnessConfig.onWarmupCompleted(), preBrightnessConfig.onExtraCallbackWithResult())};
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        AppTypeEnum appTypeEnum = (AppTypeEnum) markSpmExpose.onWarmupCompleted(188075357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -188075355, objArr);
        matOnExtraCallback.release();
        RVPub rVPubIAuthTabCallback = appTypeEnum.IAuthTabCallback();
        int i2 = access100 + 115;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            return rVPubIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super setPerformanceStageReentrantWhiteList>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onTransact = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ isTiny.onWarmupCompleted $face;
        final /* synthetic */ QualityModelConfig $qualityModelConfig;
        final /* synthetic */ Mat $rgbMat;
        final /* synthetic */ ServiceConfig $serviceConfig;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ requestInnerSync this$0;
        private static char[] IAuthTabCallback = {32279, 32273, 32270, 32466, 32262, 32259, 32459, 32256, 32277, 32263, 32261, 32269, 32272, 32276, 32265, 32268, 32260, 32271, 32315, 32266};
        private static int onExtraCallbackWithResult = -1184334158;
        private static boolean onExtraCallback = true;
        private static boolean onNavigationEvent = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onNavigationEvent(Mat mat, isTiny.onWarmupCompleted onwarmupcompleted, ServiceConfig serviceConfig, requestInnerSync requestinnersync, QualityModelConfig qualityModelConfig, access13800<? super onNavigationEvent> access13800Var) {
            super(2, access13800Var);
            this.$rgbMat = mat;
            this.$face = onwarmupcompleted;
            this.$serviceConfig = serviceConfig;
            this.this$0 = requestinnersync;
            this.$qualityModelConfig = qualityModelConfig;
        }

        public static /* synthetic */ Pair IAuthTabCallback(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 111;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                return IAuthTabCallbackStubProxy(pluginParamModel);
            }
            IAuthTabCallbackStubProxy(pluginParamModel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ float IAuthTabCallbackDefault(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 107;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fAccess100 = access100(pluginParamModel);
            int i4 = onWarmupCompleted + 37;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 91 / 0;
            }
            return fAccess100;
        }

        public static /* synthetic */ float IAuthTabCallbackStub(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            float fFloatValue = ((Float) onNavigationEvent(1292861976, -1292861976, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue();
            int i4 = onTransact + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return fFloatValue;
        }

        public static /* synthetic */ float asBinder(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 117;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                ICustomTabsCallback(pluginParamModel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            float fICustomTabsCallback = ICustomTabsCallback(pluginParamModel);
            int i3 = onWarmupCompleted + 105;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return fICustomTabsCallback;
        }

        public static /* synthetic */ float onExtraCallback(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 109;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float fOnPostMessage = onPostMessage(pluginParamModel);
            int i4 = onWarmupCompleted + 79;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return fOnPostMessage;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float fWriteTypedObject = writeTypedObject(pluginParamModel);
            if (i3 == 0) {
                int i4 = 85 / 0;
            }
            int i5 = onWarmupCompleted + 57;
            onTransact = i5 % 128;
            if (i5 % 2 != 0) {
                return Float.valueOf(fWriteTypedObject);
            }
            int i6 = 64 / 0;
            return Float.valueOf(fWriteTypedObject);
        }

        public static /* synthetic */ float onExtraCallbackWithResult(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 37;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float typedObject = readTypedObject(pluginParamModel);
            int i4 = onWarmupCompleted + 117;
            onTransact = i4 % 128;
            if (i4 % 2 != 0) {
                return typedObject;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                return Float.valueOf(extraCallbackWithResult(pluginParamModel));
            }
            extraCallbackWithResult(pluginParamModel);
            throw null;
        }

        public static /* synthetic */ float onNavigationEvent(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 57;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {pluginParamModel};
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = setVisitUrl.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult4 = setVisitUrl.onExtraCallbackWithResult();
            if (i3 == 0) {
                ((Float) onNavigationEvent(1567840746, -1567840745, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4)).floatValue();
                throw null;
            }
            float fFloatValue = ((Float) onNavigationEvent(1567840746, -1567840745, iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult3, objArr, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult4)).floatValue();
            int i4 = onWarmupCompleted + 37;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return fFloatValue;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
            int i7 = ~i2;
            int i8 = (~(i7 | i)) | (~(i7 | i5)) | (~(i | i5));
            int i9 = (~(i2 | i5)) | i;
            int i10 = (~(i5 | i2 | i)) | (~(i7 | (~i) | (~i5)));
            int i11 = i2 + i + i3 + (862446602 * i4) + (395103901 * i6);
            int i12 = i11 * i11;
            int i13 = (((-1892237052) * i2) - 438566912) + ((-683246085) * i) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i3) + ((-128450560) * i4) + ((-674496512) * i6) + ((-1108934656) * i12);
            int i14 = (i2 * 1384179468) + 550727958 + (i * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i3 * 1384179971) + (i4 * 1640285726) + (i6 * 120803543) + (i12 * 2025127936);
            int i15 = i13 + (i14 * i14 * (-275709952));
            return i15 != 1 ? i15 != 2 ? i15 != 3 ? i15 != 4 ? onNavigationEvent(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }

        public static /* synthetic */ float onWarmupCompleted(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 53;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fIAuthTabCallback_Parcel = IAuthTabCallback_Parcel(pluginParamModel);
            if (i3 != 0) {
                int i4 = 10 / 0;
            }
            int i5 = onWarmupCompleted + 117;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return fIAuthTabCallback_Parcel;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
            int i = 2 % 2;
            int i2 = onTransact + 5;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            AnimUtils animUtilsExtraCallback = extraCallback(pluginParamModel);
            int i4 = onWarmupCompleted + 91;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return animUtilsExtraCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onNavigationEvent onnavigationevent = new onNavigationEvent(this.$rgbMat, this.$face, this.$serviceConfig, this.this$0, this.$qualityModelConfig, access13800Var);
            onnavigationevent.L$0 = obj;
            int i2 = onTransact + 79;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 18 / 0;
            }
            return onnavigationevent;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 117;
            onWarmupCompleted = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super setPerformanceStageReentrantWhiteList> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onWarmupCompleted + 3;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super setPerformanceStageReentrantWhiteList> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 51;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 19 / 0;
            }
            int i5 = onTransact + 87;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super List<? extends Unit>>, Object> {
            final /* synthetic */ Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> $blurResult;
            final /* synthetic */ Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> $brightnessResult;
            final /* synthetic */ Ref.ObjectRef<Mat> $cropResizeFaceMat;
            final /* synthetic */ QualityModelConfig $qualityModelConfig;
            final /* synthetic */ RgbMatWithDetection $rgbMatWithDetection;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ requestInnerSync this$0;
            private static final byte[] $$a = {121, -58, 81, 67};
            private static final int $$b = 207;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;
            private static long onExtraCallbackWithResult = 7798559133331975163L;
            private static int IAuthTabCallback = -1776194565;
            private static char onNavigationEvent = 986;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, byte b, short s2) {
                int i;
                byte[] bArr = $$a;
                int i2 = s + 109;
                int i3 = b + 4;
                int i4 = s2 * 2;
                byte[] bArr2 = new byte[1 - i4];
                int i5 = 0 - i4;
                if (bArr == null) {
                    int i6 = i3;
                    int i7 = 0;
                    i2 += -i3;
                    i3 = i6;
                    i = i7;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                        return new String(bArr2, 0);
                    }
                    int i8 = i + 1;
                    int i9 = i3 + 1;
                    i6 = i9;
                    i3 = bArr[i9];
                    i7 = i8;
                    i2 += -i3;
                    i3 = i6;
                    i = i7;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                } else {
                    i = 0;
                    bArr2[i] = (byte) i2;
                    if (i == i5) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onWarmupCompleted(requestInnerSync requestinnersync, RgbMatWithDetection rgbMatWithDetection, Ref.ObjectRef<Mat> objectRef, Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> objectRef2, QualityModelConfig qualityModelConfig, Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> objectRef3, access13800<? super onWarmupCompleted> access13800Var) {
                super(2, access13800Var);
                this.this$0 = requestinnersync;
                this.$rgbMatWithDetection = rgbMatWithDetection;
                this.$cropResizeFaceMat = objectRef;
                this.$brightnessResult = objectRef2;
                this.$qualityModelConfig = qualityModelConfig;
                this.$blurResult = objectRef3;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.this$0, this.$rgbMatWithDetection, this.$cropResizeFaceMat, this.$brightnessResult, this.$qualityModelConfig, this.$blurResult, access13800Var);
                onwarmupcompleted.L$0 = obj;
                int i2 = onWarmupCompleted + 45;
                onExtraCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 81;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super List<Unit>> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    onNavigationEvent(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 17;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return objOnNavigationEvent;
            }

            public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super List<Unit>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onExtraCallback + 115;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.requestInnerSync$onNavigationEvent$onWarmupCompleted$4, reason: invalid class name */
            static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                final /* synthetic */ Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> $brightnessResult;
                final /* synthetic */ Mat $croppedMat;
                final /* synthetic */ QualityModelConfig $qualityModelConfig;
                int label;
                final /* synthetic */ requestInnerSync this$0;
                private static final byte[] $$a = {57, 126, 65, 8};
                private static final int $$b = 166;
                private static int $10 = 0;
                private static int $11 = 1;
                private static int onWarmupCompleted = 0;
                private static int IAuthTabCallback = 1;
                private static long onExtraCallbackWithResult = -2546902122901807558L;
                private static int onNavigationEvent = -1776194565;
                private static char onExtraCallback = 27643;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static String $$c(int i, int i2, short s) {
                    int i3;
                    int i4 = 1 - (i * 2);
                    int i5 = 110 - i2;
                    byte[] bArr = $$a;
                    int i6 = 3 - (s * 2);
                    byte[] bArr2 = new byte[i4];
                    if (bArr == null) {
                        int i7 = i4;
                        int i8 = i6;
                        i3 = 0;
                        int i9 = i6 + i7;
                        i6 = i8;
                        i5 = i9;
                        int i10 = i6 + 1;
                        bArr2[i3] = (byte) i5;
                        i3++;
                        if (i3 == i4) {
                            return new String(bArr2, 0);
                        }
                        i7 = bArr[i10];
                        i6 = i5;
                        i8 = i10;
                        int i92 = i6 + i7;
                        i6 = i8;
                        i5 = i92;
                        int i102 = i6 + 1;
                        bArr2[i3] = (byte) i5;
                        i3++;
                        if (i3 == i4) {
                        }
                    } else {
                        i3 = 0;
                        int i1022 = i6 + 1;
                        bArr2[i3] = (byte) i5;
                        i3++;
                        if (i3 == i4) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> objectRef, requestInnerSync requestinnersync, Mat mat, QualityModelConfig qualityModelConfig, access13800<? super AnonymousClass4> access13800Var) {
                    super(2, access13800Var);
                    this.$brightnessResult = objectRef;
                    this.this$0 = requestinnersync;
                    this.$croppedMat = mat;
                    this.$qualityModelConfig = qualityModelConfig;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$brightnessResult, this.this$0, this.$croppedMat, this.$qualityModelConfig, access13800Var);
                    int i2 = IAuthTabCallback + 45;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass4;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 21;
                    IAuthTabCallback = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult(findresandmsg, access13800Var);
                    }
                    onExtraCallbackWithResult(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                    Object objInvokeSuspend;
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 25;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                    if (i3 != 0) {
                        objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                        int i4 = 99 / 0;
                    } else {
                        objInvokeSuspend = anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    }
                    int i5 = IAuthTabCallback + 45;
                    onWarmupCompleted = i5 % 128;
                    int i6 = i5 % 2;
                    return objInvokeSuspend;
                }

                private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                    int i2;
                    int i3 = 2;
                    int i4 = 2 % 2;
                    TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int length2 = cArr2.length;
                    char[] cArr5 = new char[length2];
                    System.arraycopy(cArr3, 0, cArr4, 0, length);
                    System.arraycopy(cArr2, 0, cArr5, 0, length2);
                    cArr4[0] = (char) (cArr4[0] ^ c);
                    cArr5[2] = (char) (cArr5[2] + ((char) i));
                    int length3 = cArr.length;
                    char[] cArr6 = new char[length3];
                    trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                    int i5 = $10 + 49;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 5 / 4;
                    }
                    while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                        int i7 = $11 + 49;
                        $10 = i7 % 128;
                        int i8 = i7 % i3;
                        try {
                            Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                            if (objOnExtraCallback == null) {
                                byte b = (byte) 0;
                                byte b2 = b;
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 43 - (ViewConfiguration.getTouchSlop() >> 8), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1450, 228868077, false, $$c(b, b2, b2), new Class[]{Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                            Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                            if (objOnExtraCallback2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = (byte) (b3 + 1);
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((Process.getThreadPriority(0) + 20) >> 6) + 49123), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 43, TextUtils.lastIndexOf("", '0', 0, 0) + 1495, 1533236389, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class});
                            }
                            int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                            Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                            if (objOnExtraCallback3 == null) {
                                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (KeyEvent.normalizeMetaState(0) + 23972), Color.red(0) + 50, TextUtils.lastIndexOf("", '0') + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                            }
                            ((Method) objOnExtraCallback3).invoke(null, objArr4);
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                            if (objOnExtraCallback4 == null) {
                                i2 = 2;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (45848 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29, 12577 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                            } else {
                                i2 = 2;
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                            cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (onNavigationEvent ^ 7798559133331975163L))) ^ ((char) (onExtraCallback ^ 7798559133331975163L)));
                            trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                            i3 = i2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = new String(cArr6);
                }

                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 61;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    if (this.label != 0) {
                        Object[] objArr = new Object[1];
                        a((char) TextUtils.getOffsetBefore("", 0), (-1350867481) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{34563, 47934, 19176, 18114, 60887, 34952, 49288, 50446, 38871, 12457, 32225, 43086, 52852, 25151, 50071, 50082, 27136, 22391, 14535, 50545, 60239, 11446, 10851, 56291, 37926, 32748, 45890, 31914, 44849, 36782, 46108, 59479, 39287, 3459, 51842, 54372, 42442, 51819, 17499, 8698, 12862, 3063, 9445, 30554, 19994, 8137, 38927}, new char[]{46529, 61598, 39477, 45213}, new char[]{59316, 31589, 22447, 54734}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    requestInnerSync requestinnersync = this.this$0;
                    Mat mat = this.$croppedMat;
                    QualityModelConfig qualityModelConfig = this.$qualityModelConfig;
                    long jOnExtraCallback = getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback();
                    Object[] objArr2 = {requestInnerSync.onExtraCallback(requestinnersync), mat, RangesKt.rangeTo(qualityModelConfig.onNavigationEvent().onNavigationEvent(), qualityModelConfig.onNavigationEvent().onExtraCallback())};
                    int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                    int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                    getCausesCount getcausescount = new getCausesCount((AppTypeEnum) markSpmExpose.onWarmupCompleted(188075357, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback2, iOnExtraCallback, -188075355, objArr2), getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(jOnExtraCallback), (DefaultConstructorMarker) null);
                    this.$brightnessResult.element = getcausescount;
                    requestInnerSync requestinnersync2 = this.this$0;
                    RVPub rVPubIAuthTabCallback = ((AppTypeEnum) getcausescount.onExtraCallback()).IAuthTabCallback();
                    RVPub rVPub = RVPub.IMAGE_BRIGHTNESS_TOO_HIGH;
                    RVPub rVPub2 = RVPub.IMAGE_BRIGHTNESS_TOO_LOW;
                    RVPub[] rVPubArr = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 2);
                    rVPubArr[0] = rVPub;
                    rVPubArr[1] = rVPub2;
                    requestInnerSync.onNavigationEvent(requestinnersync2, rVPubIAuthTabCallback, rVPubArr);
                    Unit unit = Unit.INSTANCE;
                    int i4 = onWarmupCompleted + 33;
                    IAuthTabCallback = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }
            }

            private static void a(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2;
                int i4 = 2 % 2;
                TrackSelectionParametersBuilderExternalSyntheticLambda0 trackSelectionParametersBuilderExternalSyntheticLambda0 = new TrackSelectionParametersBuilderExternalSyntheticLambda0();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c);
                cArr5[2] = (char) (cArr5[2] + ((char) i));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult = 0;
                while (trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult < length3) {
                    int i5 = $11 + 125;
                    $10 = i5 % 128;
                    int i6 = i5 % i3;
                    try {
                        Object[] objArr2 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1021624701);
                        if (objOnExtraCallback == null) {
                            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 43;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1451;
                            byte b = (byte) ($$b & 1);
                            byte b2 = (byte) (-b);
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), scrollBarSize, longPressTimeout, 228868077, false, $$c(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        Object[] objArr3 = {trackSelectionParametersBuilderExternalSyntheticLambda0};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1780722229);
                        if (objOnExtraCallback2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = (byte) (b3 - 1);
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0)), Process.getGidForName("") + 45, 1494 - (KeyEvent.getMaxKeyCode() >> 16), 1533236389, false, $$c(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        Object[] objArr4 = {trackSelectionParametersBuilderExternalSyntheticLambda0, Integer.valueOf(cArr4[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1591419428);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 23972), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 50, TextUtils.lastIndexOf("", '0', 0) + 22940, 1872485556, false, "k", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1657356614);
                        if (objOnExtraCallback4 == null) {
                            i2 = 2;
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45847), View.combineMeasuredStates(0, 0) + 29, 12578 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1401536470, false, "l", new Class[]{Integer.TYPE, Integer.TYPE});
                        } else {
                            i2 = 2;
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        cArr4[iIntValue2] = trackSelectionParametersBuilderExternalSyntheticLambda0.onNavigationEvent;
                        cArr6[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult] = (char) ((((cArr4[iIntValue2] ^ cArr[trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult]) ^ (onExtraCallbackWithResult ^ 7798559133331975163L)) ^ ((int) (IAuthTabCallback ^ 7798559133331975163L))) ^ ((char) (onNavigationEvent ^ 7798559133331975163L)));
                        trackSelectionParametersBuilderExternalSyntheticLambda0.onExtraCallbackWithResult++;
                        int i7 = $11 + 29;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        i3 = i2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i4 = this.label;
                if (i4 != 0) {
                    int i5 = onExtraCallback;
                    int i6 = i5 + 117;
                    onWarmupCompleted = i6 % 128;
                    int i7 = i6 % 2;
                    if (i4 != 1) {
                        Object[] objArr = new Object[1];
                        a((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1053864847, new char[]{39331, 13473, 53450, 19276, 33636, 8913, 33256, 16362, 49379, 12268, 52598, 9327, 42035, 2891, 36274, 9313, 59427, 34445, 33586, 50277, 37231, 53290, 18113, 41338, 16993, 38359, 36582, 3089, 45672, 37658, 29510, 11427, 61926, 23639, 57290, 41830, 64576, 47375, 10032, 21389, 37191, 34051, 12874, 38478, 54028, 26420, 48203}, new char[]{0, 0, 0, 0}, new char[]{36748, 53427, 49726, 28534}, objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    int i8 = i5 + 33;
                    onWarmupCompleted = i8 % 128;
                    int i9 = i8 % 2;
                    ResultKt.onNavigationEvent(obj);
                    return obj;
                }
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Mat matOnExtraCallback = ((isTinyGame) requestInnerSync.onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1489660631, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1489660633, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).onExtraCallback(this.$rgbMatWithDetection.onWarmupCompleted(), this.$rgbMatWithDetection.onNavigationEvent().onWarmupCompleted(), (StartClientBundle) requestInnerSync.onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1774376563, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1774376563, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), new Object[]{this.this$0}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback()));
                this.$cropResizeFaceMat.element = matOnExtraCallback;
                GeckoHubImp1[] geckoHubImp1Arr = {maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$brightnessResult, this.this$0, matOnExtraCallback, this.$qualityModelConfig, null), 3, (Object) null), maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass3(this.$blurResult, this.this$0, matOnExtraCallback, this.$qualityModelConfig, null), 3, (Object) null)};
                this.label = 1;
                Object objOnExtraCallback = ResourceCallback.onExtraCallback(geckoHubImp1Arr, this);
                if (objOnExtraCallback != objOnWarmupCompleted) {
                    return objOnExtraCallback;
                }
                int i10 = onWarmupCompleted + 9;
                onExtraCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    return objOnWarmupCompleted;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            /* renamed from: o.requestInnerSync$onNavigationEvent$onWarmupCompleted$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int onExtraCallbackWithResult = 0;
                private static char[] onNavigationEvent = {27323, 27324, 27304, 27373, 27301, 27321, 27298, 27316, 27373, 27364, 27302, 27296, 27324, 27319, 27327, 27298, 27364, 27373, 27302, 27323, 27324, 27303, 27302, 27307, 27373, 27364, 27302, 27326, 27318, 27320, 27302, 27323, 27364, 27373, 27324, 27321, 27373, 27297, 27297, 27306, 27304, 27302, 27327, 27298, 27321, 27318, 27324};
                private static int onWarmupCompleted = 1;
                final /* synthetic */ Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> $blurResult;
                final /* synthetic */ Mat $croppedMat;
                final /* synthetic */ QualityModelConfig $qualityModelConfig;
                int label;
                final /* synthetic */ requestInnerSync this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(Ref.ObjectRef<getCausesCount<AppTypeEnum<Double>>> objectRef, requestInnerSync requestinnersync, Mat mat, QualityModelConfig qualityModelConfig, access13800<? super AnonymousClass3> access13800Var) {
                    super(2, access13800Var);
                    this.$blurResult = objectRef;
                    this.this$0 = requestinnersync;
                    this.$croppedMat = mat;
                    this.$qualityModelConfig = qualityModelConfig;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$blurResult, this.this$0, this.$croppedMat, this.$qualityModelConfig, access13800Var);
                    int i2 = onWarmupCompleted + 23;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 == 0) {
                        return anonymousClass3;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 15;
                    onWarmupCompleted = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 == 0) {
                        onNavigationEvent(findresandmsg, access13800Var);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
                    int i3 = onExtraCallbackWithResult + 99;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    return objOnNavigationEvent;
                }

                public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 17;
                    onWarmupCompleted = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        anonymousClass3Create.invokeSuspend(unit);
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass3Create.invokeSuspend(unit);
                    int i4 = onWarmupCompleted + 83;
                    onExtraCallbackWithResult = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x008d, code lost:
                
                    if ((r3 % 2) == 0) goto L12;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:11:0x008f, code lost:
                
                    r1 = 88 / 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:12:0x0092, code lost:
                
                    return r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0093, code lost:
                
                    r6 = new java.lang.Object[1];
                    a(new int[]{0, 47, 131, 41}, true, null, r6);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
                
                    throw new java.lang.IllegalStateException(((java.lang.String) r6[0]).intern());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
                
                    if (r17.label == 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
                
                    if (r17.label == 0) goto L9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
                
                    kotlin.ResultKt.onNavigationEvent(r18);
                    r2 = r17.this$0;
                    r6 = r17.$croppedMat;
                    r7 = r17.$qualityModelConfig;
                    r8 = o.getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback();
                    r6 = new o.getCausesCount((o.AppTypeEnum) o.behavior.onWarmupCompleted(new java.lang.Object[]{o.requestInnerSync.IAuthTabCallback(r2), r6, r7.IAuthTabCallback()}, com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent(), 1786700769, com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent(), com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent(), -1786700766, com.facebook.react.viewmanagers.RNSScreenManagerDelegate.onNavigationEvent()), o.getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(r8), (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    r17.$blurResult.element = r6;
                    r2 = r17.this$0;
                    r3 = ((o.AppTypeEnum) r6.onExtraCallback()).IAuthTabCallback();
                    r6 = o.RVPub.FACE_TOO_BLURRY;
                    r4 = (o.RVPub[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName("o.RVPub"), 1);
                    r4[0] = r6;
                    o.requestInnerSync.onNavigationEvent(r2, r3, r4);
                    r2 = kotlin.Unit.INSTANCE;
                    r3 = o.requestInnerSync.onNavigationEvent.onWarmupCompleted.AnonymousClass3.onWarmupCompleted + 59;
                    o.requestInnerSync.onNavigationEvent.onWarmupCompleted.AnonymousClass3.onExtraCallbackWithResult = r3 % 128;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int i = 2 % 2;
                    int i2 = onWarmupCompleted + 3;
                    onExtraCallbackWithResult = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 55 / 0;
                    }
                }

                private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                    int i;
                    int i2 = 2;
                    int i3 = 2 % 2;
                    TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    int i6 = iArr[2];
                    int i7 = iArr[3];
                    char[] cArr = onNavigationEvent;
                    char c = '0';
                    if (cArr != null) {
                        int length = cArr.length;
                        char[] cArr2 = new char[length];
                        int i8 = 0;
                        while (i8 < length) {
                            int i9 = $11 + 113;
                            $10 = i9 % 128;
                            int i10 = i9 % i2;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35282 - TextUtils.indexOf("", c, 0, 0)), 34 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                                }
                                cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                                i8++;
                                i2 = 2;
                                c = '0';
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
                    char[] cArr3 = new char[i5];
                    System.arraycopy(cArr, i4, cArr3, 0, i5);
                    if (bArr != null) {
                        char[] cArr4 = new char[i5];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        char c2 = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                            int i11 = $10 + 37;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                                int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 10935), 66 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (Process.myTid() >> 22) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            } else {
                                int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c2)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 29 - View.resolveSize(0, 0), 17657 - View.MeasureSpec.getMode(0), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            }
                            c2 = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                            Object[] objArr5 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49466 - TextUtils.lastIndexOf("", '0', 0)), 70 - KeyEvent.keyCodeFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12485, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback4).invoke(null, objArr5);
                        }
                        cArr3 = cArr4;
                    }
                    if (i7 > 0) {
                        char[] cArr5 = new char[i5];
                        System.arraycopy(cArr3, 0, cArr5, 0, i5);
                        int i15 = i5 - i7;
                        System.arraycopy(cArr5, 0, cArr3, i15, i7);
                        System.arraycopy(cArr5, i7, cArr3, 0, i15);
                    }
                    if (z) {
                        char[] cArr6 = new char[i5];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                            int i16 = $11 + 9;
                            $10 = i16 % 128;
                            if (i16 % 2 != 0) {
                                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 / trackGroupExternalSyntheticLambda0.onNavigationEvent) / 0];
                                i = trackGroupExternalSyntheticLambda0.onNavigationEvent << 1;
                            } else {
                                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                                i = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                            }
                            trackGroupExternalSyntheticLambda0.onNavigationEvent = i;
                        }
                        cArr3 = cArr6;
                    }
                    if (i6 > 0) {
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                        while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                            int i17 = $10 + 115;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                            cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                            trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                        }
                    }
                    objArr[0] = new String(cArr3);
                }
            }
        }

        static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super kotlin.Result<? extends Unit>>, Object> {
            final /* synthetic */ Ref.ObjectRef<isTinyGame.IAuthTabCallback> $alignImageWithTemplate;
            final /* synthetic */ Ref.ObjectRef<getCausesCount<PluginParamModel>> $qcResult;
            final /* synthetic */ QualityModelConfig $qualityModelConfig;
            final /* synthetic */ RgbMatWithDetection $rgbMatWithDetection;
            long J$0;
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ requestInnerSync this$0;
            private static final byte[] $$a = {102, -86, -98, 53};
            private static final int $$b = 158;
            private static int $10 = 0;
            private static int $11 = 1;
            private static int onWarmupCompleted = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onExtraCallback = 478309025;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static String $$c(short s, int i, int i2) {
                int i3;
                int i4;
                byte[] bArr = $$a;
                int i5 = 105 - (i2 * 2);
                int i6 = i * 3;
                int i7 = (s * 4) + 4;
                byte[] bArr2 = new byte[1 - i6];
                int i8 = 0 - i6;
                if (bArr == null) {
                    int i9 = i7;
                    i3 = 0;
                    int i10 = i7;
                    i5 += i9;
                    i4 = i10 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i8) {
                        return new String(bArr2, 0);
                    }
                    i9 = bArr[i4];
                    i3++;
                    i10 = i4;
                    i5 += i9;
                    i4 = i10 + 1;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i8) {
                    }
                } else {
                    i3 = 0;
                    i4 = i7;
                    bArr2[i3] = (byte) i5;
                    if (i3 == i8) {
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            onExtraCallback(requestInnerSync requestinnersync, RgbMatWithDetection rgbMatWithDetection, Ref.ObjectRef<isTinyGame.IAuthTabCallback> objectRef, Ref.ObjectRef<getCausesCount<PluginParamModel>> objectRef2, QualityModelConfig qualityModelConfig, access13800<? super onExtraCallback> access13800Var) {
                super(2, access13800Var);
                this.this$0 = requestinnersync;
                this.$rgbMatWithDetection = rgbMatWithDetection;
                this.$alignImageWithTemplate = objectRef;
                this.$qcResult = objectRef2;
                this.$qualityModelConfig = qualityModelConfig;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super kotlin.Result<Unit>> access13800Var) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
                int i4 = onWarmupCompleted + 95;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                onExtraCallback onextracallback = new onExtraCallback(this.this$0, this.$rgbMatWithDetection, this.$alignImageWithTemplate, this.$qcResult, this.$qualityModelConfig, access13800Var);
                int i2 = onWarmupCompleted + 39;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return onextracallback;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 57;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                int i4 = onExtraCallbackWithResult + 13;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return objIAuthTabCallback;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
                int i4;
                float f;
                Throwable cause;
                int i5 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (true) {
                    i4 = 2083011369;
                    f = 0.0f;
                    if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                        break;
                    }
                    int i6 = $10 + 39;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
                    int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8]), Integer.valueOf(onExtraCallback)};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 23 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10277, 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                        if (objOnExtraCallback2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 12843), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 55, 2166 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                    cause = th.getCause();
                    if (cause != null) {
                        throw th;
                    }
                    throw cause;
                }
                if (i2 > 0) {
                    int i9 = $10 + 101;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                }
                if (z) {
                    int i11 = $11 + 111;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    int i13 = $11 + 119;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                        if (objOnExtraCallback3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTapTimeout() >> 16) + 12843), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55, 2167 - (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                        i4 = 2083011369;
                        f = 0.0f;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2;
                requestInnerSync requestinnersync;
                long jOnExtraCallback;
                Object objIAuthTabCallback;
                Ref.ObjectRef<getCausesCount<PluginParamModel>> objectRef;
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj3 = null;
                try {
                    if (i2 != 0) {
                        int i3 = onWarmupCompleted + 5;
                        onExtraCallbackWithResult = i3 % 128;
                        int i4 = i3 % 2;
                        if (i2 != 1) {
                            Object[] objArr = new Object[1];
                            a(MotionEvent.axisFromString("") + 48, 3 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{16, 5, 7, '\t', 18, '\r', 24, 25, 19, 22, 19, 7, 65476, '\f', 24, '\r', 27, 65476, 65483, '\t', 15, 19, 26, 18, '\r', 65483, 65476, '\t', 22, 19, '\n', '\t', 6, 65476, 65483, '\t', 17, 25, 23, '\t', 22, 65483, 65476, 19, 24, 65476, 16}, true, 229 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                            throw new IllegalStateException(((String) objArr[0]).intern());
                        }
                        long j = this.J$0;
                        objectRef = (Ref.ObjectRef) this.L$1;
                        requestinnersync = (requestInnerSync) this.L$0;
                        ResultKt.onNavigationEvent(obj);
                        int i5 = onWarmupCompleted + 53;
                        onExtraCallbackWithResult = i5 % 128;
                        int i6 = i5 % 2;
                        jOnExtraCallback = j;
                        objIAuthTabCallback = obj;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        requestinnersync = this.this$0;
                        RgbMatWithDetection rgbMatWithDetection = this.$rgbMatWithDetection;
                        Ref.ObjectRef<isTinyGame.IAuthTabCallback> objectRef2 = this.$alignImageWithTemplate;
                        Ref.ObjectRef<getCausesCount<PluginParamModel>> objectRef3 = this.$qcResult;
                        QualityModelConfig qualityModelConfig = this.$qualityModelConfig;
                        Result.Companion companion = kotlin.Result.Companion;
                        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
                        isTinyGame.IAuthTabCallback IAuthTabCallback = ((isTinyGame) requestInnerSync.onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1489660631, iIAuthTabCallback, 1489660633, iIAuthTabCallback2, new Object[]{requestinnersync}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback())).IAuthTabCallback(rgbMatWithDetection);
                        objectRef2.element = IAuthTabCallback;
                        jOnExtraCallback = getBuildFingerprint.onWarmupCompleted.onNavigationEvent.onExtraCallback();
                        isWeb iswebIAuthTabCallbackDefault = requestInnerSync.IAuthTabCallbackDefault(requestinnersync);
                        QcV2Config qcV2ConfigIAuthTabCallbackDefault = qualityModelConfig.IAuthTabCallbackDefault();
                        this.L$0 = requestinnersync;
                        this.L$1 = objectRef3;
                        this.J$0 = jOnExtraCallback;
                        this.label = 1;
                        objIAuthTabCallback = iswebIAuthTabCallbackDefault.IAuthTabCallback(IAuthTabCallback, qcV2ConfigIAuthTabCallbackDefault, this);
                        if (objIAuthTabCallback == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                        objectRef = objectRef3;
                    }
                    getCausesCount getcausescount = new getCausesCount(objIAuthTabCallback, getBuildFingerprint.onWarmupCompleted.onWarmupCompleted.onExtraCallback(jOnExtraCallback), (DefaultConstructorMarker) null);
                    objectRef.element = getcausescount;
                    Object[] objArr2 = {(PluginParamModel) getcausescount.onExtraCallback()};
                    int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
                    RVPub rVPubIAuthTabCallback = ((AppTypeEnum) PluginParamModel.onNavigationEvent(1339321398, forceDomainCheck.IAuthTabCallback(), objArr2, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1339321398, iIAuthTabCallback3)).IAuthTabCallback();
                    RVPub rVPub = RVPub.FACE_MASK_DETECTED;
                    RVPub[] rVPubArr = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr[0] = rVPub;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback, rVPubArr);
                    RVPub rVPubIAuthTabCallback2 = ((PluginParamModel) getcausescount.onExtraCallback()).access000().IAuthTabCallback();
                    RVPub rVPub2 = RVPub.FACE_SUNGLASSES_DETECTED;
                    RVPub[] rVPubArr2 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr2[0] = rVPub2;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback2, rVPubArr2);
                    RVPub rVPubIAuthTabCallback3 = ((PluginParamModel) getcausescount.onExtraCallback()).asBinder().IAuthTabCallback();
                    RVPub rVPub3 = RVPub.FACE_OCCLUSION_DETECTED;
                    RVPub[] rVPubArr3 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr3[0] = rVPub3;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback3, rVPubArr3);
                    RVPub rVPubIAuthTabCallback4 = ((PluginParamModel) getcausescount.onExtraCallback()).onExtraCallback().IAuthTabCallback();
                    RVPub rVPub4 = RVPub.FACE_EYE_CLOSED_DETECTED;
                    RVPub[] rVPubArr4 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr4[0] = rVPub4;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback4, rVPubArr4);
                    RVPub rVPubIAuthTabCallback5 = ((PluginParamModel) getcausescount.onExtraCallback()).IAuthTabCallbackDefault().IAuthTabCallback();
                    RVPub rVPub5 = RVPub.FACE_NON_NEUTRAL_EXPRESSION_DETECTED;
                    RVPub[] rVPubArr5 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr5[0] = rVPub5;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback5, rVPubArr5);
                    RVPub rVPubIAuthTabCallback6 = ((PluginParamModel) getcausescount.onExtraCallback()).onTransact().IAuthTabCallback();
                    RVPub rVPub6 = RVPub.FACE_EULER_ANGLE_FAIL;
                    RVPub[] rVPubArr6 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr6[0] = rVPub6;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback6, rVPubArr6);
                    Object[] objArr3 = {(PluginParamModel) getcausescount.onExtraCallback()};
                    int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
                    RVPub rVPubIAuthTabCallback7 = ((AppTypeEnum) PluginParamModel.onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), objArr3, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1191925291, iIAuthTabCallback4)).IAuthTabCallback();
                    RVPub rVPub7 = RVPub.FACE_RECOGNITION_QUALITY_LOW;
                    RVPub[] rVPubArr7 = (RVPub[]) Array.newInstance(Class.forName("o.RVPub"), 1);
                    rVPubArr7[0] = rVPub7;
                    requestInnerSync.onNavigationEvent(requestinnersync, rVPubIAuthTabCallback7, rVPubArr7);
                    obj2 = kotlin.Result.constructor-impl(Unit.INSTANCE);
                    int i7 = onWarmupCompleted + 43;
                    onExtraCallbackWithResult = i7 % 128;
                    int i8 = i7 % 2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Result.Companion companion2 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e2));
                } catch (WebResourceResponseModel e3) {
                    Result.Companion companion3 = kotlin.Result.Companion;
                    obj2 = kotlin.Result.constructor-impl(ResultKt.createFailure(e3));
                }
                if (kotlin.Result.exceptionOrNull-impl(obj2) != null) {
                    ImageFormat.getBitsPerPixel(0);
                    PointF.length(0.0f, 0.0f);
                    Process.getThreadPriority(0);
                    TextUtils.lastIndexOf("", '0', 0, 0);
                    ViewConfiguration.getKeyRepeatDelay();
                    AudioTrack.getMaxVolume();
                }
                kotlin.Result resultIAuthTabCallback = kotlin.Result.IAuthTabCallback(obj2);
                int i9 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i9 % 128;
                if (i9 % 2 != 0) {
                    return resultIAuthTabCallback;
                }
                obj3.hashCode();
                throw null;
            }
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = IAuthTabCallback;
            if (cArr2 != null) {
                int i3 = $11 + 75;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(238556475);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 77, TextUtils.lastIndexOf("", '0') + 20953, 1064889259, false, "x", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            Object[] objArr3 = {Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-23644091);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 75 - (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 16037, -807942443, false, "y", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
            if (onNavigationEvent) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i6 = $11 + 11;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback >>> 1) / defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] >> iIntValue);
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 62, 12214 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iIntValue);
                        Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.red(0), ExpandableListView.getPackedPositionChild(0L) + 64, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 12214, 260110015, false, "v", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    }
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!onExtraCallback) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                    defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iIntValue);
                Object[] objArr6 = {defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1052772399);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 63 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 12214 - TextUtils.indexOf("", "", 0, 0), 260110015, false, "v", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr6);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01f5 A[PHI: r2
          0x01f5: PHI (r2v12 o.AppTypeEnum) = (r2v11 o.AppTypeEnum), (r2v17 o.AppTypeEnum) binds: [B:56:0x01f3, B:53:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x02ab  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x02b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref.ObjectRef objectRef;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            GeckoHubImp1[] geckoHubImp1Arr;
            Object objOnExtraCallback;
            Ref.ObjectRef objectRef5;
            Ref.ObjectRef objectRef6;
            Ref.ObjectRef objectRef7;
            isTinyGame.IAuthTabCallback iAuthTabCallback;
            Mat mat;
            isTinyGame.IAuthTabCallback iAuthTabCallback2;
            Mat mat2;
            getCausesCount getcausescount;
            PluginParamModel pluginParamModel;
            Integer numOnNavigationEvent;
            boolean z;
            float fFloatValue;
            boolean z2;
            AppTypeEnum appTypeEnum;
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                RgbMatWithDetection rgbMatWithDetection = new RgbMatWithDetection(this.$rgbMat, this.$face);
                Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef9 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef10 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef11 = new Ref.ObjectRef();
                Ref.ObjectRef objectRef12 = new Ref.ObjectRef();
                objectRef = objectRef11;
                try {
                    geckoHubImp1Arr = new GeckoHubImp1[]{maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onExtraCallback(this.this$0, rgbMatWithDetection, objectRef11, objectRef8, this.$qualityModelConfig, null), 3, (Object) null), maybeUpdateAnimatable.onExtraCallback(findresandmsg, (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(this.this$0, rgbMatWithDetection, objectRef12, objectRef9, this.$qualityModelConfig, objectRef10, null), 3, (Object) null)};
                    this.L$0 = objectRef8;
                    this.L$1 = objectRef9;
                    this.L$2 = objectRef10;
                    this.L$3 = objectRef;
                    objectRef2 = objectRef12;
                } catch (Throwable th) {
                    th = th;
                    objectRef2 = objectRef12;
                }
                try {
                    this.L$4 = objectRef2;
                    this.label = 1;
                    objOnExtraCallback = ResourceCallback.onExtraCallback(geckoHubImp1Arr, this);
                    if (objOnExtraCallback == objOnWarmupCompleted) {
                        int i3 = onTransact + 45;
                        onWarmupCompleted = i3 % 128;
                        int i4 = i3 % 2;
                        return objOnWarmupCompleted;
                    }
                    objectRef5 = objectRef10;
                    objectRef6 = objectRef9;
                    objectRef4 = objectRef2;
                    objectRef7 = objectRef8;
                    iAuthTabCallback2 = (isTinyGame.IAuthTabCallback) objectRef.element;
                    if (iAuthTabCallback2 != null) {
                    }
                    mat2 = (Mat) objectRef4.element;
                    if (mat2 != null) {
                    }
                    getcausescount = (getCausesCount) objectRef7.element;
                    if (getcausescount == null) {
                    }
                    CandidateFrameConfig candidateFrameConfigOnExtraCallbackWithResult = this.$serviceConfig.onExtraCallbackWithResult();
                    if (candidateFrameConfigOnExtraCallbackWithResult == null) {
                    }
                    if (numOnNavigationEvent == null) {
                        z = false;
                    }
                    if (pluginParamModel == null) {
                    }
                    if (z) {
                        z2 = false;
                    }
                    return new setPerformanceStageReentrantWhiteList(requestInnerSync.onWarmupCompleted(this.this$0).onExtraCallbackWithResult(), z2, this.$face, onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            Pair pairIAuthTabCallback = requestInnerSync.onNavigationEvent.IAuthTabCallback((PluginParamModel) obj2);
                            int i8 = onNavigationEvent + 9;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 != 0) {
                                return pairIAuthTabCallback;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 71;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            Float fValueOf = Float.valueOf(((Float) requestInnerSync.onNavigationEvent.onNavigationEvent(238249449, -238249446, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue());
                            int i8 = onWarmupCompleted + 1;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return fValueOf;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 1;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            AnimUtils animUtils = (AnimUtils) requestInnerSync.onNavigationEvent.onNavigationEvent(-2073400948, 2073400952, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult());
                            int i8 = onNavigationEvent + 23;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 == 0) {
                                return animUtils;
                            }
                            throw null;
                        }
                    }), onExtraCallback((getCausesCount<AppTypeEnum<Double>>) objectRef6.element), onExtraCallback((getCausesCount<AppTypeEnum<Double>>) objectRef5.element), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 29;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            float fAsBinder = requestInnerSync.onNavigationEvent.asBinder((PluginParamModel) obj2);
                            if (i7 == 0) {
                                return Float.valueOf(fAsBinder);
                            }
                            Float.valueOf(fAsBinder);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda5
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 67;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onExtraCallbackWithResult((PluginParamModel) obj2));
                            int i8 = onNavigationEvent + 45;
                            onWarmupCompleted = i8 % 128;
                            if (i8 % 2 == 0) {
                                return fValueOf;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 59;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            Float fValueOf = Float.valueOf(((Float) requestInnerSync.onNavigationEvent.onNavigationEvent(766485428, -766485426, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue());
                            int i8 = onWarmupCompleted + 33;
                            onExtraCallback = i8 % 128;
                            int i9 = i8 % 2;
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onExtraCallbackWithResult + 99;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.IAuthTabCallbackStub((PluginParamModel) obj2));
                            int i8 = onExtraCallback + 13;
                            onExtraCallbackWithResult = i8 % 128;
                            if (i8 % 2 != 0) {
                                return fValueOf;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda8
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onWarmupCompleted + 103;
                            onNavigationEvent = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onExtraCallback((PluginParamModel) obj2));
                            int i8 = onWarmupCompleted + 51;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 5 / 0;
                            }
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda9
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 17;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onWarmupCompleted((PluginParamModel) obj2));
                            int i8 = IAuthTabCallback + 95;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 != 0) {
                                return fValueOf;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda10
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = onNavigationEvent + 23;
                            onExtraCallback = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onNavigationEvent((PluginParamModel) obj2));
                            int i8 = onExtraCallback + 75;
                            onNavigationEvent = i8 % 128;
                            if (i8 % 2 == 0) {
                                int i9 = 89 / 0;
                            }
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 55;
                            onWarmupCompleted = i6 % 128;
                            int i7 = i6 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.IAuthTabCallbackDefault((PluginParamModel) obj2));
                            int i8 = IAuthTabCallback + 41;
                            onWarmupCompleted = i8 % 128;
                            int i9 = i8 % 2;
                            return fValueOf;
                        }
                    }));
                } catch (Throwable th2) {
                    th = th2;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef2;
                    iAuthTabCallback = (isTinyGame.IAuthTabCallback) objectRef3.element;
                    if (iAuthTabCallback != null) {
                    }
                    mat = (Mat) objectRef4.element;
                    if (mat != null) {
                    }
                    throw th;
                }
            }
            if (i2 != 1) {
                Object[] objArr = new Object[1];
                a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, (KeyEvent.getMaxKeyCode() >> 16) + 127, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i5 = onTransact + 63;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            objectRef4 = (Ref.ObjectRef) this.L$4;
            objectRef3 = (Ref.ObjectRef) this.L$3;
            objectRef5 = (Ref.ObjectRef) this.L$2;
            objectRef6 = (Ref.ObjectRef) this.L$1;
            objectRef7 = (Ref.ObjectRef) this.L$0;
            try {
                ResultKt.onNavigationEvent(obj);
                objectRef = objectRef3;
                objOnExtraCallback = obj;
                try {
                    iAuthTabCallback2 = (isTinyGame.IAuthTabCallback) objectRef.element;
                    if (iAuthTabCallback2 != null) {
                        iAuthTabCallback2.onWarmupCompleted();
                    }
                    mat2 = (Mat) objectRef4.element;
                    if (mat2 != null) {
                        mat2.release();
                    }
                    getcausescount = (getCausesCount) objectRef7.element;
                    if (getcausescount == null) {
                        int i7 = onWarmupCompleted + 43;
                        onTransact = i7 % 128;
                        int i8 = i7 % 2;
                        pluginParamModel = (PluginParamModel) getcausescount.onExtraCallback();
                    } else {
                        int i9 = onWarmupCompleted + 55;
                        onTransact = i9 % 128;
                        int i10 = i9 % 2;
                        pluginParamModel = null;
                    }
                    CandidateFrameConfig candidateFrameConfigOnExtraCallbackWithResult2 = this.$serviceConfig.onExtraCallbackWithResult();
                    numOnNavigationEvent = candidateFrameConfigOnExtraCallbackWithResult2 == null ? access14000.onNavigationEvent(candidateFrameConfigOnExtraCallbackWithResult2.IAuthTabCallback()) : null;
                    if (numOnNavigationEvent == null && numOnNavigationEvent.intValue() > 0 && pluginParamModel != null && pluginParamModel.onTransact().onExtraCallbackWithResult() && pluginParamModel.asBinder().onExtraCallbackWithResult()) {
                        int i11 = onTransact + 27;
                        onWarmupCompleted = i11 % 128;
                        int i12 = i11 % 2;
                        if (((AppTypeEnum) PluginParamModel.onNavigationEvent(1339321398, forceDomainCheck.IAuthTabCallback(), new Object[]{pluginParamModel}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1339321398, forceDomainCheck.IAuthTabCallback())).onExtraCallbackWithResult() && pluginParamModel.access000().onExtraCallbackWithResult()) {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (pluginParamModel == null) {
                        int i13 = onWarmupCompleted + 121;
                        onTransact = i13 % 128;
                        if (i13 % 2 == 0) {
                            appTypeEnum = (AppTypeEnum) PluginParamModel.onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), new Object[]{pluginParamModel}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1191925291, forceDomainCheck.IAuthTabCallback());
                            int i14 = 53 / 0;
                            fFloatValue = appTypeEnum != null ? ((Number) appTypeEnum.onWarmupCompleted()).floatValue() : 0.0f;
                        } else {
                            appTypeEnum = (AppTypeEnum) PluginParamModel.onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), new Object[]{pluginParamModel}, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1191925291, forceDomainCheck.IAuthTabCallback());
                            if (appTypeEnum != null) {
                            }
                        }
                    }
                    if (z || fFloatValue <= requestInnerSync.asInterface(this.this$0)) {
                        z2 = false;
                    } else {
                        requestInnerSync.onExtraCallbackWithResult(this.this$0, fFloatValue);
                        z2 = true;
                    }
                    return new setPerformanceStageReentrantWhiteList(requestInnerSync.onWarmupCompleted(this.this$0).onExtraCallbackWithResult(), z2, this.$face, onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onNavigationEvent + 57;
                            onExtraCallbackWithResult = i62 % 128;
                            int i72 = i62 % 2;
                            Pair pairIAuthTabCallback = requestInnerSync.onNavigationEvent.IAuthTabCallback((PluginParamModel) obj2);
                            int i82 = onNavigationEvent + 9;
                            onExtraCallbackWithResult = i82 % 128;
                            if (i82 % 2 != 0) {
                                return pairIAuthTabCallback;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda2
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onWarmupCompleted + 71;
                            IAuthTabCallback = i62 % 128;
                            int i72 = i62 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            Float fValueOf = Float.valueOf(((Float) requestInnerSync.onNavigationEvent.onNavigationEvent(238249449, -238249446, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue());
                            int i82 = onWarmupCompleted + 1;
                            IAuthTabCallback = i82 % 128;
                            if (i82 % 2 == 0) {
                                return fValueOf;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda3
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = IAuthTabCallback + 1;
                            onNavigationEvent = i62 % 128;
                            int i72 = i62 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            AnimUtils animUtils = (AnimUtils) requestInnerSync.onNavigationEvent.onNavigationEvent(-2073400948, 2073400952, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult());
                            int i82 = onNavigationEvent + 23;
                            IAuthTabCallback = i82 % 128;
                            if (i82 % 2 == 0) {
                                return animUtils;
                            }
                            throw null;
                        }
                    }), onExtraCallback((getCausesCount<AppTypeEnum<Double>>) objectRef6.element), onExtraCallback((getCausesCount<AppTypeEnum<Double>>) objectRef5.element), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda4
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = IAuthTabCallback + 29;
                            onExtraCallbackWithResult = i62 % 128;
                            int i72 = i62 % 2;
                            float fAsBinder = requestInnerSync.onNavigationEvent.asBinder((PluginParamModel) obj2);
                            if (i72 == 0) {
                                return Float.valueOf(fAsBinder);
                            }
                            Float.valueOf(fAsBinder);
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda5
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onWarmupCompleted + 67;
                            onNavigationEvent = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onExtraCallbackWithResult((PluginParamModel) obj2));
                            int i82 = onNavigationEvent + 45;
                            onWarmupCompleted = i82 % 128;
                            if (i82 % 2 == 0) {
                                return fValueOf;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda6
                        private static int onExtraCallback = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onWarmupCompleted + 59;
                            onExtraCallback = i62 % 128;
                            int i72 = i62 % 2;
                            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
                            Float fValueOf = Float.valueOf(((Float) requestInnerSync.onNavigationEvent.onNavigationEvent(766485428, -766485426, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{(PluginParamModel) obj2}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue());
                            int i82 = onWarmupCompleted + 33;
                            onExtraCallback = i82 % 128;
                            int i92 = i82 % 2;
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda7
                        private static int onExtraCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onExtraCallbackWithResult + 99;
                            onExtraCallback = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.IAuthTabCallbackStub((PluginParamModel) obj2));
                            int i82 = onExtraCallback + 13;
                            onExtraCallbackWithResult = i82 % 128;
                            if (i82 % 2 != 0) {
                                return fValueOf;
                            }
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda8
                        private static int onNavigationEvent = 1;
                        private static int onWarmupCompleted;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onWarmupCompleted + 103;
                            onNavigationEvent = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onExtraCallback((PluginParamModel) obj2));
                            int i82 = onWarmupCompleted + 51;
                            onNavigationEvent = i82 % 128;
                            if (i82 % 2 == 0) {
                                int i92 = 5 / 0;
                            }
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda9
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onNavigationEvent + 17;
                            IAuthTabCallback = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onWarmupCompleted((PluginParamModel) obj2));
                            int i82 = IAuthTabCallback + 95;
                            onNavigationEvent = i82 % 128;
                            if (i82 % 2 != 0) {
                                return fValueOf;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda10
                        private static int onExtraCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = onNavigationEvent + 23;
                            onExtraCallback = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.onNavigationEvent((PluginParamModel) obj2));
                            int i82 = onExtraCallback + 75;
                            onNavigationEvent = i82 % 128;
                            if (i82 % 2 == 0) {
                                int i92 = 89 / 0;
                            }
                            return fValueOf;
                        }
                    }), onWarmupCompleted(objectRef7, new Function1() { // from class: im.toss.facepay.validation.validations.FacePhotometricChecker$facePhotometricInfo$2$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke(Object obj2) {
                            int i52 = 2 % 2;
                            int i62 = IAuthTabCallback + 55;
                            onWarmupCompleted = i62 % 128;
                            int i72 = i62 % 2;
                            Float fValueOf = Float.valueOf(requestInnerSync.onNavigationEvent.IAuthTabCallbackDefault((PluginParamModel) obj2));
                            int i82 = IAuthTabCallback + 41;
                            onWarmupCompleted = i82 % 128;
                            int i92 = i82 % 2;
                            return fValueOf;
                        }
                    }));
                } catch (Throwable th3) {
                    th = th3;
                    objectRef3 = objectRef;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            iAuthTabCallback = (isTinyGame.IAuthTabCallback) objectRef3.element;
            if (iAuthTabCallback != null) {
                iAuthTabCallback.onWarmupCompleted();
            }
            mat = (Mat) objectRef4.element;
            if (mat != null) {
                int i15 = onTransact + 29;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                mat.release();
            }
            throw th;
        }

        private static final <T> getCausesCount<T> onWarmupCompleted(Ref.ObjectRef<getCausesCount<PluginParamModel>> objectRef, Function1<? super PluginParamModel, ? extends T> function1) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 93;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            getCausesCount getcausescount = (getCausesCount) objectRef.element;
            if (i3 == 0) {
                throw null;
            }
            if (getcausescount != null) {
                return new getCausesCount<>(function1.invoke(getcausescount.onExtraCallback()), getcausescount.onWarmupCompleted(), (DefaultConstructorMarker) null);
            }
            int i4 = onWarmupCompleted + 33;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        
            r2.hashCode();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r6 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r6 != null) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = new o.getCausesCount<>(((o.AppTypeEnum) r6.onExtraCallback()).onWarmupCompleted(), r6.onWarmupCompleted(), (kotlin.jvm.internal.DefaultConstructorMarker) null);
            r6 = o.requestInnerSync.onNavigationEvent.onWarmupCompleted + 39;
            o.requestInnerSync.onNavigationEvent.onTransact = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        
            if ((r6 % 2) == 0) goto L11;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final getCausesCount<Double> onExtraCallback(getCausesCount<AppTypeEnum<Double>> getcausescount) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onTransact = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
        }

        private static final Pair IAuthTabCallbackStubProxy(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            Pair pair = new Pair(pluginParamModel.onExtraCallback().onWarmupCompleted(), pluginParamModel.onExtraCallback().onWarmupCompleted());
            int i2 = onTransact + 29;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return pair;
        }

        private static final float writeTypedObject(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 111;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = pluginParamModel.asBinder().onWarmupCompleted().floatValue();
            int i4 = onWarmupCompleted + 89;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return fFloatValue;
        }

        private static final AnimUtils extraCallback(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 43;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            AnimUtils animUtilsOnWarmupCompleted = pluginParamModel.onTransact().onWarmupCompleted();
            int i4 = onTransact + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return animUtilsOnWarmupCompleted;
        }

        private static final float ICustomTabsCallback(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 5;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
                int iIAuthTabCallback2 = forceDomainCheck.IAuthTabCallback();
                return ((Number) ((AppTypeEnum) PluginParamModel.onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), new Object[]{pluginParamModel}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback2, -1191925291, iIAuthTabCallback)).onWarmupCompleted()).floatValue();
            }
            int iIAuthTabCallback3 = forceDomainCheck.IAuthTabCallback();
            int iIAuthTabCallback4 = forceDomainCheck.IAuthTabCallback();
            int i3 = 9 / 0;
            return ((Number) ((AppTypeEnum) PluginParamModel.onNavigationEvent(1191925292, forceDomainCheck.IAuthTabCallback(), new Object[]{pluginParamModel}, forceDomainCheck.IAuthTabCallback(), iIAuthTabCallback4, -1191925291, iIAuthTabCallback3)).onWarmupCompleted()).floatValue();
        }

        private static final float readTypedObject(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 11;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            Object[] objArr = {pluginParamModel};
            int iIAuthTabCallback = forceDomainCheck.IAuthTabCallback();
            if (i3 != 0) {
                ((Number) ((AppTypeEnum) PluginParamModel.onNavigationEvent(1339321398, forceDomainCheck.IAuthTabCallback(), objArr, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1339321398, iIAuthTabCallback)).onWarmupCompleted()).floatValue();
                obj.hashCode();
                throw null;
            }
            float fFloatValue = ((Number) ((AppTypeEnum) PluginParamModel.onNavigationEvent(1339321398, forceDomainCheck.IAuthTabCallback(), objArr, forceDomainCheck.IAuthTabCallback(), forceDomainCheck.IAuthTabCallback(), -1339321398, iIAuthTabCallback)).onWarmupCompleted()).floatValue();
            int i4 = onTransact + 27;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return fFloatValue;
            }
            throw null;
        }

        private static final float extraCallbackWithResult(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Float fOnWarmupCompleted = pluginParamModel.access000().onWarmupCompleted();
            if (i3 != 0) {
                return fOnWarmupCompleted.floatValue();
            }
            fOnWarmupCompleted.floatValue();
            throw null;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
            int i = 2 % 2;
            int i2 = onTransact + 87;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Float fOnWarmupCompleted = pluginParamModel.IAuthTabCallbackDefault().onWarmupCompleted();
            if (i3 == 0) {
                return Float.valueOf(fOnWarmupCompleted.floatValue());
            }
            fOnWarmupCompleted.floatValue();
            throw null;
        }

        private static final float onPostMessage(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 5;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = pluginParamModel.onNavigationEvent().onWarmupCompleted().floatValue();
            int i4 = onTransact + 31;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return fFloatValue;
            }
            throw null;
        }

        private static final float IAuthTabCallback_Parcel(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 117;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = pluginParamModel.onWarmupCompleted().onWarmupCompleted().floatValue();
            int i4 = onTransact + 117;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return fFloatValue;
        }

        private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
            PluginParamModel pluginParamModel = (PluginParamModel) objArr[0];
            int i = 2 % 2;
            int i2 = onTransact + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = pluginParamModel.IAuthTabCallback().onWarmupCompleted().floatValue();
            if (i3 != 0) {
                int i4 = 75 / 0;
            }
            return Float.valueOf(fFloatValue);
        }

        private static final float access100(PluginParamModel pluginParamModel) {
            int i = 2 % 2;
            int i2 = onTransact + 55;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            float fFloatValue = pluginParamModel.onExtraCallbackWithResult().onWarmupCompleted().floatValue();
            if (i3 != 0) {
                int i4 = 0 / 0;
            }
            int i5 = onWarmupCompleted + 21;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return fFloatValue;
        }

        public static /* synthetic */ float asInterface(PluginParamModel pluginParamModel) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Float) onNavigationEvent(766485428, -766485426, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue();
        }

        public static /* synthetic */ AnimUtils onTransact(PluginParamModel pluginParamModel) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return (AnimUtils) onNavigationEvent(-2073400948, 2073400952, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult());
        }

        public static /* synthetic */ float getInterfaceDescriptor(PluginParamModel pluginParamModel) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Float) onNavigationEvent(238249449, -238249446, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue();
        }

        private static final float access000(PluginParamModel pluginParamModel) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Float) onNavigationEvent(1567840746, -1567840745, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue();
        }

        private static final float onMessageChannelReady(PluginParamModel pluginParamModel) {
            int iOnExtraCallbackWithResult = setVisitUrl.onExtraCallbackWithResult();
            return ((Float) onNavigationEvent(1292861976, -1292861976, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), new Object[]{pluginParamModel}, iOnExtraCallbackWithResult, setVisitUrl.onExtraCallbackWithResult())).floatValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        char[] cArr2;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr3 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            int i6 = $10 + 3;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr3[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i8 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(IAuthTabCallbackStubProxy)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35125), 23 - (KeyEvent.getMaxKeyCode() >> 16), 10278 - Color.blue(0), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr3[i8] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - ((byte) KeyEvent.getModifierMetaStateMask())), 55 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2167, 1298711993, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i2 > 0) {
            int i9 = $10 + 83;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr4 = new char[i];
            System.arraycopy(cArr3, 0, cArr4, 0, i);
            System.arraycopy(cArr4, 0, cArr3, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr4, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr3, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i11 = $11 + 19;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 1;
            } else {
                cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            }
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i12 = $11 + 119;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr3[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12843), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55, 2167 - KeyEvent.keyCodeFromString(""), 1298711993, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                i4 = 2083011369;
            }
            cArr3 = cArr2;
        }
        objArr[0] = new String(cArr3);
    }

    private final void onExtraCallbackWithResult(RVPub rVPub, RVPub... rVPubArr) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        access100 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (rVPub != null) {
            this.IAuthTabCallbackDefault.onNavigationEvent(rVPub);
            return;
        }
        int length = rVPubArr.length;
        int i3 = 0;
        while (i3 < length) {
            int i4 = IAuthTabCallback_Parcel + 89;
            access100 = i4 % 128;
            if (i4 % 2 == 0) {
                this.IAuthTabCallbackDefault.onWarmupCompleted(rVPubArr[i3]);
                i3 += 14;
            } else {
                this.IAuthTabCallbackDefault.onWarmupCompleted(rVPubArr[i3]);
                i3++;
            }
        }
        int i5 = IAuthTabCallback_Parcel + 27;
        access100 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 87;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallbackDefault.onNavigationEvent();
        this.IAuthTabCallbackStub = 0.0f;
        int i4 = IAuthTabCallback_Parcel + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static final /* synthetic */ StartClientBundle onExtraCallbackWithResult(requestInnerSync requestinnersync) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (StartClientBundle) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 1774376563, iIAuthTabCallback, -1774376563, iIAuthTabCallback2, new Object[]{requestinnersync}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public static final /* synthetic */ isTinyGame onNavigationEvent(requestInnerSync requestinnersync) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return (isTinyGame) onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), -1489660631, iIAuthTabCallback, 1489660633, iIAuthTabCallback2, new Object[]{requestinnersync}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    public final Object onWarmupCompleted(@NotNull Mat mat, @NotNull isTiny.onWarmupCompleted onwarmupcompleted, @NotNull QualityModelConfig qualityModelConfig, @NotNull ServiceConfig serviceConfig, @NotNull access13800<? super setPerformanceStageReentrantWhiteList> access13800Var) {
        int iIAuthTabCallback = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        int iIAuthTabCallback2 = HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback();
        return onNavigationEvent(HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback(), 318221546, iIAuthTabCallback, -318221545, iIAuthTabCallback2, new Object[]{this, mat, onwarmupcompleted, qualityModelConfig, serviceConfig, access13800Var}, HomeDstCardBillDetailFilterActivity$.ExternalSyntheticLambda3.IAuthTabCallback());
    }

    static void onExtraCallback() {
        IAuthTabCallbackStubProxy = 478309046;
    }
}
