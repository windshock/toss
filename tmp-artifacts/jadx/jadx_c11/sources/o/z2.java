package o;

import im.toss.features.home.core.ui.widget.sprint5.QuizVar4View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class z2 {
    private static int ICustomTabsServiceStub = 1;
    private static int requestPostMessageChannelWithExtras;
    private final long IAuthTabCallback;
    private final long IAuthTabCallbackDefault;
    private final long IAuthTabCallbackStub;
    private final long IAuthTabCallbackStubProxy;
    private final long IAuthTabCallback_Parcel;
    private final long ICustomTabsCallback;
    private final long ICustomTabsCallbackDefault;
    private final long ICustomTabsCallbackStub;
    private final long ICustomTabsCallbackStubProxy;
    private final long ICustomTabsCallback_Parcel;
    private final long ICustomTabsService;
    private final long access000;
    private final long access100;
    private final long asBinder;
    private final long asInterface;
    private final long extraCallback;
    private final long extraCallbackWithResult;
    private final long extraCommand;
    private final long getInterfaceDescriptor;
    private final long isEngagementSignalsApiAvailable;
    private final long mayLaunchUrl;
    private final long newAuthTabSession;
    private final long newSession;
    private final long newSessionWithExtras;
    private final long onActivityLayout;
    private final long onActivityResized;
    private final long onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final long onMessageChannelReady;
    private final long onMinimized;
    private final long onNavigationEvent;
    private final long onPostMessage;
    private final long onRelationshipValidationResult;
    private final long onTransact;
    private final long onUnminimized;
    private final long onWarmupCompleted;
    private final long postMessage;
    private final long prefetch;
    private final long prefetchWithMultipleUrls;
    private final long readTypedObject;
    private final long receiveFile;
    private final long requestPostMessageChannel;
    private final long setEngagementSignalsCallback;
    private final long writeTypedObject;

    public /* synthetic */ z2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44);
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~i3;
        int i9 = ~i6;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i8 | i | i6);
        int i12 = (~(i6 | i)) | (~(i7 | i9)) | i8;
        int i13 = i3 + i + i5 + (62936680 * i4) + ((-2032430997) * i2);
        int i14 = i13 * i13;
        int i15 = ((-476632153) * i3) + 797966336 + (1756943451 * i) + (i10 * (-1030695846)) + ((-1030695846) * i11) + (1030695846 * i12) + ((-1507328000) * i5) + ((-264241152) * i4) + ((-222822400) * i2) + (2040594432 * i14);
        int i16 = ((i3 * 1175661207) - 43826732) + (i * 1175659659) + (i10 * (-774)) + (i11 * (-774)) + (i12 * 774) + (i5 * 1175660433) + (i4 * 1188219112) + (i2 * (-816965221)) + (i14 * 1798373376);
        switch (i15 + (i16 * i16 * 914292736)) {
            case 1:
                return onNavigationEvent(objArr);
            case 2:
                return onExtraCallbackWithResult(objArr);
            case 3:
                return onWarmupCompleted(objArr);
            case 4:
                return onExtraCallback(objArr);
            case 5:
                return IAuthTabCallbackStub(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return onTransact(objArr);
            default:
                return IAuthTabCallback(objArr);
        }
    }

    private z2(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44) {
        this.onExtraCallback = j;
        this.onNavigationEvent = j2;
        this.IAuthTabCallback = j3;
        this.onWarmupCompleted = j4;
        this.onExtraCallbackWithResult = j5;
        this.onTransact = j6;
        this.asBinder = j7;
        this.asInterface = j8;
        this.IAuthTabCallbackDefault = j9;
        this.IAuthTabCallbackStub = j10;
        this.access000 = j11;
        this.IAuthTabCallbackStubProxy = j12;
        this.access100 = j13;
        this.getInterfaceDescriptor = j14;
        this.IAuthTabCallback_Parcel = j15;
        this.extraCallback = j16;
        this.ICustomTabsCallback = j17;
        this.readTypedObject = j18;
        this.writeTypedObject = j19;
        this.extraCallbackWithResult = j20;
        this.onPostMessage = j21;
        this.onActivityLayout = j22;
        this.onMinimized = j23;
        this.onActivityResized = j24;
        this.onMessageChannelReady = j25;
        this.ICustomTabsCallbackStubProxy = j26;
        this.onUnminimized = j27;
        this.onRelationshipValidationResult = j28;
        this.ICustomTabsCallbackDefault = j29;
        this.ICustomTabsCallbackStub = j30;
        this.ICustomTabsCallback_Parcel = j31;
        this.extraCommand = j32;
        this.isEngagementSignalsApiAvailable = j33;
        this.mayLaunchUrl = j34;
        this.ICustomTabsService = j35;
        this.newAuthTabSession = j36;
        this.postMessage = j37;
        this.newSessionWithExtras = j38;
        this.newSession = j39;
        this.prefetch = j40;
        this.requestPostMessageChannel = j41;
        this.receiveFile = j42;
        this.setEngagementSignalsCallback = j43;
        this.prefetchWithMultipleUrls = j44;
    }

    public final long onNavigationEvent() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 55;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onExtraCallback;
        int i5 = i2 + 21;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 7;
        requestPostMessageChannelWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            long j = z2Var.onNavigationEvent;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = z2Var.onNavigationEvent;
        int i4 = i2 + 115;
        requestPostMessageChannelWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(j2);
        }
        int i5 = 43 / 0;
        return Long.valueOf(j2);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 27;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallback;
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 31;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return j;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onWarmupCompleted;
        int i4 = i3 + 75;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 55;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onExtraCallbackWithResult;
        int i4 = i3 + 109;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long IAuthTabCallbackDefault() {
        long j;
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 7;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.onTransact;
            int i4 = 26 / 0;
        } else {
            j = this.onTransact;
        }
        int i5 = i2 + 107;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onTransact() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 81;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = this.asBinder;
        int i5 = i3 + 49;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 115;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return this.asInterface;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long asInterface() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 59;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackDefault;
        int i5 = i3 + 43;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long asBinder() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 57;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStub;
        if (i4 != 0) {
            int i5 = 48 / 0;
        }
        int i6 = i3 + 3;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 13;
        requestPostMessageChannelWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.access000;
        int i4 = i2 + 125;
        requestPostMessageChannelWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 33;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = this.IAuthTabCallbackStubProxy;
        int i5 = i3 + 41;
        requestPostMessageChannelWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        long j;
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 69;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            j = z2Var.access100;
            int i3 = 89 / 0;
        } else {
            j = z2Var.access100;
        }
        return Long.valueOf(j);
    }

    public final long access000() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 105;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.getInterfaceDescriptor;
        int i5 = i2 + 29;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 5;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return this.IAuthTabCallback_Parcel;
        }
        throw null;
    }

    public final long extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 43;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.extraCallback;
        int i5 = i2 + 57;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long readTypedObject() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 43;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.ICustomTabsCallback;
        int i5 = i3 + 75;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 105;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        int i4 = i2 % 2;
        long j = z2Var.readTypedObject;
        int i5 = i3 + 117;
        requestPostMessageChannelWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return Long.valueOf(j);
        }
        int i6 = 50 / 0;
        return Long.valueOf(j);
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 25;
        requestPostMessageChannelWithExtras = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            long j = z2Var.writeTypedObject;
            obj.hashCode();
            throw null;
        }
        long j2 = z2Var.writeTypedObject;
        int i4 = i2 + 55;
        requestPostMessageChannelWithExtras = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(j2);
        }
        throw null;
    }

    public final long ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 119;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.extraCallbackWithResult;
        int i5 = i3 + 7;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 77;
        requestPostMessageChannelWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j = this.onPostMessage;
        int i4 = i2 + 99;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return j;
    }

    public final long onPostMessage() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 25;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return this.onActivityLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long onMinimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 119;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.onMinimized;
        int i5 = i3 + 45;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onActivityResized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 49;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onActivityResized;
        int i5 = i2 + 91;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long onActivityLayout() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 47;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onMessageChannelReady;
        int i5 = i2 + 15;
        requestPostMessageChannelWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 96 / 0;
        }
        return j;
    }

    public final long onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 23;
        requestPostMessageChannelWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        long j = this.ICustomTabsCallbackStubProxy;
        int i4 = i2 + 63;
        requestPostMessageChannelWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return j;
    }

    public final long onUnminimized() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 35;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.onUnminimized;
        int i5 = i3 + 45;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    public final long ICustomTabsCallbackStub() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 43;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onRelationshipValidationResult;
        int i5 = i2 + 29;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 59;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = z2Var.ICustomTabsCallbackDefault;
        int i5 = i2 + 1;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return Long.valueOf(j);
        }
        throw null;
    }

    public final long ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 97;
        requestPostMessageChannelWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ICustomTabsCallbackStub;
        }
        int i3 = 62 / 0;
        return this.ICustomTabsCallbackStub;
    }

    public final long isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.ICustomTabsCallback_Parcel;
        int i5 = i3 + 9;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long extraCommand() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 121;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.extraCommand;
        }
        throw null;
    }

    public final long ICustomTabsService() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 33;
        ICustomTabsServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isEngagementSignalsApiAvailable;
        }
        throw null;
    }

    public final long mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 13;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.mayLaunchUrl;
        int i5 = i3 + 51;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 66 / 0;
        }
        return j;
    }

    public final long ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 43;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.ICustomTabsService;
        int i5 = i2 + 51;
        ICustomTabsServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 21;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = z2Var.newAuthTabSession;
        int i5 = i2 + 35;
        requestPostMessageChannelWithExtras = i5 % 128;
        int i6 = i5 % 2;
        return Long.valueOf(j);
    }

    public final long newSessionWithExtras() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 55;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.postMessage;
        if (i4 != 0) {
            int i5 = 88 / 0;
        }
        int i6 = i3 + 125;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 99 / 0;
        }
        return j;
    }

    public final long postMessage() {
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 123;
        ICustomTabsServiceStub = i3 % 128;
        int i4 = i3 % 2;
        long j = this.newSessionWithExtras;
        int i5 = i2 + 11;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long newAuthTabSession() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 73;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.newSession;
        int i5 = i2 + 99;
        requestPostMessageChannelWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return j;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 107;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            long j = z2Var.prefetch;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = z2Var.prefetch;
        int i4 = i2 + 49;
        ICustomTabsServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final long receiveFile() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub + 39;
        int i3 = i2 % 128;
        requestPostMessageChannelWithExtras = i3;
        int i4 = i2 % 2;
        long j = this.requestPostMessageChannel;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        int i6 = i3 + 97;
        ICustomTabsServiceStub = i6 % 128;
        if (i6 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final long prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = ICustomTabsServiceStub;
        int i3 = i2 + 79;
        requestPostMessageChannelWithExtras = i3 % 128;
        int i4 = i3 % 2;
        long j = this.receiveFile;
        int i5 = i2 + 113;
        requestPostMessageChannelWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long requestPostMessageChannel() {
        long j;
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras;
        int i3 = i2 + 49;
        ICustomTabsServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            j = this.setEngagementSignalsCallback;
            int i4 = 19 / 0;
        } else {
            j = this.setEngagementSignalsCallback;
        }
        int i5 = i2 + 97;
        ICustomTabsServiceStub = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        z2 z2Var = (z2) objArr[0];
        int i = 2 % 2;
        int i2 = requestPostMessageChannelWithExtras + 79;
        int i3 = i2 % 128;
        ICustomTabsServiceStub = i3;
        if (i2 % 2 == 0) {
            long j = z2Var.prefetchWithMultipleUrls;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        long j2 = z2Var.prefetchWithMultipleUrls;
        int i4 = i3 + 81;
        requestPostMessageChannelWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return Long.valueOf(j2);
    }

    public final long onExtraCallbackWithResult() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(1812990735, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1812990734, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long access100() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(1953372339, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1953372333, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long extraCallback() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(-286734247, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), 286734247, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long writeTypedObject() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(617942460, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -617942453, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long ICustomTabsCallbackDefault() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(1067679211, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -1067679206, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long newSession() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(75420437, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -75420433, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long prefetch() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(473482027, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -473482025, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }

    public final long setEngagementSignalsCallback() {
        int iOnExtraCallbackWithResult = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult();
        return ((Long) onExtraCallback(829938199, new Object[]{this}, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), -829938196, QuizVar4View.onWarmupCompleted.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult)).longValue();
    }
}
