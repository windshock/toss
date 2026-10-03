package o;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class fileSRect {
    private static String onExtraCallback;
    public static final fileSRect onNavigationEvent = new fileSRect();
    public static final int onWarmupCompleted = 8;

    private fileSRect() {
    }

    public final boolean getInterfaceDescriptor() {
        return addPolicy.onSessionEnded().onExtraCallback("guest.guardian.is_save_info", false) && !access100();
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.is_save_info", true);
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnSessionEnded = addPolicy.onSessionEnded();
        String str6 = CommonModule_closeView.onWarmupCompleted.access000().format(zzan.onExtraCallbackWithResult(zzaj.onWarmupCompleted().asBinder(), 5));
        Intrinsics.checkNotNullExpressionValue(str6, "");
        textRoundCornerProgressBarSavedState1OnSessionEnded.onNavigationEvent("guest.info.expired.date", str6);
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.phone.number", str);
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.name", str2);
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.birthday", str3);
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.rrn.seventh", str4);
        addPolicy.onSessionEnded().onNavigationEvent("guest.guardian.carrier", str5);
    }

    public final String onTransact() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.guardian.phone.number", "");
    }

    public final String IAuthTabCallbackDefault() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.guardian.name", "");
    }

    public final String onExtraCallbackWithResult() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.guardian.birthday", "");
    }

    public final String asBinder() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.guardian.rrn.seventh", "");
    }

    public final String IAuthTabCallbackStub() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.guardian.carrier", "");
    }

    public final boolean IAuthTabCallbackStubProxy() {
        return !StringsKt.isBlank(asInterface());
    }

    public final void onNavigationEvent(long j) {
        addPolicy.onSessionEnded().onNavigationEvent("underFourteenGuestSessionId", String.valueOf(j));
    }

    public final String asInterface() {
        return addPolicy.onSessionEnded().onExtraCallbackWithResult("underFourteenGuestSessionId", "");
    }

    public final void onNavigationEvent() {
        addPolicy.onSessionEnded().onTransact("underFourteenGuestSessionId");
    }

    public final void onNavigationEvent(@Nullable String str) {
        onExtraCallback = str;
    }

    public final String onExtraCallback() {
        String str = onExtraCallback;
        return str == null ? "" : str;
    }

    public final void onWarmupCompleted() {
        onExtraCallback = null;
    }

    public final void IAuthTabCallback() {
        addPolicy.onSessionEnded().onTransact("guest.is_save_info");
        addPolicy.onSessionEnded().onTransact("guest.info.expired.date");
        addPolicy.onSessionEnded().onTransact("guest.phone.number");
        addPolicy.onSessionEnded().onTransact("guest.name");
        addPolicy.onSessionEnded().onTransact("guest.birthday");
        addPolicy.onSessionEnded().onTransact("guest.rrn.seventh");
        addPolicy.onSessionEnded().onTransact("guest.carrier");
        addPolicy.onSessionEnded().onTransact("guest.guardian.is_save_info");
        addPolicy.onSessionEnded().onTransact("guest.guardian.phone.number");
        addPolicy.onSessionEnded().onTransact("guest.guardian.name");
        addPolicy.onSessionEnded().onTransact("guest.guardian.birthday");
        addPolicy.onSessionEnded().onTransact("guest.guardian.rrn.seventh");
        addPolicy.onSessionEnded().onTransact("guest.guardian.carrier");
        onNavigationEvent();
        vTranslateForSCenter.onExtraCallbackWithResult.onExtraCallback();
    }

    private final boolean access100() {
        Object obj;
        String strOnExtraCallbackWithResult = addPolicy.onSessionEnded().onExtraCallbackWithResult("guest.info.expired.date", "");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(Boolean.valueOf(zzaj.onWarmupCompleted().asBinder().after(CommonModule_closeView.onWarmupCompleted.access000().parse(strOnExtraCallbackWithResult))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.onExtraCallback(obj)) {
            obj = bool;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            IAuthTabCallback();
        }
        return zBooleanValue;
    }
}
