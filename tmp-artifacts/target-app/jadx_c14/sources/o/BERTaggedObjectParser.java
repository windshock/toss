package o;

import android.content.res.Configuration;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.BERTaggedObjectParser;
import o.DERApplicationSpecific;
import o.access502;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class BERTaggedObjectParser extends onCallBack<DERApplicationSpecific> {
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = onCallBack.onExtraCallback;
    private static final onWarmupCompleted IAuthTabCallback = new onWarmupCompleted();

    public BERTaggedObjectParser() {
        super(IAuthTabCallback);
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult.onWarmupCompleted(R.layout.item_tds_list_row_v1);
        onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.account.transactions.adapter.UserTransactionsAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return BERTaggedObjectParser.IAuthTabCallback((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.account.transactions.adapter.UserTransactionsAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2) {
                return BERTaggedObjectParser.IAuthTabCallback((AppMsgReceiver2) obj, (DERApplicationSpecific) obj2);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(onNavigationEvent.onExtraCallbackWithResult);
        }
        onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
    }

    public static final class onNavigationEvent implements Function1<Object, Boolean> {
        public static final onNavigationEvent onExtraCallbackWithResult = new onNavigationEvent();

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof DERApplicationSpecific);
        }
    }

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallback(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onExtraCallbackWithResult implements getAdService {
        final /* synthetic */ Configuration onWarmupCompleted;

        public onExtraCallbackWithResult(Configuration configuration) {
            this.onWarmupCompleted = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onWarmupCompleted) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static Unit IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.DATE);
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2C);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.ROW1B);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit IAuthTabCallback(o.AppMsgReceiver2 r7, o.DERApplicationSpecific r8) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BERTaggedObjectParser.IAuthTabCallback(o.AppMsgReceiver2, o.DERApplicationSpecific):kotlin.Unit");
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onWarmupCompleted extends DiffUtil.ItemCallback<DERApplicationSpecific> {
        onWarmupCompleted() {
        }

        /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(DERApplicationSpecific dERApplicationSpecific, DERApplicationSpecific dERApplicationSpecific2) {
            Intrinsics.checkNotNullParameter(dERApplicationSpecific, "");
            Intrinsics.checkNotNullParameter(dERApplicationSpecific2, "");
            return dERApplicationSpecific.onWarmupCompleted().onExtraCallback() == dERApplicationSpecific2.onWarmupCompleted().onExtraCallback();
        }

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(DERApplicationSpecific dERApplicationSpecific, DERApplicationSpecific dERApplicationSpecific2) {
            Intrinsics.checkNotNullParameter(dERApplicationSpecific, "");
            Intrinsics.checkNotNullParameter(dERApplicationSpecific2, "");
            return Intrinsics.areEqual(dERApplicationSpecific, dERApplicationSpecific2);
        }
    }
}
