package im.toss.features.loan.comparison.funnel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import im.toss.define.MobileCarrier;
import im.toss.features.loan.comparison.funnel.LoanComparisonPhoneVerificationFragment$;
import im.toss.features.loan.ui.R;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ConvertByteArrayToFloatArray;
import o.IEngagementSignalsCallbackDefault;
import o.IEngagementSignalsCallback_Parcel;
import o.PlayerErrorCode;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.access8100;
import o.addExtra;
import o.checkDeviceBrand;
import o.getWrite;
import o.onPageExit;
import o.overrideEventDispatcher;
import o.updateRuntimeShadowNodeReferencesOnCommit;
import o.zzbq;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.network.model.verify.SessionKnownType;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class LoanComparisonPhoneVerificationFragment extends Hilt_LoanComparisonPhoneVerificationFragment {
    private static int asBinder = 1;
    private static int onExtraCallback;
    private Function0<Unit> onExtraCallbackWithResult;
    private int onWarmupCompleted = R.layout.fragment_loan_comparison_funnel_intro;
    private final IEngagementSignalsCallback_Parcel<Intent> onNavigationEvent = onPageExit.onNavigationEvent(this, new LoanComparisonPhoneVerificationFragment$.ExternalSyntheticLambda1(this));

    public static /* synthetic */ Unit onExtraCallback(LoanComparisonPhoneVerificationFragment loanComparisonPhoneVerificationFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(loanComparisonPhoneVerificationFragment);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        int i5 = asBinder + 93;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit onExtraCallback(LoanComparisonPhoneVerificationFragment loanComparisonPhoneVerificationFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 87;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(loanComparisonPhoneVerificationFragment, iEngagementSignalsCallbackDefault);
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        return unitIAuthTabCallback;
    }

    public long getScreenId() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 31;
        onExtraCallback = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 29;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return -1L;
    }

    public int onExtraCallback() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 27;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.onWarmupCompleted;
        int i6 = i2 + 109;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private static final Unit IAuthTabCallback(LoanComparisonPhoneVerificationFragment loanComparisonPhoneVerificationFragment, IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 7;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(iEngagementSignalsCallbackDefault, "");
        loanComparisonPhoneVerificationFragment.onWarmupCompleted(iEngagementSignalsCallbackDefault);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 55;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        int i = 2 % 2;
        int i2 = asBinder + 49;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        postponeEnterTransition();
        super.onViewCreated(view, bundle);
        asBinder();
        int i4 = asBinder + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
            Function0<Unit> function0 = this.onExtraCallbackWithResult;
            if (function0 != null) {
                function0.invoke();
            }
            this.onExtraCallbackWithResult = null;
            int i3 = asBinder + 105;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super/*im.toss.uikit.base.UIKitBaseFragment*/.onResume();
        throw null;
    }

    private final void asBinder() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 29;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        overrideEventDispatcher overrideeventdispatcher = overrideEventDispatcher.onNavigationEvent;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String strName = SessionKnownType.CHANGE_USER_CERTIFICATION_OWN_PHONE_ONLY.name();
        String strOnPostMessage = PlayerErrorCode.onPostMessage();
        PlayerErrorCode playerErrorCode = PlayerErrorCode.onWarmupCompleted;
        String strICustomTabsCallback = addExtra.ICustomTabsCallback(playerErrorCode);
        if (strICustomTabsCallback == null) {
            int i4 = onExtraCallback + 91;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            str = "";
        } else {
            str = strICustomTabsCallback;
        }
        String strOnMessageChannelReady = addExtra.onMessageChannelReady(playerErrorCode);
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        String str2 = (String) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1756374204, iOnNavigationEvent2, iOnNavigationEvent, 1756374207, new Object[0], LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int iOnNavigationEvent3 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        int iOnNavigationEvent4 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        this.onNavigationEvent.onNavigationEvent(overrideEventDispatcher.onExtraCallback(overrideeventdispatcher, contextRequireContext, strName, "SV-FML", (checkDeviceBrand) null, (String) null, true, strOnPostMessage, str2, (MobileCarrier) PlayerErrorCode.IAuthTabCallback(LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), -1620982563, iOnNavigationEvent4, iOnNavigationEvent3, 1620982568, new Object[]{playerErrorCode}, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent()), str, strOnMessageChannelReady, true, true, false, onTransact().ICustomTabsCallback(), "loan_comparison", (String) null, false, (Boolean) null, false, (String) null, (String) null, (String) null, (String) null, false, false, false, (String) null, false, updateRuntimeShadowNodeReferencesOnCommit.TOP, 0L, 0L, false, false, false, false, false, (String) null, (String) null, -604037096, 127, (Object) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        onExtraCallback(r5);
        r5 = im.toss.features.loan.comparison.funnel.LoanComparisonPhoneVerificationFragment.onExtraCallback + 53;
        im.toss.features.loan.comparison.funnel.LoanComparisonPhoneVerificationFragment.asBinder = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r5.onNavigationEvent() == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r5.onNavigationEvent() == (-1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        IAuthTabCallbackStub();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = asBinder + 107;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 49 / 0;
        }
    }

    private final void onExtraCallback(IEngagementSignalsCallbackDefault iEngagementSignalsCallbackDefault) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 11;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(zzbq.onNavigationEvent(iEngagementSignalsCallbackDefault.onExtraCallbackWithResult(), "extra_toast_message", ""));
        extraCallback();
        int i4 = onExtraCallback + 59;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        ConvertByteArrayToFloatArray.onWarmupCompleted("loan_comparison_verification_complete", false, (String) null, (List) null, access8100.onNavigationEvent(getWrite.IAuthTabCallback("category", "loan_comparison_examine")), (Function1) null, 46, (Object) null);
        asInterface().onNavigationEvent(Long.valueOf(onTransact().IAuthTabCallback()));
        asInterface().onExtraCallback("");
        if (getLifecycle().IAuthTabCallback().isAtLeast(TextFieldKeyInputExternalSyntheticLambda9.onExtraCallback.RESUMED)) {
            int i2 = asBinder + 81;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallback(true);
            int i4 = onExtraCallback + 121;
            asBinder = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.onExtraCallbackWithResult = new LoanComparisonPhoneVerificationFragment$.ExternalSyntheticLambda0(this);
    }

    private static final Unit onExtraCallbackWithResult(LoanComparisonPhoneVerificationFragment loanComparisonPhoneVerificationFragment) {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        loanComparisonPhoneVerificationFragment.onExtraCallback(true);
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 1;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }
}
