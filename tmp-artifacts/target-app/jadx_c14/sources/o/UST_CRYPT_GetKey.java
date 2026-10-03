package o;

import im.toss.tds.view.component.atom.text.BaseTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class UST_CRYPT_GetKey implements UST_CMS_EncryptedData {
    private final Integer IAuthTabCallback;
    private final long onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final Function1<BaseTextView, Unit> onWarmupCompleted;

    public UST_CRYPT_GetKey(@NotNull Function1<? super BaseTextView, Unit> function1, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onWarmupCompleted = function1;
        this.IAuthTabCallback = num;
        long jHashCode = (function1.hashCode() + "-" + num + "-typo07").hashCode();
        this.onExtraCallbackWithResult = jHashCode;
        this.onNavigationEvent = jHashCode;
    }

    public final Function1<BaseTextView, Unit> onWarmupCompleted() {
        return this.onWarmupCompleted;
    }

    public /* synthetic */ UST_CRYPT_GetKey(Function1 function1, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? 0 : num);
    }

    public final Integer onNavigationEvent() {
        return this.IAuthTabCallback;
    }

    @Override // o.NativeAdLayout
    public long onExtraCallback() {
        return this.onNavigationEvent;
    }

    @Override // o.UST_CRYPT_VerifySign
    public int IAuthTabCallback() {
        return UST_CMP_Revoke_Rr.Companion.onUnminimized();
    }
}
