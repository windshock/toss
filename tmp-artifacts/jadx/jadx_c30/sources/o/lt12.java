package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Optional;
import net.sf.scuba.smartcards.BuildConfig;
import org.snakeyaml.engine.v2.exceptions.ReaderException;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final class lt12 {
    private int[] IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final Reader IAuthTabCallbackStubProxy;
    private int access100;
    private boolean asBinder;
    private final String asInterface;
    private final boolean getInterfaceDescriptor;
    private final char[] onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onNavigationEvent;
    private int onTransact;
    private final int onWarmupCompleted;

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

    public lt12(setVideoAdInteractionListener setvideoadinteractionlistener, Reader reader) {
        this.access100 = 0;
        this.IAuthTabCallbackDefault = 0;
        this.IAuthTabCallbackStub = 0;
        this.onTransact = 0;
        this.onExtraCallbackWithResult = 0;
        this.asInterface = setvideoadinteractionlistener.asInterface();
        this.IAuthTabCallback = new int[0];
        this.onNavigationEvent = 0;
        this.IAuthTabCallbackStubProxy = reader;
        this.asBinder = false;
        int iIntValue = setvideoadinteractionlistener.IAuthTabCallback().intValue();
        this.onWarmupCompleted = iIntValue;
        this.onExtraCallback = new char[iIntValue + 1];
        this.getInterfaceDescriptor = setvideoadinteractionlistener.access100();
    }

    public lt12(setVideoAdInteractionListener setvideoadinteractionlistener, String str) {
        this(setvideoadinteractionlistener, new StringReader(str));
    }

    public Optional<sya8> IAuthTabCallbackStub() {
        if (this.getInterfaceDescriptor) {
            return Optional.of(new sya8(this.asInterface, this.IAuthTabCallbackDefault, this.onTransact, this.onExtraCallbackWithResult, this.IAuthTabCallback, this.access100));
        }
        return Optional.empty();
    }

    public void onWarmupCompleted() {
        onNavigationEvent(1);
    }

    public void onNavigationEvent(int i) {
        for (int i2 = 0; i2 < i && IAuthTabCallbackDefault(); i2++) {
            int[] iArr = this.IAuthTabCallback;
            int i3 = this.access100;
            this.access100 = i3 + 1;
            int i4 = iArr[i3];
            asInterface(1);
            if (sya61.onWarmupCompleted.onExtraCallbackWithResult(i4) || (i4 == 13 && IAuthTabCallbackDefault() && this.IAuthTabCallback[this.access100] != 10)) {
                this.onTransact++;
                this.onExtraCallbackWithResult = 0;
            } else if (i4 != 65279) {
                this.onExtraCallbackWithResult++;
            }
        }
    }

    public int asBinder() {
        if (IAuthTabCallbackDefault()) {
            return this.IAuthTabCallback[this.access100];
        }
        return 0;
    }

    public int onExtraCallbackWithResult(int i) {
        if (IAuthTabCallbackDefault(i)) {
            return this.IAuthTabCallback[this.access100 + i];
        }
        return 0;
    }

    public String onExtraCallback(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        if (IAuthTabCallbackDefault(i)) {
            return new String(this.IAuthTabCallback, this.access100, i);
        }
        int[] iArr = this.IAuthTabCallback;
        int i2 = this.access100;
        return new String(iArr, i2, Math.min(i, this.onNavigationEvent - i2));
    }

    public String IAuthTabCallback(int i) {
        String strOnExtraCallback = onExtraCallback(i);
        this.access100 += i;
        asInterface(i);
        this.onExtraCallbackWithResult += i;
        return strOnExtraCallback;
    }

    private boolean IAuthTabCallbackDefault() {
        return IAuthTabCallbackDefault(0);
    }

    private boolean IAuthTabCallbackDefault(int i) throws IOException {
        if (!this.asBinder && this.access100 + i >= this.onNavigationEvent) {
            onTransact();
        }
        return this.access100 + i < this.onNavigationEvent;
    }

    private void onTransact() throws IOException {
        try {
            int i = this.IAuthTabCallbackStubProxy.read(this.onExtraCallback);
            if (i > 0) {
                int i2 = this.onNavigationEvent;
                int i3 = this.access100;
                int i4 = i2 - i3;
                this.IAuthTabCallback = Arrays.copyOfRange(this.IAuthTabCallback, i3, i2 + i);
                int i5 = i - 1;
                if (Character.isHighSurrogate(this.onExtraCallback[i5])) {
                    if (this.IAuthTabCallbackStubProxy.read(this.onExtraCallback, i, 1) == -1) {
                        throw new ReaderException(this.asInterface, this.IAuthTabCallbackDefault + i, this.onExtraCallback[i5], "The last char is HighSurrogate (no LowSurrogate detected).");
                    }
                    i++;
                }
                Optional optionalEmpty = Optional.empty();
                int iCharCount = 0;
                while (iCharCount < i) {
                    int iCodePointAt = Character.codePointAt(this.onExtraCallback, iCharCount);
                    this.IAuthTabCallback[i4] = iCodePointAt;
                    if (onWarmupCompleted(iCodePointAt)) {
                        iCharCount += Character.charCount(iCodePointAt);
                    } else {
                        optionalEmpty = Optional.of(Integer.valueOf(iCodePointAt));
                        iCharCount = i;
                    }
                    i4++;
                }
                this.onNavigationEvent = i4;
                this.access100 = 0;
                if (optionalEmpty.isPresent()) {
                    throw new ReaderException(this.asInterface, (this.IAuthTabCallbackDefault + i4) - 1, ((Integer) optionalEmpty.get()).intValue(), "special characters are not allowed");
                }
                return;
            }
            this.asBinder = true;
        } catch (IOException e) {
            throw new uh16(e);
        }
    }

    public int IAuthTabCallback() {
        return this.onExtraCallbackWithResult;
    }

    private void asInterface(int i) {
        this.IAuthTabCallbackDefault += i;
        this.IAuthTabCallbackStub += i;
    }

    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallbackStub;
    }

    public void asInterface() {
        this.IAuthTabCallbackStub = 0;
    }

    public int onExtraCallback() {
        return this.IAuthTabCallbackDefault;
    }

    public int onNavigationEvent() {
        return this.onTransact;
    }
}
