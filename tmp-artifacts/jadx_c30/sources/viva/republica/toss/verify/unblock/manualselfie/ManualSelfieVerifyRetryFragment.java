package viva.republica.toss.verify.unblock.manualselfie;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import im.toss.base.BaseFragment;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import o.PageRenderReadyListener;
import o.addAllCommandLine;
import o.encodeBigData;
import o.getUrlokhttp;
import o.isEncode;
import o.makeTbsKurProtection;
import o.preFillDefault;
import o.setBodyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$;
import viva.republica.toss.verify.unblock.UnblockSessionActivity;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class ManualSelfieVerifyRetryFragment extends BaseFragment {
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(ManualSelfieVerifyRetryFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/ManualselfieImplFragmentManualSelfieVerifyRetryBinding;", 0)};
    public static final int onNavigationEvent = 8;
    private final PageRenderReadyListener IAuthTabCallback;

    public long getScreenId() {
        return 1293877L;
    }

    public ManualSelfieVerifyRetryFragment() {
        super(R.layout.manualselfie_impl_fragment_manual_selfie_verify_retry);
        this.IAuthTabCallback = preFillDefault.IAuthTabCallback(this, onExtraCallbackWithResult.onWarmupCompleted);
    }

    static final /* synthetic */ class onExtraCallbackWithResult extends FunctionReferenceImpl implements Function1<View, makeTbsKurProtection> {
        public static final onExtraCallbackWithResult onWarmupCompleted = new onExtraCallbackWithResult();

        onExtraCallbackWithResult() {
            super(1, makeTbsKurProtection.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/ManualselfieImplFragmentManualSelfieVerifyRetryBinding;", 0);
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final makeTbsKurProtection invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return makeTbsKurProtection.onExtraCallback(view);
        }
    }

    private final makeTbsKurProtection onWarmupCompleted() {
        return (makeTbsKurProtection) this.IAuthTabCallback.onNavigationEvent(this, onExtraCallback[0]);
    }

    private final isEncode onNavigationEvent() {
        Serializable serializable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("EXTRA_RETRY_STATUS", isEncode.class);
            } else {
                Serializable serializable2 = arguments.getSerializable("EXTRA_RETRY_STATUS");
                if (!(serializable2 instanceof isEncode)) {
                    serializable2 = null;
                }
                serializable = (isEncode) serializable2;
            }
            isEncode isencode = (isEncode) serializable;
            if (isencode != null) {
                return isencode;
            }
        }
        return isEncode.FAKE;
    }

    private final String onExtraCallbackWithResult() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("EXTRA_RETRY_TITLE")) == null) ? BuildConfig.FLAVOR : string;
    }

    private final String onExtraCallback() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("EXTRA_MANUAL_SELFIE_REFERRER", BuildConfig.FLAVOR)) == null) ? BuildConfig.FLAVOR : string;
    }

    private final String IAuthTabCallback() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("EXTRA_MANUAL_SELFIE_SERVICE_REFERRER", BuildConfig.FLAVOR)) == null) ? BuildConfig.FLAVOR : string;
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
        IAuthTabCallbackDefault();
    }

    private final void IAuthTabCallbackDefault() {
        getUrlokhttp geturlokhttpOnExtraCallback = setBodyokhttp.onExtraCallback(this);
        final makeTbsKurProtection maketbskurprotectionOnWarmupCompleted = onWarmupCompleted();
        if (maketbskurprotectionOnWarmupCompleted != null) {
            encodeBigData.IAuthTabCallback.IAuthTabCallback(onExtraCallback(), IAuthTabCallback(), onExtraCallbackWithResult(), onNavigationEvent().toString());
            TdsTopV2View tdsTopV2View = maketbskurprotectionOnWarmupCompleted.onExtraCallbackWithResult;
            tdsTopV2View.setUpperGap(24);
            tdsTopV2View.setSubtitle1Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
            tdsTopV2View.setSubtitle1TextSize(TdsTopV2View.onWarmupCompleted.SIZE_17);
            String string = requireContext().getString(R.string.app_manual_selfie_verify_retry_top);
            Intrinsics.checkNotNullExpressionValue(string, BuildConfig.FLAVOR);
            tdsTopV2View.setSubtitle1Text(string);
            tdsTopV2View.setSubtitle1TextColor(geturlokhttpOnExtraCallback.ICustomTabsCallbackStubProxy());
            tdsTopV2View.setTitleType(TdsTopV2View.IAuthTabCallbackStub.PARAGRAPH);
            tdsTopV2View.setTitleText(onExtraCallbackWithResult());
            tdsTopV2View.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_22);
            tdsTopV2View.setTitleTextColor(geturlokhttpOnExtraCallback.onUnminimized());
            UnblockSessionActivity unblockSessionActivityRequireActivity = requireActivity();
            final UnblockSessionActivity unblockSessionActivity = unblockSessionActivityRequireActivity instanceof UnblockSessionActivity ? unblockSessionActivityRequireActivity : null;
            maketbskurprotectionOnWarmupCompleted.IAuthTabCallback.asInterface().setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.verify.unblock.manualselfie.ManualSelfieVerifyRetryFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ManualSelfieVerifyRetryFragment.onNavigationEvent(maketbskurprotectionOnWarmupCompleted, this, unblockSessionActivity, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(makeTbsKurProtection maketbskurprotection, ManualSelfieVerifyRetryFragment manualSelfieVerifyRetryFragment, UnblockSessionActivity unblockSessionActivity, View view) {
        Object[] objArr = {encodeBigData.IAuthTabCallback, manualSelfieVerifyRetryFragment.onExtraCallback(), manualSelfieVerifyRetryFragment.IAuthTabCallback(), maketbskurprotection.IAuthTabCallback.asInterface().getText().toString()};
        encodeBigData.onNavigationEvent(NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback(), 1159283157, -1159283157, objArr, NotificationMarketingSettingActivity$.ExternalSyntheticLambda29.IAuthTabCallback());
        if (unblockSessionActivity != null) {
            unblockSessionActivity.validateRelationship();
        }
    }

    public Map<String, Object> getScreenParams() {
        return encodeBigData.IAuthTabCallback.onExtraCallbackWithResult(onExtraCallback(), IAuthTabCallback());
    }
}
