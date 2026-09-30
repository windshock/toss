package o;

import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.QuirksExternalSyntheticBackport0;
import o.initSDK;
import o.setCallToAction;
import o.t7ExternalSyntheticLambda0;
import o.toPreviewOnlyRange;
import o.u4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class t7ExternalSyntheticLambda0 {
    private static int IAuthTabCallback = 0;
    private static int onExtraCallback = 1;
    private static int onExtraCallbackWithResult = 1;
    public static final t7ExternalSyntheticLambda0 onNavigationEvent = new t7ExternalSyntheticLambda0();
    private static int onWarmupCompleted;

    static {
        int i = onWarmupCompleted + 91;
        onExtraCallback = i % 128;
        if (i % 2 == 0) {
            int i2 = 53 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = i2 | i7;
        int i9 = (~(i3 | i5)) | i2;
        int i10 = ~i3;
        int i11 = (~(i5 | i3 | i2)) | (~(i7 | i10)) | (~((~i2) | i10));
        int i12 = i3 + i2 + i6 + (1609234610 * i) + (1307081305 * i4);
        int i13 = i12 * i12;
        int i14 = (((-490261092) * i3) - 1772093440) + (1576585830 * i2) + (i8 * 1033423461) + ((-2066846922) * i9) + (1033423461 * i11) + (543162368 * i6) + ((-2101346304) * i) + (23068672 * i4) + ((-2103967744) * i13);
        int i15 = (i3 * 273352028) + 245730370 + (i2 * 273352646) + (i8 * 309) + (i9 * (-618)) + (i11 * 309) + (i6 * 273352337) + (i * (-770635566)) + (i4 * (-73506199)) + (i13 * (-2011693056));
        int i16 = i14 + (i15 * i15 * 1080557568);
        if (i16 == 1) {
            return onExtraCallback(objArr);
        }
        if (i16 != 2) {
            return onExtraCallbackWithResult(objArr);
        }
        int i17 = 2 % 2;
        int i18 = onExtraCallbackWithResult + 111;
        IAuthTabCallback = i18 % 128;
        int i19 = i18 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i20 = IAuthTabCallback + 9;
        onExtraCallbackWithResult = i20 % 128;
        int i21 = i20 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, float f, long j, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, float f2, String str, setClickDestinationBackupUri setclickdestinationbackupuri, Function0 function0, boolean z2, boolean z3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 109;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitOnExtraCallback = onExtraCallback(quirksExternalSyntheticBackport0, z, f, j, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, f2, str, setclickdestinationbackupuri, function0, z2, z3, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = IAuthTabCallback + 121;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        initSDK.onNavigationEvent onnavigationevent = (initSDK.onNavigationEvent) objArr[0];
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent);
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        int i5 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(setClickDestinationBackupUri setclickdestinationbackupuri, boolean z, boolean z2, Function0 function0, String str, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(setclickdestinationbackupuri, z, z2, function0, str, u4Var, cameraCaptureResultEmptyCameraCaptureResult, i);
        int i5 = onExtraCallbackWithResult + 27;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallback(t7ExternalSyntheticLambda0 t7externalsyntheticlambda0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setClickDestinationBackupUri setclickdestinationbackupuri, long j, boolean z, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 79;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return onNavigationEvent(t7externalsyntheticlambda0, str, quirksExternalSyntheticBackport0, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuri, j, z, z2, z3, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        }
        onNavigationEvent(t7externalsyntheticlambda0, str, quirksExternalSyntheticBackport0, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuri, j, z, z2, z3, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 109;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            return onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        onExtraCallback(str, rowScope, cameraCaptureResultEmptyCameraCaptureResult, i);
        throw null;
    }

    private static final Unit onNavigationEvent(t7ExternalSyntheticLambda0 t7externalsyntheticlambda0, String str, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setClickDestinationBackupUri setclickdestinationbackupuri, long j, boolean z, boolean z2, boolean z3, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 25;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        t7externalsyntheticlambda0.IAuthTabCallback(str, quirksExternalSyntheticBackport0, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuri, j, z, z2, z3, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = IAuthTabCallback + 17;
        onExtraCallbackWithResult = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 46 / 0;
        }
        return unit;
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 73;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return unitIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private t7ExternalSyntheticLambda0() {
    }

    public static abstract class onExtraCallback {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallbackWithResult;
        private Integer onExtraCallback;
        private int onNavigationEvent;
        private Interpolator onWarmupCompleted;

        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract <T> updateFocusedState<T> onExtraCallback(int i);

        public abstract t6 onWarmupCompleted(@NotNull u2 u2Var, float f);

        private onExtraCallback() {
            this.onNavigationEvent = 1000;
            this.onWarmupCompleted = getCallToActionButton.onExtraCallback.onTransact().IAuthTabCallback();
        }

        public int onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 47;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            int i5 = this.onNavigationEvent;
            int i6 = i3 + 109;
            onExtraCallbackWithResult = i6 % 128;
            if (i6 % 2 == 0) {
                return i5;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Integer onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            throw null;
        }

        public final Interpolator onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 45;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            int i4 = i2 % 2;
            Interpolator interpolator = this.onWarmupCompleted;
            int i5 = i3 + 39;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            return interpolator;
        }

        public static final class IAuthTabCallback extends onExtraCallback {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;
            public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

            static {
                int i = onNavigationEvent + 81;
                IAuthTabCallback = i % 128;
                if (i % 2 == 0) {
                    int i2 = 59 / 0;
                }
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback;
                int i3 = i2 + 29;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                if (this == obj || !(!(obj instanceof IAuthTabCallback))) {
                    return true;
                }
                int i5 = i2 + 37;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 99;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                int i4 = i2 % 2;
                int i5 = i3 + 35;
                onExtraCallback = i5 % 128;
                int i6 = i5 % 2;
                return -174018785;
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 71;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    int i4 = 6 / 0;
                }
                int i5 = i3 + 13;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 83 / 0;
                }
                return "None";
            }

            private IAuthTabCallback() {
                super(null);
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public t6 onWarmupCompleted(@NotNull u2 u2Var, float f) {
                float f2;
                int i = 2 % 2;
                int i2 = onExtraCallback + 89;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(u2Var, "");
                    if (f > 1.0f) {
                    }
                    f2 = 1.0f;
                    return new t6(0.0f, f2, 0.0f, 5, null);
                }
                Intrinsics.checkNotNullParameter(u2Var, "");
                if (f <= 0.0f) {
                    f2 = 0.0f;
                    return new t6(0.0f, f2, 0.0f, 5, null);
                }
                int i3 = onExtraCallbackWithResult + 59;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                f2 = 1.0f;
                return new t6(0.0f, f2, 0.0f, 5, null);
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public <T> updateFocusedState<T> onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 119;
                onExtraCallbackWithResult = i3 % 128;
                getThumbPosition getthumbpositionOnExtraCallbackWithResult = i3 % 2 == 0 ? onQueryRefine.onExtraCallbackWithResult(0, 1, (setOnQueryTextListener) null, 122, (Object) null) : onQueryRefine.onExtraCallbackWithResult(0, 0, (setOnQueryTextListener) null, 6, (Object) null);
                int i4 = onExtraCallbackWithResult + 51;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return getthumbpositionOnExtraCallbackWithResult;
            }
        }

        public static final class onNavigationEvent extends onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;
            private Integer IAuthTabCallback;
            private int onNavigationEvent;

            /* JADX WARN: Illegal instructions before constructor call */
            public onNavigationEvent() {
                Integer num = null;
                this(num, 0, 3, num);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
            
                r6 = null;
                r6.hashCode();
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            
                if ((r6 instanceof o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent) != false) goto L16;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
            
                r6 = (o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent) r6;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
            
                if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallback, r6.IAuthTabCallback)) == true) goto L23;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
            
                if (r5.onNavigationEvent == r6.onNavigationEvent) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
            
                r6 = o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult + 77;
                o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent.onExtraCallback = r6 % 128;
                r6 = r6 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
            
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
            
                if (r5 == r6) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            
                r2 = r2 + 117;
                r6 = r2 % 128;
                o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent.onExtraCallback = r6;
                r2 = r2 % 2;
                r6 = r6 + 77;
                o.t7ExternalSyntheticLambda0.onExtraCallback.onNavigationEvent.onExtraCallbackWithResult = r6 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
            
                if ((r6 % 2) == 0) goto L11;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = onExtraCallback + 101;
                int i3 = i2 % 128;
                onExtraCallbackWithResult = i3;
                if (i2 % 2 == 0) {
                    int i4 = 1 / 0;
                }
            }

            public int hashCode() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 73;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
                Integer num = this.IAuthTabCallback;
                int iHashCode = ((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.onNavigationEvent);
                int i3 = onExtraCallbackWithResult + 47;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 83 / 0;
                }
                return iHashCode;
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Fade(durationMillis=" + this.IAuthTabCallback + ", delayMillis=" + this.onNavigationEvent + ")";
                int i2 = onExtraCallbackWithResult + 99;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return str;
            }

            public onNavigationEvent(@Nullable Integer num, int i) {
                super(null);
                this.IAuthTabCallback = num;
                this.onNavigationEvent = i;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ onNavigationEvent(Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 1) != 0) {
                    int i3 = onExtraCallbackWithResult + 125;
                    onExtraCallback = i3 % 128;
                    Object obj = null;
                    if (i3 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    int i4 = 2 % 2;
                    num = null;
                }
                if ((i2 & 2) != 0) {
                    int i5 = onExtraCallbackWithResult + 19;
                    onExtraCallback = i5 % 128;
                    i = i5 % 2 != 0 ? 31095 : 1000;
                }
                this(num, i);
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public Integer onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 121;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                Integer num = this.IAuthTabCallback;
                int i4 = i3 + 5;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return num;
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 75;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i4 = this.onNavigationEvent;
                int i5 = i3 + 27;
                onExtraCallbackWithResult = i5 % 128;
                int i6 = i5 % 2;
                return i4;
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public t6 onWarmupCompleted(@NotNull u2 u2Var, float f) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(u2Var, "");
                t6 t6Var = new t6(0.0f, f, 0.0f, 5, null);
                int i2 = onExtraCallbackWithResult + 43;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 13 / 0;
                }
                return t6Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0085 A[PHI: r1 r13
              0x0085: PHI (r1v6 o.AppLovinSdkSettings) = (r1v5 o.AppLovinSdkSettings), (r1v10 o.AppLovinSdkSettings) binds: [B:8:0x0083, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]
              0x0085: PHI (r13v5 java.lang.Integer) = (r13v4 java.lang.Integer), (r13v15 java.lang.Integer) binds: [B:8:0x0083, B:5:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public <T> updateFocusedState<T> onExtraCallback(int i) {
                AppLovinSdkSettings appLovinSdkSettingsOnExtraCallbackWithResult;
                Integer numOnWarmupCompleted;
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 59;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 == 0) {
                    appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST);
                    numOnWarmupCompleted = onWarmupCompleted();
                    if (numOnWarmupCompleted != null) {
                    }
                } else {
                    appLovinSdkSettingsOnExtraCallbackWithResult = AuthenticatorCompanion.IAuthTabCallback.onExtraCallbackWithResult(authenticate.IN, AuthenticatorCompanionAuthenticatorNone.FAST);
                    numOnWarmupCompleted = onWarmupCompleted();
                    if (numOnWarmupCompleted != null) {
                    }
                }
                appLovinSdkSettingsOnExtraCallbackWithResult.onWarmupCompleted(onExtraCallback());
                Object obj = null;
                updateFocusedState<T> updatefocusedstateOnNavigationEvent = r8lambdaFP1Wedqhw_3GpPb7HzEjaomLQYM.onNavigationEvent(appLovinSdkSettingsOnExtraCallbackWithResult, 0, 1, null);
                int i4 = onExtraCallback + 3;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    return updatefocusedstateOnNavigationEvent;
                }
                obj.hashCode();
                throw null;
            }
        }

        /* renamed from: o.t7ExternalSyntheticLambda0$onExtraCallback$onExtraCallback, reason: collision with other inner class name */
        public static final class C0066onExtraCallback extends onExtraCallback {
            private static int IAuthTabCallback = 0;
            private static int IAuthTabCallbackDefault = 1;
            private final boolean onExtraCallback;
            private final float onExtraCallbackWithResult;
            private int onNavigationEvent;
            private Integer onWarmupCompleted;

            public C0066onExtraCallback() {
                this(false, null, 0, 7, null);
            }

            public boolean equals(@Nullable Object obj) {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault + 119;
                int i3 = i2 % 128;
                IAuthTabCallback = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0066onExtraCallback)) {
                    int i4 = i3 + 63;
                    IAuthTabCallbackDefault = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                C0066onExtraCallback c0066onExtraCallback = (C0066onExtraCallback) obj;
                if (this.onExtraCallback != c0066onExtraCallback.onExtraCallback) {
                    return false;
                }
                if (!Intrinsics.areEqual(this.onWarmupCompleted, c0066onExtraCallback.onWarmupCompleted)) {
                    int i6 = IAuthTabCallback + 17;
                    IAuthTabCallbackDefault = i6 % 128;
                    int i7 = i6 % 2;
                    return false;
                }
                if (this.onNavigationEvent != c0066onExtraCallback.onNavigationEvent) {
                    int i8 = IAuthTabCallbackDefault + 21;
                    IAuthTabCallback = i8 % 128;
                    int i9 = i8 % 2;
                    return false;
                }
                int i10 = IAuthTabCallback + 47;
                IAuthTabCallbackDefault = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int iHashCode2 = Boolean.hashCode(this.onExtraCallback);
                Integer num = this.onWarmupCompleted;
                if (num == null) {
                    int i2 = IAuthTabCallbackDefault + 11;
                    int i3 = i2 % 128;
                    IAuthTabCallback = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 117;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    iHashCode = 0;
                } else {
                    iHashCode = num.hashCode();
                }
                return (((iHashCode2 * 31) + iHashCode) * 31) + Integer.hashCode(this.onNavigationEvent);
            }

            public String toString() {
                int i = 2 % 2;
                String str = "Scroll(withOpacity=" + this.onExtraCallback + ", durationMillis=" + this.onWarmupCompleted + ", delayMillis=" + this.onNavigationEvent + ")";
                int i2 = IAuthTabCallbackDefault + 93;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 == 0) {
                    return str;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public C0066onExtraCallback(boolean z, @Nullable Integer num, int i) {
                super(null);
                this.onExtraCallback = z;
                this.onWarmupCompleted = num;
                this.onNavigationEvent = i;
                this.onExtraCallbackWithResult = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(50.0f);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ C0066onExtraCallback(boolean z, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i2 & 1) != 0) {
                    int i3 = IAuthTabCallbackDefault + 97;
                    IAuthTabCallback = i3 % 128;
                    int i4 = i3 % 2;
                    z = true;
                }
                if ((i2 & 2) != 0) {
                    int i5 = IAuthTabCallbackDefault + 67;
                    IAuthTabCallback = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    num = null;
                }
                if ((i2 & 4) != 0) {
                    int i6 = IAuthTabCallbackDefault + 13;
                    IAuthTabCallback = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 % 2;
                    }
                    i = 1000;
                }
                this(z, num, i);
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public Integer onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = IAuthTabCallbackDefault;
                int i3 = i2 + 3;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Integer num = this.onWarmupCompleted;
                int i5 = i2 + 53;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                return num;
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public int onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 125;
                int i3 = i2 % 128;
                IAuthTabCallbackDefault = i3;
                int i4 = i2 % 2;
                int i5 = this.onNavigationEvent;
                int i6 = i3 + 25;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 == 0) {
                    return i5;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0085 A[PHI: r1 r12
              0x0085: PHI (r1v7 float) = (r1v6 float), (r1v13 float) binds: [B:8:0x0081, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x0085: PHI (r12v3 float) = (r12v2 float), (r12v7 float) binds: [B:8:0x0081, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0083 A[PHI: r1 r12
              0x0083: PHI (r1v10 float) = (r1v6 float), (r1v13 float) binds: [B:8:0x0081, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x0083: PHI (r12v5 float) = (r12v2 float), (r12v7 float) binds: [B:8:0x0081, B:5:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public t6 onWarmupCompleted(@NotNull u2 u2Var, float f) {
                float fFloatValue;
                float fOnExtraCallback;
                float f2;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 23;
                IAuthTabCallbackDefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(u2Var, "");
                    int iOnExtraCallbackWithResult = alertWithArgs.onExtraCallbackWithResult();
                    fFloatValue = ((Float) u2.onWarmupCompleted(-576215392, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult, alertWithArgs.onExtraCallbackWithResult(), 576215396)).floatValue();
                    fOnExtraCallback = u2Var.onExtraCallbackWithResult().onExtraCallback(this.onExtraCallbackWithResult);
                    int i3 = 68 / 0;
                    if (!this.onExtraCallback) {
                        int i4 = IAuthTabCallbackDefault + 31;
                        IAuthTabCallback = i4 % 128;
                        int i5 = i4 % 2;
                        f2 = 1.0f;
                    } else {
                        f2 = f;
                    }
                } else {
                    Intrinsics.checkNotNullParameter(u2Var, "");
                    int iOnExtraCallbackWithResult2 = alertWithArgs.onExtraCallbackWithResult();
                    fFloatValue = ((Float) u2.onWarmupCompleted(-576215392, alertWithArgs.onExtraCallbackWithResult(), alertWithArgs.onExtraCallbackWithResult(), new Object[]{u2Var}, iOnExtraCallbackWithResult2, alertWithArgs.onExtraCallbackWithResult(), 576215396)).floatValue();
                    fOnExtraCallback = u2Var.onExtraCallbackWithResult().onExtraCallback(this.onExtraCallbackWithResult);
                    if (this.onExtraCallback) {
                    }
                }
                return new t6((fFloatValue - fOnExtraCallback) * (1.0f - f), f2, 0.0f, 4, null);
            }

            @Override // o.t7ExternalSyntheticLambda0.onExtraCallback
            public <T> updateFocusedState<T> onExtraCallback(int i) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallbackDefault + 23;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onNavigationEvent()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
                Object[] objArr = {appLovinSdkSettings, Integer.valueOf(onExtraCallbackWithResult() + i)};
                Integer numOnWarmupCompleted = onWarmupCompleted();
                if (numOnWarmupCompleted != null) {
                    int i5 = IAuthTabCallback + 119;
                    IAuthTabCallbackDefault = i5 % 128;
                    int i6 = i5 % 2;
                    Object[] objArr2 = {appLovinSdkSettings, Integer.valueOf(numOnWarmupCompleted.intValue())};
                }
                appLovinSdkSettings.onWarmupCompleted(onExtraCallback());
                return r8lambdaFP1Wedqhw_3GpPb7HzEjaomLQYM.onNavigationEvent(appLovinSdkSettings, 0, 1, null);
            }
        }
    }

    private static final Unit IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 53;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws Throwable {
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
        t7b t7bVar;
        int i;
        t7ExternalSyntheticLambda0 t7externalsyntheticlambda0 = (t7ExternalSyntheticLambda0) objArr[0];
        String str = (String) objArr[1];
        QuirksExternalSyntheticBackport0.onExtraCallback onextracallback2 = (QuirksExternalSyntheticBackport0) objArr[2];
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2 = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) objArr[3];
        setCallToAction.onWarmupCompleted onwarmupcompleted = (setCallToAction.onWarmupCompleted) objArr[4];
        setCallToAction.onExtraCallback onextracallback3 = (setCallToAction.onExtraCallback) objArr[5];
        long jLongValue = ((Number) objArr[6]).longValue();
        boolean zBooleanValue = ((Boolean) objArr[7]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[8]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[9]).booleanValue();
        Function0<Unit> function0 = (Function0) objArr[10];
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult = (CameraCaptureResultEmptyCameraCaptureResult) objArr[11];
        int iIntValue = ((Number) objArr[12]).intValue();
        int iIntValue2 = ((Number) objArr[13]).intValue();
        int iIntValue3 = ((Number) objArr[14]).intValue();
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            onextracallback = (iIntValue3 & 3) != 0 ? QuirksExternalSyntheticBackport0.Companion : onextracallback2;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            if ((iIntValue3 & 2) != 0) {
            }
        }
        boolean z = zBooleanValue2;
        if ((iIntValue3 & 4) != 0) {
            r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{null, false, cameraCaptureResultEmptyCameraCaptureResult, 0, 3}, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
        } else {
            r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2;
        }
        if ((iIntValue3 & 8) != 0) {
            onwarmupcompleted = setCallToAction.onWarmupCompleted.Primary;
        }
        if ((iIntValue3 & 16) != 0) {
            int i4 = IAuthTabCallback + 111;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                setCallToAction.onExtraCallback onextracallback4 = setCallToAction.onExtraCallback.Fill;
                throw null;
            }
            onextracallback3 = setCallToAction.onExtraCallback.Fill;
        }
        if ((iIntValue3 & 32) != 0) {
            int i5 = onExtraCallbackWithResult + 5;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                t7bVar = t7b.onExtraCallback;
                i = 47;
            } else {
                t7bVar = t7b.onExtraCallback;
                i = 6;
            }
            jLongValue = t7bVar.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult, i);
        }
        if ((iIntValue3 & 64) != 0) {
            zBooleanValue = false;
        }
        if ((iIntValue3 & 128) != 0) {
            z = true;
        }
        if ((iIntValue3 & 256) != 0) {
            zBooleanValue3 = true;
        }
        if ((iIntValue3 & 512) != 0) {
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda0
                    private static int onExtraCallbackWithResult = 0;
                    private static int onWarmupCompleted = 1;

                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = onExtraCallbackWithResult + 29;
                        onWarmupCompleted = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitOnWarmupCompleted = t7ExternalSyntheticLambda0.onWarmupCompleted();
                        int i9 = onWarmupCompleted + 39;
                        onExtraCallbackWithResult = i9 % 128;
                        if (i9 % 2 == 0) {
                            return unitOnWarmupCompleted;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                };
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            function0 = (Function0) objOnMinimized;
        }
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1331813885, iIntValue, iIntValue2, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware (TdsBottomCtaV1.kt:281)");
            int i6 = onExtraCallbackWithResult + 65;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = iIntValue >> 9;
        setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted = setBody.onExtraCallback.onWarmupCompleted(onwarmupcompleted, onextracallback3, cameraCaptureResultEmptyCameraCaptureResult, (i8 & 14) | 384 | (i8 & 112), 0);
        int i9 = iIntValue >> 3;
        t7externalsyntheticlambda0.IAuthTabCallback(str, onextracallback, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, setclickdestinationbackupuriOnWarmupCompleted, jLongValue, zBooleanValue, z, zBooleanValue3, function0, cameraCaptureResultEmptyCameraCaptureResult, (i9 & 29360128) | (iIntValue & 1022) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (234881024 & i9) | ((iIntValue2 << 27) & 1879048192), 0);
        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
            CameraConfigExternalSyntheticLambda0.onTransact();
        }
        return null;
    }

    private static final Unit onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 59;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 69;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private static final Unit onExtraCallback(String str, RowScope rowScope, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws NoWhenBranchMatchedException {
        boolean z;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(rowScope, "");
        if ((i & 17) != 16) {
            z = true;
        } else {
            int i3 = onExtraCallbackWithResult + 67;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            z = false;
        }
        if (!cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z, i & 1)) {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        } else {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i5 = IAuthTabCallback + 69;
                onExtraCallbackWithResult = i5 % 128;
                if (i5 % 2 == 0) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-229834164, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:322)");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-229834164, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware.<anonymous>.<anonymous> (TdsBottomCtaV1.kt:322)");
            }
            AppLovinVastMediaVieweExternalSyntheticLambda0.onExtraCallback(new Object[]{str, null, null, 0L, 0L, 0L, null, null, null, Float.valueOf(0.0f), null, null, 0L, 0, false, null, null, cameraCaptureResultEmptyCameraCaptureResult, 0, 0, 131070}, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1780303015, 1780303016, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = onExtraCallbackWithResult + 95;
                IAuthTabCallback = i6 % 128;
                if (i6 % 2 != 0) {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                    int i7 = 40 / 0;
                } else {
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        int i8 = onExtraCallbackWithResult + 105;
        IAuthTabCallback = i8 % 128;
        int i9 = i8 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(setClickDestinationBackupUri setclickdestinationbackupuri, boolean z, boolean z2, Function0 function0, final String str, u4 u4Var, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
        int i2;
        boolean z3;
        int i3 = 2 % 2;
        int i4 = onExtraCallbackWithResult + 33;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 14) == 0) {
                i2 = i | (cameraCaptureResultEmptyCameraCaptureResult.onNavigationEvent(u4Var) ? 4 : 2);
            } else {
                i2 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(u4Var, "");
            if ((i & 6) == 0) {
            }
        }
        if ((i2 & 19) != 18) {
            int i5 = IAuthTabCallback + 119;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
            z3 = true;
        } else {
            int i7 = IAuthTabCallback + 21;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        }
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(z3, i2 & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(421257821, i2, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware.<anonymous> (TdsBottomCtaV1.kt:315)");
            }
            u4Var.onExtraCallbackWithResult(null, setclickdestinationbackupuri, null, setCallToAction.onNavigationEvent.Block, z, z2, null, function0, ForwardingCameraControl.onExtraCallback(-229834164, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda6
                private static int IAuthTabCallback = 0;
                private static int onWarmupCompleted = 1;

                public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
                    int i9 = 2 % 2;
                    int i10 = onWarmupCompleted + 53;
                    IAuthTabCallback = i10 % 128;
                    int i11 = i10 % 2;
                    Unit unitOnExtraCallbackWithResult = t7ExternalSyntheticLambda0.onExtraCallbackWithResult(str, (RowScope) obj, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                    int i12 = onWarmupCompleted + 47;
                    IAuthTabCallback = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 56 / 0;
                    }
                    return unitOnExtraCallbackWithResult;
                }
            }, cameraCaptureResultEmptyCameraCaptureResult, 54), cameraCaptureResultEmptyCameraCaptureResult, ((i2 << 27) & 1879048192) | 100666368, 69);
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onExtraCallbackWithResult(initSDK.onNavigationEvent onnavigationevent) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 91;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        onnavigationevent.onExtraCallback("cta_yn", "Y");
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallbackWithResult + 107;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    static final class IAuthTabCallback implements skipBytes {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;
        final /* synthetic */ long onWarmupCompleted;

        IAuthTabCallback(long j) {
            this.onWarmupCompleted = j;
        }

        public final long onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 9;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            long j = this.onWarmupCompleted;
            int i5 = i3 + 77;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return j;
        }
    }

    private static final Unit onExtraCallback(QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, boolean z, float f, long j, r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, float f2, String str, setClickDestinationBackupUri setclickdestinationbackupuri, Function0 function0, boolean z2, boolean z3, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) throws Throwable {
        float fIAuthTabCallback;
        float f3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult;
        int i2 = 2 % 2;
        if (cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted((i & 3) != 2, i & 1)) {
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-179897703, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware.<anonymous> (TdsBottomCtaV1.kt:336)");
            }
            QuirkSettingsLoader quirkSettingsLoaderOnExtraCallback = QuirkSettingsLoader.Companion.onExtraCallback();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0IAuthTabCallback = YuvImageOnePixelShiftQuirk.IAuthTabCallback(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport0, 0.0f, 1, (Object) null));
            if (!z) {
                int i3 = IAuthTabCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
            } else {
                fIAuthTabCallback = f;
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0IAuthTabCallback, 0.0f, fIAuthTabCallback, 0.0f, 0.0f, 13, (Object) null);
            boolean zOnWarmupCompleted = cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(j);
            Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult.onMinimized();
            if (zOnWarmupCompleted || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                objOnMinimized = new IAuthTabCallback(j);
                cameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted(objOnMinimized);
            }
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback2 = verifyDrawable.onExtraCallback((QuirksExternalSyntheticBackport0) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{quirksExternalSyntheticBackport0OnExtraCallback, (skipBytes) objOnMinimized, null, 2, null}, -970187454, 970187468, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent()), j, (toMetersPerSecond) null, 2, (Object) null);
            if (r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg.onNavigationEvent()) {
                int i5 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i5 % 128;
                int i6 = i5 % 2;
                f3 = 0.0f;
            } else {
                f3 = 18.0f;
            }
            float fIAuthTabCallback2 = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(f3);
            int i7 = IAuthTabCallback + 69;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallbackWithResult2 = getMaxSize.onExtraCallbackWithResult(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallback2, 0.0f, 0.0f, 0.0f, fIAuthTabCallback2, 7, (Object) null), "tds_bottom_cta_v1");
            component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(quirkSettingsLoaderOnExtraCallback, false);
            int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResult, 0));
            CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResult.writeTypedObject();
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResult, quirksExternalSyntheticBackport0OnExtraCallbackWithResult2);
            toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
            Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            if (cameraCaptureResultEmptyCameraCaptureResult.access100() == null) {
                getAwbState.onExtraCallback();
            }
            cameraCaptureResultEmptyCameraCaptureResult.onUnminimized();
            if (cameraCaptureResultEmptyCameraCaptureResult.onActivityLayout()) {
                int i9 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i9 % 128;
                if (i9 % 2 != 0) {
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
            CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
            HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02 = QuirksExternalSyntheticBackport0.Companion;
            if (r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg.onNavigationEvent()) {
                int i10 = onExtraCallbackWithResult + 79;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = quirksExternalSyntheticBackport02;
            } else {
                quirksExternalSyntheticBackport0OnExtraCallbackWithResult = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallbackWithResult(quirksExternalSyntheticBackport02, f2, 0.0f, 2, (Object) null);
            }
            setAdvertiser.onExtraCallbackWithResult(setAutoCaptured.onExtraCallbackWithResult(), -1453984414, new Object[]{str, getMaxSize.onExtraCallbackWithResult(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.onExtraCallback(quirksExternalSyntheticBackport02.onExtraCallback(quirksExternalSyntheticBackport0OnExtraCallbackWithResult), 0.0f, 1, (Object) null), "tds_bottom_cta_v1_cta_button"), setCallToAction.IAuthTabCallback.Companion.onExtraCallbackWithResult(), setclickdestinationbackupuri, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg.onNavigationEvent() ? setCallToAction.onNavigationEvent.Full : setCallToAction.onNavigationEvent.Block, null, function0, null, Boolean.valueOf(z2), Boolean.valueOf(z3), cameraCaptureResultEmptyCameraCaptureResult, 384, 160}, 1453984418, setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult(), setAutoCaptured.onExtraCallbackWithResult());
            cameraCaptureResultEmptyCameraCaptureResult.asInterface();
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                CameraConfigExternalSyntheticLambda0.onTransact();
                int i11 = IAuthTabCallback + 57;
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 5 % 3;
                }
            }
        } else {
            cameraCaptureResultEmptyCameraCaptureResult.ICustomTabsCallbackStubProxy();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull final String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, @Nullable setClickDestinationBackupUri setclickdestinationbackupuri, long j, boolean z, boolean z2, boolean z3, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) throws Throwable {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        long j2;
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2;
        final Function0<Unit> function02;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        final long j3;
        final setClickDestinationBackupUri setclickdestinationbackupuri2;
        final boolean z6;
        final boolean z7;
        final boolean z8;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg3;
        setClickDestinationBackupUri setclickdestinationbackupuri3;
        boolean z9;
        Function0<Unit> function03;
        boolean z10;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04;
        boolean z11;
        long j4;
        Throwable th;
        int i10;
        Throwable th2;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg4;
        r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg5;
        int i11;
        int i12;
        setClickDestinationBackupUri setclickdestinationbackupuriOnWarmupCompleted;
        long jIAuthTabCallback;
        Function0<Unit> function04;
        int i13;
        int i14;
        int i15 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-17414603);
        if ((i & 6) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                int i16 = IAuthTabCallback + 89;
                onExtraCallbackWithResult = i16 % 128;
                i14 = i16 % 2 == 0 ? 3 : 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i;
        } else {
            i3 = i;
        }
        int i17 = i2 & 2;
        if (i17 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= ((i2 & 4) == 0 && cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg)) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    int i18 = IAuthTabCallback + 123;
                    onExtraCallbackWithResult = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 0 / 0;
                        i13 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri) ? 2048 : 1024;
                    } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(setclickdestinationbackupuri)) {
                    }
                    i3 |= i13;
                }
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    int i20 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(j2) ? 16384 : 8192;
                    i3 |= i20;
                } else {
                    j2 = j;
                }
                i3 |= i20;
            } else {
                j2 = j;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    int i21 = IAuthTabCallback + 25;
                    onExtraCallbackWithResult = i21 % 128;
                    int i22 = i21 % 2;
                    z4 = z;
                    i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z4) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z2) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        int i23 = IAuthTabCallback + 17;
                        onExtraCallbackWithResult = i23 % 128;
                        int i24 = i23 % 2;
                    } else {
                        if ((i & 12582912) == 0) {
                            z5 = z3;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(z5) ? 8388608 : 4194304;
                        }
                        i7 = i2 & 256;
                        if (i7 == 0) {
                            if ((i & 100663296) == 0) {
                                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function0)) {
                                    int i25 = onExtraCallbackWithResult + 113;
                                    IAuthTabCallback = i25 % 128;
                                    if (i25 % 2 != 0) {
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    i8 = 67108864;
                                } else {
                                    i8 = 33554432;
                                }
                                i9 = i8 | i3;
                            }
                            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
                                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                cameraCaptureResultEmptyCameraCaptureResult2.ICustomTabsCallbackStubProxy();
                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
                                function02 = function0;
                                quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                                j3 = j2;
                                setclickdestinationbackupuri2 = setclickdestinationbackupuri;
                                z6 = z2;
                                z7 = z5;
                                z8 = z4;
                            } else {
                                int i26 = onExtraCallbackWithResult + 15;
                                IAuthTabCallback = i26 % 128;
                                if (i26 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onPostMessage()) {
                                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport05 = i17 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                                            if ((i2 & 4) != 0) {
                                                th2 = null;
                                                i10 = i9 & (-897);
                                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg4 = (r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg) u1.IAuthTabCallback(setCurrentIndex.onNavigationEvent(), new Object[]{null, false, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0, 3}, -1912856437, 1912856439, setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent(), setCurrentIndex.onNavigationEvent());
                                            } else {
                                                th2 = null;
                                                i10 = i9;
                                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg4 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
                                            }
                                            if ((i2 & 8) != 0) {
                                                i11 = i7;
                                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg5 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg4;
                                                th = th2;
                                                i12 = 6;
                                                setclickdestinationbackupuriOnWarmupCompleted = setBody.onExtraCallback.onWarmupCompleted(null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 384, 3);
                                                i10 &= -7169;
                                            } else {
                                                r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg5 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg4;
                                                i11 = i7;
                                                th = th2;
                                                i12 = 6;
                                                setclickdestinationbackupuriOnWarmupCompleted = setclickdestinationbackupuri;
                                            }
                                            if ((i2 & 16) != 0) {
                                                jIAuthTabCallback = t7b.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i12);
                                                i10 &= -57345;
                                            } else {
                                                jIAuthTabCallback = j2;
                                            }
                                            if (i4 != 0) {
                                                z4 = false;
                                            }
                                            boolean z12 = i5 != 0 ? true : z2;
                                            if (i6 != 0) {
                                                z5 = true;
                                            }
                                            if (i11 != 0) {
                                                int i27 = onExtraCallbackWithResult + 61;
                                                IAuthTabCallback = i27 % 128;
                                                int i28 = i27 % 2;
                                                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                                if (objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                    objOnMinimized = new Function0() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda1
                                                        private static int onNavigationEvent = 1;
                                                        private static int onWarmupCompleted;

                                                        public final Object invoke() {
                                                            int i29 = 2 % 2;
                                                            int i30 = onWarmupCompleted + 89;
                                                            onNavigationEvent = i30 % 128;
                                                            int i31 = i30 % 2;
                                                            Unit unit = (Unit) t7ExternalSyntheticLambda0.IAuthTabCallback(new Object[0], EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -859354370, 859354372, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
                                                            int i32 = onNavigationEvent + 103;
                                                            onWarmupCompleted = i32 % 128;
                                                            int i33 = i32 % 2;
                                                            return unit;
                                                        }
                                                    };
                                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                                                }
                                                function04 = (Function0) objOnMinimized;
                                            } else {
                                                function04 = function0;
                                            }
                                            r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg3 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg5;
                                            z10 = z4;
                                            setclickdestinationbackupuri3 = setclickdestinationbackupuriOnWarmupCompleted;
                                            j4 = jIAuthTabCallback;
                                            z9 = z12;
                                            function03 = function04;
                                            z11 = z5;
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport05;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                                            if ((i2 & 4) != 0) {
                                                int i29 = onExtraCallbackWithResult + 71;
                                                IAuthTabCallback = i29 % 128;
                                                int i30 = i29 % 2;
                                                i9 &= -897;
                                            }
                                            if ((i2 & 8) != 0) {
                                                i9 &= -7169;
                                            }
                                            if ((i2 & 16) != 0) {
                                                i9 &= -57345;
                                            }
                                            r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg3 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg;
                                            setclickdestinationbackupuri3 = setclickdestinationbackupuri;
                                            z9 = z2;
                                            function03 = function0;
                                            z10 = z4;
                                            quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
                                            z11 = z5;
                                            j4 = j2;
                                            th = null;
                                            i10 = i9;
                                        }
                                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted();
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-17414603, i10, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.KeyboardAware (TdsBottomCtaV1.kt:309)");
                                        }
                                        if (getTcfVendorConsentStatus.Companion.onNavigationEvent().onExtraCallback()) {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(893136681);
                                            final setClickDestinationBackupUri setclickdestinationbackupuri4 = setclickdestinationbackupuri3;
                                            final boolean z13 = z9;
                                            final boolean z14 = z10;
                                            final Function0<Unit> function05 = function03;
                                            u1.IAuthTabCallback(YuvImageOnePixelShiftQuirk.IAuthTabCallback(quirksExternalSyntheticBackport04), null, ForwardingCameraControl.onExtraCallback(421257821, true, new getBacktraceNote() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda2
                                                private static int onNavigationEvent = 1;
                                                private static int onWarmupCompleted;

                                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                                    Unit unitOnExtraCallback;
                                                    int i31 = 2 % 2;
                                                    int i32 = onNavigationEvent + 13;
                                                    onWarmupCompleted = i32 % 128;
                                                    if (i32 % 2 != 0) {
                                                        unitOnExtraCallback = t7ExternalSyntheticLambda0.onExtraCallback(setclickdestinationbackupuri4, z13, z14, function05, str, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                        int i33 = 75 / 0;
                                                    } else {
                                                        unitOnExtraCallback = t7ExternalSyntheticLambda0.onExtraCallback(setclickdestinationbackupuri4, z13, z14, function05, str, (u4) obj2, (CameraCaptureResultEmptyCameraCaptureResult) obj3, ((Integer) obj4).intValue());
                                                    }
                                                    int i34 = onWarmupCompleted + 123;
                                                    onNavigationEvent = i34 % 128;
                                                    int i35 = i34 % 2;
                                                    return unitOnExtraCallback;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 54), null, null, null, null, null, j4, z11, null, null, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i10 << 12) & 234881024) | 384 | ((i10 << 6) & 1879048192), 0, 3322);
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                        } else {
                                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(893861554);
                                            final float fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(20.0f);
                                            final float fOnExtraCallbackWithResult = u1.onExtraCallbackWithResult();
                                            accessisMonitoringp accessismonitoringp = (accessisMonitoringp) setThreadList.onNavigationEvent(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[0], GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 174994773, -174994756, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                                            Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                                            if (objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                                                objOnMinimized2 = new Function1() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda3
                                                    private static int onNavigationEvent = 1;
                                                    private static int onWarmupCompleted;

                                                    public final Object invoke(Object obj2) {
                                                        int i31 = 2 % 2;
                                                        int i32 = onWarmupCompleted + 17;
                                                        onNavigationEvent = i32 % 128;
                                                        int i33 = i32 % 2;
                                                        Object[] objArr = {(initSDK.onNavigationEvent) obj2};
                                                        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                                                        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                                                        if (i33 != 0) {
                                                            return (Unit) t7ExternalSyntheticLambda0.IAuthTabCallback(objArr, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 402128412, -402128411, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), iOnExtraCallback, iOnExtraCallback2);
                                                        }
                                                        throw null;
                                                    }
                                                };
                                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                                            }
                                            accessgetCameraFactoryp accessgetcamerafactorypOnExtraCallback = accessismonitoringp.onExtraCallback((Function1) objOnMinimized2);
                                            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport06 = quirksExternalSyntheticBackport04;
                                            final boolean z15 = z11;
                                            final long j5 = j4;
                                            final r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg6 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg3;
                                            final setClickDestinationBackupUri setclickdestinationbackupuri5 = setclickdestinationbackupuri3;
                                            final Function0<Unit> function06 = function03;
                                            final boolean z16 = z9;
                                            cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                                            final boolean z17 = z10;
                                            setPostviewFormatSelector.onNavigationEvent(accessgetcamerafactorypOnExtraCallback, ForwardingCameraControl.onExtraCallback(-179897703, true, new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda4
                                                private static int onExtraCallback = 0;
                                                private static int onExtraCallbackWithResult = 1;

                                                public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                                    int i31 = 2 % 2;
                                                    int i32 = onExtraCallback + 15;
                                                    onExtraCallbackWithResult = i32 % 128;
                                                    int i33 = i32 % 2;
                                                    Unit unitIAuthTabCallback = t7ExternalSyntheticLambda0.IAuthTabCallback(quirksExternalSyntheticBackport06, z15, fOnExtraCallbackWithResult, j5, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg6, fIAuthTabCallback, str, setclickdestinationbackupuri5, function06, z16, z17, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                                    int i34 = onExtraCallback + 125;
                                                    onExtraCallbackWithResult = i34 % 128;
                                                    if (i34 % 2 == 0) {
                                                        int i35 = 54 / 0;
                                                    }
                                                    return unitIAuthTabCallback;
                                                }
                                            }, cameraCaptureResultEmptyCameraCaptureResult2, 54), cameraCaptureResultEmptyCameraCaptureResult2, accessgetCameraFactoryp.onNavigationEvent | 48);
                                            cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallbackDefault();
                                        }
                                        if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                            int i31 = IAuthTabCallback + 11;
                                            onExtraCallbackWithResult = i31 % 128;
                                            if (i31 % 2 == 0) {
                                                CameraConfigExternalSyntheticLambda0.onTransact();
                                                throw th;
                                            }
                                            CameraConfigExternalSyntheticLambda0.onTransact();
                                        }
                                        quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                                        r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2 = r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg3;
                                        setclickdestinationbackupuri2 = setclickdestinationbackupuri3;
                                        j3 = j4;
                                        z8 = z10;
                                        z6 = z9;
                                        z7 = z11;
                                        function02 = function03;
                                    }
                                } else {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStub();
                                    if ((i & 1) != 0) {
                                    }
                                }
                            }
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1$$ExternalSyntheticLambda5
                                    private static int onExtraCallback = 1;
                                    private static int onExtraCallbackWithResult;

                                    public final Object invoke(Object obj2, Object obj3) throws Throwable {
                                        int i32 = 2 % 2;
                                        int i33 = onExtraCallbackWithResult + 69;
                                        onExtraCallback = i33 % 128;
                                        int i34 = i33 % 2;
                                        Unit unitOnExtraCallback = t7ExternalSyntheticLambda0.onExtraCallback(this.f$0, str, quirksExternalSyntheticBackport03, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg2, setclickdestinationbackupuri2, j3, z8, z6, z7, function02, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                        int i35 = onExtraCallback + 107;
                                        onExtraCallbackWithResult = i35 % 128;
                                        int i36 = i35 % 2;
                                        return unitOnExtraCallback;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        int i32 = IAuthTabCallback + 79;
                        onExtraCallbackWithResult = i32 % 128;
                        if (i32 % 2 == 0) {
                            throw null;
                        }
                        i3 |= 100663296;
                        i9 = i3;
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                        }
                    }
                    z5 = z3;
                    i7 = i2 & 256;
                    if (i7 == 0) {
                    }
                    i9 = i3;
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                    }
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                z5 = z3;
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i9 = i3;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                }
            }
            z4 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            z5 = z3;
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i9 = i3;
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z4 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        z5 = z3;
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i9 = i3;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((38347923 & i9) == 38347922, i9 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    public static abstract class onWarmupCompleted {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStub = 1;
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        public static final onExtraCallback Companion = new onExtraCallback(null);
        private static final onWarmupCompleted onExtraCallback = new C0067onWarmupCompleted();
        private static final onWarmupCompleted IAuthTabCallback = new onExtraCallbackWithResult();
        private static final onWarmupCompleted onNavigationEvent = new onNavigationEvent();
        private static final onWarmupCompleted onWarmupCompleted = t7.onNavigationEvent;

        public abstract boolean onNavigationEvent(boolean z);

        public static final /* synthetic */ onWarmupCompleted IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 97;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            onWarmupCompleted onwarmupcompleted = onNavigationEvent;
            int i5 = i2 + 111;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static final /* synthetic */ onWarmupCompleted onNavigationEvent() {
            onWarmupCompleted onwarmupcompleted;
            int i = 2 % 2;
            int i2 = asInterface;
            int i3 = i2 + 9;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                onwarmupcompleted = IAuthTabCallback;
                int i4 = 1 / 0;
            } else {
                onwarmupcompleted = IAuthTabCallback;
            }
            int i5 = i2 + 115;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return onwarmupcompleted;
            }
            throw null;
        }

        public onWarmupCompleted onExtraCallbackWithResult(@Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i) {
            int i2 = 2 % 2;
            cameraCaptureResultEmptyCameraCaptureResult.onExtraCallbackWithResult(-573016895);
            if (!(!CameraConfigExternalSyntheticLambda0.asBinder())) {
                int i3 = asInterface + 125;
                IAuthTabCallbackDefault = i3 % 128;
                int i4 = i3 % 2;
                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-573016895, i, -1, "im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1.ReflowPolicy.resolve (TdsBottomCtaV1.kt:386)");
                if (i4 != 0) {
                    int i5 = 48 / 0;
                }
            }
            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                int i6 = IAuthTabCallbackDefault + 7;
                asInterface = i6 % 128;
                int i7 = i6 % 2;
                CameraConfigExternalSyntheticLambda0.onTransact();
                if (i7 == 0) {
                    throw null;
                }
            }
            cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallbackDefault();
            return this;
        }

        public static final class onExtraCallback {
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private onExtraCallback() {
            }

            public final onWarmupCompleted onWarmupCompleted() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                onWarmupCompleted onwarmupcompletedOnNavigationEvent = onWarmupCompleted.onNavigationEvent();
                int i4 = onWarmupCompleted + 111;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    return onwarmupcompletedOnNavigationEvent;
                }
                throw null;
            }

            public final onWarmupCompleted onExtraCallbackWithResult() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 35;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    return onWarmupCompleted.IAuthTabCallback();
                }
                onWarmupCompleted.IAuthTabCallback();
                throw null;
            }
        }

        /* renamed from: o.t7ExternalSyntheticLambda0$onWarmupCompleted$onWarmupCompleted, reason: collision with other inner class name */
        public static final class C0067onWarmupCompleted extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            @Override // o.t7ExternalSyntheticLambda0.onWarmupCompleted
            public boolean onNavigationEvent(boolean z) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 13;
                int i3 = i2 % 128;
                onExtraCallback = i3;
                boolean z2 = !(i2 % 2 != 0);
                int i4 = i3 + 57;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return z2;
            }

            C0067onWarmupCompleted() {
            }
        }

        static {
            int i = onExtraCallbackWithResult + 41;
            IAuthTabCallbackStub = i % 128;
            if (i % 2 == 0) {
                int i2 = 25 / 0;
            }
        }

        public static final class onExtraCallbackWithResult extends onWarmupCompleted {
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // o.t7ExternalSyntheticLambda0.onWarmupCompleted
            public boolean onNavigationEvent(boolean z) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback;
                int i3 = i2 + 39;
                onNavigationEvent = i3 % 128;
                boolean z2 = i3 % 2 != 0;
                int i4 = i2 + 117;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return z2;
                }
                throw null;
            }

            onExtraCallbackWithResult() {
            }
        }

        public static final class onNavigationEvent extends onWarmupCompleted {
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // o.t7ExternalSyntheticLambda0.onWarmupCompleted
            public boolean onNavigationEvent(boolean z) {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 121;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 63 / 0;
                }
                return z;
            }

            onNavigationEvent() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult implements onPostbackSuccess {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult CtaButton = new onExtraCallbackWithResult("CtaButton", 0);
        public static final onExtraCallbackWithResult SecondaryButton = new onExtraCallbackWithResult("SecondaryButton", 1);
        public static final onExtraCallbackWithResult TopAccessory = new onExtraCallbackWithResult("TopAccessory", 2);
        public static final onExtraCallbackWithResult BottomAccessory = new onExtraCallbackWithResult("BottomAccessory", 3);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 21;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {CtaButton, SecondaryButton, TopAccessory, BottomAccessory};
            int i5 = i3 + 91;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onExtraCallback;
            int i3 = i2 + 87;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i2 + 87;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 35;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            int i5 = onExtraCallback + 93;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onExtraCallback + 87;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onExtraCallback + 25;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            return onextracallbackwithresultArr;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallbackWithResult + 83;
            onNavigationEvent = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Unit onNavigationEvent() {
        return (Unit) IAuthTabCallback(new Object[0], EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -859354370, 859354372, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
    }

    public static /* synthetic */ Unit onNavigationEvent(initSDK.onNavigationEvent onnavigationevent) {
        return (Unit) IAuthTabCallback(new Object[]{onnavigationevent}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 402128412, -402128411, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
    }

    public final void onWarmupCompleted(@NotNull String str, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable r8lambdaKjloZvf5E1WMQtjWA7WFzt_yVrg r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, @Nullable setCallToAction.onWarmupCompleted onwarmupcompleted, @Nullable setCallToAction.onExtraCallback onextracallback, long j, boolean z, boolean z2, boolean z3, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i, int i2, int i3) {
        IAuthTabCallback(new Object[]{this, str, quirksExternalSyntheticBackport0, r8lambdakjlozvf5e1wmqtjwa7wfzt_yvrg, onwarmupcompleted, onextracallback, Long.valueOf(j), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), function0, cameraCaptureResultEmptyCameraCaptureResult, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 134588509, -134588509, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback());
    }
}
