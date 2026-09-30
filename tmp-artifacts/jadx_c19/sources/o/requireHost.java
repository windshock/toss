package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Objects;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class requireHost implements hasOptionsMenu, Serializable {
    private static final requireArguments onNavigationEvent = requireArguments.IAuthTabCallback();
    private static final long serialVersionUID = 1;
    protected volatile char[] _quotedChars;
    protected volatile byte[] _quotedUTF8Ref;
    protected volatile byte[] _unquotedUTF8Ref;
    protected final String _value;
    protected transient String onWarmupCompleted;

    public requireHost(String str) {
        Objects.requireNonNull(str, "Null String illegal for SerializedString");
        this._value = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.onWarmupCompleted = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    protected Object readResolve() {
        return new requireHost(this.onWarmupCompleted);
    }

    @Override // o.hasOptionsMenu
    public final String onWarmupCompleted() {
        return this._value;
    }

    @Override // o.hasOptionsMenu
    public final char[] IAuthTabCallback() {
        char[] cArr = this._quotedChars;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(this._value);
        this._quotedChars = cArrOnExtraCallbackWithResult;
        return cArrOnExtraCallbackWithResult;
    }

    @Override // o.hasOptionsMenu
    public final byte[] onExtraCallbackWithResult() {
        byte[] bArr = this._quotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrOnWarmupCompleted = onNavigationEvent.onWarmupCompleted(this._value);
        this._quotedUTF8Ref = bArrOnWarmupCompleted;
        return bArrOnWarmupCompleted;
    }

    @Override // o.hasOptionsMenu
    public final byte[] onNavigationEvent() {
        byte[] bArr = this._unquotedUTF8Ref;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArrIAuthTabCallback = onNavigationEvent.IAuthTabCallback(this._value);
        this._unquotedUTF8Ref = bArrIAuthTabCallback;
        return bArrIAuthTabCallback;
    }

    @Override // o.hasOptionsMenu
    public int IAuthTabCallback(char[] cArr, int i2) {
        char[] cArrOnExtraCallbackWithResult = this._quotedChars;
        if (cArrOnExtraCallbackWithResult == null) {
            cArrOnExtraCallbackWithResult = onNavigationEvent.onExtraCallbackWithResult(this._value);
            this._quotedChars = cArrOnExtraCallbackWithResult;
        }
        int length = cArrOnExtraCallbackWithResult.length;
        if (i2 + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArrOnExtraCallbackWithResult, 0, cArr, i2, length);
        return length;
    }

    @Override // o.hasOptionsMenu
    public int onWarmupCompleted(byte[] bArr, int i2) {
        byte[] bArrOnWarmupCompleted = this._quotedUTF8Ref;
        if (bArrOnWarmupCompleted == null) {
            bArrOnWarmupCompleted = onNavigationEvent.onWarmupCompleted(this._value);
            this._quotedUTF8Ref = bArrOnWarmupCompleted;
        }
        int length = bArrOnWarmupCompleted.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrOnWarmupCompleted, 0, bArr, i2, length);
        return length;
    }

    @Override // o.hasOptionsMenu
    public int onWarmupCompleted(char[] cArr, int i2) {
        String str = this._value;
        int length = str.length();
        if (i2 + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i2);
        return length;
    }

    @Override // o.hasOptionsMenu
    public int onNavigationEvent(byte[] bArr, int i2) {
        byte[] bArrIAuthTabCallback = this._unquotedUTF8Ref;
        if (bArrIAuthTabCallback == null) {
            bArrIAuthTabCallback = onNavigationEvent.IAuthTabCallback(this._value);
            this._unquotedUTF8Ref = bArrIAuthTabCallback;
        }
        int length = bArrIAuthTabCallback.length;
        if (i2 + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArrIAuthTabCallback, 0, bArr, i2, length);
        return length;
    }

    public final String toString() {
        return this._value;
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((requireHost) obj)._value);
    }
}
