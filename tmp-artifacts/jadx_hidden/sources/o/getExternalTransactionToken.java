package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.google.android.gms.internal.ads.zzaq;
import im.toss.devtool.runtime.data.util.Hilt_SchemeExecutorActivity$1;
import im.toss.features.unifiedsession.api.model.UnifiedSessionType;
import im.toss.global.features.leave.test.GlobalLeaveTestActivity$IAuthTabCallback;
import im.toss.global.features.useronboarding.R;
import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordEventEffectKt$;
import im.toss.global.features.useronboarding.ui.reset_password.GlobalOnboardingResetPasswordEventEffectKt$GlobalOnboardingResetPasswordEventEffect$1$1$1$1$1$;
import im.toss.security.impl.malware.MalwareDetectActivity$onExtraCallbackWithResult;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.dialog.TdsDialogV1;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.IPostMessageService_Parcel;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.bindContext;
import o.onAlternativeBillingOnlyInformationDialogResponse;
import o.s3c;

/* loaded from: classes.dex */
public final class getExternalTransactionToken {
    private static final byte[] $$a;
    private static final int $$b = 134;
    private static int $10 = 0;
    private static int $11 = 1;
    private static char IAuthTabCallback;
    private static int IAuthTabCallbackStub;
    private static char onExtraCallback;
    private static char onExtraCallbackWithResult;
    private static char onNavigationEvent;
    private static int onWarmupCompleted;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 102 - r8
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 2
            int r0 = 11 - r7
            byte[] r1 = o.getExternalTransactionToken.$$a
            byte[] r0 = new byte[r0]
            int r7 = 10 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r3 = r3 + r6
            int r6 = r3 + 2
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExternalTransactionToken.$$c(short, short, short):java.lang.String");
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        GriverPhotoSelectActivity8 griverPhotoSelectActivity8 = (GriverPhotoSelectActivity8) objArr[0];
        Function1 function1 = (Function1) objArr[1];
        Function0 function0 = (Function0) objArr[2];
        IAnimation iAnimation = (IAnimation) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[5];
        int iIntValue2 = ((Number) objArr[6]).intValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 15;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            IAuthTabCallback(griverPhotoSelectActivity8, function1, function0, iAnimation, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(griverPhotoSelectActivity8, function1, function0, iAnimation, iIntValue, cameraCaptureResultEmptyCameraCaptureResult, iIntValue2);
        int i3 = IAuthTabCallbackStub + 113;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 19;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = IAuthTabCallbackStub + 51;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    private static final Unit IAuthTabCallback(GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Function1 function1, Function0 function0, IAnimation iAnimation, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        int i3 = 2 % 2;
        int i4 = onWarmupCompleted + 15;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(griverPhotoSelectActivity8, function1, function0, iAnimation, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1));
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallbackStub + 59;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = i5 | i6 | i7;
        int i9 = ~i5;
        int i10 = (~i6) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i6 | i7 | i9)) | (~(i10 | i5));
        int i13 = i + i5 + i2 + (2053704882 * i4) + ((-167119771) * i3);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i) - 1543503872) + (1501345335 * i5) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i2) + (511705088 * i4) + ((-1639972864) * i3) + (1278279680 * i14);
        int i16 = ((i * (-1228230693)) - 288632672) + (i5 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i2 * (-1228230607)) + (i4 * 927583762) + (i3 * (-1784727723)) + (i14 * 1163984896);
        return i15 + ((i16 * i16) * 992935936) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onExtraCallback(Activity activity) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(activity);
        int i4 = IAuthTabCallbackStub + 65;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallbackWithResult;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(function1, j);
        int i4 = IAuthTabCallbackStub + 7;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ Unit onExtraCallback(Function1 function1, Function0 function0, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 123;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent(function1, function0, iEngagementSignalsCallbackDefault);
            throw null;
        }
        Unit unitOnNavigationEvent = onNavigationEvent(function1, function0, iEngagementSignalsCallbackDefault);
        int i3 = IAuthTabCallbackStub + 13;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return unitOnNavigationEvent;
    }

    public static native char q(int i, int i2);

    private static final Unit IAuthTabCallback(Function1 function1, long j) {
        Unit unit;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 23;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            function1.invoke(Long.valueOf(j));
            unit = Unit.INSTANCE;
            int i3 = 35 / 0;
        } else {
            function1.invoke(Long.valueOf(j));
            unit = Unit.INSTANCE;
        }
        int i4 = onWarmupCompleted + 77;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Activity activity = (Activity) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (activity != null) {
            activity.finish();
            int i3 = IAuthTabCallbackStub + 117;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
        }
        return Unit.INSTANCE;
    }

    static final class onExtraCallbackWithResult extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallback;
        final /* synthetic */ Context $context;
        final /* synthetic */ IAnimation<onAlternativeBillingOnlyInformationDialogResponse> $eventFlow;
        final /* synthetic */ IEngagementSignalsCallback_Parcel<Intent> $launcher;
        final /* synthetic */ TextFieldScrollKtExternalSyntheticLambda0 $lifecycleOwner;
        final /* synthetic */ Function0<Unit> $navigateToCreatePassword;
        final /* synthetic */ Resources $resources;
        final /* synthetic */ GriverPhotoSelectActivity8 $unifiedSessionProvider;
        int label;
        private static char[] onExtraCallbackWithResult = {32767, 32761, 32758, 32698, 32750, 32747, 32691, 32744, 32765, 32751, 32749, 32757, 32760, 32764, 32753, 32756, 32748, 32759, 32739, 32754};
        private static int IAuthTabCallback = -1184333926;
        private static boolean onWarmupCompleted = true;
        private static boolean onNavigationEvent = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        onExtraCallbackWithResult(TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0, IAnimation<? extends onAlternativeBillingOnlyInformationDialogResponse> iAnimation, GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Context context, IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, Resources resources, Function0<Unit> function0, access13800<? super onExtraCallbackWithResult> access13800Var) {
            super(2, access13800Var);
            this.$lifecycleOwner = textFieldScrollKtExternalSyntheticLambda0;
            this.$eventFlow = iAnimation;
            this.$unifiedSessionProvider = griverPhotoSelectActivity8;
            this.$context = context;
            this.$launcher = iEngagementSignalsCallback_Parcel;
            this.$resources = resources;
            this.$navigateToCreatePassword = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.$lifecycleOwner, this.$eventFlow, this.$unifiedSessionProvider, this.$context, this.$launcher, this.$resources, this.$navigateToCreatePassword, access13800Var);
            int i2 = IAuthTabCallbackDefault + 81;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onextracallbackwithresult;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 105;
            IAuthTabCallbackDefault = i2 % 128;
            findResAndMsg findresandmsg = (findResAndMsg) obj;
            access13800<? super Unit> access13800Var = (access13800) obj2;
            if (i2 % 2 == 0) {
                onNavigationEvent(findresandmsg, access13800Var);
                throw null;
            }
            Object objOnNavigationEvent = onNavigationEvent(findresandmsg, access13800Var);
            int i3 = onExtraCallback + 25;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            return objOnNavigationEvent;
        }

        public final Object onNavigationEvent(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresultCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            }
            onextracallbackwithresultCreate.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        /* renamed from: o.getExternalTransactionToken$onExtraCallbackWithResult$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int IAuthTabCallback = 478308949;
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;
            final /* synthetic */ Context $context;
            final /* synthetic */ IAnimation<onAlternativeBillingOnlyInformationDialogResponse> $eventFlow;
            final /* synthetic */ IEngagementSignalsCallback_Parcel<Intent> $launcher;
            final /* synthetic */ Function0<Unit> $navigateToCreatePassword;
            final /* synthetic */ Resources $resources;
            final /* synthetic */ GriverPhotoSelectActivity8 $unifiedSessionProvider;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass3(IAnimation<? extends onAlternativeBillingOnlyInformationDialogResponse> iAnimation, GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Context context, IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, Resources resources, Function0<Unit> function0, access13800<? super AnonymousClass3> access13800Var) {
                super(2, access13800Var);
                this.$eventFlow = iAnimation;
                this.$unifiedSessionProvider = griverPhotoSelectActivity8;
                this.$context = context;
                this.$launcher = iEngagementSignalsCallback_Parcel;
                this.$resources = resources;
                this.$navigateToCreatePassword = function0;
            }

            public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$eventFlow, this.$unifiedSessionProvider, this.$context, this.$launcher, this.$resources, this.$navigateToCreatePassword, access13800Var);
                int i2 = onWarmupCompleted + 125;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnWarmupCompleted = onWarmupCompleted((findResAndMsg) obj, (access13800) obj2);
                int i4 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return objOnWarmupCompleted;
                }
                throw null;
            }

            public final Object onWarmupCompleted(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 1;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3Create = create(findresandmsg, access13800Var);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass3Create.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass3Create.invokeSuspend(unit);
                int i4 = onExtraCallbackWithResult + 49;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            /* renamed from: o.getExternalTransactionToken$onExtraCallbackWithResult$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
                private static int $10 = 0;
                private static int $11 = 1;
                private static int IAuthTabCallback = 0;
                private static int asBinder = 1;
                private static char onExtraCallback = 53911;
                private static char onExtraCallbackWithResult = 55110;
                private static char onNavigationEvent = 44451;
                private static char onWarmupCompleted = 13513;
                final /* synthetic */ Context $context;
                final /* synthetic */ IAnimation<onAlternativeBillingOnlyInformationDialogResponse> $eventFlow;
                final /* synthetic */ IEngagementSignalsCallback_Parcel<Intent> $launcher;
                final /* synthetic */ Function0<Unit> $navigateToCreatePassword;
                final /* synthetic */ Resources $resources;
                final /* synthetic */ GriverPhotoSelectActivity8 $unifiedSessionProvider;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(IAnimation<? extends onAlternativeBillingOnlyInformationDialogResponse> iAnimation, GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Context context, IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel, Resources resources, Function0<Unit> function0, access13800<? super AnonymousClass1> access13800Var) {
                    super(2, access13800Var);
                    this.$eventFlow = iAnimation;
                    this.$unifiedSessionProvider = griverPhotoSelectActivity8;
                    this.$context = context;
                    this.$launcher = iEngagementSignalsCallback_Parcel;
                    this.$resources = resources;
                    this.$navigateToCreatePassword = function0;
                }

                public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 107;
                    asBinder = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass1 anonymousClass1Create = create(findresandmsg, access13800Var);
                    if (i3 != 0) {
                        return anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                    }
                    anonymousClass1Create.invokeSuspend(Unit.INSTANCE);
                    throw null;
                }

                public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
                    int i = 2 % 2;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventFlow, this.$unifiedSessionProvider, this.$context, this.$launcher, this.$resources, this.$navigateToCreatePassword, access13800Var);
                    int i2 = asBinder + 89;
                    IAuthTabCallback = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass1;
                }

                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    int i = 2 % 2;
                    int i2 = IAuthTabCallback + 19;
                    asBinder = i2 % 128;
                    findResAndMsg findresandmsg = (findResAndMsg) obj;
                    access13800<? super Unit> access13800Var = (access13800) obj2;
                    if (i2 % 2 != 0) {
                        return IAuthTabCallback(findresandmsg, access13800Var);
                    }
                    Object objIAuthTabCallback = IAuthTabCallback(findresandmsg, access13800Var);
                    int i3 = 16 / 0;
                    return objIAuthTabCallback;
                }

                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                    int i2 = this.label;
                    if (i2 != 0) {
                        int i3 = IAuthTabCallback;
                        int i4 = i3 + 81;
                        asBinder = i4 % 128;
                        int i5 = i4 % 2;
                        if (i2 != 1) {
                            Object[] objArr = new Object[1];
                            a(new char[]{65329, 28207, 2993, 27699, 12827, 47522, 32442, 28328, 44827, 60247, 44455, 41741, 44094, 36264, 50537, 5723, 57154, 25973, 26945, 65520, 30134, 49047, 49716, 42361, 19151, 37404, 26785, 52077, 57072, 29121, 50537, 5723, 6508, 5387, 46259, 55378, 11947, 44047, 20029, 9785, 14021, 44109, 54523, 58524, 26276, 29070, 38982, 33501}, 47 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
                            throw new IllegalStateException(((String) objArr[0]).intern());
                        }
                        int i6 = i3 + 3;
                        asBinder = i6 % 128;
                        int i7 = i6 % 2;
                        ResultKt.onNavigationEvent(obj);
                        int i8 = IAuthTabCallback + 111;
                        asBinder = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        ResultKt.onNavigationEvent(obj);
                        IAnimation<onAlternativeBillingOnlyInformationDialogResponse> iAnimation = this.$eventFlow;
                        final GriverPhotoSelectActivity8 griverPhotoSelectActivity8 = this.$unifiedSessionProvider;
                        final Context context = this.$context;
                        final IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel = this.$launcher;
                        final Resources resources = this.$resources;
                        final Function0<Unit> function0 = this.$navigateToCreatePassword;
                        setRipple setripple = new setRipple() { // from class: o.getExternalTransactionToken.onExtraCallbackWithResult.3.1.2
                            static int asInterface = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(AnonymousClass2.class);

                            {
                                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5931);
                            }

                            public static /* synthetic */ void onNavigationEvent(DialogInterface dialogInterface, int i10) {
                                int i11 = 2 % 2;
                                int iOnWarmupCompleted = ((asInterface ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3393)) >> 8) & 1;
                                Object obj2 = null;
                                onExtraCallbackWithResult(dialogInterface, i10);
                                if (iOnWarmupCompleted == 0) {
                                    obj2.hashCode();
                                    throw null;
                                }
                                int i12 = asInterface;
                                int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5837);
                                if ((((((~i12) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i12)) >> 14) & 1) != 0) {
                                    throw null;
                                }
                            }

                            public /* synthetic */ Object emit(Object obj2, access13800 access13800Var) throws NoWhenBranchMatchedException, Resources.NotFoundException {
                                int i10 = 2 % 2;
                                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(949);
                                Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((onAlternativeBillingOnlyInformationDialogResponse) obj2, (access13800<? super Unit>) access13800Var);
                                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(432);
                                return objOnExtraCallbackWithResult;
                            }

                            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                            public final Object onExtraCallbackWithResult(onAlternativeBillingOnlyInformationDialogResponse onalternativebillingonlyinformationdialogresponse, access13800<? super Unit> access13800Var) throws NoWhenBranchMatchedException, Resources.NotFoundException {
                                int i10;
                                int i11 = 2 % 2;
                                if (!(onalternativebillingonlyinformationdialogresponse instanceof onAlternativeBillingOnlyInformationDialogResponse.onNavigationEvent)) {
                                    if (!(!(onalternativebillingonlyinformationdialogresponse instanceof onAlternativeBillingOnlyInformationDialogResponse.IAuthTabCallback))) {
                                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1114);
                                        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompletedOnExtraCallback = TdsDialogV1.Companion.onExtraCallback(context);
                                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(629);
                                        String string = resources.getString(R.string.global_features_user_onboarding_system_error_common_message);
                                        Intrinsics.checkNotNullExpressionValue(string, "");
                                        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted onwarmupcompleted = (TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted) onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult(string);
                                        String string2 = resources.getString(im.toss.uikit.R.string.uikit_ok);
                                        Intrinsics.checkNotNullExpressionValue(string2, "");
                                        GlobalOnboardingResetPasswordEventEffectKt$GlobalOnboardingResetPasswordEventEffect$1$1$1$1$1$.ExternalSyntheticLambda0 externalSyntheticLambda0 = new GlobalOnboardingResetPasswordEventEffectKt$GlobalOnboardingResetPasswordEventEffect$1$1$1$1$1$.ExternalSyntheticLambda0();
                                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2727);
                                        TdsDialogV1.onExtraCallbackWithResult.IAuthTabCallback.onWarmupCompleted.onExtraCallback(onwarmupcompleted, string2, externalSyntheticLambda0, (TdsButtonV1View.asInterface) null, false, 12, (Object) null).onExtraCallback().show();
                                        i10 = 4878;
                                    } else {
                                        if (!(onalternativebillingonlyinformationdialogresponse instanceof onAlternativeBillingOnlyInformationDialogResponse.onWarmupCompleted)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4906);
                                        function0.invoke();
                                        i10 = 4560;
                                    }
                                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(i10);
                                } else {
                                    if ((((asInterface ^ BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4780)) >> 30) & 1) == 0) {
                                        Object obj2 = null;
                                        obj2.hashCode();
                                        throw null;
                                    }
                                    Intent intentOnExtraCallback = griverPhotoSelectActivity8.onExtraCallback(context, new GriverPhotoSelectActivity7(UnifiedSessionType.onExtraCallback(((onAlternativeBillingOnlyInformationDialogResponse.onNavigationEvent) onalternativebillingonlyinformationdialogresponse).onNavigationEvent()), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1022, (DefaultConstructorMarker) null));
                                    IEngagementSignalsCallback_Parcel<Intent> iEngagementSignalsCallback_Parcel2 = iEngagementSignalsCallback_Parcel;
                                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2434);
                                    iEngagementSignalsCallback_Parcel2.onNavigationEvent(intentOnExtraCallback);
                                }
                                Unit unit = Unit.INSTANCE;
                                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5512);
                                return unit;
                            }

                            private static final void onExtraCallbackWithResult(DialogInterface dialogInterface, int i10) {
                                int i11 = 2 % 2;
                                int i12 = asInterface;
                                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1725);
                                (((((i12 | iOnWarmupCompleted) & (~(i12 & iOnWarmupCompleted))) >> 28) & 1) != 0 ? AppLovinError.Companion : AppLovinError.Companion).onExtraCallbackWithResult().IAuthTabCallback(true);
                                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                            }
                        };
                        this.label = 1;
                        if (iAnimation.collect(setripple, this) == objOnWarmupCompleted) {
                            return objOnWarmupCompleted;
                        }
                    }
                    return Unit.INSTANCE;
                }

                private static void a(char[] cArr, int i, Object[] objArr) {
                    int i2 = 2 % 2;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
                    char[] cArr2 = new char[cArr.length];
                    defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
                    char[] cArr3 = new char[2];
                    while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
                        cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                        cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                        int i3 = 58224;
                        for (int i4 = 0; i4 < 16; i4++) {
                            int i5 = $11 + 33;
                            $10 = i5 % 128;
                            int i6 = i5 % 2;
                            char c = cArr3[1];
                            char c2 = cArr3[0];
                            char C = AppNode5.C(c, (c2 + i3) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L))), c2 >>> 5, onExtraCallback);
                            cArr3[1] = C;
                            cArr3[0] = AppNode5.C(cArr3[0], (C + i3) ^ ((C << 4) + ((char) (onWarmupCompleted ^ 1094535280733222934L))), C >>> 5, onNavigationEvent);
                            i3 -= 40503;
                        }
                        cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
                        cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
                        s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
                    }
                    String str = new String(cArr2, 0, i);
                    int i7 = $11 + 57;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    objArr[0] = str;
                }
            }

            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object objOnWarmupCompleted = access14300.onWarmupCompleted();
                int i2 = this.label;
                if (i2 != 0) {
                    int i3 = onExtraCallbackWithResult + 65;
                    onWarmupCompleted = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        Object[] objArr = new Object[1];
                        a((Process.myTid() >> 22) + 47, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 28, new char[]{'\t', '\n', 19, 22, '\t', 65476, 65483, '\r', 18, 26, 19, 15, '\t', 65483, 65476, 27, '\r', 24, '\f', 65476, 7, 19, 22, 19, 25, 24, '\r', 18, '\t', 7, 5, 16, 16, 65476, 24, 19, 65476, 65483, 22, '\t', 23, 25, 17, '\t', 65483, 65476, 6}, false, 216 - TextUtils.getOffsetAfter("", 0), objArr);
                        throw new IllegalStateException(((String) objArr[0]).intern());
                    }
                    ResultKt.onNavigationEvent(obj);
                    int i5 = onWarmupCompleted + 25;
                    onExtraCallbackWithResult = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    ResultKt.onNavigationEvent(obj);
                    setPatch setpatchOnExtraCallback = putChannelInfo.onExtraCallback().onExtraCallback();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$eventFlow, this.$unifiedSessionProvider, this.$context, this.$launcher, this.$resources, this.$navigateToCreatePassword, null);
                    this.label = 1;
                    if (maybeUpdateAnimatable.onExtraCallback(setpatchOnExtraCallback, anonymousClass1, this) == objOnWarmupCompleted) {
                        int i7 = onWarmupCompleted + 33;
                        onExtraCallbackWithResult = i7 % 128;
                        int i8 = i7 % 2;
                        return objOnWarmupCompleted;
                    }
                }
                return Unit.INSTANCE;
            }

            private static void a(int i, int i2, char[] cArr, boolean z, int i3, Object[] objArr) {
                int i4 = 2 % 2;
                SimpleBasePlayerPositionSupplierExternalSyntheticLambda1 simpleBasePlayerPositionSupplierExternalSyntheticLambda1 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda1();
                char[] cArr2 = new char[i];
                simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback = cArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback];
                    cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.IAuthTabCallback + i3);
                    int i5 = simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback;
                    cArr2[i5] = bindContext.access000.g(cArr2[i5], IAuthTabCallback);
                    LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                }
                if (i2 > 0) {
                    int i6 = $11 + 7;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
                    char[] cArr3 = new char[i];
                    System.arraycopy(cArr2, 0, cArr3, 0, i);
                    System.arraycopy(cArr3, 0, cArr2, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    System.arraycopy(cArr3, simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult, cArr2, 0, i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallbackWithResult);
                    int i8 = $11 + 17;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                }
                if (z) {
                    char[] cArr4 = new char[i];
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback = 0;
                    while (simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback < i) {
                        int i10 = $10 + 1;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i % simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) >>> 1];
                        } else {
                            cArr4[simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback] = cArr2[(i - simpleBasePlayerPositionSupplierExternalSyntheticLambda1.onExtraCallback) - 1];
                        }
                        LeastRecentlyUsedCacheEvictorExternalSyntheticLambda0.i(simpleBasePlayerPositionSupplierExternalSyntheticLambda1, simpleBasePlayerPositionSupplierExternalSyntheticLambda1);
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i2 = this.label;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.onNavigationEvent(obj);
                TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0 = this.$lifecycleOwner;
                TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback onextracallback = TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.STARTED;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$eventFlow, this.$unifiedSessionProvider, this.$context, this.$launcher, this.$resources, this.$navigateToCreatePassword, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.onExtraCallback(textFieldScrollKtExternalSyntheticLambda0, onextracallback, anonymousClass3, this) == objOnWarmupCompleted) {
                    int i3 = onExtraCallback + 83;
                    int i4 = i3 % 128;
                    IAuthTabCallbackDefault = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 61;
                    onExtraCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        return objOnWarmupCompleted;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i2 != 1) {
                    Object[] objArr = new Object[1];
                    a(null, null, new byte[]{-119, -112, -113, -123, -117, -122, -120, -122, -127, -124, -108, -123, -113, -109, -124, -121, -119, -110, -122, -111, -112, -113, -121, -124, -119, -120, -122, -114, -119, -115, -124, -121, -119, -116, -117, -118, -119, -120, -121, -124, -122, -123, -124, -125, -125, -126, -127}, 127 - TextUtils.getTrimmedLength(""), objArr);
                    throw new IllegalStateException(((String) objArr[0]).intern());
                }
                int i7 = IAuthTabCallbackDefault + 29;
                onExtraCallback = i7 % 128;
                if (i7 % 2 != 0) {
                    ResultKt.onNavigationEvent(obj);
                    int i8 = 76 / 0;
                } else {
                    ResultKt.onNavigationEvent(obj);
                }
            }
            return Unit.INSTANCE;
        }

        private static void a(char[] cArr, int[] iArr, byte[] bArr, int i, Object[] objArr) {
            int i2;
            int i3 = 2 % 2;
            DefaultGainProviderExternalSyntheticLambda2 defaultGainProviderExternalSyntheticLambda2 = new DefaultGainProviderExternalSyntheticLambda2();
            char[] cArr2 = onExtraCallbackWithResult;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                for (int i4 = 0; i4 < length; i4++) {
                    cArr3[i4] = MalwareDetectActivity$onExtraCallbackWithResult.x(cArr2[i4]);
                }
                cArr2 = cArr3;
            }
            int iY = GlobalLeaveTestActivity$IAuthTabCallback.y(IAuthTabCallback);
            if (onNavigationEvent) {
                int i5 = $11 + 21;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = bArr.length;
                char[] cArr4 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    int i7 = $10 + 17;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback << defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] >> i] * iY);
                    } else {
                        cArr4[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[bArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] - iY);
                    }
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (onWarmupCompleted) {
                defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = cArr.length;
                char[] cArr5 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                    cArr5[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[cArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    Hilt_SchemeExecutorActivity$1.v(defaultGainProviderExternalSyntheticLambda2, defaultGainProviderExternalSyntheticLambda2);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback = iArr.length;
            char[] cArr6 = new char[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback];
            defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = 0;
            while (defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted < defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback) {
                int i10 = $10 + 113;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback * defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] + i] >>> iY);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted >>> 1;
                } else {
                    cArr6[defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] = (char) (cArr2[iArr[(defaultGainProviderExternalSyntheticLambda2.IAuthTabCallback - 1) - defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted] - i] - iY);
                    i2 = defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted + 1;
                }
                defaultGainProviderExternalSyntheticLambda2.onWarmupCompleted = i2;
            }
            objArr[0] = new String(cArr6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void IAuthTabCallback(@org.jetbrains.annotations.NotNull o.GriverPhotoSelectActivity8 r21, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r23, @org.jetbrains.annotations.NotNull o.IAnimation<? extends o.onAlternativeBillingOnlyInformationDialogResponse> r24, @org.jetbrains.annotations.Nullable o.CameraCaptureResultEmptyCameraCaptureResult r25, int r26) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExternalTransactionToken.IAuthTabCallback(o.GriverPhotoSelectActivity8, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, o.IAnimation, o.CameraCaptureResultEmptyCameraCaptureResult, int):void");
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    private static final IEngagementSignalsCallback_Parcel<Intent> IAuthTabCallback(Function1<? super Long, Unit> function1, Function0<Unit> function0, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 2) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new GlobalOnboardingResetPasswordEventEffectKt$.ExternalSyntheticLambda3();
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function0 = (Function0) objOnMinimized;
        }
        boolean z = true;
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i4 = onWarmupCompleted + 47;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(new char[]{23974, 46333, 35639, 62112, 49886, 29969, 2293, 20246, 60141, 45762, 47214, 8500, 14235, 56408, 33571, 11521, 44501, 3550, 18742, 50585, 55267, 53580, 2293, 20246, 27741, 45373, 16062, 55989, 10890, 35828, 45887, 62811, 24377, 37262, 63168, 49676, 19140, 40651, 53441, 28827, 10186, 22318, 55267, 53580, 12708, 25890, 61863, 13837, 63383, 45634, 36246, 12360, 11119, 25641, 54178, 2890, 33180, 770, 25057, 53321, 25057, 53321, 55518, 61220, 11899, 24041, 33134, 9340, 16907, 13836, 4245, 22255, 27907, 63807, 39617, 52938, 54178, 2890, 18982, 35182, 61984, 19529, 7311, 49813, 16892, 56950, 28531, 41060, 36246, 12360, 11119, 25641, 54178, 2890, 10632, 48030, 49752, 21102, 16162, 44951, 16062, 55989, 18176, 62318, 42989, 44429, 47214, 8500, 14235, 56408, 15660, 43108, 45887, 62811, 24377, 37262, 63168, 49676, 19140, 40651, 24578, 18237, 12708, 25890, 39530, 3637, 50951, 61922, 35390, 20891, 26140, 61182, 17662, 33512, 16198, 51710, 25058, 10537, 63018, 62151, 18774, 16608, 11346, 47574, 27458, 14235, 34978, 20545, 59927, 31698, 57307, 20608}, (TypedValue.complexToFraction(0, 1.0f, 1.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 1.0f, 1.0f) == 0.0f ? 0 : -1)) * 19099, objArr);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2106921025, i, -1, ((String) objArr[0]).intern());
            } else {
                Object[] objArr2 = new Object[1];
                a(new char[]{23974, 46333, 35639, 62112, 49886, 29969, 2293, 20246, 60141, 45762, 47214, 8500, 14235, 56408, 33571, 11521, 44501, 3550, 18742, 50585, 55267, 53580, 2293, 20246, 27741, 45373, 16062, 55989, 10890, 35828, 45887, 62811, 24377, 37262, 63168, 49676, 19140, 40651, 53441, 28827, 10186, 22318, 55267, 53580, 12708, 25890, 61863, 13837, 63383, 45634, 36246, 12360, 11119, 25641, 54178, 2890, 33180, 770, 25057, 53321, 25057, 53321, 55518, 61220, 11899, 24041, 33134, 9340, 16907, 13836, 4245, 22255, 27907, 63807, 39617, 52938, 54178, 2890, 18982, 35182, 61984, 19529, 7311, 49813, 16892, 56950, 28531, 41060, 36246, 12360, 11119, 25641, 54178, 2890, 10632, 48030, 49752, 21102, 16162, 44951, 16062, 55989, 18176, 62318, 42989, 44429, 47214, 8500, 14235, 56408, 15660, 43108, 45887, 62811, 24377, 37262, 63168, 49676, 19140, 40651, 24578, 18237, 12708, 25890, 39530, 3637, 50951, 61922, 35390, 20891, 26140, 61182, 17662, 33512, 16198, 51710, 25058, 10537, 63018, 62151, 18774, 16608, 11346, 47574, 27458, 14235, 34978, 20545, 59927, 31698, 57307, 20608}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 151, objArr2);
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(2106921025, i, -1, ((String) objArr2[0]).intern());
            }
        }
        IPostMessageService_Parcel.asInterface asinterface = new IPostMessageService_Parcel.asInterface();
        boolean z2 = (((i & 14) ^ 6) > 4 && cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function1)) || (i & 6) == 4;
        if (((i & 112) ^ 48) <= 32 || !cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(function0)) {
            if ((i & 48) == 32) {
                int i5 = IAuthTabCallbackStub + 105;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
            } else {
                z = false;
            }
        }
        Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
        if ((z | z2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
            objOnMinimized2 = new GlobalOnboardingResetPasswordEventEffectKt$.ExternalSyntheticLambda4(function1, function0);
            cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized2);
        }
        ICustomTabsServiceDefault iCustomTabsServiceDefaultOnWarmupCompleted = prefetch.onWarmupCompleted(asinterface, (Function1) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult, 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            int i7 = IAuthTabCallbackStub + 49;
            onWarmupCompleted = i7 % 128;
            int i8 = i7 % 2;
            CameraConfigExternalSyntheticLambda0.onTransact();
            if (i8 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return iCustomTabsServiceDefaultOnWarmupCompleted;
    }

    private static final Unit onNavigationEvent(Function1 function1, Function0 function0, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        Long lValueOf;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        if (iEngagementSignalsCallbackDefault.onNavigationEvent() == -1) {
            Intent intentOnExtraCallbackWithResult = iEngagementSignalsCallbackDefault.onExtraCallbackWithResult();
            Object obj = null;
            if (intentOnExtraCallbackWithResult != null) {
                Object[] objArr = new Object[1];
                a(new char[]{32231, 35398, 1093, 19534, 51228, 42631, 29404, 44613, 63403, 14658, 59657, 49369, 11841, 10370, 60682, 52473}, View.resolveSize(0, 0) + 16, objArr);
                lValueOf = Long.valueOf(intentOnExtraCallbackWithResult.getLongExtra(((String) objArr[0]).intern(), -1L));
            } else {
                int i4 = onWarmupCompleted + 115;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 3;
                }
                lValueOf = null;
            }
            if (lValueOf != null && lValueOf.longValue() != -1) {
                int i6 = onWarmupCompleted + 95;
                IAuthTabCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    function1.invoke(lValueOf);
                    obj.hashCode();
                    throw null;
                }
                function1.invoke(lValueOf);
            }
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 89;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = $11 + 71;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i7) ^ ((c2 << 4) + ((char) (IAuthTabCallback ^ 1094535280733222934L))), c2 >>> 5, onExtraCallbackWithResult);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i7) ^ ((C << 4) + ((char) (onNavigationEvent ^ 1094535280733222934L))), C >>> 5, onExtraCallback);
                i7 -= 40503;
                i8++;
                int i9 = $10 + 31;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 2 % 3;
                }
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(GriverPhotoSelectActivity8 griverPhotoSelectActivity8, Function1 function1, Function0 function0, IAnimation iAnimation, int i, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i2) {
        Object[] objArr = {griverPhotoSelectActivity8, function1, function0, iAnimation, Integer.valueOf(i), cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i2)};
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(1758091313, zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), zzaq.onNavigationEvent(), objArr, -1758091313, iOnNavigationEvent);
    }

    private static final Unit onExtraCallbackWithResult(Activity activity) {
        int iOnNavigationEvent = zzaq.onNavigationEvent();
        int iOnNavigationEvent2 = zzaq.onNavigationEvent();
        int iOnNavigationEvent3 = zzaq.onNavigationEvent();
        return (Unit) onExtraCallback(-1846533081, iOnNavigationEvent2, zzaq.onNavigationEvent(), iOnNavigationEvent3, new Object[]{activity}, 1846533082, iOnNavigationEvent);
    }

    static {
        byte[] bArr = {50, 44, -54, 25, 1, 3, -12, -26, 27, -9, 14, -19, 15, 5};
        $$a = bArr;
        ClassLoader parent = getExternalTransactionToken.class.getClassLoader().getParent();
        try {
            byte b = (byte) (bArr[4] - 1);
            byte b2 = b;
            Method declaredMethod = ClassLoader.class.getDeclaredMethod($$c(b, b2, b2), String.class);
            declaredMethod.setAccessible(true);
            System.load((String) declaredMethod.invoke(parent, "ea56"));
            onWarmupCompleted = 0;
            IAuthTabCallbackStub = 1;
            onNavigationEvent = (char) 50643;
            onExtraCallback = (char) 16243;
            IAuthTabCallback = (char) 3250;
            onExtraCallbackWithResult = (char) 40314;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
