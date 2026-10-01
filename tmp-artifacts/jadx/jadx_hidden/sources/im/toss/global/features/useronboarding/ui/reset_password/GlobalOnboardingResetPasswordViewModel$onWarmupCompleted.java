package im.toss.global.features.useronboarding.ui.reset_password;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.horcrux.svg.SvgPackage;
import im.toss.security.impl.malware.MalwareDetectActivity$IAuthTabCallback;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.AlternativeBillingOnlyReportingDetailsListener;
import o.ConvertFloatArrayToByteArray;
import o.ExternalOfferReportingDetailsListener;
import o.TimelineExternalSyntheticLambda0;
import o.access13800;
import o.access14300;
import o.access15400;
import o.findResAndMsg;
import o.nLockFileSegment;
import o.onAlternativeBillingOnlyInformationDialogResponse;
import o.tryTriggerOnStart;

/* loaded from: classes.dex */
final class GlobalOnboardingResetPasswordViewModel$onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long onExtraCallback = -5171203134534848382L;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    final /* synthetic */ long $unifiedSessionId;
    Object L$0;
    int label;
    final /* synthetic */ GlobalOnboardingResetPasswordViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalOnboardingResetPasswordViewModel$onWarmupCompleted(GlobalOnboardingResetPasswordViewModel globalOnboardingResetPasswordViewModel, long j, access13800<? super GlobalOnboardingResetPasswordViewModel$onWarmupCompleted> access13800Var) {
        super(2, access13800Var);
        this.this$0 = globalOnboardingResetPasswordViewModel;
        this.$unifiedSessionId = j;
    }

    public final Object IAuthTabCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Object objInvokeSuspend = create(findresandmsg, access13800Var).invokeSuspend(Unit.INSTANCE);
        int i4 = onNavigationEvent + 107;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
        int i = 2 % 2;
        GlobalOnboardingResetPasswordViewModel$onWarmupCompleted globalOnboardingResetPasswordViewModel$onWarmupCompleted = new GlobalOnboardingResetPasswordViewModel$onWarmupCompleted(this.this$0, this.$unifiedSessionId, access13800Var);
        int i2 = onWarmupCompleted + 1;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return globalOnboardingResetPasswordViewModel$onWarmupCompleted;
        }
        throw null;
    }

    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        findResAndMsg findresandmsg = (findResAndMsg) obj;
        access13800<? super Unit> access13800Var = (access13800) obj2;
        if (i2 % 2 != 0) {
            return IAuthTabCallback(findresandmsg, access13800Var);
        }
        IAuthTabCallback(findresandmsg, access13800Var);
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static void a(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        TimelineExternalSyntheticLambda0 timelineExternalSyntheticLambda0 = new TimelineExternalSyntheticLambda0();
        char[] cArrOnWarmupCompleted = TimelineExternalSyntheticLambda0.onWarmupCompleted(onExtraCallback ^ (-7907085296252847348L), cArr, i);
        timelineExternalSyntheticLambda0.onNavigationEvent = 4;
        while (timelineExternalSyntheticLambda0.onNavigationEvent < cArrOnWarmupCompleted.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            timelineExternalSyntheticLambda0.onExtraCallbackWithResult = timelineExternalSyntheticLambda0.onNavigationEvent - 4;
            cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] = MalwareDetectActivity$IAuthTabCallback.onExtraCallback.e(cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent] ^ cArrOnWarmupCompleted[timelineExternalSyntheticLambda0.onNavigationEvent % 4], timelineExternalSyntheticLambda0.onExtraCallbackWithResult, onExtraCallback);
            tryTriggerOnStart.d(timelineExternalSyntheticLambda0, timelineExternalSyntheticLambda0);
        }
        String str = new String(cArrOnWarmupCompleted, 4, cArrOnWarmupCompleted.length - 4);
        int i5 = $10 + 31;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        Object objOnWarmupCompleted = access14300.onWarmupCompleted();
        int i2 = this.label;
        if (i2 != 0) {
            int i3 = onNavigationEvent + 103;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                Object[] objArr = new Object[1];
                a(new char[]{35458, 35553, 10565, 47392, 41642, 44624, 29994, 55276, 42138, 6936, 60267, 42472, 54997, 17702, 56761, 35395, '_', 46321, 4081, 22623, 12866, 59046, 25033, 11974, 28149, 53374, 20481, 64712, 40949, 541, 33362, 49830, 51557, 28119, 62609, 37695, 64354, 24467, 9957, 24884, 5394, 35084, 6439, 14311, 17600, 64379, 19305, 1412, 30339, 9522, 48561}, TextUtils.lastIndexOf("", '0', 0, 0) + 1, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            ResultKt.onNavigationEvent(obj);
            int i4 = onNavigationEvent + 81;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ResultKt.onNavigationEvent(obj);
            ExternalOfferReportingDetailsListener externalOfferReportingDetailsListenerOnExtraCallbackWithResult = ((ExternalOfferReportingDetailsListener) GlobalOnboardingResetPasswordViewModel.onNavigationEvent(SvgPackage.21.onExtraCallbackWithResult(), new Object[]{this.this$0}, -1097728054, SvgPackage.21.onExtraCallbackWithResult(), 1097728055, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())).onExtraCallbackWithResult(this.$unifiedSessionId);
            if (externalOfferReportingDetailsListenerOnExtraCallbackWithResult != null) {
                GlobalOnboardingResetPasswordViewModel.onWarmupCompleted(this.this$0, externalOfferReportingDetailsListenerOnExtraCallbackWithResult);
                String strOnExtraCallbackWithResult = ((ExternalOfferReportingDetailsListener) GlobalOnboardingResetPasswordViewModel.onNavigationEvent(SvgPackage.21.onExtraCallbackWithResult(), new Object[]{this.this$0}, -1097728054, SvgPackage.21.onExtraCallbackWithResult(), 1097728055, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())).onExtraCallbackWithResult();
                if (strOnExtraCallbackWithResult == null) {
                    GlobalOnboardingResetPasswordViewModel.IAuthTabCallback(this.this$0).onWarmupCompleted(new AlternativeBillingOnlyReportingDetailsListener.onWarmupCompleted(((ExternalOfferReportingDetailsListener) GlobalOnboardingResetPasswordViewModel.onNavigationEvent(SvgPackage.21.onExtraCallbackWithResult(), new Object[]{this.this$0}, -1097728054, SvgPackage.21.onExtraCallbackWithResult(), 1097728055, SvgPackage.21.onExtraCallbackWithResult(), SvgPackage.21.onExtraCallbackWithResult())).onWarmupCompleted()));
                } else {
                    GlobalOnboardingResetPasswordViewModel.onWarmupCompleted(this.this$0, strOnExtraCallbackWithResult);
                }
                return Unit.INSTANCE;
            }
            int i6 = onWarmupCompleted + 61;
            onNavigationEvent = i6 % 128;
            int i7 = i6 % 2;
            ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
            Object[] objArr2 = new Object[1];
            a(new char[]{44734, 44793, 38935, 28680, 5109, 26491, 42254, 1990, 32999, 43615, 8800, 30082, 62124, 62564, 5270, 23142, 9330, 1450, 50897, 34875, 5644, 22526, 43252, 65249, 18898, 24835, 39214, 11455, 48029, 45916, 19320, 4742, 60754, 56501, 15798, 17241, 57097, 61174, 61384, 45312, 12579, 14367}, 1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            String strIntern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a(new char[]{26808, 26878, 13661, 33800, 48818, 37757, 6357, 47635, 18149, 1808, 54793, 51267, 13479, 22892, 57490, 59296, 57981, 43252, 13013, 13794, 53292, 64185, 23713, 17193, 36805, 52326, 27936, 37233, 32129, 7695, 49008, 44891, 11097, 29131, 51639, 65245, 6488, 17298, 7118, 3231, 63286, 38225, 9243, 23070, 42734, 59253, 30296, 26721, 38071, 14692, 32906, 34722, 17003, 2287, 53928, 54768, 12302}, ViewConfiguration.getTouchSlop() >> 8, objArr3);
            ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), (Throwable) null, (Map) null, 12, (Object) null);
            nLockFileSegment nlockfilesegmentOnWarmupCompleted = GlobalOnboardingResetPasswordViewModel.onWarmupCompleted(this.this$0);
            onAlternativeBillingOnlyInformationDialogResponse.IAuthTabCallback iAuthTabCallback = onAlternativeBillingOnlyInformationDialogResponse.IAuthTabCallback.IAuthTabCallback;
            this.L$0 = access15400.onNavigationEvent(externalOfferReportingDetailsListenerOnExtraCallbackWithResult);
            this.label = 1;
            if (nlockfilesegmentOnWarmupCompleted.onExtraCallback(iAuthTabCallback, this) == objOnWarmupCompleted) {
                int i8 = onNavigationEvent + 7;
                onWarmupCompleted = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 77 / 0;
                }
                return objOnWarmupCompleted;
            }
        }
        return Unit.INSTANCE;
    }
}
