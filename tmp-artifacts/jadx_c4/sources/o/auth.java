package o;

import android.content.Context;
import android.os.Process;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.Configuration;
import com.bugsnag.android.Event;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.OnErrorCallback;
import com.bugsnag.android.OnSendCallback;
import com.bugsnag.android.OnSessionCallback;
import com.bugsnag.android.Session;
import com.bugsnag.android.Severity;
import im.toss.features.verify.oneclicklogin.impl.view.presentation.LoginTokenConsentViewModel_HiltModules;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.auth;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class auth {
    private static ALCIDAuth IAuthTabCallback = null;
    private static final AtomicBoolean IAuthTabCallbackDefault;
    private static int IAuthTabCallbackStub = 0;
    private static int IAuthTabCallbackStubProxy = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 1;
    private static final AtomicBoolean asBinder;
    private static String asInterface = null;
    private static final boolean onExtraCallback = false;
    private static final String onExtraCallbackWithResult;
    public static final auth onNavigationEvent;
    private static final ConcurrentLinkedQueue<IAuthTabCallback> onTransact;
    private static final AtomicBoolean onWarmupCompleted;

    public static final /* synthetic */ class onNavigationEvent {
        public static final /* synthetic */ int[] IAuthTabCallback;
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;

        static {
            int[] iArr = new int[onWarmupCompleted.values().length];
            try {
                iArr[onWarmupCompleted.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[onWarmupCompleted.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[onWarmupCompleted.ERROR.ordinal()] = 3;
                int i = onWarmupCompleted + 59;
                onExtraCallback = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            IAuthTabCallback = iArr;
            int i4 = onWarmupCompleted + 109;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i | i3);
        int i12 = (~(i3 | i)) | (~(i7 | i9)) | i8;
        int i13 = i4 + i + i2 + (62936680 * i5) + ((-2032430997) * i6);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i4) + 797966336 + (1756943451 * i) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i2) + ((-264241152) * i5) + ((-222822400) * i6) + (2040594432 * i14);
        int i16 = ((i4 * 1175661207) - 43826732) + (i * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i2 * 1175660433) + (i5 * 1188219112) + (i6 * (-816965221)) + (i14 * 1798373376);
        int i17 = i15 + (i16 * i16 * 914292736);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? onExtraCallback(objArr) : IAuthTabCallbackStub(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr) : onWarmupCompleted(objArr) : IAuthTabCallback(objArr);
    }

    public static /* synthetic */ boolean IAuthTabCallback(Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(event);
        int i4 = IAuthTabCallback_Parcel + 47;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnNavigationEvent;
        }
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(Session session) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 3;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallbackWithResult(session);
            throw null;
        }
        boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(session);
        int i3 = IAuthTabCallbackStub + 33;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 5 / 0;
        }
        return zOnExtraCallbackWithResult;
    }

    public static /* synthetic */ boolean onExtraCallback(onWarmupCompleted onwarmupcompleted, Map map, String str, String str2, Event event) {
        boolean zBooleanValue;
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 79;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            zBooleanValue = ((Boolean) IAuthTabCallback(456451406, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, str, str2, event}, iOnNavigationEvent, -456451402, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
            int i3 = 46 / 0;
        } else {
            int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            zBooleanValue = ((Boolean) IAuthTabCallback(456451406, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, str, str2, event}, iOnNavigationEvent2, -456451402, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
        }
        int i4 = IAuthTabCallbackStub + 53;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnWarmupCompleted = onWarmupCompleted(event);
        int i4 = IAuthTabCallbackStub + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return zOnWarmupCompleted;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, Map map, Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
            ((Boolean) IAuthTabCallback(-67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, event}, iOnNavigationEvent, 67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
            throw null;
        }
        int iOnNavigationEvent2 = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        boolean zBooleanValue = ((Boolean) IAuthTabCallback(-67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, event}, iOnNavigationEvent2, 67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
        int i3 = IAuthTabCallbackStub + 29;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private auth() {
    }

    static {
        auth authVar = new auth();
        onNavigationEvent = authVar;
        onExtraCallbackWithResult = authVar.getClass().getSimpleName();
        IAuthTabCallbackDefault = new AtomicBoolean(false);
        onWarmupCompleted = new AtomicBoolean(false);
        asBinder = new AtomicBoolean(false);
        onTransact = new ConcurrentLinkedQueue<>();
        int i = access000 + 125;
        IAuthTabCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onWarmupCompleted {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onWarmupCompleted[] $VALUES;
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        private static int onWarmupCompleted;
        public static final onWarmupCompleted ERROR = new onWarmupCompleted("ERROR", 0);
        public static final onWarmupCompleted WARNING = new onWarmupCompleted("WARNING", 1);
        public static final onWarmupCompleted INFO = new onWarmupCompleted("INFO", 2);

        private static final /* synthetic */ onWarmupCompleted[] $values() {
            onWarmupCompleted[] onwarmupcompletedArr;
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 47;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            if (i2 % 2 == 0) {
                onWarmupCompleted onwarmupcompleted = ERROR;
                onWarmupCompleted onwarmupcompleted2 = WARNING;
                onWarmupCompleted onwarmupcompleted3 = INFO;
                onwarmupcompletedArr = new onWarmupCompleted[3];
                onwarmupcompletedArr[0] = onwarmupcompleted;
                onwarmupcompletedArr[1] = onwarmupcompleted2;
                onwarmupcompletedArr[3] = onwarmupcompleted3;
            } else {
                onwarmupcompletedArr = new onWarmupCompleted[]{ERROR, WARNING, INFO};
            }
            int i4 = i3 + 101;
            onWarmupCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                return onwarmupcompletedArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static EnumEntries<onWarmupCompleted> getEntries() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted;
            int i3 = i2 + 27;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<onWarmupCompleted> enumEntries = $ENTRIES;
            int i5 = i2 + 101;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 29 / 0;
            }
            return enumEntries;
        }

        public static onWarmupCompleted valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) Enum.valueOf(onWarmupCompleted.class, str);
            int i4 = IAuthTabCallback + 61;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompleted;
        }

        public static onWarmupCompleted[] values() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 71;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted[] onwarmupcompletedArr = (onWarmupCompleted[]) $VALUES.clone();
            int i4 = IAuthTabCallback + 9;
            onWarmupCompleted = i4 % 128;
            int i5 = i4 % 2;
            return onwarmupcompletedArr;
        }

        private onWarmupCompleted(String str, int i) {
        }

        static {
            onWarmupCompleted[] onwarmupcompletedArr$values = $values();
            $VALUES = onwarmupcompletedArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onwarmupcompletedArr$values);
            int i = onNavigationEvent + 107;
            onExtraCallback = i % 128;
            if (i % 2 == 0) {
                int i2 = 31 / 0;
            }
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallbackDefault = 0;
        private static int IAuthTabCallbackStubProxy = 1;
        private final Context IAuthTabCallback;
        private final String IAuthTabCallbackStub;
        private final boolean asBinder;
        private final String asInterface;
        private final Configuration onExtraCallback;
        private final ALCIDAuth onExtraCallbackWithResult;
        private final boolean onNavigationEvent;
        private final String onTransact;
        private final boolean onWarmupCompleted;

        public onExtraCallback(boolean z, boolean z2, @NotNull Context context, @NotNull String str, @NotNull String str2, boolean z3, @NotNull Configuration configuration, @Nullable ALCIDAuth aLCIDAuth) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(configuration, "");
            this.onWarmupCompleted = z;
            this.onNavigationEvent = z2;
            this.IAuthTabCallback = context;
            this.IAuthTabCallbackStub = str;
            this.onTransact = str2;
            this.asBinder = z3;
            this.onExtraCallback = configuration;
            this.onExtraCallbackWithResult = aLCIDAuth;
            int length = str.length();
            int i = 2 % 2;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (str.charAt(i2) == '-') {
                        str = str.substring(0, i2);
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        int i3 = IAuthTabCallbackStubProxy + 37;
                        IAuthTabCallbackDefault = i3 % 128;
                        int i4 = i3 % 2;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            this.asInterface = str;
            int i5 = IAuthTabCallbackStubProxy + 67;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 115;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            boolean z = this.onWarmupCompleted;
            int i5 = i2 + 41;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return z;
        }

        public final boolean onExtraCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 103;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            boolean z = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 9 / 0;
            }
            return z;
        }

        public final Context IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 9;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            Context context = this.IAuthTabCallback;
            int i5 = i3 + 67;
            IAuthTabCallbackDefault = i5 % 128;
            int i6 = i5 % 2;
            return context;
        }

        public final String IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 31;
            IAuthTabCallbackDefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.IAuthTabCallbackStub;
            int i5 = i2 + 97;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 76 / 0;
            }
            return str;
        }

        public final String asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 55;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            throw null;
        }

        public final boolean onTransact() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault;
            int i3 = i2 + 11;
            IAuthTabCallbackStubProxy = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            boolean z = this.asBinder;
            int i4 = i2 + 79;
            IAuthTabCallbackStubProxy = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(boolean z, boolean z2, Context context, String str, String str2, boolean z3, Configuration configuration, ALCIDAuth aLCIDAuth, int i, DefaultConstructorMarker defaultConstructorMarker) {
            Configuration configuration2;
            ALCIDAuth aLCIDAuth2;
            if ((i & 64) != 0) {
                Configuration configurationLoad = Configuration.load(context);
                Intrinsics.checkNotNullExpressionValue(configurationLoad, "");
                configuration2 = configurationLoad;
            } else {
                configuration2 = configuration;
            }
            if ((i & 128) != 0) {
                int i2 = IAuthTabCallbackDefault + 93;
                int i3 = i2 % 128;
                IAuthTabCallbackStubProxy = i3;
                if (i2 % 2 == 0) {
                    int i4 = 13 / 0;
                }
                int i5 = i3 + 115;
                IAuthTabCallbackDefault = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
                aLCIDAuth2 = null;
            } else {
                aLCIDAuth2 = aLCIDAuth;
            }
            this(z, z2, context, str, str2, z3, configuration2, aLCIDAuth2);
        }

        public final Configuration onNavigationEvent() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 5;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.onExtraCallback;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final ALCIDAuth onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 75;
            IAuthTabCallbackDefault = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onExtraCallbackWithResult;
            }
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 61;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            String str = this.asInterface;
            int i5 = i3 + 43;
            IAuthTabCallbackDefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 57 / 0;
            }
            return str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x007d, PHI: r2
      0x0062: PHI (r2v7 boolean) = (r2v6 boolean), (r2v9 boolean) binds: [B:15:0x0060, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x007d, blocks: (B:6:0x002f, B:10:0x0056, B:18:0x0067, B:16:0x0062, B:14:0x005e, B:20:0x0079), top: B:25:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #0 {all -> 0x007d, blocks: (B:6:0x002f, B:10:0x0056, B:18:0x0067, B:16:0x0062, B:14:0x005e, B:20:0x0079), top: B:25:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        boolean z;
        auth authVar = (auth) objArr[0];
        onExtraCallback onextracallback = (onExtraCallback) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(onextracallback, "");
        IAuthTabCallbackDefault.set(onextracallback.onExtraCallbackWithResult());
        AtomicBoolean atomicBoolean = onWarmupCompleted;
        atomicBoolean.set(onextracallback.onExtraCallback());
        if (!onextracallback.onExtraCallbackWithResult()) {
            atomicBoolean.get();
            return null;
        }
        try {
            Bugsnag.start(onextracallback.IAuthTabCallback(), authVar.onExtraCallbackWithResult(onextracallback));
            asBinder.set(true);
            IAuthTabCallback = onextracallback.onWarmupCompleted();
            if (atomicBoolean.get()) {
                int i2 = IAuthTabCallback_Parcel + 119;
                IAuthTabCallbackStub = i2 % 128;
                if (i2 % 2 != 0) {
                    z = onExtraCallback;
                    int i3 = 18 / 0;
                    if (z) {
                        Process.myPid();
                    }
                    if (z) {
                        getFaceFeature.IAuthTabCallback.IAuthTabCallback(onextracallback.IAuthTabCallback());
                        int i4 = IAuthTabCallback_Parcel + 123;
                        IAuthTabCallbackStub = i4 % 128;
                        int i5 = i4 % 2;
                    }
                } else {
                    z = onExtraCallback;
                    if (z) {
                    }
                    if (z) {
                    }
                }
            }
            authVar.onWarmupCompleted();
            return null;
        } catch (Throwable th) {
            authVar.onExtraCallbackWithResult();
            throw th;
        }
    }

    private static final boolean onWarmupCompleted(Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 79;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        boolean z = IAuthTabCallbackDefault.get();
        int i4 = IAuthTabCallbackStub + 85;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean onExtraCallbackWithResult(Session session) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 21;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(session, "");
            IAuthTabCallbackDefault.get();
            throw null;
        }
        Intrinsics.checkNotNullParameter(session, "");
        boolean z = IAuthTabCallbackDefault.get();
        int i3 = IAuthTabCallback_Parcel + 111;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 15 / 0;
        }
        return z;
    }

    private static final boolean onNavigationEvent(Event event) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 99;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        boolean z = IAuthTabCallbackDefault.get();
        int i4 = IAuthTabCallbackStub + 47;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return z;
    }

    private final Configuration onExtraCallbackWithResult(onExtraCallback onextracallback) {
        int i = 2 % 2;
        String upperCase = onextracallback.asBinder().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        asInterface = upperCase;
        Configuration configurationOnNavigationEvent = onextracallback.onNavigationEvent();
        configurationOnNavigationEvent.addOnError(new OnErrorCallback() { // from class: im.toss.core.utils.AbnormalLogger$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final boolean onError(Event event) {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 55;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                boolean zOnExtraCallbackWithResult = auth.onExtraCallbackWithResult(event);
                int i5 = onWarmupCompleted + 73;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 == 0) {
                    return zOnExtraCallbackWithResult;
                }
                throw null;
            }
        });
        configurationOnNavigationEvent.addOnSession(new OnSessionCallback() { // from class: im.toss.core.utils.AbnormalLogger$$ExternalSyntheticLambda3
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final boolean onSession(Session session) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 29;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    auth.onExtraCallback(session);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                boolean zOnExtraCallback = auth.onExtraCallback(session);
                int i4 = onWarmupCompleted + 119;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 19 / 0;
                }
                return zOnExtraCallback;
            }
        });
        configurationOnNavigationEvent.addOnSend(new OnSendCallback() { // from class: im.toss.core.utils.AbnormalLogger$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final boolean onSend(Event event) {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 39;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                boolean zIAuthTabCallback = auth.IAuthTabCallback(event);
                if (i4 == 0) {
                    int i5 = 14 / 0;
                }
                return zIAuthTabCallback;
            }
        });
        if (!onextracallback.onTransact()) {
            configurationOnNavigationEvent.setPersistenceDirectory(new File(onextracallback.IAuthTabCallback().getCacheDir(), getFaceFeature.IAuthTabCallback.IAuthTabCallback(onextracallback.IAuthTabCallback())));
            int i2 = IAuthTabCallbackStub + 3;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
        }
        configurationOnNavigationEvent.setAppVersion(onextracallback.asInterface());
        configurationOnNavigationEvent.addMetadata("APP", "versionFullName", onextracallback.IAuthTabCallbackDefault());
        configurationOnNavigationEvent.addMetadata("USER", "region", upperCase);
        return configurationOnNavigationEvent;
    }

    public final void onWarmupCompleted(boolean z) {
        synchronized (this) {
            if (!asBinder.get()) {
                IAuthTabCallbackDefault.set(z);
                return;
            }
            if (z) {
                onExtraCallback();
            } else {
                onExtraCallbackWithResult();
            }
        }
    }

    private final void onExtraCallback() {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            NativeInterface.setAutoNotify(true);
            obj = kotlin.Result.constructor-impl(Boolean.valueOf(Bugsnag.resumeSession()));
            int i2 = IAuthTabCallback_Parcel + 91;
            IAuthTabCallbackStub = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onNavigationEvent(obj)) {
            int i4 = IAuthTabCallbackStub + 121;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                IAuthTabCallbackDefault.set(false);
                return;
            } else {
                IAuthTabCallbackDefault.set(true);
                return;
            }
        }
        onExtraCallbackWithResult();
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackDefault.set(false);
        try {
            Result.Companion companion = kotlin.Result.Companion;
            NativeInterface.setAutoNotify(false);
            kotlin.Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = kotlin.Result.Companion;
            Bugsnag.pauseSession();
            kotlin.Result.constructor-impl(Unit.INSTANCE);
            int i4 = IAuthTabCallbackStub + 53;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th2) {
            Result.Companion companion4 = kotlin.Result.Companion;
            kotlin.Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    public final boolean onNavigationEvent(@NotNull Context context) {
        boolean zOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 51;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            zOnExtraCallback = ALCDetectionMode.onExtraCallback(cacheDir);
            int i3 = 16 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            File cacheDir2 = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir2, "");
            zOnExtraCallback = ALCDetectionMode.onExtraCallback(cacheDir2);
        }
        int i4 = IAuthTabCallback_Parcel + 27;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return zOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (!IAuthTabCallbackDefault.get()) {
            return;
        }
        int i4 = IAuthTabCallback_Parcel + 107;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 18 / 0;
            if (!asBinder.get()) {
                return;
            }
        } else if (!asBinder.get()) {
            return;
        }
        while (true) {
            IAuthTabCallback iAuthTabCallbackPoll = onTransact.poll();
            if (iAuthTabCallbackPoll == null) {
                return;
            }
            if (onWarmupCompleted.get() && onExtraCallback) {
                Objects.toString(iAuthTabCallbackPoll);
            }
            Bugsnag.leaveBreadcrumb(iAuthTabCallbackPoll.onWarmupCompleted(), iAuthTabCallbackPoll.onExtraCallbackWithResult(), BreadcrumbType.MANUAL);
            if (IAuthTabCallback != null) {
                int i6 = IAuthTabCallbackStub + 75;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                iAuthTabCallbackPoll.onWarmupCompleted();
                iAuthTabCallbackPoll.onExtraCallbackWithResult();
                int i8 = IAuthTabCallbackStub + 111;
                IAuthTabCallback_Parcel = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 3;
                }
            }
        }
    }

    public static final class IAuthTabCallbackDefault extends Throwable {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        IAuthTabCallbackDefault() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0052 A[PHI: r6
          0x0052: PHI (r6v4 java.lang.StackTraceElement) = (r6v3 java.lang.StackTraceElement), (r6v10 java.lang.StackTraceElement) binds: [B:10:0x0050, B:7:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // java.lang.Throwable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public StackTraceElement[] getStackTrace() {
            StackTraceElement stackTraceElement;
            int i = 2 % 2;
            StackTraceElement[] stackTrace = super.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            ArrayList arrayList = new ArrayList();
            int length = stackTrace.length;
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = onWarmupCompleted + 65;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    stackTraceElement = stackTrace[i2];
                    int i4 = 37 / 0;
                    if (!Intrinsics.areEqual(stackTraceElement.getClassName(), auth.onNavigationEvent.getClass().getName())) {
                        arrayList.add(stackTraceElement);
                        int i5 = onExtraCallbackWithResult + 27;
                        onWarmupCompleted = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 4 % 3;
                        }
                    }
                } else {
                    stackTraceElement = stackTrace[i2];
                    if (!Intrinsics.areEqual(stackTraceElement.getClassName(), auth.onNavigationEvent.getClass().getName())) {
                    }
                }
            }
            return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) throws NoWhenBranchMatchedException {
        Severity severity;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        String str2 = (String) objArr[3];
        Event event = (Event) objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(event, "");
            List errors = event.getErrors();
            Intrinsics.checkNotNullExpressionValue(errors, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(event, "");
        List errors2 = event.getErrors();
        Intrinsics.checkNotNullExpressionValue(errors2, "");
        com.bugsnag.android.Error error = (com.bugsnag.android.Error) CollectionsKt.firstOrNull(errors2);
        if (error == null) {
            int i3 = IAuthTabCallbackStub + 71;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        error.setErrorClass(str);
        error.setErrorMessage(str2);
        int i5 = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()];
        if (i5 == 1) {
            severity = Severity.INFO;
        } else if (i5 != 2) {
            int i6 = IAuthTabCallbackStub + 125;
            int i7 = i6 % 128;
            IAuthTabCallback_Parcel = i7;
            if (i6 % 2 != 0 ? i5 != 3 : i5 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i8 = i7 + 31;
            IAuthTabCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            severity = Severity.ERROR;
        } else {
            severity = Severity.WARNING;
        }
        event.setSeverity(severity);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                event.addMetadata("EXTRA", (String) entry.getKey(), entry.getValue());
            }
        }
        int i10 = IAuthTabCallback_Parcel + 69;
        IAuthTabCallbackStub = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 59 / 0;
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void onExtraCallbackWithResult(final String str, final String str2, final onWarmupCompleted onwarmupcompleted, final Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        AtomicBoolean atomicBoolean = IAuthTabCallbackDefault;
        if (atomicBoolean.get() && onWarmupCompleted.get() && (i = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()]) != 1) {
            int i3 = IAuthTabCallback_Parcel;
            int i4 = i3 + 89;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (i != 2) {
                int i6 = i3 + 81;
                IAuthTabCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if (atomicBoolean.get() && asBinder.get()) {
            Bugsnag.notify(new IAuthTabCallbackDefault(), new OnErrorCallback() { // from class: im.toss.core.utils.AbnormalLogger$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 1;
                private static int onExtraCallbackWithResult;

                public final boolean onError(Event event) {
                    int i8 = 2 % 2;
                    int i9 = IAuthTabCallback + 55;
                    onExtraCallbackWithResult = i9 % 128;
                    if (i9 % 2 != 0) {
                        auth.onExtraCallback(onwarmupcompleted, map, str, str2, event);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    boolean zOnExtraCallback = auth.onExtraCallback(onwarmupcompleted, map, str, str2, event);
                    int i10 = IAuthTabCallback + 121;
                    onExtraCallbackWithResult = i10 % 128;
                    int i11 = i10 % 2;
                    return zOnExtraCallback;
                }
            });
            int i8 = IAuthTabCallbackStub + 47;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 5 % 3;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onExtraCallback(@NotNull Throwable th, @NotNull final onWarmupCompleted onwarmupcompleted, @Nullable final Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(onwarmupcompleted, "");
        AtomicBoolean atomicBoolean = IAuthTabCallbackDefault;
        if (atomicBoolean.get() && onWarmupCompleted.get()) {
            int i3 = IAuthTabCallbackStub + 21;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0 ? (i = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()]) == 1 : (i = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()]) == 1) {
                boolean z = onExtraCallback;
                if (z) {
                    th.getMessage();
                }
                if (map != null && z) {
                    Objects.toString(map);
                }
            } else if (i != 2) {
                int i4 = IAuthTabCallback_Parcel + 37;
                IAuthTabCallbackStub = i4 % 128;
                int i5 = i4 % 2;
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z2 = onExtraCallback;
                if (z2) {
                    th.getMessage();
                }
                if (map != null) {
                    int i6 = IAuthTabCallback_Parcel + 59;
                    IAuthTabCallbackStub = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 12 / 0;
                        if (z2) {
                            Objects.toString(map);
                        }
                    } else if (z2) {
                    }
                }
            } else {
                boolean z3 = onExtraCallback;
                if (z3) {
                    th.getMessage();
                }
                if (map != null) {
                    int i8 = IAuthTabCallback_Parcel + 45;
                    IAuthTabCallbackStub = i8 % 128;
                    int i9 = i8 % 2;
                    if (z3) {
                        Objects.toString(map);
                    }
                }
            }
        }
        if (atomicBoolean.get() && asBinder.get()) {
            Bugsnag.notify(th, new OnErrorCallback() { // from class: im.toss.core.utils.AbnormalLogger$$ExternalSyntheticLambda1
                private static int onNavigationEvent = 1;
                private static int onWarmupCompleted;

                public final boolean onError(Event event) {
                    int i10 = 2 % 2;
                    int i11 = onNavigationEvent + 79;
                    onWarmupCompleted = i11 % 128;
                    int i12 = i11 % 2;
                    boolean zOnExtraCallbackWithResult = auth.onExtraCallbackWithResult(onwarmupcompleted, map, event);
                    int i13 = onNavigationEvent + 7;
                    onWarmupCompleted = i13 % 128;
                    int i14 = i13 % 2;
                    return zOnExtraCallbackWithResult;
                }
            });
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        Severity severity;
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
        Map map = (Map) objArr[1];
        Event event = (Event) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        int i2 = onNavigationEvent.IAuthTabCallback[onwarmupcompleted.ordinal()];
        if (i2 != 1) {
            int i3 = IAuthTabCallbackStub + 89;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0 ? i2 == 2 : i2 == 5) {
                severity = Severity.WARNING;
                int i4 = IAuthTabCallbackStub + 87;
                IAuthTabCallback_Parcel = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 3 / 3;
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                severity = Severity.ERROR;
            }
        } else {
            severity = Severity.INFO;
        }
        event.setSeverity(severity);
        if (map != null) {
            int i6 = IAuthTabCallback_Parcel + 49;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            Iterator it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                int i8 = IAuthTabCallback_Parcel + 51;
                IAuthTabCallbackStub = i8 % 128;
                if (i8 % 2 != 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    event.addMetadata("EXTRA", (String) entry.getKey(), entry.getValue());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                event.addMetadata("EXTRA", (String) entry2.getKey(), entry2.getValue());
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallbackWithResult(auth authVar, String str, String str2, Map map, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 125;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            map = null;
        }
        authVar.onExtraCallback(str, str2, (Map<String, ? extends Object>) map);
    }

    public final void onExtraCallback(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 125;
        IAuthTabCallbackStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            onExtraCallbackWithResult(str, str2, onWarmupCompleted.WARNING, map);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallbackWithResult(str, str2, onWarmupCompleted.WARNING, map);
        int i3 = IAuthTabCallback_Parcel + 71;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onExtraCallback(auth authVar, String str, String str2, Map map, int i, Object obj) throws NoWhenBranchMatchedException {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 97;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i4 = IAuthTabCallbackStub + 5;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            map = null;
        }
        authVar.IAuthTabCallback(str, str2, (Map<String, ? extends Object>) map);
    }

    public final void IAuthTabCallback(@NotNull String str, @NotNull String str2, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        onExtraCallbackWithResult(str, str2, onWarmupCompleted.ERROR, map);
        int i4 = IAuthTabCallback_Parcel + 119;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NoWhenBranchMatchedException {
        auth authVar = (auth) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Map<String, ? extends Object> map = (Map) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 123;
        int i3 = i2 % 128;
        IAuthTabCallbackStub = i3;
        if (i2 % 2 == 0 ? (iIntValue & 2) != 0 : (iIntValue & 5) != 0) {
            int i4 = i3 + 27;
            IAuthTabCallback_Parcel = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            map = null;
        }
        authVar.onNavigationEvent(th, map);
        return null;
    }

    public final void onNavigationEvent(@NotNull Throwable th, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 103;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        onExtraCallback(th, onWarmupCompleted.INFO, map);
        int i4 = IAuthTabCallback_Parcel + 67;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IAuthTabCallback(auth authVar, Throwable th, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 31;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            map = null;
        }
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        IAuthTabCallback(492574823, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{authVar, th, map}, iOnNavigationEvent, -492574818, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
        int i4 = IAuthTabCallback_Parcel + 105;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 35 / 0;
        }
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) throws NoWhenBranchMatchedException {
        auth authVar = (auth) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Map<String, ? extends Object> map = (Map) objArr[2];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 41;
        IAuthTabCallback_Parcel = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            authVar.onExtraCallback(th, onWarmupCompleted.WARNING, map);
            throw null;
        }
        Intrinsics.checkNotNullParameter(th, "");
        authVar.onExtraCallback(th, onWarmupCompleted.WARNING, map);
        int i3 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStub = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        auth authVar = (auth) objArr[0];
        Throwable th = (Throwable) objArr[1];
        Map<String, ? extends Object> map = (Map) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        Object obj = objArr[4];
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 17;
        int i3 = i2 % 128;
        IAuthTabCallback_Parcel = i3;
        Object obj2 = null;
        if (i2 % 2 != 0 ? (iIntValue & 2) != 0 : (iIntValue & 3) != 0) {
            int i4 = i3 + 29;
            IAuthTabCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            map = null;
        }
        authVar.IAuthTabCallback(th, map);
        return null;
    }

    public final void IAuthTabCallback(@NotNull Throwable th, @Nullable Map<String, ? extends Object> map) throws NoWhenBranchMatchedException {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 37;
        IAuthTabCallbackStub = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(th, "");
            onExtraCallback(th, onWarmupCompleted.ERROR, map);
        } else {
            Intrinsics.checkNotNullParameter(th, "");
            onExtraCallback(th, onWarmupCompleted.ERROR, map);
            int i3 = 12 / 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        private static int onNavigationEvent = 1;
        public static final onExtraCallbackWithResult MANUAL = new onExtraCallbackWithResult("MANUAL", 0);
        public static final onExtraCallbackWithResult NAVIGATION = new onExtraCallbackWithResult("NAVIGATION", 1);
        public static final onExtraCallbackWithResult LOG = new onExtraCallbackWithResult("LOG", 2);
        public static final onExtraCallbackWithResult ERROR = new onExtraCallbackWithResult("ERROR", 3);

        /* renamed from: o.auth$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        public static final /* synthetic */ class C0021onExtraCallbackWithResult {
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;
            public static final /* synthetic */ int[] onWarmupCompleted;

            static {
                int[] iArr = new int[onExtraCallbackWithResult.values().length];
                try {
                    iArr[onExtraCallbackWithResult.MANUAL.ordinal()] = 1;
                    int i = onExtraCallback + 61;
                    onNavigationEvent = i % 128;
                    int i2 = i % 2;
                    int i3 = 2 % 2;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[onExtraCallbackWithResult.NAVIGATION.ordinal()] = 2;
                    int i4 = 2 % 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[onExtraCallbackWithResult.LOG.ordinal()] = 3;
                    int i5 = onExtraCallback + 79;
                    onNavigationEvent = i5 % 128;
                    int i6 = i5 % 2;
                    int i7 = 2 % 2;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[onExtraCallbackWithResult.ERROR.ordinal()] = 4;
                    int i8 = 2 % 2;
                } catch (NoSuchFieldError unused4) {
                }
                onWarmupCompleted = iArr;
            }
        }

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult;
            int i3 = i2 + 59;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult = MANUAL;
                onExtraCallbackWithResult onextracallbackwithresult2 = NAVIGATION;
                onExtraCallbackWithResult onextracallbackwithresult3 = LOG;
                onExtraCallbackWithResult onextracallbackwithresult4 = ERROR;
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{onextracallbackwithresult, onextracallbackwithresult2};
                onextracallbackwithresultArr[2] = onextracallbackwithresult3;
                onextracallbackwithresultArr[5] = onextracallbackwithresult4;
            } else {
                onextracallbackwithresultArr = new onExtraCallbackWithResult[]{MANUAL, NAVIGATION, LOG, ERROR};
            }
            int i4 = i2 + 41;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 101;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 != 0) {
                return $ENTRIES;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 51;
            onExtraCallbackWithResult = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            int i4 = IAuthTabCallback + 79;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 88 / 0;
            }
            return onextracallbackwithresult;
        }

        public static onExtraCallbackWithResult[] values() {
            onExtraCallbackWithResult[] onextracallbackwithresultArr;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 19;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
                int i3 = 69 / 0;
            } else {
                onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            }
            int i4 = onExtraCallbackWithResult + 69;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return onextracallbackwithresultArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onExtraCallback + 47;
            onNavigationEvent = i % 128;
            if (i % 2 == 0) {
                int i2 = 20 / 0;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final BreadcrumbType toBugsnag$abnormal_logger_release() throws NoWhenBranchMatchedException {
            int i = 2 % 2;
            int i2 = C0021onExtraCallbackWithResult.onWarmupCompleted[ordinal()];
            if (i2 == 1) {
                return BreadcrumbType.MANUAL;
            }
            int i3 = IAuthTabCallback;
            int i4 = i3 + 71;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == 2) {
                return BreadcrumbType.NAVIGATION;
            }
            if (i2 == 3) {
                return BreadcrumbType.LOG;
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = i3 + 49;
            onExtraCallbackWithResult = i6 % 128;
            int i7 = i6 % 2;
            BreadcrumbType breadcrumbType = BreadcrumbType.ERROR;
            int i8 = onExtraCallbackWithResult + 19;
            IAuthTabCallback = i8 % 128;
            int i9 = i8 % 2;
            return breadcrumbType;
        }
    }

    public static final class IAuthTabCallback {
        private static int IAuthTabCallback = 0;
        private static int onWarmupCompleted = 1;
        private final Map<String, Object> onExtraCallbackWithResult;
        private final String onNavigationEvent;

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback;
            int i3 = i2 + 59;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IAuthTabCallback)) {
                int i5 = i2 + 107;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            if (!Intrinsics.areEqual(this.onNavigationEvent, iAuthTabCallback.onNavigationEvent)) {
                return false;
            }
            if (Intrinsics.areEqual(this.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallbackWithResult)) {
                return true;
            }
            int i6 = IAuthTabCallback + 19;
            onWarmupCompleted = i6 % 128;
            return i6 % 2 == 0;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 35;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = this.onNavigationEvent.hashCode();
            return i3 == 0 ? (iHashCode % 102) << this.onExtraCallbackWithResult.hashCode() : (iHashCode * 31) + this.onExtraCallbackWithResult.hashCode();
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Breadcrumb(message=" + this.onNavigationEvent + ", metadata=" + this.onExtraCallbackWithResult + ")";
            int i2 = IAuthTabCallback + 47;
            onWarmupCompleted = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 83 / 0;
            }
            return str;
        }

        public IAuthTabCallback(@NotNull String str, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.onNavigationEvent = str;
            this.onExtraCallbackWithResult = map;
        }

        public final Map<String, Object> onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 25;
            int i3 = i2 % 128;
            onWarmupCompleted = i3;
            int i4 = i2 % 2;
            Map<String, Object> map = this.onExtraCallbackWithResult;
            int i5 = i3 + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        public final String onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 95;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onNavigationEvent;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IAuthTabCallback(auth authVar, String str, Map map, onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = IAuthTabCallbackStub + 49;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            map = access8100.onNavigationEvent();
        }
        if ((i & 4) != 0) {
            int i5 = IAuthTabCallback_Parcel + 9;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 != 0) {
                onExtraCallbackWithResult onextracallbackwithresult2 = onExtraCallbackWithResult.MANUAL;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            onextracallbackwithresult = onExtraCallbackWithResult.MANUAL;
        }
        authVar.onExtraCallbackWithResult(str, (Map<String, ? extends Object>) map, onextracallbackwithresult);
        int i6 = IAuthTabCallbackStub + 91;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void onExtraCallbackWithResult(@NotNull String str, @NotNull Map<String, ? extends Object> map, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStub + 39;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        if (IAuthTabCallbackDefault.get()) {
            int i4 = IAuthTabCallback_Parcel + 37;
            IAuthTabCallbackStub = i4 % 128;
            int i5 = i4 % 2;
            if (asBinder.get()) {
                Bugsnag.leaveBreadcrumb(str, map, onextracallbackwithresult.toBugsnag$abnormal_logger_release());
            } else {
                onTransact.offer(new IAuthTabCallback(str, map));
            }
        }
    }

    public final void onWarmupCompleted(@NotNull String str, @NotNull String str2, @Nullable Object obj) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (IAuthTabCallbackDefault.get()) {
            int i2 = IAuthTabCallbackStub + 27;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            if (!(!asBinder.get())) {
                Bugsnag.addMetadata(str, str2, obj);
            }
        }
        int i4 = IAuthTabCallback_Parcel + 29;
        IAuthTabCallbackStub = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void onNavigationEvent(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        if (asBinder.get()) {
            String str2 = asInterface;
            if (str2 != null) {
                int i2 = IAuthTabCallbackStub + 81;
                IAuthTabCallback_Parcel = i2 % 128;
                int i3 = i2 % 2;
                if (StringsKt.equals(str2, "KR", true)) {
                    int i4 = IAuthTabCallback_Parcel + 101;
                    IAuthTabCallbackStub = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 94 / 0;
                    }
                } else {
                    str = asInterface + "_" + str;
                    int i6 = IAuthTabCallbackStub + 77;
                    IAuthTabCallback_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            Bugsnag.setUser("ga#" + str, (String) null, (String) null);
        }
        int i8 = IAuthTabCallback_Parcel + 11;
        IAuthTabCallbackStub = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 83;
        IAuthTabCallbackStub = i2 % 128;
        int i3 = i2 % 2;
        if (asBinder.get()) {
            Bugsnag.setUser((String) null, (String) null, (String) null);
        }
        int i4 = IAuthTabCallbackStub + 109;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final boolean onExtraCallbackWithResult(onWarmupCompleted onwarmupcompleted, Map map, String str, String str2, Event event) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(456451406, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, str, str2, event}, iOnNavigationEvent, -456451402, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
    }

    private static final boolean IAuthTabCallback(onWarmupCompleted onwarmupcompleted, Map map, Event event) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        return ((Boolean) IAuthTabCallback(-67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{onwarmupcompleted, map, event}, iOnNavigationEvent, 67960553, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent())).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull onExtraCallback onextracallback) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        IAuthTabCallback(-573604731, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this, onextracallback}, iOnNavigationEvent, 573604734, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }

    public final void onExtraCallbackWithResult(@NotNull Throwable th, @Nullable Map<String, ? extends Object> map) {
        int iOnNavigationEvent = LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent();
        IAuthTabCallback(492574823, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), new Object[]{this, th, map}, iOnNavigationEvent, -492574818, LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent(), LoginTokenConsentViewModel_HiltModules.KeyModule.onNavigationEvent());
    }
}
