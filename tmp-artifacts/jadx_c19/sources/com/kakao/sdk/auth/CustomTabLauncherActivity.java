package com.kakao.sdk.auth;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ResultReceiver;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PreviewView1ExternalSyntheticLambda2;
import o.assertNotInLayoutOrScroll;
import o.updateLayoutStateToFillStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class CustomTabLauncherActivity extends AppCompatActivity {
    private boolean IAuthTabCallbackDefault;
    private Handler IAuthTabCallbackStub;
    private ResultReceiver asBinder;
    private Uri asInterface;
    private ServiceConnection onTransact;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        onNavigationEvent(intent);
    }

    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putBoolean("key.customtabs.opened", this.IAuthTabCallbackDefault);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onRestoreInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super/*android.app.Activity*/.onRestoreInstanceState(bundle);
        this.IAuthTabCallbackDefault = bundle.getBoolean("key.customtabs.opened", this.IAuthTabCallbackDefault);
    }

    public void onNavigationEvent(@NotNull Intent intent) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(intent, "");
        try {
            Bundle extras = intent.getExtras();
            if (extras != null && (bundle = extras.getBundle("key.bundle")) != null) {
                ResultReceiver resultReceiver = (ResultReceiver) PreviewView1ExternalSyntheticLambda2.onNavigationEvent(bundle, "key.result.receiver", ResultReceiver.class);
                if (resultReceiver == null) {
                    throw new IllegalStateException();
                }
                this.asBinder = resultReceiver;
                Uri uri = (Uri) PreviewView1ExternalSyntheticLambda2.onNavigationEvent(bundle, "key.full_authorize_uri", Uri.class);
                if (uri == null) {
                    throw new IllegalStateException();
                }
                this.asInterface = uri;
            }
            this.IAuthTabCallbackStub = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.kakao.sdk.auth.CustomTabLauncherActivity$$ExternalSyntheticLambda0
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return CustomTabLauncherActivity.IAuthTabCallback(this.f$0, message);
                }
            });
        } catch (Throwable th) {
            updateLayoutStateToFillStart.Companion.onNavigationEvent(th);
            ClientError clientError = new ClientError(ClientErrorCause.Unknown, (String) null, 2, (DefaultConstructorMarker) null);
            clientError.initCause(th);
            onWarmupCompleted(clientError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IAuthTabCallback(CustomTabLauncherActivity customTabLauncherActivity, Message message) {
        Intrinsics.checkNotNullParameter(customTabLauncherActivity, "");
        Intrinsics.checkNotNullParameter(message, "");
        updateLayoutStateToFillStart.Companion.onWarmupCompleted("handle delay message");
        customTabLauncherActivity.onWarmupCompleted(new ClientError(ClientErrorCause.Cancelled, (String) null, 2, (DefaultConstructorMarker) null));
        return true;
    }

    public void onResume() {
        Handler handler;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        Uri uri = null;
        if (!this.IAuthTabCallbackDefault) {
            this.IAuthTabCallbackDefault = true;
            Uri uri2 = this.asInterface;
            if (uri2 == null) {
                onWarmupCompleted(new ClientError(ClientErrorCause.IllegalState, "url has been not initialized."));
                return;
            }
            if (uri2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                uri = uri2;
            }
            onExtraCallbackWithResult(uri);
            return;
        }
        updateLayoutStateToFillStart.Companion.onWarmupCompleted("trigger delay message");
        Handler handler2 = this.IAuthTabCallbackStub;
        if (!Intrinsics.areEqual(handler2 != null ? Boolean.valueOf(handler2.hasMessages(0)) : null, Boolean.FALSE) || (handler = this.IAuthTabCallbackStub) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewIntent(@Nullable Intent intent) {
        Uri data;
        Handler handler;
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        updateLayoutStateToFillStart.Companion.onWarmupCompleted("onNewIntent");
        setIntent(intent);
        Handler handler2 = this.IAuthTabCallbackStub;
        if (Intrinsics.areEqual(handler2 != null ? Boolean.valueOf(handler2.hasMessages(0)) : null, Boolean.TRUE) && (handler = this.IAuthTabCallbackStub) != null) {
            handler.removeMessages(0);
        }
        this.IAuthTabCallbackStub = null;
        if (intent != null && (data = intent.getData()) != null) {
            onExtraCallback(data);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection = this.onTransact;
        if (serviceConnection != null) {
            unbindService(serviceConnection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallbackWithResult(Uri uri) {
        updateLayoutStateToFillStart.IAuthTabCallback iAuthTabCallback = updateLayoutStateToFillStart.Companion;
        iAuthTabCallback.onWarmupCompleted("Authorize Uri: " + uri);
        try {
            ServiceConnection serviceConnectionOnWarmupCompleted = assertNotInLayoutOrScroll.IAuthTabCallback.onWarmupCompleted(this, uri);
            this.onTransact = serviceConnectionOnWarmupCompleted;
            if (serviceConnectionOnWarmupCompleted == null) {
                iAuthTabCallback.onWarmupCompleted("try to open chrome without service binding");
                onNavigationEvent(uri);
            }
        } catch (UnsupportedOperationException e) {
            updateLayoutStateToFillStart.Companion.onExtraCallback(e);
            onNavigationEvent(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onNavigationEvent(Uri uri) {
        try {
            assertNotInLayoutOrScroll.IAuthTabCallback.onNavigationEvent(this, uri);
        } catch (ActivityNotFoundException e) {
            updateLayoutStateToFillStart.Companion.onExtraCallback(e);
            onWarmupCompleted(new ClientError(ClientErrorCause.NotSupported, "No browser has been installed on a device."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onWarmupCompleted(KakaoSdkError kakaoSdkError) {
        ResultReceiver resultReceiver = this.asBinder;
        if (resultReceiver != null) {
            if (resultReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                resultReceiver = null;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("key.exception", kakaoSdkError);
            Unit unit = Unit.INSTANCE;
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onExtraCallback(Uri uri) {
        ResultReceiver resultReceiver = this.asBinder;
        if (resultReceiver != null) {
            if (resultReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                resultReceiver = null;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.url", uri);
            Unit unit = Unit.INSTANCE;
            resultReceiver.send(-1, bundle);
        }
        finish();
    }

    public void onStart() {
        super.onStart();
    }

    public void onPause() {
        super.onPause();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
