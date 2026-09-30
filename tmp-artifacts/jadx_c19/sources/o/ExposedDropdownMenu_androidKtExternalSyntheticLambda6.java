package o;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ExposedDropdownMenu_androidKtExternalSyntheticLambda6 {
    public static int onNavigationEvent(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static final class onWarmupCompleted {
        public final String IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final String[] onWarmupCompleted;

        public onWarmupCompleted(String str, String[] strArr, int i2) {
            this.IAuthTabCallback = str;
            this.onWarmupCompleted = strArr;
            this.onExtraCallbackWithResult = i2;
        }
    }

    public static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final int IAuthTabCallbackStub;
        public final byte[] asBinder;
        public final boolean asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z, byte[] bArr) {
            this.onTransact = i2;
            this.IAuthTabCallbackDefault = i3;
            this.IAuthTabCallbackStub = i4;
            this.onExtraCallbackWithResult = i5;
            this.IAuthTabCallback = i6;
            this.onExtraCallback = i7;
            this.onWarmupCompleted = i8;
            this.onNavigationEvent = i9;
            this.asInterface = z;
            this.asBinder = bArr;
        }
    }

    public static final class onNavigationEvent {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final boolean onWarmupCompleted;

        public onNavigationEvent(boolean z, int i2, int i3, int i4) {
            this.onWarmupCompleted = z;
            this.IAuthTabCallback = i2;
            this.onNavigationEvent = i3;
            this.onExtraCallbackWithResult = i4;
        }
    }

    public static int[] IAuthTabCallback(int i2) {
        if (i2 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i2 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i2 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i2 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i2 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static ImmutableList<byte[]> onNavigationEvent(byte[] bArr) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        int i2 = 0;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault() == 255) {
            i2 += OggPageHeader.MAX_SEGMENT_COUNT;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        }
        int iOnMinimized = i2 + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i3 = 0;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault() == 255) {
            i3 += OggPageHeader.MAX_SEGMENT_COUNT;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        }
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        byte[] bArr2 = new byte[iOnMinimized];
        int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
        System.arraycopy(bArr, iOnWarmupCompleted, bArr2, 0, iOnMinimized);
        int i4 = iOnWarmupCompleted + iOnMinimized + i3 + iOnMinimized2;
        int length = bArr.length - i4;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i4, bArr3, 0, length);
        return ImmutableList.of(bArr2, bArr3);
    }

    public static onExtraCallbackWithResult onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        onWarmupCompleted(1, textFieldDecoratorModifierNodeExternalSyntheticLambda20, false);
        int iExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallback();
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iExtraCallback2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallback();
        int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        if (interfaceDescriptor <= 0) {
            interfaceDescriptor = -1;
        }
        int interfaceDescriptor2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        if (interfaceDescriptor2 <= 0) {
            interfaceDescriptor2 = -1;
        }
        int interfaceDescriptor3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
        if (interfaceDescriptor3 <= 0) {
            interfaceDescriptor3 = -1;
        }
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        return new onExtraCallbackWithResult(iExtraCallback, iOnMinimized, iExtraCallback2, interfaceDescriptor, interfaceDescriptor2, interfaceDescriptor3, (int) Math.pow(2.0d, iOnMinimized2 & 15), (int) Math.pow(2.0d, (iOnMinimized2 & 240) >> 4), (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 1) > 0, Arrays.copyOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult()));
    }

    public static onWarmupCompleted IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        return onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20, true, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static onWarmupCompleted onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z, boolean z2) throws ParserException {
        if (z) {
            onWarmupCompleted(3, textFieldDecoratorModifierNodeExternalSyntheticLambda20, false);
        }
        String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted((int) textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback_Parcel());
        int length = strOnWarmupCompleted.length();
        long jIAuthTabCallback_Parcel = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback_Parcel();
        String[] strArr = new String[(int) jIAuthTabCallback_Parcel];
        int length2 = length + 15;
        for (int i2 = 0; i2 < jIAuthTabCallback_Parcel; i2++) {
            String strOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted((int) textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback_Parcel());
            strArr[i2] = strOnWarmupCompleted2;
            length2 = length2 + 4 + strOnWarmupCompleted2.length();
        }
        if (z2 && (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() & 1) == 0) {
            throw ParserException.onNavigationEvent("framing bit expected to be set", (Throwable) null);
        }
        return new onWarmupCompleted(strOnWarmupCompleted, strArr, length2 + 1);
    }

    public static HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] strArrIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(str, "=");
            if (strArrIAuthTabCallback.length != 2) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrIAuthTabCallback[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(ModalBottomSheetKtExternalSyntheticLambda0.onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(Base64.decode(strArrIAuthTabCallback[1], 0))));
                } catch (RuntimeException e) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new NavigationRailKtExternalSyntheticLambda6(strArrIAuthTabCallback[0], strArrIAuthTabCallback[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HandwritingHandlerNodeExternalSyntheticLambda0(arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static boolean onWarmupCompleted(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z) throws ParserException {
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() < 7) {
            if (z) {
                return false;
            }
            throw ParserException.onNavigationEvent("too short header: " + textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), (Throwable) null);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() != i2) {
            if (z) {
                return false;
            }
            throw ParserException.onNavigationEvent("expected header type " + Integer.toHexString(i2), (Throwable) null);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 118 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 111 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 114 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 98 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 105 && textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw ParserException.onNavigationEvent("expected characters 'vorbis'", (Throwable) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static onNavigationEvent[] onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2) throws ParserException {
        onWarmupCompleted(5, textFieldDecoratorModifierNodeExternalSyntheticLambda20, false);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda7(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() << 3);
        for (int i3 = 0; i3 < iOnMinimized + 1; i3++) {
            IAuthTabCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda7);
        }
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6);
        for (int i4 = 0; i4 < iOnExtraCallbackWithResult + 1; i4++) {
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16) != 0) {
                throw ParserException.onNavigationEvent("placeholder of time domain transforms not zeroed out", (Throwable) null);
            }
        }
        onWarmupCompleted(exposedDropdownMenu_androidKtExternalSyntheticLambda7);
        onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda7);
        onExtraCallbackWithResult(i2, exposedDropdownMenu_androidKtExternalSyntheticLambda7);
        onNavigationEvent[] onnavigationeventArrOnExtraCallbackWithResult = onExtraCallbackWithResult(exposedDropdownMenu_androidKtExternalSyntheticLambda7);
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent()) {
            return onnavigationeventArrOnExtraCallbackWithResult;
        }
        throw ParserException.onNavigationEvent("framing bit after modes not set as expected", (Throwable) null);
    }

    private static onNavigationEvent[] onExtraCallbackWithResult(ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7) {
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6) + 1;
        onNavigationEvent[] onnavigationeventArr = new onNavigationEvent[iOnExtraCallbackWithResult];
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult; i2++) {
            onnavigationeventArr[i2] = new onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent(), exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16), exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16), exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(8));
        }
        return onnavigationeventArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onExtraCallbackWithResult(int i2, ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7) throws ParserException {
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6);
        for (int i3 = 0; i3 < iOnExtraCallbackWithResult + 1; i3++) {
            int iOnExtraCallbackWithResult2 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16);
            if (iOnExtraCallbackWithResult2 != 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("VorbisUtil", "mapping type other than 0 not supported: " + iOnExtraCallbackWithResult2);
            } else {
                int iOnExtraCallbackWithResult3 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent() ? exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4) + 1 : 1;
                if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent()) {
                    int iOnExtraCallbackWithResult4 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(8);
                    for (int i4 = 0; i4 < iOnExtraCallbackWithResult4 + 1; i4++) {
                        int i5 = i2 - 1;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(onNavigationEvent(i5));
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(onNavigationEvent(i5));
                    }
                }
                if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(2) != 0) {
                    throw ParserException.onNavigationEvent("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                }
                if (iOnExtraCallbackWithResult3 > 1) {
                    for (int i6 = 0; i6 < i2; i6++) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(4);
                    }
                }
                for (int i7 = 0; i7 < iOnExtraCallbackWithResult3; i7++) {
                    exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                    exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                    exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7) throws ParserException {
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6);
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult + 1; i2++) {
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16) > 2) {
                throw ParserException.onNavigationEvent("residueType greater than 2 is not decodable", (Throwable) null);
            }
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(24);
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(24);
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(24);
            int iOnExtraCallbackWithResult2 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6) + 1;
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
            int[] iArr = new int[iOnExtraCallbackWithResult2];
            for (int i3 = 0; i3 < iOnExtraCallbackWithResult2; i3++) {
                iArr[i3] = ((exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent() ? exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(5) : 0) << 3) + exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(3);
            }
            for (int i4 = 0; i4 < iOnExtraCallbackWithResult2; i4++) {
                for (int i5 = 0; i5 < 8; i5++) {
                    if ((iArr[i4] & (1 << i5)) != 0) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onWarmupCompleted(ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7) throws ParserException {
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(6);
        for (int i2 = 0; i2 < iOnExtraCallbackWithResult + 1; i2++) {
            int iOnExtraCallbackWithResult2 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16);
            if (iOnExtraCallbackWithResult2 == 0) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(16);
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(16);
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(6);
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                int iOnExtraCallbackWithResult3 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4);
                for (int i3 = 0; i3 < iOnExtraCallbackWithResult3 + 1; i3++) {
                    exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                }
            } else {
                if (iOnExtraCallbackWithResult2 != 1) {
                    throw ParserException.onNavigationEvent("floor type greater than 1 not decodable: " + iOnExtraCallbackWithResult2, (Throwable) null);
                }
                int iOnExtraCallbackWithResult4 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(5);
                int[] iArr = new int[iOnExtraCallbackWithResult4];
                int i4 = -1;
                for (int i5 = 0; i5 < iOnExtraCallbackWithResult4; i5++) {
                    int iOnExtraCallbackWithResult5 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4);
                    iArr[i5] = iOnExtraCallbackWithResult5;
                    if (iOnExtraCallbackWithResult5 > i4) {
                        i4 = iOnExtraCallbackWithResult5;
                    }
                }
                int i6 = i4 + 1;
                int[] iArr2 = new int[i6];
                for (int i7 = 0; i7 < i6; i7++) {
                    iArr2[i7] = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(3) + 1;
                    int iOnExtraCallbackWithResult6 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(2);
                    if (iOnExtraCallbackWithResult6 > 0) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                    }
                    for (int i8 = 0; i8 < (1 << iOnExtraCallbackWithResult6); i8++) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(8);
                    }
                }
                exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(2);
                int iOnExtraCallbackWithResult7 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4);
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < iOnExtraCallbackWithResult4; i11++) {
                    i9 += iArr2[iArr[i11]];
                    while (i10 < i9) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(iOnExtraCallbackWithResult7);
                        i10++;
                    }
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void IAuthTabCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda7 exposedDropdownMenu_androidKtExternalSyntheticLambda7) throws ParserException {
        long jOnWarmupCompleted;
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(24) != 5653314) {
            throw ParserException.onNavigationEvent("expected code book to start with [0x56, 0x43, 0x42] at " + exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(), (Throwable) null);
        }
        int iOnExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(16);
        int iOnExtraCallbackWithResult2 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(24);
        int iOnExtraCallbackWithResult3 = 0;
        if (!exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent()) {
            boolean zOnNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent();
            while (iOnExtraCallbackWithResult3 < iOnExtraCallbackWithResult2) {
                if (!zOnNavigationEvent || exposedDropdownMenu_androidKtExternalSyntheticLambda7.onNavigationEvent()) {
                    exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(5);
                }
                iOnExtraCallbackWithResult3++;
            }
        } else {
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(5);
            while (iOnExtraCallbackWithResult3 < iOnExtraCallbackWithResult2) {
                iOnExtraCallbackWithResult3 += exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(onNavigationEvent(iOnExtraCallbackWithResult2 - iOnExtraCallbackWithResult3));
            }
        }
        int iOnExtraCallbackWithResult4 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4);
        if (iOnExtraCallbackWithResult4 > 2) {
            throw ParserException.onNavigationEvent("lookup type greater than 2 not decodable: " + iOnExtraCallbackWithResult4, (Throwable) null);
        }
        if (iOnExtraCallbackWithResult4 == 1 || iOnExtraCallbackWithResult4 == 2) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(32);
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(32);
            int iOnExtraCallbackWithResult5 = exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallbackWithResult(4);
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback(1);
            if (iOnExtraCallbackWithResult4 == 1) {
                jOnWarmupCompleted = iOnExtraCallbackWithResult != 0 ? onWarmupCompleted(iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult) : 0L;
            } else {
                jOnWarmupCompleted = iOnExtraCallbackWithResult * iOnExtraCallbackWithResult2;
            }
            exposedDropdownMenu_androidKtExternalSyntheticLambda7.onExtraCallback((int) (jOnWarmupCompleted * (iOnExtraCallbackWithResult5 + 1)));
        }
    }

    private static long onWarmupCompleted(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }
}
