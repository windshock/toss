package o;

import java.util.Map;
import java.util.TimeZone;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class UST_TRANS_Finalize {
    private onExtraCallback onTransact = onExtraCallback.PLAIN;
    private onExtraCallbackWithResult IAuthTabCallbackStub = onExtraCallbackWithResult.AUTO;
    private boolean onWarmupCompleted = false;
    private boolean onExtraCallback = true;
    private boolean onNavigationEvent = false;
    private int access100 = 2;
    private int IAuthTabCallback_Parcel = 0;
    private boolean getInterfaceDescriptor = false;
    private int onExtraCallbackWithResult = 80;
    private boolean extraCallbackWithResult = true;
    private onNavigationEvent IAuthTabCallbackStubProxy = onNavigationEvent.UNIX;
    private boolean asInterface = false;
    private boolean asBinder = false;
    private TimeZone onMessageChannelReady = null;
    private int access000 = 128;
    private boolean readTypedObject = false;
    private IAuthTabCallback writeTypedObject = IAuthTabCallback.BINARY;
    private onWarmupCompleted onPostMessage = null;
    private Map<String, String> ICustomTabsCallback = null;
    private Boolean extraCallback = Boolean.FALSE;
    private getCertValidityNotAfter IAuthTabCallback = new getCertValidityNotBefore(0);
    private boolean IAuthTabCallbackDefault = false;

    public enum IAuthTabCallback {
        BINARY,
        ESCAPE
    }

    public enum onExtraCallback {
        DOUBLE_QUOTED('\"'),
        SINGLE_QUOTED('\''),
        LITERAL('|'),
        FOLDED('>'),
        JSON_SCALAR_STYLE('J'),
        PLAIN(null);

        private final Character styleChar;

        onExtraCallback(Character ch) {
            this.styleChar = ch;
        }

        public Character getChar() {
            return this.styleChar;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Scalar style: '" + this.styleChar + "'";
        }

        public static onExtraCallback createStyle(Character ch) {
            if (ch == null) {
                return PLAIN;
            }
            char cCharValue = ch.charValue();
            if (cCharValue == '\"') {
                return DOUBLE_QUOTED;
            }
            if (cCharValue == '\'') {
                return SINGLE_QUOTED;
            }
            if (cCharValue == '>') {
                return FOLDED;
            }
            if (cCharValue == '|') {
                return LITERAL;
            }
            throw new UST_TRANS_V2_Init("Unknown scalar style character: " + ch);
        }
    }

    public enum onExtraCallbackWithResult {
        FLOW(Boolean.TRUE),
        BLOCK(Boolean.FALSE),
        AUTO(null);

        private final Boolean styleBoolean;

        onExtraCallbackWithResult(Boolean bool) {
            this.styleBoolean = bool;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Flow style: '" + this.styleBoolean + "'";
        }
    }

    public enum onNavigationEvent {
        WIN("\r\n"),
        MAC("\r"),
        UNIX("\n");

        private final String lineBreak;

        onNavigationEvent(String str) {
            this.lineBreak = str;
        }

        public String getString() {
            return this.lineBreak;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Line break: " + name();
        }

        public static onNavigationEvent getPlatformLineBreak() {
            String property = System.getProperty("line.separator");
            for (onNavigationEvent onnavigationevent : values()) {
                if (onnavigationevent.lineBreak.equals(property)) {
                    return onnavigationevent;
                }
            }
            return UNIX;
        }
    }

    public enum onWarmupCompleted {
        V1_0(new Integer[]{1, 0}),
        V1_1(new Integer[]{1, 1});

        private final Integer[] version;

        onWarmupCompleted(Integer[] numArr) {
            this.version = numArr;
        }

        public int major() {
            return this.version[0].intValue();
        }

        public int minor() {
            return this.version[1].intValue();
        }

        public String getRepresentation() {
            return this.version[0] + onVideoError.onExtraCallbackWithResult + this.version[1];
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Version: " + getRepresentation();
        }
    }

    public boolean IAuthTabCallbackStub() {
        return this.onExtraCallback;
    }

    public void IAuthTabCallback(int i) {
        if (i <= 0) {
            throw new UST_TRANS_V2_Init("Indent must be at least 1");
        }
        if (i > 10) {
            throw new UST_TRANS_V2_Init("Indent must be at most 10");
        }
        this.access100 = i;
    }

    public int onNavigationEvent() {
        return this.access100;
    }

    public void onWarmupCompleted(int i) {
        if (i < 0) {
            throw new UST_TRANS_V2_Init("Indicator indent must be non-negative.");
        }
        if (i > 9) {
            throw new UST_TRANS_V2_Init("Indicator indent must be at most Emitter.MAX_INDENT-1: 9");
        }
        this.IAuthTabCallback_Parcel = i;
    }

    public int IAuthTabCallback() {
        return this.IAuthTabCallback_Parcel;
    }

    public boolean onExtraCallbackWithResult() {
        return this.getInterfaceDescriptor;
    }

    public void IAuthTabCallback(boolean z) {
        this.getInterfaceDescriptor = z;
    }

    public onWarmupCompleted asBinder() {
        return this.onPostMessage;
    }

    public void onWarmupCompleted(boolean z) {
        this.onWarmupCompleted = z;
    }

    public boolean access100() {
        return this.onWarmupCompleted;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.extraCallback.booleanValue();
    }

    public int asInterface() {
        return this.onExtraCallbackWithResult;
    }

    public void onExtraCallbackWithResult(boolean z) {
        this.extraCallbackWithResult = z;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.extraCallbackWithResult;
    }

    public onNavigationEvent onExtraCallback() {
        return this.IAuthTabCallbackStubProxy;
    }

    public void onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
        if (onextracallbackwithresult == null) {
            throw new NullPointerException("Use FlowStyle enum.");
        }
        this.IAuthTabCallbackStub = onextracallbackwithresult;
    }

    public onExtraCallbackWithResult onWarmupCompleted() {
        return this.IAuthTabCallbackStub;
    }

    public void onNavigationEvent(onNavigationEvent onnavigationevent) {
        if (onnavigationevent == null) {
            throw new NullPointerException("Specify line break.");
        }
        this.IAuthTabCallbackStubProxy = onnavigationevent;
    }

    public int onTransact() {
        return this.access000;
    }

    public void onNavigationEvent(int i) {
        if (i > 1024) {
            throw new UST_TRANS_V2_Init("The simple key must not span more than 1024 stream characters. See https://yaml.org/spec/1.1/#id934537");
        }
        this.access000 = i;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.readTypedObject;
    }
}
