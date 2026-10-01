package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface TextFieldSelectionManager_androidKtExternalSyntheticLambda11 {

    @Deprecated
    public static final TextFieldSelectionManager_androidKtExternalSyntheticLambda11 onNavigationEvent = new TextFieldSelectionManagerKtExternalSyntheticLambda3();

    default TextFieldSelectionManager_androidKtExternalSyntheticLambda11 IAuthTabCallback(int i2) {
        return this;
    }

    TextFieldSelectionManager_androidKtExternalSyntheticLambda10 createExtractor(Uri uri, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, Map<String, List<String>> map, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) throws IOException;

    default TextFieldSelectionManager_androidKtExternalSyntheticLambda11 onExtraCallback(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return this;
    }

    default TextFieldSelectionManager_androidKtExternalSyntheticLambda11 onNavigationEvent(boolean z) {
        return this;
    }

    default BasicTextContextMenuProviderKtExternalSyntheticLambda4 onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return basicTextContextMenuProviderKtExternalSyntheticLambda4;
    }
}
