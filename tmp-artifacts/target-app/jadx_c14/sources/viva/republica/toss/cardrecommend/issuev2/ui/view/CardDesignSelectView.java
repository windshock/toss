package viva.republica.toss.cardrecommend.issuev2.ui.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import androidx.constraintlayout.widget.ConstraintLayout;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.uikit.drawable.RotateTransformation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RecomposerawaitIdle2;
import o.RecomposerrecompositionRunner2;
import o.SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1;
import o.addSigner;
import o.getProcessNameAPI28;
import o.setProtocolsokhttp;
import o.varyMatches;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class CardDesignSelectView extends ConstraintLayout {
    private getProcessNameAPI28 onExtraCallback;
    private final addSigner onNavigationEvent;
    private static final byte[] $$a = {77, -64, 102, Byte.MIN_VALUE};
    private static final int $$b = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int onExtraCallbackWithResult = 0;
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted = 478308968;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, int r7, short r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 105
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = viva.republica.toss.cardrecommend.issuev2.ui.view.CardDesignSelectView.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.view.CardDesignSelectView.$$c(byte, int, short):java.lang.String");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardDesignSelectView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardDesignSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardDesignSelectView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) throws Throwable {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        addSigner addsignerOnExtraCallback = addSigner.onExtraCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(addsignerOnExtraCallback, "");
        this.onNavigationEvent = addsignerOnExtraCallback;
        setClipChildren(false);
        setSelected(false);
        TdsImageView tdsImageView = addsignerOnExtraCallback.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20, new char[]{26, 65489, 11, 5, 17, 16, 65487, 5, '\n', 7, 5, '\r', 65487, '\b', 11, 14, 14, 65488, 18, 16, '\t', '\n', 22, 22, 18, 21, 65500, 65489, 65489, 21, 22, 3, 22, 11, 5, 65488, 22, 17, 21, 21, 65488, 11, 15, 65489, 11, 5, 17, 16, 21, 65489, 18, 16, '\t', 65489, 65494}, false, 160 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        TdsImageView.setImage$default(tdsImageView, ((String) objArr[0]).intern(), (Function1) null, (Function1) null, 6, (Object) null);
        setProtocolsokhttp.onExtraCallbackWithResult(this, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CardDesignSelectView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 2) != 0) {
            int i3 = IAuthTabCallback + 117;
            onExtraCallbackWithResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            int i6 = onExtraCallbackWithResult;
            int i7 = i6 + 13;
            IAuthTabCallback = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 23;
            IAuthTabCallback = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 2 % 2;
            }
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final getProcessNameAPI28 onWarmupCompleted() {
        getProcessNameAPI28 getprocessnameapi28;
        int i = 2 % 2;
        int i2 = IAuthTabCallback;
        int i3 = i2 + 113;
        onExtraCallbackWithResult = i3 % 128;
        if (i3 % 2 != 0) {
            getprocessnameapi28 = this.onExtraCallback;
            int i4 = 6 / 0;
        } else {
            getprocessnameapi28 = this.onExtraCallback;
        }
        int i5 = i2 + 55;
        onExtraCallbackWithResult = i5 % 128;
        if (i5 % 2 == 0) {
            return getprocessnameapi28;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCurrentCard(@Nullable getProcessNameAPI28 getprocessnameapi28) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 73;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = getprocessnameapi28;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 47;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        super/*android.view.View*/.setSelected(z);
        if (z) {
            this.onNavigationEvent.IAuthTabCallback.setBackgroundResource(R.drawable.bg_card_design_select);
            this.onNavigationEvent.onWarmupCompleted.setVisibility(0);
            return;
        }
        this.onNavigationEvent.IAuthTabCallback.setBackgroundResource(0);
        this.onNavigationEvent.onWarmupCompleted.setVisibility(4);
        int i4 = IAuthTabCallback + 89;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCard(@NotNull getProcessNameAPI28 getprocessnameapi28) {
        float f;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(getprocessnameapi28, "");
        this.onExtraCallback = getprocessnameapi28;
        TdsImageView tdsImageView = this.onNavigationEvent.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, "");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback = new RecomposerawaitIdle2.onNavigationEvent(context).onExtraCallback(getprocessnameapi28.onWarmupCompleted().onNavigationEvent());
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "");
        int iOnNavigationEvent = varyMatches.onNavigationEvent(60, displayMetrics);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "");
        RecomposerawaitIdle2.onNavigationEvent onnavigationeventOnExtraCallback2 = onnavigationeventOnExtraCallback.onExtraCallback(iOnNavigationEvent, varyMatches.onNavigationEvent(90, displayMetrics2));
        if (getprocessnameapi28.onWarmupCompleted().IAuthTabCallback()) {
            int i2 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            f = 90.0f;
        } else {
            int i4 = IAuthTabCallback + 57;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            f = 0.0f;
        }
        TdsImageView.setImage$default(tdsImageView, RecomposerrecompositionRunner2.IAuthTabCallback(onnavigationeventOnExtraCallback2, new SingleSubscriptionSnapshotFlowManagerExternalSyntheticLambda1[]{new RotateTransformation(f)}), (Function1) null, (Function1) null, 6, (Object) null);
        setContentDescription(getContext().getString(R.string.card_design_image_description, getprocessnameapi28.IAuthTabCallback()));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r23, int r24, char[] r25, boolean r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: viva.republica.toss.cardrecommend.issuev2.ui.view.CardDesignSelectView.a(int, int, char[], boolean, int, java.lang.Object[]):void");
    }
}
