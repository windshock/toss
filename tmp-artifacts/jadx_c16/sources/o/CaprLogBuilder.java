package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import im.toss.features.home.core.ui.recyclerview.animator.HomeItemAnimator$;
import im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class CaprLogBuilder extends FloatingActionButtonKtExtendedFloatingActionButton5ExternalSyntheticLambda3 {
    public static final onWarmupCompleted Companion = new onWarmupCompleted((DefaultConstructorMarker) null);
    public static final int IAuthTabCallback = 8;
    private static int extraCallback = 1;
    private static int extraCallbackWithResult = 0;
    private static TimeInterpolator onNavigationEvent = null;
    private static int readTypedObject = 0;
    private static int writeTypedObject = 1;
    private final isUseMultiplexLink IAuthTabCallbackStub;
    private final List<RecyclerView.ViewHolder> IAuthTabCallbackStubProxy;
    private final List<onExtraCallbackWithResult> IAuthTabCallback_Parcel;
    private final List<IAuthTabCallback> access000;
    private final List<RecyclerView.ViewHolder> access100;
    private final List<List<IAuthTabCallback>> asBinder;
    private final List<RecyclerView.ViewHolder> asInterface;
    private final List<RecyclerView.ViewHolder> getInterfaceDescriptor;
    private final List<RecyclerView.ViewHolder> onExtraCallback;
    private final List<List<RecyclerView.ViewHolder>> onExtraCallbackWithResult;
    private final List<List<onExtraCallbackWithResult>> onTransact;
    private final List<RecyclerView.ViewHolder> onWarmupCompleted;

    static {
        int i = extraCallback + 27;
        extraCallbackWithResult = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i5;
        int i8 = ~((~i2) | i7 | i);
        int i9 = ~i;
        int i10 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i11 = (~(i9 | i5)) | i2;
        int i12 = i5 + i2 + i3 + ((-946781377) * i4) + ((-59450693) * i6);
        int i13 = i12 * i12;
        int i14 = (((-143250568) * i5) - 346488832) + (357422218 * i2) + (i8 * (-1897147255)) + ((-1897147255) * i10) + (1897147255 * i11) + ((-2040397824) * i3) + ((-1205993472) * i4) + ((-1651113984) * i6) + ((-884408320) * i13);
        int i15 = ((i5 * 358501064) - 1042343473) + (i2 * 358500518) + (i8 * (-273)) + (i10 * (-273)) + (i11 * 273) + (i3 * 358500791) + (i4 * (-249165559)) + (i6 * 1905372845) + (i13 * 573505536);
        int i16 = i14 + (i15 * i15 * (-553189376));
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr);
        }
        CaprLogBuilder caprLogBuilder = (CaprLogBuilder) objArr[0];
        int i17 = 2 % 2;
        int i18 = readTypedObject + 31;
        writeTypedObject = i18 % 128;
        int i19 = i18 % 2;
        if (!caprLogBuilder.onExtraCallbackWithResult()) {
            int i20 = readTypedObject + 69;
            writeTypedObject = i20 % 128;
            int i21 = i20 % 2;
            caprLogBuilder.onExtraCallback();
            int i22 = writeTypedObject + 83;
            readTypedObject = i22 % 128;
            int i23 = i22 % 2;
        }
        return null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(CaprLogBuilder caprLogBuilder, RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 83;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(caprLogBuilder, viewHolder);
        int i4 = writeTypedObject + 3;
        readTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = readTypedObject + 5;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(list, caprLogBuilder);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(list, caprLogBuilder);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void onNavigationEvent(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 93;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(list, caprLogBuilder);
        int i4 = writeTypedObject + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ Unit onWarmupCompleted(CaprLogBuilder caprLogBuilder, RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 111;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(caprLogBuilder, viewHolder);
        int i4 = readTypedObject + 119;
        writeTypedObject = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public CaprLogBuilder(@NotNull isUseMultiplexLink isusemultiplexlink) {
        Intrinsics.checkNotNullParameter(isusemultiplexlink, "");
        this.IAuthTabCallbackStub = isusemultiplexlink;
        this.access100 = new ArrayList();
        this.IAuthTabCallbackStubProxy = new ArrayList();
        this.IAuthTabCallback_Parcel = new ArrayList();
        this.access000 = new ArrayList();
        this.onExtraCallbackWithResult = new ArrayList();
        this.onTransact = new ArrayList();
        this.asBinder = new ArrayList();
        this.onExtraCallback = new ArrayList();
        this.asInterface = new ArrayList();
        this.getInterfaceDescriptor = new ArrayList();
        this.onWarmupCompleted = new ArrayList();
        onNavigationEvent(200L);
        onWarmupCompleted(200L);
    }

    public static final /* synthetic */ List onExtraCallback(CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 57;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<RecyclerView.ViewHolder> list = caprLogBuilder.getInterfaceDescriptor;
        if (i3 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CaprLogBuilder caprLogBuilder = (CaprLogBuilder) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 123;
        writeTypedObject = i3 % 128;
        int i4 = i3 % 2;
        List<RecyclerView.ViewHolder> list = caprLogBuilder.onWarmupCompleted;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 99;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ List onNavigationEvent(CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 61;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        List<RecyclerView.ViewHolder> list = caprLogBuilder.asInterface;
        int i5 = i3 + 35;
        writeTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ List onWarmupCompleted(CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = readTypedObject + 99;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        List<RecyclerView.ViewHolder> list = caprLogBuilder.onExtraCallback;
        if (i3 == 0) {
            int i4 = 86 / 0;
        }
        return list;
    }

    private static final void onExtraCallback(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            int i2 = writeTypedObject + 71;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) it.next();
            caprLogBuilder.onExtraCallback(onextracallbackwithresult.onExtraCallbackWithResult(), onextracallbackwithresult.onWarmupCompleted(), onextracallbackwithresult.onNavigationEvent(), onextracallbackwithresult.IAuthTabCallback(), onextracallbackwithresult.onExtraCallback());
        }
        list.clear();
        caprLogBuilder.onTransact.remove(list);
        int i4 = readTypedObject + 65;
        writeTypedObject = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static final void onWarmupCompleted(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        Iterator it = list.iterator();
        int i2 = writeTypedObject + 107;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 2;
        }
        while (it.hasNext()) {
            int i4 = readTypedObject + 71;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            caprLogBuilder.onWarmupCompleted((IAuthTabCallback) it.next());
            int i6 = readTypedObject + 21;
            writeTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        list.clear();
        caprLogBuilder.asBinder.remove(list);
    }

    private static final void IAuthTabCallbackStub(List list, CaprLogBuilder caprLogBuilder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Iterator it = list.iterator();
        while (!(!it.hasNext())) {
            caprLogBuilder.onWarmupCompleted((RecyclerView.ViewHolder) it.next());
            int i4 = writeTypedObject + 115;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        list.clear();
        caprLogBuilder.onExtraCallbackWithResult.remove(list);
    }

    public void IAuthTabCallback() {
        int i = 2 % 2;
        boolean zIsEmpty = this.access100.isEmpty();
        boolean zIsEmpty2 = this.IAuthTabCallback_Parcel.isEmpty();
        boolean zIsEmpty3 = this.access000.isEmpty();
        boolean zIsEmpty4 = this.IAuthTabCallbackStubProxy.isEmpty();
        if (zIsEmpty && zIsEmpty2 && !(!zIsEmpty4)) {
            int i2 = writeTypedObject + 37;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (zIsEmpty3) {
                return;
            }
        }
        Iterator<RecyclerView.ViewHolder> it = this.access100.iterator();
        while (it.hasNext()) {
            access000(it.next());
        }
        this.access100.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.IAuthTabCallback_Parcel);
            this.onTransact.add(arrayList);
            this.IAuthTabCallback_Parcel.clear();
            new HomeItemAnimator$.ExternalSyntheticLambda1(arrayList, this).run();
            int i4 = readTypedObject + 9;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.access000);
            this.asBinder.add(arrayList2);
            this.access000.clear();
            new HomeItemAnimator$.ExternalSyntheticLambda2(arrayList2, this).run();
            int i6 = writeTypedObject + 121;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.IAuthTabCallbackStubProxy);
        this.onExtraCallbackWithResult.add(arrayList3);
        this.IAuthTabCallbackStubProxy.clear();
        new HomeItemAnimator$.ExternalSyntheticLambda3(arrayList3, this).run();
    }

    public boolean IAuthTabCallback(@NotNull RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 71;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        } else {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        this.access100.add(viewHolder);
        int i3 = writeTypedObject + 67;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return true;
    }

    private static final Unit onExtraCallbackWithResult(CaprLogBuilder caprLogBuilder, RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 5;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        caprLogBuilder.asInterface(viewHolder);
        Unit unit = Unit.INSTANCE;
        int i4 = readTypedObject + 31;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onTransact extends AnimatorListenerAdapter {
        private static int asInterface = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ RecyclerView.ViewHolder IAuthTabCallback;
        final /* synthetic */ ViewPropertyAnimator onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        onTransact(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.IAuthTabCallback = viewHolder;
            this.onNavigationEvent = viewPropertyAnimator;
            this.onWarmupCompleted = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 65;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(animator, "");
            int i3 = onExtraCallbackWithResult + 107;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = asInterface + 121;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onNavigationEvent.setListener(null);
            this.onWarmupCompleted.setAlpha(1.0f);
            CaprLogBuilder.this.asInterface(this.IAuthTabCallback);
            CaprLogBuilder.onExtraCallback(CaprLogBuilder.this).remove(this.IAuthTabCallback);
            CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = onExtraCallbackWithResult + 31;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void access000(RecyclerView.ViewHolder viewHolder) {
        isUrgent isurgent;
        int i = 2 % 2;
        if (viewHolder instanceof isUrgent) {
            int i2 = readTypedObject + 123;
            writeTypedObject = i2 % 128;
            int i3 = i2 % 2;
            isurgent = (isUrgent) viewHolder;
        } else {
            int i4 = writeTypedObject + 115;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            isurgent = null;
        }
        if (isurgent != null && isurgent.onWarmupCompleted((int) IAuthTabCallbackDefault(), new HomeItemAnimator$.ExternalSyntheticLambda0(this, viewHolder))) {
            int i6 = writeTypedObject + 13;
            readTypedObject = i6 % 128;
            int i7 = i6 % 2;
        } else {
            View view = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.getInterfaceDescriptor.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(IAuthTabCallbackDefault()).alpha(0.0f).setListener(new onTransact(viewHolder, viewPropertyAnimatorAnimate, view)).start();
        }
    }

    public boolean onExtraCallback(@NotNull RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 75;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            viewHolder.onNavigationEvent.setAlpha(0.0f);
            this.IAuthTabCallbackStubProxy.add(viewHolder);
            return false;
        }
        Intrinsics.checkNotNullParameter(viewHolder, "");
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        viewHolder.onNavigationEvent.setAlpha(0.0f);
        this.IAuthTabCallbackStubProxy.add(viewHolder);
        return true;
    }

    private static final Unit onExtraCallback(CaprLogBuilder caprLogBuilder, RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        int i2 = readTypedObject + 51;
        writeTypedObject = i2 % 128;
        int i3 = i2 % 2;
        caprLogBuilder.onTransact(viewHolder);
        Unit unit = Unit.INSTANCE;
        if (i3 != 0) {
            return unit;
        }
        throw null;
    }

    public static final class onExtraCallback extends AnimatorListenerAdapter {
        private static int IAuthTabCallback = 0;
        private static int IAuthTabCallbackStub = 1;
        final /* synthetic */ View onExtraCallbackWithResult;
        final /* synthetic */ RecyclerView.ViewHolder onNavigationEvent;
        final /* synthetic */ ViewPropertyAnimator onWarmupCompleted;

        onExtraCallback(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.onNavigationEvent = viewHolder;
            this.onExtraCallbackWithResult = view;
            this.onWarmupCompleted = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 31;
            IAuthTabCallbackStub = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(animator, "");
                throw null;
            }
            Intrinsics.checkNotNullParameter(animator, "");
            int i3 = IAuthTabCallback + 51;
            IAuthTabCallbackStub = i3 % 128;
            int i4 = i3 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 81;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onExtraCallbackWithResult.setAlpha(1.0f);
            int i4 = IAuthTabCallbackStub + 59;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStub + 13;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onWarmupCompleted.setListener(null);
            this.onWarmupCompleted.setStartDelay(0L);
            CaprLogBuilder.this.onTransact(this.onNavigationEvent);
            CaprLogBuilder.onWarmupCompleted(CaprLogBuilder.this).remove(this.onNavigationEvent);
            CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = IAuthTabCallbackStub + 5;
            IAuthTabCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onWarmupCompleted(RecyclerView.ViewHolder viewHolder) {
        isUrgent isurgent;
        doInitialize doinitialize;
        int i = 2 % 2;
        int i2 = writeTypedObject + 109;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 68 / 0;
            isurgent = viewHolder instanceof isUrgent ? (isUrgent) viewHolder : null;
        } else if (viewHolder instanceof isUrgent) {
        }
        if (isurgent == null || !isurgent.onNavigationEvent((int) IAuthTabCallbackStub(), new HomeItemAnimator$.ExternalSyntheticLambda4(this, viewHolder))) {
            View view = viewHolder.onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.onExtraCallback.add(viewHolder);
            actionFilter = viewHolder instanceof ActionFilter ? (ActionFilter) viewHolder : null;
            viewPropertyAnimatorAnimate.alpha(1.0f).setStartDelay((actionFilter == null || (doinitialize = (doInitialize) actionFilter.onNavigationEvent()) == null) ? 0L : doinitialize.ICustomTabsCallbackStubProxy() * 110).setDuration(IAuthTabCallbackStub()).setListener(new onExtraCallback(viewHolder, view, viewPropertyAnimatorAnimate)).start();
            return;
        }
        int i4 = readTypedObject + 49;
        writeTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        actionFilter.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0061, code lost:
    
        IAuthTabCallbackStub(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005c, code lost:
    
        if (r7 == 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (r7 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult(@NotNull RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = writeTypedObject + 63;
        readTypedObject = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        int translationX = i + ((int) viewHolder.onNavigationEvent.getTranslationX());
        int translationY = i2 + ((int) viewHolder.onNavigationEvent.getTranslationY());
        View view = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        int i8 = i3 - translationX;
        int i9 = i4 - translationY;
        if (i8 == 0) {
            int i10 = readTypedObject + 81;
            writeTypedObject = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 30 / 0;
            }
        }
        this.IAuthTabCallbackStub.setAnimationStartTimestamp(Long.MAX_VALUE);
        if (i8 != 0) {
            int i12 = writeTypedObject + 121;
            readTypedObject = i12 % 128;
            float f = -i8;
            if (i12 % 2 != 0) {
                view.setTranslationX(f);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            view.setTranslationX(f);
            int i13 = readTypedObject + 51;
            writeTypedObject = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 4 % 5;
            }
        }
        if (i9 != 0) {
            int i15 = writeTypedObject + 21;
            readTypedObject = i15 % 128;
            int i16 = i15 % 2;
            view.setTranslationY(-i9);
        }
        this.IAuthTabCallback_Parcel.add(new onExtraCallbackWithResult(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    public static final class asInterface extends AnimatorListenerAdapter {
        private static int IAuthTabCallbackDefault = 0;
        private static int onTransact = 1;
        final /* synthetic */ View IAuthTabCallback;
        final /* synthetic */ int onExtraCallback;
        final /* synthetic */ int onExtraCallbackWithResult;
        final /* synthetic */ ViewPropertyAnimator onNavigationEvent;
        final /* synthetic */ RecyclerView.ViewHolder onWarmupCompleted;

        asInterface(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.onWarmupCompleted = viewHolder;
            this.onExtraCallbackWithResult = i;
            this.IAuthTabCallback = view;
            this.onExtraCallback = i2;
            this.onNavigationEvent = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 65;
            onTransact = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(animator, "");
            } else {
                Intrinsics.checkNotNullParameter(animator, "");
                int i3 = 39 / 0;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 53;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            if (this.onExtraCallbackWithResult != 0) {
                this.IAuthTabCallback.setTranslationX(0.0f);
                int i4 = onTransact + 81;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
            }
            if (this.onExtraCallback != 0) {
                int i6 = IAuthTabCallbackDefault + 95;
                onTransact = i6 % 128;
                if (i6 % 2 == 0) {
                    this.IAuthTabCallback.setTranslationY(1.0f);
                } else {
                    this.IAuthTabCallback.setTranslationY(0.0f);
                }
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 103;
            onTransact = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onNavigationEvent.setListener(null);
            CaprLogBuilder.this.IAuthTabCallbackStub(this.onWarmupCompleted);
            CaprLogBuilder.onNavigationEvent(CaprLogBuilder.this).remove(this.onWarmupCompleted);
            CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = onTransact + 5;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final void onExtraCallback(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = readTypedObject + 3;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        View view = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        this.IAuthTabCallbackStub.setAnimationStartTimestamp(System.currentTimeMillis());
        int i8 = i3 - i;
        int i9 = i4 - i2;
        if (i8 != 0) {
            int i10 = writeTypedObject + 87;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.asInterface.add(viewHolder);
        viewPropertyAnimatorAnimate.setDuration(asInterface()).setListener(new asInterface(viewHolder, i8, view, i9, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        r2 = r22.onNavigationEvent.getTranslationX();
        r3 = r22.onNavigationEvent.getTranslationY();
        r4 = r22.onNavigationEvent.getAlpha();
        IAuthTabCallback(im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new java.lang.Object[]{r21, r22}, -1897454356, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        r22.onNavigationEvent.setTranslationX(r2);
        r22.onNavigationEvent.setTranslationY(r3);
        r22.onNavigationEvent.setAlpha(r4);
        IAuthTabCallback(im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new java.lang.Object[]{r21, r23}, -1897454356, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, im.toss.global.features.kyc.eu.main.navigation.GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        r23.onNavigationEvent.setTranslationX(-((int) ((r26 - r24) - r2)));
        r23.onNavigationEvent.setTranslationY(-((int) ((r27 - r25) - r3)));
        r23.onNavigationEvent.setAlpha(0.0f);
        r21.access000.add(new o.CaprLogBuilder.IAuthTabCallback(r22, r23, r24, r25, r26, r27));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00d8, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r22 == r23) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r22 == r23) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        r0 = onExtraCallbackWithResult(r22, r24, r25, r26, r27);
        r1 = o.CaprLogBuilder.writeTypedObject + 5;
        o.CaprLogBuilder.readTypedObject = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = readTypedObject + 7;
        writeTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            int i7 = 92 / 0;
        } else {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
        }
    }

    public static final class onNavigationEvent extends AnimatorListenerAdapter {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ IAuthTabCallback IAuthTabCallback;
        final /* synthetic */ ViewPropertyAnimator onNavigationEvent;
        final /* synthetic */ View onWarmupCompleted;

        onNavigationEvent(IAuthTabCallback iAuthTabCallback, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.IAuthTabCallback = iAuthTabCallback;
            this.onNavigationEvent = viewPropertyAnimator;
            this.onWarmupCompleted = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.IAuthTabCallback.onExtraCallbackWithResult();
            int i4 = IAuthTabCallbackDefault + 125;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 67;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onNavigationEvent.setListener(null);
            this.onWarmupCompleted.setAlpha(1.0f);
            this.onWarmupCompleted.setTranslationX(0.0f);
            this.onWarmupCompleted.setTranslationY(0.0f);
            CaprLogBuilder.this.IAuthTabCallback(this.IAuthTabCallback.onExtraCallbackWithResult(), true);
            ((List) CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1293691066, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1293691064, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).remove(this.IAuthTabCallback.onExtraCallbackWithResult());
            CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = IAuthTabCallbackDefault + 41;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static final class IAuthTabCallbackDefault extends AnimatorListenerAdapter {
        private static int IAuthTabCallbackDefault = 1;
        private static int onExtraCallbackWithResult;
        final /* synthetic */ IAuthTabCallback IAuthTabCallback;
        final /* synthetic */ View onExtraCallback;
        final /* synthetic */ ViewPropertyAnimator onNavigationEvent;

        IAuthTabCallbackDefault(IAuthTabCallback iAuthTabCallback, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.IAuthTabCallback = iAuthTabCallback;
            this.onNavigationEvent = viewPropertyAnimator;
            this.onExtraCallback = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 111;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.IAuthTabCallback.onWarmupCompleted();
            int i4 = onExtraCallbackWithResult + 123;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 67 / 0;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 31;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(animator, "");
            this.onNavigationEvent.setListener(null);
            this.onExtraCallback.setAlpha(1.0f);
            this.onExtraCallback.setTranslationX(0.0f);
            this.onExtraCallback.setTranslationY(0.0f);
            CaprLogBuilder.this.IAuthTabCallback(this.IAuthTabCallback.onWarmupCompleted(), false);
            ((List) CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1293691066, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1293691064, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted())).remove(this.IAuthTabCallback.onWarmupCompleted());
            CaprLogBuilder.IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{CaprLogBuilder.this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
            int i4 = IAuthTabCallbackDefault + 89;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private final void onWarmupCompleted(IAuthTabCallback iAuthTabCallback) {
        View view;
        View view2;
        int i = 2 % 2;
        RecyclerView.ViewHolder viewHolderOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult();
        if (viewHolderOnExtraCallbackWithResult != null) {
            view = viewHolderOnExtraCallbackWithResult.onNavigationEvent;
        } else {
            int i2 = writeTypedObject + 27;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            view = null;
        }
        RecyclerView.ViewHolder viewHolderOnWarmupCompleted = iAuthTabCallback.onWarmupCompleted();
        if (viewHolderOnWarmupCompleted != null) {
            int i4 = readTypedObject + 91;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            view2 = viewHolderOnWarmupCompleted.onNavigationEvent;
        } else {
            view2 = null;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(onTransact());
            Intrinsics.checkNotNullExpressionValue(duration, "");
            this.onWarmupCompleted.add(iAuthTabCallback.onExtraCallbackWithResult());
            duration.translationX(iAuthTabCallback.onExtraCallback() - iAuthTabCallback.IAuthTabCallback());
            duration.translationY(iAuthTabCallback.IAuthTabCallbackStub() - iAuthTabCallback.onNavigationEvent());
            duration.alpha(0.0f).setListener(new onNavigationEvent(iAuthTabCallback, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.onWarmupCompleted.add(iAuthTabCallback.onWarmupCompleted());
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(onTransact()).alpha(1.0f).setListener(new IAuthTabCallbackDefault(iAuthTabCallback, viewPropertyAnimatorAnimate, view2)).start();
        }
        int i6 = readTypedObject + 21;
        writeTypedObject = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        CaprLogBuilder caprLogBuilder = (CaprLogBuilder) objArr[0];
        List list = (List) objArr[1];
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objArr[2];
        int i = 2 % 2;
        int i2 = writeTypedObject + 55;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        int size = list.size() - 1;
        Object obj = null;
        if (size >= 0) {
            while (true) {
                int i4 = size - 1;
                IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) list.get(size);
                if (caprLogBuilder.onNavigationEvent(iAuthTabCallback, viewHolder) && iAuthTabCallback.onExtraCallbackWithResult() == null) {
                    int i5 = writeTypedObject + 125;
                    readTypedObject = i5 % 128;
                    if (i5 % 2 != 0) {
                        iAuthTabCallback.onWarmupCompleted();
                        throw null;
                    }
                    if (iAuthTabCallback.onWarmupCompleted() == null) {
                        list.remove(iAuthTabCallback);
                    }
                }
                if (i4 < 0) {
                    break;
                }
                size = i4;
            }
        }
        int i6 = readTypedObject + 101;
        writeTypedObject = i6 % 128;
        if (i6 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void onNavigationEvent(IAuthTabCallback iAuthTabCallback) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 121;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (iAuthTabCallback.onExtraCallbackWithResult() != null) {
            onNavigationEvent(iAuthTabCallback, iAuthTabCallback.onExtraCallbackWithResult());
        }
        if (iAuthTabCallback.onWarmupCompleted() != null) {
            onNavigationEvent(iAuthTabCallback, iAuthTabCallback.onWarmupCompleted());
            int i4 = writeTypedObject + 9;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private final boolean onNavigationEvent(IAuthTabCallback iAuthTabCallback, RecyclerView.ViewHolder viewHolder) {
        int i = 2 % 2;
        boolean z = false;
        if (iAuthTabCallback.onWarmupCompleted() != viewHolder) {
            if (iAuthTabCallback.onExtraCallbackWithResult() != viewHolder) {
                return false;
            }
            int i2 = readTypedObject + 11;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                iAuthTabCallback.onNavigationEvent((RecyclerView.ViewHolder) null);
            } else {
                iAuthTabCallback.onNavigationEvent((RecyclerView.ViewHolder) null);
                z = true;
            }
        } else {
            int i3 = readTypedObject + 49;
            writeTypedObject = i3 % 128;
            int i4 = i3 % 2;
            iAuthTabCallback.onWarmupCompleted((RecyclerView.ViewHolder) null);
        }
        Intrinsics.checkNotNull(viewHolder);
        viewHolder.onNavigationEvent.setAlpha(1.0f);
        viewHolder.onNavigationEvent.setTranslationX(0.0f);
        viewHolder.onNavigationEvent.setTranslationY(0.0f);
        IAuthTabCallback(viewHolder, z);
        return true;
    }

    public void onExtraCallbackWithResult(@NotNull RecyclerView.ViewHolder viewHolder) {
        isUrgent isurgent;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        View view = viewHolder.onNavigationEvent;
        Intrinsics.checkNotNullExpressionValue(view, "");
        Object obj = null;
        if (viewHolder instanceof isUrgent) {
            int i2 = writeTypedObject + 123;
            int i3 = i2 % 128;
            readTypedObject = i3;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            isurgent = (isUrgent) viewHolder;
            int i4 = i3 + 37;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
        } else {
            isurgent = null;
        }
        if (isurgent == null || !isurgent.IAuthTabCallbackStub()) {
            view.animate().cancel();
        }
        int size = this.IAuthTabCallback_Parcel.size() - 1;
        if (size >= 0) {
            while (true) {
                int i6 = size - 1;
                if (this.IAuthTabCallback_Parcel.get(size).onExtraCallbackWithResult() == viewHolder) {
                    this.IAuthTabCallbackStub.setAnimationStartTimestamp(0L);
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    IAuthTabCallbackStub(viewHolder);
                    this.IAuthTabCallback_Parcel.remove(size);
                }
                if (i6 < 0) {
                    break;
                } else {
                    size = i6;
                }
            }
        }
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, this.access000, viewHolder}, -911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
        if (this.access100.remove(viewHolder)) {
            int i7 = readTypedObject + 87;
            writeTypedObject = i7 % 128;
            int i8 = i7 % 2;
            view.setAlpha(1.0f);
            asInterface(viewHolder);
        }
        if (this.IAuthTabCallbackStubProxy.remove(viewHolder)) {
            view.setAlpha(1.0f);
            onTransact(viewHolder);
        }
        int size2 = this.asBinder.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i9 = size2 - 1;
                List<IAuthTabCallback> list = this.asBinder.get(size2);
                IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, list, viewHolder}, -911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
                if (list.isEmpty()) {
                    this.asBinder.remove(size2);
                }
                if (i9 < 0) {
                    break;
                }
                int i10 = writeTypedObject + 123;
                readTypedObject = i10 % 128;
                int i11 = i10 % 2;
                size2 = i9;
            }
        }
        int size3 = this.onTransact.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i12 = size3 - 1;
                List<onExtraCallbackWithResult> list2 = this.onTransact.get(size3);
                int size4 = list2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i13 = size4 - 1;
                        if (list2.get(size4).onExtraCallbackWithResult() != viewHolder) {
                            if (i13 < 0) {
                                break;
                            } else {
                                size4 = i13;
                            }
                        } else {
                            this.IAuthTabCallbackStub.setAnimationStartTimestamp(0L);
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            IAuthTabCallbackStub(viewHolder);
                            list2.remove(size4);
                            if (list2.isEmpty()) {
                                this.onTransact.remove(size3);
                            }
                        }
                    }
                }
                if (i12 < 0) {
                    break;
                }
                int i14 = readTypedObject + 87;
                writeTypedObject = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
                size3 = i12;
            }
        }
        int size5 = this.onExtraCallbackWithResult.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i15 = size5 - 1;
                List<RecyclerView.ViewHolder> list3 = this.onExtraCallbackWithResult.get(size5);
                if (list3.remove(viewHolder)) {
                    int i16 = writeTypedObject + 81;
                    readTypedObject = i16 % 128;
                    int i17 = i16 % 2;
                    view.setAlpha(1.0f);
                    onTransact(viewHolder);
                    if (list3.isEmpty()) {
                        int i18 = writeTypedObject + 43;
                        readTypedObject = i18 % 128;
                        if (i18 % 2 != 0) {
                            this.onExtraCallbackWithResult.remove(size5);
                            int i19 = 28 / 0;
                        } else {
                            this.onExtraCallbackWithResult.remove(size5);
                        }
                    }
                }
                if (i15 < 0) {
                    break;
                }
                int i20 = readTypedObject + 111;
                writeTypedObject = i20 % 128;
                if (i20 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                size5 = i15;
            }
        }
        this.getInterfaceDescriptor.remove(viewHolder);
        this.onExtraCallback.remove(viewHolder);
        this.onWarmupCompleted.remove(viewHolder);
        this.asInterface.remove(viewHolder);
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        CaprLogBuilder caprLogBuilder = (CaprLogBuilder) objArr[0];
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) objArr[1];
        int i = 2 % 2;
        int i2 = writeTypedObject + 95;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        if (onNavigationEvent == null) {
            onNavigationEvent = new AccelerateDecelerateInterpolator();
            int i4 = writeTypedObject + 13;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
        }
        viewHolder.onNavigationEvent.animate().setInterpolator(onNavigationEvent);
        caprLogBuilder.onExtraCallbackWithResult(viewHolder);
        int i6 = readTypedObject + 47;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onExtraCallbackWithResult() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackStubProxy.isEmpty() && this.access000.isEmpty()) {
            int i2 = readTypedObject + 21;
            writeTypedObject = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 84 / 0;
                if (this.IAuthTabCallback_Parcel.isEmpty()) {
                    int i4 = readTypedObject + 27;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.access100.isEmpty();
                        throw null;
                    }
                    if (this.access100.isEmpty() && this.asInterface.isEmpty() && this.getInterfaceDescriptor.isEmpty()) {
                        int i5 = readTypedObject + 113;
                        writeTypedObject = i5 % 128;
                        int i6 = i5 % 2;
                        if (this.onExtraCallback.isEmpty() && this.onWarmupCompleted.isEmpty()) {
                            int i7 = writeTypedObject + 85;
                            readTypedObject = i7 % 128;
                            if (i7 % 2 != 0) {
                                this.onTransact.isEmpty();
                                throw null;
                            }
                            if (!(!this.onTransact.isEmpty()) && this.onExtraCallbackWithResult.isEmpty()) {
                                int i8 = readTypedObject + 121;
                                writeTypedObject = i8 % 128;
                                if (i8 % 2 == 0) {
                                    int i9 = 80 / 0;
                                    if (this.asBinder.isEmpty()) {
                                        return false;
                                    }
                                } else if (this.asBinder.isEmpty()) {
                                }
                            }
                        }
                    }
                }
            } else if (this.IAuthTabCallback_Parcel.isEmpty()) {
            }
        }
        return true;
    }

    public void onWarmupCompleted() {
        List<RecyclerView.ViewHolder> list;
        int size;
        int i = 2 % 2;
        int size2 = this.IAuthTabCallback_Parcel.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback_Parcel.get(size2);
            View view = onextracallbackwithresult.onExtraCallbackWithResult().onNavigationEvent;
            Intrinsics.checkNotNullExpressionValue(view, "");
            this.IAuthTabCallbackStub.setAnimationStartTimestamp(0L);
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            IAuthTabCallbackStub(onextracallbackwithresult.onExtraCallbackWithResult());
            this.IAuthTabCallback_Parcel.remove(size2);
        }
        for (int size3 = this.access100.size() - 1; size3 >= 0; size3--) {
            asInterface(this.access100.get(size3));
            this.access100.remove(size3);
        }
        int size4 = this.IAuthTabCallbackStubProxy.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.IAuthTabCallbackStubProxy.get(size4);
            viewHolder.onNavigationEvent.setAlpha(1.0f);
            onTransact(viewHolder);
            this.IAuthTabCallbackStubProxy.remove(size4);
        }
        for (int size5 = this.access000.size() - 1; size5 >= 0; size5--) {
            onNavigationEvent(this.access000.get(size5));
        }
        this.access000.clear();
        if (!onExtraCallbackWithResult()) {
            int i2 = writeTypedObject + 49;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        for (int size6 = this.onTransact.size() - 1; size6 >= 0; size6--) {
            List<onExtraCallbackWithResult> list2 = this.onTransact.get(size6);
            for (int size7 = list2.size() - 1; size7 >= 0; size7--) {
                onExtraCallbackWithResult onextracallbackwithresult2 = list2.get(size7);
                View view2 = onextracallbackwithresult2.onExtraCallbackWithResult().onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                IAuthTabCallbackStub(onextracallbackwithresult2.onExtraCallbackWithResult());
                list2.remove(size7);
                if (list2.isEmpty()) {
                    int i4 = readTypedObject + 67;
                    writeTypedObject = i4 % 128;
                    if (i4 % 2 == 0) {
                        this.onTransact.remove(list2);
                        int i5 = 18 / 0;
                    } else {
                        this.onTransact.remove(list2);
                    }
                }
            }
        }
        for (int size8 = this.onExtraCallbackWithResult.size() - 1; size8 >= 0; size8--) {
            int i6 = readTypedObject + 17;
            writeTypedObject = i6 % 128;
            if (i6 % 2 == 0) {
                list = this.onExtraCallbackWithResult.get(size8);
                size = list.size() >> 1;
            } else {
                list = this.onExtraCallbackWithResult.get(size8);
                size = list.size() - 1;
            }
            int i7 = writeTypedObject + 43;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            while (size >= 0) {
                RecyclerView.ViewHolder viewHolder2 = list.get(size);
                View view3 = viewHolder2.onNavigationEvent;
                Intrinsics.checkNotNullExpressionValue(view3, "");
                view3.setAlpha(1.0f);
                onTransact(viewHolder2);
                list.remove(size);
                if (list.isEmpty()) {
                    this.onExtraCallbackWithResult.remove(list);
                }
                size--;
            }
        }
        for (int size9 = this.asBinder.size() - 1; size9 >= 0; size9--) {
            List<IAuthTabCallback> list3 = this.asBinder.get(size9);
            for (int size10 = list3.size() - 1; size10 >= 0; size10--) {
                onNavigationEvent(list3.get(size10));
                if (list3.isEmpty()) {
                    this.asBinder.remove(list3);
                }
            }
        }
        onWarmupCompleted((List<? extends RecyclerView.ViewHolder>) this.getInterfaceDescriptor);
        onWarmupCompleted((List<? extends RecyclerView.ViewHolder>) this.asInterface);
        onWarmupCompleted((List<? extends RecyclerView.ViewHolder>) this.onExtraCallback);
        onWarmupCompleted((List<? extends RecyclerView.ViewHolder>) this.onWarmupCompleted);
        onExtraCallback();
    }

    private final void onWarmupCompleted(List<? extends RecyclerView.ViewHolder> list) {
        int size;
        int i = 2 % 2;
        int i2 = readTypedObject + 65;
        writeTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            size = list.size() + 1;
            if (size < 0) {
                return;
            }
        } else {
            size = list.size() - 1;
            if (size < 0) {
                return;
            }
        }
        while (true) {
            int i3 = size - 1;
            RecyclerView.ViewHolder viewHolder = list.get(size);
            Intrinsics.checkNotNull(viewHolder);
            viewHolder.onNavigationEvent.animate().cancel();
            if (i3 < 0) {
                return;
            }
            int i4 = readTypedObject + 105;
            writeTypedObject = i4 % 128;
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            size = i3;
        }
    }

    public boolean onWarmupCompleted(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<? extends Object> list) {
        int i = 2 % 2;
        int i2 = writeTypedObject + 107;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (viewHolder instanceof getRegion) {
            return true;
        }
        if (list.isEmpty()) {
            int i4 = readTypedObject + 61;
            writeTypedObject = i4 % 128;
            int i5 = i4 % 2;
            if (!super/*androidx.recyclerview.widget.RecyclerView.ItemAnimator*/.onWarmupCompleted(viewHolder, list)) {
                return false;
            }
        }
        int i6 = readTypedObject + 99;
        writeTypedObject = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    public static final /* synthetic */ List IAuthTabCallback(CaprLogBuilder caprLogBuilder) {
        return (List) IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{caprLogBuilder}, 1293691066, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1293691064, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void onNavigationEvent(List<IAuthTabCallback> list, RecyclerView.ViewHolder viewHolder) {
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, list, viewHolder}, -911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 911840946, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private final void IAuthTabCallbackStubProxy(RecyclerView.ViewHolder viewHolder) {
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this, viewHolder}, -1897454356, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), 1897454359, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    public final void onNavigationEvent() {
        IAuthTabCallback(GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{this}, 1689323911, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted(), -1689323910, GlobalKycEuNavHostKt$.ExternalSyntheticLambda0.onWarmupCompleted());
    }
}
