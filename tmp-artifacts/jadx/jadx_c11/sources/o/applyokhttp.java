package o;

import android.content.Context;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class applyokhttp {
    public static final onWarmupCompleted Companion = new onWarmupCompleted(null);
    private static int IAuthTabCallback = 0;
    private static int onExtraCallbackWithResult = 1;

    static {
        int i = onExtraCallbackWithResult + 41;
        IAuthTabCallback = i % 128;
        int i2 = i % 2;
    }

    public static final class onWarmupCompleted {
        private static int IAuthTabCallback = 0;
        private static int onExtraCallback = 1;

        public /* synthetic */ onWarmupCompleted(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void IAuthTabCallback(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 27;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (i3 != 0) {
                int i4 = 56 / 0;
            }
            int i5 = IAuthTabCallback + 125;
            onExtraCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void IAuthTabCallback(@NotNull Unit unit) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 17;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(unit, "");
            if (i3 != 0) {
                int i4 = 69 / 0;
            }
            int i5 = onExtraCallback + 89;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        public final void onWarmupCompleted(@NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 59;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (i3 == 0) {
                int i4 = 47 / 0;
            }
            int i5 = IAuthTabCallback + 77;
            onExtraCallback = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        private onWarmupCompleted() {
        }

        public final int onExtraCallback(@NotNull Context context, @NotNull String str, @NotNull String str2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 95;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            int iOnNavigationEvent = onNavigationEvent(35633, onExtraCallbackWithResult(context, str));
            int iOnNavigationEvent2 = onNavigationEvent(35632, onExtraCallbackWithResult(context, str2));
            int iGlCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(iGlCreateProgram, iOnNavigationEvent);
            GLES20.glAttachShader(iGlCreateProgram, iOnNavigationEvent2);
            GLES20.glLinkProgram(iGlCreateProgram);
            int i4 = IAuthTabCallback + 103;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return iGlCreateProgram;
        }

        private final String onExtraCallbackWithResult(Context context, String str) throws IOException {
            int i = 2 % 2;
            InputStream inputStreamOpen = context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, (Throwable) null);
                int i2 = IAuthTabCallback + 21;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                return text;
            } finally {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[PHI: r6
          0x003a: PHI (r6v2 int) = (r6v1 int), (r6v5 int) binds: [B:8:0x0038, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final int onNavigationEvent(int i, String str) {
            int iGlCreateShader;
            int i2 = 2 % 2;
            int i3 = IAuthTabCallback + 7;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                iGlCreateShader = GLES20.glCreateShader(i);
                GLES20.glShaderSource(iGlCreateShader, str);
                GLES20.glCompileShader(iGlCreateShader);
                int[] iArr = new int[1];
                GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 1);
                if (iArr[0] == 0) {
                    GLES20.glDeleteShader(iGlCreateShader);
                }
            } else {
                iGlCreateShader = GLES20.glCreateShader(i);
                GLES20.glShaderSource(iGlCreateShader, str);
                GLES20.glCompileShader(iGlCreateShader);
                int[] iArr2 = new int[1];
                GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr2, 0);
                if (iArr2[0] == 0) {
                }
            }
            int i4 = onExtraCallback + 125;
            IAuthTabCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return iGlCreateShader;
            }
            throw null;
        }

        public final boolean onWarmupCompleted() {
            EGL10 egl10;
            int i = 2 % 2;
            EGL egl = EGLContext.getEGL();
            if (!(egl instanceof EGL10)) {
                egl10 = null;
            } else {
                int i2 = onExtraCallback + 113;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                egl10 = (EGL10) egl;
            }
            if (egl10 == null || Intrinsics.areEqual(egl10.eglGetCurrentContext(), EGL10.EGL_NO_CONTEXT)) {
                return false;
            }
            int i4 = IAuthTabCallback + 119;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public static /* synthetic */ void onWarmupCompleted(onWarmupCompleted onwarmupcompleted, Unit unit, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = onExtraCallback + 31;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                unit = Unit.INSTANCE;
                int i5 = onExtraCallback + 77;
                IAuthTabCallback = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 % 3;
                }
            }
            onwarmupcompleted.IAuthTabCallback(unit);
        }
    }
}
