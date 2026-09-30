package o;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ExtensionsInfoExternalSyntheticLambda1;
import o.r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs;
import o.r8lambda3ItRKs506ZA10acMn5vNx6LxE;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs implements SessionProcessorBaseExternalSyntheticLambda0 {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int getInterfaceDescriptor;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult IAuthTabCallback;
    private final Function2<ExtensionsInfoExternalSyntheticLambda1, ExtensionsInfoExternalSyntheticLambda1, Unit> IAuthTabCallbackDefault;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback IAuthTabCallbackStub;
    private final int IAuthTabCallback_Parcel;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult access000;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult access100;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback asBinder;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback asInterface;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult onExtraCallback;
    private final r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 onExtraCallbackWithResult;
    private final long onNavigationEvent;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback onTransact;
    private final r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult onWarmupCompleted;

    public /* synthetic */ r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs(long j, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, r8lambdanm9dm2eewl4vrptnjmesfjqky4, i, function2);
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda12) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 99;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(extensionsInfoExternalSyntheticLambda1, extensionsInfoExternalSyntheticLambda12);
        int i4 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return unitIAuthTabCallback;
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = getInterfaceDescriptor + 27;
            IAuthTabCallbackStubProxy = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs)) {
            int i3 = IAuthTabCallbackStubProxy + 69;
            getInterfaceDescriptor = i3 % 128;
            return i3 % 2 != 0;
        }
        r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs r8lambda0nbc6vci9rmwn978yhocz7g7mcs = (r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs) obj;
        if (!r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(this.onNavigationEvent, r8lambda0nbc6vci9rmwn978yhocz7g7mcs.onNavigationEvent)) {
            return false;
        }
        if (Intrinsics.areEqual(this.onExtraCallbackWithResult, r8lambda0nbc6vci9rmwn978yhocz7g7mcs.onExtraCallbackWithResult)) {
            return this.IAuthTabCallback_Parcel == r8lambda0nbc6vci9rmwn978yhocz7g7mcs.IAuthTabCallback_Parcel && Intrinsics.areEqual(this.IAuthTabCallbackDefault, r8lambda0nbc6vci9rmwn978yhocz7g7mcs.IAuthTabCallbackDefault);
        }
        int i4 = IAuthTabCallbackStubProxy + 47;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 49;
        getInterfaceDescriptor = i2 % 128;
        return i2 % 2 != 0 ? ((((r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.onNavigationEvent) << 43) << this.onExtraCallbackWithResult.hashCode()) / 6) % Integer.hashCode(this.IAuthTabCallback_Parcel)) * 102 * this.IAuthTabCallbackDefault.hashCode() : (((((r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onExtraCallbackWithResult(this.onNavigationEvent) * 31) + this.onExtraCallbackWithResult.hashCode()) * 31) + Integer.hashCode(this.IAuthTabCallback_Parcel)) * 31) + this.IAuthTabCallbackDefault.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DropdownMenuPositionProvider(contentOffset=" + r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.asInterface(this.onNavigationEvent) + ", density=" + this.onExtraCallbackWithResult + ", verticalMargin=" + this.IAuthTabCallback_Parcel + ", onPositionCalculated=" + this.IAuthTabCallbackDefault + ")";
        int i2 = getInterfaceDescriptor + 87;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs(long j, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, Function2<? super ExtensionsInfoExternalSyntheticLambda1, ? super ExtensionsInfoExternalSyntheticLambda1, Unit> function2) {
        Intrinsics.checkNotNullParameter(r8lambdanm9dm2eewl4vrptnjmesfjqky4, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.onNavigationEvent = j;
        this.onExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4;
        this.IAuthTabCallback_Parcel = i;
        this.IAuthTabCallbackDefault = function2;
        int iOnExtraCallbackWithResult = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onWarmupCompleted(j));
        r8lambda3ItRKs506ZA10acMn5vNx6LxE r8lambda3itrks506za10acmn5vnx6lxe = r8lambda3ItRKs506ZA10acMn5vNx6LxE.IAuthTabCallback;
        this.asBinder = r8lambda3itrks506za10acmn5vnx6lxe.IAuthTabCallbackDefault(iOnExtraCallbackWithResult);
        this.asInterface = r8lambda3itrks506za10acmn5vnx6lxe.onExtraCallbackWithResult(iOnExtraCallbackWithResult);
        this.onTransact = r8lambda3itrks506za10acmn5vnx6lxe.onExtraCallback(0);
        this.IAuthTabCallbackStub = r8lambda3itrks506za10acmn5vnx6lxe.onTransact(0);
        int iOnExtraCallbackWithResult2 = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(r8lambdaxK7J_OPoPIl8bofTcVKoHRGf_nM.onNavigationEvent(j));
        this.access100 = r8lambda3itrks506za10acmn5vnx6lxe.asInterface(iOnExtraCallbackWithResult2);
        this.onExtraCallback = r8lambda3itrks506za10acmn5vnx6lxe.IAuthTabCallback(iOnExtraCallbackWithResult2);
        this.onWarmupCompleted = r8lambda3itrks506za10acmn5vnx6lxe.onWarmupCompleted(iOnExtraCallbackWithResult2);
        this.access000 = r8lambda3itrks506za10acmn5vnx6lxe.asBinder(i);
        this.IAuthTabCallback = r8lambda3itrks506za10acmn5vnx6lxe.onNavigationEvent(i);
    }

    public /* synthetic */ r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs(long j, r8lambdaNm9dM2EEwl4VRptNjmesFJQKy4 r8lambdanm9dm2eewl4vrptnjmesfjqky4, int i, Function2 function2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            int i3 = IAuthTabCallbackStubProxy + 51;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            i = r8lambdanm9dm2eewl4vrptnjmesfjqky4.onExtraCallbackWithResult(w7.onExtraCallback());
        }
        int i5 = i;
        if ((i2 & 8) != 0) {
            function2 = new Function2() { // from class: im.toss.tds.compose.component.compound.menu.internal.DropdownMenuPositionProvider$$ExternalSyntheticLambda0
                private static int IAuthTabCallback = 0;
                private static int onExtraCallbackWithResult = 1;

                public final Object invoke(Object obj, Object obj2) {
                    int i6 = 2 % 2;
                    int i7 = onExtraCallbackWithResult + 93;
                    IAuthTabCallback = i7 % 128;
                    Object obj3 = null;
                    ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1 = (ExtensionsInfoExternalSyntheticLambda1) obj;
                    ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda12 = (ExtensionsInfoExternalSyntheticLambda1) obj2;
                    if (i7 % 2 != 0) {
                        r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs.onExtraCallbackWithResult(extensionsInfoExternalSyntheticLambda1, extensionsInfoExternalSyntheticLambda12);
                        throw null;
                    }
                    Unit unitOnExtraCallbackWithResult = r8lambda0Nbc6vCI9RMwN978YHoCZ7g7mCs.onExtraCallbackWithResult(extensionsInfoExternalSyntheticLambda1, extensionsInfoExternalSyntheticLambda12);
                    int i8 = onExtraCallbackWithResult + 63;
                    IAuthTabCallback = i8 % 128;
                    if (i8 % 2 == 0) {
                        return unitOnExtraCallbackWithResult;
                    }
                    obj3.hashCode();
                    throw null;
                }
            };
            int i6 = IAuthTabCallbackStubProxy + 105;
            getInterfaceDescriptor = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 % 2;
            }
        }
        this(j, r8lambdanm9dm2eewl4vrptnjmesfjqky4, i5, function2, null);
    }

    private static final Unit IAuthTabCallback(ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda12) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 121;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda12, "");
        Unit unit = Unit.INSTANCE;
        int i4 = getInterfaceDescriptor + 95;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 56 / 0;
        }
        return unit;
    }

    public long onExtraCallback(@NotNull ExtensionsInfoExternalSyntheticLambda1 extensionsInfoExternalSyntheticLambda1, long j, @NotNull ExtensionsManagerExtensionsAvailability extensionsManagerExtensionsAvailability, long j2) {
        r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback onextracallback;
        int iIAuthTabCallback;
        int iOnWarmupCompleted;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStubProxy + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(extensionsInfoExternalSyntheticLambda1, "");
        Intrinsics.checkNotNullParameter(extensionsManagerExtensionsAvailability, "");
        r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback onextracallback2 = this.asBinder;
        r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback onextracallback3 = this.asInterface;
        int i5 = (int) (j >> 32);
        if (ExtensionsInfoExternalSyntheticLambda0.onWarmupCompleted(extensionsInfoExternalSyntheticLambda1.onNavigationEvent()) < i5 / 2) {
            int i6 = IAuthTabCallbackStubProxy + 89;
            getInterfaceDescriptor = i6 % 128;
            int i7 = i6 % 2;
            onextracallback = this.onTransact;
        } else {
            onextracallback = this.IAuthTabCallbackStub;
        }
        List listListOf = CollectionsKt.listOf(new r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback[]{onextracallback2, onextracallback3, onextracallback});
        int size = listListOf.size();
        int i8 = IAuthTabCallbackStubProxy + 21;
        getInterfaceDescriptor = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 5 / 3;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                iIAuthTabCallback = 0;
                break;
            }
            int i11 = IAuthTabCallbackStubProxy + 41;
            getInterfaceDescriptor = i11 % 128;
            int i12 = i11 % i;
            int i13 = (int) (j2 >> 32);
            int i14 = i10;
            int i15 = size;
            List list = listListOf;
            iIAuthTabCallback = ((r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallback) listListOf.get(i10)).IAuthTabCallback(extensionsInfoExternalSyntheticLambda1, j, i13, extensionsManagerExtensionsAvailability);
            if (i14 == CollectionsKt.getLastIndex(list)) {
                break;
            }
            int i16 = IAuthTabCallbackStubProxy + 107;
            getInterfaceDescriptor = i16 % 128;
            int i17 = i16 % 2;
            if (iIAuthTabCallback >= 0 && i13 + iIAuthTabCallback <= i5) {
                break;
            }
            i10 = i14 + 1;
            size = i15;
            listListOf = list;
            i = 2;
        }
        int i18 = (int) j;
        List listListOf2 = CollectionsKt.listOf(new r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult[]{this.access100, this.onExtraCallback, this.onWarmupCompleted, ExtensionsInfoExternalSyntheticLambda0.onExtraCallback(extensionsInfoExternalSyntheticLambda1.onNavigationEvent()) < i18 / 2 ? this.access000 : this.IAuthTabCallback});
        int size2 = listListOf2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size2) {
                iOnWarmupCompleted = 0;
                break;
            }
            int i20 = getInterfaceDescriptor + 123;
            IAuthTabCallbackStubProxy = i20 % 128;
            int i21 = i20 % 2;
            int i22 = (int) j2;
            iOnWarmupCompleted = ((r8lambda3ItRKs506ZA10acMn5vNx6LxE.onExtraCallbackWithResult) listListOf2.get(i19)).onWarmupCompleted(extensionsInfoExternalSyntheticLambda1, j, i22);
            if (i19 == CollectionsKt.getLastIndex(listListOf2)) {
                break;
            }
            int i23 = this.IAuthTabCallback_Parcel;
            if (iOnWarmupCompleted >= i23) {
                int i24 = IAuthTabCallbackStubProxy + 97;
                getInterfaceDescriptor = i24 % 128;
                int i25 = i24 % 2;
                if (i22 + iOnWarmupCompleted <= i18 - i23) {
                    break;
                }
            }
            i19++;
        }
        long jOnNavigationEvent = ExtensionsInfoExternalSyntheticLambda0.onNavigationEvent((iIAuthTabCallback << 32) | (iOnWarmupCompleted & 4294967295L));
        this.IAuthTabCallbackDefault.invoke(extensionsInfoExternalSyntheticLambda1, ExtensionsManagerExternalSyntheticLambda1.onExtraCallbackWithResult(jOnNavigationEvent, j2));
        return jOnNavigationEvent;
    }
}
