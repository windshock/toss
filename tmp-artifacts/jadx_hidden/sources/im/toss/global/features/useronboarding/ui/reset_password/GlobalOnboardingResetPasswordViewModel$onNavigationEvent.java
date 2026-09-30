package im.toss.global.features.useronboarding.ui.reset_password;

import android.view.ViewConfiguration;
import com.horcrux.svg.SvgPackage;
import im.toss.devtool.action.presentation.DevToolActionListViewModel$onExtraCallback;
import im.toss.devtool.action.quickaction.Hilt_QuickActionBottomSheetActivity$4;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.ExternalOfferReportingDetailsListener;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.bindContext;
import o.findResAndMsg;
import o.nLockFileSegment;
import o.onAlternativeBillingOnlyInformationDialogResponse;

/* loaded from: classes.dex */
final class GlobalOnboardingResetPasswordViewModel$onNavigationEvent extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static int[] onExtraCallback = {1181153622, 1271397893, 249095978, -1317416103, 1482473394, -1774870049, 1557980226, 727096034, 123019249, -754145728, -598644352, 1277064535, -483918792, -1905044798, -1414276885, -2137521570, 657015315, 108364968};
    private static int onWarmupCompleted = 1;
    final /* synthetic */ String $sessionType;
    int label;
    final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalOnboardingResetPasswordViewModel$onNavigationEvent(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, String str, access13800<? super GlobalOnboardingResetPasswordViewModel$onNavigationEvent> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalOnboardingResetPasswordViewModel;
        this.$sessionType = str;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 29;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onWarmupCompleted + 27;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalOnboardingResetPasswordViewModel$onNavigationEvent globalOnboardingResetPasswordViewModel$onNavigationEvent = new GlobalOnboardingResetPasswordViewModel$onNavigationEvent(this.this$0, this.$sessionType, access13800Var);
        int i2 = onWarmupCompleted + 21;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        return globalOnboardingResetPasswordViewModel$onNavigationEvent;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallback = IAuthTabCallback((findResAndMsg) obj, (access13800) obj2);
        int i4 = IAuthTabCallback + 53;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return objIAuthTabCallback;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 55;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            access14300.onWarmupCompleted();
            throw null;
        }
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.onNavigationEvent(obj);
            GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel = this.this$0;
            GlobalOnboardingResetPasswordViewModel.onWarmupCompleted(globalOnboardingResetPasswordViewModel, ExternalOfferReportingDetailsListener.onNavigationEvent((ExternalOfferReportingDetailsListener) GlobalOnboardingResetPasswordViewModel.onNavigationEvent(SvgPackage.21.onExtraCallbackWithResult(), new Object[]{globalOnboardingResetPasswordViewModel}, -1097728054, SvgPackage.21.onExtraCallbackWithResult(), 1097728055, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult()), (Map) null, this.$sessionType, 1, (Object) null));
            nLockFileSegment nlockfilesegmentOnWarmupCompleted = GlobalOnboardingResetPasswordViewModel.onWarmupCompleted(this.this$0);
            onAlternativeBillingOnlyInformationDialogResponse.onNavigationEvent onnavigationevent = new onAlternativeBillingOnlyInformationDialogResponse.onNavigationEvent(this.$sessionType);
            this.label = 1;
            if (nlockfilesegmentOnWarmupCompleted.onExtraCallback(onnavigationevent, this) == objOnWarmupCompleted) {
                return objOnWarmupCompleted;
            }
        } else {
            if (i3 != 1) {
                Object[] objArr = new Object[1];
                a(new int[]{-940518930, -1733599110, -1737202315, 582421556, -1697305190, -1059622189, 1742873241, 1826050316, 1484865582, 907144807, 96951596, 556770661, 511183462, -1610638582, -2071877122, -1852011801, 2067814893, -1814251442, 8077711, 2124664391, -667355623, -2095867596, 181251592, 1531091014}, 47 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            int i4 = onWarmupCompleted + 125;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
        }
        Unit unit = Unit.INSTANCE;
        int i6 = IAuthTabCallback + 65;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return unit;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onExtraCallback;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $10 + 77;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                    i3 >>>= 1;
                } else {
                    iArr3[i3] = Hilt_QuickActionBottomSheetActivity$4.h(iArr2[i3]);
                    i3++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onExtraCallback;
        if (iArr5 != null) {
            int i5 = $11 + 101;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 55;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
                } else {
                    iArr6[i7] = Hilt_QuickActionBottomSheetActivity$4.h(iArr5[i7]);
                    i7++;
                }
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i9 = $10 + 113;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i11 = 0;
            while (i11 < 16) {
                int i12 = $11 + 123;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    int iJ = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ;
                    i11 += 36;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i11];
                    int iJ2 = bindContext.IAuthTabCallbackStubProxy.j(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iJ2;
                    i11++;
                }
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            DevToolActionListViewModel$onExtraCallback.f(simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0);
            int i16 = $10 + 5;
            $11 = i16 % 128;
            int i17 = i16 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }
}
