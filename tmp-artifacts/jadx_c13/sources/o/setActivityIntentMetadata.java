package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import im.toss.tds.compose.component.compound.bottomcta.TdsBottomCtaV1Kt$;
import im.toss.uikit.widget.gl.render.AuthBitmapsRenderer$;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import o.setActivityIntentMetadata;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class setActivityIntentMetadata implements GLSurfaceView.Renderer {
    public static final onExtraCallbackWithResult Companion;
    private static int newSessionWithExtras = 0;
    public static final int onExtraCallbackWithResult = 8;
    private static int prefetch = 1;
    private static int receiveFile = 1;
    private static int requestPostMessageChannelWithExtras;
    private float IAuthTabCallback;
    private boolean IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private int ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private int ICustomTabsService;
    private int access000;
    private volatile boolean access100;
    private float asBinder;
    private final GLSurfaceView asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private int extraCommand;
    private final int[] getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private int mayLaunchUrl;
    private final float[] newAuthTabSession;
    private FloatBuffer newSession;
    private int onActivityLayout;
    private int onActivityResized;
    private float onExtraCallback;
    private int onMessageChannelReady;
    private int onMinimized;
    private Integer onNavigationEvent;
    private int onPostMessage;
    private int onRelationshipValidationResult;
    private final CopyOnWriteArrayList<onExtraCallback> onTransact;
    private int onUnminimized;
    private final Lazy onWarmupCompleted;
    private int postMessage;
    private int readTypedObject;
    private int writeTypedObject;

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new onExtraCallbackWithResult(defaultConstructorMarker);
        int i = requestPostMessageChannelWithExtras + 85;
        receiveFile = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~i2;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i4 | i2);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i2)) | (~(i7 | i9)) | (~(i9 | i2));
        int i14 = i2 + i6 + i + (669352129 * i3) + (266941808 * i5);
        int i15 = i14 * i14;
        int i16 = (720661947 * i2) + 1572077568 + ((-1243901369) * i6) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i) + ((-1100480512) * i3) + ((-1249902592) * i5) + ((-491520000) * i15);
        int i17 = (i2 * 1617402437) + 56426783 + (i6 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i * 1617401855) + (i3 * 1244927807) + (i5 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        return i18 != 1 ? i18 != 2 ? onWarmupCompleted(objArr) : onExtraCallback(objArr) : onExtraCallbackWithResult(objArr);
    }

    public static /* synthetic */ void onExtraCallbackWithResult(setActivityIntentMetadata setactivityintentmetadata) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 85;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallback(setactivityintentmetadata);
        if (i3 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(setActivityIntentMetadata setactivityintentmetadata, List list) {
        int i = 2 % 2;
        int i2 = prefetch + 41;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallbackWithResult(setactivityintentmetadata, list);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ int onWarmupCompleted(setActivityIntentMetadata setactivityintentmetadata) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 97;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(setactivityintentmetadata);
        int i4 = prefetch + 15;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
        return iOnNavigationEvent;
    }

    public setActivityIntentMetadata(@NotNull GLSurfaceView gLSurfaceView, boolean z) {
        Intrinsics.checkNotNullParameter(gLSurfaceView, "");
        this.asInterface = gLSurfaceView;
        this.IAuthTabCallbackStub = z;
        this.access000 = 1;
        this.IAuthTabCallbackStubProxy = 1;
        this.onUnminimized = -1;
        this.mayLaunchUrl = -1;
        this.ICustomTabsService = -1;
        this.isEngagementSignalsApiAvailable = -1;
        this.ICustomTabsCallback_Parcel = -1;
        this.onRelationshipValidationResult = -1;
        this.onPostMessage = -1;
        this.ICustomTabsCallbackStub = -1;
        this.onMinimized = -1;
        this.ICustomTabsCallbackDefault = -1;
        this.readTypedObject = -1;
        this.onMessageChannelReady = -1;
        this.ICustomTabsCallbackStubProxy = -1;
        this.extraCallbackWithResult = -1;
        this.extraCallback = -1;
        this.onActivityLayout = -1;
        this.writeTypedObject = -1;
        this.ICustomTabsCallback = -1;
        this.onActivityResized = -1;
        this.getInterfaceDescriptor = new int[5];
        this.onTransact = new CopyOnWriteArrayList<>();
        this.newAuthTabSession = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
        this.onWarmupCompleted = LazyKt__LazyJVMKt.lazy(new AuthBitmapsRenderer$.ExternalSyntheticLambda0(this));
    }

    public final void onExtraCallbackWithResult(boolean z) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 19;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        this.IAuthTabCallbackDefault = z;
        int i5 = i2 + 15;
        newSessionWithExtras = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void IAuthTabCallback(float f) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + Imgproc.COLOR_YUV2RGB_YVYU;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        this.onExtraCallback = f;
        if (i3 == 0) {
            int i4 = 24 / 0;
        }
    }

    private final int onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = prefetch + 49;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int iIntValue = ((Number) this.onWarmupCompleted.getValue()).intValue();
        int i4 = prefetch + 77;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iIntValue;
    }

    private static final int onNavigationEvent(setActivityIntentMetadata setactivityintentmetadata) {
        int i = 2 % 2;
        Context context = setactivityintentmetadata.asInterface.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        Configuration configuration = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "");
        int iOnWarmupCompleted = new getDEFAULT_CONNECTION_SPECSokhttp(new onWarmupCompleted(configuration)).onWarmupCompleted();
        int i2 = prefetch + 107;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            return iOnWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Integer num) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 101;
        int i3 = i2 % 128;
        prefetch = i3;
        int i4 = i2 % 2;
        this.onNavigationEvent = num;
        int i5 = i3 + 77;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 37;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        if (!this.onTransact.isEmpty()) {
            Object[] objArr = {this, this.onTransact};
            onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1238507485, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1238507485, objArr);
            int i4 = prefetch + 73;
            newSessionWithExtras = i4 % 128;
            int i5 = i4 % 2;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        Context context = this.asInterface.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.IAuthTabCallback_Parcel = onwarmupcompleted.onExtraCallback(context, "raw/bitmaps_vertex_shader.glsl", "raw/bitmaps_fragment_shader.glsl");
        onExtraCallbackWithResult();
        GLES20.glGenTextures(5, this.getInterfaceDescriptor, 0);
        GLES20.glUseProgram(this.IAuthTabCallback_Parcel);
        this.extraCallbackWithResult = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAppImageTypes");
        this.onUnminimized = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexture0");
        this.mayLaunchUrl = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexture1");
        this.ICustomTabsService = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexture2");
        this.isEngagementSignalsApiAvailable = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexture3");
        this.ICustomTabsCallback_Parcel = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexture4");
        this.onPostMessage = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uCornerRadius");
        this.ICustomTabsCallbackStub = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uInstanceCount");
        this.onMinimized = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uCenter");
        this.ICustomTabsCallbackDefault = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uSize");
        this.readTypedObject = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAlpha");
        this.ICustomTabsCallbackStubProxy = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uSaturation");
        this.onMessageChannelReady = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uBackgroundColor");
        this.onRelationshipValidationResult = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uTexAspect");
        this.extraCallback = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAppbarRect");
        this.onActivityLayout = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAppbarZoneFill");
        this.writeTypedObject = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAppbarZoneColor");
        this.ICustomTabsCallback = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uAppbarRatio");
        this.onActivityResized = GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uClearAppbar");
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.IAuthTabCallback_Parcel, "uNightMode"), this.IAuthTabCallbackStub ? 1 : 0);
        GLES20.glUseProgram(0);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = newSessionWithExtras + 91;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
        this.access000 = i;
        this.IAuthTabCallbackStubProxy = i2;
        GLES20.glViewport(0, 0, i, i2);
        int i6 = prefetch + 49;
        newSessionWithExtras = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 95 / 0;
        }
    }

    public static final class onWarmupCompleted implements getAdService {
        private static int onExtraCallback = 0;
        private static int onNavigationEvent = 1;
        final /* synthetic */ Configuration onExtraCallbackWithResult;

        public onWarmupCompleted(Configuration configuration) {
            this.onExtraCallbackWithResult = configuration;
        }

        public final getSpecialFeatureOptInStatus onExtraCallback() {
            int i = 2 % 2;
            if (readIntokhttp.onExtraCallback(this.onExtraCallbackWithResult)) {
                int i2 = onNavigationEvent + 65;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return getSpecialFeatureOptInStatus.Dark;
            }
            getSpecialFeatureOptInStatus getspecialfeatureoptinstatus = getSpecialFeatureOptInStatus.Light;
            int i4 = onNavigationEvent + 21;
            onExtraCallback = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 82 / 0;
            }
            return getspecialfeatureoptinstatus;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da A[PHI: r3
      0x00da: PHI (r3v10 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>) = 
      (r3v9 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>)
      (r3v16 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>)
     binds: [B:47:0x00d8, B:44:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[PHI: r3
      0x00e7: PHI (r3v11 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>) = 
      (r3v9 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>)
      (r3v10 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>)
      (r3v16 java.util.concurrent.CopyOnWriteArrayList<o.setActivityIntentMetadata$onExtraCallback>)
     binds: [B:47:0x00d8, B:49:0x00e5, B:44:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.opengl.GLSurfaceView.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDrawFrame(@Nullable GL10 gl10) {
        int size;
        Object[] objArr;
        CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList;
        float[] fArr;
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 73;
        prefetch = i2 % 128;
        if (i2 % 2 == 0) {
            GLES20.glClearColor(1.0f, 0.0f, 2.0f, 0.0f);
            GLES20.glClear(24752);
            size = this.onTransact.size();
            if (!this.access100) {
                return;
            }
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            size = this.onTransact.size();
            if (!this.access100) {
                return;
            }
        }
        int i3 = prefetch + 67;
        newSessionWithExtras = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 99 / 0;
            if (size == 0) {
                return;
            }
        } else if (size == 0) {
            return;
        }
        CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList2 = this.onTransact;
        if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
            for (onExtraCallback onextracallback : copyOnWriteArrayList2) {
                if (Intrinsics.areEqual(onextracallback.onTransact(), "APP") && onextracallback.onWarmupCompleted() != null) {
                    objArr = true;
                    break;
                }
            }
            int i5 = prefetch + 81;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            objArr = false;
        } else {
            int i52 = prefetch + 81;
            newSessionWithExtras = i52 % 128;
            int i62 = i52 % 2;
            objArr = false;
        }
        CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList3 = this.onTransact;
        if (copyOnWriteArrayList3 == null || !copyOnWriteArrayList3.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i7 = newSessionWithExtras + 47;
                prefetch = i7 % 128;
                int i8 = i7 % 2;
                onExtraCallback onextracallback2 = (onExtraCallback) it.next();
                if (Intrinsics.areEqual(onextracallback2.onTransact(), "BACKGROUND") && onextracallback2.onWarmupCompleted() != null) {
                    int i9 = prefetch + 39;
                    int i10 = i9 % 128;
                    newSessionWithExtras = i10;
                    if (i9 % 2 != 0) {
                        copyOnWriteArrayList = this.onTransact;
                        int i11 = 30 / 0;
                        if (copyOnWriteArrayList != null) {
                            int i12 = i10 + 15;
                            prefetch = i12 % 128;
                            int i13 = i12 % 2;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                for (onExtraCallback onextracallback3 : copyOnWriteArrayList) {
                                    if (Intrinsics.areEqual(onextracallback3.onTransact(), "ERROR") && onextracallback3.onWarmupCompleted() != null) {
                                        if (objArr == true) {
                                            fArr = this.IAuthTabCallbackStub ? new float[]{0.0f, 0.0f, 0.0f, 1.0f} : new float[]{0.867f, 0.894f, 0.929f, 1.0f};
                                        } else {
                                            float f = this.onExtraCallback * 0.98f;
                                            fArr = new float[]{(((onWarmupCompleted() >> 16) & 255) / 255.0f) * f, (((onWarmupCompleted() >> 8) & 255) / 255.0f) * f, ((onWarmupCompleted() & 255) / 255.0f) * f, f};
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        copyOnWriteArrayList = this.onTransact;
                        if (copyOnWriteArrayList != null) {
                        }
                    }
                }
            }
        } else {
            float fMin = Math.min(this.onExtraCallback / 0.6f, 1.0f);
            fArr = this.IAuthTabCallbackStub ? new float[]{0.0f, 0.0f, 0.0f, fMin} : new float[]{fMin, fMin, fMin, fMin};
        }
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.IAuthTabCallback_Parcel);
        GLES20.glUniform4fv(this.onMessageChannelReady, 1, fArr, 0);
        int[] iArr = new int[size];
        int i14 = 0;
        while (i14 < size) {
            int i15 = newSessionWithExtras + 103;
            prefetch = i15 % 128;
            if (i15 % 2 == 0) {
                iArr[i14] = Intrinsics.areEqual(this.onTransact.get(i14).onTransact(), "APP") ? 1 : 0;
                i14 += 98;
            } else {
                iArr[i14] = Intrinsics.areEqual(this.onTransact.get(i14).onTransact(), "APP") ? 1 : 0;
                i14++;
            }
        }
        GLES20.glUniform1iv(this.extraCallbackWithResult, size, iArr, 0);
        int i16 = size << 1;
        float[] fArr2 = new float[i16];
        float[] fArr3 = new float[i16];
        float[] fArr4 = new float[size];
        float[] fArr5 = new float[size];
        for (int i17 = 0; i17 < size; i17++) {
            onExtraCallback onextracallback4 = this.onTransact.get(i17);
            float fOnNavigationEvent = onextracallback4.onNavigationEvent() / this.access000;
            float fIAuthTabCallback = onextracallback4.IAuthTabCallback() / this.IAuthTabCallbackStubProxy;
            float f2 = -(onextracallback4.asInterface() / this.IAuthTabCallbackStubProxy);
            float fAsBinder = (onextracallback4.asBinder() * ((Float) onExtraCallback.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 357774941, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -357774940, new Object[]{onextracallback4}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue()) / this.access000;
            float fOnExtraCallback = (onextracallback4.onExtraCallback() * ((Float) onExtraCallback.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 357774941, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -357774940, new Object[]{onextracallback4}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue()) / this.IAuthTabCallbackStubProxy;
            int i18 = i17 << 1;
            fArr2[i18] = (fOnNavigationEvent * 2.0f) - 1.0f;
            int i19 = i18 + 1;
            fArr2[i19] = (1.0f - (fIAuthTabCallback * 2.0f)) + (f2 * 2.0f);
            fArr3[i18] = fAsBinder * 2.0f;
            fArr3[i19] = fOnExtraCallback * 2.0f;
            fArr4[i17] = onextracallback4.onExtraCallbackWithResult();
            fArr5[i17] = ((Float) onExtraCallback.onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), 2029895115, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), -2029895115, new Object[]{onextracallback4}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
        }
        GLES20.glUniform1i(this.ICustomTabsCallbackStub, size);
        GLES20.glUniform2fv(this.onMinimized, size, fArr2, 0);
        GLES20.glUniform2fv(this.ICustomTabsCallbackDefault, size, fArr3, 0);
        GLES20.glUniform1fv(this.readTypedObject, size, fArr4, 0);
        GLES20.glUniform1fv(this.ICustomTabsCallbackStubProxy, size, fArr5, 0);
        GLES20.glUniform1f(this.onPostMessage, this.asBinder);
        GLES20.glUniform1f(this.onRelationshipValidationResult, this.IAuthTabCallbackStubProxy / this.access000);
        for (int i20 = 0; i20 < size; i20++) {
            GLES20.glActiveTexture(33984 + i20);
            GLES20.glBindTexture(3553, this.getInterfaceDescriptor[i20]);
        }
        GLES20.glUniform1i(this.onUnminimized, 0);
        GLES20.glUniform1i(this.mayLaunchUrl, 1);
        GLES20.glUniform1i(this.ICustomTabsService, 2);
        GLES20.glUniform1i(this.isEngagementSignalsApiAvailable, 3);
        GLES20.glUniform1i(this.ICustomTabsCallback_Parcel, 4);
        GLES20.glUniform1f(this.ICustomTabsCallback, this.IAuthTabCallback);
        GLES20.glUniform1i(this.onActivityResized, !this.IAuthTabCallbackDefault ? 1 : 0);
        Integer num = this.onNavigationEvent;
        if (num != null) {
            int i21 = newSessionWithExtras + 115;
            prefetch = i21 % 128;
            int i22 = i21 % 2;
            int iIntValue = num.intValue();
            GLES20.glUniform1i(this.onActivityLayout, 1);
            GLES20.glUniform3f(this.writeTypedObject, Color.red(iIntValue) / 255.0f, Color.green(iIntValue) / 255.0f, Color.blue(iIntValue) / 255.0f);
            float f3 = this.asInterface.getContext().getResources().getDisplayMetrics().density;
            float f4 = this.access000;
            GLES20.glUniform4f(this.extraCallback, (15.0f * f3) / f4, (40.0f * f3) / f4, (45.0f * f3) / f4, (f3 * 80.0f) / f4);
        }
        GLES30.glBindVertexArray(this.extraCommand);
        GLES30.glDrawArraysInstanced(5, 0, 4, size);
        GLES30.glBindVertexArray(0);
        GLES20.glUseProgram(0);
    }

    private static final void onExtraCallbackWithResult(setActivityIntentMetadata setactivityintentmetadata, List list) {
        int i = 2 % 2;
        setactivityintentmetadata.onTransact.clear();
        setactivityintentmetadata.onTransact.addAll(list);
        setactivityintentmetadata.access100 = false;
        int size = setactivityintentmetadata.onTransact.size();
        GLES20.glGenTextures(size, setactivityintentmetadata.getInterfaceDescriptor, 0);
        int i2 = 0;
        while (i2 < size) {
            int i3 = newSessionWithExtras + 83;
            prefetch = i3 % 128;
            int i4 = i3 % 2;
            onExtraCallback onextracallback = setactivityintentmetadata.onTransact.get(i2);
            GLES20.glBindTexture(3553, setactivityintentmetadata.getInterfaceDescriptor[i2]);
            GLUtils.texImage2D(3553, 0, onextracallback.onWarmupCompleted(), 0);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glBindTexture(3553, 0);
            i2++;
            int i5 = prefetch + 93;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
        }
        setactivityintentmetadata.access100 = true;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        final setActivityIntentMetadata setactivityintentmetadata = (setActivityIntentMetadata) objArr[0];
        final List list = (List) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        setactivityintentmetadata.asInterface.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.AuthBitmapsRenderer$$ExternalSyntheticLambda2
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 101;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                setActivityIntentMetadata setactivityintentmetadata2 = this.f$0;
                if (i4 != 0) {
                    setActivityIntentMetadata.onNavigationEvent(setactivityintentmetadata2, list);
                    return;
                }
                setActivityIntentMetadata.onNavigationEvent(setactivityintentmetadata2, list);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        setactivityintentmetadata.asInterface.requestRender();
        int i2 = newSessionWithExtras + 55;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public final void onExtraCallback(@NotNull String str, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallback> it = this.onTransact.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                    break;
                }
                int i3 = prefetch + 55;
                newSessionWithExtras = i3 % 128;
                int i4 = i3 % 2;
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i5 = newSessionWithExtras + 27;
            prefetch = i5 % 128;
            int i6 = i5 % 2;
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList = this.onTransact;
            onExtraCallback onextracallback = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallback, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallback.onNavigationEvent(onextracallback, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, null, 767, null));
            this.asInterface.requestRender();
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        setActivityIntentMetadata setactivityintentmetadata = (setActivityIntentMetadata) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallback> it = setactivityintentmetadata.onTransact.iterator();
        int i2 = newSessionWithExtras + 31;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                break;
            }
            int i5 = newSessionWithExtras + 69;
            prefetch = i5 % 128;
            i4 = i5 % 2 == 0 ? i4 + 45 : i4 + 1;
        }
        Integer numValueOf = Integer.valueOf(i4);
        if (numValueOf.intValue() < 0) {
            int i6 = newSessionWithExtras + 73;
            prefetch = i6 % 128;
            int i7 = i6 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i8 = prefetch + 111;
            newSessionWithExtras = i8 % 128;
            int i9 = i8 % 2;
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList = setactivityintentmetadata.onTransact;
            onExtraCallback onextracallback = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallback, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallback.onNavigationEvent(onextracallback, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, 0.0f, null, 895, null));
            setactivityintentmetadata.asInterface.requestRender();
        }
        int i10 = prefetch + 65;
        newSessionWithExtras = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 29 / 0;
        }
        return null;
    }

    public final void onExtraCallback(float f) {
        int i = 2 % 2;
        int i2 = prefetch;
        int i3 = i2 + 41;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        this.asBinder = f;
        int i5 = i2 + 33;
        newSessionWithExtras = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent(float f) {
        int i = 2 % 2;
        int i2 = prefetch + 85;
        int i3 = i2 % 128;
        newSessionWithExtras = i3;
        int i4 = i2 % 2;
        this.IAuthTabCallback = f;
        int i5 = i3 + 13;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    public final void IAuthTabCallback(@NotNull String str, float f) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallback> it = this.onTransact.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else {
                if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                    break;
                }
                int i3 = newSessionWithExtras + 81;
                prefetch = i3 % 128;
                int i4 = i3 % 2;
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf.intValue() < 0) {
            int i5 = newSessionWithExtras + 81;
            int i6 = i5 % 128;
            prefetch = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 67;
            newSessionWithExtras = i8 % 128;
            int i9 = i8 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i10 = newSessionWithExtras + 85;
            prefetch = i10 % 128;
            int i11 = i10 % 2;
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList = this.onTransact;
            onExtraCallback onextracallback = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallback, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallback.onNavigationEvent(onextracallback, null, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1015, null));
            this.asInterface.requestRender();
        }
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i = 0;
        setActivityIntentMetadata setactivityintentmetadata = (setActivityIntentMetadata) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i2 = 2 % 2;
        int i3 = newSessionWithExtras + 43;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallback> it = setactivityintentmetadata.onTransact.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.areEqual(it.next().onTransact(), str)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            int i5 = prefetch + 85;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallback> copyOnWriteArrayList = setactivityintentmetadata.onTransact;
            onExtraCallback onextracallback = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallback, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallback.onNavigationEvent(onextracallback, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, 0.0f, 0.0f, null, 959, null));
            setactivityintentmetadata.asInterface.requestRender();
        }
        return null;
    }

    private final void onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = prefetch + 9;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.newAuthTabSession.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.newAuthTabSession);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "");
        this.newSession = floatBufferAsFloatBuffer;
        int[] iArr = new int[2];
        GLES30.glGenVertexArrays(1, iArr, 0);
        GLES20.glGenBuffers(1, iArr, 1);
        int i4 = iArr[0];
        this.extraCommand = i4;
        this.postMessage = iArr[1];
        GLES30.glBindVertexArray(i4);
        GLES20.glBindBuffer(34962, this.postMessage);
        int length = this.newAuthTabSession.length;
        FloatBuffer floatBuffer = this.newSession;
        Object obj = null;
        if (floatBuffer == null) {
            int i5 = prefetch + 7;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            floatBuffer = null;
        }
        GLES20.glBufferData(34962, length << 2, floatBuffer, 35044);
        GLES20.glUseProgram(this.IAuthTabCallback_Parcel);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.IAuthTabCallback_Parcel, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.IAuthTabCallback_Parcel, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 20, 12);
        GLES20.glBindBuffer(34962, 0);
        GLES30.glBindVertexArray(0);
        GLES20.glUseProgram(0);
        int i7 = newSessionWithExtras + 99;
        prefetch = i7 % 128;
        if (i7 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onNavigationEvent() {
        int i = 2 % 2;
        this.asInterface.queueEvent(new AuthBitmapsRenderer$.ExternalSyntheticLambda1(this));
        int i2 = prefetch + 83;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
    }

    private static final void IAuthTabCallback(setActivityIntentMetadata setactivityintentmetadata) {
        int i = 2 % 2;
        int i2 = prefetch + 71;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        setactivityintentmetadata.onNavigationEvent = null;
        int[] iArr = setactivityintentmetadata.getInterfaceDescriptor;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
        GLES20.glDeleteBuffers(1, new int[]{setactivityintentmetadata.postMessage}, 0);
        GLES30.glDeleteVertexArrays(1, new int[]{setactivityintentmetadata.extraCommand}, 0);
        GLES20.glDeleteProgram(setactivityintentmetadata.IAuthTabCallback_Parcel);
        int i4 = prefetch + 41;
        newSessionWithExtras = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
    }

    public static final class onExtraCallback {
        private static int IAuthTabCallback_Parcel = 1;
        private static int getInterfaceDescriptor;
        private float IAuthTabCallback;
        private final float IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final float asBinder;
        private final String asInterface;
        private final float onExtraCallback;
        private Bitmap onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private float onTransact;
        private final float onWarmupCompleted;

        public static /* synthetic */ onExtraCallback onNavigationEvent(onExtraCallback onextracallback, Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, String str, int i, Object obj) {
            Bitmap bitmap2;
            float f9;
            float f10;
            float f11;
            float f12;
            String str2;
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = getInterfaceDescriptor + 31;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                bitmap2 = onextracallback.onExtraCallbackWithResult;
            } else {
                bitmap2 = bitmap;
            }
            float f13 = (i & 2) != 0 ? onextracallback.IAuthTabCallbackDefault : f;
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i5 = IAuthTabCallback_Parcel + 75;
                getInterfaceDescriptor = i5 % 128;
                if (i5 % 2 != 0) {
                    float f14 = onextracallback.onWarmupCompleted;
                    obj2.hashCode();
                    throw null;
                }
                f9 = onextracallback.onWarmupCompleted;
            } else {
                f9 = f2;
            }
            if ((i & 8) != 0) {
                int i6 = getInterfaceDescriptor + 71;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                f10 = onextracallback.asBinder;
            } else {
                f10 = f3;
            }
            if ((i & 16) != 0) {
                int i8 = IAuthTabCallback_Parcel;
                int i9 = i8 + 109;
                getInterfaceDescriptor = i9 % 128;
                if (i9 % 2 != 0) {
                    f11 = onextracallback.onExtraCallback;
                    int i10 = 41 / 0;
                } else {
                    f11 = onextracallback.onExtraCallback;
                }
                int i11 = i8 + 85;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
            } else {
                f11 = f4;
            }
            if ((i & 32) != 0) {
                int i13 = getInterfaceDescriptor + 107;
                IAuthTabCallback_Parcel = i13 % 128;
                if (i13 % 2 == 0) {
                    float f15 = onextracallback.onNavigationEvent;
                    throw null;
                }
                f12 = onextracallback.onNavigationEvent;
            } else {
                f12 = f5;
            }
            float f16 = (i & 64) != 0 ? onextracallback.IAuthTabCallbackStub : f6;
            float f17 = (i & 128) != 0 ? onextracallback.IAuthTabCallback : f7;
            float f18 = (i & 256) != 0 ? onextracallback.onTransact : f8;
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                str2 = onextracallback.asInterface;
                int i14 = IAuthTabCallback_Parcel + 21;
                getInterfaceDescriptor = i14 % 128;
                int i15 = i14 % 2;
            } else {
                str2 = str;
            }
            return onextracallback.onWarmupCompleted(bitmap2, f13, f9, f10, f11, f12, f16, f17, f18, str2);
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
            int i7 = ~(i3 | i5);
            int i8 = ~(i5 | i4);
            int i9 = i7 | i8;
            int i10 = ~i3;
            int i11 = ~i5;
            int i12 = (~(i10 | i4)) | (~(i10 | i11)) | (~(i11 | i4));
            int i13 = ~i4;
            int i14 = i12 | (~(i13 | i3 | i5));
            int i15 = (~(i13 | i11)) | i3 | i8;
            int i16 = i3 + i5 + i2 + (1962400304 * i) + (1167700406 * i6);
            int i17 = i16 * i16;
            int i18 = ((i3 * (-1019457937)) - 559939584) + ((-1019457937) * i5) + (2001489518 * i9) + (i14 * (-2001489518)) + ((-2001489518) * i15) + (1274019840 * i2) + ((-1660944384) * i) + ((-325058560) * i6) + (867827712 * i17);
            int i19 = ((i3 * (-1629562239)) - 1134582380) + (i5 * (-1629562239)) + (i9 * (-910)) + (i14 * 910) + (i15 * 910) + (i2 * (-1629561329)) + (i * (-1621399344)) + (i6 * (-873382486)) + (i17 * 1407582208);
            return i18 + ((i19 * i19) * (-1895432192)) != 1 ? onExtraCallback(objArr) : onWarmupCompleted(objArr);
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallback)) {
                int i2 = IAuthTabCallback_Parcel + 41;
                getInterfaceDescriptor = i2 % 128;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            onExtraCallback onextracallback = (onExtraCallback) obj;
            if ((!Intrinsics.areEqual(this.onExtraCallbackWithResult, onextracallback.onExtraCallbackWithResult)) || Float.compare(this.IAuthTabCallbackDefault, onextracallback.IAuthTabCallbackDefault) != 0 || Float.compare(this.onWarmupCompleted, onextracallback.onWarmupCompleted) != 0 || Float.compare(this.asBinder, onextracallback.asBinder) != 0 || Float.compare(this.onExtraCallback, onextracallback.onExtraCallback) != 0 || Float.compare(this.onNavigationEvent, onextracallback.onNavigationEvent) != 0 || Float.compare(this.IAuthTabCallbackStub, onextracallback.IAuthTabCallbackStub) != 0) {
                return false;
            }
            if (Float.compare(this.IAuthTabCallback, onextracallback.IAuthTabCallback) != 0) {
                int i3 = getInterfaceDescriptor;
                int i4 = i3 + 39;
                IAuthTabCallback_Parcel = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 101;
                IAuthTabCallback_Parcel = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Float.compare(this.onTransact, onextracallback.onTransact) != 0) {
                int i8 = getInterfaceDescriptor + 77;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.asInterface, onextracallback.asInterface)) {
                int i10 = IAuthTabCallback_Parcel + 3;
                getInterfaceDescriptor = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            int i12 = IAuthTabCallback_Parcel + 29;
            getInterfaceDescriptor = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 12 / 0;
            }
            return true;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 1;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = this.onExtraCallbackWithResult;
            if (bitmap == null) {
                int i5 = i2 + 11;
                IAuthTabCallback_Parcel = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = bitmap.hashCode();
            }
            return (((((((((((((((((iHashCode * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + Float.hashCode(this.onWarmupCompleted)) * 31) + Float.hashCode(this.asBinder)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onTransact)) * 31) + this.asInterface.hashCode();
        }

        public final onExtraCallback onWarmupCompleted(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallback onextracallback = new onExtraCallback(bitmap, f, f2, f3, f4, f5, f6, f7, f8, str);
            int i2 = IAuthTabCallback_Parcel + 77;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
            return onextracallback;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BitmapData(bitmap=" + this.onExtraCallbackWithResult + ", width=" + this.IAuthTabCallbackDefault + ", height=" + this.onWarmupCompleted + ", scale=" + this.asBinder + ", centerX=" + this.onExtraCallback + ", centerY=" + this.onNavigationEvent + ", translationY=" + this.IAuthTabCallbackStub + ", alpha=" + this.IAuthTabCallback + ", saturation=" + this.onTransact + ", imageType=" + this.asInterface + ")";
            int i2 = getInterfaceDescriptor + 19;
            IAuthTabCallback_Parcel = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public onExtraCallback(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onExtraCallbackWithResult = bitmap;
            this.IAuthTabCallbackDefault = f;
            this.onWarmupCompleted = f2;
            this.asBinder = f3;
            this.onExtraCallback = f4;
            this.onNavigationEvent = f5;
            this.IAuthTabCallbackStub = f6;
            this.IAuthTabCallback = f7;
            this.onTransact = f8;
            this.asInterface = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallback(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            if ((i & 8) != 0) {
                int i2 = IAuthTabCallback_Parcel + 125;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                f9 = 1.0f;
            } else {
                f9 = f3;
            }
            if ((i & 16) != 0) {
                int i4 = getInterfaceDescriptor + 87;
                IAuthTabCallback_Parcel = i4 % 128;
                f10 = i4 % 2 == 0 ? 2.0f : 0.0f;
            } else {
                f10 = f4;
            }
            float f14 = (i & 32) != 0 ? 0.0f : f5;
            if ((i & 64) != 0) {
                int i5 = IAuthTabCallback_Parcel + 47;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                f11 = 0.0f;
            } else {
                f11 = f6;
            }
            if ((i & 128) != 0) {
                int i8 = getInterfaceDescriptor + 75;
                IAuthTabCallback_Parcel = i8 % 128;
                int i9 = i8 % 2;
                f12 = 1.0f;
            } else {
                f12 = f7;
            }
            if ((i & 256) != 0) {
                int i10 = getInterfaceDescriptor + 17;
                IAuthTabCallback_Parcel = i10 % 128;
                f13 = i10 % 2 == 0 ? 2.0f : 1.0f;
            } else {
                f13 = f8;
            }
            this(bitmap, f, f2, f9, f10, f14, f11, f12, f13, str);
        }

        public final Bitmap onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 59;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            Bitmap bitmap = this.onExtraCallbackWithResult;
            int i5 = i3 + 85;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return bitmap;
        }

        public final void onWarmupCompleted(@Nullable Bitmap bitmap) {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 47;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            this.onExtraCallbackWithResult = bitmap;
            int i5 = i3 + 119;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
            }
        }

        public final float asBinder() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 31;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            float f = this.IAuthTabCallbackDefault;
            if (i3 != 0) {
                int i4 = 36 / 0;
            }
            return f;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 53;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            float f = this.onWarmupCompleted;
            int i5 = i3 + 27;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel;
            int i3 = i2 + 83;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            float f = onextracallback.asBinder;
            int i5 = i2 + 59;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return Float.valueOf(f);
            }
            int i6 = 11 / 0;
            return Float.valueOf(f);
        }

        public final float onNavigationEvent() {
            float f;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 73;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            if (i2 % 2 == 0) {
                f = this.onExtraCallback;
                int i4 = 99 / 0;
            } else {
                f = this.onExtraCallback;
            }
            int i5 = i3 + 91;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float IAuthTabCallback() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 101;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onNavigationEvent;
            if (i3 != 0) {
                int i4 = 65 / 0;
            }
            return f;
        }

        public final float asInterface() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 103;
            int i3 = i2 % 128;
            IAuthTabCallback_Parcel = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i3 + 115;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = IAuthTabCallback_Parcel + 17;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                return this.IAuthTabCallback;
            }
            throw null;
        }

        private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
            onExtraCallback onextracallback = (onExtraCallback) objArr[0];
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 75;
            IAuthTabCallback_Parcel = i3 % 128;
            int i4 = i3 % 2;
            float f = onextracallback.onTransact;
            int i5 = i2 + 101;
            IAuthTabCallback_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                return Float.valueOf(f);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String onTransact() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 107;
            IAuthTabCallback_Parcel = i2 % 128;
            int i3 = i2 % 2;
            String str = this.asInterface;
            if (i3 == 0) {
                int i4 = 36 / 0;
            }
            return str;
        }

        public final float IAuthTabCallbackStub() {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return ((Float) onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 2029895115, iOnExtraCallbackWithResult, -2029895115, new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
        }

        public final float IAuthTabCallbackDefault() {
            int iOnExtraCallbackWithResult = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            int iOnExtraCallbackWithResult2 = TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult();
            return ((Float) onWarmupCompleted(TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult(), iOnExtraCallbackWithResult2, 357774941, iOnExtraCallbackWithResult, -357774940, new Object[]{this}, TdsBottomCtaV1Kt$.ExternalSyntheticLambda18.onExtraCallbackWithResult())).floatValue();
        }
    }

    public static final class onExtraCallbackWithResult {
        public /* synthetic */ onExtraCallbackWithResult(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallbackWithResult() {
        }
    }

    public final void onNavigationEvent(@NotNull String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 32765721, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -32765719, objArr);
    }

    public final void onNavigationEvent(@NotNull List<onExtraCallback> list) {
        int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 1238507485, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -1238507485, new Object[]{this, list});
    }

    public final void onWarmupCompleted(@NotNull String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        onExtraCallbackWithResult(MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), 119633648, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), -119633647, objArr);
    }
}
