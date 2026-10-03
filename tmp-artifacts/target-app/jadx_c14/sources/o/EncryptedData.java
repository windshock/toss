package o;

import android.view.View;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class EncryptedData implements getOther {
    public static final int $stable = 0;
    private final float bottomMarginDp;
    private final String buttonLabel;
    private final TdsButtonV1View.IAuthTabCallbackDefault buttonStyle;
    private final TdsButtonV1View.IAuthTabCallbackStub buttonType;
    private final String customLottieUrl;
    private final String message;
    private final Function1<View, Unit> onButtonClick;
    private final String title;
    private final float topMarginDp;

    public EncryptedData() {
        this(null, null, null, null, null, null, null, 0.0f, 0.0f, 511, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EncryptedData)) {
            return false;
        }
        EncryptedData encryptedData = (EncryptedData) obj;
        return Intrinsics.areEqual(this.title, encryptedData.title) && Intrinsics.areEqual(this.message, encryptedData.message) && Intrinsics.areEqual(this.buttonLabel, encryptedData.buttonLabel) && this.buttonStyle == encryptedData.buttonStyle && this.buttonType == encryptedData.buttonType && Intrinsics.areEqual(this.customLottieUrl, encryptedData.customLottieUrl) && Intrinsics.areEqual(this.onButtonClick, encryptedData.onButtonClick) && Float.compare(this.topMarginDp, encryptedData.topMarginDp) == 0 && Float.compare(this.bottomMarginDp, encryptedData.bottomMarginDp) == 0;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.buttonLabel;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.buttonStyle.hashCode();
        int iHashCode5 = this.buttonType.hashCode();
        String str4 = this.customLottieUrl;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Function1<View, Unit> function1 = this.onButtonClick;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (function1 != null ? function1.hashCode() : 0)) * 31) + Float.hashCode(this.topMarginDp)) * 31) + Float.hashCode(this.bottomMarginDp);
    }

    public String toString() {
        return "EmptyItem(title=" + this.title + ", message=" + this.message + ", buttonLabel=" + this.buttonLabel + ", buttonStyle=" + this.buttonStyle + ", buttonType=" + this.buttonType + ", customLottieUrl=" + this.customLottieUrl + ", onButtonClick=" + this.onButtonClick + ", topMarginDp=" + this.topMarginDp + ", bottomMarginDp=" + this.bottomMarginDp + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EncryptedData(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault, @NotNull TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub, @Nullable String str4, @Nullable Function1<? super View, Unit> function1, float f, float f2) {
        Intrinsics.checkNotNullParameter(iAuthTabCallbackDefault, "");
        Intrinsics.checkNotNullParameter(iAuthTabCallbackStub, "");
        this.title = str;
        this.message = str2;
        this.buttonLabel = str3;
        this.buttonStyle = iAuthTabCallbackDefault;
        this.buttonType = iAuthTabCallbackStub;
        this.customLottieUrl = str4;
        this.onButtonClick = function1;
        this.topMarginDp = f;
        this.bottomMarginDp = f2;
    }

    public final String asInterface() {
        return this.title;
    }

    public final String IAuthTabCallbackDefault() {
        return this.message;
    }

    public final String onExtraCallback() {
        return this.buttonLabel;
    }

    public /* synthetic */ EncryptedData(String str, String str2, String str3, TdsButtonV1View.IAuthTabCallbackDefault iAuthTabCallbackDefault, TdsButtonV1View.IAuthTabCallbackStub iAuthTabCallbackStub, String str4, Function1 function1, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? TdsButtonV1View.IAuthTabCallbackDefault.WEAK : iAuthTabCallbackDefault, (i & 16) != 0 ? TdsButtonV1View.IAuthTabCallbackStub.PRIMARY : iAuthTabCallbackStub, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? function1 : null, (i & 128) != 0 ? 72.0f : f, (i & 256) == 0 ? f2 : 72.0f);
    }

    public final TdsButtonV1View.IAuthTabCallbackDefault onWarmupCompleted() {
        return this.buttonStyle;
    }

    public final TdsButtonV1View.IAuthTabCallbackStub onExtraCallbackWithResult() {
        return this.buttonType;
    }

    public final String IAuthTabCallback() {
        return this.customLottieUrl;
    }

    public final Function1<View, Unit> IAuthTabCallbackStub() {
        return this.onButtonClick;
    }

    public final float asBinder() {
        return this.topMarginDp;
    }

    public final float onNavigationEvent() {
        return this.bottomMarginDp;
    }

    @Override // o.getOther
    public toASN1EncodableVector onTransact() {
        return toASN1EncodableVector.EMPTY;
    }
}
