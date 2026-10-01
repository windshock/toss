package o;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C0077authenticator;
import o.deprecated_retryOnConnectionFailure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.authenticator, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class C0077authenticator {
    private static int IAuthTabCallbackDefault = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private final certificateChainCleaner IAuthTabCallback;
    private final boolean IAuthTabCallbackStub;
    private final List<deprecated_readTimeoutMillis> asBinder;
    private final boolean asInterface;
    private final Lazy onExtraCallback;
    private final Uri onExtraCallbackWithResult;
    private final String onTransact;
    private final String onWarmupCompleted;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = IAuthTabCallback_Parcel + 9;
        access100 = i % 128;
        if (i % 2 != 0) {
            int i2 = 21 / 0;
        }
    }

    public /* synthetic */ C0077authenticator(Context context, String str, String str2, Uri uri, certificateChainCleaner certificatechaincleaner, List list, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, uri, certificatechaincleaner, list, z, z2);
    }

    public static /* synthetic */ deprecated_retryOnConnectionFailure onWarmupCompleted(C0077authenticator c0077authenticator) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 57;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailureOnExtraCallback = onExtraCallback(c0077authenticator);
        int i4 = IAuthTabCallbackDefault + 13;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_retryonconnectionfailureOnExtraCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C0077authenticator(Context context, String str, String str2, Uri uri, certificateChainCleaner certificatechaincleaner, List<? extends deprecated_readTimeoutMillis> list, boolean z, boolean z2) {
        this.onTransact = str;
        this.onWarmupCompleted = str2;
        this.onExtraCallbackWithResult = uri;
        this.IAuthTabCallback = certificatechaincleaner;
        this.asInterface = z;
        this.IAuthTabCallbackStub = z2;
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.sharebottomsheet.ShareData$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 51;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailureOnWarmupCompleted = C0077authenticator.onWarmupCompleted(this.f$0);
                int i4 = onExtraCallback + 15;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return deprecated_retryonconnectionfailureOnWarmupCompleted;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = getInterfaceDescriptor + 101;
            IAuthTabCallbackDefault = i % 128;
            int i2 = i % 2;
            deprecated_readTimeoutMillis deprecated_readtimeoutmillis = (deprecated_readTimeoutMillis) obj;
            if (deprecated_readtimeoutmillis instanceof deprecated_networkInterceptors) {
                if (this.asInterface) {
                    if (deprecated_readtimeoutmillis.isAvailable(onExtraCallbackWithResult())) {
                        int i3 = 2 % 2;
                    }
                }
                arrayList.add(obj);
            } else {
                if (!(deprecated_readtimeoutmillis instanceof EnumC0078cache)) {
                    throw new AssertionError();
                }
                int i4 = getInterfaceDescriptor + 71;
                IAuthTabCallbackDefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 79 / 0;
                    if (this.IAuthTabCallbackStub) {
                        if (!deprecated_pingIntervalMillis.onNavigationEvent(deprecated_readtimeoutmillis, context)) {
                        }
                    }
                    arrayList.add(obj);
                } else {
                    if (this.IAuthTabCallbackStub) {
                    }
                    arrayList.add(obj);
                }
            }
        }
        this.asBinder = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ C0077authenticator(Context context, String str, String str2, Uri uri, certificateChainCleaner certificatechaincleaner, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z3;
        boolean z4;
        if ((i & 64) != 0) {
            int i2 = IAuthTabCallbackDefault + 69;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 128) != 0) {
            int i4 = IAuthTabCallbackDefault + 23;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z4 = true;
        } else {
            z4 = z2;
        }
        this(context, str, str2, uri, certificatechaincleaner, list, z3, z4);
    }

    public final String onTransact() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 87;
        int i3 = i2 % 128;
        IAuthTabCallbackDefault = i3;
        int i4 = i2 % 2;
        String str = this.onTransact;
        int i5 = i3 + 5;
        getInterfaceDescriptor = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onWarmupCompleted() {
        String str;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 9;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 == 0) {
            str = this.onWarmupCompleted;
            int i4 = 58 / 0;
        } else {
            str = this.onWarmupCompleted;
        }
        int i5 = i3 + 99;
        IAuthTabCallbackDefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Uri onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 95;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        Uri uri = this.onExtraCallbackWithResult;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return uri;
    }

    public final certificateChainCleaner onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 19;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            return this.IAuthTabCallback;
        }
        throw null;
    }

    private static final deprecated_retryOnConnectionFailure onExtraCallback(C0077authenticator c0077authenticator) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackDefault + 45;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailureOnWarmupCompleted = deprecated_retryOnConnectionFailure.Companion.onWarmupCompleted(c0077authenticator.onWarmupCompleted, c0077authenticator.onExtraCallbackWithResult);
        int i4 = getInterfaceDescriptor + 75;
        IAuthTabCallbackDefault = i4 % 128;
        if (i4 % 2 == 0) {
            return deprecated_retryonconnectionfailureOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final deprecated_retryOnConnectionFailure onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 73;
        IAuthTabCallbackDefault = i2 % 128;
        int i3 = i2 % 2;
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure = (deprecated_retryOnConnectionFailure) this.onExtraCallback.getValue();
        int i4 = getInterfaceDescriptor + 91;
        IAuthTabCallbackDefault = i4 % 128;
        int i5 = i4 % 2;
        return deprecated_retryonconnectionfailure;
    }

    public final List<deprecated_readTimeoutMillis> IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 75;
        IAuthTabCallbackDefault = i3 % 128;
        int i4 = i3 % 2;
        List<deprecated_readTimeoutMillis> list = this.asBinder;
        int i5 = i2 + 119;
        IAuthTabCallbackDefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* renamed from: o.authenticator$onWarmupCompleted */
    public static final class onWarmupCompleted {
        private static int onExtraCallbackWithResult = 0;
        private static int onWarmupCompleted = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }

        public final C0077authenticator onNavigationEvent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull certificateChainCleaner certificatechaincleaner, @NotNull List<? extends EnumC0078cache> list) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(certificatechaincleaner, "");
            Intrinsics.checkNotNullParameter(list, "");
            if ((str2 == null || str2.length() == 0) && uri == null) {
                int i2 = onWarmupCompleted + 47;
                onExtraCallbackWithResult = i2 % 128;
                if (i2 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            C0077authenticator c0077authenticator = new C0077authenticator(context, str, str2, uri, certificatechaincleaner, deprecated_readTimeoutMillis.Companion.onExtraCallbackWithResult(context, str2, uri, list), false, false, 192, null);
            int i3 = onExtraCallbackWithResult + 113;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return c0077authenticator;
        }

        public static /* synthetic */ C0077authenticator IAuthTabCallback(onWarmupCompleted onwarmupcompleted, Context context, String str, String str2, Uri uri, certificateChainCleaner certificatechaincleaner, List list, boolean z, boolean z2, int i, Object obj) {
            boolean z3;
            int i2 = 2 % 2;
            int i3 = onWarmupCompleted;
            int i4 = i3 + 121;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 64) != 0) {
                int i6 = i3 + 103;
                onExtraCallbackWithResult = i6 % 128;
                z3 = i6 % 2 == 0;
            } else {
                z3 = z;
            }
            return onwarmupcompleted.onExtraCallbackWithResult(context, str, str2, uri, certificatechaincleaner, list, z3, (i & 128) != 0 ? true : z2);
        }

        public final C0077authenticator onExtraCallbackWithResult(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull certificateChainCleaner certificatechaincleaner, @NotNull List<? extends deprecated_readTimeoutMillis> list, boolean z, boolean z2) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(certificatechaincleaner, "");
            Intrinsics.checkNotNullParameter(list, "");
            C0077authenticator c0077authenticator = new C0077authenticator(context, str, str2, uri, certificatechaincleaner, list, z, z2, null);
            int i2 = onExtraCallbackWithResult + 63;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            return c0077authenticator;
        }
    }
}
