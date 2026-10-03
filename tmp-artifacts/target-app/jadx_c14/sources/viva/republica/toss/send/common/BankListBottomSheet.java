package viva.republica.toss.send.common;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Base64Encoder;
import o.M_;
import o.TurboModuleInteropUtilsParsingException;
import o.checkDeviceBrand;
import o.r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;
import viva.republica.toss.widget.BankListView;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public class BankListBottomSheet extends r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI {
    public static final int onExtraCallbackWithResult = r8lambdaaf6h4gyIT_zMU5_zL59OQo83yI.onWarmupCompleted;
    private final checkDeviceBrand IAuthTabCallback;
    private final IAuthTabCallback onExtraCallback;
    private final Function1<Base64Encoder, Boolean> onNavigationEvent;
    private final String onTransact;

    public interface IAuthTabCallback {
        void onExtraCallbackWithResult(@NotNull String str, @NotNull String str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BankListBottomSheet(@NotNull Context context, @NotNull IAuthTabCallback iAuthTabCallback, @NotNull String str, @NotNull checkDeviceBrand checkdevicebrand, @Nullable Function1<? super Base64Encoder, Boolean> function1) {
        super(context, 0, false, false, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(checkdevicebrand, "");
        this.onExtraCallback = iAuthTabCallback;
        this.onTransact = str;
        this.IAuthTabCallback = checkdevicebrand;
        this.onNavigationEvent = function1;
    }

    public /* synthetic */ BankListBottomSheet(Context context, IAuthTabCallback iAuthTabCallback, String str, checkDeviceBrand checkdevicebrand, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, iAuthTabCallback, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? checkDeviceBrand.SEND : checkdevicebrand, (i & 16) != 0 ? null : function1);
    }

    public int onWarmupCompleted() {
        return R.layout.dialog_bank_list_bottom_sheet;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super/*o.BrickModuleImplExternalSyntheticLambda0*/.onCreate(bundle);
        setContentView(onWarmupCompleted());
        readTypedObject();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void readTypedObject() {
        View viewFindViewById = findViewById(R.id.bankListViewContainer);
        Intrinsics.checkNotNull(viewFindViewById);
        onExtraCallbackWithResult();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        String string = getContext().getString(R.string.stock_co_choose);
        Intrinsics.checkNotNullExpressionValue(string, "");
        BankListView bankListView = new BankListView(context, (String) null, (String) null, "", string, false, (String) null, this.IAuthTabCallback, this.onNavigationEvent, false, false, 1606, (DefaultConstructorMarker) null);
        ((FrameLayout) viewFindViewById).addView((View) bankListView, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -2));
        bankListView.setClipToPadding(false);
        bankListView.setVerticalScrollBarEnabled(false);
        bankListView.setVerticalFadingEdgeEnabled(true);
        DisplayMetrics displayMetrics = bankListView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        bankListView.setFadingEdgeLength(varyMatches.onNavigationEvent(16, displayMetrics));
        DisplayMetrics displayMetrics2 = bankListView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        bankListView.setPadding(0, 0, 0, varyMatches.onNavigationEvent(20, displayMetrics2));
        bankListView.setMaxHeight((int) (M_.onExtraCallback.IAuthTabCallbackDefault() * 0.7f));
        bankListView.setItemClickListener(new onWarmupCompleted());
    }

    public static final class onWarmupCompleted implements TurboModuleInteropUtilsParsingException {
        onWarmupCompleted() {
        }

        public /* bridge */ void onNavigationEvent() {
            super.onNavigationEvent();
        }

        public void onNavigationEvent(Base64Encoder base64Encoder) {
            Intrinsics.checkNotNullParameter(base64Encoder, "");
            BankListBottomSheet.this.onExtraCallback.onExtraCallbackWithResult(String.valueOf(base64Encoder.IAuthTabCallback()), base64Encoder.onNavigationEvent());
            BankListBottomSheet.this.dismiss();
        }
    }

    protected void onExtraCallbackWithResult() {
        if (this.onTransact.length() > 0) {
            BottomSheetHeader bottomSheetHeaderFindViewById = findViewById(R.id.header);
            Intrinsics.checkNotNull(bottomSheetHeaderFindViewById);
            bottomSheetHeaderFindViewById.setTitle(this.onTransact);
        }
    }
}
