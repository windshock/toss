package o;

import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class vzs {
    public abstract boolean onExtraCallback(qgr qgrVar, qgr qgrVar2);

    protected vzs() {
    }

    public static final class newSessionWithExtras extends vzs {
        private final String onExtraCallbackWithResult;

        public newSessionWithExtras(String str) {
            this.onExtraCallbackWithResult = str;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onMinimized().equals(this.onExtraCallbackWithResult);
        }

        public String toString() {
            return String.format("%s", this.onExtraCallbackWithResult);
        }
    }

    public static final class newSession extends vzs {
        private final String IAuthTabCallback;

        public newSession(String str) {
            this.IAuthTabCallback = str;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onMinimized().endsWith(this.IAuthTabCallback);
        }

        public String toString() {
            return String.format("%s", this.IAuthTabCallback);
        }
    }

    public static final class writeTypedObject extends vzs {
        private final String onNavigationEvent;

        public writeTypedObject(String str) {
            this.onNavigationEvent = str;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return this.onNavigationEvent.equals(qgrVar2.onActivityResized());
        }

        public String toString() {
            return String.format("#%s", this.onNavigationEvent);
        }
    }

    public static final class IAuthTabCallbackStubProxy extends vzs {
        private final String onExtraCallback;

        public IAuthTabCallbackStubProxy(String str) {
            this.onExtraCallback = str;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onWarmupCompleted(this.onExtraCallback);
        }

        public String toString() {
            return String.format(".%s", this.onExtraCallback);
        }
    }

    public static final class onNavigationEvent extends vzs {
        private final String onNavigationEvent;

        public onNavigationEvent(String str) {
            this.onNavigationEvent = str;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onNavigationEvent);
        }

        public String toString() {
            return String.format("[%s]", this.onNavigationEvent);
        }
    }

    public static final class IAuthTabCallback extends vzs {
        private final String onWarmupCompleted;

        public IAuthTabCallback(String str) {
            oas.onExtraCallbackWithResult(str);
            this.onWarmupCompleted = oiz.onExtraCallbackWithResult(str);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            Iterator<oi> it = qgrVar2.access000().onWarmupCompleted().iterator();
            while (it.hasNext()) {
                if (oiz.onExtraCallbackWithResult(it.next().getKey()).startsWith(this.onWarmupCompleted)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.onWarmupCompleted);
        }
    }

    public static final class onWarmupCompleted extends onExtraCallbackWithResult {
        public onWarmupCompleted(String str, String str2) {
            super(str, str2);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onExtraCallbackWithResult) && this.onExtraCallback.equalsIgnoreCase(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }

    public static final class IAuthTabCallbackDefault extends onExtraCallbackWithResult {
        public IAuthTabCallbackDefault(String str, String str2) {
            super(str, str2);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return !this.onExtraCallback.equalsIgnoreCase(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }

    public static final class asInterface extends onExtraCallbackWithResult {
        public asInterface(String str, String str2) {
            super(str, str2, false);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onExtraCallbackWithResult) && oiz.onExtraCallbackWithResult(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult)).startsWith(this.onExtraCallback);
        }

        public String toString() {
            return String.format("[%s^=%s]", this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }

    public static final class IAuthTabCallbackStub extends onExtraCallbackWithResult {
        public IAuthTabCallbackStub(String str, String str2) {
            super(str, str2, false);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onExtraCallbackWithResult) && oiz.onExtraCallbackWithResult(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult)).endsWith(this.onExtraCallback);
        }

        public String toString() {
            return String.format("[%s$=%s]", this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }

    public static final class onTransact extends onExtraCallbackWithResult {
        public onTransact(String str, String str2) {
            super(str, str2);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onExtraCallbackWithResult) && oiz.onExtraCallbackWithResult(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult)).contains(this.onExtraCallback);
        }

        public String toString() {
            return String.format("[%s*=%s]", this.onExtraCallbackWithResult, this.onExtraCallback);
        }
    }

    public static final class asBinder extends vzs {
        String onExtraCallbackWithResult;
        Pattern onNavigationEvent;

        public asBinder(String str, Pattern pattern) {
            this.onExtraCallbackWithResult = oiz.onWarmupCompleted(str);
            this.onNavigationEvent = pattern;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.onExtraCallbackWithResult(this.onExtraCallbackWithResult) && this.onNavigationEvent.matcher(qgrVar2.onExtraCallback(this.onExtraCallbackWithResult)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", this.onExtraCallbackWithResult, this.onNavigationEvent.toString());
        }
    }

    public static abstract class onExtraCallbackWithResult extends vzs {
        String onExtraCallback;
        String onExtraCallbackWithResult;

        public onExtraCallbackWithResult(String str, String str2) {
            this(str, str2, true);
        }

        public onExtraCallbackWithResult(String str, String str2, boolean z) {
            oas.onExtraCallbackWithResult(str);
            oas.onExtraCallbackWithResult(str2);
            this.onExtraCallbackWithResult = oiz.onWarmupCompleted(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.onExtraCallback = z ? oiz.onWarmupCompleted(str2) : oiz.onNavigationEvent(str2, z2);
        }
    }

    public static final class onExtraCallback extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class readTypedObject extends ICustomTabsCallback {
        public readTypedObject(int i) {
            super(i);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar != qgrVar2 && qgrVar2.extraCallback() < this.onNavigationEvent;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.onNavigationEvent));
        }
    }

    public static final class extraCallbackWithResult extends ICustomTabsCallback {
        public extraCallbackWithResult(int i) {
            super(i);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.extraCallback() > this.onNavigationEvent;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.onNavigationEvent));
        }
    }

    public static final class extraCallback extends ICustomTabsCallback {
        public extraCallback(int i) {
            super(i);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.extraCallback() == this.onNavigationEvent;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.onNavigationEvent));
        }
    }

    public static final class onMinimized extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault();
            return (qgrVarICustomTabsCallbackDefault == null || (qgrVarICustomTabsCallbackDefault instanceof oq) || qgrVar2.extraCallback() != qgrVarICustomTabsCallbackDefault.getInterfaceDescriptor().size() - 1) ? false : true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class onMessageChannelReady extends onUnminimized {
        public onMessageChannelReady() {
            super(0, 1);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class onActivityResized extends ICustomTabsCallbackStub {
        public onActivityResized() {
            super(0, 1);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        public String toString() {
            return ":last-of-type";
        }
    }

    public static abstract class IAuthTabCallback_Parcel extends vzs {
        protected final int onExtraCallbackWithResult;
        protected final int onWarmupCompleted;

        protected abstract int onNavigationEvent(qgr qgrVar, qgr qgrVar2);

        protected abstract String onWarmupCompleted();

        public IAuthTabCallback_Parcel(int i, int i2) {
            this.onWarmupCompleted = i;
            this.onExtraCallbackWithResult = i2;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault();
            if (qgrVarICustomTabsCallbackDefault != null && !(qgrVarICustomTabsCallbackDefault instanceof oq)) {
                int iOnNavigationEvent = onNavigationEvent(qgrVar, qgrVar2);
                int i = this.onWarmupCompleted;
                if (i == 0) {
                    return iOnNavigationEvent == this.onExtraCallbackWithResult;
                }
                int i2 = iOnNavigationEvent - this.onExtraCallbackWithResult;
                if (i2 * i >= 0 && i2 % i == 0) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            if (this.onWarmupCompleted == 0) {
                return String.format(":%s(%d)", onWarmupCompleted(), Integer.valueOf(this.onExtraCallbackWithResult));
            }
            if (this.onExtraCallbackWithResult == 0) {
                return String.format(":%s(%dn)", onWarmupCompleted(), Integer.valueOf(this.onWarmupCompleted));
            }
            return String.format(":%s(%dn%+d)", onWarmupCompleted(), Integer.valueOf(this.onWarmupCompleted), Integer.valueOf(this.onExtraCallbackWithResult));
        }
    }

    public static final class ICustomTabsCallbackStubProxy extends IAuthTabCallback_Parcel {
        public ICustomTabsCallbackStubProxy(int i, int i2) {
            super(i, i2);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected int onNavigationEvent(qgr qgrVar, qgr qgrVar2) {
            return qgrVar2.extraCallback() + 1;
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected String onWarmupCompleted() {
            return "nth-child";
        }
    }

    public static final class onRelationshipValidationResult extends IAuthTabCallback_Parcel {
        public onRelationshipValidationResult(int i, int i2) {
            super(i, i2);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected int onNavigationEvent(qgr qgrVar, qgr qgrVar2) {
            if (qgrVar2.ICustomTabsCallbackDefault() == null) {
                return 0;
            }
            return qgrVar2.ICustomTabsCallbackDefault().getInterfaceDescriptor().size() - qgrVar2.extraCallback();
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected String onWarmupCompleted() {
            return "nth-last-child";
        }
    }

    public static class onUnminimized extends IAuthTabCallback_Parcel {
        public onUnminimized(int i, int i2) {
            super(i, i2);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected int onNavigationEvent(qgr qgrVar, qgr qgrVar2) {
            int i = 0;
            if (qgrVar2.ICustomTabsCallbackDefault() == null) {
                return 0;
            }
            Iterator<qgr> it = qgrVar2.ICustomTabsCallbackDefault().getInterfaceDescriptor().iterator();
            while (it.hasNext()) {
                qgr next = it.next();
                if (next.ICustomTabsCallback_Parcel().equals(qgrVar2.ICustomTabsCallback_Parcel())) {
                    i++;
                }
                if (next == qgrVar2) {
                    break;
                }
            }
            return i;
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected String onWarmupCompleted() {
            return "nth-of-type";
        }
    }

    public static class ICustomTabsCallbackStub extends IAuthTabCallback_Parcel {
        public ICustomTabsCallbackStub(int i, int i2) {
            super(i, i2);
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected int onNavigationEvent(qgr qgrVar, qgr qgrVar2) {
            int i = 0;
            if (qgrVar2.ICustomTabsCallbackDefault() == null) {
                return 0;
            }
            vd interfaceDescriptor = qgrVar2.ICustomTabsCallbackDefault().getInterfaceDescriptor();
            for (int iExtraCallback = qgrVar2.extraCallback(); iExtraCallback < interfaceDescriptor.size(); iExtraCallback++) {
                if (interfaceDescriptor.get(iExtraCallback).ICustomTabsCallback_Parcel().equals(qgrVar2.ICustomTabsCallback_Parcel())) {
                    i++;
                }
            }
            return i;
        }

        @Override // o.vzs.IAuthTabCallback_Parcel
        protected String onWarmupCompleted() {
            return "nth-last-of-type";
        }
    }

    public static final class onActivityLayout extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault();
            return (qgrVarICustomTabsCallbackDefault == null || (qgrVarICustomTabsCallbackDefault instanceof oq) || qgrVar2.extraCallback() != 0) ? false : true;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class ICustomTabsCallback_Parcel extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            if (qgrVar instanceof oq) {
                qgrVar = qgrVar.onNavigationEvent(0);
            }
            return qgrVar2 == qgrVar;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class ICustomTabsCallbackDefault extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault();
            return (qgrVarICustomTabsCallbackDefault == null || (qgrVarICustomTabsCallbackDefault instanceof oq) || !qgrVar2.extraCommand().isEmpty()) ? false : true;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class extraCommand extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            qgr qgrVarICustomTabsCallbackDefault = qgrVar2.ICustomTabsCallbackDefault();
            if (qgrVarICustomTabsCallbackDefault != null && !(qgrVarICustomTabsCallbackDefault instanceof oq)) {
                Iterator<qgr> it = qgrVarICustomTabsCallbackDefault.getInterfaceDescriptor().iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (it.next().ICustomTabsCallback_Parcel().equals(qgrVar2.ICustomTabsCallback_Parcel())) {
                        i++;
                    }
                }
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class onPostMessage extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            for (qq qqVar : qgrVar2.newSession()) {
                if (!(qqVar instanceof pks) && !(qqVar instanceof rt) && !(qqVar instanceof qh)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static abstract class ICustomTabsCallback extends vzs {
        int onNavigationEvent;

        public ICustomTabsCallback(int i) {
            this.onNavigationEvent = i;
        }
    }

    public static final class access000 extends vzs {
        private final String IAuthTabCallback;

        public access000(String str) {
            this.IAuthTabCallback = oiz.onExtraCallbackWithResult(nfe.onWarmupCompleted(str));
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return oiz.onExtraCallbackWithResult(qgrVar2.ICustomTabsService()).contains(this.IAuthTabCallback);
        }

        public String toString() {
            return String.format(":contains(%s)", this.IAuthTabCallback);
        }
    }

    public static final class access100 extends vzs {
        private final String onNavigationEvent;

        public access100(String str) {
            this.onNavigationEvent = oiz.onExtraCallbackWithResult(str);
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return oiz.onExtraCallbackWithResult(qgrVar2.writeTypedObject()).contains(this.onNavigationEvent);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.onNavigationEvent);
        }
    }

    public static final class getInterfaceDescriptor extends vzs {
        private final String onWarmupCompleted;

        public getInterfaceDescriptor(String str) {
            this.onWarmupCompleted = oiz.onExtraCallbackWithResult(nfe.onWarmupCompleted(str));
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return oiz.onExtraCallbackWithResult(qgrVar2.ICustomTabsCallbackStub()).contains(this.onWarmupCompleted);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.onWarmupCompleted);
        }
    }

    public static final class mayLaunchUrl extends vzs {
        private final Pattern onNavigationEvent;

        public mayLaunchUrl(Pattern pattern) {
            this.onNavigationEvent = pattern;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return this.onNavigationEvent.matcher(qgrVar2.ICustomTabsService()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.onNavigationEvent);
        }
    }

    public static final class isEngagementSignalsApiAvailable extends vzs {
        private final Pattern IAuthTabCallback;

        public isEngagementSignalsApiAvailable(Pattern pattern) {
            this.IAuthTabCallback = pattern;
        }

        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            return this.IAuthTabCallback.matcher(qgrVar2.ICustomTabsCallbackStub()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.IAuthTabCallback);
        }
    }

    public static final class ICustomTabsService extends vzs {
        @Override // o.vzs
        public boolean onExtraCallback(qgr qgrVar, qgr qgrVar2) {
            if (qgrVar2 instanceof qu) {
                return true;
            }
            for (qkm qkmVar : qgrVar2.newAuthTabSession()) {
                qu quVar = new qu(sl.onExtraCallbackWithResult(qgrVar2.mayLaunchUrl()), qgrVar2.IAuthTabCallback(), qgrVar2.access000());
                qkmVar.IAuthTabCallbackStub(quVar);
                quVar.onExtraCallback(qkmVar);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }
}
