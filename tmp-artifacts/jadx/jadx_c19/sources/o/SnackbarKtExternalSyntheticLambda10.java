package o;

import androidx.media3.container.ReorderingBufferQueue;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda27;
import o.SnackbarKtExternalSyntheticLambda3;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda20;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SnackbarKtExternalSyntheticLambda10 {
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] IAuthTabCallback;
    private final ReorderingBufferQueue onExtraCallback;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onExtraCallbackWithResult;
    private final String onNavigationEvent;

    public SnackbarKtExternalSyntheticLambda10(List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, String str) {
        this.onExtraCallbackWithResult = list;
        this.onNavigationEvent = str;
        this.IAuthTabCallback = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[list.size()];
        ReorderingBufferQueue reorderingBufferQueue = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.ts.UserDataReader$$ExternalSyntheticLambda0
            @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
            public final void consume(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
                DrawerKtExternalSyntheticLambda27.onWarmupCompleted(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.f$0.IAuthTabCallback);
            }
        });
        this.onExtraCallback = reorderingBufferQueue;
        reorderingBufferQueue.onExtraCallbackWithResult(3);
    }

    public void IAuthTabCallback(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        for (int i2 = 0; i2 < this.IAuthTabCallback.length; i2++) {
            onextracallbackwithresult.onExtraCallback();
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 3);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onExtraCallbackWithResult.get(i2);
            String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
            RecordingInputConnection_androidKt.onExtraCallback("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(onextracallbackwithresult.IAuthTabCallback()).onNavigationEvent(this.onNavigationEvent).IAuthTabCallbackDefault(str).onActivityResized(basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady).onNavigationEvent());
            this.IAuthTabCallback[i2] = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
        }
    }

    public void onWarmupCompleted(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() >= 9) {
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            if (iAsBinder == 434 && iAsBinder2 == 1195456820 && iOnMinimized == 3) {
                this.onExtraCallback.onNavigationEvent(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            }
        }
    }
}
