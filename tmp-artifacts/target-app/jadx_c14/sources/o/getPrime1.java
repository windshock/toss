package o;

import android.content.Context;
import im.toss.core.R;
import im.toss.splittarget.impl.fsm.AppStateImpl$;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class getPrime1 implements getSaltLength {
    public static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int onExtraCallback = 0;
    private final String IAuthTabCallback;
    private final String onExtraCallbackWithResult;
    private final RSASSAPSSparams onNavigationEvent;
    private final String onWarmupCompleted;

    @Override // o.getSaltLength
    public String onWarmupCompleted() {
        return null;
    }

    public getPrime1(@NotNull RSASSAPSSparams rSASSAPSSparams, @NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.onNavigationEvent = rSASSAPSSparams;
        this.IAuthTabCallback = str;
        this.onExtraCallbackWithResult = str2;
        this.onWarmupCompleted = str3;
    }

    public final RSASSAPSSparams IAuthTabCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.getSaltLength
    public String asInterface() {
        return this.IAuthTabCallback;
    }

    @Override // o.getSaltLength
    public String onExtraCallbackWithResult() {
        return this.onWarmupCompleted;
    }

    @Override // o.getSaltLength
    public String onNavigationEvent() {
        return this.onExtraCallbackWithResult;
    }

    @Override // o.getSaltLength
    public Integer onExtraCallback() {
        return Integer.valueOf(R.drawable.icn_certificate_color);
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final getPrime1 onWarmupCompleted(@NotNull Context context, @NotNull RSASSAPSSparams rSASSAPSSparams) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(rSASSAPSSparams, "");
            String strIAuthTabCallbackStub = rSASSAPSSparams.IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub == null) {
                strIAuthTabCallbackStub = "";
            }
            String string = context.getString(viva.republica.toss.R.string.certificate_type_issuer, rSASSAPSSparams.onWarmupCompleted(), rSASSAPSSparams.asBinder());
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = context.getString(viva.republica.toss.R.string.certificate_expiry_date, (String) RSASSAPSSparams.onNavigationEvent(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), new Object[]{rSASSAPSSparams}, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1054676118, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1054676117, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted()));
            Intrinsics.checkNotNullExpressionValue(string2, "");
            return new getPrime1(rSASSAPSSparams, strIAuthTabCallbackStub, string, string2);
        }
    }
}
