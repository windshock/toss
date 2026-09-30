package o;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import net.sf.scuba.smartcards.BuildConfig;
import org.yaml.snakeyaml.reader.ReaderException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class getBSignPriKeyPH {
    private final char[] IAuthTabCallback;
    private String IAuthTabCallbackDefault;
    private final Reader access000;
    private boolean asInterface;
    private int[] onExtraCallback;
    private int onWarmupCompleted;
    private int IAuthTabCallbackStub = 0;
    private int asBinder = 0;
    private int onNavigationEvent = 0;
    private int onTransact = 0;
    private int onExtraCallbackWithResult = 0;

    public static boolean onWarmupCompleted(int i) {
        if ((i >= 32 && i <= 126) || i == 9 || i == 10 || i == 13 || i == 133) {
            return true;
        }
        if (i >= 160 && i <= 55295) {
            return true;
        }
        if (i < 57344 || i > 65533) {
            return i >= 65536 && i <= 1114111;
        }
        return true;
    }

    public getBSignPriKeyPH(Reader reader) {
        if (reader == null) {
            throw new NullPointerException("Reader must be provided.");
        }
        this.IAuthTabCallbackDefault = "'reader'";
        this.onExtraCallback = new int[0];
        this.onWarmupCompleted = 0;
        this.access000 = reader;
        this.asInterface = false;
        this.IAuthTabCallback = new char[1024];
    }

    public UST_TRANS_V2_SendReceiverInfo IAuthTabCallbackDefault() {
        return new UST_TRANS_V2_SendReceiverInfo(this.IAuthTabCallbackDefault, this.asBinder, this.onTransact, this.onExtraCallbackWithResult, this.onExtraCallback, this.IAuthTabCallbackStub);
    }

    public void onExtraCallback() {
        onExtraCallback(1);
    }

    public void onExtraCallback(int i) {
        for (int i2 = 0; i2 < i && onTransact(); i2++) {
            int[] iArr = this.onExtraCallback;
            int i3 = this.IAuthTabCallbackStub;
            this.IAuthTabCallbackStub = i3 + 1;
            int i4 = iArr[i3];
            asInterface(1);
            if (getCRLDP.IAuthTabCallback.onExtraCallback(i4) || (i4 == 13 && onTransact() && this.onExtraCallback[this.IAuthTabCallbackStub] != 10)) {
                this.onTransact++;
                this.onExtraCallbackWithResult = 0;
            } else if (i4 != 65279) {
                this.onExtraCallbackWithResult++;
            }
        }
    }

    public int IAuthTabCallbackStub() {
        if (onTransact()) {
            return this.onExtraCallback[this.IAuthTabCallbackStub];
        }
        return 0;
    }

    public int onNavigationEvent(int i) {
        if (IAuthTabCallbackDefault(i)) {
            return this.onExtraCallback[this.IAuthTabCallbackStub + i];
        }
        return 0;
    }

    public String onExtraCallbackWithResult(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        if (IAuthTabCallbackDefault(i)) {
            return new String(this.onExtraCallback, this.IAuthTabCallbackStub, i);
        }
        int[] iArr = this.onExtraCallback;
        int i2 = this.IAuthTabCallbackStub;
        return new String(iArr, i2, Math.min(i, this.onWarmupCompleted - i2));
    }

    public String IAuthTabCallback(int i) {
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(i);
        this.IAuthTabCallbackStub += i;
        asInterface(i);
        this.onExtraCallbackWithResult += i;
        return strOnExtraCallbackWithResult;
    }

    private boolean onTransact() {
        return IAuthTabCallbackDefault(0);
    }

    private boolean IAuthTabCallbackDefault(int i) throws IOException {
        if (!this.asInterface && this.IAuthTabCallbackStub + i >= this.onWarmupCompleted) {
            asBinder();
        }
        return this.IAuthTabCallbackStub + i < this.onWarmupCompleted;
    }

    private void asBinder() throws IOException {
        try {
            int i = this.access000.read(this.IAuthTabCallback);
            if (i > 0) {
                int i2 = this.onWarmupCompleted;
                int i3 = this.IAuthTabCallbackStub;
                int i4 = i2 - i3;
                this.onExtraCallback = Arrays.copyOfRange(this.onExtraCallback, i3, i2 + i);
                if (Character.isHighSurrogate(this.IAuthTabCallback[i - 1])) {
                    if (this.access000.read(this.IAuthTabCallback, i, 1) == -1) {
                        this.asInterface = true;
                    } else {
                        i++;
                    }
                }
                int i5 = 32;
                int iCharCount = 0;
                while (iCharCount < i) {
                    int iCodePointAt = Character.codePointAt(this.IAuthTabCallback, iCharCount);
                    this.onExtraCallback[i4] = iCodePointAt;
                    if (onWarmupCompleted(iCodePointAt)) {
                        iCharCount += Character.charCount(iCodePointAt);
                    } else {
                        iCharCount = i;
                        i5 = iCodePointAt;
                    }
                    i4++;
                }
                this.onWarmupCompleted = i4;
                this.IAuthTabCallbackStub = 0;
                if (i5 != 32) {
                    throw new ReaderException(this.IAuthTabCallbackDefault, i4 - 1, i5, "special characters are not allowed");
                }
                return;
            }
            this.asInterface = true;
        } catch (IOException e) {
            throw new UST_TRANS_V2_Init(e);
        }
    }

    public int onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    private void asInterface(int i) {
        this.asBinder += i;
        this.onNavigationEvent += i;
    }

    public int onNavigationEvent() {
        return this.onNavigationEvent;
    }

    public void asInterface() {
        this.onNavigationEvent = 0;
    }

    public int onWarmupCompleted() {
        return this.asBinder;
    }

    public int IAuthTabCallback() {
        return this.onTransact;
    }
}
