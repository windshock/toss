package o;

import o.registerOnPreAttachListener;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class registerOnPreAttachListener$onNavigationEvent {
    private static final registerOnPreAttachListener$onNavigationEvent onWarmupCompleted = new registerOnPreAttachListener$onNavigationEvent(0, 0);
    private final int IAuthTabCallback;
    private final int onNavigationEvent;

    private registerOnPreAttachListener$onNavigationEvent(int i2, int i3) {
        this.IAuthTabCallback = i2;
        this.onNavigationEvent = i3;
    }

    public static registerOnPreAttachListener$onNavigationEvent onExtraCallbackWithResult() {
        return onWarmupCompleted;
    }

    public static registerOnPreAttachListener$onNavigationEvent onExtraCallbackWithResult(registerOnPreAttachListener registeronpreattachlistener) {
        return onWarmupCompleted(registeronpreattachlistener.IAuthTabCallbackStub(), registeronpreattachlistener.asInterface());
    }

    public static registerOnPreAttachListener$onNavigationEvent onWarmupCompleted(registerOnPreAttachListener.onExtraCallbackWithResult[] onextracallbackwithresultArr, registerOnPreAttachListener.onExtraCallbackWithResult[] onextracallbackwithresultArr2) {
        int iOrdinal = 0;
        for (registerOnPreAttachListener.onExtraCallbackWithResult onextracallbackwithresult : onextracallbackwithresultArr) {
            iOrdinal |= 1 << onextracallbackwithresult.ordinal();
        }
        int iOrdinal2 = 0;
        for (registerOnPreAttachListener.onExtraCallbackWithResult onextracallbackwithresult2 : onextracallbackwithresultArr2) {
            iOrdinal2 |= 1 << onextracallbackwithresult2.ordinal();
        }
        return new registerOnPreAttachListener$onNavigationEvent(iOrdinal, iOrdinal2);
    }

    public registerOnPreAttachListener$onNavigationEvent onExtraCallbackWithResult(registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent) {
        if (registeronpreattachlistener_onnavigationevent != null) {
            int i2 = registeronpreattachlistener_onnavigationevent.onNavigationEvent;
            int i3 = registeronpreattachlistener_onnavigationevent.IAuthTabCallback;
            if (i2 != 0 || i3 != 0) {
                int i4 = this.IAuthTabCallback;
                if (i4 == 0 && this.onNavigationEvent == 0) {
                    return registeronpreattachlistener_onnavigationevent;
                }
                int i5 = ((~i2) & i4) | i3;
                int i6 = this.onNavigationEvent;
                int i7 = i2 | ((~i3) & i6);
                if (i5 != i4 || i7 != i6) {
                    return new registerOnPreAttachListener$onNavigationEvent(i5, i7);
                }
            }
        }
        return this;
    }

    public Boolean onExtraCallback(registerOnPreAttachListener.onExtraCallbackWithResult onextracallbackwithresult) {
        int iOrdinal = 1 << onextracallbackwithresult.ordinal();
        if ((this.onNavigationEvent & iOrdinal) != 0) {
            return Boolean.FALSE;
        }
        if ((iOrdinal & this.IAuthTabCallback) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public String toString() {
        if (this == onWarmupCompleted) {
            return "EMPTY";
        }
        return String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.IAuthTabCallback), Integer.valueOf(this.onNavigationEvent));
    }

    public int hashCode() {
        return this.onNavigationEvent + this.IAuthTabCallback;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        registerOnPreAttachListener$onNavigationEvent registeronpreattachlistener_onnavigationevent = (registerOnPreAttachListener$onNavigationEvent) obj;
        return registeronpreattachlistener_onnavigationevent.IAuthTabCallback == this.IAuthTabCallback && registeronpreattachlistener_onnavigationevent.onNavigationEvent == this.onNavigationEvent;
    }
}
