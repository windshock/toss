package o;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.alibaba.ariver.kernel.RVParams;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class RippleNodeFactory extends RippleNodeFactorycreatecolorProducer1 {
    private int IAuthTabCallbackStub;
    private final int ICustomTabsCallback;
    private int asInterface;
    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> extraCallback;
    private long extraCallbackWithResult;
    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> getInterfaceDescriptor;
    private final int onActivityLayout;
    private final int onActivityResized;
    private boolean onMessageChannelReady;
    private byte onMinimized;
    private byte onPostMessage;
    private final long onUnminimized;
    private boolean readTypedObject;
    private boolean writeTypedObject;
    private static final int[] IAuthTabCallback = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] onExtraCallbackWithResult = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] asBinder = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] onWarmupCompleted = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] onExtraCallback = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] onTransact = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, RVParams.WEBVIEW_FONT_SIZE_LARGEST, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] IAuthTabCallbackDefault = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] onNavigationEvent = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback_Parcel = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final ArrayList<onExtraCallbackWithResult> access000 = new ArrayList<>();
    private onExtraCallbackWithResult access100 = new onExtraCallbackWithResult(0, 4);
    private int IAuthTabCallbackStubProxy = 0;

    private static int IAuthTabCallback(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean IAuthTabCallback(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean IAuthTabCallbackDefault(byte b) {
        return (b & 224) == 0;
    }

    private static boolean IAuthTabCallbackDefault(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean IAuthTabCallbackStub(byte b) {
        return (b & 246) == 20;
    }

    private static boolean IAuthTabCallbackStub(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean IAuthTabCallbackStubProxy(byte b) {
        return b > 0 && b <= 15;
    }

    private static boolean asBinder(byte b) {
        return (b & 240) == 16;
    }

    private static boolean onExtraCallback(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean onTransact(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean onWarmupCompleted(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void IAuthTabCallback() {
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.RadioButtonKtExternalSyntheticLambda0
    public /* bridge */ /* synthetic */ void IAuthTabCallback(long j) {
        super.IAuthTabCallback(j);
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    /* renamed from: asInterface */
    public /* bridge */ /* synthetic */ RippleConfiguration onExtraCallbackWithResult() throws RadioButtonKtExternalSyntheticLambda1 {
        return super.onExtraCallbackWithResult();
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    /* renamed from: onExtraCallbackWithResult */
    public /* bridge */ /* synthetic */ void IAuthTabCallback(RippleConfiguration rippleConfiguration) throws RadioButtonKtExternalSyntheticLambda1 {
        super.IAuthTabCallback(rippleConfiguration);
    }

    public RippleNodeFactory(String str, int i2, long j) {
        if (j != -9223372036854775807L) {
            RecordingInputConnection_androidKt.onNavigationEvent(j >= 16000);
            this.onUnminimized = j * 1000;
        } else {
            this.onUnminimized = -9223372036854775807L;
        }
        this.ICustomTabsCallback = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 == 1) {
            this.onActivityResized = 0;
            this.onActivityLayout = 0;
        } else if (i2 == 2) {
            this.onActivityResized = 1;
            this.onActivityLayout = 0;
        } else if (i2 == 3) {
            this.onActivityResized = 0;
            this.onActivityLayout = 1;
        } else if (i2 == 4) {
            this.onActivityResized = 1;
            this.onActivityLayout = 1;
        } else {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.onActivityResized = 0;
            this.onActivityLayout = 0;
        }
        onExtraCallbackWithResult(0);
        access100();
        this.readTypedObject = true;
        this.extraCallbackWithResult = -9223372036854775807L;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void onExtraCallback() {
        super.onExtraCallback();
        this.getInterfaceDescriptor = null;
        this.extraCallback = null;
        onExtraCallbackWithResult(0);
        onNavigationEvent(4);
        access100();
        this.writeTypedObject = false;
        this.onMessageChannelReady = false;
        this.onMinimized = (byte) 0;
        this.onPostMessage = (byte) 0;
        this.IAuthTabCallbackStubProxy = 0;
        this.readTypedObject = true;
        this.extraCallbackWithResult = -9223372036854775807L;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    /* renamed from: asBinder */
    public RippleKt onWarmupCompleted() throws RadioButtonKtExternalSyntheticLambda1 {
        RippleKt rippleKtIAuthTabCallbackStub;
        RippleKt rippleKtOnWarmupCompleted = super.onWarmupCompleted();
        if (rippleKtOnWarmupCompleted != null) {
            return rippleKtOnWarmupCompleted;
        }
        if (!getInterfaceDescriptor() || (rippleKtIAuthTabCallbackStub = IAuthTabCallbackStub()) == null) {
            return null;
        }
        this.getInterfaceDescriptor = Collections.EMPTY_LIST;
        this.extraCallbackWithResult = -9223372036854775807L;
        rippleKtIAuthTabCallbackStub.onExtraCallback(IAuthTabCallbackStubProxy(), onTransact(), Long.MAX_VALUE);
        return rippleKtIAuthTabCallbackStub;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    protected boolean IAuthTabCallbackDefault() {
        return this.getInterfaceDescriptor != this.extraCallback;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    protected RadioButtonKt onTransact() {
        List<ImeEditCommand_androidKtExternalSyntheticLambda1> list = this.getInterfaceDescriptor;
        this.extraCallback = list;
        return new ScaffoldKtExternalSyntheticLambda0((List) RecordingInputConnection_androidKt.onExtraCallbackWithResult(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // o.RippleNodeFactorycreatecolorProducer1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onNavigationEvent(RippleConfiguration rippleConfiguration) {
        ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(rippleConfiguration.onExtraCallback);
        this.IAuthTabCallback_Parcel.onExtraCallback(byteBuffer.array(), byteBuffer.limit());
        boolean z = false;
        while (true) {
            int iOnNavigationEvent = this.IAuthTabCallback_Parcel.onNavigationEvent();
            int i2 = this.ICustomTabsCallback;
            if (iOnNavigationEvent < i2) {
                break;
            }
            int iOnMinimized = i2 == 2 ? -4 : this.IAuthTabCallback_Parcel.onMinimized();
            int iOnMinimized2 = this.IAuthTabCallback_Parcel.onMinimized();
            int iOnMinimized3 = this.IAuthTabCallback_Parcel.onMinimized();
            if ((iOnMinimized & 2) == 0 && (iOnMinimized & 1) == this.onActivityLayout) {
                byte b = (byte) (iOnMinimized2 & 127);
                byte b2 = (byte) (iOnMinimized3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z2 = this.writeTypedObject;
                    if ((iOnMinimized & 4) == 4) {
                        boolean[] zArr = onNavigationEvent;
                        boolean z3 = zArr[iOnMinimized2] && zArr[iOnMinimized3];
                        this.writeTypedObject = z3;
                        if (!onWarmupCompleted(z3, b, b2)) {
                            if (this.writeTypedObject) {
                                asBinder(b, b2);
                                if (this.readTypedObject && access000(b)) {
                                    if (IAuthTabCallbackDefault(b)) {
                                        if (IAuthTabCallbackDefault(b, b2)) {
                                            this.access100.onWarmupCompleted(onExtraCallbackWithResult(b2));
                                        } else if (IAuthTabCallback(b, b2)) {
                                            this.access100.onExtraCallback();
                                            this.access100.onWarmupCompleted(onExtraCallbackWithResult(b, b2));
                                        } else if (onWarmupCompleted(b, b2)) {
                                            asInterface(b2);
                                        } else if (onTransact(b, b2)) {
                                            onNavigationEvent(b, b2);
                                        } else if (!IAuthTabCallbackStub(b, b2)) {
                                            if (onExtraCallback(b, b2)) {
                                                onTransact(b2);
                                            }
                                        } else {
                                            this.access100.IAuthTabCallbackStub = b2 - 32;
                                        }
                                    } else {
                                        this.access100.onWarmupCompleted(onWarmupCompleted(b));
                                        if ((b2 & 224) != 0) {
                                            this.access100.onWarmupCompleted(onWarmupCompleted(b2));
                                        }
                                    }
                                    z = true;
                                }
                            } else if (z2) {
                                access100();
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            int i3 = this.asInterface;
            if (i3 == 1 || i3 == 3) {
                this.getInterfaceDescriptor = access000();
                this.extraCallbackWithResult = IAuthTabCallbackStubProxy();
            }
        }
    }

    private boolean access000(byte b) {
        if (IAuthTabCallbackDefault(b)) {
            this.IAuthTabCallbackStubProxy = IAuthTabCallback(b);
        }
        return this.IAuthTabCallbackStubProxy == this.onActivityResized;
    }

    private boolean onWarmupCompleted(boolean z, byte b, byte b2) {
        if (z && asBinder(b)) {
            if (this.onMessageChannelReady && this.onMinimized == b && this.onPostMessage == b2) {
                this.onMessageChannelReady = false;
                return true;
            }
            this.onMessageChannelReady = true;
            this.onMinimized = b;
            this.onPostMessage = b2;
        } else {
            this.onMessageChannelReady = false;
        }
        return false;
    }

    private void asInterface(byte b) {
        this.access100.onWarmupCompleted(' ');
        this.access100.onWarmupCompleted((b >> 1) & 7, (b & 1) == 1);
    }

    private void onNavigationEvent(byte b, byte b2) {
        int i2 = IAuthTabCallback[b & 7];
        if ((b2 & 32) != 0) {
            i2++;
        }
        if (i2 != this.access100.asInterface) {
            if (this.asInterface != 1 && !this.access100.IAuthTabCallback()) {
                onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(this.asInterface, this.IAuthTabCallbackStub);
                this.access100 = onextracallbackwithresult;
                this.access000.add(onextracallbackwithresult);
            }
            this.access100.asInterface = i2;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i3 = (b2 >> 1) & 7;
        this.access100.onWarmupCompleted(z ? 8 : i3, z2);
        if (z) {
            this.access100.onExtraCallback = onExtraCallbackWithResult[i3];
        }
    }

    private void onTransact(byte b) {
        if (b == 32) {
            onExtraCallbackWithResult(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    onExtraCallbackWithResult(1);
                    onNavigationEvent(2);
                    break;
                case 38:
                    onExtraCallbackWithResult(1);
                    onNavigationEvent(3);
                    break;
                case 39:
                    onExtraCallbackWithResult(1);
                    onNavigationEvent(4);
                    break;
                default:
                    int i2 = this.asInterface;
                    if (i2 != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.getInterfaceDescriptor = Collections.EMPTY_LIST;
                                    if (i2 == 1 || i2 == 3) {
                                        access100();
                                        break;
                                    }
                                case 45:
                                    if (i2 == 1 && !this.access100.IAuthTabCallback()) {
                                        this.access100.onExtraCallbackWithResult();
                                        break;
                                    }
                                    break;
                                case 46:
                                    access100();
                                    break;
                                case 47:
                                    this.getInterfaceDescriptor = access000();
                                    access100();
                                    break;
                            }
                        } else {
                            this.access100.onExtraCallback();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        onExtraCallbackWithResult(3);
    }

    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> access000() {
        int size = this.access000.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i2 = 0; i2 < size; i2++) {
            ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallback = this.access000.get(i2).onExtraCallback(Integer.MIN_VALUE);
            arrayList.add(imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallback);
            if (imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallback != null) {
                iMin = Math.min(iMin, imeEditCommand_androidKtExternalSyntheticLambda1OnExtraCallback.IAuthTabCallbackDefault);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            ImeEditCommand_androidKtExternalSyntheticLambda1 imeEditCommand_androidKtExternalSyntheticLambda1 = (ImeEditCommand_androidKtExternalSyntheticLambda1) arrayList.get(i3);
            if (imeEditCommand_androidKtExternalSyntheticLambda1 != null) {
                if (imeEditCommand_androidKtExternalSyntheticLambda1.IAuthTabCallbackDefault != iMin) {
                    imeEditCommand_androidKtExternalSyntheticLambda1 = (ImeEditCommand_androidKtExternalSyntheticLambda1) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.access000.get(i3).onExtraCallback(iMin));
                }
                arrayList2.add(imeEditCommand_androidKtExternalSyntheticLambda1);
            }
        }
        return arrayList2;
    }

    private void onExtraCallbackWithResult(int i2) {
        int i3 = this.asInterface;
        if (i3 != i2) {
            this.asInterface = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.access000.size(); i4++) {
                    this.access000.get(i4).onNavigationEvent(i2);
                }
                return;
            }
            access100();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.getInterfaceDescriptor = Collections.EMPTY_LIST;
            }
        }
    }

    private void onNavigationEvent(int i2) {
        this.IAuthTabCallbackStub = i2;
        this.access100.onExtraCallbackWithResult(i2);
    }

    private void access100() {
        this.access100.IAuthTabCallback(this.asInterface);
        this.access000.clear();
        this.access000.add(this.access100);
    }

    private void asBinder(byte b, byte b2) {
        if (IAuthTabCallbackStubProxy(b)) {
            this.readTypedObject = false;
            return;
        }
        if (IAuthTabCallbackStub(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.readTypedObject = false;
                                break;
                        }
                        return;
                }
            }
            this.readTypedObject = true;
        }
    }

    private static char onWarmupCompleted(byte b) {
        return (char) onWarmupCompleted[(b & Byte.MAX_VALUE) - 32];
    }

    private static char onExtraCallbackWithResult(byte b) {
        return (char) onExtraCallback[b & 15];
    }

    private static char onExtraCallbackWithResult(byte b, byte b2) {
        if ((b & 1) == 0) {
            return onNavigationEvent(b2);
        }
        return onExtraCallback(b2);
    }

    private static char onNavigationEvent(byte b) {
        return (char) onTransact[b & 31];
    }

    private static char onExtraCallback(byte b) {
        return (char) IAuthTabCallbackDefault[b & 31];
    }

    static final class onExtraCallbackWithResult {
        private int IAuthTabCallback;
        private int IAuthTabCallbackStub;
        private int asInterface;
        private int onExtraCallback;
        private int onWarmupCompleted;
        private final List<onWarmupCompleted> onNavigationEvent = new ArrayList();
        private final List<SpannableString> onTransact = new ArrayList();
        private final StringBuilder onExtraCallbackWithResult = new StringBuilder();

        public onExtraCallbackWithResult(int i2, int i3) {
            IAuthTabCallback(i2);
            this.onWarmupCompleted = i3;
        }

        public void IAuthTabCallback(int i2) {
            this.IAuthTabCallback = i2;
            this.onNavigationEvent.clear();
            this.onTransact.clear();
            this.onExtraCallbackWithResult.setLength(0);
            this.asInterface = 15;
            this.onExtraCallback = 0;
            this.IAuthTabCallbackStub = 0;
        }

        public boolean IAuthTabCallback() {
            return this.onNavigationEvent.isEmpty() && this.onTransact.isEmpty() && this.onExtraCallbackWithResult.length() == 0;
        }

        public void onNavigationEvent(int i2) {
            this.IAuthTabCallback = i2;
        }

        public void onExtraCallbackWithResult(int i2) {
            this.onWarmupCompleted = i2;
        }

        public void onWarmupCompleted(int i2, boolean z) {
            this.onNavigationEvent.add(new onWarmupCompleted(i2, z, this.onExtraCallbackWithResult.length()));
        }

        public void onExtraCallback() {
            int length = this.onExtraCallbackWithResult.length();
            if (length > 0) {
                this.onExtraCallbackWithResult.delete(length - 1, length);
                for (int size = this.onNavigationEvent.size() - 1; size >= 0; size--) {
                    onWarmupCompleted onwarmupcompleted = this.onNavigationEvent.get(size);
                    int i2 = onwarmupcompleted.onExtraCallbackWithResult;
                    if (i2 != length) {
                        return;
                    }
                    onwarmupcompleted.onExtraCallbackWithResult = i2 - 1;
                }
            }
        }

        public void onWarmupCompleted(char c) {
            if (this.onExtraCallbackWithResult.length() < 32) {
                this.onExtraCallbackWithResult.append(c);
            }
        }

        public void onExtraCallbackWithResult() {
            this.onTransact.add(onWarmupCompleted());
            this.onExtraCallbackWithResult.setLength(0);
            this.onNavigationEvent.clear();
            int iMin = Math.min(this.onWarmupCompleted, this.asInterface);
            while (this.onTransact.size() >= iMin) {
                this.onTransact.remove(0);
            }
        }

        public ImeEditCommand_androidKtExternalSyntheticLambda1 onExtraCallback(int i2) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i3 = 0; i3 < this.onTransact.size(); i3++) {
                spannableStringBuilder.append((CharSequence) this.onTransact.get(i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) onWarmupCompleted());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i4 = this.onExtraCallback + this.IAuthTabCallbackStub;
            int length = (32 - i4) - spannableStringBuilder.length();
            int i5 = i4 - length;
            if (i2 == Integer.MIN_VALUE) {
                if (this.IAuthTabCallback != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i2 = (this.IAuthTabCallback != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i4 = 32 - length;
                }
                f = ((i4 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.asInterface;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.IAuthTabCallback == 1) {
                i6 -= this.onWarmupCompleted - 1;
            }
            return new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(spannableStringBuilder).onExtraCallback(Layout.Alignment.ALIGN_NORMAL).onExtraCallback(i6, 1).onExtraCallbackWithResult(f).onExtraCallback(i2).IAuthTabCallback();
        }

        private SpannableString onWarmupCompleted() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.onExtraCallbackWithResult);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            boolean z = false;
            int i7 = 0;
            while (i6 < this.onNavigationEvent.size()) {
                onWarmupCompleted onwarmupcompleted = this.onNavigationEvent.get(i6);
                boolean z2 = onwarmupcompleted.onNavigationEvent;
                int i8 = onwarmupcompleted.onWarmupCompleted;
                if (i8 != 8) {
                    boolean z3 = i8 == 7;
                    if (i8 != 7) {
                        i3 = RippleNodeFactory.asBinder[i8];
                    }
                    z = z3;
                }
                int i9 = onwarmupcompleted.onExtraCallbackWithResult;
                i6++;
                if (i9 != (i6 < this.onNavigationEvent.size() ? this.onNavigationEvent.get(i6).onExtraCallbackWithResult : length)) {
                    if (i2 != -1 && !z2) {
                        onNavigationEvent(spannableStringBuilder, i2, i9);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i9;
                    }
                    if (i4 != -1 && !z) {
                        onWarmupCompleted(spannableStringBuilder, i4, i9);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i9;
                    }
                    if (i3 != i5) {
                        onExtraCallbackWithResult(spannableStringBuilder, i7, i9, i5);
                        i5 = i3;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                onNavigationEvent(spannableStringBuilder, i2, length);
            }
            if (i4 != -1 && i4 != length) {
                onWarmupCompleted(spannableStringBuilder, i4, length);
            }
            if (i7 != length) {
                onExtraCallbackWithResult(spannableStringBuilder, i7, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void onNavigationEvent(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }

        private static void onWarmupCompleted(SpannableStringBuilder spannableStringBuilder, int i2, int i3) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, i3, 33);
        }

        private static void onExtraCallbackWithResult(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
            if (i4 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i4), i2, i3, 33);
        }

        static class onWarmupCompleted {
            public int onExtraCallbackWithResult;
            public final boolean onNavigationEvent;
            public final int onWarmupCompleted;

            public onWarmupCompleted(int i2, boolean z, int i3) {
                this.onWarmupCompleted = i2;
                this.onNavigationEvent = z;
                this.onExtraCallbackWithResult = i3;
            }
        }
    }

    private boolean getInterfaceDescriptor() {
        return (this.onUnminimized == -9223372036854775807L || this.extraCallbackWithResult == -9223372036854775807L || IAuthTabCallbackStubProxy() - this.extraCallbackWithResult < this.onUnminimized) ? false : true;
    }
}
