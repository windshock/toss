package o;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.ExoPlayerImplExternalSyntheticLambda12;
import o.ExoPlayerImplExternalSyntheticLambda16;
import o.ExoPlayerImplExternalSyntheticLambda18;
import o.ExoPlayerImplExternalSyntheticLambda19;
import o.ExoPlayerImplExternalSyntheticLambda2;
import o.ExoPlayerImplExternalSyntheticLambda20;
import o.ExoPlayerImplExternalSyntheticLambda21;
import o.ExoPlayerImplExternalSyntheticLambda22;
import o.ExoPlayerImplExternalSyntheticLambda23;
import o.ExoPlayerImplExternalSyntheticLambda28;
import o.onPlaybackInfoUpdate;

/* loaded from: classes.dex */
public abstract class ExoPlayerImplExternalSyntheticLambda14<T extends ExoPlayerImplExternalSyntheticLambda12> {
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda20> IAuthTabCallback;
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda21> IAuthTabCallbackStub;
    private static int ICustomTabsCallback = 1;
    private static ExoPlayerImplExternalSyntheticLambda14<?> access000 = null;
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda16> asBinder;
    private static Map<Integer, ExoPlayerImplExternalSyntheticLambda14<?>> asInterface = new HashMap();
    private static int extraCallback = 1;
    private static int getInterfaceDescriptor;
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda19> onExtraCallback;
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda2> onExtraCallbackWithResult;
    public static final ExoPlayerImplExternalSyntheticLambda14<onPlaybackInfoUpdate> onNavigationEvent;
    private static ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda22> onTransact;
    public static final ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda23> onWarmupCompleted;
    private static int readTypedObject;
    public final int IAuthTabCallbackDefault;
    private final ExoPlayerImplExternalSyntheticLambda17 IAuthTabCallbackStubProxy;
    private final int IAuthTabCallback_Parcel;
    private final Set<ExoPlayerImplExternalSyntheticLambda17> access100;

    public abstract ByteArrayDataSourceExternalSyntheticLambda0<T> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp);

    /* synthetic */ ExoPlayerImplExternalSyntheticLambda14(int i, int i2, ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17, Set set, byte b) {
        this(i, i2, exoPlayerImplExternalSyntheticLambda17, set);
    }

    static {
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda20> exoPlayerImplExternalSyntheticLambda14 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda20>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.9
            private static int asInterface = 0;
            private static int onTransact = 1;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda20> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda20.onExtraCallback onextracallback = new ExoPlayerImplExternalSyntheticLambda20.onExtraCallback(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = onTransact;
                int i3 = (i2 & 105) + (i2 | 105);
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return onextracallback;
            }
        };
        IAuthTabCallback = exoPlayerImplExternalSyntheticLambda14;
        ExoPlayerImplExternalSyntheticLambda14<onPlaybackInfoUpdate> exoPlayerImplExternalSyntheticLambda142 = new ExoPlayerImplExternalSyntheticLambda14<onPlaybackInfoUpdate>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.3
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<onPlaybackInfoUpdate> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                onPlaybackInfoUpdate.onWarmupCompleted onwarmupcompleted = new onPlaybackInfoUpdate.onWarmupCompleted(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface + 77;
                onTransact = i2 % 128;
                int i3 = i2 % 2;
                return onwarmupcompleted;
            }
        };
        onNavigationEvent = exoPlayerImplExternalSyntheticLambda142;
        onTransact = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda22>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback, ExoPlayerImplExternalSyntheticLambda17.onExtraCallbackWithResult(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback, ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted)) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.10
            private static int asInterface = 1;
            private static int onTransact;

            {
                int i = 1;
                int i2 = 3;
                byte b = 0;
            }

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda22> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda22.onExtraCallbackWithResult onextracallbackwithresult = new ExoPlayerImplExternalSyntheticLambda22.onExtraCallbackWithResult(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface + 11;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallbackwithresult;
                }
                throw new NullPointerException();
            }
        };
        access000 = new ExoPlayerImplExternalSyntheticLambda14(ExoPlayerImplExternalSyntheticLambda17.onExtraCallbackWithResult(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback, ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted)) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.6
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<?> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda28.IAuthTabCallback iAuthTabCallback = new ExoPlayerImplExternalSyntheticLambda28.IAuthTabCallback(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface;
                int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return iAuthTabCallback;
            }
        };
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda23> exoPlayerImplExternalSyntheticLambda143 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda23>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.8
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda23> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda23.onWarmupCompleted onwarmupcompleted = new ExoPlayerImplExternalSyntheticLambda23.onWarmupCompleted(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface + 77;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return onwarmupcompleted;
                }
                throw new NullPointerException();
            }
        };
        onWarmupCompleted = exoPlayerImplExternalSyntheticLambda143;
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda2> exoPlayerImplExternalSyntheticLambda144 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda2>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.7
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda2> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda2.onExtraCallback onextracallback = new ExoPlayerImplExternalSyntheticLambda2.onExtraCallback(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface;
                int i3 = (i2 ^ 101) + ((i2 & 101) << 1);
                onTransact = i3 % 128;
                int i4 = i3 % 2;
                return onextracallback;
            }
        };
        onExtraCallbackWithResult = exoPlayerImplExternalSyntheticLambda144;
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda19> exoPlayerImplExternalSyntheticLambda145 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda19>(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.2
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda19> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda19.IAuthTabCallback iAuthTabCallback = new ExoPlayerImplExternalSyntheticLambda19.IAuthTabCallback(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = onTransact + 55;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return iAuthTabCallback;
            }
        };
        onExtraCallback = exoPlayerImplExternalSyntheticLambda145;
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda21> exoPlayerImplExternalSyntheticLambda146 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda21>(ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.14
            private static int asInterface = 0;
            private static int onTransact = 1;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda21> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda21.onExtraCallbackWithResult onextracallbackwithresult = new ExoPlayerImplExternalSyntheticLambda21.onExtraCallbackWithResult(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = onTransact + 17;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                return onextracallbackwithresult;
            }
        };
        IAuthTabCallbackStub = exoPlayerImplExternalSyntheticLambda146;
        ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda16> exoPlayerImplExternalSyntheticLambda147 = new ExoPlayerImplExternalSyntheticLambda14<ExoPlayerImplExternalSyntheticLambda16>(ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.5
            private static int asInterface = 1;
            private static int onTransact;

            @Override // o.ExoPlayerImplExternalSyntheticLambda14
            public final ByteArrayDataSourceExternalSyntheticLambda0<ExoPlayerImplExternalSyntheticLambda16> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                int i = 2 % 2;
                ExoPlayerImplExternalSyntheticLambda16.onExtraCallback onextracallback = new ExoPlayerImplExternalSyntheticLambda16.onExtraCallback(reorderingBufferQueueBuffersWithTimestamp);
                int i2 = asInterface + 1;
                onTransact = i2 % 128;
                if (i2 % 2 == 0) {
                    return onextracallback;
                }
                throw new NullPointerException();
            }
        };
        asBinder = exoPlayerImplExternalSyntheticLambda147;
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda14.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda14);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda142.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda142);
        asInterface.put(Integer.valueOf(onTransact.onNavigationEvent()), onTransact);
        asInterface.put(Integer.valueOf(access000.onNavigationEvent()), access000);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda143.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda143);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda144.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda144);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda145.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda145);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda146.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda146);
        asInterface.put(Integer.valueOf(exoPlayerImplExternalSyntheticLambda147.onNavigationEvent()), exoPlayerImplExternalSyntheticLambda147);
        int i = readTypedObject + 57;
        extraCallback = i % 128;
        if (i % 2 == 0) {
            throw new NullPointerException();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlayerImplExternalSyntheticLambda14(int i, int i2, Set<ExoPlayerImplExternalSyntheticLambda17> set) {
        ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17;
        if (set.contains(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback)) {
            exoPlayerImplExternalSyntheticLambda17 = ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback;
        } else {
            exoPlayerImplExternalSyntheticLambda17 = ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted;
        }
        this(i, i2, exoPlayerImplExternalSyntheticLambda17, set);
    }

    public ExoPlayerImplExternalSyntheticLambda14(int i, int i2, ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17) {
        this(1, i2, exoPlayerImplExternalSyntheticLambda17, ExoPlayerImplExternalSyntheticLambda17.onExtraCallbackWithResult(exoPlayerImplExternalSyntheticLambda17));
    }

    private ExoPlayerImplExternalSyntheticLambda14(int i, int i2, ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17, Set<ExoPlayerImplExternalSyntheticLambda17> set) {
        this.IAuthTabCallback_Parcel = i;
        this.IAuthTabCallbackDefault = i2;
        this.access100 = set;
        this.IAuthTabCallbackStubProxy = exoPlayerImplExternalSyntheticLambda17;
    }

    public final ExoPlayerImplExternalSyntheticLambda14<T> onExtraCallback(ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = (i2 & 87) + (i2 | 87);
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallbackStubProxy != exoPlayerImplExternalSyntheticLambda17) {
            if (!this.access100.contains(exoPlayerImplExternalSyntheticLambda17)) {
                throw new IllegalArgumentException();
            }
            ExoPlayerImplExternalSyntheticLambda14<T> exoPlayerImplExternalSyntheticLambda14 = (ExoPlayerImplExternalSyntheticLambda14<T>) new ExoPlayerImplExternalSyntheticLambda14<T>(this.IAuthTabCallback_Parcel, this.IAuthTabCallbackDefault, exoPlayerImplExternalSyntheticLambda17, this.access100) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.1
                private static int asInterface = 0;
                private static int getInterfaceDescriptor = 1;

                {
                    byte b = 0;
                }

                @Override // o.ExoPlayerImplExternalSyntheticLambda14
                public final ByteArrayDataSourceExternalSyntheticLambda0<T> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                    int i5 = 2 % 2;
                    int i6 = getInterfaceDescriptor + 107;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda142 = ExoPlayerImplExternalSyntheticLambda14.this;
                    if (i7 == 0) {
                        return exoPlayerImplExternalSyntheticLambda142.onExtraCallbackWithResult(reorderingBufferQueueBuffersWithTimestamp);
                    }
                    exoPlayerImplExternalSyntheticLambda142.onExtraCallbackWithResult(reorderingBufferQueueBuffersWithTimestamp);
                    throw new NullPointerException();
                }
            };
            int i5 = getInterfaceDescriptor;
            int i6 = ((i5 | 43) << 1) - (i5 ^ 43);
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 != 0) {
                return exoPlayerImplExternalSyntheticLambda14;
            }
            throw new ArithmeticException();
        }
        int i7 = (i2 & 123) + (i2 | 123);
        int i8 = i7 % 128;
        ICustomTabsCallback = i8;
        int i9 = i7 % 2;
        int i10 = i8 + 57;
        getInterfaceDescriptor = i10 % 128;
        int i11 = i10 % 2;
        return this;
    }

    public static ExoPlayerImplExternalSyntheticLambda14 onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback;
        int i5 = ((i4 | 17) << 1) - (i4 ^ 17);
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        if (i == 1) {
            for (ExoPlayerImplExternalSyntheticLambda14<?> exoPlayerImplExternalSyntheticLambda14 : asInterface.values()) {
                int i7 = ICustomTabsCallback;
                int i8 = ((i7 | 45) << 1) - (i7 ^ 45);
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                if (exoPlayerImplExternalSyntheticLambda14.IAuthTabCallbackDefault == i2) {
                    int i10 = getInterfaceDescriptor;
                    int i11 = ((i10 | 7) << 1) - (i10 ^ 7);
                    int i12 = i11 % 128;
                    ICustomTabsCallback = i12;
                    int i13 = i11 % 2;
                    if (i == ((ExoPlayerImplExternalSyntheticLambda14) exoPlayerImplExternalSyntheticLambda14).IAuthTabCallback_Parcel) {
                        int i14 = i12 + 31;
                        getInterfaceDescriptor = i14 % 128;
                        int i15 = i14 % 2;
                        return exoPlayerImplExternalSyntheticLambda14;
                    }
                }
                int i16 = getInterfaceDescriptor + 121;
                ICustomTabsCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 2 / 2;
                }
            }
            int i18 = getInterfaceDescriptor;
            int i19 = (i18 ^ 51) + ((i18 & 51) << 1);
            ICustomTabsCallback = i19 % 128;
            int i20 = i19 % 2;
        } else if (i == 2 || i == 3 || i == 4) {
            return new ExoPlayerImplExternalSyntheticLambda14(i, i2, ExoPlayerImplExternalSyntheticLambda17.onExtraCallbackWithResult(ExoPlayerImplExternalSyntheticLambda17.IAuthTabCallback, ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted)) { // from class: o.ExoPlayerImplExternalSyntheticLambda14.4
                private static int asInterface = 1;
                private static int onTransact;

                @Override // o.ExoPlayerImplExternalSyntheticLambda14
                public final ByteArrayDataSourceExternalSyntheticLambda0<?> onExtraCallbackWithResult(ReorderingBufferQueueBuffersWithTimestamp reorderingBufferQueueBuffersWithTimestamp) {
                    int i21 = 2 % 2;
                    ExoPlayerImplExternalSyntheticLambda18.onExtraCallback onextracallback = new ExoPlayerImplExternalSyntheticLambda18.onExtraCallback(reorderingBufferQueueBuffersWithTimestamp);
                    int i22 = onTransact;
                    int i23 = (i22 & 33) + (i22 | 33);
                    asInterface = i23 % 128;
                    if (i23 % 2 != 0) {
                        return onextracallback;
                    }
                    throw new NullPointerException();
                }
            };
        }
        throw new ExoPlayerImplExternalSyntheticLambda11();
    }

    public final int onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 23;
        ICustomTabsCallback = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallbackDefault;
        }
        throw new NullPointerException();
    }

    public final ExoPlayerImplExternalSyntheticLambda17 onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 != 0) {
            throw new NullPointerException();
        }
        ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17 = this.IAuthTabCallbackStubProxy;
        int i4 = i2 + 73;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 == 0) {
            return exoPlayerImplExternalSyntheticLambda17;
        }
        throw new NullPointerException();
    }

    public final boolean IAuthTabCallback() {
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(this);
        int i2 = ~iIdentityHashCode;
        int i3 = (((~((i2 & 932370218) | (i2 ^ 932370218))) | (~((iIdentityHashCode ^ (-1127251087)) | (iIdentityHashCode & (-1127251087))))) * 333) + 1764526719;
        int i4 = ~((932370218 & iIdentityHashCode) | (iIdentityHashCode ^ 932370218));
        int i5 = ~((~iIdentityHashCode) | (-1127251087));
        int i6 = ((i5 & i4) | (i4 ^ i5)) * 333;
        int i7 = (i3 ^ i6) + ((i6 & i3) << 1);
        int iMyUid = Process.myUid();
        int i8 = (iMyUid ^ (-517150885)) | (iMyUid & (-517150885));
        int i9 = -(-(((i8 & (-1469956324)) | (i8 ^ (-1469956324))) * (-627)));
        int i10 = (i9 & 1361360920) + (i9 | 1361360920);
        int i11 = -(-(((~((517150884 & iMyUid) | (iMyUid ^ 517150884))) | 1469956323) * (-627)));
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = ~iMyUid;
        if (i7 > (i12 - (~(((~((iMyUid & 1469956323) | (iMyUid ^ 1469956323))) | (~(((-517150885) & i13) | (i13 ^ (-517150885))))) * 627))) - 1) {
            ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17 = ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted;
            throw new NullPointerException();
        }
        if (this.IAuthTabCallbackStubProxy != ExoPlayerImplExternalSyntheticLambda17.onWarmupCompleted) {
            return false;
        }
        int i14 = ICustomTabsCallback + 31;
        getInterfaceDescriptor = i14 % 128;
        if (i14 % 2 == 0) {
            return true;
        }
        throw new ArithmeticException();
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 93;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        if (this == obj) {
            int i5 = i2 + 35;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (obj != null) {
            int i7 = i2 + 39;
            ICustomTabsCallback = i7 % 128;
            if (i7 % 2 == 0) {
                throw new NullPointerException();
            }
            if (getClass() == obj.getClass()) {
                ExoPlayerImplExternalSyntheticLambda14 exoPlayerImplExternalSyntheticLambda14 = (ExoPlayerImplExternalSyntheticLambda14) obj;
                if (onNavigationEvent() == exoPlayerImplExternalSyntheticLambda14.onNavigationEvent()) {
                    int i8 = getInterfaceDescriptor;
                    int i9 = i8 + 23;
                    ICustomTabsCallback = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = exoPlayerImplExternalSyntheticLambda14.IAuthTabCallback_Parcel;
                        throw new NullPointerException();
                    }
                    if (this.IAuthTabCallback_Parcel == exoPlayerImplExternalSyntheticLambda14.IAuthTabCallback_Parcel) {
                        int i11 = i8 + 35;
                        ICustomTabsCallback = i11 % 128;
                        if (i11 % 2 == 0) {
                            ExoPlayerImplExternalSyntheticLambda17 exoPlayerImplExternalSyntheticLambda17 = exoPlayerImplExternalSyntheticLambda14.IAuthTabCallbackStubProxy;
                            throw new NullPointerException();
                        }
                        if (this.IAuthTabCallbackStubProxy == exoPlayerImplExternalSyntheticLambda14.IAuthTabCallbackStubProxy) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = (i2 & 67) + (i2 | 67);
        ICustomTabsCallback = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(this.IAuthTabCallback_Parcel);
            objArr[0] = Integer.valueOf(onNavigationEvent());
            objArr[2] = this.IAuthTabCallbackStubProxy;
            iHashCode = Arrays.hashCode(objArr);
        } else {
            iHashCode = Arrays.hashCode(new Object[]{Integer.valueOf(this.IAuthTabCallback_Parcel), Integer.valueOf(onNavigationEvent()), this.IAuthTabCallbackStubProxy});
        }
        int i4 = getInterfaceDescriptor + 93;
        ICustomTabsCallback = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }
}
