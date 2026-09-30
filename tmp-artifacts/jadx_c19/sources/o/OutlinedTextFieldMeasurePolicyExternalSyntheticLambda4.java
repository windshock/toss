package o;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4 {
    public static byte[] onWarmupCompleted(UUID uuid, @Nullable byte[] bArr) {
        return IAuthTabCallback(uuid, null, bArr);
    }

    public static byte[] IAuthTabCallback(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length << 4) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        } else {
            byteBufferAllocate.putInt(0);
        }
        return byteBufferAllocate.array();
    }

    public static boolean onWarmupCompleted(byte[] bArr) {
        return onExtraCallbackWithResult(bArr) != null;
    }

    public static UUID onNavigationEvent(byte[] bArr) {
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
        if (onextracallbackOnExtraCallbackWithResult == null) {
            return null;
        }
        return onextracallbackOnExtraCallbackWithResult.onNavigationEvent;
    }

    public static int onExtraCallback(byte[] bArr) {
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
        if (onextracallbackOnExtraCallbackWithResult == null) {
            return -1;
        }
        return onextracallbackOnExtraCallbackWithResult.onExtraCallbackWithResult;
    }

    public static byte[] onWarmupCompleted(byte[] bArr, UUID uuid) {
        onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(bArr);
        if (onextracallbackOnExtraCallbackWithResult == null) {
            return null;
        }
        if (!uuid.equals(onextracallbackOnExtraCallbackWithResult.onNavigationEvent)) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + onextracallbackOnExtraCallbackWithResult.onNavigationEvent + ".");
            return null;
        }
        return onextracallbackOnExtraCallbackWithResult.IAuthTabCallback;
    }

    public static onExtraCallback onExtraCallbackWithResult(byte[] bArr) {
        UUID[] uuidArr;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult() < 32) {
            return null;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(0);
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder != iOnNavigationEvent) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PsshAtomUtil", "Advertised atom size (" + iAsBinder + ") does not match buffer size: " + iOnNavigationEvent);
            return null;
        }
        int iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if (iAsBinder2 != 1886614376) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PsshAtomUtil", "Atom type is not pssh: " + iAsBinder2);
            return null;
        }
        int iOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        if (iOnWarmupCompleted > 1) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PsshAtomUtil", "Unsupported pssh version: " + iOnWarmupCompleted);
            return null;
        }
        UUID uuid = new UUID(textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject());
        if (iOnWarmupCompleted == 1) {
            int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
            uuidArr = new UUID[iICustomTabsCallbackDefault];
            for (int i2 = 0; i2 < iICustomTabsCallbackDefault; i2++) {
                uuidArr[i2] = new UUID(textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject());
            }
        } else {
            uuidArr = null;
        }
        int iICustomTabsCallbackDefault2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent();
        if (iICustomTabsCallbackDefault2 != iOnNavigationEvent2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("PsshAtomUtil", "Atom data size (" + iICustomTabsCallbackDefault2 + ") does not match the bytes left: " + iOnNavigationEvent2);
            return null;
        }
        byte[] bArr2 = new byte[iICustomTabsCallbackDefault2];
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr2, 0, iICustomTabsCallbackDefault2);
        return new onExtraCallback(uuid, iOnWarmupCompleted, bArr2, uuidArr);
    }

    public static final class onExtraCallback {
        public final byte[] IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final UUID onNavigationEvent;
        public final UUID[] onWarmupCompleted;

        onExtraCallback(UUID uuid, int i2, byte[] bArr, @Nullable UUID[] uuidArr) {
            this.onNavigationEvent = uuid;
            this.onExtraCallbackWithResult = i2;
            this.IAuthTabCallback = bArr;
            this.onWarmupCompleted = uuidArr;
        }
    }
}
