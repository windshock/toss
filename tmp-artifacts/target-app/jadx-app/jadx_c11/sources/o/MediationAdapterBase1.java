package o;

import android.content.Context;
import im.toss.features.verify.sms.impl.SmsVerifyInYourNameFragment$;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.QuirksExternalSyntheticBackport0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
final class MediationAdapterBase1 extends SupportedOutputSizesSorterLegacy<getShowingListenerWrappers> {
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final Context IAuthTabCallback;
    private final boolean IAuthTabCallbackDefault;
    private final Function1<isAdaptiveAdViewFormat, Unit> IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final getCachingExecutorService IAuthTabCallback_Parcel;
    private final String asBinder;
    private final getConfiguration<Float> asInterface;
    private final List<isQueryRefinementEnabled<Float, onSuggestionsKey>> onExtraCallback;
    private final Function0<Unit> onExtraCallbackWithResult;
    private final noStore onNavigationEvent;
    private final getReward onTransact;
    private final boolean onWarmupCompleted;

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = access100 + 121;
            getInterfaceDescriptor = i2 % 128;
            return !(i2 % 2 == 0);
        }
        if (!(obj instanceof MediationAdapterBase1)) {
            int i3 = access100 + 15;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        MediationAdapterBase1 mediationAdapterBase1 = (MediationAdapterBase1) obj;
        if (!Intrinsics.areEqual(this.IAuthTabCallback, mediationAdapterBase1.IAuthTabCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, mediationAdapterBase1.onTransact)) {
            int i5 = getInterfaceDescriptor + 7;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.asInterface, mediationAdapterBase1.asInterface) || !Intrinsics.areEqual(this.IAuthTabCallback_Parcel, mediationAdapterBase1.IAuthTabCallback_Parcel) || !Intrinsics.areEqual(this.onExtraCallback, mediationAdapterBase1.onExtraCallback) || this.onWarmupCompleted != mediationAdapterBase1.onWarmupCompleted || !Intrinsics.areEqual(this.onNavigationEvent, mediationAdapterBase1.onNavigationEvent)) {
            return false;
        }
        if (this.IAuthTabCallbackDefault != mediationAdapterBase1.IAuthTabCallbackDefault) {
            int i7 = access100 + 41;
            getInterfaceDescriptor = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStubProxy != mediationAdapterBase1.IAuthTabCallbackStubProxy) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, mediationAdapterBase1.asBinder)) {
            int i9 = getInterfaceDescriptor + 7;
            access100 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, mediationAdapterBase1.onExtraCallbackWithResult) || !Intrinsics.areEqual(this.IAuthTabCallbackStub, mediationAdapterBase1.IAuthTabCallbackStub)) {
            return false;
        }
        int i11 = getInterfaceDescriptor + 113;
        access100 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.IAuthTabCallback.hashCode();
        int iHashCode3 = this.onTransact.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        int iHashCode5 = this.IAuthTabCallback_Parcel.hashCode();
        int iHashCode6 = this.onExtraCallback.hashCode();
        int iHashCode7 = Boolean.hashCode(this.onWarmupCompleted);
        int iHashCode8 = this.onNavigationEvent.hashCode();
        int iHashCode9 = Boolean.hashCode(this.IAuthTabCallbackDefault);
        int iHashCode10 = Long.hashCode(this.IAuthTabCallbackStubProxy);
        String str = this.asBinder;
        int iHashCode11 = 0;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i2 = access100 + 69;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
        }
        int iHashCode12 = this.onExtraCallbackWithResult.hashCode();
        Function1<isAdaptiveAdViewFormat, Unit> function1 = this.IAuthTabCallbackStub;
        if (function1 != null) {
            int i4 = getInterfaceDescriptor + 41;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode11 = function1.hashCode();
        }
        return (((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode12) * 31) + iHashCode11;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TdsClickableElement(context=" + this.IAuthTabCallback + ", scaleState=" + this.onTransact + ", scaleTween=" + this.asInterface + ", transitionSpec=" + this.IAuthTabCallback_Parcel + ", coordinatedScales=" + this.onExtraCallback + ", enabled=" + this.onWarmupCompleted + ", haptic=" + this.onNavigationEvent + ", skipActionUpAnim=" + this.IAuthTabCallbackDefault + ", throttleInterval=" + this.IAuthTabCallbackStubProxy + ", throttleGroupId=" + this.asBinder + ", onClick=" + this.onExtraCallbackWithResult + ", onEvent=" + this.IAuthTabCallbackStub + ")";
        int i2 = access100 + 77;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediationAdapterBase1(@NotNull Context context, @NotNull getReward getreward, @NotNull getConfiguration<Float> getconfiguration, @NotNull getCachingExecutorService getcachingexecutorservice, @NotNull List<isQueryRefinementEnabled<Float, onSuggestionsKey>> list, boolean z, @NotNull noStore nostore, boolean z2, long j, @Nullable String str, @NotNull Function0<Unit> function0, @Nullable Function1<? super isAdaptiveAdViewFormat, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(getreward, "");
        Intrinsics.checkNotNullParameter(getconfiguration, "");
        Intrinsics.checkNotNullParameter(getcachingexecutorservice, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(nostore, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.IAuthTabCallback = context;
        this.onTransact = getreward;
        this.asInterface = getconfiguration;
        this.IAuthTabCallback_Parcel = getcachingexecutorservice;
        this.onExtraCallback = list;
        this.onWarmupCompleted = z;
        this.onNavigationEvent = nostore;
        this.IAuthTabCallbackDefault = z2;
        this.IAuthTabCallbackStubProxy = j;
        this.asBinder = str;
        this.onExtraCallbackWithResult = function0;
        this.IAuthTabCallbackStub = function1;
    }

    public /* synthetic */ QuirksExternalSyntheticBackport0.onWarmupCompleted onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 43;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        getShowingListenerWrappers getshowinglistenerwrappersOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int i4 = getInterfaceDescriptor + 83;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowinglistenerwrappersOnExtraCallbackWithResult;
        }
        throw null;
    }

    public /* bridge */ /* synthetic */ void onNavigationEvent(QuirksExternalSyntheticBackport0.onWarmupCompleted onwarmupcompleted) {
        int i = 2 % 2;
        int i2 = access100 + 59;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent((getShowingListenerWrappers) onwarmupcompleted);
        int i4 = getInterfaceDescriptor + 47;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public getShowingListenerWrappers onExtraCallbackWithResult() {
        int i = 2 % 2;
        getShowingListenerWrappers getshowinglistenerwrappers = new getShowingListenerWrappers(this.IAuthTabCallback, this.onTransact, this.asInterface, this.IAuthTabCallback_Parcel, this.onExtraCallback, this.onWarmupCompleted, this.onNavigationEvent, this.IAuthTabCallbackDefault, this.IAuthTabCallbackStubProxy, this.asBinder, this.onExtraCallbackWithResult, this.IAuthTabCallbackStub);
        int i2 = access100 + 121;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return getshowinglistenerwrappers;
        }
        throw null;
    }

    public void onNavigationEvent(@NotNull getShowingListenerWrappers getshowinglistenerwrappers) {
        int i = 2 % 2;
        int i2 = access100 + 11;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(getshowinglistenerwrappers, "");
        getshowinglistenerwrappers.IAuthTabCallback(this.IAuthTabCallback);
        getShowingListenerWrappers.onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{getshowinglistenerwrappers, this.onTransact}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 198604226, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -198604225);
        getshowinglistenerwrappers.onExtraCallback(this.asInterface);
        getshowinglistenerwrappers.onNavigationEvent(this.IAuthTabCallback_Parcel);
        getshowinglistenerwrappers.onExtraCallback(this.onExtraCallback);
        getshowinglistenerwrappers.onNavigationEvent(this.onWarmupCompleted);
        getshowinglistenerwrappers.onExtraCallback(this.onNavigationEvent);
        getShowingListenerWrappers.onWarmupCompleted(SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[]{getshowinglistenerwrappers, Boolean.valueOf(this.IAuthTabCallbackDefault)}, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), 1192709816, SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), SmsVerifyInYourNameFragment$.ExternalSyntheticLambda4.IAuthTabCallback(), -1192709816);
        getshowinglistenerwrappers.IAuthTabCallback(this.IAuthTabCallbackStubProxy);
        getshowinglistenerwrappers.onNavigationEvent(this.asBinder);
        getshowinglistenerwrappers.IAuthTabCallback(this.onExtraCallbackWithResult);
        getshowinglistenerwrappers.onNavigationEvent(this.IAuthTabCallbackStub);
        getshowinglistenerwrappers.IAuthTabCallbackStub();
        int i4 = access100 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
