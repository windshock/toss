package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.toJSONObject;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class toJSONObject$onNavigationEvent implements toJSONObject {
    public /* synthetic */ toJSONObject$onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private toJSONObject$onNavigationEvent() {
    }

    public static final class onExtraCallbackWithResult extends toJSONObject$onNavigationEvent {
        private static int IAuthTabCallback_Parcel = 1;
        private static int onTransact;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final toJSONObject.onExtraCallback IAuthTabCallbackStub;
        private final String asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final boolean onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = IAuthTabCallback_Parcel + 1;
                onTransact = i2 % 128;
                return i2 % 2 == 0;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault) || !getByteArray.onNavigationEvent(this.asInterface, onextracallbackwithresult.asInterface) || !Intrinsics.areEqual(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent)) {
                int i3 = IAuthTabCallback_Parcel + 55;
                onTransact = i3 % 128;
                if (i3 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (!Intrinsics.areEqual(this.asBinder, onextracallbackwithresult.asBinder)) {
                int i4 = onTransact + 51;
                IAuthTabCallback_Parcel = i4 % 128;
                return i4 % 2 == 0;
            }
            if (!Intrinsics.areEqual(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) || this.onWarmupCompleted != onextracallbackwithresult.onWarmupCompleted || !Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult)) {
                return false;
            }
            if (Intrinsics.areEqual(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub)) {
                return true;
            }
            int i5 = onTransact + 83;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 55 / 0;
            }
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = onTransact + 77;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((((this.IAuthTabCallbackDefault.hashCode() * 31) + getByteArray.onExtraCallback(this.asInterface)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.asBinder.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + Boolean.hashCode(this.onWarmupCompleted)) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode();
            int i4 = IAuthTabCallback_Parcel + 9;
            onTransact = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Card(referenceId=" + this.IAuthTabCallbackDefault + ", uniqueId=" + getByteArray.IAuthTabCallback(this.asInterface) + ", imageUrl=" + this.IAuthTabCallback + ", imageDarkUrl=" + this.onNavigationEvent + ", title=" + this.asBinder + ", description=" + this.onExtraCallback + ", deletable=" + this.onWarmupCompleted + ", assetName=" + this.onExtraCallbackWithResult + ", logExtra=" + this.IAuthTabCallbackStub + ")";
            int i2 = onTransact + 71;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onExtraCallbackWithResult(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, toJSONObject.onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallbackDefault = str;
            this.asInterface = str2;
            this.IAuthTabCallback = str3;
            this.onNavigationEvent = str4;
            this.asBinder = str5;
            this.onExtraCallback = str6;
            this.onWarmupCompleted = z;
            this.onExtraCallbackWithResult = str7;
            this.IAuthTabCallbackStub = onextracallback;
        }

        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 81;
            int i3 = i2 % 128;
            onTransact = i3;
            int i4 = i2 % 2;
            String str = this.IAuthTabCallbackDefault;
            int i5 = i3 + 49;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String onTransact() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 93;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            String str = this.asInterface;
            int i5 = i2 + 117;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 29;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = onTransact;
            int i3 = i2 + 15;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onNavigationEvent;
            int i5 = i2 + 3;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 123;
            onTransact = i2 % 128;
            if (i2 % 2 == 0) {
                return this.asBinder;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onTransact + 55;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onExtraCallback;
            if (i3 == 0) {
                int i4 = 48 / 0;
            }
            return str;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 105;
            onTransact = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 69;
            onTransact = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = onTransact + 83;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.onExtraCallbackWithResult;
            int i4 = i3 + 83;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public toJSONObject.onExtraCallback IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = onTransact + 111;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            toJSONObject.onExtraCallback onextracallback = this.IAuthTabCallbackStub;
            int i4 = i3 + 9;
            onTransact = i4 % 128;
            int i5 = i4 % 2;
            return onextracallback;
        }
    }

    public static final class onWarmupCompleted extends toJSONObject$onNavigationEvent {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStubProxy = 1;
        private final String IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final toJSONObject.onExtraCallback asBinder;
        private final String asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onTransact, onwarmupcompleted.onTransact)) {
                int i2 = IAuthTabCallbackStubProxy + 9;
                IAuthTabCallbackDefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (!getByteArray.onNavigationEvent(this.IAuthTabCallbackStub, onwarmupcompleted.IAuthTabCallbackStub)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult)) {
                int i4 = IAuthTabCallbackDefault + 77;
                IAuthTabCallbackStubProxy = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onwarmupcompleted.asInterface)) {
                int i6 = IAuthTabCallbackStubProxy + 57;
                IAuthTabCallbackDefault = i6 % 128;
                return i6 % 2 != 0;
            }
            if (Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback)) {
                return this.onNavigationEvent == onwarmupcompleted.onNavigationEvent && Intrinsics.areEqual(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) && Intrinsics.areEqual(this.asBinder, onwarmupcompleted.asBinder);
            }
            int i7 = IAuthTabCallbackStubProxy + 1;
            IAuthTabCallbackDefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 91;
            IAuthTabCallbackStubProxy = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((((this.onTransact.hashCode() * 31) + getByteArray.onExtraCallback(this.IAuthTabCallbackStub)) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + this.asInterface.hashCode()) * 31) + this.onExtraCallback.hashCode()) * 31) + Boolean.hashCode(this.onNavigationEvent)) * 31) + this.IAuthTabCallback.hashCode()) * 31) + this.asBinder.hashCode();
            int i4 = IAuthTabCallbackStubProxy + 3;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Loan(referenceId=" + this.onTransact + ", uniqueId=" + getByteArray.IAuthTabCallback(this.IAuthTabCallbackStub) + ", imageUrl=" + this.onExtraCallbackWithResult + ", imageDarkUrl=" + this.onWarmupCompleted + ", title=" + this.asInterface + ", description=" + this.onExtraCallback + ", deletable=" + this.onNavigationEvent + ", assetName=" + this.IAuthTabCallback + ", logExtra=" + this.asBinder + ")";
            int i2 = IAuthTabCallbackStubProxy + 77;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onWarmupCompleted(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, toJSONObject.onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.onTransact = str;
            this.IAuthTabCallbackStub = str2;
            this.onExtraCallbackWithResult = str3;
            this.onWarmupCompleted = str4;
            this.asInterface = str5;
            this.onExtraCallback = str6;
            this.onNavigationEvent = z;
            this.IAuthTabCallback = str7;
            this.asBinder = onextracallback;
        }

        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 65;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.onTransact;
            int i4 = i2 + 73;
            IAuthTabCallbackDefault = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public String onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 81;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 13;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 19;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i3 + 121;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onNavigationEvent() {
            String str;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 113;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            if (i2 % 2 != 0) {
                str = this.onWarmupCompleted;
                int i4 = 40 / 0;
            } else {
                str = this.onWarmupCompleted;
            }
            int i5 = i3 + 111;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 93 / 0;
            }
            return str;
        }

        public String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 83;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.asInterface;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 71;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 1;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 65;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            boolean z = this.onNavigationEvent;
            int i5 = i3 + 39;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 37;
            IAuthTabCallbackDefault = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallback;
            int i4 = i2 + 13;
            IAuthTabCallbackDefault = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public toJSONObject.onExtraCallback IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 83;
            int i3 = i2 % 128;
            IAuthTabCallbackDefault = i3;
            int i4 = i2 % 2;
            toJSONObject.onExtraCallback onextracallback = this.asBinder;
            int i5 = i3 + 13;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }
    }

    public static final class onNavigationEvent extends toJSONObject$onNavigationEvent {
        private static int access100 = 1;
        private static int asBinder;
        private final boolean IAuthTabCallback;
        private final String IAuthTabCallbackDefault;
        private final String IAuthTabCallbackStub;
        private final toJSONObject.onExtraCallback asInterface;
        private final String onExtraCallback;
        private final String onExtraCallbackWithResult;
        private final String onNavigationEvent;
        private final String onTransact;
        private final String onWarmupCompleted;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            if ((r6 instanceof o.toJSONObject$onNavigationEvent.onNavigationEvent) != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            r6 = (o.toJSONObject$onNavigationEvent.onNavigationEvent) r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackDefault, r6.IAuthTabCallbackDefault) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (o.getByteArray.onNavigationEvent(r5.onTransact, r6.onTransact) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            r6 = o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 + 35;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.asBinder = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallback, r6.onExtraCallback) != false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            r6 = o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 + 93;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.asBinder = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onExtraCallbackWithResult, r6.onExtraCallbackWithResult) != false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.IAuthTabCallbackStub, r6.IAuthTabCallbackStub) != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.onWarmupCompleted, r6.onWarmupCompleted)) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
        
            r6 = o.toJSONObject$onNavigationEvent.onNavigationEvent.asBinder + 41;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        
            if (r5.IAuthTabCallback == r6.IAuthTabCallback) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        
            r6 = o.toJSONObject$onNavigationEvent.onNavigationEvent.asBinder + 85;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.onNavigationEvent, r6.onNavigationEvent) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
        
            r6 = o.toJSONObject$onNavigationEvent.onNavigationEvent.asBinder + 65;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(r5.asInterface, r6.asInterface) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        
            if (r5 == r6) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            r1 = r1 + 117;
            o.toJSONObject$onNavigationEvent.onNavigationEvent.access100 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 17;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 18 / 0;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = asBinder + 85;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = (((((((((((((((this.IAuthTabCallbackDefault.hashCode() * 31) + getByteArray.onExtraCallback(this.onTransact)) * 31) + this.onExtraCallback.hashCode()) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + this.IAuthTabCallbackStub.hashCode()) * 31) + this.onWarmupCompleted.hashCode()) * 31) + Boolean.hashCode(this.IAuthTabCallback)) * 31) + this.onNavigationEvent.hashCode()) * 31) + this.asInterface.hashCode();
            int i4 = access100 + 7;
            asBinder = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Etc(referenceId=" + this.IAuthTabCallbackDefault + ", uniqueId=" + getByteArray.IAuthTabCallback(this.onTransact) + ", imageUrl=" + this.onExtraCallback + ", imageDarkUrl=" + this.onExtraCallbackWithResult + ", title=" + this.IAuthTabCallbackStub + ", description=" + this.onWarmupCompleted + ", deletable=" + this.IAuthTabCallback + ", assetName=" + this.onNavigationEvent + ", logExtra=" + this.asInterface + ")";
            int i2 = asBinder + 83;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private onNavigationEvent(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, toJSONObject.onExtraCallback onextracallback) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(onextracallback, "");
            this.IAuthTabCallbackDefault = str;
            this.onTransact = str2;
            this.onExtraCallback = str3;
            this.onExtraCallbackWithResult = str4;
            this.IAuthTabCallbackStub = str5;
            this.onWarmupCompleted = str6;
            this.IAuthTabCallback = z;
            this.onNavigationEvent = str7;
            this.asInterface = onextracallback;
        }

        public String IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = asBinder + 69;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallbackDefault;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onTransact() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 71;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onTransact;
            int i5 = i2 + 27;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String onExtraCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 85;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            String str = this.onExtraCallback;
            int i5 = i3 + 29;
            asBinder = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public String onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 97;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            String str = this.onExtraCallbackWithResult;
            int i5 = i2 + 105;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public String asInterface() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 51;
            access100 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.IAuthTabCallbackStub;
            int i4 = i2 + 87;
            access100 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            access100 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onWarmupCompleted;
            }
            throw null;
        }

        public boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 55;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.IAuthTabCallback;
            int i5 = i2 + 27;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public String IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = asBinder + 91;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.onNavigationEvent;
            if (i3 == 0) {
                int i4 = 43 / 0;
            }
            return str;
        }

        public toJSONObject.onExtraCallback IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = asBinder;
            int i3 = i2 + 59;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            toJSONObject.onExtraCallback onextracallback = this.asInterface;
            int i5 = i2 + 57;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return onextracallback;
        }
    }
}
