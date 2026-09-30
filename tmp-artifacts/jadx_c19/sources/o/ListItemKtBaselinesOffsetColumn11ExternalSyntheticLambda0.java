package o;

import androidx.media3.common.ParserException;
import androidx.media3.extractor.flv.TagPayloadReader;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class ListItemKtBaselinesOffsetColumn11ExternalSyntheticLambda0 extends TagPayloadReader {
    private boolean IAuthTabCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private boolean onWarmupCompleted;

    public ListItemKtBaselinesOffsetColumn11ExternalSyntheticLambda0(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        super(exposedDropdownMenu_androidKtExternalSyntheticLambda5);
        this.IAuthTabCallbackStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent);
        this.onExtraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Byte code manipulation detected: skipped illegal throws declarations: [androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException] */
    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i2 = (iOnMinimized >> 4) & 15;
        int i3 = iOnMinimized & 15;
        if (i3 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i3);
        }
        this.onNavigationEvent = i2;
        return i2 != 5;
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    public boolean onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) throws ParserException {
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        long jOnTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onTransact();
        if (iOnMinimized == 0 && !this.IAuthTabCallback) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(new byte[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent()]);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda202.onExtraCallback(), 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
            DrawerKtExternalSyntheticLambda30 drawerKtExternalSyntheticLambda30OnNavigationEvent = DrawerKtExternalSyntheticLambda30.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda202);
            this.onTransact = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackStub;
            this.onExtraCallback.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onNavigationEvent("video/x-flv").IAuthTabCallbackDefault("video/avc").onExtraCallback(drawerKtExternalSyntheticLambda30OnNavigationEvent.onExtraCallback).onActivityLayout(drawerKtExternalSyntheticLambda30OnNavigationEvent.getInterfaceDescriptor).access100(drawerKtExternalSyntheticLambda30OnNavigationEvent.asInterface).onNavigationEvent(drawerKtExternalSyntheticLambda30OnNavigationEvent.access000).IAuthTabCallback(drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackDefault).onNavigationEvent());
            this.IAuthTabCallback = true;
            return false;
        }
        if (iOnMinimized != 1 || !this.IAuthTabCallback) {
            return false;
        }
        int i2 = this.onNavigationEvent == 1 ? 1 : 0;
        if (!this.onWarmupCompleted && i2 == 0) {
            return false;
        }
        byte[] bArrOnExtraCallback = this.onExtraCallbackWithResult.onExtraCallback();
        bArrOnExtraCallback[0] = 0;
        bArrOnExtraCallback[1] = 0;
        bArrOnExtraCallback[2] = 0;
        int i3 = this.onTransact;
        int i4 = 0;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onExtraCallbackWithResult.onExtraCallback(), 4 - i3, this.onTransact);
            this.onExtraCallbackWithResult.asBinder(0);
            int iICustomTabsCallbackDefault = this.onExtraCallbackWithResult.ICustomTabsCallbackDefault();
            this.IAuthTabCallbackStub.asBinder(0);
            this.onExtraCallback.onNavigationEvent(this.IAuthTabCallbackStub, 4);
            this.onExtraCallback.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, iICustomTabsCallbackDefault);
            i4 = i4 + 4 + iICustomTabsCallbackDefault;
        }
        this.onExtraCallback.onExtraCallback(j + (jOnTransact * 1000), i2, i4, 0, null);
        this.onWarmupCompleted = true;
        return true;
    }
}
