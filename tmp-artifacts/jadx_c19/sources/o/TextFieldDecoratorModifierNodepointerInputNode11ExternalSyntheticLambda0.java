package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 implements HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback {
    public final String IAuthTabCallback;
    public final byte[] onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;

    public TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0(String str, byte[] bArr, int i2, int i3) {
        IAuthTabCallback(str, bArr, i3);
        this.IAuthTabCallback = str;
        this.onExtraCallback = bArr;
        this.onExtraCallbackWithResult = i2;
        this.onNavigationEvent = i3;
    }

    public List<Integer> IAuthTabCallback() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.IAuthTabCallback.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte b = this.onExtraCallback[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(Integer.valueOf(this.onExtraCallback[i2 + 2]));
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.class != obj.getClass()) {
            return false;
        }
        TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 = (TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) obj;
        return this.IAuthTabCallback.equals(textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.IAuthTabCallback) && Arrays.equals(this.onExtraCallback, textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.onExtraCallback) && this.onExtraCallbackWithResult == textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.onExtraCallbackWithResult && this.onNavigationEvent == textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0.onNavigationEvent;
    }

    public int hashCode() {
        int iHashCode = this.IAuthTabCallback.hashCode();
        return ((((((iHashCode + 527) * 31) + Arrays.hashCode(this.onExtraCallback)) * 31) + this.onExtraCallbackWithResult) * 31) + this.onNavigationEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String strOnExtraCallback;
        int i2 = this.onNavigationEvent;
        if (i2 != 0) {
            if (i2 == 1) {
                strOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(this.onExtraCallback);
            } else if (i2 == 23) {
                strOnExtraCallback = String.valueOf(Float.intBitsToFloat(Ints.fromByteArray(this.onExtraCallback)));
            } else if (i2 == 67) {
                strOnExtraCallback = String.valueOf(Ints.fromByteArray(this.onExtraCallback));
            } else if (i2 == 75) {
                strOnExtraCallback = String.valueOf(TextFieldDragAndDropNode_androidKtExternalSyntheticLambda0.onWarmupCompleted(this.onExtraCallback[0]));
            } else if (i2 == 78) {
                strOnExtraCallback = String.valueOf(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.onExtraCallback).ICustomTabsCallbackStubProxy());
            } else {
                strOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(this.onExtraCallback);
            }
        } else if (this.IAuthTabCallback.equals("auxiliary.tracks.map")) {
            strOnExtraCallback = onExtraCallback(IAuthTabCallback());
        }
        return "mdta: key=" + this.IAuthTabCallback + ", value=" + strOnExtraCallback;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void IAuthTabCallback(String str, byte[] bArr, int i2) {
        char c;
        byte b;
        switch (str.hashCode()) {
            case -1949883051:
                if (!str.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS)) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            RecordingInputConnection_androidKt.onNavigationEvent(i2 == 23 && bArr.length == 4);
            return;
        }
        if (c == 1) {
            if (i2 != 75 || bArr.length != 1 || ((b = bArr[0]) != 0 && b != 1)) {
                z = false;
            }
            RecordingInputConnection_androidKt.onNavigationEvent(z);
            return;
        }
        if (c == 2 || c == 3) {
            RecordingInputConnection_androidKt.onNavigationEvent(i2 == 78 && bArr.length == 8);
        } else {
            if (c != 4) {
                return;
            }
            RecordingInputConnection_androidKt.onNavigationEvent(i2 == 0);
        }
    }

    private static String onExtraCallback(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("track types = ");
        Joiner.on(',').appendTo(sb, list);
        return sb.toString();
    }
}
