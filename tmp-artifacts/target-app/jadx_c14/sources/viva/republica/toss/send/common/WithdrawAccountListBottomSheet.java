package viva.republica.toss.send.common;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.annotations.SerializedName;
import im.toss.uikit.widget.MaxHeightRecyclerView;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.GeckoHubImp;
import o.JavaOnlyMapCompanion;
import o.LifecyclesKtawaitStarted21;
import o.M_;
import o.SessionTrackerb;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.access13800;
import o.access14000;
import o.access15300;
import o.hasKey;
import o.maybeUpdateAnimatable;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.setRandomHost;
import o.toHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.network.model.transfer.AccountBalanceInfo;
import viva.republica.toss.network.model.transfer.MyAccountInfo;
import viva.republica.toss.network.model.transfer.TransferBalance;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class WithdrawAccountListBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    private ArrayList<toHashMap> IAuthTabCallback;
    private final CharSequence IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStubProxy;
    private final Function1<List<AccountBalanceInfo>, Unit> IAuthTabCallback_Parcel;
    private final CharSequence access000;
    private ArrayList<toHashMap> access100;
    private final boolean asBinder;
    private final Lazy asInterface;
    private final String extraCallback;
    private final SessionTrackerb extraCallbackWithResult;
    private final onWarmupCompleted getInterfaceDescriptor;
    private final List<MyAccountInfo> onExtraCallback;
    private final JavaOnlyMapCompanion onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final onExtraCallbackWithResult onTransact;
    private final Lazy readTypedObject;

    public interface onExtraCallbackWithResult {
        default void IAuthTabCallback() {
        }

        void IAuthTabCallback(@NotNull MyAccountInfo myAccountInfo);
    }

    public long getScreenId() {
        return 1009079L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithdrawAccountListBottomSheet(@NotNull Context context, @NotNull SessionTrackerb sessionTrackerb, @NotNull List<MyAccountInfo> list, @Nullable MyAccountInfo myAccountInfo, @NotNull onExtraCallbackWithResult onextracallbackwithresult, @NotNull CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z, @Nullable onWarmupCompleted onwarmupcompleted, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Function1<? super List<AccountBalanceInfo>, Unit> function1) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(sessionTrackerb, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.extraCallbackWithResult = sessionTrackerb;
        this.onExtraCallback = list;
        this.onTransact = onextracallbackwithresult;
        this.access000 = charSequence;
        this.IAuthTabCallbackDefault = charSequence2;
        this.asBinder = z;
        this.getInterfaceDescriptor = onwarmupcompleted;
        this.IAuthTabCallbackStubProxy = str;
        this.onNavigationEvent = str2;
        this.extraCallback = str3;
        this.IAuthTabCallback_Parcel = function1;
        this.IAuthTabCallback = new ArrayList<>();
        this.access100 = new ArrayList<>();
        this.onExtraCallbackWithResult = new JavaOnlyMapCompanion(myAccountInfo);
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.common.WithdrawAccountListBottomSheet$$ExternalSyntheticLambda0
            public final Object invoke() {
                return WithdrawAccountListBottomSheet.access000(this.f$0);
            }
        });
        this.readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.send.common.WithdrawAccountListBottomSheet$$ExternalSyntheticLambda1
            public final Object invoke() {
                return WithdrawAccountListBottomSheet.access100(this.f$0);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ WithdrawAccountListBottomSheet(Context context, SessionTrackerb sessionTrackerb, List list, MyAccountInfo myAccountInfo, onExtraCallbackWithResult onextracallbackwithresult, CharSequence charSequence, CharSequence charSequence2, boolean z, onWarmupCompleted onwarmupcompleted, String str, String str2, String str3, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CharSequence charSequence3;
        if ((i & 32) != 0) {
            String string = context.getString(R.string.app_withdraw_account_list_bottom_sheet_title);
            Intrinsics.checkNotNullExpressionValue(string, "");
            charSequence3 = string;
        } else {
            charSequence3 = charSequence;
        }
        this(context, sessionTrackerb, list, myAccountInfo, onextracallbackwithresult, charSequence3, (i & 64) != 0 ? null : charSequence2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : onwarmupcompleted, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? null : str2, (i & 2048) != 0 ? null : str3, (i & 4096) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetHeader access000(WithdrawAccountListBottomSheet withdrawAccountListBottomSheet) {
        return withdrawAccountListBottomSheet.findViewById(R.id.header);
    }

    private final BottomSheetHeader onExtraCallbackWithResult() {
        return (BottomSheetHeader) this.asInterface.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaxHeightRecyclerView access100(WithdrawAccountListBottomSheet withdrawAccountListBottomSheet) {
        return withdrawAccountListBottomSheet.findViewById(R.id.withdrawAccountList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MaxHeightRecyclerView onWarmupCompleted() {
        return (MaxHeightRecyclerView) this.readTypedObject.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(R.layout.dialog_account_list_bottom_sheet);
        BottomSheetHeader bottomSheetHeaderOnExtraCallbackWithResult = onExtraCallbackWithResult();
        if (bottomSheetHeaderOnExtraCallbackWithResult != null) {
            bottomSheetHeaderOnExtraCallbackWithResult.setTitle(this.access000);
        }
        BottomSheetHeader bottomSheetHeaderOnExtraCallbackWithResult2 = onExtraCallbackWithResult();
        if (bottomSheetHeaderOnExtraCallbackWithResult2 != null) {
            bottomSheetHeaderOnExtraCallbackWithResult2.setDescription(this.IAuthTabCallbackDefault);
        }
        MaxHeightRecyclerView maxHeightRecyclerViewOnWarmupCompleted = onWarmupCompleted();
        if (maxHeightRecyclerViewOnWarmupCompleted != null) {
            maxHeightRecyclerViewOnWarmupCompleted.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        MaxHeightRecyclerView maxHeightRecyclerViewOnWarmupCompleted2 = onWarmupCompleted();
        if (maxHeightRecyclerViewOnWarmupCompleted2 != null) {
            maxHeightRecyclerViewOnWarmupCompleted2.setAdapter(this.onExtraCallbackWithResult);
        }
        this.onExtraCallbackWithResult.onExtraCallbackWithResult((JavaOnlyMapCompanion.onWarmupCompleted) new onNavigationEvent(this));
        MaxHeightRecyclerView maxHeightRecyclerViewOnWarmupCompleted3 = onWarmupCompleted();
        if (maxHeightRecyclerViewOnWarmupCompleted3 != null) {
            maxHeightRecyclerViewOnWarmupCompleted3.setMaxHeight((int) (M_.onExtraCallback.IAuthTabCallbackDefault() * 0.7f));
        }
        maybeUpdateAnimatable.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(this), (CoroutineContext) null, (setRandomHost) null, new IAuthTabCallback(this, (access13800) null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onExtraCallbackWithResult(List<toHashMap> list, boolean z) {
        if (isShowing()) {
            this.onExtraCallbackWithResult.onExtraCallbackWithResult(z ? onExtraCallbackWithResult(list) : onExtraCallback(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountBalanceInfo onWarmupCompleted(toHashMap tohashmap) {
        return new AccountBalanceInfo(tohashmap.onWarmupCompleted(), tohashmap.onExtraCallback(), (TransferBalance) null, 4, (DefaultConstructorMarker) null);
    }

    private final List<Object> onExtraCallbackWithResult(List<toHashMap> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 4 && !this.onExtraCallbackWithResult.onNavigationEvent()) {
            arrayList.addAll(list.subList(0, 4));
        } else if (list.size() <= 4 || this.onExtraCallbackWithResult.onNavigationEvent()) {
            arrayList.addAll(list);
        } else {
            arrayList.addAll(list);
        }
        if (list.size() > 4) {
            arrayList.add(new JavaOnlyMapCompanion.IAuthTabCallbackDefault());
        }
        if (!list.isEmpty()) {
            arrayList.add(new JavaOnlyMapCompanion.onNavigationEvent());
        }
        if (!hasKey.onWarmupCompleted.onTransact()) {
            arrayList.add(new JavaOnlyMapCompanion.onExtraCallback());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<Object> onExtraCallback(List<toHashMap> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            toHashMap tohashmap = (toHashMap) obj;
            Object[] objArr = {tohashmap.IAuthTabCallback()};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            if (!((Boolean) MyAccountInfo.onWarmupCompleted(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -583201524, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), objArr, iOnNavigationEvent, 583201525)).booleanValue() || MyAccountInfo.onExtraCallbackWithResult(tohashmap.IAuthTabCallback(), 0L, 1, (Object) null) != 0) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair = new Pair(arrayList2, arrayList3);
        arrayList.addAll((Collection) pair.getFirst());
        if (!((Collection) pair.getSecond()).isEmpty()) {
            String string = getContext().getString(R.string.app_transfer_no_balance);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new JavaOnlyMapCompanion.IAuthTabCallbackStub(string));
            arrayList.addAll((Collection) pair.getSecond());
        }
        if (this.asBinder) {
            arrayList.add(new JavaOnlyMapCompanion.asInterface());
        }
        if (!hasKey.onWarmupCompleted.onTransact()) {
            arrayList.add(new JavaOnlyMapCompanion.onExtraCallback());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavigationEvent(List<toHashMap> list, boolean z) {
        this.onExtraCallbackWithResult.onExtraCallbackWithResult(z ? onExtraCallbackWithResult(list) : onExtraCallback(list));
        this.onExtraCallbackWithResult.notifyDataSetChanged();
    }

    public void dismiss() {
        super/*o.getTypedExportedConstants*/.dismiss();
        Function1<List<AccountBalanceInfo>, Unit> function1 = this.IAuthTabCallback_Parcel;
        if (function1 != null) {
            ArrayList<toHashMap> arrayList = this.access100;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((toHashMap) it.next()).onNavigationEvent());
            }
            function1.invoke(arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onWarmupCompleted(access13800<? super Boolean> access13800Var) {
        Object[] objArr = {LifecyclesKtawaitStarted21.IAuthTabCallback, "transfer.getMyAccounts.use", access14000.onNavigationEvent(false), access13800Var};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return LifecyclesKtawaitStarted21.onExtraCallback(objArr, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onExtraCallback(access13800<? super Boolean> access13800Var) {
        Object[] objArr = {LifecyclesKtawaitStarted21.IAuthTabCallback, "transfer.withdrawalAccountSelectBottomSheet.moreButton", access14000.onNavigationEvent(false), access13800Var};
        int iIAuthTabCallback = GeckoHubImp.IAuthTabCallback.IAuthTabCallback();
        return LifecyclesKtawaitStarted21.onExtraCallback(objArr, 324853779, GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), GeckoHubImp.IAuthTabCallback.IAuthTabCallback(), -324853779, iIAuthTabCallback);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;

        @SerializedName("TRANSFER")
        public static final onWarmupCompleted TRANSFER = new onWarmupCompleted("TRANSFER", 0);

        @SerializedName("TRANSFER_LACK_BALANCE")
        public static final onWarmupCompleted TRANSFER_LACK_BALANCE = new onWarmupCompleted("TRANSFER_LACK_BALANCE", 1);

        @SerializedName("PERIODIC_TRANSFER")
        public static final onWarmupCompleted PERIODIC_TRANSFER = new onWarmupCompleted("PERIODIC_TRANSFER", 2);

        @SerializedName("POINT_REFUND")
        public static final onWarmupCompleted POINT_REFUND = new onWarmupCompleted("POINT_REFUND", 3);

        @SerializedName("COMPACT_TRANSFER")
        public static final onWarmupCompleted COMPACT_TRANSFER = new onWarmupCompleted("COMPACT_TRANSFER", 4);

        @SerializedName("TOSS_PLCC")
        public static final onWarmupCompleted TOSS_PLCC = new onWarmupCompleted("TOSS_PLCC", 5);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            return new onWarmupCompleted[]{TRANSFER, TRANSFER_LACK_BALANCE, PERIODIC_TRANSFER, POINT_REFUND, COMPACT_TRANSFER, TOSS_PLCC};
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            return $ENTRIES;
        }

        public static onWarmupCompleted valueOf(String str) {
            return (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
        }

        public static onWarmupCompleted[] values() {
            return (onWarmupCompleted[]) $VALUES.clone();
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
        }
    }
}
