package o;

import android.content.Context;
import android.media.MediaDrm;
import android.os.Build;
import android.provider.Settings;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.components.identifier.unique.Remembered;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt;
import o.RealDrawScopeSizeResolver;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class RealDrawScopeSizeResolver implements ConstraintsSizeResolverExternalSyntheticLambda0 {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access100 = 1;
    private static int extraCallbackWithResult = 1;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallback = {new PropertyReference1Impl<>(RealDrawScopeSizeResolver.class, "realmFileName", "getRealmFileName()Ljava/lang/String;", 0), new PropertyReference1Impl<>(RealDrawScopeSizeResolver.class, "realmEncryptionKey", "getRealmEncryptionKey()[B", 0)};
    private static int writeTypedObject;
    private boolean IAuthTabCallback;
    private final Context IAuthTabCallbackDefault;
    private final Remembered<byte[]> IAuthTabCallbackStub;
    private final RealDrawScopeSizeResolversizeinlinedmapNotNull121 IAuthTabCallback_Parcel;
    private final Lazy access000;
    private final Remembered<String> asBinder;
    private final Lazy asInterface;
    private final Lazy getInterfaceDescriptor;
    private final Lazy onExtraCallbackWithResult;
    private final String onNavigationEvent;
    private final RealSubcomposeAsyncImageScope onTransact;
    private String onWarmupCompleted;

    static {
        int i = extraCallbackWithResult + 107;
        writeTypedObject = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        RealDrawScopeSizeResolver realDrawScopeSizeResolver = (RealDrawScopeSizeResolver) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 103;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            readTypedObject(realDrawScopeSizeResolver);
            throw null;
        }
        String typedObject = readTypedObject(realDrawScopeSizeResolver);
        int i3 = IAuthTabCallbackStubProxy + 125;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        return typedObject;
    }

    public static /* synthetic */ byte[] IAuthTabCallback(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrAccess000 = access000(realDrawScopeSizeResolver);
        int i4 = access100 + 105;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return bArrAccess000;
        }
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallbackDefault(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 91;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objAccess100 = access100(realDrawScopeSizeResolver);
        int i4 = access100 + 61;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objAccess100;
    }

    public static /* synthetic */ String asInterface() throws Throwable {
        int i = 2 % 2;
        int i2 = access100 + 51;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy();
        int i4 = IAuthTabCallbackStubProxy + 43;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return strIAuthTabCallbackStubProxy;
    }

    public static /* synthetic */ String asInterface(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return IAuthTabCallbackStub(realDrawScopeSizeResolver);
        }
        IAuthTabCallbackStub(realDrawScopeSizeResolver);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onExtraCallback(RealDrawScopeSizeResolver realDrawScopeSizeResolver) throws Exception {
        int i = 2 % 2;
        int i2 = access100 + 93;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnTransact = onTransact(realDrawScopeSizeResolver);
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return strOnTransact;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 31;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object objIAuthTabCallbackStubProxy = IAuthTabCallbackStubProxy(realDrawScopeSizeResolver);
        int i4 = IAuthTabCallbackStubProxy + 7;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return objIAuthTabCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ String onNavigationEvent(RealDrawScopeSizeResolver realDrawScopeSizeResolver) throws Exception {
        int i = 2 % 2;
        int i2 = access100 + 123;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String interfaceDescriptor = getInterfaceDescriptor(realDrawScopeSizeResolver);
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        return interfaceDescriptor;
    }

    public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i3;
        int i9 = i5 | i7 | i8;
        int i10 = (~(i7 | i3)) | (~(i8 | i5));
        int i11 = (~(i3 | i5)) | (~(i7 | (~i5) | i8));
        int i12 = i5 + i6 + i + ((-160716491) * i2) + (1883135422 * i4);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i5) - 666828800) + ((-962678542) * i6) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i) + ((-1967783936) * i2) + ((-2092695552) * i4) + ((-870252544) * i13);
        int i15 = (i5 * 1975847376) + 750996803 + (i6 * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i * 1975846509) + (i2 * (-526956143)) + (i4 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        return i16 != 1 ? i16 != 2 ? onWarmupCompleted(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        RealDrawScopeSizeResolver realDrawScopeSizeResolver = (RealDrawScopeSizeResolver) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 73;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        Object objOnWarmupCompleted = onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 401155189, -401155188, new Object[]{realDrawScopeSizeResolver});
        int i4 = access100 + 85;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return objOnWarmupCompleted;
    }

    @Inject
    public RealDrawScopeSizeResolver(@NotNull Context context, @NotNull RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope, @NotNull RealDrawScopeSizeResolversizeinlinedmapNotNull121 realDrawScopeSizeResolversizeinlinedmapNotNull121, @Named("appIdSuffix") @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(realSubcomposeAsyncImageScope, "");
        Intrinsics.checkNotNullParameter(realDrawScopeSizeResolversizeinlinedmapNotNull121, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.IAuthTabCallbackDefault = context;
        this.onTransact = realSubcomposeAsyncImageScope;
        this.IAuthTabCallback_Parcel = realDrawScopeSizeResolversizeinlinedmapNotNull121;
        this.onNavigationEvent = str;
        this.onWarmupCompleted = "";
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda0
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 91;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                String strAsInterface = RealDrawScopeSizeResolver.asInterface(this.f$0);
                if (i3 == 0) {
                    int i4 = 86 / 0;
                }
                return strAsInterface;
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() throws Exception {
                int i = 2 % 2;
                int i2 = onExtraCallback + 85;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                String strOnExtraCallback = RealDrawScopeSizeResolver.onExtraCallback(this.f$0);
                int i4 = onExtraCallback + 29;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return strOnExtraCallback;
            }
        });
        this.asBinder = new Remembered<>(new Function0[]{new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda2
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 113;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                RealDrawScopeSizeResolver realDrawScopeSizeResolver = this.f$0;
                if (i3 == 0) {
                    return RealDrawScopeSizeResolver.IAuthTabCallbackDefault(realDrawScopeSizeResolver);
                }
                RealDrawScopeSizeResolver.IAuthTabCallbackDefault(realDrawScopeSizeResolver);
                throw null;
            }
        }, new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda3
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 11;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {this.f$0};
                if (i3 == 0) {
                    return RealDrawScopeSizeResolver.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1416548131, -1416548131, objArr);
                }
                int i4 = 81 / 0;
                return RealDrawScopeSizeResolver.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1416548131, -1416548131, objArr);
            }
        }}, new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda4
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws Exception {
                int i = 2 % 2;
                int i2 = onExtraCallback + 65;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String strOnNavigationEvent = RealDrawScopeSizeResolver.onNavigationEvent(this.f$0);
                if (i3 != 0) {
                    int i4 = 42 / 0;
                }
                return strOnNavigationEvent;
            }
        });
        this.IAuthTabCallbackStub = new Remembered<>(new Function0[]{new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda5
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 29;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object objOnExtraCallbackWithResult = RealDrawScopeSizeResolver.onExtraCallbackWithResult(this.f$0);
                int i4 = onExtraCallbackWithResult + 41;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return objOnExtraCallbackWithResult;
            }
        }}, new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda6
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 13;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                byte[] bArrIAuthTabCallback = RealDrawScopeSizeResolver.IAuthTabCallback(this.f$0);
                int i4 = onExtraCallback + 105;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return bArrIAuthTabCallback;
            }
        });
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda7
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                String str2;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 83;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    Object[] objArr = {this.f$0};
                    str2 = (String) RealDrawScopeSizeResolver.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1086211231, -1086211229, objArr);
                    int i3 = 85 / 0;
                } else {
                    Object[] objArr2 = {this.f$0};
                    str2 = (String) RealDrawScopeSizeResolver.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), 1086211231, -1086211229, objArr2);
                }
                int i4 = onExtraCallback + 15;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 != 0) {
                    return str2;
                }
                throw null;
            }
        });
        this.access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.identifier.unique.UniqueImpl$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onExtraCallback + 13;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                String strAsInterface = RealDrawScopeSizeResolver.asInterface();
                int i4 = onWarmupCompleted + 63;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return strAsInterface;
            }
        });
    }

    public String onTransact() {
        int i = 2 % 2;
        String strOnExtraCallbackWithResult = this.onTransact.onExtraCallback().onExtraCallbackWithResult("seed", "");
        if (strOnExtraCallbackWithResult != null) {
            int i2 = access100 + 93;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                strOnExtraCallbackWithResult.length();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (strOnExtraCallbackWithResult.length() != 0) {
                int i3 = access100 + 25;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                return strOnExtraCallbackWithResult;
            }
        }
        this.IAuthTabCallback = true;
        String strOnNavigationEvent = this.IAuthTabCallback_Parcel.onNavigationEvent();
        this.onTransact.onExtraCallback().onNavigationEvent("seed", strOnNavigationEvent);
        int i5 = IAuthTabCallbackStubProxy + 55;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strOnNavigationEvent;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public boolean IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.IAuthTabCallback;
        int i4 = i3 + 15;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 103;
        access100 = i2 % 128;
        if (i2 % 2 != 0) {
            if (Intrinsics.areEqual(this.onWarmupCompleted, "")) {
                this.onWarmupCompleted = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel.IAuthTabCallback(onTransact()));
                int i3 = access100 + 33;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.onWarmupCompleted;
        }
        Intrinsics.areEqual(this.onWarmupCompleted, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onExtraCallbackWithResult.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = IAuthTabCallbackStubProxy + 85;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String IAuthTabCallbackStub(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 119;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String string = Settings.Secure.getString(realDrawScopeSizeResolver.IAuthTabCallbackDefault.getContentResolver(), "android_id");
        int i4 = access100 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 81;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.asInterface.getValue();
        if (i3 != 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    private static final String onTransact(RealDrawScopeSizeResolver realDrawScopeSizeResolver) throws Exception {
        int i = 2 % 2;
        int i2 = access100 + 119;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strOnExtraCallbackWithResult = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onExtraCallbackWithResult(realDrawScopeSizeResolver.onWarmupCompleted());
        if (realDrawScopeSizeResolver.onNavigationEvent.length() == 0) {
            return strOnExtraCallbackWithResult;
        }
        String str = strOnExtraCallbackWithResult + ".multi." + realDrawScopeSizeResolver.onNavigationEvent;
        int i4 = IAuthTabCallbackStubProxy + 73;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final Object access100(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String strOnWarmupCompleted = realDrawScopeSizeResolver.onWarmupCompleted();
        int i4 = access100 + 77;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return strOnWarmupCompleted;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        RealDrawScopeSizeResolver realDrawScopeSizeResolver = (RealDrawScopeSizeResolver) objArr[0];
        int i = 2 % 2;
        int i2 = access100 + 57;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallbackDefault = realDrawScopeSizeResolver.IAuthTabCallbackDefault();
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        int i5 = IAuthTabCallbackStubProxy + 27;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return strIAuthTabCallbackDefault;
    }

    private static final String getInterfaceDescriptor(RealDrawScopeSizeResolver realDrawScopeSizeResolver) throws Exception {
        int i = 2 % 2;
        String str = EstimateFaceQualityFromBGRImage.IAuthTabCallback.onExtraCallbackWithResult(realDrawScopeSizeResolver.onWarmupCompleted() + realDrawScopeSizeResolver.IAuthTabCallbackDefault()) + ".realm";
        int i2 = access100 + 3;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = access100 + 47;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        String strIAuthTabCallback = this.asBinder.IAuthTabCallback(this, onExtraCallback[0]);
        int i4 = access100 + 103;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            return strIAuthTabCallback;
        }
        throw null;
    }

    private static final Object IAuthTabCallbackStubProxy(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        int i2 = access100 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            return realDrawScopeSizeResolver.IAuthTabCallbackDefault();
        }
        realDrawScopeSizeResolver.IAuthTabCallbackDefault();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final byte[] access000(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int i = 2 % 2;
        byte[] bArrCopyOf = Arrays.copyOf(PageKey.onWarmupCompleted(StringsKt.reversed(realDrawScopeSizeResolver.IAuthTabCallbackDefault()).toString() + realDrawScopeSizeResolver.IAuthTabCallbackDefault(), null, 1, null), 64);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        int i2 = IAuthTabCallbackStubProxy + 89;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return bArrCopyOf;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public byte[] IAuthTabCallback() {
        Remembered<byte[]> remembered;
        addAllCommandLine<?> addallcommandline;
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 47;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            remembered = this.IAuthTabCallbackStub;
            addallcommandline = onExtraCallback[1];
        } else {
            remembered = this.IAuthTabCallbackStub;
            addallcommandline = onExtraCallback[1];
        }
        byte[] bArrIAuthTabCallback = remembered.IAuthTabCallback(this, addallcommandline);
        int i3 = access100 + 115;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return bArrIAuthTabCallback;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String onExtraCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.getInterfaceDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str = (String) value;
        int i4 = IAuthTabCallbackStubProxy + 47;
        access100 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String readTypedObject(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        Object obj;
        int i = 2 % 2;
        try {
            Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(new BigInteger(1, ArraysKt.copyOfRange(EstimateFaceQualityFromBGRImage.onNavigationEvent(EstimateFaceQualityFromBGRImage.IAuthTabCallback, PageKey.onWarmupCompleted(realDrawScopeSizeResolver.onWarmupCompleted() + "TRACKING_2D#LA!", null, 1, null), false, 2, null), 0, 8)).toString(10));
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.onExtraCallback(obj)) {
            int i2 = IAuthTabCallbackStubProxy + 101;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            obj = "";
            int i5 = i3 + 97;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
        }
        return (String) obj;
    }

    @Override // o.ConstraintsSizeResolverExternalSyntheticLambda0
    public String asBinder() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 71;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.access000.getValue();
        int i4 = IAuthTabCallbackStubProxy + 39;
        access100 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private static final String IAuthTabCallbackStubProxy() throws Throwable {
        MediaDrm mediaDrm;
        int i = 2 % 2;
        MediaDrm mediaDrm2 = null;
        try {
            mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
            try {
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                Intrinsics.checkNotNullExpressionValue(propertyByteArray, "");
                setTextProgressMargin<MessageDigest> settextprogressmarginOnNavigationEvent = setTextProgressSize.onWarmupCompleted.onExtraCallback().onNavigationEvent();
                MessageDigest messageDigestOnWarmupCompleted = settextprogressmarginOnNavigationEvent.onWarmupCompleted();
                messageDigestOnWarmupCompleted.update(propertyByteArray);
                byte[] bArrDigest = messageDigestOnWarmupCompleted.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
                String strOnExtraCallback = onPageHide.onExtraCallback(bArrDigest);
                settextprogressmarginOnNavigationEvent.close();
                if (Build.VERSION.SDK_INT >= 28) {
                    mediaDrm.release();
                    return strOnExtraCallback;
                }
                mediaDrm.release();
                return strOnExtraCallback;
            } catch (Exception unused) {
                if (mediaDrm != null) {
                    int i2 = IAuthTabCallbackStubProxy + 51;
                    access100 = i2 % 128;
                    int i3 = i2 % 2;
                    mediaDrm.release();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mediaDrm2 = mediaDrm;
                if (mediaDrm2 != null) {
                    int i4 = IAuthTabCallbackStubProxy + 63;
                    access100 = i4 % 128;
                    int i5 = i4 % 2;
                    mediaDrm2.release();
                }
                throw th;
            }
        } catch (Exception unused2) {
            mediaDrm = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ String onWarmupCompleted(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return (String) onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1086211231, -1086211229, new Object[]{realDrawScopeSizeResolver});
    }

    public static /* synthetic */ Object asBinder(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 1416548131, -1416548131, new Object[]{realDrawScopeSizeResolver});
    }

    private static final Object IAuthTabCallback_Parcel(RealDrawScopeSizeResolver realDrawScopeSizeResolver) {
        int iOnExtraCallbackWithResult = zzmr.onExtraCallbackWithResult();
        return onWarmupCompleted(zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, zzmr.onExtraCallbackWithResult(), 401155189, -401155188, new Object[]{realDrawScopeSizeResolver});
    }
}
