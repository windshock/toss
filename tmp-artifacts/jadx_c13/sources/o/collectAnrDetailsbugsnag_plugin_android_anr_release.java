package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLSurfaceView;
import android.opengl.GLUtils;
import im.toss.features.loan.comparison.result.view.LoanComparisonResultWarningNoticeView;
import im.toss.features.verify.teensmanualselfie.impl.idcardupload.nav.TeensManualSelfieNavGraphKt$;
import im.toss.uikit.widget.gl.render.BitmapsRenderer$;
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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import o.collectAnrDetailsbugsnag_plugin_android_anr_release;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class collectAnrDetailsbugsnag_plugin_android_anr_release implements GLSurfaceView.Renderer {
    private static int newAuthTabSession = 0;
    private static int newSession = 1;
    private static int newSessionWithExtras = 1;
    private static int prefetch;
    private final CopyOnWriteArrayList<onExtraCallbackWithResult> IAuthTabCallback;
    private float IAuthTabCallbackDefault;
    private final boolean IAuthTabCallbackStub;
    private final int[] IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private int ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private int ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private final float[] ICustomTabsService;
    private int access000;
    private int access100;
    private final GLSurfaceView asBinder;
    private int asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private FloatBuffer extraCommand;
    private int getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private int mayLaunchUrl;
    private int onActivityLayout;
    private int onActivityResized;
    private volatile float[] onExtraCallback;
    private volatile float onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    private int onPostMessage;
    private int onRelationshipValidationResult;
    private volatile boolean onTransact;
    private int onUnminimized;
    private final Integer onWarmupCompleted;
    private int readTypedObject;
    private int writeTypedObject;
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    public static final int onNavigationEvent = 8;

    static {
        int i = newAuthTabSession + 87;
        newSession = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object IAuthTabCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i4);
        int i9 = ~i3;
        int i10 = ~i4;
        int i11 = i8 | (~(i9 | i10 | i2));
        int i12 = (~(i4 | i9 | i2)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i3 + i2 + i + (762713021 * i6) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i3 * (-1364308824)) - 1074288667) + (i2 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + ((-1364308165) * i) + ((-893132913) * i6) + (986770329 * i5) + (i15 * (-1162149888));
        int i17 = ((i3 * (-1846875272)) - 1480523776) + ((-1846875272) * i2) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i) + ((-750387200) * i6) + ((-523632640) * i5) + ((-1971257344) * i15) + (i16 * i16 * (-1529413632));
        if (i17 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i17 != 2) {
            return onWarmupCompleted(objArr);
        }
        int i18 = 0;
        collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = (collectAnrDetailsbugsnag_plugin_android_anr_release) objArr[0];
        String str = (String) objArr[1];
        float fFloatValue = ((Number) objArr[2]).floatValue();
        int i19 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallbackWithResult> it = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback.iterator();
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (!(!Intrinsics.areEqual(it.next().asInterface(), str))) {
                break;
            }
            int i20 = prefetch + 31;
            newSessionWithExtras = i20 % 128;
            int i21 = i20 % 2;
            i18++;
        }
        Integer numValueOf = Integer.valueOf(i18);
        if (numValueOf.intValue() < 0) {
            int i22 = newSessionWithExtras + 15;
            prefetch = i22 % 128;
            int i23 = i22 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int i24 = prefetch + 69;
            newSessionWithExtras = i24 % 128;
            int i25 = i24 % 2;
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallbackWithResult> copyOnWriteArrayList = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback;
            onExtraCallbackWithResult onextracallbackwithresult = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fFloatValue, 0.0f, 0.0f, null, 959, null));
            collectanrdetailsbugsnag_plugin_android_anr_release.asBinder.requestRender();
        }
        return null;
    }

    public static /* synthetic */ void IAuthTabCallback(RectF rectF, float f, collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release, float f2) {
        int i = 2 % 2;
        int i2 = newSessionWithExtras + 21;
        prefetch = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(rectF, f, collectanrdetailsbugsnag_plugin_android_anr_release, f2);
        int i4 = newSessionWithExtras + 17;
        prefetch = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void IAuthTabCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetch + 15;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onExtraCallback(function0);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
    }

    public static /* synthetic */ void onExtraCallbackWithResult(collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = prefetch + 109;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(collectanrdetailsbugsnag_plugin_android_anr_release);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = newSessionWithExtras + 75;
        prefetch = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void onExtraCallbackWithResult(collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release, List list, Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetch + 107;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        onWarmupCompleted(collectanrdetailsbugsnag_plugin_android_anr_release, list, function0);
        int i4 = prefetch + 15;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch + 33;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 != 0) {
            int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
            return (Unit) IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[0], 1413889589, -1413889589, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
        }
        int iIAuthTabCallback2 = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        int i3 = 18 / 0;
        return (Unit) IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[0], 1413889589, -1413889589, iIAuthTabCallback2, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public collectAnrDetailsbugsnag_plugin_android_anr_release(@NotNull GLSurfaceView gLSurfaceView, boolean z, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(gLSurfaceView, "");
        this.asBinder = gLSurfaceView;
        this.IAuthTabCallbackStub = z;
        this.onWarmupCompleted = num;
        this.access000 = 1;
        this.getInterfaceDescriptor = 1;
        this.onRelationshipValidationResult = -1;
        this.ICustomTabsCallbackStubProxy = -1;
        this.onUnminimized = -1;
        this.ICustomTabsCallbackStub = -1;
        this.mayLaunchUrl = -1;
        this.onMinimized = -1;
        this.writeTypedObject = -1;
        this.onActivityResized = -1;
        this.extraCallback = -1;
        this.onActivityLayout = -1;
        this.access100 = -1;
        this.ICustomTabsCallback = -1;
        this.onMessageChannelReady = -1;
        this.IAuthTabCallback_Parcel = -1;
        this.extraCallbackWithResult = -1;
        this.readTypedObject = -1;
        this.ICustomTabsCallbackDefault = -1;
        this.onPostMessage = -1;
        this.IAuthTabCallbackStubProxy = new int[10];
        this.onExtraCallback = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.IAuthTabCallback = new CopyOnWriteArrayList<>();
        this.ICustomTabsService = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ collectAnrDetailsbugsnag_plugin_android_anr_release(GLSurfaceView gLSurfaceView, boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = newSessionWithExtras + 45;
            prefetch = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 21 / 0;
            }
            int i4 = 2 % 2;
            num = null;
        }
        this(gLSurfaceView, z, num);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int i = 2 % 2;
        int i2 = prefetch + 7;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        return unit;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@Nullable GL10 gl10, @Nullable EGLConfig eGLConfig) {
        int i = 2 % 2;
        int i2 = prefetch + 19;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        if (!this.IAuthTabCallback.isEmpty()) {
            onExtraCallback(this.IAuthTabCallback, (Function0<Unit>) new BitmapsRenderer$.ExternalSyntheticLambda3());
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        Context context = this.asBinder.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.asInterface = onwarmupcompleted.onExtraCallback(context, "raw/bitmaps_vertex_shader.glsl", "raw/bitmaps_fragment_shader.glsl");
        onWarmupCompleted();
        GLES20.glGenTextures(10, this.IAuthTabCallbackStubProxy, 0);
        GLES20.glUseProgram(this.asInterface);
        this.IAuthTabCallback_Parcel = GLES20.glGetUniformLocation(this.asInterface, "uAppImageTypes");
        this.onRelationshipValidationResult = GLES20.glGetUniformLocation(this.asInterface, "uTexture0");
        this.ICustomTabsCallbackStubProxy = GLES20.glGetUniformLocation(this.asInterface, "uTexture1");
        this.onUnminimized = GLES20.glGetUniformLocation(this.asInterface, "uTexture2");
        this.ICustomTabsCallbackStub = GLES20.glGetUniformLocation(this.asInterface, "uTexture3");
        this.mayLaunchUrl = GLES20.glGetUniformLocation(this.asInterface, "uTexture4");
        this.writeTypedObject = GLES20.glGetUniformLocation(this.asInterface, "uCornerRadius");
        this.onActivityResized = GLES20.glGetUniformLocation(this.asInterface, "uInstanceCount");
        this.extraCallback = GLES20.glGetUniformLocation(this.asInterface, "uCenter");
        this.onActivityLayout = GLES20.glGetUniformLocation(this.asInterface, "uSize");
        this.access100 = GLES20.glGetUniformLocation(this.asInterface, "uAlpha");
        this.onMessageChannelReady = GLES20.glGetUniformLocation(this.asInterface, "uSaturation");
        this.ICustomTabsCallback = GLES20.glGetUniformLocation(this.asInterface, "uBackgroundColor");
        this.onMinimized = GLES20.glGetUniformLocation(this.asInterface, "uTexAspect");
        this.extraCallbackWithResult = GLES20.glGetUniformLocation(this.asInterface, "uBlurRect");
        this.readTypedObject = GLES20.glGetUniformLocation(this.asInterface, "uBlurRadius");
        this.ICustomTabsCallbackDefault = GLES20.glGetUniformLocation(this.asInterface, "uTexSize");
        this.onPostMessage = GLES20.glGetUniformLocation(this.asInterface, "uSurfaceSize");
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.asInterface, "uNightMode"), 0);
        GLES20.glUseProgram(0);
        int i4 = prefetch + 39;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@Nullable GL10 gl10, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = newSessionWithExtras + 85;
        prefetch = i5 % 128;
        if (i5 % 2 != 0) {
            this.access000 = i;
            this.getInterfaceDescriptor = i2;
            i3 = 1;
        } else {
            this.access000 = i;
            this.getInterfaceDescriptor = i2;
            i3 = 0;
        }
        GLES20.glViewport(i3, i3, i, i2);
    }

    public final List<Float> onExtraCallback(int i) {
        int i2 = 2 % 2;
        int i3 = prefetch + 29;
        newSessionWithExtras = i3 % 128;
        int i4 = i3 % 2;
        List<Float> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(Color.alpha(i) / 255.0f), Float.valueOf(Color.red(i) / 255.0f), Float.valueOf(Color.green(i) / 255.0f), Float.valueOf(Color.blue(i) / 255.0f)});
        int i5 = newSessionWithExtras + 55;
        prefetch = i5 % 128;
        if (i5 % 2 == 0) {
            return listListOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@Nullable GL10 gl10) {
        Bitmap bitmap;
        int width;
        int i = 2 % 2;
        Integer num = this.onWarmupCompleted;
        if (num != null) {
            List<Float> listOnExtraCallback = onExtraCallback(num.intValue());
            GLES20.glClearColor(listOnExtraCallback.get(1).floatValue(), listOnExtraCallback.get(2).floatValue(), listOnExtraCallback.get(3).floatValue(), listOnExtraCallback.get(0).floatValue());
        } else {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        }
        GLES20.glClear(16640);
        int size = this.IAuthTabCallback.size();
        if (!this.onTransact) {
            return;
        }
        int i2 = prefetch + 83;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (size != 0) {
            Integer num2 = this.onWarmupCompleted;
            if (num2 != null) {
                List<Float> listOnExtraCallback2 = onExtraCallback(num2.intValue());
                GLES20.glClearColor(listOnExtraCallback2.get(1).floatValue(), listOnExtraCallback2.get(2).floatValue(), listOnExtraCallback2.get(3).floatValue(), listOnExtraCallback2.get(0).floatValue());
                GLES20.glClear(16640);
                GLES20.glUseProgram(this.asInterface);
            } else {
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                GLES20.glClear(16640);
                GLES20.glUseProgram(this.asInterface);
            }
            int[] iArr = new int[size];
            int i3 = 0;
            while (i3 < size) {
                int i4 = prefetch + 33;
                int i5 = i4 % 128;
                newSessionWithExtras = i5;
                int i6 = i4 % 2;
                iArr[i3] = 0;
                i3++;
                int i7 = i5 + 113;
                prefetch = i7 % 128;
                int i8 = i7 % 2;
            }
            GLES20.glUniform1iv(this.IAuthTabCallback_Parcel, size, iArr, 0);
            int i9 = size << 1;
            float[] fArr = new float[i9];
            float[] fArr2 = new float[i9];
            float[] fArr3 = new float[size];
            float[] fArr4 = new float[size];
            float[] fArr5 = new float[i9];
            for (int i10 = 0; i10 < size; i10++) {
                int i11 = newSessionWithExtras + 97;
                prefetch = i11 % 128;
                int i12 = i11 % 2;
                onExtraCallbackWithResult onextracallbackwithresult = this.IAuthTabCallback.get(i10);
                float fOnExtraCallback = onextracallbackwithresult.onExtraCallback() / this.access000;
                float fOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult() / this.getInterfaceDescriptor;
                float f = -(onextracallbackwithresult.IAuthTabCallbackStub() / this.getInterfaceDescriptor);
                float fOnTransact = (onextracallbackwithresult.onTransact() * ((Float) onExtraCallbackWithResult.onWarmupCompleted(-538593590, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 538593591, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).floatValue()) / this.access000;
                float fOnWarmupCompleted = (onextracallbackwithresult.onWarmupCompleted() * ((Float) onExtraCallbackWithResult.onWarmupCompleted(-538593590, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, 538593591, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).floatValue()) / this.getInterfaceDescriptor;
                int i13 = i10 << 1;
                fArr[i13] = (fOnExtraCallback * 2.0f) - 1.0f;
                int i14 = i13 + 1;
                fArr[i14] = (1.0f - (fOnExtraCallbackWithResult * 2.0f)) + (f * 2.0f);
                fArr2[i13] = fOnTransact * 2.0f;
                fArr2[i14] = fOnWarmupCompleted * 2.0f;
                fArr3[i10] = onextracallbackwithresult.onNavigationEvent();
                fArr4[i10] = onextracallbackwithresult.asBinder();
                onExtraCallbackWithResult onextracallbackwithresult2 = (onExtraCallbackWithResult) CollectionsKt___CollectionsKt.getOrNull(this.IAuthTabCallback, i10);
                if (onextracallbackwithresult2 != null) {
                    int i15 = newSessionWithExtras + 69;
                    prefetch = i15 % 128;
                    if (i15 % 2 != 0) {
                        bitmap = (Bitmap) onExtraCallbackWithResult.onWarmupCompleted(1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, -1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                        int i16 = 67 / 0;
                    } else {
                        bitmap = (Bitmap) onExtraCallbackWithResult.onWarmupCompleted(1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult2}, -1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
                    }
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    int i17 = newSessionWithExtras + 125;
                    prefetch = i17 % 128;
                    int i18 = i17 % 2;
                    width = bitmap.getWidth();
                } else {
                    width = 1;
                }
                fArr5[i13] = width;
                fArr5[i14] = bitmap != null ? bitmap.getHeight() : 1;
            }
            GLES20.glUniform1i(this.onActivityResized, size);
            GLES20.glUniform2fv(this.extraCallback, size, fArr, 0);
            GLES20.glUniform2fv(this.onActivityLayout, size, fArr2, 0);
            GLES20.glUniform1fv(this.access100, size, fArr3, 0);
            GLES20.glUniform1fv(this.onMessageChannelReady, size, fArr4, 0);
            GLES20.glUniform1f(this.writeTypedObject, this.IAuthTabCallbackDefault);
            GLES20.glUniform1f(this.onMinimized, this.getInterfaceDescriptor / this.access000);
            GLES20.glUniform4fv(this.extraCallbackWithResult, 1, this.onExtraCallback, 0);
            GLES20.glUniform1f(this.readTypedObject, this.onExtraCallbackWithResult);
            GLES20.glUniform2fv(this.ICustomTabsCallbackDefault, size, fArr5, 0);
            GLES20.glUniform2f(this.onPostMessage, this.access000, this.getInterfaceDescriptor);
            int i19 = newSessionWithExtras + 53;
            prefetch = i19 % 128;
            if (i19 % 2 != 0) {
                int i20 = 3 / 5;
            }
            for (int i21 = 0; i21 < size; i21++) {
                GLES20.glActiveTexture(33984 + i21);
                GLES20.glBindTexture(3553, this.IAuthTabCallbackStubProxy[i21]);
            }
            GLES20.glUniform1i(this.onRelationshipValidationResult, 0);
            GLES20.glUniform1i(this.ICustomTabsCallbackStubProxy, 1);
            GLES20.glUniform1i(this.onUnminimized, 2);
            GLES20.glUniform1i(this.ICustomTabsCallbackStub, 3);
            GLES20.glUniform1i(this.mayLaunchUrl, 4);
            GLES30.glBindVertexArray(this.isEngagementSignalsApiAvailable);
            GLES30.glDrawArraysInstanced(5, 0, 4, size);
            GLES30.glBindVertexArray(0);
            GLES20.glUseProgram(0);
        }
    }

    private static final void onExtraCallback(Function0 function0) {
        int i = 2 % 2;
        int i2 = prefetch + 63;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        function0.invoke();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onWarmupCompleted(collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release, List list, final Function0 function0) {
        int i = 2 % 2;
        if (!(!collectanrdetailsbugsnag_plugin_android_anr_release.onTransact)) {
            int i2 = newSessionWithExtras + 111;
            prefetch = i2 % 128;
            int i3 = i2 % 2;
            GLES20.glDeleteTextures(collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback.size(), collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallbackStubProxy, 0);
        }
        collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback.clear();
        CopyOnWriteArrayList<onExtraCallbackWithResult> copyOnWriteArrayList = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Bitmap) onExtraCallbackWithResult.onWarmupCompleted(1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{(onExtraCallbackWithResult) obj}, -1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())) != null) {
                arrayList.add(obj);
            }
        }
        copyOnWriteArrayList.addAll(arrayList);
        collectanrdetailsbugsnag_plugin_android_anr_release.onTransact = false;
        int size = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback.size();
        GLES20.glGenTextures(size, collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallbackStubProxy, 0);
        int i4 = newSessionWithExtras + 111;
        prefetch = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 5;
        }
        for (int i6 = 0; i6 < size; i6++) {
            onExtraCallbackWithResult onextracallbackwithresult = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallback.get(i6);
            GLES20.glBindTexture(3553, collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallbackStubProxy[i6]);
            GLUtils.texImage2D(3553, 0, (Bitmap) onExtraCallbackWithResult.onWarmupCompleted(1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{onextracallbackwithresult}, -1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted()), 0);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindTexture(3553, 0);
        }
        collectanrdetailsbugsnag_plugin_android_anr_release.onTransact = true;
        collectanrdetailsbugsnag_plugin_android_anr_release.asBinder.post(new Runnable() { // from class: im.toss.uikit.widget.gl.render.BitmapsRenderer$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            @Override // java.lang.Runnable
            public final void run() {
                int i7 = 2 % 2;
                int i8 = onExtraCallbackWithResult + 95;
                onNavigationEvent = i8 % 128;
                int i9 = i8 % 2;
                collectAnrDetailsbugsnag_plugin_android_anr_release.IAuthTabCallback(function0);
                int i10 = onExtraCallbackWithResult + Imgproc.COLOR_YUV2RGB_YVYU;
                onNavigationEvent = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }
        });
    }

    public final void onExtraCallback(@NotNull final List<onExtraCallbackWithResult> list, @NotNull final Function0<Unit> function0) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.asBinder.queueEvent(new Runnable() { // from class: im.toss.uikit.widget.gl.render.BitmapsRenderer$$ExternalSyntheticLambda4
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = 2 % 2;
                int i3 = IAuthTabCallback + 43;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release = this.f$0;
                if (i4 == 0) {
                    collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(collectanrdetailsbugsnag_plugin_android_anr_release, list, function0);
                    return;
                }
                collectAnrDetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult(collectanrdetailsbugsnag_plugin_android_anr_release, list, function0);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.asBinder.requestRender();
        int i2 = prefetch + 63;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 54 / 0;
        }
    }

    public final void onWarmupCompleted(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = prefetch + Imgproc.COLOR_YUV2RGBA_YVYU;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<onExtraCallbackWithResult> it = this.IAuthTabCallback.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else {
                if (Intrinsics.areEqual(it.next().asInterface(), str)) {
                    break;
                }
                int i5 = newSessionWithExtras + 69;
                prefetch = i5 % 128;
                i4 = i5 % 2 != 0 ? i4 + 65 : i4 + 1;
            }
        }
        Integer numValueOf = Integer.valueOf(i4);
        if (numValueOf.intValue() < 0) {
            int i6 = prefetch;
            int i7 = i6 + 49;
            newSessionWithExtras = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i6 + 23;
            newSessionWithExtras = i9 % 128;
            int i10 = i9 % 2;
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            CopyOnWriteArrayList<onExtraCallbackWithResult> copyOnWriteArrayList = this.IAuthTabCallback;
            onExtraCallbackWithResult onextracallbackwithresult = copyOnWriteArrayList.get(iIntValue);
            Intrinsics.checkNotNullExpressionValue(onextracallbackwithresult, "");
            copyOnWriteArrayList.set(iIntValue, onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresult, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, null, 895, null));
            this.asBinder.requestRender();
            int i11 = prefetch + 51;
            newSessionWithExtras = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    private static final void onExtraCallback(RectF rectF, float f, collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release, float f2) {
        int i = 2 % 2;
        int i2 = prefetch + 97;
        newSessionWithExtras = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (rectF == null || f <= 0.0f) {
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult = 0.0f;
        } else {
            float f3 = rectF.left;
            float f4 = collectanrdetailsbugsnag_plugin_android_anr_release.access000;
            float f5 = rectF.top;
            float f6 = collectanrdetailsbugsnag_plugin_android_anr_release.getInterfaceDescriptor;
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallback = new float[]{f3 / f4, f5 / f6, rectF.right / f4, rectF.bottom / f6};
            collectanrdetailsbugsnag_plugin_android_anr_release.onExtraCallbackWithResult = f;
        }
        collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallbackDefault = f2;
        int i3 = newSessionWithExtras + 31;
        prefetch = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void onWarmupCompleted() {
        int i = 2 % 2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.ICustomTabsService.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(this.ICustomTabsService);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "");
        this.extraCommand = floatBufferAsFloatBuffer;
        int[] iArr = new int[2];
        GLES30.glGenVertexArrays(1, iArr, 0);
        GLES20.glGenBuffers(1, iArr, 1);
        int i2 = iArr[0];
        this.isEngagementSignalsApiAvailable = i2;
        this.ICustomTabsCallback_Parcel = iArr[1];
        GLES30.glBindVertexArray(i2);
        GLES20.glBindBuffer(34962, this.ICustomTabsCallback_Parcel);
        int length = this.ICustomTabsService.length;
        FloatBuffer floatBuffer = this.extraCommand;
        if (floatBuffer == null) {
            int i3 = newSessionWithExtras + 65;
            prefetch = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
                int i4 = 77 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException(_UrlKt.FRAGMENT_ENCODE_SET);
            }
            int i5 = prefetch + 79;
            newSessionWithExtras = i5 % 128;
            int i6 = i5 % 2;
            floatBuffer = null;
        }
        GLES20.glBufferData(34962, length << 2, floatBuffer, 35044);
        GLES20.glUseProgram(this.asInterface);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.asInterface, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.asInterface, "aTexCoord");
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation2, 2, 5126, false, 20, 12);
        GLES20.glBindBuffer(34962, 0);
        GLES30.glBindVertexArray(0);
        GLES20.glUseProgram(0);
    }

    public final void onExtraCallback() {
        int i = 2 % 2;
        this.asBinder.queueEvent(new BitmapsRenderer$.ExternalSyntheticLambda0(this));
        int i2 = newSessionWithExtras + 39;
        prefetch = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final void onNavigationEvent(collectAnrDetailsbugsnag_plugin_android_anr_release collectanrdetailsbugsnag_plugin_android_anr_release) {
        int i = 2 % 2;
        int i2 = prefetch + 73;
        newSessionWithExtras = i2 % 128;
        int i3 = i2 % 2;
        int[] iArr = collectanrdetailsbugsnag_plugin_android_anr_release.IAuthTabCallbackStubProxy;
        GLES20.glDeleteTextures(iArr.length, iArr, 0);
        GLES20.glDeleteBuffers(1, new int[]{collectanrdetailsbugsnag_plugin_android_anr_release.ICustomTabsCallback_Parcel}, 0);
        GLES30.glDeleteVertexArrays(1, new int[]{collectanrdetailsbugsnag_plugin_android_anr_release.isEngagementSignalsApiAvailable}, 0);
        GLES20.glDeleteProgram(collectanrdetailsbugsnag_plugin_android_anr_release.asInterface);
        int i4 = prefetch + 67;
        newSessionWithExtras = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final class onExtraCallbackWithResult {
        private static int access100 = 0;
        private static int getInterfaceDescriptor = 1;
        private final float IAuthTabCallback;
        private float IAuthTabCallbackDefault;
        private final float IAuthTabCallbackStub;
        private final float asBinder;
        private final float asInterface;
        private float onExtraCallback;
        private final float onExtraCallbackWithResult;
        private final float onNavigationEvent;
        private final String onTransact;
        private final Bitmap onWarmupCompleted;

        public static /* synthetic */ onExtraCallbackWithResult onExtraCallbackWithResult(onExtraCallbackWithResult onextracallbackwithresult, Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, String str, int i, Object obj) {
            Bitmap bitmap2;
            float f9;
            float f10;
            float f11;
            String str2;
            int i2 = 2 % 2;
            Object obj2 = null;
            if ((i & 1) != 0) {
                int i3 = access100 + Imgproc.COLOR_YUV2RGBA_YVYU;
                getInterfaceDescriptor = i3 % 128;
                if (i3 % 2 == 0) {
                    Bitmap bitmap3 = onextracallbackwithresult.onWarmupCompleted;
                    throw null;
                }
                bitmap2 = onextracallbackwithresult.onWarmupCompleted;
            } else {
                bitmap2 = bitmap;
            }
            float f12 = (i & 2) != 0 ? onextracallbackwithresult.IAuthTabCallbackStub : f;
            float f13 = (i & 4) != 0 ? onextracallbackwithresult.onExtraCallbackWithResult : f2;
            float f14 = (i & 8) != 0 ? onextracallbackwithresult.asBinder : f3;
            float f15 = (i & 16) != 0 ? onextracallbackwithresult.IAuthTabCallback : f4;
            if ((i & 32) != 0) {
                int i4 = access100 + 33;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
                f9 = onextracallbackwithresult.onNavigationEvent;
            } else {
                f9 = f5;
            }
            float f16 = (i & 64) != 0 ? onextracallbackwithresult.asInterface : f6;
            if ((i & 128) != 0) {
                int i6 = getInterfaceDescriptor + 119;
                access100 = i6 % 128;
                if (i6 % 2 != 0) {
                    float f17 = onextracallbackwithresult.onExtraCallback;
                    obj2.hashCode();
                    throw null;
                }
                f10 = onextracallbackwithresult.onExtraCallback;
            } else {
                f10 = f7;
            }
            if ((i & 256) != 0) {
                int i7 = access100 + 119;
                getInterfaceDescriptor = i7 % 128;
                if (i7 % 2 == 0) {
                    f11 = onextracallbackwithresult.IAuthTabCallbackDefault;
                    int i8 = 89 / 0;
                } else {
                    f11 = onextracallbackwithresult.IAuthTabCallbackDefault;
                }
            } else {
                f11 = f8;
            }
            if ((i & Imgcodecs.IMWRITE_AVIF_QUALITY) != 0) {
                str2 = onextracallbackwithresult.onTransact;
                int i9 = getInterfaceDescriptor + 47;
                access100 = i9 % 128;
                int i10 = i9 % 2;
            } else {
                str2 = str;
            }
            return onextracallbackwithresult.onExtraCallback(bitmap2, f12, f13, f14, f15, f9, f16, f10, f11, str2);
        }

        public static /* synthetic */ Object onWarmupCompleted(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~(i7 | i2);
            int i9 = ~i3;
            int i10 = ~i2;
            int i11 = i8 | (~(i9 | i10 | i));
            int i12 = (~(i2 | i9 | i)) | (~(i10 | i7));
            int i13 = ~(i7 | i9);
            int i14 = i3 + i + i5 + (563899752 * i6) + (667302295 * i4);
            int i15 = i14 * i14;
            int i16 = ((i3 * 1426164010) - 416808960) + (1426164010 * i) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i6) + (1914175488 * i4) + ((-1995833344) * i15);
            int i17 = (i3 * (-901935710)) + 144807674 + (i * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i5 * (-901935539)) + (i6 * 42244168) + (i4 * (-913566613)) + (i15 * (-1006501888));
            if (i16 + (i17 * i17 * (-1006239744)) == 1) {
                return onExtraCallbackWithResult(objArr);
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i18 = 2 % 2;
            int i19 = access100 + 97;
            int i20 = i19 % 128;
            getInterfaceDescriptor = i20;
            int i21 = i19 % 2;
            Bitmap bitmap = onextracallbackwithresult.onWarmupCompleted;
            int i22 = i20 + 109;
            access100 = i22 % 128;
            int i23 = i22 % 2;
            return bitmap;
        }

        public boolean equals(@Nullable Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            if (!Intrinsics.areEqual(this.onWarmupCompleted, onextracallbackwithresult.onWarmupCompleted)) {
                int i2 = access100 + 95;
                getInterfaceDescriptor = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackStub, onextracallbackwithresult.IAuthTabCallbackStub) != 0 || Float.compare(this.onExtraCallbackWithResult, onextracallbackwithresult.onExtraCallbackWithResult) != 0 || Float.compare(this.asBinder, onextracallbackwithresult.asBinder) != 0) {
                return false;
            }
            if (Float.compare(this.IAuthTabCallback, onextracallbackwithresult.IAuthTabCallback) != 0) {
                int i4 = getInterfaceDescriptor + 73;
                access100 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 36 / 0;
                }
                return false;
            }
            if (Float.compare(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) != 0) {
                return false;
            }
            if (Float.compare(this.asInterface, onextracallbackwithresult.asInterface) != 0) {
                int i6 = access100 + 19;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (Float.compare(this.onExtraCallback, onextracallbackwithresult.onExtraCallback) != 0) {
                int i8 = access100 + 67;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (Float.compare(this.IAuthTabCallbackDefault, onextracallbackwithresult.IAuthTabCallbackDefault) != 0) {
                return false;
            }
            if (Intrinsics.areEqual(this.onTransact, onextracallbackwithresult.onTransact)) {
                return true;
            }
            int i10 = getInterfaceDescriptor + 57;
            access100 = i10 % 128;
            return i10 % 2 != 0;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 25;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            Bitmap bitmap = this.onWarmupCompleted;
            if (bitmap == null) {
                int i5 = i2 + 5;
                access100 = i5 % 128;
                iHashCode = i5 % 2 != 0 ? 1 : 0;
            } else {
                iHashCode = bitmap.hashCode();
            }
            return (((((((((((((((((iHashCode * 31) + Float.hashCode(this.IAuthTabCallbackStub)) * 31) + Float.hashCode(this.onExtraCallbackWithResult)) * 31) + Float.hashCode(this.asBinder)) * 31) + Float.hashCode(this.IAuthTabCallback)) * 31) + Float.hashCode(this.onNavigationEvent)) * 31) + Float.hashCode(this.asInterface)) * 31) + Float.hashCode(this.onExtraCallback)) * 31) + Float.hashCode(this.IAuthTabCallbackDefault)) * 31) + this.onTransact.hashCode();
        }

        public final onExtraCallbackWithResult onExtraCallback(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull String str) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            onExtraCallbackWithResult onextracallbackwithresult = new onExtraCallbackWithResult(bitmap, f, f2, f3, f4, f5, f6, f7, f8, str);
            int i2 = access100 + 93;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 94 / 0;
            }
            return onextracallbackwithresult;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "BitmapData(bitmap=" + this.onWarmupCompleted + ", width=" + this.IAuthTabCallbackStub + ", height=" + this.onExtraCallbackWithResult + ", scale=" + this.asBinder + ", centerX=" + this.IAuthTabCallback + ", centerY=" + this.onNavigationEvent + ", translationY=" + this.asInterface + ", alpha=" + this.onExtraCallback + ", saturation=" + this.IAuthTabCallbackDefault + ", imageType=" + this.onTransact + ")";
            int i2 = access100 + Imgproc.COLOR_YUV2RGBA_YVYU;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        public onExtraCallbackWithResult(@Nullable Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.onWarmupCompleted = bitmap;
            this.IAuthTabCallbackStub = f;
            this.onExtraCallbackWithResult = f2;
            this.asBinder = f3;
            this.IAuthTabCallback = f4;
            this.onNavigationEvent = f5;
            this.asInterface = f6;
            this.onExtraCallback = f7;
            this.IAuthTabCallbackDefault = f8;
            this.onTransact = str;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ onExtraCallbackWithResult(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            if ((i & 8) != 0) {
                int i2 = getInterfaceDescriptor + 35;
                access100 = i2 % 128;
                int i3 = i2 % 2;
                f9 = 1.0f;
            } else {
                f9 = f3;
            }
            if ((i & 16) != 0) {
                int i4 = getInterfaceDescriptor + 1;
                access100 = i4 % 128;
                f10 = i4 % 2 != 0 ? 2.0f : 0.0f;
            } else {
                f10 = f4;
            }
            if ((i & 32) != 0) {
                int i5 = 2 % 2;
                f11 = 0.0f;
            } else {
                f11 = f5;
            }
            if ((i & 64) != 0) {
                int i6 = access100 + 67;
                getInterfaceDescriptor = i6 % 128;
                int i7 = i6 % 2;
                f12 = 0.0f;
            } else {
                f12 = f6;
            }
            float f14 = (i & 128) != 0 ? 1.0f : f7;
            if ((i & 256) != 0) {
                int i8 = access100 + 115;
                getInterfaceDescriptor = i8 % 128;
                int i9 = 2 % 2;
                f13 = i8 % 2 != 0 ? 1.0f : 0.0f;
            } else {
                f13 = f8;
            }
            this(bitmap, f, f2, f9, f10, f11, f12, f14, f13, str);
        }

        public final float onTransact() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 19;
            int i3 = i2 % 128;
            access100 = i3;
            int i4 = i2 % 2;
            float f = this.IAuthTabCallbackStub;
            int i5 = i3 + 5;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            throw null;
        }

        public final float onWarmupCompleted() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 119;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            float f = this.onExtraCallbackWithResult;
            if (i3 != 0) {
                int i4 = 86 / 0;
            }
            return f;
        }

        private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) objArr[0];
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 119;
            access100 = i2 % 128;
            int i3 = i2 % 2;
            float f = onextracallbackwithresult.asBinder;
            if (i3 == 0) {
                return Float.valueOf(f);
            }
            throw null;
        }

        public final float onExtraCallback() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor;
            int i3 = i2 + 29;
            access100 = i3 % 128;
            int i4 = i3 % 2;
            float f = this.IAuthTabCallback;
            int i5 = i2 + 47;
            access100 = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float onExtraCallbackWithResult() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 111;
            getInterfaceDescriptor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            float f = this.onNavigationEvent;
            int i4 = i2 + 31;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            return f;
        }

        public final float IAuthTabCallbackStub() {
            int i = 2 % 2;
            int i2 = access100 + 1;
            int i3 = i2 % 128;
            getInterfaceDescriptor = i3;
            int i4 = i2 % 2;
            float f = this.asInterface;
            int i5 = i3 + 51;
            access100 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 86 / 0;
            }
            return f;
        }

        public final float onNavigationEvent() {
            int i = 2 % 2;
            int i2 = access100;
            int i3 = i2 + 87;
            getInterfaceDescriptor = i3 % 128;
            int i4 = i3 % 2;
            float f = this.onExtraCallback;
            int i5 = i2 + 5;
            getInterfaceDescriptor = i5 % 128;
            int i6 = i5 % 2;
            return f;
        }

        public final float asBinder() {
            float f;
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + 101;
            int i3 = i2 % 128;
            access100 = i3;
            if (i2 % 2 != 0) {
                f = this.IAuthTabCallbackDefault;
                int i4 = 6 / 0;
            } else {
                f = this.IAuthTabCallbackDefault;
            }
            int i5 = i3 + 49;
            getInterfaceDescriptor = i5 % 128;
            if (i5 % 2 != 0) {
                return f;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String asInterface() {
            int i = 2 % 2;
            int i2 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGB_YVYU;
            access100 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.onTransact;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Bitmap IAuthTabCallback() {
            return (Bitmap) onWarmupCompleted(1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this}, -1458319800, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted());
        }

        public final float IAuthTabCallbackDefault() {
            return ((Float) onWarmupCompleted(-538593590, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), new Object[]{this}, 538593591, LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted(), LoanComparisonResultWarningNoticeView.onWarmupCompleted.onWarmupCompleted())).floatValue();
        }
    }

    public static final class onWarmupCompleted {
        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onWarmupCompleted() {
        }
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[0], 1178779700, -1178779699, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    private static final Unit IAuthTabCallback() {
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        return (Unit) IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), new Object[0], 1413889589, -1413889589, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }

    public final void onExtraCallback(@NotNull String str, float f) {
        Object[] objArr = {this, str, Float.valueOf(f)};
        int iIAuthTabCallback = TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback();
        IAuthTabCallback(TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), objArr, -711309503, 711309505, iIAuthTabCallback, TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback(), TeensManualSelfieNavGraphKt$.ExternalSyntheticLambda4.IAuthTabCallback());
    }
}
