package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;
import o.TextFieldKeyEventHandlerExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 {
    public final int IAuthTabCallback;
    public final int IAuthTabCallbackDefault;
    public final List<byte[]> IAuthTabCallbackStub;
    public final int IAuthTabCallbackStubProxy;
    public final int IAuthTabCallback_Parcel;
    public final float access000;
    public final int access100;
    public final int asBinder;
    public final int asInterface;
    public final TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 extraCallbackWithResult;
    public final int getInterfaceDescriptor;
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final String onNavigationEvent;
    public final int onTransact;
    public final int onWarmupCompleted;
    public final int writeTypedObject;

    public static ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, false, null);
    }

    public static ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var) throws ParserException {
        return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, true, access000Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z, @Nullable TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var) throws ParserException {
        int i2;
        int i3;
        TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallbackDefault iAuthTabCallbackDefaultIAuthTabCallback;
        int i4;
        int i5;
        int i6;
        int i7;
        try {
            if (z) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(21);
            }
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 3;
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < iOnMinimized2; i10++) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                for (int i11 = 0; i11 < iOnUnminimized; i11++) {
                    int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    i9 += iOnUnminimized2 + 4;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnUnminimized2);
                }
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted);
            byte[] bArr = new byte[i9];
            TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var2 = access000Var;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            float f = 1.0f;
            String strOnExtraCallbackWithResult = null;
            int i24 = 0;
            int i25 = 0;
            while (i24 < iOnMinimized2) {
                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 63;
                int iOnUnminimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                int i26 = i8;
                TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000VarOnExtraCallbackWithResult = access000Var2;
                while (i26 < iOnUnminimized3) {
                    int iOnUnminimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
                    byte[] bArr2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent;
                    int i27 = iOnMinimized2;
                    System.arraycopy(bArr2, i8, bArr, i25, bArr2.length);
                    int length = i25 + bArr2.length;
                    System.arraycopy(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(), bArr, length, iOnUnminimized4);
                    if (iOnMinimized3 == 32 && i26 == 0) {
                        access000VarOnExtraCallbackWithResult = TextFieldKeyEventHandlerExternalSyntheticLambda1.onExtraCallbackWithResult(bArr, length, length + iOnUnminimized4);
                        i3 = i8;
                        i2 = iOnUnminimized3;
                    } else if (iOnMinimized3 == 33 && i26 == 0) {
                        TextFieldKeyEventHandlerExternalSyntheticLambda1.asInterface asinterfaceIAuthTabCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(bArr, length, length + iOnUnminimized4, access000VarOnExtraCallbackWithResult);
                        int i28 = asinterfaceIAuthTabCallback.IAuthTabCallbackStubProxy + 1;
                        int i29 = asinterfaceIAuthTabCallback.readTypedObject;
                        int i30 = asinterfaceIAuthTabCallback.asBinder;
                        int i31 = asinterfaceIAuthTabCallback.IAuthTabCallbackDefault;
                        int i32 = asinterfaceIAuthTabCallback.IAuthTabCallbackStub;
                        int i33 = asinterfaceIAuthTabCallback.onExtraCallbackWithResult + 8;
                        int i34 = asinterfaceIAuthTabCallback.onWarmupCompleted + 8;
                        int i35 = asinterfaceIAuthTabCallback.onNavigationEvent;
                        int i36 = asinterfaceIAuthTabCallback.IAuthTabCallback;
                        int i37 = asinterfaceIAuthTabCallback.asInterface;
                        float f2 = asinterfaceIAuthTabCallback.getInterfaceDescriptor;
                        int i38 = asinterfaceIAuthTabCallback.onTransact;
                        TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted onwarmupcompleted = asinterfaceIAuthTabCallback.IAuthTabCallback_Parcel;
                        if (onwarmupcompleted != null) {
                            i4 = i38;
                            i5 = i28;
                            i2 = iOnUnminimized3;
                            i6 = i29;
                            i7 = i30;
                            strOnExtraCallbackWithResult = TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult(onwarmupcompleted.IAuthTabCallback, onwarmupcompleted.IAuthTabCallbackDefault, onwarmupcompleted.onWarmupCompleted, onwarmupcompleted.onNavigationEvent, onwarmupcompleted.onExtraCallback, onwarmupcompleted.onExtraCallbackWithResult);
                        } else {
                            i4 = i38;
                            i5 = i28;
                            i2 = iOnUnminimized3;
                            i6 = i29;
                            i7 = i30;
                        }
                        i12 = i5;
                        i13 = i6;
                        i3 = 0;
                        f = f2;
                        i23 = i4;
                        i20 = i36;
                        i21 = i37;
                        i18 = i34;
                        i19 = i35;
                        i17 = i33;
                        i16 = i32;
                        i15 = i31;
                        i14 = i7;
                    } else {
                        i2 = iOnUnminimized3;
                        if (iOnMinimized3 != 39 || i26 != 0 || (iAuthTabCallbackDefaultIAuthTabCallback = TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(bArr, length, length + iOnUnminimized4)) == null || access000VarOnExtraCallbackWithResult == null) {
                            i3 = 0;
                        } else {
                            i3 = 0;
                            i22 = iAuthTabCallbackDefaultIAuthTabCallback.onExtraCallback == ((TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback) access000VarOnExtraCallbackWithResult.onNavigationEvent.get(0)).onExtraCallbackWithResult ? 4 : 5;
                        }
                    }
                    i25 = length + iOnUnminimized4;
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(iOnUnminimized4);
                    i26++;
                    i8 = i3;
                    iOnMinimized2 = i27;
                    iOnUnminimized3 = i2;
                }
                i24++;
                access000Var2 = access000VarOnExtraCallbackWithResult;
            }
            return new ExposedDropdownMenuBoxScopeExternalSyntheticLambda2(i9 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iOnMinimized + 1, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, f, i23, strOnExtraCallbackWithResult, access000Var2);
        } catch (ArrayIndexOutOfBoundsException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing");
            sb.append(z ? "L-HEVC config" : "HEVC config");
            throw ParserException.onNavigationEvent(sb.toString(), e);
        }
    }

    private ExposedDropdownMenuBoxScopeExternalSyntheticLambda2(List<byte[]> list, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f, int i14, @Nullable String str, @Nullable TextFieldKeyEventHandlerExternalSyntheticLambda1.access000 access000Var) {
        this.IAuthTabCallbackStub = list;
        this.IAuthTabCallback_Parcel = i2;
        this.access100 = i3;
        this.writeTypedObject = i4;
        this.IAuthTabCallbackDefault = i5;
        this.onTransact = i6;
        this.asBinder = i7;
        this.onExtraCallbackWithResult = i8;
        this.onExtraCallback = i9;
        this.onWarmupCompleted = i10;
        this.IAuthTabCallback = i11;
        this.asInterface = i12;
        this.IAuthTabCallbackStubProxy = i13;
        this.access000 = f;
        this.getInterfaceDescriptor = i14;
        this.onNavigationEvent = str;
        this.extraCallbackWithResult = access000Var;
    }
}
