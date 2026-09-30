package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import im.toss.uikit.widget.gl.render.MultiImageMaskRenderer$;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import o.captureProcessErrorStatebugsnag_plugin_android_anr_release;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class captureProcessErrorStatebugsnag_plugin_android_anr_release implements GLSurfaceView.Renderer {
    public static final onExtraCallback Companion;
    private static int ICustomTabsCallbackDefault = 1;
    private static int ICustomTabsCallbackStub = 0;
    private static int onActivityLayout = 1;
    private static int onPostMessage;
    public static final int onWarmupCompleted = 8;
    private final CopyOnWriteArrayList<onWarmupCompleted> IAuthTabCallback;
    private final int[] IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int access000;
    private int access100;
    private int asBinder;
    private volatile boolean asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private int getInterfaceDescriptor;
    private final float[] onActivityResized;
    private final boolean onExtraCallback;
    private final GLSurfaceView onExtraCallbackWithResult;
    private FloatBuffer onMessageChannelReady;
    private int onMinimized;
    private float onNavigationEvent;
    private int onTransact;
    private int readTypedObject;
    private int writeTypedObject;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallback(defaultConstructorMarker);
        int i = ICustomTabsCallbackDefault + 105;
        ICustomTabsCallbackStub = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i14 = i2 + i5 + i6 + (669352129 * i3) + (266941808 * i);
        int i15 = i14 * i14;
        int i16 = (i2 * 1617402437) + 56426783 + (i5 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (1617401855 * i6) + (1244927807 * i3) + ((-404665712) * i) + (i15 * (-45350912));
        if ((720661947 * i2) + 1572077568 + ((-1243901369) * i5) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i6) + ((-1100480512) * i3) + ((-1249902592) * i) + ((-491520000) * i15) + (i16 * i16 * 1565261824) == 1) {
            return onNavigationEvent(objArr);
        }
        captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = (captureProcessErrorStatebugsnag_plugin_android_anr_release) objArr[0];
        List list = (List) objArr[1];
        final Function0 function0 = (Function0) objArr[2];
        int i17 = 2 % 2;
        int i18 = onPostMessage + 19;
        onActivityLayout = i18 % 128;
        int i19 = i18 % 2;
        if (captureprocesserrorstatebugsnag_plugin_android_anr_release.asInterface) {
            int i20 = onActivityLayout + 83;
            onPostMessage = i20 % 128;
            if (i20 % 2 != 0) {
                GLES20.glDeleteTextures(captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback.size(), captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallbackDefault, 1);
            } else {
                GLES20.glDeleteTextures(captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback.size(), captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallbackDefault, 0);
            }
        }
        captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback.clear();
        CopyOnWriteArrayList<onWarmupCompleted> copyOnWriteArrayList = captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (((Bitmap) onWarmupCompleted.IAuthTabCallback(431635558, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, new Object[]{(onWarmupCompleted) obj}, -431635558)) != null) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
        captureprocesserrorstatebugsnag_plugin_android_anr_release.asInterface = false;
        int size = captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback.size();
        GLES20.glGenTextures(size, captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallbackDefault, 0);
        for (int i21 = 0; i21 < size; i21++) {
            int i22 = onPostMessage + 45;
            onActivityLayout = i22 % 128;
            int i23 = i22 % 2;
            onWarmupCompleted onwarmupcompleted = captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallback.get(i21);
            GLES20.glBindTexture(3553, captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallbackDefault[i21]);
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback4 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            GLUtils.texImage2D(3553, 0, (Bitmap) onWarmupCompleted.IAuthTabCallback(431635558, iOnExtraCallback3, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback4, new Object[]{onwarmupcompleted}, -431635558), 0);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindTexture(3553, 0);
        }
        captureprocesserrorstatebugsnag_plugin_android_anr_release.asInterface = true;
        captureprocesserrorstatebugsnag_plugin_android_anr_release.onExtraCallbackWithResult.post(new Runnable() { // from class: im.toss.uikit.widget.gl.render.MultiImageMaskRenderer$$ExternalSyntheticLambda2
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i24 = 2 % 2;
                int i25 = onExtraCallbackWithResult + 31;
                IAuthTabCallback = i25 % 128;
                int i26 = i25 % 2;
                captureProcessErrorStatebugsnag_plugin_android_anr_release.onNavigationEvent(function0);
                if (i26 != 0) {
                    int i27 = 74 / 0;
                }
            }
        });
        return null;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 51;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(captureprocesserrorstatebugsnag_plugin_android_anr_release);
        int i4 = onPostMessage + 27;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function0 function0) {
        int i = 2 % 2;
        int i2 = onPostMessage + 119;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(function0);
        int i4 = onActivityLayout + 87;
        onPostMessage = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    public static /* synthetic */ Unit onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = onPostMessage + 59;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted6 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        Unit unit = (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -168773934, iOnWarmupCompleted6, iOnWarmupCompleted4, 168773935, new Object[0], iOnWarmupCompleted5);
        int i3 = onActivityLayout + 25;
        onPostMessage = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
        return unit;
    }

    public static /* synthetic */ void onWarmupCompleted(captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release, List list, Function0 function0) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 75;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
            IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 572913551, iOnWarmupCompleted3, iOnWarmupCompleted, -572913551, new Object[]{captureprocesserrorstatebugsnag_plugin_android_anr_release, list, function0}, iOnWarmupCompleted2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iOnWarmupCompleted4 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted5 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted6 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 572913551, iOnWarmupCompleted6, iOnWarmupCompleted4, -572913551, new Object[]{captureprocesserrorstatebugsnag_plugin_android_anr_release, list, function0}, iOnWarmupCompleted5);
        int i3 = onActivityLayout + 119;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
    }

    public captureProcessErrorStatebugsnag_plugin_android_anr_release(@NotNull GLSurfaceView gLSurfaceView, boolean z) {
        Intrinsics.checkNotNullParameter(gLSurfaceView, "");
        this.onExtraCallbackWithResult = gLSurfaceView;
        this.onExtraCallback = z;
        this.IAuthTabCallbackStub = 1;
        this.onTransact = 1;
        this.readTypedObject = -1;
        this.extraCallbackWithResult = -1;
        this.access100 = -1;
        this.IAuthTabCallback_Parcel = -1;
        this.getInterfaceDescriptor = -1;
        this.writeTypedObject = -1;
        this.access000 = -1;
        this.extraCallback = -1;
        this.IAuthTabCallbackStubProxy = -1;
        this.IAuthTabCallbackDefault = new int[10];
        this.IAuthTabCallback = new CopyOnWriteArrayList<>();
        this.onActivityResized = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class onExtraCallbackWithResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ onExtraCallbackWithResult[] $VALUES;
        private static int onExtraCallback = 1;
        private static int onExtraCallbackWithResult = 0;
        private static int onNavigationEvent = 0;
        private static int onWarmupCompleted = 1;
        public static final onExtraCallbackWithResult ID_CARD = new onExtraCallbackWithResult("ID_CARD", 0);
        public static final onExtraCallbackWithResult HOLOGRAM_FILL = new onExtraCallbackWithResult("HOLOGRAM_FILL", 1);
        public static final onExtraCallbackWithResult HOLOGRAM_STROKE = new onExtraCallbackWithResult("HOLOGRAM_STROKE", 2);
        public static final onExtraCallbackWithResult MASK_CARD = new onExtraCallbackWithResult("MASK_CARD", 3);
        public static final onExtraCallbackWithResult MASK_RADAR = new onExtraCallbackWithResult("MASK_RADAR", 4);

        private static final /* synthetic */ onExtraCallbackWithResult[] $values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent;
            int i3 = i2 + 29;
            onExtraCallback = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = {ID_CARD, HOLOGRAM_FILL, HOLOGRAM_STROKE, MASK_CARD, MASK_RADAR};
            int i5 = i2 + 71;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
            return onextracallbackwithresultArr;
        }

        public static EnumEntries<onExtraCallbackWithResult> getEntries() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 75;
            int i3 = i2 % 128;
            onExtraCallback = i3;
            int i4 = i2 % 2;
            EnumEntries<onExtraCallbackWithResult> enumEntries = $ENTRIES;
            int i5 = i3 + 71;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                return enumEntries;
            }
            throw null;
        }

        public static onExtraCallbackWithResult valueOf(String str) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 103;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) Enum.valueOf(onExtraCallbackWithResult.class, str);
            if (i3 != 0) {
                return onextracallbackwithresult;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static onExtraCallbackWithResult[] values() {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 73;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onExtraCallbackWithResult[] onextracallbackwithresultArr = (onExtraCallbackWithResult[]) $VALUES.clone();
            int i4 = onNavigationEvent + 97;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                return onextracallbackwithresultArr;
            }
            throw null;
        }

        private onExtraCallbackWithResult(String str, int i) {
        }

        static {
            onExtraCallbackWithResult[] onextracallbackwithresultArr$values = $values();
            $VALUES = onextracallbackwithresultArr$values;
            $ENTRIES = access15300.onExtraCallbackWithResult(onextracallbackwithresultArr$values);
            int i = onWarmupCompleted + 33;
            onExtraCallbackWithResult = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 33;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        int i4 = onActivityLayout + 15;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        int i = 2 % 2;
        int i2 = onPostMessage + 115;
        onActivityLayout = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 83 / 0;
            if (!this.IAuthTabCallback.isEmpty()) {
                onExtraCallbackWithResult(this.IAuthTabCallback, (Function0<Unit>) new MultiImageMaskRenderer$.ExternalSyntheticLambda3());
                int i4 = onPostMessage + 37;
                onActivityLayout = i4 % 128;
                int i5 = i4 % 2;
            }
        } else if (!this.IAuthTabCallback.isEmpty()) {
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        Context context = this.onExtraCallbackWithResult.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.asBinder = onwarmupcompleted.onExtraCallback(context, "raw/m_vertex_shader.glsl", "raw/m_fragment_shader.glsl");
        onExtraCallbackWithResult();
        GLES20.glGenTextures(10, this.IAuthTabCallbackDefault, 0);
        GLES20.glUseProgram(this.asBinder);
        this.readTypedObject = GLES20.glGetUniformLocation(this.asBinder, "uTargetCenter");
        this.extraCallbackWithResult = GLES20.glGetUniformLocation(this.asBinder, "uTargetSize");
        this.access100 = GLES20.glGetUniformLocation(this.asBinder, "uMaskCenter");
        this.IAuthTabCallback_Parcel = GLES20.glGetUniformLocation(this.asBinder, "uMaskSize");
        this.getInterfaceDescriptor = GLES20.glGetUniformLocation(this.asBinder, "uAlpha");
        this.writeTypedObject = GLES20.glGetUniformLocation(this.asBinder, "uTargetTexture");
        this.access000 = GLES20.glGetUniformLocation(this.asBinder, "uMaskTexture");
        this.extraCallback = GLES20.glGetUniformLocation(this.asBinder, "uTexAspect");
        this.IAuthTabCallbackStubProxy = GLES20.glGetUniformLocation(this.asBinder, "uCornerRadius");
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.asBinder, "uNightMode"), this.onExtraCallback ? 1 : 0);
        GLES20.glUseProgram(0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onPostMessage + 73;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            this.IAuthTabCallbackStub = i;
            this.onTransact = i2;
            GLES20.glViewport(0, 1, i, i2);
        } else {
            this.IAuthTabCallbackStub = i;
            this.onTransact = i2;
            GLES20.glViewport(0, 0, i, i2);
        }
        int i5 = onActivityLayout + 119;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@Nullable GL10 gl10) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 23;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        if (!this.asInterface || this.IAuthTabCallback.size() < 2) {
            return;
        }
        GLES20.glUseProgram(this.asBinder);
        GLES30.glBindVertexArray(this.ICustomTabsCallback);
        int size = this.IAuthTabCallback.size() - 1;
        onWarmupCompleted onwarmupcompleted = this.IAuthTabCallback.get(size);
        float[] fArr = {((onwarmupcompleted.IAuthTabCallback() / this.IAuthTabCallbackStub) * 2.0f) - 1.0f, (1.0f - ((onwarmupcompleted.onWarmupCompleted() / this.onTransact) * 2.0f)) - ((onwarmupcompleted.asBinder() / this.onTransact) * 2.0f)};
        float[] fArr2 = {((onwarmupcompleted.IAuthTabCallbackStub() * onwarmupcompleted.asInterface()) / this.IAuthTabCallbackStub) * 2.0f, ((onwarmupcompleted.IAuthTabCallbackDefault() * onwarmupcompleted.asInterface()) / this.onTransact) * 2.0f};
        float fOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = onActivityLayout + 9;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            onWarmupCompleted onwarmupcompleted2 = this.IAuthTabCallback.get(i4);
            float[] fArr3 = {((onwarmupcompleted2.IAuthTabCallback() / this.IAuthTabCallbackStub) * 2.0f) - 1.0f, (1.0f - ((onwarmupcompleted2.onWarmupCompleted() / this.onTransact) * 2.0f)) - ((onwarmupcompleted2.asBinder() / this.onTransact) * 2.0f)};
            float[] fArr4 = {((onwarmupcompleted2.IAuthTabCallbackStub() * onwarmupcompleted2.asInterface()) / this.IAuthTabCallbackStub) * 2.0f, ((onwarmupcompleted2.IAuthTabCallbackDefault() * onwarmupcompleted2.asInterface()) / this.onTransact) * 2.0f};
            GLES20.glUniform2fv(this.readTypedObject, 1, fArr3, 0);
            GLES20.glUniform2fv(this.extraCallbackWithResult, 1, fArr4, 0);
            GLES20.glUniform2fv(this.access100, 1, fArr, 0);
            GLES20.glUniform2fv(this.IAuthTabCallback_Parcel, 1, fArr2, 0);
            GLES20.glUniform1f(this.getInterfaceDescriptor, onwarmupcompleted2.onNavigationEvent() * fOnNavigationEvent);
            GLES20.glUniform1f(this.extraCallback, onwarmupcompleted2.IAuthTabCallbackDefault() / onwarmupcompleted2.IAuthTabCallbackStub());
            GLES20.glUniform1f(this.IAuthTabCallbackStubProxy, this.onNavigationEvent);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.IAuthTabCallbackDefault[i4]);
            GLES20.glUniform1i(this.writeTypedObject, 0);
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.IAuthTabCallbackDefault[size]);
            GLES20.glUniform1i(this.access000, 1);
            GLES20.glDrawArrays(5, 0, 4);
        }
        GLES30.glBindVertexArray(0);
        GLES20.glUseProgram(0);
        int i7 = onActivityLayout + 17;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
    }

    private static final void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = onPostMessage + 83;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        int i4 = onPostMessage + 123;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull final List<onWarmupCompleted> list, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.onExtraCallbackWithResult.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.MultiImageMaskRenderer$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 95;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release = this.f$0;
                if (i4 == 0) {
                    captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(captureprocesserrorstatebugsnag_plugin_android_anr_release, list, function0);
                    return;
                }
                captureProcessErrorStatebugsnag_plugin_android_anr_release.onWarmupCompleted(captureprocesserrorstatebugsnag_plugin_android_anr_release, list, function0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onExtraCallbackWithResult.requestRender();
        int i2 = onActivityLayout + 61;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 64 / 0;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull onExtraCallbackWithResult onextracallbackwithresult, float f) {
        Iterator it;
        Object next;
        int i = 2 % 2;
        int i2 = onActivityLayout + 103;
        onPostMessage = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            it = this.IAuthTabCallback.iterator();
            int i3 = 41 / 0;
        } else {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            it = this.IAuthTabCallback.iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i4 = onPostMessage + 85;
            onActivityLayout = i4 % 128;
            int i5 = i4 % 2;
            next = it.next();
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (((onExtraCallbackWithResult) onWarmupCompleted.IAuthTabCallback(609461407, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{(onWarmupCompleted) next}, -609461406)) == onextracallbackwithresult) {
                int i6 = onActivityLayout + 57;
                onPostMessage = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) next;
        if (onwarmupcompleted != null) {
            onwarmupcompleted.onExtraCallback(f);
            this.onExtraCallbackWithResult.requestRender();
        }
    }

    public final void onNavigationEvent(@NotNull onExtraCallbackWithResult onextracallbackwithresult, float f) {
        int i = 2 % 2;
        int i2 = onActivityLayout + 83;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        Iterator<onWarmupCompleted> it = this.IAuthTabCallback.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            int i5 = onActivityLayout + 71;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = {it.next()};
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            if (((onExtraCallbackWithResult) onWarmupCompleted.IAuthTabCallback(609461407, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback2, objArr, -609461406)) == onextracallbackwithresult) {
                break;
            }
            i4++;
            int i7 = onActivityLayout + 19;
            onPostMessage = i7 % 128;
            int i8 = i7 % 2;
        }
        Integer numValueOf = Integer.valueOf(i4);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i9 = onActivityLayout + 1;
            onPostMessage = i9 % 128;
            int i10 = i9 % 2;
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onWarmupCompleted> copyOnWriteArrayList = this.IAuthTabCallback;
            onWarmupCompleted onwarmupcompleted = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onwarmupcompleted, "");
            copyOnWriteArrayList.set(iIntValue, onWarmupCompleted.onExtraCallback(onwarmupcompleted, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, null, 1983, null));
            this.onExtraCallbackWithResult.requestRender();
        }
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.onActivityResized.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.onActivityResized);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "");
        this.onMessageChannelReady = floatBufferAsFloatBuffer;
        int[] iArr = new int[2];
        GLES30.glGenVertexArrays(1, iArr, 0);
        GLES20.glGenBuffers(1, iArr, 1);
        int i4 = iArr[0];
        this.ICustomTabsCallback = i4;
        this.onMinimized = iArr[1];
        GLES30.glBindVertexArray(i4);
        GLES20.glBindBuffer(34962, this.onMinimized);
        int length = this.onActivityResized.length;
        FloatBuffer floatBuffer = this.onMessageChannelReady;
        if (floatBuffer == null) {
            int i5 = onActivityLayout + 53;
            onPostMessage = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            floatBuffer = null;
        }
        GLES20.glBufferData(34962, length << 2, floatBuffer, 35044);
        GLES20.glUseProgram(this.asBinder);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.asBinder, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.asBinder, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 20, 12);
        GLES20.glBindBuffer(34962, 0);
        GLES30.glBindVertexArray(0);
        GLES20.glUseProgram(0);
    }

    public final void IAuthTabCallback() {
        int i = 2 % 2;
        this.onExtraCallbackWithResult.queueEvent(new MultiImageMaskRenderer$.ExternalSyntheticLambda1(this));
        int i2 = onActivityLayout + 63;
        onPostMessage = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void onWarmupCompleted(captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = onPostMessage + 85;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = captureprocesserrorstatebugsnag_plugin_android_anr_release.IAuthTabCallbackDefault;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
        GLES20.glDeleteBuffers(1, new int[]{captureprocesserrorstatebugsnag_plugin_android_anr_release.onMinimized}, 0);
        GLES30.glDeleteVertexArrays(1, new int[]{captureprocesserrorstatebugsnag_plugin_android_anr_release.ICustomTabsCallback}, 0);
        GLES20.glDeleteProgram(captureprocesserrorstatebugsnag_plugin_android_anr_release.asBinder);
        int i4 = onPostMessage + 97;
        onActivityLayout = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onExtraCallbackWithResult(float f) {
        int i = 2 % 2;
        int i2 = onPostMessage + 87;
        onActivityLayout = i2 % 128;
        int i3 = i2 % 2;
        this.onNavigationEvent = f;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallbackStubProxy = 1;
        private static int getInterfaceDescriptor;
        private float IAuthTabCallback;
        private float IAuthTabCallbackDefault;
        private float IAuthTabCallbackStub;
        private final float IAuthTabCallback_Parcel;
        private float asBinder;
        private final float asInterface;
        private final Bitmap onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final onExtraCallbackWithResult onNavigationEvent;
        private float onTransact;
        private final float onWarmupCompleted;

        public static /* synthetic */ Object IAuthTabCallback(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~((~i6) | i);
            int i8 = ~i2;
            int i9 = i7 | (~(i8 | i));
            int i10 = ~i;
            int i11 = ~(i10 | i8);
            int i12 = ~(i10 | i6);
            int i13 = (~(i8 | i6)) | i11 | i12;
            int i14 = (~(i2 | i10)) | i12;
            int i15 = i6 + i + i5 + (1039959776 * i4) + ((-2046201414) * i3);
            int i16 = i15 * i15;
            int i17 = ((357140864 * i6) - 8388608) + ((-1785926397) * i) + ((-2146011519) * i9) + (i13 * 2146011519) + (2146011519 * i14) + ((-1788870656) * i5) + ((-201326592) * i4) + ((-406847488) * i3) + (529399808 * i16);
            int i18 = ((i6 * 868240256) - 1765242424) + (i * 868238279) + (i9 * (-659)) + (i13 * 659) + (i14 * 659) + (i5 * 868239597) + (i4 * 817356128) + (i3 * 406493490) + (i16 * 645267456);
            if (i17 + (i18 * i18 * 681705472) != 1) {
                return onExtraCallback(objArr);
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            int i19 = 2 % 2;
            int i20 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGBA_YVYU;
            int i21 = i20 % 128;
            IAuthTabCallbackStubProxy = i21;
            int i22 = i20 % 2;
            onExtraCallbackWithResult onextracallbackwithresult = onwarmupcompleted.onNavigationEvent;
            int i23 = i21 + 113;
            getInterfaceDescriptor = i23 % 128;
            int i24 = i23 % 2;
            return onextracallbackwithresult;
        }

        public static /* synthetic */ onWarmupCompleted onExtraCallback(onWarmupCompleted onwarmupcompleted, Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, onExtraCallbackWithResult onextracallbackwithresult, int i, Object obj) {
            float f10;
            float f11;
            float f12;
            float f13;
            onExtraCallbackWithResult onextracallbackwithresult2;
            int i2 = 2 % 2;
            Bitmap bitmap2 = (i & 1) != 0 ? onwarmupcompleted.onExtraCallback : bitmap;
            if ((i & 2) != 0) {
                int i3 = IAuthTabCallbackStubProxy + 35;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 != 0) {
                    float f14 = onwarmupcompleted.IAuthTabCallback_Parcel;
                    throw null;
                }
                f10 = onwarmupcompleted.IAuthTabCallback_Parcel;
            } else {
                f10 = f;
            }
            float f15 = (i & 4) != 0 ? onwarmupcompleted.asInterface : f2;
            float f16 = (i & 8) != 0 ? onwarmupcompleted.asBinder : f3;
            float f17 = (i & 16) != 0 ? onwarmupcompleted.onWarmupCompleted : f4;
            if ((i & 32) != 0) {
                f11 = onwarmupcompleted.onExtraCallbackWithResult;
                int i4 = IAuthTabCallbackStubProxy + 9;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                f11 = f5;
            }
            if ((i & 64) != 0) {
                int i6 = IAuthTabCallbackStubProxy + 95;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                f12 = onwarmupcompleted.IAuthTabCallbackStub;
            } else {
                f12 = f6;
            }
            float f18 = (i & 128) != 0 ? onwarmupcompleted.IAuthTabCallback : f7;
            if ((i & 256) != 0) {
                int i8 = getInterfaceDescriptor + 41;
                IAuthTabCallbackStubProxy = i8 % 128;
                int i9 = i8 % 2;
                f13 = onwarmupcompleted.IAuthTabCallbackDefault;
            } else {
                f13 = f8;
            }
            float f19 = (i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0 ? onwarmupcompleted.onTransact : f9;
            if ((i & 1024) != 0) {
                int i10 = IAuthTabCallbackStubProxy + 7;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
                onextracallbackwithresult2 = onwarmupcompleted.onNavigationEvent;
            } else {
                onextracallbackwithresult2 = onextracallbackwithresult;
            }
            return onwarmupcompleted.onExtraCallbackWithResult(bitmap2, f10, f15, f16, f17, f11, f12, f18, f13, f19, onextracallbackwithresult2);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onWarmupCompleted)) {
                int i2 = getInterfaceDescriptor;
                int i3 = i2 + 61;
                IAuthTabCallbackStubProxy = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 55;
                IAuthTabCallbackStubProxy = i5 % 128;
                int i6 = i5 % 2;
                return false;
            }
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) obj;
            if (!Intrinsics.areEqual(this.onExtraCallback, onwarmupcompleted.onExtraCallback) || Float.compare(this.IAuthTabCallback_Parcel, onwarmupcompleted.IAuthTabCallback_Parcel) != 0) {
                return false;
            }
            if (Float.compare(this.asInterface, onwarmupcompleted.asInterface) != 0) {
                int i7 = getInterfaceDescriptor + 109;
                IAuthTabCallbackStubProxy = i7 % 128;
                int i8 = i7 % 2;
                return false;
            }
            if (Float.compare(this.asBinder, onwarmupcompleted.asBinder) != 0) {
                return false;
            }
            if (Float.compare(this.onWarmupCompleted, onwarmupcompleted.onWarmupCompleted) != 0) {
                int i9 = getInterfaceDescriptor + 103;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                return false;
            }
            if (Float.compare(this.onExtraCallbackWithResult, onwarmupcompleted.onExtraCallbackWithResult) != 0) {
                int i11 = IAuthTabCallbackStubProxy + 89;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackStub, onwarmupcompleted.IAuthTabCallbackStub) != 0) {
                int i13 = getInterfaceDescriptor + 13;
                IAuthTabCallbackStubProxy = i13 % 128;
                return i13 % 2 == 0;
            }
            if (Float.compare(this.IAuthTabCallback, onwarmupcompleted.IAuthTabCallback) != 0) {
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackDefault, onwarmupcompleted.IAuthTabCallbackDefault) != 0) {
                int i14 = IAuthTabCallbackStubProxy + 21;
                getInterfaceDescriptor = i14 % 128;
                return i14 % 2 != 0;
            }
            if (Float.compare(this.onTransact, onwarmupcompleted.onTransact) == 0) {
                return this.onNavigationEvent == onwarmupcompleted.onNavigationEvent;
            }
            int i15 = getInterfaceDescriptor + 15;
            IAuthTabCallbackStubProxy = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 65;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = this.onExtraCallback;
            if (bitmap == null) {
                int i5 = i2 + 55;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = bitmap.hashCode();
            }
            return (((((((((((((((((((iHashCode * 31) + Float.hashCode(this.IAuthTabCallback_Parcel)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.asBinder)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + Float.hashCode(this.onTransact)) * 31) + this.onNavigationEvent.hashCode();
        }

        public final onWarmupCompleted onExtraCallbackWithResult(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(bitmap, f, f2, f3, f4, f5, f6, f7, f8, f9, onextracallbackwithresult);
            int i2 = getInterfaceDescriptor + 81;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
            }
            return onwarmupcompleted;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BitmapData(bitmap=" + this.onExtraCallback + ", width=" + this.IAuthTabCallback_Parcel + ", height=" + this.asInterface + ", scale=" + this.asBinder + ", centerX=" + this.onWarmupCompleted + ", centerY=" + this.onExtraCallbackWithResult + ", translationY=" + this.IAuthTabCallbackStub + ", alpha=" + this.IAuthTabCallback + ", radius=" + this.IAuthTabCallbackDefault + ", saturation=" + this.onTransact + ", drawableType=" + this.onNavigationEvent + ")";
            int i2 = getInterfaceDescriptor + 35;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onWarmupCompleted(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NotNull onExtraCallbackWithResult onextracallbackwithresult) {
            Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
            this.onExtraCallback = bitmap;
            this.IAuthTabCallback_Parcel = f;
            this.asInterface = f2;
            this.asBinder = f3;
            this.onWarmupCompleted = f4;
            this.onExtraCallbackWithResult = f5;
            this.IAuthTabCallbackStub = f6;
            this.IAuthTabCallback = f7;
            this.IAuthTabCallbackDefault = f8;
            this.onTransact = f9;
            this.onNavigationEvent = onextracallbackwithresult;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onWarmupCompleted(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, onExtraCallbackWithResult onextracallbackwithresult, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            if ((i & 8) != 0) {
                int i2 = getInterfaceDescriptor + 59;
                IAuthTabCallbackStubProxy = i2 % 128;
                int i3 = i2 % 2;
                f10 = 1.0f;
            } else {
                f10 = f3;
            }
            if ((i & 16) != 0) {
                int i4 = IAuthTabCallbackStubProxy + 51;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
                f11 = 0.0f;
            } else {
                f11 = f4;
            }
            if ((i & 32) != 0) {
                int i7 = IAuthTabCallbackStubProxy + 1;
                getInterfaceDescriptor = i7 % 128;
                f12 = i7 % 2 != 0 ? 2.0f : 0.0f;
            } else {
                f12 = f5;
            }
            if ((i & 64) != 0) {
                int i8 = IAuthTabCallbackStubProxy + 115;
                getInterfaceDescriptor = i8 % 128;
                f13 = i8 % 2 != 0 ? 1.0f : 0.0f;
            } else {
                f13 = f6;
            }
            if ((i & 128) != 0) {
                int i9 = getInterfaceDescriptor + 39;
                IAuthTabCallbackStubProxy = i9 % 128;
                int i10 = i9 % 2;
                f14 = 1.0f;
            } else {
                f14 = f7;
            }
            float f16 = (i & 256) != 0 ? 0.0f : f8;
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                int i11 = getInterfaceDescriptor + 1;
                IAuthTabCallbackStubProxy = i11 % 128;
                int i12 = i11 % 2;
                int i13 = 2 % 2;
                f15 = 1.0f;
            } else {
                f15 = f9;
            }
            this(bitmap, f, f2, f10, f11, f12, f13, f14, f16, f15, onextracallbackwithresult);
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onWarmupCompleted onwarmupcompleted = (onWarmupCompleted) objArr[0];
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 27;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            int i4 = i2 % 2;
            Bitmap bitmap = onwarmupcompleted.onExtraCallback;
            int i5 = i3 + 95;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return bitmap;
            }
            throw null;
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 87;
            IAuthTabCallbackStubProxy = i2 % 128;
            if (i2 % 2 != 0) {
                return this.IAuthTabCallback_Parcel;
            }
            throw null;
        }

        public final float IAuthTabCallbackDefault() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 123;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            float f = this.asInterface;
            int i5 = i2 + 51;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 35;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            if (i2 % 2 == 0) {
                throw null;
            }
            float f = this.asBinder;
            int i4 = i3 + 37;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 81;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onWarmupCompleted;
            int i5 = i2 + Imgproc.COLOR_YUV2RGBA_YVYU;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 25;
            int i3 = i2 % 128;
            IAuthTabCallbackStubProxy = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            float f = this.onExtraCallbackWithResult;
            int i4 = i3 + 19;
            getInterfaceDescriptor = i4 % 128;
            if (i4 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy;
            int i3 = i2 + 55;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i2 + 33;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final void onExtraCallback(float f) {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackStubProxy + 113;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            this.IAuthTabCallback = f;
            if (i4 != 0) {
                throw null;
            }
            int i5 = i3 + 59;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 18 / 0;
            }
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 111;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 11;
            IAuthTabCallbackStubProxy = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final Bitmap onExtraCallback() {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (Bitmap) IAuthTabCallback(431635558, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, -431635558);
        }

        public final onExtraCallbackWithResult onExtraCallbackWithResult() {
            int iOnExtraCallback = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback2 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            int iOnExtraCallback3 = CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback();
            return (onExtraCallbackWithResult) IAuthTabCallback(609461407, iOnExtraCallback, CredentialProviderGetSignInIntentControllerhandleResponse6ExternalSyntheticLambda0.onExtraCallback(), iOnExtraCallback3, iOnExtraCallback2, new Object[]{this}, -609461406);
        }
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static final Unit onExtraCallback() {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        return (Unit) IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), -168773934, iOnWarmupCompleted3, iOnWarmupCompleted, 168773935, new Object[0], iOnWarmupCompleted2);
    }

    private static final void onExtraCallbackWithResult(captureProcessErrorStatebugsnag_plugin_android_anr_release captureprocesserrorstatebugsnag_plugin_android_anr_release, List list, Function0 function0) {
        int iOnWarmupCompleted = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted2 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        int iOnWarmupCompleted3 = GriverCommonAbilityProxyImpl.onWarmupCompleted();
        IAuthTabCallback(GriverCommonAbilityProxyImpl.onWarmupCompleted(), 572913551, iOnWarmupCompleted3, iOnWarmupCompleted, -572913551, new Object[]{captureprocesserrorstatebugsnag_plugin_android_anr_release, list, function0}, iOnWarmupCompleted2);
    }
}
