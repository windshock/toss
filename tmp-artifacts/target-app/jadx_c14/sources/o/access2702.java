package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.edoc.register.AptPasswordActivity$;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.tds.view.component.atom.checkbox.TdsCheckBoxV2View;
import im.toss.tds.view.component.atom.text.BaseTextView;
import im.toss.tds.view.component.compound.listrow.TdsListRowV1View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver2;
import o.SuspendAnimationKtExternalSyntheticLambda4;
import o.access2702;
import o.access502;
import o.formatToParts;
import org.jetbrains.annotations.NotNull;
import viva.republica.toss.R;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class access2702 {
    private final boolean IAuthTabCallbackDefault;
    private final Function1<RecyclerView.ViewHolder, Unit> IAuthTabCallbackStub;
    private final onExtraCallback asBinder;
    private final Lazy onExtraCallback;
    private final Function2<AppMsgReceiver2<formatToParts>, formatToParts, Unit> onNavigationEvent;
    private final exitAllPages<NativeKeyboardObserverSpec> onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;
    private static final int IAuthTabCallback = R.layout.item_tds_list_row_v1;

    public interface onExtraCallback {
        boolean IAuthTabCallback(@NotNull formatToParts formattoparts);

        void onExtraCallback(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts);

        default void onExtraCallbackWithResult(@NotNull formatToParts formattoparts) {
            Intrinsics.checkNotNullParameter(formattoparts, "");
        }

        default void onNavigationEvent(@NotNull formatToParts formattoparts) {
            Intrinsics.checkNotNullParameter(formattoparts, "");
        }

        void onWarmupCompleted(@NotNull NativeVibrationSpec nativeVibrationSpec, @NotNull formatToParts formattoparts);

        default boolean setEngagementSignalsCallback() {
            return true;
        }
    }

    public static final class onExtraCallbackWithResult implements Function1<Object, Boolean> {
        public static final onExtraCallbackWithResult onExtraCallback = new onExtraCallbackWithResult();

        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return Boolean.valueOf(obj instanceof formatToParts);
        }
    }

    public static final class IAuthTabCallback implements getAdService {
        final /* synthetic */ Configuration onExtraCallback;

        public IAuthTabCallback(Configuration configuration) {
            this.onExtraCallback = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onExtraCallback) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public access2702(@NotNull exitAllPages<NativeKeyboardObserverSpec> exitallpages, @NotNull onExtraCallback onextracallback, boolean z) {
        Intrinsics.checkNotNullParameter(exitallpages, "");
        Intrinsics.checkNotNullParameter(onextracallback, "");
        this.onWarmupCompleted = exitallpages;
        this.asBinder = onextracallback;
        this.IAuthTabCallbackDefault = z;
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda0
            public final Object invoke() {
                return access2702.onWarmupCompleted();
            }
        });
        this.IAuthTabCallbackStub = new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda1
            public final Object invoke(Object obj) {
                return access2702.onExtraCallback(this.f$0, (RecyclerView.ViewHolder) obj);
            }
        };
        this.onNavigationEvent = new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda2
            public final Object invoke(Object obj, Object obj2) {
                return access2702.onWarmupCompleted(this.f$0, (AppMsgReceiver2) obj, (formatToParts) obj2);
            }
        };
    }

    private final Map<String, AnimatorSet> onExtraCallback() {
        return (Map) this.onExtraCallback.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map onWarmupCompleted() {
        return new LinkedHashMap();
    }

    private final boolean onExtraCallbackWithResult() {
        return this.asBinder.setEngagementSignalsCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(access2702 access2702Var, RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        TdsListRowV1View tdsListRowV1View = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        tdsListRowV1View2.setCenterType(TdsListRowV1View.onExtraCallbackWithResult.ROW3A);
        if (access2702Var.onExtraCallbackWithResult()) {
            SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback iAuthTabCallback = SuspendAnimationKtExternalSyntheticLambda4.IAuthTabCallback.extraCallback;
            Intrinsics.checkNotNullExpressionValue(iAuthTabCallback, "");
            setProtocolsokhttp.IAuthTabCallback(tdsListRowV1View2, iAuthTabCallback, tdsListRowV1View2.getContext().getString(R.string.home_transaction_more_options));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onWarmupCompleted(final access2702 access2702Var, AppMsgReceiver2 appMsgReceiver2, final formatToParts formattoparts) {
        AnimatorSet animatorSet;
        Intrinsics.checkNotNullParameter(appMsgReceiver2, "");
        Intrinsics.checkNotNullParameter(formattoparts, "");
        TdsListRowV1View tdsListRowV1View = ((RecyclerView.ViewHolder) appMsgReceiver2).onNavigationEvent;
        Intrinsics.checkNotNull(tdsListRowV1View, "");
        final TdsListRowV1View tdsListRowV1View2 = tdsListRowV1View;
        TdsListRowV1View.asBinder asbinder = TdsListRowV1View.asBinder.NONE;
        tdsListRowV1View2.setRightType(asbinder);
        if (formattoparts.extraCallback().length() > 0) {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.LOTTIE);
            tdsListRowV1View2.setLeftLottieSize(varyMatches.IAuthTabCallback(tdsListRowV1View2, 40), varyMatches.IAuthTabCallback(tdsListRowV1View2, 40));
            String strExtraCallback = formattoparts.extraCallback();
            Integer typedObject = formattoparts.readTypedObject();
            tdsListRowV1View2.setLeftLottieUrl(strExtraCallback, typedObject != null ? typedObject.intValue() : 0);
        } else {
            tdsListRowV1View2.setLeftType(TdsListRowV1View.asInterface.IMAGE);
            UST_PKCS12_MakePFX.onExtraCallbackWithResult(tdsListRowV1View2, (String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1318563469, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1318563469, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()), false, 0, 8, null);
        }
        if (formattoparts.asBinder() != null) {
            tdsListRowV1View2.setCenterText1(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(formattoparts.asBinder().onExtraCallbackWithResult(), false, 1, (Object) null));
            BaseTextView baseTextViewICustomTabsCallbackDefault = tdsListRowV1View2.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault != null) {
                baseTextViewICustomTabsCallbackDefault.setContentDescription(formattoparts.asBinder().asInterface());
            }
            String strOnNavigationEvent = formattoparts.asBinder().onNavigationEvent();
            tdsListRowV1View2.setCenterText2(strOnNavigationEvent != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnNavigationEvent, false, 1, (Object) null) : null);
            BaseTextView baseTextViewICustomTabsCallbackStubProxy = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy != null) {
                baseTextViewICustomTabsCallbackStubProxy.setContentDescription(formattoparts.asBinder().onWarmupCompleted());
            }
            String strOnExtraCallback = formattoparts.asBinder().onExtraCallback();
            tdsListRowV1View2.setCenterText3(strOnExtraCallback != null ? BrickModulesListExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallback, false, 1, (Object) null) : null);
            BaseTextView baseTextViewOnUnminimized = tdsListRowV1View2.onUnminimized();
            if (baseTextViewOnUnminimized != null) {
                baseTextViewOnUnminimized.setContentDescription(formattoparts.asBinder().IAuthTabCallback());
            }
        } else {
            Resources resources = tdsListRowV1View2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            tdsListRowV1View2.setCenterText1((CharSequence) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 308134300, new Object[]{formattoparts, resources}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -308134296, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()));
            BaseTextView baseTextViewICustomTabsCallbackDefault2 = tdsListRowV1View2.ICustomTabsCallbackDefault();
            if (baseTextViewICustomTabsCallbackDefault2 != null) {
                baseTextViewICustomTabsCallbackDefault2.setContentDescription((String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -884344756, new Object[]{formattoparts, tdsListRowV1View2.getContext()}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 884344765, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()));
            }
            tdsListRowV1View2.setCenterText2(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(formattoparts.ICustomTabsService(), false, 1, (Object) null));
            BaseTextView baseTextViewICustomTabsCallbackStubProxy2 = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
            if (baseTextViewICustomTabsCallbackStubProxy2 != null) {
                baseTextViewICustomTabsCallbackStubProxy2.setContentDescription(BrickModulesListExternalSyntheticLambda0.onNavigationEvent(formattoparts.ICustomTabsService(), false, 1, (Object) null).toString());
            }
            tdsListRowV1View2.setCenterText3(BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1286342047, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1286342049, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()), false, 1, (Object) null));
            BaseTextView baseTextViewOnUnminimized2 = tdsListRowV1View2.onUnminimized();
            if (baseTextViewOnUnminimized2 != null) {
                baseTextViewOnUnminimized2.setContentDescription(BrickModulesListExternalSyntheticLambda0.onNavigationEvent((String) formatToParts.onWarmupCompleted(AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), -1286342047, new Object[]{formattoparts}, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted(), 1286342049, AptPasswordActivity$.ExternalSyntheticLambda5.onWarmupCompleted()), false, 1, (Object) null).toString());
            }
            setDoubleTapZoomDpi setdoubletapzoomdpi = setDoubleTapZoomDpi.IAuthTabCallback;
            Resources resources2 = tdsListRowV1View2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            tdsListRowV1View2.setCenterText1Color(setdoubletapzoomdpi.onNavigationEvent(formattoparts, resources2));
            Resources resources3 = tdsListRowV1View2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "");
            tdsListRowV1View2.setCenterText2Color(setdoubletapzoomdpi.IAuthTabCallback(formattoparts, resources3));
            Resources resources4 = tdsListRowV1View2.getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "");
            tdsListRowV1View2.setCenterText3Color(setdoubletapzoomdpi.onExtraCallbackWithResult(formattoparts, resources4));
        }
        if (formattoparts.newSessionWithExtras()) {
            BaseTextView baseTextViewICustomTabsCallbackStubProxy3 = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
            Intrinsics.checkNotNull(baseTextViewICustomTabsCallbackStubProxy3);
            transparentBackground.IAuthTabCallback(baseTextViewICustomTabsCallbackStubProxy3);
        } else {
            BaseTextView baseTextViewICustomTabsCallbackStubProxy4 = tdsListRowV1View2.ICustomTabsCallbackStubProxy();
            Intrinsics.checkNotNull(baseTextViewICustomTabsCallbackStubProxy4);
            transparentBackground.onNavigationEvent(baseTextViewICustomTabsCallbackStubProxy4, im.toss.uikit.R.drawable.timeline_row_error, varyMatches.IAuthTabCallback(tdsListRowV1View2, 16));
        }
        final NativeVibrationSpec nativeVibrationSpecIAuthTabCallbackStub = formattoparts.IAuthTabCallbackStub();
        if (nativeVibrationSpecIAuthTabCallbackStub != null) {
            tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.BUTTON);
            tdsListRowV1View2.setRightButtonTheme(new TdsButtonV1View.asInterface(TdsButtonV1View.IAuthTabCallbackStub.PRIMARY, TdsButtonV1View.IAuthTabCallbackDefault.WEAK, TdsButtonV1View.onWarmupCompleted.SMALL, (TdsButtonV1View.IAuthTabCallback) null, 8, (DefaultConstructorMarker) null));
            tdsListRowV1View2.setRightButtonLabel(nativeVibrationSpecIAuthTabCallbackStub.IAuthTabCallbackDefault());
            tdsListRowV1View2.setRightOnButtonClickListener(new Function1() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda3
                public final Object invoke(Object obj) {
                    return access2702.onExtraCallback(this.f$0, nativeVibrationSpecIAuthTabCallbackStub, formattoparts, (View) obj);
                }
            });
        } else {
            tdsListRowV1View2.setRightType(asbinder);
        }
        if (formattoparts.newSession()) {
            tdsListRowV1View2.setEnabled(true);
            tdsListRowV1View2.setClickable(true);
            final NativeVibrationSpec nativeVibrationSpecOnTransact = formattoparts.onTransact();
            if (nativeVibrationSpecOnTransact != null) {
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        access2702.onNavigationEvent(this.f$0, nativeVibrationSpecOnTransact, formattoparts, view);
                    }
                });
            } else if (access2702Var.IAuthTabCallbackDefault) {
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        access2702.onExtraCallbackWithResult(this.f$0, formattoparts, view);
                    }
                });
            } else {
                tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
                tdsListRowV1View2.setClickable(false);
            }
            if (access2702Var.onExtraCallbackWithResult()) {
                tdsListRowV1View2.setOnLongClickListener(new View.OnLongClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda6
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return access2702.onExtraCallback(this.f$0, formattoparts, view);
                    }
                });
            } else {
                tdsListRowV1View2.setOnLongClickListener(null);
                tdsListRowV1View2.setLongClickable(false);
            }
        } else {
            tdsListRowV1View2.setLongClickable(false);
            if (formattoparts.setEngagementSignalsCallback()) {
                tdsListRowV1View2.setEnabled(true);
                tdsListRowV1View2.setClickable(true);
                tdsListRowV1View2.setRightType(TdsListRowV1View.asBinder.CHECK_BOX);
                tdsListRowV1View2.setRightCheckBoxChecked(formattoparts.requestPostMessageChannel());
                TdsCheckBoxV2View tdsCheckBoxV2ViewPrefetchWithMultipleUrls = tdsListRowV1View2.prefetchWithMultipleUrls();
                if (tdsCheckBoxV2ViewPrefetchWithMultipleUrls != null) {
                    tdsCheckBoxV2ViewPrefetchWithMultipleUrls.setOnCheckedChangeListener(new Function2() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda7
                        public final Object invoke(Object obj, Object obj2) {
                            return access2702.onExtraCallbackWithResult(formattoparts, tdsListRowV1View2, access2702Var, (TdsCheckBoxV2View) obj, ((Boolean) obj2).booleanValue());
                        }
                    });
                }
                tdsListRowV1View2.setOnClickListener(new View.OnClickListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        access2702.onExtraCallbackWithResult(tdsListRowV1View2, formattoparts, view);
                    }
                });
                tdsListRowV1View2.setOnLongClickListener(null);
            } else {
                tdsListRowV1View2.setEnabled(false);
                tdsListRowV1View2.setClickable(false);
                tdsListRowV1View2.setOnClickListener((View.OnClickListener) null);
                tdsListRowV1View2.setOnLongClickListener(null);
            }
        }
        String str = formattoparts.mayLaunchUrl() + ":" + formattoparts.writeTypedObject() + ":" + formattoparts.onWarmupCompleted();
        int i = R.id.animation;
        Object tag = tdsListRowV1View2.getTag(i);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 != null && !Intrinsics.areEqual(str2, str) && (animatorSet = access2702Var.onExtraCallback().get(str2)) != null) {
            animatorSet.cancel();
        }
        if (formattoparts.getInterfaceDescriptor() && !access2702Var.onExtraCallback().containsKey(str)) {
            tdsListRowV1View2.setTag(i, str);
            Context context = tdsListRowV1View2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            tdsListRowV1View2.setBackgroundColor(((Integer) setHeadersokhttp.onExtraCallbackWithResult(-552023978, matches.onExtraCallback(), matches.onExtraCallback(), new Object[]{new getUrlokhttp(new IAuthTabCallback(configuration)).requestPostMessageChannel()}, matches.onExtraCallback(), 552023983, matches.onExtraCallback())).intValue());
            Drawable background = tdsListRowV1View2.getBackground();
            if (background != null) {
                background.setAlpha(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setStartDelay(300L);
            animatorSet2.play(access2702Var.IAuthTabCallback(tdsListRowV1View2, 25, 0)).after(1500L).after(access2702Var.IAuthTabCallback(tdsListRowV1View2, 0, 25));
            animatorSet2.addListener(new onNavigationEvent(tdsListRowV1View2, tdsListRowV1View2));
            access2702Var.onExtraCallback().put(str, animatorSet2);
            animatorSet2.start();
        }
        return Unit.INSTANCE;
    }

    public static final class onNavigationEvent implements Animator.AnimatorListener {
        final /* synthetic */ TdsListRowV1View onExtraCallbackWithResult;
        final /* synthetic */ TdsListRowV1View onNavigationEvent;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        public onNavigationEvent(TdsListRowV1View tdsListRowV1View, TdsListRowV1View tdsListRowV1View2) {
            this.onNavigationEvent = tdsListRowV1View;
            this.onExtraCallbackWithResult = tdsListRowV1View2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.onNavigationEvent.setBackground(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.onExtraCallbackWithResult.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallback(access2702 access2702Var, NativeVibrationSpec nativeVibrationSpec, formatToParts formattoparts, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        access2702Var.asBinder.onWarmupCompleted(nativeVibrationSpec, formattoparts);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNavigationEvent(access2702 access2702Var, NativeVibrationSpec nativeVibrationSpec, formatToParts formattoparts, View view) {
        access2702Var.asBinder.onExtraCallback(nativeVibrationSpec, formattoparts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(access2702 access2702Var, formatToParts formattoparts, View view) {
        access2702Var.asBinder.onExtraCallbackWithResult(formattoparts);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(access2702 access2702Var, formatToParts formattoparts, View view) {
        access2702Var.asBinder.IAuthTabCallback(formattoparts);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onExtraCallbackWithResult(formatToParts formattoparts, TdsListRowV1View tdsListRowV1View, access2702 access2702Var, TdsCheckBoxV2View tdsCheckBoxV2View, boolean z) {
        Intrinsics.checkNotNullParameter(tdsCheckBoxV2View, "");
        formattoparts.onExtraCallbackWithResult(z);
        tdsListRowV1View.setSelected(z);
        access2702Var.asBinder.onNavigationEvent(formattoparts);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(TdsListRowV1View tdsListRowV1View, formatToParts formattoparts, View view) {
        tdsListRowV1View.setRightCheckBoxChecked(!formattoparts.requestPostMessageChannel());
    }

    private final Animator IAuthTabCallback(final View view, int... iArr) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(Arrays.copyOf(iArr, iArr.length));
        valueAnimatorOfInt.setDuration(700L);
        valueAnimatorOfInt.setInterpolator(TransitionKtExternalSyntheticLambda2.IAuthTabCallback(0.42f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: viva.republica.toss.home.consumption.transaction.delegate.TransactionDelegate$$ExternalSyntheticLambda9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                access2702.onExtraCallbackWithResult(view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(View view, ValueAnimator valueAnimator) {
        Drawable background;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        if (view == null || (background = view.getBackground()) == null) {
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        background.setAlpha(((Integer) animatedValue).intValue());
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final access502<formatToParts, NativeKeyboardObserverSpec> IAuthTabCallback() {
        return new access502.onNavigationEvent().onExtraCallbackWithResult(onExtraCallbackWithResult.onExtraCallback).onNavigationEvent(IAuthTabCallback).onNavigationEvent(this.IAuthTabCallbackStub).onExtraCallback(this.onNavigationEvent).IAuthTabCallback();
    }
}
