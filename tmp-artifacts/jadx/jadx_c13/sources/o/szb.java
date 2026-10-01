package o;

import javax.annotation.Nullable;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
abstract class szb {
    onTransact onExtraCallbackWithResult;

    public enum onTransact {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    abstract szb access100();

    private szb() {
    }

    String IAuthTabCallback_Parcel() {
        return getClass().getSimpleName();
    }

    static void IAuthTabCallback(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    static final class onNavigationEvent extends szb {
        boolean IAuthTabCallback;
        final StringBuilder asInterface;
        String onExtraCallback;
        final StringBuilder onNavigationEvent;
        final StringBuilder onWarmupCompleted;

        onNavigationEvent() {
            super();
            this.onNavigationEvent = new StringBuilder();
            this.onExtraCallback = null;
            this.onWarmupCompleted = new StringBuilder();
            this.asInterface = new StringBuilder();
            this.IAuthTabCallback = false;
            this.onExtraCallbackWithResult = onTransact.Doctype;
        }

        @Override // o.szb
        szb access100() {
            szb.IAuthTabCallback(this.onNavigationEvent);
            this.onExtraCallback = null;
            szb.IAuthTabCallback(this.onWarmupCompleted);
            szb.IAuthTabCallback(this.asInterface);
            this.IAuthTabCallback = false;
            return this;
        }

        String access000() {
            return this.onNavigationEvent.toString();
        }

        String readTypedObject() {
            return this.onExtraCallback;
        }

        String extraCallbackWithResult() {
            return this.onWarmupCompleted.toString();
        }

        public String ICustomTabsCallback() {
            return this.asInterface.toString();
        }

        public boolean extraCallback() {
            return this.IAuthTabCallback;
        }

        public String toString() {
            return "<!doctype " + access000() + ">";
        }
    }

    static abstract class IAuthTabCallbackStub extends szb {

        @Nullable
        protected String IAuthTabCallback;
        private final StringBuilder IAuthTabCallbackDefault;
        private final StringBuilder IAuthTabCallbackStub;
        private boolean access000;

        @Nullable
        private String asBinder;
        private boolean asInterface;
        private boolean getInterfaceDescriptor;

        @Nullable
        om onExtraCallback;

        @Nullable
        protected String onNavigationEvent;

        @Nullable
        private String onTransact;
        boolean onWarmupCompleted;

        IAuthTabCallbackStub() {
            super();
            this.IAuthTabCallbackDefault = new StringBuilder();
            this.asInterface = false;
            this.IAuthTabCallbackStub = new StringBuilder();
            this.getInterfaceDescriptor = false;
            this.access000 = false;
            this.onWarmupCompleted = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.szb
        /* renamed from: access000, reason: merged with bridge method [inline-methods] */
        public IAuthTabCallbackStub access100() {
            this.onNavigationEvent = null;
            this.IAuthTabCallback = null;
            szb.IAuthTabCallback(this.IAuthTabCallbackDefault);
            this.asBinder = null;
            this.asInterface = false;
            szb.IAuthTabCallback(this.IAuthTabCallbackStub);
            this.onTransact = null;
            this.access000 = false;
            this.getInterfaceDescriptor = false;
            this.onWarmupCompleted = false;
            this.onExtraCallback = null;
            return this;
        }

        final void extraCallbackWithResult() {
            String string;
            if (this.onExtraCallback == null) {
                this.onExtraCallback = new om();
            }
            if (this.asInterface && this.onExtraCallback.asInterface() < 512) {
                String strTrim = (this.IAuthTabCallbackDefault.length() > 0 ? this.IAuthTabCallbackDefault.toString() : this.asBinder).trim();
                if (strTrim.length() > 0) {
                    if (this.getInterfaceDescriptor) {
                        string = this.IAuthTabCallbackStub.length() > 0 ? this.IAuthTabCallbackStub.toString() : this.onTransact;
                    } else {
                        string = this.access000 ? _UrlKt.FRAGMENT_ENCODE_SET : null;
                    }
                    this.onExtraCallback.onWarmupCompleted(strTrim, string);
                }
            }
            szb.IAuthTabCallback(this.IAuthTabCallbackDefault);
            this.asBinder = null;
            this.asInterface = false;
            szb.IAuthTabCallback(this.IAuthTabCallbackStub);
            this.onTransact = null;
            this.getInterfaceDescriptor = false;
            this.access000 = false;
        }

        final boolean extraCallback() {
            return this.onExtraCallback != null;
        }

        final boolean onExtraCallbackWithResult(String str) {
            om omVar = this.onExtraCallback;
            return omVar != null && omVar.onExtraCallbackWithResult(str);
        }

        final void readTypedObject() {
            if (this.asInterface) {
                extraCallbackWithResult();
            }
        }

        final String ICustomTabsCallback() {
            String str = this.onNavigationEvent;
            oas.IAuthTabCallback(str == null || str.length() == 0);
            return this.onNavigationEvent;
        }

        final String onActivityLayout() {
            return this.IAuthTabCallback;
        }

        final String onActivityResized() {
            String str = this.onNavigationEvent;
            return str != null ? str : "[unset]";
        }

        final IAuthTabCallbackStub onWarmupCompleted(String str) {
            this.onNavigationEvent = str;
            this.IAuthTabCallback = sjd.onNavigationEvent(str);
            return this;
        }

        final boolean writeTypedObject() {
            return this.onWarmupCompleted;
        }

        final void onExtraCallback(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            String str2 = this.onNavigationEvent;
            if (str2 != null) {
                strReplace = str2.concat(strReplace);
            }
            this.onNavigationEvent = strReplace;
            this.IAuthTabCallback = sjd.onNavigationEvent(strReplace);
        }

        final void onNavigationEvent(char c) {
            onExtraCallback(String.valueOf(c));
        }

        final void onNavigationEvent(String str) {
            String strReplace = str.replace((char) 0, (char) 65533);
            onPostMessage();
            if (this.IAuthTabCallbackDefault.length() == 0) {
                this.asBinder = strReplace;
            } else {
                this.IAuthTabCallbackDefault.append(strReplace);
            }
        }

        final void onWarmupCompleted(char c) {
            onPostMessage();
            this.IAuthTabCallbackDefault.append(c);
        }

        final void IAuthTabCallback(String str) {
            onMessageChannelReady();
            if (this.IAuthTabCallbackStub.length() == 0) {
                this.onTransact = str;
            } else {
                this.IAuthTabCallbackStub.append(str);
            }
        }

        final void onExtraCallback(char c) {
            onMessageChannelReady();
            this.IAuthTabCallbackStub.append(c);
        }

        final void onWarmupCompleted(int[] iArr) {
            onMessageChannelReady();
            for (int i : iArr) {
                this.IAuthTabCallbackStub.appendCodePoint(i);
            }
        }

        final void onMinimized() {
            this.access000 = true;
        }

        private void onPostMessage() {
            this.asInterface = true;
            String str = this.asBinder;
            if (str != null) {
                this.IAuthTabCallbackDefault.append(str);
                this.asBinder = null;
            }
        }

        private void onMessageChannelReady() {
            this.getInterfaceDescriptor = true;
            String str = this.onTransact;
            if (str != null) {
                this.IAuthTabCallbackStub.append(str);
                this.onTransact = null;
            }
        }
    }

    static final class asBinder extends IAuthTabCallbackStub {
        asBinder() {
            this.onExtraCallbackWithResult = onTransact.StartTag;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.szb.IAuthTabCallbackStub, o.szb
        /* renamed from: access000 */
        public IAuthTabCallbackStub access100() {
            super.access100();
            this.onExtraCallback = null;
            return this;
        }

        asBinder IAuthTabCallback(String str, om omVar) {
            this.onNavigationEvent = str;
            this.onExtraCallback = omVar;
            this.IAuthTabCallback = sjd.onNavigationEvent(str);
            return this;
        }

        public String toString() {
            if (extraCallback() && this.onExtraCallback.asInterface() > 0) {
                return "<" + onActivityResized() + " " + this.onExtraCallback.toString() + ">";
            }
            return "<" + onActivityResized() + ">";
        }
    }

    static final class IAuthTabCallbackDefault extends IAuthTabCallbackStub {
        IAuthTabCallbackDefault() {
            this.onExtraCallbackWithResult = onTransact.EndTag;
        }

        public String toString() {
            return "</" + onActivityResized() + ">";
        }
    }

    static final class onExtraCallbackWithResult extends szb {
        private final StringBuilder IAuthTabCallback;
        private String onExtraCallback;
        boolean onWarmupCompleted;

        @Override // o.szb
        szb access100() {
            szb.IAuthTabCallback(this.IAuthTabCallback);
            this.onExtraCallback = null;
            this.onWarmupCompleted = false;
            return this;
        }

        onExtraCallbackWithResult() {
            super();
            this.IAuthTabCallback = new StringBuilder();
            this.onWarmupCompleted = false;
            this.onExtraCallbackWithResult = onTransact.Comment;
        }

        String access000() {
            String str = this.onExtraCallback;
            return str != null ? str : this.IAuthTabCallback.toString();
        }

        final onExtraCallbackWithResult onExtraCallbackWithResult(String str) {
            readTypedObject();
            if (this.IAuthTabCallback.length() == 0) {
                this.onExtraCallback = str;
                return this;
            }
            this.IAuthTabCallback.append(str);
            return this;
        }

        final onExtraCallbackWithResult onExtraCallbackWithResult(char c) {
            readTypedObject();
            this.IAuthTabCallback.append(c);
            return this;
        }

        private void readTypedObject() {
            String str = this.onExtraCallback;
            if (str != null) {
                this.IAuthTabCallback.append(str);
                this.onExtraCallback = null;
            }
        }

        public String toString() {
            return "<!--" + access000() + "-->";
        }
    }

    static class onExtraCallback extends szb {
        private String onWarmupCompleted;

        onExtraCallback() {
            super();
            this.onExtraCallbackWithResult = onTransact.Character;
        }

        @Override // o.szb
        szb access100() {
            this.onWarmupCompleted = null;
            return this;
        }

        onExtraCallback onWarmupCompleted(String str) {
            this.onWarmupCompleted = str;
            return this;
        }

        String access000() {
            return this.onWarmupCompleted;
        }

        public String toString() {
            return access000();
        }
    }

    static final class IAuthTabCallback extends onExtraCallback {
        IAuthTabCallback(String str) {
            onWarmupCompleted(str);
        }

        @Override // o.szb.onExtraCallback
        public String toString() {
            return "<![CDATA[" + access000() + "]]>";
        }
    }

    static final class onWarmupCompleted extends szb {
        @Override // o.szb
        szb access100() {
            return this;
        }

        onWarmupCompleted() {
            super();
            this.onExtraCallbackWithResult = onTransact.EOF;
        }

        public String toString() {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
    }

    final boolean asInterface() {
        return this.onExtraCallbackWithResult == onTransact.Doctype;
    }

    final onNavigationEvent onExtraCallbackWithResult() {
        return (onNavigationEvent) this;
    }

    final boolean IAuthTabCallbackStubProxy() {
        return this.onExtraCallbackWithResult == onTransact.StartTag;
    }

    final asBinder onNavigationEvent() {
        return (asBinder) this;
    }

    final boolean getInterfaceDescriptor() {
        return this.onExtraCallbackWithResult == onTransact.EndTag;
    }

    final IAuthTabCallbackDefault IAuthTabCallback() {
        return (IAuthTabCallbackDefault) this;
    }

    final boolean IAuthTabCallbackStub() {
        return this.onExtraCallbackWithResult == onTransact.Comment;
    }

    final onExtraCallbackWithResult onWarmupCompleted() {
        return (onExtraCallbackWithResult) this;
    }

    final boolean IAuthTabCallbackDefault() {
        return this.onExtraCallbackWithResult == onTransact.Character;
    }

    final boolean onTransact() {
        return this instanceof IAuthTabCallback;
    }

    final onExtraCallback onExtraCallback() {
        return (onExtraCallback) this;
    }

    final boolean asBinder() {
        return this.onExtraCallbackWithResult == onTransact.EOF;
    }
}
