package o;

import androidx.media3.common.ParserException;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.ModalBottomSheetStateExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class OutlinedTextFieldMeasurePolicyExternalSyntheticLambda3 {
    private int onExtraCallback;
    private static final Splitter onWarmupCompleted = Splitter.on(':');
    private static final Splitter onExtraCallbackWithResult = Splitter.on('*');
    private final List<onExtraCallbackWithResult> onNavigationEvent = new ArrayList();
    private int IAuthTabCallback = 0;

    public void onExtraCallbackWithResult() {
        this.onNavigationEvent.clear();
        this.IAuthTabCallback = 0;
    }

    public int onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3, List<HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback> list) throws ParserException, IOException {
        int i2 = this.IAuthTabCallback;
        long j = 0;
        if (i2 == 0) {
            long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
            if (jOnExtraCallback != -1 && jOnExtraCallback >= 8) {
                j = jOnExtraCallback - 8;
            }
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
            this.IAuthTabCallback = 1;
        } else if (i2 == 1) {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        } else if (i2 == 2) {
            IAuthTabCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
        } else if (i2 == 3) {
            onWarmupCompleted(drawerKtExternalSyntheticLambda9, list);
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
        } else {
            throw new IllegalStateException();
        }
        return 1;
    }

    private void onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 8);
        this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor() + 8;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() != 1397048916) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
        } else {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = drawerKtExternalSyntheticLambda9.IAuthTabCallback() - (this.onExtraCallback - 12);
            this.IAuthTabCallback = 2;
        }
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
        int i2 = this.onExtraCallback - 20;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(i2);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, i2);
        for (int i3 = 0; i3 < i2 / 12; i3++) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
            short sAccess100 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.access100();
            if (sAccess100 == 2192 || sAccess100 == 2816 || sAccess100 == 2817 || sAccess100 == 2819 || sAccess100 == 2820) {
                long j = this.onExtraCallback;
                this.onNavigationEvent.add(new onExtraCallbackWithResult(sAccess100, (jOnExtraCallback - j) - textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor()));
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
            }
        }
        if (this.onNavigationEvent.isEmpty()) {
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = 0L;
        } else {
            this.IAuthTabCallback = 3;
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = this.onNavigationEvent.get(0).onNavigationEvent;
        }
    }

    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, List<HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback> list) throws ParserException, IOException {
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        int iOnExtraCallback = (int) ((drawerKtExternalSyntheticLambda9.onExtraCallback() - drawerKtExternalSyntheticLambda9.IAuthTabCallback()) - this.onExtraCallback);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(iOnExtraCallback);
        drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, iOnExtraCallback);
        for (int i2 = 0; i2 < this.onNavigationEvent.size(); i2++) {
            onExtraCallbackWithResult onextracallbackwithresult = this.onNavigationEvent.get(i2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder((int) (onextracallbackwithresult.onNavigationEvent - jIAuthTabCallback));
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            int iIAuthTabCallback = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(interfaceDescriptor));
            int i3 = onextracallbackwithresult.IAuthTabCallback;
            if (iIAuthTabCallback == 2192) {
                list.add(onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, i3 - (interfaceDescriptor + 8)));
            } else if (iIAuthTabCallback != 2816 && iIAuthTabCallback != 2817 && iIAuthTabCallback != 2819 && iIAuthTabCallback != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static ModalBottomSheetStateExternalSyntheticLambda1 onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> listSplitToList = onExtraCallbackWithResult.splitToList(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(i2));
        for (int i3 = 0; i3 < listSplitToList.size(); i3++) {
            List<String> listSplitToList2 = onWarmupCompleted.splitToList(listSplitToList.get(i3));
            if (listSplitToList2.size() != 3) {
                throw ParserException.onNavigationEvent((String) null, (Throwable) null);
            }
            try {
                arrayList.add(new ModalBottomSheetStateExternalSyntheticLambda1.onWarmupCompleted(Long.parseLong(listSplitToList2.get(0)), Long.parseLong(listSplitToList2.get(1)), 1 << (Integer.parseInt(listSplitToList2.get(2)) - 1)));
            } catch (NumberFormatException e) {
                throw ParserException.onNavigationEvent((String) null, e);
            }
        }
        return new ModalBottomSheetStateExternalSyntheticLambda1(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int IAuthTabCallback(String str) throws ParserException {
        char c;
        switch (str.hashCode()) {
            case -1711564334:
                if (!str.equals("SlowMotion_Data")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 2192;
        }
        if (c == 1) {
            return 2819;
        }
        if (c == 2) {
            return 2816;
        }
        if (c == 3) {
            return 2820;
        }
        if (c == 4) {
            return 2817;
        }
        throw ParserException.onNavigationEvent("Invalid SEF name", (Throwable) null);
    }

    static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final long onNavigationEvent;

        public onExtraCallbackWithResult(int i2, long j, int i3) {
            this.onExtraCallback = i2;
            this.onNavigationEvent = j;
            this.IAuthTabCallback = i3;
        }
    }
}
