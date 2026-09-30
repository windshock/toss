package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import o.TextFieldKeyInputExternalSyntheticLambda9;
import o.TextFieldPressGestureFilterKttapPressTextFieldModifier121ExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class LifecycleKt$eventFlow$1$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ TextFieldKeyInputExternalSyntheticLambda9 f$0;
    public final /* synthetic */ LifecycleEventObserver f$1;

    public /* synthetic */ LifecycleKt$eventFlow$1$$ExternalSyntheticLambda1(TextFieldKeyInputExternalSyntheticLambda9 textFieldKeyInputExternalSyntheticLambda9, LifecycleEventObserver lifecycleEventObserver) {
        this.f$0 = textFieldKeyInputExternalSyntheticLambda9;
        this.f$1 = lifecycleEventObserver;
    }

    public final Object invoke() {
        return TextFieldPressGestureFilterKttapPressTextFieldModifier121ExternalSyntheticLambda0.onNavigationEvent.onExtraCallback(this.f$0, this.f$1);
    }
}
