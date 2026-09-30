package viva.republica.toss.common.password;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import im.toss.base.BaseFragment;
import im.toss.tds.view.component.atom.image.TdsImageView;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.atom.text.Typography1;
import im.toss.tds.view.component.atom.text.Typography3;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import net.sf.scuba.smartcards.BuildConfig;
import o.BaseRoundCornerProgressBar1;
import o.EmbeddingAdapterExternalSyntheticLambda1;
import o.GetCmpRetunrnValue;
import o.GraniteBrownfieldModule_closeView;
import o.PageContext;
import o.PageKey;
import o.addAllCommandLine;
import o.getUrlokhttp;
import o.isOneShot;
import o.noStore;
import o.preFillDefault;
import o.setBodyokhttp;
import o.setMax;
import o.setVisitUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.R;

@EmbeddingAdapterExternalSyntheticLambda1
/* loaded from: /tmp/toss_alldex/classes30.dex */
public abstract class AbsInputPasswordFragment extends BaseFragment {
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new PropertyReference1Impl<>(AbsInputPasswordFragment.class, "binding", "getBinding()Lviva/republica/toss/databinding/FragmentAbsPasswordInputBinding;", 0)};
    public static final int onExtraCallback = 8;
    private final Lazy IAuthTabCallbackStub;
    private final List<Integer> asInterface;
    private final Lazy onExtraCallbackWithResult;
    private final ArrayList<BaseRoundCornerProgressBar1> onNavigationEvent;
    private final PageContext onWarmupCompleted;

    public abstract int onWarmupCompleted();

    public AbsInputPasswordFragment() {
        super(R.layout.fragment_abs_password_input);
        this.onWarmupCompleted = preFillDefault.onExtraCallbackWithResult(this, onNavigationEvent.onExtraCallback);
        this.asInterface = CollectionsKt.listOf(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        this.onNavigationEvent = new ArrayList<>();
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.password.AbsInputPasswordFragment$$ExternalSyntheticLambda1
            public final Object invoke() {
                return AbsInputPasswordFragment.onWarmupCompleted(this.f$0);
            }
        });
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.common.password.AbsInputPasswordFragment$$ExternalSyntheticLambda2
            public final Object invoke() {
                return AbsInputPasswordFragment.onNavigationEvent(this.f$0);
            }
        });
    }

    static final /* synthetic */ class onNavigationEvent extends FunctionReferenceImpl implements Function1<View, GetCmpRetunrnValue> {
        public static final onNavigationEvent onExtraCallback = new onNavigationEvent();

        onNavigationEvent() {
            super(1, GetCmpRetunrnValue.class, "bind", "bind(Landroid/view/View;)Lviva/republica/toss/databinding/FragmentAbsPasswordInputBinding;", 0);
        }

        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public final GetCmpRetunrnValue invoke(View view) {
            Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
            return GetCmpRetunrnValue.IAuthTabCallback(view);
        }
    }

    protected final GetCmpRetunrnValue IAuthTabCallback() {
        return (GetCmpRetunrnValue) this.onWarmupCompleted.onExtraCallbackWithResult(this, IAuthTabCallback[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onWarmupCompleted(AbsInputPasswordFragment absInputPasswordFragment) {
        return CollectionsKt.listOf(new Typography1[]{absInputPasswordFragment.IAuthTabCallback().onExtraCallback, absInputPasswordFragment.IAuthTabCallback().onNavigationEvent, absInputPasswordFragment.IAuthTabCallback().onExtraCallbackWithResult, absInputPasswordFragment.IAuthTabCallback().IAuthTabCallbackDefault, absInputPasswordFragment.IAuthTabCallback().asInterface, absInputPasswordFragment.IAuthTabCallback().asBinder, absInputPasswordFragment.IAuthTabCallback().IAuthTabCallbackStub, absInputPasswordFragment.IAuthTabCallback().onTransact, absInputPasswordFragment.IAuthTabCallback().access000, absInputPasswordFragment.IAuthTabCallback().onWarmupCompleted});
    }

    private final List<Typography3> onNavigationEvent() {
        return (List) this.IAuthTabCallbackStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onNavigationEvent(AbsInputPasswordFragment absInputPasswordFragment) {
        return CollectionsKt.listOf(new Typography3[]{absInputPasswordFragment.IAuthTabCallback().writeTypedObject, absInputPasswordFragment.IAuthTabCallback().onMessageChannelReady, absInputPasswordFragment.IAuthTabCallback().onActivityLayout, absInputPasswordFragment.IAuthTabCallback().onPostMessage, absInputPasswordFragment.IAuthTabCallback().onMinimized, absInputPasswordFragment.IAuthTabCallback().onActivityResized});
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, BuildConfig.FLAVOR);
        super.onViewCreated(view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(AbsInputPasswordFragment absInputPasswordFragment, View view) {
        Intrinsics.checkNotNull(view, BuildConfig.FLAVOR);
        CharSequence text = ((BaseTextView) view).getText();
        Intrinsics.checkNotNullExpressionValue(text, BuildConfig.FLAVOR);
        absInputPasswordFragment.IAuthTabCallback(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallback(AbsInputPasswordFragment absInputPasswordFragment, View view) {
        absInputPasswordFragment.onExtraCallbackWithResult();
    }

    public void IAuthTabCallback(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, BuildConfig.FLAVOR);
        if (this.onNavigationEvent.size() == onWarmupCompleted()) {
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        this.onNavigationEvent.add(new BaseRoundCornerProgressBar1(charSequence));
        TdsImageView tdsImageView = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        tdsImageView.setVisibility(this.onNavigationEvent.isEmpty() ? 4 : 0);
        onTransact();
    }

    public void onExtraCallbackWithResult() {
        if (this.onNavigationEvent.size() == 0) {
            return;
        }
        isOneShot.onExtraCallbackWithResult(this, noStore.Companion.asBinder());
        int lastIndex = CollectionsKt.getLastIndex(this.onNavigationEvent);
        Typography3 typography3 = onNavigationEvent().get(lastIndex);
        Intrinsics.checkNotNullExpressionValue(typography3, BuildConfig.FLAVOR);
        Typography3 typography32 = typography3;
        typography32.setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{setBodyokhttp.onExtraCallback(this)}, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        typography32.setContentDescription(getString(R.string.app_common_password___e445d6d193, new Object[]{Integer.valueOf(lastIndex + 1)}));
        this.onNavigationEvent.remove(lastIndex);
        TdsImageView tdsImageView = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        tdsImageView.setVisibility(this.onNavigationEvent.isEmpty() ? 4 : 0);
        IAuthTabCallback().access100.announceForAccessibility(getString(R.string.app_common_password___1b56688847, new Object[]{Integer.valueOf(this.onNavigationEvent.size())}));
    }

    private final void onTransact() {
        Typography3 typography3 = onNavigationEvent().get(CollectionsKt.getLastIndex(this.onNavigationEvent));
        Intrinsics.checkNotNullExpressionValue(typography3, BuildConfig.FLAVOR);
        final Typography3 typography32 = typography3;
        typography32.setTextColor(setBodyokhttp.onExtraCallback(this).onUnminimized());
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.common.password.AbsInputPasswordFragment$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AbsInputPasswordFragment.onWarmupCompleted(valueAnimatorOfFloat, typography32, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.start();
        if (this.onNavigationEvent.size() == onWarmupCompleted()) {
            ArrayList<BaseRoundCornerProgressBar1> arrayList = this.onNavigationEvent;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(PageKey.onWarmupCompleted((CharSequence) it.next(), (Charset) null, 1, (Object) null));
            }
            Iterator it2 = arrayList2.iterator();
            if (!it2.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = ArraysKt.plus((byte[]) next, (byte[]) it2.next());
            }
            new GraniteBrownfieldModule_closeView((byte[]) next);
            IAuthTabCallback().onRelationshipValidationResult.isChecked();
            onExtraCallback();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onWarmupCompleted(ValueAnimator valueAnimator, Typography3 typography3, ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, BuildConfig.FLAVOR);
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, BuildConfig.FLAVOR);
        float fFloatValue = ((Float) animatedValue).floatValue();
        typography3.setScaleX(fFloatValue);
        typography3.setScaleY(fFloatValue);
    }

    protected final void onExtraCallback() {
        Iterator<T> it = this.onNavigationEvent.iterator();
        while (it.hasNext()) {
            ((setMax) it.next()).destroy();
        }
        this.onNavigationEvent.clear();
        Iterator<T> it2 = onNavigationEvent().iterator();
        while (it2.hasNext()) {
            ((Typography3) it2.next()).setTextColor(((Integer) getUrlokhttp.onNavigationEvent(new Object[]{setBodyokhttp.onExtraCallback(this)}, -1252317281, 1252317293, setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult(), setVisitUrl.onExtraCallbackWithResult())).intValue());
        }
        TdsImageView tdsImageView = IAuthTabCallback().IAuthTabCallback;
        Intrinsics.checkNotNullExpressionValue(tdsImageView, BuildConfig.FLAVOR);
        tdsImageView.setVisibility(this.onNavigationEvent.isEmpty() ? 4 : 0);
    }
}
