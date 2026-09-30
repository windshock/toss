package o;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class MaxInterstitialAd extends setCreativeDebuggerEnabled<MaxAdView> {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private Integer IAuthTabCallback;
    private boolean onExtraCallback;
    private Integer onExtraCallbackWithResult;

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i2);
        int i9 = (~(i7 | i5)) | i8;
        int i10 = ~i2;
        int i11 = ~(i10 | i);
        int i12 = i8 | i11 | (~(i10 | i5));
        int i13 = (~((~i5) | i10)) | i8 | i11;
        int i14 = i + i2 + i3 + ((-369695973) * i4) + (1794320298 * i6);
        int i15 = i14 * i14;
        int i16 = ((-1820121865) * i) + 1478230016 + (776760710 * i2) + ((-1698084721) * i9) + ((-1731255050) * i12) + (865627525 * i13) + ((-88866816) * i3) + (217841664 * i4) + ((-410517504) * i6) + ((-175177728) * i15);
        int i17 = ((i * 1872133577) - 2052485254) + (i2 * 1872135674) + (i9 * 2097) + (i12 * (-1398)) + (i13 * 699) + (i3 * 1872134975) + (i4 * (-1328892763)) + (i6 * (-1296121642)) + (i15 * (-1691287552));
        int i18 = i16 + (i17 * i17 * (-1729036288));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onExtraCallback(objArr) : IAuthTabCallback(objArr);
    }

    public MaxInterstitialAd() {
        super(new MaxAdView());
    }

    private final MediationAdapterRouterRouterAdLoadType onNavigationEvent() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadTypeICustomTabsCallback = ICustomTabsCallback().onWarmupCompleted().ICustomTabsCallback();
        if (i3 == 0) {
            return mediationAdapterRouterRouterAdLoadTypeICustomTabsCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objArr[0];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 41;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        getIconView geticonviewICustomTabsCallback = maxInterstitialAd.ICustomTabsCallback().IAuthTabCallback().ICustomTabsCallback();
        int i4 = onNavigationEvent + 87;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return geticonviewICustomTabsCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        shouldPrepareViewForInteractionOnMainThread shouldprepareviewforinteractiononmainthreadICustomTabsCallback = maxInterstitialAd.ICustomTabsCallback().onNavigationEvent().ICustomTabsCallback();
        int i4 = onNavigationEvent + 53;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return shouldprepareviewforinteractiononmainthreadICustomTabsCallback;
        }
        throw null;
    }

    public final void getInterfaceDescriptor(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 95;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {onNavigationEvent(), f};
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(-111626881, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, 111626882, iOnNavigationEvent2, objArr);
            IAuthTabCallbackStub();
            int i3 = 90 / 0;
        } else {
            Object[] objArr2 = {onNavigationEvent(), f};
            int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(-111626881, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, 111626882, iOnNavigationEvent4, objArr2);
            IAuthTabCallbackStub();
        }
        int i4 = onWarmupCompleted + 55;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        maxInterstitialAd.onNavigationEvent().access000(f);
        maxInterstitialAd.IAuthTabCallbackStub();
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void access000(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 91;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().extraCallbackWithResult(f);
        IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 73;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallbackStubProxy(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent().IAuthTabCallback_Parcel(f);
            IAuthTabCallbackStub();
        } else {
            onNavigationEvent().IAuthTabCallback_Parcel(f);
            IAuthTabCallbackStub();
            throw null;
        }
    }

    public final void onNavigationEvent(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().onWarmupCompleted(f);
            IAuthTabCallbackStub();
            int i3 = 92 / 0;
        } else {
            onNavigationEvent().onWarmupCompleted(f);
            IAuthTabCallbackStub();
        }
        int i4 = onNavigationEvent + 19;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExtraCallbackWithResult(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().IAuthTabCallbackDefault(f);
        IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 121;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }

    public final void IAuthTabCallbackDefault(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 27;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {onNavigationEvent(), f};
            int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(-290158022, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, 290158026, iOnNavigationEvent2, objArr);
            IAuthTabCallbackStub();
            int i3 = 66 / 0;
        } else {
            Object[] objArr2 = {onNavigationEvent(), f};
            int iOnNavigationEvent3 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            int iOnNavigationEvent4 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
            MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(-290158022, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent3, 290158026, iOnNavigationEvent4, objArr2);
            IAuthTabCallbackStub();
        }
        int i4 = onWarmupCompleted + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    public final Float onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        MediationAdapterRouterRouterAdLoadType mediationAdapterRouterRouterAdLoadTypeOnNavigationEvent = onNavigationEvent();
        if (i3 == 0) {
            return mediationAdapterRouterRouterAdLoadTypeOnNavigationEvent.onExtraCallback();
        }
        mediationAdapterRouterRouterAdLoadTypeOnNavigationEvent.onExtraCallback();
        throw null;
    }

    public final void onExtraCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 121;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().onNavigationEvent(f);
        IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 83;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            maxInterstitialAd.onNavigationEvent().onTransact(f);
            maxInterstitialAd.IAuthTabCallbackStub();
            int i3 = 92 / 0;
        } else {
            maxInterstitialAd.onNavigationEvent().onTransact(f);
            maxInterstitialAd.IAuthTabCallbackStub();
        }
        int i4 = onNavigationEvent + 103;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void asBinder(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 21;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent().asBinder(f);
        IAuthTabCallbackStub();
        int i4 = onNavigationEvent + 31;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void IAuthTabCallbackStub(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {onNavigationEvent(), f};
        int iOnNavigationEvent = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        int iOnNavigationEvent2 = LayoutShadowNode.onWarmupCompleted.onNavigationEvent();
        MediationAdapterRouterRouterAdLoadType.IAuthTabCallback(1128941242, LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), LayoutShadowNode.onWarmupCompleted.onNavigationEvent(), iOnNavigationEvent, -1128941240, iOnNavigationEvent2, objArr);
        IAuthTabCallbackStub();
        int i4 = onWarmupCompleted + 83;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void asInterface(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 13;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            onNavigationEvent().IAuthTabCallbackStubProxy(f);
            IAuthTabCallbackStub();
            int i3 = 5 / 0;
        } else {
            onNavigationEvent().IAuthTabCallbackStubProxy(f);
            IAuthTabCallbackStub();
        }
        int i4 = onWarmupCompleted + 47;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void IAuthTabCallback_Parcel(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 125;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().access100(f);
            IAuthTabCallbackStub();
            int i3 = onWarmupCompleted + 125;
            onNavigationEvent = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        onNavigationEvent().access100(f);
        IAuthTabCallbackStub();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Float f) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 != 0) {
            onNavigationEvent().onExtraCallbackWithResult(f);
            IAuthTabCallbackStub();
        } else {
            onNavigationEvent().onExtraCallbackWithResult(f);
            IAuthTabCallbackStub();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        MaxInterstitialAd maxInterstitialAd = (MaxInterstitialAd) objArr[0];
        Float f = (Float) objArr[1];
        int i = 2 % 2;
        int i2 = onNavigationEvent + 89;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        maxInterstitialAd.ICustomTabsCallback().onWarmupCompleted().ICustomTabsCallback().IAuthTabCallback(f);
        maxInterstitialAd.IAuthTabCallbackStub();
        maxInterstitialAd.onTransact();
        int i4 = onWarmupCompleted + 79;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 79;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            ((getIconView) onWarmupCompleted(99656369, -99656367, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback(j);
            return;
        }
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        ((getIconView) onWarmupCompleted(99656369, -99656367, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback(j);
        throw null;
    }

    public final int onExtraCallbackWithResult() {
        long jIAuthTabCallback;
        int i = 2 % 2;
        int i2 = onNavigationEvent + 23;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            jIAuthTabCallback = ((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback() << 3;
        } else {
            int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
            jIAuthTabCallback = ((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback() >> 32;
        }
        return (int) jIAuthTabCallback;
    }

    public final int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 69;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
            ((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback();
            obj.hashCode();
            throw null;
        }
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        int iIAuthTabCallback = (int) ((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback();
        int i3 = onNavigationEvent + 49;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return iIAuthTabCallback;
        }
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(@NotNull Function1<? super MaxInterstitialAd, Unit> function1) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 39;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = true;
            function1.invoke(this);
            this.onExtraCallback = true;
        } else {
            Intrinsics.checkNotNullParameter(function1, "");
            this.onExtraCallback = true;
            function1.invoke(this);
            this.onExtraCallback = false;
        }
        IAuthTabCallbackStub();
        onTransact();
    }

    private final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 29;
        int i3 = i2 % 128;
        onWarmupCompleted = i3;
        int i4 = i2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        int i5 = i3 + 97;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 == 0) {
            Iterator<T> it = onNavigationEvent().onWarmupCompleted().values().iterator();
            while (it.hasNext()) {
                int i6 = onNavigationEvent + 103;
                onWarmupCompleted = i6 % 128;
                int i7 = i6 % 2;
                ((Function0) it.next()).invoke();
            }
            return;
        }
        onNavigationEvent().onWarmupCompleted().values().iterator();
        throw null;
    }

    private final void onTransact() {
        int iOnExtraCallbackWithResult;
        int iIAuthTabCallback;
        int i = 2 % 2;
        if (this.onExtraCallback) {
            return;
        }
        Integer num = this.onExtraCallbackWithResult;
        if (num != null) {
            int i2 = onWarmupCompleted + 15;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            iOnExtraCallbackWithResult = num.intValue();
            int i4 = onNavigationEvent + 55;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iOnExtraCallbackWithResult = onExtraCallbackWithResult();
        }
        Integer num2 = this.IAuthTabCallback;
        if (num2 != null) {
            int i6 = onNavigationEvent + 49;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            iIAuthTabCallback = num2.intValue();
        } else {
            iIAuthTabCallback = IAuthTabCallback();
        }
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted((iOnExtraCallbackWithResult << 32) | (iIAuthTabCallback & 4294967295L));
        if (!ExtensionsManager1.IAuthTabCallback(((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent())).IAuthTabCallback(), jOnWarmupCompleted)) {
            ((shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent())).onExtraCallbackWithResult(jOnWarmupCompleted, true);
        }
        this.onExtraCallbackWithResult = null;
        this.IAuthTabCallback = null;
    }

    @Override // o.setCreativeDebuggerEnabled
    public void onExtraCallbackWithResult(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled, float f) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 11;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            ICustomTabsCallback().IAuthTabCallback(iscreativedebuggerenabled, f);
        } else {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            ICustomTabsCallback().IAuthTabCallback(iscreativedebuggerenabled, f);
            throw null;
        }
    }

    @Override // o.setCreativeDebuggerEnabled
    public Float onWarmupCompleted(@NotNull isCreativeDebuggerEnabled iscreativedebuggerenabled) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 119;
        onNavigationEvent = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
            ICustomTabsCallback().IAuthTabCallback(iscreativedebuggerenabled);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(iscreativedebuggerenabled, "");
        Float fIAuthTabCallback = ICustomTabsCallback().IAuthTabCallback(iscreativedebuggerenabled);
        int i3 = onWarmupCompleted + 93;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            return fIAuthTabCallback;
        }
        throw null;
    }

    private final getIconView onExtraCallback() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (getIconView) onWarmupCompleted(99656369, -99656367, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent());
    }

    private final shouldPrepareViewForInteractionOnMainThread IAuthTabCallbackDefault() {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        return (shouldPrepareViewForInteractionOnMainThread) onWarmupCompleted(1135111481, -1135111477, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public final void onWarmupCompleted(@Nullable Float f) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onWarmupCompleted(-1040614246, 1040614246, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, f}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public final void onTransact(@Nullable Float f) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onWarmupCompleted(963538594, -963538591, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, f}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent());
    }

    public final void access100(@Nullable Float f) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        onWarmupCompleted(-1866336085, 1866336086, RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, f}, iOnNavigationEvent, RNSScreenManagerDelegate.onNavigationEvent());
    }
}
