package o;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import o.clickDislike;
import o.clickSkip;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public enum clickSkip {
    PLAIN(new Function() { // from class: org.apache.commons.text.numbers.DoubleFormat$$ExternalSyntheticLambda0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new clickSkip.onWarmupCompleted((clickSkip.onExtraCallback) obj);
        }
    }),
    SCIENTIFIC(new Function() { // from class: org.apache.commons.text.numbers.DoubleFormat$$ExternalSyntheticLambda1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new clickSkip.IAuthTabCallbackStub((clickSkip.onExtraCallback) obj);
        }
    }),
    ENGINEERING(new Function() { // from class: org.apache.commons.text.numbers.DoubleFormat$$ExternalSyntheticLambda2
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new clickSkip.IAuthTabCallback((clickSkip.onExtraCallback) obj);
        }
    }),
    MIXED(new Function() { // from class: org.apache.commons.text.numbers.DoubleFormat$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return new clickSkip.onExtraCallbackWithResult((clickSkip.onExtraCallback) obj);
        }
    });

    private final Function<onExtraCallback, DoubleFunction<String>> factory;

    static abstract class onNavigationEvent implements DoubleFunction<String>, clickDislike.onWarmupCompleted {
        private final char[] IAuthTabCallback;
        private final boolean IAuthTabCallbackDefault;
        private final char IAuthTabCallbackStub;
        private final String IAuthTabCallback_Parcel;
        private final String access000;
        private final boolean access100;
        private final int asBinder;
        private final int asInterface;
        private final String getInterfaceDescriptor;
        private final boolean onExtraCallback;
        private final char onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final char onTransact;
        private final char[] onWarmupCompleted;

        protected abstract String onNavigationEvent(clickDislike clickdislike);

        onNavigationEvent(onExtraCallback onextracallback) {
            this.asBinder = onextracallback.asBinder;
            this.asInterface = onextracallback.access000;
            this.access000 = onextracallback.IAuthTabCallbackStub;
            this.IAuthTabCallback_Parcel = onextracallback.IAuthTabCallback_Parcel + onextracallback.IAuthTabCallbackStub;
            this.getInterfaceDescriptor = onextracallback.getInterfaceDescriptor;
            this.onNavigationEvent = onextracallback.onTransact;
            this.access100 = onextracallback.writeTypedObject;
            this.onWarmupCompleted = onextracallback.onExtraCallback.toCharArray();
            this.onExtraCallbackWithResult = onextracallback.IAuthTabCallback;
            this.IAuthTabCallbackStub = onextracallback.asInterface;
            this.IAuthTabCallbackDefault = onextracallback.IAuthTabCallbackDefault;
            this.onTransact = onextracallback.IAuthTabCallback_Parcel;
            this.IAuthTabCallback = onextracallback.onNavigationEvent.toCharArray();
            this.onExtraCallback = onextracallback.onExtraCallbackWithResult;
        }

        @Override // java.util.function.DoubleFunction
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public String apply(double d) {
            if (Double.isFinite(d)) {
                return onExtraCallbackWithResult(d);
            }
            if (Double.isInfinite(d)) {
                return d > 0.0d ? this.access000 : this.IAuthTabCallback_Parcel;
            }
            return this.getInterfaceDescriptor;
        }

        private String onExtraCallbackWithResult(double d) {
            clickDislike clickdislikeOnExtraCallback = clickDislike.onExtraCallback(d);
            int iMax = Math.max(clickdislikeOnExtraCallback.onNavigationEvent(), this.asInterface);
            if (this.asBinder > 0) {
                iMax = Math.max((clickdislikeOnExtraCallback.onWarmupCompleted() - this.asBinder) + 1, iMax);
            }
            clickdislikeOnExtraCallback.onNavigationEvent(iMax);
            return onNavigationEvent(clickdislikeOnExtraCallback);
        }

        @Override // o.clickDislike.onWarmupCompleted
        public char onNavigationEvent() {
            return this.onExtraCallbackWithResult;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public char[] onExtraCallback() {
            return this.onWarmupCompleted;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public char[] onWarmupCompleted() {
            return this.IAuthTabCallback;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public char onExtraCallbackWithResult() {
            return this.IAuthTabCallbackStub;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public char IAuthTabCallback() {
            return this.onTransact;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public boolean asBinder() {
            return this.onExtraCallback;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public boolean IAuthTabCallbackStub() {
            return this.IAuthTabCallbackDefault;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public boolean asInterface() {
            return this.onNavigationEvent;
        }

        @Override // o.clickDislike.onWarmupCompleted
        public boolean IAuthTabCallbackDefault() {
            return this.access100;
        }
    }

    public static final class onExtraCallback {
        private char IAuthTabCallback;
        private boolean IAuthTabCallbackDefault;
        private String IAuthTabCallbackStub;
        private int IAuthTabCallbackStubProxy;
        private char IAuthTabCallback_Parcel;
        private int access000;
        private int access100;
        private int asBinder;
        private char asInterface;
        private String getInterfaceDescriptor;
        private String onExtraCallback;
        private boolean onExtraCallbackWithResult;
        private String onNavigationEvent;
        private boolean onTransact;
        private final Function<onExtraCallback, DoubleFunction<String>> onWarmupCompleted;
        private boolean writeTypedObject;

        private onExtraCallback(Function<onExtraCallback, DoubleFunction<String>> function) {
            this.asBinder = 0;
            this.access000 = PKIFailureInfo.systemUnavail;
            this.access100 = 6;
            this.IAuthTabCallbackStubProxy = -3;
            this.IAuthTabCallbackStub = "Infinity";
            this.getInterfaceDescriptor = "NaN";
            this.onTransact = true;
            this.writeTypedObject = true;
            this.onExtraCallback = "0123456789";
            this.IAuthTabCallback = '.';
            this.asInterface = ',';
            this.IAuthTabCallbackDefault = false;
            this.IAuthTabCallback_Parcel = '-';
            this.onNavigationEvent = "E";
            this.onExtraCallbackWithResult = false;
            this.onWarmupCompleted = function;
        }
    }

    public static class IAuthTabCallback extends onNavigationEvent {
        public IAuthTabCallback(onExtraCallback onextracallback) {
            super(onextracallback);
        }

        @Override // o.clickSkip.onNavigationEvent
        public String onNavigationEvent(clickDislike clickdislike) {
            return clickdislike.onExtraCallbackWithResult(this);
        }
    }

    public static final class onExtraCallbackWithResult extends onNavigationEvent {
        private final int IAuthTabCallback;
        private final int onExtraCallbackWithResult;

        public onExtraCallbackWithResult(onExtraCallback onextracallback) {
            super(onextracallback);
            this.IAuthTabCallback = onextracallback.access100;
            this.onExtraCallbackWithResult = onextracallback.IAuthTabCallbackStubProxy;
        }

        @Override // o.clickSkip.onNavigationEvent
        protected String onNavigationEvent(clickDislike clickdislike) {
            int iOnWarmupCompleted = clickdislike.onWarmupCompleted();
            if (iOnWarmupCompleted <= this.IAuthTabCallback && iOnWarmupCompleted >= this.onExtraCallbackWithResult) {
                return clickdislike.IAuthTabCallback(this);
            }
            return clickdislike.onExtraCallback(this);
        }
    }

    public static class onWarmupCompleted extends onNavigationEvent {
        public onWarmupCompleted(onExtraCallback onextracallback) {
            super(onextracallback);
        }

        @Override // o.clickSkip.onNavigationEvent
        protected String onNavigationEvent(clickDislike clickdislike) {
            return clickdislike.IAuthTabCallback(this);
        }
    }

    public static class IAuthTabCallbackStub extends onNavigationEvent {
        public IAuthTabCallbackStub(onExtraCallback onextracallback) {
            super(onextracallback);
        }

        @Override // o.clickSkip.onNavigationEvent
        public String onNavigationEvent(clickDislike clickdislike) {
            return clickdislike.onExtraCallback(this);
        }
    }

    clickSkip(Function function) {
        this.factory = function;
    }

    public onExtraCallback builder() {
        return new onExtraCallback(this.factory);
    }
}
