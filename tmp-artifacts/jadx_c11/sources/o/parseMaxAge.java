package o;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import com.jakewharton.rxbinding3.view.RxView__ViewTreeObserverPreDrawObservableKt;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import o.saveFromResponse;
import o.setUseCaseAttached;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class parseMaxAge {
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 0;
    private static int onRelationshipValidationResult = 1;
    private static int onUnminimized;
    private Rect IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private long IAuthTabCallbackStubProxy;
    private ExtensionsManager1 IAuthTabCallback_Parcel;
    private final ReadWriteProperty ICustomTabsCallback;
    private float access000;
    private Rect access100;
    private final float asBinder;
    private Rect asInterface;
    private float extraCallback;
    private final Credentials extraCallbackWithResult;
    private final loadForRequest getInterfaceDescriptor;
    private Rect onActivityLayout;
    private float onActivityResized;
    private long onExtraCallback;
    private float onNavigationEvent;
    private long onPostMessage;
    private final ReadWriteProperty onTransact;
    private final deprecated_persistent readTypedObject;
    private final deprecated_path writeTypedObject;
    static final /* synthetic */ addAllCommandLine<Object>[] onExtraCallbackWithResult = {new MutablePropertyReference1Impl<>(parseMaxAge.class, "cutFboSpec", "getCutFboSpec()Lim/toss/tds/graphics/gl/framebuffer/FramebufferSpecification;", 0), new MutablePropertyReference1Impl<>(parseMaxAge.class, "targetFboSpec", "getTargetFboSpec()Lim/toss/tds/graphics/gl/framebuffer/FramebufferSpecification;", 0)};
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onWarmupCompleted = 8;

    static {
        int i = onMessageChannelReady + 3;
        onMinimized = i % 128;
        if (i % 2 != 0) {
            int i2 = 59 / 0;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~(i3 | i2);
        int i11 = i9 | i10 | (~(i3 | i5));
        int i12 = i8 | i3;
        int i13 = (~((~i5) | i3)) | i10;
        int i14 = i3 + i2 + i6 + (111814883 * i4) + (1975835455 * i);
        int i15 = i14 * i14;
        int i16 = (((-1960851331) * i3) - 1583611904) + (47848387 * i2) + (i11 * (-2101222338)) + ((-92522620) * i12) + ((-2101222338) * i13) + ((-2053373952) * i6) + ((-648806400) * i4) + (1432616960 * i) + (442957824 * i15);
        int i17 = ((i3 * 961080817) - 60187382) + (i2 * 961079119) + (i11 * 566) + (i12 * (-1132)) + (i13 * 566) + (i6 * 961079685) + (i4 * 1618335983) + (i * 193609403) + (i15 * 1988296704);
        return i16 + ((i17 * i17) * 176226304) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
    }

    public parseMaxAge(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull loadForRequest loadforrequest, @NotNull Credentials credentials, @NotNull deprecated_persistent deprecated_persistentVar, float f) throws IOException {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        this.getInterfaceDescriptor = loadforrequest;
        this.extraCallbackWithResult = credentials;
        this.readTypedObject = deprecated_persistentVar;
        this.asBinder = f;
        deprecated_path deprecated_pathVarOnWarmupCompleted = deprecated_hostonly.onWarmupCompleted("preProcess", "#version 300 es\nprecision mediump float;\nuniform sampler2D u_Texture;\nuniform vec2 u_TexelSize;\nuniform vec2 u_ContentSize;\nin vec2 maskCoord;\nin vec2 texCoord;\nout vec4 color;\nconst vec2 center = vec2(0.5);\nvec2 calculateMappedTexCoord(vec2 coord){\n    vec2 halfSize = u_ContentSize * 0.5;\n    vec2 rectMin = center - halfSize;\n    vec2 rectSize = u_ContentSize;\n    return (coord - rectMin) / rectSize;\n}\nfloat inside01(vec2 uv){\n    vec2 lower = step(vec2(0.0), uv);\n    vec2 upper = step(uv, vec2(1.0));\n    return lower.x * lower.y * upper.x * upper.y;\n}\nvoid main(){\n    vec2 mappedUV = calculateMappedTexCoord(texCoord);\n    vec2 clampedUV = clamp(mappedUV, 0.0, 1.0);\n    // Extend edge color instead of zeroing alpha outside, to avoid dark fringes on blur edges.\n    color = texture(u_Texture, clampedUV);\n}");
        deprecated_pathVarOnWarmupCompleted.onExtraCallbackWithResult(deprecated_persistentVar);
        deprecated_pathVarOnWarmupCompleted.onWarmupCompleted("u_Texture", 0);
        deprecated_pathVarOnWarmupCompleted.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.writeTypedObject = deprecated_pathVarOnWarmupCompleted;
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        this.onTransact = getmemorydumpcount.onWarmupCompleted();
        this.ICustomTabsCallback = getmemorydumpcount.onWarmupCompleted();
        Rect.Companion companion = Rect.Companion;
        this.IAuthTabCallback = companion.onWarmupCompleted();
        this.IAuthTabCallbackDefault = 1.0f;
        this.IAuthTabCallbackStubProxy = ExtensionsManager1.onWarmupCompleted(4294967297L);
        setUseCaseAttached.onWarmupCompleted onwarmupcompleted = setUseCaseAttached.Companion;
        this.IAuthTabCallbackStub = onwarmupcompleted.IAuthTabCallback();
        this.onPostMessage = ExtensionsManager1.onWarmupCompleted(4294967297L);
        this.onExtraCallback = onwarmupcompleted.IAuthTabCallback();
        this.asInterface = companion.onWarmupCompleted();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ parseMaxAge(deprecated_hostOnly deprecated_hostonly, loadForRequest loadforrequest, Credentials credentials, deprecated_persistent deprecated_persistentVar, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 16) != 0) {
            int i2 = onUnminimized;
            int i3 = i2 + 11;
            onRelationshipValidationResult = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 107;
            onRelationshipValidationResult = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            f = 0.0f;
        }
        this(deprecated_hostonly, loadforrequest, credentials, deprecated_persistentVar, f);
    }

    private final void IAuthTabCallback(CookieJar cookieJar) {
        int i = 2 % 2;
        int i2 = onUnminimized + 79;
        onRelationshipValidationResult = i2 % 128;
        int i3 = i2 % 2;
        this.onTransact.setValue(this, onExtraCallbackWithResult[0], cookieJar);
        int i4 = onRelationshipValidationResult + 69;
        onUnminimized = i4 % 128;
        int i5 = i4 % 2;
    }

    private final CookieJar asBinder() {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 115;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            readWriteProperty = this.onTransact;
            addallcommandline = onExtraCallbackWithResult[0];
        } else {
            readWriteProperty = this.onTransact;
            addallcommandline = onExtraCallbackWithResult[0];
        }
        return (CookieJar) readWriteProperty.getValue(this, addallcommandline);
    }

    private final CookieJar asInterface() {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 57;
        onUnminimized = i2 % 128;
        if (i2 % 2 != 0) {
            readWriteProperty = this.ICustomTabsCallback;
            addallcommandline = onExtraCallbackWithResult[0];
        } else {
            readWriteProperty = this.ICustomTabsCallback;
            addallcommandline = onExtraCallbackWithResult[1];
        }
        CookieJar cookieJar = (CookieJar) readWriteProperty.getValue(this, addallcommandline);
        int i3 = onUnminimized + 5;
        onRelationshipValidationResult = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 41 / 0;
        }
        return cookieJar;
    }

    private final void onExtraCallbackWithResult(CookieJar cookieJar) {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 33;
        onUnminimized = i2 % 128;
        this.ICustomTabsCallback.setValue(this, i2 % 2 != 0 ? onExtraCallbackWithResult[0] : onExtraCallbackWithResult[1], cookieJar);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        parseMaxAge parsemaxage = (parseMaxAge) objArr[0];
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 19;
        int i3 = i2 % 128;
        onUnminimized = i3;
        int i4 = i2 % 2;
        Rect rect = parsemaxage.IAuthTabCallback;
        int i5 = i3 + 53;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
        return rect;
    }

    public final float onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 37;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        float f = this.IAuthTabCallbackDefault;
        int i5 = i2 + 9;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return f;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        long j;
        parseMaxAge parsemaxage = (parseMaxAge) objArr[0];
        int i = 2 % 2;
        int i2 = onUnminimized + 11;
        onRelationshipValidationResult = i2 % 128;
        if (i2 % 2 == 0) {
            j = parsemaxage.IAuthTabCallbackStubProxy;
            int i3 = 93 / 0;
        } else {
            j = parsemaxage.IAuthTabCallbackStubProxy;
        }
        return Long.valueOf(j);
    }

    public final long onExtraCallback() {
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult;
        int i3 = i2 + 85;
        onUnminimized = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        long j = this.IAuthTabCallbackStub;
        int i4 = i2 + 13;
        onUnminimized = i4 % 128;
        if (i4 % 2 == 0) {
            return j;
        }
        throw null;
    }

    public final long IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = onUnminimized;
        int i3 = i2 + 111;
        onRelationshipValidationResult = i3 % 128;
        int i4 = i3 % 2;
        long j = this.onPostMessage;
        int i5 = i2 + 93;
        onRelationshipValidationResult = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    public final parseokhttp onExtraCallbackWithResult(@NotNull parseokhttp parseokhttpVar, @NotNull Rect rect) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(parseokhttpVar, "");
        Intrinsics.checkNotNullParameter(rect, "");
        if (rect.IAuthTabCallback_Parcel() - rect.IAuthTabCallbackStubProxy() > 0.0f) {
            int i2 = onUnminimized + 43;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            if (rect.IAuthTabCallbackDefault() - rect.extraCallback() > 0.0f) {
                IAuthTabCallback(parseokhttpVar, rect);
                parseokhttp parseokhttpVarOnExtraCallback = this.getInterfaceDescriptor.onExtraCallback(asInterface());
                parseokhttp parseokhttpVarOnExtraCallback2 = this.getInterfaceDescriptor.onExtraCallback(asBinder());
                onWarmupCompleted(parseokhttpVar, parseokhttpVarOnExtraCallback2);
                long jOnExtraCallback = parseokhttpVarOnExtraCallback.onNavigationEvent().onExtraCallback();
                long jOnExtraCallback2 = parseokhttpVarOnExtraCallback2.onNavigationEvent().onExtraCallback();
                parseokhttp.onWarmupCompleted(parseokhttpVarOnExtraCallback, parseDomain.DRAW, false, 2, null);
                RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
                this.writeTypedObject.onExtraCallbackWithResult(this.readTypedObject);
                float f = (int) (jOnExtraCallback >> 32);
                float f2 = (int) jOnExtraCallback;
                this.writeTypedObject.onWarmupCompleted("u_TexelSize", new excludeChildren(1.0f / f, 1.0f / f2));
                float fOnNavigationEvent = onNavigationEvent(jOnExtraCallback2, jOnExtraCallback);
                float f3 = ((int) (jOnExtraCallback2 >> 32)) * fOnNavigationEvent;
                this.writeTypedObject.onWarmupCompleted("u_ContentSize", new excludeChildren(f3 / f, (((int) jOnExtraCallback2) * fOnNavigationEvent) / f2));
                this.IAuthTabCallbackDefault = fOnNavigationEvent;
                this.IAuthTabCallbackStubProxy = ExtensionsManager1.onWarmupCompleted((((int) f3) << 32) | (((int) r9) & 4294967295L));
                this.onPostMessage = jOnExtraCallback;
                this.onExtraCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(r6) << 32) | (Float.floatToRawIntBits(r10) & 4294967295L));
                Credentials.onNavigationEvent(this.extraCallbackWithResult, this.writeTypedObject, parseokhttpVarOnExtraCallback2.onExtraCallback(), null, 0.0f, 12, null);
                int i4 = onRelationshipValidationResult + 85;
                onUnminimized = i4 % 128;
                int i5 = i4 % 2;
                return parseokhttpVarOnExtraCallback;
            }
        }
        int i6 = onUnminimized + 21;
        onRelationshipValidationResult = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 19 / 0;
        }
        return parseokhttpVar;
    }

    private final float onNavigationEvent(long j, long j2) {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = (int) (j >> 32);
        Object obj = null;
        if (i4 != 0 && (i = (int) j) != 0) {
            int i5 = onRelationshipValidationResult;
            int i6 = i5 + 41;
            onUnminimized = i6 % 128;
            if (i6 % 2 == 0 ? (i2 = (int) (j2 >> 32)) != 0 : (i2 = (int) (j2 >> 112)) != 0) {
                int i7 = i5 + 75;
                onUnminimized = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                int i8 = (int) j2;
                if (i8 != 0) {
                    float fMin = Math.min(i2 / i4, i8 / i);
                    if (fMin < 1.0f) {
                        int i9 = onRelationshipValidationResult + 83;
                        onUnminimized = i9 % 128;
                        if (i9 % 2 == 0) {
                            return fMin;
                        }
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        int i10 = onRelationshipValidationResult + 115;
        onUnminimized = i10 % 128;
        if (i10 % 2 == 0) {
            return 1.0f;
        }
        throw null;
    }

    private final void onWarmupCompleted(parseokhttp parseokhttpVar, parseokhttp parseokhttpVar2) {
        int i = 2 % 2;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(parseokhttpVar.onNavigationEvent().IAuthTabCallback(), 1);
        int iOnExtraCallback = (int) (parseokhttpVar.onNavigationEvent().onExtraCallback() >> 32);
        int iOnExtraCallback2 = (int) parseokhttpVar.onNavigationEvent().onExtraCallback();
        parseokhttp.onWarmupCompleted(parseokhttpVar2, parseDomain.DRAW, false, 2, null);
        RenderCommand renderCommand = RenderCommand.IAuthTabCallback;
        RenderCommand.onWarmupCompleted(renderCommand, null, 1, null);
        if (this.onActivityLayout != null) {
            int i2 = onUnminimized + 1;
            onRelationshipValidationResult = i2 % 128;
            int i3 = i2 % 2;
            float f = iCoerceAtLeast;
            int iCoerceIn = RangesKt.coerceIn((int) Math.floor(r9.IAuthTabCallbackStubProxy() / f), 0, iOnExtraCallback);
            int iCoerceIn2 = RangesKt.coerceIn((int) Math.ceil(r9.IAuthTabCallback_Parcel() / f), 0, iOnExtraCallback);
            float f2 = iOnExtraCallback2;
            int iCoerceIn3 = RangesKt.coerceIn((int) (f2 - ((float) Math.ceil(r9.extraCallback() / f))), 0, iOnExtraCallback2);
            int iCoerceIn4 = RangesKt.coerceIn((int) (f2 - ((float) Math.floor(r9.IAuthTabCallbackDefault() / f))), 0, iOnExtraCallback2);
            int iCoerceIn5 = RangesKt.coerceIn((int) Math.floor(r9.IAuthTabCallbackStubProxy() - this.asInterface.IAuthTabCallbackStubProxy()), 0, (int) (parseokhttpVar2.onNavigationEvent().onExtraCallback() >> 32));
            int iCoerceIn6 = RangesKt.coerceIn((int) Math.ceil(r9.IAuthTabCallback_Parcel() - this.asInterface.IAuthTabCallbackStubProxy()), 0, (int) (parseokhttpVar2.onNavigationEvent().onExtraCallback() >> 32));
            int iCoerceIn7 = RangesKt.coerceIn((int) Math.floor(r9.extraCallback() - this.asInterface.extraCallback()), 0, (int) parseokhttpVar2.onNavigationEvent().onExtraCallback());
            int iCoerceIn8 = RangesKt.coerceIn((int) Math.ceil(r9.IAuthTabCallbackDefault() - this.asInterface.extraCallback()), 0, (int) (parseokhttpVar2.onNavigationEvent().onExtraCallback() & 4294967295L));
            if (iCoerceIn == iCoerceIn2 || iCoerceIn3 == iCoerceIn4 || iCoerceIn5 == iCoerceIn6 || iCoerceIn7 == iCoerceIn8) {
                return;
            }
            parseokhttpVar.onNavigationEvent(parseDomain.READ, false);
            RenderCommand.onExtraCallbackWithResult(renderCommand, iCoerceIn, iCoerceIn3, iCoerceIn2, iCoerceIn4, iCoerceIn5, iCoerceIn7, iCoerceIn6, iCoerceIn8, 0, 0, 768, null);
            int i4 = onUnminimized + 97;
            onRelationshipValidationResult = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051 A[PHI: r3 r6 r8
      0x0051: PHI (r3v16 int) = (r3v6 int), (r3v19 int) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r6v5 long) = (r6v2 long), (r6v8 long) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r8v24 o.ExtensionsManager1) = (r8v1 o.ExtensionsManager1), (r8v27 o.ExtensionsManager1) binds: [B:8:0x004d, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void IAuthTabCallback(parseokhttp parseokhttpVar, Rect rect) {
        int iCoerceAtLeast;
        long jOnExtraCallback;
        ExtensionsManager1 extensionsManager1;
        long j;
        Rect rectOnWarmupCompleted;
        int i = 2 % 2;
        int i2 = onRelationshipValidationResult + 9;
        onUnminimized = i2 % 128;
        boolean zIAuthTabCallback = false;
        if (i2 % 2 != 0) {
            iCoerceAtLeast = RangesKt.coerceAtLeast(parseokhttpVar.onNavigationEvent().IAuthTabCallback(), 0);
            jOnExtraCallback = domainMatch.onExtraCallback(parseokhttpVar.onNavigationEvent().onExtraCallback(), iCoerceAtLeast);
            extensionsManager1 = this.IAuthTabCallback_Parcel;
            if (extensionsManager1 != null) {
                zIAuthTabCallback = ExtensionsManager1.IAuthTabCallback(extensionsManager1.onExtraCallbackWithResult(), jOnExtraCallback);
            }
        } else {
            iCoerceAtLeast = RangesKt.coerceAtLeast(parseokhttpVar.onNavigationEvent().IAuthTabCallback(), 1);
            jOnExtraCallback = domainMatch.onExtraCallback(parseokhttpVar.onNavigationEvent().onExtraCallback(), iCoerceAtLeast);
            extensionsManager1 = this.IAuthTabCallback_Parcel;
            if (extensionsManager1 != null) {
            }
        }
        int i3 = iCoerceAtLeast;
        if (zIAuthTabCallback) {
            int i4 = onRelationshipValidationResult + 117;
            onUnminimized = i4 % 128;
            int i5 = i4 % 2;
            if (!(!domainMatch.onWarmupCompleted(this.access100, rect, 0.0f, 4, null))) {
                return;
            }
        }
        float f = this.asBinder;
        this.access000 = f;
        this.extraCallback = f;
        this.onActivityResized = f;
        this.onNavigationEvent = f;
        if (f > 0.0f) {
            float fIAuthTabCallbackStubProxy = rect.IAuthTabCallbackStubProxy();
            float f2 = this.access000;
            float fExtraCallback = rect.extraCallback();
            float f3 = this.onActivityResized;
            long jIAuthTabCallback = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIAuthTabCallbackStubProxy - f2) << 32) | (Float.floatToRawIntBits(fExtraCallback - f3) & 4294967295L));
            float fIAuthTabCallback_Parcel = rect.IAuthTabCallback_Parcel();
            float f4 = this.extraCallback;
            j = jOnExtraCallback;
            rectOnWarmupCompleted = RectKt.onWarmupCompleted(jIAuthTabCallback, setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(rect.IAuthTabCallbackDefault() + this.onNavigationEvent) & 4294967295L) | (Float.floatToRawIntBits(fIAuthTabCallback_Parcel + f4) << 32)));
        } else {
            j = jOnExtraCallback;
            rectOnWarmupCompleted = rect;
        }
        Rect rectOnExtraCallbackWithResult = domainMatch.onExtraCallbackWithResult(rectOnWarmupCompleted);
        this.asInterface = rectOnExtraCallbackWithResult;
        long j2 = j;
        this.onActivityLayout = domainMatch.onNavigationEvent(rectOnExtraCallbackWithResult, j2);
        float fIAuthTabCallbackStubProxy2 = this.asInterface.IAuthTabCallbackStubProxy();
        float fExtraCallback2 = this.asInterface.extraCallback();
        this.IAuthTabCallbackStub = setUseCaseAttached.IAuthTabCallback((Float.floatToRawIntBits(fIAuthTabCallbackStubProxy2) << 32) | (Float.floatToRawIntBits(fExtraCallback2) & 4294967295L));
        long jOnWarmupCompleted = ExtensionsManager2.onWarmupCompleted(this.asInterface.access100());
        long jOnWarmupCompleted2 = ExtensionsManager1.onWarmupCompleted((Math.max(1, (int) (jOnWarmupCompleted >> 32)) << 32) | (Math.max(1, (int) jOnWarmupCompleted) & 4294967295L));
        saveFromResponse.onNavigationEvent onnavigationevent = saveFromResponse.Companion;
        IAuthTabCallback(new CookieJar(jOnWarmupCompleted2, saveFromResponse.onNavigationEvent.onNavigationEvent(onnavigationevent, null, false, true, 3, null), 0, 4, null));
        onExtraCallbackWithResult(new CookieJar(ExtensionsManager1.onWarmupCompleted((Math.max(1, ((int) r13) / i3) & 4294967295L) | (Math.max(1, ((int) (deprecated_tlsVersions.onExtraCallbackWithResult.onExtraCallbackWithResult(jOnWarmupCompleted2) >> 32)) / i3) << 32)), saveFromResponse.onNavigationEvent.onNavigationEvent(onnavigationevent, null, false, true, 3, null), i3, null));
        float fOnNavigationEvent = onNavigationEvent(jOnWarmupCompleted2, asInterface().onExtraCallback());
        Rect rectIAuthTabCallback = RectKt.IAuthTabCallback(setUseCaseAttached.IAuthTabCallback((4294967295L & Float.floatToRawIntBits((((int) r8) - ((int) r10)) / 2.0f)) | (Float.floatToRawIntBits((((int) (r8 >> 32)) - ((int) (r10 >> 32))) / 2.0f) << 32)), ExtensionsManager2.onExtraCallback(ExtensionsManager1.onWarmupCompleted((((int) (Float.intBitsToFloat((int) (this.asInterface.access100() >> 32)) * fOnNavigationEvent)) << 32) | (((int) (Float.intBitsToFloat((int) this.asInterface.access100()) * fOnNavigationEvent)) & 4294967295L))));
        this.IAuthTabCallback = new Rect(rectIAuthTabCallback.IAuthTabCallbackStubProxy() + ((rect.IAuthTabCallbackStubProxy() - this.asInterface.IAuthTabCallbackStubProxy()) * fOnNavigationEvent), rectIAuthTabCallback.extraCallback() + ((rect.extraCallback() - this.asInterface.extraCallback()) * fOnNavigationEvent), rectIAuthTabCallback.IAuthTabCallback_Parcel() - ((this.asInterface.IAuthTabCallback_Parcel() - rect.IAuthTabCallback_Parcel()) * fOnNavigationEvent), rectIAuthTabCallback.IAuthTabCallbackDefault() - ((this.asInterface.IAuthTabCallbackDefault() - rect.IAuthTabCallbackDefault()) * fOnNavigationEvent));
        this.IAuthTabCallback_Parcel = ExtensionsManager1.onNavigationEvent(j2);
        this.access100 = rect;
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public final Rect onWarmupCompleted() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return (Rect) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1187178152, -1187178151, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2);
    }

    public final long onNavigationEvent() {
        int iOnExtraCallbackWithResult = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult();
        return ((Long) IAuthTabCallback(RxView__ViewTreeObserverPreDrawObservableKt.onExtraCallbackWithResult(), 1956828088, -1956828088, new Object[]{this}, iOnExtraCallbackWithResult3, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult2)).longValue();
    }
}
