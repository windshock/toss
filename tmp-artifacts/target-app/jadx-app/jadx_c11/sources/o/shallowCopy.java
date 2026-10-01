package o;

import android.content.res.Configuration;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.containsJSONObjectContainingInt;
import o.shallowCopy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class shallowCopy {
    private static int onExtraCallbackWithResult = 1;
    private static int onWarmupCompleted;
    private final containsJSONObjectContainingInt.onExtraCallbackWithResult IAuthTabCallback;

    private static final Unit IAuthTabCallback(shallowCopy shallowcopy, String str, String str2, setByteOrder setbyteorder, setByteOrder setbyteorder2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 75;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        shallowcopy.onNavigationEvent(str, str2, setbyteorder, setbyteorder2, quirksExternalSyntheticBackport0, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 67;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ Unit onExtraCallback(shallowCopy shallowcopy, String str, String str2, setByteOrder setbyteorder, setByteOrder setbyteorder2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 49;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitIAuthTabCallback = IAuthTabCallback(shallowcopy, str, str2, setbyteorder, setbyteorder2, quirksExternalSyntheticBackport0, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallbackWithResult + 35;
        onWarmupCompleted = i7 % 128;
        if (i7 % 2 == 0) {
            return unitIAuthTabCallback;
        }
        throw null;
    }

    public static /* synthetic */ Unit onExtraCallbackWithResult(shallowCopy shallowcopy, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str3, String str4, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onWarmupCompleted + 79;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnNavigationEvent = onNavigationEvent(shallowcopy, str, str2, quirksExternalSyntheticBackport0, str3, str4, function0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        if (i6 == 0) {
            int i7 = 13 / 0;
        }
        int i8 = onExtraCallbackWithResult + 99;
        onWarmupCompleted = i8 % 128;
        int i9 = i8 % 2;
        return unitOnNavigationEvent;
    }

    private static final Unit onNavigationEvent(shallowCopy shallowcopy, String str, String str2, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, String str3, String str4, Function0 function0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onExtraCallbackWithResult + 41;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        shallowcopy.onWarmupCompleted(str, str2, quirksExternalSyntheticBackport0, str3, str4, function0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onWarmupCompleted + 117;
        onExtraCallbackWithResult = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public shallowCopy(@NotNull containsJSONObjectContainingInt.onExtraCallbackWithResult onextracallbackwithresult) {
        Intrinsics.checkNotNullParameter(onextracallbackwithresult, "");
        this.IAuthTabCallback = onextracallbackwithresult;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onWarmupCompleted(@NotNull final String str, @NotNull final String str2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable String str3, @Nullable String str4, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        int i5;
        String str5;
        int i6;
        String str6;
        int i7;
        Function0<Unit> function02;
        final String str7;
        final Function0<Unit> function03;
        final String str8;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        String str9;
        int i8;
        setByteOrder setbyteorderOnNavigationEvent;
        setByteOrder setbyteorderOnNavigationEvent2;
        int i9;
        int i10 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(-966293919);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str2)) {
                int i11 = onExtraCallbackWithResult + 61;
                onWarmupCompleted = i11 % 128;
                int i12 = i11 % 2;
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            int i14 = onWarmupCompleted + 95;
            onExtraCallbackWithResult = i14 % 128;
            i3 = i14 % 2 == 0 ? i3 | 18965 : i3 | 384;
        } else {
            if ((i & 384) == 0) {
                int i15 = onWarmupCompleted + 25;
                onExtraCallbackWithResult = i15 % 128;
                int i16 = i15 % 2;
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i17 = onExtraCallbackWithResult + 47;
                    onWarmupCompleted = i17 % 128;
                    i4 = i17 % 2 != 0 ? 528 : 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str5 = str3;
                    i3 |= !(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str5) ^ true) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str6 = str4;
                        i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str6) ? 16384 : 8192;
                        int i18 = onExtraCallbackWithResult + 95;
                        onWarmupCompleted = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                        if ((i & 196608) == 0) {
                            function02 = function0;
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(function02) ? 131072 : 65536;
                        }
                        if ((1572864 & i) == 0) {
                            i3 |= cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(this) ? 1048576 : 524288;
                        }
                        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
                            int i20 = onExtraCallbackWithResult + 89;
                            onWarmupCompleted = i20 % 128;
                            Object obj = null;
                            if (i20 % 2 != 0) {
                                obj.hashCode();
                                throw null;
                            }
                            QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = i13 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                            if (i5 != 0) {
                                int i21 = onWarmupCompleted + 73;
                                onExtraCallbackWithResult = i21 % 128;
                                int i22 = i21 % 2;
                                str9 = null;
                            } else {
                                str9 = str5;
                            }
                            String str10 = i6 != 0 ? null : str6;
                            Function0<Unit> function04 = i7 != 0 ? null : function02;
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                int i23 = onExtraCallbackWithResult + 113;
                                onWarmupCompleted = i23 % 128;
                                int i24 = i23 % 2;
                                CameraConfigExternalSyntheticLambda0.IAuthTabCallback(-966293919, i3, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.BadgePreset.Badge (TdsAgreementV4RowPresets.kt:313)");
                            }
                            if (str9 == null) {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1990936194);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                setbyteorderOnNavigationEvent = null;
                                i8 = i3;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1990936193);
                                i8 = i3;
                                long jIAuthTabCallback = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, str9, setByteOrder.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                setbyteorderOnNavigationEvent = setByteOrder.onNavigationEvent(jIAuthTabCallback);
                            }
                            if (str10 == null) {
                                int i25 = onExtraCallbackWithResult + 27;
                                onWarmupCompleted = i25 % 128;
                                if (i25 % 2 != 0) {
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1990732834);
                                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                    obj.hashCode();
                                    throw null;
                                }
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1990732834);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                setbyteorderOnNavigationEvent2 = null;
                            } else {
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallbackWithResult(-1990732833);
                                long jIAuthTabCallback2 = getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, str10, setByteOrder.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 390);
                                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallbackDefault();
                                setbyteorderOnNavigationEvent2 = setByteOrder.onNavigationEvent(jIAuthTabCallback2);
                            }
                            onNavigationEvent(str, str2, setbyteorderOnNavigationEvent, setbyteorderOnNavigationEvent2, quirksExternalSyntheticBackport03, function04, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, (i8 & 126) | (57344 & (i8 << 6)) | (458752 & i8) | (3670016 & i8), 0);
                            if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                                CameraConfigExternalSyntheticLambda0.onTransact();
                            }
                            function03 = function04;
                            quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                            str7 = str9;
                            str8 = str10;
                        } else {
                            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
                            str7 = str5;
                            function03 = function02;
                            str8 = str6;
                        }
                        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.BadgePreset$$ExternalSyntheticLambda1
                                private static int onExtraCallback = 0;
                                private static int onWarmupCompleted = 1;

                                public final Object invoke(Object obj2, Object obj3) {
                                    int i26 = 2 % 2;
                                    int i27 = onExtraCallback + 71;
                                    onWarmupCompleted = i27 % 128;
                                    int i28 = i27 % 2;
                                    Unit unitOnExtraCallbackWithResult = shallowCopy.onExtraCallbackWithResult(this.f$0, str, str2, quirksExternalSyntheticBackport02, str7, str8, function03, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                                    int i29 = onWarmupCompleted + 63;
                                    onExtraCallback = i29 % 128;
                                    if (i29 % 2 == 0) {
                                        return unitOnExtraCallbackWithResult;
                                    }
                                    throw null;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    int i26 = onExtraCallbackWithResult + 79;
                    onWarmupCompleted = i26 % 128;
                    int i27 = i26 % 2;
                    function02 = function0;
                    if ((1572864 & i) == 0) {
                    }
                    if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                    if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    }
                }
                str6 = str4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function02 = function0;
                if ((1572864 & i) == 0) {
                }
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                }
            }
            str5 = str3;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            str6 = str4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function02 = function0;
            if ((1572864 & i) == 0) {
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        str5 = str3;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        str6 = str4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function02 = function0;
        if ((1572864 & i) == 0) {
        }
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 599187) != 599186, i3 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 0;
        private static int onExtraCallbackWithResult = 1;
        final /* synthetic */ float $maxFontScale;
        final /* synthetic */ putStringIfValid $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(putStringIfValid putstringifvalid, float f, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$state = putstringifvalid;
            this.$maxFontScale = f;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$state, this.$maxFontScale, access13800Var);
            int i2 = onExtraCallbackWithResult + 55;
            onExtraCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return onwarmupcompleted;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = onExtraCallback + 91;
            onExtraCallbackWithResult = i4 % 128;
            int i5 = i4 % 2;
            return objOnExtraCallback;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onExtraCallbackWithResult + 75;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                return onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 83;
            onExtraCallbackWithResult = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.onNavigationEvent(obj);
            this.$state.onWarmupCompleted(access14000.onExtraCallbackWithResult(this.$maxFontScale));
            Unit unit = Unit.INSTANCE;
            int i3 = onExtraCallbackWithResult + 81;
            onExtraCallback = i3 % 128;
            if (i3 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[PHI: r0
      0x005f: PHI (r0v62 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v63 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003d A[PHI: r0
      0x003d: PHI (r0v2 o.CameraCaptureResultEmptyCameraCaptureResult) = (r0v1 o.CameraCaptureResultEmptyCameraCaptureResult), (r0v63 o.CameraCaptureResultEmptyCameraCaptureResult) binds: [B:8:0x003b, B:5:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNavigationEvent(@NotNull final String str, @NotNull final String str2, @Nullable final setByteOrder setbyteorder, @Nullable final setByteOrder setbyteorder2, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable Function0<Unit> function0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
        int i3;
        int i4;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult2;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i5;
        int i6;
        Function0<Unit> function02;
        int i7;
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult3;
        Function0<Unit> function03;
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        float fIAuthTabCallback;
        int i8;
        int i9 = 2 % 2;
        int i10 = onExtraCallbackWithResult + 43;
        onWarmupCompleted = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(325705811);
            if ((i & 3) == 0) {
                if (!cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(str)) {
                    i3 = 2;
                } else {
                    int i11 = onExtraCallbackWithResult + 55;
                    onWarmupCompleted = i11 % 128;
                    i3 = i11 % 2 != 0 ? 3 : 4;
                }
                i4 = i3 | i;
                int i12 = onExtraCallbackWithResult + 59;
                onWarmupCompleted = i12 % 128;
                int i13 = i12 % 2;
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
            } else {
                cameraCaptureResultEmptyCameraCaptureResult2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback;
                i4 = i;
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(325705811);
            if ((i & 6) == 0) {
            }
        }
        if ((i & 48) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setbyteorder) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            int i14 = onWarmupCompleted + 49;
            onExtraCallbackWithResult = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 59 / 0;
                i8 = cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setbyteorder2) ? 2048 : 1024;
            } else if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(setbyteorder2)) {
            }
            i4 |= i8;
        }
        int i16 = i2 & 16;
        if (i16 != 0) {
            int i17 = onWarmupCompleted + 65;
            onExtraCallbackWithResult = i17 % 128;
            i4 = i17 % 2 == 0 ? i4 | 278 : i4 | 24576;
        } else {
            if ((i & 24576) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i18 = onExtraCallbackWithResult + 125;
                    onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i4 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((i & 196608) == 0) {
                    function02 = function0;
                    i4 |= cameraCaptureResultEmptyCameraCaptureResult2.onExtraCallback(function02) ? 131072 : 65536;
                }
                i7 = i4;
                if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((74899 & i7) != 74898, i7 & 1)) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = i16 != 0 ? QuirksExternalSyntheticBackport0.Companion : quirksExternalSyntheticBackport02;
                    function03 = i6 != 0 ? null : function02;
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.IAuthTabCallback(325705811, i7, -1, "im.toss.tds.compose.component.compound.agreement.v4.row.BadgePreset.Badge (TdsAgreementV4RowPresets.kt:342)");
                    }
                    float fFloatValue = ((Number) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback((accessisMonitoringp) toStringList.onNavigationEvent(813075283, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted(), new Object[0], -813075282, GriverCommonAbilityProxyImpl.onWarmupCompleted(), GriverCommonAbilityProxyImpl.onWarmupCompleted()))).floatValue();
                    float fCoerceAtMost = RangesKt.coerceAtMost(((Configuration) cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(AndroidCompositionLocals_androidKt.onExtraCallbackWithResult())).fontScale, fFloatValue);
                    boolean zIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult2.IAuthTabCallback(fCoerceAtMost);
                    Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResult2.onMinimized();
                    if (zIAuthTabCallback || objOnMinimized == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        if (fCoerceAtMost <= 1.0f) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(4.0f);
                        } else if (fCoerceAtMost <= 1.3f) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(5.0f);
                        } else if (fCoerceAtMost <= 1.5f) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(6.0f);
                        } else if (fCoerceAtMost <= 1.7f) {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(7.0f);
                        } else {
                            fIAuthTabCallback = VirtualCameraControlExternalSyntheticLambda1.IAuthTabCallback(8.0f);
                            int i20 = onWarmupCompleted + 63;
                            onExtraCallbackWithResult = i20 % 128;
                            int i21 = i20 % 2;
                        }
                        objOnMinimized = VirtualCameraControlExternalSyntheticLambda1.onNavigationEvent(fIAuthTabCallback);
                        cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted(objOnMinimized);
                    }
                    float fIAuthTabCallback2 = ((VirtualCameraControlExternalSyntheticLambda1) objOnMinimized).IAuthTabCallback();
                    putStringIfValid putstringifvalidOnNavigationEvent = atLeastOneValueMatch.onNavigationEvent(getMaxAdCount.IAuthTabCallback(MaxAdPlacerExternalSyntheticLambda2.onNavigationEvent, str2, y3ExternalSyntheticLambda0.onExtraCallback.IAuthTabCallback(cameraCaptureResultEmptyCameraCaptureResult2, 6).setEngagementSignalsCallback(), cameraCaptureResultEmptyCameraCaptureResult2, (i7 & 112) | 6), setbyteorder != null ? setbyteorder.access100() : setByteOrder.Companion.IAuthTabCallbackDefault(), setbyteorder2 != null ? setbyteorder2.access100() : setByteOrder.Companion.IAuthTabCallbackDefault(), cameraCaptureResultEmptyCameraCaptureResult2, 0, 0);
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    putStringArray.onWarmupCompleted(str, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.onExtraCallback(quirksExternalSyntheticBackport04, 0.0f, fIAuthTabCallback2, 0.0f, 0.0f, 13, (Object) null), putstringifvalidOnNavigationEvent, function03, cameraCaptureResultEmptyCameraCaptureResult2, (i7 & 14) | ((i7 >> 6) & 7168), 0);
                    boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResult3.onNavigationEvent(putstringifvalidOnNavigationEvent);
                    boolean zIAuthTabCallback2 = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback(fFloatValue);
                    Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResult3.onMinimized();
                    if ((zOnNavigationEvent | zIAuthTabCallback2) || objOnMinimized2 == CameraCaptureResultEmptyCameraCaptureResult.Companion.onExtraCallback()) {
                        objOnMinimized2 = new onWarmupCompleted(putstringifvalidOnNavigationEvent, fFloatValue, null);
                        cameraCaptureResultEmptyCameraCaptureResult3.onWarmupCompleted(objOnMinimized2);
                    }
                    isZslDisabledByByUserCaseConfig.onNavigationEvent(Float.valueOf(fFloatValue), (Function2) objOnMinimized2, cameraCaptureResultEmptyCameraCaptureResult3, 0);
                    if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                    }
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport04;
                } else {
                    cameraCaptureResultEmptyCameraCaptureResult3 = cameraCaptureResultEmptyCameraCaptureResult2;
                    cameraCaptureResultEmptyCameraCaptureResult3.ICustomTabsCallbackStubProxy();
                    function03 = function02;
                    quirksExternalSyntheticBackport03 = quirksExternalSyntheticBackport02;
                }
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
                if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
                    final Function0<Unit> function04 = function03;
                    clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.tds.compose.component.compound.agreement.v4.row.BadgePreset$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj, Object obj2) {
                            int i22 = 2 % 2;
                            int i23 = onNavigationEvent + 93;
                            onExtraCallbackWithResult = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitOnExtraCallback = shallowCopy.onExtraCallback(this.f$0, str, str2, setbyteorder, setbyteorder2, quirksExternalSyntheticBackport03, function04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj, ((Integer) obj2).intValue());
                            int i25 = onExtraCallbackWithResult + 63;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            return unitOnExtraCallback;
                        }
                    });
                    return;
                }
                return;
            }
            int i22 = onExtraCallbackWithResult + 13;
            onWarmupCompleted = i22 % 128;
            if (i22 % 2 != 0) {
                throw null;
            }
            i4 |= 196608;
            function02 = function0;
            i7 = i4;
            if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((74899 & i7) != 74898, i7 & 1)) {
            }
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
            }
        }
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function02 = function0;
        i7 = i4;
        if (cameraCaptureResultEmptyCameraCaptureResult2.onWarmupCompleted((74899 & i7) != 74898, i7 & 1)) {
        }
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResult3.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel != null) {
        }
    }
}
