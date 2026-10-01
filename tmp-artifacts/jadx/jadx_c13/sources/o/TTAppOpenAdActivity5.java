package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class TTAppOpenAdActivity5 implements Parcelable {
    public static final Parcelable.Creator<TTAppOpenAdActivity5> CREATOR = new Parcelable.Creator<TTAppOpenAdActivity5>() { // from class: o.TTAppOpenAdActivity5.3
        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity5[] newArray(int i) {
            return new TTAppOpenAdActivity5[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public TTAppOpenAdActivity5 createFromParcel(Parcel parcel) {
            return new TTAppOpenAdActivity5(parcel);
        }
    };
    private final int IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final int IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private boolean access100;
    private final long asBinder;
    private final long asInterface;
    private final boolean getInterfaceDescriptor;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final boolean onNavigationEvent;
    private final int onTransact;
    private final int onWarmupCompleted;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getInterfaceDescriptor() {
        return this.IAuthTabCallback_Parcel;
    }

    public int onWarmupCompleted() {
        return this.IAuthTabCallback;
    }

    public int asBinder() {
        return this.onWarmupCompleted;
    }

    public int IAuthTabCallbackStub() {
        return this.IAuthTabCallbackStub;
    }

    public boolean access000() {
        return this.getInterfaceDescriptor;
    }

    public boolean IAuthTabCallback_Parcel() {
        return this.IAuthTabCallbackStubProxy;
    }

    public boolean IAuthTabCallbackStubProxy() {
        return this.access100;
    }

    void IAuthTabCallback() {
        this.access100 = false;
    }

    public long onNavigationEvent() {
        return this.onExtraCallback;
    }

    public long onExtraCallbackWithResult() {
        return this.onExtraCallbackWithResult;
    }

    public boolean onExtraCallback() {
        return this.onNavigationEvent;
    }

    public int IAuthTabCallbackDefault() {
        return this.onTransact;
    }

    public long access100() {
        return this.IAuthTabCallbackDefault;
    }

    private TTAppOpenAdActivity5(int i, int i2, long j, int i3, int i4, boolean z, int i5, boolean z2, boolean z3, boolean z4, long j2, long j3, long j4, long j5) {
        this.IAuthTabCallback_Parcel = i;
        this.IAuthTabCallback = i2;
        this.IAuthTabCallbackDefault = j;
        this.IAuthTabCallbackStub = i4;
        this.onWarmupCompleted = i3;
        this.onNavigationEvent = z;
        this.onTransact = i5;
        this.getInterfaceDescriptor = z2;
        this.IAuthTabCallbackStubProxy = z3;
        this.access100 = z4;
        this.onExtraCallback = 1000000 * j2;
        this.onExtraCallbackWithResult = j3;
        this.asInterface = j4;
        this.asBinder = j5;
    }

    private TTAppOpenAdActivity5(Parcel parcel) {
        this.IAuthTabCallback_Parcel = parcel.readInt();
        this.IAuthTabCallback = parcel.readInt();
        this.IAuthTabCallbackDefault = parcel.readLong();
        this.onWarmupCompleted = parcel.readInt();
        this.IAuthTabCallbackStub = parcel.readInt();
        this.onNavigationEvent = parcel.readInt() != 0;
        this.onTransact = parcel.readInt();
        this.getInterfaceDescriptor = parcel.readInt() == 1;
        this.IAuthTabCallbackStubProxy = parcel.readInt() == 1;
        this.onExtraCallback = parcel.readLong();
        this.onExtraCallbackWithResult = parcel.readLong();
        this.asInterface = parcel.readLong();
        this.asBinder = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.IAuthTabCallback_Parcel);
        parcel.writeInt(this.IAuthTabCallback);
        parcel.writeLong(this.IAuthTabCallbackDefault);
        parcel.writeInt(this.onWarmupCompleted);
        parcel.writeInt(this.IAuthTabCallbackStub);
        parcel.writeInt(this.onNavigationEvent ? 1 : 0);
        parcel.writeInt(this.onTransact);
        parcel.writeInt(this.getInterfaceDescriptor ? 1 : 0);
        parcel.writeInt(this.IAuthTabCallbackStubProxy ? 1 : 0);
        parcel.writeLong(this.onExtraCallback);
        parcel.writeLong(this.onExtraCallbackWithResult);
        parcel.writeLong(this.asInterface);
        parcel.writeLong(this.asBinder);
    }

    public boolean extraCallback() {
        return this.asBinder > 0 && this.asInterface > 0;
    }

    public long onTransact() {
        return this.asBinder;
    }

    public long asInterface() {
        return this.asInterface;
    }

    public static final class onNavigationEvent {
        private int access000 = 0;
        private int onWarmupCompleted = 1;
        private long asInterface = 0;
        private int onNavigationEvent = 1;
        private int asBinder = 3;
        private boolean onExtraCallbackWithResult = true;
        private int onTransact = 255;
        private boolean access100 = true;
        private boolean IAuthTabCallbackStubProxy = true;
        private boolean getInterfaceDescriptor = true;
        private long onExtraCallback = 10000;
        private long IAuthTabCallback = 10000;
        private long IAuthTabCallbackStub = 0;
        private long IAuthTabCallbackDefault = 0;

        private boolean asInterface(int i) {
            return i == 1 || i == 2 || i == 4 || i == 6;
        }

        public onNavigationEvent IAuthTabCallback(int i) {
            if (i < -1 || i > 2) {
                throw new IllegalArgumentException("invalid scan mode " + i);
            }
            this.access000 = i;
            return this;
        }

        public onNavigationEvent onNavigationEvent(int i) {
            if (!asInterface(i)) {
                throw new IllegalArgumentException("invalid callback type - " + i);
            }
            this.onWarmupCompleted = i;
            return this;
        }

        public onNavigationEvent onExtraCallback(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("reportDelay must be > 0");
            }
            this.asInterface = j;
            return this;
        }

        public onNavigationEvent onExtraCallbackWithResult(int i) {
            if (i <= 0 || i > 3) {
                throw new IllegalArgumentException("invalid numOfMatches " + i);
            }
            this.asBinder = i;
            return this;
        }

        public onNavigationEvent onExtraCallback(int i) {
            if (i <= 0 || i > 2) {
                throw new IllegalArgumentException("invalid matchMode " + i);
            }
            this.onNavigationEvent = i;
            return this;
        }

        public onNavigationEvent onWarmupCompleted(boolean z) {
            this.onExtraCallbackWithResult = z;
            return this;
        }

        public onNavigationEvent onWarmupCompleted(int i) {
            this.onTransact = i;
            return this;
        }

        public onNavigationEvent onNavigationEvent(boolean z) {
            this.access100 = z;
            return this;
        }

        public onNavigationEvent onExtraCallback(boolean z) {
            this.IAuthTabCallbackStubProxy = z;
            return this;
        }

        public onNavigationEvent IAuthTabCallback(boolean z) {
            this.getInterfaceDescriptor = z;
            return this;
        }

        public onNavigationEvent IAuthTabCallback(long j, long j2) {
            if (j <= 0 || j2 <= 0) {
                throw new IllegalArgumentException("maxDeviceAgeMillis and taskIntervalMillis must be > 0");
            }
            this.onExtraCallback = j;
            this.IAuthTabCallback = j2;
            return this;
        }

        public TTAppOpenAdActivity5 onExtraCallback() {
            if (this.IAuthTabCallbackStub == 0 && this.IAuthTabCallbackDefault == 0) {
                onWarmupCompleted();
            }
            return new TTAppOpenAdActivity5(this.access000, this.onWarmupCompleted, this.asInterface, this.onNavigationEvent, this.asBinder, this.onExtraCallbackWithResult, this.onTransact, this.access100, this.IAuthTabCallbackStubProxy, this.getInterfaceDescriptor, this.onExtraCallback, this.IAuthTabCallback, this.IAuthTabCallbackDefault, this.IAuthTabCallbackStub);
        }

        private void onWarmupCompleted() {
            int i = this.access000;
            if (i == 1) {
                this.IAuthTabCallbackDefault = 2000L;
                this.IAuthTabCallbackStub = 3000L;
            } else if (i == 2) {
                this.IAuthTabCallbackDefault = 0L;
                this.IAuthTabCallbackStub = 0L;
            } else {
                this.IAuthTabCallbackDefault = 500L;
                this.IAuthTabCallbackStub = 4500L;
            }
        }
    }
}
