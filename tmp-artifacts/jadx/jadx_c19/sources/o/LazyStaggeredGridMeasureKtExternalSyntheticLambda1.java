package o;

import androidx.glance.appwidget.protobuf.CodedOutputStream;
import java.io.IOException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public interface LazyStaggeredGridMeasureKtExternalSyntheticLambda1 extends LazyStaggeredGridKtExternalSyntheticLambda0 {

    public interface onExtraCallback extends LazyStaggeredGridKtExternalSyntheticLambda0, Cloneable {
        onExtraCallback IAuthTabCallback(LazyStaggeredGridMeasureKtExternalSyntheticLambda1 lazyStaggeredGridMeasureKtExternalSyntheticLambda1);

        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 IAuthTabCallbackStub();

        onExtraCallback onExtraCallbackWithResult(LazyLayoutPinnableItemKtExternalSyntheticLambda0 lazyLayoutPinnableItemKtExternalSyntheticLambda0, LazyLayoutSemanticsModifierNodeExternalSyntheticLambda2 lazyLayoutSemanticsModifierNodeExternalSyntheticLambda2) throws IOException;

        LazyStaggeredGridMeasureKtExternalSyntheticLambda1 onNavigationEvent();
    }

    int ICustomTabsCallback();

    onExtraCallback ICustomTabsCallbackStub();

    LazyLayoutKtExternalSyntheticLambda3 asBinder();

    void onExtraCallback(CodedOutputStream codedOutputStream) throws IOException;

    onExtraCallback onUnminimized();

    DefaultPagerStateExternalSyntheticLambda0<? extends LazyStaggeredGridMeasureKtExternalSyntheticLambda1> writeTypedObject();
}
