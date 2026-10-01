package o;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.oq;
import okhttp3.internal.url._UrlKt;
import ua.naiksoftware.stomp.dto.StompHeader;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public class qgr extends qq {
    private sl IAuthTabCallbackStub;

    @Nullable
    private WeakReference<List<qgr>> asBinder;

    @Nullable
    private om asInterface;
    List<qq> onWarmupCompleted;
    private static final List<qgr> IAuthTabCallbackDefault = Collections.EMPTY_LIST;
    private static final Pattern onTransact = Pattern.compile("\\s+");
    private static final String onExtraCallbackWithResult = om.onWarmupCompleted("baseUri");

    public qgr(sl slVar, @Nullable String str, @Nullable om omVar) {
        oas.onExtraCallback(slVar);
        this.onWarmupCompleted = qq.onExtraCallback;
        this.asInterface = omVar;
        this.IAuthTabCallbackStub = slVar;
        if (str != null) {
            asBinder(str);
        }
    }

    public qgr(sl slVar, @Nullable String str) {
        this(slVar, str, null);
    }

    @Override // o.qq
    protected List<qq> extraCallbackWithResult() {
        if (this.onWarmupCompleted == qq.onExtraCallback) {
            this.onWarmupCompleted = new onWarmupCompleted(this, 4);
        }
        return this.onWarmupCompleted;
    }

    @Override // o.qq
    protected boolean readTypedObject() {
        return this.asInterface != null;
    }

    @Override // o.qq
    public om access000() {
        if (this.asInterface == null) {
            this.asInterface = new om();
        }
        return this.asInterface;
    }

    @Override // o.qq
    public String IAuthTabCallback() {
        return onNavigationEvent(this, onExtraCallbackWithResult);
    }

    private static String onNavigationEvent(qgr qgrVar, String str) {
        while (qgrVar != null) {
            om omVar = qgrVar.asInterface;
            if (omVar != null && omVar.onExtraCallbackWithResult(str)) {
                return qgrVar.asInterface.onExtraCallback(str);
            }
            qgrVar = qgrVar.ICustomTabsCallbackDefault();
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.qq
    protected void c_(String str) {
        access000().onExtraCallbackWithResult(onExtraCallbackWithResult, str);
    }

    @Override // o.qq
    public int cz_() {
        return this.onWarmupCompleted.size();
    }

    @Override // o.qq
    public String onNavigationEvent() {
        return this.IAuthTabCallbackStub.onExtraCallback();
    }

    public String mayLaunchUrl() {
        return this.IAuthTabCallbackStub.onExtraCallback();
    }

    public String onMinimized() {
        return this.IAuthTabCallbackStub.onTransact();
    }

    public sl ICustomTabsCallback_Parcel() {
        return this.IAuthTabCallbackStub;
    }

    public boolean onPostMessage() {
        return this.IAuthTabCallbackStub.onWarmupCompleted();
    }

    public String onActivityResized() {
        om omVar = this.asInterface;
        return omVar != null ? omVar.onNavigationEvent(StompHeader.ID) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // o.qq
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public qgr onNavigationEvent(String str, String str2) {
        super.onNavigationEvent(str, str2);
        return this;
    }

    @Override // o.qq
    @Nullable
    /* renamed from: ICustomTabsCallbackStubProxy, reason: merged with bridge method [inline-methods] */
    public final qgr ICustomTabsCallbackDefault() {
        return (qgr) this.IAuthTabCallback;
    }

    public qgr onNavigationEvent(int i) {
        return IAuthTabCallbackStubProxy().get(i);
    }

    public vd getInterfaceDescriptor() {
        return new vd(IAuthTabCallbackStubProxy());
    }

    List<qgr> IAuthTabCallbackStubProxy() {
        List<qgr> list;
        if (cz_() == 0) {
            return IAuthTabCallbackDefault;
        }
        WeakReference<List<qgr>> weakReference = this.asBinder;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.onWarmupCompleted.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            qq qqVar = this.onWarmupCompleted.get(i);
            if (qqVar instanceof qgr) {
                arrayList.add((qgr) qqVar);
            }
        }
        this.asBinder = new WeakReference<>(arrayList);
        return arrayList;
    }

    @Override // o.qq
    void onMessageChannelReady() {
        super.onMessageChannelReady();
        this.asBinder = null;
    }

    public List<qkm> newAuthTabSession() {
        ArrayList arrayList = new ArrayList();
        for (qq qqVar : this.onWarmupCompleted) {
            if (qqVar instanceof qkm) {
                arrayList.add((qkm) qqVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public qgr IAuthTabCallbackDefault(String str) {
        return xh.IAuthTabCallback(str, this);
    }

    public qgr onExtraCallback(qq qqVar) {
        oas.onExtraCallback(qqVar);
        IAuthTabCallbackDefault(qqVar);
        extraCallbackWithResult();
        this.onWarmupCompleted.add(qqVar);
        qqVar.onWarmupCompleted(this.onWarmupCompleted.size() - 1);
        return this;
    }

    public qgr onWarmupCompleted(Collection<? extends qq> collection) {
        onWarmupCompleted(-1, collection);
        return this;
    }

    public qgr onWarmupCompleted(int i, Collection<? extends qq> collection) {
        oas.onNavigationEvent(collection, "Children collection to be inserted must not be null.");
        int iCz_ = cz_();
        if (i < 0) {
            i += iCz_ + 1;
        }
        oas.onExtraCallback(i >= 0 && i <= iCz_, "Insert position out of bounds.");
        onNavigationEvent(i, (qq[]) new ArrayList(collection).toArray(new qq[0]));
        return this;
    }

    @Override // o.qq
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public qgr IAuthTabCallback(qq qqVar) {
        return (qgr) super.IAuthTabCallback(qqVar);
    }

    @Override // o.qq
    /* renamed from: ICustomTabsCallback, reason: merged with bridge method [inline-methods] */
    public qgr asBinder() {
        this.onWarmupCompleted.clear();
        return this;
    }

    public vd extraCommand() {
        if (this.IAuthTabCallback == null) {
            return new vd(0);
        }
        List<qgr> listIAuthTabCallbackStubProxy = ICustomTabsCallbackDefault().IAuthTabCallbackStubProxy();
        vd vdVar = new vd(listIAuthTabCallbackStubProxy.size() - 1);
        for (qgr qgrVar : listIAuthTabCallbackStubProxy) {
            if (qgrVar != this) {
                vdVar.add(qgrVar);
            }
        }
        return vdVar;
    }

    @Nullable
    public qgr onRelationshipValidationResult() {
        List<qgr> listIAuthTabCallbackStubProxy;
        int iIAuthTabCallback;
        if (this.IAuthTabCallback != null && (iIAuthTabCallback = IAuthTabCallback(this, (listIAuthTabCallbackStubProxy = ICustomTabsCallbackDefault().IAuthTabCallbackStubProxy()))) > 0) {
            return listIAuthTabCallbackStubProxy.get(iIAuthTabCallback - 1);
        }
        return null;
    }

    public int extraCallback() {
        if (ICustomTabsCallbackDefault() == null) {
            return 0;
        }
        return IAuthTabCallback(this, ICustomTabsCallbackDefault().IAuthTabCallbackStubProxy());
    }

    private static <E extends qgr> int IAuthTabCallback(qgr qgrVar, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == qgrVar) {
                return i;
            }
        }
        return 0;
    }

    public String ICustomTabsService() {
        final StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        vb.IAuthTabCallback(new wnd() { // from class: o.qgr.1
            @Override // o.wnd
            public void onNavigationEvent(qq qqVar, int i) {
                if (qqVar instanceof qkm) {
                    qgr.IAuthTabCallback(sbIAuthTabCallback, (qkm) qqVar);
                } else if (qqVar instanceof qgr) {
                    qgr qgrVar = (qgr) qqVar;
                    if (sbIAuthTabCallback.length() > 0) {
                        if ((qgrVar.onPostMessage() || qgrVar.IAuthTabCallbackStub.onTransact().equals("br")) && !qkm.onNavigationEvent(sbIAuthTabCallback)) {
                            sbIAuthTabCallback.append(' ');
                        }
                    }
                }
            }

            @Override // o.wnd
            public void onExtraCallbackWithResult(qq qqVar, int i) {
                if ((qqVar instanceof qgr) && ((qgr) qqVar).onPostMessage() && (qqVar.receiveFile() instanceof qkm) && !qkm.onNavigationEvent(sbIAuthTabCallback)) {
                    sbIAuthTabCallback.append(' ');
                }
            }
        }, this);
        return nfe.onExtraCallback(sbIAuthTabCallback).trim();
    }

    public String newSessionWithExtras() {
        final StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        vb.IAuthTabCallback(new wnd() { // from class: o.qgr.3
            @Override // o.wnd
            public void onExtraCallbackWithResult(qq qqVar, int i) {
            }

            @Override // o.wnd
            public void onNavigationEvent(qq qqVar, int i) {
                if (qqVar instanceof qkm) {
                    sbIAuthTabCallback.append(((qkm) qqVar).IAuthTabCallbackDefault());
                }
            }
        }, this);
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    public String ICustomTabsCallbackStub() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        onExtraCallback(sbIAuthTabCallback);
        return nfe.onExtraCallback(sbIAuthTabCallback).trim();
    }

    private void onExtraCallback(StringBuilder sb) {
        for (int i = 0; i < cz_(); i++) {
            qq qqVar = this.onWarmupCompleted.get(i);
            if (qqVar instanceof qkm) {
                IAuthTabCallback(sb, (qkm) qqVar);
            } else if (qqVar instanceof qgr) {
                onExtraCallbackWithResult((qgr) qqVar, sb);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void IAuthTabCallback(StringBuilder sb, qkm qkmVar) {
        String strIAuthTabCallbackDefault = qkmVar.IAuthTabCallbackDefault();
        if (onNavigationEvent(qkmVar.IAuthTabCallback) || (qkmVar instanceof pk)) {
            sb.append(strIAuthTabCallbackDefault);
        } else {
            nfe.onExtraCallback(sb, strIAuthTabCallbackDefault, qkm.onNavigationEvent(sb));
        }
    }

    private static void onExtraCallbackWithResult(qgr qgrVar, StringBuilder sb) {
        if (!qgrVar.IAuthTabCallbackStub.onTransact().equals("br") || qkm.onNavigationEvent(sb)) {
            return;
        }
        sb.append(" ");
    }

    static boolean onNavigationEvent(@Nullable qq qqVar) {
        if (qqVar instanceof qgr) {
            qgr qgrVarICustomTabsCallbackDefault = (qgr) qqVar;
            int i = 0;
            while (!qgrVarICustomTabsCallbackDefault.IAuthTabCallbackStub.getInterfaceDescriptor()) {
                qgrVarICustomTabsCallbackDefault = qgrVarICustomTabsCallbackDefault.ICustomTabsCallbackDefault();
                i++;
                if (i >= 6 || qgrVarICustomTabsCallbackDefault == null) {
                }
            }
            return true;
        }
        return false;
    }

    public String writeTypedObject() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        for (qq qqVar : this.onWarmupCompleted) {
            if (qqVar instanceof pj) {
                sbIAuthTabCallback.append(((pj) qqVar).onTransact());
            } else if (qqVar instanceof pks) {
                sbIAuthTabCallback.append(((pks) qqVar).IAuthTabCallbackDefault());
            } else if (qqVar instanceof qgr) {
                sbIAuthTabCallback.append(((qgr) qqVar).writeTypedObject());
            } else if (qqVar instanceof pk) {
                sbIAuthTabCallback.append(((pk) qqVar).IAuthTabCallbackDefault());
            }
        }
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    public boolean onWarmupCompleted(String str) {
        om omVar = this.asInterface;
        if (omVar == null) {
            return false;
        }
        String strOnNavigationEvent = omVar.onNavigationEvent("class");
        int length = strOnNavigationEvent.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strOnNavigationEvent);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strOnNavigationEvent.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strOnNavigationEvent.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strOnNavigationEvent.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    @Override // o.qq
    void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        if (onextracallback.onTransact() && onWarmupCompleted(onextracallback) && !onExtraCallback(onextracallback) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            onExtraCallbackWithResult(appendable, i, onextracallback);
        }
        appendable.append('<').append(mayLaunchUrl());
        om omVar = this.asInterface;
        if (omVar != null) {
            omVar.onNavigationEvent(appendable, onextracallback);
        }
        if (this.onWarmupCompleted.isEmpty() && this.IAuthTabCallbackStub.asInterface()) {
            if (onextracallback.IAuthTabCallbackDefault() == oq.onExtraCallback.IAuthTabCallback.html && this.IAuthTabCallbackStub.onNavigationEvent()) {
                appendable.append('>');
                return;
            } else {
                appendable.append(" />");
                return;
            }
        }
        appendable.append('>');
    }

    @Override // o.qq
    void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        if (this.onWarmupCompleted.isEmpty() && this.IAuthTabCallbackStub.asInterface()) {
            return;
        }
        if (onextracallback.onTransact() && !this.onWarmupCompleted.isEmpty() && (this.IAuthTabCallbackStub.IAuthTabCallback() || (onextracallback.IAuthTabCallback() && (this.onWarmupCompleted.size() > 1 || (this.onWarmupCompleted.size() == 1 && !(this.onWarmupCompleted.get(0) instanceof qkm)))))) {
            onExtraCallbackWithResult(appendable, i, onextracallback);
        }
        appendable.append("</").append(mayLaunchUrl()).append('>');
    }

    public String onActivityLayout() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        onExtraCallback((qgr) sbIAuthTabCallback);
        String strOnExtraCallback = nfe.onExtraCallback(sbIAuthTabCallback);
        return qlw.onExtraCallback(this).onTransact() ? strOnExtraCallback.trim() : strOnExtraCallback;
    }

    @Override // o.qq
    public <T extends Appendable> T onExtraCallback(T t) {
        int size = this.onWarmupCompleted.size();
        for (int i = 0; i < size; i++) {
            this.onWarmupCompleted.get(i).IAuthTabCallback(t);
        }
        return t;
    }

    @Override // o.qq
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public qgr clone() {
        return (qgr) super.clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.qq
    /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
    public qgr onTransact(@Nullable qq qqVar) {
        qgr qgrVar = (qgr) super.onTransact(qqVar);
        om omVar = this.asInterface;
        qgrVar.asInterface = omVar != null ? omVar.clone() : null;
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(qgrVar, this.onWarmupCompleted.size());
        qgrVar.onWarmupCompleted = onwarmupcompleted;
        onwarmupcompleted.addAll(this.onWarmupCompleted);
        return qgrVar;
    }

    @Override // o.qq
    /* renamed from: onUnminimized, reason: merged with bridge method [inline-methods] */
    public qgr isEngagementSignalsApiAvailable() {
        return (qgr) super.isEngagementSignalsApiAvailable();
    }

    static final class onWarmupCompleted extends msc<qq> {
        private final qgr owner;

        onWarmupCompleted(qgr qgrVar, int i) {
            super(i);
            this.owner = qgrVar;
        }

        @Override // o.msc
        public void onExtraCallback() {
            this.owner.onMessageChannelReady();
        }
    }

    private boolean onWarmupCompleted(oq.onExtraCallback onextracallback) {
        if (this.IAuthTabCallbackStub.IAuthTabCallback()) {
            return true;
        }
        return (ICustomTabsCallbackDefault() != null && ICustomTabsCallbackDefault().ICustomTabsCallback_Parcel().IAuthTabCallback()) || onextracallback.IAuthTabCallback();
    }

    private boolean onExtraCallback(oq.onExtraCallback onextracallback) {
        if (!ICustomTabsCallback_Parcel().IAuthTabCallbackStub() || ICustomTabsCallback_Parcel().onNavigationEvent()) {
            return false;
        }
        return ((ICustomTabsCallbackDefault() != null && !ICustomTabsCallbackDefault().onPostMessage()) || requestPostMessageChannel() == null || onextracallback.IAuthTabCallback()) ? false : true;
    }
}
