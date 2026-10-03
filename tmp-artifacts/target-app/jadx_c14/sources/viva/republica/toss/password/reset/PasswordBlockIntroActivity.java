package viva.republica.toss.password.reset;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity;
import com.facebook.imagepipeline.core.ProducerSequenceFactory$;
import im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.CameraConfigExternalSyntheticLambda0;
import o.CameraConfigProviderExternalSyntheticLambda0;
import o.CameraProviderInitRetryPolicy1;
import o.ConvertByteArrayToFloatArray;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.DefaultGainProviderExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;
import o.DeviceQuirksExternalSyntheticLambda0;
import o.FocusMeteringControlExternalSyntheticLambda3;
import o.ForwardingCameraControl;
import o.HighSpeedResolverExternalSyntheticLambda1;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.SetDetectableSize;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.TextRoundCornerProgressBarSavedState1;
import o.TimelineExternalSyntheticLambda1;
import o.VirtualCameraControlExternalSyntheticLambda1;
import o.access13800;
import o.addFixedPosition;
import o.addPolicy;
import o.asDoublelambda2;
import o.asIntlambda3;
import o.component5;
import o.dequeImageProxy;
import o.findResAndMsg;
import o.getAwbState;
import o.getBacktraceNote;
import o.getCameraCaptureCallback;
import o.isRepeatingEnabled;
import o.maybeUpdateAnimatable;
import o.resolveQuirkNames;
import o.setCallToAction;
import o.setRandomHost;
import o.t7ExternalSyntheticLambda0;
import o.toMetersPerSecond;
import o.toPreviewOnlyRange;
import o.u1;
import o.u2;
import o.u4;
import o.y1ExternalSyntheticLambda0;
import o.y1ExternalSyntheticLambda3;
import o.y1ExternalSyntheticLambda6;
import o.y1a;
import o.y1hExternalSyntheticLambda0;
import o.y3ExternalSyntheticLambda0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.password.reset.PasswordBlockIntroActivity$onCreate$1$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class PasswordBlockIntroActivity extends Hilt_PasswordBlockIntroActivity {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallbackDefault = 28768;
    private static char IAuthTabCallbackStub = 23429;
    private static int IAuthTabCallback_Parcel = 0;
    private static char asBinder = 3233;
    private static char asInterface = 10510;
    private static int getInterfaceDescriptor = 1;
    private static char[] onTransact = {65004, 64995, 65006, 64991, 64967, 64960, 64926, 64998, 64964, 64992, 64989, 64986, 64999, 64983, 64961, 64988, 64993, 64976, 64966, 64963, 64981, 64970, 64982, 64962, 65007};
    private static char IAuthTabCallbackStubProxy = 51244;

    static final class onExtraCallback extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        onExtraCallback(access13800<? super onExtraCallback> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PasswordBlockIntroActivity.IAuthTabCallback(PasswordBlockIntroActivity.this, this);
        }
    }

    static final class onNavigationEvent extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        onNavigationEvent(access13800<? super onNavigationEvent> access13800Var) {
            super(access13800Var);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PasswordBlockIntroActivity.onExtraCallback(PasswordBlockIntroActivity.this, this);
        }
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 29;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 87;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            return 1222259L;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public static final /* synthetic */ Object IAuthTabCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Object objOnExtraCallbackWithResult = passwordBlockIntroActivity.onExtraCallbackWithResult(access13800Var);
        int i4 = getInterfaceDescriptor + 19;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 75 / 0;
        }
        return objOnExtraCallbackWithResult;
    }

    public static final /* synthetic */ Object onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, access13800 access13800Var) throws Throwable {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 37;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = passwordBlockIntroActivity.IAuthTabCallback(access13800Var);
        int i4 = IAuthTabCallback_Parcel + 121;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
        return objIAuthTabCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.String, java.lang.Object> getScreenParams() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordBlockIntroActivity.getScreenParams():java.util.Map");
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordBlockIntroActivity
    public void onCreate(@Nullable Bundle bundle) {
        int i = 2 % 2;
        super.onCreate(bundle);
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new onWarmupCompleted(null), 3, (Object) null);
        int i2 = getInterfaceDescriptor + 53;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static char[] onNavigationEvent;
        private static long onWarmupCompleted;
        int label;
        private static final byte[] $$a = {66, -42, -1, 80};
        private static final int $$b = 18;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int onExtraCallback = 0;
        private static int IAuthTabCallback = 1;

        private static String $$c(int i, int i2, int i3) {
            byte[] bArr = $$a;
            int i4 = (i2 * 4) + 97;
            int i5 = 4 - (i * 4);
            int i6 = i3 * 3;
            byte[] bArr2 = new byte[i6 + 1];
            int i7 = -1;
            if (bArr == null) {
                i5++;
                i4 += -i6;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i4;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                int i8 = bArr[i5];
                i5++;
                i4 += -i8;
            }
        }

        onWarmupCompleted(access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
        }

        public static /* synthetic */ Unit onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 51;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return onNavigationEvent(passwordBlockIntroActivity, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            }
            onNavigationEvent(passwordBlockIntroActivity, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }

        public static /* synthetic */ Unit onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 53;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                return (Unit) onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1547407537, new Object[]{passwordBlockIntroActivity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1547407536);
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            PasswordBlockIntroActivity passwordBlockIntroActivity = (PasswordBlockIntroActivity) objArr[0];
            SetDetectableSize setDetectableSize = (SetDetectableSize) objArr[1];
            int i = 2 % 2;
            int i2 = onExtraCallback + 77;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordBlockIntroActivity, setDetectableSize);
            int i4 = IAuthTabCallback + 51;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return unitOnExtraCallbackWithResult;
            }
            throw null;
        }

        public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i6;
            int i8 = ~i3;
            int i9 = (~i5) | i8;
            int i10 = i7 | (~i9);
            int i11 = i5 | i8;
            int i12 = ~(i9 | i6);
            int i13 = i3 + i6 + i2 + (1075552530 * i4) + ((-1519595880) * i);
            int i14 = i13 * i13;
            int i15 = (((-1050772794) * i3) - 1639710720) + ((-2116975300) * i6) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i2) + ((-189792256) * i4) + (1111490560 * i) + (1415839744 * i14);
            int i16 = (i3 * 251836610) + 257048825 + (i6 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i2 * 251837547) + (i4 * 1710852742) + (i * (-1855850104)) + (i14 * (-1244921856));
            int i17 = i15 + (i16 * i16 * (-1300496384));
            return i17 != 1 ? i17 != 2 ? onWarmupCompleted(objArr) : onExtraCallbackWithResult(objArr) : IAuthTabCallback(objArr);
        }

        public static /* synthetic */ Unit onNavigationEvent(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 55;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            Unit unit = (Unit) onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1321830290, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1321830290);
            int i5 = onExtraCallback + 123;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        public static /* synthetic */ Unit onNavigationEvent(PasswordBlockIntroActivity passwordBlockIntroActivity) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnExtraCallback = onExtraCallback(passwordBlockIntroActivity);
            int i4 = IAuthTabCallback + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return unitOnExtraCallback;
        }

        public static /* synthetic */ Unit onNavigationEvent(PasswordBlockIntroActivity passwordBlockIntroActivity, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 105;
            IAuthTabCallback = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                onExtraCallback(passwordBlockIntroActivity, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
                obj.hashCode();
                throw null;
            }
            Unit unitOnExtraCallback = onExtraCallback(passwordBlockIntroActivity, y1aVar, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i4 = onExtraCallback + 39;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnExtraCallback;
            }
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = onExtraCallback + 39;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(passwordBlockIntroActivity, str, cameraCaptureResultEmptyCameraCaptureResult, i);
            int i5 = onExtraCallback + 87;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return unitOnExtraCallbackWithResult;
        }

        public static /* synthetic */ Unit onWarmupCompleted(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 19;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Unit unitIAuthTabCallback = IAuthTabCallback(passwordBlockIntroActivity, str, deviceQuirksExternalSyntheticLambda0, cameraCaptureResultEmptyCameraCaptureResult, i);
            if (i4 != 0) {
                int i5 = 43 / 0;
            }
            int i6 = onExtraCallback + 79;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            return unitIAuthTabCallback;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = PasswordBlockIntroActivity.this.new onWarmupCompleted(access13800Var);
            int i2 = onExtraCallback + 61;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            return onwarmupcompleted;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
            Object objOnWarmupCompleted;
            int i = 2 % 2;
            int i2 = onExtraCallback + 107;
            IAuthTabCallback = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
                int i3 = 38 / 0;
            } else {
                objOnWarmupCompleted = onWarmupCompleted(findresandmsg, access13800Var);
            }
            int i4 = IAuthTabCallback + 101;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objOnWarmupCompleted;
        }

        public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 115;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                onwarmupcompletedCreate.invokeSuspend(unit);
                throw null;
            }
            Object objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(unit);
            int i4 = IAuthTabCallback + 17;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, y1a y1aVar, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2;
            boolean z;
            int i3 = 2 % 2;
            if ((i & 6) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1aVar) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i4 = onExtraCallback + 99;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                int i6 = onExtraCallback + 87;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onExtraCallback + 25;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    Object[] objArr = new Object[1];
                    a(423 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 177, (char) (Process.myTid() >> 22), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1390304692, i2, -1, ((String) objArr[0]).intern());
                }
                String string = passwordBlockIntroActivity.getString(R.string.app__password_block_intro_title);
                Intrinsics.checkNotNullExpressionValue(string, "");
                y1a.onExtraCallback(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1254492509, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{y1aVar, string, null, Long.valueOf(((Long) addFixedPosition.onExtraCallbackWithResult(OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), OverseasRrnInputTextField.IAuthTabCallback(), new Object[]{y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6)}, -717684200, OverseasRrnInputTextField.IAuthTabCallback(), 717684210)).longValue()), 0L, isRepeatingEnabled.onExtraCallback.onExtraCallbackWithResult(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((i2 << 15) & 458752) | 24576), 10}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1254492510);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            Unit unit = Unit.INSTANCE;
            int i10 = IAuthTabCallback + 89;
            onExtraCallback = i10 % 128;
            if (i10 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private static void a(int i, int i2, char c, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
            long[] jArr = new long[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                int i4 = $11 + 99;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                try {
                    Object[] objArr2 = {Integer.valueOf(onNavigationEvent[i + i6])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17, KeyEvent.normalizeMetaState(0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(onWarmupCompleted), Integer.valueOf(c)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - ((byte) KeyEvent.getModifierMetaStateMask())), 31 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 20220 - Color.red(0), -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                    if (objOnExtraCallback3 == null) {
                        char longPressTimeout = (char) (49123 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        int longPressTimeout2 = 44 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int iMyPid = 1494 - (Process.myPid() >> 22);
                        byte b = (byte) ($$a[2] + 1);
                        byte b2 = b;
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(longPressTimeout, longPressTimeout2, iMyPid, -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
            while (timelineExternalSyntheticLambda1.IAuthTabCallback < i2) {
                cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                Object[] objArr5 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                if (objOnExtraCallback4 == null) {
                    char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 49123);
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 44;
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1494;
                    byte b3 = (byte) ($$a[2] + 1);
                    byte b4 = b3;
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(edgeSlop, iKeyCodeFromString, scrollBarSize, -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback4).invoke(null, objArr5);
            }
            String str = new String(cArr);
            int i7 = $11 + 37;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                objArr[0] = str;
            } else {
                int i8 = 34 / 0;
                objArr[0] = str;
            }
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws Throwable {
            String str = (String) objArr[0];
            y1ExternalSyntheticLambda3 y1externalsyntheticlambda3 = (y1ExternalSyntheticLambda3) objArr[1];
            int i = 2;
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[2];
            int iIntValue = ((Number) objArr[3]).intValue();
            int i2 = 2 % 2;
            if ((iIntValue & 6) == 0) {
                int i3 = onExtraCallback + 9;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(y1externalsyntheticlambda3)) {
                    int i4 = IAuthTabCallback + 11;
                    onExtraCallback = i4 % 128;
                    int i5 = i4 % 2;
                    i = 4;
                }
                iIntValue |= i;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((iIntValue & 19) != 18, iIntValue & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr2 = new Object[1];
                    a(600 - (Process.myTid() >> 22), (ViewConfiguration.getScrollBarSize() >> 8) + 177, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-86599979, iIntValue, -1, ((String) objArr2[0]).intern());
                }
                Object[] objArr3 = {y1externalsyntheticlambda3, str, null, 0L, Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), isRepeatingEnabled.onExtraCallback.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(((iIntValue << 15) & 458752) | 24576), 6};
                y1ExternalSyntheticLambda3.onExtraCallback(TTVideoLandingPageActivity.onExtraCallbackWithResult(), -657759277, TTVideoLandingPageActivity.onExtraCallbackWithResult(), 657759278, objArr3, TTVideoLandingPageActivity.onExtraCallbackWithResult(), TTVideoLandingPageActivity.onExtraCallbackWithResult());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallbackWithResult(PasswordBlockIntroActivity passwordBlockIntroActivity, SetDetectableSize setDetectableSize) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 67;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            setDetectableSize.onExtraCallback(passwordBlockIntroActivity.getScreenParams());
            Unit unit = Unit.INSTANCE;
            int i4 = onExtraCallback + 17;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static final Unit onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity) {
            int i = 2 % 2;
            ConvertByteArrayToFloatArray.onExtraCallback(1222261L, false, (String) null, (Map) null, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda6(passwordBlockIntroActivity), 14, (Object) null);
            passwordBlockIntroActivity.startActivity(new Intent((Context) passwordBlockIntroActivity, (Class<?>) PasswordBlockResetActivity.class));
            Unit unit = Unit.INSTANCE;
            int i2 = IAuthTabCallback + 47;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
            return unit;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
        /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, java.lang.Object, viva.republica.toss.password.reset.PasswordBlockIntroActivity] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object IAuthTabCallback(java.lang.Object[] r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 225
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.IAuthTabCallback(java.lang.Object[]):java.lang.Object");
        }

        private static final Unit IAuthTabCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, DeviceQuirksExternalSyntheticLambda0 deviceQuirksExternalSyntheticLambda0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            int i2;
            boolean z;
            int i3 = 2 % 2;
            if ((i & 6) == 0) {
                int i4 = IAuthTabCallback + 125;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(deviceQuirksExternalSyntheticLambda0) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) != 18) {
                int i6 = onExtraCallback + 83;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i2 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr = new Object[1];
                    a(TextUtils.indexOf("", "", 0) + 270, Color.rgb(0, 0, 0) + 16777369, (char) (4993 - ExpandableListView.getPackedPositionChild(0L)), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-2023843798, i2, -1, ((String) objArr[0]).intern());
                }
                QuirksExternalSyntheticBackport0.onExtraCallback onextracallback = QuirksExternalSyntheticBackport0.Companion;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(onextracallback, deviceQuirksExternalSyntheticLambda0), 0.0f, 1, (Object) null);
                QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(onextracallbackwithresult.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                    getAwbState.onExtraCallback();
                }
                cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                    int i8 = IAuthTabCallback + 117;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                        throw null;
                    }
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult2.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult2.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult2.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult2.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult2.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                y1ExternalSyntheticLambda6.onExtraCallbackWithResult(ForwardingCameraControl.onExtraCallback(1390304692, true, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda1(passwordBlockIntroActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.IAuthTabCallback_Parcel()), y1ExternalSyntheticLambda0.onNavigationEvent.Companion.onExtraCallback(), (getBacktraceNote) null, (y1ExternalSyntheticLambda0.onExtraCallbackWithResult) null, ForwardingCameraControl.onExtraCallback(-86599979, true, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda2(str), cameraCaptureResultEmptyCameraCaptureResult, 54), y1ExternalSyntheticLambda0.onExtraCallbackWithResult.Companion.onExtraCallback(), (getBacktraceNote) null, (QuirkSettingsLoader.onWarmupCompleted) null, asIntlambda3.onNavigationEvent.onExtraCallbackWithResult(), (getBacktraceNote) null, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), (Function0) null, cameraCaptureResultEmptyCameraCaptureResult, 807076230, 432, 9624);
                u1.IAuthTabCallback(highSpeedResolverExternalSyntheticLambda1.onWarmupCompleted(onextracallback, onextracallbackwithresult.onWarmupCompleted()), (u2) null, ForwardingCameraControl.onExtraCallback(-876770435, true, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda3(passwordBlockIntroActivity), cameraCaptureResultEmptyCameraCaptureResult, 54), (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (setCallToAction.onExtraCallbackWithResult) null, (getBacktraceNote) null, (getBacktraceNote) null, 0L, false, (t7ExternalSyntheticLambda0.onExtraCallback) null, (t7ExternalSyntheticLambda0.onWarmupCompleted) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 0, 4090);
                cameraCaptureResultEmptyCameraCaptureResult.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            return Unit.INSTANCE;
        }

        private static final Unit onExtraCallbackWithResult(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            boolean z;
            int i2 = 2 % 2;
            if ((i & 3) != 2) {
                z = true;
            } else {
                int i3 = IAuthTabCallback + 111;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr = new Object[1];
                    a((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 129, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 141, (char) (18489 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(686933100, i, -1, ((String) objArr[0]).intern());
                }
                getCameraCaptureCallback.onExtraCallbackWithResult((QuirksExternalSyntheticBackport0) null, (dequeImageProxy) null, asIntlambda3.onNavigationEvent.onExtraCallback(), (Function2) null, (getBacktraceNote) null, (Function2) null, 0, false, (getBacktraceNote) null, false, (toMetersPerSecond) null, 0.0f, 0L, 0L, 0L, 0L, 0L, ForwardingCameraControl.onExtraCallback(-2023843798, true, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda5(passwordBlockIntroActivity, str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 384, 12582912, 131067);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i5 = IAuthTabCallback + 75;
                    onExtraCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        private static final Unit onNavigationEvent(PasswordBlockIntroActivity passwordBlockIntroActivity, String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
            boolean z;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 53;
            int i4 = i3 % 128;
            onExtraCallback = i4;
            int i5 = i3 % 2;
            if ((i & 3) != 2) {
                z = true;
            } else {
                int i6 = i4 + 55;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                z = false;
            }
            if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    Object[] objArr = new Object[1];
                    a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 129 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((Process.myTid() >> 22) + 5707), objArr);
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1364648132, i, -1, ((String) objArr[0]).intern());
                }
                y1hExternalSyntheticLambda0.IAuthTabCallback(ForwardingCameraControl.onExtraCallback(686933100, true, new PasswordBlockIntroActivity$onCreate$1$.ExternalSyntheticLambda7(passwordBlockIntroActivity, str), cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 6);
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[PHI: r1
          0x0075: PHI (r1v15 java.lang.Object) = (r1v4 java.lang.Object), (r1v16 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r4
          0x0024: PHI (r4v1 int) = (r4v0 int), (r4v6 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.onExtraCallback
                int r1 = r1 + 29
                int r2 = r1 % 128
                viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.IAuthTabCallback = r2
                int r1 = r1 % r0
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r6.label
                r5 = 32
                int r5 = r5 / r3
                if (r4 == 0) goto L75
                goto L24
            L1c:
                java.lang.Object r1 = o.access14300.onWarmupCompleted()
                int r4 = r6.label
                if (r4 == 0) goto L75
            L24:
                int r1 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.onExtraCallback
                int r1 = r1 + 77
                int r5 = r1 % 128
                viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.IAuthTabCallback = r5
                int r1 = r1 % r0
                if (r1 != 0) goto L32
                if (r4 != 0) goto L48
                goto L34
            L32:
                if (r4 != r2) goto L48
            L34:
                int r5 = r5 + 63
                int r1 = r5 % 128
                viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.onExtraCallback = r1
                int r5 = r5 % r0
                if (r5 == 0) goto L44
                kotlin.ResultKt.onNavigationEvent(r7)
                r0 = 55
                int r0 = r0 / r3
                goto L91
            L44:
                kotlin.ResultKt.onNavigationEvent(r7)
                goto L91
            L48:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                float r0 = android.util.TypedValue.complexToFloat(r3)
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                int r0 = 955 - r0
                int r1 = android.view.ViewConfiguration.getPressedStateDuration()
                int r1 = r1 >> 16
                int r1 = r1 + 47
                int r4 = android.view.ViewConfiguration.getKeyRepeatDelay()
                int r4 = r4 >> 16
                int r4 = r4 + 32745
                char r4 = (char) r4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                a(r0, r1, r4, r2)
                r0 = r2[r3]
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = r0.intern()
                r7.<init>(r0)
                throw r7
            L75:
                kotlin.ResultKt.onNavigationEvent(r7)
                viva.republica.toss.password.reset.PasswordBlockIntroActivity r7 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.this
                r6.label = r2
                java.lang.Object r7 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.onExtraCallback(r7, r6)
                if (r7 != r1) goto L91
                int r7 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.onExtraCallback
                int r7 = r7 + 89
                int r2 = r7 % 128
                viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.IAuthTabCallback = r2
                int r7 = r7 % r0
                if (r7 != 0) goto L90
                r7 = 75
                int r7 = r7 / r3
            L90:
                return r1
            L91:
                java.lang.String r7 = (java.lang.String) r7
                viva.republica.toss.password.reset.PasswordBlockIntroActivity r0 = viva.republica.toss.password.reset.PasswordBlockIntroActivity.this
                viva.republica.toss.password.reset.PasswordBlockIntroActivity$onCreate$1$$ExternalSyntheticLambda4 r1 = new viva.republica.toss.password.reset.PasswordBlockIntroActivity$onCreate$1$$ExternalSyntheticLambda4
                r1.<init>(r0, r7)
                r7 = 1364648132(0x5156e0c4, float:5.768087E10)
                o.EncoderProfilesProxyVideoProfileProxy r7 = o.ForwardingCameraControl.onExtraCallbackWithResult(r7, r2, r1)
                kotlin.jvm.functions.Function2 r7 = o.setAdVideoPlaybackListener.onWarmupCompleted(r7)
                r1 = 0
                o.requestPostMessageChannelWithExtras.onExtraCallback(r0, r1, r7, r2, r1)
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordBlockIntroActivity.onWarmupCompleted.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static /* synthetic */ Unit onExtraCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, SetDetectableSize setDetectableSize) {
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, -156256640, new Object[]{passwordBlockIntroActivity, setDetectableSize}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, 156256642);
        }

        private static final Unit onWarmupCompleted(String str, y1ExternalSyntheticLambda3 y1externalsyntheticlambda3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {str, y1externalsyntheticlambda3, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), -1321830290, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, 1321830290);
        }

        private static final Unit IAuthTabCallback(PasswordBlockIntroActivity passwordBlockIntroActivity, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            Object[] objArr = {passwordBlockIntroActivity, u4Var, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)};
            int iOnExtraCallbackWithResult = ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult();
            return (Unit) onNavigationEvent(ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), 1547407537, objArr, ProducerSequenceFactory$.ExternalSyntheticLambda17.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, -1547407536);
        }

        static {
            char[] cArr = new char[1002];
            ByteBuffer.wrap("ûéY\r¾\u001f\u0013\u000fp]Õ\n*\u0018\u008f2ì2A.¦=û?X8½A\u0012\u000bw^Ô@)G\u008eJã\u0010@s¥iú~_a¼`\u0011sv\u0093Ë\u0082(Å\u008d\u0082â\u0090G\u0089¤\u009aù°^ç³\u009e\u0010²u«Ê®/Õ\u008cÈáÞFÕ\u009bôø×]ï²æ\u0017átÆÉú.í\u0083ìá\fF)\u009b\u000eø\u0006]\u001e²\n\u0017(t2É2.~\u0083:à4E\u001c\u009aVÿL\\O±G\u0016]k\u0013È>-f\u0082bç~Dx\u0099bþ\u008dS\u008a°\u009f\u0015\u009cjÊÏ×,Â\u0081¢æ¦;¢\u0098¼ý®R±·Î\u0014ÓiØÎ\u008e#\u0095\u0080\u0092åï:å\u009fúüýQä¶÷\u000bïi\u0006Î%#\u0000\u0080\u001eå\u0015:\u0010\u009f\tü+Q>¶=\u000b;h\u0018Í=\"W\u0087Aä[9[\u009eCóEP/µm\n\u007fo*Ì#!/\u00866¥\u009b\u0007\u007fàmM}./\u008bxtjÑ@²@\u001f\\øO¥M\u0006Jã3Ly),\u008a2w5Ð8½b\u001e\u0001û\u001b¤\f\u0001\u0013â\u0012O\u0001(á\u0095ðv·Óð¼â\u0019ûúè§Â\u0000\u0095íìNÀ+Ù\u0094Üq§Òº¿¬\u0018§Å\u0086¦¥\u0003\u009dì\u0094I\u0093*´\u0097\u0088p\u009fÝ\u009e¿~\u0018[Å|¦t\u0003lìxIZ*@\u0097@p\fÝH¾F\u001bnÄ$¡>\u0002=ï5H/5a\u0096Ls\u0014Ü\u0010¹\f\u001a\nÇ\u0010 ÿ\røîíKî4¸\u0091¥r°ßÐ¸ÔeÐÆÎ£Ü\fÃé¼J¡7ª\u0090ü}éÞô»¬d\u0098Á\u0094¢\u0092\u000f\u0098è\u0087U\u00807e\u0090f} Þ#»,dYÁS¢D\u000fKèJUI6Y\u0093H|\u0013Ù6º0g#À.\u00ad\u0007\u000e\u001dë\u0000T\u000b1\r\u0092&\u007f\u000bØ\u0019\u0085ÿfíÃõ¬õ\tóê¡WÛ0Á\u009d\u0084~\u0095Û\u0092\u0084\u0080þ \\Ä»Ö\u0016Æu\u0094ÐÃ/Ñ\u008aûéûDç£ôþö]ñ¸\u0088\u0017Âr\u0097Ñ\u0089,\u008e\u008b\u0083æÙEº  ÿ·Z¨¹©\u0014ºsZÎK-\f\u0088KçYB@¡Süy[.¶W\u0015{pbÏg*\u001c\u0089\u0001ä\u0017C\u001c\u009e=ý\u001eX&·/\u0012(q\u000fÌ3+$\u0086%äÅCà\u009eÇýÏX×·Ã\u0012áqûÌû+·\u0086óåý@Õ\u009f\u009fú\u0085Y\u0086´\u008e\u0013\u0094nÚÍ÷(¯\u0087«â·A±\u009c«ûDVCµV\u0010Uo\u0003Ê\u001e)\u000b\u0084kão>k\u009duøgWx²\u0007\u0011\u001al\u0011ËG&R\u0085Oà\u0017?#\u009a/ù)T#³<\u000e;lÞËÝ&\u009b\u0085\u0096à\u0083?Ó\u009açùãTí³ÿ\u000eðmÿÈâ'\u0099\u0082ßáÄ<Ó\u009b®ö\u0094U»°¼\u000fµj¶É®$·\u0083\u0094ÞA=O\u0098D÷QRx±Z\f\u007fk|Æj%Y\u0080|ßf:\u0000\u0099\u001aô\nS\u0012®\u0004\r^h\u001cÇ>\"{\u0081sÜj;wí¢OF¨T\u0005Df\u0016ÃA<S\u0099yúyWe°vítNs«\n\u0004@a\u0015Â\u000b?\f\u0098\u0001õ[V8³\"ì5I*ª+\u00078`ØÝÉ>\u008e\u009bÉôÛQÂ²ÑïûH¬¥Õ\u0006ùcàÜå9\u009e\u009a\u0083÷\u0095P\u009e\u008d¿î\u009cK¤¤\u00ad\u0001ªb\u008dß±8¦\u0095§÷GPb\u008dEîMKU¤A\u0001cbyßy85\u0095qö\u007fSW\u008c\u001dé\u0007J\u0004§\f\u0000\u0016}XÞu;-\u0094)ñ5R3\u008f)èÆEÁ¦Ô\u0003×|\u0081Ù\u009c:\u0089\u0097éðí-é\u008e÷ëåDú¡\u0085\u0002\u0098\u007f\u0093ØÅ5Ð\u0096Íó\u0095,¡\u0089\u00adê«G¡ ¾\u001d¹\u007f\\Ø_5\u0019\u0096\u0014ó\u0001,Q\u0089eêaGo }\u001dr~}Û`4\u001b\u0091]òH/E\u0088\u001då\u0019F%£#\u001c9y6Ú17$\u0090'Í\u0091.\u008c\u008b\u0099äÙAÝ¢Ù\u001fçxõÕê6õ\u0093èÌã)Õ\u008aÎçÉ@´½\u009e\u001e\u0081{\u0086Ô¿1¬\u0092´Ï½(\u009e\u0085»çE@N½K\u001er{PÔE1F\u0092`ÏC(f\u0085læzC`¼\u0000\u0019\u0018z\u001e×T0\u0016m\u0004Îq+w\u0084qámí¢OF¨T\u0005Df\u0016ÃA<S\u0099yúyWe°vítNs«\n\u0004@a\u0015Â\u000b?\f\u0098\u0001õ[V8³\"ì5I*ª+\u00078`ØÝÉ>\u008e\u009bÉôÛQÂ²ÑïûH¬¥Õ\u0006ùcàÜå9\u009e\u009a\u0083÷\u0095P\u009e\u008d¿î\u009cK¤¤\u00ad\u0001ªb\u008dß±8¦\u0095§÷GPb\u008dEîMKU¤A\u0001cbyßy85\u0095qö\u007fSW\u008c\u001dé\u0007J\u0004§\f\u0000\u0016}XÞu;-\u0094)ñ5R3\u008f)èÆEÁ¦Ô\u0003×|\u0081Ù\u009c:\u0089\u0097éðí-é\u008e÷ëåDú¡\u0085\u0002\u0098\u007f\u0093ØÅ5Ð\u0096Íó\u0095,¡\u0089\u00adê«G¡ ¾\u001d¹\u007f\\Ø_5\u0019\u0096\u0014ó\u0001,Q\u0089eêaGo }\u001dr~}Û`4\u001b\u0091]òH/E\u0088\u001då\u0019F%£#\u001c9y6Ú17$\u0090'Í\u0091.\u008c\u008b\u0099äÙAÝ¢Ù\u001fçxõÕê6õ\u0093èÌã)Õ\u008aÎçÉ@´½\u009e\u001e\u0081{\u0086Ô¿1¬\u0092´Ï½(\u009e\u0085»çE@N½K\u001er{PÔE1F\u0092`ÏC(f\u0085læzC`¼\u0000\u0019\u0018z\u001e×T0\u0016m\u0004Îq+w\u0084yámí¢OF¨T\u0005Df\u0016ÃA<S\u0099yúyWe°vítNs«\n\u0004@a\u0015Â\u000b?\f\u0098\u0001õ[V8³\"ì5I*ª+\u00078`ØÝÉ>\u008e\u009bÉôÛQÂ²ÑïûH¬¥Õ\u0006ùcàÜå9\u009e\u009a\u0083÷\u0095P\u009e\u008d¿î\u009cK¤¤\u00ad\u0001ªb\u008dß±8¦\u0095§÷GPb\u008dEîMKU¤A\u0001cbyßy85\u0095qö\u007fSW\u008c\u001dé\u0007J\u0004§\f\u0000\u0016}XÞu;-\u0094)ñ5R3\u008f)èÆEÁ¦Ô\u0003×|\u0081Ù\u009c:\u0089\u0097éðí-é\u008e÷ëåDú¡\u0085\u0002\u0098\u007f\u0093ØÅ5Ð\u0096Íó\u0095,¡\u0089\u00adê«G¡ ¾\u001d¹\u007f\\Ø_5\u0019\u0096\u0014ó\u0001,Q\u0089eêaGo }\u001dr~}Û`4\u001b\u0091]òH/E\u0088\u001då\u0019F%£#\u001c9y6Ú17$\u0090'Í\u0091.\u008c\u008b\u0099äÙAÝ¢Ù\u001fçxõÕê6õ\u0093èÌã)Õ\u008aÎçÉ@´½\u009e\u001e\u0081{\u0086Ô¿1¬\u0092´Ï½(\u009e\u0085»çE@N½K\u001er{PÔE1F\u0092`ÏC(f\u0085læzC`¼\u0000\u0019\u0018z\u001e×T0\u0016m\u0004Îq+\u007f\u0084pávBv\u0092^0§×§z \u0019ñ¼®C°æÀ\u0085Â(\u009cÏ\u0096\u0092\u00871\u008cÔï{â\u001e¯½\u00ad@ôçþ\u008aú)ÎÌØ\u0093Ê6\u0090Õ\u0092x×\u001f-¢2A&ä9\u008b2.\u007fÍ}\u0090\u00117\u0002Ú\u0018y\u0019\u001cZ£\u001cFoåw\u0088a/fò`\u0091p4LÛB".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1002);
            onNavigationEvent = cArr;
            onWarmupCompleted = -3138959252929687761L;
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
            int i4 = $11 + 103;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 53;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (asBinder ^ 1094535280733222934L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(asInterface);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                        int i12 = 12435 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(packedPositionType, iKeyCodeFromString, i12, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IAuthTabCallbackStub)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 12434 - (ViewConfiguration.getFadingEdgeLength() >> 16), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
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
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.red(0) + 16014), 14 - (Process.myTid() >> 22), 19949 - AndroidCharacter.getMirror('0'), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object IAuthTabCallback(o.access13800<? super java.lang.String> r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordBlockIntroActivity.IAuthTabCallback(o.access13800):java.lang.Object");
    }

    private final boolean IAuthTabCallback() throws Throwable {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityService = addPolicy.ITrustedWebActivityService();
        Object[] objArr = new Object[1];
        a(new char[]{10665, 29309, 21710, 45565, 45755, 30698, 36331, 44886, 6443, 1999, 46565, 63350, 49982, 23161, 6443, 1999, 2215, 29773}, TextUtils.getOffsetAfter("", 0) + 17, objArr);
        boolean zOnExtraCallback = textRoundCornerProgressBarSavedState1ITrustedWebActivityService.onExtraCallback(((String) objArr[0]).intern(), false);
        int i4 = getInterfaceDescriptor + 55;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 67 / 0;
        }
        return zOnExtraCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // viva.republica.toss.password.reset.Hilt_PasswordBlockIntroActivity
    public void onResume() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 91;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        asDoublelambda2.IAuthTabCallback.onExtraCallback((Context) this).bK_();
        int i4 = getInterfaceDescriptor + 113;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object onExtraCallbackWithResult(o.access13800<? super java.lang.Boolean> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.password.reset.PasswordBlockIntroActivity.onExtraCallbackWithResult(o.access13800):java.lang.Object");
    }

    private static void c(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        long j;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda0 defaultGainProviderExternalSyntheticLambda0 = new DefaultGainProviderExternalSyntheticLambda0();
        char[] cArr3 = onTransact;
        long j2 = 0;
        if (cArr3 != null) {
            int i4 = $10 + 63;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 27, 23139 - KeyEvent.keyCodeFromString(""), -2137011959, false, "z", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(IAuthTabCallbackStubProxy)};
            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1310771303);
            if (objOnExtraCallback2 == null) {
                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionGroup(0L), 26 - (ViewConfiguration.getPressedStateDuration() >> 16), 23138 - ImageFormat.getBitsPerPixel(0), -2137011959, false, "z", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i6 = $10 + 37;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                defaultGainProviderExternalSyntheticLambda0.onNavigationEvent = 0;
                while (defaultGainProviderExternalSyntheticLambda0.onNavigationEvent < i2) {
                    int i8 = $10 + 59;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    defaultGainProviderExternalSyntheticLambda0.onExtraCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent];
                    defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback = cArr[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1];
                    if (defaultGainProviderExternalSyntheticLambda0.onExtraCallback == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback) {
                        int i10 = $11 + 95;
                        $10 = i10 % 128;
                        if (i10 % 2 != 0) {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback + b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback / b);
                        } else {
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = (char) (defaultGainProviderExternalSyntheticLambda0.onExtraCallback - b);
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = (char) (defaultGainProviderExternalSyntheticLambda0.IAuthTabCallback - b);
                        }
                        j = j2;
                    } else {
                        Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2019324577);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.alpha(0) + 24824), 74 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 8088, -1226607665, false, "A", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue() == defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub) {
                            Object[] objArr5 = {defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0, Integer.valueOf(cCharValue), defaultGainProviderExternalSyntheticLambda0};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1229458022);
                            if (objOnExtraCallback4 == null) {
                                j = 0;
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myPid() >> 22), View.getDefaultSize(0, 0) + 30, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19487, 2013852918, false, "I", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            } else {
                                j = 0;
                            }
                            int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                            int i11 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[iIntValue];
                            cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i11];
                        } else {
                            j = 0;
                            if (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult == defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted) {
                                defaultGainProviderExternalSyntheticLambda0.onTransact = ((defaultGainProviderExternalSyntheticLambda0.onTransact + cCharValue) - 1) % cCharValue;
                                defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub = ((defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub + cCharValue) - 1) % cCharValue;
                                int i12 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                int i13 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i12];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i13];
                            } else {
                                int i14 = (defaultGainProviderExternalSyntheticLambda0.onExtraCallbackWithResult * cCharValue) + defaultGainProviderExternalSyntheticLambda0.IAuthTabCallbackStub;
                                int i15 = (defaultGainProviderExternalSyntheticLambda0.onWarmupCompleted * cCharValue) + defaultGainProviderExternalSyntheticLambda0.onTransact;
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent] = cArr3[i14];
                                cArr4[defaultGainProviderExternalSyntheticLambda0.onNavigationEvent + 1] = cArr3[i15];
                            }
                        }
                    }
                    defaultGainProviderExternalSyntheticLambda0.onNavigationEvent += 2;
                    j2 = j;
                }
            }
            int i16 = 0;
            while (i16 < i) {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
                int i17 = $11 + 67;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            String str = new String(cArr4);
            int i19 = $10 + 71;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordBlockIntroActivity
    public void onStart() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 35;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordBlockIntroActivity
    public void onPause() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 69;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        super.onPause();
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // viva.republica.toss.password.reset.Hilt_PasswordBlockIntroActivity
    public void attachBaseContext(Context context) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 115;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        int i4 = IAuthTabCallback_Parcel + 21;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
