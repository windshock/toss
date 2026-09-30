package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;
import o.oq;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class qq implements Cloneable {
    static final List<qq> onExtraCallback = Collections.EMPTY_LIST;

    @Nullable
    qq IAuthTabCallback;
    int onNavigationEvent;

    public abstract String IAuthTabCallback();

    abstract void IAuthTabCallback(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException;

    public abstract om access000();

    public abstract qq asBinder();

    protected abstract void c_(String str);

    public abstract int cz_();

    public boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    protected abstract List<qq> extraCallbackWithResult();

    void onMessageChannelReady() {
    }

    public abstract String onNavigationEvent();

    abstract void onWarmupCompleted(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException;

    protected abstract boolean readTypedObject();

    protected qq() {
    }

    public boolean prefetch() {
        return this.IAuthTabCallback != null;
    }

    public String onExtraCallback(String str) {
        oas.onExtraCallback(str);
        if (!readTypedObject()) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String strOnNavigationEvent = access000().onNavigationEvent(str);
        return strOnNavigationEvent.length() > 0 ? strOnNavigationEvent : str.startsWith("abs:") ? onNavigationEvent(str.substring(4)) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    public int postMessage() {
        if (readTypedObject()) {
            return access000().asInterface();
        }
        return 0;
    }

    public qq onNavigationEvent(String str, String str2) {
        access000().IAuthTabCallback(qlw.onExtraCallbackWithResult(this).onWarmupCompleted().onExtraCallbackWithResult(str), str2);
        return this;
    }

    public boolean onExtraCallbackWithResult(String str) {
        oas.onExtraCallback(str);
        if (!readTypedObject()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (access000().asBinder(strSubstring) && !onNavigationEvent(strSubstring).isEmpty()) {
                return true;
            }
        }
        return access000().asBinder(str);
    }

    public void asBinder(String str) {
        oas.onExtraCallback(str);
        c_(str);
    }

    public String onNavigationEvent(String str) {
        oas.onExtraCallbackWithResult(str);
        if (!readTypedObject() || !access000().asBinder(str)) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return nfe.onNavigationEvent(IAuthTabCallback(), access000().onNavigationEvent(str));
    }

    public qq onExtraCallbackWithResult(int i) {
        return extraCallbackWithResult().get(i);
    }

    public List<qq> newSession() {
        if (cz_() == 0) {
            return onExtraCallback;
        }
        List<qq> listExtraCallbackWithResult = extraCallbackWithResult();
        ArrayList arrayList = new ArrayList(listExtraCallbackWithResult.size());
        arrayList.addAll(listExtraCallbackWithResult);
        return Collections.unmodifiableList(arrayList);
    }

    @Nullable
    public qq ICustomTabsCallbackDefault() {
        return this.IAuthTabCallback;
    }

    @Nullable
    public final qq requestPostMessageChannelWithExtras() {
        return this.IAuthTabCallback;
    }

    public qq isEngagementSignalsApiAvailable() {
        qq qqVar = this;
        while (true) {
            qq qqVar2 = qqVar.IAuthTabCallback;
            if (qqVar2 == null) {
                return qqVar;
            }
            qqVar = qqVar2;
        }
    }

    @Nullable
    public oq setEngagementSignalsCallback() {
        qq qqVarIsEngagementSignalsApiAvailable = isEngagementSignalsApiAvailable();
        if (qqVarIsEngagementSignalsApiAvailable instanceof oq) {
            return (oq) qqVarIsEngagementSignalsApiAvailable;
        }
        return null;
    }

    public void prefetchWithMultipleUrls() {
        oas.onExtraCallback(this.IAuthTabCallback);
        this.IAuthTabCallback.asInterface(this);
    }

    public qq IAuthTabCallback(qq qqVar) {
        oas.onExtraCallback(qqVar);
        oas.onExtraCallback(this.IAuthTabCallback);
        this.IAuthTabCallback.onNavigationEvent(this.onNavigationEvent, qqVar);
        return this;
    }

    public void IAuthTabCallbackStub(qq qqVar) {
        oas.onExtraCallback(qqVar);
        oas.onExtraCallback(this.IAuthTabCallback);
        this.IAuthTabCallback.onExtraCallbackWithResult(this, qqVar);
    }

    protected void asBinder(qq qqVar) {
        oas.onExtraCallback(qqVar);
        qq qqVar2 = this.IAuthTabCallback;
        if (qqVar2 != null) {
            qqVar2.asInterface(this);
        }
        this.IAuthTabCallback = qqVar;
    }

    protected void onExtraCallbackWithResult(qq qqVar, qq qqVar2) {
        oas.onExtraCallback(qqVar.IAuthTabCallback == this);
        oas.onExtraCallback(qqVar2);
        qq qqVar3 = qqVar2.IAuthTabCallback;
        if (qqVar3 != null) {
            qqVar3.asInterface(qqVar2);
        }
        int i = qqVar.onNavigationEvent;
        extraCallbackWithResult().set(i, qqVar2);
        qqVar2.IAuthTabCallback = this;
        qqVar2.onWarmupCompleted(i);
        qqVar.IAuthTabCallback = null;
    }

    protected void asInterface(qq qqVar) {
        oas.onExtraCallback(qqVar.IAuthTabCallback == this);
        int i = qqVar.onNavigationEvent;
        extraCallbackWithResult().remove(i);
        onNavigationEvent(i);
        qqVar.IAuthTabCallback = null;
    }

    protected void onNavigationEvent(int i, qq... qqVarArr) {
        oas.onExtraCallback(qqVarArr);
        if (qqVarArr.length != 0) {
            List<qq> listExtraCallbackWithResult = extraCallbackWithResult();
            qq qqVarICustomTabsCallbackDefault = qqVarArr[0].ICustomTabsCallbackDefault();
            if (qqVarICustomTabsCallbackDefault != null && qqVarICustomTabsCallbackDefault.cz_() == qqVarArr.length) {
                List<qq> listExtraCallbackWithResult2 = qqVarICustomTabsCallbackDefault.extraCallbackWithResult();
                int length = qqVarArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length > 0) {
                        if (qqVarArr[i2] != listExtraCallbackWithResult2.get(i2)) {
                            break;
                        } else {
                            length = i2;
                        }
                    } else {
                        boolean z = cz_() == 0;
                        qqVarICustomTabsCallbackDefault.asBinder();
                        listExtraCallbackWithResult.addAll(i, Arrays.asList(qqVarArr));
                        int length2 = qqVarArr.length;
                        while (true) {
                            int i3 = length2 - 1;
                            if (length2 <= 0) {
                                break;
                            }
                            qqVarArr[i3].IAuthTabCallback = this;
                            length2 = i3;
                        }
                        if (z && qqVarArr[0].onNavigationEvent == 0) {
                            return;
                        }
                        onNavigationEvent(i);
                        return;
                    }
                }
            }
            oas.onNavigationEvent(qqVarArr);
            for (qq qqVar : qqVarArr) {
                IAuthTabCallbackDefault(qqVar);
            }
            listExtraCallbackWithResult.addAll(i, Arrays.asList(qqVarArr));
            onNavigationEvent(i);
        }
    }

    protected void IAuthTabCallbackDefault(qq qqVar) {
        qqVar.asBinder(this);
    }

    private void onNavigationEvent(int i) {
        if (cz_() != 0) {
            List<qq> listExtraCallbackWithResult = extraCallbackWithResult();
            while (i < listExtraCallbackWithResult.size()) {
                listExtraCallbackWithResult.get(i).onWarmupCompleted(i);
                i++;
            }
        }
    }

    public List<qq> ICustomTabsServiceStub() {
        qq qqVar = this.IAuthTabCallback;
        if (qqVar == null) {
            return Collections.EMPTY_LIST;
        }
        List<qq> listExtraCallbackWithResult = qqVar.extraCallbackWithResult();
        ArrayList arrayList = new ArrayList(listExtraCallbackWithResult.size() - 1);
        for (qq qqVar2 : listExtraCallbackWithResult) {
            if (qqVar2 != this) {
                arrayList.add(qqVar2);
            }
        }
        return arrayList;
    }

    @Nullable
    public qq receiveFile() {
        qq qqVar = this.IAuthTabCallback;
        if (qqVar == null) {
            return null;
        }
        List<qq> listExtraCallbackWithResult = qqVar.extraCallbackWithResult();
        int i = this.onNavigationEvent + 1;
        if (listExtraCallbackWithResult.size() > i) {
            return listExtraCallbackWithResult.get(i);
        }
        return null;
    }

    @Nullable
    public qq requestPostMessageChannel() {
        qq qqVar = this.IAuthTabCallback;
        if (qqVar != null && this.onNavigationEvent > 0) {
            return qqVar.extraCallbackWithResult().get(this.onNavigationEvent - 1);
        }
        return null;
    }

    public int validateRelationship() {
        return this.onNavigationEvent;
    }

    protected void onWarmupCompleted(int i) {
        this.onNavigationEvent = i;
    }

    public String asInterface() {
        StringBuilder sbIAuthTabCallback = nfe.IAuthTabCallback();
        IAuthTabCallback(sbIAuthTabCallback);
        return nfe.onExtraCallback(sbIAuthTabCallback);
    }

    protected void IAuthTabCallback(Appendable appendable) {
        vb.IAuthTabCallback(new onExtraCallback(appendable, qlw.onExtraCallback(this)), this);
    }

    public <T extends Appendable> T onExtraCallback(T t) {
        IAuthTabCallback(t);
        return t;
    }

    public String toString() {
        return asInterface();
    }

    protected void onExtraCallbackWithResult(Appendable appendable, int i, oq.onExtraCallback onextracallback) throws IOException {
        appendable.append('\n').append(nfe.onExtraCallbackWithResult(i * onextracallback.onNavigationEvent()));
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // 
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public qq clone() {
        qq qqVarOnTransact = onTransact(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(qqVarOnTransact);
        while (!linkedList.isEmpty()) {
            qq qqVar = (qq) linkedList.remove();
            int iCz_ = qqVar.cz_();
            for (int i = 0; i < iCz_; i++) {
                List<qq> listExtraCallbackWithResult = qqVar.extraCallbackWithResult();
                qq qqVarOnTransact2 = listExtraCallbackWithResult.get(i).onTransact(qqVar);
                listExtraCallbackWithResult.set(i, qqVarOnTransact2);
                linkedList.add(qqVarOnTransact2);
            }
        }
        return qqVarOnTransact;
    }

    protected qq onTransact(@Nullable qq qqVar) {
        try {
            qq qqVar2 = (qq) super.clone();
            qqVar2.IAuthTabCallback = qqVar;
            qqVar2.onNavigationEvent = qqVar == null ? 0 : this.onNavigationEvent;
            return qqVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static class onExtraCallback implements wnd {
        private final oq.onExtraCallback onExtraCallback;
        private final Appendable onWarmupCompleted;

        onExtraCallback(Appendable appendable, oq.onExtraCallback onextracallback) {
            this.onWarmupCompleted = appendable;
            this.onExtraCallback = onextracallback;
            onextracallback.asBinder();
        }

        @Override // o.wnd
        public void onNavigationEvent(qq qqVar, int i) {
            try {
                qqVar.IAuthTabCallback(this.onWarmupCompleted, i, this.onExtraCallback);
            } catch (IOException e) {
                throw new mu(e);
            }
        }

        @Override // o.wnd
        public void onExtraCallbackWithResult(qq qqVar, int i) {
            if (qqVar.onNavigationEvent().equals("#text")) {
                return;
            }
            try {
                qqVar.onWarmupCompleted(this.onWarmupCompleted, i, this.onExtraCallback);
            } catch (IOException e) {
                throw new mu(e);
            }
        }
    }
}
