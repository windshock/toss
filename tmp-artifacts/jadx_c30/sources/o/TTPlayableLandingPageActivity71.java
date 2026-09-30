package o;

import java.nio.file.attribute.FileTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.function.Consumer;
import o.TTRewardVideoActivity21;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public class TTPlayableLandingPageActivity71 implements TTLandingPageActivity14 {
    static final TTPlayableLandingPageActivity71[] onNavigationEvent = new TTPlayableLandingPageActivity71[0];
    private FileTime IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private FileTime IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private boolean IAuthTabCallback_Parcel;
    private boolean access000;
    private boolean access100;
    private long asBinder;
    private boolean asInterface;
    private FileTime extraCallback;
    private long extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private long onExtraCallback;
    private long onExtraCallbackWithResult;
    private boolean onTransact;
    private Iterable<? extends TTRewardVideoActivity21> onWarmupCompleted;
    private String readTypedObject;
    private int writeTypedObject;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TTPlayableLandingPageActivity71 tTPlayableLandingPageActivity71 = (TTPlayableLandingPageActivity71) obj;
        return Objects.equals(this.readTypedObject, tTPlayableLandingPageActivity71.readTypedObject) && this.access100 == tTPlayableLandingPageActivity71.access100 && this.getInterfaceDescriptor == tTPlayableLandingPageActivity71.getInterfaceDescriptor && this.access000 == tTPlayableLandingPageActivity71.access000 && this.asInterface == tTPlayableLandingPageActivity71.asInterface && this.IAuthTabCallbackStubProxy == tTPlayableLandingPageActivity71.IAuthTabCallbackStubProxy && this.IAuthTabCallbackDefault == tTPlayableLandingPageActivity71.IAuthTabCallbackDefault && Objects.equals(this.IAuthTabCallbackStub, tTPlayableLandingPageActivity71.IAuthTabCallbackStub) && Objects.equals(this.extraCallback, tTPlayableLandingPageActivity71.extraCallback) && Objects.equals(this.IAuthTabCallback, tTPlayableLandingPageActivity71.IAuthTabCallback) && this.IAuthTabCallback_Parcel == tTPlayableLandingPageActivity71.IAuthTabCallback_Parcel && this.writeTypedObject == tTPlayableLandingPageActivity71.writeTypedObject && this.onTransact == tTPlayableLandingPageActivity71.onTransact && this.asBinder == tTPlayableLandingPageActivity71.asBinder && this.onExtraCallbackWithResult == tTPlayableLandingPageActivity71.onExtraCallbackWithResult && this.extraCallbackWithResult == tTPlayableLandingPageActivity71.extraCallbackWithResult && this.onExtraCallback == tTPlayableLandingPageActivity71.onExtraCallback && onExtraCallbackWithResult(this.onWarmupCompleted, tTPlayableLandingPageActivity71.onWarmupCompleted);
    }

    private boolean onExtraCallbackWithResult(Iterable<? extends TTRewardVideoActivity21> iterable, Iterable<? extends TTRewardVideoActivity21> iterable2) {
        if (iterable == null) {
            return iterable2 == null;
        }
        if (iterable2 == null) {
            return false;
        }
        Iterator<? extends TTRewardVideoActivity21> it = iterable2.iterator();
        for (TTRewardVideoActivity21 tTRewardVideoActivity21 : iterable) {
            if (!it.hasNext() || !tTRewardVideoActivity21.equals(it.next())) {
                return false;
            }
        }
        return !it.hasNext();
    }

    public FileTime sV_() {
        if (this.IAuthTabCallbackDefault) {
            return this.IAuthTabCallback;
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    long onWarmupCompleted() {
        return this.onExtraCallbackWithResult;
    }

    long onNavigationEvent() {
        return this.onExtraCallback;
    }

    public Iterable<? extends TTRewardVideoActivity21> onExtraCallback() {
        return this.onWarmupCompleted;
    }

    public long onExtraCallbackWithResult() {
        return this.asBinder;
    }

    public FileTime sW_() {
        if (this.asInterface) {
            return this.IAuthTabCallbackStub;
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public boolean asBinder() {
        return this.IAuthTabCallbackDefault;
    }

    public boolean onTransact() {
        return this.onTransact;
    }

    public boolean IAuthTabCallbackStub() {
        return this.asInterface;
    }

    public boolean IAuthTabCallbackDefault() {
        return this.IAuthTabCallbackStubProxy;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.IAuthTabCallback_Parcel;
    }

    public FileTime sX_() {
        if (this.IAuthTabCallbackStubProxy) {
            return this.extraCallback;
        }
        throw new UnsupportedOperationException("The entry doesn't have this timestamp");
    }

    public String IAuthTabCallbackStubProxy() {
        return this.readTypedObject;
    }

    public long access000() {
        return this.extraCallbackWithResult;
    }

    public int access100() {
        return this.writeTypedObject;
    }

    public int hashCode() {
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        if (strIAuthTabCallbackStubProxy == null) {
            return 0;
        }
        return strIAuthTabCallbackStubProxy.hashCode();
    }

    public boolean extraCallback() {
        return this.access100;
    }

    public boolean ICustomTabsCallback() {
        return this.access000;
    }

    public boolean readTypedObject() {
        return this.getInterfaceDescriptor;
    }

    public void onWarmupCompleted(Iterable<? extends TTRewardVideoActivity21> iterable) {
        if (iterable != null) {
            final LinkedList linkedList = new LinkedList();
            iterable.forEach(new Consumer() { // from class: org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    linkedList.addLast((TTRewardVideoActivity21) obj);
                }
            });
            this.onWarmupCompleted = Collections.unmodifiableList(linkedList);
            return;
        }
        this.onWarmupCompleted = null;
    }

    public void onExtraCallbackWithResult(String str) {
        this.readTypedObject = str;
    }
}
