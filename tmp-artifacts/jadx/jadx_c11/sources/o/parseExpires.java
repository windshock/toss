package o;

import android.opengl.GLES20;
import com.google.android.gms.internal.firebase-auth-api.zzmr;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$$ExternalSyntheticLambda18;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.properties.ReadWriteProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class parseExpires {
    private static int IAuthTabCallbackStubProxy = 1;
    private static int IAuthTabCallback_Parcel = 1;
    private static int access000;
    private static int getInterfaceDescriptor;
    private boolean IAuthTabCallbackDefault;
    private boolean IAuthTabCallbackStub;
    private final Credentials access100;
    private float asBinder;
    private final ReadWriteProperty asInterface;
    private final loadForRequest onExtraCallback;
    private final ReadWriteProperty onNavigationEvent;
    private final deprecated_path onTransact;
    private final ReadWriteProperty onWarmupCompleted;
    static final /* synthetic */ addAllCommandLine<Object>[] IAuthTabCallback = {new MutablePropertyReference1Impl<>(parseExpires.class, "noiseTextureFrameBuffer", "getNoiseTextureFrameBuffer()Lim/toss/tds/graphics/gl/framebuffer/Framebuffer;", 0), new MutablePropertyReference1Impl<>(parseExpires.class, "effectFrameBuffer", "getEffectFrameBuffer()Lim/toss/tds/graphics/gl/framebuffer/Framebuffer;", 0), new MutablePropertyReference1Impl<>(parseExpires.class, "effectFrameSpec", "getEffectFrameSpec()Lim/toss/tds/graphics/gl/framebuffer/FramebufferSpecification;", 0)};
    private static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = IAuthTabCallbackStubProxy + 7;
        access000 = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onNavigationEvent(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7);
        int i9 = i | i8 | (~(i6 | i4));
        int i10 = (~(i4 | i)) | (~(i7 | i4)) | (~(i7 | i));
        int i11 = i + i6 + i3 + (1351532378 * i5) + (1237199896 * i2);
        int i12 = i11 * i11;
        int i13 = ((-211156802) * i) + 1314914304 + ((-491389116) * i6) + (2007367491 * i9) + (i10 * (-2007367491)) + ((-2007367491) * i8) + (1796210688 * i3) + ((-1818230784) * i5) + ((-914358272) * i2) + ((-2051670016) * i12);
        int i14 = ((i * 406040238) - 634933780) + (i6 * 406038884) + (i9 * (-677)) + (i10 * 677) + (i8 * 677) + (i3 * 406039561) + (i5 * 1283666474) + (i2 * 1712827608) + (i12 * (-77201408));
        if (i13 + (i14 * i14 * 1831469056) != 1) {
            return onNavigationEvent(objArr);
        }
        parseExpires parseexpires = (parseExpires) objArr[0];
        int i15 = 2 % 2;
        int i16 = getInterfaceDescriptor + 73;
        IAuthTabCallback_Parcel = i16 % 128;
        return (parseokhttp) parseexpires.asInterface.getValue(parseexpires, i16 % 2 == 0 ? IAuthTabCallback[0] : IAuthTabCallback[0]);
    }

    public parseExpires(@NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar, @NotNull loadForRequest loadforrequest, @NotNull Credentials credentials) throws IOException {
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        Intrinsics.checkNotNullParameter(loadforrequest, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        this.onExtraCallback = loadforrequest;
        this.access100 = credentials;
        deprecated_path deprecated_pathVarIAuthTabCallback = deprecated_hostonly.IAuthTabCallback("simple_quad", "noise");
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult(deprecated_persistentVar);
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.onTransact = deprecated_pathVarIAuthTabCallback;
        getMemoryDumpCount getmemorydumpcount = getMemoryDumpCount.onNavigationEvent;
        this.asInterface = getmemorydumpcount.onWarmupCompleted();
        this.onWarmupCompleted = getmemorydumpcount.onWarmupCompleted();
        this.onNavigationEvent = getmemorydumpcount.onWarmupCompleted();
    }

    private final void onExtraCallbackWithResult(parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 119;
        getInterfaceDescriptor = i2 % 128;
        this.asInterface.setValue(this, i2 % 2 != 0 ? IAuthTabCallback[1] : IAuthTabCallback[0], parseokhttpVar);
    }

    private final parseokhttp IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 75;
        getInterfaceDescriptor = i2 % 128;
        return (parseokhttp) this.onWarmupCompleted.getValue(this, i2 % 2 != 0 ? IAuthTabCallback[0] : IAuthTabCallback[1]);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        ReadWriteProperty readWriteProperty;
        addAllCommandLine<Object> addallcommandline;
        parseExpires parseexpires = (parseExpires) objArr[0];
        parseokhttp parseokhttpVar = (parseokhttp) objArr[1];
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 85;
        getInterfaceDescriptor = i2 % 128;
        if (i2 % 2 != 0) {
            readWriteProperty = parseexpires.onWarmupCompleted;
            addallcommandline = IAuthTabCallback[1];
        } else {
            readWriteProperty = parseexpires.onWarmupCompleted;
            addallcommandline = IAuthTabCallback[1];
        }
        readWriteProperty.setValue(parseexpires, addallcommandline, parseokhttpVar);
        int i3 = IAuthTabCallback_Parcel + 5;
        getInterfaceDescriptor = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private final CookieJar IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 75;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        CookieJar cookieJar = (CookieJar) this.onNavigationEvent.getValue(this, IAuthTabCallback[2]);
        int i4 = IAuthTabCallback_Parcel + 43;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        return cookieJar;
    }

    private final void onExtraCallback(CookieJar cookieJar) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 61;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent.setValue(this, IAuthTabCallback[2], cookieJar);
        int i4 = getInterfaceDescriptor + 21;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final parseokhttp onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 65;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        parseokhttp parseokhttpVarIAuthTabCallback = IAuthTabCallback();
        int i4 = IAuthTabCallback_Parcel + 109;
        getInterfaceDescriptor = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 44 / 0;
        }
        return parseokhttpVarIAuthTabCallback;
    }

    private final void onWarmupCompleted(long j) {
        int i = 2 % 2;
        if (!(!onExtraCallback(j))) {
            int i2 = IAuthTabCallback_Parcel + 97;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback(j);
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = IAuthTabCallback_Parcel + 13;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void IAuthTabCallback(long j) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 17;
        getInterfaceDescriptor = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (this.IAuthTabCallbackStub) {
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                ((parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this}, 1118172657)).onExtraCallbackWithResult();
                IAuthTabCallback().onExtraCallbackWithResult();
                int i3 = IAuthTabCallback_Parcel + 83;
                getInterfaceDescriptor = i3 % 128;
                int i4 = i3 % 2;
            }
            onExtraCallback(new CookieJar(j, new saveFromResponse(null, 1, null), 0, 4, null));
            onExtraCallbackWithResult(parseokhttp.Companion.onExtraCallbackWithResult(IAuthTabCallbackDefault()));
            this.IAuthTabCallbackStub = true;
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final boolean onExtraCallback(long j) {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 3;
        IAuthTabCallback_Parcel = i2 % 128;
        int i3 = i2 % 2;
        if (this.IAuthTabCallbackStub) {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
            if (ExtensionsManager1.IAuthTabCallback(((parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1118172657)).onNavigationEvent().onExtraCallback(), j)) {
                int i4 = IAuthTabCallback_Parcel + 121;
                getInterfaceDescriptor = i4 % 128;
                return i4 % 2 != 0;
            }
        }
        int i5 = IAuthTabCallback_Parcel + 7;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallback() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 117;
        IAuthTabCallback_Parcel = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = 94 / 0;
            if (!this.IAuthTabCallbackDefault) {
                int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
                parseokhttp.onWarmupCompleted((parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this}, 1118172657), parseDomain.DRAW, false, 2, null);
                Credentials.onWarmupCompleted(zzmr.onExtraCallbackWithResult(), new Object[]{this.access100, this.onTransact, null, Float.valueOf(0.0f), 6, null}, -72835890, 72835891, zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult(), zzmr.onExtraCallbackWithResult());
                this.IAuthTabCallbackDefault = true;
            }
        } else if (!this.IAuthTabCallbackDefault) {
        }
        int i4 = getInterfaceDescriptor + 25;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final getTlsVersionsokhttp IAuthTabCallback(@NotNull getTlsVersionsokhttp gettlsversionsokhttp, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 93;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(gettlsversionsokhttp, "");
        this.asBinder = f;
        if (!onWarmupCompleted()) {
            return gettlsversionsokhttp;
        }
        int i4 = IAuthTabCallback_Parcel + 81;
        getInterfaceDescriptor = i4 % 128;
        int i5 = i4 % 2;
        onWarmupCompleted(ExtensionsManager1.onWarmupCompleted((gettlsversionsokhttp.onWarmupCompleted() & 4294967295L) | (gettlsversionsokhttp.IAuthTabCallbackStub() << 32)));
        onExtraCallback();
        Object[] objArr = {this, this.onExtraCallback.onExtraCallback(IAuthTabCallbackDefault())};
        onNavigationEvent(-2072718198, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), objArr, 2072718198);
        parseokhttp.onWarmupCompleted(IAuthTabCallback(), parseDomain.DRAW, false, 2, null);
        RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
        Credentials.onNavigationEvent(this.access100, null, gettlsversionsokhttp, null, 0.0f, 13, null);
        if (f > 0.0f) {
            GLES20.glEnable(3042);
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            Credentials credentials = this.access100;
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
            Credentials.onNavigationEvent(credentials, null, ((parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), new Object[]{this}, 1118172657)).onExtraCallback(), null, f, 5, null);
            GLES20.glDisable(3042);
        }
        return IAuthTabCallback().onExtraCallback();
    }

    public final boolean onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IAuthTabCallback_Parcel + 5;
        int i3 = i2 % 128;
        getInterfaceDescriptor = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.asBinder < 0.05f) {
            return false;
        }
        int i4 = i3 + 69;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor;
        int i3 = i2 + 93;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        if (this.IAuthTabCallbackStub) {
            int i5 = i2 + 93;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
            ((parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this}, 1118172657)).onExtraCallbackWithResult();
            int i7 = getInterfaceDescriptor + 107;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
        }
        this.IAuthTabCallbackStub = false;
    }

    static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    private final parseokhttp IAuthTabCallbackStub() {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        return (parseokhttp) onNavigationEvent(-1118172656, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this}, 1118172657);
    }

    private final void onNavigationEvent(parseokhttp parseokhttpVar) {
        int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        int iOnExtraCallbackWithResult3 = TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult();
        onNavigationEvent(-2072718198, TdsBottomCtaV1Kt$$ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, iOnExtraCallbackWithResult, iOnExtraCallbackWithResult3, new Object[]{this, parseokhttpVar}, 2072718198);
    }
}
