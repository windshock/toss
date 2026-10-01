package com.facebook.appevents;

import com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager;
import com.facebook.internal.extraCallback;
import com.facebook.internal.onMessageChannelReady;
import com.facebook.internal.readTypedObject;
import im.toss.uikit.widget.mobileId.MobileIdCardHologramMaskView;
import kotlin.jvm.JvmStatic;
import o.convertResponseToCredentialManager;
import o.ensurePreDrawListener;
import o.onApplyWindowInsets;
import o.onMeasureChild;
import o.onStopNestedScroll;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class IAuthTabCallbackDefault {
    public static final IAuthTabCallbackDefault IAuthTabCallback = new IAuthTabCallbackDefault();

    private IAuthTabCallbackDefault() {
    }

    public static final class onExtraCallbackWithResult implements onMessageChannelReady.onNavigationEvent {
        onExtraCallbackWithResult() {
        }

        public void onExtraCallback(@Nullable extraCallback extracallback) {
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.AAM, onWarmupCompleted.onWarmupCompleted);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.RestrictiveDataFiltering, onNavigationEvent.IAuthTabCallback);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.PrivacyProtection, onExtraCallback.onExtraCallbackWithResult);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.EventDeactivation, IAuthTabCallback.onWarmupCompleted);
            readTypedObject.IAuthTabCallback(readTypedObject.onNavigationEvent.IapLogging, C0029onExtraCallbackWithResult.onNavigationEvent);
        }

        static final class onWarmupCompleted implements readTypedObject.onExtraCallbackWithResult {
            public static final onWarmupCompleted onWarmupCompleted = new onWarmupCompleted();

            onWarmupCompleted() {
            }

            public final void onExtraCallbackWithResult(boolean z) {
                if (z) {
                    ensurePreDrawListener.IAuthTabCallback();
                }
            }
        }

        static final class onNavigationEvent implements readTypedObject.onExtraCallbackWithResult {
            public static final onNavigationEvent IAuthTabCallback = new onNavigationEvent();

            onNavigationEvent() {
            }

            public final void onExtraCallbackWithResult(boolean z) {
                if (z) {
                    RestrictiveDataManager.onWarmupCompleted();
                }
            }
        }

        static final class onExtraCallback implements readTypedObject.onExtraCallbackWithResult {
            public static final onExtraCallback onExtraCallbackWithResult = new onExtraCallback();

            onExtraCallback() {
            }

            public final void onExtraCallbackWithResult(boolean z) {
                if (z) {
                    onApplyWindowInsets.onExtraCallbackWithResult();
                }
            }
        }

        static final class IAuthTabCallback implements readTypedObject.onExtraCallbackWithResult {
            public static final IAuthTabCallback onWarmupCompleted = new IAuthTabCallback();

            IAuthTabCallback() {
            }

            public final void onExtraCallbackWithResult(boolean z) {
                if (z) {
                    onMeasureChild.onNavigationEvent();
                }
            }
        }

        /* renamed from: com.facebook.appevents.IAuthTabCallbackDefault$onExtraCallbackWithResult$onExtraCallbackWithResult, reason: collision with other inner class name */
        static final class C0029onExtraCallbackWithResult implements readTypedObject.onExtraCallbackWithResult {
            public static final C0029onExtraCallbackWithResult onNavigationEvent = new C0029onExtraCallbackWithResult();

            C0029onExtraCallbackWithResult() {
            }

            public final void onExtraCallbackWithResult(boolean z) {
                if (z) {
                    onStopNestedScroll.onExtraCallback();
                }
            }
        }
    }

    @JvmStatic
    public static final void IAuthTabCallback() {
        if (convertResponseToCredentialManager.onExtraCallback(IAuthTabCallbackDefault.class)) {
            return;
        }
        try {
            Object[] objArr = {new onExtraCallbackWithResult()};
            int iOnNavigationEvent = MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent();
            onMessageChannelReady.onNavigationEvent(-1981841091, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent(), iOnNavigationEvent, 1981841093, objArr, MobileIdCardHologramMaskView.onWarmupCompleted.IAuthTabCallback.onNavigationEvent());
        } catch (Throwable th) {
            convertResponseToCredentialManager.onExtraCallbackWithResult(th, IAuthTabCallbackDefault.class);
        }
    }
}
