package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class JavaOnlyArrayCompanion implements access2800 {
    private static final onWarmupCompleted Companion = new onWarmupCompleted(null);

    public static final /* synthetic */ class onExtraCallbackWithResult {
        public static final /* synthetic */ int[] onNavigationEvent;

        static {
            int[] iArr = new int[access3100.values().length];
            try {
                iArr[access3100.PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            onNavigationEvent = iArr;
        }
    }

    @Inject
    public JavaOnlyArrayCompanion() {
    }

    public access3100 onNavigationEvent(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "");
        String strOnExtraCallbackWithResult = addPolicy.ITrustedWebActivityServiceStub().onExtraCallbackWithResult("prefs_key_transfer_auth_method", "");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(access3100.valueOf(strOnExtraCallbackWithResult));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.onExtraCallback(obj)) {
            obj = null;
        }
        access3100 access3100Var = (access3100) obj;
        access3100 access3100Var2 = access3100.BIOMETRIC;
        boolean z = access3100Var == access3100Var2 && !onExtraCallbackWithResult(context);
        if (access3100Var == null) {
            access3100Var = (addPolicy.getSmallIconBitmap().onExtraCallback("prefs_key_password_only_to_send_on", false) || !onExtraCallbackWithResult(context)) ? access3100.PASSWORD : access3100Var2;
            onExtraCallbackWithResult(access3100Var);
        } else if (z) {
            access3100Var = onExtraCallbackWithResult(context) ? access3100Var2 : access3100.PASSWORD;
            onExtraCallbackWithResult(access3100Var);
        }
        return access3100Var;
    }

    public void onExtraCallback(@NotNull access3100 access3100Var) {
        Intrinsics.checkNotNullParameter(access3100Var, "");
        onExtraCallbackWithResult(access3100Var);
    }

    public boolean onExtraCallbackWithResult(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return accessMapSafely.onNavigationEvent.IAuthTabCallback(context);
    }

    public boolean onWarmupCompleted(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return onExtraCallbackWithResult.onNavigationEvent[onNavigationEvent(context).ordinal()] == 1;
    }

    private final void onExtraCallbackWithResult(access3100 access3100Var) {
        addPolicy.ITrustedWebActivityServiceStub().onNavigationEvent("prefs_key_transfer_auth_method", access3100Var.name());
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }
}
