package o;

import androidx.compose.runtime.RecomposeScopeImplKt;
import com.facebook.internal.ICustomTabsCallbackStubProxy;
import im.toss.ads_sdk.NativeAdsManager;
import im.toss.ads_sdk.remote.model.SdkTemplate;
import im.toss.core.webkit.bridge.accessarybutton.IconDoubleAccessoryButtonConfiguration;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.CameraCaptureResultEmptyCameraCaptureResult;
import o.WebViewCompatExternalSyntheticLambda0;
import o.WebViewCompatExternalSyntheticLambda1;
import o.dispatchOnPageScrolled;
import o.toPreviewOnlyRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class WebViewCompatExternalSyntheticLambda0 {
    private static int onExtraCallback = 1;
    private static int onNavigationEvent;

    public static /* synthetic */ Unit IAuthTabCallback(getBacktraceNote getbacktracenote, onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 13;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getbacktracenote, onpagescrollstatechanged, quirksExternalSyntheticBackport0, i, i2, cameraCaptureResultEmptyCameraCaptureResult, i3);
        int i7 = onExtraCallback + 71;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unitOnExtraCallbackWithResult;
    }

    public static /* synthetic */ Unit IAuthTabCallback(onPageScrollStateChanged onpagescrollstatechanged, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(onpagescrollstatechanged, findresandmsg, getsupportedhighspeedresolutionsfor);
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        int i5 = onNavigationEvent + 7;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return unitOnExtraCallback;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        ProfileStore profileStore = (ProfileStore) objArr[1];
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 == 0) {
            return Boolean.valueOf(asBinder(getsupportedhighspeedresolutionsfor, profileStore));
        }
        asBinder(getsupportedhighspeedresolutionsfor, profileStore);
        throw null;
    }

    public static /* synthetic */ boolean onExtraCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 77;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        boolean zIAuthTabCallback = IAuthTabCallback(getsupportedhighspeedresolutionsfor, profileStore);
        if (i3 != 0) {
            int i4 = 75 / 0;
        }
        return zIAuthTabCallback;
    }

    private static final Unit onExtraCallbackWithResult(getBacktraceNote getbacktracenote, onPageScrollStateChanged onpagescrollstatechanged, QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, int i, int i2, CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, int i3) {
        int i4 = 2 % 2;
        int i5 = onNavigationEvent + 99;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        onExtraCallback(getbacktracenote, onpagescrollstatechanged, quirksExternalSyntheticBackport0, cameraCaptureResultEmptyCameraCaptureResult, RecomposeScopeImplKt.onExtraCallbackWithResult(i | 1), i2);
        Unit unit = Unit.INSTANCE;
        int i7 = onExtraCallback + 101;
        onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        return unit;
    }

    public static /* synthetic */ boolean onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 27;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        boolean zBooleanValue = ((Boolean) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, profileStore}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, 1253295077, ICustomTabsCallbackStubProxy.onExtraCallback(), -1253295077)).booleanValue();
        int i4 = onNavigationEvent + 1;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public static /* synthetic */ Object onWarmupCompleted(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i11 = ~i3;
        int i12 = (~(i11 | i8 | i4)) | (~(i7 | i11 | i6));
        int i13 = i4 + i6 + i2 + ((-195996979) * i5) + ((-904719387) * i);
        int i14 = i13 * i13;
        int i15 = (i4 * 1886715248) + 940376064 + (1886715248 * i6) + (i10 * (-42925423)) + (i9 * (-42925423)) + ((-42925423) * i12) + (1843789824 * i2) + ((-1389494272) * i5) + (1623064576 * i) + (1510801408 * i14);
        int i16 = (i4 * 1590984816) + 1398186415 + (i6 * 1590984816) + (i10 * 737) + (i9 * 737) + (i12 * 737) + (i2 * 1590985553) + (i5 * (-1025631779)) + (i * 1121679989) + (i14 * 622657536);
        return i15 + ((i16 * i16) * (-1928134656)) != 1 ? IAuthTabCallback(objArr) : onExtraCallback(objArr);
    }

    public static /* synthetic */ Unit onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function0 function0, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 95;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallbackWithResult = onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, function0, webViewCompatExternalSyntheticLambda1);
        int i4 = onNavigationEvent + 11;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallbackWithResult;
    }

    private static final Unit onExtraCallback(onPageScrollStateChanged onpagescrollstatechanged, findResAndMsg findresandmsg, getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 111;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        onNavigationEvent(onpagescrollstatechanged, findresandmsg, getsupportedhighspeedresolutionsfor);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return unit;
    }

    static final class onWarmupCompleted extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int IAuthTabCallback = 1;
        private static int onExtraCallback;
        final /* synthetic */ Function0<Unit> $fireCard;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        onWarmupCompleted(Function0<Unit> function0, access13800<? super onWarmupCompleted> access13800Var) {
            super(2, access13800Var);
            this.$fireCard = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(this.$fireCard, access13800Var);
            int i2 = IAuthTabCallback + 59;
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
            int i2 = IAuthTabCallback + 39;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallback = onExtraCallback((findResAndMsg) obj, (access13800) obj2);
            int i4 = IAuthTabCallback + 63;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                return objOnExtraCallback;
            }
            throw null;
        }

        public final Object onExtraCallback(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            Object objInvokeSuspend;
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 77;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            onWarmupCompleted onwarmupcompletedCreate = create(findresandmsg, access13800Var);
            if (i3 != 0) {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
                int i4 = 22 / 0;
            } else {
                objInvokeSuspend = onwarmupcompletedCreate.invokeSuspend(Unit.INSTANCE);
            }
            int i5 = onExtraCallback + 115;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 5;
            int i3 = i2 % 128;
            IAuthTabCallback = i3;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                throw null;
            }
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = i3 + 3;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.onNavigationEvent(obj);
            if (i5 == 0) {
                this.$fireCard.invoke();
                return Unit.INSTANCE;
            }
            this.$fireCard.invoke();
            Unit unit = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }
    }

    static final class IAuthTabCallback extends SuspendLambda implements Function2<findResAndMsg, access13800<? super Unit>, Object> {
        private static int onExtraCallback = 1;
        private static int onWarmupCompleted;
        final /* synthetic */ Function0<Unit> $fireCard;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IAuthTabCallback(Function0<Unit> function0, access13800<? super IAuthTabCallback> access13800Var) {
            super(2, access13800Var);
            this.$fireCard = function0;
        }

        public final access13800<Unit> create(Object obj, access13800<?> access13800Var) {
            int i = 2 % 2;
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.$fireCard, access13800Var);
            int i2 = onWarmupCompleted + 39;
            onExtraCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return iAuthTabCallback;
            }
            throw null;
        }

        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 37;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnExtraCallbackWithResult = onExtraCallbackWithResult((findResAndMsg) obj, (access13800) obj2);
            int i4 = onWarmupCompleted + 81;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 96 / 0;
            }
            return objOnExtraCallbackWithResult;
        }

        public final Object onExtraCallbackWithResult(findResAndMsg findresandmsg, access13800<? super Unit> access13800Var) {
            int i = 2 % 2;
            int i2 = onWarmupCompleted + 15;
            onExtraCallback = i2 % 128;
            int i3 = i2 % 2;
            IAuthTabCallback iAuthTabCallbackCreate = create(findresandmsg, access13800Var);
            if (i3 == 0) {
                iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = iAuthTabCallbackCreate.invokeSuspend(Unit.INSTANCE);
            int i4 = onWarmupCompleted + 49;
            onExtraCallback = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = onExtraCallback + 119;
            onWarmupCompleted = i2 % 128;
            int i3 = i2 % 2;
            Object objOnWarmupCompleted = access14300.onWarmupCompleted();
            int i4 = this.label;
            if (i4 != 0) {
                int i5 = onWarmupCompleted + 95;
                onExtraCallback = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.onNavigationEvent(obj);
            } else {
                ResultKt.onNavigationEvent(obj);
                this.label = 1;
                if (formatMsgs.onWarmupCompleted(400L, this) == objOnWarmupCompleted) {
                    return objOnWarmupCompleted;
                }
            }
            this.$fireCard.invoke();
            Unit unit = Unit.INSTANCE;
            int i6 = onExtraCallback + 27;
            onWarmupCompleted = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }
    }

    private static final Unit onExtraCallbackWithResult(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, Function0 function0, WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 55;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(webViewCompatExternalSyntheticLambda1, "");
        getsupportedhighspeedresolutionsfor.IAuthTabCallback(webViewCompatExternalSyntheticLambda1);
        function0.invoke();
        Unit unit = Unit.INSTANCE;
        int i4 = onExtraCallback + 107;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void onExtraCallback(@NotNull final getBacktraceNote<? super onPageScrollStateChanged, ? super CameraCaptureResultEmptyCameraCaptureResult, ? super Integer, Unit> getbacktracenote, @NotNull final onPageScrollStateChanged onpagescrollstatechanged, @Nullable QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0, @Nullable CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResult, final int i, final int i2) {
        int i3;
        QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport02;
        int i4;
        clearAllCameraStateObserverslambda19lambda18 clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel;
        boolean zBooleanValue;
        Function0<Boolean> function0IAuthTabCallbackDefault;
        int i5;
        int i6 = 2 % 2;
        Intrinsics.checkNotNullParameter(getbacktracenote, "");
        Intrinsics.checkNotNullParameter(onpagescrollstatechanged, "");
        CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback = cameraCaptureResultEmptyCameraCaptureResult.IAuthTabCallback(1093506061);
        if ((i & 6) == 0) {
            i3 = (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(getbacktracenote) ? 4 : 2) | i;
        } else {
            int i7 = onNavigationEvent + 61;
            onExtraCallback = i7 % 128;
            int i8 = i7 % 2;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i9 = onExtraCallback + 41;
            onNavigationEvent = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 66 / 0;
                i5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged) ? 32 : 16;
            } else if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged)) {
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(quirksExternalSyntheticBackport02)) {
                    int i12 = onNavigationEvent + 1;
                    onExtraCallback = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackStubProxy();
            } else {
                if (i11 != 0) {
                    QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport03 = QuirksExternalSyntheticBackport0.Companion;
                    int i14 = onNavigationEvent + 59;
                    onExtraCallback = i14 % 128;
                    int i15 = i14 % 2;
                    quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport03;
                }
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    CameraConfigExternalSyntheticLambda0.IAuthTabCallback(1093506061, i3, -1, "im.toss.ads_sdk.ui.compose.NativeAdsRendered (NativeAdsRenderedContent.kt:31)");
                    int i16 = onNavigationEvent + 51;
                    onExtraCallback = i16 % 128;
                    if (i16 % 2 == 0) {
                        int i17 = 5 / 2;
                    }
                }
                Object objOnMinimized = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                CameraCaptureResultEmptyCameraCaptureResult.onWarmupCompleted onwarmupcompleted = CameraCaptureResultEmptyCameraCaptureResult.Companion;
                if (objOnMinimized == onwarmupcompleted.onExtraCallback()) {
                    int i18 = onExtraCallback + 37;
                    onNavigationEvent = i18 % 128;
                    if (i18 % 2 != 0) {
                        cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback));
                        throw null;
                    }
                    objOnMinimized = isZslDisabledByByUserCaseConfig.IAuthTabCallback(access13600.IAuthTabCallback, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized);
                }
                final findResAndMsg findresandmsg = (findResAndMsg) objOnMinimized;
                boolean zOnNavigationEvent = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(onpagescrollstatechanged);
                Object objOnMinimized2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent || objOnMinimized2 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized2 = CameraPresenceProviderExternalSyntheticLambda2.onWarmupCompleted(new WebViewCompatExternalSyntheticLambda1(false, false, false, 7, null), (CameraPresenceProviderExternalSyntheticLambda0) null, 2, (Object) null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized2);
                }
                final getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objOnMinimized2;
                boolean zOnExtraCallback = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(onpagescrollstatechanged);
                boolean zOnExtraCallback2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onExtraCallback(findresandmsg);
                boolean zOnNavigationEvent2 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                Object objOnMinimized3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnExtraCallback | zOnExtraCallback2 | zOnNavigationEvent2) || objOnMinimized3 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized3 = new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda0
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i19 = 2 % 2;
                            int i20 = onExtraCallbackWithResult + 75;
                            onNavigationEvent = i20 % 128;
                            int i21 = i20 % 2;
                            Unit unitIAuthTabCallback = WebViewCompatExternalSyntheticLambda0.IAuthTabCallback(onpagescrollstatechanged, findresandmsg, getsupportedhighspeedresolutionsfor);
                            int i22 = onNavigationEvent + 31;
                            onExtraCallbackWithResult = i22 % 128;
                            if (i22 % 2 == 0) {
                                int i23 = 76 / 0;
                            }
                            return unitIAuthTabCallback;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized3);
                }
                final Function0 function0 = (Function0) objOnMinimized3;
                ProfileStore profileStoreOnWarmupCompleted = onpagescrollstatechanged.onWarmupCompleted();
                if (profileStoreOnWarmupCompleted == null || (function0IAuthTabCallbackDefault = profileStoreOnWarmupCompleted.IAuthTabCallbackDefault()) == null) {
                    zBooleanValue = false;
                } else {
                    int i19 = onExtraCallback + 117;
                    onNavigationEvent = i19 % 128;
                    int i20 = i19 % 2;
                    zBooleanValue = ((Boolean) function0IAuthTabCallbackDefault.invoke()).booleanValue();
                }
                boolean zOnNavigationEvent3 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function0);
                Object objOnMinimized4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent3 || objOnMinimized4 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized4 = new onWarmupCompleted(function0, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized4);
                }
                int i21 = (i3 >> 3) & 14;
                isZslDisabledByByUserCaseConfig.onExtraCallback(onpagescrollstatechanged, Boolean.valueOf(zBooleanValue), (Function2) objOnMinimized4, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i21);
                boolean zOnNavigationEvent4 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function0);
                Object objOnMinimized5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if (zOnNavigationEvent4 || objOnMinimized5 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized5 = new IAuthTabCallback(function0, null);
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized5);
                }
                isZslDisabledByByUserCaseConfig.onNavigationEvent(onpagescrollstatechanged, (Function2) objOnMinimized5, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, i21);
                boolean zOnNavigationEvent5 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(getsupportedhighspeedresolutionsfor);
                boolean zOnNavigationEvent6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onNavigationEvent(function0);
                Object objOnMinimized6 = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onMinimized();
                if ((zOnNavigationEvent5 | zOnNavigationEvent6) || objOnMinimized6 == onwarmupcompleted.onExtraCallback()) {
                    objOnMinimized6 = new Function1() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda1
                        private static int IAuthTabCallback = 0;
                        private static int onNavigationEvent = 1;

                        public final Object invoke(Object obj) {
                            int i22 = 2 % 2;
                            int i23 = onNavigationEvent + 41;
                            IAuthTabCallback = i23 % 128;
                            int i24 = i23 % 2;
                            Unit unitOnWarmupCompleted = WebViewCompatExternalSyntheticLambda0.onWarmupCompleted(getsupportedhighspeedresolutionsfor, function0, (WebViewCompatExternalSyntheticLambda1) obj);
                            int i25 = IAuthTabCallback + 1;
                            onNavigationEvent = i25 % 128;
                            int i26 = i25 % 2;
                            return unitOnWarmupCompleted;
                        }
                    };
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(objOnMinimized6);
                }
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnExtraCallback = PageImplExternalSyntheticLambda0.onExtraCallback(quirksExternalSyntheticBackport02, onpagescrollstatechanged, (Function1) objOnMinimized6, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, ((i3 >> 6) & 14) | (i3 & 112));
                component5 component5VarOnWarmupCompleted = FocusMeteringControlExternalSyntheticLambda3.onWarmupCompleted(QuirkSettingsLoader.Companion.access100(), false);
                int iHashCode = Long.hashCode(getAwbState.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, 0));
                CameraConfigProviderExternalSyntheticLambda0 cameraConfigProviderExternalSyntheticLambda0WriteTypedObject = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.writeTypedObject();
                QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport0OnWarmupCompleted = resolveQuirkNames.onWarmupCompleted(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, quirksExternalSyntheticBackport0OnExtraCallback);
                toPreviewOnlyRange.onExtraCallbackWithResult onextracallbackwithresult = toPreviewOnlyRange.Companion;
                Function0 function0IAuthTabCallback = onextracallbackwithresult.IAuthTabCallback();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.access100() == null) {
                    int i22 = onNavigationEvent + 57;
                    onExtraCallback = i22 % 128;
                    if (i22 % 2 == 0) {
                        getAwbState.onExtraCallback();
                        int i23 = 57 / 0;
                    } else {
                        getAwbState.onExtraCallback();
                    }
                }
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onUnminimized();
                if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onActivityLayout()) {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted(function0IAuthTabCallback);
                } else {
                    cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.ICustomTabsCallbackDefault();
                }
                CameraCaptureResultEmptyCameraCaptureResult cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult = CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback);
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, component5VarOnWarmupCompleted, onextracallbackwithresult.asBinder());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, cameraConfigProviderExternalSyntheticLambda0WriteTypedObject, onextracallbackwithresult.asInterface());
                CameraProviderInitRetryPolicy1.onExtraCallbackWithResult(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, Integer.valueOf(iHashCode), onextracallbackwithresult.onWarmupCompleted());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, onextracallbackwithresult.onNavigationEvent());
                CameraProviderInitRetryPolicy1.onNavigationEvent(cameraCaptureResultEmptyCameraCaptureResultOnExtraCallbackWithResult, quirksExternalSyntheticBackport0OnWarmupCompleted, onextracallbackwithresult.onTransact());
                HighSpeedResolverExternalSyntheticLambda1 highSpeedResolverExternalSyntheticLambda1 = HighSpeedResolverExternalSyntheticLambda1.IAuthTabCallback;
                getbacktracenote.invoke(onpagescrollstatechanged, cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback, Integer.valueOf(((i3 << 3) & 112) | i21));
                cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.asInterface();
                if (CameraConfigExternalSyntheticLambda0.asBinder()) {
                    int i24 = onNavigationEvent + 75;
                    onExtraCallback = i24 % 128;
                    if (i24 % 2 == 0) {
                        CameraConfigExternalSyntheticLambda0.onTransact();
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    CameraConfigExternalSyntheticLambda0.onTransact();
                }
            }
            final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport04 = quirksExternalSyntheticBackport02;
            clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
            if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
                clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel.onExtraCallback(new Function2() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda2
                    private static int onExtraCallbackWithResult = 1;
                    private static int onNavigationEvent;

                    public final Object invoke(Object obj2, Object obj3) {
                        int i25 = 2 % 2;
                        int i26 = onExtraCallbackWithResult + 63;
                        onNavigationEvent = i26 % 128;
                        if (i26 % 2 == 0) {
                            return WebViewCompatExternalSyntheticLambda0.IAuthTabCallback(getbacktracenote, onpagescrollstatechanged, quirksExternalSyntheticBackport04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        }
                        WebViewCompatExternalSyntheticLambda0.IAuthTabCallback(getbacktracenote, onpagescrollstatechanged, quirksExternalSyntheticBackport04, i, i2, (CameraCaptureResultEmptyCameraCaptureResult) obj2, ((Integer) obj3).intValue());
                        throw null;
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        quirksExternalSyntheticBackport02 = quirksExternalSyntheticBackport0;
        if (cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.onWarmupCompleted((i3 & 147) != 146, i3 & 1)) {
        }
        final QuirksExternalSyntheticBackport0 quirksExternalSyntheticBackport042 = quirksExternalSyntheticBackport02;
        clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel = cameraCaptureResultEmptyCameraCaptureResultIAuthTabCallback.IAuthTabCallback_Parcel();
        if (clearallcamerastateobserverslambda19lambda18IAuthTabCallback_Parcel == null) {
        }
    }

    private static final void onNavigationEvent(onPageScrollStateChanged onpagescrollstatechanged, findResAndMsg findresandmsg, final getSupportedHighSpeedResolutionsFor<WebViewCompatExternalSyntheticLambda1> getsupportedhighspeedresolutionsfor) {
        SdkTemplate sdkTemplateIAuthTabCallbackStub;
        int i = 2 % 2;
        int i2 = onExtraCallback + 51;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        final ProfileStore profileStoreOnWarmupCompleted = onpagescrollstatechanged.onWarmupCompleted();
        if (profileStoreOnWarmupCompleted != null) {
            int i4 = onNavigationEvent + 7;
            onExtraCallback = i4 % 128;
            if (i4 % 2 == 0) {
                sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
                int i5 = 68 / 0;
                if (sdkTemplateIAuthTabCallbackStub == null) {
                    return;
                }
            } else {
                sdkTemplateIAuthTabCallbackStub = onpagescrollstatechanged.IAuthTabCallbackStub();
                if (sdkTemplateIAuthTabCallbackStub == null) {
                    return;
                }
            }
            NativeAdsManager nativeAdsManagerOnExtraCallbackWithResult = profileStoreOnWarmupCompleted.onExtraCallbackWithResult();
            if (nativeAdsManagerOnExtraCallbackWithResult != null) {
                int i6 = onNavigationEvent + 67;
                onExtraCallback = i6 % 128;
                int i7 = i6 % 2;
                calculatePageOffsets calculatepageoffsetsOnExtraCallbackWithResult = nativeAdsManagerOnExtraCallbackWithResult.onExtraCallbackWithResult();
                if (calculatepageoffsetsOnExtraCallbackWithResult != null) {
                    Object[] objArr = {calculatepageoffsetsOnExtraCallbackWithResult, findresandmsg, profileStoreOnWarmupCompleted.IAuthTabCallback(), dispatchOnPageScrolled.onNavigationEvent.IAuthTabCallback(dispatchOnPageSelected.onExtraCallback(sdkTemplateIAuthTabCallbackStub)), "card", new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda3
                        private static int onExtraCallbackWithResult = 0;
                        private static int onWarmupCompleted = 1;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onWarmupCompleted + 119;
                            onExtraCallbackWithResult = i9 % 128;
                            int i10 = i9 % 2;
                            Boolean boolValueOf = Boolean.valueOf(WebViewCompatExternalSyntheticLambda0.onExtraCallbackWithResult(getsupportedhighspeedresolutionsfor, profileStoreOnWarmupCompleted));
                            int i11 = onExtraCallbackWithResult + 81;
                            onWarmupCompleted = i11 % 128;
                            int i12 = i11 % 2;
                            return boolValueOf;
                        }
                    }, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda4
                        private static int onExtraCallbackWithResult = 1;
                        private static int onNavigationEvent;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onNavigationEvent + 115;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 == 0) {
                                Boolean.valueOf(WebViewCompatExternalSyntheticLambda0.onExtraCallback(getsupportedhighspeedresolutionsfor, profileStoreOnWarmupCompleted));
                                throw null;
                            }
                            Boolean boolValueOf = Boolean.valueOf(WebViewCompatExternalSyntheticLambda0.onExtraCallback(getsupportedhighspeedresolutionsfor, profileStoreOnWarmupCompleted));
                            int i10 = onExtraCallbackWithResult + 23;
                            onNavigationEvent = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 35 / 0;
                            }
                            return boolValueOf;
                        }
                    }, new Function0() { // from class: im.toss.ads_sdk.ui.compose.NativeAdsRenderedContentKt$$ExternalSyntheticLambda5
                        private static int IAuthTabCallback = 1;
                        private static int onExtraCallbackWithResult;

                        public final Object invoke() {
                            int i8 = 2 % 2;
                            int i9 = onExtraCallbackWithResult + 77;
                            IAuthTabCallback = i9 % 128;
                            int i10 = i9 % 2;
                            Object[] objArr2 = {getsupportedhighspeedresolutionsfor, profileStoreOnWarmupCompleted};
                            int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
                            Boolean boolValueOf = Boolean.valueOf(((Boolean) WebViewCompatExternalSyntheticLambda0.onWarmupCompleted(objArr2, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, -1771338806, ICustomTabsCallbackStubProxy.onExtraCallback(), 1771338807)).booleanValue());
                            int i11 = IAuthTabCallback + 65;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                return boolValueOf;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }};
                    int iOnNavigationEvent = IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent();
                    calculatePageOffsets.onNavigationEvent(IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), objArr, 13907675, -13907655, IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), IconDoubleAccessoryButtonConfiguration.Companion.onNavigationEvent(), iOnNavigationEvent);
                    int i8 = onExtraCallback + 71;
                    onNavigationEvent = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor = (getSupportedHighSpeedResolutionsFor) objArr[0];
        ProfileStore profileStore = (ProfileStore) objArr[1];
        int i = 2 % 2;
        if (((WebViewCompatExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult()).onExtraCallbackWithResult() && ((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue()) {
            int i2 = onExtraCallback + 5;
            onNavigationEvent = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = onExtraCallback + 105;
        onNavigationEvent = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    private static final boolean IAuthTabCallback(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 17;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 == 0) {
            webViewCompatExternalSyntheticLambda1.IAuthTabCallback();
            throw null;
        }
        if (webViewCompatExternalSyntheticLambda1.IAuthTabCallback() && !(!((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue())) {
            return true;
        }
        int i4 = onNavigationEvent + 51;
        onExtraCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
        return false;
    }

    private static final boolean asBinder(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 31;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        WebViewCompatExternalSyntheticLambda1 webViewCompatExternalSyntheticLambda1 = (WebViewCompatExternalSyntheticLambda1) getsupportedhighspeedresolutionsfor.onExtraCallbackWithResult();
        if (i3 != 0) {
            webViewCompatExternalSyntheticLambda1.onExtraCallback();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!webViewCompatExternalSyntheticLambda1.onExtraCallback() || (!((Boolean) profileStore.IAuthTabCallbackDefault().invoke()).booleanValue())) {
            return false;
        }
        int i4 = onNavigationEvent + 107;
        onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public static /* synthetic */ boolean onWarmupCompleted(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, profileStore}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, -1771338806, ICustomTabsCallbackStubProxy.onExtraCallback(), 1771338807)).booleanValue();
    }

    private static final boolean onNavigationEvent(getSupportedHighSpeedResolutionsFor getsupportedhighspeedresolutionsfor, ProfileStore profileStore) {
        int iOnExtraCallback = ICustomTabsCallbackStubProxy.onExtraCallback();
        return ((Boolean) onWarmupCompleted(new Object[]{getsupportedhighspeedresolutionsfor, profileStore}, ICustomTabsCallbackStubProxy.onExtraCallback(), ICustomTabsCallbackStubProxy.onExtraCallback(), iOnExtraCallback, 1253295077, ICustomTabsCallbackStubProxy.onExtraCallback(), -1253295077)).booleanValue();
    }
}
