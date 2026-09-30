package o;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Authenticator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.account.agreement.AccountAgreementHelper$;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class dns {
    private static int onActivityResized = 1;
    private static int readTypedObject;
    private boolean IAuthTabCallback;
    private final Function2<View, proxySelector, Unit> IAuthTabCallbackDefault;
    private final Function2<View, proxySelector, Unit> IAuthTabCallbackStub;
    private final boolean IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private final Authenticator ICustomTabsCallback;
    private final Authenticator access000;
    private Integer access100;
    private final Function2<View, proxySelector, Unit> asBinder;
    private final Function1<Boolean, Unit> asInterface;
    private VelocityTracker extraCallback;
    private final Authenticator extraCallbackWithResult;
    private final Authenticator getInterfaceDescriptor;
    private boolean onExtraCallback;
    private long onExtraCallbackWithResult;
    private hostnameVerifier onNavigationEvent;
    private final Function2<View, proxySelector, Unit> onTransact;
    private final Function2<View, proxySelector, Unit> onWarmupCompleted;
    private proxyAuthenticator writeTypedObject;

    public dns() {
        this(null, null, null, null, false, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i;
        int i9 = ~(i7 | i8);
        int i10 = ~i3;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i6 | i3 | i));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i | i3)) | (~(i13 | i8)) | (~(i6 | i));
        int i16 = i6 + i3 + i4 + ((-298151579) * i5) + ((-427515960) * i2);
        int i17 = i16 * i16;
        int i18 = (i6 * (-431502880)) + 875560960 + ((-431502880) * i3) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i4) + ((-16252928) * i5) + (423624704 * i2) + (1109590016 * i17);
        int i19 = ((i6 * (-2003555040)) - 1632655964) + (i3 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i4 * (-2003554617)) + (i5 * 1812671363) + (i2 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? i20 != 3 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 7;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dns)) {
            int i4 = i2 + 75;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        dns dnsVar = (dns) obj;
        if (!Intrinsics.areEqual(this.ICustomTabsCallback, dnsVar.ICustomTabsCallback) || !Intrinsics.areEqual(this.extraCallbackWithResult, dnsVar.extraCallbackWithResult) || !Intrinsics.areEqual(this.getInterfaceDescriptor, dnsVar.getInterfaceDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.access000, dnsVar.access000)) {
            int i6 = readTypedObject + 61;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.IAuthTabCallbackStubProxy != dnsVar.IAuthTabCallbackStubProxy || !Intrinsics.areEqual(this.asInterface, dnsVar.asInterface) || !Intrinsics.areEqual(this.onWarmupCompleted, dnsVar.onWarmupCompleted)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.asBinder, dnsVar.asBinder)) {
            int i8 = readTypedObject + 19;
            onActivityResized = i8 % 128;
            return i8 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.onTransact, dnsVar.onTransact)) {
            return false;
        }
        if (Intrinsics.areEqual(this.IAuthTabCallbackDefault, dnsVar.IAuthTabCallbackDefault)) {
            return Intrinsics.areEqual(this.IAuthTabCallbackStub, dnsVar.IAuthTabCallbackStub);
        }
        int i9 = readTypedObject + 51;
        onActivityResized = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        int iHashCode5 = this.ICustomTabsCallback.hashCode();
        int iHashCode6 = this.extraCallbackWithResult.hashCode();
        int iHashCode7 = this.getInterfaceDescriptor.hashCode();
        int iHashCode8 = this.access000.hashCode();
        int iHashCode9 = Boolean.hashCode(this.IAuthTabCallbackStubProxy);
        Function1<Boolean, Unit> function1 = this.asInterface;
        if (function1 == null) {
            iHashCode = 0;
        } else {
            iHashCode = function1.hashCode();
            int i2 = onActivityResized + 83;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
        }
        Function2<View, proxySelector, Unit> function2 = this.onWarmupCompleted;
        if (function2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = function2.hashCode();
            int i4 = readTypedObject + 17;
            onActivityResized = i4 % 128;
            int i5 = i4 % 2;
        }
        Function2<View, proxySelector, Unit> function22 = this.asBinder;
        int iHashCode10 = function22 == null ? 0 : function22.hashCode();
        Function2<View, proxySelector, Unit> function23 = this.onTransact;
        if (function23 == null) {
            int i6 = onActivityResized + 83;
            readTypedObject = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = function23.hashCode();
        }
        Function2<View, proxySelector, Unit> function24 = this.IAuthTabCallbackDefault;
        if (function24 == null) {
            int i7 = onActivityResized + 51;
            readTypedObject = i7 % 128;
            int i8 = i7 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = function24.hashCode();
        }
        Function2<View, proxySelector, Unit> function25 = this.IAuthTabCallbackStub;
        return (((((((((((((((((((iHashCode5 * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (function25 != null ? function25.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ScrollTrigger(targetStartThreshold=" + this.ICustomTabsCallback + ", targetEndThreshold=" + this.extraCallbackWithResult + ", parentStartThreshold=" + this.getInterfaceDescriptor + ", parentEndThreshold=" + this.access000 + ", playOnce=" + this.IAuthTabCallbackStubProxy + ", onViewport=" + this.asInterface + ", onEnter=" + this.onWarmupCompleted + ", onEnterBack=" + this.asBinder + ", onLeave=" + this.onTransact + ", onLeaveBack=" + this.IAuthTabCallbackDefault + ", onUpdate=" + this.IAuthTabCallbackStub + ")";
        int i2 = onActivityResized + 3;
        readTypedObject = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dns(@NotNull Authenticator authenticator, @NotNull Authenticator authenticator2, @NotNull Authenticator authenticator3, @NotNull Authenticator authenticator4, boolean z, @Nullable Function1<? super Boolean, Unit> function1, @Nullable Function2<? super View, ? super proxySelector, Unit> function2, @Nullable Function2<? super View, ? super proxySelector, Unit> function22, @Nullable Function2<? super View, ? super proxySelector, Unit> function23, @Nullable Function2<? super View, ? super proxySelector, Unit> function24, @Nullable Function2<? super View, ? super proxySelector, Unit> function25) {
        Intrinsics.checkNotNullParameter(authenticator, "");
        Intrinsics.checkNotNullParameter(authenticator2, "");
        Intrinsics.checkNotNullParameter(authenticator3, "");
        Intrinsics.checkNotNullParameter(authenticator4, "");
        this.ICustomTabsCallback = authenticator;
        this.extraCallbackWithResult = authenticator2;
        this.getInterfaceDescriptor = authenticator3;
        this.access000 = authenticator4;
        this.IAuthTabCallbackStubProxy = z;
        this.asInterface = function1;
        this.onWarmupCompleted = function2;
        this.asBinder = function22;
        this.onTransact = function23;
        this.IAuthTabCallbackDefault = function24;
        this.IAuthTabCallbackStub = function25;
        this.onExtraCallbackWithResult = -1L;
        this.onNavigationEvent = hostnameVerifier.DOWN;
        this.writeTypedObject = proxyAuthenticator.NONE;
    }

    public /* synthetic */ dns(Authenticator authenticator, Authenticator authenticator2, Authenticator authenticator3, Authenticator authenticator4, boolean z, Function1 function1, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function2 function25, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Authenticator onnavigationevent;
        Function1 function12;
        Function2 function26;
        Function2 function27;
        Authenticator onnavigationevent2 = (i & 1) != 0 ? new Authenticator.onNavigationEvent(0, 0) : authenticator;
        boolean z2 = true;
        Authenticator onnavigationevent3 = (i & 2) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator2;
        Authenticator onnavigationevent4 = (i & 4) != 0 ? new Authenticator.onNavigationEvent(1, 0) : authenticator3;
        if ((i & 8) != 0) {
            onnavigationevent = new Authenticator.onNavigationEvent(0, 0);
            int i2 = 2 % 2;
        } else {
            onnavigationevent = authenticator4;
        }
        if ((i & 16) != 0) {
            int i3 = 2 % 2;
        } else {
            z2 = z;
        }
        Function2 function28 = null;
        if ((i & 32) != 0) {
            int i4 = onActivityResized;
            int i5 = i4 + 83;
            readTypedObject = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 29;
            readTypedObject = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 2 % 2;
            }
            function12 = null;
        } else {
            function12 = function1;
        }
        Function2 function29 = (i & 64) != 0 ? null : function2;
        Function2 function210 = (i & 128) != 0 ? null : function22;
        if ((i & 256) != 0) {
            int i9 = readTypedObject + 105;
            onActivityResized = i9 % 128;
            if (i9 % 2 == 0) {
                function28.hashCode();
                throw null;
            }
            function26 = null;
        } else {
            function26 = function23;
        }
        if ((i & 512) != 0) {
            int i10 = onActivityResized + 53;
            readTypedObject = i10 % 128;
            int i11 = i10 % 2;
            function27 = null;
        } else {
            function27 = function24;
        }
        if ((i & 1024) != 0) {
            int i12 = onActivityResized + 99;
            readTypedObject = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 2;
            }
        } else {
            function28 = function25;
        }
        this(onnavigationevent2, onnavigationevent3, onnavigationevent4, onnavigationevent, z2, function12, function29, function210, function26, function27, function28);
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        dns dnsVar = (dns) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 7;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        Authenticator authenticator = dnsVar.ICustomTabsCallback;
        int i5 = i2 + 3;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return authenticator;
    }

    public final Authenticator asInterface() {
        int i = 2 % 2;
        int i2 = onActivityResized + 63;
        readTypedObject = i2 % 128;
        if (i2 % 2 == 0) {
            return this.extraCallbackWithResult;
        }
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        dns dnsVar = (dns) objArr[0];
        int i = 2 % 2;
        int i2 = onActivityResized + 59;
        int i3 = i2 % 128;
        readTypedObject = i3;
        int i4 = i2 % 2;
        Authenticator authenticator = dnsVar.getInterfaceDescriptor;
        int i5 = i3 + 125;
        onActivityResized = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return authenticator;
    }

    public final Authenticator IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = readTypedObject + 93;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        Authenticator authenticator = this.access000;
        int i5 = i3 + 107;
        readTypedObject = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return authenticator;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        dns dnsVar = (dns) objArr[0];
        int i = 2 % 2;
        int i2 = readTypedObject + 87;
        int i3 = i2 % 128;
        onActivityResized = i3;
        int i4 = i2 % 2;
        hostnameVerifier hostnameverifier = dnsVar.onNavigationEvent;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 99;
        readTypedObject = i5 % 128;
        int i6 = i5 % 2;
        return hostnameverifier;
    }

    public final proxyAuthenticator onNavigationEvent() {
        int i = 2 % 2;
        int i2 = readTypedObject;
        int i3 = i2 + 87;
        onActivityResized = i3 % 128;
        int i4 = i3 % 2;
        proxyAuthenticator proxyauthenticator = this.writeTypedObject;
        int i5 = i2 + 65;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return proxyauthenticator;
    }

    public final void IAuthTabCallback(@NotNull proxyAuthenticator proxyauthenticator) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(proxyauthenticator, "");
        this.writeTypedObject = proxyauthenticator;
        Function1<Boolean, Unit> function1 = this.asInterface;
        if (function1 != null) {
            int i2 = onActivityResized + 67;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            if (proxyauthenticator == proxyAuthenticator.VIEWPORT) {
                int i4 = onActivityResized + 9;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
                z = true;
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
    }

    private final proxySelector onExtraCallback(View view, int i, float f) {
        int iIntValue;
        int i2 = 2 % 2;
        Integer num = this.access100;
        if (num != null) {
            int i3 = readTypedObject + 93;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            iIntValue = num.intValue();
        } else {
            int i5 = readTypedObject + 73;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            iIntValue = 0;
        }
        int i7 = iIntValue;
        int value = this.onNavigationEvent.getValue();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new proxySelector(i7, i, f, value, onNavigationEvent(context));
    }

    public final void IAuthTabCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onActivityResized + 17;
        readTypedObject = i2 % 128;
        int i3 = i2 % 2;
        this.IAuthTabCallback = z;
        IAuthTabCallback(proxyAuthenticator.VIEWPORT);
        int i4 = onActivityResized + 111;
        readTypedObject = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final boolean onNavigationEvent(@NotNull View view, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (this.IAuthTabCallbackStubProxy) {
            int i3 = readTypedObject + 85;
            onActivityResized = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.IAuthTabCallback) {
                return false;
            }
        }
        Function2<View, proxySelector, Unit> function2 = this.onWarmupCompleted;
        if (function2 != null) {
            int i4 = onActivityResized + 39;
            readTypedObject = i4 % 128;
            if (i4 % 2 != 0) {
                function2.invoke(view, onExtraCallback(view, i, 2.0f));
            } else {
                function2.invoke(view, onExtraCallback(view, i, 0.0f));
            }
        }
        this.IAuthTabCallback = true;
        return true;
    }

    public final boolean onExtraCallbackWithResult(@NotNull View view, int i) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (this.IAuthTabCallbackStubProxy) {
            int i3 = readTypedObject + 119;
            onActivityResized = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        Function2<View, proxySelector, Unit> function2 = this.asBinder;
        if (function2 != null) {
            function2.invoke(view, onExtraCallback(view, i, 1.0f));
        }
        int i5 = readTypedObject + 83;
        onActivityResized = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        dns dnsVar = (dns) objArr[0];
        View view = (View) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        if (dnsVar.IAuthTabCallbackStubProxy) {
            int i2 = onActivityResized + 35;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        Function2<View, proxySelector, Unit> function2 = dnsVar.onTransact;
        if (function2 != null) {
            int i4 = onActivityResized + 25;
            readTypedObject = i4 % 128;
            int i5 = i4 % 2;
            function2.invoke(view, dnsVar.onExtraCallback(view, iIntValue, 1.0f));
            int i6 = readTypedObject + 3;
            onActivityResized = i6 % 128;
            int i7 = i6 % 2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r1 = r4.IAuthTabCallbackDefault;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        r2 = o.dns.readTypedObject + 57;
        o.dns.onActivityResized = r2 % 128;
        r2 = r2 % 2;
        r1.invoke(r5, onExtraCallback(r5, r6, 0.0f));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r4.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r4.IAuthTabCallbackStubProxy != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5 = o.dns.onActivityResized + 39;
        o.dns.readTypedObject = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onExtraCallback(@NotNull View view, int i) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 79;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
            int i4 = 77 / 0;
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
    }

    public final void onNavigationEvent(@NotNull View view, int i, float f) {
        int i2 = 2 % 2;
        int i3 = onActivityResized + 77;
        readTypedObject = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Function2<View, proxySelector, Unit> function2 = this.IAuthTabCallbackStub;
        if (function2 != null) {
            int i5 = readTypedObject + 21;
            onActivityResized = i5 % 128;
            int i6 = i5 % 2;
            function2.invoke(view, onExtraCallback(view, i, f));
            if (i6 == 0) {
                int i7 = 9 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        r5.onExtraCallback = true;
        r5.IAuthTabCallback_Parcel = 0;
        r5.onExtraCallbackWithResult = java.lang.System.currentTimeMillis();
        r5.extraCallback = android.view.VelocityTracker.obtain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.onExtraCallback != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.onExtraCallback != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 59;
        o.dns.readTypedObject = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = onActivityResized;
        int i3 = i2 + 11;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[PHI: r1 r11
      0x0043: PHI (r1v7 android.view.VelocityTracker) = (r1v6 android.view.VelocityTracker), (r1v13 android.view.VelocityTracker) binds: [B:8:0x0041, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0043: PHI (r11v3 android.view.MotionEvent) = (r11v2 android.view.MotionEvent), (r11v7 android.view.MotionEvent) binds: [B:8:0x0041, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(int i) {
        MotionEvent motionEventObtain;
        VelocityTracker velocityTracker;
        int i2 = 2 % 2;
        int i3 = onActivityResized + 115;
        readTypedObject = i3 % 128;
        if (i3 % 2 != 0) {
            this.IAuthTabCallback_Parcel <<= i;
            motionEventObtain = MotionEvent.obtain(this.onExtraCallbackWithResult, System.currentTimeMillis(), 2, 1.0f, this.IAuthTabCallback_Parcel, 1);
            velocityTracker = this.extraCallback;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEventObtain);
                int i4 = onActivityResized + 27;
                readTypedObject = i4 % 128;
                int i5 = i4 % 2;
            }
        } else {
            this.IAuthTabCallback_Parcel += i;
            motionEventObtain = MotionEvent.obtain(this.onExtraCallbackWithResult, System.currentTimeMillis(), 2, 0.0f, this.IAuthTabCallback_Parcel, 0);
            velocityTracker = this.extraCallback;
            if (velocityTracker != null) {
            }
        }
        motionEventObtain.recycle();
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        this.onExtraCallback = false;
        this.IAuthTabCallback_Parcel = 0;
        this.onExtraCallbackWithResult = -1L;
        VelocityTracker velocityTracker = this.extraCallback;
        if (velocityTracker != null) {
            int i2 = onActivityResized + 109;
            readTypedObject = i2 % 128;
            int i3 = i2 % 2;
            velocityTracker.clear();
        }
        int i4 = onActivityResized + 15;
        readTypedObject = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onExtraCallback(int i) {
        hostnameVerifier hostnameverifier;
        int i2 = 2 % 2;
        IAuthTabCallbackStub();
        Integer num = this.access100;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            int iIntValue = i - num.intValue();
            onExtraCallbackWithResult(iIntValue);
            if (iIntValue >= 0) {
                hostnameverifier = hostnameVerifier.DOWN;
            } else {
                hostnameverifier = hostnameVerifier.UP;
                int i3 = readTypedObject + 23;
                onActivityResized = i3 % 128;
                int i4 = i3 % 2;
            }
        } else {
            hostnameverifier = hostnameVerifier.NONE;
        }
        this.onNavigationEvent = hostnameverifier;
        this.access100 = Integer.valueOf(i);
        int i5 = onActivityResized + 41;
        readTypedObject = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r1.computeCurrentVelocity(14728);
        r0 = r1.getYVelocity();
        r9 = r9.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r9 = (java.lang.Float) o.varyMatches.onNavigationEvent(1845166571, -1845166568, new java.lang.Object[]{java.lang.Float.valueOf(r0), r9}, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r1.computeCurrentVelocity(1000);
        r0 = r1.getYVelocity();
        r9 = r9.getResources().getDisplayMetrics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "");
        r9 = (java.lang.Float) o.varyMatches.onNavigationEvent(1845166571, -1845166568, new java.lang.Object[]{java.lang.Float.valueOf(r0), r9}, im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback(), im.toss.features.verify.overseaskorean.impl.widget.OverseasRrnInputTextField.IAuthTabCallback());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        return r9.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a5, code lost:
    
        r9 = o.dns.readTypedObject + 85;
        o.dns.onActivityResized = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b0, code lost:
    
        return 0.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r3 = o.dns.readTypedObject + 51;
        o.dns.onActivityResized = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final double onNavigationEvent(@NotNull Context context) {
        VelocityTracker velocityTracker;
        int i = 2 % 2;
        int i2 = readTypedObject + 107;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            velocityTracker = this.extraCallback;
            int i3 = 37 / 0;
        } else {
            Intrinsics.checkNotNullParameter(context, "");
            velocityTracker = this.extraCallback;
        }
    }

    public final void asBinder() {
        int i = 2 % 2;
        int i2 = readTypedObject + 81;
        onActivityResized = i2 % 128;
        if (i2 % 2 == 0) {
            this.access100 = null;
            this.onNavigationEvent = hostnameVerifier.DOWN;
            IAuthTabCallback(proxyAuthenticator.NONE);
            int i3 = 87 / 0;
            return;
        }
        this.access100 = null;
        this.onNavigationEvent = hostnameVerifier.DOWN;
        IAuthTabCallback(proxyAuthenticator.NONE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onWarmupCompleted(@NotNull dns dnsVar) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dnsVar, "");
        if (Intrinsics.areEqual(this.ICustomTabsCallback, dnsVar.ICustomTabsCallback) && Intrinsics.areEqual(this.extraCallbackWithResult, dnsVar.extraCallbackWithResult)) {
            int i2 = readTypedObject + 45;
            onActivityResized = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 70 / 0;
                if (Intrinsics.areEqual(this.getInterfaceDescriptor, dnsVar.getInterfaceDescriptor)) {
                    if (Intrinsics.areEqual(this.access000, dnsVar.access000)) {
                        int i4 = readTypedObject + 39;
                        int i5 = i4 % 128;
                        onActivityResized = i5;
                        int i6 = i4 % 2;
                        if (this.IAuthTabCallbackStubProxy == dnsVar.IAuthTabCallbackStubProxy) {
                            int i7 = i5 + 19;
                            readTypedObject = i7 % 128;
                            if (i7 % 2 == 0) {
                                return true;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }
                }
            } else if (Intrinsics.areEqual(this.getInterfaceDescriptor, dnsVar.getInterfaceDescriptor)) {
            }
        }
        return false;
    }

    public final hostnameVerifier onExtraCallbackWithResult() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (hostnameVerifier) IAuthTabCallback(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -2021209556, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3, 2021209559);
    }

    public final Authenticator onWarmupCompleted() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Authenticator) IAuthTabCallback(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1062717922, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3, -1062717922);
    }

    public final Authenticator onTransact() {
        int iOnNavigationEvent = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent2 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        int iOnNavigationEvent3 = AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent();
        return (Authenticator) IAuthTabCallback(iOnNavigationEvent, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1630921786, new Object[]{this}, iOnNavigationEvent2, iOnNavigationEvent3, 1630921787);
    }

    public final boolean IAuthTabCallback(@NotNull View view, int i) {
        Object[] objArr = {this, view, Integer.valueOf(i)};
        return ((Boolean) IAuthTabCallback(AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), 1132284984, objArr, AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), AccountAgreementHelper$.ExternalSyntheticLambda18.onNavigationEvent(), -1132284982)).booleanValue();
    }
}
