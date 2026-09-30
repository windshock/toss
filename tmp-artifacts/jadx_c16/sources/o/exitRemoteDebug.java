package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import im.toss.features.home.presentation.regular_consumption_add.viewholder.TransactionViewHolder$;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.UtilsKtExternalSyntheticLambda17;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class exitRemoteDebug extends IIpcChannelStubProxy<RDConstant, RemoteDebugCommand> {
    private static int onActivityResized = 1;
    private static int writeTypedObject;
    private final onWarmupCompleted extraCallback;

    public static /* synthetic */ void onExtraCallbackWithResult(exitRemoteDebug exitremotedebug, RemoteDebugCommand remoteDebugCommand, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(exitremotedebug, remoteDebugCommand, view);
        if (i3 == 0) {
            throw null;
        }
        int i4 = writeTypedObject + 121;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    public /* bridge */ /* synthetic */ void onWarmupCompleted(Object obj) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onActivityResized + 3;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted((RemoteDebugCommand) obj);
        int i4 = writeTypedObject + 55;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void onNavigationEvent(exitRemoteDebug exitremotedebug, RemoteDebugCommand remoteDebugCommand, View view) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 3;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
        exitremotedebug.extraCallback.onWarmupCompleted(remoteDebugCommand);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onWarmupCompleted(@NotNull RemoteDebugCommand remoteDebugCommand) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(remoteDebugCommand, "");
        super.onWarmupCompleted(remoteDebugCommand);
        TdsListRowV1View tdsListRowV1ViewOnNavigationEvent = onWarmupCompleted().onNavigationEvent();
        Intrinsics.checkNotNull(tdsListRowV1ViewOnNavigationEvent);
        onNavigationEvent(tdsListRowV1ViewOnNavigationEvent, (handleAggregatedAuth) CollectionsKt.firstOrNull((List) RemoteDebugCommand.onExtraCallback(2011087696, new Object[]{remoteDebugCommand}, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), -2011087696, UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult(), UtilsKtExternalSyntheticLambda17.onBackPressed.onExtraCallbackWithResult())));
        tdsListRowV1ViewOnNavigationEvent.setCenterText1(remoteDebugCommand.IAuthTabCallbackStubProxy());
        tdsListRowV1ViewOnNavigationEvent.setCenterText2(remoteDebugCommand.asBinder());
        tdsListRowV1ViewOnNavigationEvent.setRightCheckBoxChecked(remoteDebugCommand.IAuthTabCallback_Parcel());
        tdsListRowV1ViewOnNavigationEvent.setOnClickListener(new TransactionViewHolder$.ExternalSyntheticLambda0(this, remoteDebugCommand));
        int i2 = writeTypedObject + 35;
        onActivityResized = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public exitRemoteDebug(@NotNull ViewGroup viewGroup, @NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "");
        RDConstant rDConstantOnExtraCallbackWithResult = RDConstant.onExtraCallbackWithResult(layoutInflaterFrom, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(rDConstantOnExtraCallbackWithResult, "");
        super(rDConstantOnExtraCallbackWithResult);
        this.extraCallback = onwarmupcompleted;
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = onWarmupCompleted().onNavigationEvent().prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setOnCheckedChangeListener((TdsCheckBoxV2View.onExtraCallback) null);
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            int i = onActivityResized + 13;
            writeTypedObject = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        }
        int i4 = writeTypedObject + 11;
        onActivityResized = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onNavigationEvent(TdsListRowV1View tdsListRowV1View, handleAggregatedAuth handleaggregatedauth) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        JsApiInvokeResultModel jsApiInvokeResultModelOnExtraCallback = handleaggregatedauth != null ? handleaggregatedauth.onExtraCallback() : null;
        if (jsApiInvokeResultModelOnExtraCallback == null) {
            int i3 = onActivityResized + 63;
            writeTypedObject = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 87 / 0;
            }
            i = -1;
        } else {
            i = onExtraCallbackWithResult.IAuthTabCallback[jsApiInvokeResultModelOnExtraCallback.ordinal()];
        }
        if (i != -1) {
            if (i == 1) {
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.IMAGE);
                RemoteCallResult.onExtraCallbackWithResult(tdsListRowV1View, handleaggregatedauth.onNavigationEvent(tdsListRowV1View.getContext()), false);
                return;
            }
            int i5 = onActivityResized + 73;
            writeTypedObject = i5 % 128;
            if (i5 % 2 == 0 ? i == 2 : i == 2) {
                tdsListRowV1View.setLeftType(TdsListRowV1View.asInterface.LOTTIE);
                tdsListRowV1View.setLeftLottieUrl(handleaggregatedauth.onNavigationEvent(tdsListRowV1View.getContext()), handleaggregatedauth.onNavigationEvent());
                return;
            } else if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        TdsImageView tdsImageViewMayLaunchUrl = tdsListRowV1View.mayLaunchUrl();
        if (tdsImageViewMayLaunchUrl != null) {
            int i6 = writeTypedObject + 3;
            onActivityResized = i6 % 128;
            if (i6 % 2 == 0) {
                tdsImageViewMayLaunchUrl.setVisibility(2);
            } else {
                tdsImageViewMayLaunchUrl.setVisibility(4);
            }
        }
        LottieAnimationView lottieAnimationViewNewAuthTabSession = tdsListRowV1View.newAuthTabSession();
        if (lottieAnimationViewNewAuthTabSession != null) {
            lottieAnimationViewNewAuthTabSession.setVisibility(4);
        }
    }
}
