package o;

import im.toss.splittarget.impl.fsm.AppStateImpl$;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class getExtensionManager {
    static int onWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(getExtensionManager.class);
    private final List<String> IAuthTabCallback;
    private final getAppVersion IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final String asBinder;
    private final getOriginalStartParams onExtraCallback;
    private final getAppContext onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final String onTransact;

    public static final /* synthetic */ class IAuthTabCallback {
        static int onNavigationEvent = BackgroundThreadStateHandlerExternalSyntheticLambda0.onNavigationEvent(IAuthTabCallback.class);
        public static final /* synthetic */ int[] onWarmupCompleted;

        static {
            int[] iArr = new int[getAppContext.values().length];
            try {
                int iOrdinal = getAppContext.TOSS_TEAM_ALPHA.ordinal();
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3068);
                iArr[iOrdinal] = 1;
                int i = onNavigationEvent;
                int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
                int i2 = (~iOnWarmupCompleted) & i;
                int i3 = (~i) & iOnWarmupCompleted;
                if (((((i3 & i2) | (i2 ^ i3)) >> 20) & 1) != 0) {
                    int i4 = 3 / 4;
                } else {
                    int i5 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[getAppContext.TOSS_TEAM.ordinal()] = 2;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2106);
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[getAppContext.ANYONE.ordinal()] = 3;
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5391);
                int i7 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            onWarmupCompleted = iArr;
            int i8 = onNavigationEvent;
            int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
            if (((i8 | iOnWarmupCompleted2) & (~(i8 & iOnWarmupCompleted2)) & 1) != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i5;
        int i9 = (~(i8 | i2)) | i7;
        int i10 = (~(i7 | (~i2) | i5)) | (~(i8 | i7 | i2));
        int i11 = (~(i2 | i5)) | (~(i4 | i5));
        int i12 = i4 + i5 + i6 + ((-1520811122) * i) + (1880343047 * i3);
        int i13 = i12 * i12;
        int i14 = (((-88056299) * i4) - 1254686720) + (875799021 * i5) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i6) + ((-206831616) * i) + (408289280 * i3) + ((-683737088) * i13);
        int i15 = ((i4 * (-660833811)) - 1995073173) + (i5 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i6 * (-660833671)) + (i * 644061726) + (i3 * (-2012083377)) + (i13 * (-1027145728));
        switch (i14 + (i15 * i15 * 814809088)) {
            case 1:
                return IAuthTabCallback(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return onExtraCallbackWithResult(objArr);
            case 4:
                return onNavigationEvent(objArr);
            case 5:
                return asInterface(objArr);
            case 6:
                return onTransact(objArr);
            case 7:
                return asBinder(objArr);
            default:
                return onWarmupCompleted(objArr);
        }
    }

    public getExtensionManager(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @Nullable String str3, @Nullable String str4, @NotNull getAppVersion getappversion, @NotNull getAppContext getappcontext, @NotNull getOriginalStartParams getoriginalstartparams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1560);
        if ((((((~i) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i)) >> 4) & 1) != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(getappversion, "");
            int i2 = 82 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(getappversion, "");
        }
        int i3 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1959);
        if ((((((~i3) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i3)) >> 4) & 1) == 0) {
            Intrinsics.checkNotNullParameter(getappcontext, "");
            Intrinsics.checkNotNullParameter(getoriginalstartparams, "");
            int i4 = 80 / 0;
        } else {
            Intrinsics.checkNotNullParameter(getappcontext, "");
            Intrinsics.checkNotNullParameter(getoriginalstartparams, "");
        }
        this.onTransact = str;
        this.IAuthTabCallback = list;
        this.asBinder = str2;
        this.IAuthTabCallbackStub = str3;
        this.onNavigationEvent = str4;
        this.IAuthTabCallbackDefault = getappversion;
        this.onExtraCallbackWithResult = getappcontext;
        this.onExtraCallback = getoriginalstartparams;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3949);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 14) & 1;
        String str = getextensionmanager.onTransact;
        if (i5 == 0) {
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2116);
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
        String str = getextensionmanager.asBinder;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3558);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        if (((((i4 & i3) | (i3 ^ i4)) >> 6) & 1) != 0) {
            int i5 = 34 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
        String str = getextensionmanager.IAuthTabCallbackStub;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5517);
        if ((((((~i2) & iOnWarmupCompleted) | ((~iOnWarmupCompleted) & i2)) >> 13) & 1) != 0) {
            return str;
        }
        throw null;
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2457);
        int i3 = (((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 10) & 1;
        String str = getextensionmanager.onNavigationEvent;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4560);
        return str;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(894);
        int i3 = (~iOnWarmupCompleted) & i2;
        int i4 = (~i2) & iOnWarmupCompleted;
        int i5 = (((i4 & i3) | (i3 ^ i4)) >> 31) & 1;
        getAppVersion getappversion = getextensionmanager.IAuthTabCallbackDefault;
        if (i5 == 0) {
            throw null;
        }
        int i6 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5489);
        int i7 = (~iOnWarmupCompleted2) & i6;
        int i8 = (~i6) & iOnWarmupCompleted2;
        if (((((i8 & i7) | (i7 ^ i8)) >> 26) & 1) != 0) {
            int i9 = 25 / 0;
        }
        return getappversion;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5171);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = ((((i2 ^ iOnWarmupCompleted) | i3) & (~i3)) >> 25) & 1;
        getOriginalStartParams getoriginalstartparams = getextensionmanager.onExtraCallback;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = onWarmupCompleted;
        int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5161);
        if ((((((~i6) & iOnWarmupCompleted2) | ((~iOnWarmupCompleted2) & i6)) >> 14) & 1) != 0) {
            return getoriginalstartparams;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r6 = o.getExtensionManager.onWarmupCompleted;
        r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
        r3 = r6 & r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if ((((((r6 ^ r1) | r3) & (~r3)) >> 27) & 1) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r6 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (r6 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            o.getExtensionManager r1 = (o.getExtensionManager) r1
            r2 = 1
            r6 = r6[r2]
            java.lang.String r6 = (java.lang.String) r6
            r3 = 2
            int r3 = r3 % r3
            r3 = 3684(0xe64, float:5.162E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r3)
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.lang.String r3 = r1.onTransact
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto L5b
            int r3 = o.getExtensionManager.onWarmupCompleted
            r4 = 1212(0x4bc, float:1.698E-42)
            int r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
            int r5 = ~r4
            r5 = r5 & r3
            int r3 = ~r3
            r3 = r3 & r4
            r4 = r5 ^ r3
            r3 = r3 & r5
            r3 = r3 | r4
            int r3 = r3 >> 10
            r3 = r3 & r2
            java.util.List<java.lang.String> r1 = r1.IAuthTabCallback
            boolean r6 = r1.contains(r6)
            if (r3 != 0) goto L40
            r1 = 75
            int r1 = r1 / r0
            if (r6 != 0) goto L5b
            goto L42
        L40:
            if (r6 != 0) goto L5b
        L42:
            int r6 = o.getExtensionManager.onWarmupCompleted
            r1 = 3939(0xf63, float:5.52E-42)
            int r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            r3 = r6 & r1
            int r4 = ~r3
            r6 = r6 ^ r1
            r6 = r6 | r3
            r6 = r6 & r4
            int r6 = r6 >> 27
            r6 = r6 & r2
            if (r6 == 0) goto L56
            r0 = r2
        L56:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L5b:
            int r6 = o.getExtensionManager.onWarmupCompleted
            r0 = 4169(0x1049, float:5.842E-42)
            int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            int r1 = ~r0
            r1 = r1 & r6
            int r6 = ~r6
            r6 = r6 & r0
            r0 = r1 ^ r6
            r6 = r6 & r1
            r6 = r6 | r0
            int r6 = r6 >> r2
            r6 = r6 & r2
            if (r6 == 0) goto L74
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L74:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExtensionManager.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) throws NoWhenBranchMatchedException {
        getExtensionManager getextensionmanager = (getExtensionManager) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(126);
        int i3 = i2 & iOnWarmupCompleted;
        int i4 = (i2 ^ iOnWarmupCompleted) | i3;
        Object obj = null;
        if ((((i4 & (~i3)) >> 25) & 1) == 0) {
            int i5 = IAuthTabCallback.onWarmupCompleted[getextensionmanager.onExtraCallbackWithResult.ordinal()];
            throw null;
        }
        int i6 = IAuthTabCallback.onWarmupCompleted[getextensionmanager.onExtraCallbackWithResult.ordinal()];
        if (i6 == 1) {
            if (zBooleanValue) {
                BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(601);
                if (zBooleanValue2) {
                    BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2947);
                    int i7 = onWarmupCompleted;
                    int iOnWarmupCompleted2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(5625);
                    int i8 = i7 & iOnWarmupCompleted2;
                    if ((((((i7 ^ iOnWarmupCompleted2) | i8) & (~i8)) >> 1) & 1) == 0) {
                        return true;
                    }
                    obj.hashCode();
                    throw null;
                }
            }
            int i9 = onWarmupCompleted;
            int iOnWarmupCompleted3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3338);
            int i10 = (~iOnWarmupCompleted3) & i9;
            int i11 = (~i9) & iOnWarmupCompleted3;
            if (((((i11 & i10) | (i10 ^ i11)) >> 7) & 1) == 0) {
                int i12 = 37 / 0;
            }
            return false;
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3181);
        int i13 = onWarmupCompleted;
        if (i6 == 2) {
            int iOnWarmupCompleted4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(4615);
            int i14 = i13 & iOnWarmupCompleted4;
            if ((((((i13 ^ iOnWarmupCompleted4) | i14) & (~i14)) >> 24) & 1) != 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            int i15 = 6 / 0;
            return Boolean.valueOf(zBooleanValue);
        }
        int iOnWarmupCompleted5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(6100);
        int i16 = (~iOnWarmupCompleted5) & i13;
        int i17 = (~i13) & iOnWarmupCompleted5;
        if (((((i17 & i16) | (i16 ^ i17)) >> 8) & 1) != 0 ? i6 != 3 : i6 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(13);
        int i18 = onWarmupCompleted;
        int iOnWarmupCompleted6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(3939);
        int i19 = i18 & iOnWarmupCompleted6;
        if ((((((i18 ^ iOnWarmupCompleted6) | i19) & (~i19)) >> 31) & 1) != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5.onTransact) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5.onTransact) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r0 = r0 % r0
            int r0 = o.getExtensionManager.onWarmupCompleted
            r1 = 1495(0x5d7, float:2.095E-42)
            int r1 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r1)
            r2 = r0 & r1
            int r3 = ~r2
            r0 = r0 ^ r1
            r0 = r0 | r2
            r0 = r0 & r3
            int r0 = r0 >> 29
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != 0) goto L62
            if (r5 == r6) goto L4b
            boolean r0 = r6 instanceof o.getExtensionManager
            r0 = r0 ^ r1
            r3 = 0
            if (r0 == r1) goto L45
            int r0 = o.getExtensionManager.onWarmupCompleted
            r4 = 5517(0x158d, float:7.731E-42)
            int r4 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r4)
            r0 = r0 ^ r4
            int r0 = r0 >> 24
            r0 = r0 & r1
            o.getExtensionManager r6 = (o.getExtensionManager) r6
            java.lang.String r6 = r6.onTransact
            if (r0 != 0) goto L3d
            java.lang.String r0 = r5.onTransact
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            r0 = 21
            int r0 = r0 / r3
            if (r6 != 0) goto L4b
            goto L45
        L3d:
            java.lang.String r0 = r5.onTransact
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
            if (r6 != 0) goto L4b
        L45:
            r6 = 3045(0xbe5, float:4.267E-42)
            o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r6)
            return r3
        L4b:
            int r6 = o.getExtensionManager.onWarmupCompleted
            r0 = 2171(0x87b, float:3.042E-42)
            int r0 = o.BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(r0)
            int r3 = ~r0
            r3 = r3 & r6
            int r6 = ~r6
            r6 = r6 & r0
            r0 = r3 ^ r6
            r6 = r6 & r3
            r6 = r6 | r0
            int r6 = r6 >> 18
            r6 = r6 & r1
            if (r6 == 0) goto L61
            return r1
        L61:
            throw r2
        L62:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExtensionManager.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = onWarmupCompleted;
        int iOnWarmupCompleted = BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(2054);
        if (((((i2 | iOnWarmupCompleted) & (~(i2 & iOnWarmupCompleted))) >> 13) & 1) == 0) {
            int iHashCode = this.onTransact.hashCode();
            BackgroundThreadStateHandlerExternalSyntheticLambda0.onWarmupCompleted(1851);
            return iHashCode;
        }
        this.onTransact.hashCode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final getOriginalStartParams onExtraCallback() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (getOriginalStartParams) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -219664765, 219664770, iOnWarmupCompleted2, new Object[]{this});
    }

    public final String onNavigationEvent() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -348180512, 348180519, iOnWarmupCompleted2, new Object[]{this});
    }

    public final getAppVersion onExtraCallbackWithResult() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (getAppVersion) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 1284888973, -1284888967, iOnWarmupCompleted2, new Object[]{this});
    }

    public final String onWarmupCompleted() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 628967924, -628967923, iOnWarmupCompleted2, new Object[]{this});
    }

    public final String IAuthTabCallback() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), 852462035, -852462031, iOnWarmupCompleted2, new Object[]{this});
    }

    public final String IAuthTabCallbackDefault() {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return (String) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -569984981, 569984983, iOnWarmupCompleted2, new Object[]{this});
    }

    public final boolean onNavigationEvent(boolean z, boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2)};
        return ((Boolean) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -802291679, 802291679, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), objArr)).booleanValue();
    }

    public final boolean IAuthTabCallback(@NotNull String str) {
        int iOnWarmupCompleted = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        int iOnWarmupCompleted2 = AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted();
        return ((Boolean) onExtraCallback(AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), iOnWarmupCompleted, AppStateImpl$.ExternalSyntheticLambda11.onWarmupCompleted(), -1363578609, 1363578612, iOnWarmupCompleted2, new Object[]{this, str})).booleanValue();
    }
}
