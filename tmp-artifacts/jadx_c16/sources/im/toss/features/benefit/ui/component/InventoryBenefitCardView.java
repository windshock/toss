package im.toss.features.benefit.ui.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.common.collect.Synchronized;
import im.toss.features.benefit.R;
import im.toss.features.benefit.ui.component.InventoryBenefitCardView$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.inventory_sdk.model.InventoryBenefitCardDto;
import im.toss.inventory_sdk.model.LogDto;
import im.toss.inventory_sdk.ui.view.InventoryContainerView;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.tds.view.component.widget.TdsRoundLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2;
import o.TextFieldScrollKtExternalSyntheticLambda0;
import o.TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1;
import o.addPhoneContact;
import o.zzed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class InventoryBenefitCardView extends InventoryContainerView {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    private final addPhoneContact onExtraCallback;
    private InventoryBenefitCardDto.ServiceCard onNavigationEvent;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InventoryBenefitCardView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InventoryBenefitCardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static /* synthetic */ boolean onExtraCallback(InventoryBenefitCardView inventoryBenefitCardView, InventoryBenefitCardDto.ServiceCard serviceCard) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(inventoryBenefitCardView, serviceCard);
        int i4 = IAuthTabCallback + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InventoryBenefitCardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        addPhoneContact addphonecontactOnExtraCallback = addPhoneContact.onExtraCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(addphonecontactOnExtraCallback, "");
        this.onExtraCallback = addphonecontactOnExtraCallback;
        if (getLayoutParams() == null) {
            setLayoutParams(new ConstraintLayout.onExtraCallbackWithResult(-1, -2));
            int i2 = IAuthTabCallback + 105;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
        }
        int i5 = onWarmupCompleted + 81;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 56 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InventoryBenefitCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = onWarmupCompleted + 111;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onWarmupCompleted + 109;
            IAuthTabCallback = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public static final /* synthetic */ void onNavigationEvent(InventoryBenefitCardView inventoryBenefitCardView) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 87;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        inventoryBenefitCardView.access000();
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
    }

    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return "InventoryBenefitCardView";
        }
        throw null;
    }

    public final TdsListRowV1View IAuthTabCallback() {
        TdsListRowV1View tdsListRowV1View;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 63;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            tdsListRowV1View = this.onExtraCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
            int i3 = 57 / 0;
        } else {
            tdsListRowV1View = this.onExtraCallback.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(tdsListRowV1View, "");
        }
        int i4 = onWarmupCompleted + 37;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return tdsListRowV1View;
    }

    public final TdsRoundLayout onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 37;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsRoundLayout tdsRoundLayout = this.onExtraCallback.onExtraCallbackWithResult;
        Intrinsics.checkNotNullExpressionValue(tdsRoundLayout, "");
        int i4 = onWarmupCompleted + 67;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 24 / 0;
        }
        return tdsRoundLayout;
    }

    public final TdsImageView onExtraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 95;
        IAuthTabCallback = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object[] objArr = {IAuthTabCallback()};
            int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {IAuthTabCallback()};
        int iOnNavigationEvent2 = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        LinearLayout linearLayout = (LinearLayout) TdsListRowV1View.IAuthTabCallback(objArr2, 1391718, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1391704, iOnNavigationEvent2, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (linearLayout == null) {
            return null;
        }
        int i3 = IAuthTabCallback + 99;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return linearLayout.findViewById(R.id.imageView);
    }

    public final TdsImageView onNavigationEvent() {
        int i = 2 % 2;
        Object[] objArr = {IAuthTabCallback()};
        int iOnNavigationEvent = Synchronized.SynchronizedAsMapEntries.onNavigationEvent();
        LinearLayout linearLayout = (LinearLayout) TdsListRowV1View.IAuthTabCallback(objArr, 1391718, Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), Synchronized.SynchronizedAsMapEntries.onNavigationEvent(), -1391704, iOnNavigationEvent, Synchronized.SynchronizedAsMapEntries.onNavigationEvent());
        if (linearLayout == null) {
            return null;
        }
        int i2 = onWarmupCompleted + 39;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        TdsImageView tdsImageViewFindViewById = linearLayout.findViewById(R.id.checkView);
        int i4 = IAuthTabCallback + 65;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return tdsImageViewFindViewById;
    }

    public final void setAd(@NotNull InventoryBenefitCardDto.ServiceCard serviceCard) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(serviceCard, "");
        this.onNavigationEvent = serviceCard;
        onTransact();
        int i4 = IAuthTabCallback + 5;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void access000() {
        InventoryBenefitCardDto.ServiceCard serviceCard;
        int i = 2 % 2;
        TextFieldScrollKtExternalSyntheticLambda0 textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult = AndroidTextContextMenuToolbarProviderExternalSyntheticLambda2.onExtraCallbackWithResult(this);
        if (textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult == null || (serviceCard = this.onNavigationEvent) == null) {
            return;
        }
        int i2 = onWarmupCompleted + 107;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        zzed zzedVarIAuthTabCallbackDefault = IAuthTabCallbackDefault();
        if (zzedVarIAuthTabCallbackDefault != null) {
            zzedVarIAuthTabCallbackDefault.onNavigationEvent(TextFieldScrollKttextFieldScrollable2wrappedScrollableState11ExternalSyntheticLambda1.onNavigationEvent(textFieldScrollKtExternalSyntheticLambda0OnExtraCallbackWithResult), (LogDto) InventoryBenefitCardDto.ServiceCard.onExtraCallbackWithResult(1537738284, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), new Object[]{serviceCard}, -1537738284), new InventoryBenefitCardView$.ExternalSyntheticLambda0(this, serviceCard));
            int i4 = IAuthTabCallback + 23;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean IAuthTabCallback(InventoryBenefitCardView inventoryBenefitCardView, InventoryBenefitCardDto.ServiceCard serviceCard) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 85;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 == 0) {
            inventoryBenefitCardView.onExtraCallback(inventoryBenefitCardView);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!(!inventoryBenefitCardView.onExtraCallback(inventoryBenefitCardView)) && Intrinsics.areEqual(serviceCard, inventoryBenefitCardView.onNavigationEvent)) {
            return true;
        }
        int i3 = IAuthTabCallback + 9;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 94 / 0;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onTransact() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        if (isAttachedToWindow()) {
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            access000();
            return;
        }
        if (isAttachedToWindow()) {
            int i6 = onWarmupCompleted + 33;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            onNavigationEvent(this);
            return;
        }
        addOnAttachStateChangeListener(new onWarmupCompleted(this, this));
    }

    public static final class onWarmupCompleted implements View.OnAttachStateChangeListener {
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        final /* synthetic */ InventoryBenefitCardView onExtraCallback;
        final /* synthetic */ View onExtraCallbackWithResult;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 67;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
        }

        public onWarmupCompleted(View view, InventoryBenefitCardView inventoryBenefitCardView) {
            this.onExtraCallbackWithResult = view;
            this.onExtraCallback = inventoryBenefitCardView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 81;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
                InventoryBenefitCardView.onNavigationEvent(this.onExtraCallback);
                int i3 = onWarmupCompleted + 91;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            this.onExtraCallbackWithResult.removeOnAttachStateChangeListener(this);
            InventoryBenefitCardView.onNavigationEvent(this.onExtraCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
