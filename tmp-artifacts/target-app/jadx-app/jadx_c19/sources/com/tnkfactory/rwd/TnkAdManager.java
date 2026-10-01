package com.tnkfactory.rwd;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.common.log.ApiLog;
import com.tnkfactory.ad.TnkError;
import com.tnkfactory.ad.basic.TnkLoadingDialog;
import com.tnkfactory.ad.off.AdEventHandler;
import com.tnkfactory.ad.off.data.AdActionInfoVo;
import com.tnkfactory.ad.off.data.AdListVo;
import com.tnkfactory.rwd.CustomDetailDialogFragment;
import com.tnkfactory.rwd.TnkAdManager$;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.maybeUpdateAnimatable;
import o.putChannelInfo;
import o.setRandomHost;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TnkAdManager {
    public static final TnkAdManager INSTANCE = new TnkAdManager();

    public final void initialize() {
    }

    private TnkAdManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetailActivity$lambda$0(boolean z, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    public final void showAdDetailActivity(@NotNull FragmentActivity fragmentActivity, long j, @NotNull String str, long j2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        getAdItem(fragmentActivity, j, str, j2, new TnkAdManager$.ExternalSyntheticLambda5(j2, fragmentActivity, function2), new TnkAdManager$.ExternalSyntheticLambda6(function2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetailActivity$lambda$1(long j, FragmentActivity fragmentActivity, Function2 function2, AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        if (j == 5) {
            INSTANCE.reqJoinInfoCps(fragmentActivity, adListVo, function2);
        } else if (Intrinsics.areEqual(adListVo.getDetailYn(), "N")) {
            INSTANCE.reqJoinAd(fragmentActivity, adListVo, function2);
        } else {
            CustomDetailActivity.Companion.start(fragmentActivity, adListVo);
            function2.invoke(Boolean.TRUE, new TnkError(1, ApiLog.API_LOG_STATE_SUCCESS, null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetailActivity$lambda$2(Function2 function2, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        function2.invoke(Boolean.FALSE, tnkError);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetail$lambda$0(boolean z, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    public final void showAdDetail(@NotNull FragmentActivity fragmentActivity, long j, @NotNull String str, long j2, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        getAdItem(fragmentActivity, j, str, j2, new TnkAdManager$.ExternalSyntheticLambda2(j2, fragmentActivity, function2), new TnkAdManager$.ExternalSyntheticLambda3(function2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetail$lambda$1(long j, FragmentActivity fragmentActivity, Function2 function2, AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        if (j == 5) {
            INSTANCE.reqJoinInfoCps(fragmentActivity, adListVo, function2);
        } else if (Intrinsics.areEqual(adListVo.getDetailYn(), "N")) {
            INSTANCE.reqJoinAd(fragmentActivity, adListVo, function2);
        } else if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || fragmentActivity.getSupportFragmentManager().ICustomTabsService()) {
            function2.invoke(Boolean.TRUE, new TnkError(99, "activity is not in a state to show dialog", null, 4, null));
        } else {
            CustomDetailDialogFragment.Companion.newInstance$default(CustomDetailDialogFragment.Companion, adListVo, 0, 2, (Object) null).show(fragmentActivity.getSupportFragmentManager(), "CustomDetailDialogFragment");
            function2.invoke(Boolean.TRUE, new TnkError(1, ApiLog.API_LOG_STATE_SUCCESS, null, 4, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAdDetail$lambda$2(Function2 function2, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        function2.invoke(Boolean.FALSE, tnkError);
        return Unit.INSTANCE;
    }

    public final void showHelpCenter(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed() || fragmentActivity.getSupportFragmentManager().ICustomTabsService()) {
            return;
        }
        TnkMyMenuDialogFragment.Companion.newInstance().show(fragmentActivity.getSupportFragmentManager(), "TnkMyMenuDialogFragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reqJoinAd$default(TnkAdManager tnkAdManager, FragmentActivity fragmentActivity, AdListVo adListVo, Function2 function2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function2 = new TnkAdManager$.ExternalSyntheticLambda0();
        }
        tnkAdManager.reqJoinAd(fragmentActivity, adListVo, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqJoinAd$lambda$0(boolean z, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    public final void reqJoinAd(@NotNull FragmentActivity fragmentActivity, @NotNull AdListVo adListVo, @NotNull Function2<? super Boolean, ? super TnkError, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        Intrinsics.checkNotNullParameter(function2, "");
        new AdEventHandler(fragmentActivity).onClickConfirm(adListVo, false, new reqJoinAd.2(fragmentActivity, function2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAdItem$lambda$0(AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAdItem$lambda$1(TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    public final void getAdItem(@NotNull FragmentActivity fragmentActivity, long j, @NotNull String str, long j2, @NotNull Function1<? super AdListVo, Unit> function1, @NotNull Function1<? super TnkError, Unit> function12) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        TnkLoadingDialog tnkLoadingDialog = new TnkLoadingDialog(fragmentActivity, com.tnkfactory.ad.R.style.TnkRwdLoadingDialog);
        tnkLoadingDialog.show();
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new getAdItem.3(str, j, j2, fragmentActivity, tnkLoadingDialog, function1, function12, (access13800) null), 2, (Object) null);
    }

    public final CustomDetailDialogFragment getDetailDialog(@NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(adListVo, "");
        if (adListVo.getActionId() == 5 || Intrinsics.areEqual(adListVo.getDetailYn(), "N")) {
            return null;
        }
        return CustomDetailDialogFragment.Companion.newInstance$default(CustomDetailDialogFragment.Companion, adListVo, 0, 2, (Object) null);
    }

    public final void moveToOutLink(@NotNull FragmentActivity fragmentActivity, @NotNull AdListVo adListVo) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(adListVo, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : adListVo.getCampaignItems()) {
            if (!((AdActionInfoVo) obj).getPayYn()) {
                objectRef.element = obj;
                maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new moveToOutLink.1(adListVo, objectRef, fragmentActivity, (access13800) null), 2, (Object) null);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void reqJoinInfoCps$default(TnkAdManager tnkAdManager, FragmentActivity fragmentActivity, AdListVo adListVo, Function2 function2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            function2 = new TnkAdManager$.ExternalSyntheticLambda4();
        }
        tnkAdManager.reqJoinInfoCps(fragmentActivity, adListVo, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reqJoinInfoCps$lambda$0(boolean z, TnkError tnkError) {
        Intrinsics.checkNotNullParameter(tnkError, "");
        return Unit.INSTANCE;
    }

    private final void reqJoinInfoCps(FragmentActivity fragmentActivity, AdListVo adListVo, Function2<? super Boolean, ? super TnkError, Unit> function2) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (Object obj : adListVo.getCampaignItems()) {
            if (!((AdActionInfoVo) obj).getPayYn()) {
                objectRef.element = obj;
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = ((AdActionInfoVo) objectRef.element).getImg_id();
                try {
                    maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(fragmentActivity), putChannelInfo.IAuthTabCallback(), (setRandomHost) null, new reqJoinInfoCps.2(adListVo, intRef, objectRef, fragmentActivity, function2, (access13800) null), 2, (Object) null);
                    return;
                } catch (Exception unused) {
                    function2.invoke(Boolean.FALSE, new TnkError(99, "광고 참여 중 오류가 발생했습니다.", null, 4, null));
                    return;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
