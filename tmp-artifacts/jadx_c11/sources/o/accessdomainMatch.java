package o;

import androidx.compose.ui.geometry.Rect;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessdomainMatch {
    private static int access100 = 0;
    private static int getInterfaceDescriptor = 1;
    private parseokhttp IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final deprecated_persistent IAuthTabCallbackStub;
    private final Credentials IAuthTabCallback_Parcel;
    private final hostOnlyDomain asBinder;
    private final loadForRequest asInterface;
    private parseokhttp onExtraCallback;
    private CookieJar onExtraCallbackWithResult;
    private final setUseCaseAttached[] onNavigationEvent;
    private setCipherSuitesokhttp onTransact;
    private CookieJar onWarmupCompleted;

    public accessdomainMatch(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull loadForRequest loadforrequest, @NotNull deprecated_persistent deprecated_persistentVar, @NotNull Credentials credentials) {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        this.asInterface = loadforrequest;
        this.IAuthTabCallbackStub = deprecated_persistentVar;
        this.IAuthTabCallback_Parcel = credentials;
        this.asBinder = new hostOnlyDomain(deprecated_hostonly, deprecated_persistentVar);
        setUseCaseAttached[] setusecaseattachedArr = new setUseCaseAttached[4];
        int i = 2 % 2;
        int i2 = 0;
        while (i2 < 4) {
            int i3 = getInterfaceDescriptor + 117;
            access100 = i3 % 128;
            if (i3 % 2 != 0) {
                setusecaseattachedArr[i2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
                i2 += 43;
            } else {
                setusecaseattachedArr[i2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.Companion.IAuthTabCallback());
                i2++;
            }
        }
        this.onNavigationEvent = setusecaseattachedArr;
        int i4 = access100 + 29;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    public final parseokhttp onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 19;
        int i3 = i2 % 128;
        access100 = i3;
        if (i2 % 2 != 0) {
            parseokhttp parseokhttpVar = this.onExtraCallback;
            int i4 = 62 / 0;
            if (parseokhttpVar != null) {
                return parseokhttpVar;
            }
        } else {
            parseokhttp parseokhttpVar2 = this.onExtraCallback;
            if (parseokhttpVar2 != null) {
                return parseokhttpVar2;
            }
        }
        int i5 = i3 + 95;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    private final boolean onNavigationEvent(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 103;
        int i3 = i2 % 128;
        access100 = i3;
        int i4 = i2 % 2;
        if (this.IAuthTabCallbackDefault) {
            int i5 = i3 + 95;
            getInterfaceDescriptor = i5 % 128;
            parseokhttp parseokhttpVar = null;
            if (i5 % 2 == 0) {
                parseokhttpVar.hashCode();
                throw null;
            }
            parseokhttp parseokhttpVar2 = this.onExtraCallback;
            if (parseokhttpVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i6 = getInterfaceDescriptor + 3;
                access100 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                parseokhttpVar = parseokhttpVar2;
            }
            if (ExtensionsManager1.IAuthTabCallback(parseokhttpVar.onNavigationEvent().onExtraCallback(), j)) {
                int i8 = getInterfaceDescriptor + 79;
                access100 = i8 % 128;
                return i8 % 2 != 0;
            }
        }
        return true;
    }

    private final void onExtraCallback(long j) {
        int i = 2 % 2;
        if (onNavigationEvent(j)) {
            Object obj = null;
            if (this.IAuthTabCallbackDefault) {
                int i2 = access100 + 97;
                int i3 = i2 % 128;
                getInterfaceDescriptor = i3;
                int i4 = i2 % 2;
                parseokhttp parseokhttpVar = this.onExtraCallback;
                if (parseokhttpVar == null) {
                    int i5 = i3 + 57;
                    access100 = i5 % 128;
                    if (i5 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    parseokhttpVar = null;
                }
                parseokhttpVar.onExtraCallbackWithResult();
                parseokhttp parseokhttpVar2 = this.IAuthTabCallback;
                if (parseokhttpVar2 == null) {
                    int i6 = getInterfaceDescriptor + 51;
                    access100 = i6 % 128;
                    if (i6 % 2 != 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        obj.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    parseokhttpVar2 = null;
                }
                parseokhttpVar2.onExtraCallbackWithResult();
            }
            this.onExtraCallbackWithResult = new CookieJar(j, new saveFromResponse(null, 1, null), 0, 4, null);
            this.IAuthTabCallbackDefault = true;
            int[] iArr = new int[8];
            for (int i7 = 0; i7 < 8; i7++) {
                iArr[i7] = i7;
            }
            this.asBinder.onNavigationEvent().onExtraCallbackWithResult(this.IAuthTabCallbackStub);
            this.asBinder.onNavigationEvent().IAuthTabCallback("u_Textures", iArr);
        }
    }

    public final void IAuthTabCallback(@NotNull parseokhttp parseokhttpVar, @NotNull Rect rect, @NotNull getTlsVersionsokhttp gettlsversionsokhttp, @NotNull Rect rect2, @Nullable getTlsVersionsokhttp gettlsversionsokhttp2) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 29;
        access100 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(gettlsversionsokhttp, "");
        Intrinsics.checkNotNullParameter(rect2, "");
        this.onTransact = gettlsversionsokhttp2;
        if (onExtraCallback()) {
            if (gettlsversionsokhttp2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            onExtraCallback(ExtensionsManager1.onWarmupCompleted((gettlsversionsokhttp2.IAuthTabCallbackStub() << 32) | (gettlsversionsokhttp2.onWarmupCompleted() & 4294967295L)));
            loadForRequest loadforrequest = this.asInterface;
            CookieJar cookieJar = this.onWarmupCompleted;
            if (cookieJar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJar = null;
            }
            this.IAuthTabCallback = loadforrequest.onExtraCallback(cookieJar);
            loadForRequest loadforrequest2 = this.asInterface;
            CookieJar cookieJar2 = this.onExtraCallbackWithResult;
            if (cookieJar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                cookieJar2 = null;
            }
            this.onExtraCallback = loadforrequest2.onExtraCallback(cookieJar2);
            parseokhttp.onWarmupCompleted(parseokhttpVar, parseDomain.READ, false, 2, null);
            parseokhttp parseokhttpVar2 = this.IAuthTabCallback;
            if (parseokhttpVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar2 = null;
            }
            parseDomain parsedomain = parseDomain.DRAW;
            parseokhttp.onWarmupCompleted(parseokhttpVar2, parsedomain, false, 2, null);
            RenderCommand renderCommand = RenderCommand.IAuthTabCallback;
            RenderCommand.onWarmupCompleted(renderCommand, null, 1, null);
            Rect rectOnNavigationEvent = rect.onNavigationEvent(0.0f, ((int) parseokhttpVar.onNavigationEvent().onExtraCallback()) - (rect.IAuthTabCallbackDefault() - rect.extraCallback()));
            int iIAuthTabCallbackStubProxy = (int) rectOnNavigationEvent.IAuthTabCallbackStubProxy();
            int iExtraCallback = (int) rectOnNavigationEvent.extraCallback();
            int iIAuthTabCallback_Parcel = (int) (rectOnNavigationEvent.IAuthTabCallback_Parcel() - rectOnNavigationEvent.IAuthTabCallbackStubProxy());
            int iIAuthTabCallbackDefault = (int) rectOnNavigationEvent.IAuthTabCallbackDefault();
            parseokhttp parseokhttpVar3 = this.IAuthTabCallback;
            if (parseokhttpVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar3 = null;
            }
            int iOnExtraCallback = (int) (parseokhttpVar3.onNavigationEvent().onExtraCallback() >> 32);
            parseokhttp parseokhttpVar4 = this.IAuthTabCallback;
            if (parseokhttpVar4 == null) {
                int i4 = getInterfaceDescriptor + 125;
                access100 = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar4 = null;
            }
            renderCommand.onExtraCallback(iIAuthTabCallbackStubProxy, iExtraCallback, iIAuthTabCallback_Parcel, iIAuthTabCallbackDefault, 0, 0, iOnExtraCallback, (int) parseokhttpVar4.onNavigationEvent().onExtraCallback(), renderCommand.IAuthTabCallback(), renderCommand.onNavigationEvent());
            this.asBinder.IAuthTabCallback(gettlsversionsokhttp2);
            hostOnlyDomain hostonlydomain = this.asBinder;
            parseokhttp parseokhttpVar5 = this.IAuthTabCallback;
            if (parseokhttpVar5 == null) {
                int i6 = getInterfaceDescriptor + 5;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i7 = access100 + 67;
                getInterfaceDescriptor = i7 % 128;
                int i8 = i7 % 2;
                parseokhttpVar5 = null;
            }
            hostonlydomain.onExtraCallbackWithResult(parseokhttpVar5.onExtraCallback());
            parseokhttp parseokhttpVar6 = this.onExtraCallback;
            if (parseokhttpVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar6 = null;
            }
            parseokhttp.onWarmupCompleted(parseokhttpVar6, parsedomain, false, 2, null);
            RenderCommand.onWarmupCompleted(renderCommand, null, 1, null);
            long jOnWarmupCompleted = ExtensionsManager1.onWarmupCompleted((gettlsversionsokhttp.onWarmupCompleted() & 4294967295L) | (gettlsversionsokhttp.IAuthTabCallbackStub() << 32));
            setUseCaseAttached[] setusecaseattachedArr = this.onNavigationEvent;
            float f = (int) (jOnWarmupCompleted >> 32);
            float fIAuthTabCallbackStubProxy = rect2.IAuthTabCallbackStubProxy() / f;
            float f2 = (int) jOnWarmupCompleted;
            setusecaseattachedArr[0] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - (rect2.IAuthTabCallbackDefault() / f2)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallbackStubProxy) << 32)));
            setUseCaseAttached[] setusecaseattachedArr2 = this.onNavigationEvent;
            float fIAuthTabCallback_Parcel = rect2.IAuthTabCallback_Parcel() / f;
            float fIAuthTabCallbackDefault = rect2.IAuthTabCallbackDefault() / f2;
            setusecaseattachedArr2[1] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - fIAuthTabCallbackDefault) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback_Parcel) << 32)));
            setUseCaseAttached[] setusecaseattachedArr3 = this.onNavigationEvent;
            float fIAuthTabCallback_Parcel2 = rect2.IAuthTabCallback_Parcel() / f;
            float fExtraCallback = rect2.extraCallback() / f2;
            setusecaseattachedArr3[2] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - fExtraCallback) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback_Parcel2) << 32)));
            setUseCaseAttached[] setusecaseattachedArr4 = this.onNavigationEvent;
            float fIAuthTabCallbackStubProxy2 = rect2.IAuthTabCallbackStubProxy() / f;
            setusecaseattachedArr4[3] = setUseCaseAttached.onNavigationEvent(setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(1.0f - (rect2.extraCallback() / f2)) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallbackStubProxy2) << 32)));
            Credentials.onNavigationEvent(this.IAuthTabCallback_Parcel, this.asBinder.onNavigationEvent(), gettlsversionsokhttp, this.onNavigationEvent, 0.0f, 8, null);
        }
    }

    public final boolean onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 65;
        access100 = i3 % 128;
        int i4 = i3 % 2;
        if (this.onTransact == null) {
            return false;
        }
        int i5 = i2 + 19;
        access100 = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        if (this.IAuthTabCallbackDefault) {
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 15;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            parseokhttp parseokhttpVar = this.onExtraCallback;
            if (parseokhttpVar == null) {
                int i5 = i2 + 21;
                access100 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                parseokhttpVar = null;
            }
            parseokhttpVar.onExtraCallbackWithResult();
            this.IAuthTabCallbackDefault = false;
        }
        int i7 = access100 + 115;
        getInterfaceDescriptor = i7 % 128;
        int i8 = i7 % 2;
    }
}
