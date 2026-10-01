package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import im.toss.features.payment.ui.offline.compose.screen.FullPage2DCodeScreenKt$;
import im.toss.tds.foundation.anim.rally.Rally;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.pxToDp;
import o.runOnUiThreadDelayed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class runOnUiThreadDelayed extends isFireOS<isFireOS<?>> {
    private static int asBinder = 1;
    private static int onWarmupCompleted;
    private Function1<? super Integer, Unit> IAuthTabCallback;
    private Function1<? super Float, Unit> onExtraCallback;
    private final pxToDp onExtraCallbackWithResult;
    private final List<isFireOS<?>> onNavigationEvent;

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~(i3 | i6);
        int i8 = (~i4) | (~i6);
        int i9 = (~i8) | i3;
        int i10 = (~(i6 | i4)) | (~((~i3) | i4)) | (~(i8 | i3));
        int i11 = i4 + i3 + i5 + ((-101282902) * i) + ((-829309908) * i2);
        int i12 = i11 * i11;
        int i13 = ((i4 * 42798203) - 224002048) + (42798203 * i3) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i5) + (1710751744 * i) + ((-1643118592) * i2) + ((-1134166016) * i12);
        int i14 = (i4 * 1745018779) + 1790267665 + (i3 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i5 * 1745018721) + (i * (-1587019414)) + (i2 * (-1871011668)) + (i12 * 1017511936);
        int i15 = i13 + (i14 * i14 * (-1139146752));
        return i15 != 1 ? i15 != 2 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ void onExtraCallback(runOnUiThreadDelayed runonuithreaddelayed, Ref.IntRef intRef, ValueAnimator valueAnimator) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(runonuithreaddelayed, intRef, valueAnimator);
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public runOnUiThreadDelayed(@NotNull pxToDp pxtodp) {
        super(null);
        Intrinsics.checkNotNullParameter(pxtodp, "");
        this.onExtraCallbackWithResult = pxtodp;
        this.onNavigationEvent = new ArrayList();
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 13;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedOnNavigationEvent = onNavigationEvent();
        int i4 = onWarmupCompleted + 103;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayedOnNavigationEvent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS access100() {
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = IAuthTabCallback();
        int i4 = asBinder + 113;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return runonuithreaddelayedIAuthTabCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(z);
        }
        onWarmupCompleted(z);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.isFireOS
    public /* synthetic */ void onWarmupCompleted(getEventService geteventservice, float f) {
        int i = 2 % 2;
        int i2 = asBinder + 25;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((isFireOS<?>) geteventservice, f);
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
    }

    @Override // o.isFireOS
    public /* synthetic */ isFireOS setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 93;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return updateVisuals();
        }
        updateVisuals();
        throw null;
    }

    @Override // o.isFireOS
    public pxToDp ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 55;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        pxToDp pxtodp = this.onExtraCallbackWithResult;
        int i5 = i2 + 9;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        return pxtodp;
    }

    public final void onWarmupCompleted(@Nullable Function1<? super Float, Unit> function1) {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 45;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.onExtraCallback = function1;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 61;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(@NotNull List<? extends isFireOS<?>> list) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 1;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        this.onNavigationEvent.addAll(list);
        int i4 = asBinder + 97;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 12 / 0;
        }
    }

    public static /* synthetic */ runOnUiThreadDelayed IAuthTabCallbackDefault(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 23;
        int i4 = i3 % 128;
        asBinder = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 45;
            onWarmupCompleted = i6 % 128;
            obj = null;
            if (i6 % 2 != 0) {
                throw null;
            }
        }
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -343267267, 343267268, new Object[]{runonuithreaddelayed, obj, function0}, iOnExtraCallback2, iOnExtraCallback);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 19;
        asBinder = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            runonuithreaddelayed.isEngagementSignalsApiAvailable().put(obj, function0);
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        runonuithreaddelayed.isEngagementSignalsApiAvailable().put(obj, function0);
        int i3 = onWarmupCompleted + 121;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            return runonuithreaddelayed;
        }
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ runOnUiThreadDelayed onNavigationEvent(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 55;
        int i4 = i3 % 128;
        asBinder = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            int i5 = i4 + 87;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        return runonuithreaddelayed.onNavigationEvent(obj, (Function0<Unit>) function0);
    }

    public final runOnUiThreadDelayed onNavigationEvent(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asBinder + 97;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        ICustomTabsCallbackDefault().put(obj, function0);
        int i4 = asBinder + 125;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public static /* synthetic */ runOnUiThreadDelayed onExtraCallback(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        int i3 = asBinder + 65;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 121;
            asBinder = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i7 = i4 + 57;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            obj = null;
        }
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1327970494, -1327970492, new Object[]{runonuithreaddelayed, obj, function0}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 37;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        runonuithreaddelayed.ICustomTabsCallbackStubProxy().put(obj, function0);
        int i4 = onWarmupCompleted + 27;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return runonuithreaddelayed;
    }

    public final runOnUiThreadDelayed onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 109;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(Long.valueOf(j));
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 49;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return this;
    }

    public static /* synthetic */ runOnUiThreadDelayed onWarmupCompleted(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 79;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            obj = null;
        }
        runOnUiThreadDelayed runonuithreaddelayedIAuthTabCallback = runonuithreaddelayed.IAuthTabCallback(obj, (Function0<Unit>) function0);
        int i5 = onWarmupCompleted + 65;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 38 / 0;
        }
        return runonuithreaddelayedIAuthTabCallback;
    }

    public final runOnUiThreadDelayed IAuthTabCallback(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asBinder + 117;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        onRelationshipValidationResult().put(obj, function0);
        int i4 = onWarmupCompleted + 73;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return this;
        }
        throw null;
    }

    public static /* synthetic */ runOnUiThreadDelayed IAuthTabCallback(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = asBinder;
            int i4 = i3 + 37;
            onWarmupCompleted = i4 % 128;
            Object obj3 = null;
            if (i4 % 2 != 0) {
                obj3.hashCode();
                throw null;
            }
            int i5 = i3 + 27;
            onWarmupCompleted = i5 % 128;
            int i6 = i5 % 2;
            obj = null;
        }
        return runonuithreaddelayed.onExtraCallback(obj, function0);
    }

    public final runOnUiThreadDelayed onExtraCallback(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = asBinder + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        ICustomTabsCallbackStub().put(obj, function0);
        int i4 = onWarmupCompleted + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return this;
    }

    public static /* synthetic */ runOnUiThreadDelayed onExtraCallbackWithResult(runOnUiThreadDelayed runonuithreaddelayed, Object obj, Function0 function0, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = onWarmupCompleted + 125;
            int i4 = i3 % 128;
            asBinder = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 63;
            onWarmupCompleted = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 % 3;
            }
            obj = null;
        }
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 824712118, -824712118, new Object[]{runonuithreaddelayed, obj, function0}, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), iOnExtraCallback);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        runOnUiThreadDelayed runonuithreaddelayed = (runOnUiThreadDelayed) objArr[0];
        Object obj = objArr[1];
        Function0<Unit> function0 = (Function0) objArr[2];
        int i = 2 % 2;
        int i2 = asBinder + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(function0, "");
        runonuithreaddelayed.onUnminimized().put(obj, function0);
        int i4 = onWarmupCompleted + 23;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return runonuithreaddelayed;
        }
        throw null;
    }

    public static final class onNavigationEvent implements Animator.AnimatorListener {
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 87;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 89;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 31;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
        }

        public onNavigationEvent() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = {runOnUiThreadDelayed.this};
            int iOnExtraCallbackWithResult = FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult();
            Iterator it = ((Map) isFireOS.onExtraCallbackWithResult(FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), objArr, FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), FullPage2DCodeScreenKt$.ExternalSyntheticLambda3.onExtraCallbackWithResult(), 2140325197, iOnExtraCallbackWithResult, -2140325197)).values().iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
                int i4 = onExtraCallbackWithResult + 3;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.isFireOS
    protected void extraCommand() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        onExtraCallbackWithResult((Integer) null);
        List<isFireOS<?>> list = this.onNavigationEvent;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = asBinder + 7;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                list.get(i2).IAuthTabCallback(Integer.MIN_VALUE);
                onMinimized();
                throw null;
            }
            isFireOS<?> isfireos = list.get(i2);
            isfireos.IAuthTabCallback(Integer.MIN_VALUE);
            Interpolator interpolatorOnMinimized = onMinimized();
            if (interpolatorOnMinimized == null) {
                interpolatorOnMinimized = IAuthTabCallbackDefault();
            }
            Integer numExtraCallbackWithResult = extraCallbackWithResult();
            if (numExtraCallbackWithResult == null) {
                int i4 = asBinder + 27;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                numExtraCallbackWithResult = onTransact();
            }
            Boolean boolWriteTypedObject = writeTypedObject();
            if (boolWriteTypedObject == null) {
                int i6 = onWarmupCompleted + 123;
                asBinder = i6 % 128;
                if (i6 % 2 == 0) {
                    asInterface();
                    throw null;
                }
                boolWriteTypedObject = asInterface();
            }
            isfireos.onWarmupCompleted(this, interpolatorOnMinimized, numExtraCallbackWithResult, boolWriteTypedObject);
            if (isfireos instanceof runOnUiThreadDelayed) {
                int i7 = asBinder + 119;
                onWarmupCompleted = i7 % 128;
                int i8 = i7 % 2;
                ((runOnUiThreadDelayed) isfireos).extraCommand();
            } else {
                if (!(isfireos instanceof Rally)) {
                    throw new NoWhenBranchMatchedException();
                }
                Rally rally = (Rally) isfireos;
                List<AppLovinSdkSettings> listICustomTabsServiceDefault = rally.ICustomTabsServiceDefault();
                int size2 = listICustomTabsServiceDefault.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    int i10 = onWarmupCompleted + 119;
                    asBinder = i10 % 128;
                    if (i10 % 2 == 0) {
                        listICustomTabsServiceDefault.get(i9);
                        rally.onMinimized();
                        throw null;
                    }
                    AppLovinSdkSettings appLovinSdkSettings = listICustomTabsServiceDefault.get(i9);
                    Interpolator interpolatorOnMinimized2 = rally.onMinimized();
                    if (interpolatorOnMinimized2 == null) {
                        interpolatorOnMinimized2 = isfireos.IAuthTabCallbackDefault();
                    }
                    Integer numExtraCallbackWithResult2 = rally.extraCallbackWithResult();
                    if (numExtraCallbackWithResult2 == null) {
                        numExtraCallbackWithResult2 = isfireos.onTransact();
                    }
                    Boolean boolWriteTypedObject2 = rally.writeTypedObject();
                    if (boolWriteTypedObject2 == null) {
                        boolWriteTypedObject2 = isfireos.asInterface();
                    }
                    appLovinSdkSettings.onWarmupCompleted(isfireos, interpolatorOnMinimized2, numExtraCallbackWithResult2, boolWriteTypedObject2);
                    appLovinSdkSettings.onNavigationEvent();
                }
            }
        }
        onExtraCallback(true);
        int i11 = asBinder + 79;
        onWarmupCompleted = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    @Override // o.isFireOS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void IAuthTabCallbackDefault(int i) throws NoWhenBranchMatchedException {
        int i2;
        int iIntValue;
        List list;
        int i3 = 2 % 2;
        if (!getInterfaceDescriptor()) {
            int i4 = onWarmupCompleted + 25;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            extraCommand();
        }
        List<isFireOS<?>> list2 = this.onNavigationEvent;
        List arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!((isFireOS) next).newSessionWithExtras()) {
                arrayList.add(next);
                int i6 = asBinder + 5;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 3;
                }
            }
        }
        if (arrayList.isEmpty()) {
            int i8 = asBinder + 59;
            onWarmupCompleted = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 55 / 0;
                list = this.onNavigationEvent;
            } else {
                list = this.onNavigationEvent;
            }
            arrayList = list;
        }
        pxToDp pxtodpICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
        if (pxtodpICustomTabsCallback_Parcel instanceof pxToDp.onWarmupCompleted) {
            int size = arrayList.size();
            int i10 = 0;
            iIntValue = 0;
            while (i10 < size) {
                int i11 = asBinder + 25;
                onWarmupCompleted = i11 % 128;
                if (i11 % 2 != 0) {
                    iIntValue *= ((isFireOS) arrayList.get(i10)).IAuthTabCallbackStub();
                    i10 += 58;
                } else {
                    iIntValue += ((isFireOS) arrayList.get(i10)).IAuthTabCallbackStub();
                    i10++;
                }
            }
        } else {
            Integer num = null;
            if (pxtodpICustomTabsCallback_Parcel instanceof pxToDp.IAuthTabCallback) {
                int i12 = onWarmupCompleted + 1;
                asBinder = i12 % 128;
                int i13 = i12 % 2;
                if (!arrayList.isEmpty()) {
                    Integer numValueOf = Integer.valueOf(((isFireOS) arrayList.get(0)).IAuthTabCallbackStub());
                    int lastIndex = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex > 0) {
                        while (true) {
                            Integer numValueOf2 = Integer.valueOf(((isFireOS) arrayList.get(i2)).IAuthTabCallbackStub());
                            if (numValueOf2.compareTo(numValueOf) > 0) {
                                numValueOf = numValueOf2;
                            }
                            if (i2 == lastIndex) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    num = numValueOf;
                }
                iIntValue = num != null ? num.intValue() : 0;
            } else {
                if (!(pxtodpICustomTabsCallback_Parcel instanceof pxToDp.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!arrayList.isEmpty()) {
                    isFireOS isfireos = (isFireOS) arrayList.get(0);
                    ((pxToDp.onNavigationEvent) ICustomTabsCallback_Parcel()).onNavigationEvent();
                    Integer numValueOf3 = Integer.valueOf(isfireos.IAuthTabCallbackStub());
                    int lastIndex2 = CollectionsKt.getLastIndex(arrayList);
                    if (lastIndex2 > 0) {
                        int i14 = onWarmupCompleted + 7;
                        asBinder = i14 % 128;
                        int i15 = i14 % 2;
                        while (true) {
                            Integer numValueOf4 = Integer.valueOf((((pxToDp.onNavigationEvent) ICustomTabsCallback_Parcel()).onNavigationEvent() * i2) + ((isFireOS) arrayList.get(i2)).IAuthTabCallbackStub());
                            if (numValueOf4.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf4;
                            }
                            if (i2 == lastIndex2) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    num = numValueOf3;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                }
            }
        }
        Function1<? super Integer, Unit> function1 = this.IAuthTabCallback;
        if (function1 != null) {
            int i16 = asBinder + 39;
            onWarmupCompleted = i16 % 128;
            if (i16 % 2 != 0) {
                function1.invoke(Integer.valueOf(onNavigationEvent(i, iIntValue)));
                int i17 = 30 / 0;
            } else {
                function1.invoke(Integer.valueOf(onNavigationEvent(i, iIntValue)));
            }
        }
        Collection<Function0<Unit>> collectionIAuthTabCallback = IAuthTabCallback(ICustomTabsService(), i);
        pxToDp pxtodpICustomTabsCallback_Parcel2 = ICustomTabsCallback_Parcel();
        if (pxtodpICustomTabsCallback_Parcel2 instanceof pxToDp.onWarmupCompleted) {
            int i18 = onWarmupCompleted + 121;
            asBinder = i18 % 128;
            int i19 = i18 % 2;
            onTransact(i);
        } else if (pxtodpICustomTabsCallback_Parcel2 instanceof pxToDp.IAuthTabCallback) {
            asBinder(i);
        } else {
            if (!(pxtodpICustomTabsCallback_Parcel2 instanceof pxToDp.onNavigationEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            int i20 = asBinder + 121;
            onWarmupCompleted = i20 % 128;
            int i21 = i20 % 2;
            asInterface(i);
        }
        Iterator it2 = collectionIAuthTabCallback.iterator();
        while (it2.hasNext()) {
            int i22 = onWarmupCompleted + 59;
            asBinder = i22 % 128;
            int i23 = i22 % 2;
            ((Function0) it2.next()).invoke();
        }
    }

    public void onNavigationEvent(@NotNull isFireOS<?> isfireos, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 59;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(isfireos, "");
        int iIAuthTabCallbackStub = (int) (isfireos.IAuthTabCallbackStub() * f);
        if (isfireos.onExtraCallback() == iIAuthTabCallbackStub) {
            return;
        }
        isfireos.IAuthTabCallback(iIAuthTabCallbackStub);
        isfireos.IAuthTabCallbackStub(iIAuthTabCallbackStub);
        int i4 = asBinder + 25;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public runOnUiThreadDelayed onWarmupCompleted(boolean z) {
        int i = 2 % 2;
        onExtraCallback(IAuthTabCallback_Parcel());
        if (z) {
            asInterface(1.0f);
            return this;
        }
        ValueAnimator typedObject = readTypedObject();
        Object obj = null;
        if (typedObject != null) {
            int i2 = onWarmupCompleted + 105;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            typedObject.start();
            if (i3 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = asBinder + 47;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        throw null;
    }

    public runOnUiThreadDelayed updateVisuals() {
        int i = 2 % 2;
        ValueAnimator typedObject = readTypedObject();
        Object obj = null;
        if (typedObject != null) {
            int i2 = asBinder + 21;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            typedObject.pause();
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i4 = asBinder + 9;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[PHI: r1
      0x001f: PHI (r1v5 android.animation.ValueAnimator) = (r1v4 android.animation.ValueAnimator), (r1v21 android.animation.ValueAnimator) binds: [B:8:0x001d, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public runOnUiThreadDelayed onNavigationEvent() {
        ValueAnimator typedObject;
        int i = 2 % 2;
        int i2 = asBinder + 1;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            typedObject = readTypedObject();
            int i3 = 42 / 0;
            if (typedObject != null) {
                typedObject.cancel();
                int i4 = onWarmupCompleted + 63;
                asBinder = i4 % 128;
                int i5 = i4 % 2;
            } else if (getInterfaceDescriptor()) {
                int i6 = asBinder + 19;
                onWarmupCompleted = i6 % 128;
                if (i6 % 2 != 0) {
                    ICustomTabsCallbackStubProxy().values().iterator();
                    throw null;
                }
                Iterator<T> it = ICustomTabsCallbackStubProxy().values().iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                    int i7 = asBinder + 103;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        } else {
            typedObject = readTypedObject();
            if (typedObject != null) {
            }
        }
        onExtraCallback(false);
        List<isFireOS<?>> list = this.onNavigationEvent;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            list.get(i9).IAuthTabCallbackStubProxy();
        }
        int i10 = onWarmupCompleted + 87;
        asBinder = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 61 / 0;
        }
        return this;
    }

    public runOnUiThreadDelayed IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.end();
        }
        int i4 = 0;
        onExtraCallback(false);
        List<isFireOS<?>> list = this.onNavigationEvent;
        int size = list.size();
        while (i4 < size) {
            list.get(i4).access100();
            i4++;
            int i5 = onWarmupCompleted + 87;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
        }
        return this;
    }

    @Override // o.isFireOS
    public List<isFireOS<?>> extraCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        List<isFireOS<?>> list = this.onNavigationEvent;
        int i5 = i3 + 117;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // o.getEventService
    public int onWarmupCompleted() throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Integer numValueOf = null;
        if (newSessionWithExtras()) {
            int i4 = onWarmupCompleted + 37;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                return Integer.MAX_VALUE;
            }
            numValueOf.hashCode();
            throw null;
        }
        try {
            pxToDp pxtodpICustomTabsCallback_Parcel = ICustomTabsCallback_Parcel();
            int iIntValue = 0;
            if (pxtodpICustomTabsCallback_Parcel instanceof pxToDp.onWarmupCompleted) {
                List<isFireOS<?>> list = this.onNavigationEvent;
                int size = list.size();
                int iIAuthTabCallbackStub = 0;
                while (iIntValue < size) {
                    int i5 = onWarmupCompleted + 7;
                    asBinder = i5 % 128;
                    if (i5 % 2 == 0) {
                        iIAuthTabCallbackStub += list.get(iIntValue).IAuthTabCallbackStub();
                        iIntValue += 110;
                    } else {
                        iIAuthTabCallbackStub += list.get(iIntValue).IAuthTabCallbackStub();
                        iIntValue++;
                    }
                    int i6 = onWarmupCompleted + 43;
                    asBinder = i6 % 128;
                    int i7 = i6 % 2;
                }
                iIntValue = iIAuthTabCallbackStub;
            } else if (pxtodpICustomTabsCallback_Parcel instanceof pxToDp.IAuthTabCallback) {
                List<isFireOS<?>> list2 = this.onNavigationEvent;
                if (!list2.isEmpty()) {
                    Integer numValueOf2 = Integer.valueOf(list2.get(0).IAuthTabCallbackStub());
                    int lastIndex = CollectionsKt.getLastIndex(list2);
                    if (lastIndex > 0) {
                        int i8 = 1;
                        while (true) {
                            Integer numValueOf3 = Integer.valueOf(list2.get(i8).IAuthTabCallbackStub());
                            if (numValueOf3.compareTo(numValueOf2) > 0) {
                                numValueOf2 = numValueOf3;
                            }
                            if (i8 == lastIndex) {
                                break;
                            }
                            i8++;
                        }
                    }
                    numValueOf = numValueOf2;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            } else {
                if (!(pxtodpICustomTabsCallback_Parcel instanceof pxToDp.onNavigationEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<isFireOS<?>> list3 = this.onNavigationEvent;
                if (list3.isEmpty()) {
                    int i9 = asBinder + 67;
                    onWarmupCompleted = i9 % 128;
                    if (i9 % 2 != 0) {
                        throw null;
                    }
                } else {
                    isFireOS<?> isfireos = list3.get(0);
                    ((pxToDp.onNavigationEvent) ICustomTabsCallback_Parcel()).onNavigationEvent();
                    numValueOf = Integer.valueOf(isfireos.IAuthTabCallbackStub());
                    int lastIndex2 = CollectionsKt.getLastIndex(list3);
                    if (lastIndex2 > 0) {
                        int i10 = 1;
                        while (true) {
                            Integer numValueOf4 = Integer.valueOf((((pxToDp.onNavigationEvent) ICustomTabsCallback_Parcel()).onNavigationEvent() * i10) + list3.get(i10).IAuthTabCallbackStub());
                            if (numValueOf4.compareTo(numValueOf) > 0) {
                                numValueOf = numValueOf4;
                            }
                            if (i10 == lastIndex2) {
                                break;
                            }
                            int i11 = onWarmupCompleted + 125;
                            asBinder = i11 % 128;
                            int i12 = i11 % 2;
                            i10++;
                        }
                    }
                    int i13 = asBinder + 35;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
            }
            return onMessageChannelReady() + (iIntValue * mayLaunchUrl()) + (onActivityResized() * (mayLaunchUrl() - 1));
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }

    @Override // o.isFireOS
    public ValueAnimator IAuthTabCallback_Parcel() throws NoWhenBranchMatchedException {
        float fICustomTabsService;
        float f;
        int i;
        int i2 = 2 % 2;
        boolean interfaceDescriptor = getInterfaceDescriptor();
        if (!interfaceDescriptor) {
            int i3 = asBinder + 73;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            extraCommand();
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int iIAuthTabCallbackStub = IAuthTabCallbackStub();
        intRef.element = iIAuthTabCallbackStub;
        if (iIAuthTabCallbackStub < 0) {
            intRef.element = iIAuthTabCallbackStub - onMessageChannelReady();
        }
        if (!interfaceDescriptor && !postMessage()) {
            int i5 = onWarmupCompleted + 27;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (!newSession()) {
                if (!newAuthTabSession()) {
                    i = 0;
                } else {
                    i = intRef.element;
                    int i7 = onWarmupCompleted + 9;
                    asBinder = i7 % 128;
                    int i8 = i7 % 2;
                }
                IAuthTabCallbackStub(i);
            }
        }
        float f2 = 1.0f;
        if (intRef.element > 0) {
            fICustomTabsService = ICustomTabsService() / intRef.element;
        } else if (newAuthTabSession()) {
            int i9 = onWarmupCompleted + 43;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            fICustomTabsService = 0.0f;
        } else {
            fICustomTabsService = 1.0f;
        }
        if (newAuthTabSession()) {
            int i11 = onWarmupCompleted + 95;
            asBinder = i11 % 128;
            if (i11 % 2 != 0) {
                f2 = 0.0f;
            }
        }
        ValueAnimator typedObject = readTypedObject();
        if (typedObject != null) {
            typedObject.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fICustomTabsService, f2);
        Long lOnActivityLayout = onActivityLayout();
        if (lOnActivityLayout != null) {
            int i12 = onWarmupCompleted + 29;
            asBinder = i12 % 128;
            if (i12 % 2 == 0) {
                ValueAnimator.setFrameDelay(lOnActivityLayout.longValue());
                int i13 = 98 / 0;
            } else {
                ValueAnimator.setFrameDelay(lOnActivityLayout.longValue());
            }
        }
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: im.toss.tds.foundation.anim.rally.Timeline$$ExternalSyntheticLambda0
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) throws NoWhenBranchMatchedException {
                int i14 = 2 % 2;
                int i15 = onExtraCallback + 9;
                onNavigationEvent = i15 % 128;
                int i16 = i15 % 2;
                runOnUiThreadDelayed.onExtraCallback(this.f$0, intRef, valueAnimator);
                int i17 = onExtraCallback + 67;
                onNavigationEvent = i17 % 128;
                if (i17 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        valueAnimatorOfFloat.setInterpolator(Address.onNavigationEvent.asInterface());
        if (newAuthTabSession()) {
            f = intRef.element * fICustomTabsService;
            int i14 = asBinder + 75;
            onWarmupCompleted = i14 % 128;
            int i15 = i14 % 2;
        } else {
            float f3 = intRef.element;
            f = f3 - (fICustomTabsService * f3);
        }
        valueAnimatorOfFloat.setDuration(f < 0.0f ? Long.MAX_VALUE : (long) f);
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    private static final void IAuthTabCallback(runOnUiThreadDelayed runonuithreaddelayed, Ref.IntRef intRef, ValueAnimator valueAnimator) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 35;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "");
        Float f = (Float) animatedValue;
        runonuithreaddelayed.IAuthTabCallbackDefault((int) (f.floatValue() * intRef.element));
        Function1<? super Float, Unit> function1 = runonuithreaddelayed.onExtraCallback;
        if (function1 != null) {
            int i4 = onWarmupCompleted + 99;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            function1.invoke(f);
        }
        int i6 = asBinder + 21;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    public final runOnUiThreadDelayed onExtraCallbackWithResult(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1327970494, -1327970492, new Object[]{this, obj, function0}, iOnExtraCallback2, iOnExtraCallback);
    }

    public final runOnUiThreadDelayed onWarmupCompleted(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 824712118, -824712118, new Object[]{this, obj, function0}, iOnExtraCallback2, iOnExtraCallback);
    }

    public final runOnUiThreadDelayed asBinder(@Nullable Object obj, @NotNull Function0<Unit> function0) {
        int iOnExtraCallback = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        int iOnExtraCallback2 = FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback();
        return (runOnUiThreadDelayed) IAuthTabCallback(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), -343267267, 343267268, new Object[]{this, obj, function0}, iOnExtraCallback2, iOnExtraCallback);
    }
}
