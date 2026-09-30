package o;

import im.toss.tds.graphics.gl.blur.RenderCommand;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.basic;
import o.saveFromResponse;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieCompanion {
    private static int IAuthTabCallback_Parcel = 1;
    private static int ICustomTabsCallback = 1;
    private static int access100;
    private static int getInterfaceDescriptor;
    private String IAuthTabCallbackDefault;
    private CookieJar IAuthTabCallbackStub;
    private final Credentials IAuthTabCallbackStubProxy;
    private boolean access000;
    private final deprecated_persistent asBinder;
    private deprecated_path asInterface;
    private final loadForRequest onExtraCallback;
    private parseokhttp onExtraCallbackWithResult;
    private final deprecated_hostOnly onTransact;
    private final int onWarmupCompleted;
    private static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onNavigationEvent = 8;
    private static final AtomicInteger IAuthTabCallback = new AtomicInteger();

    public CookieCompanion(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar, @NotNull loadForRequest loadforrequest, @NotNull Credentials credentials) {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        this.onTransact = deprecated_hostonly;
        this.asBinder = deprecated_persistentVar;
        this.onExtraCallback = loadforrequest;
        this.IAuthTabCallbackStubProxy = credentials;
        this.onWarmupCompleted = IAuthTabCallback.getAndIncrement();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if ((r2 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        throw new java.lang.IllegalStateException("CustomShaderEffect.output accessed before applyEffect()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = r2 + 109;
        o.CookieCompanion.ICustomTabsCallback = r2 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final parseokhttp onWarmupCompleted() {
        parseokhttp parseokhttpVar;
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 59;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            parseokhttpVar = this.onExtraCallbackWithResult;
            int i4 = 49 / 0;
        } else {
            parseokhttpVar = this.onExtraCallbackWithResult;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final getTlsVersionsokhttp onWarmupCompleted(@NotNull getTlsVersionsokhttp gettlsversionsokhttp, @NotNull basic.onNavigationEvent onnavigationevent) throws IOException {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(gettlsversionsokhttp, "");
        Intrinsics.checkNotNullParameter(onnavigationevent, "");
        deprecated_path deprecated_pathVarOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent);
        long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted((gettlsversionsokhttp.IAuthTabCallbackStub() << 32) | (gettlsversionsokhttp.onWarmupCompleted() & 4294967295L));
        CookieJar cookieJar = this.IAuthTabCallbackStub;
        Object obj = null;
        if (cookieJar != null) {
            int i2 = access100 + 33;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            if (!ExtensionsManager1.IAuthTabCallback(cookieJar.onExtraCallback(), jOnWarmupCompleted)) {
                int i4 = access100 + 45;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                cookieJar = null;
            }
            if (cookieJar == null) {
                cookieJar = new CookieJar(jOnWarmupCompleted, saveFromResponse.onNavigationEvent.onNavigationEvent(saveFromResponse.Companion, null, false, true, 3, null), 0, 4, null);
                this.IAuthTabCallbackStub = cookieJar;
            }
        }
        parseokhttp parseokhttpVarOnExtraCallback = this.onExtraCallback.onExtraCallback(cookieJar);
        this.onExtraCallbackWithResult = parseokhttpVarOnExtraCallback;
        parseokhttp.onWarmupCompleted(parseokhttpVarOnExtraCallback, parseDomain.DRAW, false, 2, null);
        RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
        deprecated_pathVarOnExtraCallbackWithResult.onExtraCallbackWithResult(this.asBinder);
        deprecated_pathVarOnExtraCallbackWithResult.onWarmupCompleted("u_Texture", 0);
        if (this.access000) {
            int i5 = access100 + 61;
            ICustomTabsCallback = i5 % 128;
            int i6 = i5 % 2;
            if (onnavigationevent.onNavigationEvent() != null) {
                deprecated_pathVarOnExtraCallbackWithResult.IAuthTabCallback("a", RangesKt.coerceIn(onnavigationevent.onNavigationEvent().floatValue(), 0.0f, 1.0f));
            }
        }
        Credentials.onNavigationEvent(this.IAuthTabCallbackStubProxy, deprecated_pathVarOnExtraCallbackWithResult, gettlsversionsokhttp, null, 0.0f, 12, null);
        return parseokhttpVarOnExtraCallback.onExtraCallback();
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 11;
        int i3 = i2 % 128;
        access100 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        deprecated_path deprecated_pathVar = this.asInterface;
        if (deprecated_pathVar != null) {
            int i4 = i3 + 87;
            ICustomTabsCallback = i4 % 128;
            if (i4 % 2 == 0) {
                this.onTransact.onNavigationEvent(deprecated_pathVar);
                throw null;
            }
            this.onTransact.onNavigationEvent(deprecated_pathVar);
        }
        this.asInterface = null;
        this.IAuthTabCallbackDefault = null;
        this.access000 = false;
        this.IAuthTabCallbackStub = null;
        this.onExtraCallbackWithResult = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[PHI: r3
      0x00ab: PHI (r3v11 java.lang.String) = (r3v10 java.lang.String), (r3v17 java.lang.String) binds: [B:30:0x00a9, B:27:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final deprecated_path onExtraCallbackWithResult(basic.onNavigationEvent onnavigationevent) throws IOException {
        String strOnTransact;
        int iHashCode;
        int i = 2 % 2;
        String strOnTransact2 = onnavigationevent.onTransact();
        if (strOnTransact2 == null) {
            int i2 = access100 + 97;
            ICustomTabsCallback = i2 % 128;
            int i3 = i2 % 2;
            String strIAuthTabCallbackStub = onnavigationevent.IAuthTabCallbackStub();
            if (strIAuthTabCallbackStub != null) {
                int i4 = access100 + 69;
                ICustomTabsCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    iHashCode = strIAuthTabCallbackStub.hashCode();
                    int i5 = 44 / 0;
                } else {
                    iHashCode = strIAuthTabCallbackStub.hashCode();
                }
            } else {
                int i6 = ICustomTabsCallback + 99;
                access100 = i6 % 128;
                int i7 = i6 % 2;
                iHashCode = 0;
            }
            strOnTransact2 = String.valueOf(iHashCode);
        }
        String strOnWarmupCompleted = onnavigationevent.onWarmupCompleted();
        if (strOnWarmupCompleted == null) {
            String strOnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult();
            strOnWarmupCompleted = String.valueOf(strOnExtraCallbackWithResult != null ? strOnExtraCallbackWithResult.hashCode() : 0);
        }
        String str = onnavigationevent.IAuthTabCallback() + "_" + this.onWarmupCompleted + "_" + strOnTransact2 + "_" + strOnWarmupCompleted;
        if (!Intrinsics.areEqual(this.IAuthTabCallbackDefault, str)) {
            String strIAuthTabCallbackStub2 = onnavigationevent.IAuthTabCallbackStub();
            String strOnExtraCallbackWithResult2 = null;
            if (strIAuthTabCallbackStub2 == null) {
                int i8 = ICustomTabsCallback + 71;
                access100 = i8 % 128;
                if (i8 % 2 != 0) {
                    strOnTransact = onnavigationevent.onTransact();
                    int i9 = 94 / 0;
                    if (strOnTransact != null) {
                        strIAuthTabCallbackStub2 = this.onTransact.onExtraCallbackWithResult("shader/" + strOnTransact + ".vert");
                    } else {
                        strIAuthTabCallbackStub2 = null;
                    }
                } else {
                    strOnTransact = onnavigationevent.onTransact();
                    if (strOnTransact != null) {
                    }
                }
                if (strIAuthTabCallbackStub2 == null) {
                    throw new IllegalStateException("vertex shader source or file name is required");
                }
            }
            String strOnExtraCallbackWithResult3 = onnavigationevent.onExtraCallbackWithResult();
            if (strOnExtraCallbackWithResult3 == null) {
                int i10 = access100 + 125;
                ICustomTabsCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    onnavigationevent.onWarmupCompleted();
                    throw null;
                }
                String strOnWarmupCompleted2 = onnavigationevent.onWarmupCompleted();
                if (strOnWarmupCompleted2 != null) {
                    strOnExtraCallbackWithResult2 = this.onTransact.onExtraCallbackWithResult("shader/" + strOnWarmupCompleted2 + ".frag");
                }
                if (strOnExtraCallbackWithResult2 == null) {
                    throw new IllegalStateException("fragment shader source or file name is required");
                }
                int i11 = access100 + 77;
                ICustomTabsCallback = i11 % 128;
                int i12 = i11 % 2;
                strOnExtraCallbackWithResult3 = strOnExtraCallbackWithResult2;
            }
            IAuthTabCallback();
            deprecated_path deprecated_pathVarOnExtraCallbackWithResult = this.onTransact.onExtraCallbackWithResult(str, strIAuthTabCallbackStub2, strOnExtraCallbackWithResult3);
            deprecated_pathVarOnExtraCallbackWithResult.onExtraCallbackWithResult(this.asBinder);
            deprecated_pathVarOnExtraCallbackWithResult.onWarmupCompleted("u_Texture", 0);
            deprecated_pathVarOnExtraCallbackWithResult.onExtraCallbackWithResult("TextureDataUBO", 0);
            this.asInterface = deprecated_pathVarOnExtraCallbackWithResult;
            this.access000 = basic.onNavigationEvent.Companion.IAuthTabCallback().onExtraCallback(strOnExtraCallbackWithResult3);
            this.IAuthTabCallbackDefault = str;
        }
        deprecated_path deprecated_pathVar = this.asInterface;
        if (deprecated_pathVar != null) {
            return deprecated_pathVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    static {
        int i = IAuthTabCallback_Parcel + 73;
        getInterfaceDescriptor = i % 128;
        int i2 = i % 2;
    }
}
