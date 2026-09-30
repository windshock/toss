package o;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.react.uimanager.LayoutShadowNode;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.KeylinesKtExternalSyntheticLambda1;
import o.QuirkSettingsLoader;
import o.QuirksExternalSyntheticBackport0;
import o.getPackageType;
import o.setHorizontalGravity;
import o.showRewardedAd;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class showRewardedAd {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 0;
    private static final accessisMonitoringp<Boolean> onExtraCallbackWithResult = setPostviewFormatSelector.IAuthTabCallback((CameraPresenceProviderExternalSyntheticLambda0) null, new Function0() { // from class: im.toss.tds.compose.component.util.magnifier.MagnifierModifierKt$$ExternalSyntheticLambda3
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        public final Object invoke() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            boolean zIAuthTabCallback = showRewardedAd.IAuthTabCallback();
            if (i3 != 0) {
                return Boolean.valueOf(zIAuthTabCallback);
            }
            Boolean.valueOf(zIAuthTabCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }, 1, (Object) null);
    private static int onNavigationEvent = 1;
    private static int onWarmupCompleted = 1;

    public static final /* synthetic */ void IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(getsupportedhighspeedresolutionsfor, z);
        int i4 = onNavigationEvent + 3;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ boolean IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent();
        int i4 = onNavigationEvent + 75;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        }
        onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) throws NoWhenBranchMatchedException {
        int i7 = ~((~i3) | i6);
        int i8 = ~i;
        int i9 = i7 | (~(i8 | i6));
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = ~(i10 | i3);
        int i13 = (~(i8 | i3)) | i11 | i12;
        int i14 = (~(i | i10)) | i12;
        int i15 = i3 + i6 + i2 + (1039959776 * i4) + ((-2046201414) * i5);
        int i16 = i15 * i15;
        int i17 = ((357140864 * i3) - 8388608) + ((-1785926397) * i6) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i2) + ((-201326592) * i4) + ((-406847488) * i5) + (529399808 * i16);
        int i18 = ((i3 * 868240256) - 1765242424) + (i6 * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i2 * 868239597) + (i4 * 817356128) + (i5 * 406493490) + (i16 * 645267456);
        int i19 = i17 + (i18 * i18 * 681705472);
        if (i19 != 1) {
            return i19 != 2 ? i19 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
        }
        String str = (String) objArr[0];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i20 = 2 % 2;
        int i21 = onExtraCallback + 95;
        onNavigationEvent = i21 % 128;
        int i22 = i21 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(str, cameraCaptureResultEmptyCameraCaptureResult, iIntValue);
        int i23 = onExtraCallback + 19;
        onNavigationEvent = i23 % 128;
        int i24 = i23 % 2;
        return unitOnNavigationEvent;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Object obj, long j, String str, String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 21;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            IAuthTabCallback(getsupportedhighspeedresolutionsfor, obj, j, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, obj, j, str, str2, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i4 = onNavigationEvent + 57;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
        return unitIAuthTabCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onNavigationEvent + 33;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(getsupportedhighspeedresolutionsfor, zBooleanValue);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        int i5 = onExtraCallback + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return null;
    }

    private static final boolean onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onNavigationEvent;
        int i3 = i2 + 47;
        onExtraCallback = i3 % 128;
        boolean z = !(i3 % 2 == 0);
        int i4 = i2 + 3;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Unit onWarmupCompleted(Object obj, long j, String str, String str2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 63;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallbackWithResult(obj, j, str, str2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallbackWithResult(obj, j, str, str2, sethorizontalgravity, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ QuirksExternalSyntheticBackport0 onWarmupCompleted(boolean z, Object obj, long j, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 57;
        onExtraCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return onNavigationEvent(z, obj, j, str, str2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onNavigationEvent(z, obj, j, str, str2, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, i);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final boolean onNavigationEvent(CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i3 = onExtraCallback + 123;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-311715846, i, -1, "im.toss.tds.compose.component.util.magnifier.shouldEnableMagnifier (MagnifierModifier.kt:56)");
        }
        boolean z = !(((r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4) cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(needCorrectJpegMetadata.onWarmupCompleted())).onNavigationEvent() < 1.3f);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onNavigationEvent + 63;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public static final QuirksExternalSyntheticBackport0 onWarmupCompleted(@NotNull QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str, @NotNull String str2, boolean z, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        String str3;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if ((i2 & 1) != 0) {
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i2 & 4) != 0) {
            z = onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResult, 0);
        }
        if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2020623164, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier (MagnifierModifier.kt:164)");
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1573225067, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, null, Long.valueOf(setByteOrder.Companion.onTransact()), str3, str2, Boolean.valueOf(z)}, 1573225069);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        int i5 = onExtraCallback + 109;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return quirksExternalSyntheticBackport02;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0 = (QuirksExternalSyntheticBackport0) objArr[0];
        final Object obj = objArr[1];
        final long jLongValue = ((Number) objArr[2]).longValue();
        final String str = (String) objArr[3];
        final String str2 = (String) objArr[4];
        final boolean zBooleanValue = ((Boolean) objArr[5]).booleanValue();
        int i = 2 % 2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = resolveQuirkNames.onNavigationEvent(quirksExternalSyntheticBackport0, (Function1) null, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.magnifier.MagnifierModifierKt$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 91;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = showRewardedAd.onWarmupCompleted(zBooleanValue, obj, jLongValue, str, str2, (QuirksExternalSyntheticBackport0) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                int i5 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 13 / 0;
                }
                return quirksExternalSyntheticBackport0OnWarmupCompleted;
            }
        }, 1, (Object) null);
        int i2 = onExtraCallback + 69;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 5 / 0;
        }
        return quirksExternalSyntheticBackport0OnNavigationEvent;
    }

    static final class onExtraCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showMagnifier$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super onExtraCallback> access13800Var) {
            super(2, access13800Var);
            this.$showMagnifier$delegate = getsupportedhighspeedresolutionsfor;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallback onextracallback = new onExtraCallback(this.$showMagnifier$delegate, access13800Var);
            int i2 = onNavigationEvent + 125;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 71;
            onNavigationEvent = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 != 0) {
                return onNavigationEvent(findresandmsg, access13800Var);
            }
            onNavigationEvent(findresandmsg, access13800Var);
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 101;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
            int i4 = onNavigationEvent + 123;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 51;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            showRewardedAd.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1960228475, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this.$showMagnifier$delegate, true}, 1960228478);
            Unit unit = Unit.INSTANCE;
            int i4 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }
    }

    static final class onWarmupCompleted implements PointerInputEventHandler {
        private static int IAuthTabCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onExtraCallbackWithResult;
        final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> onNavigationEvent;

        onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2) {
            this.onExtraCallbackWithResult = getsupportedhighspeedresolutionsfor;
            this.onNavigationEvent = getsupportedhighspeedresolutionsfor2;
        }

        public final Object invoke(HighPriorityExecutor highPriorityExecutor, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            Object objOnExtraCallbackWithResult = findRes.onExtraCallbackWithResult(new AnonymousClass5(highPriorityExecutor, this.onExtraCallbackWithResult, this.onNavigationEvent, null), access13800Var);
            if (objOnExtraCallbackWithResult != access14300.onWarmupCompleted()) {
                return Unit.INSTANCE;
            }
            int i2 = IAuthTabCallback;
            int i3 = i2 + 49;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 75;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            return objOnExtraCallbackWithResult;
        }

        /* renamed from: o.showRewardedAd$onWarmupCompleted$5, reason: invalid class name */
        static final class AnonymousClass5 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showMagnifier$delegate;
            final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showPopup$delegate;
            final /* synthetic */ HighPriorityExecutor $this_pointerInput;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(HighPriorityExecutor highPriorityExecutor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, access13800<? super AnonymousClass5> access13800Var) {
                super(2, access13800Var);
                this.$this_pointerInput = highPriorityExecutor;
                this.$showPopup$delegate = getsupportedhighspeedresolutionsfor;
                this.$showMagnifier$delegate = getsupportedhighspeedresolutionsfor2;
            }

            public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 11;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass5 anonymousClass5Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    anonymousClass5Create.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass5Create.invokeSuspend(unit);
                int i4 = onWarmupCompleted + 35;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$this_pointerInput, this.$showPopup$delegate, this.$showMagnifier$delegate, access13800Var);
                anonymousClass5.L$0 = obj;
                int i2 = onNavigationEvent + 107;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass5;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 65;
                onWarmupCompleted = i2 % 128;
                findResAndMsg findresandmsg = (findResAndMsg) obj;
                access13800<? super Unit> access13800Var = (access13800) obj2;
                if (i2 % 2 == 0) {
                    IAuthTabCallback(findresandmsg, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                int i3 = onWarmupCompleted + 29;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return objIAuthTabCallback;
            }

            /* renamed from: o.showRewardedAd$onWarmupCompleted$5$2, reason: invalid class name */
            static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AudioExecutor1, access13800<? super Unit>, Object> {
                private static int onExtraCallbackWithResult = 0;
                private static int onNavigationEvent = 1;
                final /* synthetic */ findResAndMsg $$this$coroutineScope;
                final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showMagnifier$delegate;
                final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showPopup$delegate;
                private /* synthetic */ Object L$0;
                Object L$1;
                Object L$2;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor2, access13800<? super AnonymousClass2> access13800Var) {
                    super(2, access13800Var);
                    this.$$this$coroutineScope = findresandmsg;
                    this.$showPopup$delegate = getsupportedhighspeedresolutionsfor;
                    this.$showMagnifier$delegate = getsupportedhighspeedresolutionsfor2;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$coroutineScope, this.$showPopup$delegate, this.$showMagnifier$delegate, access13800Var);
                    anonymousClass2.L$0 = obj;
                    int i2 = onNavigationEvent + 79;
                    onExtraCallbackWithResult = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass2;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 35;
                    onNavigationEvent = i2 % 128;
                    AudioExecutor1 audioExecutor1 = (AudioExecutor1) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return onExtraCallbackWithResult(audioExecutor1, access13800Var);
                    }
                    onExtraCallbackWithResult(audioExecutor1, access13800Var);
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }

                public final Object onExtraCallbackWithResult(AudioExecutor1 audioExecutor1, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException {
                    int i = 2 % 2;
                    int i2 = onExtraCallbackWithResult + 91;
                    onNavigationEvent = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    AnonymousClass2 anonymousClass2Create = create(audioExecutor1, access13800Var);
                    if (i3 == 0) {
                        anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass2Create.invokeSuspend(Unit.INSTANCE);
                    int i4 = onNavigationEvent + 85;
                    onExtraCallbackWithResult = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                /* renamed from: o.showRewardedAd$onWarmupCompleted$5$2$IAuthTabCallback */
                static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;
                    final /* synthetic */ HandlerScheduledExecutorService2 $down;
                    final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showPopup$delegate;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    IAuthTabCallback(HandlerScheduledExecutorService2 handlerScheduledExecutorService2, getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super IAuthTabCallback> access13800Var) {
                        super(2, access13800Var);
                        this.$down = handlerScheduledExecutorService2;
                        this.$showPopup$delegate = getsupportedhighspeedresolutionsfor;
                    }

                    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                        int i = 2 % 2;
                        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$down, this.$showPopup$delegate, access13800Var);
                        int i2 = onExtraCallbackWithResult + 79;
                        onWarmupCompleted = i2 % 128;
                        if (i2 % 2 == 0) {
                            int i3 = 63 / 0;
                        }
                        return iAuthTabCallback;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = onWarmupCompleted + 105;
                        onExtraCallbackWithResult = i2 % 128;
                        int i3 = i2 % 2;
                        Object objOnNavigationEvent = onNavigationEvent((findResAndMsg) obj, (access13800) obj2);
                        int i4 = onExtraCallbackWithResult + 81;
                        onWarmupCompleted = i4 % 128;
                        int i5 = i4 % 2;
                        return objOnNavigationEvent;
                    }

                    public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                        int i = 2 % 2;
                        int i2 = onExtraCallbackWithResult + 115;
                        onWarmupCompleted = i2 % 128;
                        int i3 = i2 % 2;
                        IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
                        if (i3 != 0) {
                            return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                        }
                        int i4 = 93 / 0;
                        return iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i2 = this.label;
                        if (i2 != 0) {
                            int i3 = onExtraCallbackWithResult + 51;
                            onWarmupCompleted = i3 % 128;
                            if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.onNavigationEvent(obj);
                            int i4 = onExtraCallbackWithResult + 25;
                            onWarmupCompleted = i4 % 128;
                            int i5 = i4 % 2;
                        } else {
                            ResultKt.onNavigationEvent(obj);
                            this.label = 1;
                            if (formatMsgs.onWarmupCompleted(200L, this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                        this.$down.onExtraCallback();
                        showRewardedAd.IAuthTabCallback(this.$showPopup$delegate, true);
                        return Unit.INSTANCE;
                    }
                }

                /* renamed from: o.showRewardedAd$onWarmupCompleted$5$2$4, reason: invalid class name */
                static final class AnonymousClass4 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                    private static int IAuthTabCallback = 1;
                    private static int onExtraCallback;
                    final /* synthetic */ getSupportedHighSpeedResolutionsFor<Boolean> $showPopup$delegate;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass4(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, access13800<? super AnonymousClass4> access13800Var) {
                        super(2, access13800Var);
                        this.$showPopup$delegate = getsupportedhighspeedresolutionsfor;
                    }

                    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 107;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        AnonymousClass4 anonymousClass4Create = create(findresandmsg, access13800Var);
                        if (i3 == 0) {
                            return anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                        }
                        int i4 = 18 / 0;
                        return anonymousClass4Create.invokeSuspend(Unit.INSTANCE);
                    }

                    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                        int i = 2 % 2;
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$showPopup$delegate, access13800Var);
                        int i2 = IAuthTabCallback + 77;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        return anonymousClass4;
                    }

                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        int i = 2 % 2;
                        int i2 = IAuthTabCallback + 107;
                        onExtraCallback = i2 % 128;
                        int i3 = i2 % 2;
                        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
                        if (i3 != 0) {
                            int i4 = 63 / 0;
                        }
                        int i5 = IAuthTabCallback + 47;
                        onExtraCallback = i5 % 128;
                        if (i5 % 2 == 0) {
                            return objIAuthTabCallback;
                        }
                        throw null;
                    }

                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                        int i2 = this.label;
                        if (i2 != 0) {
                            int i3 = IAuthTabCallback + 81;
                            int i4 = i3 % 128;
                            onExtraCallback = i4;
                            int i5 = i3 % 2;
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i6 = i4 + 35;
                            IAuthTabCallback = i6 % 128;
                            int i7 = i6 % 2;
                            ResultKt.onNavigationEvent(obj);
                            int i8 = onExtraCallback + 101;
                            IAuthTabCallback = i8 % 128;
                            int i9 = i8 % 2;
                        } else {
                            ResultKt.onNavigationEvent(obj);
                            this.label = 1;
                            if (formatMsgs.onWarmupCompleted(200L, this) == objOnWarmupCompleted) {
                                return objOnWarmupCompleted;
                            }
                        }
                        showRewardedAd.IAuthTabCallback(this.$showPopup$delegate, false);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x007e, code lost:
                
                    if (r0 == r9) goto L28;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                    Object objOnWarmupCompleted;
                    getPackageType getpackagetypeOnNavigationEvent;
                    Object objIAuthTabCallback;
                    int i = 2 % 2;
                    AudioExecutor1 audioExecutor1 = (AudioExecutor1) this.L$0;
                    Object objOnWarmupCompleted2 = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    Object obj2 = null;
                    if (i2 == 0) {
                        ResultKt.onNavigationEvent(obj);
                        this.L$0 = audioExecutor1;
                        this.label = 1;
                        objOnWarmupCompleted = Camera2CameraInfoImplExternalSyntheticLambda0.onWarmupCompleted(audioExecutor1, false, (createPostFailedException) null, this, 2, (Object) null);
                        if (objOnWarmupCompleted != objOnWarmupCompleted2) {
                        }
                        int i3 = onNavigationEvent + 123;
                        onExtraCallbackWithResult = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = 51 / 0;
                        }
                        return objOnWarmupCompleted2;
                    }
                    int i5 = onExtraCallbackWithResult + 17;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        getPackageType getpackagetype = (getPackageType) this.L$2;
                        ResultKt.onNavigationEvent(obj);
                        getpackagetypeOnNavigationEvent = getpackagetype;
                        objIAuthTabCallback = obj;
                        HandlerScheduledExecutorService2 handlerScheduledExecutorService2 = (HandlerScheduledExecutorService2) objIAuthTabCallback;
                        getPackageType.onWarmupCompleted.onWarmupCompleted(getpackagetypeOnNavigationEvent, (CancellationException) null, 1, (Object) null);
                        if (showRewardedAd.onExtraCallback(this.$showPopup$delegate)) {
                            int i7 = onNavigationEvent + 53;
                            int i8 = i7 % 128;
                            onExtraCallbackWithResult = i8;
                            int i9 = i7 % 2;
                            if (handlerScheduledExecutorService2 != null) {
                                int i10 = i8 + 87;
                                onNavigationEvent = i10 % 128;
                                if (i10 % 2 == 0) {
                                    handlerScheduledExecutorService2.onExtraCallback();
                                    obj2.hashCode();
                                    throw null;
                                }
                                handlerScheduledExecutorService2.onExtraCallback();
                            }
                            showRewardedAd.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1960228475, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{this.$showMagnifier$delegate, false}, 1960228478);
                            maybeUpdateAnimatable.onNavigationEvent(this.$$this$coroutineScope, (CoroutineContext) null, (setRandomHost) null, new AnonymousClass4(this.$showPopup$delegate, null), 3, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.onNavigationEvent(obj);
                    objOnWarmupCompleted = obj;
                    HandlerScheduledExecutorService2 handlerScheduledExecutorService22 = (HandlerScheduledExecutorService2) objOnWarmupCompleted;
                    getpackagetypeOnNavigationEvent = maybeUpdateAnimatable.onNavigationEvent(this.$$this$coroutineScope, (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(handlerScheduledExecutorService22, this.$showPopup$delegate, null), 3, (Object) null);
                    this.L$0 = access15400.onNavigationEvent(audioExecutor1);
                    this.L$1 = access15400.onNavigationEvent(handlerScheduledExecutorService22);
                    this.L$2 = getpackagetypeOnNavigationEvent;
                    this.label = 2;
                    objIAuthTabCallback = Camera2CameraInfoImplExternalSyntheticLambda0.IAuthTabCallback(audioExecutor1, (createPostFailedException) null, this, 1, (Object) null);
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                findResAndMsg findresandmsg = (findResAndMsg) this.L$0;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                Object obj2 = null;
                if (i2 == 0) {
                    ResultKt.onNavigationEvent(obj);
                    HighPriorityExecutor highPriorityExecutor = this.$this_pointerInput;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(findresandmsg, this.$showPopup$delegate, this.$showMagnifier$delegate, null);
                    this.L$0 = access15400.onNavigationEvent(findresandmsg);
                    this.label = 1;
                    if (Camera2CameraControlImplExternalSyntheticLambda5.onWarmupCompleted(highPriorityExecutor, anonymousClass2, this) == objOnWarmupCompleted) {
                        int i3 = onNavigationEvent + 99;
                        onWarmupCompleted = i3 % 128;
                        if (i3 % 2 != 0) {
                            return objOnWarmupCompleted;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = onWarmupCompleted + 37;
                    onNavigationEvent = i4 % 128;
                    if (i4 % 2 != 0) {
                        ResultKt.onNavigationEvent(obj);
                        throw null;
                    }
                    ResultKt.onNavigationEvent(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i5 = onNavigationEvent + 125;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onNavigationEvent(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = onNavigationEvent + 49;
        onExtraCallback = i3 % 128;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(i3 % 2 == 0 ? (i & 3) != 2 : (i & 4) != 5, i & 1)) {
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 97 / 0;
                if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-37094803, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MagnifierModifier.kt:272)");
                    int i6 = onExtraCallback + 115;
                    onNavigationEvent = i6 % 128;
                    int i7 = i6 % 2;
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 384, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i8 = onNavigationEvent + 117;
                    onExtraCallback = i8 % 128;
                    if (i8 % 2 != 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            } else {
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, (getHumanReadableName) AppLovinPostbackService.onExtraCallback(LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), -242380979, 242380980, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), new Object[]{AppLovinPostbackService.onExtraCallbackWithResult}, LayoutShadowNode.onWarmupCompleted.onNavigationEvent()), Long.valueOf(y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).ICustomTabsService()), 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, isRepeatingEnabled.onExtraCallback.onTransact(), null, cameraCaptureResultEmptyCameraCaptureResult, 384, 196608, 98290}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit onExtraCallbackWithResult(Object obj, long j, String str, String str2, setHorizontalGravity sethorizontalgravity, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda0;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final String str3;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(sethorizontalgravity, "");
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-905969060, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MagnifierModifier.kt:225)");
        }
        QuirkSettingsLoader.onExtraCallbackWithResult onextracallbackwithresult = QuirkSettingsLoader.Companion;
        QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = onextracallbackwithresult.onExtraCallback();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onWarmupCompleted(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(200.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(209.0f));
        y3ExternalSyntheticLambda0 y3externalsyntheticlambda02 = y3ExternalSyntheticLambda0.onExtraCallback;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnNavigationEvent = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onNavigationEvent(verifyDrawable.onExtraCallbackWithResult(quirksExternalSyntheticBackport0OnWarmupCompleted, y3externalsyntheticlambda02.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).onActivityLayout(), RoundedCornerShapeKt.onNavigationEvent(VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(16.0f))), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
        component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
        int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnNavigationEvent);
        toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult2 = toPreviewOnlyRange.Companion;
        Function0 function0IAuthTabCallback = onextracallbackwithresult2.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            int i3 = onExtraCallback + 123;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
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
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult2.onTransact());
        HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
        component5 component5VarOnNavigationEvent = LowLightBoostControlExternalSyntheticLambda1.onNavigationEvent(FocusMeteringControlExternalSyntheticLambda12.onWarmupCompleted.IAuthTabCallbackStub(), onextracallbackwithresult.onTransact(), cameraCaptureResultEmptyCameraCaptureResult, 48);
        int iHashCode2 = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
        CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2 = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted3 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport02);
        Function0 function0IAuthTabCallback2 = onextracallbackwithresult2.IAuthTabCallback();
        if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
            getAwbState.onExtraCallback();
        }
        cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
        if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback2);
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
        }
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2 = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, component5VarOnNavigationEvent, onextracallbackwithresult2.asBinder());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject2, onextracallbackwithresult2.asInterface());
        CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, Integer.valueOf(iHashCode2), onextracallbackwithresult2.onWarmupCompleted());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, onextracallbackwithresult2.onNavigationEvent());
        CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult2, quirksExternalSyntheticBackport0OnWarmupCompleted3, onextracallbackwithresult2.onTransact());
        LowLightBoostControlExternalSyntheticLambda0 lowLightBoostControlExternalSyntheticLambda0 = LowLightBoostControlExternalSyntheticLambda0.onWarmupCompleted;
        if (obj != null) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-61066966);
            z = false;
            y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            AppLovinNativeAdImplc.onExtraCallback(obj, j, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport02, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(80.0f)), (String) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onExtraCallbackWithResult, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.IAuthTabCallback, Unit>) null, (Function1<? super KeylinesKtExternalSyntheticLambda1.onWarmupCompleted.onNavigationEvent, Unit>) null, (QuirkSettingsLoader) null, (immediateFailedFuture) null, (Painter) null, cameraCaptureResultEmptyCameraCaptureResult, 384, 1016);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            z = false;
            y3externalsyntheticlambda0 = y3externalsyntheticlambda02;
            quirksExternalSyntheticBackport0 = quirksExternalSyntheticBackport02;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-60736382);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        if (str != null) {
            int i4 = onNavigationEvent + 95;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            if (StringsKt.isBlank(str)) {
                int i6 = onNavigationEvent + 59;
                onExtraCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-60060830);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-60060830);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                int i7 = onExtraCallback + 23;
                onNavigationEvent = i7 % 128;
                int i8 = i7 % 2;
                str3 = str2;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-60613622);
                long jOnExtraCallback = RequestOptionConfigBuilderExternalSyntheticLambda0.onExtraCallback(60);
                float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(60.0f);
                AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, Long.valueOf(y3externalsyntheticlambda0.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, 6).isEngagementSignalsApiAvailable()), Long.valueOf(jOnExtraCallback), 0L, null, 1, null, Float.valueOf(fIAuthTabCallback), null, null, 0L, Integer.valueOf(AppLovinVastMediaViewf.Companion.onNavigationEvent()), Boolean.valueOf(z), isRepeatingEnabled.onExtraCallback.IAuthTabCallbackStub(), null, cameraCaptureResultEmptyCameraCaptureResult, 817913856, 199680, 89446}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                str3 = str2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResult;
            }
        }
        if (str3 != null) {
            int i9 = onExtraCallback + 23;
            onNavigationEvent = i9 % 128;
            int i10 = i9 % 2;
            if (StringsKt.isBlank(str2)) {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-58799006);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-59952206);
                if ((str == null || StringsKt.isBlank(str)) && obj == null) {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-59783070);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallbackWithResult(-59896468);
                    ImageCapturePixelHDRPlusQuirk.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.IAuthTabCallback(quirksExternalSyntheticBackport0, VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(24.0f)), cameraCaptureResultEmptyCameraCaptureResult2, 6);
                    cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
                }
                setPostviewFormatSelector.onNavigationEvent(dispatchPostbackRequest.onWarmupCompleted().onExtraCallback(dispatchPostbackAsync.onWarmupCompleted((dispatchPostbackAsync) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(dispatchPostbackRequest.onWarmupCompleted()), VirtualCameraControlExternalSyntheticLambda1.Companion.onExtraCallback(), Integer.MAX_VALUE, AppLovinVastMediaViewf.Companion.onNavigationEvent(), null, null, 24, null)), ForwardingCameraControl.onExtraCallback(-37094803, true, new Function2() { // from class: im.toss.tds.compose.component.util.magnifier.MagnifierModifierKt$$ExternalSyntheticLambda1
                    private static int onExtraCallbackWithResult = 0;
                    private static int onNavigationEvent = 1;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i11 = 2 % 2;
                        int i12 = onExtraCallbackWithResult + 101;
                        onNavigationEvent = i12 % 128;
                        int i13 = i12 % 2;
                        Unit unit = (Unit) showRewardedAd.onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -653480459, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{str3, (CameraCaptureResultEmptyCameraCaptureResult) obj2, Integer.valueOf(((Integer) obj3).intValue())}, 653480460);
                        int i14 = onExtraCallbackWithResult + 35;
                        onNavigationEvent = i14 % 128;
                        if (i14 % 2 != 0) {
                            return unit;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }
                }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            }
        }
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        cameraCaptureResultEmptyCameraCaptureResult.asInterface();
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i11 = onNavigationEvent + 115;
            onExtraCallback = i11 % 128;
            if (i11 % 2 != 0) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                throw null;
            }
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return Unit.INSTANCE;
    }

    private static final Unit IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, final Object obj, final long j, final String str, final String str2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z;
        int i2 = 2 % 2;
        if ((i & 3) != 2) {
            z = true;
        } else {
            int i3 = onExtraCallback + 11;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = onNavigationEvent + 119;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-886058886, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier.<anonymous>.<anonymous> (MagnifierModifier.kt:214)");
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-886058886, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier.<anonymous>.<anonymous> (MagnifierModifier.kt:214)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onWarmupCompleted(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onNavigationEvent(QuirksExternalSyntheticBackport0.Companion, 0.0f, 1, (Object) null), VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(32.0f));
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted2 = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnWarmupCompleted);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                int i6 = onNavigationEvent + 39;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i8 = onExtraCallback + 17;
                onNavigationEvent = i8 % 128;
                if (i8 % 2 == 0) {
                    cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
                    throw null;
                }
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(function0IAuthTabCallback);
            } else {
                cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackDefault();
            }
            CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult);
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
            CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted2, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            setVerticalGravity.onWarmupCompleted(IAuthTabCallback(getsupportedhighspeedresolutionsfor), (QuirksExternalSyntheticBackport0) null, ResourceManagerInternalVdcInflateDelegate.IAuthTabCallback(onQueryRefine.onExtraCallbackWithResult(200, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null), ResourceManagerInternalVdcInflateDelegate.onWarmupCompleted(onQueryRefine.onExtraCallbackWithResult(200, 0, (setOnQueryTextListener) null, 6, (Object) null), 0.0f, 2, (Object) null), (String) null, ForwardingCameraControl.onExtraCallback(-905969060, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.util.magnifier.MagnifierModifierKt$$ExternalSyntheticLambda2
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final Object invoke(Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 123;
                    onNavigationEvent = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnWarmupCompleted = showRewardedAd.onWarmupCompleted(obj, j, str, str2, (setHorizontalGravity) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                    int i12 = onNavigationEvent + 17;
                    onWarmupCompleted = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 62 / 0;
                    }
                    return unitOnWarmupCompleted;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 200064, 18);
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final QuirksExternalSyntheticBackport0 onNavigationEvent(boolean z, final Object obj, final long j, final String str, final String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        boolean z2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(quirksExternalSyntheticBackport0, "");
        cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-15535173);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-15535173, i, -1, "im.toss.tds.compose.component.util.magnifier.magnifier.<anonymous> (MagnifierModifier.kt:179)");
        }
        Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
        if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
            int i3 = onNavigationEvent + 37;
            onExtraCallback = i3 % 128;
            objOnMinimized = i3 % 2 != 0 ? CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 3, (Object) null) : CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
        }
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized;
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if (objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
            int i4 = onExtraCallback + 59;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(Boolean.FALSE, (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor2 = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1048308214);
            Unit unit = Unit.INSTANCE;
            Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                objOnMinimized3 = new onExtraCallback(getsupportedhighspeedresolutionsfor2, null);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized3);
                int i6 = onNavigationEvent + 19;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
            }
            isZslDisabledByByUserCaseConfig.onNavigationEvent(unit, (Function2) objOnMinimized3, cameraCaptureResultEmptyCameraCaptureResult, 6);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1048386055);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = z ? quirksExternalSyntheticBackport03.onExtraCallback(SequentialExecutorWorkerRunningState.IAuthTabCallback(quirksExternalSyntheticBackport03, new Object[]{Boolean.valueOf(z), obj, setByteOrder.onNavigationEvent(j), str, str2}, new onWarmupCompleted(getsupportedhighspeedresolutionsfor, getsupportedhighspeedresolutionsfor2))) : quirksExternalSyntheticBackport03;
        if (onWarmupCompleted((getSupportedHighSpeedResolutionsFor<Boolean>) getsupportedhighspeedresolutionsfor)) {
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(1049504380);
            z2 = true;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnExtraCallback;
            quirksExternalSyntheticBackport03 = (QuirksExternalSyntheticBackport0) lExternalSyntheticLambda8.onExtraCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1220269882, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport03, null, 0L, null, null, ForwardingCameraControl.onExtraCallback(-886058886, true, new Function2() { // from class: im.toss.tds.compose.component.util.magnifier.MagnifierModifierKt$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj2, Object obj3) {
                    Unit unitOnExtraCallbackWithResult;
                    int i8 = 2 % 2;
                    int i9 = onWarmupCompleted + 119;
                    IAuthTabCallback = i9 % 128;
                    if (i9 % 2 != 0) {
                        unitOnExtraCallbackWithResult = showRewardedAd.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2, obj, j, str, str2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        int i10 = 41 / 0;
                    } else {
                        unitOnExtraCallbackWithResult = showRewardedAd.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor2, obj, j, str, str2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    }
                    int i11 = IAuthTabCallback + 19;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, 196614, 15}, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1220269883);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        } else {
            z2 = true;
            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0OnExtraCallback;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-2044234429);
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        }
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport03);
        if (!(CameraConfigExternalSyntheticLambda0.asBinder() ^ z2)) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
        return quirksExternalSyntheticBackport0OnExtraCallback2;
    }

    static {
        int i = IAuthTabCallback + 13;
        onWarmupCompleted = i % 128;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 115;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        accessisMonitoringp<Boolean> accessismonitoringp = onExtraCallbackWithResult;
        int i4 = i3 + 77;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return accessismonitoringp;
    }

    private static final boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 103;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).booleanValue();
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        int i5 = onExtraCallback + 29;
        onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static final void onExtraCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 85;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        int i4 = onExtraCallback + 35;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = onExtraCallback + 111;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            zBooleanValue = bool.booleanValue();
            int i4 = 88 / 0;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        int i5 = onNavigationEvent + 55;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return zBooleanValue;
    }

    private static final void onWarmupCompleted(getSupportedHighSpeedResolutionsFor<Boolean> getsupportedhighspeedresolutionsfor, boolean z) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 97;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(Boolean.valueOf(z));
        if (i3 != 0) {
            throw null;
        }
        int i4 = onNavigationEvent + 95;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
    }

    public static /* synthetic */ Unit IAuthTabCallback(String str, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        return (Unit) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -653480459, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{str, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i)}, 653480460);
    }

    public static final accessisMonitoringp<Boolean> onExtraCallbackWithResult() {
        return (accessisMonitoringp) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1394802419, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[0], 1394802419);
    }

    private static final QuirksExternalSyntheticBackport0 IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Object obj, long j, String str, String str2, boolean z) {
        return (QuirksExternalSyntheticBackport0) onExtraCallbackWithResult(MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), -1573225067, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0, obj, Long.valueOf(j), str, str2, Boolean.valueOf(z)}, 1573225069);
    }
}
