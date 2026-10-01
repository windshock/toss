package o;

import androidx.media3.container.ReorderingBufferQueue;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda27;
import o.SnackbarKtExternalSyntheticLambda3;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda20;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarHostKtExternalSyntheticLambda7 {
    private final ReorderingBufferQueue IAuthTabCallback = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.ts.SeiReader$$ExternalSyntheticLambda0
        @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
        public final void consume(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
            DrawerKtExternalSyntheticLambda27.onNavigationEvent(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.f$0.onExtraCallbackWithResult);
        }
    });
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onWarmupCompleted;

    public SnackbarHostKtExternalSyntheticLambda7(List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, String str) {
        this.onWarmupCompleted = list;
        this.onNavigationEvent = str;
        this.onExtraCallbackWithResult = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[list.size()];
    }

    public void onExtraCallbackWithResult(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        for (int i2 = 0; i2 < this.onExtraCallbackWithResult.length; i2++) {
            onextracallbackwithresult.onExtraCallback();
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 3);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onWarmupCompleted.get(i2);
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            RecordingInputConnection_androidKt.onExtraCallback("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strIAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4.readTypedObject;
            if (strIAuthTabCallback == null) {
                strIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
            }
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(strIAuthTabCallback).onNavigationEvent(this.onNavigationEvent).IAuthTabCallbackDefault(str).onActivityResized(basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady).onNavigationEvent());
            this.onExtraCallbackWithResult[i2] = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }
    }

    public void onExtraCallback(int i2) {
        this.IAuthTabCallback.onExtraCallbackWithResult(i2);
    }

    public void onWarmupCompleted(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        this.IAuthTabCallback.onNavigationEvent(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    public void onNavigationEvent() {
        this.IAuthTabCallback.onExtraCallback();
    }

    public void onExtraCallbackWithResult() {
        this.IAuthTabCallback.onExtraCallback();
    }
}
