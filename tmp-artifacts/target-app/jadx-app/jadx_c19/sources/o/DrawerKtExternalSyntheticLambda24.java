package o;

import android.opengl.GLES20;
import java.nio.Buffer;
import o.DrawerKtExternalSyntheticLambda2;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda12;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class DrawerKtExternalSyntheticLambda24 {
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda14 IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int access000;
    private int access100;
    private int asBinder;
    private onWarmupCompleted asInterface;
    private onWarmupCompleted onTransact;
    private static final float[] onExtraCallback = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] onExtraCallbackWithResult = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] IAuthTabCallback = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] onWarmupCompleted = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] onNavigationEvent = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    DrawerKtExternalSyntheticLambda24() {
    }

    public static boolean onExtraCallback(DrawerKtExternalSyntheticLambda2 drawerKtExternalSyntheticLambda2) {
        DrawerKtExternalSyntheticLambda2.onExtraCallback onextracallback = drawerKtExternalSyntheticLambda2.onWarmupCompleted;
        DrawerKtExternalSyntheticLambda2.onExtraCallback onextracallback2 = drawerKtExternalSyntheticLambda2.onExtraCallbackWithResult;
        return onextracallback.onExtraCallbackWithResult() == 1 && onextracallback.IAuthTabCallback(0).onExtraCallback == 0 && onextracallback2.onExtraCallbackWithResult() == 1 && onextracallback2.IAuthTabCallback(0).onExtraCallback == 0;
    }

    public void onWarmupCompleted(DrawerKtExternalSyntheticLambda2 drawerKtExternalSyntheticLambda2) {
        if (onExtraCallback(drawerKtExternalSyntheticLambda2)) {
            this.IAuthTabCallbackStubProxy = drawerKtExternalSyntheticLambda2.IAuthTabCallback;
            onWarmupCompleted onwarmupcompleted = new onWarmupCompleted(drawerKtExternalSyntheticLambda2.onWarmupCompleted.IAuthTabCallback(0));
            this.onTransact = onwarmupcompleted;
            if (!drawerKtExternalSyntheticLambda2.onNavigationEvent) {
                onwarmupcompleted = new onWarmupCompleted(drawerKtExternalSyntheticLambda2.onExtraCallbackWithResult.IAuthTabCallback(0));
            }
            this.asInterface = onwarmupcompleted;
        }
    }

    public void onExtraCallbackWithResult() {
        try {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda14 textFieldDecoratorModifierNodeExternalSyntheticLambda14 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda14("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda14;
            this.IAuthTabCallbackStub = textFieldDecoratorModifierNodeExternalSyntheticLambda14.onExtraCallbackWithResult("uMvpMatrix");
            this.access000 = this.IAuthTabCallbackDefault.onExtraCallbackWithResult("uTexMatrix");
            this.asBinder = this.IAuthTabCallbackDefault.onWarmupCompleted("aPosition");
            this.access100 = this.IAuthTabCallbackDefault.onWarmupCompleted("aTexCoords");
            this.IAuthTabCallback_Parcel = this.IAuthTabCallbackDefault.onExtraCallbackWithResult("uTexture");
        } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted unused) {
        }
    }

    public void onExtraCallbackWithResult(int i2, float[] fArr, boolean z) {
        float[] fArr2;
        onWarmupCompleted onwarmupcompleted = z ? this.asInterface : this.onTransact;
        if (onwarmupcompleted != null) {
            int i3 = this.IAuthTabCallbackStubProxy;
            if (i3 == 1) {
                fArr2 = z ? IAuthTabCallback : onExtraCallbackWithResult;
            } else if (i3 == 2) {
                fArr2 = z ? onNavigationEvent : onWarmupCompleted;
            } else {
                fArr2 = onExtraCallback;
            }
            GLES20.glUniformMatrix3fv(this.access000, 1, false, fArr2, 0);
            GLES20.glUniformMatrix4fv(this.IAuthTabCallbackStub, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(this.IAuthTabCallback_Parcel, 0);
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted unused) {
            }
            GLES20.glVertexAttribPointer(this.asBinder, 3, 5126, false, 12, (Buffer) onWarmupCompleted.onNavigationEvent(onwarmupcompleted));
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted unused2) {
            }
            GLES20.glVertexAttribPointer(this.access100, 2, 5126, false, 8, (Buffer) onWarmupCompleted.onWarmupCompleted(onwarmupcompleted));
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted unused3) {
            }
            GLES20.glDrawArrays(onWarmupCompleted.onExtraCallback(onwarmupcompleted), 0, onWarmupCompleted.IAuthTabCallback(onwarmupcompleted));
            try {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onNavigationEvent();
            } catch (TextFieldDecoratorModifierNodeExternalSyntheticLambda12.onWarmupCompleted unused4) {
            }
        }
    }
}
