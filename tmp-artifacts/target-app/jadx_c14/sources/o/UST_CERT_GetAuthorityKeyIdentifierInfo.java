package o;

import com.google.android.gms.internal.firebase-auth-api.zzmr;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CERT_GetAuthorityKeyIdentifierInfo {

    @SerializedName("accountNumber")
    private final String IAuthTabCallback;

    @SerializedName("inquiry")
    private final boolean IAuthTabCallbackDefault;

    @SerializedName("name")
    private final String IAuthTabCallbackStub;

    @SerializedName("scheme")
    private final String asBinder;

    @SerializedName("description")
    private final String asInterface;

    @SerializedName("type")
    private final onCollectWhenDestroy getInterfaceDescriptor;

    @SerializedName("canWithdraw")
    private final boolean onExtraCallback;

    @SerializedName("bankCode")
    private final int onExtraCallbackWithResult;

    @SerializedName("balance")
    private final Long onNavigationEvent;

    @SerializedName("isPrimaryAccount")
    private final boolean onTransact;

    @SerializedName("accountId")
    private final String onWarmupCompleted;

    public UST_CERT_GetAuthorityKeyIdentifierInfo(@NotNull KeyBoardVisiblePoint keyBoardVisiblePoint) {
        String strBP_;
        boolean zWriteTypedObject;
        Intrinsics.checkNotNullParameter(keyBoardVisiblePoint, "");
        Integer intOrNull = StringsKt.toIntOrNull(keyBoardVisiblePoint.asInterface());
        if (intOrNull == null) {
            throw new IllegalStateException("Invalid BankCode");
        }
        this.onExtraCallbackWithResult = intOrNull.intValue();
        String string = keyBoardVisiblePoint.access100().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.asBinder = string;
        this.getInterfaceDescriptor = keyBoardVisiblePoint.onWarmupCompleted();
        this.onWarmupCompleted = keyBoardVisiblePoint.onExtraCallbackWithResult();
        boolean z = keyBoardVisiblePoint instanceof onDisclaimerClick;
        if (z) {
            strBP_ = keyBoardVisiblePoint.onExtraCallbackWithResult();
        } else {
            strBP_ = keyBoardVisiblePoint.bP_();
        }
        this.IAuthTabCallback = strBP_;
        this.IAuthTabCallbackStub = keyBoardVisiblePoint.asBinder();
        this.asInterface = (String) issueCertV3.onExtraCallback(-212427217, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 212427218, new Object[]{keyBoardVisiblePoint}, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
        boolean z2 = keyBoardVisiblePoint instanceof TabBarInfoQueryPointOnTabBarInfoQueryListener;
        boolean zRequestPostMessageChannelWithExtras = true;
        if (z2) {
            TabBarInfoQueryPointOnTabBarInfoQueryListener tabBarInfoQueryPointOnTabBarInfoQueryListener = (TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint;
            zWriteTypedObject = tabBarInfoQueryPointOnTabBarInfoQueryListener.newAuthTabSession() && tabBarInfoQueryPointOnTabBarInfoQueryListener.requestPostMessageChannelWithExtras();
        } else {
            zWriteTypedObject = keyBoardVisiblePoint.writeTypedObject();
        }
        this.IAuthTabCallbackDefault = zWriteTypedObject;
        if (z2) {
            zRequestPostMessageChannelWithExtras = ((TabBarInfoQueryPointOnTabBarInfoQueryListener) keyBoardVisiblePoint).requestPostMessageChannelWithExtras();
        } else if (!z || ((onDisclaimerClick) keyBoardVisiblePoint).onMinimized()) {
            zRequestPostMessageChannelWithExtras = false;
        }
        this.onExtraCallback = zRequestPostMessageChannelWithExtras;
        this.onTransact = issueCertV3.asInterface(keyBoardVisiblePoint);
        this.onNavigationEvent = keyBoardVisiblePoint.onTransact();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(UST_CERT_GetAuthorityKeyIdentifierInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        UST_CERT_GetAuthorityKeyIdentifierInfo uST_CERT_GetAuthorityKeyIdentifierInfo = (UST_CERT_GetAuthorityKeyIdentifierInfo) obj;
        return this.getInterfaceDescriptor == uST_CERT_GetAuthorityKeyIdentifierInfo.getInterfaceDescriptor && Intrinsics.areEqual(this.onWarmupCompleted, uST_CERT_GetAuthorityKeyIdentifierInfo.onWarmupCompleted);
    }

    public int hashCode() {
        return (this.getInterfaceDescriptor.hashCode() * 31) + this.onWarmupCompleted.hashCode();
    }
}
