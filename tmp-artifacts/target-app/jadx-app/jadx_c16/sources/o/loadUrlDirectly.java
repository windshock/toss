package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.ExpandableListView;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.semantics.Role;
import com.iap.android.mppclient.container.constant.JsParamKeys;
import im.toss.feature.credit.ui.scoreraise.fullscreen_banner.ScoreRaiseCompleteBannerKt$;
import im.toss.feature.credit.ui.scoreraise.fullscreen_banner.ScoreRaiseCompleteBannerKt$ScoreRaiseCompleteBannerScreen$2$1$;
import im.toss.features.credit.data.response.CreditFullscreenBannerResponse;
import im.toss.features.loan.refinancing.funnel.common.LoanRefinancingFunnelAdapter$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.tds.compose.foundation.anim.rally.RallyData;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.FocusMeteringControlExternalSyntheticLambda12;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.createCameraCaptureCallback;
import o.setCallToAction;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class loadUrlDirectly {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallbackWithResult = {-28422573, -478369551, 455501349, -575431563, -809181686, -1782381512, -1192217705, 1070594091, -1485753991, 734970340, -577013840, 1163601647, 896654312, -1441980516, 93075221, 278535183, 956720916, 1076523775};
    private static int onWarmupCompleted;

    public static /* synthetic */ Unit IAuthTabCallback(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback + 37;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return onExtraCallbackWithResult(str, creditFullscreenBannerResponse, function1, function12, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        }
        onExtraCallbackWithResult(str, creditFullscreenBannerResponse, function1, function12, i, cameraCaptureResultEmptyCameraCaptureResult, i2);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Function1 function1, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(function1, creditFullscreenBannerResponse);
        int i4 = onWarmupCompleted + 25;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }

    private static final Unit onExtraCallbackWithResult(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = {str, creditFullscreenBannerResponse, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            onWarmupCompleted(-1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        } else {
            Object[] objArr2 = {str, creditFullscreenBannerResponse, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1))};
            int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            onWarmupCompleted(-1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr2, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        }
        Unit unit = Unit.INSTANCE;
        int i5 = IAuthTabCallback + 107;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(Function1 function1, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 33;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, creditFullscreenBannerResponse);
        int i4 = onWarmupCompleted + 117;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ Unit onNavigationEvent(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            Object[] objArr = {str, creditFullscreenBannerResponse, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
            int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
            throw null;
        }
        Object[] objArr2 = {str, creditFullscreenBannerResponse, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback2 = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        Unit unit = (Unit) onWarmupCompleted(1900069083, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr2, iOnExtraCallback2, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1900069082, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        int i5 = onWarmupCompleted + 99;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i5;
        int i9 = ~(i7 | i8 | i3);
        int i10 = ~i3;
        int i11 = (~(i7 | i10)) | (~(i8 | i | i3));
        int i12 = (~(i3 | i7)) | (~(i8 | i10));
        int i13 = i + i5 + i2 + ((-1255669517) * i6) + (533247121 * i4);
        int i14 = i13 * i13;
        int i15 = ((i * (-1895547823)) - 858849280) + ((-1895547823) * i5) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i2) + (760610816 * i6) + ((-1057882112) * i4) + (1344208896 * i14);
        int i16 = ((i * (-122328301)) - 2132886715) + (i5 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i2 * (-122328029)) + (i6 * (-1196579527)) + (i4 * 656595923) + (i14 * 138215424);
        if (i15 + (i16 * i16 * (-833028096)) != 1) {
            return onExtraCallbackWithResult(objArr);
        }
        String str = (String) objArr[0];
        CreditFullscreenBannerResponse creditFullscreenBannerResponse = (CreditFullscreenBannerResponse) objArr[1];
        Function1 function1 = (Function1) objArr[2];
        Function1 function12 = (Function1) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        ((Number) objArr[6]).intValue();
        int i17 = 2 % 2;
        int i18 = IAuthTabCallback + 57;
        onWarmupCompleted = i18 % 128;
        int i19 = i18 % 2;
        Integer numValueOf = Integer.valueOf(RecomposeScopeImplKt.onExtraCallbackWithResult(1 | iIntValue));
        if (i19 != 0) {
            onWarmupCompleted(-1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, creditFullscreenBannerResponse, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        } else {
            onWarmupCompleted(-1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), new Object[]{str, creditFullscreenBannerResponse, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, numValueOf}, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onWarmupCompleted(float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            onExtraCallback(f);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitOnExtraCallback = onExtraCallback(f);
        int i3 = onWarmupCompleted + 35;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        return unitOnExtraCallback;
    }

    public static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static short[] onNavigationEvent;
        final /* synthetic */ CreditFullscreenBannerResponse $banner;
        final /* synthetic */ String $referrer;
        int label;
        private static final byte[] $$a = {70, -47, -65, 52};
        private static final int $$b = 126;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        private static int IAuthTabCallback = -2123917176;
        private static int onWarmupCompleted = -1538795495;
        private static int onExtraCallback = 989171655;
        private static byte[] onExtraCallbackWithResult = {-1, 106, -84, 93, 106, -72, 94, -84, -4, -66, -65, -20, -70, -5, -2, -16, 14, -13, -29, -28, 85, -25, 71, -5, -31, -27, 108, -31, 93};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$c(byte b, short s, int i) {
            int i2;
            int i3 = s * 3;
            int i4 = (i * 4) + 115;
            int i5 = 3 - (b * 4);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i3 + 1];
            if (bArr == null) {
                int i6 = i3;
                int i7 = 0;
                i4 = (-i4) + i6;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                i5++;
                if (i2 == i3) {
                    return new String(bArr2, 0);
                }
                int i8 = i2 + 1;
                i6 = i4;
                i4 = bArr[i5];
                i7 = i8;
                i4 = (-i4) + i6;
                i2 = i7;
                bArr2[i2] = (byte) i4;
                i5++;
                if (i2 == i3) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                i5++;
                if (i2 == i3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$referrer = str;
            this.$banner = creditFullscreenBannerResponse;
        }

        public static /* synthetic */ Unit onExtraCallback(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 63;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnWarmupCompleted = onWarmupCompleted(str, creditFullscreenBannerResponse, setDetectableSize);
            int i4 = IAuthTabCallbackDefault + 73;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return unitOnWarmupCompleted;
        }

        public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onTransact + 27;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 21 / 0;
            }
            return objInvokeSuspend;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$referrer, this.$banner, access13800Var);
            int i2 = IAuthTabCallbackDefault + 49;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 90 / 0;
            }
            return onextracallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onTransact + 97;
            IAuthTabCallbackDefault = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                return IAuthTabCallback(findresandmsg, access13800Var);
            }
            IAuthTabCallback(findresandmsg, access13800Var);
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onTransact + 121;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            ConvertByteArrayToFloatArray.onExtraCallback(1299261L, false, (String) null, (Map) null, new ScoreRaiseCompleteBannerKt$ScoreRaiseCompleteBannerScreen$2$1$.ExternalSyntheticLambda0(this.$referrer, this.$banner), 14, (Object) null);
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 81;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static final Unit onWarmupCompleted(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, SetDetectableSize setDetectableSize) throws Throwable {
            int i = 2 % 2;
            int i2 = onTransact + 93;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((short) (Drawable.resolveOpacity(0, 0) + 125), (byte) ((-46) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 622870656, (ViewConfiguration.getScrollBarSize() >> 8) + 1632479395, (-17) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            setDetectableSize.onExtraCallback(((String) objArr[0]).intern(), str);
            Object[] objArr2 = new Object[1];
            a((short) (ExpandableListView.getPackedPositionType(0L) - 76), (byte) (TextUtils.getCapsMode("", 0, 0) - 109), (-622870648) - KeyEvent.normalizeMetaState(0), TextUtils.getTrimmedLength("") + 1632479397, Color.green(0) - 18, objArr2);
            setDetectableSize.onExtraCallback(((String) objArr2[0]).intern(), creditFullscreenBannerResponse.asInterface());
            Object[] objArr3 = new Object[1];
            a((short) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 126), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 127), (ViewConfiguration.getPressedStateDuration() >> 16) - 622870643, 1632479397 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) - 18, objArr3);
            setDetectableSize.onExtraCallback(((String) objArr3[0]).intern(), creditFullscreenBannerResponse.onExtraCallback());
            Object[] objArr4 = new Object[1];
            a((short) ((-39) - ((Process.getThreadPriority(0) + 20) >> 6)), (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 60), Process.getGidForName("") - 622870638, 1632479379 - TextUtils.getTrimmedLength(""), (-19) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr4);
            setDetectableSize.onExtraCallback(((String) objArr4[0]).intern(), creditFullscreenBannerResponse.onNavigationEvent());
            Unit unit = Unit.INSTANCE;
            int i4 = onTransact + 51;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[PHI: r0
          0x01b2: PHI (r0v9 int) = (r0v8 int), (r0v35 int) binds: [B:41:0x01b0, B:38:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01bc A[PHI: r0
          0x01bc: PHI (r0v32 int) = (r0v8 int), (r0v35 int) binds: [B:41:0x01b0, B:38:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x028f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
            boolean z;
            int i4;
            int i5;
            int i6 = 2 % 2;
            TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43424), 42 - View.MeasureSpec.getMode(0), 22439 - (ViewConfiguration.getPressedStateDuration() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i7 = $11 + 115;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr = onExtraCallbackWithResult;
                    if (bArr != null) {
                        int i9 = $10 + 101;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i11 = 0; i11 < length; i11++) {
                            int i12 = $10 + 7;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                                if (objOnExtraCallback2 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.green(0) + 12843), 56 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = onExtraCallbackWithResult;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43423 - TextUtils.indexOf((CharSequence) "", '0')), View.MeasureSpec.makeMeasureSpec(0, 0) + 42, 22439 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    } else {
                        iIntValue = (short) (((short) (onNavigationEvent[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                    }
                }
                if (iIntValue > 0) {
                    int i14 = $11 + 1;
                    int i15 = i14 % 128;
                    $10 = i15;
                    if (i14 % 2 != 0) {
                        i4 = ((i % iIntValue) / 3) - ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                        if (!(!z)) {
                            int i16 = i15 + 87;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                    } else {
                        i4 = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                        if (z) {
                        }
                    }
                    trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i4 + i5;
                    Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallback), sb};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 86 - View.resolveSizeAndState(0, 0, 0), KeyEvent.keyCodeFromString("") + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    byte[] bArr4 = onExtraCallbackWithResult;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i18 = 0; i18 < length2; i18++) {
                            bArr5[i18] = (byte) (bArr4[i18] ^ (-4629411779493505016L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                    int i19 = $10 + 65;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                        int i21 = $10 + 21;
                        $11 = i21 % 128;
                        if (i21 % 2 == 0) {
                            int i22 = 82 / 0;
                            if (z2) {
                                byte[] bArr6 = onExtraCallbackWithResult;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            } else {
                                short[] sArr = onNavigationEvent;
                                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                                trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r8] ^ (-4629411779493505016L))) + s)) ^ b));
                            }
                        } else if (z2) {
                        }
                        sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                        trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    private static final Unit onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 70 / 0;
        }
        return unit2;
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ LiveDataObservableExternalSyntheticLambda1<RallyData> $rallyList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(LiveDataObservableExternalSyntheticLambda1<RallyData> liveDataObservableExternalSyntheticLambda1, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$rallyList = liveDataObservableExternalSyntheticLambda1;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$rallyList, access13800Var);
            int i2 = onWarmupCompleted + 81;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return iAuthTabCallback;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 103;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 47;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 75;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = onWarmupCompleted + 41;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.onNavigationEvent(obj);
            Iterator it = this.$rallyList.iterator();
            int i4 = onExtraCallbackWithResult + 105;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            while (!(!it.hasNext())) {
                int i6 = onExtraCallbackWithResult + 33;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ((RallyData) it.next()).access000();
            }
            Unit unit = Unit.INSTANCE;
            int i8 = onExtraCallbackWithResult + 109;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        int i;
        boolean z;
        Function1 function1;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult;
        Object obj;
        int i2;
        Function1 function12;
        CreditFullscreenBannerResponse creditFullscreenBannerResponse;
        String str;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda0 externalSyntheticLambda0;
        CreditFullscreenBannerResponse creditFullscreenBannerResponse2;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        boolean z2;
        Function1 function13;
        Object obj2;
        CreditFullscreenBannerResponse creditFullscreenBannerResponse3;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        boolean z3;
        Function1 function14;
        Object obj3;
        int i3;
        String str2 = (String) objArr[0];
        CreditFullscreenBannerResponse creditFullscreenBannerResponse4 = (CreditFullscreenBannerResponse) objArr[1];
        Function1 function15 = (Function1) objArr[2];
        Function1 function16 = (Function1) objArr[3];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult4 = (CameraCaptureResultEmptyCameraCaptureResult) objArr[4];
        int iIntValue = ((Number) objArr[5]).intValue();
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function15, "");
        Intrinsics.checkNotNullParameter(function16, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult4.IAuthTabCallback(-788890102);
        if ((iIntValue & 6) != 0) {
            i = iIntValue;
        } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
            int i5 = onWarmupCompleted + 5;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2 == 0 ? 2 : 4;
            i = i6 | iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditFullscreenBannerResponse4) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function15) ? 256 : 128;
            int i7 = IAuthTabCallback + 3;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
        }
        if ((iIntValue & 3072) == 0) {
            int i9 = IAuthTabCallback + 117;
            onWarmupCompleted = i9 % 128;
            int i10 = i9 % 2;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function16)) {
                int i11 = onWarmupCompleted + 111;
                IAuthTabCallback = i11 % 128;
                i3 = i11 % 2 == 0 ? 30809 : 2048;
            } else {
                i3 = 1024;
            }
            i |= i3;
        }
        int i12 = i;
        if ((i12 & 1171) != 1170) {
            int i13 = IAuthTabCallback + 83;
            onWarmupCompleted = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(z, i12 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-788890102, i12, -1, "im.toss.feature.credit.ui.scoreraise.fullscreen_banner.ScoreRaiseCompleteBannerScreen (ScoreRaiseCompleteBanner.kt:43)");
            }
            if (creditFullscreenBannerResponse4 == null) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    return null;
                }
                externalSyntheticLambda0 = new ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda0(str2, creditFullscreenBannerResponse4, function15, function16, iIntValue);
                obj = null;
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda0);
                int i15 = IAuthTabCallback + 69;
                onWarmupCompleted = i15 % 128;
                int i16 = i15 % 2;
                return obj;
            }
            boolean z4 = (i12 & 14) == 4;
            boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(creditFullscreenBannerResponse4);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
            if (!(z4 | zOnExtraCallback)) {
                int i17 = IAuthTabCallback + 5;
                onWarmupCompleted = i17 % 128;
                int i18 = i17 % 2;
                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                    objOnMinimized = new onExtraCallback(str2, creditFullscreenBannerResponse4, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(creditFullscreenBannerResponse4, (Function2) objOnMinimized, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i12 >> 3) & 14);
                AppLovinSdkSettings appLovinSdkSettingsIAuthTabCallback = AuthenticatorCompanion.IAuthTabCallback(AuthenticatorCompanion.IAuthTabCallback, authenticate.IN, Cache.UP, AuthenticatorCompanionAuthenticatorNone.SLOW, false, (Function1) null, 24, (Object) null);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = new ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda1();
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                List listListOf = CollectionsKt.listOf((AppLovinSdkSettings) isMuted.onWarmupCompleted(JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult(), 757421567, new Object[]{appLovinSdkSettingsIAuthTabCallback, Float.valueOf(0.0f), Float.valueOf(1.0f), (Function1) objOnMinimized2, null, 8, null}, -757421537, JsParamKeys.onExtraCallbackWithResult(), JsParamKeys.onExtraCallbackWithResult()));
                LiveDataObservableExternalSyntheticLambda1 liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult = CameraPresenceProviderExternalSyntheticLambda2.onExtraCallbackWithResult(CollectionsKt.mutableListOf(new RallyData[]{getLoadType.onNavigationEvent(listListOf, (Object) null, 1, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, 0, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 250), getLoadType.onNavigationEvent(listListOf, (Object) null, 1, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, 250, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12583296, 122), getLoadType.onNavigationEvent(listListOf, (Object) null, 1, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, 500, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 12583296, 122)}));
                Boolean bool = Boolean.TRUE;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new IAuthTabCallback(liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(bool, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6);
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(onextracallback, 0.0f, 1, (Object) null);
                FocusMeteringControlExternalSyntheticLambda12 focusMeteringControlExternalSyntheticLambda12 = FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted;
                FocusMeteringControlExternalSyntheticLambda12.asBinder asbinderOnNavigationEvent = focusMeteringControlExternalSyntheticLambda12.onNavigationEvent();
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(asbinderOnNavigationEvent, onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
                AppLovinNativeAdImplc.onExtraCallbackWithResult(creditFullscreenBannerResponse4.onExtraCallbackWithResult(), ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(284.0f)), 0L, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, "배너 이미지", cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 100663344, 252);
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = onCaptureSessionStart.onExtraCallback(clearAds.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(56.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), (RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(0)), ((RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(0)).IAuthTabCallback());
                String strAsInterface = creditFullscreenBannerResponse4.asInterface();
                createCameraCaptureCallback.IAuthTabCallback iAuthTabCallback = createCameraCaptureCallback.Companion;
                int iIAuthTabCallback = iAuthTabCallback.IAuthTabCallback();
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(26);
                isRepeatingEnabled isrepeatingenabled = isRepeatingEnabled.onExtraCallback;
                GraphicDeviceInfo graphicDeviceInfoOnExtraCallbackWithResult = isrepeatingenabled.onExtraCallbackWithResult();
                y3ExternalSyntheticLambda0 y3externalsyntheticlambda0 = y3ExternalSyntheticLambda0.onExtraCallback;
                obj = null;
                i2 = iIntValue;
                str = str2;
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strAsInterface, quirksExternalSyntheticBackport0OnExtraCallback, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), Long.valueOf(jOnExtraCallback), 0L, null, null, createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback), Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoOnExtraCallbackWithResult, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 24576, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = onCaptureSessionStart.onExtraCallback(clearAds.onExtraCallbackWithResult(onextracallback, (RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(1)), ((RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(1)).IAuthTabCallback() == 0.0f ? 0.0f : ((RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(1)).onExtraCallback());
                String strOnNavigationEvent = creditFullscreenBannerResponse4.onNavigationEvent();
                setCallToAction.IAuthTabCallback iAuthTabCallbackOnExtraCallbackWithResult = setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult();
                if ((i12 & 896) == 256) {
                    z2 = true;
                    creditFullscreenBannerResponse2 = creditFullscreenBannerResponse4;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                } else {
                    creditFullscreenBannerResponse2 = creditFullscreenBannerResponse4;
                    cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                    z2 = false;
                }
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(creditFullscreenBannerResponse2);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                if ((z2 || zOnExtraCallback2) || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    function13 = function15;
                    ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda2 externalSyntheticLambda2 = new ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda2(function13, creditFullscreenBannerResponse2);
                    cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(externalSyntheticLambda2);
                    obj2 = externalSyntheticLambda2;
                } else {
                    function13 = function15;
                    obj2 = objOnMinimized4;
                }
                function1 = function13;
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult5 = cameraCaptureResultEmptyCameraCaptureResult2;
                CreditFullscreenBannerResponse creditFullscreenBannerResponse5 = creditFullscreenBannerResponse2;
                setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{strOnNavigationEvent, quirksExternalSyntheticBackport0OnExtraCallback2, iAuthTabCallbackOnExtraCallbackWithResult, null, null, null, (Function0) obj2, null, false, false, cameraCaptureResultEmptyCameraCaptureResult5, 384, 952}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback3 = onCaptureSessionStart.onExtraCallback(clearAds.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), (RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(2)), ((RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(2)).IAuthTabCallback() == 0.0f ? 0.0f : ((RallyData) liveDataObservableExternalSyntheticLambda1OnExtraCallbackWithResult.get(2)).onExtraCallback());
                if ((i12 & 7168) == 2048) {
                    creditFullscreenBannerResponse3 = creditFullscreenBannerResponse5;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult5;
                    z3 = true;
                } else {
                    creditFullscreenBannerResponse3 = creditFullscreenBannerResponse5;
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult5;
                    z3 = false;
                }
                boolean zOnExtraCallback3 = cameraCaptureResultEmptyCameraCaptureResult3.onExtraCallback(creditFullscreenBannerResponse3);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                if (!(zOnExtraCallback3 | z3)) {
                    int i19 = IAuthTabCallback + 123;
                    onWarmupCompleted = i19 % 128;
                    int i20 = i19 % 2;
                    if (objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                        function14 = function16;
                        ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda3 externalSyntheticLambda3 = new ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda3(function14, creditFullscreenBannerResponse3);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(externalSyntheticLambda3);
                        obj3 = externalSyntheticLambda3;
                    } else {
                        function14 = function16;
                        obj3 = objOnMinimized5;
                    }
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback4 = configureReward.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback3, (getConfiguration) null, (getCachingExecutorService) null, false, false, false, false, (String) null, (Role) null, (Function0) obj3, 255, (Object) null);
                    component5 component5VarOnExtraCallback = RowKt.onExtraCallback(focusMeteringControlExternalSyntheticLambda12.onNavigationEvent(), onextracallbackwithresult.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult3, 54);
                    int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3, 0));
                    CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult3.writeTypedObject();
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult3, quirksExternalSyntheticBackport0OnExtraCallback4);
                    Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.access100() == null) {
                        int i21 = onWarmupCompleted + 49;
                        IAuthTabCallback = i21 % 128;
                        if (i21 % 2 == 0) {
                            getAwbState.onExtraCallback();
                            int i22 = 99 / 0;
                        } else {
                            getAwbState.onExtraCallback();
                        }
                    }
                    cameraCaptureResultEmptyCameraCaptureResult3.onUnminimized();
                    if (cameraCaptureResultEmptyCameraCaptureResult3.onActivityLayout()) {
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(function0IAuthTabCallback2);
                    } else {
                        cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackDefault();
                    }
                    CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult3);
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnExtraCallback, onextracallbackwithresult2.asBinder());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
                    CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
                    CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.onNavigationEvent;
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallbackDefault = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallbackDefault(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(17.0f));
                    long jLongValue = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    Object[] objArr2 = new Object[1];
                    a(new int[]{-753837885, -561055184, 14801596, -1184029410, -361559195, -1094968320, -1181970409, 1249231878, 869755511, 582220489, 740638870, -82242673, -1841497408, 1546361488, -1917618770, -717467255, 1475834986, 1622677965, -477098008, 1217674884, -2104834552, -425630356, 544255446, -1588480283, 1760239070, -229207043}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 50, objArr2);
                    AppLovinNativeAdImplc.onExtraCallbackWithResult(((String) objArr2[0]).intern(), quirksExternalSyntheticBackport0IAuthTabCallbackDefault, jLongValue, (Function1) null, (Function1) null, (Function1) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, "X", cameraCaptureResultEmptyCameraCaptureResult3, 100663350, 248);
                    String strOnExtraCallback = DefaultSurfaceProcessorExternalSyntheticLambda10.onExtraCallback(R.string.close, cameraCaptureResultEmptyCameraCaptureResult3, 0);
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback5 = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(10.0f), 0.0f, 0.0f, 0.0f, 14, (Object) null);
                    int iIAuthTabCallback2 = iAuthTabCallback.IAuthTabCallback();
                    long jOnExtraCallback2 = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(19);
                    GraphicDeviceInfo graphicDeviceInfoIAuthTabCallbackStub = isrepeatingenabled.IAuthTabCallbackStub();
                    long jLongValue2 = ((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult3, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue();
                    createCameraCaptureCallback createcameracapturecallbackOnExtraCallback = createCameraCaptureCallback.onExtraCallback(iIAuthTabCallback2);
                    cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResult3;
                    function12 = function14;
                    creditFullscreenBannerResponse = creditFullscreenBannerResponse3;
                    AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{strOnExtraCallback, quirksExternalSyntheticBackport0OnExtraCallback5, null, Long.valueOf(jLongValue2), Long.valueOf(jOnExtraCallback2), 0L, null, null, createcameracapturecallbackOnExtraCallback, Float.valueOf(0.0f), null, null, 0L, 0, false, graphicDeviceInfoIAuthTabCallbackStub, null, cameraCaptureResultEmptyCameraCaptureResult, 24624, 196608, 98020}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                    if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                        int i23 = onWarmupCompleted + 101;
                        IAuthTabCallback = i23 % 128;
                        if (i23 % 2 == 0) {
                            CameraConfigExternalSyntheticLambda0.onTransact();
                            obj.hashCode();
                            throw null;
                        }
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                }
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda0);
            int i152 = IAuthTabCallback + 69;
            onWarmupCompleted = i152 % 128;
            int i162 = i152 % 2;
            return obj;
        }
        function1 = function15;
        cameraCaptureResultEmptyCameraCaptureResult = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        obj = null;
        i2 = iIntValue;
        function12 = function16;
        creditFullscreenBannerResponse = creditFullscreenBannerResponse4;
        str = str2;
        cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2 == null) {
            return obj;
        }
        ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda0 externalSyntheticLambda4 = new ScoreRaiseCompleteBannerKt$.ExternalSyntheticLambda4(str, creditFullscreenBannerResponse, function1, function12, i2);
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel2;
        externalSyntheticLambda0 = externalSyntheticLambda4;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(externalSyntheticLambda0);
        int i1522 = IAuthTabCallback + 69;
        onWarmupCompleted = i1522 % 128;
        int i1622 = i1522 % 2;
        return obj;
    }

    private static final Unit onNavigationEvent(Function1 function1, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(creditFullscreenBannerResponse);
            Unit unit = Unit.INSTANCE;
            int i3 = onWarmupCompleted + 19;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            return unit;
        }
        function1.invoke(creditFullscreenBannerResponse);
        Unit unit2 = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Unit onExtraCallback(Function1 function1, CreditFullscreenBannerResponse creditFullscreenBannerResponse) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            function1.invoke(creditFullscreenBannerResponse);
            int i3 = 53 / 0;
            return Unit.INSTANCE;
        }
        function1.invoke(creditFullscreenBannerResponse);
        return Unit.INSTANCE;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallbackWithResult;
        float f = 0.0f;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $11 + 23;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 3 % 3;
            }
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 99;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 71, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i8 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 72 - (Process.myTid() >> 22), View.resolveSizeAndState(0, 0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                f = 0.0f;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallbackWithResult;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr5[i10]);
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.getGidForName("") + 1), 72 - Drawable.resolveOpacity(i5, i5), 8848 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i10++;
                i4 = -1469660336;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i11 = i5;
        System.arraycopy(iArr5, i11, iArr4, i11, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i11;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i11] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i12 = 0;
            for (int i13 = 16; i12 < i13; i13 = 16) {
                int i14 = $10 + 45;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 22251), 39 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 10301, -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i12 += 93;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - View.combineMeasuredStates(0, 0)), 39 - View.combineMeasuredStates(0, 0), 10300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i12++;
                }
            }
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i15;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i16 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4033), 79 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 7398, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
            int i18 = $10 + 59;
            $11 = i18 % 128;
            int i19 = i18 % 2;
            i11 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static final void IAuthTabCallback(@NotNull String str, @Nullable CreditFullscreenBannerResponse creditFullscreenBannerResponse, @NotNull Function1<? super CreditFullscreenBannerResponse, Unit> function1, @NotNull Function1<? super CreditFullscreenBannerResponse, Unit> function12, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        Object[] objArr = {str, creditFullscreenBannerResponse, function1, function12, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        onWarmupCompleted(-1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), 1597867490, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }

    private static final Unit onWarmupCompleted(String str, CreditFullscreenBannerResponse creditFullscreenBannerResponse, Function1 function1, Function1 function12, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {str, creditFullscreenBannerResponse, function1, function12, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnExtraCallback = LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback();
        return (Unit) onWarmupCompleted(1900069083, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), objArr, iOnExtraCallback, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback(), -1900069082, LoanRefinancingFunnelAdapter$.ExternalSyntheticLambda50.onExtraCallback());
    }
}
