package o;

import java.io.File;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class SavedStateHandlesProviderExternalSyntheticLambda0 extends LifecycleEffectKtExternalSyntheticLambda1<File> {
    public SavedStateHandlesProviderExternalSyntheticLambda0() {
        super(File.class);
    }

    @Override // o.LifecycleEffectKtExternalSyntheticLambda14, o.FragmentFactory
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallback(File file, getView getview, FragmentManagerExternalSyntheticLambda1 fragmentManagerExternalSyntheticLambda1) throws IOException {
        getview.asBinder(file.getAbsolutePath());
    }
}
