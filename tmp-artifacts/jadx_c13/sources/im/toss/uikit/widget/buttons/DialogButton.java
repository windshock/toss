package im.toss.uikit.widget.buttons;

import android.content.Context;
import android.util.AttributeSet;
import im.toss.tds.view.component.atom.button.TdsButtonV1View;
import im.toss.uikit.widget.buttons.DialogButton$;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.initSDK;
import o.onCrash;
import o.reportCustomErr;
import o.setCustomDataCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class DialogButton extends TdsButtonV1View {
    private static int onExtraCallback = 1;
    private static int onWarmupCompleted;
    private final Lazy onExtraCallbackWithResult;

    public static /* synthetic */ setCustomDataCallback onNavigationEvent(DialogButton dialogButton) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 39;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallback(dialogButton);
        }
        IAuthTabCallback(dialogButton);
        throw null;
    }

    public /* synthetic */ initSDK IAuthTabCallbackDefault() {
        setCustomDataCallback typedObject;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 65;
        onExtraCallback = i2 % 128;
        if (i2 % 2 == 0) {
            typedObject = readTypedObject();
            int i3 = 86 / 0;
        } else {
            typedObject = readTypedObject();
        }
        int i4 = onExtraCallback + 27;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    public setCustomDataCallback readTypedObject() {
        int i = 2 % 2;
        int i2 = onExtraCallback + 65;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback setcustomdatacallback = (setCustomDataCallback) this.onExtraCallbackWithResult.getValue();
        int i4 = onExtraCallback + 105;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 == 0) {
            return setcustomdatacallback;
        }
        throw null;
    }

    private static final setCustomDataCallback IAuthTabCallback(DialogButton dialogButton) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 1;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        setCustomDataCallback typedObject = super.readTypedObject();
        int i4 = onExtraCallback + 95;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        return typedObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogButton(@NotNull Context context) {
        super(context, (AttributeSet) null);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = reportCustomErr.onWarmupCompleted(this, new DialogButton$.ExternalSyntheticLambda0(this), onCrash.DialogButton, (Function1) null, 4, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = reportCustomErr.onWarmupCompleted(this, new DialogButton$.ExternalSyntheticLambda0(this), onCrash.DialogButton, (Function1) null, 4, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.onExtraCallbackWithResult = reportCustomErr.onWarmupCompleted(this, new DialogButton$.ExternalSyntheticLambda0(this), onCrash.DialogButton, (Function1) null, 4, (Object) null);
    }
}
