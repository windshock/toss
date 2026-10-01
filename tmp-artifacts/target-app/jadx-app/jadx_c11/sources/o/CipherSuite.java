package o;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CipherSuite {
    private static final secondaryName IAuthTabCallback;
    private static final secondaryName IAuthTabCallbackDefault;
    private static final secondaryName IAuthTabCallbackStub;
    private static final secondaryName IAuthTabCallbackStubProxy;
    private static final secondaryName IAuthTabCallback_Parcel;
    private static final secondaryName ICustomTabsCallback;
    private static final secondaryName ICustomTabsCallbackDefault;
    private static final secondaryName ICustomTabsCallbackStub;
    private static final secondaryName ICustomTabsCallbackStubProxy;
    private static int ICustomTabsService = 1;
    private static final secondaryName access000;
    private static final secondaryName access100;
    private static final secondaryName asBinder;
    private static final secondaryName asInterface;
    private static final secondaryName extraCallback;
    private static final secondaryName extraCallbackWithResult;
    private static int extraCommand = 1;
    private static final secondaryName getInterfaceDescriptor;
    private static int mayLaunchUrl;
    private static final secondaryName onActivityLayout;
    private static final secondaryName onActivityResized;
    private static final secondaryName onExtraCallback;
    private static final secondaryName onExtraCallbackWithResult;
    private static final secondaryName onMessageChannelReady;
    private static final secondaryName onMinimized;
    public static final CipherSuite onNavigationEvent = new CipherSuite();
    private static final secondaryName onPostMessage;
    private static final secondaryName onRelationshipValidationResult;
    private static final secondaryName onTransact;
    private static int onUnminimized;
    private static final secondaryName onWarmupCompleted;
    private static final secondaryName readTypedObject;
    private static final secondaryName writeTypedObject;

    public static /* synthetic */ Object onWarmupCompleted(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        secondaryName secondaryname;
        int i7 = ~i;
        int i8 = (~(i7 | i5)) | i4;
        int i9 = ~i5;
        int i10 = ~i4;
        int i11 = (~(i9 | i10)) | i;
        int i12 = (~(i4 | i9 | i)) | (~(i7 | i9 | i10)) | (~(i10 | i5 | i));
        int i13 = i5 + i + i2 + ((-104759182) * i3) + ((-453318476) * i6);
        int i14 = i13 * i13;
        int i15 = (i5 * 1504131295) + 1805123584 + (1504131295 * i) + (179255518 * i8) + ((-358511036) * i11) + ((-179255518) * i12) + (1324875776 * i2) + (711983104 * i3) + (1180696576 * i6) + (1022754816 * i14);
        int i16 = ((i5 * (-1431886989)) - 1507491630) + (i * (-1431886989)) + (i8 * (-122)) + (i11 * 244) + (i12 * 122) + (i2 * (-1431886867)) + (i3 * 722567050) + (i6 * (-1618605404)) + (i14 * 297664512);
        int i17 = i15 + (i16 * i16 * (-277217280));
        if (i17 == 1) {
            return onWarmupCompleted(objArr);
        }
        if (i17 == 2) {
            int i18 = 2 % 2;
            int i19 = mayLaunchUrl;
            int i20 = i19 + 95;
            extraCommand = i20 % 128;
            int i21 = i20 % 2;
            secondaryname = asBinder;
            int i22 = i19 + 53;
            extraCommand = i22 % 128;
            int i23 = i22 % 2;
        } else {
            if (i17 != 3) {
                return i17 != 4 ? onNavigationEvent(objArr) : IAuthTabCallback(objArr);
            }
            int i24 = 2 % 2;
            int i25 = mayLaunchUrl;
            int i26 = i25 + 15;
            extraCommand = i26 % 128;
            int i27 = i26 % 2;
            secondaryname = extraCallback;
            int i28 = i25 + 79;
            extraCommand = i28 % 128;
            int i29 = i28 % 2;
        }
        return secondaryname;
    }

    private CipherSuite() {
    }

    public final secondaryName IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = extraCommand + 123;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        secondaryName secondaryname = onExtraCallbackWithResult;
        int i4 = i3 + 43;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return secondaryname;
    }

    static {
        deprecated_realm deprecated_realmVar = deprecated_realm.Regular;
        deprecated_charset deprecated_charsetVar = deprecated_charset.Medium;
        onExtraCallbackWithResult = new secondaryName(deprecated_realmVar, 19.0f, deprecated_charsetVar);
        onWarmupCompleted = new secondaryName(deprecated_realmVar, 17.0f, deprecated_charsetVar);
        deprecated_realm deprecated_realmVar2 = deprecated_realm.Medium;
        IAuthTabCallback = new secondaryName(deprecated_realmVar2, 17.0f, deprecated_charsetVar);
        onExtraCallback = new secondaryName(deprecated_realmVar, 13.0f, deprecated_charsetVar);
        deprecated_realm deprecated_realmVar3 = deprecated_realm.Bold;
        deprecated_charset deprecated_charsetVar2 = deprecated_charset.Small;
        onTransact = new secondaryName(deprecated_realmVar3, 30.0f, deprecated_charsetVar2);
        IAuthTabCallbackStub = new secondaryName(deprecated_realmVar3, 28.0f, deprecated_charsetVar2);
        asBinder = new secondaryName(deprecated_realmVar3, 26.0f, deprecated_charsetVar2);
        deprecated_realm deprecated_realmVar4 = deprecated_realm.SemiBold;
        deprecated_charset deprecated_charsetVar3 = deprecated_charset.XSmall;
        IAuthTabCallbackDefault = new secondaryName(deprecated_realmVar4, 19.0f, deprecated_charsetVar3);
        asInterface = new secondaryName(deprecated_realmVar4, 17.0f, deprecated_charsetVar3);
        getInterfaceDescriptor = new secondaryName(deprecated_realmVar3, 17.0f, deprecated_charsetVar3);
        access000 = new secondaryName(deprecated_realmVar2, 17.0f, deprecated_charsetVar3);
        access100 = new secondaryName(deprecated_realmVar4, 15.0f, deprecated_charsetVar3);
        IAuthTabCallback_Parcel = new secondaryName(deprecated_realmVar3, 15.0f, deprecated_charsetVar3);
        IAuthTabCallbackStubProxy = new secondaryName(deprecated_realmVar2, 15.0f, deprecated_charsetVar3);
        extraCallback = new secondaryName(deprecated_realmVar4, 13.0f, deprecated_charsetVar3);
        readTypedObject = new secondaryName(deprecated_realmVar2, 13.0f, deprecated_charsetVar3);
        extraCallbackWithResult = new secondaryName(deprecated_realmVar, 15.0f, deprecated_charsetVar2);
        writeTypedObject = new secondaryName(deprecated_realmVar, 13.0f, deprecated_charsetVar2);
        ICustomTabsCallback = new secondaryName(deprecated_realmVar2, 13.0f, deprecated_charsetVar2);
        onMinimized = new secondaryName(deprecated_realmVar, 12.0f, deprecated_charsetVar2);
        onActivityResized = new secondaryName(deprecated_realmVar3, 24.0f, deprecated_charsetVar2);
        onPostMessage = new secondaryName(deprecated_realmVar3, 22.0f, deprecated_charsetVar2);
        onActivityLayout = new secondaryName(deprecated_realmVar3, 20.0f, deprecated_charsetVar2);
        onMessageChannelReady = new secondaryName(deprecated_realmVar4, 20.0f, deprecated_charsetVar2);
        onRelationshipValidationResult = new secondaryName(deprecated_realmVar2, 20.0f, deprecated_charsetVar2);
        ICustomTabsCallbackStub = new secondaryName(deprecated_realmVar3, 17.0f, deprecated_charsetVar2);
        ICustomTabsCallbackStubProxy = new secondaryName(deprecated_realmVar4, 17.0f, deprecated_charsetVar2);
        ICustomTabsCallbackDefault = new secondaryName(deprecated_realmVar2, 17.0f, deprecated_charsetVar2);
        int i = onUnminimized + 3;
        ICustomTabsService = i % 128;
        int i2 = i % 2;
    }

    public final secondaryName onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 63;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        secondaryName secondaryname = onWarmupCompleted;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return secondaryname;
    }

    public final secondaryName onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 71;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = IAuthTabCallback;
        int i5 = i3 + 29;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName onNavigationEvent() {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        mayLaunchUrl = i2 % 128;
        int i3 = i2 % 2;
        secondaryName secondaryname = onExtraCallback;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return secondaryname;
    }

    public final secondaryName onExtraCallback() {
        secondaryName secondaryname;
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 17;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            secondaryname = onTransact;
            int i4 = 16 / 0;
        } else {
            secondaryname = onTransact;
        }
        int i5 = i2 + 7;
        extraCommand = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return secondaryname;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCommand + 67;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = IAuthTabCallbackStub;
        int i5 = i3 + 73;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName asInterface() {
        secondaryName secondaryname;
        int i = 2 % 2;
        int i2 = extraCommand + 99;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        if (i2 % 2 != 0) {
            secondaryname = IAuthTabCallbackDefault;
            int i4 = 5 / 0;
        } else {
            secondaryname = IAuthTabCallbackDefault;
        }
        int i5 = i3 + 121;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return secondaryname;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final secondaryName IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 63;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = asInterface;
        int i5 = i2 + 39;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName onTransact() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl;
        int i3 = i2 + 91;
        extraCommand = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        secondaryName secondaryname = getInterfaceDescriptor;
        int i4 = i2 + 57;
        extraCommand = i4 % 128;
        int i5 = i4 % 2;
        return secondaryname;
    }

    public final secondaryName access000() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 3;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = access000;
        int i5 = i2 + 81;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 47;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = access100;
        int i5 = i3 + 77;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 81;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = IAuthTabCallback_Parcel;
        int i5 = i3 + 105;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName IAuthTabCallback_Parcel() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 15;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = IAuthTabCallbackStubProxy;
        int i5 = i2 + 5;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName readTypedObject() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 113;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = readTypedObject;
        int i5 = i3 + 101;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = extraCommand + 51;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = extraCallbackWithResult;
        int i5 = i3 + 41;
        extraCommand = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName extraCallback() {
        secondaryName secondaryname;
        int i = 2 % 2;
        int i2 = extraCommand + 85;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        if (i2 % 2 != 0) {
            secondaryname = writeTypedObject;
            int i4 = 71 / 0;
        } else {
            secondaryname = writeTypedObject;
        }
        int i5 = i3 + 41;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName writeTypedObject() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 63;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = ICustomTabsCallback;
        int i5 = i2 + 77;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 105;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        secondaryName secondaryname = onMinimized;
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return secondaryname;
    }

    public final secondaryName onMinimized() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 3;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = onActivityResized;
        int i5 = i2 + 51;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = extraCommand + 87;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = onPostMessage;
        int i5 = i3 + 111;
        extraCommand = i5 % 128;
        if (i5 % 2 != 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName onActivityResized() {
        int i = 2 % 2;
        int i2 = extraCommand + 81;
        int i3 = i2 % 128;
        mayLaunchUrl = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        secondaryName secondaryname = onActivityLayout;
        int i4 = i3 + 115;
        extraCommand = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 59 / 0;
        }
        return secondaryname;
    }

    public final secondaryName onActivityLayout() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 55;
        int i3 = i2 % 128;
        extraCommand = i3;
        int i4 = i2 % 2;
        secondaryName secondaryname = onMessageChannelReady;
        int i5 = i3 + 65;
        mayLaunchUrl = i5 % 128;
        int i6 = i5 % 2;
        return secondaryname;
    }

    public final secondaryName onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 29;
        extraCommand = i2 % 128;
        int i3 = i2 % 2;
        secondaryName secondaryname = onRelationshipValidationResult;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return secondaryname;
    }

    public final secondaryName onRelationshipValidationResult() {
        int i = 2 % 2;
        int i2 = extraCommand;
        int i3 = i2 + 11;
        mayLaunchUrl = i3 % 128;
        int i4 = i3 % 2;
        secondaryName secondaryname = ICustomTabsCallbackStub;
        int i5 = i2 + 99;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return secondaryname;
    }

    public final secondaryName ICustomTabsCallbackStub() {
        secondaryName secondaryname;
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 49;
        int i3 = i2 % 128;
        extraCommand = i3;
        if (i2 % 2 == 0) {
            secondaryname = ICustomTabsCallbackStubProxy;
            int i4 = 75 / 0;
        } else {
            secondaryname = ICustomTabsCallbackStubProxy;
        }
        int i5 = i3 + 75;
        mayLaunchUrl = i5 % 128;
        if (i5 % 2 == 0) {
            return secondaryname;
        }
        throw null;
    }

    public final secondaryName ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = mayLaunchUrl + 123;
        int i3 = i2 % 128;
        extraCommand = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        secondaryName secondaryname = ICustomTabsCallbackDefault;
        int i4 = i3 + 93;
        mayLaunchUrl = i4 % 128;
        int i5 = i4 % 2;
        return secondaryname;
    }

    public final secondaryName asBinder() {
        return (secondaryName) onWarmupCompleted(-30034681, new Object[]{this}, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), 30034681, matches.onExtraCallback());
    }

    public final secondaryName IAuthTabCallbackDefault() {
        return (secondaryName) onWarmupCompleted(1222391594, new Object[]{this}, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1222391592, matches.onExtraCallback());
    }

    public final secondaryName getInterfaceDescriptor() {
        return (secondaryName) onWarmupCompleted(1775373783, new Object[]{this}, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1775373779, matches.onExtraCallback());
    }

    public final secondaryName access100() {
        return (secondaryName) onWarmupCompleted(178096383, new Object[]{this}, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -178096380, matches.onExtraCallback());
    }

    public final secondaryName onPostMessage() {
        return (secondaryName) onWarmupCompleted(1116295966, new Object[]{this}, matches.onExtraCallback(), matches.onExtraCallback(), matches.onExtraCallback(), -1116295965, matches.onExtraCallback());
    }
}
