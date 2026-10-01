package im.toss.features.foreigner.language;

import android.app.Activity;
import im.toss.uikit.widget.snackbar.TdsToastV1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.NativeCallContextBuilder;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class ForeignerLanguageExperimentManagerImpl$$ExternalSyntheticLambda0 implements Function1 {
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    public final /* synthetic */ Activity f$0;
    public final /* synthetic */ NativeCallContextBuilder f$1;

    public /* synthetic */ ForeignerLanguageExperimentManagerImpl$$ExternalSyntheticLambda0(Activity activity, NativeCallContextBuilder nativeCallContextBuilder) {
        this.f$0 = activity;
        this.f$1 = nativeCallContextBuilder;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = NativeCallContextBuilder.onExtraCallback(this.f$0, this.f$1, (TdsToastV1) obj);
        int i4 = onExtraCallbackWithResult + 39;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnExtraCallback;
        }
        throw null;
    }
}
