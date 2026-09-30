package o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import im.toss.uikit.R;
import im.toss.uikit.widget.dialog.BottomSheetHeader;
import im.toss.uikit.widget.dialog.BottomSheetSelector$;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BrickModuleImplExternalSyntheticLambda1;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;
import viva.republica.toss.account.agreement.AccountAgreementHelper$$ExternalSyntheticLambda18;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class BrickModuleImplExternalSyntheticLambda1 extends getTypedExportedConstants implements View.OnClickListener {
    private static int IAuthTabCallback = 1;
    private static int onExtraCallback;
    private AFj1tSDK onExtraCallbackWithResult;
    private final IAuthTabCallback onNavigationEvent;
    private boolean onWarmupCompleted;

    public interface onExtraCallback {
        void onNavigationEvent(int i);
    }

    public static /* synthetic */ Unit IAuthTabCallback(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 63;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda1, view);
        int i4 = IAuthTabCallback + 109;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ void IAuthTabCallback(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 39;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        onExtraCallbackWithResult(brickModuleImplExternalSyntheticLambda1, i);
        int i5 = onExtraCallback + Imgproc.COLOR_YUV2RGBA_YVYU;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallback(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 95;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(brickModuleImplExternalSyntheticLambda1);
        int i4 = IAuthTabCallback + 47;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 89 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(brickModuleImplExternalSyntheticLambda1);
        int i4 = IAuthTabCallback + 25;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrickModuleImplExternalSyntheticLambda1(@NotNull IAuthTabCallback iAuthTabCallback) {
        super(iAuthTabCallback.onExtraCallback(), 0, false, false, 0L, null, 58, null);
        Intrinsics.checkNotNullParameter(iAuthTabCallback, "");
        this.onNavigationEvent = iAuthTabCallback;
        if (iAuthTabCallback.onNavigationEvent() == 0.0f) {
            IAuthTabCallback(true);
            int i = onExtraCallback + 99;
            IAuthTabCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 2 % 2;
            }
        }
        int i3 = IAuthTabCallback + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final Unit onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 115;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            brickModuleImplExternalSyntheticLambda1.dismiss();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(view, "");
        brickModuleImplExternalSyntheticLambda1.dismiss();
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void IAuthTabCallback(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        AFj1tSDK aFj1tSDK = brickModuleImplExternalSyntheticLambda1.onExtraCallbackWithResult;
        if (aFj1tSDK == null) {
            int i2 = IAuthTabCallback + 85;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = IAuthTabCallback + 45;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            aFj1tSDK = null;
        }
        aFj1tSDK.onExtraCallback.scrollToPosition(Math.max(0, brickModuleImplExternalSyntheticLambda1.onNavigationEvent.IAuthTabCallbackDefault()));
    }

    private static final void onWarmupCompleted(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 3;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        AFj1tSDK aFj1tSDK = brickModuleImplExternalSyntheticLambda1.onExtraCallbackWithResult;
        if (aFj1tSDK == null) {
            int i5 = i2 + 9;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            aFj1tSDK = null;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            if (i6 == 0) {
                throw null;
            }
        }
        aFj1tSDK.onExtraCallback.post(new BottomSheetSelector$.ExternalSyntheticLambda3(brickModuleImplExternalSyntheticLambda1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00da  */
    @Override // o.BrickModuleImplExternalSyntheticLambda0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(@Nullable Bundle bundle) {
        int i;
        int i2 = 2 % 2;
        super.onCreate(bundle);
        AFj1tSDK aFj1tSDKOnExtraCallbackWithResult = AFj1tSDK.onExtraCallbackWithResult(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aFj1tSDKOnExtraCallbackWithResult, "");
        this.onExtraCallbackWithResult = aFj1tSDKOnExtraCallbackWithResult;
        AFj1tSDK aFj1tSDK = null;
        if (aFj1tSDKOnExtraCallbackWithResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDKOnExtraCallbackWithResult = null;
        }
        ConstraintLayout constraintLayoutIAuthTabCallback = aFj1tSDKOnExtraCallbackWithResult.IAuthTabCallback();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutIAuthTabCallback, "");
        setContentView((View) constraintLayoutIAuthTabCallback);
        AFj1tSDK aFj1tSDK2 = this.onExtraCallbackWithResult;
        if (aFj1tSDK2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK2 = null;
        }
        aFj1tSDK2.onExtraCallbackWithResult.setTitle(this.onNavigationEvent.asBinder());
        AFj1tSDK aFj1tSDK3 = this.onExtraCallbackWithResult;
        if (aFj1tSDK3 == null) {
            int i3 = IAuthTabCallback + 31;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK3 = null;
        }
        aFj1tSDK3.onExtraCallbackWithResult.setDescription((String) IAuthTabCallback.onExtraCallback(new Object[]{this.onNavigationEvent}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), -1450773159, 1450773161, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent()));
        AFj1tSDK aFj1tSDK4 = this.onExtraCallbackWithResult;
        if (aFj1tSDK4 == null) {
            int i5 = onExtraCallback + 61;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1tSDK.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK4 = null;
        }
        aFj1tSDK4.onExtraCallbackWithResult.setShowCloseIcon(this.onNavigationEvent.asInterface());
        AFj1tSDK aFj1tSDK5 = this.onExtraCallbackWithResult;
        if (aFj1tSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK5 = null;
        }
        BottomSheetHeader bottomSheetHeader = aFj1tSDK5.onExtraCallbackWithResult;
        if (this.onNavigationEvent.asBinder().length() <= 0) {
            i = ((String) IAuthTabCallback.onExtraCallback(new Object[]{this.onNavigationEvent}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), -1450773159, 1450773161, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent())).length() > 0 ? 0 : 8;
        }
        bottomSheetHeader.setVisibility(i);
        if (this.onNavigationEvent.asInterface()) {
            AFj1tSDK aFj1tSDK6 = this.onExtraCallbackWithResult;
            if (aFj1tSDK6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                aFj1tSDK6 = null;
            }
            aFj1tSDK6.onExtraCallbackWithResult.setCloseClickListener((Function1<? super View, Unit>) new BottomSheetSelector$.ExternalSyntheticLambda1(this));
        }
        AFj1tSDK aFj1tSDK7 = this.onExtraCallbackWithResult;
        if (aFj1tSDK7 == null) {
            int i6 = IAuthTabCallback + 29;
            onExtraCallback = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK7 = null;
        }
        aFj1tSDK7.onWarmupCompleted.setVisibility(this.onNavigationEvent.IAuthTabCallbackStub() ? 0 : 4);
        AFj1tSDK aFj1tSDK8 = this.onExtraCallbackWithResult;
        if (aFj1tSDK8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK8 = null;
        }
        aFj1tSDK8.onExtraCallback.setLayoutManager(new LinearLayoutManager(getContext()));
        AFj1tSDK aFj1tSDK9 = this.onExtraCallbackWithResult;
        if (aFj1tSDK9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK9 = null;
        }
        aFj1tSDK9.onExtraCallback.setAdapter(new onWarmupCompleted(this.onNavigationEvent.onExtraCallbackWithResult(), this.onNavigationEvent.IAuthTabCallbackDefault(), this));
        AFj1tSDK aFj1tSDK10 = this.onExtraCallbackWithResult;
        if (aFj1tSDK10 == null) {
            int i8 = onExtraCallback + 85;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1tSDK = aFj1tSDK10;
        }
        aFj1tSDK.onExtraCallback.post(new BottomSheetSelector$.ExternalSyntheticLambda2(this));
        if (this.onNavigationEvent.onNavigationEvent() > 0.0f) {
            int i10 = onExtraCallback + 87;
            IAuthTabCallback = i10 % 128;
            int i11 = i10 % 2;
            onWarmupCompleted(this.onNavigationEvent.onNavigationEvent());
        }
    }

    private static final void onExtraCallbackWithResult(BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 57;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            onExtraCallback onextracallbackOnTransact = brickModuleImplExternalSyntheticLambda1.onNavigationEvent.onTransact();
            if (onextracallbackOnTransact != null) {
                onextracallbackOnTransact.onNavigationEvent(i);
                int i4 = IAuthTabCallback + 65;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
            brickModuleImplExternalSyntheticLambda1.dismiss();
            return;
        }
        brickModuleImplExternalSyntheticLambda1.onNavigationEvent.onTransact();
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i3 = 61 / 0;
            if (this.onWarmupCompleted) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.onWarmupCompleted) {
                return;
            }
        }
        AFj1tSDK aFj1tSDK = this.onExtraCallbackWithResult;
        AFj1tSDK aFj1tSDK2 = null;
        if (aFj1tSDK == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i4 = onExtraCallback + 33;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
            aFj1tSDK = null;
        }
        RecyclerView.Adapter adapter = aFj1tSDK.onExtraCallback.getAdapter();
        Intrinsics.checkNotNull(adapter, "");
        int iOnExtraCallback = ((onWarmupCompleted) adapter).onExtraCallback();
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "");
        final int iIntValue = ((Integer) tag).intValue();
        AFj1tSDK aFj1tSDK3 = this.onExtraCallbackWithResult;
        if (aFj1tSDK3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            int i6 = onExtraCallback + 119;
            IAuthTabCallback = i6 % 128;
            int i7 = i6 % 2;
            aFj1tSDK3 = null;
        }
        RecyclerView.Adapter adapter2 = aFj1tSDK3.onExtraCallback.getAdapter();
        Intrinsics.checkNotNull(adapter2, "");
        ((onWarmupCompleted) adapter2).onNavigationEvent(iIntValue);
        AFj1tSDK aFj1tSDK4 = this.onExtraCallbackWithResult;
        if (aFj1tSDK4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK4 = null;
        }
        RecyclerView.Adapter adapter3 = aFj1tSDK4.onExtraCallback.getAdapter();
        if (adapter3 != null) {
            adapter3.notifyItemChanged(iOnExtraCallback, Boolean.FALSE);
        }
        AFj1tSDK aFj1tSDK5 = this.onExtraCallbackWithResult;
        if (aFj1tSDK5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            aFj1tSDK5 = null;
        }
        RecyclerView.Adapter adapter4 = aFj1tSDK5.onExtraCallback.getAdapter();
        if (adapter4 != null) {
            adapter4.notifyItemChanged(iIntValue, Boolean.TRUE);
        }
        AFj1tSDK aFj1tSDK6 = this.onExtraCallbackWithResult;
        if (aFj1tSDK6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
        } else {
            aFj1tSDK2 = aFj1tSDK6;
        }
        aFj1tSDK2.onExtraCallback.postDelayed(new Runnable() { // from class: im.toss.uikit.widget.dialog.BottomSheetSelector$$ExternalSyntheticLambda0
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i8 = 2 % 2;
                int i9 = onNavigationEvent + 7;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                BrickModuleImplExternalSyntheticLambda1.IAuthTabCallback(this.f$0, iIntValue);
                int i11 = onWarmupCompleted + 11;
                onNavigationEvent = i11 % 128;
                int i12 = i11 % 2;
            }
        }, 300L);
        this.onWarmupCompleted = true;
    }

    public static final class onWarmupCompleted extends RecyclerView.Adapter<onExtraCallbackWithResult> {
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent;
        private final View.OnClickListener IAuthTabCallback;
        private int onExtraCallback;
        private final ArrayList<CharSequence> onWarmupCompleted;

        public onWarmupCompleted(@NotNull ArrayList<CharSequence> arrayList, int i, @NotNull View.OnClickListener onClickListener) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(onClickListener, "");
            this.onWarmupCompleted = arrayList;
            this.onExtraCallback = i;
            this.IAuthTabCallback = onClickListener;
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback((onExtraCallbackWithResult) viewHolder, i);
            int i5 = onNavigationEvent + 61;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 83;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback((onExtraCallbackWithResult) viewHolder, i, list);
            int i5 = onNavigationEvent + 93;
            onExtraCallbackWithResult = i5 % 128;
            int i6 = i5 % 2;
        }

        public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 67;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = onExtraCallback(viewGroup, i);
            int i5 = onExtraCallbackWithResult + 101;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultOnExtraCallback;
        }

        public final int onExtraCallback() {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 7;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void onNavigationEvent(int i) {
            int i2 = 2 % 2;
            int i3 = onExtraCallbackWithResult + 55;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            this.onExtraCallback = i;
            if (i4 != 0) {
                throw null;
            }
        }

        public onExtraCallbackWithResult onExtraCallback(@NotNull ViewGroup viewGroup, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(new TdsListRowV1View(context, (AttributeSet) null, 0, false, 14, (DefaultConstructorMarker) null));
            int i3 = onExtraCallbackWithResult + 77;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 == 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int getItemCount() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + Imgproc.COLOR_YUV2RGBA_YVYU;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            int size = this.onWarmupCompleted.size();
            int i4 = onNavigationEvent + 103;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return size;
        }

        public void onExtraCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, int i) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onextracallbackwithresult.IAuthTabCallback(IAuthTabCallback(i), this.IAuthTabCallback);
            boolean z = true;
            if (this.onExtraCallback == i) {
                int i3 = onNavigationEvent + 47;
                int i4 = i3 % 128;
                onExtraCallbackWithResult = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 65;
                onNavigationEvent = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = onExtraCallbackWithResult + 1;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                z = false;
            }
            onextracallbackwithresult.onExtraCallbackWithResult(z);
            onextracallbackwithresult.onWarmupCompleted().setTag(Integer.valueOf(i));
        }

        public void onExtraCallback(@NotNull onExtraCallbackWithResult onextracallbackwithresult, int i, @NotNull List<Object> list) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 55;
            onExtraCallbackWithResult = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
                Intrinsics.checkNotNullParameter(list, "");
                list.isEmpty();
                throw null;
            }
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            Intrinsics.checkNotNullParameter(list, "");
            if (list.isEmpty()) {
                super.onBindViewHolder(onextracallbackwithresult, i, list);
                return;
            }
            Object objLast = CollectionsKt___CollectionsKt.last((List<? extends Object>) list);
            Intrinsics.checkNotNull(objLast, "");
            onextracallbackwithresult.onExtraCallbackWithResult(((Boolean) objLast).booleanValue());
            int i4 = onExtraCallbackWithResult + 39;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 95 / 0;
            }
        }

        private final CharSequence IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = onNavigationEvent + 17;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequence = this.onWarmupCompleted.get(i);
            Intrinsics.checkNotNullExpressionValue(charSequence, "");
            CharSequence charSequence2 = charSequence;
            int i5 = onExtraCallbackWithResult + 123;
            onNavigationEvent = i5 % 128;
            int i6 = i5 % 2;
            return charSequence2;
        }
    }

    public static final class onExtraCallbackWithResult extends RecyclerView.ViewHolder {
        private static int onActivityResized = 0;
        private static int onMessageChannelReady = 1;
        private final Space ICustomTabsCallback;
        private final Space extraCallback;
        private final TdsListRowV1View writeTypedObject;

        public static /* synthetic */ Unit onExtraCallback(TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
            int i = 2 % 2;
            int i2 = onMessageChannelReady + 33;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                return onExtraCallbackWithResult(tdsCheckBoxV2View, z);
            }
            onExtraCallbackWithResult(tdsCheckBoxV2View, z);
            throw null;
        }

        public static /* synthetic */ Unit onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = onMessageChannelReady + 5;
            onActivityResized = i2 % 128;
            int i3 = i2 % 2;
            Unit unitOnNavigationEvent = onNavigationEvent(onextracallbackwithresult, view, suspendAnimationKtExternalSyntheticLambda4);
            int i4 = onActivityResized + 91;
            onMessageChannelReady = i4 % 128;
            if (i4 % 2 != 0) {
                return unitOnNavigationEvent;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onExtraCallbackWithResult(@NotNull TdsListRowV1View tdsListRowV1View) {
            super(tdsListRowV1View);
            Intrinsics.checkNotNullParameter(tdsListRowV1View, "");
            this.writeTypedObject = tdsListRowV1View;
            View viewFindViewById = tdsListRowV1View.findViewById(R.id.spaceLeft);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            Space space = (Space) viewFindViewById;
            this.extraCallback = space;
            View viewFindViewById2 = tdsListRowV1View.findViewById(R.id.spaceRight);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
            Space space2 = (Space) viewFindViewById2;
            this.ICustomTabsCallback = space2;
            tdsListRowV1View.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            int i = space.getLayoutParams().width;
            Resources resources = tdsListRowV1View.getResources();
            int i2 = im.toss.tds.view.R.dimen.list_row_padding_vertical_16;
            tdsListRowV1View.setPadding(i, resources.getDimensionPixelSize(i2), space2.getLayoutParams().width, tdsListRowV1View.getResources().getDimensionPixelSize(i2));
            tdsListRowV1View.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW1A);
            tdsListRowV1View.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
            tdsListRowV1View.setRightCheckBoxType(TdsCheckBoxV2View.onNavigationEvent.LINE_TRANSPARENT);
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setClickable(false);
            }
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 = tdsListRowV1View.prefetchWithMultipleUrls();
            if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls2 != null) {
                int i3 = onActivityResized + 123;
                onMessageChannelReady = i3 % 128;
                int i4 = i3 % 2;
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls2.setVisibility(4);
                int i5 = onActivityResized + 55;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
            }
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View.ICustomTabsCallbackDefault();
            Intrinsics.checkNotNull(baseTextViewICustomTabsCallbackDefault);
            baseTextViewICustomTabsCallbackDefault.setSingleLine(false);
            BaseTextView baseTextViewICustomTabsCallbackDefault2 = tdsListRowV1View.ICustomTabsCallbackDefault();
            Intrinsics.checkNotNull(baseTextViewICustomTabsCallbackDefault2);
            baseTextViewICustomTabsCallbackDefault2.setMaxLines(10);
            int i8 = onMessageChannelReady + 23;
            onActivityResized = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        }

        public final TdsListRowV1View onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onMessageChannelReady + 109;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            TdsListRowV1View tdsListRowV1View = this.writeTypedObject;
            int i5 = i3 + 91;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
            return tdsListRowV1View;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[PHI: r4
          0x0045: PHI (r4v4 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View) = 
          (r4v3 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
          (r4v10 im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View)
         binds: [B:8:0x0043, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void IAuthTabCallback(@NotNull CharSequence charSequence, @NotNull View.OnClickListener onClickListener) {
            TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls;
            int i = 2 % 2;
            int i2 = onMessageChannelReady + 67;
            onActivityResized = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(onClickListener, "");
                this.writeTypedObject.setCenterText1(charSequence);
                this.writeTypedObject.setOnClickListener(onClickListener);
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls = this.writeTypedObject.prefetchWithMultipleUrls();
                int i3 = 90 / 0;
                if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setOnCheckedChangeListener(new Function2() { // from class: im.toss.uikit.widget.dialog.BottomSheetSelector$ItemViewHolder$$ExternalSyntheticLambda0
                        private static int IAuthTabCallback = 0;
                        private static int onWarmupCompleted = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = 2 % 2;
                            int i5 = onWarmupCompleted + 115;
                            IAuthTabCallback = i5 % 128;
                            TdsCheckBoxV2View tdsCheckBoxV2View = (TdsCheckBoxV2View) obj;
                            Boolean bool = (Boolean) obj2;
                            if (i5 % 2 == 0) {
                                return BrickModuleImplExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallback(tdsCheckBoxV2View, bool.booleanValue());
                            }
                            BrickModuleImplExternalSyntheticLambda1.onExtraCallbackWithResult.onExtraCallback(tdsCheckBoxV2View, bool.booleanValue());
                            throw null;
                        }
                    });
                }
            } else {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(onClickListener, "");
                this.writeTypedObject.setCenterText1(charSequence);
                this.writeTypedObject.setOnClickListener(onClickListener);
                tdsCheckBoxV2ViewPrefetchWithMultipleUrls = this.writeTypedObject.prefetchWithMultipleUrls();
                if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                }
            }
            int i4 = onMessageChannelReady + 103;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }

        private static final Unit onExtraCallbackWithResult(TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
            int i;
            int i2 = 2 % 2;
            int i3 = onActivityResized + 113;
            onMessageChannelReady = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
            if (z) {
                int i5 = onMessageChannelReady + 51;
                onActivityResized = i5 % 128;
                int i6 = i5 % 2;
                i = 0;
            } else {
                i = 4;
            }
            tdsCheckBoxV2View.setVisibility(i);
            return Unit.INSTANCE;
        }

        public final void onExtraCallbackWithResult(boolean z) {
            int i = 2 % 2;
            int i2 = onMessageChannelReady + Imgproc.COLOR_YUV2RGBA_YVYU;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                this.writeTypedObject.setRightCheckBoxChecked(z);
                if (z) {
                    int i3 = onActivityResized + 1;
                    onMessageChannelReady = i3 % 128;
                    int i4 = i3 % 2;
                    TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = this.writeTypedObject.prefetchWithMultipleUrls();
                    if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                        setProtocolsokhttp.onExtraCallbackWithResult(tdsCheckBoxV2ViewPrefetchWithMultipleUrls, true);
                        return;
                    }
                    return;
                }
                BaseTextView baseTextViewICustomTabsCallbackDefault = this.writeTypedObject.ICustomTabsCallbackDefault();
                if (baseTextViewICustomTabsCallbackDefault != null) {
                    setProtocolsokhttp.IAuthTabCallback(baseTextViewICustomTabsCallbackDefault, new Function2() { // from class: im.toss.uikit.widget.dialog.BottomSheetSelector$ItemViewHolder$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onExtraCallbackWithResult = 1;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = 2 % 2;
                            int i6 = IAuthTabCallback + 21;
                            onExtraCallbackWithResult = i6 % 128;
                            int i7 = i6 % 2;
                            Unit unitOnWarmupCompleted = BrickModuleImplExternalSyntheticLambda1.onExtraCallbackWithResult.onWarmupCompleted(this.f$0, (View) obj, (SuspendAnimationKtExternalSyntheticLambda4) obj2);
                            if (i7 == 0) {
                                int i8 = 46 / 0;
                            }
                            return unitOnWarmupCompleted;
                        }
                    });
                    return;
                }
                return;
            }
            this.writeTypedObject.setRightCheckBoxChecked(z);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final Unit onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult, View view, SuspendAnimationKtExternalSyntheticLambda4 suspendAnimationKtExternalSyntheticLambda4) {
            int i = 2 % 2;
            int i2 = onMessageChannelReady + 95;
            int i3 = i2 % 128;
            onActivityResized = i3;
            int i4 = i2 % 2;
            if (suspendAnimationKtExternalSyntheticLambda4 != null) {
                int i5 = i3 + 73;
                onMessageChannelReady = i5 % 128;
                int i6 = i5 % 2;
                Context context = onextracallbackwithresult.writeTypedObject.getContext();
                int i7 = R.string.app_bottom_sheet_selector_a11y_text;
                BaseTextView baseTextViewICustomTabsCallbackDefault = onextracallbackwithresult.writeTypedObject.ICustomTabsCallbackDefault();
                if (baseTextViewICustomTabsCallbackDefault != null) {
                    int i8 = onActivityResized + 37;
                    onMessageChannelReady = i8 % 128;
                    int i9 = i8 % 2;
                    Object text = baseTextViewICustomTabsCallbackDefault.getText();
                    if (text == null) {
                        text = _UrlKt.FRAGMENT_ENCODE_SET;
                    }
                    suspendAnimationKtExternalSyntheticLambda4.IAuthTabCallbackDefault(context.getString(i7, text));
                    int i10 = onActivityResized + 95;
                    onMessageChannelReady = i10 % 128;
                    int i11 = i10 % 2;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i12 = onActivityResized + 113;
            onMessageChannelReady = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallback_Parcel = 1;
        private ArrayList<CharSequence> IAuthTabCallback;
        private String IAuthTabCallbackStub;
        private boolean asBinder;
        private boolean asInterface;
        private String onExtraCallback;
        private float onExtraCallbackWithResult;
        private onExtraCallback onNavigationEvent;
        private int onTransact;
        private final Context onWarmupCompleted;

        public static /* synthetic */ Object onExtraCallback(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~i5;
            int i8 = ~i3;
            int i9 = i8 | i4;
            int i10 = (~(i7 | i8)) | (~(i7 | i4)) | (~i9);
            int i11 = ~i4;
            int i12 = (~(i3 | i11 | i5)) | (~(i7 | i11 | i8)) | (~(i9 | i5));
            int i13 = ~(i8 | i11 | i5);
            int i14 = i4 + i5 + i6 + ((-973178360) * i2) + (1542423572 * i);
            int i15 = i14 * i14;
            int i16 = (((-1657973228) * i4) - 1073741824) + ((-187520530) * i5) + ((-735226349) * i10) + (i12 * 735226349) + (735226349 * i13) + ((-922746880) * i6) + (1207959552 * i2) + ((-1275068416) * i) + (196542464 * i15);
            int i17 = (i4 * (-490823948)) + 944362368 + (i5 * (-490821954)) + (i10 * (-997)) + (i12 * 997) + (i13 * 997) + (i6 * (-490822951)) + (i2 * 2145288392) + (i * 779328756) + (i15 * (-1138819072));
            int i18 = i16 + (i17 * i17 * 1440284672);
            if (i18 == 1) {
                return onWarmupCompleted(objArr);
            }
            if (i18 == 2) {
                return onNavigationEvent(objArr);
            }
            int i19 = 2 % 2;
            BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1 = new BrickModuleImplExternalSyntheticLambda1((IAuthTabCallback) objArr[0]);
            int i20 = IAuthTabCallback_Parcel + 35;
            IAuthTabCallbackDefault = i20 % 128;
            int i21 = i20 % 2;
            return brickModuleImplExternalSyntheticLambda1;
        }

        public IAuthTabCallback(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            this.onWarmupCompleted = context;
            this.IAuthTabCallbackStub = _UrlKt.FRAGMENT_ENCODE_SET;
            this.onExtraCallback = _UrlKt.FRAGMENT_ENCODE_SET;
            this.asBinder = true;
            this.IAuthTabCallback = new ArrayList<>();
            this.onTransact = -1;
        }

        public final Context onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 19;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            Context context = this.onWarmupCompleted;
            int i5 = i2 + 1;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return context;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 79;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 91;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 83;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            String str = iAuthTabCallback.onExtraCallback;
            if (i3 != 0) {
                int i4 = 48 / 0;
            }
            return str;
        }

        public final boolean IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asBinder;
            }
            throw null;
        }

        public final boolean asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 87;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            boolean z = this.asInterface;
            int i5 = i3 + 55;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return z;
            }
            throw null;
        }

        public final ArrayList<CharSequence> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 11;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 45;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            int i5 = this.onTransact;
            int i6 = i3 + 63;
            IAuthTabCallbackDefault = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        public final onExtraCallback onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 13;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 25;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            int i5 = i3 + 3;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final IAuthTabCallback onExtraCallbackWithResult(@NotNull String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 85;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.IAuthTabCallbackStub = str;
                return this;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.IAuthTabCallbackStub = str;
            throw null;
        }

        public final IAuthTabCallback onExtraCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback_Parcel + 97;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String string = this.onWarmupCompleted.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "");
            this.IAuthTabCallbackStub = string;
            int i5 = IAuthTabCallbackDefault + 89;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) objArr[0];
            String str = (String) objArr[1];
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 25;
            IAuthTabCallbackDefault = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                iAuthTabCallback.onExtraCallback = str;
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            iAuthTabCallback.onExtraCallback = str;
            int i3 = IAuthTabCallbackDefault + 39;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return iAuthTabCallback;
            }
            obj.hashCode();
            throw null;
        }

        public final IAuthTabCallback onExtraCallback(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 57;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            this.asInterface = z;
            int i5 = i3 + 89;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final IAuthTabCallback onWarmupCompleted(boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 67;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            this.asBinder = z;
            int i5 = i3 + 15;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final IAuthTabCallback onExtraCallbackWithResult(@NotNull List<? extends CharSequence> list) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 99;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(list, "");
                this.IAuthTabCallback.addAll(list);
                return this;
            }
            Intrinsics.checkNotNullParameter(list, "");
            this.IAuthTabCallback.addAll(list);
            throw null;
        }

        public final IAuthTabCallback IAuthTabCallback(int i) {
            int i2 = 2 % 2;
            int i3 = IAuthTabCallbackDefault;
            int i4 = i3 + 1;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            this.onTransact = i;
            if (i5 == 0) {
                throw null;
            }
            int i6 = i3 + 29;
            IAuthTabCallback_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public static final class onExtraCallbackWithResult implements onExtraCallback {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            final /* synthetic */ Function1<Integer, Unit> IAuthTabCallback;

            /* JADX WARN: Multi-variable type inference failed */
            onExtraCallbackWithResult(Function1<? super Integer, Unit> function1) {
                this.IAuthTabCallback = function1;
            }

            @Override // o.BrickModuleImplExternalSyntheticLambda1.onExtraCallback
            public void onNavigationEvent(int i) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 79;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                this.IAuthTabCallback.invoke(Integer.valueOf(i));
                int i5 = onExtraCallback + 87;
                onNavigationEvent = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        public final IAuthTabCallback onExtraCallback(@NotNull Function1<? super Integer, Unit> function1) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(function1, "");
            this.onNavigationEvent = new onExtraCallbackWithResult(function1);
            int i2 = IAuthTabCallback_Parcel + 87;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final BrickModuleImplExternalSyntheticLambda1 access100() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 71;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 != 0) {
                int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
                int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
                ((BrickModuleImplExternalSyntheticLambda1) onExtraCallback(new Object[]{this}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2)).show();
                throw null;
            }
            int iOnNavigationEvent3 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent4 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            BrickModuleImplExternalSyntheticLambda1 brickModuleImplExternalSyntheticLambda1 = (BrickModuleImplExternalSyntheticLambda1) onExtraCallback(new Object[]{this}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent3, -846891035, 846891035, iOnNavigationEvent4);
            brickModuleImplExternalSyntheticLambda1.show();
            int i3 = IAuthTabCallbackDefault + 67;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return brickModuleImplExternalSyntheticLambda1;
            }
            throw null;
        }

        public final BrickModuleImplExternalSyntheticLambda1 onWarmupCompleted() {
            int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            return (BrickModuleImplExternalSyntheticLambda1) onExtraCallback(new Object[]{this}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -846891035, 846891035, iOnNavigationEvent2);
        }

        public final IAuthTabCallback IAuthTabCallback(@NotNull String str) {
            int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            return (IAuthTabCallback) onExtraCallback(new Object[]{this, str}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, 1714726609, -1714726608, iOnNavigationEvent2);
        }

        public final String IAuthTabCallback() {
            int iOnNavigationEvent = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            int iOnNavigationEvent2 = AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent();
            return (String) onExtraCallback(new Object[]{this}, AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$$ExternalSyntheticLambda18.onNavigationEvent(), iOnNavigationEvent, -1450773159, 1450773161, iOnNavigationEvent2);
        }
    }
}
