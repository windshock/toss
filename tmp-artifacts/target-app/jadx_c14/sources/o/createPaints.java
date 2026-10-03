package o;

import im.toss.define.MobileCarrier;
import java.util.Calendar;
import java.util.Date;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class createPaints implements getCurrY {
    public static final createPaints IAuthTabCallback = new createPaints();
    private static final TextRoundCornerProgressBarSavedState1 onNavigationEvent = addPolicy.ITrustedWebActivityCallbackStubProxy();
    private static final TextRoundCornerProgressBarSavedState1 onExtraCallback = addPolicy.getSmallIconBitmap();
    public static final int onWarmupCompleted = 8;

    private createPaints() {
    }

    public /* bridge */ boolean IAuthTabCallbackStub() {
        return super.IAuthTabCallbackStub();
    }

    public /* bridge */ boolean asInterface() {
        return super.asInterface();
    }

    public /* bridge */ boolean getInterfaceDescriptor() {
        return super.getInterfaceDescriptor();
    }

    public /* bridge */ Integer onExtraCallbackWithResult() {
        return super.onExtraCallbackWithResult();
    }

    public String asBinder() {
        return onNavigationEvent.onExtraCallbackWithResult("LOGIN_USER_NAME", "");
    }

    public void asInterface(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.onNavigationEvent("LOGIN_USER_NAME", str);
    }

    public String writeTypedObject() {
        return onNavigationEvent.onExtraCallbackWithResult("LOGIN_USER_KO_NAME", "");
    }

    public void onExtraCallbackWithResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.onNavigationEvent("LOGIN_USER_KO_NAME", str);
    }

    public String IAuthTabCallback() {
        return onNavigationEvent.onExtraCallbackWithResult("LOGIN_PHONE_NUMBER", "");
    }

    public void onNavigationEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.onNavigationEvent("LOGIN_PHONE_NUMBER", str);
    }

    public String onNavigationEvent() {
        return onNavigationEvent.onExtraCallbackWithResult("LOGIN_BIRTHDAY", "");
    }

    public void IAuthTabCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.onNavigationEvent("LOGIN_BIRTHDAY", str);
    }

    public String onTransact() {
        return onNavigationEvent.onExtraCallbackWithResult("LOGIN_RRN_SEVENTH", "");
    }

    public void onExtraCallback(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.onNavigationEvent("LOGIN_RRN_SEVENTH", str);
    }

    public MobileCarrier onExtraCallback() {
        return (MobileCarrier) onNavigationEvent.onExtraCallback("LOGIN_MOBILE_CARRIER", MobileCarrier.NONE);
    }

    public void onNavigationEvent(@NotNull MobileCarrier mobileCarrier) {
        Intrinsics.checkNotNullParameter(mobileCarrier, "");
        if (mobileCarrier != MobileCarrier.NONE) {
            onExtraCallbackWithResult(Long.valueOf(System.currentTimeMillis()));
        }
        onNavigationEvent.IAuthTabCallback("LOGIN_MOBILE_CARRIER", mobileCarrier);
    }

    public isVivoY11 IAuthTabCallbackDefault() {
        return (isVivoY11) onNavigationEvent.onNavigationEvent("LOGIN_CERTIFY_METHOD", isVivoY11.class, (Object) null);
    }

    public void onNavigationEvent(@Nullable isVivoY11 isvivoy11) {
        if (isvivoy11 != null) {
            onNavigationEvent.IAuthTabCallback("LOGIN_CERTIFY_METHOD", isvivoy11);
        } else {
            onNavigationEvent.onTransact("LOGIN_CERTIFY_METHOD");
        }
    }

    public setSelection access000() {
        return (setSelection) onExtraCallback.onNavigationEvent("LOGIN_POSSESSION_METHOD", setSelection.class, (Object) null);
    }

    public void IAuthTabCallback(@Nullable setSelection setselection) {
        if (setselection != null) {
            onExtraCallback.IAuthTabCallback("LOGIN_POSSESSION_METHOD", setselection);
        } else {
            onExtraCallback.onTransact("LOGIN_POSSESSION_METHOD");
        }
    }

    public IndicatorView access100() {
        return (IndicatorView) onExtraCallback.onNavigationEvent("LOGIN_PASSWORD_LOG_INPUT_TYPE", IndicatorView.class, (Object) null);
    }

    public void onExtraCallbackWithResult(@Nullable IndicatorView indicatorView) {
        if (indicatorView != null) {
            onExtraCallback.onWarmupCompleted("LOGIN_PASSWORD_LOG_INPUT_TYPE", indicatorView, true);
        } else {
            onExtraCallback.onTransact("LOGIN_PASSWORD_LOG_INPUT_TYPE");
        }
    }

    public String IAuthTabCallback_Parcel() {
        return onExtraCallback.IAuthTabCallback("LOGIN_GUARDIAN_CERTIFICATION_TOKEN");
    }

    public void onWarmupCompleted(@Nullable String str) {
        if (str != null) {
            onExtraCallback.onNavigationEvent("LOGIN_GUARDIAN_CERTIFICATION_TOKEN", str);
        } else {
            onExtraCallback.onTransact("LOGIN_GUARDIAN_CERTIFICATION_TOKEN");
        }
    }

    public Long IAuthTabCallbackStubProxy() {
        return Long.valueOf(onExtraCallback.onExtraCallback("LOGIN_LAST_SAVED_TIMESTAMP", 0L));
    }

    public void onExtraCallbackWithResult(@Nullable Long l) {
        if (l != null) {
            onExtraCallback.onNavigationEvent("LOGIN_LAST_SAVED_TIMESTAMP", l.longValue());
        } else {
            onExtraCallback.onTransact("LOGIN_LAST_SAVED_TIMESTAMP");
        }
    }

    public boolean ICustomTabsCallback() {
        return onExtraCallback.onExtraCallback("LOGIN_REJECT_FROM_VISITOR_ONBOARDING", false);
    }

    public void onExtraCallbackWithResult(boolean z) {
        onExtraCallback.onNavigationEvent("LOGIN_REJECT_FROM_VISITOR_ONBOARDING", z);
    }

    public static /* synthetic */ void onExtraCallback(createPaints createpaints, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        createpaints.onNavigationEvent(z);
    }

    public final void onNavigationEvent(boolean z) {
        isZoomEnabled.onExtraCallback.onExtraCallbackWithResult();
        String strAsBinder = asBinder();
        String strIAuthTabCallback = IAuthTabCallback();
        String strOnNavigationEvent = onNavigationEvent();
        String strOnTransact = onTransact();
        MobileCarrier mobileCarrierOnExtraCallback = onExtraCallback();
        Long lIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        addPolicy.ITrustedWebActivityCallbackStubProxy().onNavigationEvent();
        if (setAdUnitIds.Companion.onNavigationEvent().IAuthTabCallback() || onNavigationEvent(lIAuthTabCallbackStubProxy) || z) {
            return;
        }
        asInterface(strAsBinder);
        onNavigationEvent(strIAuthTabCallback);
        IAuthTabCallback(strOnNavigationEvent);
        onExtraCallback(strOnTransact);
        onNavigationEvent(mobileCarrierOnExtraCallback);
        onExtraCallbackWithResult(lIAuthTabCallbackStubProxy);
    }

    public static /* synthetic */ boolean onWarmupCompleted(createPaints createpaints, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = IAuthTabCallback.IAuthTabCallbackStubProxy();
        }
        return createpaints.onNavigationEvent(l);
    }

    public final boolean onNavigationEvent(@Nullable Long l) {
        if (l == null || l.longValue() <= 0) {
            return true;
        }
        commonTestFlag commontestflag = commonTestFlag.onExtraCallback;
        Date date = new Date(l.longValue());
        Date time = Calendar.getInstance().getTime();
        Intrinsics.checkNotNullExpressionValue(time, "");
        return commontestflag.onWarmupCompleted(date, time) > 5;
    }

    public final void onWarmupCompleted() {
        onExtraCallbackWithResult((Long) null);
    }

    public final boolean extraCallbackWithResult() {
        return CollectionsKt.listOf(new String[]{"5", "6", "7", "8"}).contains(onTransact());
    }
}
