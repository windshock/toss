package o;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import im.toss.tds.graphics.gl.RootLayerContract;
import im.toss.tds.graphics.gl.blur.RenderCommand;
import im.toss.tds.graphics.gl.view.ViewRenderableRootLayer$;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import o.CookieJarCompanion;
import o.saveFromResponse;
import o.setCipherSuitesokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class CookieJarCompanion implements RootLayerContract {
    private static int onMinimized = 1;
    private static int onPostMessage;
    private final int IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private CommonContextMenuAreaKtExternalSyntheticLambda7 IAuthTabCallbackStub;
    private final Function0<Unit> IAuthTabCallbackStubProxy;
    private Surface IAuthTabCallback_Parcel;
    private deprecated_path ICustomTabsCallback;
    private Integer access000;
    private boolean access100;
    private final AtomicBoolean asBinder;
    private final AtomicBoolean asInterface;
    private final View extraCallback;
    private final deprecated_hostOnly extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private getTlsVersionsokhttp onActivityLayout;
    private SurfaceTexture onActivityResized;
    public parseokhttp onExtraCallback;
    private final long onExtraCallbackWithResult;
    private final Credentials onMessageChannelReady;
    private final Lazy onNavigationEvent;
    private final AtomicBoolean onTransact;
    private final float onWarmupCompleted;
    private final deprecated_persistent readTypedObject;
    private final ViewTreeObserver.OnPreDrawListener writeTypedObject;

    public static /* synthetic */ boolean IAuthTabCallback(CookieJarCompanion cookieJarCompanion) {
        int i = 2 % 2;
        int i2 = onPostMessage + 57;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallbackStub = IAuthTabCallbackStub(cookieJarCompanion);
        int i4 = onMinimized + 9;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return zIAuthTabCallbackStub;
    }

    public static /* synthetic */ Drawable onExtraCallback(CookieJarCompanion cookieJarCompanion) {
        int i = 2 % 2;
        int i2 = onMinimized + 107;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Drawable drawableOnWarmupCompleted = onWarmupCompleted(cookieJarCompanion);
        int i4 = onMinimized + 17;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return drawableOnWarmupCompleted;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = i5 | i4 | (~i6);
        int i8 = (~((~i5) | i4)) | (~(i5 | i6));
        int i9 = (~(i6 | (~i4))) | i5;
        int i10 = i5 + i4 + i2 + ((-1069702238) * i) + (1645725337 * i3);
        int i11 = i10 * i10;
        int i12 = ((i5 * 2084108943) - 1824784384) + (2084108943 * i4) + (i7 * (-929364622)) + (929364622 * i8) + ((-929364622) * i9) + (1154744320 * i2) + ((-1977090048) * i) + (448004096 * i3) + (1807155200 * i11);
        int i13 = (i5 * (-999696423)) + 1136243370 + (i4 * (-999696423)) + (i7 * 830) + (i8 * (-830)) + (i9 * 830) + (i2 * (-999695593)) + (i * 636963214) + (i3 * (-1077364033)) + (i11 * 980484096);
        int i14 = i12 + (i13 * i13 * 1287192576);
        return i14 != 1 ? i14 != 2 ? i14 != 3 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onNavigationEvent(objArr) : onExtraCallbackWithResult(objArr);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        CookieJarCompanion cookieJarCompanion = (CookieJarCompanion) objArr[0];
        int i = 2 % 2;
        int i2 = onMinimized + 5;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(cookieJarCompanion);
        int i4 = onMinimized + 87;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CookieJarCompanion cookieJarCompanion, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 51;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallback(cookieJarCompanion, i, i2);
        int i6 = onMinimized + 35;
        onPostMessage = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 94 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CookieJarCompanion cookieJarCompanion, SurfaceTexture surfaceTexture) {
        int i = 2 % 2;
        int i2 = onMinimized + 77;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(cookieJarCompanion, surfaceTexture);
        int i4 = onMinimized + 5;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
    }

    public CookieJarCompanion(@NotNull View view, @NotNull deprecated_hostOnly deprecated_hostonly, @NotNull deprecated_persistent deprecated_persistentVar, @NotNull Credentials credentials, int i, @NotNull String str, @Nullable Function0<Unit> function0) {
        long j;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(deprecated_hostonly, "");
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        Intrinsics.checkNotNullParameter(credentials, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.extraCallback = view;
        this.extraCallbackWithResult = deprecated_hostonly;
        this.readTypedObject = deprecated_persistentVar;
        this.onMessageChannelReady = credentials;
        this.IAuthTabCallback = i;
        this.IAuthTabCallbackStubProxy = function0;
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.tds.graphics.gl.view.ViewRenderableRootLayer$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 15;
                IAuthTabCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    CookieJarCompanion.onExtraCallback(this.f$0);
                    throw null;
                }
                Drawable drawableOnExtraCallback = CookieJarCompanion.onExtraCallback(this.f$0);
                int i4 = onExtraCallback + 65;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return drawableOnExtraCallback;
            }
        });
        Display display = view.getDisplay();
        float refreshRate = display != null ? display.getRefreshRate() : 60.0f;
        this.onWarmupCompleted = refreshRate;
        if (refreshRate > 60.0f) {
            int i2 = onPostMessage + 109;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            j = 16666666;
        } else {
            int i3 = onMinimized + 83;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            j = 0;
        }
        this.onExtraCallbackWithResult = j;
        this.onTransact = new AtomicBoolean(false);
        this.asInterface = new AtomicBoolean(false);
        this.asBinder = new AtomicBoolean(false);
        this.IAuthTabCallbackDefault = 1.0f;
        this.writeTypedObject = new ViewTreeObserver.OnPreDrawListener() { // from class: im.toss.tds.graphics.gl.view.ViewRenderableRootLayer$$ExternalSyntheticLambda1
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 25;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                boolean zIAuthTabCallback = CookieJarCompanion.IAuthTabCallback(this.f$0);
                int i9 = IAuthTabCallback + 97;
                onWarmupCompleted = i9 % 128;
                int i10 = i9 % 2;
                return zIAuthTabCallback;
            }
        };
    }

    private final Point IAuthTabCallbackDefault() {
        int i = 2 % 2;
        Point point = new Point(this.extraCallback.getWidth(), this.extraCallback.getHeight());
        int i2 = onMinimized + 27;
        onPostMessage = i2 % 128;
        if (i2 % 2 == 0) {
            return point;
        }
        throw null;
    }

    private final Drawable onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 101;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onNavigationEvent.getValue();
        if (i3 != 0) {
            return (Drawable) value;
        }
        throw null;
    }

    public final void onNavigationEvent(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        this.access000 = num;
        int i5 = i3 + 59;
        onMinimized = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // im.toss.tds.graphics.gl.RootLayerContract
    public parseokhttp IAuthTabCallback() {
        int i = 2 % 2;
        parseokhttp parseokhttpVar = this.onExtraCallback;
        if (parseokhttpVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i2 = onMinimized + 33;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        onMinimized = i5 % 128;
        if (i5 % 2 != 0) {
            return parseokhttpVar;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull parseokhttp parseokhttpVar) {
        int i = 2 % 2;
        int i2 = onPostMessage + 63;
        onMinimized = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(parseokhttpVar, "");
            this.onExtraCallback = parseokhttpVar;
            int i3 = 43 / 0;
        } else {
            Intrinsics.checkNotNullParameter(parseokhttpVar, "");
            this.onExtraCallback = parseokhttpVar;
        }
        int i4 = onMinimized + 97;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
    }

    private static final void onWarmupCompleted(CookieJarCompanion cookieJarCompanion, SurfaceTexture surfaceTexture) {
        int i = 2 % 2;
        int i2 = onPostMessage + 23;
        int i3 = i2 % 128;
        onMinimized = i3;
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7 = null;
        if (i2 % 2 == 0) {
            CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda72 = cookieJarCompanion.IAuthTabCallbackStub;
            throw null;
        }
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda73 = cookieJarCompanion.IAuthTabCallbackStub;
        if (commonContextMenuAreaKtExternalSyntheticLambda73 == null) {
            int i4 = i3 + 11;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 != 0) {
                commonContextMenuAreaKtExternalSyntheticLambda7.hashCode();
                throw null;
            }
        } else {
            commonContextMenuAreaKtExternalSyntheticLambda7 = commonContextMenuAreaKtExternalSyntheticLambda73;
        }
        commonContextMenuAreaKtExternalSyntheticLambda7.onWarmupCompleted(new ViewRenderableRootLayer$.ExternalSyntheticLambda3(cookieJarCompanion));
        int i6 = onPostMessage + 17;
        onMinimized = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final void onNavigationEvent(CookieJarCompanion cookieJarCompanion) {
        int i = 2 % 2;
        int i2 = onPostMessage + 11;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (!(!cookieJarCompanion.asInterface.get())) {
            return;
        }
        int i4 = onMinimized + 93;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        if (!(!cookieJarCompanion.asBinder.get())) {
            return;
        }
        try {
            SurfaceTexture surfaceTexture = cookieJarCompanion.onActivityResized;
            if (surfaceTexture == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                surfaceTexture = null;
            }
            surfaceTexture.updateTexImage();
            cookieJarCompanion.onNavigationEvent();
            Function0<Unit> function0 = cookieJarCompanion.IAuthTabCallbackStubProxy;
            if (function0 != null) {
                int i6 = onPostMessage + 85;
                onMinimized = i6 % 128;
                if (i6 % 2 != 0) {
                    function0.invoke();
                } else {
                    function0.invoke();
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    private final void onExtraCallback(int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onMinimized + 43;
        int i5 = i4 % 128;
        onPostMessage = i5;
        int i6 = i4 % 2;
        int i7 = this.IAuthTabCallback;
        float f = 1.0f;
        if (i7 > 1) {
            int i8 = i5 + 21;
            onMinimized = i8 % 128;
            f = i8 % 2 == 0 ? 1.0f + i7 : 1.0f / i7;
        }
        this.IAuthTabCallbackDefault = f;
        int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (i * f), 1);
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast((int) (i2 * this.IAuthTabCallbackDefault), 1);
        long j = (iCoerceAtLeast << 32) | (iCoerceAtLeast2 & 4294967295L);
        onExtraCallbackWithResult(parseokhttp.Companion.onExtraCallbackWithResult(new CookieJar(ExtensionsManager1.onWarmupCompleted(j), saveFromResponse.onNavigationEvent.onNavigationEvent(saveFromResponse.Companion, pathMatch.RGBA8, false, false, 2, null), 0, 4, null)));
        getTlsVersionsokhttp gettlsversionsokhttpOnExtraCallbackWithResult = getTlsVersionsokhttp.Companion.onExtraCallbackWithResult(setCipherSuitesokhttp.onExtraCallback.TEXTURE_EXTERNAL_OES, new setCipherSuitesokhttp.onExtraCallbackWithResult(ExtensionsManager1.onWarmupCompleted(j), null, false, true, false, 22, null));
        this.onActivityLayout = gettlsversionsokhttpOnExtraCallbackWithResult;
        if (gettlsversionsokhttpOnExtraCallbackWithResult == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            gettlsversionsokhttpOnExtraCallbackWithResult = null;
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(gettlsversionsokhttpOnExtraCallbackWithResult.IAuthTabCallback());
        surfaceTexture.setDefaultBufferSize(iCoerceAtLeast, iCoerceAtLeast2);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: im.toss.tds.graphics.gl.view.ViewRenderableRootLayer$$ExternalSyntheticLambda2
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                int i9 = 2 % 2;
                int i10 = onNavigationEvent + 87;
                onExtraCallback = i10 % 128;
                int i11 = i10 % 2;
                CookieJarCompanion.onExtraCallbackWithResult(this.f$0, surfaceTexture2);
                int i12 = onNavigationEvent + 79;
                onExtraCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, new Handler(Looper.getMainLooper()));
        this.onActivityResized = surfaceTexture;
        this.IAuthTabCallback_Parcel = new Surface(surfaceTexture);
        deprecated_path deprecated_pathVarIAuthTabCallback = this.extraCallbackWithResult.IAuthTabCallback("simple_quad", "simple_ext_quad");
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult(this.readTypedObject);
        deprecated_pathVarIAuthTabCallback.onExtraCallbackWithResult("TextureDataUBO", 0);
        this.ICustomTabsCallback = deprecated_pathVarIAuthTabCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        r4 = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r8.access100 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        r1 = o.CookieJarCompanion.onMinimized + 79;
        o.CookieJarCompanion.onPostMessage = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if ((r4 - r8.getInterfaceDescriptor) < r8.onExtraCallbackWithResult) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if ((!r8.onTransact.compareAndSet(false, true)) == true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r8.getInterfaceDescriptor = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        r8.onWarmupCompleted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r8.asInterface.get() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r8.asInterface.get() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean IAuthTabCallbackStub(CookieJarCompanion cookieJarCompanion) {
        int i = 2 % 2;
        int i2 = onMinimized + 53;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 40 / 0;
        }
    }

    private final void onWarmupCompleted() {
        View view;
        int i = 2 % 2;
        if (this.asBinder.get() || this.asInterface.get()) {
            this.onTransact.set(false);
            return;
        }
        Surface surface = this.IAuthTabCallback_Parcel;
        if (surface != null) {
            Surface surface2 = null;
            if (surface == null) {
                int i2 = onPostMessage + 55;
                onMinimized = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    throw null;
                }
                Intrinsics.throwUninitializedPropertyAccessException("");
                surface = null;
            }
            if (surface.isValid()) {
                View view2 = this.extraCallback;
                if (view2 instanceof ViewGroup) {
                    int i3 = onPostMessage + 31;
                    onMinimized = i3 % 128;
                    if (i3 % 2 == 0) {
                        surface2.hashCode();
                        throw null;
                    }
                    view = (ViewGroup) view2;
                } else {
                    view = null;
                }
                try {
                    Surface surface3 = this.IAuthTabCallback_Parcel;
                    if (surface3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        surface3 = null;
                    }
                    Canvas canvasLockHardwareCanvas = surface3.lockHardwareCanvas();
                    Intrinsics.checkNotNull(canvasLockHardwareCanvas);
                    try {
                        canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        float f = this.IAuthTabCallbackDefault;
                        canvasLockHardwareCanvas.scale(f, f);
                        if (view == null) {
                            int i4 = onMinimized + 95;
                            onPostMessage = i4 % 128;
                            int i5 = i4 % 2;
                            view = this.extraCallback;
                        }
                        onNavigationEvent(canvasLockHardwareCanvas, view);
                        Integer num = this.access000;
                        if (num != null) {
                            canvasLockHardwareCanvas.drawColor(num.intValue());
                        }
                        Surface surface4 = this.IAuthTabCallback_Parcel;
                        if (surface4 == null) {
                            int i6 = onPostMessage + 25;
                            onMinimized = i6 % 128;
                            if (i6 % 2 == 0) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                int i7 = 14 / 0;
                            } else {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                        } else {
                            surface2 = surface4;
                        }
                        surface2.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        this.onTransact.set(false);
                        return;
                    } catch (Throwable th) {
                        Surface surface5 = this.IAuthTabCallback_Parcel;
                        if (surface5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            surface2 = surface5;
                        }
                        surface2.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        this.onTransact.set(false);
                        throw th;
                    }
                } catch (Throwable unused) {
                    this.onTransact.set(false);
                    return;
                }
            }
        }
        this.onTransact.set(false);
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str;
        int i = 2 % 2;
        Object tag = ((View) objArr[1]).getTag();
        Object obj = null;
        if (tag instanceof String) {
            int i2 = onPostMessage + 63;
            onMinimized = i2 % 128;
            str = (String) tag;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            int i3 = onMinimized + 71;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            if (StringsKt.startsWith$default(str, "TDS_EFFECT_VIEW_TAG", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    private final Drawable onExtraCallback(View view) {
        Drawable drawable;
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onMinimized = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Context context = view.getContext();
                int[] iArr = new int[0];
                iArr[1] = 16842836;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
                drawable = typedArrayObtainStyledAttributes.getDrawable(1);
                view = typedArrayObtainStyledAttributes;
            } else {
                TypedArray typedArrayObtainStyledAttributes2 = view.getContext().obtainStyledAttributes(new int[]{R.attr.windowBackground});
                Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes2, "");
                drawable = typedArrayObtainStyledAttributes2.getDrawable(0);
                view = typedArrayObtainStyledAttributes2;
            }
            return drawable;
        } finally {
            view.recycle();
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CookieJarCompanion cookieJarCompanion = (CookieJarCompanion) objArr[0];
        View view = (View) objArr[1];
        int i = 2 % 2;
        int i2 = onPostMessage + 65;
        int i3 = i2 % 128;
        onMinimized = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            boolean z = view instanceof TextureView;
            obj.hashCode();
            throw null;
        }
        if ((view instanceof TextureView) || (view instanceof SurfaceView)) {
            return true;
        }
        int i4 = i3 + 123;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        if (view instanceof ViewGroup) {
            int i6 = i3 + 87;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                Intrinsics.checkNotNullExpressionValue(childAt, "");
                int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{cookieJarCompanion, childAt}, 560757066, -560757064, iOnNavigationEvent)).booleanValue()) {
                    int i9 = onMinimized + 113;
                    onPostMessage = i9 % 128;
                    if (i9 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        int i10 = onPostMessage + 47;
        onMinimized = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    private final boolean IAuthTabCallback(View view) {
        int i = 2 % 2;
        int i2 = onMinimized + 65;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        if (!((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, view}, 1328239779, -1328239779, iOnNavigationEvent)).booleanValue()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i4 = onPostMessage + 101;
                onMinimized = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 % 4;
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = viewGroup.getChildAt(i6);
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    if (IAuthTabCallback(childAt)) {
                        int i7 = onPostMessage + 7;
                        onMinimized = i7 % 128;
                        int i8 = i7 % 2;
                        return true;
                    }
                }
            }
            return false;
        }
        int i9 = onPostMessage + 81;
        int i10 = i9 % 128;
        onMinimized = i10;
        int i11 = i9 % 2;
        int i12 = i10 + 27;
        onPostMessage = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 5 / 0;
        }
        return true;
    }

    private final void onNavigationEvent() {
        deprecated_path deprecated_pathVar;
        getTlsVersionsokhttp gettlsversionsokhttp;
        int i = 2 % 2;
        Object obj = null;
        parseokhttp.onWarmupCompleted(IAuthTabCallback(), parseDomain.DRAW, false, 2, null);
        RenderCommand.onWarmupCompleted(RenderCommand.IAuthTabCallback, null, 1, null);
        Credentials credentials = this.onMessageChannelReady;
        deprecated_path deprecated_pathVar2 = this.ICustomTabsCallback;
        if (deprecated_pathVar2 == null) {
            int i2 = onPostMessage + 113;
            onMinimized = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            deprecated_pathVar = null;
        } else {
            deprecated_pathVar = deprecated_pathVar2;
        }
        getTlsVersionsokhttp gettlsversionsokhttp2 = this.onActivityLayout;
        if (gettlsversionsokhttp2 == null) {
            int i4 = onPostMessage + 1;
            onMinimized = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            gettlsversionsokhttp = null;
        } else {
            gettlsversionsokhttp = gettlsversionsokhttp2;
        }
        Credentials.onNavigationEvent(credentials, deprecated_pathVar, gettlsversionsokhttp, null, 0.0f, 12, null);
    }

    private static final void IAuthTabCallback(CookieJarCompanion cookieJarCompanion, int i, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 91;
        onMinimized = i4 % 128;
        int i5 = i4 % 2;
        cookieJarCompanion.onExtraCallback(i, i2);
        if (i5 == 0) {
            int i6 = 22 / 0;
        }
        int i7 = onPostMessage + 51;
        onMinimized = i7 % 128;
        int i8 = i7 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final CookieJarCompanion cookieJarCompanion = (CookieJarCompanion) objArr[0];
        CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7 = (CommonContextMenuAreaKtExternalSyntheticLambda7) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(commonContextMenuAreaKtExternalSyntheticLambda7, "");
        cookieJarCompanion.IAuthTabCallbackStub = commonContextMenuAreaKtExternalSyntheticLambda7;
        Point pointIAuthTabCallbackDefault = cookieJarCompanion.IAuthTabCallbackDefault();
        if (pointIAuthTabCallbackDefault.x > 0) {
            int i2 = onMinimized + 125;
            onPostMessage = i2 % 128;
            int i3 = i2 % 2;
            if (pointIAuthTabCallbackDefault.y <= 0) {
                pointIAuthTabCallbackDefault = null;
            }
        }
        if (pointIAuthTabCallbackDefault == null) {
            return null;
        }
        final int i4 = pointIAuthTabCallbackDefault.x;
        final int i5 = pointIAuthTabCallbackDefault.y;
        commonContextMenuAreaKtExternalSyntheticLambda7.onWarmupCompleted(new Runnable() { // from class: im.toss.tds.graphics.gl.view.ViewRenderableRootLayer$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() throws IOException {
                int i6 = 2 % 2;
                int i7 = onWarmupCompleted + 7;
                IAuthTabCallback = i7 % 128;
                int i8 = i7 % 2;
                CookieJarCompanion.onExtraCallbackWithResult(this.f$0, i4, i5);
                int i9 = onWarmupCompleted + 13;
                IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
            }
        });
        cookieJarCompanion.extraCallback.getViewTreeObserver().addOnPreDrawListener(cookieJarCompanion.writeTypedObject);
        cookieJarCompanion.extraCallback.postInvalidateOnAnimation();
        int i6 = onMinimized + 123;
        onPostMessage = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    public final void onExtraCallback(boolean z) {
        int i = 2 % 2;
        int i2 = onPostMessage + 43;
        onMinimized = i2 % 128;
        int i3 = i2 % 2;
        if (this.onTransact.compareAndSet(false, true)) {
            int i4 = onMinimized + 57;
            onPostMessage = i4 % 128;
            int i5 = i4 % 2;
            onWarmupCompleted();
            if (i5 != 0) {
                throw null;
            }
        }
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        this.asInterface.set(true);
        this.extraCallback.getViewTreeObserver().removeOnPreDrawListener(this.writeTypedObject);
        getTlsVersionsokhttp gettlsversionsokhttp = null;
        try {
            SurfaceTexture surfaceTexture = this.onActivityResized;
            if (surfaceTexture != null) {
                int i2 = onPostMessage;
                int i3 = i2 + 31;
                onMinimized = i3 % 128;
                int i4 = i3 % 2;
                if (surfaceTexture == null) {
                    int i5 = i2 + 121;
                    onMinimized = i5 % 128;
                    if (i5 % 2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        gettlsversionsokhttp.hashCode();
                        throw null;
                    }
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    surfaceTexture = null;
                }
                surfaceTexture.setOnFrameAvailableListener(null, null);
            }
        } catch (Throwable unused) {
        }
        Surface surface = this.IAuthTabCallback_Parcel;
        if (surface != null) {
            if (surface == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    surface = null;
                } catch (Throwable unused2) {
                }
            }
            surface.release();
        }
        SurfaceTexture surfaceTexture2 = this.onActivityResized;
        if (surfaceTexture2 != null) {
            int i6 = onMinimized + 85;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                gettlsversionsokhttp.hashCode();
                throw null;
            }
            if (surfaceTexture2 == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    surfaceTexture2 = null;
                } catch (Throwable unused3) {
                }
            }
            surfaceTexture2.release();
        }
        getTlsVersionsokhttp gettlsversionsokhttp2 = this.onActivityLayout;
        if (gettlsversionsokhttp2 != null) {
            int i7 = onPostMessage + 55;
            onMinimized = i7 % 128;
            int i8 = i7 % 2;
            if (gettlsversionsokhttp2 == null) {
                try {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } catch (Throwable unused4) {
                }
            } else {
                gettlsversionsokhttp = gettlsversionsokhttp2;
            }
            gettlsversionsokhttp.onExtraCallbackWithResult();
            int i9 = onMinimized + 119;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
        }
        if (this.onExtraCallback != null) {
            try {
                IAuthTabCallback().onExtraCallbackWithResult();
            } catch (Throwable unused5) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x01dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onNavigationEvent(Canvas canvas, View view) {
        Drawable drawableOnExtraCallbackWithResult;
        View childAt;
        int iOnNavigationEvent;
        int i = 2 % 2;
        if (view.getVisibility() == 0) {
            int i2 = onPostMessage + 47;
            onMinimized = i2 % 128;
            if (i2 % 2 == 0) {
                view.getWidth();
                throw null;
            }
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return;
            }
            int i3 = onMinimized + 1;
            onPostMessage = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
            if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, view}, 1328239779, -1328239779, iOnNavigationEvent2)).booleanValue()) {
                return;
            }
            int iSave = canvas.save();
            try {
                if (!(view instanceof ViewGroup)) {
                    view.draw(canvas);
                } else if (view == this.extraCallback || IAuthTabCallback(view)) {
                    Drawable background = ((ViewGroup) view).getBackground();
                    if (background != null) {
                        background.setBounds(0, 0, ((ViewGroup) view).getWidth(), ((ViewGroup) view).getHeight());
                        background.draw(canvas);
                    } else if (view == this.extraCallback) {
                        int i5 = onMinimized + 55;
                        onPostMessage = i5 % 128;
                        if (i5 % 2 != 0) {
                            onExtraCallbackWithResult().setBounds(0, 1, ((ViewGroup) view).getWidth(), ((ViewGroup) view).getHeight());
                            drawableOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        } else {
                            onExtraCallbackWithResult().setBounds(0, 0, ((ViewGroup) view).getWidth(), ((ViewGroup) view).getHeight());
                            drawableOnExtraCallbackWithResult = onExtraCallbackWithResult();
                        }
                        drawableOnExtraCallbackWithResult.draw(canvas);
                    }
                    int childCount = ((ViewGroup) view).getChildCount();
                    int i6 = onMinimized + 113;
                    onPostMessage = i6 % 128;
                    int i7 = i6 % 2;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        int i9 = onPostMessage + 25;
                        onMinimized = i9 % 128;
                        if (i9 % 2 == 0) {
                            childAt = ((ViewGroup) view).getChildAt(i8);
                            Intrinsics.checkNotNull(childAt);
                            int iOnNavigationEvent3 = RNSScreenManagerDelegate.onNavigationEvent();
                            int i10 = 36 / 0;
                            if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, childAt}, 1328239779, -1328239779, iOnNavigationEvent3)).booleanValue()) {
                                continue;
                            } else {
                                iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                                if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, childAt}, 560757066, -560757064, iOnNavigationEvent)).booleanValue()) {
                                    int i11 = onMinimized + 69;
                                    onPostMessage = i11 % 128;
                                    int i12 = i11 % 2;
                                    this.access100 = true;
                                }
                                float left = childAt.getLeft();
                                float top = childAt.getTop();
                                iSave = canvas.save();
                                canvas.translate(left, top);
                                onNavigationEvent(canvas, childAt);
                                canvas.restoreToCount(iSave);
                            }
                        } else {
                            childAt = ((ViewGroup) view).getChildAt(i8);
                            Intrinsics.checkNotNull(childAt);
                            int iOnNavigationEvent4 = RNSScreenManagerDelegate.onNavigationEvent();
                            if (!((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, childAt}, 1328239779, -1328239779, iOnNavigationEvent4)).booleanValue()) {
                                iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
                                if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, childAt}, 560757066, -560757064, iOnNavigationEvent)).booleanValue()) {
                                }
                                float left2 = childAt.getLeft();
                                float top2 = childAt.getTop();
                                iSave = canvas.save();
                                canvas.translate(left2, top2);
                                onNavigationEvent(canvas, childAt);
                                canvas.restoreToCount(iSave);
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    int iOnNavigationEvent5 = RNSScreenManagerDelegate.onNavigationEvent();
                    if (((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, view}, 560757066, -560757064, iOnNavigationEvent5)).booleanValue()) {
                        this.access100 = true;
                        int i13 = onPostMessage + 27;
                        onMinimized = i13 % 128;
                        int i14 = i13 % 2;
                    }
                    view.draw(canvas);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[PHI: r1
      0x0048: PHI (r1v5 android.graphics.drawable.Drawable$ConstantState) = (r1v4 android.graphics.drawable.Drawable$ConstantState), (r1v8 android.graphics.drawable.Drawable$ConstantState) binds: [B:18:0x0046, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Drawable onWarmupCompleted(CookieJarCompanion cookieJarCompanion) {
        Drawable.ConstantState constantState;
        Drawable drawableMutate;
        int i = 2 % 2;
        Drawable background = cookieJarCompanion.extraCallback.getBackground();
        if (background == null) {
            View rootView = cookieJarCompanion.extraCallback.getRootView();
            background = rootView != null ? rootView.getBackground() : null;
            if (background == null) {
                int i2 = onPostMessage + 21;
                onMinimized = i2 % 128;
                int i3 = i2 % 2;
                background = cookieJarCompanion.onExtraCallback(cookieJarCompanion.extraCallback);
            }
        }
        if (background != null) {
            int i4 = onPostMessage + 37;
            onMinimized = i4 % 128;
            if (i4 % 2 == 0) {
                constantState = background.getConstantState();
                int i5 = 49 / 0;
                if (constantState != null) {
                    Drawable drawableNewDrawable = constantState.newDrawable();
                    if (drawableNewDrawable != null && (drawableMutate = drawableNewDrawable.mutate()) != null) {
                        int i6 = onMinimized + 15;
                        onPostMessage = i6 % 128;
                        int i7 = i6 % 2;
                        return drawableMutate;
                    }
                }
            } else {
                constantState = background.getConstantState();
                if (constantState != null) {
                }
            }
        }
        return new ColorDrawable(0);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(CookieJarCompanion cookieJarCompanion) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{cookieJarCompanion}, 1059198762, -1059198761, iOnNavigationEvent);
    }

    private final boolean onExtraCallbackWithResult(View view) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        return ((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, view}, 560757066, -560757064, iOnNavigationEvent)).booleanValue();
    }

    private final boolean onWarmupCompleted(View view) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        return ((Boolean) onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, view}, 1328239779, -1328239779, iOnNavigationEvent)).booleanValue();
    }

    public final void onWarmupCompleted(@NotNull CommonContextMenuAreaKtExternalSyntheticLambda7 commonContextMenuAreaKtExternalSyntheticLambda7) {
        int iOnNavigationEvent = RNSScreenManagerDelegate.onNavigationEvent();
        int iOnNavigationEvent2 = RNSScreenManagerDelegate.onNavigationEvent();
        onExtraCallback(RNSScreenManagerDelegate.onNavigationEvent(), iOnNavigationEvent2, RNSScreenManagerDelegate.onNavigationEvent(), new Object[]{this, commonContextMenuAreaKtExternalSyntheticLambda7}, 1830662025, -1830662022, iOnNavigationEvent);
    }
}
