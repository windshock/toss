package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class BrickModuleImplExternalSyntheticLambda2 extends getTypedExportedConstants {
    private static int asInterface = 1;
    public static final int onExtraCallback = 8;
    private static int onExtraCallbackWithResult;
    private ComposeView IAuthTabCallback;
    private boolean onNavigationEvent;
    private Function1<? super Integer, Boolean> onWarmupCompleted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrickModuleImplExternalSyntheticLambda2(@NotNull Context context) {
        super(context, 0, false, false, 0L, null, 62, null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onNavigationEvent = true;
    }

    public final void onExtraCallback(@Nullable Function1<? super Integer, Boolean> function1) {
        int i = 2 % 2;
        int i2 = asInterface + 25;
        int i3 = i2 % 128;
        onExtraCallbackWithResult = i3;
        int i4 = i2 % 2;
        this.onWarmupCompleted = function1;
        int i5 = i3 + 7;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNavigationEvent(@NotNull Function2<? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> function2) {
        Object next;
        ComposeView composeView;
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        if (this.onNavigationEvent) {
            this.onNavigationEvent = false;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            i = onExtraCallbackWithResult + 13;
            asInterface = i % 128;
        } else {
            Iterator itIAuthTabCallback = EasingFunctionsKtExternalSyntheticLambda0.onExtraCallback(onTransact()).IAuthTabCallback();
            while (true) {
                if (!itIAuthTabCallback.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = itIAuthTabCallback.next();
                    if (((View) next) instanceof ComposeView) {
                        break;
                    }
                }
            }
            ComposeView composeView2 = next instanceof ComposeView ? (ComposeView) next : null;
            if (composeView2 != null) {
                composeView = composeView2;
                this.IAuthTabCallback = composeView;
                Intrinsics.checkNotNull(composeView);
                composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(function2));
                ComposeView composeView3 = this.IAuthTabCallback;
                Intrinsics.checkNotNull(composeView3);
                setContentView((View) composeView3);
                onContentChanged();
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            composeView = new ComposeView(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            i = asInterface + 99;
            onExtraCallbackWithResult = i % 128;
        }
        int i3 = i % 2;
        this.IAuthTabCallback = composeView;
        Intrinsics.checkNotNull(composeView);
        composeView.setContent(setAdVideoPlaybackListener.onWarmupCompleted(function2));
        ComposeView composeView32 = this.IAuthTabCallback;
        Intrinsics.checkNotNull(composeView32);
        setContentView((View) composeView32);
        onContentChanged();
    }

    @Override // o.BrickModuleImplExternalSyntheticLambda0
    public boolean onExtraCallbackWithResult(int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult;
        int i4 = i3 + 5;
        int i5 = i4 % 128;
        asInterface = i5;
        int i6 = i4 % 2;
        Function1<? super Integer, Boolean> function1 = this.onWarmupCompleted;
        if (function1 != null) {
            int i7 = i5 + 95;
            onExtraCallbackWithResult = i7 % 128;
            int i8 = i7 % 2;
            return function1.invoke(Integer.valueOf(i)).booleanValue();
        }
        int i9 = i3 + 43;
        asInterface = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    @Override // o.getTypedExportedConstants, o.BrickModuleImplExternalSyntheticLambda0
    public void dismiss() {
        int i = 2 % 2;
        int i2 = asInterface + 31;
        onExtraCallbackWithResult = i2 % 128;
        this.onNavigationEvent = i2 % 2 == 0;
        super.dismiss();
    }

    public final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 13;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        ComposeView composeView = this.IAuthTabCallback;
        if (composeView != null) {
            composeView.IAuthTabCallbackStub();
        }
        int i3 = onExtraCallbackWithResult + 67;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
    }
}
