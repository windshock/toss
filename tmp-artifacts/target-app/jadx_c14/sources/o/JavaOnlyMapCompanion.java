package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.compound.listfooter.TdsListFooterV1View;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.widget.textView.top.TdsTopV1View;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.JavaOnlyMapCompanion;
import o.RecomposerawaitIdle2;
import o.access502;
import o.toHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.MyAccountInfo;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaOnlyMapCompanion extends onCallBack<Object> {
    private MyAccountInfo IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private onWarmupCompleted asBinder;
    public static final IAuthTabCallback Companion = new IAuthTabCallback(null);
    public static final int onNavigationEvent = 8;
    private static final onExtraCallbackWithResult IAuthTabCallback = new onExtraCallbackWithResult();

    public static final class IAuthTabCallbackDefault {
    }

    public static final class asInterface {
    }

    public static final class onExtraCallback {
    }

    public static final class onNavigationEvent {
    }

    public interface onWarmupCompleted {
        void IAuthTabCallback();

        void onExtraCallback();

        void onNavigationEvent();

        void onWarmupCompleted(@NotNull MyAccountInfo myAccountInfo);
    }

    public static final class ICustomTabsCallback implements Function1<Object, Boolean> {
        public static final ICustomTabsCallback onWarmupCompleted = new ICustomTabsCallback();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof asInterface);
        }
    }

    public static final class extraCallbackWithResult implements Function1<Object, Boolean> {
        public static final extraCallbackWithResult onExtraCallbackWithResult = new extraCallbackWithResult();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onExtraCallback);
        }
    }

    public static final class onActivityLayout implements Function1<Object, Boolean> {
        public static final onActivityLayout IAuthTabCallback = new onActivityLayout();

        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackDefault);
        }
    }

    public static final class onActivityResized implements Function1<Object, Boolean> {
        public static final onActivityResized onExtraCallbackWithResult = new onActivityResized();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof onNavigationEvent);
        }
    }

    public static final class readTypedObject implements Function1<Object, Boolean> {
        public static final readTypedObject onExtraCallback = new readTypedObject();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof toHashMap);
        }
    }

    public static final class writeTypedObject implements Function1<Object, Boolean> {
        public static final writeTypedObject onExtraCallback = new writeTypedObject();

        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof IAuthTabCallbackStub);
        }
    }

    public static final class extraCallback implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public extraCallback(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallbackStubProxy implements getAdService {
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public IAuthTabCallbackStubProxy(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class IAuthTabCallback_Parcel implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public IAuthTabCallback_Parcel(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access000 implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public access000(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class access100 implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public access100(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class asBinder implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public asBinder(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class getInterfaceDescriptor implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public getInterfaceDescriptor(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public static final class onTransact implements getAdService {
        final /* synthetic */ Configuration IAuthTabCallback;

        public onTransact(Configuration configuration) {
            this.IAuthTabCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.IAuthTabCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public JavaOnlyMapCompanion(@Nullable MyAccountInfo myAccountInfo) {
        super(IAuthTabCallback);
        access502.onExtraCallbackWithResult onextracallbackwithresult = new access502.onExtraCallbackWithResult();
        int i = R.layout.item_tds_list_row_v1;
        onextracallbackwithresult.onWarmupCompleted(i);
        onextracallbackwithresult.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda0
            public final Object invoke(Object obj) {
                return JavaOnlyMapCompanion.onNavigationEvent((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult.IAuthTabCallback(new getBacktraceNote() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda1
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return JavaOnlyMapCompanion.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (toHashMap) obj2, (List) obj3);
            }
        });
        if (onextracallbackwithresult.onWarmupCompleted() == null && onextracallbackwithresult.onNavigationEvent() == null) {
            onextracallbackwithresult.onExtraCallback(readTypedObject.onExtraCallback);
        }
        onNavigationEvent(onextracallbackwithresult.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult2 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult2.onWarmupCompleted(i);
        onextracallbackwithresult2.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda2
            public final Object invoke(Object obj) {
                return JavaOnlyMapCompanion.IAuthTabCallback((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult2.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda3
            public final Object invoke(Object obj, Object obj2) {
                return JavaOnlyMapCompanion.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (JavaOnlyMapCompanion.asInterface) obj2);
            }
        });
        if (onextracallbackwithresult2.onWarmupCompleted() == null && onextracallbackwithresult2.onNavigationEvent() == null) {
            onextracallbackwithresult2.onExtraCallback(ICustomTabsCallback.onWarmupCompleted);
        }
        onNavigationEvent(onextracallbackwithresult2.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult3 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult3.onWarmupCompleted(R.layout.item_tds_top_v1);
        onextracallbackwithresult3.onExtraCallbackWithResult(new Function1() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda4
            public final Object invoke(Object obj) {
                return JavaOnlyMapCompanion.onExtraCallbackWithResult((RecyclerView.ViewHolder) obj);
            }
        });
        onextracallbackwithresult3.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda5
            public final Object invoke(Object obj, Object obj2) {
                return JavaOnlyMapCompanion.onNavigationEvent((AppMsgReceiver2) obj, (JavaOnlyMapCompanion.IAuthTabCallbackStub) obj2);
            }
        });
        if (onextracallbackwithresult3.onWarmupCompleted() == null && onextracallbackwithresult3.onNavigationEvent() == null) {
            onextracallbackwithresult3.onExtraCallback(writeTypedObject.onExtraCallback);
        }
        onNavigationEvent(onextracallbackwithresult3.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult4 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult4.onWarmupCompleted(i);
        onextracallbackwithresult4.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda6
            public final Object invoke(Object obj, Object obj2) {
                return JavaOnlyMapCompanion.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (JavaOnlyMapCompanion.onExtraCallback) obj2);
            }
        });
        if (onextracallbackwithresult4.onWarmupCompleted() == null && onextracallbackwithresult4.onNavigationEvent() == null) {
            onextracallbackwithresult4.onExtraCallback(extraCallbackWithResult.onExtraCallbackWithResult);
        }
        onNavigationEvent(onextracallbackwithresult4.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult5 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult5.onWarmupCompleted(R.layout.row_transfer_withdraw_sheet_expand_item);
        onextracallbackwithresult5.IAuthTabCallback(new Function2() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda7
            public final Object invoke(Object obj, Object obj2) {
                return JavaOnlyMapCompanion.onExtraCallback(this.f$0, (AppMsgReceiver2) obj, (JavaOnlyMapCompanion.IAuthTabCallbackDefault) obj2);
            }
        });
        if (onextracallbackwithresult5.onWarmupCompleted() == null && onextracallbackwithresult5.onNavigationEvent() == null) {
            onextracallbackwithresult5.onExtraCallback(onActivityLayout.IAuthTabCallback);
        }
        onNavigationEvent(onextracallbackwithresult5.onExtraCallbackWithResult());
        access502.onExtraCallbackWithResult onextracallbackwithresult6 = new access502.onExtraCallbackWithResult();
        onextracallbackwithresult6.onWarmupCompleted(new Function1() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda8
            public final Object invoke(Object obj) {
                return JavaOnlyMapCompanion.onWarmupCompleted((Context) obj);
            }
        });
        if (onextracallbackwithresult6.onWarmupCompleted() == null && onextracallbackwithresult6.onNavigationEvent() == null) {
            onextracallbackwithresult6.onExtraCallback(onActivityResized.onExtraCallbackWithResult);
        }
        onNavigationEvent(onextracallbackwithresult6.onExtraCallbackWithResult());
        onExtraCallback(myAccountInfo);
    }

    public final void onExtraCallbackWithResult(@Nullable onWarmupCompleted onwarmupcompleted) {
        this.asBinder = onwarmupcompleted;
    }

    public final void onExtraCallback(@Nullable MyAccountInfo myAccountInfo) {
        int i;
        onWarmupCompleted onwarmupcompleted;
        List listOnExtraCallbackWithResult = onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(listOnExtraCallbackWithResult, "");
        Iterator it = listOnExtraCallbackWithResult.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next(), this.IAuthTabCallbackDefault)) {
                break;
            } else {
                i3++;
            }
        }
        List listOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
        Intrinsics.checkNotNullExpressionValue(listOnExtraCallbackWithResult2, "");
        Iterator it2 = listOnExtraCallbackWithResult2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (Intrinsics.areEqual(it2.next(), myAccountInfo)) {
                i = i2;
                break;
            }
            i2++;
        }
        this.IAuthTabCallbackDefault = myAccountInfo;
        notifyItemChanged(i3, "unselect");
        notifyItemChanged(i, "select");
        if (myAccountInfo == null || (onwarmupcompleted = this.asBinder) == null) {
            return;
        }
        onwarmupcompleted.onWarmupCompleted(myAccountInfo);
    }

    public final boolean onNavigationEvent() {
        return this.IAuthTabCallbackStub;
    }

    public static Unit onNavigationEvent(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 42), varyMatches.IAuthTabCallback(tdsListRowV1View2, 42));
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW2A_ANIMATE_TEXT);
        tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
        tdsListRowV1View2.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
        TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View2.prefetchWithMultipleUrls();
        if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
            tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setImportantForAccessibility(2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Unit onWarmupCompleted(final o.JavaOnlyMapCompanion r41, o.AppMsgReceiver2 r42, o.toHashMap r43, java.util.List r44) {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.JavaOnlyMapCompanion.onWarmupCompleted(o.JavaOnlyMapCompanion, o.AppMsgReceiver2, o.toHashMap, java.util.List):kotlin.Unit");
    }

    public static void onWarmupCompleted(JavaOnlyMapCompanion javaOnlyMapCompanion, MyAccountInfo myAccountInfo, View view) {
        javaOnlyMapCompanion.onExtraCallback(myAccountInfo);
    }

    public static Unit onWarmupCompleted(boolean z, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback("android.widget.RadioButton");
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.onExtraCallback(true);
        }
        if (suspendAnimationKtExternalSyntheticLambda4 != null) {
            suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback(z);
        }
        return Unit.INSTANCE;
    }

    public static Unit IAuthTabCallback(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        return Unit.INSTANCE;
    }

    public static Unit onWarmupCompleted(final JavaOnlyMapCompanion javaOnlyMapCompanion, AppMsgReceiver2 appMsgReceiver2, asInterface asinterface) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(Integer.valueOf(im.toss.core.R.drawable.icn_add));
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, Integer.valueOf(new getUrlokhttp(new getInterfaceDescriptor(configuration)).extraCallback()), 15, (DefaultConstructorMarker) null)}));
        tdsListRowV1View2.setCenterText1(tdsListRowV1View2.getContext().getString(R.string.transfer_withdraw_account_list_bottomsheet_row_input));
        tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda13
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JavaOnlyMapCompanion.onExtraCallback(this.f$0, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static void onExtraCallback(JavaOnlyMapCompanion javaOnlyMapCompanion, View view) {
        onWarmupCompleted onwarmupcompleted = javaOnlyMapCompanion.asBinder;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onExtraCallback();
        }
    }

    public static Unit onExtraCallbackWithResult(RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsTopV1View tdsTopV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsTopV1View, "");
        tdsTopV1View.setUpperType(TdsTopV1View.onExtraCallbackWithResult.TOP5);
        return Unit.INSTANCE;
    }

    public static Unit onNavigationEvent(AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackStub iAuthTabCallbackStub) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        TdsTopV1View tdsTopV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsTopV1View, "");
        tdsTopV1View.setUpperText(iAuthTabCallbackStub.IAuthTabCallback());
        return Unit.INSTANCE;
    }

    public static Unit onWarmupCompleted(final JavaOnlyMapCompanion javaOnlyMapCompanion, AppMsgReceiver2 appMsgReceiver2, onExtraCallback onextracallback) {
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1B);
        tdsListRowV1View2.setCenterText1(tdsListRowV1View2.getContext().getString(R.string.transfer_withdraw_account_list_bottomsheet_row_add_account));
        tdsListRowV1View2.setPadding(varyMatches.IAuthTabCallback(tdsListRowV1View2, 24), varyMatches.IAuthTabCallback(tdsListRowV1View2, 24), varyMatches.IAuthTabCallback(tdsListRowV1View2, 24), varyMatches.IAuthTabCallback(tdsListRowV1View2, 24));
        tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
        tdsListRowV1View2.setLeftImageSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 40), varyMatches.IAuthTabCallback(tdsListRowV1View2, 40));
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(tdsListRowV1View2.getContext()).onExtraCallback(Integer.valueOf(im.toss.core.R.drawable.icn_add));
        Context context = tdsListRowV1View2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        tdsListRowV1View2.setLeftImage(RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new PluginInfo(0.0f, 0.0f, 0.0f, (Integer) null, 0, Integer.valueOf(new getUrlokhttp(new IAuthTabCallback_Parcel(configuration)).extraCallback()), 15, (DefaultConstructorMarker) null)}));
        tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JavaOnlyMapCompanion.onWarmupCompleted(this.f$0, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static void onWarmupCompleted(JavaOnlyMapCompanion javaOnlyMapCompanion, View view) {
        onWarmupCompleted onwarmupcompleted = javaOnlyMapCompanion.asBinder;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onNavigationEvent();
        }
    }

    public static Unit onExtraCallback(final JavaOnlyMapCompanion javaOnlyMapCompanion, AppMsgReceiver2 appMsgReceiver2, IAuthTabCallbackDefault iAuthTabCallbackDefault) {
        Context context;
        int i;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        TdsListFooterV1View tdsListFooterV1ViewFindViewById = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent.findViewById(R.id.footer);
        if (tdsListFooterV1ViewFindViewById != null) {
            Context context2 = tdsListFooterV1ViewFindViewById.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            Configuration configuration = context2.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListFooterV1ViewFindViewById.setTitleColor(new getUrlokhttp(new access100(configuration)).onPostMessage());
            if (javaOnlyMapCompanion.IAuthTabCallbackStub) {
                context = tdsListFooterV1ViewFindViewById.getContext();
                i = R.string.app_transfer_withdraw_bottom_collapsed_cta;
            } else {
                context = tdsListFooterV1ViewFindViewById.getContext();
                i = R.string.app_transfer_withdraw_bottom_expanded_cta;
            }
            tdsListFooterV1ViewFindViewById.setTitle(context.getString(i));
            tdsListFooterV1ViewFindViewById.setIcon(javaOnlyMapCompanion.IAuthTabCallbackStub ? im.toss.tds.R.drawable.icon_arrow_up_mono : im.toss.tds.R.drawable.icon_arrow_down_mono);
            tdsListFooterV1ViewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.send.common.WithdrawAccountListAdapter$$ExternalSyntheticLambda10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JavaOnlyMapCompanion.IAuthTabCallback(this.f$0, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static void IAuthTabCallback(JavaOnlyMapCompanion javaOnlyMapCompanion, View view) {
        javaOnlyMapCompanion.IAuthTabCallbackStub = !javaOnlyMapCompanion.IAuthTabCallbackStub;
        onWarmupCompleted onwarmupcompleted = javaOnlyMapCompanion.asBinder;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.IAuthTabCallback();
        }
    }

    public static View onWarmupCompleted(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, varyMatches.IAuthTabCallback(view, 16)));
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        Resources resources = context2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        view.setBackgroundColor(new getDEFAULT_CONNECTION_SPECSokhttp(new extraCallback(configuration)).onExtraCallbackWithResult());
        return view;
    }

    public static final class IAuthTabCallbackStub {
        private final String onExtraCallbackWithResult;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IAuthTabCallbackStub) && Intrinsics.areEqual(this.onExtraCallbackWithResult, ((IAuthTabCallbackStub) obj).onExtraCallbackWithResult);
        }

        public int hashCode() {
            return this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            return "Header(title=" + this.onExtraCallbackWithResult + ")";
        }

        public IAuthTabCallbackStub(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = str;
        }

        public final String IAuthTabCallback() {
            return this.onExtraCallbackWithResult;
        }
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public static final class onExtraCallbackWithResult extends DiffUtil.ItemCallback<Object> {
        onExtraCallbackWithResult() {
        }

        public boolean areItemsTheSame(Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof MyAccountInfo) && (obj2 instanceof MyAccountInfo)) {
                hasCurrentActivity hascurrentactivity = hasCurrentActivity.IAuthTabCallback;
                MyAccountInfo myAccountInfo = (MyAccountInfo) obj;
                int iIAuthTabCallbackStub = myAccountInfo.IAuthTabCallbackStub();
                MyAccountInfo myAccountInfo2 = (MyAccountInfo) obj2;
                return hascurrentactivity.onExtraCallbackWithResult(String.valueOf(iIAuthTabCallbackStub), myAccountInfo.onExtraCallback(), String.valueOf(myAccountInfo2.IAuthTabCallbackStub()), myAccountInfo2.onExtraCallback());
            }
            if (!(obj instanceof toHashMap) || !(obj2 instanceof toHashMap)) {
                return obj.getClass() == obj2.getClass();
            }
            hasCurrentActivity hascurrentactivity2 = hasCurrentActivity.IAuthTabCallback;
            toHashMap tohashmap = (toHashMap) obj;
            int iIAuthTabCallbackStub2 = tohashmap.IAuthTabCallback().IAuthTabCallbackStub();
            toHashMap tohashmap2 = (toHashMap) obj2;
            return hascurrentactivity2.onExtraCallbackWithResult(String.valueOf(iIAuthTabCallbackStub2), tohashmap.IAuthTabCallback().onExtraCallback(), String.valueOf(tohashmap2.IAuthTabCallback().IAuthTabCallbackStub()), tohashmap2.IAuthTabCallback().onExtraCallback());
        }

        public boolean areContentsTheSame(Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof MyAccountInfo) && (obj2 instanceof MyAccountInfo)) {
                MyAccountInfo myAccountInfo = (MyAccountInfo) obj;
                MyAccountInfo myAccountInfo2 = (MyAccountInfo) obj2;
                return hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(myAccountInfo.IAuthTabCallbackStub()), myAccountInfo.onExtraCallback(), String.valueOf(myAccountInfo2.IAuthTabCallbackStub()), myAccountInfo2.onExtraCallback()) && Intrinsics.areEqual(MyAccountInfo.onNavigationEvent(myAccountInfo, false, 0L, null, 7, null), MyAccountInfo.onNavigationEvent(myAccountInfo2, false, 0L, null, 7, null));
            }
            if (!(obj instanceof toHashMap) || !(obj2 instanceof toHashMap)) {
                return obj.getClass() == obj2.getClass();
            }
            toHashMap tohashmap = (toHashMap) obj;
            toHashMap tohashmap2 = (toHashMap) obj2;
            return hasCurrentActivity.IAuthTabCallback.onExtraCallbackWithResult(String.valueOf(tohashmap.IAuthTabCallback().IAuthTabCallbackStub()), tohashmap.IAuthTabCallback().onExtraCallback(), String.valueOf(tohashmap2.IAuthTabCallback().IAuthTabCallbackStub()), tohashmap2.IAuthTabCallback().onExtraCallback()) && Intrinsics.areEqual(tohashmap.onNavigationEvent().onExtraCallback(), tohashmap2.onNavigationEvent().onExtraCallback());
        }

        public Object getChangePayload(Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof MyAccountInfo) && (obj2 instanceof MyAccountInfo)) {
                return obj2;
            }
            if ((obj instanceof toHashMap) && (obj2 instanceof toHashMap)) {
                return ((toHashMap) obj2).onNavigationEvent().onExtraCallback();
            }
            return null;
        }
    }
}
