package o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import im.toss.features.mydata.ui.funnel.viewmodel.MydataRegisterLoadAllIntroViewModel;
import im.toss.features.tosscert.ui.R;
import im.toss.global.features.kyc.eu.main.cdd.ui.identity_confirm.GlobalKycEuIdentityConfirmViewModel;
import im.toss.tds.foundation.anim.rally.Rally;
import im.toss.tds.foundation.anim.rally.RallysKt;
import im.toss.uikit.widget.NumpadView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import o.importAppCert;
import o.noStore;
import o.pxToDp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class importAppCert {
    private List<String> IAuthTabCallback;
    private List<Integer> IAuthTabCallbackStub;
    private final int asInterface;
    private final Integer onExtraCallback;
    private final boolean onExtraCallbackWithResult;
    private int onNavigationEvent;
    private runOnUiThreadDelayed onTransact;
    private final Context onWarmupCompleted;

    public static final class onExtraCallback implements getAdService {
        final /* synthetic */ Configuration onNavigationEvent;

        public onExtraCallback(Configuration configuration) {
            this.onNavigationEvent = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            return readIntokhttp.onExtraCallback(this.onNavigationEvent) ? getSpecialFeatureOptInStatus.Dark : getSpecialFeatureOptInStatus.Light;
        }
    }

    public importAppCert(@NotNull Context context, boolean z, int i, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        this.onWarmupCompleted = context;
        this.onExtraCallbackWithResult = z;
        this.asInterface = i;
        this.onExtraCallback = num;
        this.IAuthTabCallback = CollectionsKt__CollectionsKt.emptyList();
        this.onNavigationEvent = -1;
    }

    public final void onNavigationEvent(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.IAuthTabCallback = list;
    }

    public final void onExtraCallback(@NotNull final List<? extends TextView> list, @NotNull final Function2<? super Integer, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        final int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final TextView textView = (TextView) obj;
            if (this.onNavigationEvent == -1) {
                this.onNavigationEvent = textView.getTextColors().getDefaultColor();
            }
            final head headVarOnWarmupCompleted = NumpadView.IAuthTabCallback.onWarmupCompleted(NumpadView.Companion, textView, 0.0f, 2, null);
            textView.setBackground(onWarmupCompleted());
            textView.setOnClickListener(new View.OnClickListener() { // from class: util.KeyboardTouchManager$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    importAppCert.onExtraCallbackWithResult(function2, i, textView, view);
                }
            });
            final int i2 = i;
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: util.KeyboardTouchManager$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return importAppCert.onExtraCallback(this.f$0, list, function2, i2, textView, headVarOnWarmupCompleted, view, motionEvent);
                }
            });
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onExtraCallbackWithResult(Function2 function2, int i, TextView textView, View view) {
        function2.invoke(Integer.valueOf(i), textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onExtraCallback(importAppCert importappcert, List list, Function2 function2, int i, TextView textView, head headVar, View view, MotionEvent motionEvent) {
        TextView textView2 = view instanceof TextView ? (TextView) view : null;
        CharSequence text = textView2 != null ? textView2.getText() : null;
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            importappcert.IAuthTabCallbackStub = importappcert.onExtraCallback(importappcert.IAuthTabCallback, String.valueOf(text));
            Intrinsics.checkNotNull(motionEvent);
            importappcert.onExtraCallback((List<? extends TextView>) list, motionEvent);
        } else if (action == 1) {
            float width = view.getWidth();
            float x = motionEvent.getX();
            if (0.0f <= x && x <= width) {
                float height = view.getHeight();
                float y = motionEvent.getY();
                if (0.0f <= y && y <= height) {
                    Intrinsics.checkNotNull(view);
                    isOneShot.onExtraCallbackWithResult(view, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()));
                    function2.invoke(Integer.valueOf(i), textView);
                }
            }
            view.setPressed(false);
            Intrinsics.checkNotNull(motionEvent);
            importappcert.IAuthTabCallback((List<? extends TextView>) list, motionEvent);
        } else if (action == 3) {
            view.setPressed(false);
            Intrinsics.checkNotNull(motionEvent);
            importappcert.IAuthTabCallback((List<? extends TextView>) list, motionEvent);
        }
        headVar.onNavigationEvent(view.isPressed());
        Intrinsics.checkNotNull(motionEvent);
        headVar.onNavigationEvent(motionEvent);
        return true;
    }

    public final void IAuthTabCallback(@NotNull final View view, @NotNull final Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function1, "");
        view.setBackground(onWarmupCompleted());
        view.setOnClickListener(new View.OnClickListener() { // from class: util.KeyboardTouchManager$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                importAppCert.IAuthTabCallback(function1, view, view2);
            }
        });
        final head headVarOnWarmupCompleted = NumpadView.IAuthTabCallback.onWarmupCompleted(NumpadView.Companion, view, 0.0f, 2, null);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: util.KeyboardTouchManager$$ExternalSyntheticLambda3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return importAppCert.onWarmupCompleted(this.f$0, function1, headVarOnWarmupCompleted, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IAuthTabCallback(Function1 function1, View view, View view2) {
        function1.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onWarmupCompleted(importAppCert importappcert, Function1 function1, head headVar, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            view.getBackground().setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
            runOnUiThreadDelayed runonuithreaddelayed = importappcert.onTransact;
            if (runonuithreaddelayed != null) {
                runonuithreaddelayed.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback = pxToDp.IAuthTabCallback.onExtraCallback;
            Intrinsics.checkNotNull(view);
            importappcert.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback, CollectionsKt__CollectionsJVMKt.listOf(importappcert.onNavigationEvent(view)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        } else if (action == 1) {
            float width = view.getWidth();
            float x = motionEvent.getX();
            if (0.0f <= x && x <= width) {
                float height = view.getHeight();
                float y = motionEvent.getY();
                if (0.0f <= y && y <= height) {
                    Intrinsics.checkNotNull(view);
                    isOneShot.onExtraCallbackWithResult(view, (noStore) noStore.onExtraCallback.onWarmupCompleted(new Object[]{noStore.Companion}, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), 47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), -47463863, GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted(), GlobalKycEuIdentityConfirmViewModel.onWarmupCompleted.onWarmupCompleted()));
                    function1.invoke(view);
                }
            }
            view.setPressed(false);
            view.getBackground().setState(new int[0]);
            runOnUiThreadDelayed runonuithreaddelayed2 = importappcert.onTransact;
            if (runonuithreaddelayed2 != null) {
                runonuithreaddelayed2.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback2 = pxToDp.IAuthTabCallback.onExtraCallback;
            Intrinsics.checkNotNull(view);
            importappcert.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback2, CollectionsKt__CollectionsJVMKt.listOf(importappcert.IAuthTabCallback(view)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        } else if (action == 3) {
            view.setPressed(false);
            view.getBackground().setState(new int[0]);
            runOnUiThreadDelayed runonuithreaddelayed3 = importappcert.onTransact;
            if (runonuithreaddelayed3 != null) {
                runonuithreaddelayed3.onNavigationEvent();
            }
            pxToDp.IAuthTabCallback iAuthTabCallback3 = pxToDp.IAuthTabCallback.onExtraCallback;
            Intrinsics.checkNotNull(view);
            importappcert.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, iAuthTabCallback3, CollectionsKt__CollectionsJVMKt.listOf(importappcert.IAuthTabCallback(view)), 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        }
        headVar.onNavigationEvent(view.isPressed());
        Intrinsics.checkNotNull(motionEvent);
        headVar.onNavigationEvent(motionEvent);
        return true;
    }

    private final void IAuthTabCallback(List<? extends TextView> list, MotionEvent motionEvent) {
        runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) obj;
            textView.getBackground().setState(new int[0]);
            textView.setPressed(false);
            List<Integer> list2 = this.IAuthTabCallbackStub;
            if (list2 != null) {
                List<Integer> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Number) it.next()).intValue() == i) {
                                arrayList.add(IAuthTabCallback(textView));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            if (textView.isPressed()) {
                head headVarOnWarmupCompleted = NumpadView.IAuthTabCallback.onWarmupCompleted(NumpadView.Companion, textView, 0.0f, 2, null);
                headVarOnWarmupCompleted.onNavigationEvent(textView.isPressed());
                headVarOnWarmupCompleted.onNavigationEvent(motionEvent);
            }
            i++;
        }
        this.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
        this.IAuthTabCallbackStub = null;
    }

    private final Rally IAuthTabCallback(View view) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.onWarmupCompleted()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.5f);
        return (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.IAuthTabCallback(isMuted.access000(isMuted.asInterface(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Integer) null, Integer.valueOf(this.onNavigationEvent), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
    }

    private final Rally onNavigationEvent(View view) {
        AppLovinSdkSettings appLovinSdkSettings = (AppLovinSdkSettings) RallysKt.onWarmupCompleted(new Object[]{deprecated_certificatePinner.onExtraCallbackWithResult.asInterface()}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -26725365, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 26725368);
        Float fValueOf = Float.valueOf(0.5f);
        AppLovinSdkSettings appLovinSdkSettingsAccess000 = isMuted.access000(isMuted.asInterface(appLovinSdkSettings, (Float) null, fValueOf, (Function1) null, 5, (Object) null), (Float) null, fValueOf, (Function1) null, 5, (Object) null);
        Integer num = this.onExtraCallback;
        return (Rally) RallysKt.onWarmupCompleted(new Object[]{view, isMuted.IAuthTabCallback(appLovinSdkSettingsAccess000, (Integer) null, Integer.valueOf(num != null ? num.intValue() : this.onNavigationEvent), (Function1) null, 5, (Object) null), 0, null, 0, null, null, null, 0, 0L, false, 2044, null}, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), -303858023, R.drawable.IAuthTabCallback(), R.drawable.IAuthTabCallback(), 303858025);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback(List<? extends TextView> list, MotionEvent motionEvent) {
        if (this.IAuthTabCallbackStub == null || !(!r1.isEmpty())) {
            return;
        }
        runOnUiThreadDelayed runonuithreaddelayed = this.onTransact;
        if (runonuithreaddelayed != null) {
            runonuithreaddelayed.onNavigationEvent();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) obj;
            List<Integer> list2 = this.IAuthTabCallbackStub;
            if (list2 != null) {
                List<Integer> list3 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    textView.getBackground().setState(new int[0]);
                    textView.setPressed(false);
                } else {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() == i) {
                            head headVarOnWarmupCompleted = NumpadView.IAuthTabCallback.onWarmupCompleted(NumpadView.Companion, textView, 0.0f, 2, null);
                            arrayList.add(onNavigationEvent(textView));
                            textView.getBackground().setState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled});
                            textView.setPressed(true);
                            headVarOnWarmupCompleted.onNavigationEvent(true);
                            headVarOnWarmupCompleted.onNavigationEvent(motionEvent);
                            break;
                        }
                    }
                    textView.getBackground().setState(new int[0]);
                    textView.setPressed(false);
                }
            }
            i++;
        }
        this.onTransact = isFireOS.onExtraCallbackWithResult(RallysKt.onWarmupCompleted((View) null, pxToDp.IAuthTabCallback.onExtraCallback, arrayList, 0, (getExtraParameters) null, 0, (Interpolator) null, (Integer) null, (Boolean) null, 0, 0L, false, 4089, (Object) null), false, 1, (Object) null);
    }

    private final Drawable onWarmupCompleted() {
        M_ m_ = M_.onExtraCallback;
        Context context = this.onWarmupCompleted;
        Intrinsics.checkNotNullExpressionValue(context.getResources().getDisplayMetrics(), "");
        RippleDrawable rippleDrawable = (deprecated_minFreshSeconds) M_.onNavigationEvent(-556734050, new Object[]{m_, context, Float.valueOf(varyMatches.onNavigationEvent(20, r2))}, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), 556734051, MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent(), MydataRegisterLoadAllIntroViewModel.onExtraCallbackWithResult.IAuthTabCallback.onNavigationEvent());
        RippleDrawable rippleDrawable2 = rippleDrawable != null ? rippleDrawable : null;
        if (rippleDrawable2 != null) {
            rippleDrawable2.setColor(ColorStateList.valueOf(this.asInterface));
        }
        return rippleDrawable;
    }

    private final List<Integer> onExtraCallback(List<String> list, String str) {
        int iIndexOf = list.indexOf(str);
        if (iIndexOf < 0) {
            return null;
        }
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(1, 1), new Pair(1, 2), new Pair(1, 3), new Pair(2, 1), new Pair(2, 2), new Pair(2, 3), new Pair(3, 1), new Pair(3, 2), new Pair(3, 3), new Pair(4, 2)});
        Pair pair = (Pair) listListOf.get(iIndexOf);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            Pair pair2 = (Pair) obj;
            int iAbs = Math.abs(((Number) pair.getFirst()).intValue() - ((Number) pair2.getFirst()).intValue());
            int iAbs2 = Math.abs(((Number) pair.getSecond()).intValue() - ((Number) pair2.getSecond()).intValue());
            if (iAbs > 1 || iAbs2 > 1 || (iAbs == 1 && iAbs2 == 1)) {
                arrayList.add(obj);
            }
        }
        int iIndexOf2 = listListOf.indexOf((Pair) CollectionsKt___CollectionsKt.random(arrayList, Random.onNavigationEvent));
        if (iIndexOf2 < 0) {
            return null;
        }
        Pair pair3 = (Pair) listListOf.get(iIndexOf2);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            Pair pair4 = (Pair) obj2;
            int iAbs3 = Math.abs(((Number) pair3.getFirst()).intValue() - ((Number) pair4.getFirst()).intValue());
            int iAbs4 = Math.abs(((Number) pair3.getSecond()).intValue() - ((Number) pair4.getSecond()).intValue());
            if (iAbs3 > 1 || iAbs4 > 1 || (iAbs3 == 1 && iAbs4 == 1)) {
                arrayList2.add(obj2);
            }
        }
        int iIndexOf3 = listListOf.indexOf((Pair) CollectionsKt___CollectionsKt.random(arrayList2, Random.onNavigationEvent));
        if (iIndexOf3 < 0) {
            return null;
        }
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(iIndexOf), Integer.valueOf(iIndexOf2), Integer.valueOf(iIndexOf3)});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ importAppCert(Context context, boolean z, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            Configuration configuration = context.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            i = new getUrlokhttp(new onExtraCallback(configuration)).extraCommand();
        }
        this(context, z, i, (i2 & 8) != 0 ? null : num);
    }
}
