package o;

import android.opengl.GLES20;
import android.opengl.GLES30;
import im.toss.featurescommon.overseas.company.presentation.screen.ComposableSingletons$OverseasCompanyInfoScreenKt$;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.applyokhttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class accessgetDAY_OF_MONTH_PATTERNcp implements deprecated_path {
    private static int IAuthTabCallbackStubProxy = 0;
    private static int access000 = 1;
    private static int asBinder = 0;
    private static int asInterface = 1;
    private final Map<String, float[]> IAuthTabCallback;
    private final checkLayoutParams<String> IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private final setSelector<String> onExtraCallback;
    private final Map<String, int[]> onNavigationEvent;
    private final checkLayoutParams<String> onTransact;
    private String onWarmupCompleted;
    private static final onNavigationEvent Companion = new onNavigationEvent(null);
    public static final int onExtraCallbackWithResult = 8;

    static {
        int i = asBinder + 7;
        asInterface = i % 128;
        int i2 = i % 2;
    }

    public accessgetDAY_OF_MONTH_PATTERNcp(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.onWarmupCompleted = str;
        this.onTransact = new checkLayoutParams<>(0, 1, (DefaultConstructorMarker) null);
        this.IAuthTabCallbackDefault = new checkLayoutParams<>(0, 1, (DefaultConstructorMarker) null);
        this.onNavigationEvent = new LinkedHashMap();
        this.onExtraCallback = new setSelector<>(0, 1, (DefaultConstructorMarker) null);
        this.IAuthTabCallback = new LinkedHashMap();
        onExtraCallbackWithResult(str2, str3);
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        supportedspec.onWarmupCompleted(supportedspec.onExtraCallback() + 1);
    }

    @Override // o.deprecated_path
    public String onExtraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 67;
        int i3 = i2 % 128;
        access000 = i3;
        int i4 = i2 % 2;
        String str = this.onWarmupCompleted;
        int i5 = i3 + 9;
        IAuthTabCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.deprecated_path
    @Deprecated
    public void onNavigationEvent() {
        supportedSpec supportedspec;
        int iIAuthTabCallback;
        int i = 2 % 2;
        int i2 = access000 + 107;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES20.glUseProgram(this.IAuthTabCallbackStub);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            supportedspec = supportedSpec.onNavigationEvent;
            iIAuthTabCallback = supportedspec.IAuthTabCallback() / 0;
        } else {
            applyokhttp.onWarmupCompleted onwarmupcompleted2 = applyokhttp.Companion;
            GLES20.glUseProgram(this.IAuthTabCallbackStub);
            onwarmupcompleted2.IAuthTabCallback(Unit.INSTANCE);
            supportedspec = supportedSpec.onNavigationEvent;
            iIAuthTabCallback = supportedspec.IAuthTabCallback() + 1;
        }
        supportedspec.IAuthTabCallback(iIAuthTabCallback);
    }

    @Override // o.deprecated_path
    public void onExtraCallbackWithResult(@NotNull deprecated_persistent deprecated_persistentVar) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 89;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(deprecated_persistentVar, "");
        deprecated_persistentVar.onExtraCallback(this);
        int i4 = IAuthTabCallbackStubProxy + 29;
        access000 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.deprecated_path
    public void onExtraCallback() {
        int i = 2 % 2;
        int i2 = access000 + 63;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        GLES20.glUseProgram(0);
        this.IAuthTabCallbackDefault.onExtraCallback();
        this.onNavigationEvent.clear();
        this.onExtraCallback.onNavigationEvent();
        this.IAuthTabCallback.clear();
        int i4 = IAuthTabCallbackStubProxy + 25;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
    }

    @Override // o.deprecated_path
    public void onExtraCallbackWithResult(@NotNull String str, int i) {
        int i2;
        int i3 = 2 % 2;
        int i4 = access000 + 83;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        checkLayoutParams<String> checklayoutparams = this.onTransact;
        int iOnExtraCallbackWithResult = checklayoutparams.onExtraCallbackWithResult(str);
        if (iOnExtraCallbackWithResult >= 0) {
            int i6 = IAuthTabCallbackStubProxy + 61;
            access000 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = ((drawHorizontalDivider) checklayoutparams).onExtraCallbackWithResult[iOnExtraCallbackWithResult];
                throw null;
            }
            i2 = ((drawHorizontalDivider) checklayoutparams).onExtraCallbackWithResult[iOnExtraCallbackWithResult];
        } else {
            int iGlGetUniformBlockIndex = GLES30.glGetUniformBlockIndex(this.IAuthTabCallbackStub, str);
            applyokhttp.onWarmupCompleted.onWarmupCompleted(applyokhttp.Companion, null, 1, null);
            checklayoutparams.onNavigationEvent(str, iGlGetUniformBlockIndex);
            i2 = iGlGetUniformBlockIndex;
        }
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES30.glUniformBlockBinding(this.IAuthTabCallbackStub, i2, i);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        supportedspec.onExtraCallbackWithResult(supportedspec.onWarmupCompleted() + 1);
        int i8 = IAuthTabCallbackStubProxy + 85;
        access000 = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // o.deprecated_path
    public void onWarmupCompleted(@NotNull String str, int i) {
        int i2 = 2 % 2;
        int i3 = access000 + 3;
        IAuthTabCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onNavigationEvent(str, i);
        int i5 = IAuthTabCallbackStubProxy + 125;
        access000 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 40 / 0;
        }
    }

    @Override // o.deprecated_path
    public void IAuthTabCallback(@NotNull String str, @NotNull int[] iArr) {
        int i = 2 % 2;
        int i2 = access000 + 33;
        IAuthTabCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            onExtraCallback(str, iArr);
            int i3 = 55 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(iArr, "");
            onExtraCallback(str, iArr);
        }
        int i4 = IAuthTabCallbackStubProxy + 53;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.deprecated_path
    public void IAuthTabCallback(@NotNull String str, float f) {
        int i = 2 % 2;
        int i2 = access000 + 7;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        onExtraCallbackWithResult(str, f);
        int i4 = access000 + 79;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    @Override // o.deprecated_path
    public void onWarmupCompleted(@NotNull String str, @NotNull excludeChildren excludechildren) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 15;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(excludechildren, "");
        onExtraCallbackWithResult(str, excludechildren);
        int i4 = IAuthTabCallbackStubProxy + 107;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.deprecated_path
    public void onExtraCallbackWithResult(@NotNull String str, @NotNull createSeekController createseekcontroller) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 95;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createseekcontroller, "");
        IAuthTabCallback(str, createseekcontroller);
        int i4 = IAuthTabCallbackStubProxy + 77;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void onNavigationEvent(String str, int i) {
        int i2 = 2 % 2;
        if (this.IAuthTabCallbackDefault.onExtraCallback(str, Integer.MIN_VALUE) != i) {
            int i3 = access000 + 51;
            IAuthTabCallbackStubProxy = i3 % 128;
            int i4 = i3 % 2;
            int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, str);
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES20.glUniform1i(iOnNavigationEvent, i);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            supportedSpec supportedspec = supportedSpec.onNavigationEvent;
            Object[] objArr = {supportedspec, Integer.valueOf(supportedspec.onNavigationEvent() + 1)};
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            supportedSpec.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, objArr);
            this.IAuthTabCallbackDefault.onNavigationEvent(str, i);
            int i5 = access000 + 91;
            IAuthTabCallbackStubProxy = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 % 2;
            }
        }
    }

    private final void onExtraCallback(String str, int[] iArr) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 73;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        if (!Arrays.equals(iArr, this.onNavigationEvent.get(str))) {
            int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, str);
            applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
            GLES20.glUniform1iv(iOnNavigationEvent, iArr.length, iArr, 0);
            onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
            supportedSpec supportedspec = supportedSpec.onNavigationEvent;
            Object[] objArr = {supportedspec, Integer.valueOf(supportedspec.onNavigationEvent() + 1)};
            int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
            supportedSpec.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, objArr);
            this.onNavigationEvent.put(str, iArr);
        }
        int i4 = access000 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void onExtraCallbackWithResult(String str, float f) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 105;
        access000 = i2 % 128;
        if (i2 % 2 == 0) {
            this.onExtraCallback.onExtraCallbackWithResult(str, Float.MIN_VALUE);
            throw null;
        }
        if (this.onExtraCallback.onExtraCallbackWithResult(str, Float.MIN_VALUE) == f) {
            return;
        }
        int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, str);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glUniform1f(iOnNavigationEvent, f);
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        Object[] objArr = {supportedspec, Integer.valueOf(supportedspec.onNavigationEvent() + 1)};
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        supportedSpec.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, objArr);
        this.onExtraCallback.onWarmupCompleted(str, f);
        int i3 = access000 + 7;
        IAuthTabCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 82 / 0;
        }
    }

    private final void onExtraCallbackWithResult(String str, excludeChildren excludechildren) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 23;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, str);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glUniform2f(iOnNavigationEvent, excludechildren.onExtraCallback(), excludechildren.IAuthTabCallback());
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        Object[] objArr = {supportedspec, Integer.valueOf(supportedspec.onNavigationEvent() + 1)};
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        supportedSpec.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, objArr);
        int i4 = IAuthTabCallbackStubProxy + 85;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void IAuthTabCallback(String str, createSeekController createseekcontroller) {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 77;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iOnNavigationEvent = onNavigationEvent(this.IAuthTabCallbackStub, str);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glUniform4f(iOnNavigationEvent, createseekcontroller.onNavigationEvent(), createseekcontroller.onExtraCallback(), createseekcontroller.onExtraCallbackWithResult(), createseekcontroller.onWarmupCompleted());
        onwarmupcompleted.IAuthTabCallback(Unit.INSTANCE);
        supportedSpec supportedspec = supportedSpec.onNavigationEvent;
        Object[] objArr = {supportedspec, Integer.valueOf(supportedspec.onNavigationEvent() + 1)};
        int iOnNavigationEvent2 = ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent();
        supportedSpec.onExtraCallbackWithResult(ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), -1214765033, 1214765033, ComposableSingletons$OverseasCompanyInfoScreenKt$.ExternalSyntheticLambda0.onNavigationEvent(), iOnNavigationEvent2, objArr);
        int i4 = access000 + 39;
        IAuthTabCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.deprecated_path
    public void IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 9;
        access000 = i2 % 128;
        if (i2 % 2 != 0) {
            onExtraCallback();
            GLES20.glDetachShader(this.IAuthTabCallbackStub, 35633);
            GLES20.glDetachShader(this.IAuthTabCallbackStub, 35632);
            GLES20.glDeleteProgram(this.IAuthTabCallbackStub);
            return;
        }
        onExtraCallback();
        GLES20.glDetachShader(this.IAuthTabCallbackStub, 35633);
        GLES20.glDetachShader(this.IAuthTabCallbackStub, 35632);
        GLES20.glDeleteProgram(this.IAuthTabCallbackStub);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
    
        if (r4[0] != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0092, code lost:
    
        android.opengl.GLES20.glDetachShader(r11, r1);
        r2.IAuthTabCallback(r10);
        android.opengl.GLES20.glDetachShader(r11, r7);
        r2.IAuthTabCallback(r10);
        r10 = o.accessgetDAY_OF_MONTH_PATTERNcp.IAuthTabCallbackStubProxy + 33;
        o.accessgetDAY_OF_MONTH_PATTERNcp.access000 = r10 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        if ((r10 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
    
        r10 = null;
        r10.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ae, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00af, code lost:
    
        r10 = android.opengl.GLES20.glGetProgramInfoLog(r11);
        android.opengl.GLES20.glDeleteProgram(r11);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
    
        throw new java.lang.IllegalStateException(r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0073, code lost:
    
        if (r4[1] != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void onExtraCallbackWithResult(String str, String str2) {
        int iGlCreateProgram;
        int i = 2 % 2;
        int iGlCreateShader = GLES20.glCreateShader(35633);
        applyokhttp.onWarmupCompleted onwarmupcompleted = applyokhttp.Companion;
        GLES20.glShaderSource(iGlCreateShader, str);
        Unit unit = Unit.INSTANCE;
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glCompileShader(iGlCreateShader);
        onwarmupcompleted.IAuthTabCallback(unit);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            Intrinsics.checkNotNull(strGlGetShaderInfoLog);
            throw new IllegalStateException(strGlGetShaderInfoLog.toString());
        }
        int i2 = access000 + 91;
        IAuthTabCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glCompileShader(iGlCreateShader2);
        onwarmupcompleted.IAuthTabCallback(unit);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String strGlGetShaderInfoLog2 = GLES20.glGetShaderInfoLog(iGlCreateShader2);
            GLES20.glDeleteShader(iGlCreateShader2);
            Intrinsics.checkNotNull(strGlGetShaderInfoLog2);
            throw new IllegalStateException(strGlGetShaderInfoLog2.toString());
        }
        int i4 = IAuthTabCallbackStubProxy + 71;
        access000 = i4 % 128;
        if (i4 % 2 == 0) {
            iGlCreateProgram = GLES20.glCreateProgram();
            this.IAuthTabCallbackStub = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
            onwarmupcompleted.IAuthTabCallback(unit);
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
            onwarmupcompleted.IAuthTabCallback(unit);
            GLES20.glLinkProgram(iGlCreateProgram);
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        } else {
            iGlCreateProgram = GLES20.glCreateProgram();
            this.IAuthTabCallbackStub = iGlCreateProgram;
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
            onwarmupcompleted.IAuthTabCallback(unit);
            GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
            onwarmupcompleted.IAuthTabCallback(unit);
            GLES20.glLinkProgram(iGlCreateProgram);
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        }
    }

    public boolean equals(@Nullable Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = IAuthTabCallbackStubProxy + 73;
            access000 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (Intrinsics.areEqual(accessgetDAY_OF_MONTH_PATTERNcp.class, obj != null ? obj.getClass() : null)) {
            Intrinsics.checkNotNull(obj, "");
            if (this.IAuthTabCallbackStub != ((accessgetDAY_OF_MONTH_PATTERNcp) obj).IAuthTabCallbackStub) {
                return false;
            }
            int i4 = IAuthTabCallbackStubProxy + 41;
            access000 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = IAuthTabCallbackStubProxy + 113;
        access000 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = IAuthTabCallbackStubProxy + 1;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = Integer.hashCode(this.IAuthTabCallbackStub);
        int i4 = IAuthTabCallbackStubProxy + 83;
        access000 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "OpenGLShader('" + this.onWarmupCompleted + ":" + this.IAuthTabCallbackStub + "')";
        int i2 = IAuthTabCallbackStubProxy + 51;
        access000 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    static final class onNavigationEvent {
        public /* synthetic */ onNavigationEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onNavigationEvent() {
        }
    }

    private final int onNavigationEvent(int i, String str) {
        int i2;
        int i3 = 2 % 2;
        checkLayoutParams<String> checklayoutparams = this.onTransact;
        int iOnExtraCallbackWithResult = checklayoutparams.onExtraCallbackWithResult(str);
        Object obj = null;
        if (iOnExtraCallbackWithResult < 0) {
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
            applyokhttp.onWarmupCompleted.onWarmupCompleted(applyokhttp.Companion, null, 1, null);
            checklayoutparams.onNavigationEvent(str, iGlGetUniformLocation);
            return iGlGetUniformLocation;
        }
        int i4 = access000 + 111;
        IAuthTabCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            i2 = ((drawHorizontalDivider) checklayoutparams).onExtraCallbackWithResult[iOnExtraCallbackWithResult];
            int i5 = 96 / 0;
        } else {
            i2 = ((drawHorizontalDivider) checklayoutparams).onExtraCallbackWithResult[iOnExtraCallbackWithResult];
        }
        int i6 = IAuthTabCallbackStubProxy + 73;
        access000 = i6 % 128;
        if (i6 % 2 != 0) {
            return i2;
        }
        obj.hashCode();
        throw null;
    }
}
