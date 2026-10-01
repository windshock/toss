package androidx.media3.common.audio;

import android.content.Context;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7;
import o.TextFieldCoreModifierNodeExternalSyntheticLambda2;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final /* synthetic */ class AudioManagerCompat$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ TextFieldCoreModifierNodeExternalSyntheticLambda2 f$1;

    public /* synthetic */ AudioManagerCompat$$ExternalSyntheticLambda0(Context context, TextFieldCoreModifierNodeExternalSyntheticLambda2 textFieldCoreModifierNodeExternalSyntheticLambda2) {
        this.f$0 = context;
        this.f$1 = textFieldCoreModifierNodeExternalSyntheticLambda2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onWarmupCompleted(this.f$0, this.f$1);
    }
}
