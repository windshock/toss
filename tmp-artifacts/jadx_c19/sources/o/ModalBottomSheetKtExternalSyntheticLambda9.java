package o;

import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.TextFieldBufferExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ModalBottomSheetKtExternalSyntheticLambda9 extends ModalBottomSheetKtExternalSyntheticLambda5 {

    @Deprecated
    public final String IAuthTabCallback;
    public final String onExtraCallback;
    public final ImmutableList<String> onNavigationEvent;

    public ModalBottomSheetKtExternalSyntheticLambda9(String str, @Nullable String str2, List<String> list) {
        super(str);
        RecordingInputConnection_androidKt.onNavigationEvent(!list.isEmpty());
        this.onExtraCallback = str2;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf(list);
        this.onNavigationEvent = immutableListCopyOf;
        this.IAuthTabCallback = (String) immutableListCopyOf.get(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted(TextFieldBufferExternalSyntheticLambda0.onExtraCallbackWithResult onextracallbackwithresult) throws NumberFormatException {
        char c;
        String str = this.asBinder;
        switch (str.hashCode()) {
            case 82815:
                if (!str.equals("TAL")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                break;
        }
        try {
            switch (c) {
                case 0:
                case '\n':
                    onextracallbackwithresult.onExtraCallbackWithResult((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case 1:
                case 11:
                    onextracallbackwithresult.onNavigationEvent((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) this.onNavigationEvent.get(0);
                    onextracallbackwithresult.onExtraCallbackWithResult(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).onExtraCallback(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    onextracallbackwithresult.onExtraCallback((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case 4:
                case 19:
                    onextracallbackwithresult.onWarmupCompleted((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case 5:
                case 20:
                    onextracallbackwithresult.IAuthTabCallbackStub((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent((String) this.onNavigationEvent.get(0), "/");
                    onextracallbackwithresult.IAuthTabCallback_Parcel(Integer.valueOf(Integer.parseInt(strArrOnNavigationEvent[0]))).access000(strArrOnNavigationEvent.length > 1 ? Integer.valueOf(Integer.parseInt(strArrOnNavigationEvent[1])) : null);
                    break;
                case 7:
                case 17:
                    onextracallbackwithresult.getInterfaceDescriptor((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case '\b':
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    onextracallbackwithresult.IAuthTabCallbackStubProxy((CharSequence) this.onNavigationEvent.get(0));
                    break;
                case '\t':
                case 22:
                    onextracallbackwithresult.asInterface(Integer.valueOf(Integer.parseInt((String) this.onNavigationEvent.get(0))));
                    break;
                case '\f':
                    Integer numTryParse = Ints.tryParse((String) this.onNavigationEvent.get(0));
                    if (numTryParse == null) {
                        onextracallbackwithresult.asInterface((CharSequence) this.onNavigationEvent.get(0));
                        break;
                    } else {
                        String strOnNavigationEvent = ModalBottomSheetKtScrimdismissModifier11ExternalSyntheticLambda0.onNavigationEvent(numTryParse.intValue());
                        if (strOnNavigationEvent != null) {
                            onextracallbackwithresult.asInterface(strOnNavigationEvent);
                            break;
                        }
                    }
                    break;
                case 14:
                    List<Integer> listOnExtraCallbackWithResult = onExtraCallbackWithResult((String) this.onNavigationEvent.get(0));
                    int size = listOnExtraCallbackWithResult.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                onextracallbackwithresult.onExtraCallback(listOnExtraCallbackWithResult.get(2));
                            }
                        }
                        onextracallbackwithresult.onExtraCallbackWithResult(listOnExtraCallbackWithResult.get(1));
                    }
                    onextracallbackwithresult.asInterface(listOnExtraCallbackWithResult.get(0));
                    break;
                case 15:
                    List<Integer> listOnExtraCallbackWithResult2 = onExtraCallbackWithResult((String) this.onNavigationEvent.get(0));
                    int size2 = listOnExtraCallbackWithResult2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                onextracallbackwithresult.onTransact(listOnExtraCallbackWithResult2.get(2));
                            }
                        }
                        onextracallbackwithresult.asBinder(listOnExtraCallbackWithResult2.get(1));
                    }
                    onextracallbackwithresult.IAuthTabCallbackStub(listOnExtraCallbackWithResult2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModalBottomSheetKtExternalSyntheticLambda9.class != obj.getClass()) {
            return false;
        }
        ModalBottomSheetKtExternalSyntheticLambda9 modalBottomSheetKtExternalSyntheticLambda9 = (ModalBottomSheetKtExternalSyntheticLambda9) obj;
        return Objects.equals(this.asBinder, modalBottomSheetKtExternalSyntheticLambda9.asBinder) && Objects.equals(this.onExtraCallback, modalBottomSheetKtExternalSyntheticLambda9.onExtraCallback) && this.onNavigationEvent.equals(modalBottomSheetKtExternalSyntheticLambda9.onNavigationEvent);
    }

    public int hashCode() {
        int iHashCode = this.asBinder.hashCode();
        String str = this.onExtraCallback;
        return ((((iHashCode + 527) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.onNavigationEvent.hashCode();
    }

    @Override // o.ModalBottomSheetKtExternalSyntheticLambda5
    public String toString() {
        return this.asBinder + ": description=" + this.onExtraCallback + ": values=" + this.onNavigationEvent;
    }

    private static List<Integer> onExtraCallbackWithResult(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
