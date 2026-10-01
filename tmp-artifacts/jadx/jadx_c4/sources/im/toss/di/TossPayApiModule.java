package im.toss.di;

import gatewayprotocol.v1.AdResponseKtKt;
import im.toss.network.model.BaseApiResponse;
import kotlin.jvm.internal.Intrinsics;
import o.AppContext;
import o.AppResumeParams;
import o.GriverActivityRestoreExtension;
import o.GriverManifest25;
import o.GriverManifest27;
import o.GriverManifest38;
import o.GriverManifest4;
import o.GriverManifest401;
import o.GriverManifest44;
import o.GriverManifest46;
import o.GriverManifest51;
import o.GriverManifest54;
import o.GriverManifest56;
import o.GriverManifest57;
import o.GriverManifest61;
import o.GriverManifest63;
import o.GriverManifest64;
import o.GriverManifest7;
import o.access13800;
import o.g1;
import o.getMenus;
import o.zzad;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class TossPayApiModule {
    private static int IAuthTabCallback = 0;
    public static final TossPayApiModule onExtraCallback = new TossPayApiModule();
    private static int onExtraCallbackWithResult = 1;
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;

    static {
        int i = onExtraCallbackWithResult + 117;
        onNavigationEvent = i % 128;
        if (i % 2 != 0) {
            int i2 = 22 / 0;
        }
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~(i7 | i5);
        int i9 = (~(i7 | i3)) | i8;
        int i10 = ~i5;
        int i11 = ~i3;
        int i12 = i9 | (~(i10 | i11 | i));
        int i13 = ~(i7 | i10 | i11);
        int i14 = i10 | i;
        int i15 = (~(i3 | i14)) | i13;
        int i16 = (~i14) | i8;
        int i17 = i + i5 + i6 + ((-327997910) * i4) + ((-604038433) * i2);
        int i18 = i17 * i17;
        int i19 = ((i * 234895570) - 128974848) + (234895570 * i5) + (i12 * 695176798) + (695176798 * i15) + ((-347588399) * i16) + (582483968 * i6) + (36700160 * i4) + ((-297271296) * i2) + (1302134784 * i18);
        int i20 = (i * (-238133666)) + 182491156 + (i5 * (-238133666)) + (i12 * (-1294)) + (i15 * (-1294)) + (i16 * 647) + (i6 * (-238134313)) + (i4 * (-1022231738)) + (i2 * 4118089) + (i18 * (-35979264));
        int i21 = i19 + (i20 * i20 * 1404239872);
        return i21 != 1 ? i21 != 2 ? onNavigationEvent(objArr) : onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    private TossPayApiModule() {
    }

    public static final class onWarmupCompleted implements GriverManifest38 {
        private static int onExtraCallback = 1;
        private static int onNavigationEvent;
        final /* synthetic */ AppContext IAuthTabCallback;

        onWarmupCompleted(AppContext appContext) {
            this.IAuthTabCallback = appContext;
        }

        public Object onExtraCallbackWithResult(String str, MultipartBody.Part part, access13800<? super BaseApiResponse<Boolean>> access13800Var) {
            Object objOnExtraCallbackWithResult;
            int i = 2 % 2;
            int i2 = onExtraCallback + 21;
            onNavigationEvent = i2 % 128;
            if (i2 % 2 != 0) {
                objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(str, part, access13800Var);
                int i3 = 87 / 0;
            } else {
                objOnExtraCallbackWithResult = this.IAuthTabCallback.onExtraCallbackWithResult(str, part, access13800Var);
            }
            int i4 = onExtraCallback + 93;
            onNavigationEvent = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallbackWithResult;
        }

        public Object onExtraCallbackWithResult(String str, access13800<? super ResponseBody> access13800Var) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 109;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(str, access13800Var);
            int i4 = onExtraCallback + 3;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return objOnWarmupCompleted;
        }
    }

    public final GriverManifest38 IAuthTabCallback(@NotNull AppContext appContext) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appContext, "");
        onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(appContext);
        int i2 = IAuthTabCallback + 7;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        return onwarmupcompleted;
    }

    public final GriverManifest27 IAuthTabCallback_Parcel(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 119;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest27.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 65, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest27.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest27) objOnExtraCallback;
    }

    public final GriverManifest25 asBinder(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 99;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest25.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 53, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest25.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest25) objOnExtraCallback;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String strIAuthTabCallbackDefault;
        Class<GriverManifest7> cls;
        Long l;
        Long l2;
        AppResumeParams.onNavigationEvent onnavigationevent;
        int i;
        Object obj;
        g1 g1Var = (g1) objArr[1];
        zzad zzadVar = (zzad) objArr[2];
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 121;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            strIAuthTabCallbackDefault = zzadVar.IAuthTabCallbackDefault();
            cls = GriverManifest7.class;
            l = null;
            l2 = null;
            onnavigationevent = AppResumeParams.onNavigationEvent.onExtraCallback;
            i = 20;
            obj = null;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            strIAuthTabCallbackDefault = zzadVar.IAuthTabCallbackDefault();
            cls = GriverManifest7.class;
            l = null;
            l2 = null;
            onnavigationevent = AppResumeParams.onNavigationEvent.onExtraCallback;
            i = 12;
            obj = null;
        }
        GriverManifest7 griverManifest7 = (GriverManifest7) g1.onExtraCallback(g1Var, cls, strIAuthTabCallbackDefault, l, l2, onnavigationevent, i, obj);
        int i4 = onWarmupCompleted + 101;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        return griverManifest7;
    }

    public final GriverManifest63 access100(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 93;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        GriverManifest63 griverManifest63 = (GriverManifest63) g1.onExtraCallback(g1Var, GriverManifest63.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        int i4 = IAuthTabCallback + 33;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return griverManifest63;
        }
        throw null;
    }

    public final GriverManifest57 IAuthTabCallbackStub(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest57.class, zzadVar.IAuthTabCallbackDefault(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 24, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest57.class, zzadVar.IAuthTabCallbackDefault(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        GriverManifest57 griverManifest57 = (GriverManifest57) objOnExtraCallback;
        int i3 = IAuthTabCallback + 77;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        return griverManifest57;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        g1 g1Var = (g1) objArr[1];
        zzad zzadVar = (zzad) objArr[2];
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 87;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        GriverManifest4 griverManifest4 = (GriverManifest4) g1.onExtraCallback(g1Var, GriverManifest4.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        int i4 = IAuthTabCallback + 119;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return griverManifest4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GriverManifest401 onNavigationEvent(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 9;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest401.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest401.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        GriverManifest401 griverManifest401 = (GriverManifest401) objOnExtraCallback;
        int i3 = IAuthTabCallback + 87;
        onWarmupCompleted = i3 % 128;
        if (i3 % 2 != 0) {
            return griverManifest401;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GriverManifest51 onWarmupCompleted(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest51.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 79, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest51.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest51) objOnExtraCallback;
    }

    public final GriverManifest56 extraCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 59;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest56.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 114, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest56.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest56) objOnExtraCallback;
    }

    public final GriverManifest54 onExtraCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 101;
        IAuthTabCallback = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest54.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 86, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest54.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest54) objOnExtraCallback;
    }

    public final GriverManifest64 onTransact(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 79;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        GriverManifest64 griverManifest64 = (GriverManifest64) g1.onExtraCallback(g1Var, GriverManifest64.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        int i4 = onWarmupCompleted + 1;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            return griverManifest64;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GriverManifest46 IAuthTabCallback(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 51;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest46.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 69, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest46.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest46) objOnExtraCallback;
    }

    public final GriverManifest44 IAuthTabCallbackStubProxy(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 45;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest44.class, zzadVar.newSessionWithExtras(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 74, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, GriverManifest44.class, zzadVar.newSessionWithExtras(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        return (GriverManifest44) objOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        String strIAuthTabCallbackStub;
        Class<GriverActivityRestoreExtension> cls;
        Long l;
        Long l2;
        AppResumeParams.onNavigationEvent onnavigationevent;
        int i;
        g1 g1Var = (g1) objArr[1];
        zzad zzadVar = (zzad) objArr[2];
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 87;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            strIAuthTabCallbackStub = zzadVar.IAuthTabCallbackStub();
            cls = GriverActivityRestoreExtension.class;
            l = null;
            l2 = null;
            onnavigationevent = AppResumeParams.onNavigationEvent.onExtraCallback;
            i = 13;
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            strIAuthTabCallbackStub = zzadVar.IAuthTabCallbackStub();
            cls = GriverActivityRestoreExtension.class;
            l = null;
            l2 = null;
            onnavigationevent = AppResumeParams.onNavigationEvent.onExtraCallback;
            i = 12;
        }
        return (GriverActivityRestoreExtension) g1.onExtraCallback(g1Var, cls, strIAuthTabCallbackStub, l, l2, onnavigationevent, i, (Object) null);
    }

    public final getMenus IAuthTabCallbackDefault(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 91;
        onWarmupCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMenus.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 41, (Object) null);
        } else {
            Intrinsics.checkNotNullParameter(g1Var, "");
            Intrinsics.checkNotNullParameter(zzadVar, "");
            objOnExtraCallback = g1.onExtraCallback(g1Var, getMenus.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        }
        getMenus getmenus = (getMenus) objOnExtraCallback;
        int i3 = onWarmupCompleted + 101;
        IAuthTabCallback = i3 % 128;
        if (i3 % 2 == 0) {
            return getmenus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GriverManifest61 asInterface(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback + 83;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(g1Var, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        GriverManifest61 griverManifest61 = (GriverManifest61) g1.onExtraCallback(g1Var, GriverManifest61.class, zzadVar.IAuthTabCallbackStub(), (Long) null, (Long) null, AppResumeParams.onNavigationEvent.onExtraCallback, 12, (Object) null);
        int i4 = IAuthTabCallback + 89;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return griverManifest61;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final GriverManifest4 onExtraCallbackWithResult(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (GriverManifest4) onWarmupCompleted(-99938300, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this, g1Var, zzadVar}, 99938301, iIAuthTabCallback2);
    }

    public final GriverManifest7 getInterfaceDescriptor(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (GriverManifest7) onWarmupCompleted(148553322, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this, g1Var, zzadVar}, -148553322, iIAuthTabCallback2);
    }

    public final GriverActivityRestoreExtension access000(@NotNull g1 g1Var, @NotNull zzad zzadVar) {
        int iIAuthTabCallback = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback2 = AdResponseKtKt.IAuthTabCallback();
        int iIAuthTabCallback3 = AdResponseKtKt.IAuthTabCallback();
        return (GriverActivityRestoreExtension) onWarmupCompleted(-355077540, AdResponseKtKt.IAuthTabCallback(), iIAuthTabCallback, iIAuthTabCallback3, new Object[]{this, g1Var, zzadVar}, 355077542, iIAuthTabCallback2);
    }
}
