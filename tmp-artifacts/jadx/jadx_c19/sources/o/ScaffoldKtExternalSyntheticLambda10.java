package o;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.ScaffoldKtExternalSyntheticLambda10;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda10 extends RippleNodeFactorycreatecolorProducer1 {
    private int IAuthTabCallbackStub;
    private IAuthTabCallback asBinder;
    private final boolean asInterface;
    private final int getInterfaceDescriptor;
    private final onWarmupCompleted[] onExtraCallbackWithResult;
    private onWarmupCompleted onNavigationEvent;
    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> onTransact;
    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
    private int IAuthTabCallbackDefault = -1;

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public /* bridge */ /* synthetic */ void IAuthTabCallback() {
        super.IAuthTabCallback();
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.RadioButtonKtExternalSyntheticLambda0
    public /* bridge */ /* synthetic */ void IAuthTabCallback(long j) {
        super.IAuthTabCallback(j);
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    /* renamed from: asBinder */
    public /* bridge */ /* synthetic */ RippleKt onWarmupCompleted() throws RadioButtonKtExternalSyntheticLambda1 {
        return super.onWarmupCompleted();
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

    public ScaffoldKtExternalSyntheticLambda10(int i2, @Nullable List<byte[]> list) {
        this.getInterfaceDescriptor = i2 == -1 ? 1 : i2;
        this.asInterface = list != null && TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult(list);
        this.onExtraCallbackWithResult = new onWarmupCompleted[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.onExtraCallbackWithResult[i3] = new onWarmupCompleted();
        }
        this.onNavigationEvent = this.onExtraCallbackWithResult[0];
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1, o.TextFieldSelectionState_androidKtExternalSyntheticLambda6
    public void onExtraCallback() {
        super.onExtraCallback();
        this.onWarmupCompleted = null;
        this.onTransact = null;
        this.IAuthTabCallbackStub = 0;
        this.onNavigationEvent = this.onExtraCallbackWithResult[0];
        readTypedObject();
        this.asBinder = null;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    protected boolean IAuthTabCallbackDefault() {
        return this.onWarmupCompleted != this.onTransact;
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    protected RadioButtonKt onTransact() {
        List<ImeEditCommand_androidKtExternalSyntheticLambda1> list = this.onWarmupCompleted;
        this.onTransact = list;
        return new ScaffoldKtExternalSyntheticLambda0((List) RecordingInputConnection_androidKt.onExtraCallbackWithResult(list));
    }

    @Override // o.RippleNodeFactorycreatecolorProducer1
    protected void onNavigationEvent(RippleConfiguration rippleConfiguration) {
        ByteBuffer byteBuffer = (ByteBuffer) RecordingInputConnection_androidKt.onExtraCallbackWithResult(rippleConfiguration.onExtraCallback);
        this.onExtraCallback.onExtraCallback(byteBuffer.array(), byteBuffer.limit());
        while (this.onExtraCallback.onNavigationEvent() >= 3) {
            int iOnMinimized = this.onExtraCallback.onMinimized();
            int i2 = iOnMinimized & 3;
            boolean z = (iOnMinimized & 4) == 4;
            byte bOnMinimized = (byte) this.onExtraCallback.onMinimized();
            byte bOnMinimized2 = (byte) this.onExtraCallback.onMinimized();
            if (i2 == 2 || i2 == 3) {
                if (z) {
                    if (i2 == 3) {
                        onNavigationEvent();
                        int i3 = (bOnMinimized & 192) >> 6;
                        int i4 = this.IAuthTabCallbackDefault;
                        if (i4 != -1 && i3 != (i4 + 1) % 4) {
                            readTypedObject();
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Sequence number discontinuity. previous=" + this.IAuthTabCallbackDefault + " current=" + i3);
                        }
                        this.IAuthTabCallbackDefault = i3;
                        int i5 = bOnMinimized & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(i3, i5);
                        this.asBinder = iAuthTabCallback;
                        byte[] bArr = iAuthTabCallback.IAuthTabCallback;
                        int i6 = iAuthTabCallback.onNavigationEvent;
                        iAuthTabCallback.onNavigationEvent = i6 + 1;
                        bArr[i6] = bOnMinimized2;
                    } else {
                        RecordingInputConnection_androidKt.onNavigationEvent(i2 == 2);
                        IAuthTabCallback iAuthTabCallback2 = this.asBinder;
                        if (iAuthTabCallback2 == null) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = iAuthTabCallback2.IAuthTabCallback;
                            int i7 = iAuthTabCallback2.onNavigationEvent;
                            int i8 = i7 + 1;
                            iAuthTabCallback2.onNavigationEvent = i8;
                            bArr2[i7] = bOnMinimized;
                            iAuthTabCallback2.onNavigationEvent = i7 + 2;
                            bArr2[i8] = bOnMinimized2;
                        }
                    }
                    IAuthTabCallback iAuthTabCallback3 = this.asBinder;
                    if (iAuthTabCallback3.onNavigationEvent == (iAuthTabCallback3.onExtraCallbackWithResult << 1) - 1) {
                        onNavigationEvent();
                    }
                }
            }
        }
    }

    private void onNavigationEvent() {
        if (this.asBinder == null) {
            return;
        }
        extraCallback();
        this.asBinder = null;
    }

    @RequiresNonNull
    private void extraCallback() {
        IAuthTabCallback iAuthTabCallback = this.asBinder;
        if (iAuthTabCallback.onNavigationEvent != (iAuthTabCallback.onExtraCallbackWithResult << 1) - 1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onNavigationEvent("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.asBinder.onExtraCallbackWithResult << 1) - 1) + ", but current index is " + this.asBinder.onNavigationEvent + " (sequence number " + this.asBinder.onExtraCallback + ");");
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = this.IAuthTabCallback;
        IAuthTabCallback iAuthTabCallback2 = this.asBinder;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(iAuthTabCallback2.IAuthTabCallback, iAuthTabCallback2.onNavigationEvent);
        boolean z = false;
        while (true) {
            if (this.IAuthTabCallback.onExtraCallback() <= 0) {
                break;
            }
            int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(3);
            int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(5);
            if (iOnNavigationEvent == 7) {
                this.IAuthTabCallback.IAuthTabCallback(2);
                iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(6);
                if (iOnNavigationEvent < 7) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid extended service number: " + iOnNavigationEvent);
                }
            }
            if (iOnNavigationEvent2 == 0) {
                if (iOnNavigationEvent != 0) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "serviceNumber is non-zero (" + iOnNavigationEvent + ") when blockSize is 0");
                }
            } else if (iOnNavigationEvent != this.getInterfaceDescriptor) {
                this.IAuthTabCallback.onExtraCallbackWithResult(iOnNavigationEvent2);
            } else {
                int iOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult();
                while (this.IAuthTabCallback.onExtraCallbackWithResult() < (iOnNavigationEvent2 << 3) + iOnExtraCallbackWithResult) {
                    int iOnNavigationEvent3 = this.IAuthTabCallback.onNavigationEvent(8);
                    if (iOnNavigationEvent3 == 16) {
                        int iOnNavigationEvent4 = this.IAuthTabCallback.onNavigationEvent(8);
                        if (iOnNavigationEvent4 <= 31) {
                            onExtraCallback(iOnNavigationEvent4);
                        } else {
                            if (iOnNavigationEvent4 <= 127) {
                                asBinder(iOnNavigationEvent4);
                            } else if (iOnNavigationEvent4 <= 159) {
                                onWarmupCompleted(iOnNavigationEvent4);
                            } else if (iOnNavigationEvent4 <= 255) {
                                onTransact(iOnNavigationEvent4);
                            } else {
                                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid extended command: " + iOnNavigationEvent4);
                            }
                            z = true;
                        }
                    } else if (iOnNavigationEvent3 <= 31) {
                        onExtraCallbackWithResult(iOnNavigationEvent3);
                    } else {
                        if (iOnNavigationEvent3 <= 127) {
                            IAuthTabCallbackStub(iOnNavigationEvent3);
                        } else if (iOnNavigationEvent3 <= 159) {
                            onNavigationEvent(iOnNavigationEvent3);
                        } else if (iOnNavigationEvent3 <= 255) {
                            IAuthTabCallbackDefault(iOnNavigationEvent3);
                        } else {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid base command: " + iOnNavigationEvent3);
                        }
                        z = true;
                    }
                }
            }
        }
        if (z) {
            this.onWarmupCompleted = IAuthTabCallback_Parcel();
        }
    }

    private void onExtraCallbackWithResult(int i2) {
        if (i2 != 0) {
            if (i2 == 3) {
                this.onWarmupCompleted = IAuthTabCallback_Parcel();
                return;
            }
            if (i2 == 8) {
                this.onNavigationEvent.onWarmupCompleted();
                return;
            }
            switch (i2) {
                case 12:
                    readTypedObject();
                    break;
                case 13:
                    this.onNavigationEvent.onNavigationEvent('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i2 >= 17 && i2 <= 23) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i2);
                        this.IAuthTabCallback.IAuthTabCallback(8);
                        break;
                    } else if (i2 >= 24 && i2 <= 31) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i2);
                        this.IAuthTabCallback.IAuthTabCallback(16);
                        break;
                    } else {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid C0 command: " + i2);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void onNavigationEvent(int i2) {
        int i3 = 1;
        switch (i2) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i2 - 128;
                if (this.IAuthTabCallbackStub != i4) {
                    this.IAuthTabCallbackStub = i4;
                    this.onNavigationEvent = this.onExtraCallbackWithResult[i4];
                    break;
                }
                break;
            case 136:
                while (i3 <= 8) {
                    if (this.IAuthTabCallback.onWarmupCompleted()) {
                        this.onExtraCallbackWithResult[8 - i3].IAuthTabCallback();
                    }
                    i3++;
                }
                break;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.IAuthTabCallback.onWarmupCompleted()) {
                        this.onExtraCallbackWithResult[8 - i5].onExtraCallbackWithResult(true);
                    }
                }
                break;
            case 138:
                while (i3 <= 8) {
                    if (this.IAuthTabCallback.onWarmupCompleted()) {
                        this.onExtraCallbackWithResult[8 - i3].onExtraCallbackWithResult(false);
                    }
                    i3++;
                }
                break;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.IAuthTabCallback.onWarmupCompleted()) {
                        this.onExtraCallbackWithResult[8 - i6].onExtraCallbackWithResult(!r0.asBinder());
                    }
                }
                break;
            case 140:
                while (i3 <= 8) {
                    if (this.IAuthTabCallback.onWarmupCompleted()) {
                        this.onExtraCallbackWithResult[8 - i3].onTransact();
                    }
                    i3++;
                }
                break;
            case 141:
                this.IAuthTabCallback.IAuthTabCallback(8);
                break;
            case 142:
                break;
            case 143:
                readTypedObject();
                break;
            case 144:
                if (!this.onNavigationEvent.onExtraCallback()) {
                    this.IAuthTabCallback.IAuthTabCallback(16);
                    break;
                } else {
                    access000();
                    break;
                }
            case 145:
                if (!this.onNavigationEvent.onExtraCallback()) {
                    this.IAuthTabCallback.IAuthTabCallback(24);
                    break;
                } else {
                    getInterfaceDescriptor();
                    break;
                }
            case 146:
                if (!this.onNavigationEvent.onExtraCallback()) {
                    this.IAuthTabCallback.IAuthTabCallback(16);
                    break;
                } else {
                    access100();
                    break;
                }
            case 147:
            case 148:
            case 149:
            case RVParams.WEBVIEW_FONT_SIZE_LARGER /* 150 */:
            default:
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid C1 command: " + i2);
                break;
            case 151:
                if (!this.onNavigationEvent.onExtraCallback()) {
                    this.IAuthTabCallback.IAuthTabCallback(32);
                    break;
                } else {
                    ICustomTabsCallback();
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i7 = i2 - 152;
                IAuthTabCallback(i7);
                if (this.IAuthTabCallbackStub != i7) {
                    this.IAuthTabCallbackStub = i7;
                    this.onNavigationEvent = this.onExtraCallbackWithResult[i7];
                    break;
                }
                break;
        }
    }

    private void onExtraCallback(int i2) {
        if (i2 > 7) {
            if (i2 <= 15) {
                this.IAuthTabCallback.IAuthTabCallback(8);
            } else if (i2 <= 23) {
                this.IAuthTabCallback.IAuthTabCallback(16);
            } else if (i2 <= 31) {
                this.IAuthTabCallback.IAuthTabCallback(24);
            }
        }
    }

    private void onWarmupCompleted(int i2) {
        if (i2 <= 135) {
            this.IAuthTabCallback.IAuthTabCallback(32);
            return;
        }
        if (i2 <= 143) {
            this.IAuthTabCallback.IAuthTabCallback(40);
        } else if (i2 <= 159) {
            this.IAuthTabCallback.IAuthTabCallback(2);
            this.IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent(6) << 3);
        }
    }

    private void IAuthTabCallbackStub(int i2) {
        if (i2 == 127) {
            this.onNavigationEvent.onNavigationEvent((char) 9835);
        } else {
            this.onNavigationEvent.onNavigationEvent((char) (i2 & OggPageHeader.MAX_SEGMENT_COUNT));
        }
    }

    private void IAuthTabCallbackDefault(int i2) {
        this.onNavigationEvent.onNavigationEvent((char) (i2 & OggPageHeader.MAX_SEGMENT_COUNT));
    }

    private void asBinder(int i2) {
        if (i2 == 32) {
            this.onNavigationEvent.onNavigationEvent(' ');
            return;
        }
        if (i2 == 33) {
            this.onNavigationEvent.onNavigationEvent((char) 160);
            return;
        }
        if (i2 == 37) {
            this.onNavigationEvent.onNavigationEvent((char) 8230);
            return;
        }
        if (i2 == 42) {
            this.onNavigationEvent.onNavigationEvent((char) 352);
            return;
        }
        if (i2 == 44) {
            this.onNavigationEvent.onNavigationEvent((char) 338);
            return;
        }
        if (i2 == 63) {
            this.onNavigationEvent.onNavigationEvent((char) 376);
            return;
        }
        if (i2 == 57) {
            this.onNavigationEvent.onNavigationEvent((char) 8482);
            return;
        }
        if (i2 == 58) {
            this.onNavigationEvent.onNavigationEvent((char) 353);
            return;
        }
        if (i2 == 60) {
            this.onNavigationEvent.onNavigationEvent((char) 339);
            return;
        }
        if (i2 != 61) {
            switch (i2) {
                case 48:
                    this.onNavigationEvent.onNavigationEvent((char) 9608);
                    break;
                case 49:
                    this.onNavigationEvent.onNavigationEvent((char) 8216);
                    break;
                case 50:
                    this.onNavigationEvent.onNavigationEvent((char) 8217);
                    break;
                case 51:
                    this.onNavigationEvent.onNavigationEvent((char) 8220);
                    break;
                case 52:
                    this.onNavigationEvent.onNavigationEvent((char) 8221);
                    break;
                case 53:
                    this.onNavigationEvent.onNavigationEvent((char) 8226);
                    break;
                default:
                    switch (i2) {
                        case 118:
                            this.onNavigationEvent.onNavigationEvent((char) 8539);
                            break;
                        case 119:
                            this.onNavigationEvent.onNavigationEvent((char) 8540);
                            break;
                        case 120:
                            this.onNavigationEvent.onNavigationEvent((char) 8541);
                            break;
                        case 121:
                            this.onNavigationEvent.onNavigationEvent((char) 8542);
                            break;
                        case 122:
                            this.onNavigationEvent.onNavigationEvent((char) 9474);
                            break;
                        case 123:
                            this.onNavigationEvent.onNavigationEvent((char) 9488);
                            break;
                        case 124:
                            this.onNavigationEvent.onNavigationEvent((char) 9492);
                            break;
                        case 125:
                            this.onNavigationEvent.onNavigationEvent((char) 9472);
                            break;
                        case 126:
                            this.onNavigationEvent.onNavigationEvent((char) 9496);
                            break;
                        case 127:
                            this.onNavigationEvent.onNavigationEvent((char) 9484);
                            break;
                        default:
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid G2 character: " + i2);
                            break;
                    }
            }
            return;
        }
        this.onNavigationEvent.onNavigationEvent((char) 8480);
    }

    private void onTransact(int i2) {
        if (i2 == 160) {
            this.onNavigationEvent.onNavigationEvent((char) 13252);
            return;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("Cea708Decoder", "Invalid G3 character: " + i2);
        this.onNavigationEvent.onNavigationEvent('_');
    }

    private void access000() {
        this.onNavigationEvent.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent(4), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onWarmupCompleted(), this.IAuthTabCallback.onWarmupCompleted(), this.IAuthTabCallback.onNavigationEvent(3), this.IAuthTabCallback.onNavigationEvent(3));
    }

    private void getInterfaceDescriptor() {
        int iOnWarmupCompleted = onWarmupCompleted.onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2));
        int iOnWarmupCompleted2 = onWarmupCompleted.onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2));
        this.IAuthTabCallback.IAuthTabCallback(2);
        this.onNavigationEvent.onNavigationEvent(iOnWarmupCompleted, iOnWarmupCompleted2, onWarmupCompleted.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2)));
    }

    private void access100() {
        this.IAuthTabCallback.IAuthTabCallback(4);
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(4);
        this.IAuthTabCallback.IAuthTabCallback(2);
        this.onNavigationEvent.onWarmupCompleted(iOnNavigationEvent, this.IAuthTabCallback.onNavigationEvent(6));
    }

    private void ICustomTabsCallback() {
        int iOnWarmupCompleted = onWarmupCompleted.onWarmupCompleted(this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2));
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(2);
        int iIAuthTabCallback = onWarmupCompleted.IAuthTabCallback(this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2), this.IAuthTabCallback.onNavigationEvent(2));
        if (this.IAuthTabCallback.onWarmupCompleted()) {
            iOnNavigationEvent |= 4;
        }
        boolean zOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(2);
        int iOnNavigationEvent3 = this.IAuthTabCallback.onNavigationEvent(2);
        int iOnNavigationEvent4 = this.IAuthTabCallback.onNavigationEvent(2);
        this.IAuthTabCallback.IAuthTabCallback(8);
        this.onNavigationEvent.onExtraCallbackWithResult(iOnWarmupCompleted, iIAuthTabCallback, zOnWarmupCompleted, iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent4);
    }

    private void IAuthTabCallback(int i2) {
        onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult[i2];
        this.IAuthTabCallback.IAuthTabCallback(2);
        boolean zOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        this.IAuthTabCallback.IAuthTabCallback(2);
        int iOnNavigationEvent = this.IAuthTabCallback.onNavigationEvent(3);
        boolean zOnWarmupCompleted2 = this.IAuthTabCallback.onWarmupCompleted();
        int iOnNavigationEvent2 = this.IAuthTabCallback.onNavigationEvent(7);
        int iOnNavigationEvent3 = this.IAuthTabCallback.onNavigationEvent(8);
        int iOnNavigationEvent4 = this.IAuthTabCallback.onNavigationEvent(4);
        int iOnNavigationEvent5 = this.IAuthTabCallback.onNavigationEvent(4);
        this.IAuthTabCallback.IAuthTabCallback(2);
        this.IAuthTabCallback.IAuthTabCallback(6);
        this.IAuthTabCallback.IAuthTabCallback(2);
        onwarmupcompleted.IAuthTabCallback(zOnWarmupCompleted, iOnNavigationEvent, zOnWarmupCompleted2, iOnNavigationEvent2, iOnNavigationEvent3, iOnNavigationEvent5, iOnNavigationEvent4, this.IAuthTabCallback.onNavigationEvent(3), this.IAuthTabCallback.onNavigationEvent(3));
    }

    private List<ImeEditCommand_androidKtExternalSyntheticLambda1> IAuthTabCallback_Parcel() {
        onExtraCallback onextracallbackOnNavigationEvent;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.onExtraCallbackWithResult[i2].IAuthTabCallbackStub() && this.onExtraCallbackWithResult[i2].asBinder() && (onextracallbackOnNavigationEvent = this.onExtraCallbackWithResult[i2].onNavigationEvent()) != null) {
                arrayList.add(onextracallbackOnNavigationEvent);
            }
        }
        Collections.sort(arrayList, onExtraCallback.IAuthTabCallback);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((onExtraCallback) arrayList.get(i3)).onExtraCallback);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void readTypedObject() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.onExtraCallbackWithResult[i2].onTransact();
        }
    }

    static final class IAuthTabCallback {
        public final byte[] IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        int onNavigationEvent = 0;

        public IAuthTabCallback(int i2, int i3) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = i3;
            this.IAuthTabCallback = new byte[(i3 << 1) - 1];
        }
    }

    static final class onWarmupCompleted {
        private static final int[] IAuthTabCallback;
        private static final int[] IAuthTabCallbackDefault;
        private static final int[] IAuthTabCallbackStub;
        private static final int[] asBinder;
        private static final int[] asInterface;
        private static final boolean[] getInterfaceDescriptor;
        public static final int onExtraCallback;
        private static final int[] onExtraCallbackWithResult;
        public static final int onNavigationEvent;
        private static final int[] onTransact;
        public static final int onWarmupCompleted = onWarmupCompleted(2, 2, 2, 0);
        private int IAuthTabCallback_Parcel;
        private int ICustomTabsCallback;
        private int ICustomTabsCallbackDefault;
        private boolean ICustomTabsCallbackStub;
        private int ICustomTabsCallbackStubProxy;
        private int access000;
        private int access100;
        private int extraCallback;
        private boolean extraCallbackWithResult;
        private int extraCommand;
        private int isEngagementSignalsApiAvailable;
        private int onActivityLayout;
        private int onActivityResized;
        private boolean onMessageChannelReady;
        private int onMinimized;
        private int onRelationshipValidationResult;
        private int onUnminimized;
        private int readTypedObject;
        private int writeTypedObject;
        private final List<SpannableString> onPostMessage = new ArrayList();
        private final SpannableStringBuilder IAuthTabCallbackStubProxy = new SpannableStringBuilder();

        static {
            int iOnWarmupCompleted = onWarmupCompleted(0, 0, 0, 0);
            onNavigationEvent = iOnWarmupCompleted;
            int iOnWarmupCompleted2 = onWarmupCompleted(0, 0, 0, 3);
            onExtraCallback = iOnWarmupCompleted2;
            onTransact = new int[]{0, 0, 0, 0, 0, 2, 0};
            IAuthTabCallbackStub = new int[]{0, 0, 0, 0, 0, 0, 2};
            asBinder = new int[]{3, 3, 3, 3, 3, 3, 1};
            getInterfaceDescriptor = new boolean[]{false, false, false, true, true, true, false};
            IAuthTabCallbackDefault = new int[]{iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted, iOnWarmupCompleted};
            asInterface = new int[]{0, 1, 2, 3, 4, 3, 4};
            onExtraCallbackWithResult = new int[]{0, 0, 0, 0, 0, 3, 3};
            IAuthTabCallback = new int[]{iOnWarmupCompleted, iOnWarmupCompleted, iOnWarmupCompleted, iOnWarmupCompleted, iOnWarmupCompleted, iOnWarmupCompleted2, iOnWarmupCompleted2};
        }

        public onWarmupCompleted() {
            onTransact();
        }

        public boolean IAuthTabCallbackStub() {
            if (onExtraCallback()) {
                return this.onPostMessage.isEmpty() && this.IAuthTabCallbackStubProxy.length() == 0;
            }
            return true;
        }

        public void onTransact() {
            IAuthTabCallback();
            this.extraCallbackWithResult = false;
            this.ICustomTabsCallbackStub = false;
            this.onMinimized = 4;
            this.onMessageChannelReady = false;
            this.ICustomTabsCallbackStubProxy = 0;
            this.extraCallback = 0;
            this.IAuthTabCallback_Parcel = 0;
            this.onUnminimized = 15;
            this.onActivityLayout = 0;
            this.isEngagementSignalsApiAvailable = 0;
            this.onActivityResized = 0;
            int i2 = onNavigationEvent;
            this.extraCommand = i2;
            this.readTypedObject = onWarmupCompleted;
            this.access100 = i2;
        }

        public void IAuthTabCallback() {
            this.onPostMessage.clear();
            this.IAuthTabCallbackStubProxy.clear();
            this.writeTypedObject = -1;
            this.onRelationshipValidationResult = -1;
            this.ICustomTabsCallback = -1;
            this.access000 = -1;
            this.ICustomTabsCallbackDefault = 0;
        }

        public boolean onExtraCallback() {
            return this.extraCallbackWithResult;
        }

        public void onExtraCallbackWithResult(boolean z) {
            this.ICustomTabsCallbackStub = z;
        }

        public boolean asBinder() {
            return this.ICustomTabsCallbackStub;
        }

        public void IAuthTabCallback(boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.extraCallbackWithResult = true;
            this.ICustomTabsCallbackStub = z;
            this.onMinimized = i2;
            this.onMessageChannelReady = z2;
            this.ICustomTabsCallbackStubProxy = i3;
            this.extraCallback = i4;
            this.IAuthTabCallback_Parcel = i6;
            int i9 = i5 + 1;
            if (this.onUnminimized != i9) {
                this.onUnminimized = i9;
                while (true) {
                    if (this.onPostMessage.size() < this.onUnminimized && this.onPostMessage.size() < 15) {
                        break;
                    } else {
                        this.onPostMessage.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.isEngagementSignalsApiAvailable != i7) {
                this.isEngagementSignalsApiAvailable = i7;
                int i10 = i7 - 1;
                onExtraCallbackWithResult(IAuthTabCallbackDefault[i10], onExtraCallback, getInterfaceDescriptor[i10], 0, IAuthTabCallbackStub[i10], asBinder[i10], onTransact[i10]);
            }
            if (i8 == 0 || this.onActivityResized == i8) {
                return;
            }
            this.onActivityResized = i8;
            int i11 = i8 - 1;
            IAuthTabCallback(0, 1, 1, false, false, onExtraCallbackWithResult[i11], asInterface[i11]);
            onNavigationEvent(onWarmupCompleted, IAuthTabCallback[i11], onNavigationEvent);
        }

        public void onExtraCallbackWithResult(int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
            this.extraCommand = i2;
            this.onActivityLayout = i7;
        }

        public void IAuthTabCallback(int i2, int i3, int i4, boolean z, boolean z2, int i5, int i6) {
            if (this.writeTypedObject != -1) {
                if (!z) {
                    this.IAuthTabCallbackStubProxy.setSpan(new StyleSpan(2), this.writeTypedObject, this.IAuthTabCallbackStubProxy.length(), 33);
                    this.writeTypedObject = -1;
                }
            } else if (z) {
                this.writeTypedObject = this.IAuthTabCallbackStubProxy.length();
            }
            if (this.onRelationshipValidationResult == -1) {
                if (z2) {
                    this.onRelationshipValidationResult = this.IAuthTabCallbackStubProxy.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.IAuthTabCallbackStubProxy.setSpan(new UnderlineSpan(), this.onRelationshipValidationResult, this.IAuthTabCallbackStubProxy.length(), 33);
                this.onRelationshipValidationResult = -1;
            }
        }

        public void onNavigationEvent(int i2, int i3, int i4) {
            if (this.ICustomTabsCallback != -1 && this.readTypedObject != i2) {
                this.IAuthTabCallbackStubProxy.setSpan(new ForegroundColorSpan(this.readTypedObject), this.ICustomTabsCallback, this.IAuthTabCallbackStubProxy.length(), 33);
            }
            if (i2 != onWarmupCompleted) {
                this.ICustomTabsCallback = this.IAuthTabCallbackStubProxy.length();
                this.readTypedObject = i2;
            }
            if (this.access000 != -1 && this.access100 != i3) {
                this.IAuthTabCallbackStubProxy.setSpan(new BackgroundColorSpan(this.access100), this.access000, this.IAuthTabCallbackStubProxy.length(), 33);
            }
            if (i3 != onNavigationEvent) {
                this.access000 = this.IAuthTabCallbackStubProxy.length();
                this.access100 = i3;
            }
        }

        public void onWarmupCompleted(int i2, int i3) {
            if (this.ICustomTabsCallbackDefault != i2) {
                onNavigationEvent('\n');
            }
            this.ICustomTabsCallbackDefault = i2;
        }

        public void onWarmupCompleted() {
            int length = this.IAuthTabCallbackStubProxy.length();
            if (length > 0) {
                this.IAuthTabCallbackStubProxy.delete(length - 1, length);
            }
        }

        public void onNavigationEvent(char c) {
            if (c == '\n') {
                this.onPostMessage.add(onExtraCallbackWithResult());
                this.IAuthTabCallbackStubProxy.clear();
                if (this.writeTypedObject != -1) {
                    this.writeTypedObject = 0;
                }
                if (this.onRelationshipValidationResult != -1) {
                    this.onRelationshipValidationResult = 0;
                }
                if (this.ICustomTabsCallback != -1) {
                    this.ICustomTabsCallback = 0;
                }
                if (this.access000 != -1) {
                    this.access000 = 0;
                }
                while (true) {
                    if (this.onPostMessage.size() >= this.onUnminimized || this.onPostMessage.size() >= 15) {
                        this.onPostMessage.remove(0);
                    } else {
                        this.ICustomTabsCallbackDefault = this.onPostMessage.size();
                        return;
                    }
                }
            } else {
                this.IAuthTabCallbackStubProxy.append(c);
            }
        }

        public SpannableString onExtraCallbackWithResult() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.IAuthTabCallbackStubProxy);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.writeTypedObject != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.writeTypedObject, length, 33);
                }
                if (this.onRelationshipValidationResult != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.onRelationshipValidationResult, length, 33);
                }
                if (this.ICustomTabsCallback != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.readTypedObject), this.ICustomTabsCallback, length, 33);
                }
                if (this.access000 != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.access100), this.access000, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public onExtraCallback onNavigationEvent() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (IAuthTabCallbackStub()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.onPostMessage.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.onPostMessage.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) onExtraCallbackWithResult());
            int i3 = this.onActivityLayout;
            if (i3 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i3 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.onActivityLayout);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.onMessageChannelReady) {
                f = this.extraCallback / 99.0f;
                f2 = this.ICustomTabsCallbackStubProxy / 99.0f;
            } else {
                f = this.extraCallback / 209.0f;
                f2 = this.ICustomTabsCallbackStubProxy / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            int i4 = this.IAuthTabCallback_Parcel;
            int i5 = i4 / 3;
            int i6 = i4 % 3;
            return new onExtraCallback(spannableStringBuilder, alignment2, (f2 * 0.9f) + 0.05f, 0, i5 == 0 ? 0 : i5 == 1 ? 1 : 2, f3, i6 == 0 ? 0 : i6 == 1 ? 1 : 2, -3.4028235E38f, this.extraCommand != onNavigationEvent, this.extraCommand, this.onMinimized);
        }

        public static int IAuthTabCallback(int i2, int i3, int i4) {
            return onWarmupCompleted(i2, i3, i4, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int onWarmupCompleted(int i2, int i3, int i4, int i5) {
            int i6;
            RecordingInputConnection_androidKt.onExtraCallback(i2, 0, 4);
            RecordingInputConnection_androidKt.onExtraCallback(i3, 0, 4);
            RecordingInputConnection_androidKt.onExtraCallback(i4, 0, 4);
            RecordingInputConnection_androidKt.onExtraCallback(i5, 0, 4);
            if (i5 == 0 || i5 == 1) {
                i6 = 255;
            } else if (i5 == 2) {
                i6 = 127;
            } else if (i5 == 3) {
                i6 = 0;
            }
            return Color.argb(i6, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0, i4 > 1 ? 255 : 0);
        }
    }

    public static final class onExtraCallback {
        private static final Comparator<onExtraCallback> IAuthTabCallback = new Comparator() { // from class: androidx.media3.extractor.text.cea.Cea708Decoder$Cea708CueInfo$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ScaffoldKtExternalSyntheticLambda10.onExtraCallback) obj2).onWarmupCompleted, ((ScaffoldKtExternalSyntheticLambda10.onExtraCallback) obj).onWarmupCompleted);
            }
        };
        public final ImeEditCommand_androidKtExternalSyntheticLambda1 onExtraCallback;
        public final int onWarmupCompleted;

        public onExtraCallback(CharSequence charSequence, Layout.Alignment alignment, float f, int i2, int i3, float f2, int i4, float f3, boolean z, int i5, int i6) {
            ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultIAuthTabCallback = new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(charSequence).onExtraCallback(alignment).onExtraCallback(f, i2).onExtraCallbackWithResult(i3).onExtraCallbackWithResult(f2).onExtraCallback(i4).IAuthTabCallback(f3);
            if (z) {
                onextracallbackwithresultIAuthTabCallback.IAuthTabCallback(i5);
            }
            this.onExtraCallback = onextracallbackwithresultIAuthTabCallback.IAuthTabCallback();
            this.onWarmupCompleted = i6;
        }
    }
}
