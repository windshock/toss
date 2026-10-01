package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerKtExternalSyntheticLambda30 {
    public final int IAuthTabCallback;
    public final List<byte[]> IAuthTabCallbackDefault;
    public final int IAuthTabCallbackStub;
    public final float access000;
    public final int asBinder;
    public final int asInterface;
    public final int getInterfaceDescriptor;
    public final String onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onTransact;
    public final int onWarmupCompleted;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static DrawerKtExternalSyntheticLambda30 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String strOnWarmupCompleted;
        int i9;
        float f;
        try {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            int iOnMinimized = (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 3) + 1;
            if (iOnMinimized == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 31;
            for (int i10 = 0; i10 < iOnMinimized2; i10++) {
                arrayList.add(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            }
            int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            for (int i11 = 0; i11 < iOnMinimized3; i11++) {
                arrayList.add(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            }
            if (iOnMinimized2 > 0) {
                TextFieldKeyEventHandlerExternalSyntheticLambda1.access100 access100VarOnWarmupCompleted = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted((byte[]) arrayList.get(0), TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent.length, ((byte[]) arrayList.get(0)).length);
                int i12 = access100VarOnWarmupCompleted.extraCallback;
                int i13 = access100VarOnWarmupCompleted.IAuthTabCallbackDefault;
                int i14 = access100VarOnWarmupCompleted.onExtraCallbackWithResult;
                int i15 = access100VarOnWarmupCompleted.IAuthTabCallback;
                int i16 = access100VarOnWarmupCompleted.onWarmupCompleted;
                int i17 = access100VarOnWarmupCompleted.onExtraCallback;
                int i18 = access100VarOnWarmupCompleted.onNavigationEvent;
                int i19 = access100VarOnWarmupCompleted.getInterfaceDescriptor;
                float f2 = access100VarOnWarmupCompleted.writeTypedObject;
                strOnWarmupCompleted = TextFieldCoreModifierNodeExternalSyntheticLambda1.onWarmupCompleted(access100VarOnWarmupCompleted.ICustomTabsCallback, access100VarOnWarmupCompleted.asBinder, access100VarOnWarmupCompleted.access000);
                i8 = i18;
                i9 = i19;
                f = f2;
                i5 = i15 + 8;
                i6 = i16;
                i7 = i17;
                i2 = i12;
                i3 = i13;
                i4 = i14 + 8;
            } else {
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                strOnWarmupCompleted = null;
                i9 = 16;
                f = 1.0f;
            }
            return new DrawerKtExternalSyntheticLambda30(arrayList, iOnMinimized, i2, i3, i4, i5, i6, i7, i8, i9, f, strOnWarmupCompleted);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.onNavigationEvent("Error parsing AVC config", e);
        }
    }

    private DrawerKtExternalSyntheticLambda30(List<byte[]> list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, @Nullable String str) {
        this.IAuthTabCallbackDefault = list;
        this.IAuthTabCallbackStub = i2;
        this.getInterfaceDescriptor = i3;
        this.asInterface = i4;
        this.onWarmupCompleted = i5;
        this.onExtraCallbackWithResult = i6;
        this.IAuthTabCallback = i7;
        this.onNavigationEvent = i8;
        this.onTransact = i9;
        this.asBinder = i10;
        this.access000 = f;
        this.onExtraCallback = str;
    }

    private static byte[] onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnUnminimized);
        return TextFieldCoreModifierNodeExternalSyntheticLambda1.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), iOnWarmupCompleted, iOnUnminimized);
    }
}
