package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class deprecated_domain implements parseokhttp {
    private static final onExtraCallbackWithResult Companion = new onExtraCallbackWithResult(null);
    public static final int IAuthTabCallback = 8;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000 = 0;
    private static int access100 = 1;
    private static int asInterface;
    private int[] IAuthTabCallbackDefault;
    private basicdefault IAuthTabCallbackStub;
    private int asBinder;
    private getTlsVersionsokhttp onExtraCallback;
    private final List<basicdefault> onExtraCallbackWithResult;
    private final List<getTlsVersionsokhttp> onNavigationEvent;
    private CookieJar onTransact;
    private int onWarmupCompleted;

    static {
        int i = IAuthTabCallback_Parcel + 101;
        asInterface = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public deprecated_domain(@NotNull CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "");
        this.onTransact = cookieJar;
        this.onExtraCallbackWithResult = new ArrayList();
        this.IAuthTabCallbackDefault = new int[0];
        this.onNavigationEvent = new ArrayList();
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        supportedspec.onExtraCallback(supportedspec.onExtraCallbackWithResult() + 1);
        onWarmupCompleted();
    }

    @Override // o.parseokhttp
    public CookieJar onNavigationEvent() {
        int i = 2 % 2;
        int i2 = access100 + 113;
        int i3 = i2 % 128;
        access000 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CookieJar cookieJar = this.onTransact;
        int i4 = i3 + 37;
        access100 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return cookieJar;
    }

    @Override // o.parseokhttp
    public getTlsVersionsokhttp onExtraCallback() {
        int i = 2 % 2;
        int i2 = access100 + 45;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        getTlsVersionsokhttp gettlsversionsokhttp = this.onExtraCallback;
        Intrinsics.checkNotNull(gettlsversionsokhttp);
        int i4 = access100 + 43;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            return gettlsversionsokhttp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseokhttp
    public int IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = access100 + 21;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.asBinder;
        if (i3 != 0) {
            int i5 = 45 / 0;
        }
        return i4;
    }

    private final int onTransact() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ((int) (onNavigationEvent().onExtraCallback() >> 32)) / onNavigationEvent().IAuthTabCallback();
        int i4 = access100 + 11;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return iOnExtraCallback;
    }

    private final int IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = access100 + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        CookieJar cookieJarOnNavigationEvent = onNavigationEvent();
        return i3 != 0 ? ((int) cookieJarOnNavigationEvent.onExtraCallback()) << onNavigationEvent().IAuthTabCallback() : ((int) cookieJarOnNavigationEvent.onExtraCallback()) / onNavigationEvent().IAuthTabCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onWarmupCompleted() {
        Object next;
        int i = 2 % 2;
        int i2 = access000 + 75;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
            if (IAuthTabCallback() != 0) {
                onExtraCallbackWithResult();
                int i4 = access100 + 85;
                access000 = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (IAuthTabCallback() != 0) {
        }
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.asBinder = iArr[0];
        GLES20.glBindFramebuffer(36160, IAuthTabCallback());
        List<basicdefault> listOnExtraCallback = onNavigationEvent().onWarmupCompleted().onExtraCallback();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOnExtraCallback) {
            int i6 = access100 + 33;
            access000 = i6 % 128;
            int i7 = i6 % 2;
            if (((basicdefault) obj).onExtraCallbackWithResult() != pathMatch.DEPTH24STENCIL8) {
                arrayList.add(obj);
                int i8 = access100 + 83;
                access000 = i8 % 128;
                int i9 = i8 % 2;
            }
        }
        Iterator<T> it = listOnExtraCallback.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((basicdefault) next).onExtraCallbackWithResult() == pathMatch.DEPTH24STENCIL8) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.IAuthTabCallbackStub = (basicdefault) next;
        int i10 = 0;
        for (Object obj2 : arrayList) {
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            basicdefault basicdefaultVar = (basicdefault) obj2;
            getTlsVersionsokhttp gettlsversionsokhttpIAuthTabCallback = Companion.IAuthTabCallback(onTransact(), IAuthTabCallbackDefault(), basicdefaultVar.onExtraCallbackWithResult(), basicdefaultVar.IAuthTabCallback(), basicdefaultVar.onNavigationEvent());
            this.onNavigationEvent.add(gettlsversionsokhttpIAuthTabCallback);
            GLES20.glFramebufferTexture2D(36160, 36064 + i10, ConnectionSpecCompanion.onNavigationEvent(gettlsversionsokhttpIAuthTabCallback.IAuthTabCallbackDefault()), gettlsversionsokhttpIAuthTabCallback.IAuthTabCallback(), 0);
            i10++;
        }
        getTlsVersionsokhttp gettlsversionsokhttp = this.onExtraCallback;
        if (gettlsversionsokhttp != null) {
            int i11 = access100 + 111;
            access000 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 96 / 0;
                if (gettlsversionsokhttp.IAuthTabCallback() != ((getTlsVersionsokhttp) CollectionsKt.first(this.onNavigationEvent)).IAuthTabCallback()) {
                    getTlsVersionsokhttp gettlsversionsokhttp2 = this.onExtraCallback;
                    if (gettlsversionsokhttp2 != null) {
                        gettlsversionsokhttp2.onExtraCallbackWithResult();
                    }
                    this.onExtraCallback = (getTlsVersionsokhttp) CollectionsKt.first(this.onNavigationEvent);
                }
            } else if (gettlsversionsokhttp.IAuthTabCallback() != ((getTlsVersionsokhttp) CollectionsKt.first(this.onNavigationEvent)).IAuthTabCallback()) {
            }
        }
        basicdefault basicdefaultVar2 = this.IAuthTabCallbackStub;
        if (basicdefaultVar2 != null) {
            int iIAuthTabCallback = Companion.IAuthTabCallback(onTransact(), IAuthTabCallbackDefault(), pathMatch.DEPTH24STENCIL8, basicdefaultVar2.IAuthTabCallback(), false).IAuthTabCallback();
            this.onWarmupCompleted = iIAuthTabCallback;
            GLES20.glFramebufferTexture2D(36160, 36096, 3553, iIAuthTabCallback, 0);
        }
        if (!(!arrayList.isEmpty())) {
            GLES30.glDrawBuffers(0, new int[0], 0);
        } else {
            int size = arrayList.size();
            int[] iArr2 = new int[size];
            for (int i13 = 0; i13 < size; i13++) {
                int i14 = access000 + 121;
                access100 = i14 % 128;
                int i15 = i14 % 2;
                iArr2[i13] = i13 + 36064;
            }
            GLES30.glDrawBuffers(arrayList.size(), iArr2, 0);
            this.IAuthTabCallbackDefault = iArr2;
        }
        if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
            throw new IllegalArgumentException("OpenGL20Framebuffer is incomplete!");
        }
        GLES20.glBindFramebuffer(36160, 0);
    }

    private final void asInterface() {
        int i = 2 % 2;
        int i2 = access000 + 101;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        GLES30.glReadBuffer(36064);
        int i4 = access000 + 13;
        access100 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.parseokhttp
    public void onNavigationEvent(@NotNull parseDomain parsedomain, boolean z) {
        int i = 2 % 2;
        int i2 = access100 + 25;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(parsedomain, "");
            GLES20.glBindFramebuffer(accessgetTIME_PATTERNcp.IAuthTabCallback(parsedomain), IAuthTabCallback());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(parsedomain, "");
        GLES20.glBindFramebuffer(accessgetTIME_PATTERNcp.IAuthTabCallback(parsedomain), IAuthTabCallback());
        if (z) {
            GLES20.glViewport(0, 0, onTransact(), IAuthTabCallbackDefault());
            int i3 = access100 + 73;
            access000 = i3 % 128;
            int i4 = i3 % 2;
        }
        if (parsedomain == parseDomain.READ) {
            int i5 = access000 + 27;
            access100 = i5 % 128;
            if (i5 % 2 == 0) {
                asInterface();
                int i6 = 57 / 0;
            } else {
                asInterface();
            }
            int i7 = access100 + 51;
            access000 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // o.parseokhttp
    public void asBinder() {
        int i = 2 % 2;
        int i2 = access000 + 1;
        access100 = i2 % 128;
        if (i2 % 2 == 0) {
            GLES20.glBindFramebuffer(36160, 1);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
        }
        int i3 = access100 + 91;
        access000 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.parseokhttp
    public void onExtraCallbackWithResult() {
        int i = 2 % 2;
        asBinder();
        GLES20.glDeleteFramebuffers(1, new int[]{IAuthTabCallback()}, 0);
        GLES20.glDeleteTextures(1, new int[]{this.onWarmupCompleted}, 0);
        int size = this.onNavigationEvent.size();
        List<getTlsVersionsokhttp> list = this.onNavigationEvent;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        int i2 = access000 + 43;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = access100 + 11;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            arrayList.add(Integer.valueOf(((getTlsVersionsokhttp) it.next()).IAuthTabCallback()));
        }
        GLES20.glDeleteTextures(size, CollectionsKt.toIntArray(arrayList), 0);
    }

    public String toString() {
        int i = 2 % 2;
        int iIAuthTabCallback = IAuthTabCallback();
        CookieJar cookieJarOnNavigationEvent = onNavigationEvent();
        String string = Arrays.toString(this.IAuthTabCallbackDefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "OpenGLFramebuffer(rendererId=" + iIAuthTabCallback + ", specification=" + cookieJarOnNavigationEvent + ", drawAttachments=" + string + ", sampledWidth=" + onTransact() + ", sampledHeight=" + IAuthTabCallbackDefault() + ")";
        int i2 = access000 + 33;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static final class onExtraCallbackWithResult {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallbackWithResult = 1;

        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }

        public final getTlsVersionsokhttp IAuthTabCallback(int i, int i2, @NotNull pathMatch pathmatch, boolean z, boolean z2) {
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(pathmatch, "");
            getTlsVersionsokhttp gettlsversionsokhttpOnExtraCallbackWithResult = getTlsVersionsokhttp.Companion.onExtraCallbackWithResult(setCipherSuitesokhttp.onExtraCallback.TEXTURE_2D, new setCipherSuitesokhttp.onExtraCallbackWithResult(ExtensionsManager1.onWarmupCompleted((i << 32) | (i2 & 4294967295L)), accessgetTIME_PATTERNcp.onExtraCallback(pathmatch), z2, z, z2, null));
            int i4 = IAuthTabCallback + 103;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return gettlsversionsokhttpOnExtraCallbackWithResult;
        }
    }
}
