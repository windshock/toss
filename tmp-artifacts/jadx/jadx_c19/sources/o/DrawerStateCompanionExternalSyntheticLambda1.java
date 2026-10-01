package o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.util.Collections;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class DrawerStateCompanionExternalSyntheticLambda1 {
    public final int IAuthTabCallback;
    public final onExtraCallbackWithResult IAuthTabCallbackDefault;
    public final int IAuthTabCallbackStub;
    private final HandwritingHandlerNodeExternalSyntheticLambda0 IAuthTabCallbackStubProxy;
    public final long access100;
    public final int asBinder;
    public final int asInterface;
    public final int onExtraCallback;
    public final int onExtraCallbackWithResult;
    public final int onNavigationEvent;
    public final int onTransact;
    public final int onWarmupCompleted;

    private static int IAuthTabCallback(int i2) {
        if (i2 == 8) {
            return 1;
        }
        if (i2 == 12) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 20) {
            return 5;
        }
        if (i2 != 24) {
            return i2 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int onExtraCallbackWithResult(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public static class onExtraCallbackWithResult {
        public final long[] onExtraCallback;
        public final long[] onExtraCallbackWithResult;

        public onExtraCallbackWithResult(long[] jArr, long[] jArr2) {
            this.onExtraCallback = jArr;
            this.onExtraCallbackWithResult = jArr2;
        }
    }

    public DrawerStateCompanionExternalSyntheticLambda1(byte[] bArr, int i2) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(i2 << 3);
        this.onTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        this.onExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        this.asBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24);
        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(24);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(20);
        this.asInterface = iOnNavigationEvent;
        this.IAuthTabCallbackStub = onExtraCallbackWithResult(iOnNavigationEvent);
        this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3) + 1;
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5) + 1;
        this.onWarmupCompleted = iOnNavigationEvent2;
        this.IAuthTabCallback = IAuthTabCallback(iOnNavigationEvent2);
        this.access100 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(36);
        this.IAuthTabCallbackDefault = null;
        this.IAuthTabCallbackStubProxy = null;
    }

    private DrawerStateCompanionExternalSyntheticLambda1(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, @Nullable onExtraCallbackWithResult onextracallbackwithresult, @Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        this.onTransact = i2;
        this.onExtraCallback = i3;
        this.asBinder = i4;
        this.onExtraCallbackWithResult = i5;
        this.asInterface = i6;
        this.IAuthTabCallbackStub = onExtraCallbackWithResult(i6);
        this.onNavigationEvent = i7;
        this.onWarmupCompleted = i8;
        this.IAuthTabCallback = IAuthTabCallback(i8);
        this.access100 = j;
        this.IAuthTabCallbackDefault = onextracallbackwithresult;
        this.IAuthTabCallbackStubProxy = handwritingHandlerNodeExternalSyntheticLambda0;
    }

    public long onWarmupCompleted() {
        long j = this.access100;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.asInterface;
    }

    public long onExtraCallback(long j) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted((j * this.asInterface) / 1000000, 0L, this.access100 - 1);
    }

    public long IAuthTabCallback() {
        long j;
        long j2;
        int i2 = this.onExtraCallbackWithResult;
        if (i2 > 0) {
            j = (i2 + this.asBinder) / 2;
            j2 = 1;
        } else {
            int i3 = this.onTransact;
            j = ((((i3 != this.onExtraCallback || i3 <= 0) ? 4096L : i3) * this.onNavigationEvent) * this.onWarmupCompleted) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent(byte[] bArr, @Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.onExtraCallbackWithResult;
        if (i2 <= 0) {
            i2 = -1;
        }
        return new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("audio/flac").IAuthTabCallbackStubProxy(i2).onExtraCallback(this.onNavigationEvent).extraCallbackWithResult(this.asInterface).writeTypedObject(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub(this.onWarmupCompleted)).IAuthTabCallback(Collections.singletonList(bArr)).onExtraCallbackWithResult(onExtraCallback(handwritingHandlerNodeExternalSyntheticLambda0)).onNavigationEvent();
    }

    public HandwritingHandlerNodeExternalSyntheticLambda0 onExtraCallback(@Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02 = this.IAuthTabCallbackStubProxy;
        return handwritingHandlerNodeExternalSyntheticLambda02 == null ? handwritingHandlerNodeExternalSyntheticLambda0 : handwritingHandlerNodeExternalSyntheticLambda02.onNavigationEvent(handwritingHandlerNodeExternalSyntheticLambda0);
    }

    public DrawerStateCompanionExternalSyntheticLambda1 onNavigationEvent(@Nullable onExtraCallbackWithResult onextracallbackwithresult) {
        return new DrawerStateCompanionExternalSyntheticLambda1(this.onTransact, this.onExtraCallback, this.asBinder, this.onExtraCallbackWithResult, this.asInterface, this.onNavigationEvent, this.onWarmupCompleted, this.access100, onextracallbackwithresult, this.IAuthTabCallbackStubProxy);
    }

    public DrawerStateCompanionExternalSyntheticLambda1 IAuthTabCallback(List<String> list) {
        return new DrawerStateCompanionExternalSyntheticLambda1(this.onTransact, this.onExtraCallback, this.asBinder, this.onExtraCallbackWithResult, this.asInterface, this.onNavigationEvent, this.onWarmupCompleted, this.access100, this.IAuthTabCallbackDefault, onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda6.onNavigationEvent(list)));
    }

    public DrawerStateCompanionExternalSyntheticLambda1 onNavigationEvent(List<ModalBottomSheetKtExternalSyntheticLambda0> list) {
        return new DrawerStateCompanionExternalSyntheticLambda1(this.onTransact, this.onExtraCallback, this.asBinder, this.onExtraCallbackWithResult, this.asInterface, this.onNavigationEvent, this.onWarmupCompleted, this.access100, this.IAuthTabCallbackDefault, onExtraCallback(new HandwritingHandlerNodeExternalSyntheticLambda0(list)));
    }
}
