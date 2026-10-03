package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.compat.component.compound.top.TdsTopV2View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.access502;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.account.wait.delegate.DepositWaitHistoryAmountDelegate$;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERGeneralString {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int IAuthTabCallback = exitAllPages.onExtraCallbackWithResult;
    private static final int onExtraCallbackWithResult = R.layout.row_deposit_wait_account_history_amount;
    private final onWarmupCompleted onExtraCallback;
    private final exitAllPages<Object> onNavigationEvent;
    private final Function2<AppMsgReceiver2<onNavigationEvent>, onNavigationEvent, Unit> onWarmupCompleted;

    public interface onWarmupCompleted {
        void setEngagementSignalsCallback();
    }

    public static final class onExtraCallback implements Function1<Object, Boolean> {
        public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onNavigationEvent);
        }
    }

    public DERGeneralString(@NotNull exitAllPages<Object> exitallpages, @NotNull onWarmupCompleted onwarmupcompleted) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        this.onNavigationEvent = exitallpages;
        this.onExtraCallback = onwarmupcompleted;
        this.onWarmupCompleted = new DepositWaitHistoryAmountDelegate$.ExternalSyntheticLambda1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(DERGeneralString dERGeneralString, AppMsgReceiver2 appMsgReceiver2, onNavigationEvent onnavigationevent) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        TdsTopV2View tdsTopV2ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.topV2);
        tdsTopV2ViewFindViewById.setSubtitle1Type(TdsTopV2View.onExtraCallbackWithResult.PARAGRAPH);
        String string = tdsTopV2ViewFindViewById.getContext().getString(R.string.deposit_wait_account_history_list_title);
        Intrinsics.checkNotNullExpressionValue(string, "");
        tdsTopV2ViewFindViewById.setSubtitle1Text(string);
        tdsTopV2ViewFindViewById.setSubtitle1TextSize(TdsTopV2View.onWarmupCompleted.SIZE_13);
        tdsTopV2ViewFindViewById.setSubtitle1TextColor(ContextCompat.getColor(tdsTopV2ViewFindViewById.getContext(), im.toss.tds.R.color.grey_700));
        tdsTopV2ViewFindViewById.setTitleType(TdsTopV2View.IAuthTabCallbackStub.ROLLING_NUMBER);
        tdsTopV2ViewFindViewById.setTitleText(String.valueOf(onnavigationevent.onExtraCallbackWithResult()));
        tdsTopV2ViewFindViewById.setTitleTextSize(TdsTopV2View.onExtraCallback.SIZE_28);
        String string2 = tdsTopV2ViewFindViewById.getContext().getString(im.toss.uikit.R.string.money_suffix_won);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        tdsTopV2ViewFindViewById.setTitleRollingTextSuffix(string2);
        tdsTopV2ViewFindViewById.setTitleTextColor(ContextCompat.getColor(tdsTopV2ViewFindViewById.getContext(), im.toss.tds.R.color.grey_900));
        dERGeneralString.onWarmupCompleted(onnavigationevent.onExtraCallbackWithResult(), (AppMsgReceiver2<onNavigationEvent>) appMsgReceiver2);
        return Unit.INSTANCE;
    }

    private final void onWarmupCompleted(long j, AppMsgReceiver2<onNavigationEvent> appMsgReceiver2) {
        if (j > 0) {
            int i = R.id.listRow;
            TdsListRowV1View tdsListRowV1ViewFindViewById = (TdsListRowV1View) appMsgReceiver2.onWarmupCompleted().get(i);
            if (tdsListRowV1ViewFindViewById == null) {
                tdsListRowV1ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i);
                if (tdsListRowV1ViewFindViewById != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i, tdsListRowV1ViewFindViewById);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i);
                }
            }
            if (tdsListRowV1ViewFindViewById != null) {
                tdsListRowV1ViewFindViewById.setVisibility(0);
            }
            int i2 = R.id.button;
            TdsButtonV1View tdsButtonV1View = (TdsButtonV1View) appMsgReceiver2.onWarmupCompleted().get(i2);
            if (tdsButtonV1View == null) {
                tdsButtonV1View = (TdsButtonV1View) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i2);
                if (tdsButtonV1View != null) {
                    appMsgReceiver2.onWarmupCompleted().put(i2, tdsButtonV1View);
                } else {
                    appMsgReceiver2.onWarmupCompleted().remove(i2);
                }
            }
            if (tdsButtonV1View != null) {
                tdsButtonV1View.setEnabled(true);
                return;
            }
            return;
        }
        int i3 = R.id.listRow;
        TdsListRowV1View tdsListRowV1ViewFindViewById2 = (TdsListRowV1View) appMsgReceiver2.onWarmupCompleted().get(i3);
        if (tdsListRowV1ViewFindViewById2 == null) {
            tdsListRowV1ViewFindViewById2 = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i3);
            if (tdsListRowV1ViewFindViewById2 != null) {
                appMsgReceiver2.onWarmupCompleted().put(i3, tdsListRowV1ViewFindViewById2);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i3);
            }
        }
        if (tdsListRowV1ViewFindViewById2 != null) {
            tdsListRowV1ViewFindViewById2.setVisibility(8);
        }
        int i4 = R.id.button;
        TdsButtonV1View tdsButtonV1View2 = (TdsButtonV1View) appMsgReceiver2.onWarmupCompleted().get(i4);
        if (tdsButtonV1View2 == null) {
            tdsButtonV1View2 = (TdsButtonV1View) ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(i4);
            if (tdsButtonV1View2 != null) {
                appMsgReceiver2.onWarmupCompleted().put(i4, tdsButtonV1View2);
            } else {
                appMsgReceiver2.onWarmupCompleted().remove(i4);
            }
        }
        if (tdsButtonV1View2 != null) {
            tdsButtonV1View2.setEnabled(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(DERGeneralString dERGeneralString, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.onNavigationEvent.findViewById(R.id.topV2).setUpperGap(80);
        viewHolder.onNavigationEvent.findViewById(R.id.button).setOnClickListener(new DepositWaitHistoryAmountDelegate$.ExternalSyntheticLambda2(dERGeneralString));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(DERGeneralString dERGeneralString, View view) {
        dERGeneralString.onExtraCallback.setEngagementSignalsCallback();
    }

    public static final class onNavigationEvent {
        private final long IAuthTabCallback = 1934443608;
        private final long onExtraCallback;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof onNavigationEvent) && this.onExtraCallback == ((onNavigationEvent) obj).onExtraCallback;
        }

        public int hashCode() {
            return Long.hashCode(this.onExtraCallback);
        }

        public String toString() {
            return "DepositWaitHistoryAmount(balance=" + this.onExtraCallback + ")";
        }

        public onNavigationEvent(long j) {
            this.onExtraCallback = j;
        }

        public final long onExtraCallbackWithResult() {
            return this.onExtraCallback;
        }

        public final long onNavigationEvent() {
            return this.IAuthTabCallback;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final access502<onNavigationEvent, Object> IAuthTabCallback() {
        return new access502.onNavigationEvent().onExtraCallbackWithResult(onExtraCallback.onExtraCallbackWithResult).onNavigationEvent(onExtraCallbackWithResult).onNavigationEvent(new DepositWaitHistoryAmountDelegate$.ExternalSyntheticLambda0(this)).onExtraCallback(this.onWarmupCompleted).IAuthTabCallback();
    }
}
