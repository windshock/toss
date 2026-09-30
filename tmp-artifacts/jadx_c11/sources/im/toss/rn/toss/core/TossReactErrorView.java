package im.toss.rn.toss.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class TossReactErrorView extends FrameLayout {
    private static final onExtraCallback Companion;
    private static int IAuthTabCallback = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int onNavigationEvent;
    private static int onWarmupCompleted;
    private final r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo onExtraCallback;
    private Function0<Unit> onExtraCallbackWithResult;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = IAuthTabCallbackStub + 55;
        onNavigationEvent = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(TossReactErrorView tossReactErrorView, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 113;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(tossReactErrorView, view);
        int i4 = onWarmupCompleted + 105;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TossReactErrorView(@NotNull Context context, @NotNull Throwable th) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(th, "");
        r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback = r8lambdaWuqchrjd0d0iFbkOFd4hTOW1mo.IAuthTabCallback(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback, "");
        this.onExtraCallback = r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        AppCompatTextView appCompatTextView = r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback.IAuthTabCallback;
        CharSequence localizedMessage = th.getLocalizedMessage();
        CharSequence charSequence = null;
        if (localizedMessage == null) {
            CharSequence message = th.getMessage();
            if (message != null) {
                int i = onWarmupCompleted + 33;
                IAuthTabCallback = i % 128;
                int i2 = i % 2;
                if (!StringsKt.isBlank(message)) {
                    int i3 = IAuthTabCallback + 67;
                    int i4 = i3 % 128;
                    onWarmupCompleted = i4;
                    int i5 = i3 % 2;
                    int i6 = i4 + 89;
                    IAuthTabCallback = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = 2 % 2;
                    charSequence = message;
                }
            }
            if (charSequence == null) {
                int i9 = 2 % 2;
                localizedMessage = "React Native bundle failed to load.";
            } else {
                localizedMessage = charSequence;
            }
        } else {
            if (StringsKt.isBlank(localizedMessage)) {
                int i10 = IAuthTabCallback + 5;
                onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                localizedMessage = null;
            }
            if (localizedMessage == null) {
            }
        }
        appCompatTextView.setText(localizedMessage);
        r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback.onExtraCallback.setVisibility(8);
        r8lambdawuqchrjd0d0ifbkofd4htow1moIAuthTabCallback.onExtraCallback.setOnClickListener(new View.OnClickListener() { // from class: im.toss.rn.toss.core.TossReactErrorView$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = 2 % 2;
                int i13 = onExtraCallbackWithResult + 19;
                IAuthTabCallback = i13 % 128;
                if (i13 % 2 != 0) {
                    TossReactErrorView.onExtraCallbackWithResult(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TossReactErrorView.onExtraCallbackWithResult(this.f$0, view);
                int i14 = IAuthTabCallback + 109;
                onExtraCallbackWithResult = i14 % 128;
                int i15 = i14 % 2;
            }
        });
    }

    public final void setOnRetry(@Nullable Function0<Unit> function0) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 43;
        onWarmupCompleted = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.onExtraCallbackWithResult = function0;
            this.onExtraCallback.onExtraCallback.setVisibility(function0 == null ? 8 : 0);
            int i3 = IAuthTabCallback + 117;
            onWarmupCompleted = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        this.onExtraCallbackWithResult = function0;
        TdsButtonV1View tdsButtonV1View = this.onExtraCallback.onExtraCallback;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IAuthTabCallback(TossReactErrorView tossReactErrorView, View view) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 77;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Function0<Unit> function0 = tossReactErrorView.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 36 / 0;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (function0 != null) {
        }
        int i5 = onWarmupCompleted + 107;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }
}
