package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.facepay.validation.model.init.config.quality.QcV2Config;
import im.toss.features.payment.ui.setting.viewmodel.OfflinePayAuthSkipSettingViewModel;
import java.lang.reflect.Method;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.isTinyGame;
import org.jetbrains.annotations.NotNull;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class isWeb {
    public static final IAuthTabCallback Companion;
    private static int onExtraCallback;
    private static int onWarmupCompleted;
    private final putPluginConfig<Pair<float[], float[]>> IAuthTabCallback;
    private static final byte[] $$c = {99, 53, 44, 107};
    private static final int $$d = 133;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {2, 105, -126, -86, 1, -12, 0, 6, 6, -69, 54, -6, 1, 1, -7, 17, -15, -5, -46, 44, 5, 8, -12, 14, 6, -10, 3, -16, -2, -6, -46, 3, -7, 5, -6, -2, -3, 69, -15, 5, -4, 10, -16};
    private static final int $$b = 203;
    private static int onExtraCallbackWithResult = 0;
    private static int asBinder = 1;
    private static int onNavigationEvent = 1;

    static final class onExtraCallback extends ContinuationImpl {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 121;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            Object objIAuthTabCallback = isWeb.this.IAuthTabCallback(null, null, this);
            int i4 = onNavigationEvent + 13;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return objIAuthTabCallback;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$e(int i, byte b, int i2) {
        int i3;
        int i4 = (i * 2) + 105;
        int i5 = b * 3;
        int i6 = (i2 * 3) + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[1 - i5];
        int i7 = 0 - i5;
        if (bArr == null) {
            i4 = i7;
            int i8 = i6;
            int i9 = 0;
            i4 += i6;
            i6 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                return new String(bArr2, 0);
            }
            int i10 = i3 + 1;
            i8 = i6;
            i6 = bArr[i6];
            i9 = i10;
            i4 += i6;
            i6 = i8 + 1;
            i3 = i9;
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

    static {
        onWarmupCompleted = 0;
        onExtraCallbackWithResult();
        Companion = new IAuthTabCallback(null);
        int i = onNavigationEvent + 7;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = 40 - (b2 * 4);
        ?? r9 = 109 - (b3 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte b4 = r9;
            i3 = 0;
            int i6 = i4;
            int i7 = i4 + b4 + 1;
            i = i3;
            int i8 = i6;
            i2 = i7;
            i4 = i8;
            int i9 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b4 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i4 = i10;
            int i72 = i4 + b4 + 1;
            i = i3;
            int i82 = i6;
            i2 = i72;
            i4 = i82;
            int i92 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = r9;
            int i922 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
            }
        }
    }

    public isWeb(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.IAuthTabCallback = new putPluginConfig<>(context, new event());
    }

    public Object onExtraCallbackWithResult(int i, boolean z, @NotNull access13800<? super Unit> access13800Var) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        putPluginConfig<Pair<float[], float[]>> putpluginconfig = this.IAuthTabCallback;
        byte[] bArr = $$a;
        byte b = (byte) (-bArr[4]);
        byte b2 = bArr[6];
        Object[] objArr = new Object[1];
        b(b, b2, b2, objArr);
        Object objOnNavigationEvent = putpluginconfig.onNavigationEvent((String) objArr[0], i, z, access13800Var);
        if (objOnNavigationEvent == access14300.onWarmupCompleted()) {
            return objOnNavigationEvent;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = onExtraCallbackWithResult + 95;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object IAuthTabCallback(@NotNull isTinyGame.IAuthTabCallback iAuthTabCallback, @NotNull QcV2Config qcV2Config, @NotNull access13800<? super PluginParamModel> access13800Var) throws Throwable {
        onExtraCallback onextracallback;
        isTinyGame.IAuthTabCallback iAuthTabCallback2;
        isWeb isweb;
        QcV2Config qcV2Config2;
        RVPub rVPub;
        RVPub rVPub2;
        RVPub rVPub3;
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        if (Class.forName("o.isWeb$onExtraCallback").isInstance(access13800Var)) {
            onextracallback = (onExtraCallback) access13800Var;
            int i4 = onextracallback.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = onExtraCallbackWithResult + 101;
                asBinder = i5 % 128;
                int i6 = i5 % 2;
                onextracallback.label = i4 - 2147483648;
            } else {
                onextracallback = new onExtraCallback(access13800Var);
            }
        }
        Object objOnExtraCallback = onextracallback.result;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i7 = onextracallback.label;
        if (i7 == 0) {
            ResultKt.onNavigationEvent(objOnExtraCallback);
            Mat matOnNavigationEvent = iAuthTabCallback.onNavigationEvent();
            onextracallback.L$0 = this;
            iAuthTabCallback2 = iAuthTabCallback;
            onextracallback.L$1 = iAuthTabCallback2;
            onextracallback.L$2 = qcV2Config;
            onextracallback.label = 1;
            objOnExtraCallback = onExtraCallback(matOnNavigationEvent, onextracallback);
            if (objOnExtraCallback == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
            isweb = this;
            qcV2Config2 = qcV2Config;
        } else {
            if (i7 != 1) {
                Object[] objArr = new Object[1];
                a(47 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, new char[]{26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6, '\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18}, false, 220 - TextUtils.getCapsMode("", 0, 0), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            qcV2Config2 = (QcV2Config) onextracallback.L$2;
            iAuthTabCallback2 = (isTinyGame.IAuthTabCallback) onextracallback.L$1;
            isweb = (isWeb) onextracallback.L$0;
            ResultKt.onNavigationEvent(objOnExtraCallback);
        }
        Pair pair = (Pair) objOnExtraCallback;
        float[] fArr = (float[]) pair.onExtraCallbackWithResult();
        float[] fArr2 = (float[]) pair.IAuthTabCallback();
        float[][] fArr3 = new float[3][];
        int i8 = asBinder + 61;
        onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        for (int i10 = 0; i10 < 3; i10++) {
            float[] fArr4 = new float[3];
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = onExtraCallbackWithResult + 37;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                fArr4[i11] = fArr[(i10 * 3) + 13 + i11];
            }
            fArr3[i10] = fArr4;
        }
        AnimUtils animUtilsOnExtraCallbackWithResult = isweb.onExtraCallbackWithResult(fArr3);
        AnimUtils animUtils = new AnimUtils(animUtilsOnExtraCallbackWithResult.IAuthTabCallback(), -animUtilsOnExtraCallbackWithResult.onWarmupCompleted(), isweb.onExtraCallback(iAuthTabCallback2.onExtraCallback()));
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[7];
        float f8 = fArr[8];
        float f9 = fArr[12];
        float fOnExtraCallbackWithResult = isweb.onExtraCallbackWithResult(fArr2);
        Float fOnExtraCallbackWithResult2 = access14000.onExtraCallbackWithResult(f);
        if (f < qcV2Config2.onExtraCallback()) {
            int i14 = onExtraCallbackWithResult + 109;
            asBinder = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 26 / 0;
            }
            rVPub = null;
        } else {
            rVPub = RVPub.FACE_EYE_CLOSED_DETECTED;
        }
        AppTypeEnum appTypeEnum = new AppTypeEnum(fOnExtraCallbackWithResult2, rVPub);
        AppTypeEnum appTypeEnum2 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f2), null);
        AppTypeEnum appTypeEnum3 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f3), null);
        AppTypeEnum appTypeEnum4 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f4), f4 < qcV2Config2.onExtraCallbackWithResult() ? null : RVPub.FACE_MASK_DETECTED);
        AppTypeEnum appTypeEnum5 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f5), f5 < qcV2Config2.onTransact() ? null : RVPub.FACE_SUNGLASSES_DETECTED);
        AppTypeEnum appTypeEnum6 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f6), null);
        AppTypeEnum appTypeEnum7 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f7), f7 < qcV2Config2.onWarmupCompleted() ? null : RVPub.FACE_OCCLUSION_DETECTED);
        AppTypeEnum appTypeEnum8 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f8), f8 >= qcV2Config2.IAuthTabCallback() ? null : RVPub.FACE_NON_NEUTRAL_EXPRESSION_DETECTED);
        AppTypeEnum appTypeEnum9 = new AppTypeEnum(access14000.onExtraCallbackWithResult(f9), null);
        double d = -qcV2Config2.IAuthTabCallbackDefault();
        double dIAuthTabCallbackDefault = qcV2Config2.IAuthTabCallbackDefault();
        double dOnWarmupCompleted = animUtils.onWarmupCompleted();
        if (d <= dOnWarmupCompleted) {
            int i16 = asBinder;
            int i17 = i16 + 109;
            onExtraCallbackWithResult = i17 % 128;
            if (i17 % 2 != 0) {
                int i18 = 18 / 0;
                if (dOnWarmupCompleted <= dIAuthTabCallbackDefault) {
                    int i19 = i16 + 117;
                    onExtraCallbackWithResult = i19 % 128;
                    if (i19 % 2 != 0) {
                        qcV2Config2.onNavigationEvent();
                        qcV2Config2.onNavigationEvent();
                        animUtils.IAuthTabCallback();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    double d2 = -qcV2Config2.onNavigationEvent();
                    double dOnNavigationEvent = qcV2Config2.onNavigationEvent();
                    double dIAuthTabCallback = animUtils.IAuthTabCallback();
                    if (d2 > dIAuthTabCallback || dIAuthTabCallback > dOnNavigationEvent) {
                        rVPub2 = null;
                        rVPub3 = RVPub.FACE_EULER_ANGLE_FAIL;
                    } else {
                        double d3 = -qcV2Config2.asBinder();
                        double dAsBinder = qcV2Config2.asBinder();
                        double dOnExtraCallbackWithResult = animUtils.onExtraCallbackWithResult();
                        if (d3 <= dOnExtraCallbackWithResult && dOnExtraCallbackWithResult <= dAsBinder) {
                            rVPub2 = null;
                            rVPub3 = null;
                        }
                    }
                }
            } else if (dOnWarmupCompleted <= dIAuthTabCallbackDefault) {
            }
        }
        return new PluginParamModel(appTypeEnum, appTypeEnum2, appTypeEnum3, appTypeEnum4, appTypeEnum5, appTypeEnum6, appTypeEnum7, appTypeEnum8, appTypeEnum9, new AppTypeEnum(animUtils, rVPub3), new AppTypeEnum(access14000.onExtraCallbackWithResult(fOnExtraCallbackWithResult), fOnExtraCallbackWithResult >= ((Float) QcV2Config.onWarmupCompleted(OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), 1867840897, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), -1867840897, new Object[]{qcV2Config2}, OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent(), OfflinePayAuthSkipSettingViewModel.4.onNavigationEvent())).floatValue() ? rVPub2 : RVPub.FACE_RECOGNITION_QUALITY_LOW));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) throws Throwable {
        int i4;
        Throwable cause;
        int i5 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
        char[] cArr2 = new char[i];
        simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
        while (true) {
            i4 = 2083011369;
            if (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback >= i) {
                break;
            }
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (i3 + simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback);
            int i6 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i6]), Integer.valueOf(onExtraCallback)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(601263194);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35126 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-16777193) - Color.rgb(0, 0, 0), 10278 - (ViewConfiguration.getPressedStateDuration() >> 16), 311849674, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                if (objOnExtraCallback2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12842), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 55, Color.alpha(0) + 2167, 1298711993, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
                int i7 = $11 + 71;
                $10 = i7 % 128;
                int i8 = i7 % 2;
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
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
            System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
        }
        if (z) {
            int i9 = $11 + 103;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
            while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                int i11 = $10 + 49;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[i >> simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback3 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12843 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 55 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ImageFormat.getBitsPerPixel(0) + 2168, 1298711993, false, $$e(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } else {
                    cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(2083011369);
                    if (objOnExtraCallback4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (12842 - MotionEvent.axisFromString("")), 55 - View.MeasureSpec.getMode(0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2167, 1298711993, false, $$e(b5, b6, b6), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                }
                i4 = 2083011369;
            }
            int i12 = $11 + 71;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public final Object onExtraCallback(@NotNull Mat mat, @NotNull access13800<? super Pair<float[], float[]>> access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallback = this.IAuthTabCallback.onExtraCallback(mat, access13800Var);
        int i4 = asBinder + 123;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            return objOnExtraCallback;
        }
        throw null;
    }

    /* JADX WARN: Finally extract failed */
    public final double onExtraCallback(@NotNull Mat mat) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(mat, "");
        Mat mat2 = new Mat();
        try {
            Imgproc.invertAffineTransform(mat, mat2);
            double dAtan2 = (Math.atan2(mat2.get(1, 0)[0], mat2.get(0, 0)[0]) * 180.0d) / 3.141592653589793d;
            mat2.release();
            int i2 = onExtraCallbackWithResult + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return dAtan2;
        } catch (Throwable th) {
            mat2.release();
            throw th;
        }
    }

    public final AnimUtils onExtraCallbackWithResult(@NotNull float[][] fArr) {
        double degrees;
        double degrees2;
        double d;
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fArr, "");
        if (((float) Math.sqrt(((float) Math.pow(fArr[0][0], 2.0d)) + ((float) Math.pow(fArr[1][0], 2.0d)))) < 1.0E-6d) {
            int i4 = asBinder + 87;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            float[] fArr2 = fArr[1];
            double degrees3 = Math.toDegrees((float) Math.atan2(fArr2[2], fArr2[1]));
            degrees2 = Math.toDegrees((float) Math.atan2(-fArr[2][0], r5));
            d = degrees3;
            degrees = 0.0d;
        } else {
            float[] fArr3 = fArr[2];
            double degrees4 = Math.toDegrees((float) Math.atan2(fArr3[1], fArr3[2]));
            double degrees5 = Math.toDegrees((float) Math.atan2(-fArr[2][0], r5));
            degrees = Math.toDegrees((float) Math.atan2(fArr[1][0], fArr[0][0]));
            degrees2 = degrees5;
            d = degrees4;
        }
        return new AnimUtils(d, degrees2, degrees);
    }

    public final float onExtraCallbackWithResult(@NotNull float[] fArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fArr, "");
        float f = 0.0f;
        for (float f2 : fArr) {
            int i2 = asBinder + 49;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            f += f2 * f2;
        }
        float fSqrt = (float) Math.sqrt(f);
        int i4 = onExtraCallbackWithResult + 53;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return fSqrt;
    }

    static void onExtraCallbackWithResult() {
        onExtraCallback = 478309033;
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }
}
